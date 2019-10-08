
public class LetterAvg {
	
	private char letterAverage; // Holds the letter average passed in from mesoInherit.
	
	private String STID; // Holds the station from PosAvg.
	
	// Constructor for Driver.
	public LetterAvg(char character) {
		this.letterAverage = character;
	}
	
	//Constructor for PosAvg. 
	public LetterAvg(String station) {
		this.STID = station;
	}
	
	
	// Getter method for the letterAvg.
	public char getLetterAverag() {
		return letterAverage;
	}
	
}
