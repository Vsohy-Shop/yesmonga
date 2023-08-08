package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$6$1 */
public final class C24383x4beca6e5 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $smsOptinSwitch$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24383x4beca6e5(C8700z0<Boolean> z0Var) {
        super(1);
        this.$smsOptinSwitch$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo71285a(boolean z) {
        CreateLoyaltyCardStepTwoScreenKt.m107052o(this.$smsOptinSwitch$delegate, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo71285a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
