package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.C23617b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$4$1 */
public final class NonFoodCheckoutStep2ScreenKt$PickupBloc$4$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C23617b, C11079d2> $actioner;
    final /* synthetic */ double $externalPickupPrice;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ScreenKt$PickupBloc$4$1(C11300l<? super C23617b, C11079d2> lVar, double d) {
        super(0);
        this.$actioner = lVar;
        this.$externalPickupPrice = d;
    }

    public final void invoke() {
        this.$actioner.invoke(new C23617b.C23627c(this.$externalPickupPrice));
    }
}
