package com.carrefour.fid.android.presentation.viewmodels.account.list.shopping;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.b */
public final class C25884b implements C10324h<C25882a> {

    /* renamed from: a */
    public final Provider<C13783a> f63365a;

    /* renamed from: b */
    public final Provider<C13814a> f63366b;

    /* renamed from: c */
    public final Provider<C28994a> f63367c;

    public C25884b(Provider<C13783a> provider, Provider<C13814a> provider2, Provider<C28994a> provider3) {
        this.f63365a = provider;
        this.f63366b = provider2;
        this.f63367c = provider3;
    }

    /* renamed from: a */
    public static C25884b m110937a(Provider<C13783a> provider, Provider<C13814a> provider2, Provider<C28994a> provider3) {
        return new C25884b(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C25882a m110938c(C13783a aVar, C13814a aVar2, C28994a aVar3) {
        return new C25882a(aVar, aVar2, aVar3);
    }

    /* renamed from: b */
    public C25882a get() {
        return m110938c(this.f63365a.get(), this.f63366b.get(), this.f63367c.get());
    }
}
