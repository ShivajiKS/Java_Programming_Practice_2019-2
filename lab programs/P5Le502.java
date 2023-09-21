import java.util.Scanner;
class P5Le502{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Numbers are there in the list :");
        int array_size= sc.nextInt();
        int[] arra= new int[array_size];
        System.out.println("Enter "+array_size +" Numbers : ");
        for(int i=0; i<array_size;i++)
                arra[i]=sc.nextInt();
        System.out.println("Given Numbers are as Follows : ");
        for(int i=0;i<array_size;i++)
                System.out.print(arra[i]+ " ");
        for(int i=0; i<array_size-1;i++){
            for(int j=0; j<array_size-1-i;j++){
                if(arra[j]>arra[j+1]){
                    int temp =arra[j];
                    arra[j]=arra[j+1];
                    arra[j+1]=temp;
                }
            }
        System.out.println("\n At the end of the Pass "+(i+1));
        for(int k=0;k<array_size;k++)
            System.out.print(arra[k]+" ");
        }
        System.out.println("\n Given Numbers in ascending order are as follows :");
        for(int i=0;i<array_size;i++)
            System.out.print(arra[i]+" ");
    }
}
