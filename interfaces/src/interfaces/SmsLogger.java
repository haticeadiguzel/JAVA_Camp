package interfaces;

public class SmsLogger implements Logger{

	@Override //Bu blok SmsLogger �st�nde ��kan ampuldeki �eye bas�nca olu�tu
	public void log(String message) {
		
		System.out.println("Sms g�nderildi: " + message);
		
	}

	
}
//implemente etmeklogger� sms loggera uyarla gerekli kodlar� yaz demek
//inheritance de istersen �st�ne yaz override yap