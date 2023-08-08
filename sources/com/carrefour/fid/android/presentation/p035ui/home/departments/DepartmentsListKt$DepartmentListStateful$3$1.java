package com.carrefour.fid.android.presentation.p035ui.home.departments;

import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.presentation.p035ui.home.departments.C24137a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsListKt$DepartmentListStateful$3$1 */
public final class DepartmentsListKt$DepartmentListStateful$3$1 extends Lambda implements C11300l<C24137a, C11079d2> {
    final /* synthetic */ C11300l<ProductCategory, C11079d2> $onDepartmentClick;
    final /* synthetic */ C11289a<C11079d2> $onPromoClick;
    final /* synthetic */ C11289a<C11079d2> $onViewAllClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentsListKt$DepartmentListStateful$3$1(C11300l<? super ProductCategory, C11079d2> lVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
        super(1);
        this.$onDepartmentClick = lVar;
        this.$onPromoClick = aVar;
        this.$onViewAllClick = aVar2;
    }

    /* renamed from: a */
    public final void mo70529a(@C12579k C24137a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        if (aVar instanceof C24137a.C24138a) {
            this.$onDepartmentClick.invoke(((C24137a.C24138a) aVar).mo70538d());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24137a.C24139b.f60378a)) {
            this.$onPromoClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24137a.C24140c.f60380a)) {
            this.$onViewAllClick.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70529a((C24137a) obj);
        return C11079d2.f28267a;
    }
}
