import java.util.Scanner;
class mmopertions{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("WHICH OPERATION U WANT CHOOSE ANY OPTION  : \n\n MULTIPLICATION TABLE PRESS 0 \n ADDITION PRESS 1 \n SUBTRACTION PRESS 2 \n MULTIPLICATION PRESS 3 \n DIVISION PRESS 4 \n MODULES PRESS 5 ");
        int option = sc.nextInt();
        execution obj1 =new execution();
        if(option == 0)
                 obj1.table();
        else if(option == 1)
                 obj1.addition();
        else if(option == 2)
                 obj1.subtr();
        else if(option == 3)
                 obj1.mul();
        else if(option == 4)
                 obj1.div();
        else if(option == 5)
                 obj1.mod();
        else{

        }
        System.out.println("PLEASE ENTER VALID INPUT : ");

    }

}
class execution{
    Scanner sc =new Scanner(System.in);
    void table(){
        System.out.println("which multiplication table u want ,  you must enter integer only:");
        int number=sc.nextInt();
            for(int i=1;i<=10; i++)
                 System.out.println("\n"+number +" x "+i +" = "+(number*i));
    }
    void addition()
    {
        System.out.println("ENTER FIRST NUMBER : ");
        int number1=sc.nextInt();
        System.out.println("ENTER SECOND  NUMBER : ");
        int number2=sc.nextInt();
        System.out.println("THE ADDITION OF 2 NUMBERS IS : "+(number1+number2));
    }
    void subtr()
    {
        System.out.println("ENTER FIRST NUMBER : ");
        int number1=sc.nextInt();
        System.out.println("ENTER SECOND  NUMBER : ");
        int number2=sc.nextInt();
        System.out.println("THE SUBTRACTION OF 2 NUMBERS IS : "+(number1-number2));
    }
    void mul()
    {
        System.out.println("ENTER FIRST NUMBER : ");
        int number1=sc.nextInt();
        System.out.println("ENTER SECOND  NUMBER : ");
        int number2=sc.nextInt();
        System.out.println("THE MULTIPLICATION OF 2 NUMBERS IS : "+(number1*number2));
    }
    void div()
    {
        System.out.println("ENTER FIRST NUMBER : ");
        int number1=sc.nextInt();
        System.out.println("ENTER SECOND  NUMBER : ");
        int number2=sc.nextInt();
        System.out.println("THE DIVISION  OF 2 NUMBERS IS : "+(number1/number2));
    }
    void mod()
    {
        System.out.println("ENTER FIRST NUMBER : ");
        int number1=sc.nextInt();
        System.out.println("ENTER SECOND  NUMBER : ");
        int number2=sc.nextInt();
        System.out.println("THE MODULES OF 2 NUMBERS IS : "+(number1%number2));
    }

}
