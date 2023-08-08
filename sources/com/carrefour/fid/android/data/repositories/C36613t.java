package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper;
import com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper;
import com.carrefour.fid.android.data.provider.headers.C36569k;
import com.carrefour.fid.android.data.provider.headers.C36571m;
import com.carrefour.fid.android.data.service.C36633l;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.repositories.t */
public final class C36613t implements C10324h<OrderOnlineRepository> {

    /* renamed from: a */
    public final Provider<C36633l> f90518a;

    /* renamed from: b */
    public final Provider<OHMOrdersOnlineEntityDataMapper> f90519b;

    /* renamed from: c */
    public final Provider<OHMOrdersOnlineDetailsEntityDataMapper> f90520c;

    /* renamed from: d */
    public final Provider<C36571m> f90521d;

    /* renamed from: e */
    public final Provider<C36569k> f90522e;

    public C36613t(Provider<C36633l> provider, Provider<OHMOrdersOnlineEntityDataMapper> provider2, Provider<OHMOrdersOnlineDetailsEntityDataMapper> provider3, Provider<C36571m> provider4, Provider<C36569k> provider5) {
        this.f90518a = provider;
        this.f90519b = provider2;
        this.f90520c = provider3;
        this.f90521d = provider4;
        this.f90522e = provider5;
    }

    /* renamed from: a */
    public static C36613t m150217a(Provider<C36633l> provider, Provider<OHMOrdersOnlineEntityDataMapper> provider2, Provider<OHMOrdersOnlineDetailsEntityDataMapper> provider3, Provider<C36571m> provider4, Provider<C36569k> provider5) {
        return new C36613t(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static OrderOnlineRepository m150218c(C36633l lVar, OHMOrdersOnlineEntityDataMapper oHMOrdersOnlineEntityDataMapper, OHMOrdersOnlineDetailsEntityDataMapper oHMOrdersOnlineDetailsEntityDataMapper, C36571m mVar, C36569k kVar) {
        return new OrderOnlineRepository(lVar, oHMOrdersOnlineEntityDataMapper, oHMOrdersOnlineDetailsEntityDataMapper, mVar, kVar);
    }

    /* renamed from: b */
    public OrderOnlineRepository get() {
        return m150218c(this.f90518a.get(), this.f90519b.get(), this.f90520c.get(), this.f90521d.get(), this.f90522e.get());
    }
}
