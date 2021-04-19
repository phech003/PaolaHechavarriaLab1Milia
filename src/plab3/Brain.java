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
public class Brain implements SelfCheckCapable {

	@Override
	
	
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Brain";
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

	public void check_system_health() {
		// TODO Auto-generated method stub
		System.out.println("Checking of System Health performed and results stored for final report");
		/*The function is for Brain to perform system checks and then whether its pass 
		 * or fail it saves information for report */
		
	}

	public void store() {
		// TODO Auto-generated method stub
		System.out.println("All data stored and report ready to be received by Rover for transmission");
		Satellite mysatellite = new Satellite();
		
	    mysatellite.transmitdata();
	}
	
	
	

}