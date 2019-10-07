
public class MesoInherit extends MesoAbstract {
	
	private String stId; // Creates a variable to hold the stID from MesoStation. 
			
	// Constructor. Gets the stID from the object passed from MesoStation.
	public MesoInherit(MesoStation meso) {
		this.stId = meso.getStID(); // Sets the stId variable equal to the stID from MesoStation.
		
	}
	
	protected int [] calAverage() {
		int [] number = new int[5];
		return number;
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
