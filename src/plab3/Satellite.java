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
public class Satellite implements SelfCheckCapable {

   Milia_Rover mymiliarover;
   public Satellite()
   {
	   mymiliarover = new Milia_Rover();
   }
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Satellite";
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

	public void transmit_command() {
		// TODO Auto-generated method stub
		System.out.println("Commands received from remote control and are ready to be transmitted to MILIA ROVER");
		mymiliarover.receive_commands();
	}
	public void transmitdata() {
		// TODO Auto-generated method stub
		System.out.println("Data reached satellite and ready to be sent to Earth remote control");
		Remote_Control myremotecontrol = new Remote_Control();
		myremotecontrol.transmitdata_nasa();
	}

}
