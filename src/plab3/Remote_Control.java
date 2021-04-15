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
		System.out.println("commands recevived from Nasa and ready to be transmitted to Mars Satellite");
		mysatellite.transmit_command();
	}

	public void transmitdata_nasa() {
		// TODO Auto-generated method stub
		System.out.println("reporting data to nasa and end of communication");
	}

}
