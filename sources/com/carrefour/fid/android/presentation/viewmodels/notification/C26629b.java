package com.carrefour.fid.android.presentation.viewmodels.notification;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.notification.b */
public final class C26629b implements C10324h<C26628a> {

    /* renamed from: a */
    public final Provider<C13783a> f65033a;

    public C26629b(Provider<C13783a> provider) {
        this.f65033a = provider;
    }

    /* renamed from: a */
    public static C26629b m113211a(Provider<C13783a> provider) {
        return new C26629b(provider);
    }

    /* renamed from: c */
    public static C26628a m113212c(C13783a aVar) {
        return new C26628a(aVar);
    }

    /* renamed from: b */
    public C26628a get() {
        return m113212c(this.f65033a.get());
    }
}
