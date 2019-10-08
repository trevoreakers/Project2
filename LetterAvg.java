
public class LetterAvg {
	
	private char letterAverage; // Holds the letter average passed in from mesoInherit.
	
	private String STID; // Holds the station from PosAvg.
	
	private int numberOfStations; // Holds the number of stations that start with the letterAverage. 
	
	// Constructor for Driver.
	public LetterAvg(char character) {
		this.letterAverage = character;
	}
	
	//Constructor for PosAvg. 
	public LetterAvg(String station) {
		this.STID = station;
	}
	
	// Method to calculate the number of stations that start with the letter average.
	public int numberOfStationWithLetterAvg() {
		PosAvg obj = new PosAvg(STID);
		String [] array = obj.getStIDs();
		for(int i = 0; i < array.length; ++i) {
			if(array[i].charAt(0) == (letterAverage)) {
				++ numberOfStations;
			}
		}
		return numberOfStations;
	}
	
	// Getter method for the letterAvg.
	public char getLetterAverag() {
		return letterAverage;
	}
	
	// toString method that overrides the object toString. 
	public String toString() {
		return "\nThey are:";
	}
}
