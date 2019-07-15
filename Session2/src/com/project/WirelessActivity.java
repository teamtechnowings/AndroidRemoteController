package com.project;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class WirelessActivity extends Activity {
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wireless);
		// security code for networking start
		android.os.StrictMode.ThreadPolicy tp = 
				android.os.StrictMode.ThreadPolicy.LAX;
		android.os.StrictMode.setThreadPolicy(tp);
		// security code for networking end
	}
	public void fnUp(View v){
		EditText et=(EditText) findViewById(R.id.editText1);
		String serverIp=et.getText().toString();
		WirelessClient.performAction(serverIp, 3);
	}
	public void fnRight(View v){
		EditText et=(EditText) findViewById(R.id.editText1);
		String serverIp=et.getText().toString();
		WirelessClient.performAction(serverIp, 2);
	}
	public void fnLeft(View v){
		EditText et=(EditText) findViewById(R.id.editText1);
		String serverIp=et.getText().toString();
		WirelessClient.performAction(serverIp, 1);
	}
	public void fnDown(View v){
		EditText et=(EditText) findViewById(R.id.editText1);
		String serverIp=et.getText().toString();
		WirelessClient.performAction(serverIp, 4);
	}
	public void fnEnter(View v){
		EditText et=(EditText) findViewById(R.id.editText1);
		String serverIp=et.getText().toString();
		WirelessClient.performAction(serverIp, 5);
	}
			
}
