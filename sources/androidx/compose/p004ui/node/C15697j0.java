package androidx.compose.p004ui.node;

import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15553d0;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.layout.C15619z;
import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n1#2:208\n360#3,15:209\n86#4:224\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n160#1:209,15\n201#1:224\n*E\n"})
/* renamed from: androidx.compose.ui.node.j0 */
public abstract class C15697j0 extends C15694i0 implements C15557e0 {
    @C12580l

    /* renamed from: X */
    public C15564g0 f39007X;
    @C12579k

    /* renamed from: Y */
    public final Map<C15531a, Integer> f39008Y = new LinkedHashMap();
    @C12579k

    /* renamed from: v */
    public final NodeCoordinator f39009v;
    @C12579k

    /* renamed from: w */
    public final C15553d0 f39010w;

    /* renamed from: x */
    public long f39011x = C16494m.f40890b.mo47857a();
    @C12580l

    /* renamed from: y */
    public Map<C15531a, Integer> f39012y;
    @C12579k

    /* renamed from: z */
    public final C15619z f39013z = new C15619z(this);

    public C15697j0(@C12579k NodeCoordinator nodeCoordinator, @C12579k C15553d0 d0Var) {
        Intrinsics.checkNotNullParameter(nodeCoordinator, "coordinator");
        Intrinsics.checkNotNullParameter(d0Var, "lookaheadScope");
        this.f39009v = nodeCoordinator;
        this.f39010w = d0Var;
    }

