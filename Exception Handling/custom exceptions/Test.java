
import java.util.Scanner;
class UserException extends RuntimeException{
    UserException(String str1){
        super(str1);
    }
}
class Test{
    public static void main(String[] args) throws UserException {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t\t\t WELCOME TO MATRIMONIAL SITE  : ");
            System.out.println("\t\t\t\tPLEASE ENTER YOUR Details : ");
            System.out.print("ENTER YOUR NAME : ");
            String name=sc.nextLine();
            System.out.print("ENTER YOUR Job Role : ");
            String job=sc.nextLine();
            System.out.print("ENTER YOUR AGE : ");
            int number=sc.nextInt();
            try{
                if(number<18){
                    throw new UserException("You are the Kid , Wait Some Time to Get A Best Match..");
                }
                else if(number>60){
                    throw new UserException("Your Age is Too old, I Am Not Provide Support US..");
                }
                else {
                    System.out.println(" Thankyou For Registering..");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
    }
}
