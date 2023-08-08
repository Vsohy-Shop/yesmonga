package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreLoyaltyComponentKt$PhysicalStoreFidelityComponent$9 */
public final class PhysicalStoreLoyaltyComponentKt$PhysicalStoreFidelityComponent$9 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onChallengeFidClick;
    final /* synthetic */ C11289a<C11079d2> $onCouponsClick;
    final /* synthetic */ C11289a<C11079d2> $onCreateLoyaltyCardClick;
    final /* synthetic */ C11300l<Integer, C11079d2> $onLoyaltyBalanceClick;
    final /* synthetic */ C11304p<String, String, C11079d2> $onMyStickersClick;
    final /* synthetic */ C11289a<C11079d2> $onSeeLoyaltyCardClick;
    final /* synthetic */ C11289a<C11079d2> $onViewAllClick;
    final /* synthetic */ C27115b $physicalStoreLoyaltyState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreLoyaltyComponentKt$PhysicalStoreFidelityComponent$9(C8767m mVar, C27115b bVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11300l<? super Integer, C11079d2> lVar, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11304p<? super String, ? super String, C11079d2> pVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$physicalStoreLoyaltyState = bVar;
        this.$onViewAllClick = aVar;
        this.$onSeeLoyaltyCardClick = aVar2;
        this.$onLoyaltyBalanceClick = lVar;
        this.$onCouponsClick = aVar3;
        this.$onCreateLoyaltyCardClick = aVar4;
        this.$onChallengeFidClick = aVar5;
        this.$onMyStickersClick = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PhysicalStoreLoyaltyComponentKt.m109629a(this.$modifier, this.$physicalStoreLoyaltyState, this.$onViewAllClick, this.$onSeeLoyaltyCardClick, this.$onLoyaltyBalanceClick, this.$onCouponsClick, this.$onCreateLoyaltyCardClick, this.$onChallengeFidClick, this.$onMyStickersClick, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
