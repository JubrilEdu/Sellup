package com.example.sellup.viewFragments;

import com.example.sellup.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class UploadedActivity extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
	    View rootView = inflater.inflate(R.layout.fragment_uploaded, container, false);
	  Log.d("tag", "Uploaded baba");
        
        return rootView;	
	}

}
