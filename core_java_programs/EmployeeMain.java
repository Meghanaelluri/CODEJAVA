package core_java_programs;

class Employee {
	int id;
	String name;
//	String address;
	static String address="pairs";
	
	
	public void show(Employee employee) {
		System.out.println(employee.id+":"+employee.name+":"+employee.address);
		
		
	}
}

public class EmployeeMain {
	
	private static Employee[] employee;

	public static void main(String[]args) {
		
		Employee e = new Employee();
		e.id=1;
		e.name="Mintu";
//		e.address="Hyderabad";
		Employee.address="Hyderabad";
		e.show(e);
		
		Employee e1 = new Employee();
		e1.id=1;
		e1.name="mintu";
//		e1.address="Hyderabad";
		Employee.address="Hyderabad";
		e1.show(e1);
		
		Employee e2 = new Employee();
		e2.id=1;
		e2.name="MINTU";
//		e2.address="Hyderabad";
		Employee.address="Hyderabad";
		e2.show(e2);
		
//		Employee emp[] = new Employee[3];
//		emp[0]=e;
//		emp[1]=e1;
//		emp[2]=e2;
		
		
//		e.show(e);
//		e1.show(e1);
//		e2.show(e2);
		
		for(int i=0;i<employee.length;i++) {
			
			
			System.out.println(e.id+":"+e.name+":"+e.address);
		}
			
//		
//		
//	
//	for(Employee employee:employee) {
//		
//	System.out.println(employee.id+":"+employee.name+":"+employee.address);
//		
//	}

	}
}