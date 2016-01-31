package com.example.bruce_activity_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		Button previous = (Button) findViewById(R.id.previous);
		Button close = (Button) findViewById(R.id.close);
		previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View source)
			{
				// TODO Auto-generated method stub
				Intent intent = new Intent(SecondActivity.this,StartActivity.class);
				startActivity(intent);
			}
		});
		close.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				Intent intent = new Intent(SecondActivity.this,StartActivity.class);
				startActivity(intent);
				finish();
			}
		});
	}
}
