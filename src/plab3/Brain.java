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
		System.out.println("Health Check performed and results stored as report");
		
		
	}

	public void store() {
		// TODO Auto-generated method stub
		System.out.println("All data storedand Days report ready to be transmitted to Satellite");
		Satellite mysatellite = new Satellite();
		
	    mysatellite.transmitdata();
	}
	
	
	

}