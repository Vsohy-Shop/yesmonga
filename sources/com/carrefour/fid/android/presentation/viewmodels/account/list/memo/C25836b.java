package com.carrefour.fid.android.presentation.viewmodels.account.list.memo;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.b */
public final class C25836b implements C10324h<C25835a> {

    /* renamed from: a */
    public final Provider<C13783a> f63272a;

    /* renamed from: b */
    public final Provider<C28994a> f63273b;

    public C25836b(Provider<C13783a> provider, Provider<C28994a> provider2) {
        this.f63272a = provider;
        this.f63273b = provider2;
    }

    /* renamed from: a */
    public static C25836b m110782a(Provider<C13783a> provider, Provider<C28994a> provider2) {
        return new C25836b(provider, provider2);
    }

    /* renamed from: c */
    public static C25835a m110783c(C13783a aVar, C28994a aVar2) {
        return new C25835a(aVar, aVar2);
    }

    /* renamed from: b */
    public C25835a get() {
        return m110783c(this.f63272a.get(), this.f63273b.get());
    }
}
