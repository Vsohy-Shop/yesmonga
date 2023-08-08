package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.C0353k0;
import com.google.android.gms.internal.measurement.C42151r0;
import com.google.android.gms.internal.measurement.C42168s0;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
public final class C30804m4 implements ServiceConnection {

    /* renamed from: c */
    public final String f73742c;

    /* renamed from: d */
    public final /* synthetic */ C30816n4 f73743d;

    public C30804m4(C30816n4 n4Var, String str) {
        this.f73743d = n4Var;
        this.f73742c = str;
    }

    @C0353k0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                C42168s0 H0 = C42151r0.m170775H0(iBinder);
                if (H0 == null) {
                    this.f73743d.f73765a.mo86903d().mo87494w().mo87463a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f73743d.f73765a.mo86903d().mo87493v().mo87463a("Install Referrer Service connected");
                this.f73743d.f73765a.mo86904f().mo86950z(new C30792l4(this, H0, this));
            } catch (RuntimeException e) {
                this.f73743d.f73765a.mo86903d().mo87494w().mo87464b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f73743d.f73765a.mo86903d().mo87494w().mo87463a("Install Referrer connection returned with null binder");
        }
    }

    @C0353k0
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f73743d.f73765a.mo86903d().mo87493v().mo87463a("Install Referrer Service disconnected");
    }
}
