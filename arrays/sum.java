
import java.util.Scanner;
class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("how many elements u want to enter :");
        int length=sc.nextInt();
        System.out.println("Enter "+length+ " Numbers");
        for(int i=0; i<length;i++)
                    sum=sum+sc.nextInt();
        System.out.println("Sum Of N numbers is : "+sum);
    }
}
