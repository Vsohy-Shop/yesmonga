package com.carrefour.fid.android.presentation.trackers.account;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.trackers.account.b */
public final class C38532b implements C10324h<C38531a> {

    /* renamed from: a */
    public final Provider<C13783a> f97677a;

    public C38532b(Provider<C13783a> provider) {
        this.f97677a = provider;
    }

    /* renamed from: a */
    public static C38532b m159843a(Provider<C13783a> provider) {
        return new C38532b(provider);
    }

    /* renamed from: c */
    public static C38531a m159844c(C13783a aVar) {
        return new C38531a(aVar);
    }

    /* renamed from: b */
    public C38531a get() {
        return m159844c(this.f97677a.get());
    }
}