    /* renamed from: D2 */
    public final long mo45028D2(@C12579k C15697j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "ancestor");
        long a = C16494m.f40890b.mo47857a();
        C15697j0 j0Var2 = this;
        while (!Intrinsics.areEqual((Object) j0Var2, (Object) j0Var)) {
            long g1 = j0Var2.mo44865g1();
            a = C16496n.m74593a(C16494m.m74581m(a) + C16494m.m74581m(g1), C16494m.m74583o(a) + C16494m.m74583o(g1));
            NodeCoordinator z4 = j0Var2.f39009v.mo44894z4();
            Intrinsics.checkNotNull(z4);
            j0Var2 = z4.mo44868j4();
            Intrinsics.checkNotNull(j0Var2);
        }
        return a;
    }

    @C12579k
    /* renamed from: H5 */
    public LayoutNode mo44836H5() {
        return this.f39009v.mo44836H5();
    }

    /* renamed from: I2 */
    public void mo45029I2(long j) {
        this.f39011x = j;
    }

    /* renamed from: N0 */
    public final void mo44326N0(long j, float f, @C12580l C11300l<? super C15327u2, C11079d2> lVar) {
        if (!C16494m.m74578j(mo44865g1(), j)) {
            mo45029I2(j);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate w = mo44836H5().mo44687k0().mo44758w();
            if (w != null) {
                w.mo44783m1();
            }
            mo45021j1(this.f39009v);
        }
        if (!mo45023m1()) {
            mo45037v2();
        }
    }

    /* renamed from: N1 */
    public final int mo45030N1(@C12579k C15531a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
        Integer num = this.f39008Y.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: Q2 */
    public final void mo45031Q2(C15564g0 g0Var) {
        C11079d2 d2Var;
        boolean z;
        if (g0Var != null) {
            mo44473Q0(C16502r.m74668a(g0Var.getWidth(), g0Var.getHeight()));
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            mo44473Q0(C16500q.f40900b.mo47897a());
        }
        if (!Intrinsics.areEqual((Object) this.f39007X, (Object) g0Var) && g0Var != null) {
            Map<C15531a, Integer> map = this.f39012y;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if ((!z || (!g0Var.mo8593w().isEmpty())) && !Intrinsics.areEqual((Object) g0Var.mo8593w(), (Object) this.f39012y)) {
                mo44852W0().mo44789w().mo44538q();
                Map map2 = this.f39012y;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f39012y = map2;
                }
                map2.clear();
                map2.putAll(g0Var.mo8593w());
            }
        }
        this.f39007X = g0Var;
    }

    /* renamed from: R4 */
    public float mo7419R4() {
        return this.f39009v.mo7419R4();
    }

    @C12579k
    /* renamed from: S1 */
    public final Map<C15531a, Integer> mo45032S1() {
        return this.f39008Y;
    }

    @C12579k
    /* renamed from: W0 */
    public C15665a mo44852W0() {
        C15665a t = this.f39009v.mo44836H5().mo44687k0().mo44755t();
        Intrinsics.checkNotNull(t);
        return t;
    }

    @C12580l
    /* renamed from: Z0 */
    public C15694i0 mo44856Z0() {
        NodeCoordinator v4 = this.f39009v.mo44887v4();
        if (v4 != null) {
            return v4.mo44868j4();
        }
        return null;
    }

    /* renamed from: a0 */
    public int mo44317a0(int i) {
        NodeCoordinator v4 = this.f39009v.mo44887v4();
        Intrinsics.checkNotNull(v4);
        C15697j0 j4 = v4.mo44868j4();
        Intrinsics.checkNotNull(j4);
        return j4.mo44317a0(i);
    }

    @C12579k
    /* renamed from: b1 */
    public C15588o mo44858b1() {
        return this.f39013z;
    }

    @C12580l
    /* renamed from: c */
    public Object mo44417c() {
        return this.f39009v.mo44417c();
    }

    /* renamed from: c1 */
    public boolean mo44860c1() {
        return this.f39007X != null;
    }

    @C12579k
    /* renamed from: c2 */
    public final NodeCoordinator mo45033c2() {
        return this.f39009v;
    }

    /* renamed from: d */
    public int mo44320d(int i) {
        NodeCoordinator v4 = this.f39009v.mo44887v4();
        Intrinsics.checkNotNull(v4);
        C15697j0 j4 = v4.mo44868j4();
        Intrinsics.checkNotNull(j4);
        return j4.mo44320d(i);
    }

    @C12579k
    /* renamed from: d2 */
    public final C15619z mo45034d2() {
        return this.f39013z;
    }

    @C12579k
    /* renamed from: e1 */
    public C15564g0 mo44862e1() {
        C15564g0 g0Var = this.f39007X;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @C12580l
    /* renamed from: f1 */
    public C15694i0 mo44863f1() {
        NodeCoordinator z4 = this.f39009v.mo44894z4();
        if (z4 != null) {
            return z4.mo44868j4();
        }
        return null;
    }

    /* renamed from: g1 */
    public long mo44865g1() {
        return this.f39011x;
    }

    public float getDensity() {
        return this.f39009v.getDensity();
    }

    @C12579k
    public LayoutDirection getLayoutDirection() {
        return this.f39009v.getLayoutDirection();
    }

    @C12579k
    /* renamed from: h2 */
    public final C15553d0 mo45035h2() {
        return this.f39010w;
    }

    @C12579k
    /* renamed from: i2 */
    public final C15611w0 mo45036i2(long j, @C12579k C11289a<? extends C15564g0> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        mo44474T0(j);
        mo45031Q2((C15564g0) aVar.invoke());
        return this;
    }

    /* renamed from: o0 */
    public int mo44322o0(int i) {
        NodeCoordinator v4 = this.f39009v.mo44887v4();
        Intrinsics.checkNotNull(v4);
        C15697j0 j4 = v4.mo44868j4();
        Intrinsics.checkNotNull(j4);
        return j4.mo44322o0(i);
    }

    /* renamed from: p0 */
    public int mo44323p0(int i) {
        NodeCoordinator v4 = this.f39009v.mo44887v4();
        Intrinsics.checkNotNull(v4);
        C15697j0 j4 = v4.mo44868j4();
        Intrinsics.checkNotNull(j4);
        return j4.mo44323p0(i);
    }

    /* renamed from: q1 */
    public void mo44878q1() {
        mo44326N0(mo44865g1(), 0.0f, (C11300l<? super C15327u2, C11079d2>) null);
    }

    /* renamed from: v2 */
    public void mo45037v2() {
        C15611w0.C15612a.C15613a aVar = C15611w0.C15612a.f38749a;
        int width = mo44862e1().getWidth();
        LayoutDirection layoutDirection = this.f39009v.getLayoutDirection();
        C15588o f = C15611w0.C15612a.f38753e;
        int I = aVar.mo44480n();
        LayoutDirection H = aVar.mo44479m();
        LayoutNodeLayoutDelegate a = C15611w0.C15612a.f38754f;
        C15611w0.C15612a.f38752d = width;
        C15611w0.C15612a.f38751c = layoutDirection;
        boolean G = aVar.mo44488J(this);
        mo44862e1().mo8594x();
        mo45024r1(G);
        C15611w0.C15612a.f38752d = I;
        C15611w0.C15612a.f38751c = H;
        C15611w0.C15612a.f38753e = f;
        C15611w0.C15612a.f38754f = a;
    }
}
