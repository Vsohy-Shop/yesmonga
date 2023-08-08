package com.google.android.gms.common.api.internal;

import androidx.annotation.C0344h1;
import com.google.errorprone.annotations.C32488a;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.e1 */
public final class C40542e1 extends C40512a {

    /* renamed from: a */
    public final WeakReference f103359a;

    @C0344h1(otherwise = 2)
    public C40542e1(C40533d0 d0Var) {
        this.f103359a = new WeakReference(d0Var);
    }

    @C32488a
    /* renamed from: b */
    public final C40512a mo133809b(Runnable runnable) {
        C40533d0 d0Var = (C40533d0) this.f103359a.get();
        if (d0Var != null) {
            d0Var.mo133864o(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
