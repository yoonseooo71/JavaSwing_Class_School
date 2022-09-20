package unit02.Employee;

public class Master extends Employee{
	int bounus ;


	
	public Master(String no, String name, int career,int bounus) {
		super(no, name, career);
		this.bounus = bounus;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void paySalary() {
		// TODO Auto-generated method stub
		salary = career*30 + bounus ; 
	}
}
