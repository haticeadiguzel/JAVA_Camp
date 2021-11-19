package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "145280";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "856952";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "892581";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {engin, abc, hepsiBurada};
		customerManager.addMultiple(customers);
		
		/*customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(abc);*/
	
	}

}
