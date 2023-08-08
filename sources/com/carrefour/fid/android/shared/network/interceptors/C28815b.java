package com.carrefour.fid.android.shared.network.interceptors;

import com.carrefour.fid.android.shared.data.headers.C28644e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.shared.network.interceptors.b */
public final class C28815b implements C10324h<C28814a> {

    /* renamed from: a */
    public final Provider<C28644e> f70612a;

    public C28815b(Provider<C28644e> provider) {
        this.f70612a = provider;
    }

    /* renamed from: a */
    public static C28815b m119243a(Provider<C28644e> provider) {
        return new C28815b(provider);
    }

    /* renamed from: c */
    public static C28814a m119244c(C28644e eVar) {
        return new C28814a(eVar);
    }

    /* renamed from: b */
    public C28814a get() {
        return m119244c(this.f70612a.get());
    }
}
