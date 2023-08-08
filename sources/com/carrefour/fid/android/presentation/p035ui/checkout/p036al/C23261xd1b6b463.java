package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$2$2$1 */
public final class C23261xd1b6b463 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $expanded$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23261xd1b6b463(C8700z0<Boolean> z0Var) {
        super(1);
        this.$expanded$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo68135a(float f) {
        CheckoutStep1FooterStatefulKt.m103948d(this.$expanded$delegate, f < 0.0f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68135a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
