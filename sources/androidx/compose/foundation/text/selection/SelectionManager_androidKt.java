package androidx.compose.foundation.text.selection;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import androidx.compose.foundation.C2116e0;
import androidx.compose.foundation.text.C2773h;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class SelectionManager_androidKt {
    /* renamed from: a */
    public static final boolean m12804a(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        if (C2773h.m12580a().mo9313a(keyEvent) == KeyCommand.COPY) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ModifierInspectorInfo"})
    @C12579k
    /* renamed from: b */
    public static final C8767m m12805b(@C12579k C8767m mVar, @C12579k SelectionManager selectionManager) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selectionManager, "manager");
        if (!C2116e0.f5798g.mo7298c().mo7295i()) {
            return mVar;
        }
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, new SelectionManager_androidKt$selectionMagnifier$1(selectionManager), 1, (Object) null);
    }
}
