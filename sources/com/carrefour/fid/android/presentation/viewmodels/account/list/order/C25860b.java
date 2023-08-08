package com.carrefour.fid.android.presentation.viewmodels.account.list.order;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.order.b */
public final class C25860b implements C10324h<C25858a> {

    /* renamed from: a */
    public final Provider<C13783a> f63314a;

    public C25860b(Provider<C13783a> provider) {
        this.f63314a = provider;
    }

    /* renamed from: a */
    public static C25860b m110846a(Provider<C13783a> provider) {
        return new C25860b(provider);
    }

    /* renamed from: c */
    public static C25858a m110847c(C13783a aVar) {
        return new C25858a(aVar);
    }

    /* renamed from: b */
    public C25858a get() {
        return m110847c(this.f63314a.get());
    }
}
