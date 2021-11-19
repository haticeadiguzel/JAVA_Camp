package interfaces;

public class SmsLogger implements Logger{

	@Override //Bu blok SmsLogger üstünde çýkan ampuldeki þeye basýnca oluþtu
	public void log(String message) {
		
		System.out.println("Sms gönderildi: " + message);
		
	}

	
}
//implemente etmekloggerý sms loggera uyarla gerekli kodlarý yaz demek
//inheritance de istersen üstüne yaz override yap