package com.example.cc.uidesing;

import android.app.Activity;
import android.content.SharedPreferences;

public class SharePre { // SharePreference to store Data

    public static void SetToken(Activity activity){ // Token is a method
        SharedPreferences sharedPreferences=activity.getSharedPreferences("Data",0); // Data is a file
        SharedPreferences.Editor editor=sharedPreferences.edit();  //In file we edit we change the data
        editor.putString("Token","1");
        editor.commit(); //All data will be save
    }

    public static String GetToken(Activity activity){
        SharedPreferences sharedPreferences=activity.getSharedPreferences("Data",0);
        return sharedPreferences.getString("Token","0");
    }
    public static void Logout(Activity activity){
        SharedPreferences sharedPreferences=activity.getSharedPreferences("Data",0);
        sharedPreferences.edit().clear().commit();   //Clear the data
    }


}
