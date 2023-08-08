package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$CodeInputComponent$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C36971c $codeInputState;
    final /* synthetic */ C36975d $codeMessageStatus;
    final /* synthetic */ String $fieldLabel;
    final /* synthetic */ int $fieldNumber;
    final /* synthetic */ boolean $isCompact;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ C11289a<C11079d2> $onHelperLinkClicked;
    final /* synthetic */ C11300l<String, C11079d2> $onValidateButtonClicked;
    final /* synthetic */ boolean $validateButtonVisibility;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInputComponent$3(C36971c cVar, C36975d dVar, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar, int i, String str, boolean z, boolean z2, boolean z3, int i2, int i3) {
        super(2);
        this.$codeInputState = cVar;
        this.$codeMessageStatus = dVar;
        this.$onValidateButtonClicked = lVar;
        this.$onHelperLinkClicked = aVar;
        this.$fieldNumber = i;
        this.$fieldLabel = str;
        this.$validateButtonVisibility = z;
        this.$isLoading = z2;
        this.$isCompact = z3;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CodeDigitsFieldComponentKt.m151374b(this.$codeInputState, this.$codeMessageStatus, this.$onValidateButtonClicked, this.$onHelperLinkClicked, this.$fieldNumber, this.$fieldLabel, this.$validateButtonVisibility, this.$isLoading, this.$isCompact, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
