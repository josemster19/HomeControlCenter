package model;

public class Device {
  
  public static enum STATUS {  
    ON, OFF;
  }
  
  public static enum TYPE {
    ELECTRONICA, ELECTRODOMESTIC, LLUMS, ALTRES;
  }
  
  private String name;
	private TYPE type;	
	private STATUS status;
	
	public Device(String name, TYPE type) {	
		this.type = type;
		this.name = name;
		this.status = STATUS.OFF;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public TYPE getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String toString(){
	  return String.format("%s %s %s", this.name, this.status, this.type);
	}	
}
