package com.example.bruce_activity_test;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.test.ActivityUnitTestCase;
import android.widget.ArrayAdapter;

public class OtherActivity extends LauncherActivity
{
	String[] names={"���ó������","�鿴�Ǽʱ���","����Intent ǰ�����","����Intentǰ��Bundle����","����Activityǰ��Bundle����","Activity��������"};
	Class<?>[] clazzs = {ExpandableListActivityTest.class,
			PreferenceActivityTest.class,
			StartActivity.class,
			BundleTest.class,
			ActivityForResult.class,
			Lifecycle.class};

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
		setListAdapter(adapter);
	}
	
	public Intent intentForPosition(int position)
	{
		return new Intent(OtherActivity.this, clazzs[position]);
	}
			
}
