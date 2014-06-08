package com.example.sellup.models;

import android.content.Context;

import com.orm.SugarRecord;

public class Profile extends SugarRecord<Profile>{
    public String name;
	public String address;
	public String email;
	public String phone;	
	public int checker;
 public Profile(Context kontext1) {
	// TODO Auto-generated constructor stub
	 super(kontext1);
}
	public Profile(Context Kontext1,String name,String address,String email,String phone,int checker) {
		super(Kontext1);
		this.name=name;
		this.address=address;
		this.email=email;
		this.phone=phone;
		this.checker=checker;
		
	}
	

}
