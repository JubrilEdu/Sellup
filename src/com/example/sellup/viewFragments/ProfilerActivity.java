package com.example.sellup.viewFragments;

import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sellup.R;
import com.example.sellup.adapters.ProfilePagerAdapter;
import com.example.sellup.adapters.SessionHandler;
import com.example.sellup.models.Profile;
import com.orm.SugarRecord;

public class ProfilerActivity extends Fragment {
	TextView username,address,password,email;
   SessionHandler session ;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
	    View rootView = inflater.inflate(R.layout.fragment_profiler, container, false);
        TextView name = (TextView) rootView.findViewById(R.id.username);
        TextView address = (TextView) rootView.findViewById(R.id.address);
        TextView phone = (TextView) rootView.findViewById(R.id.phone);
        TextView email = (TextView) rootView.findViewById(R.id.email);
         List<Profile> Name = SugarRecord.find(Profile.class,"checker= ?", "1");
         int length = Name.size();
         
         Log.d("Profile List",String.valueOf(length));
         if(length>0){
        	  Profile currentUser = Name.get(0);
        	  name.setText(currentUser.name);
        	  address.setText(currentUser.address);
        	  phone.setText(currentUser.phone);
        	  email.setText(currentUser.email);
        	  }
         ProfilePagerAdapter call = new ProfilePagerAdapter(getFragmentManager());
         call.getItem(2);
        
        return rootView;	 
	}
  
   
	
	
}
