package com.qainfotech.hotelmanagementsystem.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.qainfotech.hotelmanagementsystem.R;

public class HotelFacilitiesBookingFragment extends BaseFragment {
	HandleFavoriteFragment handleFavoriteFragment;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View menuFragment = inflater.inflate(R.layout.hotel_facilities_booking_fragment,
				container, false);
	Button push=(Button)menuFragment.findViewById(R.id.push);
	push.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
		
			//homeActivity.favoriteCommitFragment(new MenuFragment());
		}
	});
	Button pop=(Button)menuFragment.findViewById(R.id.pop);
    pop.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			homeActivity.popFragment();
		}
	});
		return menuFragment;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		handleFavoriteFragment=(HandleFavoriteFragment) activity;
		handleFavoriteFragment.setupFavoritePush(getChildFragmentManager());
        
	}
	
	public interface HandleFavoriteFragment{
		public void setupFavoritePush(FragmentManager fragmentManagert); 
		
	}

}
