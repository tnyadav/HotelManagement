package com.qainfotech.hotelmanagementsystem.fragment;

import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.qainfotech.hotelmanagementsystem.R;

public class CompanyPresentationFragment extends BaseFragment {

View propertySearchFilterFragment;
Button buttonAny,buttonNearMe;

@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
	
		
	}
    @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
    	propertySearchFilterFragment = inflater.inflate(R.layout.property_search_filter_fragment, container, false);
	    setUi();
		

		return propertySearchFilterFragment;
	}

	@Override
		public void onAttach(Activity activity) {
			
			super.onAttach(activity);
		}

	private void setUi() {
		
		
	
		
		buttonAny = (Button) propertySearchFilterFragment
				.findViewById(R.id.buttonAny);
		buttonAny.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				homeActivity.commitFragment(new CompanyPresentationPagerFragment());
				
			}
		});
		buttonNearMe = (Button) propertySearchFilterFragment
				.findViewById(R.id.buttonNearMe);
		
		
		
		
		
	
	}
	
}
