package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24396c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$6$1$1$1$1 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserAddressField$6$1$1$1$1 extends Lambda implements C11300l<DQEAddressModel, C11079d2> {
    final /* synthetic */ C11300l<C24396c, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserAddressField$6$1$1$1$1(C11300l<? super C24396c, C11079d2> lVar) {
        super(1);
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo71312a(@C12579k DQEAddressModel dQEAddressModel) {
        Intrinsics.checkNotNullParameter(dQEAddressModel, "it");
        this.$actioner.invoke(new C24396c.C24402f(dQEAddressModel));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo71312a((DQEAddressModel) obj);
        return C11079d2.f28267a;
    }
}
