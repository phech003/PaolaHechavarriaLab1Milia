/**
 * 
 */
package edu.fiu.Lab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author paola1108
 *
 */

public class Remote_Control implements SelfCheckCapable {
String buttons; /** Remote_Control has buttons*/
String antenna; /** Remote_Control has antennas */

Rover_Milia transmits_communications()
{return null;}
/**
 * This method is where Remote control transmits communication to, 
 * I'm doing a self check from Remote_Control to Rover_Milia in transmits communication
 */

void commands_movement()
{}
/** This method in remote control is what will tell the Rover what to do for movements */

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "my Remote_Control";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	
	/** Here I want the random check to fail 0.5
	 */
	
	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
