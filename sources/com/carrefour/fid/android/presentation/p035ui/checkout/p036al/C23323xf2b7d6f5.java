package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.ComposableSingletons$CheckoutBasketContainAlcoholCheckboxKt$lambda-1$1$1$1 */
public final class C23323xf2b7d6f5 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $checkedState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23323xf2b7d6f5(C8700z0<Boolean> z0Var) {
        super(1);
        this.$checkedState = z0Var;
    }

    /* renamed from: a */
    public final void mo68304a(boolean z) {
        C8700z0<Boolean> z0Var = this.$checkedState;
        z0Var.setValue(Boolean.valueOf(!z0Var.getValue().booleanValue()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68304a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
