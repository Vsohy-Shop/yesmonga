package com.carrefour.fid.android.categories.presentation.viewmodel.department;

import com.carrefour.fid.android.domain.interactors.category.C37619a;
import com.carrefour.fid.android.domain.interactors.loyalty.C37700d;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.categories.presentation.viewmodel.department.b */
public final class C39798b implements C10324h<DepartmentsViewModel> {

    /* renamed from: a */
    public final Provider<C37619a> f101554a;

    /* renamed from: b */
    public final Provider<C37823k> f101555b;

    /* renamed from: c */
    public final Provider<C37700d> f101556c;

    public C39798b(Provider<C37619a> provider, Provider<C37823k> provider2, Provider<C37700d> provider3) {
        this.f101554a = provider;
        this.f101555b = provider2;
        this.f101556c = provider3;
    }

    /* renamed from: a */
    public static C39798b m162374a(Provider<C37619a> provider, Provider<C37823k> provider2, Provider<C37700d> provider3) {
        return new C39798b(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static DepartmentsViewModel m162375c(C37619a aVar, C37823k kVar, C37700d dVar) {
        return new DepartmentsViewModel(aVar, kVar, dVar);
    }

    /* renamed from: b */
    public DepartmentsViewModel get() {
        return m162375c(this.f101554a.get(), this.f101555b.get(), this.f101556c.get());
    }
}
