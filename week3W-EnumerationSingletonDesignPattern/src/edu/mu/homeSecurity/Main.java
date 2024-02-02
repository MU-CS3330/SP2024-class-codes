package edu.mu.homeSecurity;

import java.util.ArrayList;

import edu.mu.homeSecurity.camera.Location;
import edu.mu.homeSecurity.camera.SecurityCamera;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<SecurityCamera> cameraList = new ArrayList<SecurityCamera>();
		// Creating security cameras
		SecurityCamera cam1 = new SecurityCamera(1, Location.FRONT_DOOR);
		SecurityCamera cam2 = new SecurityCamera(2, Location.BACKYARD);
		SecurityCamera cam3 = new SecurityCamera(3, Location.FRONT_DOOR);
		SecurityCamera cam4 = new SecurityCamera(4, Location.LIVING_ROOM);
		
		// adding the security cameras to an ArrayList
		cameraList.add(cam1);
		cameraList.add(cam2);
		cameraList.add(cam3);
		cameraList.add(cam4);
		
		for(SecurityCamera cam : cameraList) {
			for(int i=0; i<5; i++) {
				cam.monitor();
			}
		}
	}
}
