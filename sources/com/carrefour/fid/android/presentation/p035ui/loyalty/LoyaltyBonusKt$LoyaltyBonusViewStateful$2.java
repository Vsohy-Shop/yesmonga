package com.carrefour.fid.android.presentation.p035ui.loyalty;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$LoyaltyBonusViewStateful$2 */
public final class LoyaltyBonusKt$LoyaltyBonusViewStateful$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<List<LoyaltyBonus>, C11079d2> $onLoyaltyDetailClickListener;
    final /* synthetic */ C11289a<C11079d2> $onRetryClickListener;
    final /* synthetic */ LoyaltyDetailViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBonusKt$LoyaltyBonusViewStateful$2(LoyaltyDetailViewModel loyaltyDetailViewModel, C11289a<C11079d2> aVar, C11300l<? super List<LoyaltyBonus>, C11079d2> lVar, int i) {
        super(2);
        this.$viewModel = loyaltyDetailViewModel;
        this.$onRetryClickListener = aVar;
        this.$onLoyaltyDetailClickListener = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        LoyaltyBonusKt.m106624j(this.$viewModel, this.$onRetryClickListener, this.$onLoyaltyDetailClickListener, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
