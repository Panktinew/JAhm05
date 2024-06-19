import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Employee> lste = new ArrayList<Employee>();
		
		
		lste.add(new Employee("nisja"));
		lste.add(new Employee("anisha"));
		lste.add(new Employee("janki"));
		
		System.out.println(lste);
		
		
		lste.forEach(obj1 -> System.out.println(obj1.getEname()));
		
		Collections.sort(lste);
		//lste.compareTO(e1(
		lste.forEach(obj1 -> System.out.println(obj1.getEname()));
		
		
	}

}
