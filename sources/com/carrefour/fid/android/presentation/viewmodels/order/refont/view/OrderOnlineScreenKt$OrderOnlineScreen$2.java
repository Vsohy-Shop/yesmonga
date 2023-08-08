package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27028a;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineScreenKt$OrderOnlineScreen$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11300l<C27028a, C11079d2> $actioner;
    final /* synthetic */ C27092a $cancelDialogModel;
    final /* synthetic */ C27093b $exitDialogModel;
    final /* synthetic */ LazyListState $lazyState;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ PullRefreshState $pullRefreshState;
    final /* synthetic */ C27077a $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineScreenKt$OrderOnlineScreen$2(C8767m mVar, C27077a aVar, C27093b bVar, C27092a aVar2, LazyListState lazyListState, PullRefreshState pullRefreshState, C11300l<? super C27028a, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$state = aVar;
        this.$exitDialogModel = bVar;
        this.$cancelDialogModel = aVar2;
        this.$lazyState = lazyListState;
        this.$pullRefreshState = pullRefreshState;
        this.$actioner = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        OrderOnlineScreenKt.m114520i(this.$modifier, this.$state, this.$exitDialogModel, this.$cancelDialogModel, this.$lazyState, this.$pullRefreshState, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
