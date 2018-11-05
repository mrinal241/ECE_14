package com.example.tee_2014;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Id_Activity extends Activity {
	
	Button develop, aboutapp, list, search;
	String[] select;
	EditText ide;
	Spinner spin;
	String ided;
	int index;
	MediaPlayer mp,mp3;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_id_);
		
		mp=MediaPlayer.create(this, R.raw.snd);
		mp3=MediaPlayer.create(this, R.raw.sn);
		list=(Button) findViewById(R.id.lists);
		search=(Button) findViewById(R.id.id_search);
		ide=(EditText) findViewById(R.id.Id_edit);
		develop=(Button) findViewById(R.id.developer);
		
		list.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent list=new Intent(Id_Activity.this, ListActivity.class);
				startActivity(list);
			}
		});
		
		
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp.start();
			String id=ide.getText().toString();
				switch(id){
				case "1402102" :
					Intent a=new Intent(Id_Activity.this, N02_Activity.class);
					startActivity(a);
					break;
					
					
				case "1402103" :
					Intent b=new Intent(Id_Activity.this, N03_Activity.class);
					startActivity(b);
					break;
					
				case "1402104" :
					Intent c=new Intent(Id_Activity.this, N04_Activity.class);
					startActivity(c);
					break;
					
				case "1402105" :
					Intent d=new Intent(Id_Activity.this, N05_Activity.class);
					startActivity(d);
					break;
					
				case "1402107" :
					Intent e=new Intent(Id_Activity.this, N07_Activity.class);
					startActivity(e);
					break;
					
				case "1402108" :
					Intent f=new Intent(Id_Activity.this, N08_Activity.class);
					startActivity(f);
					break;
					
				case "1402109" :
					Intent g=new Intent(Id_Activity.this, N09_Activity.class);
					startActivity(g);
					break;
					
				case "1402110" :
					Intent h=new Intent(Id_Activity.this, N10_Activity.class);
					startActivity(h);
					break;
					
				case "1402111" :
					Intent i=new Intent(Id_Activity.this, N11_Activity.class);
					startActivity(i);
					break;
					
				case "1402115" :
					Intent j=new Intent(Id_Activity.this, N15_Activity.class);
					startActivity(j);
					break;
					
				case "1402116" :
					Intent k=new Intent(Id_Activity.this, N16_Activity.class);
					startActivity(k);
					break;
					
				case "1402117" :
					Intent l=new Intent(Id_Activity.this, N17_Activity.class);
					startActivity(l);
					break;
					
				case "1402118" :
					Intent m=new Intent(Id_Activity.this, N18_Activity.class);
					startActivity(m);
					break;
					
				case "1402119" :
					Intent n=new Intent(Id_Activity.this, N19_Activity.class);
					startActivity(n);
					break;
					
				case "1402120" :
					Intent o=new Intent(Id_Activity.this, N20_Activity.class);
					startActivity(o);
					break;
					
				case "1402121" :
					Intent p=new Intent(Id_Activity.this, N21_Activity.class);
					startActivity(p);
					break;
					
				case "1402122" :
					Intent q=new Intent(Id_Activity.this, N22_Activity.class);
					startActivity(q);
					break;
					
				case "1402124" :
					Intent r=new Intent(Id_Activity.this, N24_Activity.class);
					startActivity(r);
					break;
					
				case "1402125" :
					Intent s=new Intent(Id_Activity.this, N25_Activity.class);
					startActivity(s);
					break;
					
				case "1402126" :
					Intent t=new Intent(Id_Activity.this, N26_Activity.class);
					startActivity(t);
					break;
					
				case "1402127" :
					Intent u=new Intent(Id_Activity.this, N27_Activity.class);
					startActivity(u);
					break;
					
				case "1402128" :
					Intent v1=new Intent(Id_Activity.this, N28_Activity.class);
					startActivity(v1);
					break;
					
				case "1402129" :
					Intent w=new Intent(Id_Activity.this, N29_Activity.class);
					startActivity(w);
					break;
					
				case "1402130" :
					Intent x=new Intent(Id_Activity.this, N30_Activity.class);
					startActivity(x);
					break;
					
				case "1402132" :
					Intent y=new Intent(Id_Activity.this, N32_Activity.class);
					startActivity(y);
					break;
					
				case "1402134" :
					Intent z=new Intent(Id_Activity.this, N34_Activity.class);
					startActivity(z);
					break;
					
				case "1402135" :
					Intent aa=new Intent(Id_Activity.this, N35_Activity.class);
					startActivity(aa);
					break;
					
				case "1402136" :
					Intent ab=new Intent(Id_Activity.this, N36_Activity.class);
					startActivity(ab);
					break;
					
				case "1402137" :
					Intent ac=new Intent(Id_Activity.this, N37_Activity.class);
					startActivity(ac);
					break;
					
				case "1402138" :
					Intent ad=new Intent(Id_Activity.this, N38_Activity.class);
					startActivity(ad);
					break;
					
				case "1402139" :
					Intent ae=new Intent(Id_Activity.this, N39_Activity.class);
					startActivity(ae);
					break;
					
				case "1402140" :
					Intent Mrinal=new Intent(Id_Activity.this, N40_Activity.class);
					startActivity(Mrinal);
					break;
					
				case "1402142" :
					Intent af=new Intent(Id_Activity.this, N42_Activity.class);
					startActivity(af);
					break;
					
				case "1402143" :
					Intent ag=new Intent(Id_Activity.this, N43_Activity.class);
					startActivity(ag);
					break;
					
				case "1402144" :
					Intent ah=new Intent(Id_Activity.this, N44_Activity.class);
					startActivity(ah);
					break;
					
				case "1402147" :
					Intent ai=new Intent(Id_Activity.this, N47_Activity.class);
					startActivity(ai);
					break;
					
				case "1402148" :
					Intent aj=new Intent(Id_Activity.this, N48_Activity.class);
					startActivity(aj);
					break;
					
				case "1402149" :
					Intent ak=new Intent(Id_Activity.this, N49_Activity.class);
					startActivity(ak);
					break;
					
				case "1402150" :
					Intent al=new Intent(Id_Activity.this, N50_Activity.class);
					startActivity(al);
					break;
					
				case "1402151" :
					Intent am=new Intent(Id_Activity.this, N51_Activity.class);
					startActivity(am);
					break;
					
				case "1402152" :
					Intent an=new Intent(Id_Activity.this, N52_Activity.class);
					startActivity(an);
					break;
					
				case "1402153" :
					Intent ao=new Intent(Id_Activity.this, N53_Activity.class);
					startActivity(ao);
					break;
					
				case "1402154" :
					Intent ap=new Intent(Id_Activity.this, N54_Activity.class);
					startActivity(ap);
					break;
					
				case "1402155" :
					Intent aq=new Intent(Id_Activity.this, N55_Activity.class);
					startActivity(aq);
					break;
					
				case "1402158" :
					Intent ar=new Intent(Id_Activity.this, N58_Activity.class);
					startActivity(ar);
					break;
					
				case "1402160" :
					Intent as=new Intent(Id_Activity.this, N60_Activity.class);
					startActivity(as);
					break;
					
				case "1402161" :
					Intent at=new Intent(Id_Activity.this, N61_Activity.class);
					startActivity(at);
					break;
					
				case "1402162" :
					Intent au=new Intent(Id_Activity.this, N62_Activity.class);
					startActivity(au);
					break;
					
				case "1402163" :
					Intent av=new Intent(Id_Activity.this, N63_Activity.class);
					startActivity(av);
					break;
					
				case "1402164" :
					Intent aw=new Intent(Id_Activity.this, N64_Activity.class);
					startActivity(aw);
					break;
					
				case "1402165" :
					Intent ax=new Intent(Id_Activity.this, N65_Activity.class);
					startActivity(ax);
					break;
					
				case "1402166" :
					Intent ay=new Intent(Id_Activity.this, N66_Activity.class);
					startActivity(ay);
					break;
					
				case "1402168" :
					Intent az=new Intent(Id_Activity.this, N68_Activity.class);
					startActivity(az);
					break;
					
				case "1402170" :
					Intent aaa=new Intent(Id_Activity.this, N70_Activity.class);
					startActivity(aaa);
					break;
					
				case "1402171" :
					Intent bb=new Intent(Id_Activity.this, N71_Activity.class);
					startActivity(bb);
					break;
					
				case "1402172" :
					Intent cc=new Intent(Id_Activity.this, N72_Activity.class);
					startActivity(cc);
					break;
					
				case "1402173" :
					Intent dd=new Intent(Id_Activity.this, N73_Activity.class);
					startActivity(dd);
					break;
					
				case "1402174" :
					Intent ee=new Intent(Id_Activity.this, N74_Activity.class);
					startActivity(ee);
					break;
					
				case "1402175" :
					Intent ff=new Intent(Id_Activity.this, N75_Activity.class);
					startActivity(ff);
					break;
					
				case "1402176" :
					Intent gg=new Intent(Id_Activity.this, N76_Activity.class);
					startActivity(gg);
					break;
					
				case "1402178" :
					Intent hh=new Intent(Id_Activity.this, N78_Activity.class);
					startActivity(hh);
					break;
					
				case "1302082" :
					Intent ii=new Intent(Id_Activity.this, R82_Activity.class);
					startActivity(ii);
					break;
					
				case "1302085" :
					Intent jj=new Intent(Id_Activity.this, R85_Activity.class);
					startActivity(jj);
					break;
					
				case "1302089" :
					Intent kk=new Intent(Id_Activity.this, R89_Activity.class);
					startActivity(kk);
					break;
					
				case "1302095" :
					Intent ll=new Intent(Id_Activity.this, R95_Activity.class);
					startActivity(ll);
					break;
					
				case "1302102" :
					Intent mm=new Intent(Id_Activity.this, R02_Activity.class);
					startActivity(mm);
					break;
					
				case "1302103" :
					Intent nn=new Intent(Id_Activity.this, R03_Activity.class);
					startActivity(nn);
					break;
					
				case "1302105" :
					Intent oo=new Intent(Id_Activity.this, R05_Activity.class);
					startActivity(oo);
					break;
					
				case "1302108" :
					Intent pp=new Intent(Id_Activity.this, R08_Activity.class);
					startActivity(pp);
					break;
					
				case "1302111" :
					Intent qq=new Intent(Id_Activity.this, R11_Activity.class);
					startActivity(qq);
					break;
					
				case "1302116" :
					Intent rr=new Intent(Id_Activity.this, R16_Activity.class);
					startActivity(rr);
					break;
					
				case "1302121" :
					Intent ss=new Intent(Id_Activity.this, R21_Activity.class);
					startActivity(ss);
					break;
					
				case "1302123" :
					Intent tt=new Intent(Id_Activity.this, R23_Activity.class);
					startActivity(tt);
					break;
					
				
					
					
					
					default :
						Toast.makeText(getBaseContext(), "Wrong input..!!", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		
		
		
		
		develop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent am=new Intent(Id_Activity.this, DeveloperActivity.class);
				startActivity(am);
			}
		});
		
		
		
		aboutapp=(Button) findViewById(R.id.aboutApp);
		aboutapp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent b=new Intent(Id_Activity.this, About_App_Activity.class);
				startActivity(b);
				
			}
		});
		
		
		spin=(Spinner) findViewById(R.id.spinner);
		select=getResources().getStringArray(R.array.seletion);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, select);	
		spin.setAdapter(adapter);
		spin.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				index=arg0.getSelectedItemPosition();
				switch(index){
				case 1:
					Intent n=new Intent(Id_Activity.this, Id_Activity.class);
					startActivity(n);
					break;
				case 2:
					Intent m=new Intent(Id_Activity.this, Name_Activity.class);
					startActivity(m);
					break;
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
		
		
		
	}
}
