package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40504h;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.internal.C40538e;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.a2 */
public final class C40516a2 extends C40578k0 {
    @NotOnlyInitialized

    /* renamed from: f */
    public final C40504h f103320f;

    public C40516a2(C40504h hVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f103320f = hVar;
    }

    /* renamed from: H */
    public final void mo133743H(C40562h3 h3Var) {
    }

    /* renamed from: I */
    public final void mo133744I(C40562h3 h3Var) {
    }

    /* renamed from: l */
    public final <A extends C40477a.C40479b, R extends C40669r, T extends C40538e.C40539a<R, A>> T mo133752l(@C0359n0 T t) {
        return this.f103320f.mo133720n(t);
    }

    /* renamed from: m */
    public final <A extends C40477a.C40479b, T extends C40538e.C40539a<? extends C40669r, A>> T mo133753m(@C0359n0 T t) {
        return this.f103320f.mo133726t(t);
    }

    /* renamed from: q */
    public final Context mo133756q() {
        return this.f103320f.mo133729w();
    }

    /* renamed from: r */
    public final Looper mo133757r() {
        return this.f103320f.mo133732z();
    }
}
