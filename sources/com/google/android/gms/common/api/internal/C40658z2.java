package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.C0339g;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.C30978e;
import com.google.android.gms.signin.C30979f;
import com.google.android.gms.signin.internal.C30983c;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.z2 */
public final class C40658z2 extends C30983c implements C40507i.C40509b, C40507i.C40510c {

    /* renamed from: u */
    public static final C40477a.C40478a f103624u = C30978e.f74219c;

    /* renamed from: n */
    public final Context f103625n;

    /* renamed from: o */
    public final Handler f103626o;

    /* renamed from: p */
    public final C40477a.C40478a f103627p;

    /* renamed from: q */
    public final Set f103628q;

    /* renamed from: r */
    public final C40756f f103629r;

    /* renamed from: s */
    public C30979f f103630s;

    /* renamed from: t */
    public C40653y2 f103631t;

    @C0348i1
    public C40658z2(Context context, Handler handler, @C0359n0 C40756f fVar) {
        C40477a.C40478a aVar = f103624u;
        this.f103625n = context;
        this.f103626o = handler;
        this.f103629r = (C40756f) C40843u.m166203m(fVar, "ClientSettings must not be null");
        this.f103628q = fVar.mo134388i();
        this.f103627p = aVar;
    }

    /* renamed from: G8 */
    public static /* bridge */ /* synthetic */ void m165492G8(C40658z2 z2Var, zak zak) {
        ConnectionResult M = zak.mo87677M();
        if (M.mo133595e0()) {
            zav zav = (zav) C40843u.m166202l(zak.mo87678Q());
            ConnectionResult M2 = zav.mo134521M();
            if (!M2.mo133595e0()) {
                String valueOf = String.valueOf(M2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                z2Var.f103631t.mo134088c(M2);
                z2Var.f103630s.mo133674f();
                return;
            }
            z2Var.f103631t.mo134087b(zav.mo134522Q(), z2Var.f103628q);
        } else {
            z2Var.f103631t.mo134088c(M);
        }
        z2Var.f103630s.mo133674f();
    }

    @C0348i1
    /* renamed from: H0 */
    public final void mo133865H0(int i) {
        this.f103630s.mo133674f();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, com.google.android.gms.signin.f] */
    @C0348i1
    /* renamed from: H8 */
    public final void mo134092H8(C40653y2 y2Var) {
        C30979f fVar = this.f103630s;
        if (fVar != null) {
            fVar.mo133674f();
        }
        this.f103629r.mo134394o(Integer.valueOf(System.identityHashCode(this)));
        C40477a.C40478a aVar = this.f103627p;
        Context context = this.f103625n;
        Looper looper = this.f103626o.getLooper();
        C40756f fVar2 = this.f103629r;
        this.f103630s = aVar.mo85653c(context, looper, fVar2, fVar2.mo134390k(), this, this);
        this.f103631t = y2Var;
        Set set = this.f103628q;
        if (set == null || set.isEmpty()) {
            this.f103626o.post(new C40643w2(this));
        } else {
            this.f103630s.mo87656k();
        }
    }

    /* renamed from: I8 */
    public final void mo134093I8() {
        C30979f fVar = this.f103630s;
        if (fVar != null) {
            fVar.mo133674f();
        }
    }

    @C0348i1
    /* renamed from: O0 */
    public final void mo133896O0(@C0359n0 ConnectionResult connectionResult) {
        this.f103631t.mo134088c(connectionResult);
    }

    @C0339g
    /* renamed from: O1 */
    public final void mo87663O1(zak zak) {
        this.f103626o.post(new C40648x2(this, zak));
    }

    @C0348i1
    /* renamed from: m0 */
    public final void mo133866m0(@C0363p0 Bundle bundle) {
        this.f103630s.mo87657s(this);
    }
}
