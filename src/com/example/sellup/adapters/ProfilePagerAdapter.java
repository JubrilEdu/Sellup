package com.example.sellup.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sellup.viewFragments.DealsActivity;
import com.example.sellup.viewFragments.ProductActivity;
import com.example.sellup.viewFragments.ProfilerActivity;
import com.example.sellup.viewFragments.UploadedActivity;

public class ProfilePagerAdapter extends FragmentStatePagerAdapter{
	String[] title ={"Deals","Products","Preferences","Profile"};
	public ProfilePagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i) {
		// TODO Auto-generated method stub
		
        switch (i) {
        case 0:
        	return new DealsActivity();
		case 1:
			return new    UploadedActivity(); 
		case 2:   
			return new    ProductActivity(); 
		case 3:
			return new   ProfilerActivity(); 
		default:
			return new DealsActivity();
			
		}
       
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return title.length;
	}
    @Override
    public CharSequence getPageTitle(int position) {
    	// TODO Auto-generated method stub
    	return title[position];
    }
}
