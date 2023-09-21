import java.util.Scanner;
class demo{
Scanner sc=new Scanner(System.in);
 void table(){
        System.out.println("which multiplication table u want ,  you must enter integer only:");
        int number=sc.nextInt();
            for(int i=1;i<=10; i++)
                 System.out.println("\n"+number +" x "+i +" = "+(number*i));
          back1();
    }
 void addition()
    {
        System.out.println("ENTER FIRST NUMBER : ");
        int number1=sc.nextInt();
        System.out.println("ENTER SECOND  NUMBER : ");
        int number2=sc.nextInt();
        System.out.println("THE ADDITION OF 2 NUMBERS IS : "+(number1+number2));
        back1();
    }
 void subtr()
    {
        System.out.println("ENTER FIRST NUMBER : ");
        int number1=sc.nextInt();
        System.out.println("ENTER SECOND  NUMBER : ");
        int number2=sc.nextInt();
        System.out.println("THE SUBTRACTION OF 2 NUMBERS IS : "+(number1-number2));
        back1();
    }
    void mul()
    {
        System.out.println("ENTER FIRST NUMBER : ");
        int number1=sc.nextInt();
        System.out.println("ENTER SECOND  NUMBER : ");
        int number2=sc.nextInt();
        System.out.println("THE MULTIPLICATION OF 2 NUMBERS IS : "+(number1*number2));
        back1();
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
        back1();
    }
void back(){
	System.out.println("Please Enter Valid Input \n \t\t\t Go Back To Main Menu Press '0' \t Exit Press '1'");
	int back=sc.nextInt();
	if(back == 0)
		result();
	if(back == 1)
		System.exit(0);
		

}
void back1(){
	System.out.println("Go Back To Main Menu Press '0' \t Exit Press '1'");
	int back=sc.nextInt();
	if(back == 0)
		result();
	if(back == 1)
		System.exit(0);
}
 void result(){
       System.out.println("WHICH OPERATION U WANT CHOOSE ANY OPTION  : \n\n MULTIPLICATION TABLE PRESS 0 \n ADDITION PRESS 1 \n SUBTRACTION PRESS 2 \n MULTIPLICATION PRESS 3 \n DIVISION PRESS 4 \n MODULES PRESS 5 ");       
        int option = sc.nextInt();
          if(option == 0)
                 table();
        else if(option == 1)
                addition();
        else if(option == 2)
                subtr();
        else if(option == 3)
                 mul();
        else if(option == 4)
                div();
        else if(option == 5)
                 mod();
        else
	back();
} // method end
} //class end
class demo1 extends demo{
	public static void main(String[] args){
	demo obj1=new demo();
	obj1.result();

}
}
 