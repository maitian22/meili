package com.view;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class MyScrollView extends ScrollView{

	public MyScrollView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		return super.onInterceptTouchEvent(ev);
	}
	
	
}
