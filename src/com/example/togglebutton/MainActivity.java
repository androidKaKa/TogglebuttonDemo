package com.example.togglebutton;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.example.togglebutton.SlideSwitch;
import com.example.togglebutton.SlideSwitch.SlideListener; 

public class MainActivity extends Activity {
	SlideSwitch slidBtn=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		slidBtn=(SlideSwitch)findViewById(R.id.toggleBtn);
		slidBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		slidBtn.setSlideListener(new SlideListener() {
			
			@Override
			public void open() {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "open ", Toast.LENGTH_LONG).show();
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "close ", Toast.LENGTH_LONG).show();
				
			}
		});
		 
	}



}
