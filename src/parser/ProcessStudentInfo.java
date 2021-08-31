package parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import databases.ConnectToSqlDB;
import org.xml.sax.SAXException;


public class ProcessStudentInfo {

    /*
     * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
     * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and
     * 'C' for 70 to 79.
     *
     * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map.
     * Once map has all data, retrieve those data and out put to console.
     *
     * Do any necessary steps that require for below successful output.
     * ......................................................
     * Student (id= 1) "Ibrahim" "Khan"        		Grade= B
     * Student (id= 2) "Asif" "Roni"          		Grade= A
     * Student (id= 3) "Gumani" "Hose"              Grade= A
     * Student (id= 4) "Sukanto" "Shaha"            Grade= B
     * Student (id= 5) "MD" "Hossain"               Grade= C
     * ......................................................
     *
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and to retrieve data.
     *
     */

    public static void main(String[] args) throws Exception {
        // Path of XML data to be read.
        String pathSelenium = System.getProperty("user.dir") + "/src/parser/selenium.xml";
        String pathQtp = System.getProperty("user.dir") + "/src/parser/qtp.xml";
        String tag = "id";

        //Declare a Map with List<String> into it.
        Map<String, List<Student>> list = new LinkedHashMap<String, List<Student>>();
        Map<String, List<Student>> list2 = new LinkedHashMap<String, List<Student>>();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        /*
        Declare 2 ArrayList, accepting Student datatype, which you will use to store students from the Selenium class
            into one list, and students from the QTP class into another list
        */
        List<Student> seleniumStudents = new ArrayList<Student>();
        List<Student> qtpStudents = new ArrayList<Student>();

        // Create XMLReader object.
        XmlReader xmlReader = new XmlReader();

        // Parse Data using parseData method and then store data into Selenium ArrayList.
        seleniumStudents = xmlReader.parseData(tag, pathSelenium);

        // Parse Data using parseData method and then store data into QTP ArrayList.
        qtpStudents = xmlReader.parseData(tag, pathQtp);

        // Add Selenium ArrayList data into map.
        //System.out.println(seleniumStudents.get(0));
        for (Student str : seleniumStudents) {
            list.put(str.id, new ArrayList<Student>());
            list.get(str.id).add(str);
        }


        // Add Qtp ArrayList data into map.
        for (Student str : qtpStudents) {
            list2.put(str.id, new ArrayList<Student>());
            list2.get(str.id).add(str);
        }

        // Retrieve map data and display output for both maps.
        List<Student> stList = new ArrayList<>();
        for (Student st : stList) {
            System.out.println(st.getFirstName() + " " + st.getLastName() + " " + st.getScore() + " " + st.getId());
        }

        System.out.println("Selenium Student List");
        for (String s : list.keySet()) {
            System.out.println(list.get(s).get(0).toString());
        }


        System.out.println("Qtp Student List");
        for (String s : list2.keySet()) {
            System.out.println(list2.get(s).get(0).toString());
        }

        connectToSqlDB.insertDataFromMapStudentToSqlTable(list,"Selenium","ID","first_name","last_name","score");
        List<String> letters  = connectToSqlDB.readDataBase("Selenium", "first_name");
        System.out.println(letters);

        connectToSqlDB.insertDataFromMapStudentToSqlTable(list2,"QTP","ID","first_name","last_name","score");
        List<String> letters2  = connectToSqlDB.readDataBase("QTP", "first_name");
        System.out.println(letters2);



    }

}
