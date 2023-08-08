package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.compose.C36971c;
import com.carrefour.fid.android.design.components.compose.C36975d;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$PreviewCodeInput$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ List<String> $digitList;
    final /* synthetic */ List<FocusRequester> $focusRequesterList;
    final /* synthetic */ List<Boolean> $isFocusState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$PreviewCodeInput$1(List<Boolean> list, List<String> list2, List<FocusRequester> list3) {
        super(2);
        this.$isFocusState = list;
        this.$digitList = list2;
        this.$focusRequesterList = list3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(541149146, i2, -1, "com.carrefour.fid.android.design.components.compose.PreviewCodeInput.<anonymous> (CodeDigitsFieldComponent.kt:543)");
            }
            CodeDigitsFieldComponentKt.m151373a("Secret Code", this.$isFocusState, C36971c.C36972a.f92358a, C36975d.C36982g.f92376a, this.$digitList, this.$focusRequesterList, C36964a.f92344b, false, false, true, false, true, C369271.f92115f, oVar, 920415670, 438);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
