/**
 * 
 */
package plab3;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author paola1108
 *
 */
public class Laser_sensor implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "laser sensor";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.0001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
		
	}

	public void sense_objects() {
		// TODO Auto-generated method stub
		System.out.println("Sensors activiated");
		/*This function is the laser sensors to be turned on in order for the Rover 
		 * and legs to know if there is an obstacle.*/
		
		Leg myleg = new Leg();
		myleg.detectobstacle();
		myleg.dectectpathway();
	}

}