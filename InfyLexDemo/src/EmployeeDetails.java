
public class EmployeeDetails {
	
	public int employeeId;
	public String employeeName;
	

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void detailsDisplay() {
		System.out.println("EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + "]");
	}
	
//	@Override
//	public String toString() {
//		return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
//	}
	
}
