package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gtm.u7 */
public final class C41614u7 implements Runnable {

    /* renamed from: a */
    public boolean f105057a = false;

    /* renamed from: b */
    public final /* synthetic */ String f105058b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f105059c;

    /* renamed from: d */
    public final /* synthetic */ String f105060d;

    /* renamed from: e */
    public final /* synthetic */ long f105061e;

    /* renamed from: f */
    public final /* synthetic */ String f105062f;

    /* renamed from: g */
    public final /* synthetic */ C41638v7 f105063g;

    public C41614u7(C41638v7 v7Var, String str, Bundle bundle, String str2, long j, String str3) {
        this.f105063g = v7Var;
        this.f105058b = str;
        this.f105059c = bundle;
        this.f105060d = str2;
        this.f105061e = j;
        this.f105062f = str3;
    }

    public final void run() {
        if (this.f105063g.f105154n.f104760l == 3) {
            this.f105063g.f105154n.f104752d.mo135854b(this.f105058b, this.f105059c, this.f105060d, this.f105061e, true);
        } else if (this.f105063g.f105154n.f104760l == 4) {
            C41493p6.m168152d(String.format("Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = %s, origin = %s, params = %s.", new Object[]{this.f105058b, this.f105060d, this.f105059c}));
            try {
                this.f105063g.f105154n.f104750b.mo87697o2(this.f105060d, this.f105058b, this.f105059c, this.f105061e);
            } catch (RemoteException e) {
                C41660w5.m168644b("Error logging event on measurement proxy: ", e, this.f105063g.f105154n.f104749a);
            }
        } else if (this.f105063g.f105154n.f104760l != 1 && this.f105063g.f105154n.f104760l != 2) {
            int a = this.f105063g.f105154n.f104760l;
            StringBuilder sb = new StringBuilder(28);
            sb.append("Unexpected state:");
            sb.append(a);
            C41660w5.m168645c(sb.toString(), this.f105063g.f105154n.f104749a);
        } else if (!this.f105057a) {
            C41493p6.m168152d(String.format("Container not loaded yet: deferring event interceptor by enqueuing the event: name = %s, origin = %s, params = %s.", new Object[]{this.f105058b, this.f105062f, this.f105059c}));
            this.f105057a = true;
            this.f105063g.f105154n.f104761m.add(this);
        } else {
            C41660w5.m168645c("Invalid state - not expecting to see a deferredevent during container loading.", this.f105063g.f105154n.f104749a);
        }
    }
}
