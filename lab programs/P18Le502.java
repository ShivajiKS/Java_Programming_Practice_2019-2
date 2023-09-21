import java.util.Scanner;
class UserException extends RuntimeException{
    UserException(String str1){
        super(str1);
    }
}
class P18Le502{
    public static void main(String[] args) throws UserException {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t\t\t WELCOME TO MATRIMONIAL SITE ");
            System.out.println("PLEASEEnter Your N: ");
            System.out.print("Enter Your Name : ");
            String name=sc.nextLine();
            System.out.print("Enter Your Age : ");
            int age=sc.nextInt();
            try{
                if(age<18)
                    throw new UserException("You are the Kid , Wait Some Time to Get A Best Match...");
                else if(age>60)
                    throw new UserException("Your Age is Too old, I Am Not Provide Support US...");
                else
                    System.out.println(" Thankyou For Registering Us wait SomeTime to Get a Mail...");
            }
            catch(Exception e){
                e.printStackTrace();
            }
       }
  }
