package controller;

import java.util.List;

import model.Device;
import model.DeviceDatabase;

//@TODO
public class HomeDevicesController {
//@TODO
	private DeviceDatabase deviceDatabase;
	
//@TODO
	private ServerEndPoint serverEndPoint;
	
	public List<Device> getDevices(){
	  //@TODO
	  return null; 
	}
		
	/**
	 * Method that changes the status of the device in a switch mode.
	 * @param device The device to be toggled.
	 */
	public void toggleDevice(Device device) {
		Device.STATUS newStatus = (device.getStatus() == Device.STATUS.OFF) ?
		    Device.STATUS.ON : Device.STATUS.OFF;		
		//@TODO
		
	}
	

}
