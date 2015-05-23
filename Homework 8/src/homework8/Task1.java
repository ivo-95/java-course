package homework8;

public class Task1 {

	public static void main(String[] args) {
		String sentence = "Greetings traveler, do you want a cup of fresh water?";
		checkSentence(sentence);
	}
	
	public static final void checkSentence(String sentence) {
		sentence = sentence.toLowerCase();
		System.out.println("Starts with \"Greeting\" - " + sentence.startsWith("greeting"));
		System.out.println("Ends with dot - " + sentence.endsWith("."));
		System.out.println("Contains the word \"water\" - " + sentence.contains("water"));
	}
}
