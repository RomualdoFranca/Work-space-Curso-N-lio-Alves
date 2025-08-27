package secao13.polimorfismo;

import secao13.polimorfismo.entities.Employee;
import secao13.polimorfismo.entities.OutsourcedEmployee;

public class Application {

	public static void main(String[] args) {

		Employee employee01 = new Employee("Alex", 50, 20.00);
		System.out.println(employee01);
		System.out.println();
		
		OutsourcedEmployee employee02 = new OutsourcedEmployee("Bob", 100, 15.00, 200.00);
		System.out.println(employee02);
		
	}

}
