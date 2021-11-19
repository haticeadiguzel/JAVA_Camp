import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Hatice", "Adýgüzel", "2001, 09, 27",
				"24340119352"));
	}

}
