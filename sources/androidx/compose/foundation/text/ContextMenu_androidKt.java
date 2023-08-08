package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ContextMenu_androidKt {
    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: a */
    public static final void m12244a(@C12579k SelectionManager selectionManager, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(selectionManager, "manager");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(605522716);
        if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(605522716, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:31)");
            }
            pVar.invoke(o, Integer.valueOf((i2 >> 3) & 14));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ContextMenu_androidKt$ContextMenuArea$2(selectionManager, pVar, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: b */
    public static final void m12245b(@C12579k TextFieldSelectionManager textFieldSelectionManager, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "manager");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-1985516685);
        if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1985516685, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:23)");
            }
            pVar.invoke(o, Integer.valueOf((i2 >> 3) & 14));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ContextMenu_androidKt$ContextMenuArea$1(textFieldSelectionManager, pVar, i));
        }
    }
}
