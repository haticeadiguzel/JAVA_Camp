package inheritance2;

public class CustomerManager {
	
	public void add(Logger logger) {
		System.out.println("M��teri eklendi");
		//DatabaseLogger logger = new DatabaseLogger(); parametre sayesinde gerek kalmad� newlemek yanl��
		logger.log();
	}

}
//bir i� yapan s�n�f ba�ka i� s�n�f�n� kullan�caksa asla somut s�n�ftan gidemez.
//bunlar� newleyemeyiz
