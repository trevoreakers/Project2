
public class MesoInherit extends MesoAbstract {
	
	private String stId; // Creates a variable to hold the stID from MesoStation. 
		
	// Constructor. Gets the stID from the object passed from MesoStation.
	public MesoInherit(MesoStation meso) {
		this.stId = meso.getStID();
	}
	
	// Getter method for the stId.
	public String getId() {
		return stId;
	}
}
