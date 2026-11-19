package aggregation_association_composition;

public class Department {
	
	String deptName;
	Teacher teacher;
	
	//aggregation:- contained object is refered inside the constructor of the container object creation 
	public Department(String deptName, Teacher teacher) {
		super();
		this.deptName = deptName;
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", teacher=" + teacher + "]";
	}
	
}
