package com.example.sellup.fragment;

import com.example.sellup.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragmenter extends Fragment{
  public static final String FLOP = "objecter";
  
  public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstancestate){
	 View stale = inflater.inflate(R.layout.fragment_profile,container, false);
	  Bundle args = getArguments();
	
	return stale;
	  
  }
}
