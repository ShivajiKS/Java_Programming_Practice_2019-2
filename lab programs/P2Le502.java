import java.util.Scanner;
class P2Le502{
	public static void main(String[] args) {
	System.out.println("Enter A,B,C Values : ");
	Scanner sc =new Scanner(System.in);
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	double d=b*b-4.0*a*c;
	double r1,r2;
		if(d<0)
		 	System.out.println("ROOTS ARE IMAGINARY ");
		else if (d>0){
		r1=(-b+Math.sqrt(d))/(2.0*a);
		r2=(-b+Math.sqrt(d))/(2.0*a);
		System.out.println("roots are real and distinct");
		System.out.println("ROOT1 ="+r1+" ROOT2 = "+r2);
		}
	else if (d==0){
		r1=(-b)/(2.0*a);
		r2=r1;
		System.out.println("ROOTS ARE REAL AND EQUAL");
		System.out.println("ROOT1= "+r1+" root2= "+r2);
		}
	}
 }
