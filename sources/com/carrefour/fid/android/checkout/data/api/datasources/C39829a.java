package com.carrefour.fid.android.checkout.data.api.datasources;

import com.carrefour.fid.android.checkout.data.api.services.C39837a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.data.api.datasources.a */
public final class C39829a implements C10324h<PaymentDataSource> {

    /* renamed from: a */
    public final Provider<C39837a> f101598a;

    public C39829a(Provider<C39837a> provider) {
        this.f101598a = provider;
    }

    /* renamed from: a */
    public static C39829a m162391a(Provider<C39837a> provider) {
        return new C39829a(provider);
    }

    /* renamed from: c */
    public static PaymentDataSource m162392c(C39837a aVar) {
        return new PaymentDataSource(aVar);
    }

    /* renamed from: b */
    public PaymentDataSource get() {
        return m162392c(this.f101598a.get());
    }
}
