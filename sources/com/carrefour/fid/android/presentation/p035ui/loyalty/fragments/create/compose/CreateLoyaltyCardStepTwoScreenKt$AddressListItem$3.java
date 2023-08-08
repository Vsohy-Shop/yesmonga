package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$AddressListItem$3 */
public final class CreateLoyaltyCardStepTwoScreenKt$AddressListItem$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DQEAddressModel $addressSuggested;
    final /* synthetic */ C11300l<DQEAddressModel, C11079d2> $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$AddressListItem$3(DQEAddressModel dQEAddressModel, C11300l<? super DQEAddressModel, C11079d2> lVar, int i) {
        super(2);
        this.$addressSuggested = dQEAddressModel;
        this.$onClick = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CreateLoyaltyCardStepTwoScreenKt.m107034b(this.$addressSuggested, this.$onClick, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
