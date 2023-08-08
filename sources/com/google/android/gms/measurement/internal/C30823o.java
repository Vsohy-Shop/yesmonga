package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.C42287z0;

/* renamed from: com.google.android.gms.measurement.internal.o */
public abstract class C30823o {

    /* renamed from: d */
    public static volatile Handler f73821d;

    /* renamed from: a */
    public final C30667b6 f73822a;

    /* renamed from: b */
    public final Runnable f73823b;

    /* renamed from: c */
    public volatile long f73824c;

    public C30823o(C30667b6 b6Var) {
        C40843u.m166202l(b6Var);
        this.f73822a = b6Var;
        this.f73823b = new C30811n(this, b6Var);
    }

    /* renamed from: b */
    public final void mo87394b() {
        this.f73824c = 0;
        mo87397f().removeCallbacks(this.f73823b);
    }

    /* renamed from: c */
    public abstract void mo87340c();

    /* renamed from: d */
    public final void mo87395d(long j) {
        mo87394b();
        if (j >= 0) {
            this.f73824c = this.f73822a.mo86900a().mo134768a();
            if (!mo87397f().postDelayed(this.f73823b, j)) {
                this.f73822a.mo86903d().mo87489r().mo87464b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo87396e() {
        return this.f73824c != 0;
    }

    /* renamed from: f */
    public final Handler mo87397f() {
        Handler handler;
        if (f73821d != null) {
            return f73821d;
        }
        synchronized (C30823o.class) {
            if (f73821d == null) {
                f73821d = new C42287z0(this.f73822a.mo86902c().getMainLooper());
            }
            handler = f73821d;
        }
        return handler;
    }
}
