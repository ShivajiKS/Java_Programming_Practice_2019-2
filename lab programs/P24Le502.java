import java.sql.*;
class P24Le502{
    public static void main(String[] args){
        //step_1 :
        try{
        Class.forName("com.mysql.jdbc.Driver"); // Register the driver
        // step_2 :
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivaji?"+ "user=root&password=123456789");
        // step_3 :
        Statement stm = con.createStatement();
        // step_4 :
         ResultSet res =stm.executeQuery("select * from students1");
         System.out.println("Id \t\t Name");
         System.out.println("--------      -------------");
         while(res.next())
             System.out.println(res.getInt(1)+"\t\t"+res.getString(2));
            System.out.println("Data Retrived Succesfully....");

         // step_5 :
          con.close(); // closing connection
          res.close();
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
