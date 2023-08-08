package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$2$1 */
public final class C24380x4bec97e1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ C8700z0<String> $phoneNumberText$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24380x4bec97e1(C8700z0<String> z0Var) {
        super(1);
        this.$phoneNumberText$delegate = z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        if (str.length() <= 10) {
            CreateLoyaltyCardStepTwoScreenKt.m107059v(this.$phoneNumberText$delegate, str);
        }
    }
}
