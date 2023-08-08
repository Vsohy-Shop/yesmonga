package com.carrefour.fid.android.presentation.viewmodels.home;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.c */
public final class C26382c implements C10324h<C26380a> {

    /* renamed from: a */
    public final Provider<C13783a> f64517a;

    public C26382c(Provider<C13783a> provider) {
        this.f64517a = provider;
    }

    /* renamed from: a */
    public static C26382c m112723a(Provider<C13783a> provider) {
        return new C26382c(provider);
    }

    /* renamed from: c */
    public static C26380a m112724c(C13783a aVar) {
        return new C26380a(aVar);
    }

    /* renamed from: b */
    public C26380a get() {
        return m112724c(this.f64517a.get());
    }
}
