import java.util.Scanner;
class Array1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arra1={10,100,1000,10000,100000};
        System.out.print("ARRAY ELEMENTS ARE : ");
        for (int i=0;i<arra1.length;i++)
                        System.out.print(arra1[i]+" ");
        System.out.println("\n IN THE ABOVE ARRAY WHICH INDEX POSITION VALUE U WANT INDEXS = 0=10,1=100,2=1000,3=10000,4=100000");
        int number1=sc.nextInt();
        for(int i=0; i<arra1.length; i++){
            if(number1==i){
                System.out.println( "u picked element is :" +arra1[i]);
            }

        }
    }
}
