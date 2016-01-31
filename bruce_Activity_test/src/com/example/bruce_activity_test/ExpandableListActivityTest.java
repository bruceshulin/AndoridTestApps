package com.example.bruce_activity_test;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ExpandableListActivityTest extends PreferenceActivity
{
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
	}
}
