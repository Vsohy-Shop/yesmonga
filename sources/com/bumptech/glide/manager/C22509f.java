package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.core.content.C17318d;
import com.bumptech.glide.manager.C22505c;

/* renamed from: com.bumptech.glide.manager.f */
public class C22509f implements C22507d {

    /* renamed from: a */
    public static final String f57695a = "ConnectivityMonitor";

    /* renamed from: b */
    public static final String f57696b = "android.permission.ACCESS_NETWORK_STATE";

    @C0359n0
    /* renamed from: a */
    public C22505c mo66576a(@C0359n0 Context context, @C0359n0 C22505c.C22506a aVar) {
        boolean z;
        if (C17318d.m79718a(context, f57696b) == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 3);
        if (z) {
            return new C22508e(context, aVar);
        }
        return new C22517n();
    }
}
