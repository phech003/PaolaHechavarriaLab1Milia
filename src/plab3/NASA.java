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
public class NASA implements SelfCheckCapable {

	
	
	Remote_Control myremotecontrol;
	
	public NASA()
	{
		myremotecontrol = new Remote_Control();
	}
	
	
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "NASA";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.00001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this,myremotecontrol);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  
	    Remote_Control myremotecontrol = new Remote_Control();
	    myremotecontrol.Send_Command();
	    
	}

}

