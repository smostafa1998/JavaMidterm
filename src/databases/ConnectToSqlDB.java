package databases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import parser.Student;

public class ConnectToSqlDB {

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;


    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
         List<User> list = readUserProfileFromSqlTable();
        for (User user : list) {
            System.out.println(user.getStName() + " " + user.getStID() + " " + user.getStDOB());
        }
    }


    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        String path = System.getProperty("user.dir") + "/src/secret.properties";
        InputStream ism = new FileInputStream(path);
        prop.load(ism);
        ism.close();
        return prop;
    }

    /**
     * This connects to the SQL DATABASE by loading properties and entering info about the database, use this to
     * start the connection to the database
     * @return
     * @throws IOException
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static Connection connectToSqlDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);

        try{
            connect = DriverManager.getConnection(url, userName, password);
            System.out.println("Database is connected");

        }catch(Exception e){
            System.out.println("COULD NOT CONNECT TO DB");
            e.printStackTrace();
        }
        return connect;
    }

    /**
     * This reads the data from the SQL table, use this for User CLass ONLY USER CLASS
     * @return
     */
    public static List<User> readUserProfileFromSqlTable(){
        List<User> list = new ArrayList<>();
        User user = null;
        try {
            Connection conn = connectToSqlDatabase();
            String query = "SELECT * FROM Students";
            // create the java statement
            Statement st = conn.createStatement();
            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            // iterate through the java resultset
            while (rs.next()) {
                String name = rs.getString("stName");
                String id = rs.getString("stID");
                String dob = rs.getString("stDOB");
                //System.out.format("%s, %s\n", name, id);
                user = new User(name, id, dob);
                list.add(user);

            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return list;
    }

    /**
     * This lets u read from the data base since it executes query
     * @param tableName
     * @param columnName
     * @return
     * @throws Exception
     */
    public List<String> readDataBase(String tableName, String columnName) throws Exception {
        List<String> data = new ArrayList<String>();

        try {
            connectToSqlDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet, columnName);
        } catch (ClassNotFoundException e) {
            System.out.println("CANT FIND");
            throw e;
        } finally {
            close();
        }
        return data;
    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

    private List<String> getResultSetData(ResultSet resultSet2, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        while (resultSet.next()) {
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    /**
     * lets u load arrays into mySQL table, but table needs to be created.
     * THIS IS FOR ALGORITHM FILES
     * @param ArrayData
     * @param tableName
     * @param columnName
     */
    public void insertDataFromArrayToSqlTable(int[] ArrayData, String tableName, String columnName) {
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            ps.executeUpdate();
            ps = connect.prepareStatement(
                    "CREATE TABLE `" + tableName + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`SortingNumbers` bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            ps.executeUpdate();
            for (int n = 0; n < ArrayData.length; n++) {
                ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                ps.setInt(1, ArrayData[n]);
                ps.executeUpdate();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * LETS U ADD STRING DATA TO A COLUMN
     * @param ArrayData
     * @param tableName
     * @param columnName
     */
    public void insertDataFromStringToSqlTable(String ArrayData, String tableName, String columnName) {
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
            ps.setString(1, ArrayData);
            ps.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * LETS U EXECEUTE A QUERY FROM JAVA
     * @param passQuery
     * @param dataColumn
     * @return
     * @throws Exception
     */
    public List<String> directDatabaseQueryExecute(String passQuery, String dataColumn) throws Exception {
        List<String> data = new ArrayList<String>();

        try {
            connectToSqlDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery(passQuery);
            data = getResultSetData(resultSet, dataColumn);
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            close();
        }
        return data;
    }

    /**
     * inserts array list into SQL this is for parser.students!!!
     * @param list
     * @param tableName
     * @param columnName
     */
    public void insertDataFromArrayListToSqlTable(List<Student> list, String tableName, String columnName) {
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            ps.executeUpdate();
            ps = connect.prepareStatement(
                    "CREATE TABLE `" + tableName + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`SortingNumbers` bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            ps.executeUpdate();
            for (Student st : list) {
                ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                ps.setObject(1, st);
                ps.executeUpdate();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * THis inserts into three columns used to load in students
     * @param tableName
     * @param columnName1
     * @param columnName2
     * @param columnName3
     */
    public void insertProfileToSqlTable(String tableName, String columnName1, String columnName2, String columnName3, User user) {
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName1
                    + "," + columnName2 + "," + columnName3 +" ) VALUES(?,?,?)");
            ps.setString(1, user.getStID());
            ps.setString(2, user.getStName());
            ps.setString(3, user.getStDOB());

            // ps.setInt(2, 3590);
            ps.executeUpdate();
            System.out.println("DONE");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
