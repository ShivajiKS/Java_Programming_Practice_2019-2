import java.util.Scanner;
class array2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int length=sc.nextInt();
        int arra[] = new int[length];
        System.out.println("Enter "+length+" Values");
        for(int i=0; i<arra.length;i++){
            arra[i]=sc.nextInt();
        }
        System.out.println("Array Elements are :");
        for(int i=0; i<arra.length;i++){
              System.out.print(arra[i]+" ");
        }
    }
}
