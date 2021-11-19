package inheritance2;

public class CustomerManager {
	
	public void add(Logger logger) {
		System.out.println("Müþteri eklendi");
		//DatabaseLogger logger = new DatabaseLogger(); parametre sayesinde gerek kalmadý newlemek yanlýþ
		logger.log();
	}

}
//bir iþ yapan sýnýf baþka iþ sýnýfýný kullanýcaksa asla somut sýnýftan gidemez.
//bunlarý newleyemeyiz
