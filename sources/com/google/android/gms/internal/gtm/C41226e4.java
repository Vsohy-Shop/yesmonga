package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;

/* renamed from: com.google.android.gms.internal.gtm.e4 */
public final class C41226e4 extends BroadcastReceiver {
    @C40974d0

    /* renamed from: d */
    public static final String f104560d = "com.google.android.gms.internal.gtm.e4";

    /* renamed from: a */
    public final C41607u0 f104561a;

    /* renamed from: b */
    public boolean f104562b;

    /* renamed from: c */
    public boolean f104563c;

    public C41226e4(C41607u0 u0Var) {
        C40843u.m166202l(u0Var);
        this.f104561a = u0Var;
    }

    /* renamed from: a */
    public final void mo135330a() {
        this.f104561a.mo135902m();
        this.f104561a.mo135896f();
        if (!this.f104562b) {
            Context a = this.f104561a.mo135891a();
            a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentFilter.addCategory(a.getPackageName());
            a.registerReceiver(this, intentFilter);
            this.f104563c = mo135334e();
            this.f104561a.mo135902m().mo135760w("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f104563c));
            this.f104562b = true;
        }
    }

    @C40974d0
    /* renamed from: b */
    public final void mo135331b() {
        Context a = this.f104561a.mo135891a();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(a.getPackageName());
        intent.putExtra(f104560d, true);
        a.sendOrderedBroadcast(intent, (String) null);
    }

    /* renamed from: c */
    public final void mo135332c() {
        if (this.f104562b) {
            this.f104561a.mo135902m().mo135759v("Unregistering connectivity change receiver");
            this.f104562b = false;
            this.f104563c = false;
            try {
                this.f104561a.mo135891a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f104561a.mo135902m().mo135755r("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo135333d() {
        if (!this.f104562b) {
            this.f104561a.mo135902m().mo135762y("Connectivity unknown. Receiver not registered");
        }
        return this.f104563c;
    }

    @C40974d0
    /* renamed from: e */
    public final boolean mo135334e() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f104561a.mo135891a().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (SecurityException unused) {
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f104561a.mo135902m();
        this.f104561a.mo135896f();
        String action = intent.getAction();
        this.f104561a.mo135902m().mo135760w("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean e = mo135334e();
            if (this.f104563c != e) {
                this.f104563c = e;
                C41487p0 f = this.f104561a.mo135896f();
                f.mo135760w("Network connectivity status changed", Boolean.valueOf(e));
                f.mo135736J().mo133262i(new C41318i0(f, e));
            }
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.f104561a.mo135902m().mo135763z("NetworkBroadcastReceiver received unknown action", action);
        } else if (!intent.hasExtra(f104560d)) {
            C41487p0 f2 = this.f104561a.mo135896f();
            f2.mo135759v("Radio powered up");
            f2.mo135691a0();
        }
    }
}
