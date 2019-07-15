package com.project;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MovieDetailsActivity extends Activity {
	MediaPlayer mp = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.moviedetails);

		int movieNo = getIntent().getIntExtra("MOVIE_NO", 0);
		RelativeLayout rl = (RelativeLayout) findViewById(R.id.relativeLayout);
//		if (movieNo == 0) { // ddlj
//			rl.setBackgroundResource(R.drawable.ddlj);
//			mp=MediaPlayer.create(MovieDetailsActivity.this,
//					R.raw.kalimba);
//			mp.start();
//		} else if (movieNo == 1) { // PK
//			rl.setBackgroundResource(R.drawable.pk);
//			mp=MediaPlayer.create(MovieDetailsActivity.this,
//					R.raw.kalimba);
//			mp.start();
//		} else if (movieNo == 2) { // HNY
//			rl.setBackgroundResource(R.drawable.hny);
//			mp=MediaPlayer.create(MovieDetailsActivity.this,
//					R.raw.kalimba);
//			mp.start();
//		}

	}

	
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mp.pause();
	}

}
