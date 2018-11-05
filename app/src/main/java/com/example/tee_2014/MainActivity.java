package com.example.tee_2014;

import com.example.tee_2014.R.string;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {
	Button develop, aboutapp, list;
	EditText name;
	
	String[] select;
	Spinner spin;
	int index;
	MediaPlayer mp;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mp=MediaPlayer.create(this, R.raw.snd);
        list=(Button) findViewById(R.id.lists);
        list.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp.start();
				Intent list=new Intent(MainActivity.this, ListActivity.class);
				startActivity(list);
			}
		});
        
        
        aboutapp=(Button) findViewById(R.id.aboutApp);
        aboutapp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp.start();
				Intent b=new Intent(MainActivity.this, About_App_Activity.class);
				startActivity(b);
			}
		});
        
        spin=(Spinner) findViewById(R.id.spinner);
        select=getResources().getStringArray(R.array.seletion);
         
     ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, select);
    spin.setAdapter(adapter);
    spin.setOnItemSelectedListener(new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			index=arg0.getSelectedItemPosition();
			switch(index){
			case 1:
				Intent n=new Intent(MainActivity.this, Id_Activity.class);
				startActivity(n);
			case 2:
				Intent m=new Intent(MainActivity.this, Name_Activity.class);
				startActivity(m);
				
			}
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
	});
      
    develop=(Button) findViewById(R.id.developer);
    develop.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			mp.start();
			Intent a=new Intent(MainActivity.this, DeveloperActivity.class);
			startActivity(a);
		}
	});
    
    
      
      
        }
}
