package com.carrefour.fid.android.shared.p045di;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.shared.di.e */
public final class C28678e implements C10324h<CoroutineDispatcher> {

    /* renamed from: a */
    public final C28656a f70273a;

    public C28678e(C28656a aVar) {
        this.f70273a = aVar;
    }

    /* renamed from: a */
    public static C28678e m118659a(C28656a aVar) {
        return new C28678e(aVar);
    }

    /* renamed from: c */
    public static CoroutineDispatcher m118660c(C28656a aVar) {
        return (CoroutineDispatcher) C10335o.m38554f(aVar.mo83581d());
    }

    /* renamed from: b */
    public CoroutineDispatcher get() {
        return m118660c(this.f70273a);
    }
}
