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

public class ListActivity extends Activity {
	Button a02,a03,a04,a05,a07,a08,a09,a10,a11,a15,a16,a17,a18,a19,a20,a21,a22,a24,a25,a26,a27,a28,a29,a30,a32,a34,a35,a36,a37,a38,a39,a40,a42,a43,a44,a47,a48,a49,a50,a51,a52,a53,a54,a55,a58,a60,a61,a62,a63,a64,a65,a66,a68,a70,a71,a72,a73,a74,a75,a76,a78,b82,b85,b89,b84,b95,b02,b03,b05,b08,b11,b16,b21,b23;
   MediaPlayer mp,mp3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		
		mp=MediaPlayer.create(this, R.raw.sn);
		mp3=MediaPlayer.create(this, R.raw.snd);
		
		a02=(Button) findViewById(R.id.n02);
		a03=(Button) findViewById(R.id.n03);
		a04=(Button) findViewById(R.id.n04);
		a05=(Button) findViewById(R.id.n05);
		a07=(Button) findViewById(R.id.n07);
		a08=(Button) findViewById(R.id.n08);
		a09=(Button) findViewById(R.id.n09);
		a10=(Button) findViewById(R.id.n10);
		a11=(Button) findViewById(R.id.n11);
		a15=(Button) findViewById(R.id.n15);
		a16=(Button) findViewById(R.id.n16);
		a17=(Button) findViewById(R.id.n17);
		a18=(Button) findViewById(R.id.n18);
		a19=(Button) findViewById(R.id.n19);
		a20=(Button) findViewById(R.id.n20);
		a21=(Button) findViewById(R.id.n21);
		a22=(Button) findViewById(R.id.n22);
		a24=(Button) findViewById(R.id.n24);
		a25=(Button) findViewById(R.id.n25);
		a26=(Button) findViewById(R.id.n26);
		a27=(Button) findViewById(R.id.n27);
		a28=(Button) findViewById(R.id.n28);
		a29=(Button) findViewById(R.id.n29);
		a30=(Button) findViewById(R.id.n30);
		a32=(Button) findViewById(R.id.n32);
		a34=(Button) findViewById(R.id.n34);
		a35=(Button) findViewById(R.id.n35);
		a36=(Button) findViewById(R.id.n36);
		a37=(Button) findViewById(R.id.n37);
		a38=(Button) findViewById(R.id.n38);
		a39=(Button) findViewById(R.id.n39);
		a40=(Button) findViewById(R.id.n40);
		a42=(Button) findViewById(R.id.n42);
		a43=(Button) findViewById(R.id.n43);
		a44=(Button) findViewById(R.id.n44);
		a47=(Button) findViewById(R.id.n47);
		a48=(Button) findViewById(R.id.n48);
		a49=(Button) findViewById(R.id.n49);
		a50=(Button) findViewById(R.id.n50);
		a51=(Button) findViewById(R.id.n51);
		a52=(Button) findViewById(R.id.n52);
		a53=(Button) findViewById(R.id.n53);
		a54=(Button) findViewById(R.id.n54);
		a55=(Button) findViewById(R.id.n55);
		a58=(Button) findViewById(R.id.n58);
		a60=(Button) findViewById(R.id.n60);
		a61=(Button) findViewById(R.id.n61);
		a62=(Button) findViewById(R.id.n62);
		a63=(Button) findViewById(R.id.n63);
		a64=(Button) findViewById(R.id.n64);
		a65=(Button) findViewById(R.id.n65);
		a66=(Button) findViewById(R.id.n66);
		a68=(Button) findViewById(R.id.n68);
		a70=(Button) findViewById(R.id.n70);
		a71=(Button) findViewById(R.id.n71);
		a72=(Button) findViewById(R.id.n72);
		a73=(Button) findViewById(R.id.n73);
		a74=(Button) findViewById(R.id.n74);
		a75=(Button) findViewById(R.id.n75);
		a76=(Button) findViewById(R.id.n76);
		a78=(Button) findViewById(R.id.n78);
		
		b02=(Button) findViewById(R.id.r02);
		b03=(Button) findViewById(R.id.r03);
		b05=(Button) findViewById(R.id.r05);
		b08=(Button) findViewById(R.id.r08);
		b11=(Button) findViewById(R.id.r11);
		b16=(Button) findViewById(R.id.r16);
		b21=(Button) findViewById(R.id.r21);
		b23=(Button) findViewById(R.id.r23);
		b82=(Button) findViewById(R.id.r82);
		b84=(Button) findViewById(R.id.r84);
		b85=(Button) findViewById(R.id.r85);
		b89=(Button) findViewById(R.id.r89);
		b95=(Button) findViewById(R.id.r95);

a02.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a2=new Intent(ListActivity.this, N02_Activity.class);
				startActivity(a2);
				
				}
		});
		
		a03.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a3=new Intent(ListActivity.this, N03_Activity.class);
				startActivity(a3);
							}
		});
		
		
		a04.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a4=new Intent(ListActivity.this, N04_Activity.class);
				startActivity(a4);
				
			}
		});
		
		a05.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a5=new Intent(ListActivity.this, N05_Activity.class);
				startActivity(a5);
				
			}
		});
		
	a07.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			mp3.start();
			Intent a7=new Intent(ListActivity.this, N07_Activity.class);
			startActivity(a7);
				
		}
	});
		
		
