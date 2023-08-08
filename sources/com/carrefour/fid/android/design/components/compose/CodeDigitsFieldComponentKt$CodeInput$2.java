package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$CodeInput$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ C11300l<C36965b, C11079d2> $actioner;
    final /* synthetic */ char $blackDotState;
    final /* synthetic */ C36971c $codeInputState;
    final /* synthetic */ C36975d $codeMessageStatus;
    final /* synthetic */ List<String> $digitList;
    final /* synthetic */ String $fieldLabel;
    final /* synthetic */ List<FocusRequester> $focusRequesterList;
    final /* synthetic */ boolean $isCompact;
    final /* synthetic */ List<Boolean> $isFocusState;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ boolean $isValidateBtnEnableState;
    final /* synthetic */ boolean $passwordVisibilityState;
    final /* synthetic */ boolean $validateButtonVisibility;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInput$2(String str, List<Boolean> list, C36971c cVar, C36975d dVar, List<String> list2, List<FocusRequester> list3, char c, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C11300l<? super C36965b, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$fieldLabel = str;
        this.$isFocusState = list;
        this.$codeInputState = cVar;
        this.$codeMessageStatus = dVar;
        this.$digitList = list2;
        this.$focusRequesterList = list3;
        this.$blackDotState = c;
        this.$passwordVisibilityState = z;
        this.$isValidateBtnEnableState = z2;
        this.$validateButtonVisibility = z3;
        this.$isLoading = z4;
        this.$isCompact = z5;
        this.$actioner = lVar;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CodeDigitsFieldComponentKt.m151373a(this.$fieldLabel, this.$isFocusState, this.$codeInputState, this.$codeMessageStatus, this.$digitList, this.$focusRequesterList, this.$blackDotState, this.$passwordVisibilityState, this.$isValidateBtnEnableState, this.$validateButtonVisibility, this.$isLoading, this.$isCompact, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1));
    }
}
