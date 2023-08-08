package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserConsent$4 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserConsent$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $emailOptinSwitch;
    final /* synthetic */ C8578k2<C28892e<C11079d2>> $isLoading;
    final /* synthetic */ boolean $isValidateBtnEnable;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onEmailOptinSwitchChecked;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onSmsOptinSwitchChecked;
    final /* synthetic */ C11289a<C11079d2> $onValidateBtnClicked;
    final /* synthetic */ boolean $smsOptinSwitch;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserConsent$4(boolean z, boolean z2, C11300l<? super Boolean, C11079d2> lVar, C11300l<? super Boolean, C11079d2> lVar2, C11289a<C11079d2> aVar, boolean z3, C8578k2<? extends C28892e<C11079d2>> k2Var, int i) {
        super(2);
        this.$smsOptinSwitch = z;
        this.$emailOptinSwitch = z2;
        this.$onSmsOptinSwitchChecked = lVar;
        this.$onEmailOptinSwitchChecked = lVar2;
        this.$onValidateBtnClicked = aVar;
        this.$isValidateBtnEnable = z3;
        this.$isLoading = k2Var;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CreateLoyaltyCardStepTwoScreenKt.m107009D(this.$smsOptinSwitch, this.$emailOptinSwitch, this.$onSmsOptinSwitchChecked, this.$onEmailOptinSwitchChecked, this.$onValidateBtnClicked, this.$isValidateBtnEnable, this.$isLoading, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
