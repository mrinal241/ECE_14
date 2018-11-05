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

public class Name_Activity extends Activity {
	Button develop, aboutapp, list, search;
	String[] select;
	EditText nedit;
	Spinner spin;
	String namedt,id;
	int index;
	MediaPlayer mp,mp3;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_name_);
		
		mp=MediaPlayer.create(this, R.raw.snd);
		mp3=MediaPlayer.create(this, R.raw.sn);
		list=(Button) findViewById(R.id.list_btn);
		search=(Button) findViewById(R.id.name_search);
		nedit=(EditText) findViewById(R.id.name_edit);
		develop=(Button) findViewById(R.id.developer);
		
		list.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent list=new Intent(Name_Activity.this, ListActivity.class);
				startActivity(list);
				
			}
		});
		
		
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp.start();
			 id=nedit.getText().toString();
			 switch(id){
			 case "Mrinal" :
				 Intent mkr=new Intent(Name_Activity.this, N40_Activity.class);
				 startActivity(mkr);
				 break;
				 
				 
				 
				 
				 
			 case "1402102" : 
			 case "Ayon" :
			 case "ayon" :
			 case "ion" :
			 case "Ion" :
					Intent a=new Intent(Name_Activity.this, N02_Activity.class);
					startActivity(a);
					break;
					
			 case "tanmoy" :
			 case "tonmoy" :
			 case "Tanmay" :
			 case "tanmay" :
			 case "1402103" : 
				case "Tanmoy" :
					Intent b=new Intent(Name_Activity.this, N03_Activity.class);
					startActivity(b);
					break;
					
				case "Khayrul" :
				case "1402104" : 
				case "khayrul" :
				case "KHAYRUL" :
				
					
					
					Intent c=new Intent(Name_Activity.this, N04_Activity.class);
					startActivity(c);
					break;
					
				case "Anamika" :
				case "anamika" :
				case "ANAMIKA" :
				case "onamika" : 
				case "1402105" : 
				case "Onamika" :
					
					Intent d=new Intent(Name_Activity.this, N05_Activity.class);
					startActivity(d);
					break;
					
				case "siraj" :
				case "1402107" : 
				case "Siraj" :
				case "Shiraj" :
				case "SHIRAJ" :
				case "SIRAJ" :
					
					
					
					Intent e=new Intent(Name_Activity.this, N07_Activity.class);
					startActivity(e);
					break;
					
				case "Rubi" :
				case "1402108" : 
				case "rubi" :
				case "RUBI" :
					
					Intent f=new Intent(Name_Activity.this, N08_Activity.class);
					startActivity(f);
					break;
					
				case "Nahid" :
				case "1402109" :
				case "moni" : 
				case "nahid" :
				case "NAHID" :
					
					Intent g=new Intent(Name_Activity.this, N09_Activity.class);
					startActivity(g);
					break;
					
				case "Ridita" :
				case "1402110" : 
				case "ridita" :
				case "ridi" :
				case "Ridi" :
				case "RIDITA" :
					
					
					Intent h=new Intent(Name_Activity.this, N10_Activity.class);
					startActivity(h);
					break;
					
				case "Himika" :
				case "1402111" : 
				case "himika" :
				case "himi" :
				case "Himi" :
					
					
					Intent i=new Intent(Name_Activity.this, N11_Activity.class);
					startActivity(i);
					break;
					
				case "Mehenur" :
				case "1402115" : 
				case "mehenur" :
				case "MEHENUR" :
					
					Intent j=new Intent(Name_Activity.this, N15_Activity.class);
					startActivity(j);
					break;
					
				case "Asif" :
				case "1402116" : 
				case "ASIF" :
				case "asif" :
					
					Intent k=new Intent(Name_Activity.this, N16_Activity.class);
					startActivity(k);
					break;
					
				case "Jakaria" :
				case "1402117" : 
				case "zakariya" :
				case "Zakaria" :
				case "zakaria" :
				case "jakaria" :
					
					
					Intent l=new Intent(Name_Activity.this, N17_Activity.class);
					startActivity(l);
					break;
					
				case "Saikat" :
				case "1402118" : 
				case "saikat" :
				case "SAIKAT" :
					
					Intent m=new Intent(Name_Activity.this, N18_Activity.class);
					startActivity(m);
					break;
					
				case "Rumman" :
				case "rumman" :
				case "RUMMAN" :
				case "1402119" : 
					
					
					Intent n=new Intent(Name_Activity.this, N19_Activity.class);
					startActivity(n);
					break;
					
				case "Johny" :
				case "1402120" : 
				case "johny" :
				case "joni" :
				case "JOHNY" :
					
					Intent o=new Intent(Name_Activity.this, N20_Activity.class);
					startActivity(o);
					break;
					
				case "Mostaque" :
				case "1402121" : 
				case "mostaque" :
				case "mostak" :
				case "Mostak" :
					
					
					Intent p=new Intent(Name_Activity.this, N21_Activity.class);
					startActivity(p);
					break;
					
				case "Arman" :
				case "1402122" : 
				case "arman" :
				case "ARMAN" :
					
					Intent q=new Intent(Name_Activity.this, N22_Activity.class);
					startActivity(q);
					break;
					
				case "Shahriar" :
				case "1402124" : 
				case "SHAHRIAR" :
				case "shahriar" :
				case "sahriar" :
					
					Intent r=new Intent(Name_Activity.this, N24_Activity.class);
					startActivity(r);
					break;
					
				case "Payel" :
				case "1402125" : 
				case "payel" :
				case "PAYEL" :
					
					Intent s=new Intent(Name_Activity.this, N25_Activity.class);
					startActivity(s);
					break;
					
				case "Hasi" :
				case "1402126" : 
				case "hasi" :
				case "HASI" :
					
					Intent t=new Intent(Name_Activity.this, N26_Activity.class);
					startActivity(t);
					break;
					
				case "Fahmid" :
				case "fahmid" :
				case "1402127" : 
				case "FAHMID" :
					
					Intent u=new Intent(Name_Activity.this, N27_Activity.class);
					startActivity(u);
					break;
					
				case "Shibli" :
				case "sibli" :
				case "shelee" :
				case "shiblee":
				case "Sheblee" :
				case "1402128" : 
					
					Intent v1=new Intent(Name_Activity.this, N28_Activity.class);
					startActivity(v1);
					break;
					
				case "Ayat" :
				case "Ayatullah" :
				case "1402129" : 
				case "ayatullah" :
				case "ayat" :
				case "sumon" :
					
					Intent w=new Intent(Name_Activity.this, N29_Activity.class);
					startActivity(w);
					break;
					
				case "Joyonto" :
				case "joyonto" :
				case "jayanta" :
				case "Jayanta" :
				case "1402130" : 
					
					
					Intent x=new Intent(Name_Activity.this, N30_Activity.class);
					startActivity(x);
					break;
					
				case "Nuralam" :
				case "nuralam" :
				case "nur alom" :
				case "Nur Alom" :
				case "1402132" : 
					
					Intent y=new Intent(Name_Activity.this, N32_Activity.class);
					startActivity(y);
					break;
					
				case "Lumi" :
				case "lumi" :
				case "lumia" :
				case "LUMI" :
				case "1402134" : 
					
					Intent z=new Intent(Name_Activity.this, N34_Activity.class);
					startActivity(z);
					break;
					
				case "Jiad" :
				case "JIAD" :
				case "jiad" :
				case "1402135" : 
					
					Intent aa=new Intent(Name_Activity.this, N35_Activity.class);
					startActivity(aa);
					break;
					
				case "Shimul" :
				case "simul" :
				case "shimul" :
				case "SHIMUL" :
				case "1402136" : 
					
					
					
					Intent ab=new Intent(Name_Activity.this, N36_Activity.class);
					startActivity(ab);
					break;
					
				case "Saiful" :
				case "SAIFUL" :
				case "saiful" :
				case "1402137" : 
					
					Intent ac=new Intent(Name_Activity.this, N37_Activity.class);
					startActivity(ac);
					break;
					
				case "Taposi" :
				case "mou" :
				case "taposi" :
				case "TAPOSI" :
				case "1402138" : 
					
					Intent ad=new Intent(Name_Activity.this, N38_Activity.class);
					startActivity(ad);
					break;
					
				case "Tuhin" :
				case "tuhin" :
				case "TUHIN" :
				case "1402139" : 
					
					Intent ae=new Intent(Name_Activity.this, N39_Activity.class);
					startActivity(ae);
					break;
					
				case "mrinal" :
				case "MRINAL" :
				case "kanti" :
				case "1402140" : 
				case "minu" : 
				case "kartik" : 
				case "Kanti" :
					
					
					Intent Mrinal=new Intent(Name_Activity.this, N40_Activity.class);
					startActivity(Mrinal);
					break;
					
				case "Ripon" :
				case "ripon" :
				case "RIPON" :
				case "1402142" : 
					
					Intent af=new Intent(Name_Activity.this, N42_Activity.class);
					startActivity(af);
					break;
					
				case "Suruj" :
				case "suruj" :
				case "SURUJ" :
				case "1402143" : 
					
					Intent ag=new Intent(Name_Activity.this, N43_Activity.class);
					startActivity(ag);
					break;
					
				case "Dipu" :
				case "DIPU" :
				case "dipu" :
				case "1402144" : 
					
					Intent ah=new Intent(Name_Activity.this, N44_Activity.class);
					startActivity(ah);
					break;
					
				case "Raju" :
				case "raju" :
				case "RAJU" :
				case "1402147" : 
					Intent ai=new Intent(Name_Activity.this, N47_Activity.class);
					startActivity(ai);
					break;
					
				case "Sumi" :
				case "sumi" :
				case "SUMI" :
				case "1402148" : 
					Intent aj=new Intent(Name_Activity.this, N48_Activity.class);
					startActivity(aj);
					break;
					
				case "Anarul" :
				case "anarul" :
				case "ANARUL" :
				case "1402149" : 
					
					Intent ak=new Intent(Name_Activity.this, N49_Activity.class);
					startActivity(ak);
					break;
					
				case "Rakhi" :
				case "rakhi" :
				case "punomi" :
				case "rani" :
				case "RAKHI" :
				case "1402150" : 
					
					
					
					
					
					Intent al=new Intent(Name_Activity.this, N50_Activity.class);
					startActivity(al);
					break;
					
				case "Arif" :
				case "arif" :
				case "ARIF" :
				case "1402151" : 
					Intent am=new Intent(Name_Activity.this, N51_Activity.class);
					startActivity(am);
					break;
					
				case "Noyon" :
				case "NOYON" :
				case "noyon" :
				case "Nayan" :
				case "nayan" :
				case "1402152" : 
					
					Intent an=new Intent(Name_Activity.this, N52_Activity.class);
					startActivity(an);
					break;
					
				case "Shaon" :
				case "shaon" :
				case "SHAON" :
				case "1402153" : 
					
					Intent ao=new Intent(Name_Activity.this, N53_Activity.class);
					startActivity(ao);
					break;
					
				case "Shorno" :
				case "sorno" :
				case "shorno" :
				case "SHORNO" :
				case "gold" :
				case "1402154" : 
					
					Intent ap=new Intent(Name_Activity.this, N54_Activity.class);
					startActivity(ap);
					break;
					
				case "Erom" :
				case "erom" :
				case "1402155" : 
				case "EROM" :
					
					Intent aq=new Intent(Name_Activity.this, N55_Activity.class);
					startActivity(aq);
					break;
					
				case "Anis" :
				case "1402158" : 
				case "ANIS" :
				case "anis" :
				case "anisur" :
					
					
					Intent ar=new Intent(Name_Activity.this, N58_Activity.class);
					startActivity(ar);
					break;
					
				case "Ariful" :
				case "ariful" :
				case "afif2" :
				case "1402160" : 
					Intent as=new Intent(Name_Activity.this, N60_Activity.class);
					startActivity(as);
					break;
					
				case "Ruma" :
				case "ruma" :
				case "RUMA" :
				case "rahima" :
				case "1402161" : 
					
					Intent at=new Intent(Name_Activity.this, N61_Activity.class);
					startActivity(at);
					break;
					
				case "Salekin" :
				case "salekin" :
				case "1402162" : 
				case "SALEKIN" :
					
					Intent au=new Intent(Name_Activity.this, N62_Activity.class);
					startActivity(au);
					break;
					
				case "Sabbir" :
				case "sabbir" :
				case "1402163" : 
				case "SABBIR" :
					
					Intent av=new Intent(Name_Activity.this, N63_Activity.class);
					startActivity(av);
					break;
					
				case "Sohan" :
				case "SOHAN" :
				case "sohan" :
				case "1402164" : 
					
					
					Intent aw=new Intent(Name_Activity.this, N64_Activity.class);
					startActivity(aw);
					break;
					
				case "Jharna" :
				case "jhorna" :
				case "jharna" :
				case "JHARNA" :
				case "1402165" : 
				case "Jhorna" :
					
					
					Intent ax=new Intent(Name_Activity.this, N65_Activity.class);
					startActivity(ax);
					break;
					
				case "Arafat" :
				case "1402166" : 
				case "bidyut" :
				case "arfat" :
				case "ARAFAT" :
					
					Intent ay=new Intent(Name_Activity.this, N66_Activity.class);
					startActivity(ay);
					break;
					
				case "Sadia" :
				case "sadia" :
				case "1402168" : 
				case "SADIA" :
					
					Intent az=new Intent(Name_Activity.this, N68_Activity.class);
					startActivity(az);
					break;
					
				case "Rakib" :
				case "rakibul" :
				case "1402170" : 
				case "rakib" :
				case "RAKIB" :
					
					Intent aaa=new Intent(Name_Activity.this, N70_Activity.class);
					startActivity(aaa);
					break;
					
				case "Mamun" :
				case "MAMUN" :
				case "1402171" : 
				case "mamun" :
				
					
					Intent bb=new Intent(Name_Activity.this, N71_Activity.class);
					startActivity(bb);
					break;
					
				case "Subhas" :
				case "1402172" : 
				case "subhas" :
				case "suvas" :
				case "SHUBHAS" :
					
					Intent cc=new Intent(Name_Activity.this, N72_Activity.class);
					startActivity(cc);
					break;
					
				case "Jinia" :
				case "1402173" : 
				case "JINIA" :
				case "jinia" :
					
					Intent dd=new Intent(Name_Activity.this, N73_Activity.class);
					startActivity(dd);
					break;
					
				case "Tasfia" :
				case "tasfia" :
				case "tasfi" :
				case "TASFIA" :
				case "1402174" : 
					Intent ee=new Intent(Name_Activity.this, N74_Activity.class);
					startActivity(ee);
					break;
					
				case "Sithi" :
				case "sithy" :
				case "sithi" :
				case "shithi" :
				case "SHITHY" :
					
				case "1402175" : 
					Intent ff=new Intent(Name_Activity.this, N75_Activity.class);
					startActivity(ff);
					break;
					
				case "Protasha" :
				case "PROTASHA" :
				case "prottasha" :
				case "protasha" :
				case "1402176" : 
					
					Intent gg=new Intent(Name_Activity.this, N76_Activity.class);
					startActivity(gg);
					break;
					
				case "Giti" :
				case "gity" :
				case "giti" :
				case "Gity" :
				case "GITY" :
				case "1402178" : 
					
					
					Intent hh=new Intent(Name_Activity.this, N78_Activity.class);
					startActivity(hh);
					break;
					
				case "Didarul" :
				case "DIDARUL" :
				case "didarul" :
					
				case "1302082" : 
					Intent ii=new Intent(Name_Activity.this, R82_Activity.class);
					startActivity(ii);
					break;
				case "1302084" : 
				case "Anuva" : 
				case "onubha" : 
				case "anuva" : 
				case "onuva" : 
				case "ANUVA" : 
					Intent iik=new Intent(Name_Activity.this, R84_Activity.class);
					startActivity(iik);
					break;
					
				case "Monira" :
				case "monira" :
				case "munira" :
				case "Munira" :
				case "MONIRA" :
				case "1302085" : 
					
					Intent jj=new Intent(Name_Activity.this, R85_Activity.class);
					startActivity(jj);
					break;
					
				case "Emu" :
				case "emu" :
				case "imu" :
				case "EMU" :
				case "1302089" : 
					Intent kk=new Intent(Name_Activity.this, R89_Activity.class);
					startActivity(kk);
					break;
					
				case "Rubel" :
				case "RUBEL" :
				case "rubel" :
				case "1302095" : 
									
					Intent ll=new Intent(Name_Activity.this, R95_Activity.class);
					startActivity(ll);
					break;
					
				case "Sourav" :
				case "sourav" :
				case "saurav" :
				case "SOURAV" :
				case "1302102" : 
					Intent mm=new Intent(Name_Activity.this, R02_Activity.class);
					startActivity(mm);
					break;
					
				case "Arshi" :
				case "arshi" :
				case "ARSHI" :
				case "1302103" : 
					Intent nn=new Intent(Name_Activity.this, R03_Activity.class);
					startActivity(nn);
					break;
					
				case "Bishnu" :
				case "bisnu" :
				case "BISNU" :
				case "1302105" : 
					Intent oo=new Intent(Name_Activity.this, R05_Activity.class);
					startActivity(oo);
					break;
					
				case "Mahimul" :
				case "mahimul" :
				case "MAHIMUL" :
				case "1302108" : 
					
					Intent pp=new Intent(Name_Activity.this, R08_Activity.class);
					startActivity(pp);
					break;
					
				case "Shimu" :
				case "SHIMU" :
				case "shimu" :
				case "simu" :
				case "1302111" : 
					Intent qq=new Intent(Name_Activity.this, R11_Activity.class);
					startActivity(qq);
					break;
					
				case "Enoy" :
				case "enoy" :
				case "ENOY" :
				case "1302116" : 
					Intent rr=new Intent(Name_Activity.this, R16_Activity.class);
					startActivity(rr);
					break;
					
				case "Jinna" :
				case "JINNA" :
				case "Jnnatun" :
				case "jinnatun" :
				case "jinna" :
				case "1302121" : 
					
					
					
					Intent ss=new Intent(Name_Activity.this, R21_Activity.class);
					startActivity(ss);
					break;
					
				case "Harunor" :
				case "harun" :
				case "1302123" : 
				case "Harun" :
				case "harunor" :

					Intent tt=new Intent(Name_Activity.this, R23_Activity.class);
					startActivity(tt);
					break;
					
				
					
					
					
					default :
						Toast.makeText(getBaseContext(), "Wrong spelling..!! Plz, check again.", Toast.LENGTH_SHORT).show();
		
				 
				 
				 
				 
			 }
			}
		});
		
		
		
		develop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			mp3.start();
			Intent a=new Intent(Name_Activity.this, DeveloperActivity.class);
			startActivity(a);
			
			}
		});
		
		
		aboutapp=(Button) findViewById(R.id.aboutApp);
		
		aboutapp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent b=new Intent(Name_Activity.this, About_App_Activity.class);
				startActivity(b);
				
			}
		});
		
		
		
		spin=(Spinner) findViewById(R.id.spinner);
		select=getResources().getStringArray(R.array.seletion);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,select);
		spin.setAdapter(adapter);
		spin.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				
				
				index=arg0.getSelectedItemPosition();
				switch(index){
				case 1:
					Intent n=new Intent(Name_Activity.this, Id_Activity.class);
					startActivity(n);
				case 2:
					Intent m=new Intent(Name_Activity.this, Name_Activity.class);
					startActivity(m);
					
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
