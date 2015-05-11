package com.example.learning_japanese;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.learning_japanese_final.R;

public class Game2 extends Activity {
	ImageView imgQues;
	ImageButton imgAns1;
	ImageButton imgAns2;
	ImageButton imgAns3;
	Button btnStart;
	TextView textView1;
	MediaPlayer mp;

	int randint = 0;
	int a = 0;
	int b = 0;
	int c = 0;

	int[] ques = { R.drawable.jap_a, R.drawable.jap_i, R.drawable.jap_u,
			R.drawable.jap_e, R.drawable.jap_o, R.drawable.jap_ka,
			R.drawable.jap_ki, R.drawable.jap_ku, R.drawable.jap_ke,
			R.drawable.jap_ko, R.drawable.jap_sa, R.drawable.jap_shi,
			R.drawable.jap_su, R.drawable.jap_se, R.drawable.jap_so,
			R.drawable.jap_ta, R.drawable.jap_chi, R.drawable.jap_tsu,
			R.drawable.jap_te, R.drawable.jap_to, };
	int[] answer = { R.drawable.a2, R.drawable.i2, R.drawable.u2,
			R.drawable.e2, R.drawable.o2 };

	// 程式執行點
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game2);
		findView();
		imgQues.setImageResource(R.drawable.study);
		imgAns1.setEnabled(false);
		imgAns2.setEnabled(false);
		imgAns3.setEnabled(false);

	}

	// 設定題目
	public void setQuestion() {
		randint = (int) (Math.random() * 5);
		a = (int) (Math.random() * 5);
		b = (int) (Math.random() * 5);
		c = (int) (Math.random() * 5);
		checkRandom();
		checkQA();
		imgQues.setImageResource(ques[randint]);
		imgAns1.setImageResource(answer[a]);
		imgAns2.setImageResource(answer[b]);
		imgAns3.setImageResource(answer[c]);
	}

	// 檢查題目與選擇配對

	public void checkQA() {
		while (randint != a && randint != b && randint != c) {
			randint = (int) (Math.random() * 5);
		}
	}

	// 檢查選擇是否重複
	public void checkRandom() {

		while (a == b || b == c || c == a) {
			a = (int) (Math.random() * 5);
			b = (int) (Math.random() * 5);
			c = (int) (Math.random() * 5);

		}

	}

	/*
	 * 停止 public void Stop() { if (count == 10) { textView1.setText("結束");
	 * imgAns1.setEnabled(false); imgAns2.setEnabled(false);
	 * imgAns3.setEnabled(false); } }
	 */

	private void findView() {
		imgQues = (ImageView) findViewById(R.id.imgQest);
		// /////////////////////////////////////////////////////
		imgAns1 = (ImageButton) findViewById(R.id.imgAns1);
		imgAns1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (a == randint) {
					//textView1.setText("O");
					mp = MediaPlayer.create(getApplicationContext(), R.raw.yes);
					mp.start();
					setQuestion();
					checkQA();

				} else {
				
					mp = MediaPlayer.create(getApplicationContext(),
							R.raw.wrong);
					mp.start();
				}

			}
		});

		// /////////////////////////////////////////////////////
		imgAns2 = (ImageButton) findViewById(R.id.imgAns2);
		imgAns2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (b == randint) {
				//	textView1.setText("O");
					mp = MediaPlayer.create(getApplicationContext(), R.raw.yes);
					mp.start();
					setQuestion();
					checkQA();

				} else {
				//	textView1.setText("X");
					mp = MediaPlayer.create(getApplicationContext(),

					R.raw.wrong);
					mp.start();
				}

			}
		});
		// /////////////////////////////////////////////////////
		imgAns3 = (ImageButton) findViewById(R.id.imgAns3);
		imgAns3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (c == randint) {
					//textView1.setText("O");
					mp = MediaPlayer.create(getApplicationContext(), R.raw.yes);
					mp.start();
					setQuestion();
					checkQA();

				} else {
				//	textView1.setText("X");
					mp = MediaPlayer.create(getApplicationContext(),
							R.raw.wrong);
					mp.start();
				}

			}
		});
		// /////////////////////////////////////////////////////
		btnStart = (Button) findViewById(R.id.btnStart);
		btnStart.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				imgAns1.setEnabled(true);
				imgAns2.setEnabled(true);
				imgAns3.setEnabled(true);
				btnStart.setVisibility(8);

				setQuestion();

				// imgQues.setImageResource(over);

			}
		});
		// /////////////////////////////////////////////////////

		//textView1 = (TextView) findViewById(R.id.textView1);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
