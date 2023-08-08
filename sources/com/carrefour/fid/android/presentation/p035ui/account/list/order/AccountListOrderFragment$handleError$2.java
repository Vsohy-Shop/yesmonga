package com.carrefour.fid.android.presentation.p035ui.account.list.order;

import android.os.Bundle;
import com.carrefour.fid.android.presentation.viewmodels.account.list.order.AccountListOrderViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/os/Bundle;", "it", "Lkotlin/d2;", "a", "(Landroid/os/Bundle;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleError$2 */
public final class AccountListOrderFragment$handleError$2 extends Lambda implements C11300l<Bundle, C11079d2> {
    final /* synthetic */ AccountListOrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountListOrderFragment$handleError$2(AccountListOrderFragment accountListOrderFragment) {
        super(1);
        this.this$0 = accountListOrderFragment;
    }

    /* renamed from: a */
    public final void mo67612a(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "it");
        this.this$0.mo67579e1().sendIntent(new AccountListOrderViewModel.C25849b.C25853d(this.this$0.mo67581f1()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67612a((Bundle) obj);
        return C11079d2.f28267a;
    }
}
