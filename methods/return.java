class ReturnMethod2
{
	int Employeeid;
	String EmployeeName;
	double EmployeeSalary;

	int EmployeeidInfo(){
	
			return Employeeid;
	}
	
	String EmployeeNameInfo(){
	
				return EmployeeName;
	}
    double EmployeeSalaryInfo(){
		
				return EmployeeSalary;
				}

}
class ReturnMethod
{
	public static void main(String args[])
		{
	ReturnMethod2 ReturnMethod2Obj = new ReturnMethod2();
	ReturnMethod2Obj.Employeeid=100000;
	ReturnMethod2Obj.EmployeeName="SHIVAJI";
	ReturnMethod2Obj.EmployeeSalary=250000;

	System.out.println("EmployeeName is :"+EmployeeNameInfo());
	System.out.println("employeeId is :"+EmployeeidInfo());
	System.out.println("EmployeSalary is :"+EmployeeSalaryInfo());

	}
}