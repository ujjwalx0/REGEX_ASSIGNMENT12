
/*Develop the following class and perform deep cloning and shallow cloning.
Customer with customerId, customerName, customerContact properties*/

class Customer implements Cloneable{
	int Customer_Id;
	String Customer_Name;
	String Customer_Contact;
	public Customer(int customer_Id, String customer_Name, String customer_Contact) {
		super();
		Customer_Id = customer_Id;
		Customer_Name = customer_Name;
		Customer_Contact = customer_Contact;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
}
public class cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
	Customer c= new Customer(4354,"ujjwal","7654881420");
	System.out.println("OUTPUT OF DEEP CLONING");
	Customer c1= (Customer)c.clone(); // DEEP CLONING
	System.out.println(c.hashCode());
	System.out.println(c1.hashCode());
	System.out.println(c1.equals(c));
	System.out.println("==========================");
	System.out.println("OUTPUT OF SHALLOW CLONING"+"\n");
	
	Customer c2= new Customer(1234,"james","876593882");
	Customer c3=c2; // shallow cloning
	System.out.println(c2.hashCode());
	System.out.println(c3.hashCode());
	System.out.println(c3.equals(c2));
	

	}

}
