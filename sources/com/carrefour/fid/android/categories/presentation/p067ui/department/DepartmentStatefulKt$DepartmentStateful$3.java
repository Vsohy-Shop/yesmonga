package com.carrefour.fid.android.categories.presentation.p067ui.department;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel;
import com.carrefour.fid.android.design.components.widgets.list.C37269i;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$3 */
public final class DepartmentStatefulKt$DepartmentStateful$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C37269i $couponItem;
    final /* synthetic */ C11300l<ProductCategory, C11079d2> $onDepartmentWithChildrenClick;
    final /* synthetic */ C11300l<ProductCategory, C11079d2> $onDepartmentWithoutChildrenClick;
    final /* synthetic */ C11289a<C11079d2> $onScanIconClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchIconClick;
    final /* synthetic */ C37269i $promoItem;
    final /* synthetic */ DepartmentsViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentStatefulKt$DepartmentStateful$3(DepartmentsViewModel departmentsViewModel, C37269i iVar, C37269i iVar2, C11300l<? super ProductCategory, C11079d2> lVar, C11300l<? super ProductCategory, C11079d2> lVar2, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, int i, int i2) {
        super(2);
        this.$viewModel = departmentsViewModel;
        this.$promoItem = iVar;
        this.$couponItem = iVar2;
        this.$onDepartmentWithChildrenClick = lVar;
        this.$onDepartmentWithoutChildrenClick = lVar2;
        this.$onSearchIconClick = aVar;
        this.$onSearchBarClick = aVar2;
        this.$onScanIconClick = aVar3;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DepartmentStatefulKt.m162266h(this.$viewModel, this.$promoItem, this.$couponItem, this.$onDepartmentWithChildrenClick, this.$onDepartmentWithoutChildrenClick, this.$onSearchIconClick, this.$onSearchBarClick, this.$onScanIconClick, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
