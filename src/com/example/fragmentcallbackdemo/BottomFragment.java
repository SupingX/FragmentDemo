package com.example.fragmentcallbackdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class BottomFragment extends Fragment implements OnClickListener {
	
	private OnBottomButtonClickListener listener;
	
	/**
	 * 提供回调方法的接口，嵌入此fragment的窗口类会实现此接口
	 * @author Administrator
	 */
	public interface OnBottomButtonClickListener {
		public void onClick(String name);
	}
	
	@Override
	public void onAttach(Activity activity) {
		//嵌入该fragment的窗口类必须实现OnBottomButtonClickListener接口，否则不能转换
		if(getActivity() instanceof OnBottomButtonClickListener){
			listener = (OnBottomButtonClickListener) getActivity();
		}
		super.onAttach(activity);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.bottom, null);
		Button b = (Button) view.findViewById(R.id.btn_bottom);
		b.setOnClickListener(this);
		return view;
	}
	
	
	
	@Override
	public void onClick(View v) {
		if(listener!=null){
			listener.onClick("bottom fragment Demo");
		}
	}

}
