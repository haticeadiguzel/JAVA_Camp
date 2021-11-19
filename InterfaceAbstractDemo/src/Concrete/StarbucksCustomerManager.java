package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)){
			this.save(customer);
		}
		
		System.out.println("Not a valid person");
		
		//throw new Exception("Not a valid person");
	}

}
