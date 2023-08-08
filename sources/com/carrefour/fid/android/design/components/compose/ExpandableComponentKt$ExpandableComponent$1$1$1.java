package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ExpandableComponentKt$ExpandableComponent$1$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $isExpanded$delegate;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onMoreOrLessComponentClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableComponentKt$ExpandableComponent$1$1$1(C11300l<? super Boolean, C11079d2> lVar, C8700z0<Boolean> z0Var) {
        super(0);
        this.$onMoreOrLessComponentClicked = lVar;
        this.$isExpanded$delegate = z0Var;
    }

    public final void invoke() {
        C8700z0<Boolean> z0Var = this.$isExpanded$delegate;
        ExpandableComponentKt.m151487c(z0Var, !ExpandableComponentKt.m151486b(z0Var));
        C11300l<Boolean, C11079d2> lVar = this.$onMoreOrLessComponentClicked;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(ExpandableComponentKt.m151486b(this.$isExpanded$delegate)));
        }
    }
}
