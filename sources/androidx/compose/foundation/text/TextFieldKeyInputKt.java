package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class TextFieldKeyInputKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m12432a(@C12579k C8767m mVar, @C12579k TextFieldState textFieldState, @C12579k TextFieldSelectionManager textFieldSelectionManager, @C12579k TextFieldValue textFieldValue, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar, boolean z, boolean z2, @C12579k C16281c0 c0Var, @C12579k C2763c0 c0Var2) {
        C8767m mVar2 = mVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(textFieldState, "state");
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "manager");
        Intrinsics.checkNotNullParameter(textFieldValue, "value");
        Intrinsics.checkNotNullParameter(lVar, "onValueChange");
        C16281c0 c0Var3 = c0Var;
        Intrinsics.checkNotNullParameter(c0Var3, "offsetMapping");
        C2763c0 c0Var4 = c0Var2;
        Intrinsics.checkNotNullParameter(c0Var4, "undoManager");
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, new TextFieldKeyInputKt$textFieldKeyInput$2(textFieldState, textFieldSelectionManager, textFieldValue, z, z2, c0Var3, c0Var4, lVar), 1, (Object) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m12433b(C8767m mVar, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, C11300l lVar, boolean z, boolean z2, C16281c0 c0Var, C2763c0 c0Var2, int i, Object obj) {
        TextFieldKeyInputKt$textFieldKeyInput$1 textFieldKeyInputKt$textFieldKeyInput$1;
        if ((i & 8) != 0) {
            textFieldKeyInputKt$textFieldKeyInput$1 = TextFieldKeyInputKt$textFieldKeyInput$1.f7208f;
        } else {
            textFieldKeyInputKt$textFieldKeyInput$1 = lVar;
        }
        return m12432a(mVar, textFieldState, textFieldSelectionManager, textFieldValue, textFieldKeyInputKt$textFieldKeyInput$1, z, z2, c0Var, c0Var2);
    }
}
