package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.interactors.coupons.C37643a;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsScreen$5 */
public final class CouponsListStatefulKt$CouponsScreen$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C23843c, C11079d2> $actioner;
    final /* synthetic */ C28892e<C37643a> $couponContentState;
    final /* synthetic */ List<String> $filteredCouponsIdsSelected;
    final /* synthetic */ List<String> $loadingButtonIds;
    final /* synthetic */ int $numberActivateCoupon;
    final /* synthetic */ C8700z0<Boolean> $openBurnedCacheDialog;
    final /* synthetic */ C8700z0<TabPage> $selectedTab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$CouponsScreen$5(C28892e<C37643a> eVar, C8700z0<TabPage> z0Var, List<String> list, C8700z0<Boolean> z0Var2, int i, List<String> list2, C11300l<? super C23843c, C11079d2> lVar, int i2) {
        super(2);
        this.$couponContentState = eVar;
        this.$selectedTab = z0Var;
        this.$filteredCouponsIdsSelected = list;
        this.$openBurnedCacheDialog = z0Var2;
        this.$numberActivateCoupon = i;
        this.$loadingButtonIds = list2;
        this.$actioner = lVar;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CouponsListStatefulKt.m105535b(this.$couponContentState, this.$selectedTab, this.$filteredCouponsIdsSelected, this.$openBurnedCacheDialog, this.$numberActivateCoupon, this.$loadingButtonIds, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
