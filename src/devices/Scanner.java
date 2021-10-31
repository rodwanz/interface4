package devices;

public class Scanner extends Device{

	public Scanner(String serialnumber) {
		super(serialnumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	public String scan() {
		return "Scanned content";
	}
	
	

}
