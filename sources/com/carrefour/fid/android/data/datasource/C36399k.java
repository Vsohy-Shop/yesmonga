package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.datasource.k */
public final class C36399k implements C10324h<StoreHoursGateway> {

    /* renamed from: a */
    public final Provider<C37823k> f90049a;

    public C36399k(Provider<C37823k> provider) {
        this.f90049a = provider;
    }

    /* renamed from: a */
    public static C36399k m149329a(Provider<C37823k> provider) {
        return new C36399k(provider);
    }

    /* renamed from: c */
    public static StoreHoursGateway m149330c(C37823k kVar) {
        return new StoreHoursGateway(kVar);
    }

    /* renamed from: b */
    public StoreHoursGateway get() {
        return m149330c(this.f90049a.get());
    }
}
