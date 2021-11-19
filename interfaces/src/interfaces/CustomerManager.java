package interfaces;

public class CustomerManager {
	
	private Logger[] loggers; //g��l� ba�l�l��� bunu yaparak azaltt�k. Source>field
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	//loosly - tightly coupled
	//m��teri loglamaya ba�l�d�r
	
	public void add(Customer customer) {
		
		System.out.println("M��teri eklendi " + customer.getFirstName());
		
		Utils.RunLogger(loggers, customer.getFirstName());
		//Utils i b�yle �a��rabildik ��nk� static yapt�k
	}

	public void delete(Customer customer) {
		
		System.out.println("M��teri silindi " + customer.getFirstName());
		
		Utils.RunLogger(loggers, customer.getFirstName());
	}
}
