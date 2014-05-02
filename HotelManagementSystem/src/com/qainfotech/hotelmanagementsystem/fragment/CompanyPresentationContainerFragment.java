package com.qainfotech.hotelmanagementsystem.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qainfotech.hotelmanagementsystem.R;

public class CompanyPresentationContainerFragment extends BaseFragment {
	HandleCompanyPresentation handleCompanyPresentation;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		homeActivity.commitFragment(new CompanyPresentationFragment());
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		    View menuFragment = inflater.inflate(R.layout.company_presentation_container_fragment,
				container, false);

		return menuFragment;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		handleCompanyPresentation=(HandleCompanyPresentation) activity;
		handleCompanyPresentation.setupCompanyPresentationPush(getChildFragmentManager());
		
		
	}
	
	public interface HandleCompanyPresentation{
		public void setupCompanyPresentationPush(FragmentManager fragmentManagert); 
		
	}

}
