import java.sql.*;
class delete{
    public static void main(String[] args){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivaji?"+ "user=root&password=123456789");
        Statement stm = con.createStatement();
        stm.executeUpdate("delete from students12 where id =3");
            System.out.println("Deleted Succesfully....");
        con.close();
       }
       catch(Exception e){
            System.out.println(e.getMessage());
       }
    }
}
