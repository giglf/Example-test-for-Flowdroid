package com.example.testflowdroid;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;


public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		source();
		int b = 2;
		
		sink(b);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public int source(){
		return 3;
	}
	
	public void sink(int d){
		
	}
}