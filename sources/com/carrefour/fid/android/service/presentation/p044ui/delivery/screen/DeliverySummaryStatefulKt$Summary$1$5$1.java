package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryAction;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$5$1 */
public final class DeliverySummaryStatefulKt$Summary$1$5$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<DeliverySummaryAction, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryStatefulKt$Summary$1$5$1(C11300l<? super DeliverySummaryAction, C11079d2> lVar) {
        super(0);
        this.$actioner = lVar;
    }

    public final void invoke() {
        this.$actioner.invoke(DeliverySummaryAction.OnCloseExitDialog.INSTANCE);
    }
}
