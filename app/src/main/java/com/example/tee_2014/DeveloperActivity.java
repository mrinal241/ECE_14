package com.example.tee_2014;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class DeveloperActivity extends Activity {
	
	ImageButton dial,fb,twit;
	Button fedback;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_developer);
		
		dial=(ImageButton) findViewById(R.id.dial);
		fb=(ImageButton) findViewById(R.id.fb);
		twit=(ImageButton) findViewById(R.id.twit);
		fedback=(Button) findViewById(R.id.fedback);
		
		dial.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:+8801744955241"));
				startActivity(intent);
			}
		});
		
		
	fb.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/mrinalkanti.ray")));
		}
	});	
		
		
		twit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com/mrinalk73720345")));
			}
		});
		
		
		
		fedback.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent l=new Intent(DeveloperActivity.this, Fedback_Activity.class);
				startActivity(l);
			}
		});
		
	}
}
