package com.example.fragmentcallbackdemo;

import com.example.fragmentcallbackdemo.BottomFragment.OnBottomButtonClickListener;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity implements OnBottomButtonClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}

	@Override
	public void onClick(String name) {
		TopFragment top = (TopFragment) getFragmentManager().findFragmentById(R.id.top_frag);
		top.updataText("i changed you!Top!! my name is ..." + name);
	}
}
