package com.google.android.gms.internal.gtm;

import android.os.Handler;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.v1 */
public abstract class C41632v1 {

    /* renamed from: d */
    public static volatile Handler f105091d;

    /* renamed from: a */
    public final C41607u0 f105092a;

    /* renamed from: b */
    public final Runnable f105093b = new C41608u1(this);

    /* renamed from: c */
    public volatile long f105094c;

    public C41632v1(C41607u0 u0Var) {
        C40843u.m166202l(u0Var);
        this.f105092a = u0Var;
    }

    /* renamed from: a */
    public abstract void mo135393a();

    /* renamed from: b */
    public final long mo135954b() {
        if (this.f105094c == 0) {
            return 0;
        }
        return Math.abs(this.f105092a.mo135907r().mo134768a() - this.f105094c);
    }

    /* renamed from: e */
    public final void mo135955e(long j) {
        if (mo135958h()) {
            long j2 = 0;
            if (j < 0) {
                mo135956f();
                return;
            }
            long abs = j - Math.abs(this.f105092a.mo135907r().mo134768a() - this.f105094c);
            if (abs >= 0) {
                j2 = abs;
            }
            mo135959i().removeCallbacks(this.f105093b);
            if (!mo135959i().postDelayed(this.f105093b, j2)) {
                this.f105092a.mo135902m().mo135755r("Failed to adjust delayed post. time", Long.valueOf(j2));
            }
        }
    }

    /* renamed from: f */
    public final void mo135956f() {
        this.f105094c = 0;
        mo135959i().removeCallbacks(this.f105093b);
    }

    /* renamed from: g */
    public final void mo135957g(long j) {
        mo135956f();
        if (j >= 0) {
            this.f105094c = this.f105092a.mo135907r().mo134768a();
            if (!mo135959i().postDelayed(this.f105093b, j)) {
                this.f105092a.mo135902m().mo135755r("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: h */
    public final boolean mo135958h() {
        return this.f105094c != 0;
    }

    /* renamed from: i */
    public final Handler mo135959i() {
        Handler handler;
        if (f105091d != null) {
            return f105091d;
        }
        synchronized (C41632v1.class) {
            if (f105091d == null) {
                f105091d = new C41203d5(this.f105092a.mo135891a().getMainLooper());
            }
            handler = f105091d;
        }
        return handler;
    }
}
