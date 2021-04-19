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
		System.out.println("Satellite receives command from remote control and is ready to go to Milia Rover");
		/*This function is for ensuring the Satellite receives command from remote
		and then is able to transmit to the rover.*/
		mymiliarover.receive_commands();
	}
	public void transmitdata() {
		// TODO Auto-generated method stub
		System.out.println("Data reached satellite and ready to be sent to remote control");
		/*This function is to know that the data was successful in getting to the Satellite 
		and to be transmitted to the remote control.*/
		Remote_Control myremotecontrol = new Remote_Control();
		myremotecontrol.transmitdata_nasa();
	}

}
