package androidx.compose.foundation.text;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.text.C16361p0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class TextFieldSizeKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m12473a(@C12579k C8767m mVar, @C12579k C16361p0 p0Var) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, new TextFieldSizeKt$textFieldMinSize$1(p0Var), 1, (Object) null);
    }
}
