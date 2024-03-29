package edu.mu.homeSecurity.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerSingleton {
	
	// having the LoggerSingleton type field as static will allow you
	// to have only one instance.
	private static LoggerSingleton instance = null;
	// Define paths as final so that they cannot be modified later.
	private final static String logFilePath = "files/logs.txt";
	
	// private constructor to prevent the LoggerSingleton class
	// to be create outside this class. The object can only be 
	// created by itself.
	private LoggerSingleton() {
	}
	
	/**
	 * If the LoggerSingleton has never been created before 
	 * it will instantiate the object. After it is created it will
	 * not be created again return the first one that has been created.
	 * 
	 * The Singleton Design pattern is for allowing developers to have
	 * one single instance to prevent synchronization issues. You can 
	 * consider the Singleton design pattern as a controlled global variable.
	 * @return the instance of LoggerSingleton.
	 */
	public static LoggerSingleton getInstance() {
		if(instance == null) {
			instance = new LoggerSingleton();
		}
		return instance;
	}
	
	/**
	 * Logs the message passed to this method, by writing it into the logs.txt file.
	 * For this example, the messages are generated by the SecurityCameras and passed
	 * to this method.
	 * @param message
	 * @return Returns <b>true</b> if logging was successful. If logging was failed
	 * it returns <b>false</b>.
	 */
	public boolean logData(String message) {
		try {
			// BufferedWriter and FileWriter usage for writing into a file
			// the "true" argument for the FileWriter is for allowing appending
			BufferedWriter bw = new BufferedWriter(new FileWriter(logFilePath, true));
			// using SimpleDateFormat and Date classes to generate timestamp information
			String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date());
			bw.write(timestamp + message);
			// do not forget to close your BufferWriter instance to avoid memory leaks
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}	
		return true;
	}

}
