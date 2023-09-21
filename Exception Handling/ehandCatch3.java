import java.util.Scanner;
class ehandCatch3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int number1=sc.nextInt();
        System.out.println("enter second number :");
        int number2=sc.nextInt();
        int[] arra1={10,5,43,24,65,34};
            try{
                System.out.println(number1/number2);
                System.out.println(arra1[10]);
            }


        catch(ArithmeticException e1){
            System.out.println("division zero is not possible ,PLEASE ENTER VALID INPUT");
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("array index out of bounds exception");
        }
        catch(Exception e2){
            System.out.println("ERROR");
        }

    }
}