a08.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a8=new Intent(ListActivity.this, N08_Activity.class);
		startActivity(a8);
		
	}
});
		
		
		
		a09.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a9=new Intent(ListActivity.this, N09_Activity.class);
				startActivity(a9);
				
			}
		});
		
		
		a10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a10=new Intent(ListActivity.this, N10_Activity.class);
				startActivity(a10);
				
			}
		});
		
		a11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a11=new Intent(ListActivity.this, N11_Activity.class);
				startActivity(a11);
				
			}
		});
		
		a15.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a15=new Intent(ListActivity.this, N15_Activity.class);
				startActivity(a15);
				
			}
		});
		
		a16.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a=new Intent(ListActivity.this, N16_Activity.class);
				startActivity(a);
				
			}
		});
		
		
		a17.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a=new Intent(ListActivity.this, N17_Activity.class);
				startActivity(a);
				
			}
		});
		
		a18.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a=new Intent(ListActivity.this, N18_Activity.class);
				startActivity(a);
				
			}
		});
		
		a19.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a19=new Intent(ListActivity.this, N19_Activity.class);
				startActivity(a19);
				
			}
		});
		
		a20.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a20=new Intent(ListActivity.this, N20_Activity.class);
				startActivity(a20);
				
			}
		});
		
		a21.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a21=new Intent(ListActivity.this, N21_Activity.class);
				startActivity(a21);
				
			}
		});
		
		a22.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a22=new Intent(ListActivity.this, N22_Activity.class);
				startActivity(a22);
				
			}
		});
		
		a24.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a24=new Intent(ListActivity.this, N24_Activity.class);
				startActivity(a24);
				
			}
		});
		
		a25.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a25=new Intent(ListActivity.this, N25_Activity.class);
				startActivity(a25);
				
			}
		});
		
		a26.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a26=new Intent(ListActivity.this, N26_Activity.class);
				startActivity(a26);
				
			}
		});
		
		a27.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a27=new Intent(ListActivity.this, N27_Activity.class);
				startActivity(a27);
				
			}
		});
		
		a28.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a28=new Intent(ListActivity.this, N28_Activity.class);
				startActivity(a28);
				
			}
		});
		
		a29.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a29=new Intent(ListActivity.this, N29_Activity.class);
				startActivity(a29);
				
			}
		});
		
		a30.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a30=new Intent(ListActivity.this, N30_Activity.class);
				startActivity(a30);
				
			}
		});
		
		a32.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a32=new Intent(ListActivity.this, N32_Activity.class);
				startActivity(a32);
				
			}
		});
		
		a34.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a34=new Intent(ListActivity.this, N34_Activity.class);
				startActivity(a34);
				
			}
		});
		
		a35.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a35=new Intent(ListActivity.this, N35_Activity.class);
				startActivity(a35);
				
			}
		});
		
		a36.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a36=new Intent(ListActivity.this, N36_Activity.class);
				startActivity(a36);
				
			}
		});
		
		a37.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a37=new Intent(ListActivity.this, N37_Activity.class);
				startActivity(a37);
				
			}
		});
		
		a38.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a38=new Intent(ListActivity.this, N38_Activity.class);
				startActivity(a38);
				
			}
		});
		a39.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a39=new Intent(ListActivity.this, N39_Activity.class);
				startActivity(a39);
				
			}
		});
		
		a40.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a40=new Intent(ListActivity.this, N40_Activity.class);
				startActivity(a40);
				
			}
		});
		
		a42.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a42=new Intent(ListActivity.this, N42_Activity.class);
				startActivity(a42);
				
			}
		});
		
		a43.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a43=new Intent(ListActivity.this, N43_Activity.class);
				startActivity(a43);
				
			}
		});
		
		a44.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a44=new Intent(ListActivity.this, N44_Activity.class);
				startActivity(a44);
				
			}
		});
		
		a47.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a47=new Intent(ListActivity.this, N47_Activity.class);
				startActivity(a47);
				
			}
		});
		
		a48.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a48=new Intent(ListActivity.this, N48_Activity.class);
				startActivity(a48);
				
			}
		});
		
		a49.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a49=new Intent(ListActivity.this, N49_Activity.class);
				startActivity(a49);
				
			}
		});
		a50.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a50=new Intent(ListActivity.this, N50_Activity.class);
				startActivity(a50);
				
			}
		});
		
		a51.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a51=new Intent(ListActivity.this, N51_Activity.class);
				startActivity(a51);
				
			}
		});
		
		a52.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a52=new Intent(ListActivity.this, N52_Activity.class);
				startActivity(a52);
				
			}
		});
		
		a53.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a53=new Intent(ListActivity.this, N53_Activity.class);
				startActivity(a53);
				
			}
		});
		
		a54.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a54=new Intent(ListActivity.this, N54_Activity.class);
				startActivity(a54);
				
			}
		});
		
		a55.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a55=new Intent(ListActivity.this, N55_Activity.class);
				startActivity(a55);
			
			}
		});
		
		a58.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a58=new Intent(ListActivity.this, N58_Activity.class);
				startActivity(a58);
				
			}
		});
		
		a60.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a60=new Intent(ListActivity.this, N60_Activity.class);
				startActivity(a60);
				
			}
		});
		
		a61.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a61=new Intent(ListActivity.this, N61_Activity.class);
				startActivity(a61);
				
			}
		});
		a62.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a62=new Intent(ListActivity.this, N62_Activity.class);
				startActivity(a62);
				
			}
		});
		a63.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a63=new Intent(ListActivity.this, N63_Activity.class);
				startActivity(a63);
				
			}
		});
		
		

