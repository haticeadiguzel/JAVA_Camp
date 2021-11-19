package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		
		System.out.println(customer.customerNumber + " m��teri eklendi!");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers) {
			add(customer);
		}
		
	}
}

//SOL�D - Open Closed Principle sisteme yeni �zellik eklendi�inde mevcut kodlar� de�i�tiremezsin
