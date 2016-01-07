package com.example.bruce_drawboll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawView extends View
{
	public float currentx = 40;
	public float currenty = 50;
	public DrawView(Context context)
	{
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		Paint p = new Paint();
		p.setColor(Color.RED);
		canvas.drawCircle(currentx, currenty, 15, p);
	}

}
