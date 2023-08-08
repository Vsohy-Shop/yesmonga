package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineDialogScreenPreview$pullRefreshState$1$1 */
public final class C27084xe454a0d8 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $refreshing$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27084xe454a0d8(C8700z0<Boolean> z0Var) {
        super(0);
        this.$refreshing$delegate = z0Var;
    }

    public final void invoke() {
        OrderOnlineScreenKt.m114515d(this.$refreshing$delegate, true);
        OrderOnlineScreenKt.m114515d(this.$refreshing$delegate, false);
    }
}
