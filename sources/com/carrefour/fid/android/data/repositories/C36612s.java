package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.mapper.C36507m;
import com.carrefour.fid.android.data.entities.mapper.C36523s;
import com.carrefour.fid.android.data.provider.headers.C36571m;
import com.carrefour.fid.android.data.service.C36632k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.s */
public final class C36612s implements C10324h<OrderOfflineRepository> {

    /* renamed from: a */
    public final Provider<C36507m> f90514a;

    /* renamed from: b */
    public final Provider<C36523s> f90515b;

    /* renamed from: c */
    public final Provider<C36632k> f90516c;

    /* renamed from: d */
    public final Provider<C36571m> f90517d;

    public C36612s(Provider<C36507m> provider, Provider<C36523s> provider2, Provider<C36632k> provider3, Provider<C36571m> provider4) {
        this.f90514a = provider;
        this.f90515b = provider2;
        this.f90516c = provider3;
        this.f90517d = provider4;
    }

    /* renamed from: a */
    public static C36612s m150214a(Provider<C36507m> provider, Provider<C36523s> provider2, Provider<C36632k> provider3, Provider<C36571m> provider4) {
        return new C36612s(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static OrderOfflineRepository m150215c(C36507m mVar, C36523s sVar, C36632k kVar, C36571m mVar2) {
        return new OrderOfflineRepository(mVar, sVar, kVar, mVar2);
    }

    /* renamed from: b */
    public OrderOfflineRepository get() {
        return m150215c(this.f90514a.get(), this.f90515b.get(), this.f90516c.get(), this.f90517d.get());
    }
}
