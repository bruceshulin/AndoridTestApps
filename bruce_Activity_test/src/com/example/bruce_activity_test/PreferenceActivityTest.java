package com.example.bruce_activity_test;

import android.app.ExpandableListActivity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.ExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PreferenceActivityTest extends ExpandableListActivity
{
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		ExpandableListAdapter adapter = new ExpandableListAdapter() {
			int[] logos = new int[]
					{
						R.drawable.p,
						R.drawable.z,
						R.drawable.t
					};
			private String[] armType = new String[]
					{"神族兵种","虫族兵种","人族兵种"};
			private String[][] arms = new String[][]
					{
						{ "狂战士", "龙骑士", "黑暗圣堂", "电兵" },
						{ "小狗", "刺蛇", "飞龙", "自爆飞机" },
						{ "机枪兵", "护士MM" , "幽灵" }
					};
			//获取指定组位置，指定子列表项处的子列表项数据
			@Override
			public void unregisterDataSetObserver(DataSetObserver arg0)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void registerDataSetObserver(DataSetObserver arg0)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onGroupExpanded(int arg0)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onGroupCollapsed(int arg0)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isEmpty()
			{
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isChildSelectable(int arg0, int arg1)
			{
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public boolean hasStableIds()
			{
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public View getGroupView(int arg0, boolean arg1, View arg2, ViewGroup arg3)
			{
				// TODO Auto-generated method stub
				LinearLayout ll = new LinearLayout(PreferenceActivityTest.this);
				ll.setOrientation(0);
				ImageView logo = new ImageView(PreferenceActivityTest.this);
				logo.setImageResource(logos[arg0]);
				ll.addView(logo);
				TextView textView = getTextView();
				textView.setText(getGroup(arg0).toString());
				ll.addView(textView);
				return ll;
			}
			
			@Override
			public long getGroupId(int arg0)
			{
				// TODO Auto-generated method stub
				return arg0;
			}
			
			@Override
			public int getGroupCount()
			{
				// TODO Auto-generated method stub
				return armType.length;
			}
			
			@Override
			public Object getGroup(int arg0)
			{
				// TODO Auto-generated method stub
				return armType[arg0];
			}
			
			@Override
			public long getCombinedGroupId(long arg0)
			{
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getCombinedChildId(long arg0, long arg1)
			{
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getChildrenCount(int arg0)
			{
				// TODO Auto-generated method stub
				return arms[arg0].length;
			}
			
			@Override
			public View getChildView(int arg0, int arg1, boolean arg2, View arg3,
					ViewGroup arg4)
			{
				// TODO Auto-generated method stub
				TextView textview = getTextView();
				textview.setText(getChild(arg0,arg1).toString());
				return textview;
			}
			
			@Override
			public long getChildId(int arg0, int arg1)
			{
				// TODO Auto-generated method stub
				return arg1;
			}
			
			@Override
			public Object getChild(int arg0, int arg1)
			{
				// TODO Auto-generated method stub
				return arms[arg0][arg1];
			}
			
			@Override
			public boolean areAllItemsEnabled()
			{
				// TODO Auto-generated method stub
				return false;
			}
			/**
			 * @return
			 */
			private TextView getTextView()
			{
				AbsListView.LayoutParams lp = new AbsListView.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, 64);
				TextView textView = new TextView(PreferenceActivityTest.this);
				textView.setLayoutParams(lp);
				textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
				textView.setPadding(36, 0, 0, 0);
				textView.setTextSize(20);
				return textView;
			}
		};
		setListAdapter(adapter);
	}

}
