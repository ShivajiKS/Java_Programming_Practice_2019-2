import java.util.Scanner;
class demo{
 void result(){
       System.out.println("WHICH OPERATION U WANT CHOOSE ANY OPTION  : \n\n MULTIPLICATION TABLE PRESS 0 \n ADDITION PRESS 1 \n SUBTRACTION PRESS 2 \n MULTIPLICATION PRESS 3 \n DIVISION PRESS 4 \n MODULES PRESS 5 ");     	       Scanner sc=new Scanner(System.in);      
        int option = sc.nextInt();
        /*if(option == 0)
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
        else
	 obj1.outer()
		*/
}
void outer(){
	 System.out.println("PLEASE ENTER VALID INPUT \n Back to press 0: ");
	   int option2 = sc.nextInt();
	   if (option2 == 0)
		obj1.result();

}

public static void main(String args[]){
	demo obj1=new demo();
	obj1.result();
      }
}
