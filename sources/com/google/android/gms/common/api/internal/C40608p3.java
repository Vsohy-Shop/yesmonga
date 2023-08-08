package com.google.android.gms.common.api.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40507i;

/* renamed from: com.google.android.gms.common.api.internal.p3 */
public final class C40608p3 implements C40507i.C40510c {

    /* renamed from: n */
    public final int f103539n;

    /* renamed from: o */
    public final C40507i f103540o;
    @C0363p0

    /* renamed from: p */
    public final C40507i.C40510c f103541p;

    /* renamed from: q */
    public final /* synthetic */ C40613q3 f103542q;

    public C40608p3(C40613q3 q3Var, int i, @C0363p0 C40507i iVar, C40507i.C40510c cVar) {
        this.f103542q = q3Var;
        this.f103539n = i;
        this.f103540o = iVar;
        this.f103541p = cVar;
    }

    /* renamed from: O0 */
    public final void mo133896O0(@C0359n0 ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.f103542q.mo134078t(connectionResult, this.f103539n);
    }
}
