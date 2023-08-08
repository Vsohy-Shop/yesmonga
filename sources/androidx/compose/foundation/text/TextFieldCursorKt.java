package androidx.compose.foundation.text;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,100:1\n154#2:101\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n*L\n95#1:101\n*E\n"})
public final class TextFieldCursorKt {
    @C12579k

    /* renamed from: a */
    public static final C1968g<Float> f7184a = C1972h.m8381f(C1972h.m8382g(TextFieldCursorKt$cursorAnimationSpec$1.f7186f), (RepeatMode) null, 0, 6, (Object) null);

    /* renamed from: b */
    public static final float f7185b = C16483g.m74435M((float) 2);

    @C12579k
    /* renamed from: b */
    public static final C8767m m12375b(@C12579k C8767m mVar, @C12579k TextFieldState textFieldState, @C12579k TextFieldValue textFieldValue, @C12579k C16281c0 c0Var, @C12579k C15421z1 z1Var, boolean z) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(textFieldState, "state");
        Intrinsics.checkNotNullParameter(textFieldValue, "value");
        Intrinsics.checkNotNullParameter(c0Var, "offsetMapping");
        Intrinsics.checkNotNullParameter(z1Var, "cursorBrush");
        if (z) {
            return ComposedModifierKt.m32287j(mVar, (C11300l) null, new TextFieldCursorKt$cursor$1(z1Var, textFieldState, textFieldValue, c0Var), 1, (Object) null);
        }
        return mVar;
    }

    /* renamed from: c */
    public static final float m12376c() {
        return f7185b;
    }
}
