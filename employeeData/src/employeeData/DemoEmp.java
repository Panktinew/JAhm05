package employeeData;

import java.util.Scanner;

public class DemoEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ///  it is called automatically when we create object
		EmployeeData ed = new EmployeeData();
		
		System.out.println(ed);
		
		EmployeeData ed2 = new EmployeeData("Vallabh","HR",1212132);
		
		System.out.println(ed2);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.next() ;
		
		System.out.println("Enter your designation");
		String desig = sc.next() ;
		
		System.out.println("Enter your contact detail");
		int no1 = sc.nextInt() ;
		
		
		ed.setName(name);
		ed.setDesignation(desig);
		ed.setBasicSalary(no1);
		
		
		System.out.println(ed);  // ed.toString()
	}

}
