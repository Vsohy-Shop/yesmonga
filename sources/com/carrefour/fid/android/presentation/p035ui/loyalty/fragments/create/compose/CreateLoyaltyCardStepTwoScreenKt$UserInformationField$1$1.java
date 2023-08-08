package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import android.widget.DatePicker;
import java.util.Arrays;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$1$1 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserInformationField$1$1 extends Lambda implements C11306r<DatePicker, Integer, Integer, Integer, C11079d2> {
    final /* synthetic */ C11300l<String, C11079d2> $onBirthDateValueChanged;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserInformationField$1$1(C11300l<? super String, C11079d2> lVar) {
        super(4);
        this.$onBirthDateValueChanged = lVar;
    }

    /* renamed from: a */
    public final void mo71319a(DatePicker datePicker, int i, int i2, int i3) {
        C11300l<String, C11079d2> lVar = this.$onBirthDateValueChanged;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format("%02d/%02d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2 + 1), Integer.valueOf(i)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        lVar.invoke(format);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo71319a((DatePicker) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
