package unit02.Employee;

public class Staff extends Employee{
	
	
	
	public Staff(String no, String name, int career) {
		super(no, name, career);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paySalary() {
		// TODO Auto-generated method stub
		if (career <5) salary = career *10 ; 
		else salary = career*20;
	}
}
