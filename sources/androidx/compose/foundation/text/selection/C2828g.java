package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.C2830i;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.text.selection.g */
public final class C2828g {
    /* renamed from: b */
    public static final C2830i m13050b(long j, boolean z, long j2, C16260h0 h0Var) {
        return new C2830i(new C2830i.C2831a(h0Var.mo47047c(C16356n0.m73742n(j)), C16356n0.m73742n(j), j2), new C2830i.C2831a(h0Var.mo47047c(Math.max(C16356n0.m73737i(j) - 1, 0)), C16356n0.m73737i(j), j2), z);
    }

    /* renamed from: c */
    public static final int m13051c(@C12579k C16260h0 h0Var, @C12579k C15098i iVar, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
        Intrinsics.checkNotNullParameter(iVar, "bounds");
        int length = h0Var.mo47058l().mo47040n().length();
        if (iVar.mo42267f(j)) {
            return C11479u.m44334I(h0Var.mo47070x(j), 0, length);
        }
        if (SelectionMode.f7379a.mo9693q(j, iVar) < 0) {
            return 0;
        }
        return length;
    }

    @C12579k
    /* renamed from: d */
    public static final Pair<C2830i, Boolean> m13052d(@C12579k C16260h0 h0Var, long j, long j2, @C12580l C15094f fVar, long j3, @C12579k SelectionAdjustment selectionAdjustment, @C12580l C2830i iVar, boolean z) {
        int i;
        C16356n0 n0Var;
        boolean z2;
        C16260h0 h0Var2 = h0Var;
        C2830i iVar2 = iVar;
        Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
        Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
        C15098i iVar3 = new C15098i(0.0f, 0.0f, (float) C16500q.m74662m(h0Var.mo47043B()), (float) C16500q.m74659j(h0Var.mo47043B()));
        if (!SelectionMode.f7379a.mo9694r(iVar3, j, j2)) {
            return new Pair<>(null, Boolean.FALSE);
        }
        int c = m13051c(h0Var, iVar3, j);
        int c2 = m13051c(h0Var, iVar3, j2);
        if (fVar != null) {
            i = m13051c(h0Var, iVar3, fVar.mo42242A());
        } else {
            i = -1;
        }
        int i2 = i;
        long b = C16359o0.m73780b(c, c2);
        if (iVar2 != null) {
            n0Var = C16356n0.m73730b(iVar.mo9875j());
        } else {
            n0Var = null;
        }
        long a = selectionAdjustment.mo9594a(h0Var, b, i2, z, n0Var);
        C2830i b2 = m13050b(a, C16356n0.m73741m(a), j3, h0Var);
        boolean z3 = true;
        boolean z4 = !Intrinsics.areEqual((Object) b2, (Object) iVar2);
        if (!z ? c2 == i2 : c == i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && !z4) {
            z3 = false;
        }
        return new Pair<>(b2, Boolean.valueOf(z3));
    }

    /* renamed from: e */
    public static /* synthetic */ Pair m13053e(C16260h0 h0Var, long j, long j2, C15094f fVar, long j3, SelectionAdjustment selectionAdjustment, C2830i iVar, boolean z, int i, Object obj) {
        int i2 = i;
        return m13052d(h0Var, j, j2, fVar, j3, selectionAdjustment, (i2 & 64) != 0 ? null : iVar, (i2 & 128) != 0 ? true : z);
    }
}
