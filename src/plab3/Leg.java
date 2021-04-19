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
		System.out.println("Auto_roam begins");
		/*This function is for the legs to begin moving so the Rover begins its mission.*/
		mylasersensor.sense_objects();
	}


	public void detectobstacle() {
		// TODO Auto-generated method stub
		System.out.println("Detects obstacle in path and Brakes");
		/*This function is for the legs to enact brakes so the Rover doesn't crash 
		 * since there is a obstacle in the way .*/
	}


	public void dectectpathway() {
		// TODO Auto-generated method stub
		System.out.println("Detects new path");
		/*This function is for the legs to go on a new path that has no obstacle.*/
	    System.out.println("Resumes auto_roam");
	    /*This function is for the legs to resume its auto function of roaming. */
	    System.out.println("Stop auto roam and perform camera functions");
	    /*This function is for the legs to stop roaming in order for the camera to do its job.*/
	}

}
