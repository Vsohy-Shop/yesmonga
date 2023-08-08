package com.onetrust.otpublishers.headless.Internal.Network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Network.g */
public class C35010g {
    /* renamed from: a */
    public boolean mo103956a(@C0359n0 Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        OTLogger.m143458m("NWUtils", "isConnected = " + z);
        return z;
    }
}
