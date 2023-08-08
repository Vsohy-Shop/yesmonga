package androidx.compose.foundation.text.selection;

import android.annotation.SuppressLint;
import androidx.compose.foundation.C2116e0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.input.pointer.C15491o;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class TextFieldSelectionManager_androidKt {
    /* renamed from: a */
    public static final boolean m12941a(@C12579k C15491o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return false;
    }

    @SuppressLint({"ModifierInspectorInfo"})
    @C12579k
    /* renamed from: b */
    public static final C8767m m12942b(@C12579k C8767m mVar, @C12579k TextFieldSelectionManager textFieldSelectionManager) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "manager");
        if (!C2116e0.f5798g.mo7298c().mo7295i()) {
            return mVar;
        }
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, new TextFieldSelectionManager_androidKt$textFieldMagnifier$1(textFieldSelectionManager), 1, (Object) null);
    }
}
