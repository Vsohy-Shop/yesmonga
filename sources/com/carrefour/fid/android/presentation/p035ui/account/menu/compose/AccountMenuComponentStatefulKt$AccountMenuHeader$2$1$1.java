package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.foundation.layout.C2362h;
import com.carrefour.fid.android.domain.models.accountmenu.C37950a;
import com.carrefour.fid.android.presentation.p035ui.account.menu.compose.C23130a;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.AccountMenuComponentStatefulKt$AccountMenuHeader$2$1$1 */
public final class AccountMenuComponentStatefulKt$AccountMenuHeader$2$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C23130a, C11079d2> $actioner;
    final /* synthetic */ C28892e<C37950a> $airshipInbox;
    final /* synthetic */ C2362h $this_Box;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuComponentStatefulKt$AccountMenuHeader$2$1$1(C28892e<C37950a> eVar, C2362h hVar, C11300l<? super C23130a, C11079d2> lVar) {
        super(0);
        this.$airshipInbox = eVar;
        this.$this_Box = hVar;
        this.$actioner = lVar;
    }

    public final void invoke() {
        C11079d2 d2Var;
        C37950a aVar = (C37950a) C28897f.m119478b(this.$airshipInbox);
        if (aVar != null) {
            this.$actioner.invoke(new C23130a.C23136f(aVar));
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            this.$actioner.invoke(C23130a.C23134d.f58803a);
        }
    }
}
