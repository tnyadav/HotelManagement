package com.qainfotech.hotelmanagementsystem.fragment;

import java.util.ArrayList;
import java.util.HashMap;

import com.qainfotech.hotelmanagementsystem.R;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

public class myFragmentPagerAdapter extends FragmentPagerAdapter {/*
	
	private int[] Images = new int[] { R.drawable.photo1, R.drawable.photo2,
            R.drawable.photo3, R.drawable.photo4

    };

    protected static final int[] ICONS = new int[] { R.drawable.marker,
            R.drawable.marker, R.drawable.marker, R.drawable.marker };

    private int mCount = Images.length;

    public PlaceSlidesFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new PlaceSlideFragment(Images[position]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public int getIconResId(int index) {
        return ICONS[index % ICONS.length];
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }*/
	
	
	

	public myFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	    itemData = new ArrayList<Integer>();
	    itemData.add(R.drawable.a1);
	    itemData.add(R.drawable.a2);
	    itemData.add(R.drawable.a3);
	    itemData.add(R.drawable.a4);
	    itemData.add(R.drawable.a5);

	}

	private ArrayList<Integer> itemData;



	@Override
	public int getCount() {
		return itemData.size();
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		super.destroyItem(container, position, object);
	}

	@Override
	public Fragment getItem(int position) {
		FragmentImageView f = FragmentImageView.newInstance();
		f.setImageList(itemData.get(position));
		return f;
	}
}