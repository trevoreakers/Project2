import java.io.BufferedReader; // Imports BufferedReader class.
import java.io.IOException;

public class MesoInherit extends MesoAbstract {
	
	private String stId; // Creates a variable to hold the stID from MesoStation. 
		
	// Constructor. Gets the stID from the object passed from MesoStation.
	public MesoInherit(MesoStation meso) {
		this.stId = meso.getStID(); // Sets the stId variable equal to the stID from MesoStation.
		
		// Tries to call the readFile method to read in station Ids from Mesonet.txt.
		try {
			readFile();
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	// Method to read in the station Ids from Mesonet and add them into an array.
	public void readFile() throws IOException {
		
	}
	
	// Getter method for the stId.
	public String getId() {
		return stId;
	}
}
