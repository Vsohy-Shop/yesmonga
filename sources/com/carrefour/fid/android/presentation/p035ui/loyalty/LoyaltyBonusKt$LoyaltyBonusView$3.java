package com.carrefour.fid.android.presentation.p035ui.loyalty;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$LoyaltyBonusView$3 */
public final class LoyaltyBonusKt$LoyaltyBonusView$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C24220a, C11079d2> $action;
    final /* synthetic */ boolean $bioBonusAvailable;
    final /* synthetic */ boolean $familyBonusAvailable;
    final /* synthetic */ boolean $marketBonusAvailable;
    final /* synthetic */ List<LoyaltyBonus> $primes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBonusKt$LoyaltyBonusView$3(boolean z, boolean z2, boolean z3, List<LoyaltyBonus> list, C11300l<? super C24220a, C11079d2> lVar, int i) {
        super(2);
        this.$bioBonusAvailable = z;
        this.$familyBonusAvailable = z2;
        this.$marketBonusAvailable = z3;
        this.$primes = list;
        this.$action = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        LoyaltyBonusKt.m106622h(this.$bioBonusAvailable, this.$familyBonusAvailable, this.$marketBonusAvailable, this.$primes, this.$action, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
