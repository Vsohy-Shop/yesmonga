package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.text.C16260h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.selection.u */
public final class C2845u {
    /* renamed from: a */
    public static final float m13122a(@C12579k C16260h0 h0Var, int i, boolean z, boolean z2) {
        int i2;
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        boolean z3 = false;
        if ((!z || z2) && (z || !z2)) {
            i2 = Math.max(i - 1, 0);
        } else {
            i2 = i;
        }
        if (h0Var.mo47047c(i2) == h0Var.mo47071y(i)) {
            z3 = true;
        }
        return h0Var.mo47056j(i, z3);
    }

    /* renamed from: b */
    public static final long m13123b(@C12579k C16260h0 h0Var, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
        return C15096g.m64898a(m13122a(h0Var, i, z, z2), h0Var.mo47059m(h0Var.mo47062q(i)));
    }
}
