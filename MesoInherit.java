
public class MesoInherit extends MesoAbstract {
	
	private static final double AVERAGE_FACTOR = 0.5;

	private static final int ASCII_SIZE = 3;

	private String stId; // Creates a variable to hold the stID from MesoStation. 
	
	private double asciiAverage; // Creates a variable to hold the average ascii value.
			
	private char letterAvg; // Creates a variable to hold the letterAvg of ascii value.
	
	// Constructor. Gets the stID from the object passed from MesoStation.
	public MesoInherit(MesoStation meso) {
		this.stId = meso.getStID(); // Sets the stId variable equal to the stID from MesoStation.
	}
	
	// Method to find the ceiling, floor, and average of the station IDs in ascii form. 
	protected int [] calAverage() {
		int [] ascii = new int[ASCII_SIZE];
		int asciiValue = 0; 
		for(int i = 0; i < stId.length(); ++i) {
			asciiValue += stId.charAt(i);
		}
		asciiAverage = (double) asciiValue / stId.length();
		ascii[0] = (int) Math.ceil(asciiAverage);
		ascii[1] = (int) Math.floor(asciiAverage);
		if(asciiAverage < AVERAGE_FACTOR) {
			ascii[2] = ascii[1];
			asciiAverage = (int) Math.floor(asciiAverage);
		} else if (asciiAverage >= AVERAGE_FACTOR) {
			ascii[2] = ascii[0];
			asciiAverage = (int) Math.ceil(asciiAverage);
		}
		
		return ascii;
	}
	
	protected char letterAverage() {
		calAverage();
		letterAvg = (char) asciiAverage;
		return letterAvg;
	}
	
	// Getter method for the stId.
	public String getId() {
		return stId;
	}
}
