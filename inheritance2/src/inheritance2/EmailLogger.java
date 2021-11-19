package inheritance2;

public class EmailLogger extends Logger{

	@Override //bununla basedeki kodu ezip kendi kodumuzu yazarýz
	public void log() {
		
		System.out.println("Email yollandý");
	}
}
