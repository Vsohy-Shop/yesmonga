package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.common.api.internal.z3 */
public final class C40659z3 implements C40507i.C40509b, C40507i.C40510c {

    /* renamed from: n */
    public final C40477a f103632n;

    /* renamed from: o */
    public final boolean f103633o;
    @C0363p0

    /* renamed from: p */
    public C40518a4 f103634p;

    public C40659z3(C40477a aVar, boolean z) {
        this.f103632n = aVar;
        this.f103633o = z;
    }

    /* renamed from: H0 */
    public final void mo133865H0(int i) {
        mo134095b().mo133865H0(i);
    }

    /* renamed from: O0 */
    public final void mo133896O0(@C0359n0 ConnectionResult connectionResult) {
        mo134095b().mo133838T6(connectionResult, this.f103632n, this.f103633o);
    }

    /* renamed from: a */
    public final void mo134094a(C40518a4 a4Var) {
        this.f103634p = a4Var;
    }

    /* renamed from: b */
    public final C40518a4 mo134095b() {
        C40843u.m166203m(this.f103634p, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f103634p;
    }

    /* renamed from: m0 */
    public final void mo133866m0(@C0363p0 Bundle bundle) {
        mo134095b().mo133866m0(bundle);
    }
}
