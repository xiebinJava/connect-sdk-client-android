package com.globalcollect.gateway.sdk.client.android.exampleapp.configuration;
/**
public class CheckCommunication {
	
	/**
	 * Checks if there is internet connectivity on this device
	 * @param activity
	 * @return true if there is internet connectivity
	 */
	public boolean isOnline(Activity activity) {
		
		// Null check
		if (activity == null) {
			throw new InvalidParameterException("Error checking connection capabilities, activity may not be null");
		}
		
		// Check whether internet connection
		ConnectivityManager cm = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo netInfo = cm.getActiveNetworkInfo();
		if (netInfo != null && netInfo.isConnectedOrConnecting()) {
			return true;
		}
		return false;
	}
}