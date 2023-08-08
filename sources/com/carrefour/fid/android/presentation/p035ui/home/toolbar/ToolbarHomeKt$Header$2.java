package com.carrefour.fid.android.presentation.p035ui.home.toolbar;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$Header$2 */
public final class ToolbarHomeKt$Header$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C24216a, C11079d2> $actioner;
    final /* synthetic */ float $collapseState;
    final /* synthetic */ C2373k $this_Header;
    final /* synthetic */ boolean $userHasNotification;
    final /* synthetic */ C26509i $userStatus;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToolbarHomeKt$Header$2(C2373k kVar, C26509i iVar, boolean z, float f, C11300l<? super C24216a, C11079d2> lVar, int i) {
        super(2);
        this.$this_Header = kVar;
        this.$userStatus = iVar;
        this.$userHasNotification = z;
        this.$collapseState = f;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ToolbarHomeKt.m106586a(this.$this_Header, this.$userStatus, this.$userHasNotification, this.$collapseState, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
