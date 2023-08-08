package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import android.app.DatePickerDialog;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$6 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserInformationField$6 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $birthDateText;
    final /* synthetic */ DatePickerDialog $datePickerDialog;
    final /* synthetic */ C11300l<String, C11079d2> $onBirthDateValueChanged;
    final /* synthetic */ C11300l<String, C11079d2> $onPhoneNumberValueChanged;
    final /* synthetic */ C11304p<String, C24390b, C11079d2> $onTextFieldStateChanged;
    final /* synthetic */ String $phoneNumberText;
    final /* synthetic */ Map<String, C24390b> $textFieldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserInformationField$6(String str, String str2, C11300l<? super String, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, DatePickerDialog datePickerDialog, Map<String, ? extends C24390b> map, C11304p<? super String, ? super C24390b, C11079d2> pVar, int i) {
        super(2);
        this.$birthDateText = str;
        this.$phoneNumberText = str2;
        this.$onBirthDateValueChanged = lVar;
        this.$onPhoneNumberValueChanged = lVar2;
        this.$datePickerDialog = datePickerDialog;
        this.$textFieldState = map;
        this.$onTextFieldStateChanged = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CreateLoyaltyCardStepTwoScreenKt.m107010E(this.$birthDateText, this.$phoneNumberText, this.$onBirthDateValueChanged, this.$onPhoneNumberValueChanged, this.$datePickerDialog, this.$textFieldState, this.$onTextFieldStateChanged, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
