package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.presentation.p035ui.coupons.analytics.C23787a;
import com.carrefour.fid.android.presentation.viewmodels.coupons.C26221d;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$7 */
public final class CouponsListStatefulKt$CouponsListStateful$7 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C23787a $analytics;
    final /* synthetic */ C8578k2<C26221d> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$CouponsListStateful$7(C8578k2<C26221d> k2Var, C23787a aVar) {
        super(0);
        this.$state = k2Var;
        this.$analytics = aVar;
    }

    @C12579k
    public final Boolean invoke() {
        if (this.$state.getValue().mo76285h()) {
            this.$analytics.mo69678g();
        } else {
            this.$analytics.mo69679h();
        }
        return Boolean.TRUE;
    }
}
