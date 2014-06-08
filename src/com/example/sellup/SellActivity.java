package com.example.sellup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class SellActivity extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_sell);
    Button login = (Button) findViewById(R.id.login1);
    login.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent1 = new Intent(SellActivity.this,ProfileActivity.class);
			startActivity(intent1);
		}
	});
	Button signUp = (Button) findViewById(R.id.SignUp1);
    signUp.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(SellActivity.this,SignupActivity.class);
			startActivity(intent);
		}
		
	});
	
 	}

	


}	


