import java.util.Scanner;
class AgeException extends RuntimeException{
    AgeException(String str1){
        super(str1);
    }
}
class Test1{
    public static void main(String[] args) throws AgeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new AgeException("You Are Not Eligible For Vote, wait For SomeTime To Get a vote..");
            }
            else{
                System.out.println("You Are Eligible For Vote..");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
