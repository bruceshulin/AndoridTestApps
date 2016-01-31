package com.example.bruce_activity_test;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.test.ActivityUnitTestCase;
import android.widget.ArrayAdapter;

public class OtherActivity extends LauncherActivity
{
	String[] names={"设置程序参数","查看星际兵种","设置Intent 前后调用","设置Intent前后Bundle传参","设置Activity前后Bundle传参","Activity生命周期"};
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
