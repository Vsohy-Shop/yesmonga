package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TelephoneNumberComponentKt$TelephoneNumberComponent$2$1 */
public final class TelephoneNumberComponentKt$TelephoneNumberComponent$2$1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $editMode;
    final /* synthetic */ C11300l<String, C11079d2> $onValidate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TelephoneNumberComponentKt$TelephoneNumberComponent$2$1(C8700z0<Boolean> z0Var, C11300l<? super String, C11079d2> lVar) {
        super(1);
        this.$editMode = z0Var;
        this.$onValidate = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "newNumber");
        this.$editMode.setValue(Boolean.FALSE);
        this.$onValidate.invoke(str);
    }
}
