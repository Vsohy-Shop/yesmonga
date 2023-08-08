package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.p004ui.focus.C15087z;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.PromoCodeComponentKt$PromoCodeForm$1$1$1$1 */
public final class PromoCodeComponentKt$PromoCodeForm$1$1$1$1 extends Lambda implements C11300l<C15087z, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onFocusTextField;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromoCodeComponentKt$PromoCodeForm$1$1$1$1(C11289a<C11079d2> aVar) {
        super(1);
        this.$onFocusTextField = aVar;
    }

    /* renamed from: a */
    public final void mo68835a(@C12579k C15087z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "state");
        if (zVar.mo42156g()) {
            this.$onFocusTextField.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68835a((C15087z) obj);
        return C11079d2.f28267a;
    }
}
