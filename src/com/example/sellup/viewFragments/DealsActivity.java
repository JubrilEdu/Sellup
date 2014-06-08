package com.example.sellup.viewFragments;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import com.example.sellup.R;
import com.example.sellup.Tracker;
import com.example.sellup.Tracker.LocationResult;
import com.google.android.gms.location.LocationClient;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class DealsActivity extends Fragment {
    public DealsActivity(){
    	super();
    	Log.d("Constructor", "got here");
    }
	private Context context;
	private static String presentLocation = "You";

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.fragment_deals, container, false);

	
        return rootView;

	}
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		LocationResult locResult=new LocationResult() {
		@SuppressLint("NewApi")
		public void gotLocation(Location location) {
			// TODO Auto-generated method stub
		
			
	   double	lat= location.getLatitude();
		double lon=	location.getLongitude();
		Log.d("lon", String.valueOf(lon));
		Log.d("lat", String.valueOf(lat));
		if(Geocoder.isPresent()){
			if(getActivity() != null){
			Geocoder coder = new Geocoder(getActivity().getApplicationContext(),Locale.getDefault());
			try {
				List<Address> address = coder.getFromLocation(lat, lon, 1);
				if (address.isEmpty()){
						presentLocation = "Your Area";
						Toast.makeText(getActivity(), presentLocation, Toast.LENGTH_SHORT).show();
				}else {
				     if (address.size() > 0) {       
				         presentLocation = address.get(0).getLocality(); 
				         Toast.makeText(getActivity(), presentLocation, Toast.LENGTH_SHORT).show();
				      }
				   }
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();	
			}
			}
		}
		
			
			
		}
	};

	Tracker tracker = new Tracker();
	tracker.getLocation(getActivity().getApplicationContext(), locResult);
	

}}

