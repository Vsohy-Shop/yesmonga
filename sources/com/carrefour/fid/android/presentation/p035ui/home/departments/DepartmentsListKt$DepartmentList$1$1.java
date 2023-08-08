package com.carrefour.fid.android.presentation.p035ui.home.departments;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDepartmentsList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentsList.kt\ncom/carrefour/fid/android/presentation/ui/home/departments/DepartmentsListKt$DepartmentList$1$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,280:1\n136#2,12:281\n*S KotlinDebug\n*F\n+ 1 DepartmentsList.kt\ncom/carrefour/fid/android/presentation/ui/home/departments/DepartmentsListKt$DepartmentList$1$1\n*L\n156#1:281,12\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.departments.DepartmentsListKt$DepartmentList$1$1 */
public final class DepartmentsListKt$DepartmentList$1$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C24137a, C11079d2> $actioner;
    final /* synthetic */ List<ProductCategory> $departments;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentsListKt$DepartmentList$1$1(List<ProductCategory> list, C11300l<? super C24137a, C11079d2> lVar, int i) {
        super(1);
        this.$departments = list;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        ComposableSingletons$DepartmentsListKt composableSingletons$DepartmentsListKt = ComposableSingletons$DepartmentsListKt.f60368a;
        LazyListScope.m10824g(lazyListScope, (Object) null, (Object) null, composableSingletons$DepartmentsListKt.mo70515a(), 3, (Object) null);
        List<ProductCategory> list = this.$departments;
        C241361 r2 = C241361.f60374f;
        C11300l<C24137a, C11079d2> lVar = this.$actioner;
        int i = this.$$dirty;
        lazyListScope.mo8310k(list.size(), r2 != null ? new C24133x77d9343c(r2, list) : null, new C24134x77d9343d(C24132x77d9343b.f60373f, list), C8553b.m31049c(-632812321, true, new C24135x77d9343e(list, lVar, i)));
        LazyListScope.m10824g(lazyListScope, (Object) null, (Object) null, composableSingletons$DepartmentsListKt.mo70516b(), 3, (Object) null);
    }
}
