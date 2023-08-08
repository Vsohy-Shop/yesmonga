package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeForm$1$1$3$1 */
public final class PromoCodeComponentKt$PromoCodeForm$1$1$3$1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ C8700z0<String> $couponCode$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromoCodeComponentKt$PromoCodeForm$1$1$3$1(C8700z0<String> z0Var) {
        super(1);
        this.$couponCode$delegate = z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        PromoCodeComponentKt.m104638g(this.$couponCode$delegate, str);
    }
}
