package com.example.sellup.viewFragments;

import com.example.sellup.R;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

public class UploadedActivity extends Fragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
	    View rootView = inflater.inflate(R.layout.fragment_uploaded, container, false);
	  Log.d("tag", "Uploaded baba");
        
        return rootView;	
	}

}
