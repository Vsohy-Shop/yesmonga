package com.google.android.gms.common.api.internal;

import androidx.annotation.C0339g;
import com.google.android.gms.signin.internal.C30983c;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.v0 */
public final class C40636v0 extends C30983c {

    /* renamed from: n */
    public final WeakReference f103588n;

    public C40636v0(C40515a1 a1Var) {
        this.f103588n = new WeakReference(a1Var);
    }

    @C0339g
    /* renamed from: O1 */
    public final void mo87663O1(zak zak) {
        C40515a1 a1Var = (C40515a1) this.f103588n.get();
        if (a1Var != null) {
            a1Var.f103299a.mo133998f(new C40631u0(this, a1Var, a1Var, zak));
        }
    }
}
