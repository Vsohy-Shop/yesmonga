package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.text.selection.q */
public final class C2841q {
    /* renamed from: a */
    public static final long m13116a(@C12580l C16260h0 h0Var, int i, int i2, @C12580l C16356n0 n0Var, boolean z, @C12579k SelectionAdjustment selectionAdjustment) {
        Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
        if (h0Var == null) {
            return C16359o0.m73780b(0, 0);
        }
        long b = C16359o0.m73780b(i, i2);
        if (n0Var != null || !Intrinsics.areEqual((Object) selectionAdjustment, (Object) SelectionAdjustment.f7343a.mo9596c())) {
            return selectionAdjustment.mo9594a(h0Var, b, -1, z, n0Var);
        }
        return b;
    }
}
