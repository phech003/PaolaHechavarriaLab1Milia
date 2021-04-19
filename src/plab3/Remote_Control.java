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
public class Remote_Control implements SelfCheckCapable {

	
	Satellite mysatellite;
public Remote_Control()
{
	mysatellite = new Satellite();
}
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Remote_Control";
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

	public void Send_Command() {
		// TODO Auto-generated method stub
		System.out.println("NASA sends commands to remote and is ready to be transmitted to Satellite");
		/*This function is to know that NASA sent the command to remote and 
		is then ready to send it through to the Satellite.*/
		mysatellite.transmit_command();
	}

	public void transmitdata_nasa() {
		// TODO Auto-generated method stub
		System.out.println("Data recevied by NASA and end of communication");
		/*This function is for a successful communication of sending data from the Rover back to NASA.*/
	}

}
