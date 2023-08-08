package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24396c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3$4$1$1$1 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3$4$1$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C24396c, C11079d2> $actioner;
    final /* synthetic */ C8700z0<Boolean> $expanded$delegate;
    final /* synthetic */ String $selectionOption;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3$4$1$1$1(C11300l<? super C24396c, C11079d2> lVar, String str, C8700z0<Boolean> z0Var) {
        super(0);
        this.$actioner = lVar;
        this.$selectionOption = str;
        this.$expanded$delegate = z0Var;
    }

    public final void invoke() {
        this.$actioner.invoke(new C24396c.C24400d(this.$selectionOption));
        CreateLoyaltyCardStepTwoScreenKt.m107008C(this.$expanded$delegate, false);
    }
}
