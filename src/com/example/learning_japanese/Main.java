package com.example.learning_japanese;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.example.learning_japanese_final.R;

public class Main extends Activity {

	Button btnPractice, btnGame1, btnGame2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		findView();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void findView() {
		btnPractice = (Button) findViewById(R.id.btnPractice);
		btnPractice.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Main.this, Practice.class);
				startActivity(intent);

			}
		});
		// ////////////
		btnGame1 = (Button) findViewById(R.id.btnGame1);
		btnGame1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Main.this, Game1.class);
				startActivity(intent);
			}
		});
		// ///////////
		btnGame2 = (Button) findViewById(R.id.btnGame2);
		btnGame2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Main.this, Game2.class);
				startActivity(intent);

			}
		});

	}
}
