package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$AddressListItem$1 */
public final class CreateLoyaltyCardStepTwoScreenKt$AddressListItem$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ DQEAddressModel $addressSuggested;
    final /* synthetic */ C11300l<DQEAddressModel, C11079d2> $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$AddressListItem$1(C11300l<? super DQEAddressModel, C11079d2> lVar, DQEAddressModel dQEAddressModel) {
        super(0);
        this.$onClick = lVar;
        this.$addressSuggested = dQEAddressModel;
    }

    public final void invoke() {
        this.$onClick.invoke(this.$addressSuggested);
    }
}
