package com.qainfotech.hotelmanagementsystem.fragment;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.qainfotech.hotelmanagementsystem.HomeActivity;

public class BaseFragment extends Fragment {
	HomeActivity homeActivity;

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		homeActivity = (HomeActivity) activity;
		
	}

}
