import java.util.Scanner;
class sort_Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array Length : ");
        int length1=sc.nextInt();
        int arra1[]=new int[length1];
        System.out.print("Enter  "+length1+" Elements : ");
        for(int i=0; i<length1;i++)
            	arra1[i]=sc.nextInt();
        System.out.println("Enter Second Array Length : ");
        int length2=sc.nextInt();
        int arra2[]=new int[length2];
        System.out.print("Enter  "+length2+" Elements : ");
        for(int i=0; i<length2;i++)
            arra2[i]=sc.nextInt();
        for(int i=0; i<length1+length2;i++)
            System.out.println("-------------   ");
    }
}
