package com.example.learning_japanese;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.learning_japanese_final.R;

public class Practice extends Activity {
	Spinner JPN;
	TextView ttt;
	ImageButton a;
	ImageButton b;
	ImageButton c;
	ImageButton d;
	ImageButton e;
	MediaPlayer mp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.practice);
		findViews();
	}

	private void findViews() {
		JPN=(Spinner) findViewById(R.id.JPNspin);
		a = (ImageButton) findViewById(R.id.B1);
		b = (ImageButton) findViewById(R.id.B2);
		c = (ImageButton) findViewById(R.id.B3);
		d = (ImageButton) findViewById(R.id.B4);
		e = (ImageButton) findViewById(R.id.B5);
		ttt = (TextView) findViewById(R.id.textView1);
		JPN.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				switch (arg2) {
				case 0:
					a.setImageResource(R.drawable.jap_a);
					a.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.a);
							mp.start();
						}
					});
					b.setImageResource(R.drawable.jap_i);
					b.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.i);
							mp.start();
						}
					});
					c.setImageResource(R.drawable.jap_u);
					c.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.u);
							mp.start();
						}
					});
					d.setImageResource(R.drawable.jap_e);
					d.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.e);
							mp.start();
						}
					});
					e.setImageResource(R.drawable.jap_o);
					e.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
					

							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.o);
							mp.start();
						}
					});
					break;
				case 1:
					a.setImageResource(R.drawable.jap_ka);
					a.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ka);
							mp.start();
						}
					});
					b.setImageResource(R.drawable.jap_ki);
					b.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ki);
							mp.start();
						}
					});
					c.setImageResource(R.drawable.jap_ku);
					c.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ku);
							mp.start();
						}
					});
					d.setImageResource(R.drawable.jap_ke);
					d.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ke);
							mp.start();
						}
					});
					e.setImageResource(R.drawable.jap_ko);
					e.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ko);
							mp.start();
						}
					});
					break;
				case 2:
					a.setImageResource(R.drawable.jap_sa);
					a.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.sa);
							mp.start();
						}
					});
					b.setImageResource(R.drawable.jap_shi);
					b.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.shi);
							mp.start();
						}
					});
					c.setImageResource(R.drawable.jap_su);
					c.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.su);
							mp.start();
						}
					});
					d.setImageResource(R.drawable.jap_se);
					d.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.se);
							mp.start();
						}
					});
					e.setImageResource(R.drawable.jap_so);
					e.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.so);
							mp.start();
						}
					});
					break;
				case 3:
					a.setImageResource(R.drawable.jap_ta);
					a.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ta);
							mp.start();
						}
					});
					b.setImageResource(R.drawable.jap_chi);
					b.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.chi);
							mp.start();
						}
					});
					c.setImageResource(R.drawable.jap_tsu);
					c.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.tsu);
							mp.start();
						}
					});
					d.setImageResource(R.drawable.jap_te);
					d.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.te);
							mp.start();
						}
					});
					e.setImageResource(R.drawable.jap_to);
					e.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.to);
							mp.start();
						}
					});
					break;
				case 4:
					a.setImageResource(R.drawable.jap_na);
					a.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.na);
							mp.start();
						}
					});
					b.setImageResource(R.drawable.jap_ni);
					b.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ni);
							mp.start();
						}
					});
					c.setImageResource(R.drawable.jap_nu);
					c.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.nu);
							mp.start();
						}
					});
					d.setImageResource(R.drawable.jap_ne);
					d.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ne);
							mp.start();
						}
					});
					e.setImageResource(R.drawable.jap_no);
					e.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.no);
							mp.start();
						}
					});
					break;
				case 5:
					a.setImageResource(R.drawable.jap_ha);
					a.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ha);
							mp.start();
						}
					});
					b.setImageResource(R.drawable.jap_hi);
					b.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.hi);
							mp.start();
						}
					});
					c.setImageResource(R.drawable.jap_hu);
					c.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.hu);
							mp.start();
						}
					});
					d.setImageResource(R.drawable.jap_he);
					d.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.he);
							mp.start();
						}
					});
					e.setImageResource(R.drawable.jap_ho);
					e.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ho);
							mp.start();
						}
					});
					break;
				case 6:
					a.setImageResource(R.drawable.jap_ma);
					a.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ma);
							mp.start();
						}
					});
					b.setImageResource(R.drawable.jap_mi);
					b.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.mi);
							mp.start();
						}
					});
					c.setImageResource(R.drawable.jap_mu);
					c.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.mu);
							mp.start();
						}
					});
					d.setImageResource(R.drawable.jap_me);
					d.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.me);
							mp.start();
						}
					});
					e.setImageResource(R.drawable.jap_mo);
					e.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.mo);
							mp.start();
						}
					});
					break;
				case 7:
					a.setImageResource(R.drawable.jap_ya);
					a.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ya);
							mp.start();
						}
					});
					b.setImageResource(R.drawable.white);

					c.setImageResource(R.drawable.jap_yu);
					c.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.yu);
							mp.start();
						}
					});
					d.setImageResource(R.drawable.white);
					e.setImageResource(R.drawable.jap_yo);
					e.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.yo);
							mp.start();
						}
					});
					break;
				case 8:
					a.setImageResource(R.drawable.jap_ra);
					a.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ra);
							mp.start();
						}
					});
					b.setImageResource(R.drawable.jap_ri);
					b.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ri);
							mp.start();
						}
					});
					c.setImageResource(R.drawable.jap_ru);
					c.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ru);
							mp.start();
						}
					});
					d.setImageResource(R.drawable.jap_re);
					d.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.re);
							mp.start();
						}
					});
					e.setImageResource(R.drawable.jap_ro);
					e.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.ro);
							mp.start();
						}
					});
					break;
				case 9:
					a.setImageResource(R.drawable.jap_wa);
					a.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.wa);
							mp.start();
						}
					});
					b.setImageResource(R.drawable.white);

					c.setImageResource(R.drawable.jap_wo);
					c.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.wo);
							mp.start();
						}
					});
					d.setImageResource(R.drawable.white);
					e.setImageResource(R.drawable.jap_n);
					e.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.n);
							mp.start();
						}
					});
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

				Toast.makeText(arg0.getContext(), "Nothing Selected!",
						Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
