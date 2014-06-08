package com.example.sellup;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.sellup.models.Profile;

public class SignupActivity extends Activity {
   


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_signup);
		
		Button btn = (Button) findViewById(R.id.register);
		btn.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				final String username=((EditText) findViewById(R.id.Name)).getText().toString();
				final   String address = ((EditText) findViewById(R.id.Name1)).getText().toString();
				final	   String email = ((EditText) findViewById(R.id.email)).getText().toString();
				final  String phone =  ((EditText) findViewById(R.id.phone)).getText().toString();
				final String password = ((EditText) findViewById(R.id.password)).getText().toString();
				final String password1 = ((EditText) findViewById(R.id.password1)).getText().toString();
				Profile user = new Profile(SignupActivity.this,username,address,email,phone,1);	
				
				Intent intent2 = new Intent(SignupActivity.this,ProfileActivity.class);
				startActivity(intent2);
				user.save();
				JSONObject obj = new JSONObject();
				try {
					obj.accumulate("firstname", username);
					obj.accumulate("lastname",address);
					obj.accumulate("email",email);
					obj.accumulate("Phone", phone);
					obj.accumulate("password", password);
					obj.accumulate("password1",password1);
					obj.toString(3);
					Log.d("json",obj.toString());
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				RequestQueue Myque = Volley.newRequestQueue(getApplicationContext());
				JsonObjectRequest Myreq = new JsonObjectRequest(Request.Method.POST,"",obj,new Response.Listener<JSONObject>() {

					@Override
					public void onResponse(JSONObject response) {
						// TODO Auto-generated method stub
						
					}
				}, new Response.ErrorListener() {

					@Override
					public void onErrorResponse(VolleyError error) {
						// TODO Auto-generated method stub
						
					}
				});	
				Myque.add(Myreq);
		}
		

		});
	
	

}}
