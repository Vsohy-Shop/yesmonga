package com.carrefour.fid.android.categories.presentation.p067ui.department;

import androidx.compose.material3.C8275r3;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentHeader$2 */
public final class DepartmentStatefulKt$DepartmentHeader$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C39769a, C11079d2> $actioner;
    final /* synthetic */ C8275r3 $scrollBehavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentStatefulKt$DepartmentHeader$2(C8275r3 r3Var, C11300l<? super C39769a, C11079d2> lVar, int i) {
        super(2);
        this.$scrollBehavior = r3Var;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DepartmentStatefulKt.m162262d(this.$scrollBehavior, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
