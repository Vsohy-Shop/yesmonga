package com.carrefour.fid.android.shared.p045di;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.IoDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.shared.di.d */
public final class C28677d implements C10324h<CoroutineDispatcher> {

    /* renamed from: a */
    public final C28656a f70272a;

    public C28677d(C28656a aVar) {
        this.f70272a = aVar;
    }

    /* renamed from: a */
    public static C28677d m118656a(C28656a aVar) {
        return new C28677d(aVar);
    }

    /* renamed from: c */
    public static CoroutineDispatcher m118657c(C28656a aVar) {
        return (CoroutineDispatcher) C10335o.m38554f(aVar.mo83580c());
    }

    /* renamed from: b */
    public CoroutineDispatcher get() {
        return m118657c(this.f70272a);
    }
}
