package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employee emp1 = new Employee();
//		emp1.Name ="Rohit";
//		emp1.EmployeeId=23456;
//		emp1.Salary= 10000;
//		
//		Employee emp2 = new Employee();
//		emp2.Name ="Sharma";
//		emp2.EmployeeId=2346;
//		emp2.Salary= 20000;
		
//		Employee emp1 = new Employee("Rohit",23456,10000);
//		Employee emp2 = new Employee("Sharma",2346,20000);
//		
//		emp1.OutputComes();
//		emp2.OutputComes();
		
/*Employee emp1 = new Employee();
		
		emp1.Name = "Sachin";
		emp1.EmployeeId = 242423;
		emp1.Salary = 1000;
		
		Employee emp2 = new Employee();
		
		emp2.Name = "Mahesh";
		emp2.EmployeeId = 543456;
		emp2.Salary = 1200; */
		
		//Employee emp1 = new Employee("Sachin",242423,1000);
		//Employee emp2 = new Employee("Mahesh",543456,1200);
		
		//emp1.PrintName();
		//emp2.PrintName();

//		Employee emp3 = new Employee("Rahul",456785);
//		
//	
//		Employee.ChangeCompanyName();
//		emp3.PrintName();
//		emp3.PrintSalary();
//		Employee emp4 = new Employee();
		
//		Person per1 = new Person();
//		ChildClass child1 = new ChildClass();
//		child1.display();
//		child1.print();
		
		
//		ChildClass child =new ChildClass();
		ChildClass child1 = new ChildClass("Rohit,30,ITD");
		
		
		
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.sum(4, 6);
		obj.sum(4, 6, 7);
		
		
//		BankExample bank1 = new BankExample();//-----object not created
		ICICIBank bank1 = new ICICIBank();// ----object created only in child class(abstract)
		
		bank1.Welcome();

		EncapsulationExample obj1 = new EncapsulationExample();
		
		obj1.setCompany("Simpli");
		System.out.println(obj1.getCompany());
		
	}

}
