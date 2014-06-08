package com.example.fraggy;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.sellup.R;
import com.example.sellup.adapters.ProfilePagerAdapter;

public class FragActivity extends FragmentActivity {
      ProfilePagerAdapter  adapt;
      ViewPager viewpager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
		adapt = new ProfilePagerAdapter(getSupportFragmentManager());
		viewpager.findViewById(R.id.pager);
		viewpager.setAdapter(adapt);
    
	
	

}}
