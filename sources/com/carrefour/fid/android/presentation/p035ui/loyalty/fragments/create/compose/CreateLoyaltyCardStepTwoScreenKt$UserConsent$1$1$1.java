package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserConsent$1$1$1 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserConsent$1$1$1 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ C11300l<Boolean, C11079d2> $onEmailOptinSwitchChecked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserConsent$1$1$1(C11300l<? super Boolean, C11079d2> lVar) {
        super(1);
        this.$onEmailOptinSwitchChecked = lVar;
    }

    /* renamed from: a */
    public final void mo71316a(boolean z) {
        this.$onEmailOptinSwitchChecked.invoke(Boolean.valueOf(z));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo71316a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
