package org.crazyit.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HelloWorld extends Activity 
{
	//����һ�δ�����Activityʱ�ص��÷���
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		//����ʹ��main.xml�ļ������ҳ�沼��
		setContentView(R.layout.main);
		//��ȡUI������IDΪR.id.ok�İ�ť
		Button bn = (Button)findViewById(R.id.ok);
		//Ϊ��ť��һ�������¼��ļ�����
		bn.setOnClickListener(new OnClickListener(){
			public void  onClick(View v)   
			{
				//��ȡUI������IDΪR.id.show���ı���
				final TextView show = (TextView)findViewById(R.id.show);
				//�ı��ı�����ı�����
				show.setText("Hello Android~" + new java.util.Date());
			}
		});        
	}
}