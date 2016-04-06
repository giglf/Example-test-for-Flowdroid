package com.example.testflowdroid;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

class A{
	public B atob;
	A(){
		atob = new B();
	}
}

class B{
	public int num;
}

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		A a = new A();
		B b = a.atob;
		foo(a);
		sink(b.num);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void foo(A aa){
		B tmp = aa.atob;
		int w = source();
		tmp.num = w;
	}
	
	public int source(){
		return 3;
	}
	
	public void sink(int d){
		
	}
}