package com.carrefour.fid.android.shared.network.interceptors;

import com.carrefour.fid.android.shared.network.C28802c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.shared.network.interceptors.n */
public final class C28834n implements C10324h<C28833m> {

    /* renamed from: a */
    public final Provider<C28802c> f70632a;

    public C28834n(Provider<C28802c> provider) {
        this.f70632a = provider;
    }

    /* renamed from: a */
    public static C28834n m119261a(Provider<C28802c> provider) {
        return new C28834n(provider);
    }

    /* renamed from: c */
    public static C28833m m119262c(C28802c cVar) {
        return new C28833m(cVar);
    }

    /* renamed from: b */
    public C28833m get() {
        return m119262c(this.f70632a.get());
    }
}
