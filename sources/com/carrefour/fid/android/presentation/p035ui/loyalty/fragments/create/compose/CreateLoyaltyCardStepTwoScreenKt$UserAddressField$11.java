package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.domain.models.account.Address;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$11 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserAddressField$11 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C24396c, C11079d2> $actioner;
    final /* synthetic */ String $address;
    final /* synthetic */ boolean $addressSwitch;
    final /* synthetic */ String $city;
    final /* synthetic */ String $country;
    final /* synthetic */ C11300l<String, C11079d2> $fetchSuggestedAddress;
    final /* synthetic */ String $postCode;
    final /* synthetic */ C8578k2<List<DQEAddressModel>> $suggestedAddressList;
    final /* synthetic */ Map<String, C24390b> $textFieldState;
    final /* synthetic */ C8578k2<Address> $userBillingAddressState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserAddressField$11(boolean z, C8578k2<Address> k2Var, Map<String, ? extends C24390b> map, String str, String str2, String str3, String str4, C11300l<? super String, C11079d2> lVar, C8578k2<? extends List<DQEAddressModel>> k2Var2, C11300l<? super C24396c, C11079d2> lVar2, int i) {
        super(2);
        this.$addressSwitch = z;
        this.$userBillingAddressState = k2Var;
        this.$textFieldState = map;
        this.$address = str;
        this.$postCode = str2;
        this.$city = str3;
        this.$country = str4;
        this.$fetchSuggestedAddress = lVar;
        this.$suggestedAddressList = k2Var2;
        this.$actioner = lVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CreateLoyaltyCardStepTwoScreenKt.m107006A(this.$addressSwitch, this.$userBillingAddressState, this.$textFieldState, this.$address, this.$postCode, this.$city, this.$country, this.$fetchSuggestedAddress, this.$suggestedAddressList, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
