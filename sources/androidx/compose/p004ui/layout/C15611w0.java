package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.p004ui.node.C15694i0;
import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.layout.w0 */
public abstract class C15611w0 implements C15574i0 {

    /* renamed from: e */
    public static final int f38744e = 8;

    /* renamed from: a */
    public int f38745a;

    /* renamed from: b */
    public int f38746b;

    /* renamed from: c */
    public long f38747c = C16502r.m74668a(0, 0);

    /* renamed from: d */
    public long f38748d = PlaceableKt.f38671b;

    @C8567o(parameters = 0)
    @C11363r0({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,421:1\n318#1,2:422\n335#1:424\n336#1:426\n321#1,2:427\n335#1,2:429\n327#1:431\n318#1,2:432\n335#1:434\n336#1:436\n321#1,2:437\n335#1,2:439\n327#1:441\n335#1:442\n336#1:444\n335#1:445\n336#1:447\n318#1,2:448\n335#1:450\n336#1:452\n321#1,2:453\n335#1,2:455\n327#1:457\n318#1,2:458\n335#1:460\n336#1:462\n321#1,2:463\n335#1,2:465\n327#1:467\n335#1:468\n336#1:470\n335#1:471\n336#1:473\n335#1:474\n336#1:476\n335#1:477\n336#1:479\n86#2:425\n86#2:435\n86#2:443\n86#2:446\n86#2:451\n86#2:461\n86#2:469\n86#2:472\n86#2:475\n86#2:478\n86#2:480\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n184#1:422,2\n184#1:424\n184#1:426\n184#1:427,2\n184#1:429,2\n184#1:431\n200#1:432,2\n200#1:434\n200#1:436\n200#1:437,2\n200#1:439,2\n200#1:441\n212#1:442\n212#1:444\n224#1:445\n224#1:447\n247#1:448,2\n247#1:450\n247#1:452\n247#1:453,2\n247#1:455,2\n247#1:457\n271#1:458,2\n271#1:460\n271#1:462\n271#1:463,2\n271#1:465,2\n271#1:467\n291#1:468\n291#1:470\n310#1:471\n310#1:473\n319#1:474\n319#1:476\n321#1:477\n321#1:479\n184#1:425\n200#1:435\n212#1:443\n224#1:446\n247#1:451\n271#1:461\n291#1:469\n310#1:472\n319#1:475\n321#1:478\n335#1:480\n*E\n"})
    /* renamed from: androidx.compose.ui.layout.w0$a */
    public static abstract class C15612a {
        @C12579k

        /* renamed from: a */
        public static final C15613a f38749a = new C15613a((DefaultConstructorMarker) null);

        /* renamed from: b */
        public static final int f38750b = 0;
        @C12579k

        /* renamed from: c */
        public static LayoutDirection f38751c = LayoutDirection.Ltr;

        /* renamed from: d */
        public static int f38752d;
        @C12580l

        /* renamed from: e */
        public static C15588o f38753e;
        @C12580l

        /* renamed from: f */
        public static LayoutNodeLayoutDelegate f38754f;

        /* renamed from: androidx.compose.ui.layout.w0$a$a */
        public static final class C15613a extends C15612a {
            public /* synthetic */ C15613a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C8761g
            /* renamed from: l */
            public static /* synthetic */ void m69433l() {
            }

            /* renamed from: J */
            public final boolean mo44488J(C15694i0 i0Var) {
                boolean z = false;
                if (i0Var == null) {
                    C15612a.f38753e = null;
                    C15612a.f38754f = null;
                    return false;
                }
                boolean k1 = i0Var.mo45022k1();
                C15694i0 f1 = i0Var.mo44863f1();
                if (f1 != null && f1.mo45022k1()) {
                    z = true;
                }
                if (z) {
                    i0Var.mo45024r1(true);
                }
                C15612a.f38754f = i0Var.mo44836H5().mo44687k0();
                if (i0Var.mo45022k1() || i0Var.mo45023m1()) {
                    C15612a.f38753e = null;
                } else {
                    C15612a.f38753e = i0Var.mo44858b1();
                }
                return k1;
            }

            /* renamed from: K */
            public final void mo44489K(int i, @C12579k LayoutDirection layoutDirection, @C12580l C15694i0 i0Var, @C12579k C11300l<? super C15612a, C11079d2> lVar) {
                Intrinsics.checkNotNullParameter(layoutDirection, "parentLayoutDirection");
                Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
                C15588o f = C15612a.f38753e;
                C15613a aVar = C15612a.f38749a;
                int I = aVar.mo44480n();
                LayoutDirection H = aVar.mo44479m();
                LayoutNodeLayoutDelegate a = C15612a.f38754f;
                C15612a.f38752d = i;
                C15612a.f38751c = layoutDirection;
                boolean G = mo44488J(i0Var);
                lVar.invoke(this);
                if (i0Var != null) {
                    i0Var.mo45024r1(G);
                }
                C15612a.f38752d = I;
                C15612a.f38751c = H;
                C15612a.f38753e = f;
                C15612a.f38754f = a;
            }

            @C12580l
            /* renamed from: k */
            public C15588o mo44478k() {
                LayoutNodeLayoutDelegate a = C15612a.f38754f;
                if (a != null) {
                    a.mo44745N(true);
                }
                return C15612a.f38753e;
            }

            @C12579k
            /* renamed from: m */
            public LayoutDirection mo44479m() {
                return C15612a.f38751c;
            }

            /* renamed from: n */
            public int mo44480n() {
                return C15612a.f38752d;
            }

            public C15613a() {
            }
        }

        /* renamed from: B */
        public static /* synthetic */ void m69398B(C15612a aVar, C15611w0 w0Var, long j, float f, C11300l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i & 4) != 0) {
                    lVar = PlaceableKt.f38670a;
                }
                aVar.mo44475A(w0Var, j, f2, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        /* renamed from: D */
        public static /* synthetic */ void m69399D(C15612a aVar, C15611w0 w0Var, int i, int i2, float f, C11300l lVar, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i3 & 8) != 0) {
                    lVar = PlaceableKt.f38670a;
                }
                aVar.mo44476C(w0Var, i, i2, f2, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        /* renamed from: F */
        public static /* synthetic */ void m69400F(C15612a aVar, C15611w0 w0Var, long j, float f, C11300l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i & 4) != 0) {
                    lVar = PlaceableKt.f38670a;
                }
                aVar.mo44477E(w0Var, j, f2, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        @C8761g
        /* renamed from: l */
        public static /* synthetic */ void m69411l() {
        }

        /* renamed from: p */
        public static /* synthetic */ void m69412p(C15612a aVar, C15611w0 w0Var, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                aVar.mo44481o(w0Var, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        /* renamed from: r */
        public static /* synthetic */ void m69413r(C15612a aVar, C15611w0 w0Var, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                aVar.mo44482q(w0Var, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        /* renamed from: v */
        public static /* synthetic */ void m69414v(C15612a aVar, C15611w0 w0Var, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                aVar.mo44485u(w0Var, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        /* renamed from: x */
        public static /* synthetic */ void m69415x(C15612a aVar, C15611w0 w0Var, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                aVar.mo44486w(w0Var, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        /* renamed from: z */
        public static /* synthetic */ void m69416z(C15612a aVar, C15611w0 w0Var, int i, int i2, float f, C11300l lVar, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i3 & 8) != 0) {
                    lVar = PlaceableKt.f38670a;
                }
                aVar.mo44487y(w0Var, i, i2, f2, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        /* renamed from: A */
        public final void mo44475A(@C12579k C15611w0 w0Var, long j, float f, @C12579k C11300l<? super C15327u2, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(w0Var, "$this$placeRelativeWithLayer");
            Intrinsics.checkNotNullParameter(lVar, "layerBlock");
            if (mo44479m() == LayoutDirection.Ltr || mo44480n() == 0) {
                long B0 = w0Var.mo44467E0();
                w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(B0), C16494m.m74583o(j) + C16494m.m74583o(B0)), f, lVar);
                return;
            }
            long a = C16496n.m74593a((mo44480n() - w0Var.mo44471K0()) - C16494m.m74581m(j), C16494m.m74583o(j));
            long B02 = w0Var.mo44467E0();
            w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(a) + C16494m.m74581m(B02), C16494m.m74583o(a) + C16494m.m74583o(B02)), f, lVar);
        }

        /* renamed from: C */
        public final void mo44476C(@C12579k C15611w0 w0Var, int i, int i2, float f, @C12579k C11300l<? super C15327u2, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(w0Var, "<this>");
            Intrinsics.checkNotNullParameter(lVar, "layerBlock");
            long a = C16496n.m74593a(i, i2);
            long B0 = w0Var.mo44467E0();
            w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(a) + C16494m.m74581m(B0), C16494m.m74583o(a) + C16494m.m74583o(B0)), f, lVar);
        }

        /* renamed from: E */
        public final void mo44477E(@C12579k C15611w0 w0Var, long j, float f, @C12579k C11300l<? super C15327u2, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(w0Var, "$this$placeWithLayer");
            Intrinsics.checkNotNullParameter(lVar, "layerBlock");
            long B0 = w0Var.mo44467E0();
            w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(B0), C16494m.m74583o(j) + C16494m.m74583o(B0)), f, lVar);
        }

        @C12580l
        @C8761g
        /* renamed from: k */
        public C15588o mo44478k() {
            return null;
        }

        @C12579k
        /* renamed from: m */
        public abstract LayoutDirection mo44479m();

        /* renamed from: n */
        public abstract int mo44480n();

        /* renamed from: o */
        public final void mo44481o(@C12579k C15611w0 w0Var, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(w0Var, "<this>");
            long a = C16496n.m74593a(i, i2);
            long B0 = w0Var.mo44467E0();
            w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(a) + C16494m.m74581m(B0), C16494m.m74583o(a) + C16494m.m74583o(B0)), f, (C11300l<? super C15327u2, C11079d2>) null);
        }

        /* renamed from: q */
        public final void mo44482q(@C12579k C15611w0 w0Var, long j, float f) {
            Intrinsics.checkNotNullParameter(w0Var, "$this$place");
            long B0 = w0Var.mo44467E0();
            w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(B0), C16494m.m74583o(j) + C16494m.m74583o(B0)), f, (C11300l<? super C15327u2, C11079d2>) null);
        }

        /* renamed from: s */
        public final void mo44483s(@C12579k C15611w0 w0Var, long j, float f, @C12580l C11300l<? super C15327u2, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(w0Var, "$this$placeApparentToRealOffset");
            long B0 = w0Var.mo44467E0();
            w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(B0), C16494m.m74583o(j) + C16494m.m74583o(B0)), f, lVar);
        }

        /* renamed from: t */
        public final void mo44484t(@C12579k C15611w0 w0Var, long j, float f, @C12580l C11300l<? super C15327u2, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(w0Var, "$this$placeAutoMirrored");
            if (mo44479m() == LayoutDirection.Ltr || mo44480n() == 0) {
                long B0 = w0Var.mo44467E0();
                w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(B0), C16494m.m74583o(j) + C16494m.m74583o(B0)), f, lVar);
                return;
            }
            long a = C16496n.m74593a((mo44480n() - w0Var.mo44471K0()) - C16494m.m74581m(j), C16494m.m74583o(j));
            long B02 = w0Var.mo44467E0();
            w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(a) + C16494m.m74581m(B02), C16494m.m74583o(a) + C16494m.m74583o(B02)), f, lVar);
        }

        /* renamed from: u */
        public final void mo44485u(@C12579k C15611w0 w0Var, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(w0Var, "<this>");
            long a = C16496n.m74593a(i, i2);
            if (mo44479m() == LayoutDirection.Ltr || mo44480n() == 0) {
                long B0 = w0Var.mo44467E0();
                w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(a) + C16494m.m74581m(B0), C16494m.m74583o(a) + C16494m.m74583o(B0)), f, (C11300l<? super C15327u2, C11079d2>) null);
                return;
            }
            long a2 = C16496n.m74593a((mo44480n() - w0Var.mo44471K0()) - C16494m.m74581m(a), C16494m.m74583o(a));
            long B02 = w0Var.mo44467E0();
            w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(a2) + C16494m.m74581m(B02), C16494m.m74583o(a2) + C16494m.m74583o(B02)), f, (C11300l<? super C15327u2, C11079d2>) null);
        }

        /* renamed from: w */
        public final void mo44486w(@C12579k C15611w0 w0Var, long j, float f) {
            Intrinsics.checkNotNullParameter(w0Var, "$this$placeRelative");
            if (mo44479m() == LayoutDirection.Ltr || mo44480n() == 0) {
                long B0 = w0Var.mo44467E0();
                w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(B0), C16494m.m74583o(j) + C16494m.m74583o(B0)), f, (C11300l<? super C15327u2, C11079d2>) null);
                return;
            }
            long a = C16496n.m74593a((mo44480n() - w0Var.mo44471K0()) - C16494m.m74581m(j), C16494m.m74583o(j));
            long B02 = w0Var.mo44467E0();
            w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(a) + C16494m.m74581m(B02), C16494m.m74583o(a) + C16494m.m74583o(B02)), f, (C11300l<? super C15327u2, C11079d2>) null);
        }

        /* renamed from: y */
        public final void mo44487y(@C12579k C15611w0 w0Var, int i, int i2, float f, @C12579k C11300l<? super C15327u2, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(w0Var, "<this>");
            Intrinsics.checkNotNullParameter(lVar, "layerBlock");
            long a = C16496n.m74593a(i, i2);
            if (mo44479m() == LayoutDirection.Ltr || mo44480n() == 0) {
                long B0 = w0Var.mo44467E0();
                w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(a) + C16494m.m74581m(B0), C16494m.m74583o(a) + C16494m.m74583o(B0)), f, lVar);
                return;
            }
            long a2 = C16496n.m74593a((mo44480n() - w0Var.mo44471K0()) - C16494m.m74581m(a), C16494m.m74583o(a));
            long B02 = w0Var.mo44467E0();
            w0Var.mo44326N0(C16496n.m74593a(C16494m.m74581m(a2) + C16494m.m74581m(B02), C16494m.m74583o(a2) + C16494m.m74583o(B02)), f, lVar);
        }
    }

    /* renamed from: E0 */
    public final long mo44467E0() {
        return C16496n.m74593a((this.f38745a - C16500q.m74662m(this.f38747c)) / 2, (this.f38746b - C16500q.m74659j(this.f38747c)) / 2);
    }

    /* renamed from: G0 */
    public final int mo44468G0() {
        return this.f38746b;
    }

    /* renamed from: I0 */
    public final long mo44469I0() {
        return this.f38747c;
    }

    /* renamed from: J0 */
    public final long mo44470J0() {
        return this.f38748d;
    }

    /* renamed from: K0 */
    public final int mo44471K0() {
        return this.f38745a;
    }

    /* renamed from: N0 */
    public abstract void mo44326N0(long j, float f, @C12580l C11300l<? super C15327u2, C11079d2> lVar);

    /* renamed from: P0 */
    public final void mo44472P0() {
        this.f38745a = C11479u.m44334I(C16500q.m74662m(this.f38747c), C16476b.m74364r(this.f38748d), C16476b.m74362p(this.f38748d));
        this.f38746b = C11479u.m44334I(C16500q.m74659j(this.f38747c), C16476b.m74363q(this.f38748d), C16476b.m74361o(this.f38748d));
    }

    /* renamed from: Q0 */
    public final void mo44473Q0(long j) {
        if (!C16500q.m74657h(this.f38747c, j)) {
            this.f38747c = j;
            mo44472P0();
        }
    }

    /* renamed from: T0 */
    public final void mo44474T0(long j) {
        if (!C16476b.m74353g(this.f38748d, j)) {
            this.f38748d = j;
            mo44472P0();
        }
    }

    /* renamed from: Z */
    public int mo44416Z() {
        return C16500q.m74662m(this.f38747c);
    }

    /* renamed from: f */
    public int mo44418f() {
        return C16500q.m74659j(this.f38747c);
    }
}
