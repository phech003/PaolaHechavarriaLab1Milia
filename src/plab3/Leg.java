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
public class Leg implements SelfCheckCapable {

	
	
	Laser_sensor mylasersensor;
	
	public Leg()
	{
	  mylasersensor = new Laser_sensor();		
	}
	
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Leg";
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

	public void auto_roam() {
		// TODO Auto-generated method stub
		System.out.println("auto roam ");
		mylasersensor.sense_objects();
	}


	public void detectobstacle() {
		// TODO Auto-generated method stub
		System.out.println("detects obstacle and Brakes");
	}


	public void dectectpathway() {
		// TODO Auto-generated method stub
		System.out.println("Trying new path");
	    System.out.println("Resuming auto_roam");
	    System.out.println("stop auto roam and perform other functions");
	}

}
