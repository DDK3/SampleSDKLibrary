package com.sustlabs.ohmassistantsdk;

import android.app.Activity;
import android.content.Intent;

public class OhmUIHelper {
    Activity mHostActivity;
    public OhmUIHelper(Activity hostActivity){
        mHostActivity = hostActivity;
    }

    public void startPairingProcess(){
        Intent sdkIntent = new Intent(mHostActivity, PairingActivity.class);
        mHostActivity.startActivity(sdkIntent);
    }

    public void startOhmUI(){
        Intent sdkIntent = new Intent(mHostActivity, MainSdkActivity.class);
        mHostActivity.startActivity(sdkIntent);
    }


}
