package com.carrefour.fid.android.presentation.p035ui.home.services;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.design.components.compose.ActiveState;
import com.carrefour.fid.android.design.components.compose.C37014m;
import com.carrefour.fid.android.design.components.compose.C37020p;
import com.carrefour.fid.android.design.components.compose.Service;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$DisplayServices$2 */
public final class HomeServicesKt$DisplayServices$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C37014m, C11079d2> $actioner;
    final /* synthetic */ int $basketProductCount;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ List<Pair<Service, ActiveState>> $serviceListState;
    final /* synthetic */ C37020p $serviceSlotState;
    final /* synthetic */ float $toolbarCollapseState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeServicesKt$DisplayServices$2(float f, List<? extends Pair<? extends Service, ? extends ActiveState>> list, ScrollState scrollState, C37020p pVar, int i, C11300l<? super C37014m, C11079d2> lVar, int i2) {
        super(2);
        this.$toolbarCollapseState = f;
        this.$serviceListState = list;
        this.$scrollState = scrollState;
        this.$serviceSlotState = pVar;
        this.$basketProductCount = i;
        this.$actioner = lVar;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        HomeServicesKt.m106530a(this.$toolbarCollapseState, this.$serviceListState, this.$scrollState, this.$serviceSlotState, this.$basketProductCount, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
