package abstractClasses;

public abstract class GameCalculator { //abstract ekledik
	
	public abstract void hesapla(); //abstract ekledik. bu demek oluyorki inherit eden her class override ederek kendi hesaplamasýný yazmalý
	
	public final void gameOver() {  //final demek kimse bunu override yapamaz
		System.out.println("Oyun bitti!");
	}
}
