import java.io.BufferedReader; // Imports BufferedReader class.
import java.io.FileReader; // Imports File Reader class.
import java.io.IOException; // Imports IOException class.

public class PosAvg {

	private String STiD; // Creates a variable to hold the stationId passed in through the constructor. 
	
	private int capacity = 15; // Creates a variable to set the capacity of the array that holds the stIds.
	
	private int numStIds = 0; // Creates a variable to hold the number of stIds in the array.
	
	private String [] stIDs = new String[capacity]; // Creates an array to hold the stIds with size of capacity.
	
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
		String newStationId = "";
			
		// Gets rid of the first 3 lines of data.
		String lineOfData = br.readLine();
		for(int i = 0; i < 2; ++i) {
			lineOfData = br.readLine();
		}
			
		lineOfData = br.readLine(); // Reads the first line of data that we need to use. 
		// Reads in the stIds from the Mesonet.txt file and adds them to the stIDs array expanding if needed.
		while(lineOfData != null) {
			stationId = lineOfData.substring(0,5);
			newStationId = stationId.trim();
			if(numStIds == capacity) {
				expandStIds();
			}
			stIDs[numStIds] = newStationId;
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
	
	public int indexOfStation() {
		int index = 0;
		
		return index;
	}
	
	// Getter method for the stationId. 
	public String getSTiD() {
		return STiD;
	}
}
