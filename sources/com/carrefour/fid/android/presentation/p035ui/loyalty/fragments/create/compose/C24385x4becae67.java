package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$8$1 */
public final class C24385x4becae67 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8700z0<String> $addressText$delegate;
    final /* synthetic */ C8700z0<String> $birthDateText$delegate;
    final /* synthetic */ C8700z0<String> $cityText$delegate;
    final /* synthetic */ C8700z0<String> $countryText$delegate;
    final /* synthetic */ C8700z0<Boolean> $emailOptinSwitch$delegate;
    final /* synthetic */ C11300l<LoyaltyMembershipConsentModel, C11079d2> $onValidateUserInformation;
    final /* synthetic */ C8700z0<String> $phoneNumberText$delegate;
    final /* synthetic */ C8700z0<String> $postCodeText$delegate;
    final /* synthetic */ C8700z0<Boolean> $smsOptinSwitch$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24385x4becae67(C11300l<? super LoyaltyMembershipConsentModel, C11079d2> lVar, C8700z0<Boolean> z0Var, C8700z0<Boolean> z0Var2, C8700z0<String> z0Var3, C8700z0<String> z0Var4, C8700z0<String> z0Var5, C8700z0<String> z0Var6, C8700z0<String> z0Var7, C8700z0<String> z0Var8) {
        super(0);
        this.$onValidateUserInformation = lVar;
        this.$emailOptinSwitch$delegate = z0Var;
        this.$smsOptinSwitch$delegate = z0Var2;
        this.$phoneNumberText$delegate = z0Var3;
        this.$birthDateText$delegate = z0Var4;
        this.$addressText$delegate = z0Var5;
        this.$cityText$delegate = z0Var6;
        this.$countryText$delegate = z0Var7;
        this.$postCodeText$delegate = z0Var8;
    }

    public final void invoke() {
        String str = "0";
        String str2 = CreateLoyaltyCardStepTwoScreenKt.m107053p(this.$emailOptinSwitch$delegate) ? "1" : str;
        if (CreateLoyaltyCardStepTwoScreenKt.m107051n(this.$smsOptinSwitch$delegate)) {
            str = "1";
        }
        this.$onValidateUserInformation.invoke(new LoyaltyMembershipConsentModel(str2, str, (String) null, (String) null, CreateLoyaltyCardStepTwoScreenKt.m107058u(this.$phoneNumberText$delegate), CreateLoyaltyCardStepTwoScreenKt.m107048k(this.$birthDateText$delegate), new Address(CreateLoyaltyCardStepTwoScreenKt.m107049l(this.$countryText$delegate), (String) null, (String) null, CreateLoyaltyCardStepTwoScreenKt.m107046i(this.$cityText$delegate), CreateLoyaltyCardStepTwoScreenKt.m107040e(this.$addressText$delegate), CreateLoyaltyCardStepTwoScreenKt.m107044g(this.$postCodeText$delegate), (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, AddressCategory.BILLING, 0, false, 0.0d, 0.0d, (Boolean) null, (String) null, 1040326, (DefaultConstructorMarker) null), 12, (DefaultConstructorMarker) null));
    }
}
