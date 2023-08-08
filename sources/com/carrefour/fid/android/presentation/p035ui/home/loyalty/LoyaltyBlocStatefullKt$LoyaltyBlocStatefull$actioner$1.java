package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24166a;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$actioner$1 */
public final class LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$actioner$1 extends Lambda implements C11300l<C24166a, C11079d2> {
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
    public LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$actioner$1(C11300l<? super Integer, C11079d2> lVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11304p<? super String, ? super String, C11079d2> pVar, C26505h hVar, C11305q<? super String, ? super String, ? super String, C11079d2> qVar) {
        super(1);
        this.$onLoyaltyBalanceClick = lVar;
        this.$onViewAllClick = aVar;
        this.$onSeeLoyaltyCardClick = aVar2;
        this.$onCouponsClick = aVar3;
        this.$onCodePromoClick = aVar4;
        this.$onCreateLoyaltyCardClick = aVar5;
        this.$onChallengeFidClick = aVar6;
        this.$onMyStickersClick = pVar;
        this.$stickersInfoState = hVar;
        this.$onJOTeamBannerClick = qVar;
    }

    /* renamed from: a */
    public final void mo70707a(@C12579k C24166a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        if (aVar instanceof C24166a.C24172f) {
            this.$onLoyaltyBalanceClick.invoke(Integer.valueOf((int) (((C24166a.C24172f) aVar).mo70731d() * ((double) 100))));
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24166a.C24175i.f60466a)) {
            this.$onViewAllClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24166a.C24174h.f60464a)) {
            this.$onSeeLoyaltyCardClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24166a.C24169c.f60452a)) {
            this.$onCouponsClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24166a.C24168b.f60450a)) {
            this.$onCodePromoClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24166a.C24170d.f60454a)) {
            this.$onCreateLoyaltyCardClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24166a.C24167a.f60448a)) {
            this.$onChallengeFidClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24166a.C24173g.f60462a)) {
            C11304p<String, String, C11079d2> pVar = this.$onMyStickersClick;
            C26505h hVar = this.$stickersInfoState;
            Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.viewmodels.home.state.StickersInfoState.StickersInfo");
            pVar.invoke(((C26505h.C26506a) hVar).mo77073g(), ((C26505h.C26506a) this.$stickersInfoState).mo77074h());
        } else if (aVar instanceof C24166a.C24171e) {
            C24166a.C24171e eVar = (C24166a.C24171e) aVar;
            this.$onJOTeamBannerClick.invoke(eVar.mo70724f(), eVar.mo70726h(), eVar.mo70725g());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70707a((C24166a) obj);
        return C11079d2.f28267a;
    }
}
