package com.project;
import java.io.OutputStream;
import java.net.*;

public class WirelessClient {
	public static void performAction(String serverIp,int data) {
		try {
//			String serverIp = "192.168.0.110";
			int portNo = 2233;
			System.out.println("PHONE serverIp "+serverIp);
			Socket s = new Socket(serverIp, portNo);
			OutputStream os = s.getOutputStream();
			os.write(data);
			os.close();
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
