
class MethodWithOutParr{
    void Add(int a, int b){
        int c;
        c=a+b;
		System.out.println(" ----------------- from addition method------------------");
        System.out.println("the addition is :"+c);
		System.out.println();
		
    }
	void subtraction(int d, int e){
        
        int f=d-e;
		System.out.println(" ----------------- from subtraction method---------------");
        System.out.println("the subtraction  is :"+f);
		System.out.println();
    }
	void multiplacation(int g, int h){
        
        int i=g*h;
		System.out.println(" -------- -----from multiplacation method----------------");
        System.out.println("the multiplacation is :"+i);
    }
	void division(int j, int k){
        int l=j/k;
		System.out.println(" ---------- ------from division method-------------------");
        System.out.println("the division  is :"+l);
		System.out.println();
    }
	
}
class methodExecution{
    public static void main(String args[]){
        MethodWithOutParr Methodobj=new MethodWithOutParr();
        Methodobj.Add(100,132);
		Methodobj.subtraction(545,123);
		Methodobj.division(78,45);
		Methodobj.multiplacation(327,76);
		
    }
}