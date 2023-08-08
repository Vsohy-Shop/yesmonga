package com.carrefour.fid.android.presentation.p035ui.loyalty;

import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.presentation.p035ui.loyalty.C24220a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$LoyaltyBonusView$1 */
public final class LoyaltyBonusKt$LoyaltyBonusView$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C24220a, C11079d2> $action;
    final /* synthetic */ List<LoyaltyBonus> $primes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBonusKt$LoyaltyBonusView$1(C11300l<? super C24220a, C11079d2> lVar, List<LoyaltyBonus> list) {
        super(0);
        this.$action = lVar;
        this.$primes = list;
    }

    public final void invoke() {
        this.$action.invoke(new C24220a.C24221a(this.$primes));
    }
}
