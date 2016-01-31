package com.example.bruce_activity_test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Lifecycle extends Activity
{
	final String TAG = "-CrazyIt-";
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.life_main);
		
		Log.d(TAG, "--onCreate--");
		Button bn=(Button)findViewById(R.id.bn);
		bn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				//½áÊøµ±Ç°Activity
				Lifecycle.this.finish();
			}
		});
	}
	
	@Override
	protected void onStart()
	{
		// TODO Auto-generated method stub
		super.onStart();
		Log.d(TAG, "-- onStart --");
	}
	@Override
	protected void onRestart()
	{
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d(TAG, "-- onRestart --");
	}
	@Override
	protected void onResume()
	{
		// TODO Auto-generated method stub
		super.onResume();
		Log.d(TAG, "--onResume--");
	}
	@Override
	protected void onPause()
	{
		// TODO Auto-generated method stub
		super.onPause();
		Log.d(TAG, "--onPause--");
	}
	@Override
	protected void onStop()
	{
		// TODO Auto-generated method stub
		super.onStop();
		Log.d(TAG, "--onStop--");
	}
	@Override
	protected void onDestroy()
	{
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d(TAG, "--onDestroy--");
	}
	
	
}
