package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.internal.C40843u;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
public final class C40595n0 implements C40579k1 {

    /* renamed from: a */
    public final C40596n1 f103494a;

    /* renamed from: b */
    public boolean f103495b = false;

    public C40595n0(C40596n1 n1Var) {
        this.f103494a = n1Var;
    }

    /* renamed from: a */
    public final void mo133821a(@C0363p0 Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo133822b() {
    }

    /* renamed from: c */
    public final void mo133823c() {
        if (this.f103495b) {
            this.f103495b = false;
            this.f103494a.mo133998f(new C40588m0(this, this));
        }
    }

    /* renamed from: d */
    public final void mo133824d(ConnectionResult connectionResult, C40477a aVar, boolean z) {
    }

    /* renamed from: e */
    public final void mo133825e(int i) {
        this.f103494a.mo133997e((ConnectionResult) null);
        this.f103494a.f103497B.mo133868b(i, this.f103495b);
    }

    /* renamed from: f */
    public final C40538e.C40539a mo133826f(C40538e.C40539a aVar) {
        mo133828h(aVar);
        return aVar;
    }

    /* renamed from: g */
    public final boolean mo133827g() {
        if (this.f103495b) {
            return false;
        }
        Set<C40562h3> set = this.f103494a.f103496A.f103458z;
        if (set == null || set.isEmpty()) {
            this.f103494a.mo133997e((ConnectionResult) null);
            return true;
        }
        this.f103495b = true;
        for (C40562h3 k : set) {
            k.mo133920k();
        }
        return false;
    }

    /* renamed from: h */
    public final C40538e.C40539a mo133828h(C40538e.C40539a aVar) {
        try {
            this.f103494a.f103496A.f103435A.mo133974a(aVar);
            C40572j1 j1Var = this.f103494a.f103496A;
            C40477a.C40489f fVar = (C40477a.C40489f) j1Var.f103450r.get(aVar.mo133874y());
            C40843u.m166203m(fVar, "Appropriate Api was not requested.");
            if (fVar.mo133669a() || !this.f103494a.f103504t.containsKey(aVar.mo133874y())) {
                aVar.mo133870A(fVar);
            } else {
                aVar.mo85730b(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f103494a.mo133998f(new C40583l0(this, this));
        }
        return aVar;
    }

    /* renamed from: j */
    public final void mo133994j() {
        if (this.f103495b) {
            this.f103495b = false;
            this.f103494a.f103496A.f103435A.mo133975b();
            mo133827g();
        }
    }
}
