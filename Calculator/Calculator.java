import java.util.Scanner;
class operations{   
	 Scanner sc=new Scanner(System.in);    
    	System.out.println("Enter First Number : ");
                    int number1=sc.nextInt();
                   System.out.println("Enter Second  Number : ");
                   int number2=sc.nextInt();
public  void add() {
        System.out.println("Adddition of Two Numbers  : "+(number1+number2));
      //  back1();
    }
 public void subtr(){
        System.out.println("Subtraction Of Two Nrmbers : "+(number1-number2));
       // back1();
    }
   public  void mul()
    {
        System.out.println("Multiplcation  Of Two Nrmbers : "+(obj.number1*obj.number2));
        //back1();
    }
   public  void div(){
      System.out.println("Division Of Two Nrmbers : "+(number1/number2));
  //   back1();
    }
    public void mod() {
        System.out.println("Modulus Of Two Nrmbers : "+(number1%number2));
     //   back1();
    }
/*
void back(){ 			// back button for wrong input 
	System.out.println("Please Enter Valid Input \n \t\t\t Go Back To Main Menu Press '0' \t Exit Press '1'");
	int back=sc.nextInt();
	if(back == 0)
		result();
	if(back == 1)
		System.exit(0);
}
void back1(){
	System.out.println("Go Back To Main Menu Press '0' \t Exit Press '1'"); // back button for inside method
	int back=sc.nextInt();
	if(back == 0)
		result();
	else if(back == 1){
                              System.exit(0);
                   }
}*/
 void result(){
       System.out.println(" +    -      *      /    %");
        String option =sc.nextLine();
         if(option =="+")
                add();
        else if(option =="-")
                subtr();
        else if(option == "*")
                 mul();
        else if(option == "/")
                div();
        else if(option == "%")
                 mod();
     //   else
           //    back();
     } // method end
} //class end
class Calculator extends operations{
	public static void main(String[] args){
	operations obj = new operations();    // object creation for operations class	
    }
}
