package databases;

public class UnitTestConnectDB {

    public static void main(String[] args) {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        User user1 = new User("Dann","1","10/09/11");
        User user2 = new User("BoB","2","11/09/11");
        User user3 = new User("Sab","3","12/09/11");
        User user4 = new User("CLint","4","1/09/11");



        //REMEMBER AFTER RUNNING THIS CLICK COMMIT AND THEN EXECUTE TO SEE DATA LOADED IN SQL
        connectToSqlDB.insertProfileToSqlTable("students","stName","stID","stDOB",user1);
        connectToSqlDB.insertProfileToSqlTable("students","stName","stID","stDOB",user2);
        connectToSqlDB.insertProfileToSqlTable("students","stName","stID","stDOB",user3);
        connectToSqlDB.insertProfileToSqlTable("students","stName","stID","stDOB",user4);


        //does only one column
        //connectToSqlDB.insertDataFromStringToSqlTable(user1.getStName(),"test_schema_1.students","stName");

    }
}
