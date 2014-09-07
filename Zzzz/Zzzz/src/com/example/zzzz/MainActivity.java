package com.example.zzzz;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class MainActivity extends Activity {
	WindowManager mWindowManager = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button =(Button)findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				addPopupWindow();
				
			}

			
		});
	}
	private void addPopupWindow() {
		LayoutInflater inflater = getLayoutInflater();
		View layout = inflater.inflate(R.layout.new_view, null);

		final PopupWindow popupwindow = new PopupWindow(layout,
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		popupwindow.setAnimationStyle(R.style.AnimationPopup);
		
		popupwindow.showAtLocation(layout, Gravity.CENTER, 0, 0);   
		Handler handler=new Handler();
		Runnable r=new Runnable()
		{
		    public void run() 
		    {
		    	popupwindow.dismiss();   			
		    }
		};
		handler.postDelayed(r,8000);
		
	}
	
}
