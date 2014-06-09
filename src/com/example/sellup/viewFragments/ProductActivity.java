package com.example.sellup.viewFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.sellup.R;

@SuppressLint("NewApi")
public class ProductActivity extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        Log.d("err", "functional");
        View rootView = inflater.inflate(R.layout.fragment_product, container, false);
         
        return rootView;	


	}


/*@TargetApi(Build.VERSION_CODES.HONEYCOMB)
@SuppressLint("NewApi")
public void onCreateOptionsMenu(Menu menu,MenuInflater inflater) {
		inflater.inflate(R.id.search, menu);
        MenuItem item = menu.findItem(R.id.search);
        Log.d("search","created Menu");
        SearchView sv = new SearchView(getActivity());
        MenuItemCompat.setShowAsAction(item, MenuItemCompat.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW | MenuItemCompat.SHOW_AS_ACTION_IF_ROOM);
        MenuItemCompat.setActionView(item, sv);
        sv.setOnQueryTextListener(new OnQueryTextListener() {
           
        	@Override
            public boolean onQueryTextSubmit(String query) {
                System.out.println("search query submit");
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                System.out.println("tap");
                return false;
            }
        });


}*/

	

	

}
