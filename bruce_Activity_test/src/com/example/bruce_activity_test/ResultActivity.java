package com.example.bruce_activity_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.bruce_activity_test.R.id;

public class ResultActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		TextView name = (TextView) findViewById(R.id.name);
		TextView passwd = (TextView) findViewById(R.id.passwd);
		TextView gender = (TextView)findViewById(id.gender);
		
		Intent intent = getIntent();
		Bundle data = intent.getExtras();
		Person p = (Person)data.getSerializable("person");
		name.setText("�����û���Ϊ:"+p.getName());
		passwd.setText("��������Ϊ:"+p.getPass());
		gender.setText("�����Ա�Ϊ:"+p.getGender());
	}
	
}
