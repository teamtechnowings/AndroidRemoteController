import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class WirelessServer {
	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(2233);
			System.out.println("Created Server on 2233");
			while (true) {
				Socket client = server.accept();
				System.out.println("Got Connection");
				String ip=client.getInetAddress().getHostAddress();
				System.out.println("Client IP is "+ip);
				InputStream is= client.getInputStream();
				int val=is.read();
				Robot r=new Robot();
				if(val==1){	// left
					r.keyPress(KeyEvent.VK_LEFT);
				}else if(val==2){	// right
					r.keyPress(KeyEvent.VK_RIGHT);
				}else if(val==3){	// up
					r.keyPress(KeyEvent.VK_UP);
				}else if(val==4){	// down
					r.keyPress(KeyEvent.VK_DOWN);
				}else if(val==5){	// enter
					r.keyPress(KeyEvent.VK_ENTER);
				}
				
				client.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
