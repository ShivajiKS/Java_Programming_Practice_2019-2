import java.sql.*;
class CreateTable{
    public static void main(String[] args){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        // step_2 :
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivaji?"+ "user=root&password=123456789");
        // step_3 :
        Statement stm = con.createStatement();
        // step_4 :
        stm.executeUpdate("create table employee(id integer(3),name char(30))");        // step_4 :
         System.out.println("Table created....");
         stm.executeUpdate("insert into students12 values(101,'shivaji')");
          System.out.println("data inserted succesfully....");
          con.close(); // closing connection
       }
       catch(Exception e){
            System.out.println(e.getMessage());
       }

    }
}
/*
F:\lab programs>set classpath="C:\Program Files\Java\jre1.8.0_241\lib\mysql-connector-java-5.1.12-bin.jar\
            OR

set classpath=%classpath%;mysql-connector-java-5.1.12-bin.jar\

*/