a64.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp3.start();
				Intent a64=new Intent(ListActivity.this, N64_Activity.class);
				startActivity(a64);
				
				}
		});
		
		

a65.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a65=new Intent(ListActivity.this, N65_Activity.class);
		startActivity(a65);
		
	}
});

a66.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a66=new Intent(ListActivity.this, N66_Activity.class);
		startActivity(a66);
		
	}
});

a68.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a68=new Intent(ListActivity.this, N68_Activity.class);
		startActivity(a68);
		
	}
});

a70.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a70=new Intent(ListActivity.this, N70_Activity.class);
		startActivity(a70);
		
	}
});
a71.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a71=new Intent(ListActivity.this, N71_Activity.class);
		startActivity(a71);
		
	}
});

a72.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a72=new Intent(ListActivity.this, N72_Activity.class);
		startActivity(a72);
		
	}
});

a73.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a73=new Intent(ListActivity.this, N73_Activity.class);
		startActivity(a73);
		
	}
});

a74.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a74=new Intent(ListActivity.this, N74_Activity.class);
		startActivity(a74);
		
	}
});
a75.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a75=new Intent(ListActivity.this, N75_Activity.class);
		startActivity(a75);
		
	}
});

a76.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a76=new Intent(ListActivity.this, N76_Activity.class);
		startActivity(a76);
		
	}
});

a78.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent a78=new Intent(ListActivity.this, N78_Activity.class);
		startActivity(a78);
		
	}
});

b82.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab82=new Intent(ListActivity.this, R82_Activity.class);
		startActivity(ab82);
		
	}
});

b85.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab85=new Intent(ListActivity.this, R85_Activity.class);
		startActivity(ab85);
		
	}
});

b84.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab84=new Intent(ListActivity.this, R84_Activity.class);
		startActivity(ab84);
		
	}
});

b89.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab89=new Intent(ListActivity.this, R89_Activity.class);
		startActivity(ab89);
		
	}
});

b95.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab95=new Intent(ListActivity.this, R95_Activity.class);
		startActivity(ab95);
		
	}
});

b02.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab02=new Intent(ListActivity.this, R02_Activity.class);
		startActivity(ab02);
		
	}
});

b03.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab03=new Intent(ListActivity.this, R03_Activity.class);
		startActivity(ab03);
		
	}
});
b05.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab05=new Intent(ListActivity.this, R05_Activity.class);
		startActivity(ab05);
		
	}
});
b08.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	mp3.start();
	Intent ab08=new Intent(ListActivity.this, R08_Activity.class);
	startActivity(ab08);
	
}
});
b11.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	mp3.start();
	Intent ab11=new Intent(ListActivity.this, R11_Activity.class);
	startActivity(ab11);
	
}
});
b16.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab16=new Intent(ListActivity.this, R16_Activity.class);
		startActivity(ab16);
		
	}
});
b21.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab21=new Intent(ListActivity.this, R21_Activity.class);
		startActivity(ab21);
		
	}
});
b23.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp3.start();
		Intent ab23=new Intent(ListActivity.this, R23_Activity.class);
		startActivity(ab23);
		
	}
});

		
	}
}
