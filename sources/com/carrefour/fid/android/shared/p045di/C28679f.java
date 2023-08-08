package com.carrefour.fid.android.shared.p045di;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.shared.di.f */
public final class C28679f implements C10324h<CoroutineDispatcher> {

    /* renamed from: a */
    public final C28656a f70274a;

    public C28679f(C28656a aVar) {
        this.f70274a = aVar;
    }

    /* renamed from: a */
    public static C28679f m118662a(C28656a aVar) {
        return new C28679f(aVar);
    }

    /* renamed from: c */
    public static CoroutineDispatcher m118663c(C28656a aVar) {
        return (CoroutineDispatcher) C10335o.m38554f(aVar.mo83582e());
    }

    /* renamed from: b */
    public CoroutineDispatcher get() {
        return m118663c(this.f70274a);
    }
}
