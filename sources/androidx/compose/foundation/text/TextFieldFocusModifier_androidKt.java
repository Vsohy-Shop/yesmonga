package androidx.compose.foundation.text;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.C15068j;
import androidx.compose.p004ui.input.key.C15441f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class TextFieldFocusModifier_androidKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m12399a(@C12579k C8767m mVar, @C12579k TextFieldState textFieldState, @C12579k C15068j jVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(textFieldState, "state");
        Intrinsics.checkNotNullParameter(jVar, "focusManager");
        return C15441f.m68287b(mVar, new TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(jVar, textFieldState));
    }
}
