package androidx.compose.p004ui.node;

import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15576j;
import androidx.compose.p004ui.unit.C16494m;

/* renamed from: androidx.compose.ui.node.y */
public final class C15748y {
    /* renamed from: b */
    public static final int m70681b(C15694i0 i0Var, C15531a aVar) {
        boolean z;
        int i;
        C15694i0 Z0 = i0Var.mo44856Z0();
        if (Z0 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException(("Child of " + i0Var + " cannot be null when calculating alignment line").toString());
        } else if (i0Var.mo44862e1().mo8593w().containsKey(aVar)) {
            Integer num = i0Var.mo44862e1().mo8593w().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        } else {
            int A = Z0.mo44325A(aVar);
            if (A == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            Z0.mo45025u1(true);
            i0Var.mo45024r1(true);
            i0Var.mo44878q1();
            Z0.mo45025u1(false);
            i0Var.mo45024r1(false);
            if (aVar instanceof C15576j) {
                i = C16494m.m74583o(Z0.mo44865g1());
            } else {
                i = C16494m.m74581m(Z0.mo44865g1());
            }
            return A + i;
        }
    }
}
