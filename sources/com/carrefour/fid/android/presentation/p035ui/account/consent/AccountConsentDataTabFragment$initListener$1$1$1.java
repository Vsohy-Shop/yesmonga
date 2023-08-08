package com.carrefour.fid.android.presentation.p035ui.account.consent;

import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentDataTabFragment$initListener$1$1$1 */
public final class AccountConsentDataTabFragment$initListener$1$1$1 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ AccountConsentDataTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountConsentDataTabFragment$initListener$1$1$1(AccountConsentDataTabFragment accountConsentDataTabFragment) {
        super(1);
        this.this$0 = accountConsentDataTabFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "it");
        AccountConsentDataTabFragment accountConsentDataTabFragment = this.this$0;
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        String string = accountConsentDataTabFragment.getString(R.string.checkout_error_message_default);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.checkout_error_message_default)");
        FragmentKt.m118811B(accountConsentDataTabFragment, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }
}
