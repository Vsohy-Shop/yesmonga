package com.carrefour.fid.android.presentation.viewmodels.account.list.home;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.home.b */
public final class C25808b implements C10324h<C25807a> {

    /* renamed from: a */
    public final Provider<C13783a> f63215a;

    public C25808b(Provider<C13783a> provider) {
        this.f63215a = provider;
    }

    /* renamed from: a */
    public static C25808b m110686a(Provider<C13783a> provider) {
        return new C25808b(provider);
    }

    /* renamed from: c */
    public static C25807a m110687c(C13783a aVar) {
        return new C25807a(aVar);
    }

    /* renamed from: b */
    public C25807a get() {
        return m110687c(this.f63215a.get());
    }
}
