package com.carrefour.fid.android.presentation.p035ui.home.departments;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsListKt$DepartmentList$2 */
public final class DepartmentsListKt$DepartmentList$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C24137a, C11079d2> $actioner;
    final /* synthetic */ List<ProductCategory> $departments;
    final /* synthetic */ LazyListState $rowState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentsListKt$DepartmentList$2(LazyListState lazyListState, List<ProductCategory> list, C11300l<? super C24137a, C11079d2> lVar, int i) {
        super(2);
        this.$rowState = lazyListState;
        this.$departments = list;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DepartmentsListKt.m106268b(this.$rowState, this.$departments, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
