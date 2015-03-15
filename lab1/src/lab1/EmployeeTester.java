package lab1;
import java.util.*;

public class EmployeeTester {

	public static void main(String args[]) throws CloneNotSupportedException{
		
		// create and test class
		Employee stannis = new Employee("Stannislav Stannis-stan ruble", 100);
		System.out.println("Employee is: \t"+ stannis.getName() +"\nSalary is: \t" + stannis.getSalary());
		System.out.println("------------");
		
		Manager peter = new Manager("Peter", 100000.0, "01/01/2000");
		System.out.println("Manager is: \t"+ peter.getName() +"\nSalary is: \t" + peter.getSalary() + "\nHiredate is: \t"+ peter.getDate());
		System.out.println("------------");
		
		Manager peterCopy = (Manager)peter.clone();
		
		System.out.println("Manager is: \t"+ peterCopy.getName()+"-Clone" +"\nSalary is: \t" + peterCopy.getSalary() + "\nHiredate is: \t"+ peterCopy.getDate());
		System.out.println("------------");
		
		System.out.println("Testing objects...");
		
		// equality between object/clone
		System.out.println("Testing whether object and clone are eqaul...");
		if(peter.equals(peterCopy)){
			System.out.println("object and objectClone objects were equal.\n");
		}else {
			System.out.println("object and objectClone objects were not equal.\n");
		}
		
		// equality between type and subtype (employee/manager)
		System.out.println("Testing whether class (Employee) and subclass(Manager) are equal...");
		if(peter.equals(stannis)){
			System.out.println("Employee and Manager classes were equal.\n");
		}else {
			System.out.println("Employee and Manager classes were not equal.\n");
		}
		
		
		// are the name fields of a cloned object equal
		System.out.println("Testing whether name field of object and clone are equal...");
		if(peter.getName().equals(peterCopy.getName())){
			System.out.println("name field of object and clone were equal.\n");
		}else {
			System.out.println("name field of object and clone were not equal.\n");
		}
		
		// are the name fields of a cloned object equal
		System.out.println("Testing whether modifying clone also reflects on original...");
		peterCopy.setDate("/THIS IS A COPY STRING/");
		if(peter.getName().equals(peterCopy.getName())){
			System.out.println("Modified name field of object and clone were equal.\n");
		}else {
			System.out.println("Modified name field of object and clone were not equal.\n");
		}
							
		System.out.println("All tests complete.");

	}
	
}
