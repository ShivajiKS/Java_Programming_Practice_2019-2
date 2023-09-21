import java.util.Scanner;
class table1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which multiplication table u want ,  you must enter integer only:");
        int number=sc.nextInt();
            for(int i=1;i<=10; i++){
                System.out.println("\n"+number +" x "+i +" = "+(number*i)); //----println method
                System.out.print("\n"+number +" x "+i +" = "+(number*i));---- print method
                System.out.printf(" \n %d * %d = %d",number,i,(number*i)); ----printf method
        }
    }
}

/*
C:\Users\shivaji\Desktop\java\tables>java table1
which multiplication table u want ,  you must enter integer only:
1

1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
1 x 4 = 4
1 x 5 = 5
1 x 6 = 6
1 x 7 = 7
1 x 8 = 8
1 x 9 = 9
1 x 10 = 10
*/