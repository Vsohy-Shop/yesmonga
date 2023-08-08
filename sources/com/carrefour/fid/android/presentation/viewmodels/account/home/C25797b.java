package com.carrefour.fid.android.presentation.viewmodels.account.home;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.tracking.C28994a;
import com.carrefour.fid.android.tracking.C28995b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.home.b */
public final class C25797b implements C10324h<C25796a> {

    /* renamed from: a */
    public final Provider<C13783a> f63184a;

    /* renamed from: b */
    public final Provider<C28994a> f63185b;

    /* renamed from: c */
    public final Provider<C28995b> f63186c;

    public C25797b(Provider<C13783a> provider, Provider<C28994a> provider2, Provider<C28995b> provider3) {
        this.f63184a = provider;
        this.f63185b = provider2;
        this.f63186c = provider3;
    }

    /* renamed from: a */
    public static C25797b m110652a(Provider<C13783a> provider, Provider<C28994a> provider2, Provider<C28995b> provider3) {
        return new C25797b(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C25796a m110653c(C13783a aVar, C28994a aVar2, C28995b bVar) {
        return new C25796a(aVar, aVar2, bVar);
    }

    /* renamed from: b */
    public C25796a get() {
        return m110653c(this.f63184a.get(), this.f63185b.get(), this.f63186c.get());
    }
}
