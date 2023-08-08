package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15223h3;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15271n0;
import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15553d0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 5 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,277:1\n85#2:278\n85#2:299\n196#3:279\n196#3:300\n306#4,4:280\n360#5,15:284\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n51#1:278\n210#1:299\n51#1:279\n210#1:300\n153#1:280,4\n197#1:284,15\n*E\n"})
/* renamed from: androidx.compose.ui.node.x */
public final class C15742x extends NodeCoordinator {
    @C12579k

    /* renamed from: b1 */
    public static final C15743a f39088b1 = new C15743a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c1 */
    public static final C15211f3 f39089c1;
    @C12579k

    /* renamed from: Z0 */
    public C15740w f39090Z0;
    @C12580l

    /* renamed from: a1 */
    public C15725q f39091a1;

    /* renamed from: androidx.compose.ui.node.x$a */
    public static final class C15743a {
        public /* synthetic */ C15743a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C15211f3 mo45270a() {
            return C15742x.f39089c1;
        }

        public C15743a() {
        }
    }

    @C11363r0({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,277:1\n173#2,3:278\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier\n*L\n130#1:278,3\n*E\n"})
    /* renamed from: androidx.compose.ui.node.x$b */
    public final class C15744b extends C15697j0 {
        @C12579k

        /* renamed from: E0 */
        public final C15745a f39092E0 = new C15745a();

        /* renamed from: F0 */
        public final /* synthetic */ C15742x f39093F0;
        @C12579k

        /* renamed from: Z */
        public final C15725q f39094Z;

        /* renamed from: androidx.compose.ui.node.x$b$a */
        public final class C15745a implements C15564g0 {
            @C12579k

            /* renamed from: a */
            public final Map<C15531a, Integer> f39095a = C10977s0.m41492z();

            public C15745a() {
            }

            public int getHeight() {
                C15697j0 j4 = C15744b.this.f39093F0.mo45268M6().mo44868j4();
                Intrinsics.checkNotNull(j4);
                return j4.mo44862e1().getHeight();
            }

            public int getWidth() {
                C15697j0 j4 = C15744b.this.f39093F0.mo45268M6().mo44868j4();
                Intrinsics.checkNotNull(j4);
                return j4.mo44862e1().getWidth();
            }

            @C12579k
            /* renamed from: w */
            public Map<C15531a, Integer> mo8593w() {
                return this.f39095a;
            }

            /* renamed from: x */
            public void mo8594x() {
                C15611w0.C15612a.C15613a aVar = C15611w0.C15612a.f38749a;
                C15697j0 j4 = C15744b.this.f39093F0.mo45268M6().mo44868j4();
                Intrinsics.checkNotNull(j4);
                C15611w0.C15612a.m69412p(aVar, j4, 0, 0, 0.0f, 4, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15744b(@C12579k C15742x xVar, @C12579k C15553d0 d0Var, C15725q qVar) {
            super(xVar, d0Var);
            Intrinsics.checkNotNullParameter(d0Var, "scope");
            Intrinsics.checkNotNullParameter(qVar, "intermediateMeasureNode");
            this.f39093F0 = xVar;
            this.f39094Z = qVar;
        }

        @C12579k
        /* renamed from: S2 */
        public final C15725q mo45271S2() {
            return this.f39094Z;
        }

        /* renamed from: U0 */
        public int mo45020U0(@C12579k C15531a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
            int a = C15748y.m70681b(this, aVar);
            mo45032S1().put(aVar, Integer.valueOf(a));
            return a;
        }

        @C12579k
        /* renamed from: t0 */
        public C15611w0 mo44324t0(long j) {
            C15725q qVar = this.f39094Z;
            C15742x xVar = this.f39093F0;
            mo44474T0(j);
            C15697j0 j4 = xVar.mo45268M6().mo44868j4();
            Intrinsics.checkNotNull(j4);
            j4.mo44324t0(j);
            qVar.mo44550K(C16502r.m74668a(j4.mo44862e1().getWidth(), j4.mo44862e1().getHeight()));
            mo45031Q2(this.f39092E0);
            return this;
        }
    }

    @C11363r0({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,277:1\n173#2,3:278\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n65#1:278,3\n*E\n"})
    /* renamed from: androidx.compose.ui.node.x$c */
    public final class C15746c extends C15697j0 {

        /* renamed from: Z */
        public final /* synthetic */ C15742x f39097Z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15746c(@C12579k C15742x xVar, C15553d0 d0Var) {
            super(xVar, d0Var);
            Intrinsics.checkNotNullParameter(d0Var, "scope");
            this.f39097Z = xVar;
        }

        /* renamed from: U0 */
        public int mo45020U0(@C12579k C15531a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
            int a = C15748y.m70681b(this, aVar);
            mo45032S1().put(aVar, Integer.valueOf(a));
            return a;
        }

        /* renamed from: a0 */
        public int mo44317a0(int i) {
            C15740w L6 = this.f39097Z.mo45267L6();
            C15697j0 j4 = this.f39097Z.mo45268M6().mo44868j4();
            Intrinsics.checkNotNull(j4);
            return L6.mo17119d(this, j4, i);
        }

        /* renamed from: d */
        public int mo44320d(int i) {
            C15740w L6 = this.f39097Z.mo45267L6();
            C15697j0 j4 = this.f39097Z.mo45268M6().mo44868j4();
            Intrinsics.checkNotNull(j4);
            return L6.mo17118c(this, j4, i);
        }

        /* renamed from: o0 */
        public int mo44322o0(int i) {
            C15740w L6 = this.f39097Z.mo45267L6();
            C15697j0 j4 = this.f39097Z.mo45268M6().mo44868j4();
            Intrinsics.checkNotNull(j4);
            return L6.mo17120f(this, j4, i);
        }

        /* renamed from: p0 */
        public int mo44323p0(int i) {
            C15740w L6 = this.f39097Z.mo45267L6();
            C15697j0 j4 = this.f39097Z.mo45268M6().mo44868j4();
            Intrinsics.checkNotNull(j4);
            return L6.mo17121h(this, j4, i);
        }

        @C12579k
        /* renamed from: t0 */
        public C15611w0 mo44324t0(long j) {
            C15742x xVar = this.f39097Z;
            mo44474T0(j);
            C15740w L6 = xVar.mo45267L6();
            C15697j0 j4 = xVar.mo45268M6().mo44868j4();
            Intrinsics.checkNotNull(j4);
            mo45031Q2(L6.mo17122i(this, j4, j));
            return this;
        }
    }

    static {
        C15211f3 a = C15271n0.m66286a();
        a.mo42759l(C15240j2.f37547b.mo42842c());
        a.mo42772y(1.0f);
        a.mo42771x(C15223h3.f37530b.mo42780b());
        f39089c1 = a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15742x(@C12579k LayoutNode layoutNode, @C12579k C15740w wVar) {
        super(layoutNode);
        boolean z;
        C15725q qVar;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(wVar, "measureNode");
        this.f39090Z0 = wVar;
        C8767m.C8772d q = wVar.mo17252q();
        if ((q.mo17232I() & C15739v0.m70597b(512)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(wVar instanceof C15725q)) {
            qVar = null;
        } else {
            qVar = (C15725q) wVar;
        }
        this.f39091a1 = qVar;
    }

    @C12579k
    /* renamed from: L6 */
    public final C15740w mo45267L6() {
        return this.f39090Z0;
    }

    @C12579k
    /* renamed from: M6 */
    public final NodeCoordinator mo45268M6() {
        NodeCoordinator v4 = mo44887v4();
        Intrinsics.checkNotNull(v4);
        return v4;
    }

    /* renamed from: N0 */
    public void mo44326N0(long j, float f, @C12580l C11300l<? super C15327u2, C11079d2> lVar) {
        super.mo44326N0(j, f, lVar);
        if (!mo45023m1()) {
            mo44825C5();
            C15611w0.C15612a.C15613a aVar = C15611w0.C15612a.f38749a;
            int m = C16500q.m74662m(mo44469I0());
            LayoutDirection layoutDirection = getLayoutDirection();
            C15588o f2 = C15611w0.C15612a.f38753e;
            int I = aVar.mo44480n();
            LayoutDirection H = aVar.mo44479m();
            LayoutNodeLayoutDelegate a = C15611w0.C15612a.f38754f;
            C15611w0.C15612a.f38752d = m;
            C15611w0.C15612a.f38751c = layoutDirection;
            boolean G = aVar.mo44488J(this);
            mo44862e1().mo8594x();
            mo45024r1(G);
            C15611w0.C15612a.f38752d = I;
            C15611w0.C15612a.f38751c = H;
            C15611w0.C15612a.f38753e = f2;
            C15611w0.C15612a.f38754f = a;
        }
    }

    /* renamed from: N6 */
    public final void mo45269N6(@C12579k C15740w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.f39090Z0 = wVar;
    }

    /* renamed from: O5 */
    public void mo44845O5(@C12579k C15118b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        mo45268M6().mo44872m3(b2Var);
        if (C15682e0.m70247b(mo44836H5()).getShowLayoutBounds()) {
            mo44876p3(b2Var, f39089c1);
        }
    }

    /* renamed from: U0 */
    public int mo45020U0(@C12579k C15531a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
        C15697j0 j4 = mo44868j4();
        if (j4 != null) {
            return j4.mo45030N1(aVar);
        }
        return C15748y.m70681b(this, aVar);
    }

    /* renamed from: a0 */
    public int mo44317a0(int i) {
        return this.f39090Z0.mo17119d(this, mo45268M6(), i);
    }

    /* renamed from: d */
    public int mo44320d(int i) {
        return this.f39090Z0.mo17118c(this, mo45268M6(), i);
    }

    @C12579k
    /* renamed from: f3 */
    public C15697j0 mo44864f3(@C12579k C15553d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "scope");
        C15725q qVar = this.f39091a1;
        if (qVar != null) {
            return new C15744b(this, d0Var, qVar);
        }
        return new C15746c(this, d0Var);
    }

    /* renamed from: o0 */
    public int mo44322o0(int i) {
        return this.f39090Z0.mo17120f(this, mo45268M6(), i);
    }

    /* renamed from: o5 */
    public void mo44875o5() {
        boolean z;
        super.mo44875o5();
        C15740w wVar = this.f39090Z0;
        C8767m.C8772d q = wVar.mo17252q();
        if ((q.mo17232I() & C15739v0.m70597b(512)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(wVar instanceof C15725q)) {
            this.f39091a1 = null;
            C15697j0 j4 = mo44868j4();
            if (j4 != null) {
                mo44831E6(new C15746c(this, j4.mo45035h2()));
                return;
            }
            return;
        }
        C15725q qVar = (C15725q) wVar;
        this.f39091a1 = qVar;
        C15697j0 j42 = mo44868j4();
        if (j42 != null) {
            mo44831E6(new C15744b(this, j42.mo45035h2(), qVar));
        }
    }

    /* renamed from: p0 */
    public int mo44323p0(int i) {
        return this.f39090Z0.mo17121h(this, mo45268M6(), i);
    }

    @C12579k
    /* renamed from: s4 */
    public C8767m.C8772d mo44883s4() {
        return this.f39090Z0.mo17252q();
    }

    @C12579k
    /* renamed from: t0 */
    public C15611w0 mo44324t0(long j) {
        mo44474T0(j);
        mo44877p6(this.f39090Z0.mo17122i(this, mo45268M6(), j));
        C15672b1 V3 = mo44850V3();
        if (V3 != null) {
            V3.mo44942d(mo44469I0());
        }
        mo44821A5();
        return this;
    }
}
