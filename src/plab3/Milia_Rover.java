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
public class Milia_Rover implements SelfCheckCapable {
    
	
	Brain mybrain;
	Leg myleg;
	Camera mycam;
	
	public Milia_Rover()
	{
		mybrain = new Brain();
		myleg = new Leg();
		mycam = new Camera();
		
	}
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Rover";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.0001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this,mybrain,mycam,myleg);
	}

	public void receive_commands() {
		// TODO Auto-generated method stub
		System.out.println("Commands are ready to be received and received commands from Satellite");
		System.out.println("Receiving commands");
		mybrain.check_system_health();
		myleg.auto_roam();
		mycam.record();
		
	}

}

