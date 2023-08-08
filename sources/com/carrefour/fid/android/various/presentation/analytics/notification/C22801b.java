package com.carrefour.fid.android.various.presentation.analytics.notification;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.various.presentation.analytics.notification.b */
public final class C22801b implements C10324h<C22799a> {

    /* renamed from: a */
    public final Provider<C13783a> f58364a;

    public C22801b(Provider<C13783a> provider) {
        this.f58364a = provider;
    }

    /* renamed from: a */
    public static C22801b m103049a(Provider<C13783a> provider) {
        return new C22801b(provider);
    }

    /* renamed from: c */
    public static C22799a m103050c(C13783a aVar) {
        return new C22799a(aVar);
    }

    /* renamed from: b */
    public C22799a get() {
        return m103050c(this.f58364a.get());
    }
}
