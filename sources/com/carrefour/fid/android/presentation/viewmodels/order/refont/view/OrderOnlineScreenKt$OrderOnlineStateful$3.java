package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27052b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineScreenKt$OrderOnlineStateful$3 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C27052b $analytics;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineScreenKt$OrderOnlineStateful$3(C27052b bVar) {
        super(0);
        this.$analytics = bVar;
    }

    @C12579k
    public final Boolean invoke() {
        this.$analytics.sendScreenView();
        return Boolean.TRUE;
    }
}
