package com.carrefour.fid.android.presentation.viewmodels.account.anonymous;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.anonymous.b */
public final class C25756b implements C10324h<C25755a> {

    /* renamed from: a */
    public final Provider<C13783a> f63096a;

    public C25756b(Provider<C13783a> provider) {
        this.f63096a = provider;
    }

    /* renamed from: a */
    public static C25756b m110522a(Provider<C13783a> provider) {
        return new C25756b(provider);
    }

    /* renamed from: c */
    public static C25755a m110523c(C13783a aVar) {
        return new C25755a(aVar);
    }

    /* renamed from: b */
    public C25755a get() {
        return m110523c(this.f63096a.get());
    }
}
