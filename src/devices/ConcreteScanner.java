package devices;

public class ConcreteScanner extends Device implements Scanner{

	public ConcreteScanner(String serialnumber) {
		super(serialnumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}
	
	

}
