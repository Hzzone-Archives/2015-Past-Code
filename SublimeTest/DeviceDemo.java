import java.io.*;

public class DeviceDemo implements Device{

	String deviceName;

	private static PrintWriter stdOut =
		new PrintWriter(System.out, true);

	private static PrintWriter stdErr =
	 	new PrintWriter(System.err, true);

	public void turnOff(){
		stdOut.println("turn off device " + deviceName);
	}

	public void turnOn(){
		stdOut.println("turn on device " + deviceName);
	}

	public DeviceDemo(String initialName){
		deviceName = initialName;
	}

	public static void main(String[] args){

		DeviceDemo devcie = new DeviceDemo("hello");

		device.turnOn();

		device.turnOff();

	}

}