package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.p004ui.focus.C15068j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.snapshots.C8667t;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.loyalty.presentation.models.extension.AccountInfoModelKt;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24396c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$5 */
public final class CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$5 extends Lambda implements C11300l<C24396c, C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $addressSwitch$delegate;
    final /* synthetic */ C8700z0<String> $addressText$delegate;
    final /* synthetic */ C8700z0<String> $cityText$delegate;
    final /* synthetic */ C8700z0<String> $countryText$delegate;
    final /* synthetic */ C15068j $focusManager;
    final /* synthetic */ C8667t<String, C24390b> $inputLoyaltyFieldStateMap;
    final /* synthetic */ C8700z0<String> $postCodeText$delegate;
    final /* synthetic */ C8578k2<List<DQEAddressModel>> $suggestedAddressListState;
    final /* synthetic */ C8578k2<Address> $userAddressState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$5(C8578k2<Address> k2Var, C8667t<String, C24390b> tVar, C15068j jVar, C8578k2<? extends List<DQEAddressModel>> k2Var2, C8700z0<Boolean> z0Var, C8700z0<String> z0Var2, C8700z0<String> z0Var3, C8700z0<String> z0Var4, C8700z0<String> z0Var5) {
        super(1);
        this.$userAddressState = k2Var;
        this.$inputLoyaltyFieldStateMap = tVar;
        this.$focusManager = jVar;
        this.$suggestedAddressListState = k2Var2;
        this.$addressSwitch$delegate = z0Var;
        this.$addressText$delegate = z0Var2;
        this.$postCodeText$delegate = z0Var3;
        this.$cityText$delegate = z0Var4;
        this.$countryText$delegate = z0Var5;
    }

    /* renamed from: a */
    public final void mo71284a(@C12579k C24396c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "action");
        if (cVar instanceof C24396c.C24397a) {
            CreateLoyaltyCardStepTwoScreenKt.m107061x(this.$addressSwitch$delegate, ((C24396c.C24397a) cVar).mo71334d());
            if (CreateLoyaltyCardStepTwoScreenKt.m107060w(this.$addressSwitch$delegate)) {
                Address value = this.$userAddressState.getValue();
                if (value != null) {
                    C8700z0<String> z0Var = this.$addressText$delegate;
                    C8700z0<String> z0Var2 = this.$postCodeText$delegate;
                    C8700z0<String> z0Var3 = this.$cityText$delegate;
                    C8700z0<String> z0Var4 = this.$countryText$delegate;
                    CreateLoyaltyCardStepTwoScreenKt.m107042f(z0Var, value.mo116677B());
                    CreateLoyaltyCardStepTwoScreenKt.m107045h(z0Var2, value.mo116694S());
                    CreateLoyaltyCardStepTwoScreenKt.m107047j(z0Var3, value.mo116684I());
                    CreateLoyaltyCardStepTwoScreenKt.m107050m(z0Var4, AccountInfoModelKt.toCountryName(value.mo116685J()));
                }
                C8667t<String, C24390b> tVar = this.$inputLoyaltyFieldStateMap;
                C24390b.C24395e eVar = C24390b.C24395e.f60857a;
                tVar.put(CreateLoyaltyCardStepTwoScreenKt.f60831c, eVar);
                this.$inputLoyaltyFieldStateMap.put(CreateLoyaltyCardStepTwoScreenKt.f60832d, eVar);
                this.$inputLoyaltyFieldStateMap.put(CreateLoyaltyCardStepTwoScreenKt.f60833e, eVar);
                C15068j.m64745h(this.$focusManager, false, 1, (Object) null);
            }
        } else if (cVar instanceof C24396c.C24398b) {
            CreateLoyaltyCardStepTwoScreenKt.m107042f(this.$addressText$delegate, ((C24396c.C24398b) cVar).mo71340d());
        } else if (cVar instanceof C24396c.C24401e) {
            C24396c.C24401e eVar2 = (C24396c.C24401e) cVar;
            if (eVar2.mo71358d().length() <= 5) {
                CreateLoyaltyCardStepTwoScreenKt.m107045h(this.$postCodeText$delegate, eVar2.mo71358d());
            }
        } else if (cVar instanceof C24396c.C24399c) {
            CreateLoyaltyCardStepTwoScreenKt.m107047j(this.$cityText$delegate, ((C24396c.C24399c) cVar).mo71346d());
        } else if (cVar instanceof C24396c.C24400d) {
            CreateLoyaltyCardStepTwoScreenKt.m107050m(this.$countryText$delegate, ((C24396c.C24400d) cVar).mo71352d());
        } else if (cVar instanceof C24396c.C24402f) {
            C24396c.C24402f fVar = (C24396c.C24402f) cVar;
            CreateLoyaltyCardStepTwoScreenKt.m107042f(this.$addressText$delegate, fVar.mo71364d().mo31628j());
            CreateLoyaltyCardStepTwoScreenKt.m107045h(this.$postCodeText$delegate, fVar.mo71364d().mo31634p());
            CreateLoyaltyCardStepTwoScreenKt.m107047j(this.$cityText$delegate, fVar.mo71364d().mo31629k());
            List<DQEAddressModel> value2 = this.$suggestedAddressListState.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type java.util.ArrayList<com.carrefour.fid.android.account.presentation.models.DQEAddressModel>");
            ((ArrayList) value2).clear();
            C8667t<String, C24390b> tVar2 = this.$inputLoyaltyFieldStateMap;
            C24390b.C24395e eVar3 = C24390b.C24395e.f60857a;
            tVar2.put(CreateLoyaltyCardStepTwoScreenKt.f60831c, eVar3);
            this.$inputLoyaltyFieldStateMap.put(CreateLoyaltyCardStepTwoScreenKt.f60832d, eVar3);
            this.$inputLoyaltyFieldStateMap.put(CreateLoyaltyCardStepTwoScreenKt.f60833e, eVar3);
        } else if (cVar instanceof C24396c.C24403g) {
            C24396c.C24403g gVar = (C24396c.C24403g) cVar;
            this.$inputLoyaltyFieldStateMap.put(gVar.mo71371e(), gVar.mo71373f());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo71284a((C24396c) obj);
        return C11079d2.f28267a;
    }
}
