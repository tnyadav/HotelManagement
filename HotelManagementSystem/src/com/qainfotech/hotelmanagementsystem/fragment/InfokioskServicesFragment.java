package com.qainfotech.hotelmanagementsystem.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qainfotech.hotelmanagementsystem.R;

public class InfokioskServicesFragment extends BaseFragment {
private static 	View detailMapFragment;

@Override
public void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	

}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		

	
				detailMapFragment = inflater.inflate(R.layout.detail_map_fragment,
						container, false);
			
		
		

		return detailMapFragment;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}
	
	@Override
	public void onResume() {
		
		super.onResume();
	}


	
}
