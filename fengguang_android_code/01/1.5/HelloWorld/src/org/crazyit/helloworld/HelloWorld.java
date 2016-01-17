package org.crazyit.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.View.OnClickListener;
import android.view.View;

public class HelloWorld extends Activity
{
    /** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		//设置该Activity显示main.xml文件定义的View
		setContentView(R.layout.main);
		Button bn = (Button)findViewById(R.id.ok);
		bn.setOnClickListener(new OnClickListener(){
			public void  onClick(View v)   
			{
				final TextView show = (TextView)findViewById(R.id.show);
				show.setText("Hello Android~" + new java.util.Date());
			}
		});
	}
}
