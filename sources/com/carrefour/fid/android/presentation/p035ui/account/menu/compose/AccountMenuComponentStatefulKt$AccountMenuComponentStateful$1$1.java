package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25798c;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuComponentStateful$1$1 */
public final class AccountMenuComponentStatefulKt$AccountMenuComponentStateful$1$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C8578k2<C25798c> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuComponentStateful$1$1(C8578k2<C25798c> k2Var) {
        super(0);
        this.$state = k2Var;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$state.getValue().mo74901k() instanceof C28892e.C28895c);
    }
}
