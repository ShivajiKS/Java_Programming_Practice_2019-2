
class MethodWithOutParr{
    void Add(){
        int a=10;
        int b=24;
        int c;
        c=a+b;
        System.out.println("the addition is :"+c);
    }
	void subtraction(){
        int a=10;
        int b=24;
        int c;
        c=a-b;
        System.out.println("the subtraction  is :"+c);
    }
	void multiplacation(){
        int a=10;
        int b=24;
        int c;
        c=a*b;
        System.out.println("the multiplacation is :"+c);
    }
	void division(){
        int a=10;
        int b=24;
        int c;
        c=a/b;
        System.out.println("the division  is :"+c);
    }
	
}
class methodExecution{
    public static void main(String args[]){
        MethodWithOutParr Methodobj=new MethodWithOutParr();
        Methodobj.Add();
		Methodobj.subtraction();
		Methodobj.division();
		Methodobj.multiplacation();
		
    }
}