package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$2$1 */
public final class CardScanKt$CardNumberAutoAdjust$2$1 extends Lambda implements C11300l<C15184c, C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $readyToDraw$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardScanKt$CardNumberAutoAdjust$2$1(C8700z0<Boolean> z0Var) {
        super(1);
        this.$readyToDraw$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo70676a(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "$this$drawWithContent");
        if (CardScanKt.m106407d(this.$readyToDraw$delegate)) {
            cVar.mo42716g6();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70676a((C15184c) obj);
        return C11079d2.f28267a;
    }
}
