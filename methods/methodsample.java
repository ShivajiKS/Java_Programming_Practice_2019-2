class methods
{
	int userid=1256;
	String username="shivaji";
	double salary=20000.00;

	public void method()																																											
		{
	System.out.println("userid is:  "+userid);
	System.out.println("username is  : "+username);
	System.out.println("salary is:  "+salary);
	}
}
class methods2
{
	public int method2(int x, int y){
	
	return x+y;
	}
}

class mainmethod
{
	public static void main(String[] args) 
	{
	methods methodobj=new methods();
	methodobj.method();
	methods2 methodobj2=new methods2();
	System.out.print("the addition is :"+methodobj2.method2(100,2134));

	}
}