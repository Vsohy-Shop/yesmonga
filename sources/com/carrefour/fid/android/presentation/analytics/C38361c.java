package com.carrefour.fid.android.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.analytics.c */
public final class C38361c implements C10324h<C38360b> {

    /* renamed from: a */
    public final Provider<C13783a> f97144a;

    public C38361c(Provider<C13783a> provider) {
        this.f97144a = provider;
    }

    /* renamed from: a */
    public static C38361c m158814a(Provider<C13783a> provider) {
        return new C38361c(provider);
    }

    /* renamed from: c */
    public static C38360b m158815c(C13783a aVar) {
        return new C38360b(aVar);
    }

    /* renamed from: b */
    public C38360b get() {
        return m158815c(this.f97144a.get());
    }
}
