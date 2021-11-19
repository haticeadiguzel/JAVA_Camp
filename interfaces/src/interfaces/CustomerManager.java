package interfaces;

public class CustomerManager {
	
	private Logger[] loggers; //güçlü baðlýlýðý bunu yaparak azalttýk. Source>field
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	//loosly - tightly coupled
	//müþteri loglamaya baðlýdýr
	
	public void add(Customer customer) {
		
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		
		Utils.RunLogger(loggers, customer.getFirstName());
		//Utils i böyle çaðýrabildik çünkü static yaptýk
	}

	public void delete(Customer customer) {
		
		System.out.println("Müþteri silindi " + customer.getFirstName());
		
		Utils.RunLogger(loggers, customer.getFirstName());
	}
}
