package com.carrefour.fid.android.presentation.p035ui.account.list.order;

import android.os.Bundle;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.shared.constant.C28539g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleError$1 */
public final class AccountListOrderFragment$handleError$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ AccountListOrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountListOrderFragment$handleError$1(AccountListOrderFragment accountListOrderFragment) {
        super(0);
        this.this$0 = accountListOrderFragment;
    }

    public final void invoke() {
        FragmentExtensionKt.m58770u(this.this$0, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69227C, (Bundle) null, 16, (Object) null);
    }
}
