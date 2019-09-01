package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@TODO
public class DeviceDatabase {
	private List<Device> devices;
	
//@TODO
	private void init(){	  
		this.devices = Collections.synchronizedList(new ArrayList<Device>());
		this.devices.add(new Device("TV_cuina", Device.TYPE.ELECTRONICA));
		this.devices.add(new Device("TV_menjador", Device.TYPE.ELECTRONICA));
		this.devices.add(new Device("Llums_menjador", Device.TYPE.LLUMS));		
	}
	
	public List<Device> getDevices(){
		return this.devices;
	}
}
