package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		
		System.out.println(customer.customerNumber + " müþteri eklendi!");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers) {
			add(customer);
		}
		
	}
}

//SOLÝD - Open Closed Principle sisteme yeni özellik eklendiðinde mevcut kodlarý deðiþtiremezsin
