package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.internal.C40538e;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.b1 */
public final class C40521b1 implements C40579k1 {
    @NotOnlyInitialized

    /* renamed from: a */
    public final C40596n1 f103322a;

    public C40521b1(C40596n1 n1Var) {
        this.f103322a = n1Var;
    }

    /* renamed from: a */
    public final void mo133821a(@C0363p0 Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo133822b() {
        for (C40477a.C40489f f : this.f103322a.f103503s.values()) {
            f.mo133674f();
        }
        this.f103322a.f103496A.f103451s = Collections.emptySet();
    }

    /* renamed from: c */
    public final void mo133823c() {
        this.f103322a.mo133996d();
    }

    /* renamed from: d */
    public final void mo133824d(ConnectionResult connectionResult, C40477a aVar, boolean z) {
    }

    /* renamed from: e */
    public final void mo133825e(int i) {
    }

    /* renamed from: f */
    public final C40538e.C40539a mo133826f(C40538e.C40539a aVar) {
        this.f103322a.f103496A.f103443k.add(aVar);
        return aVar;
    }

    /* renamed from: g */
    public final boolean mo133827g() {
        return true;
    }

    /* renamed from: h */
    public final C40538e.C40539a mo133828h(C40538e.C40539a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
