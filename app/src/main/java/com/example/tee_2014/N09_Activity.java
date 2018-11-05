package com.example.tee_2014;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class N09_Activity extends Activity {
	ImageButton call,fb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_n09_);
		

		call=(ImageButton) findViewById(R.id.call);
		fb=(ImageButton) findViewById(R.id.dial);
		
		call.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:+8801788010407"));
				startActivity(intent);
			}
		});
		
		fb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mobile.facebook.com/profile.php?id=100002825385100&fref=pb")));
			}
		});
		
		
	}
}
