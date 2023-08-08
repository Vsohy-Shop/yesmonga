package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.C0339g;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.u1 */
public final class C40845u1 extends C40754e1 {

    /* renamed from: g */
    public final /* synthetic */ C40747e f103949g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C0339g
    public C40845u1(C40747e eVar, @C0363p0 int i, Bundle bundle) {
        super(eVar, i, (Bundle) null);
        this.f103949g = eVar;
    }

    /* renamed from: f */
    public final void mo134378f(ConnectionResult connectionResult) {
        if (!this.f103949g.mo134330B() || !C40747e.m165799p0(this.f103949g)) {
            this.f103949g.f103830r.mo134010a(connectionResult);
            this.f103949g.mo134346U(connectionResult);
            return;
        }
        C40747e.m165796l0(this.f103949g, 16);
    }

    /* renamed from: g */
    public final boolean mo134379g() {
        this.f103949g.f103830r.mo134010a(ConnectionResult.f103129S0);
        return true;
    }
}
