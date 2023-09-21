import java.sql.*;
class up_date{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivaji?"+ "user=root&password=123456789");
        Statement stm = con.createStatement();
        stm.executeUpdate("Update students12 set name='vijay' where id=101");
            System.out.println("Data updated Succesfully....");
        con.close();
    }
}
