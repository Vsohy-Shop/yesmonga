package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;

/* renamed from: com.google.android.gms.measurement.internal.d4 */
public final class C30691d4 extends BroadcastReceiver {
    @C40974d0

    /* renamed from: d */
    public static final String f73283d = "com.google.android.gms.measurement.internal.d4";

    /* renamed from: a */
    public final C30822na f73284a;

    /* renamed from: b */
    public boolean f73285b;

    /* renamed from: c */
    public boolean f73286c;

    public C30691d4(C30822na naVar) {
        C40843u.m166202l(naVar);
        this.f73284a = naVar;
    }

    @C0348i1
    /* renamed from: b */
    public final void mo86939b() {
        this.f73284a.mo87369g();
        this.f73284a.mo86904f().mo86866h();
        if (!this.f73285b) {
            this.f73284a.mo86902c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f73286c = this.f73284a.mo87362Y().mo86868m();
            this.f73284a.mo86903d().mo87493v().mo87464b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f73286c));
            this.f73285b = true;
        }
    }

    @C0348i1
    /* renamed from: c */
    public final void mo86940c() {
        this.f73284a.mo87369g();
        this.f73284a.mo86904f().mo86866h();
        this.f73284a.mo86904f().mo86866h();
        if (this.f73285b) {
            this.f73284a.mo86903d().mo87493v().mo87463a("Unregistering connectivity change receiver");
            this.f73285b = false;
            this.f73286c = false;
            try {
                this.f73284a.mo86902c().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f73284a.mo86903d().mo87489r().mo87464b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @C0353k0
    public final void onReceive(Context context, Intent intent) {
        this.f73284a.mo87369g();
        String action = intent.getAction();
        this.f73284a.mo86903d().mo87493v().mo87464b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m = this.f73284a.mo87362Y().mo86868m();
            if (this.f73286c != m) {
                this.f73286c = m;
                this.f73284a.mo86904f().mo86950z(new C30678c4(this, m));
                return;
            }
            return;
        }
        this.f73284a.mo86903d().mo87494w().mo87464b("NetworkBroadcastReceiver received unknown action", action);
    }
}
