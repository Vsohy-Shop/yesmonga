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
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$MultipleCouponsStatus$2 */
public final class CouponsListStatefulKt$MultipleCouponsStatus$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C23843c, C11079d2> $actioner;
    final /* synthetic */ C28892e.C28895c<C37643a> $couponContentState;
    final /* synthetic */ List<String> $filteredCouponsIdsSelected;
    final /* synthetic */ List<String> $loadingButtonIds;
    final /* synthetic */ C8700z0<TabPage> $selectedTab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$MultipleCouponsStatus$2(C8700z0<TabPage> z0Var, C28892e.C28895c<C37643a> cVar, List<String> list, List<String> list2, C11300l<? super C23843c, C11079d2> lVar, int i) {
        super(2);
        this.$selectedTab = z0Var;
        this.$couponContentState = cVar;
        this.$filteredCouponsIdsSelected = list;
        this.$loadingButtonIds = list2;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CouponsListStatefulKt.m105537d(this.$selectedTab, this.$couponContentState, this.$filteredCouponsIdsSelected, this.$loadingButtonIds, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
