package devices;

public abstract class Device {
	
	public String serialnumber;

	public Device(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	
	public abstract void processDoc(String doc);
}
