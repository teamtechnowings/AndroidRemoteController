package com.project;

import java.util.Currency;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button btn = (Button) findViewById(R.id.button1);
		registerForContextMenu(btn);
		
		ListView lv=(ListView) findViewById(R.id.listView1);
//		"Movie Library",
		String[] arr=new String[]{
				"Wireless Presenter","Exit"};
		ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, 
				android.R.layout.simple_list_item_1,
				arr
				);
		lv.setAdapter(adapter);
		
		OnItemClickListener listener=new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int position,
					long duration) {
				// TODO Auto-generated method stub
				toast("CLicked item is "+position);
				if(position==0){// Movie Library
					Intent intent=new Intent(MainActivity.this,MovieListActivity.class);
					startActivity(intent);
					
				}else if(position==1){// Wireless Activity
					Intent intent=new Intent(MainActivity.this,WirelessActivity.class);
					startActivity(intent);
				}else{
					finish();
				}
				
			}
		};
		lv.setOnItemClickListener(listener);
		
		
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
	
		getMenuInflater().inflate(R.menu.home_menu, menu);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_menu, menu);

		return true;
	}
@Override
public boolean onContextItemSelected(MenuItem item) {
	// TODO Auto-generated method stub
	if (item.getItemId() == R.id.refreshid) {
		toast("Refresh menu Selected");
	} else if (item.getItemId() == R.id.exitid) {
		toast("Exit menu Selected");
	}

	return super.onContextItemSelected(item);
}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if (item.getItemId() == R.id.refreshid) {
			toast("Refresh menu Selected");
		} else if (item.getItemId() == R.id.exitid) {
			toast("Exit menu Selected");
		}
		return super.onOptionsItemSelected(item);
	}

	public void toast(String msg) {
		Toast.makeText(MainActivity.this, msg, 3000).show();
	}

}
