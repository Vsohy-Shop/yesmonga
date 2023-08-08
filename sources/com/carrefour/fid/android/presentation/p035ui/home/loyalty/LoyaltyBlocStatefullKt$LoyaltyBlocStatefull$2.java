package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26484b;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$2 */
public final class LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C26487c $couponsInfoState;
    final /* synthetic */ C26484b $joBanner;
    final /* synthetic */ C26497f $loyaltyBalanceState;
    final /* synthetic */ C26501g $loyaltyCardState;
    final /* synthetic */ C24176b $loyaltyView;
    final /* synthetic */ C11289a<C11079d2> $onChallengeFidClick;
    final /* synthetic */ C11289a<C11079d2> $onCodePromoClick;
    final /* synthetic */ C11289a<C11079d2> $onCouponsClick;
    final /* synthetic */ C11289a<C11079d2> $onCreateLoyaltyCardClick;
    final /* synthetic */ C11305q<String, String, String, C11079d2> $onJOTeamBannerClick;
    final /* synthetic */ C11300l<Integer, C11079d2> $onLoyaltyBalanceClick;
    final /* synthetic */ C11304p<String, String, C11079d2> $onMyStickersClick;
    final /* synthetic */ C11289a<C11079d2> $onSeeLoyaltyCardClick;
    final /* synthetic */ C11289a<C11079d2> $onViewAllClick;
    final /* synthetic */ C26505h $stickersInfoState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$2(C26501g gVar, C26497f fVar, C26487c cVar, C26505h hVar, C24176b bVar, C26484b bVar2, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11300l<? super Integer, C11079d2> lVar, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11304p<? super String, ? super String, C11079d2> pVar, C11305q<? super String, ? super String, ? super String, C11079d2> qVar, int i, int i2, int i3) {
        super(2);
        this.$loyaltyCardState = gVar;
        this.$loyaltyBalanceState = fVar;
        this.$couponsInfoState = cVar;
        this.$stickersInfoState = hVar;
        this.$loyaltyView = bVar;
        this.$joBanner = bVar2;
        this.$onViewAllClick = aVar;
        this.$onSeeLoyaltyCardClick = aVar2;
        this.$onLoyaltyBalanceClick = lVar;
        this.$onCouponsClick = aVar3;
        this.$onCodePromoClick = aVar4;
        this.$onCreateLoyaltyCardClick = aVar5;
        this.$onChallengeFidClick = aVar6;
        this.$onMyStickersClick = pVar;
        this.$onJOTeamBannerClick = qVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        C26501g gVar = this.$loyaltyCardState;
        C26501g gVar2 = gVar;
        LoyaltyBlocStatefullKt.m106436e(gVar2, this.$loyaltyBalanceState, this.$couponsInfoState, this.$stickersInfoState, this.$loyaltyView, this.$joBanner, this.$onViewAllClick, this.$onSeeLoyaltyCardClick, this.$onLoyaltyBalanceClick, this.$onCouponsClick, this.$onCodePromoClick, this.$onCreateLoyaltyCardClick, this.$onChallengeFidClick, this.$onMyStickersClick, this.$onJOTeamBannerClick, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
