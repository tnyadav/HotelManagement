package com.qainfotech.hotelmanagementsystem.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qainfotech.hotelmanagementsystem.R;

public class InfokioskServicesContainerFragment extends BaseFragment {
	HandleMapFragment handleMapFragment;
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
    	homeActivity.commitFragment(new MapDetailFragment());
     	
    }
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View menuFragment = inflater.inflate(R.layout.infokiosk_services_container_fragment,
				container, false);
	
		return menuFragment;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		handleMapFragment=(HandleMapFragment) activity;
		handleMapFragment.setupMapPush(getChildFragmentManager());
		
		
	}
	public interface HandleMapFragment{
		public void setupMapPush(FragmentManager fragmentManagert); 
		
	}
	
}
