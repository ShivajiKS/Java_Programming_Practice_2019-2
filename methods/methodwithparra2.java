class employee{
		public void EmpolyeeInfo(int employeeId,String employeeName, float employeeSalary){
			
			System.out.println("emplyeeName is :"+employeeName+" " +"emplyeeId is :"+employeeId+" "+"emplyeeSalary is :"+employeeSalary);
			System.out.println();
		}
}
class methodExecution{
	public static void main(String args[]){
		employee employeeobj=new employee();
		System.out.println("------------------employee information-----------------");
			
			
			employeeobj.EmpolyeeInfo(190, "pawan kalyan", 00000);
			employeeobj.EmpolyeeInfo(191, "nithan", 000000);
			employeeobj.EmpolyeeInfo(192, "mahesh babu", 00000);
			employeeobj.EmpolyeeInfo(193, "ntr", 00000);
			employeeobj.EmpolyeeInfo(194, "sai dharma tej", 00000);
			employeeobj.EmpolyeeInfo(195, "varun tej", 00000);
			employeeobj.EmpolyeeInfo(196, "allu arjun",00000);
			employeeobj.EmpolyeeInfo(197, "prabash", 00000);
			for (int i=0; i<=4; i++){
				System.out.println("welcome to ");
			}
		}
	}
	
	
	
	
	class shivaji{
    public static void main(String args[]){
        for (int i=0; i<=4; i++){
            System.out.println("welcome to java tutorials in telugu ");
        }
    }
}