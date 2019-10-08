
public class MesoInherit extends MesoAbstract {
	
	private String stId; // Creates a variable to hold the stID from MesoStation. 
			
	// Constructor. Gets the stID from the object passed from MesoStation.
	public MesoInherit(MesoStation meso) {
		this.stId = meso.getStID(); // Sets the stId variable equal to the stID from MesoStation.
	}
	
	// Method to find the ceiling, floor, and average of the station IDs in ascii form. 
	protected int [] calAverage() {
		int [] ascii = new int[3];
		int asciiValue = 0; 
		for(int i = 0; i < stId.length(); ++i) {
			asciiValue += stId.charAt(i);
		}
		double asciiAverage = (double) asciiValue / stId.length();
		ascii[0] = (int) Math.ceil(asciiAverage);
		ascii[1] = (int) Math.floor(asciiAverage);
		if(asciiAverage < 0.5) {
			ascii[2] = ascii[1];
		} else if (asciiAverage >= 0.5) {
			ascii[2] = ascii[0];
		}
		
		return ascii;
	}
	
	protected char letterAverage() {
		char letter = 'A';
		return letter;
	}
	
	// Getter method for the stId.
	public String getId() {
		return stId;
	}
}
