class Display{
	public void methodWithoutParra(){			//main method
		int EmployeeId ;
		String EmployeeName;			//variables declaration
		double EmployeeSalary;
		System.out.println(EmployeeId);
		System.out.println(EmployeeName);  	// printing the  values 
		System.out.println(EmployeeSalary);
	}
}


class methodwithoutparrameters{
	public static void main(String args[]){
		Display Displayobj = new Display(); // object creation for display class
		Displayobj.methodWithoutParra(); 		//method calling by using object reference
		Displayobj.EmployeeId=10000;		
		Displayobj.EmployeeName="k.shivaji";		//variables initilization by using object reference
		Displayobj.EmployeeSalary=10000000;
		
	}
}
