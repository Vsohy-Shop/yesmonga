package com.carrefour.fid.android.presentation.p035ui.home.departments;

import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.presentation.p035ui.home.departments.C24137a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsListKt$Department$1 */
public final class DepartmentsListKt$Department$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C24137a, C11079d2> $actioner;
    final /* synthetic */ ProductCategory $data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentsListKt$Department$1(C11300l<? super C24137a, C11079d2> lVar, ProductCategory productCategory) {
        super(0);
        this.$actioner = lVar;
        this.$data = productCategory;
    }

    public final void invoke() {
        this.$actioner.invoke(new C24137a.C24138a(this.$data));
    }
}
