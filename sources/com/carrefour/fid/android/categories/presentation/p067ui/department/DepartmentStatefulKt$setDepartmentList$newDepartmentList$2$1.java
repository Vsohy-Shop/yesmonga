package com.carrefour.fid.android.categories.presentation.p067ui.department;

import com.carrefour.fid.android.categories.presentation.p067ui.department.C39769a;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$setDepartmentList$newDepartmentList$2$1 */
public final class DepartmentStatefulKt$setDepartmentList$newDepartmentList$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C39769a, C11079d2> $actioner;
    final /* synthetic */ ProductCategory $productCategory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentStatefulKt$setDepartmentList$newDepartmentList$2$1(ProductCategory productCategory, C11300l<? super C39769a, C11079d2> lVar) {
        super(0);
        this.$productCategory = productCategory;
        this.$actioner = lVar;
    }

    public final void invoke() {
        if (!this.$productCategory.mo117293m().isEmpty()) {
            this.$actioner.invoke(new C39769a.C39770a(this.$productCategory));
        } else {
            this.$actioner.invoke(new C39769a.C39771b(this.$productCategory));
        }
    }
}
