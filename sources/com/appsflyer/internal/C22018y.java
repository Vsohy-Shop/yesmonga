package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.telephony.TelephonyManager;
import androidx.autofill.C0861a;
import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.y */
final class C22018y {

    /* renamed from: com.appsflyer.internal.y$b */
    public static final class C22019b {
        static final C22018y AFInAppEventType = new C22018y();
    }

    /* renamed from: com.appsflyer.internal.y$d */
    public static final class C22020d {
        final String AFInAppEventParameterName;
        final String AFKeystoreWrapper;
        final String valueOf;

        public C22020d(@NonNull String str, @Nullable String str2, @Nullable String str3) {
            this.AFKeystoreWrapper = str;
            this.valueOf = str2;
            this.AFInAppEventParameterName = str3;
        }
    }

    private static boolean AFInAppEventParameterName(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    public static C22020d AFInAppEventParameterName(@NonNull Context context) {
        String str;
        String str2;
        String str3;
        String str4 = "unknown";
        String str5 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                    if (!AFInAppEventParameterName(networkInfo)) {
                        i++;
                    } else if (1 == networkInfo.getType()) {
                        str4 = "WIFI";
                    } else if (networkInfo.getType() == 0) {
                        str4 = "MOBILE";
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(C0861a.f2705e);
            str = telephonyManager.getSimOperatorName();
            try {
                str2 = telephonyManager.getNetworkOperatorName();
                if ((str2 == null || str2.isEmpty()) && 2 == telephonyManager.getPhoneType()) {
                    str2 = "CDMA";
                }
            } catch (Throwable th) {
                th = th;
                String str6 = str;
                str3 = null;
                str5 = str6;
                AFLogger.AFKeystoreWrapper("Exception while collecting network info. ", th);
                String str7 = str3;
                str = str5;
                str2 = str7;
                return new C22020d(str4, str2, str);
            }
        } catch (Throwable th2) {
            th = th2;
            str3 = null;
            AFLogger.AFKeystoreWrapper("Exception while collecting network info. ", th);
            String str72 = str3;
            str = str5;
            str2 = str72;
            return new C22020d(str4, str2, str);
        }
        return new C22020d(str4, str2, str);
    }
}
