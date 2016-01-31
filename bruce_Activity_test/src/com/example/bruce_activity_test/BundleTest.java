package com.example.bruce_activity_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class BundleTest extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reg_main);
		
		Button bn = (Button) findViewById(R.id.bn);
		bn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				EditText name = (EditText) findViewById(R.id.name);
				EditText passwd = (EditText) findViewById(R.id.passwd);
				RadioButton male = (RadioButton)findViewById(R.id.male);
				String gender = male.isChecked()?"ÄÐ":"Å®";
				Person p = new Person(name.getText().toString(),passwd.getText().toString(),gender);
				Bundle data = new Bundle();
				data.putSerializable("person", p);
				Intent intent = new Intent(BundleTest.this,ResultActivity.class);
				intent.putExtras(data);
				startActivity(intent);
						
			}
		});
	}
	
}
