package com.example.demo;


public class Employee {
	
	
protected Employee(){
	
}
	

	public Employee(Integer employeeId, String firstname, String lastName, int jobLevelId, String departmentId, String emailId, int managerId) {
		// TODO Auto-generated constructor stub
		super();
		this.employeeId=employeeId;
		this.firstName=firstname;
		this.lastName=lastName;
		this.jobLevelId=jobLevelId;
		this.departmentId=departmentId;
		this.emailId=emailId;
		this.managerId=managerId;
		
	}
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private Integer jobLevelId;
	private String departmentId;
	private String emailId;
	private Integer managerId;
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public  Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getJobLevelId() {
		return jobLevelId;
	}
	public void setJobLevelId(Integer jobLevelId) {
		this.jobLevelId = jobLevelId;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	@Override
	public String toString() 
	{
	
	return String.format("Employee [employeeId=%s, firstName=%s, lastName=%s, jobLevelId=%s, departmentId=%s, emailId=%s, managerId=%s]", employeeId, firstName, lastName, jobLevelId, departmentId, emailId, managerId);
	}
	

}
