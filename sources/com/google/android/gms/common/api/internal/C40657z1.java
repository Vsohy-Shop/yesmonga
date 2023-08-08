package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.internal.C40747e;
import com.google.android.gms.common.internal.C40785m;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.z1 */
public final class C40657z1 implements C40747e.C40750c, C40653y2 {

    /* renamed from: a */
    public final C40477a.C40489f f103618a;

    /* renamed from: b */
    public final C40525c f103619b;
    @C0363p0

    /* renamed from: c */
    public C40785m f103620c = null;
    @C0363p0

    /* renamed from: d */
    public Set f103621d = null;

    /* renamed from: e */
    public boolean f103622e = false;

    /* renamed from: f */
    public final /* synthetic */ C40564i f103623f;

    public C40657z1(C40564i iVar, C40477a.C40489f fVar, C40525c cVar) {
        this.f103623f = iVar;
        this.f103618a = fVar;
        this.f103619b = cVar;
    }

    /* renamed from: a */
    public final void mo134010a(@C0359n0 ConnectionResult connectionResult) {
        this.f103623f.f103417r.post(new C40652y1(this, connectionResult));
    }

    @C0348i1
    /* renamed from: b */
    public final void mo134087b(@C0363p0 C40785m mVar, @C0363p0 Set set) {
        if (mVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo134088c(new ConnectionResult(4));
            return;
        }
        this.f103620c = mVar;
        this.f103621d = set;
        mo134091h();
    }

    @C0348i1
    /* renamed from: c */
    public final void mo134088c(ConnectionResult connectionResult) {
        C40637v1 v1Var = (C40637v1) this.f103623f.f103413n.get(this.f103619b);
        if (v1Var != null) {
            v1Var.mo134048F(connectionResult);
        }
    }

    @C0348i1
    /* renamed from: h */
    public final void mo134091h() {
        C40785m mVar;
        if (this.f103622e && (mVar = this.f103620c) != null) {
            this.f103618a.mo133681p(mVar, this.f103621d);
        }
    }
}
