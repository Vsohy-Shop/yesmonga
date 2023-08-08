package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.SecretCodeVerificationKt$SecretCodeVerification$4 */
public final class SecretCodeVerificationKt$SecretCodeVerification$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11289a<C11079d2> $onResetCode;
    final /* synthetic */ C11300l<String, C11079d2> $onValidateCode;
    final /* synthetic */ C26141a $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecretCodeVerificationKt$SecretCodeVerification$4(C26141a aVar, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar2, int i, int i2) {
        super(2);
        this.$state = aVar;
        this.$onValidateCode = lVar;
        this.$onResetCode = aVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SecretCodeVerificationKt.m104650a(this.$state, this.$onValidateCode, this.$onResetCode, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
