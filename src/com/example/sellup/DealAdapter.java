package com.example.sellup;

import java.util.ArrayList;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import com.example.sellup.viewFragments.DealsActivity;
import com.example.sellup.viewFragments.DealsActivity.Deals;

public class DealAdapter implements ListAdapter {
	private ArrayList<Deals> deals;
	private LayoutInflater layer;
  public DealAdapter(Context ctx,ArrayList<Deals>deals){
	  layer = LayoutInflater.from(ctx);
  }
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
	DealsActivity	dealer = new DealsActivity();
		return deals.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return deals.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getItemViewType(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int i, View view, ViewGroup vgroup) {
		// TODO Auto-generated method stub
		if(view == null){
			view = layer.inflate(R.layout.fragment_deals,vgroup,false);
		}
		return null;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return  deals.isEmpty();
	}

	@Override
	public void registerDataSetObserver(DataSetObserver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled(int arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	
}
