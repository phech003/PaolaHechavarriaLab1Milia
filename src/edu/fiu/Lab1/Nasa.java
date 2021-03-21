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

public class Nasa implements SelfCheckCapable {
String scientist; /** Nasa has scientist */
int operation_outpost; /** Nasa has an operation outpost */
String satellites; /** Nasa has satellites */

Remote_Control sends_commands()
{return null;}
/** 
 * This method is where Nasa will send commands 
 * I'm doing a self check from Nasa to Remote_Control in sending commands
 */

void receives_data()
{}
/** This method is where Nasa will receive all forms of data from the rover */

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "my Nasa";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	/** Here I want the random check to fail 0.5 */

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
