package com.urbanairship.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.autofill.C0861a;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.c0 */
public class C9642c0 {

    /* renamed from: a */
    public static C9642c0 f26419a = new C9642c0();

    @C0363p0
    /* renamed from: a */
    public static String m36129a() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) UAirship.m146200l().getSystemService(C0861a.f2705e);
            if (telephonyManager == null) {
                return null;
            }
            return telephonyManager.getNetworkOperatorName();
        } catch (Exception e) {
            C36059m.m148421q("Unable to get network operator name", e);
            return null;
        }
    }

    /* renamed from: c */
    public static C9642c0 m36130c() {
        return f26419a;
    }

    /* renamed from: b */
    public boolean mo19605b(@C0359n0 Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        }
        C36059m.m148409e("Error fetching network info.", new Object[0]);
        return false;
    }
}
