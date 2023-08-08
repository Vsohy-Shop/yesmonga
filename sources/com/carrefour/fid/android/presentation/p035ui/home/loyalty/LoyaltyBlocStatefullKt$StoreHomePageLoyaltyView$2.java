package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$StoreHomePageLoyaltyView$2 */
public final class LoyaltyBlocStatefullKt$StoreHomePageLoyaltyView$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C24166a, C11079d2> $actioner;
    final /* synthetic */ C26487c $couponsInfoState;
    final /* synthetic */ boolean $isPass;
    final /* synthetic */ C26497f $loyaltyBalanceState;
    final /* synthetic */ C26505h $stickersInfoState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBlocStatefullKt$StoreHomePageLoyaltyView$2(C26497f fVar, C26487c cVar, C26505h hVar, boolean z, C11300l<? super C24166a, C11079d2> lVar, int i) {
        super(2);
        this.$loyaltyBalanceState = fVar;
        this.$couponsInfoState = cVar;
        this.$stickersInfoState = hVar;
        this.$isPass = z;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        LoyaltyBlocStatefullKt.m106440i(this.$loyaltyBalanceState, this.$couponsInfoState, this.$stickersInfoState, this.$isPass, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
