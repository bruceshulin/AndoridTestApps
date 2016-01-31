package com.example.bruce_activity_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.bruce_activity_test.R.id;

public class ActivityForResult extends Activity
{
	Button bn;
	EditText city;
	 @Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.for_main);
		bn = (Button) findViewById(R.id.bn);
		city = (EditText) findViewById(id.city);
		bn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				Intent intent =new Intent(ActivityForResult.this,SelectCityActivity.class);
				startActivity(intent);
				Log.d("Result", "onClick");
			}
		});
	}
	 
	 @Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		// TODO Auto-generated method stub
		//super.onActivityResult(requestCode, resultCode, data);
		 Log.d("Result", "-- onActivityResult--");
		if(requestCode == 0 && resultCode == 0)
		{
			 Log.d("Result", "requestCode == 0 && resultCode == 0");
			city = (EditText) findViewById(id.city);
			Bundle bdata = new Bundle();
			bdata = data.getExtras();
			String str = bdata.getString("city");
			 Log.d("Result", "str="+str);
			city.setText(str);
		}
	}
}
