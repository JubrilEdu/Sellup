package com.example.sellup;
import com.example.sellup.adapters.ProfilePagerAdapter;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

@SuppressLint("NewApi")
public class ProfileActivity extends FragmentActivity implements ActionBar.TabListener{

 String[] tabHead =  {"Hot deals","Products","Preferences"};
 ViewPager viewpager1;
 
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_profile);	
	 ActionBar actionbar= getActionBar();
	   actionbar.setTitle("");
		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		viewpager1 = (ViewPager) findViewById(R.id.pager);
		viewpager1.setAdapter(new ProfilePagerAdapter(getSupportFragmentManager()));
	

  ActionBar.TabListener listener = new ActionBar.TabListener() {
	
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		viewpager1.setCurrentItem(tab.getPosition());
	}
	
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
};

for (int i = 0; i < tabHead.length; i++) 
{   actionbar.addTab(
	                actionbar.newTab()
	                        .setText(tabHead[i])
	                        .setTabListener(listener));}
   
  viewpager1.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
	  @Override
	public void onPageSelected(int position) {
		// TODO Auto-generated method stub
		getActionBar().setSelectedNavigationItem(position);
	
	}
  });
	}


	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	
	 
	

}
