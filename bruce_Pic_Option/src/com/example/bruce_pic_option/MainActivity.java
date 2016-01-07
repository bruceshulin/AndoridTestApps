package com.example.bruce_pic_option;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity
{
	int[] images = new int[]{
			R.drawable.pic1,
			R.drawable.pic2,
			R.drawable.pic3,
			R.drawable.pic4,
			R.drawable.pic5,
			};
	int currentImg = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LinearLayout main =(LinearLayout) findViewById(R.id.root);
		final ImageView image = new ImageView(this);
		main.addView(image);
		image.setImageResource(images[0]);
		image.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				if(currentImg >=4)
				{
					currentImg = -1;
				}
				image.setImageResource(images[++currentImg]);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
