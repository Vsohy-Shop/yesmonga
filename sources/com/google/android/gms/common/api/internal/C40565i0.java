package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.C0353k0;
import androidx.collection.C1869c;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
public final class C40565i0 extends C40639v3 {

    /* renamed from: f */
    public final C1869c f103419f = new C1869c();

    /* renamed from: g */
    public final C40564i f103420g;

    @C40974d0
    public C40565i0(C40587m mVar, C40564i iVar, C40713g gVar) {
        super(mVar, gVar);
        this.f103420g = iVar;
        this.f103291a.mo133930o("ConnectionlessLifecycleHelper", this);
    }

    @C0353k0
    /* renamed from: v */
    public static void m165123v(Activity activity, C40564i iVar, C40525c cVar) {
        C40587m c = LifecycleCallback.m164865c(activity);
        C40565i0 i0Var = (C40565i0) c.mo133938x("ConnectionlessLifecycleHelper", C40565i0.class);
        if (i0Var == null) {
            i0Var = new C40565i0(c, iVar, C40713g.m165640x());
        }
        C40843u.m166203m(cVar, "ApiKey cannot be null");
        i0Var.f103419f.add(cVar);
        iVar.mo133949d(i0Var);
    }

    /* renamed from: i */
    public final void mo133806i() {
        super.mo133806i();
        mo133963w();
    }

    /* renamed from: k */
    public final void mo133808k() {
        super.mo133808k();
        mo133963w();
    }

    /* renamed from: l */
    public final void mo87750l() {
        super.mo87750l();
        this.f103420g.mo133950e(this);
    }

    /* renamed from: n */
    public final void mo133960n(ConnectionResult connectionResult, int i) {
        this.f103420g.mo133946M(connectionResult, i);
    }

    /* renamed from: o */
    public final void mo133961o() {
        this.f103420g.mo133947b();
    }

    /* renamed from: u */
    public final C1869c mo133962u() {
        return this.f103419f;
    }

    /* renamed from: w */
    public final void mo133963w() {
        if (!this.f103419f.isEmpty()) {
            this.f103420g.mo133949d(this);
        }
    }
}
