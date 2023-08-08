package com.carrefour.fid.android.domain.interactors;

import com.carrefour.fid.android.data.datasource.DepartmentListGateway;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.b */
public final class C37551b implements C10324h<GetDepartmentsUseCase> {

    /* renamed from: a */
    public final Provider<DepartmentListGateway> f94312a;

    public C37551b(Provider<DepartmentListGateway> provider) {
        this.f94312a = provider;
    }

    /* renamed from: a */
    public static C37551b m154075a(Provider<DepartmentListGateway> provider) {
        return new C37551b(provider);
    }

    /* renamed from: c */
    public static GetDepartmentsUseCase m154076c(DepartmentListGateway departmentListGateway) {
        return new GetDepartmentsUseCase(departmentListGateway);
    }

    /* renamed from: b */
    public GetDepartmentsUseCase get() {
        return m154076c(this.f94312a.get());
    }
}
