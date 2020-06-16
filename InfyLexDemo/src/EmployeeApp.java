
public class EmployeeApp {
	
	public static void main(String[] args) {
		
		EmployeeDetails employeedet = new EmployeeDetails();
		employeedet.setEmployeeId(12345);
		employeedet.setEmployeeName("Murali");
		
		employeedet.detailsDisplay();
		//employeedet.getEmployeeName();
	}

}
