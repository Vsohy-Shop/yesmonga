package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineScreenKt$OrderOnlineStateful$2$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C8578k2<C27077a> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineScreenKt$OrderOnlineStateful$2$1(C8578k2<C27077a> k2Var) {
        super(0);
        this.$state = k2Var;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$state.getValue().mo78666h() instanceof C28892e.C28895c);
    }
}
