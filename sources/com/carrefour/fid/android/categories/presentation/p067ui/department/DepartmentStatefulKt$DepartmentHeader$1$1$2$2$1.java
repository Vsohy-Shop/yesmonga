package com.carrefour.fid.android.categories.presentation.p067ui.department;

import com.carrefour.fid.android.categories.presentation.p067ui.department.C39769a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentHeader$1$1$2$2$1 */
public final class DepartmentStatefulKt$DepartmentHeader$1$1$2$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C39769a, C11079d2> $actioner;
    final /* synthetic */ boolean $isTopAppBarFullyCollapsed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentStatefulKt$DepartmentHeader$1$1$2$2$1(boolean z, C11300l<? super C39769a, C11079d2> lVar) {
        super(0);
        this.$isTopAppBarFullyCollapsed = z;
        this.$actioner = lVar;
    }

    public final void invoke() {
        if (!this.$isTopAppBarFullyCollapsed) {
            this.$actioner.invoke(C39769a.C39773d.f101495a);
        }
    }
}
