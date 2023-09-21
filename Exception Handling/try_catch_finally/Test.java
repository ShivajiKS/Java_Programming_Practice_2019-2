
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] array1={10,100,1000,10000,100000};
        System.out.println("enter first number");
        int number1=sc.nextInt();
        System.out.println("enter second number");
        int number2=sc.nextInt();
        try{
            System.out.println("division is :"+(number1/number2));
            System.out.println(array1[8]);
        }
        catch(ArithmeticException e){
            System.out.println("Divsion By Zero Is Not Possible");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("element not there in u specified index position");
        }
    }
}
