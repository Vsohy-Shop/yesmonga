package com.carrefour.fid.android.shared.p045di;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.DefaultDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.shared.di.c */
public final class C28676c implements C10324h<CoroutineDispatcher> {

    /* renamed from: a */
    public final C28656a f70271a;

    public C28676c(C28656a aVar) {
        this.f70271a = aVar;
    }

    /* renamed from: a */
    public static C28676c m118653a(C28656a aVar) {
        return new C28676c(aVar);
    }

    /* renamed from: c */
    public static CoroutineDispatcher m118654c(C28656a aVar) {
        return (CoroutineDispatcher) C10335o.m38554f(aVar.mo83579b());
    }

    /* renamed from: b */
    public CoroutineDispatcher get() {
        return m118654c(this.f70271a);
    }
}
