package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24166a;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBalance$1 */
public final class LoyaltyBlocStatefullKt$LoyaltyBalance$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C24166a, C11079d2> $actioner;
    final /* synthetic */ C26497f $loyaltyBalanceState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBlocStatefullKt$LoyaltyBalance$1(C26497f fVar, C11300l<? super C24166a, C11079d2> lVar) {
        super(0);
        this.$loyaltyBalanceState = fVar;
        this.$actioner = lVar;
    }

    public final void invoke() {
        if (this.$loyaltyBalanceState instanceof C26497f.C26499b) {
            this.$actioner.invoke(new C24166a.C24172f(((C26497f.C26499b) this.$loyaltyBalanceState).mo77057d()));
        }
    }
}
