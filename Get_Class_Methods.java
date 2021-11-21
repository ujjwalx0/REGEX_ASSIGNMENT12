
/*Assignment - 2:
Develop the following class and with properties and methods.
class Employee
Properties like; employeeId, employeeName, employeeContact
Methods like; m1(), m2(), m3()
Constructors;
Display the class information like how many constructors, methods, properties are present in the class using 
Class object.*/
import java.util.Arrays;
class Employee{
	int Employee_Id;
	String Employee_Name;
	String Employee_Contact;
	public Employee() {
		//0-args Constructor
	}
	public Employee(int employee_Id, String employee_Name, String employee_Contact) {
		super();
		Employee_Id = employee_Id;
		Employee_Name = employee_Name;
		Employee_Contact = employee_Contact;
	}
	
	public void m1() {}
	public void m2() {}
		
	
	
}
public class Get_Class_Methods {

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println("=============CLASS================"+"\n");
		Class c= e.getClass();
		System.out.println(c);
		System.out.println(c.getName()+"\n");
		System.out.println("============CONSTRUCTOR=============="+"\n");
		System.out.println(Arrays.toString(c.getConstructors())+"\n");
		System.out.println("==============METHODS==================="+"\n");
		System.out.println(Arrays.toString(c.getMethods()));
		

	}

}
