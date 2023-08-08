package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
public final class C30652a4 extends C30965z9 {
    public C30652a4(C30822na naVar) {
        super(naVar);
    }

    /* renamed from: l */
    public final boolean mo86867l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo86868m() {
        mo87627i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f74136a.mo86902c().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
