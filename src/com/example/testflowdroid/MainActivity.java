package com.example.testflowdroid;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import java.lang.String;



public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		String raw_password = source();
		String password = calPassword(raw_password);
		sink(password);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public String calPassword(String s){
		String rel = "";
		for(char c : s.toCharArray()){
			rel += c + "_";
		}
		return rel;
	}
	
	public String source(){
		String raw_password = "123456";
		return raw_password;
	}
	
	public void sink(String s){
		
	}

}