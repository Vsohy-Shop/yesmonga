package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.analytics.C40372a0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.stats.C40954b;
import com.google.android.gms.common.util.C40974d0;
import java.util.Collections;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.c1 */
public final class C41175c1 extends C41535r0 {

    /* renamed from: c */
    public final C41151b1 f104481c = new C41151b1(this);

    /* renamed from: d */
    public final C41632v1 f104482d;

    /* renamed from: e */
    public final C41515q4 f104483e;

    /* renamed from: f */
    public C41730z3 f104484f;

    public C41175c1(C41607u0 u0Var) {
        super(u0Var);
        this.f104483e = new C41515q4(u0Var.mo135907r());
        this.f104482d = new C41679x0(this, u0Var);
    }

    /* renamed from: Z */
    public static /* bridge */ /* synthetic */ void m167238Z(C41175c1 c1Var, ComponentName componentName) {
        C40372a0.m164215h();
        if (c1Var.f104484f != null) {
            c1Var.f104484f = null;
            c1Var.mo135760w("Disconnected from device AnalyticsService", componentName);
            c1Var.mo135738L().mo135698n0();
        }
    }

    /* renamed from: f0 */
    public static /* bridge */ /* synthetic */ void m167239f0(C41175c1 c1Var, C41730z3 z3Var) {
        C40372a0.m164215h();
        c1Var.f104484f = z3Var;
        c1Var.mo135159g0();
        c1Var.mo135738L().mo135697g0();
    }

    /* renamed from: W */
    public final void mo133294W() {
    }

    /* renamed from: a0 */
    public final void mo135154a0() {
        C40372a0.m164215h();
        mo135794T();
        try {
            C40954b.m166547b().mo134752c(mo135734G(), this.f104481c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.f104484f != null) {
            this.f104484f = null;
            mo135738L().mo135698n0();
        }
    }

    /* renamed from: b0 */
    public final boolean mo135155b0() {
        C40372a0.m164215h();
        mo135794T();
        C41730z3 z3Var = this.f104484f;
        if (z3Var == null) {
            return false;
        }
        try {
            z3Var.mo136119f();
            mo135159g0();
            return true;
        } catch (RemoteException unused) {
            mo135759v("Failed to clear hits from AnalyticsService");
            return false;
        }
    }

    /* renamed from: c0 */
    public final boolean mo135156c0() {
        C40372a0.m164215h();
        mo135794T();
        if (this.f104484f != null) {
            return true;
        }
        C41730z3 a = this.f104481c.mo135058a();
        if (a == null) {
            return false;
        }
        this.f104484f = a;
        mo135159g0();
        return true;
    }

    /* renamed from: d0 */
    public final boolean mo135157d0() {
        C40372a0.m164215h();
        mo135794T();
        if (this.f104484f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public final boolean mo135158e0(C41706y3 y3Var) {
        String str;
        C40843u.m166202l(y3Var);
        C40372a0.m164215h();
        mo135794T();
        C41730z3 z3Var = this.f104484f;
        if (z3Var == null) {
            return false;
        }
        if (y3Var.mo136097h()) {
            mo135742P();
            str = C41560s1.m168322i();
        } else {
            mo135742P();
            str = C41560s1.m168324k();
        }
        try {
            z3Var.mo136118E8(y3Var.mo136096g(), y3Var.mo136094d(), str, Collections.emptyList());
            mo135159g0();
            return true;
        } catch (RemoteException unused) {
            mo135759v("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    /* renamed from: g0 */
    public final void mo135159g0() {
        this.f104483e.mo135770b();
        C41632v1 v1Var = this.f104482d;
        mo135742P();
        v1Var.mo135957g(C41634v3.f105107L.mo135909b().longValue());
    }
}
