package com.google.android.gms.common.api.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40662l;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.C40670s;
import com.google.android.gms.common.api.C40672u;
import com.google.android.gms.common.api.C40673v;
import java.util.concurrent.TimeUnit;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.r */
public final class C40614r<R extends C40669r> extends C40662l<R> {

    /* renamed from: a */
    public final BasePendingResult f103548a;

    public C40614r(@C0359n0 C40663m mVar) {
        this.f103548a = (BasePendingResult) mVar;
    }

    /* renamed from: c */
    public final void mo133783c(@C0359n0 C40663m.C40664a aVar) {
        this.f103548a.mo133783c(aVar);
    }

    @C0359n0
    /* renamed from: d */
    public final R mo133784d() {
        return this.f103548a.mo133784d();
    }

    @C0359n0
    /* renamed from: e */
    public final R mo133785e(long j, @C0359n0 TimeUnit timeUnit) {
        return this.f103548a.mo133785e(j, timeUnit);
    }

    /* renamed from: f */
    public final void mo133687f() {
        this.f103548a.mo133687f();
    }

    /* renamed from: g */
    public final boolean mo133786g() {
        return this.f103548a.mo133786g();
    }

    /* renamed from: h */
    public final void mo133787h(@C0359n0 C40670s<? super R> sVar) {
        this.f103548a.mo133787h(sVar);
    }

    /* renamed from: i */
    public final void mo133788i(@C0359n0 C40670s<? super R> sVar, long j, @C0359n0 TimeUnit timeUnit) {
        this.f103548a.mo133788i(sVar, j, timeUnit);
    }

    @C0359n0
    /* renamed from: j */
    public final <S extends C40669r> C40673v<S> mo133789j(@C0359n0 C40672u<? super R, ? extends S> uVar) {
        return this.f103548a.mo133789j(uVar);
    }

    @C0359n0
    /* renamed from: k */
    public final R mo134017k() {
        if (this.f103548a.mo133791m()) {
            return this.f103548a.mo133785e(0, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    /* renamed from: l */
    public final boolean mo134018l() {
        return this.f103548a.mo133791m();
    }
}
