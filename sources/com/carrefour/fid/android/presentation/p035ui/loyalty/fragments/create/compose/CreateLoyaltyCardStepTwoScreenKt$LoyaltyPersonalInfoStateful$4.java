package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import android.app.DatePickerDialog;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$4 */
public final class CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ DatePickerDialog $datePickerDialog;
    final /* synthetic */ C11300l<String, C11079d2> $fetchSuggestedAddress;
    final /* synthetic */ C11300l<LoyaltyMembershipConsentModel, C11079d2> $onValidateUserInformation;
    final /* synthetic */ InitLoyaltyCardViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$4(InitLoyaltyCardViewModel initLoyaltyCardViewModel, DatePickerDialog datePickerDialog, C11300l<? super String, C11079d2> lVar, C11300l<? super LoyaltyMembershipConsentModel, C11079d2> lVar2, int i, int i2) {
        super(2);
        this.$viewModel = initLoyaltyCardViewModel;
        this.$datePickerDialog = datePickerDialog;
        this.$fetchSuggestedAddress = lVar;
        this.$onValidateUserInformation = lVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CreateLoyaltyCardStepTwoScreenKt.m107038d(this.$viewModel, this.$datePickerDialog, this.$fetchSuggestedAddress, this.$onValidateUserInformation, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
