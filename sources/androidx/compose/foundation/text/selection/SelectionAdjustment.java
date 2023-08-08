package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public interface SelectionAdjustment {
    @C12579k

    /* renamed from: a */
    public static final Companion f7343a = Companion.f7344a;

    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f7344a = new Companion();
        @C12579k

        /* renamed from: b */
        public static final SelectionAdjustment f7345b = new C2791c();
        @C12579k

        /* renamed from: c */
        public static final SelectionAdjustment f7346c = new C2789a();
        @C12579k

        /* renamed from: d */
        public static final SelectionAdjustment f7347d = new SelectionAdjustment$Companion$Word$1();
        @C12579k

        /* renamed from: e */
        public static final SelectionAdjustment f7348e = new SelectionAdjustment$Companion$Paragraph$1();
        @C12579k

        /* renamed from: f */
        public static final SelectionAdjustment f7349f = new C2790b();

        /* renamed from: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$a */
        public static final class C2789a implements SelectionAdjustment {
            /* renamed from: a */
            public long mo9594a(@C12579k C16260h0 h0Var, long j, int i, boolean z, @C12580l C16356n0 n0Var) {
                boolean z2;
                Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
                if (!C16356n0.m73736h(j)) {
                    return j;
                }
                if (n0Var != null) {
                    z2 = C16356n0.m73741m(n0Var.mo47427r());
                } else {
                    z2 = false;
                }
                return C2832j.m13082a(h0Var.mo47058l().mo47040n().mo46683j(), C16356n0.m73742n(j), StringsKt__StringsKt.getLastIndex(h0Var.mo47058l().mo47040n()), z, z2);
            }
        }

        /* renamed from: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$b */
        public static final class C2790b implements SelectionAdjustment {
            /* renamed from: a */
            public long mo9594a(@C12579k C16260h0 h0Var, long j, int i, boolean z, @C12580l C16356n0 n0Var) {
                int i2;
                int i3;
                Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
                if (n0Var == null) {
                    return Companion.f7344a.mo9600g().mo9594a(h0Var, j, i, z, n0Var);
                }
                if (C16356n0.m73736h(j)) {
                    return C2832j.m13082a(h0Var.mo47058l().mo47040n().mo46683j(), C16356n0.m73742n(j), StringsKt__StringsKt.getLastIndex(h0Var.mo47058l().mo47040n()), z, C16356n0.m73741m(n0Var.mo47427r()));
                }
                if (z) {
                    i3 = mo9604e(h0Var, C16356n0.m73742n(j), i, C16356n0.m73742n(n0Var.mo47427r()), C16356n0.m73737i(j), true, C16356n0.m73741m(j));
                    i2 = C16356n0.m73737i(j);
                } else {
                    int n = C16356n0.m73742n(j);
                    i2 = mo9604e(h0Var, C16356n0.m73737i(j), i, C16356n0.m73737i(n0Var.mo47427r()), C16356n0.m73742n(j), false, C16356n0.m73741m(j));
                    i3 = n;
                }
                return C16359o0.m73780b(i3, i2);
            }

            /* renamed from: b */
            public final boolean mo9601b(C16260h0 h0Var, int i) {
                long C = h0Var.mo47044C(i);
                if (i == C16356n0.m73742n(C) || i == C16356n0.m73737i(C)) {
                    return true;
                }
                return false;
            }

            /* renamed from: c */
            public final boolean mo9602c(int i, int i2, boolean z, boolean z2) {
                if (i2 == -1) {
                    return true;
                }
                if (i == i2) {
                    return false;
                }
                if (z ^ z2) {
                    if (i < i2) {
                        return true;
                    }
                } else if (i > i2) {
                    return true;
                }
                return false;
            }

            /* renamed from: d */
            public final int mo9603d(C16260h0 h0Var, int i, int i2, int i3, boolean z, boolean z2) {
                int i4;
                int i5;
                long C = h0Var.mo47044C(i);
                if (h0Var.mo47062q(C16356n0.m73742n(C)) == i2) {
                    i4 = C16356n0.m73742n(C);
                } else {
                    i4 = h0Var.mo47067u(i2);
                }
                if (h0Var.mo47062q(C16356n0.m73737i(C)) == i2) {
                    i5 = C16356n0.m73737i(C);
                } else {
                    i5 = C16260h0.m73233p(h0Var, i2, false, 2, (Object) null);
                }
                if (i4 == i3) {
                    return i5;
                }
                if (i5 == i3) {
                    return i4;
                }
                int i6 = (i4 + i5) / 2;
                if (z ^ z2) {
                    if (i <= i6) {
                        return i4;
                    }
                } else if (i < i6) {
                    return i4;
                }
                return i5;
            }

            /* renamed from: e */
            public final int mo9604e(C16260h0 h0Var, int i, int i2, int i3, int i4, boolean z, boolean z2) {
                if (i == i2) {
                    return i3;
                }
                int q = h0Var.mo47062q(i);
                if (q != h0Var.mo47062q(i3)) {
                    return mo9603d(h0Var, i, q, i4, z, z2);
                }
                if (mo9602c(i, i2, z, z2) && mo9601b(h0Var, i3)) {
                    return mo9603d(h0Var, i, q, i4, z, z2);
                }
                return i;
            }
        }

        /* renamed from: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$c */
        public static final class C2791c implements SelectionAdjustment {
            /* renamed from: a */
            public long mo9594a(@C12579k C16260h0 h0Var, long j, int i, boolean z, @C12580l C16356n0 n0Var) {
                Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
                return j;
            }
        }

        /* renamed from: b */
        public final long mo9595b(C16260h0 h0Var, long j, C11300l<? super Integer, C16356n0> lVar) {
            boolean z;
            int i;
            int i2;
            if (h0Var.mo47058l().mo47040n().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return C16356n0.f40590b.mo47429a();
            }
            int lastIndex = StringsKt__StringsKt.getLastIndex(h0Var.mo47058l().mo47040n());
            long r = lVar.invoke(Integer.valueOf(C11479u.m44334I(C16356n0.m73742n(j), 0, lastIndex))).mo47427r();
            long r2 = lVar.invoke(Integer.valueOf(C11479u.m44334I(C16356n0.m73737i(j), 0, lastIndex))).mo47427r();
            if (C16356n0.m73741m(j)) {
                i = C16356n0.m73737i(r);
            } else {
                i = C16356n0.m73742n(r);
            }
            if (C16356n0.m73741m(j)) {
                i2 = C16356n0.m73742n(r2);
            } else {
                i2 = C16356n0.m73737i(r2);
            }
            return C16359o0.m73780b(i, i2);
        }

        @C12579k
        /* renamed from: c */
        public final SelectionAdjustment mo9596c() {
            return f7346c;
        }

        @C12579k
        /* renamed from: d */
        public final SelectionAdjustment mo9597d() {
            return f7349f;
        }

        @C12579k
        /* renamed from: e */
        public final SelectionAdjustment mo9598e() {
            return f7345b;
        }

        @C12579k
        /* renamed from: f */
        public final SelectionAdjustment mo9599f() {
            return f7348e;
        }

        @C12579k
        /* renamed from: g */
        public final SelectionAdjustment mo9600g() {
            return f7347d;
        }
    }

    /* renamed from: a */
    long mo9594a(@C12579k C16260h0 h0Var, long j, int i, boolean z, @C12580l C16356n0 n0Var);
}
