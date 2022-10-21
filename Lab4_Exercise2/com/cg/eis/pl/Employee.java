package Lab4_Exercise2.com.cg.eis.pl;

public class Employee {
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesignation="
				+ empDesignation + ", empInsuranceScheme=" + empInsuranceScheme + "]";
	}
	int empId;
	String empName;
	double empSalary;
	String empDesignation;
	String empInsuranceScheme;
	public Employee() {}
	public Employee(int empId, String empName, double empSalary, String empDesignation, String empInsuranceScheme) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
		this.empInsuranceScheme = empInsuranceScheme;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpInsuranceScheme() {
		return empInsuranceScheme;
	}
	public void setEmpInsuranceScheme(String empInsuranceScheme) {
		this.empInsuranceScheme = empInsuranceScheme;
	}

}
