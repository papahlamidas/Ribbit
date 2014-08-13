package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;
import com.teamtreehouse.ribbit.ui.MainActivity;
import com.teamtreehouse.ribbit.utils.ParseConstants;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
			super.onCreate();
		  	Parse.initialize(this, "ZzzznnzWmMDASS5lfeFOuOu4EHFacEf3AVepPure", "kTjSTQkoAgT71flVwMe2I7E5OabVUlaMPkcjw7Bs");
		  	
		  	//PushService.setDefaultPushCallback(this, MainActivity.class);
		  	PushService.setDefaultPushCallback(this, MainActivity.class, R.drawable.ic_stat_ic_launcher);
		}
	public static void updateParseInstallation(ParseUser user){
		ParseInstallation installation = ParseInstallation.getCurrentInstallation();
		installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
		installation.saveInBackground();
	}
}

