import java.util.Scanner;
class instance_m_overload1{

    static void student_info(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR ID -------------");
        int id = sc.nextInt();
        System.out.println("YOUR ID IS = "+id);
    }
    static void student_info(String name){
        System.out.println("YOUR NAME IS = " +name);
    }
    static void student_info( int age , String collage_name){
        System.out.println("YOUR AGE IS  = " +age);
        System.out.println("YOUR COLLAGE_NAME IS = " +collage_name);
    }
    public static void main(String[] args) {

            student_info();
             student_info("SHIVAJI");
             student_info(19,"ADITYA COLLAGE OF ENGINEERING SURAMPALEM");

    }
}
