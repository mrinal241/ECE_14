package com.example.tee_2014;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fedback_Activity extends Activity {
	
	Button submit;
	String feed;
	EditText fd;
	MediaPlayer mp,mp3;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fedback_);
		fd=(EditText) findViewById(R.id.feed_edit);
		mp=MediaPlayer.create(this, R.raw.snd);
		mp3=MediaPlayer.create(this, R.raw.sn);
		submit=(Button) findViewById(R.id.fed_submit);
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				feed=fd.getText().toString();
				Toast.makeText(getBaseContext(), feed+", Thanks for your feedback", Toast.LENGTH_LONG).show();
				Intent k=new Intent(Fedback_Activity.this, MainActivity.class);
				startActivity(k);
			}
		});
	}
}
