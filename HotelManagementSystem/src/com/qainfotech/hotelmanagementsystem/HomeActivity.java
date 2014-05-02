package com.qainfotech.hotelmanagementsystem;


import java.util.HashMap;
import java.util.Map;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.qainfotech.hotelmanagementsystem.fragment.CompanyPresentationContainerFragment;
import com.qainfotech.hotelmanagementsystem.fragment.CompanyPresentationContainerFragment.HandleCompanyPresentation;
import com.qainfotech.hotelmanagementsystem.fragment.HotelFacilitiesBookingContainerFragment;
import com.qainfotech.hotelmanagementsystem.fragment.HotelFacilitiesBookingContainerFragment.HandleFavoriteFragment;
import com.qainfotech.hotelmanagementsystem.fragment.InfokioskServicesContainerFragment;
import com.qainfotech.hotelmanagementsystem.fragment.InfokioskServicesContainerFragment.HandleMapFragment;



public class HomeActivity extends FragmentActivity implements
		 HandleFavoriteFragment, HandleMapFragment,
		 HandleCompanyPresentation{
 public int currentTab;
 public Map<Integer, String> listMap=new HashMap<Integer, String>();

 private FragmentTabHost mTabHost;
 public FragmentManager companyPresentationFragmentManager,favoriteFragmentManager,mapFragmentManager;
 FrameLayout search,map,favorite,menu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		currentTab=0;
	
		    mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
	        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

	        mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator(createTabView(R.drawable.home,"Home")),
	                CompanyPresentationContainerFragment.class, null);
	        mTabHost.addTab(mTabHost.newTabSpec("contacts").setIndicator(createTabView(R.drawable.search,"Search")),
	        		InfokioskServicesContainerFragment.class, null);
	        mTabHost.addTab(mTabHost.newTabSpec("custom").setIndicator(createTabView(R.drawable.booking,"Booking")),
	        		HotelFacilitiesBookingContainerFragment.class, null);
	        mTabHost.addTab(mTabHost.newTabSpec("custom").setIndicator(createTabView(R.drawable.mobile_booking,"Mobile B..")),
	        		HotelFacilitiesBookingContainerFragment.class, null);
	        mTabHost.addTab(mTabHost.newTabSpec("custom").setIndicator(createTabView(R.drawable.more,"More")),
	        		HotelFacilitiesBookingContainerFragment.class, null);
	}



	public void initialCommitFragment(int containerId, Fragment fragment) {

		try {
		
			FragmentTransaction fragmentTransaction =getSupportFragmentManager()
					.beginTransaction();
			fragmentTransaction.add(containerId, fragment);
			fragmentTransaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}



	public void commitFragment(Fragment fragment) {
		
		FragmentTransaction ft;
		currentTab = mTabHost.getCurrentTab();
		
	/*	ft = companyPresentationFragmentManager.beginTransaction();
		ft.replace(R.id.companyPresentationContainer, fragment);
		ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		ft.addToBackStack(null);
		ft.commit();*/
		
		switch (currentTab) {
		case 0:
			ft = companyPresentationFragmentManager.beginTransaction();
			ft.replace(R.id.companyPresentationContainer, fragment);
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case 1:
			ft = mapFragmentManager.beginTransaction();
			ft.replace(R.id.mapContainer, fragment);
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case 2:
			/*ft = favoriteFragmentManager.beginTransaction();
			ft.replace(R.id.favoriteContainer, fragment);
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
			ft.addToBackStack(null);
			ft.commit();*/
			break;
		default:
			break;
		}

	}

	public void popFragment() {
		companyPresentationFragmentManager.popBackStack();
	/*	switch (currentTab) {
		case 0:
			companyPresentationFragmentManager.popBackStack();

			break;
		case 1:
			mapFragmentManager.popBackStack();

			break;
		case 2:
			favoriteFragmentManager.popBackStack();

			break;
		default:
			break;
		}*/
		
	}


	

	@Override
	public void setupMapPush(FragmentManager fragmentManager) {
		mapFragmentManager=fragmentManager;
		
	}
	@Override
	public void setupFavoritePush(FragmentManager fragmentManager) {
	//	favoriteFragmentManager=fragmentManager;
		
	}


@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
	}



@Override
public void setupCompanyPresentationPush(FragmentManager fragmentManager) {
	companyPresentationFragmentManager=fragmentManager;
	
}
	
private View createTabView(final int id,final String title) {
    View view = LayoutInflater.from(this).inflate(R.layout.tabs_icon, null);
    ImageView imageView =   (ImageView) view.findViewById(R.id.tab_icon);
    imageView.setImageResource(id);
    TextView textView=(TextView)view.findViewById(R.id.tab_text);
    textView.setText(title);
    return view;
}	
}
