package inheritance2;

public class LogManager {
	
	public void log(int logType) {
		
		if(logType == 1) {
			System.out.println("Veritaban�na logland�");
		} else if (logType == 2) {
			System.out.println("Dosyaya logland�");
		} else {
			System.out.println("Email g�nderildi");
		}
	}

}

//loglama -- kim ne zaman ne yapt� demektir
//birbirinin alternatifi olan kodlar i�in if yaz�lmaz

//1-Database
//2-File
//3-Email
