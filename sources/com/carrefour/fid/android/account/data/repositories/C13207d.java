package com.carrefour.fid.android.account.data.repositories;

import com.carrefour.fid.android.account.data.headers.C13198c;
import com.carrefour.fid.android.account.data.service.C13210b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.data.repositories.d */
public final class C13207d implements C10324h<DQEAddressesRepository> {

    /* renamed from: a */
    public final Provider<C13210b> f32388a;

    /* renamed from: b */
    public final Provider<C13198c> f32389b;

    public C13207d(Provider<C13210b> provider, Provider<C13198c> provider2) {
        this.f32388a = provider;
        this.f32389b = provider2;
    }

    /* renamed from: a */
    public static C13207d m57244a(Provider<C13210b> provider, Provider<C13198c> provider2) {
        return new C13207d(provider, provider2);
    }

    /* renamed from: c */
    public static DQEAddressesRepository m57245c(C13210b bVar, C13198c cVar) {
        return new DQEAddressesRepository(bVar, cVar);
    }

    /* renamed from: b */
    public DQEAddressesRepository get() {
        return m57245c(this.f32388a.get(), this.f32389b.get());
    }
}
