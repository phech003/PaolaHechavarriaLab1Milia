/**
 * 
 */
package edu.fiu.Lab1;

/**
 * @author paola1108
 *
 */
public class Camera {
String lens; /** Camera has lens */
String flash; /** Camera has flash */

void record_video()
{}
/** this method of the camera will have it recording videos */

void capture_pictures()
{}
/** this method of the camera will have it taking pictures */

void move_up()
{}
/** this method of the camera will it move the focus of video/picture up */

void move_down()
{}
/** this method of the camera will it move the focus of video/picture down */

}

/** Subclasses begin here, Camera is an example of generalization */

class Engineering_Camera extends Camera
{
String lens;
String flash;

void captures_sample_recordings()
{}
void capture_color_pictures()
{}
void move_up()
{}
void move_down()
{}
}
/** 
* Engineering is a subclass Camera which inherited the attributes and operations of camera, 
* but the methods of video recording is specifically for recording sample and it takes color pictures
*/

class Science_Camera extends Camera
{
String zoom_lens; 
String flash;

void record_videos()
{}
void capture_3D_stereo_images()
{}
void move_up()
{}
void move_down()
{}
}
/** 
* Science is the second subclass of Camera which inherited the attributes and operations of camera, 
* but the methods of taking picture is specifically capturing 3D stereo images. Also this camera has zoom lens. 
*/

class Entry_Descent_and_Landing_Camera extends Camera
{
String lens; /** Brains has a main computer */
String flash;

void record_final_descent()
{}
void capture_landing()
{}
void move_up()
{}
void move_down()
{}
}
/** 
* ntry_Descent_and_Landing is the third subclass of Camera which inherited the attributes and operations of camera, 
* but the methods recording video is specifically for final descent and taking pictures of landing
*/


