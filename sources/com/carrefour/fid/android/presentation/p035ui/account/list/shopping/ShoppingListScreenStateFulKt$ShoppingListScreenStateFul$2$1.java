package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25891f;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$2$1 */
public final class ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$2$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C8578k2<C25891f> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$2$1(C8578k2<C25891f> k2Var) {
        super(0);
        this.$state = k2Var;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$state.getValue().mo75173d() instanceof C28892e.C28895c);
    }
}
