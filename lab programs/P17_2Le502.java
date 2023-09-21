import java.util.*;
class P17_2Le502{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int div =0;
        int[] arra1={10,5,43,24,65,34};
        int input =0;
            try{
                System.out.println("division is : "+number1/number2);
                System.out.println("arra1[7] ="+arra1[7] );
            }
        catch(ArithmeticException e1){
            System.out.println("Division By zero is not possible,Please Enter Valid Input..");
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Array Index Is Not Correct..");
        }
        catch(Exception e2){
            System.out.println("ERROR Occured..");
        }
    }
}
