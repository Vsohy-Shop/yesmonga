package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.data.repositories.DepartmentListRepository;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.datasource.e */
public final class C36393e implements C10324h<DepartmentListGateway> {

    /* renamed from: a */
    public final Provider<DepartmentListRepository> f90036a;

    /* renamed from: b */
    public final Provider<C37823k> f90037b;

    public C36393e(Provider<DepartmentListRepository> provider, Provider<C37823k> provider2) {
        this.f90036a = provider;
        this.f90037b = provider2;
    }

    /* renamed from: a */
    public static C36393e m149311a(Provider<DepartmentListRepository> provider, Provider<C37823k> provider2) {
        return new C36393e(provider, provider2);
    }

    /* renamed from: c */
    public static DepartmentListGateway m149312c(DepartmentListRepository departmentListRepository, C37823k kVar) {
        return new DepartmentListGateway(departmentListRepository, kVar);
    }

    /* renamed from: b */
    public DepartmentListGateway get() {
        return m149312c(this.f90036a.get(), this.f90037b.get());
    }
}
