package com.carrefour.fid.android.presentation.p035ui.loyalty.view;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$1$2$1 */
public final class C24642x668b7627 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $isCopiedCardNumber;
    final /* synthetic */ C11289a<C11079d2> $onClickCopyCardNumber;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24642x668b7627(C11289a<C11079d2> aVar, C8700z0<Boolean> z0Var) {
        super(0);
        this.$onClickCopyCardNumber = aVar;
        this.$isCopiedCardNumber = z0Var;
    }

    public final void invoke() {
        this.$onClickCopyCardNumber.invoke();
        this.$isCopiedCardNumber.setValue(Boolean.TRUE);
    }
}
