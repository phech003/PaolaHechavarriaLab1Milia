/**
 * 
 */
package edu.fiu.Lab1;

/**
 * @author paola1108
 *
 */
public class Rover_Milia {
String name; /** Rover has a name */
String leg; /** Rover has legs */
String camera; /** Rover has cameras */
String sensor; /** Rover has sensors */
String remote_control; /** Rover has a remote control */
String brain; /** Rover has brains */

void collect_sample() 
{}
/** this method of the Rover will collect sample  */

void roam() 
{}
/** this method of the Rover will have it roam constantly */

void report() 
{}
/** this method of the Rover will report all actions */

void record() 
{}
/** this method of the Rover will record all actions */

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Nasa myNasa = new Nasa();
		myNasa.runSelfCheck();
		/**
		 * This is another object that I created for class Nasa
		 * so I can do the self check
		 */
		
		Remote_Control myremotecontrol= new Remote_Control();
		myremotecontrol.runSelfCheck();
		/**
		 * This is an object that I created for class Remote_Control
		 * so I can do the self check 
		 */
		
		Brain myBrain = new Brain();
		myBrain.runSelfCheck();
		/**
		 * This is another object that I created for class Brains 
		 * so I can do the self check
		 */
		
	}
}
