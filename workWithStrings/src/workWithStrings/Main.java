package workWithStrings;

public class Main {

	public static void main(String[] args) {
	
		String message = "Today wheather is so good.";
		
		System.out.println(message);
		System.out.println("Eleman sayýsý: "+message.length());
		System.out.println("5. eleman: "+message.charAt(4));
		System.out.println(message.concat("Yuppi!"));
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("."));
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf('e'));
		System.out.println(message.replace('a', 'w'));
		System.out.println(message.substring(6,14));
		for(String word:message.split(" ")) {
			System.out.println(word);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim()); //baþýnda ve sonunda boþluk varsa atar.
		
	}

}
