package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$CodeInputTextField$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ char $blackDotState;
    final /* synthetic */ C36971c $codeInputState;
    final /* synthetic */ C36975d $codeMessageStatus;
    final /* synthetic */ String $digit;
    final /* synthetic */ C36988h $focusRequesterDetail;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onFocusChange;
    final /* synthetic */ C11300l<String, C11079d2> $onValueChange;
    final /* synthetic */ boolean $passwordVisibilityState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInputTextField$5(String str, C11300l<? super String, C11079d2> lVar, C11300l<? super Boolean, C11079d2> lVar2, C36988h hVar, char c, boolean z, C36971c cVar, C36975d dVar, int i) {
        super(2);
        this.$digit = str;
        this.$onValueChange = lVar;
        this.$onFocusChange = lVar2;
        this.$focusRequesterDetail = hVar;
        this.$blackDotState = c;
        this.$passwordVisibilityState = z;
        this.$codeInputState = cVar;
        this.$codeMessageStatus = dVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CodeDigitsFieldComponentKt.m151381i(this.$digit, this.$onValueChange, this.$onFocusChange, this.$focusRequesterDetail, this.$blackDotState, this.$passwordVisibilityState, this.$codeInputState, this.$codeMessageStatus, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
