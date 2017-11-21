public class Employee {
	private int employeeId;
	private String name;
	
	public Employee() {
		this.employeeId = 1;
		this.name = "Andres Bonifacio";
	}
	
	public void setEmployeeId (int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setName (int name) {
		this.name = name;
	}

	public int getName() {
		return name;
	}
}