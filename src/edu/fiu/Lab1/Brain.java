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

public class Brain implements SelfCheckCapable {
String main_computer; /** Brain has a main computer */
String proessor; /** Brain has a processor */
int memory; /** Brain has memory */
String backup_computer; /** Brain has a backup computer */


void check_system_health() 
{}
/** 
*this method of the brain will check the systems health to ensure all is working properly
*/

void run_system() 
{}
/** 
*this method of the brain will run the system
*/

Nasa report()
{return null;}	
/**
 * This method of the brain will report any findings, issues, data 
 * I'm doing a self check from Brain to Nasa in reporting
 */

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "my Brain";
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
