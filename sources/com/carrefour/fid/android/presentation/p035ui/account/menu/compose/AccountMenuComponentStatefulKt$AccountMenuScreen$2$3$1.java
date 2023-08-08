package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.p035ui.account.menu.compose.C23130a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuScreen$2$3$1 */
public final class AccountMenuComponentStatefulKt$AccountMenuScreen$2$3$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C23130a, C11079d2> $actioner;
    final /* synthetic */ C8700z0<Boolean> $displayHelpDialog;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuScreen$2$3$1(C8700z0<Boolean> z0Var, C11300l<? super C23130a, C11079d2> lVar) {
        super(0);
        this.$displayHelpDialog = z0Var;
        this.$actioner = lVar;
    }

    public final void invoke() {
        this.$displayHelpDialog.setValue(Boolean.FALSE);
        this.$actioner.invoke(C23130a.C23132b.f58799a);
    }
}
