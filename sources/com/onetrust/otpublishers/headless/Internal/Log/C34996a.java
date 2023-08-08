package com.onetrust.otpublishers.headless.Internal.Log;

import android.os.Build;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Log.a */
public class C34996a {
    /* renamed from: a */
    public void mo103915a() {
        OTLogger.m143454i("***********************************", "DEVICE LOGS -***********************************");
        OTLogger.m143454i("MODEL", Build.MODEL);
        OTLogger.m143454i("Manufacture", Build.MANUFACTURER);
        OTLogger.m143454i("SDK", Build.VERSION.SDK);
        OTLogger.m143454i("BRAND", Build.BRAND);
        OTLogger.m143454i("Version Code", Build.VERSION.RELEASE);
        OTLogger.m143454i("***********************************", "SDK LOGS -***********************************");
    }
}
