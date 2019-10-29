import java.io.BufferedReader; // Imports BufferedReader class.
import java.io.FileReader; // Imports File Reader class.
import java.io.IOException; // Imports IOException class.

public class PosAvg {

	private static final int LINES_OF_TEXT_SKIPPED = 2;

	private String STiD; // Creates a variable to hold the stationId passed in through the constructor. 
	
	private int capacity = 15; // Creates a variable to set the capacity of the array that holds the stIds.
	
	private int numStIds = 0; // Creates a variable to hold the number of stIds in the array.
	
	private String [] stIDs = new String[capacity]; // Creates an array to hold the stIds with size of capacity.
	
	private int index; // Creates a variable to hold the index of the stationID.
	
	private String word1FirstAvg; // Holds the first word in the first average.
	
	private String word2FirstAvg; // Holds the second word in the first average.
	
	private String word1SecondAvg; // Holds the first word in the second average.
	
	private String word2SecondAvg; // Hold sthe second word in the second average.
	
	// ConStructor.
	public PosAvg(String station) {
		this.STiD = station;
		// Tries to call the readFile method to read in station Ids from Mesonet.txt.
		try {
			readFile("Mesonet.txt");
		} catch (IOException e) {
			e.getMessage();
		}
		
	}
	
	// Method to read in the station Ids from Mesonet and add them into an array.
	public void readFile(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String stationId = "";
			
		// Gets rid of the first 3 lines of data.
		String lineOfData = br.readLine();
		for(int i = 0; i < LINES_OF_TEXT_SKIPPED; ++i) {
			lineOfData = br.readLine();
		}
			
		lineOfData = br.readLine(); // Reads the first line of data that we need to use. 
		// Reads in the stIds from the Mesonet.txt file and adds them to the stIDs array expanding if needed.
		while(lineOfData != null) {
			lineOfData = lineOfData.trim();
			stationId = lineOfData.substring(0,4);
			if(numStIds == capacity) {
				expandStIds();
			}
			stIDs[numStIds] = stationId;
			++ numStIds;
			lineOfData = br.readLine();
		}
		br.close(); // Closes the BufferedReader object.
	}
		
	// Expands the size of the stationIds array to fit more station Ids in it. 
	private void expandStIds() {
		this.capacity *= 2; // Doubles the capacity of the array.
		String[] newStIds = new String[capacity]; // Creates the newStationIds array.
		// Copies the stationIds array into the newStationIds array.
		for (int i = 0; i < this.stIDs.length; i++) {
	       	newStIds[i] = stIDs[i];
	    } 
				
		stIDs = newStIds; // Updates the reference of the stationId array to the newStationId array.
	}
	
	// Method to find the index of the station in the file.
	public int indexOfStation() {
		// For loop to compare the station Id to all the station Ids in the array. 
		for(int i = 0; i < stIDs.length; ++i) {
			if(stIDs[i].equals(STiD)) {
				index = i + 1; // Adds 1 to the index because the array index starts from 0. 
			} 
		}
		
		return index;
	}
	
	// Method to find the average words for the index of the station ID.
	public void averageWords() {
		int index = indexOfStation();
		int arrayIndex = index - 1;
		int word1 = arrayIndex - 1;
		int word2 = arrayIndex + 1;
		int word3 = arrayIndex - 2;
		int word4 = arrayIndex + 2;
		
		word1FirstAvg = stIDs[word1];
		word2FirstAvg = stIDs[word2];
		word1SecondAvg = stIDs[word3];
		word2SecondAvg = stIDs[word4];
	}
	
	// Getter method for the stationId. 
	public String getSTiD() {
		return STiD;
	}
	
	public String [] getStIDs() {
		return stIDs;
	}
	
	// ToString method that overrides object toString.
	@Override
	public String toString() {
		averageWords();
		return String.format("This index is average of %s and %s, %s and %s, and so on.", word1FirstAvg, word2FirstAvg, word1SecondAvg, word2SecondAvg);
	}
}
