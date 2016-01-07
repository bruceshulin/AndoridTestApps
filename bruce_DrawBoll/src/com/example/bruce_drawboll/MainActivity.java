package com.example.bruce_drawboll;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LinearLayout main =(LinearLayout) findViewById(R.id.root);
		final DrawView draw  = new DrawView(this);
		draw.setMinimumWidth(300);
		draw.setMinimumHeight(500);
		draw.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1)
			{
				// TODO Auto-generated method stub
				draw.currentx = arg1.getX();
				draw.currenty = arg1.getY();
				draw.invalidate();
				return true;
			}
		});
		main.addView(draw);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
