package inheritance2;

public class EmailLogger extends Logger{

	@Override //bununla basedeki kodu ezip kendi kodumuzu yazar�z
	public void log() {
		
		System.out.println("Email yolland�");
	}
}
