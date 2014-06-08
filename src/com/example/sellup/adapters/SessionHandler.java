package com.example.sellup.adapters;

import java.util.HashMap;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.example.sellup.SellActivity;

@SuppressLint("CommitPrefEdits")
public class SessionHandler {
	public static Context kontext; 
	private static volatile SessionHandler instance;
	SharedPreferences preference;
	Editor editor;
	 
	int PRIVATE_MODE =0;

	 private static final Boolean IS_LOGIN = false;
	private static final String PREFERENCE_NAME="details";
	public static final String KEY_NAME = "name";
	public static final String KEY_PASSWORD ="password";
	
 private SessionHandler(){
	 
	 preference=kontext.getSharedPreferences(PREFERENCE_NAME, PRIVATE_MODE);
	 editor = preference.edit();
 }
 public static SessionHandler getInstance(Context kontext) {
	 SessionHandler.kontext=kontext;
	 instance = new 	SessionHandler();
     return instance;
 }
 public void loginSession(String name,String password){
	 editor.putString(KEY_NAME, name);
	 editor.putString(KEY_PASSWORD,  password);
	 editor.commit();
 }
 public HashMap<String, String> UserDetail(){
	 HashMap<String,String> user = new HashMap<>();
	 user.put(KEY_NAME, preference.getString(KEY_NAME, null));
	 user.put(KEY_PASSWORD, preference.getString(KEY_PASSWORD, null));
	return user;
	 }
public void CheckOut(){
   editor.clear();
   editor.commit();
   Intent i = new Intent(kontext,SellActivity.class);
   i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
   i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
   kontext.startActivity(i);
	
}
}
