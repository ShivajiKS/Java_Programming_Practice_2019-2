import java.util.Scanner;
class readDigits{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input=10,input2=0,  sum=0,stoopLoop=999;
        System.out.println("ENTER 10 NUMBERS ---");
        for (int i=0; i<input; i++){
            input2=sc.nextInt();
            if(input2==stoopLoop){
                System.out.println("the Process will be terminated");
                break;
            }
            else{
                sum+=input2;
            }
            System.out.println("the sum of the numbers :"+sum);
        }
    }
}
/*
ENTER 10 NUMBERS ---
1
the sum of the numbers :1
100
the sum of the numbers :101
87
the sum of the numbers :188
45
the sum of the numbers :233
21
the sum of the numbers :254
56
the sum of the numbers :310
8
the sum of the numbers :318
8
the sum of the numbers :326
0
the sum of the numbers :326
6
the sum of the numbers :332
*/
