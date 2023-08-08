package com.carrefour.fid.android.categories.presentation.p067ui.department;

import com.carrefour.fid.android.categories.presentation.p067ui.department.C39769a;
import com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$actioner$1 */
public final class DepartmentStatefulKt$DepartmentStateful$actioner$1 extends Lambda implements C11300l<C39769a, C11079d2> {
    final /* synthetic */ C11300l<ProductCategory, C11079d2> $onDepartmentWithChildrenClick;
    final /* synthetic */ C11300l<ProductCategory, C11079d2> $onDepartmentWithoutChildrenClick;
    final /* synthetic */ C11289a<C11079d2> $onScanIconClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchIconClick;
    final /* synthetic */ DepartmentsViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentStatefulKt$DepartmentStateful$actioner$1(C11300l<? super ProductCategory, C11079d2> lVar, C11300l<? super ProductCategory, C11079d2> lVar2, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, DepartmentsViewModel departmentsViewModel) {
        super(1);
        this.$onDepartmentWithChildrenClick = lVar;
        this.$onDepartmentWithoutChildrenClick = lVar2;
        this.$onSearchIconClick = aVar;
        this.$onSearchBarClick = aVar2;
        this.$onScanIconClick = aVar3;
        this.$viewModel = departmentsViewModel;
    }

    /* renamed from: a */
    public final void mo131122a(@C12579k C39769a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        if (aVar instanceof C39769a.C39770a) {
            this.$onDepartmentWithChildrenClick.invoke(((C39769a.C39770a) aVar).mo131125d());
        } else if (aVar instanceof C39769a.C39771b) {
            this.$onDepartmentWithoutChildrenClick.invoke(((C39769a.C39771b) aVar).mo131131d());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C39769a.C39775f.f101499a)) {
            this.$onSearchIconClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C39769a.C39774e.f101497a)) {
            this.$onSearchBarClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C39769a.C39773d.f101495a)) {
            this.$onScanIconClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C39769a.C39772c.f101493a)) {
            this.$viewModel.mo131202h0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo131122a((C39769a) obj);
        return C11079d2.f28267a;
    }
}
