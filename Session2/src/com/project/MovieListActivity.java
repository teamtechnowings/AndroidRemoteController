package com.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MovieListActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.movielist);
ListView lv=(ListView) findViewById(R.id.listView1);
		
		String[] arr=new String[]{"DDLJ",
				"PK","HappyNewYear"};
		ArrayAdapter adapter=new ArrayAdapter(MovieListActivity.this, 
				android.R.layout.simple_list_item_1,
				arr
				);
		lv.setAdapter(adapter);
		OnItemClickListener listener=new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView adapter, View view, int position,
					long duration) {
				toast("CLicked item is "+position);
				Intent intent=new Intent(MovieListActivity.this,MovieDetailsActivity.class);
				intent.putExtra("MOVIE_NO", position);
				startActivity(intent);
			}
		};
		lv.setOnItemClickListener(listener);
		
		
		
	}
	public void toast(String msg) {
		Toast.makeText(MovieListActivity.this, msg, 3000).show();
	}

}
