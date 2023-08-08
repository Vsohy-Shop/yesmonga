package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.signin.C30979f;

/* renamed from: com.google.android.gms.common.api.internal.x0 */
public final class C40646x0 implements C40507i.C40509b, C40507i.C40510c {

    /* renamed from: n */
    public final /* synthetic */ C40515a1 f103609n;

    public /* synthetic */ C40646x0(C40515a1 a1Var, C40641w0 w0Var) {
        this.f103609n = a1Var;
    }

    /* renamed from: H0 */
    public final void mo133865H0(int i) {
    }

    /* renamed from: O0 */
    public final void mo133896O0(@C0359n0 ConnectionResult connectionResult) {
        this.f103609n.f103300b.lock();
        try {
            if (this.f103609n.mo133837q(connectionResult)) {
                this.f103609n.mo133829i();
                this.f103609n.mo133834n();
            } else {
                this.f103609n.mo133832l(connectionResult);
            }
        } finally {
            this.f103609n.f103300b.unlock();
        }
    }

    /* renamed from: m0 */
    public final void mo133866m0(@C0363p0 Bundle bundle) {
        C40756f fVar = (C40756f) C40843u.m166202l(this.f103609n.f103316r);
        ((C30979f) C40843u.m166202l(this.f103609n.f103309k)).mo87657s(new C40636v0(this.f103609n));
    }
}
