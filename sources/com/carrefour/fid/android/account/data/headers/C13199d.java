package com.carrefour.fid.android.account.data.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.data.headers.d */
public final class C13199d implements C10324h<C13198c> {

    /* renamed from: a */
    public final Provider<C28640a> f32364a;

    public C13199d(Provider<C28640a> provider) {
        this.f32364a = provider;
    }

    /* renamed from: a */
    public static C13199d m57188a(Provider<C28640a> provider) {
        return new C13199d(provider);
    }

    /* renamed from: c */
    public static C13198c m57189c(C28640a aVar) {
        return new C13198c(aVar);
    }

    /* renamed from: b */
    public C13198c get() {
        return m57189c(this.f32364a.get());
    }
}
