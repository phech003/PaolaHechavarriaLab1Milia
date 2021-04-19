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
public class Camera implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
		
	}

	public void record() {
		// TODO Auto-generated method stub
		System.out.println("Starting to record"); 
		/*This function is for the camera to begin recording a video of what is happening in Mars.*/
		System.out.println("Stop recording and proceding to store");
		/*This function is for the camera to stop recording and ensures it stores what it did. */
		Brain mybrain = new Brain();
		mybrain.store();
		
	}

}
