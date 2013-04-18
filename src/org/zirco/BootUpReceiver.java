package org.zirco;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;

public class BootUpReceiver extends BroadcastReceiver{

		@Override
		public void onReceive(Context context, Intent intent) {
			Intent i = new Intent(context, org.zirco.ui.activities.MainActivity.class);  
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i); 

			 
		}

}	