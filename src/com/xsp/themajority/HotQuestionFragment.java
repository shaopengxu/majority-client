package com.xsp.themajority;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HotQuestionFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_selection_common,
				container, false);
		// if this view a viewgroup?
		//ViewGroup vg = (ViewGroup)rootView;
		//vg.addView(...)
		// add a viewlist or findviewbyid from config xml
		// TODO get the host list , show it

		return rootView;
	}
	


	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}

}
