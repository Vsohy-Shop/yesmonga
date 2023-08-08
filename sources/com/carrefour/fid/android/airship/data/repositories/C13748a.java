package com.carrefour.fid.android.airship.data.repositories;

import com.carrefour.fid.android.airship.data.datasource.C13742a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.IoDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.airship.data.repositories.a */
public final class C13748a implements C10324h<GoogleAdsImpl> {

    /* renamed from: a */
    public final Provider<C13742a> f33388a;

    /* renamed from: b */
    public final Provider<CoroutineDispatcher> f33389b;

    public C13748a(Provider<C13742a> provider, Provider<CoroutineDispatcher> provider2) {
        this.f33388a = provider;
        this.f33389b = provider2;
    }

    /* renamed from: a */
    public static C13748a m58622a(Provider<C13742a> provider, Provider<CoroutineDispatcher> provider2) {
        return new C13748a(provider, provider2);
    }

    /* renamed from: c */
    public static GoogleAdsImpl m58623c(C13742a aVar, CoroutineDispatcher coroutineDispatcher) {
        return new GoogleAdsImpl(aVar, coroutineDispatcher);
    }

    /* renamed from: b */
    public GoogleAdsImpl get() {
        return m58623c(this.f33388a.get(), this.f33389b.get());
    }
}
