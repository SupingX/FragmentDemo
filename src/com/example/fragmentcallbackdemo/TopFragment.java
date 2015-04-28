package com.example.fragmentcallbackdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class TopFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.top, null);
		return view;
	}
	
	public void updataText(String value){
		//由于布局文件只有一个EditText标签
		EditText et = (EditText) getView();
		et.setText(value);
	}
}
