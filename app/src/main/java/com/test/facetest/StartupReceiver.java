package com.test.facetest;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.widget.Toast;

public class StartupReceiver extends BroadcastReceiver {

	static final String action_boot="android.intent.action.BOOT_COMPLETED";
	 
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub

		 if (intent.getAction().equals(action_boot)){
	            Intent ootStartIntent=new Intent(context,MainActivity.class);
	            ootStartIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	            context.startActivity(ootStartIntent);
	        }
       
	}

}
