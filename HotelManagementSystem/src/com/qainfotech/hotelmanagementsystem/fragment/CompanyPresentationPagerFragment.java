package com.qainfotech.hotelmanagementsystem.fragment;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.qainfotech.hotelmanagementsystem.R;

public class CompanyPresentationPagerFragment extends BaseFragment {

View propertySearchFilterFragment;
private ViewPager mPager;
private PagerAdapter mPagerAdapter;
//Images imageId;
//ArrayList<Integer> itemData;
@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		
	}
    @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
    	propertySearchFilterFragment = inflater.inflate(R.layout.pager_fragment, container, false);
	    setUi();
		

		return propertySearchFilterFragment;
	}

	@Override
		public void onAttach(Activity activity) {
			
			super.onAttach(activity);
		}

	private void setUi() {
/*				mPager = (ViewPager) propertySearchFilterFragment.findViewById(R.id.pager);
	
		//int totalImage = itemData.size();
	    myFragmentPagerAdapter adapter = new myFragmentPagerAdapter(homeActivity.getSupportFragmentManager()
	    		);
	    mPager.setAdapter(adapter);
	    
	    mPager.setCurrentItem(0);*/
 Button back=(Button)propertySearchFilterFragment.findViewById(R.id.back);
 back.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		homeActivity.popFragment();
	}
});
	
	}


}
