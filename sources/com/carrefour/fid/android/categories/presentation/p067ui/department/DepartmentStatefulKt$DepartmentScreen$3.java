package com.carrefour.fid.android.categories.presentation.p067ui.department;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.categories.databinding.C39738a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentScreen$3 */
public final class DepartmentStatefulKt$DepartmentScreen$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C39769a, C11079d2> $actioner;
    final /* synthetic */ C11300l<C39738a, C11079d2> $updateScreenContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentStatefulKt$DepartmentScreen$3(C11300l<? super C39769a, C11079d2> lVar, C11300l<? super C39738a, C11079d2> lVar2, int i) {
        super(2);
        this.$actioner = lVar;
        this.$updateScreenContent = lVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DepartmentStatefulKt.m162265g(this.$actioner, this.$updateScreenContent, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
