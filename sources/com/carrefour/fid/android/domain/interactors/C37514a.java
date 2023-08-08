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
/* renamed from: com.carrefour.fid.android.domain.interactors.a */
public final class C37514a implements C10324h<GetDepartmentWithParentUseCase> {

    /* renamed from: a */
    public final Provider<DepartmentListGateway> f94252a;

    public C37514a(Provider<DepartmentListGateway> provider) {
        this.f94252a = provider;
    }

    /* renamed from: a */
    public static C37514a m153995a(Provider<DepartmentListGateway> provider) {
        return new C37514a(provider);
    }

    /* renamed from: c */
    public static GetDepartmentWithParentUseCase m153996c(DepartmentListGateway departmentListGateway) {
        return new GetDepartmentWithParentUseCase(departmentListGateway);
    }

    /* renamed from: b */
    public GetDepartmentWithParentUseCase get() {
        return m153996c(this.f94252a.get());
    }
}
