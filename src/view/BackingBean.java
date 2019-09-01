package view;

import java.util.List;

import model.Device;
import controller.HomeDevicesController;

//@TODO
public class BackingBean {	
	private List<Device> devices;
		
	//@TODO: The baking bean injects the controller
	private HomeDevicesController homeDevicesController;
	
	public List<Device> getDevices() {
	  //@TODO	  
		return null;
	}
	
  public void setHomeDevicesController(HomeDevicesController homeDevicesController) {
    this.homeDevicesController = homeDevicesController;
  }
		
}
