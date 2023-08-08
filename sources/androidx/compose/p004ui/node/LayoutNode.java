package androidx.compose.p004ui.node;

import android.view.View;
import androidx.compose.p004ui.C8762h;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.FocusTargetModifierNode;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.layout.C15540b1;
import androidx.compose.p004ui.layout.C15553d0;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15577j0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15601t;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.C15999y0;
import androidx.compose.p004ui.semantics.C16038l;
import androidx.compose.p004ui.semantics.C16040m;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16482f;
import androidx.compose.p004ui.unit.C16491k;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.C8584m;
import androidx.compose.runtime.collection.C8423g;
import com.bumptech.glide.load.engine.GlideException;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Comparator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 9 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 10 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 11 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 12 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1507:1\n1289#1,7:1589\n163#1:1609\n1289#1,7:1621\n1289#1,7:1628\n1277#1,7:1650\n163#1:1657\n163#1:1669\n1289#1,7:1681\n163#1:1688\n163#1:1700\n1277#1,7:1770\n163#1:1850\n163#1:1862\n163#1:1874\n1289#1,7:1886\n1182#2:1508\n1161#2,2:1509\n1182#2:1511\n1161#2,2:1512\n1182#2:1514\n1161#2,2:1515\n48#3:1517\n48#3:1553\n48#3:1565\n48#3:1577\n48#3:1596\n460#4,7:1518\n146#4:1525\n467#4,4:1526\n460#4,11:1530\n476#4,11:1541\n460#4,11:1554\n460#4,11:1566\n460#4,11:1578\n460#4,11:1597\n146#4:1608\n460#4,11:1610\n460#4,11:1658\n460#4,11:1670\n460#4,11:1689\n460#4,11:1701\n460#4,11:1809\n460#4,11:1851\n460#4,11:1863\n460#4,11:1875\n1#5:1552\n360#6,15:1635\n87#7,3:1712\n91#7:1716\n87#7:1721\n89#7,3:1723\n87#7:1729\n87#7:1733\n83#7:1738\n83#7:1753\n69#7:1777\n69#7:1792\n81#7:1820\n71#7:1837\n69#7:1838\n69#7:1842\n69#7:1844\n71#7:1845\n47#8:1715\n51#9:1717\n633#10,3:1718\n636#10,3:1726\n664#10,3:1730\n667#10,3:1735\n610#10,8:1739\n633#10,3:1747\n618#10,2:1750\n611#10:1752\n612#10,11:1754\n636#10,3:1765\n623#10:1768\n613#10:1769\n610#10,8:1778\n633#10,3:1786\n618#10,2:1789\n611#10:1791\n612#10,11:1793\n636#10,3:1804\n623#10:1807\n613#10:1808\n633#10,3:1839\n636#10,3:1847\n196#11:1722\n196#11:1734\n196#11:1843\n196#11:1846\n111#12:1821\n100#12,15:1822\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n422#1:1589,7\n519#1:1609\n589#1:1621,7\n778#1:1628,7\n923#1:1650,7\n962#1:1657\n975#1:1669\n1001#1:1681,7\n1006#1:1688\n1041#1:1700\n1158#1:1770,7\n1326#1:1850\n1348#1:1862\n1360#1:1874\n1393#1:1886,7\n95#1:1508\n95#1:1509,2\n465#1:1511\n465#1:1512,2\n107#1:1514\n107#1:1515,2\n111#1:1517\n279#1:1553\n344#1:1565\n415#1:1577\n457#1:1596\n111#1:1518,7\n113#1:1525\n111#1:1526,4\n163#1:1530,11\n165#1:1541,11\n279#1:1554,11\n344#1:1566,11\n415#1:1578,11\n457#1:1597,11\n481#1:1608\n519#1:1610,11\n962#1:1658,11\n975#1:1670,11\n1006#1:1689,11\n1041#1:1701,11\n1247#1:1809,11\n1326#1:1851,11\n1348#1:1863,11\n1360#1:1875,11\n823#1:1635,15\n1088#1:1712,3\n1088#1:1716\n1090#1:1721\n1090#1:1723,3\n1099#1:1729\n1102#1:1733\n1142#1:1738\n1143#1:1753\n1243#1:1777\n1244#1:1792\n1268#1:1820\n1299#1:1837\n1299#1:1838\n1301#1:1842\n1302#1:1844\n1306#1:1845\n1088#1:1715\n1088#1:1717\n1089#1:1718,3\n1089#1:1726,3\n1100#1:1730,3\n1100#1:1735,3\n1142#1:1739,8\n1142#1:1747,3\n1142#1:1750,2\n1142#1:1752\n1142#1:1754,11\n1142#1:1765,3\n1142#1:1768\n1142#1:1769\n1243#1:1778,8\n1243#1:1786,3\n1243#1:1789,2\n1243#1:1791\n1243#1:1793,11\n1243#1:1804,3\n1243#1:1807\n1243#1:1808\n1300#1:1839,3\n1300#1:1847,3\n1090#1:1722\n1102#1:1734\n1301#1:1843\n1306#1:1846\n1268#1:1821\n1268#1:1822,15\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNode */
public final class LayoutNode implements C8584m, C15540b1, C15680d1, C15601t, ComposeUiNode, C15729s, C15675c1.C15677b {
    @C12579k

    /* renamed from: e1 */
    public static final C15645c f38817e1 = new C15645c((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f1 */
    public static final C15646d f38818f1 = new C15644b();

    /* renamed from: g1 */
    public static final int f38819g1 = Integer.MAX_VALUE;
    @C12579k

    /* renamed from: h1 */
    public static final C11289a<LayoutNode> f38820h1 = LayoutNode$Companion$Constructor$1.f38875f;
    @C12579k

    /* renamed from: i1 */
    public static final C15863c4 f38821i1 = new C15643a();
    @C12579k

    /* renamed from: j1 */
    public static final Comparator<LayoutNode> f38822j1 = new C15666a0();
    @C12579k

    /* renamed from: E0 */
    public C16479d f38823E0;
    @C12580l

    /* renamed from: F0 */
    public C15553d0 f38824F0;
    @C12579k

    /* renamed from: G0 */
    public LayoutDirection f38825G0;
    @C12579k

    /* renamed from: H0 */
    public C15863c4 f38826H0;

    /* renamed from: I0 */
    public boolean f38827I0;

    /* renamed from: J0 */
    public int f38828J0;

    /* renamed from: K0 */
    public int f38829K0;

    /* renamed from: L0 */
    public int f38830L0;
    @C12579k

    /* renamed from: M0 */
    public UsageByParent f38831M0;
    @C12579k

    /* renamed from: N0 */
    public UsageByParent f38832N0;
    @C12579k

    /* renamed from: O0 */
    public UsageByParent f38833O0;
    @C12579k

    /* renamed from: P0 */
    public UsageByParent f38834P0;

    /* renamed from: Q0 */
    public boolean f38835Q0;

    /* renamed from: R0 */
    public boolean f38836R0;
    @C12579k

    /* renamed from: S0 */
    public final C15733t0 f38837S0;
    @C12579k

    /* renamed from: T0 */
    public final LayoutNodeLayoutDelegate f38838T0;

    /* renamed from: U0 */
    public float f38839U0;
    @C12580l

    /* renamed from: V0 */
    public LayoutNodeSubcompositionsState f38840V0;
    @C12580l

    /* renamed from: W0 */
    public NodeCoordinator f38841W0;

    /* renamed from: X */
    public boolean f38842X;

    /* renamed from: X0 */
    public boolean f38843X0;
    @C12579k

    /* renamed from: Y */
    public C15560f0 f38844Y;
    @C12579k

    /* renamed from: Y0 */
    public C8767m f38845Y0;
    @C12579k

    /* renamed from: Z */
    public final C15731t f38846Z;
    @C12580l

    /* renamed from: Z0 */
    public C11300l<? super C15675c1, C11079d2> f38847Z0;

    /* renamed from: a */
    public final boolean f38848a;
    @C12580l

    /* renamed from: a1 */
    public C11300l<? super C15675c1, C11079d2> f38849a1;

    /* renamed from: b */
    public final int f38850b;

    /* renamed from: b1 */
    public boolean f38851b1;

    /* renamed from: c */
    public int f38852c;

    /* renamed from: c1 */
    public boolean f38853c1;
    @C12579k

    /* renamed from: d */
    public final C15726q0<LayoutNode> f38854d;

    /* renamed from: d1 */
    public boolean f38855d1;
    @C12580l

    /* renamed from: e */
    public C8423g<LayoutNode> f38856e;

    /* renamed from: f */
    public boolean f38857f;
    @C12580l

    /* renamed from: g */
    public LayoutNode f38858g;
    @C12580l

    /* renamed from: v */
    public C15675c1 f38859v;
    @C12580l

    /* renamed from: w */
    public AndroidViewHolder f38860w;

    /* renamed from: x */
    public int f38861x;

    /* renamed from: y */
    public boolean f38862y;
    @C12579k

    /* renamed from: z */
    public final C8423g<LayoutNode> f38863z;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo22516d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.LayoutNode$LayoutState */
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.LayoutNode$UsageByParent */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$a */
    public static final class C15643a implements C15863c4 {
        /* renamed from: a */
        public long mo44718a() {
            return 300;
        }

        /* renamed from: b */
        public long mo44719b() {
            return 40;
        }

        /* renamed from: c */
        public long mo44720c() {
            return 400;
        }

        /* renamed from: d */
        public long mo44721d() {
            return C16491k.f40886b.mo47852b();
        }

        /* renamed from: f */
        public float mo44722f() {
            return 16.0f;
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$b */
    public static final class C15644b extends C15646d {
        public C15644b() {
            super("Undefined intrinsics block and it is required");
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C15564g0 mo6397a(C15568h0 h0Var, List list, long j) {
            return (C15564g0) mo44723n(h0Var, list, j);
        }

        @C12579k
        /* renamed from: n */
        public Void mo44723n(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
            Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
            Intrinsics.checkNotNullParameter(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$c */
    public static final class C15645c {
        public /* synthetic */ C15645c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11289a<LayoutNode> mo44724a() {
            return LayoutNode.f38820h1;
        }

        @C12579k
        /* renamed from: b */
        public final C15863c4 mo44725b() {
            return LayoutNode.f38821i1;
        }

        @C12579k
        /* renamed from: c */
        public final Comparator<LayoutNode> mo44726c() {
            return LayoutNode.f38822j1;
        }

        public C15645c() {
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$d */
    public static abstract class C15646d implements C15560f0 {
        @C12579k

        /* renamed from: a */
        public final String f38874a;

        public C15646d(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "error");
            this.f38874a = str;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo6398b(C15583m mVar, List list, int i) {
            return ((Number) mo44728k(mVar, list, i)).intValue();
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ int mo6399c(C15583m mVar, List list, int i) {
            return ((Number) mo44729l(mVar, list, i)).intValue();
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo6400d(C15583m mVar, List list, int i) {
            return ((Number) mo44730m(mVar, list, i)).intValue();
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ int mo6401e(C15583m mVar, List list, int i) {
            return ((Number) mo44727j(mVar, list, i)).intValue();
        }

        @C12579k
        /* renamed from: j */
        public Void mo44727j(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            throw new IllegalStateException(this.f38874a.toString());
        }

        @C12579k
        /* renamed from: k */
        public Void mo44728k(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            throw new IllegalStateException(this.f38874a.toString());
        }

        @C12579k
        /* renamed from: l */
        public Void mo44729l(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            throw new IllegalStateException(this.f38874a.toString());
        }

        @C12579k
        /* renamed from: m */
        public Void mo44730m(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            throw new IllegalStateException(this.f38874a.toString());
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$e */
    public /* synthetic */ class C15647e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: A */
    public static final int m69643A(LayoutNode layoutNode, LayoutNode layoutNode2) {
        boolean z;
        float f = layoutNode.f38839U0;
        float f2 = layoutNode2.f38839U0;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Intrinsics.compare(layoutNode.f38828J0, layoutNode2.f38828J0);
        }
        return Float.compare(f, f2);
    }

    /* renamed from: A1 */
    public static /* synthetic */ void m69644A1(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.mo44717z1(z);
    }

    /* renamed from: C1 */
    public static /* synthetic */ void m69647C1(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.mo44612B1(z);
    }

    @C11532s0
    /* renamed from: H0 */
    public static /* synthetic */ void m69650H0() {
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m69651K0(LayoutNode layoutNode, long j, C15707m mVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.mo44630J0(j, mVar, z3, z2);
    }

    /* renamed from: M */
    public static /* synthetic */ String m69652M(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.mo44633L(i);
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m69653M0(LayoutNode layoutNode, long j, C15707m mVar, boolean z, boolean z2, int i, Object obj) {
        layoutNode.mo44634L0(j, mVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
    }

    @C11395k(message = "Temporary API to support ConstraintLayout prototyping.")
    /* renamed from: W */
    public static /* synthetic */ void m69654W() {
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m69655W0(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.mo44662V0(z);
    }

    /* renamed from: b1 */
    public static /* synthetic */ boolean m69656b1(LayoutNode layoutNode, C16476b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = layoutNode.f38838T0.mo44752q();
        }
        return layoutNode.mo44670a1(bVar);
    }

    /* renamed from: r1 */
    public static /* synthetic */ boolean m69657r1(LayoutNode layoutNode, C16476b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = layoutNode.f38838T0.mo44751p();
        }
        return layoutNode.mo44700q1(bVar);
    }

    /* renamed from: w1 */
    public static /* synthetic */ void m69658w1(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.mo44710v1(z);
    }

    /* renamed from: y1 */
    public static /* synthetic */ void m69659y1(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.mo44713x1(z);
    }

    @C12579k
    /* renamed from: A0 */
    public final NodeCoordinator mo44610A0() {
        return this.f38837S0.mo45235q();
    }

    @C12580l
    /* renamed from: B0 */
    public final C15675c1 mo44611B0() {
        return this.f38859v;
    }

    /* renamed from: B1 */
    public final void mo44612B1(boolean z) {
        C15675c1 c1Var;
        if (!this.f38862y && !this.f38848a && (c1Var = this.f38859v) != null) {
            C15675c1.m70192q(c1Var, this, false, z, 2, (Object) null);
            mo44702s0().mo44797c1(z);
        }
    }

    @C12580l
    /* renamed from: C0 */
    public final LayoutNode mo44613C0() {
        LayoutNode layoutNode = this.f38858g;
        boolean z = false;
        if (layoutNode != null && layoutNode.f38848a) {
            z = true;
        }
        if (!z) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.mo44613C0();
        }
        return null;
    }

    /* renamed from: D0 */
    public final int mo44614D0() {
        return this.f38828J0;
    }

    /* renamed from: D1 */
    public final void mo44615D1(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "it");
        if (C15647e.$EnumSwitchMapping$0[layoutNode.mo44691m0().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.mo44691m0());
        } else if (layoutNode.mo44704t0()) {
            layoutNode.mo44612B1(true);
        } else if (layoutNode.mo44689l0()) {
            layoutNode.mo44717z1(true);
        } else if (layoutNode.mo44695o0()) {
            layoutNode.mo44713x1(true);
        } else if (layoutNode.mo44693n0()) {
            layoutNode.mo44710v1(true);
        }
    }

    /* renamed from: E0 */
    public final int mo44616E0() {
        return this.f38829K0;
    }

    /* renamed from: E1 */
    public final void mo44617E1() {
        this.f38837S0.mo45213E();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.compose.ui.layout.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44618F(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.node.C15675c1 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.compose.ui.node.c1 r0 = r6.f38859v
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r3 = 0
            if (r0 == 0) goto L_0x00f7
            androidx.compose.ui.node.LayoutNode r0 = r6.f38858g
            if (r0 == 0) goto L_0x0024
            if (r0 == 0) goto L_0x001a
            androidx.compose.ui.node.c1 r0 = r0.f38859v
            goto L_0x001b
        L_0x001a:
            r0 = r3
        L_0x001b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)
            if (r0 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r0 = r2
        L_0x0025:
            if (r0 != 0) goto L_0x0070
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Attaching to a different owner("
            r0.append(r4)
            r0.append(r7)
            java.lang.String r7 = ") than the parent's owner("
            r0.append(r7)
            androidx.compose.ui.node.LayoutNode r7 = r6.mo44613C0()
            if (r7 == 0) goto L_0x0042
            androidx.compose.ui.node.c1 r7 = r7.f38859v
            goto L_0x0043
        L_0x0042:
            r7 = r3
        L_0x0043:
            r0.append(r7)
            java.lang.String r7 = "). This tree: "
            r0.append(r7)
            java.lang.String r7 = m69652M(r6, r1, r2, r3)
            r0.append(r7)
            java.lang.String r7 = " Parent tree: "
            r0.append(r7)
            androidx.compose.ui.node.LayoutNode r7 = r6.f38858g
            if (r7 == 0) goto L_0x005f
            java.lang.String r3 = m69652M(r7, r1, r2, r3)
        L_0x005f:
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x0070:
            androidx.compose.ui.node.LayoutNode r0 = r6.mo44613C0()
            if (r0 != 0) goto L_0x0078
            r6.f38827I0 = r2
        L_0x0078:
            r6.f38859v = r7
            if (r0 == 0) goto L_0x007f
            int r4 = r0.f38861x
            goto L_0x0080
        L_0x007f:
            r4 = -1
        L_0x0080:
            int r4 = r4 + r2
            r6.f38861x = r4
            androidx.compose.ui.node.k1 r4 = androidx.compose.p004ui.semantics.C16040m.m72168j(r6)
            if (r4 == 0) goto L_0x008c
            r7.mo44962I()
        L_0x008c:
            r7.mo44998u(r6)
            if (r0 == 0) goto L_0x0098
            androidx.compose.ui.layout.d0 r4 = r0.f38824F0
            if (r4 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r3 = r4
            goto L_0x00a1
        L_0x0098:
            boolean r4 = r6.f38836R0
            if (r4 == 0) goto L_0x00a1
            androidx.compose.ui.layout.d0 r3 = new androidx.compose.ui.layout.d0
            r3.<init>(r6)
        L_0x00a1:
            r6.mo44636M1(r3)
            androidx.compose.ui.node.t0 r3 = r6.f38837S0
            r3.mo45224f()
            androidx.compose.ui.node.q0<androidx.compose.ui.node.LayoutNode> r3 = r6.f38854d
            androidx.compose.runtime.collection.g r3 = r3.mo45190h()
            int r4 = r3.mo15469h0()
            if (r4 <= 0) goto L_0x00c3
            java.lang.Object[] r3 = r3.mo15462d0()
        L_0x00b9:
            r5 = r3[r1]
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.p004ui.node.LayoutNode) r5
            r5.mo44618F(r7)
            int r1 = r1 + r2
            if (r1 < r4) goto L_0x00b9
        L_0x00c3:
            r6.mo44656T0()
            if (r0 == 0) goto L_0x00cb
            r0.mo44656T0()
        L_0x00cb:
            androidx.compose.ui.node.NodeCoordinator r0 = r6.mo44610A0()
            androidx.compose.ui.node.NodeCoordinator r1 = r6.mo44674d0()
            androidx.compose.ui.node.NodeCoordinator r1 = r1.mo44887v4()
        L_0x00d7:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r2 != 0) goto L_0x00e7
            if (r0 == 0) goto L_0x00e7
            r0.mo44881r5()
            androidx.compose.ui.node.NodeCoordinator r0 = r0.mo44887v4()
            goto L_0x00d7
        L_0x00e7:
            kotlin.jvm.functions.l<? super androidx.compose.ui.node.c1, kotlin.d2> r0 = r6.f38847Z0
            if (r0 == 0) goto L_0x00ee
            r0.invoke(r7)
        L_0x00ee:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r6.f38838T0
            r7.mo44746O()
            r6.mo44644P0()
            return
        L_0x00f7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Cannot attach "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = " as it already is attached.  Tree: "
            r7.append(r0)
            java.lang.String r0 = m69652M(r6, r1, r2, r3)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.LayoutNode.mo44618F(androidx.compose.ui.node.c1):void");
    }

    @C12580l
    /* renamed from: F0 */
    public final LayoutNodeSubcompositionsState mo44619F0() {
        return this.f38840V0;
    }

    /* renamed from: F1 */
    public final void mo44620F1() {
        C8423g<LayoutNode> I0 = mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) d0[i];
                UsageByParent usageByParent = layoutNode.f38834P0;
                layoutNode.f38833O0 = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.mo44620F1();
                }
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: G */
    public final void mo44621G() {
        C8423g<LayoutNode> I0 = mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) d0[i];
                if (layoutNode.f38829K0 != layoutNode.f38828J0) {
                    mo44694n1();
                    mo44650R0();
                    if (layoutNode.f38828J0 == Integer.MAX_VALUE) {
                        layoutNode.mo44684i1();
                    }
                }
                i++;
            } while (i < h0);
        }
    }

    @C12579k
    /* renamed from: G0 */
    public final C8423g<LayoutNode> mo44622G0() {
        if (this.f38842X) {
            this.f38863z.mo15490w();
            C8423g<LayoutNode> gVar = this.f38863z;
            gVar.mo15464f(gVar.mo15469h0(), mo44627I0());
            this.f38863z.mo15445J0(f38822j1);
            this.f38842X = false;
        }
        return this.f38863z;
    }

    /* renamed from: G1 */
    public final void mo44623G1(boolean z) {
        this.f38835Q0 = z;
    }

    /* renamed from: H */
    public final void mo44624H() {
        int i = 0;
        this.f38830L0 = 0;
        C8423g<LayoutNode> I0 = mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            do {
                LayoutNode layoutNode = (LayoutNode) d0[i];
                layoutNode.f38829K0 = layoutNode.f38828J0;
                layoutNode.f38828J0 = Integer.MAX_VALUE;
                if (layoutNode.f38831M0 == UsageByParent.InLayoutBlock) {
                    layoutNode.f38831M0 = UsageByParent.NotUsed;
                }
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: H1 */
    public final void mo44625H1(int i) {
        this.f38861x = i;
    }

    /* renamed from: I */
    public final void mo44626I() {
        this.f38834P0 = this.f38833O0;
        this.f38833O0 = UsageByParent.NotUsed;
        C8423g<LayoutNode> I0 = mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) d0[i];
                if (layoutNode.f38833O0 != UsageByParent.NotUsed) {
                    layoutNode.mo44626I();
                }
                i++;
            } while (i < h0);
        }
    }

    @C12579k
    /* renamed from: I0 */
    public final C8423g<LayoutNode> mo44627I0() {
        mo44660U1();
        if (this.f38852c == 0) {
            return this.f38854d.mo45190h();
        }
        C8423g<LayoutNode> gVar = this.f38856e;
        Intrinsics.checkNotNull(gVar);
        return gVar;
    }

    /* renamed from: I1 */
    public final void mo44628I1(boolean z) {
        this.f38843X0 = z;
    }

    /* renamed from: J */
    public final void mo44629J() {
        this.f38834P0 = this.f38833O0;
        this.f38833O0 = UsageByParent.NotUsed;
        C8423g<LayoutNode> I0 = mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) d0[i];
                if (layoutNode.f38833O0 == UsageByParent.InLayoutBlock) {
                    layoutNode.mo44629J();
                }
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: J0 */
    public final void mo44630J0(long j, @C12579k C15707m<C15689g1> mVar, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(mVar, "hitTestResult");
        mo44610A0().mo44846P4(NodeCoordinator.f38930P0.mo44902a(), mo44610A0().mo44840K3(j), mVar, z, z2);
    }

    /* renamed from: J1 */
    public final void mo44631J1(@C12580l AndroidViewHolder androidViewHolder) {
        this.f38860w = androidViewHolder;
    }

    /* renamed from: K1 */
    public final void mo44632K1(@C12579k UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.f38833O0 = usageByParent;
    }

    /* renamed from: L */
    public final String mo44633L(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(GlideException.C22148a.f56917d);
        }
        sb.append("|-");
        sb.append(toString());
        sb.append(10);
        C8423g<LayoutNode> I0 = mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i3 = 0;
            do {
                sb.append(((LayoutNode) d0[i3]).mo44633L(i + 1));
                i3++;
            } while (i3 < h0);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "tree.toString()");
        if (i != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: L0 */
    public final void mo44634L0(long j, @C12579k C15707m<C15703k1> mVar, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(mVar, "hitSemanticsEntities");
        mo44610A0().mo44846P4(NodeCoordinator.f38930P0.mo44903c(), mo44610A0().mo44840K3(j), mVar, true, z2);
    }

    /* renamed from: L1 */
    public final void mo44635L1(boolean z) {
        if (z != this.f38836R0) {
            if (!z) {
                mo44636M1((C15553d0) null);
            } else {
                mo44636M1(new C15553d0(this));
            }
            this.f38836R0 = z;
        }
    }

    /* renamed from: M1 */
    public final void mo44636M1(C15553d0 d0Var) {
        if (!Intrinsics.areEqual((Object) d0Var, (Object) this.f38824F0)) {
            this.f38824F0 = d0Var;
            this.f38838T0.mo44740I(d0Var);
            NodeCoordinator A0 = mo44610A0();
            NodeCoordinator v4 = mo44674d0().mo44887v4();
            while (!Intrinsics.areEqual((Object) A0, (Object) v4) && A0 != null) {
                A0.mo44833F6(d0Var);
                A0 = A0.mo44887v4();
            }
        }
    }

    /* renamed from: N */
    public final void mo44637N() {
        C15675c1 c1Var = this.f38859v;
        String str = null;
        if (c1Var == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode C0 = mo44613C0();
            if (C0 != null) {
                str = m69652M(C0, 0, 1, (Object) null);
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        mo44647Q0();
        LayoutNode C02 = mo44613C0();
        if (C02 != null) {
            C02.mo44650R0();
            C02.mo44656T0();
            this.f38831M0 = UsageByParent.NotUsed;
        }
        this.f38838T0.mo44743L();
        C11300l<? super C15675c1, C11079d2> lVar = this.f38849a1;
        if (lVar != null) {
            lVar.invoke(c1Var);
        }
        if (C16040m.m72168j(this) != null) {
            c1Var.mo44962I();
        }
        this.f38837S0.mo45226h();
        c1Var.mo44958C(this);
        this.f38859v = null;
        this.f38861x = 0;
        C8423g<LayoutNode> h = this.f38854d.mo45190h();
        int h0 = h.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = h.mo15462d0();
            int i = 0;
            do {
                ((LayoutNode) d0[i]).mo44637N();
                i++;
            } while (i < h0);
        }
        this.f38828J0 = Integer.MAX_VALUE;
        this.f38829K0 = Integer.MAX_VALUE;
        this.f38827I0 = false;
    }

    /* renamed from: N0 */
    public final void mo44638N0(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        this.f38862y = true;
        aVar.invoke();
        this.f38862y = false;
    }

    /* renamed from: N1 */
    public final void mo44639N1(@C12579k UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.f38831M0 = usageByParent;
    }

    /* renamed from: O */
    public final void mo44640O() {
        if (mo44691m0() == LayoutState.Idle && !mo44689l0() && !mo44704t0() && mo44456p()) {
            C15733t0 t0Var = this.f38837S0;
            int b = C15739v0.m70597b(256);
            if ((t0Var.mo45229k() & b) != 0) {
                C8767m.C8772d m = t0Var.mo45231m();
                while (m != null) {
                    if ((m.mo17232I() & b) != 0 && (m instanceof C15704l)) {
                        C15704l lVar = (C15704l) m;
                        lVar.mo44551O(C15681e.m70234o(lVar, C15739v0.m70597b(256)));
                    }
                    if ((m.mo17228E() & b) != 0) {
                        m = m.mo17229F();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [androidx.compose.ui.node.NodeCoordinator] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44641O0(int r7, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.node.LayoutNode r8) {
        /*
            r6 = this;
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            androidx.compose.ui.node.LayoutNode r0 = r8.f38858g
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            java.lang.String r3 = " Other tree: "
            java.lang.String r4 = "Cannot insert "
            r5 = 0
            if (r0 != 0) goto L_0x0048
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r8)
            java.lang.String r0 = " because it already has a parent. This tree: "
            r7.append(r0)
            java.lang.String r0 = m69652M(r6, r1, r2, r5)
            r7.append(r0)
            r7.append(r3)
            androidx.compose.ui.node.LayoutNode r8 = r8.f38858g
            if (r8 == 0) goto L_0x0037
            java.lang.String r5 = m69652M(r8, r1, r2, r5)
        L_0x0037:
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x0048:
            androidx.compose.ui.node.c1 r0 = r8.f38859v
            if (r0 != 0) goto L_0x004e
            r0 = r2
            goto L_0x004f
        L_0x004e:
            r0 = r1
        L_0x004f:
            if (r0 == 0) goto L_0x00d1
            r8.f38858g = r6
            androidx.compose.ui.node.q0<androidx.compose.ui.node.LayoutNode> r0 = r6.f38854d
            r0.mo45183a(r7, r8)
            r6.mo44694n1()
            boolean r7 = r8.f38848a
            if (r7 == 0) goto L_0x0076
            boolean r7 = r6.f38848a
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x006a
            int r7 = r6.f38852c
            int r7 = r7 + r2
            r6.f38852c = r7
            goto L_0x0076
        L_0x006a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Virtual LayoutNode can't be added into a virtual parent"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0076:
            r6.mo44664X0()
            androidx.compose.ui.node.NodeCoordinator r7 = r8.mo44610A0()
            boolean r0 = r6.f38848a
            if (r0 == 0) goto L_0x008a
            androidx.compose.ui.node.LayoutNode r0 = r6.f38858g
            if (r0 == 0) goto L_0x008e
            androidx.compose.ui.node.NodeCoordinator r5 = r0.mo44674d0()
            goto L_0x008e
        L_0x008a:
            androidx.compose.ui.node.NodeCoordinator r5 = r6.mo44674d0()
        L_0x008e:
            r7.mo44884s6(r5)
            boolean r7 = r8.f38848a
            if (r7 == 0) goto L_0x00b7
            androidx.compose.ui.node.q0<androidx.compose.ui.node.LayoutNode> r7 = r8.f38854d
            androidx.compose.runtime.collection.g r7 = r7.mo45190h()
            int r0 = r7.mo15469h0()
            if (r0 <= 0) goto L_0x00b7
            java.lang.Object[] r7 = r7.mo15462d0()
        L_0x00a5:
            r3 = r7[r1]
            androidx.compose.ui.node.LayoutNode r3 = (androidx.compose.p004ui.node.LayoutNode) r3
            androidx.compose.ui.node.NodeCoordinator r3 = r3.mo44610A0()
            androidx.compose.ui.node.NodeCoordinator r4 = r6.mo44674d0()
            r3.mo44884s6(r4)
            int r1 = r1 + r2
            if (r1 < r0) goto L_0x00a5
        L_0x00b7:
            androidx.compose.ui.node.c1 r7 = r6.f38859v
            if (r7 == 0) goto L_0x00be
            r8.mo44618F(r7)
        L_0x00be:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r8.f38838T0
            int r7 = r7.mo44748m()
            if (r7 <= 0) goto L_0x00d0
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r6.f38838T0
            int r8 = r7.mo44748m()
            int r8 = r8 + r2
            r7.mo44744M(r8)
        L_0x00d0:
            return
        L_0x00d1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r8)
            java.lang.String r0 = " because it already has an owner. This tree: "
            r7.append(r0)
            java.lang.String r0 = m69652M(r6, r1, r2, r5)
            r7.append(r0)
            r7.append(r3)
            java.lang.String r8 = m69652M(r8, r1, r2, r5)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.LayoutNode.mo44641O0(int, androidx.compose.ui.node.LayoutNode):void");
    }

    /* renamed from: O1 */
    public final void mo44642O1(@C12579k UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.f38832N0 = usageByParent;
    }

    /* renamed from: P */
    public final void mo44643P(@C12579k C15118b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        mo44610A0().mo44872m3(b2Var);
    }

    /* renamed from: P0 */
    public final void mo44644P0() {
        boolean z;
        boolean z2;
        if (this.f38837S0.mo45237s(C15739v0.m70597b(1024) | C15739v0.m70597b(2048) | C15739v0.m70597b(4096))) {
            for (C8767m.C8772d m = this.f38837S0.mo45231m(); m != null; m = m.mo17229F()) {
                boolean z3 = true;
                if ((C15739v0.m70597b(1024) & m.mo17232I()) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((C15739v0.m70597b(2048) & m.mo17232I()) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                if ((C15739v0.m70597b(4096) & m.mo17232I()) == 0) {
                    z3 = false;
                }
                if (z4 || z3) {
                    C15741w0.m70612a(m);
                }
            }
        }
    }

    /* renamed from: P1 */
    public final void mo44645P1(boolean z) {
        this.f38851b1 = z;
    }

    /* renamed from: Q */
    public final void mo44646Q(@C12579k C11300l<? super LayoutNode, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C8423g<LayoutNode> I0 = mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                lVar.invoke(d0[i]);
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: Q0 */
    public final void mo44647Q0() {
        boolean z;
        if (this.f38837S0.mo45238t(C15739v0.m70597b(1024))) {
            for (C8767m.C8772d r = this.f38837S0.mo45236r(); r != null; r = r.mo17234M()) {
                if ((C15739v0.m70597b(1024) & r.mo17232I()) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (r instanceof FocusTargetModifierNode)) {
                    FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) r;
                    if (focusTargetModifierNode.mo42164r0().mo42156g()) {
                        C15682e0.m70247b(this).getFocusOwner().mo42075e(true, false);
                        focusTargetModifierNode.mo42167u0();
                    }
                }
            }
        }
    }

    /* renamed from: Q1 */
    public final void mo44648Q1(@C12580l C11300l<? super C15675c1, C11079d2> lVar) {
        this.f38847Z0 = lVar;
    }

    /* renamed from: R */
    public final void mo44649R(@C12579k C11304p<? super Integer, ? super LayoutNode, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        C8423g<LayoutNode> I0 = mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                pVar.invoke(Integer.valueOf(i), d0[i]);
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: R0 */
    public final void mo44650R0() {
        NodeCoordinator f0 = mo44677f0();
        if (f0 != null) {
            f0.mo44851V4();
            return;
        }
        LayoutNode C0 = mo44613C0();
        if (C0 != null) {
            C0.mo44650R0();
        }
    }

    /* renamed from: R1 */
    public final void mo44651R1(@C12580l C11300l<? super C15675c1, C11079d2> lVar) {
        this.f38849a1 = lVar;
    }

    /* renamed from: S */
    public final void mo44652S(C11300l<? super C15742x, C11079d2> lVar) {
        NodeCoordinator A0 = mo44610A0();
        NodeCoordinator d0 = mo44674d0();
        while (A0 != d0) {
            Intrinsics.checkNotNull(A0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C15742x xVar = (C15742x) A0;
            lVar.invoke(xVar);
            A0 = xVar.mo44887v4();
        }
    }

    /* renamed from: S0 */
    public final void mo44653S0() {
        NodeCoordinator A0 = mo44610A0();
        NodeCoordinator d0 = mo44674d0();
        while (A0 != d0) {
            Intrinsics.checkNotNull(A0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C15742x xVar = (C15742x) A0;
            C15672b1 V3 = xVar.mo44850V3();
            if (V3 != null) {
                V3.invalidate();
            }
            A0 = xVar.mo44887v4();
        }
        C15672b1 V32 = mo44674d0().mo44850V3();
        if (V32 != null) {
            V32.invalidate();
        }
    }

    /* renamed from: S1 */
    public final void mo44654S1(@C12580l LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.f38840V0 = layoutNodeSubcompositionsState;
    }

    /* renamed from: T */
    public final void mo44655T(C11300l<? super NodeCoordinator, C11079d2> lVar) {
        NodeCoordinator A0 = mo44610A0();
        NodeCoordinator v4 = mo44674d0().mo44887v4();
        while (!Intrinsics.areEqual((Object) A0, (Object) v4) && A0 != null) {
            lVar.invoke(A0);
            A0 = A0.mo44887v4();
        }
    }

    /* renamed from: T0 */
    public final void mo44656T0() {
        if (this.f38824F0 != null) {
            m69659y1(this, false, 1, (Object) null);
        } else {
            m69647C1(this, false, 1, (Object) null);
        }
    }

    /* renamed from: T1 */
    public final boolean mo44657T1() {
        boolean z;
        if (this.f38837S0.mo45238t(C15739v0.m70597b(4)) && !this.f38837S0.mo45238t(C15739v0.m70597b(2))) {
            return true;
        }
        for (C8767m.C8772d m = this.f38837S0.mo45231m(); m != null; m = m.mo17229F()) {
            boolean z2 = false;
            if ((C15739v0.m70597b(2) & m.mo17232I()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (m instanceof C15740w) && C15681e.m70234o(m, C15739v0.m70597b(2)).mo44850V3() != null) {
                return false;
            }
            if ((C15739v0.m70597b(4) & m.mo17232I()) != 0) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: U */
    public final boolean mo44658U() {
        boolean z;
        AlignmentLines w;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f38838T0;
        if (layoutNodeLayoutDelegate.mo44747l().mo44789w().mo44533l()) {
            return true;
        }
        C15665a t = layoutNodeLayoutDelegate.mo44755t();
        if (t == null || (w = t.mo44789w()) == null || !w.mo44533l()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: U0 */
    public final void mo44659U0() {
        this.f38838T0.mo44733B();
    }

    /* renamed from: U1 */
    public final void mo44660U1() {
        if (this.f38852c > 0) {
            mo44698p1();
        }
    }

    /* renamed from: V */
    public final boolean mo44661V() {
        return this.f38835Q0;
    }

    /* renamed from: V0 */
    public final void mo44662V0(boolean z) {
        C15672b1 V3;
        if (z) {
            LayoutNode C0 = mo44613C0();
            if (C0 != null) {
                C0.mo44650R0();
            }
            C15682e0.m70247b(this).mo44962I();
        }
        m69647C1(this, false, 1, (Object) null);
        C15733t0 t0Var = this.f38837S0;
        int b = C15739v0.m70597b(2);
        if ((t0Var.mo45229k() & b) != 0) {
            for (C8767m.C8772d m = t0Var.mo45231m(); m != null; m = m.mo17229F()) {
                if (!((m.mo17232I() & b) == 0 || !(m instanceof C15740w) || (V3 = C15681e.m70234o((C15740w) m, C15739v0.m70597b(2)).mo44850V3()) == null)) {
                    V3.invalidate();
                }
                if ((m.mo17228E() & b) == 0) {
                    break;
                }
            }
        }
        C8423g<LayoutNode> I0 = mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                ((LayoutNode) d0[i]).mo44662V0(false);
                i++;
            } while (i < h0);
        }
    }

    @C12579k
    /* renamed from: X */
    public final List<C15557e0> mo44663X() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate p0 = mo44697p0();
        Intrinsics.checkNotNull(p0);
        return p0.mo44769b1();
    }

    /* renamed from: X0 */
    public final void mo44664X0() {
        LayoutNode C0;
        if (this.f38852c > 0) {
            this.f38857f = true;
        }
        if (this.f38848a && (C0 = mo44613C0()) != null) {
            C0.f38857f = true;
        }
    }

    @C12579k
    /* renamed from: Y */
    public final List<C15557e0> mo44665Y() {
        return mo44702s0().mo44793U0();
    }

    /* renamed from: Y0 */
    public final boolean mo44666Y0() {
        return this.f38836R0;
    }

    @C12579k
    /* renamed from: Z */
    public final List<LayoutNode> mo44667Z() {
        return mo44627I0().mo15485s();
    }

    @C12580l
    /* renamed from: Z0 */
    public final Boolean mo44668Z0() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate p0 = mo44697p0();
        if (p0 != null) {
            return Boolean.valueOf(p0.mo44784p());
        }
        return null;
    }

    /* renamed from: a */
    public void mo44575a(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "value");
        if (this.f38825G0 != layoutDirection) {
            this.f38825G0 = layoutDirection;
            mo44690l1();
        }
    }

    /* renamed from: a0 */
    public final int mo44669a0() {
        return this.f38861x;
    }

    /* renamed from: a1 */
    public final boolean mo44670a1(@C12580l C16476b bVar) {
        if (bVar == null || this.f38824F0 == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate p0 = mo44697p0();
        Intrinsics.checkNotNull(p0);
        return p0.mo44763I1(bVar.mo47807x());
    }

    @C12579k
    /* renamed from: b */
    public C8767m mo44576b() {
        return this.f38845Y0;
    }

    @C12579k
    /* renamed from: b0 */
    public final List<LayoutNode> mo44671b0() {
        return this.f38854d.mo45184b();
    }

    /* renamed from: c0 */
    public final boolean mo44672c0() {
        long N3 = mo44674d0().mo44844N3();
        if (!C16476b.m74360n(N3) || !C16476b.m74358l(N3)) {
            return false;
        }
        return true;
    }

    /* renamed from: c1 */
    public final void mo44673c1() {
        if (this.f38833O0 == UsageByParent.NotUsed) {
            mo44629J();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate p0 = mo44697p0();
        Intrinsics.checkNotNull(p0);
        p0.mo44764L1();
    }

    @C12579k
    /* renamed from: d0 */
    public final NodeCoordinator mo44674d0() {
        return this.f38837S0.mo45232n();
    }

    /* renamed from: d1 */
    public final void mo44675d1() {
        this.f38838T0.mo44736E();
    }

    /* renamed from: e */
    public void mo44367e() {
        m69647C1(this, false, 1, (Object) null);
        C16476b p = this.f38838T0.mo44751p();
        if (p != null) {
            C15675c1 c1Var = this.f38859v;
            if (c1Var != null) {
                c1Var.mo44999w(this, p.mo47807x());
                return;
            }
            return;
        }
        C15675c1 c1Var2 = this.f38859v;
        if (c1Var2 != null) {
            C15675c1.m70188b(c1Var2, false, 1, (Object) null);
        }
    }

    /* renamed from: e0 */
    public boolean mo44553e0() {
        return mo44455k();
    }

    /* renamed from: e1 */
    public final void mo44676e1() {
        this.f38838T0.mo44737F();
    }

    /* renamed from: f0 */
    public final NodeCoordinator mo44677f0() {
        C15672b1 b1Var;
        if (this.f38843X0) {
            NodeCoordinator d0 = mo44674d0();
            NodeCoordinator z4 = mo44610A0().mo44894z4();
            this.f38841W0 = null;
            while (true) {
                if (Intrinsics.areEqual((Object) d0, (Object) z4)) {
                    break;
                }
                if (d0 != null) {
                    b1Var = d0.mo44850V3();
                } else {
                    b1Var = null;
                }
                if (b1Var != null) {
                    this.f38841W0 = d0;
                    break;
                } else if (d0 != null) {
                    d0 = d0.mo44894z4();
                } else {
                    d0 = null;
                }
            }
        }
        NodeCoordinator nodeCoordinator = this.f38841W0;
        if (nodeCoordinator == null || nodeCoordinator.mo44850V3() != null) {
            return nodeCoordinator;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: f1 */
    public final void mo44678f1() {
        this.f38838T0.mo44738G();
    }

    /* renamed from: g */
    public void mo16258g() {
        AndroidViewHolder androidViewHolder = this.f38860w;
        if (androidViewHolder != null) {
            androidViewHolder.mo16258g();
        }
        NodeCoordinator A0 = mo44610A0();
        NodeCoordinator v4 = mo44674d0().mo44887v4();
        while (!Intrinsics.areEqual((Object) A0, (Object) v4) && A0 != null) {
            A0.mo44827D5();
            A0 = A0.mo44887v4();
        }
    }

    /* renamed from: g0 */
    public final boolean mo44679g0() {
        return this.f38843X0;
    }

    /* renamed from: g1 */
    public final void mo44680g1() {
        this.f38838T0.mo44739H();
    }

    @C12579k
    public C16479d getDensity() {
        return this.f38823E0;
    }

    public int getHeight() {
        return this.f38838T0.mo44750o();
    }

    @C12579k
    public LayoutDirection getLayoutDirection() {
        return this.f38825G0;
    }

    @C12579k
    public C15863c4 getViewConfiguration() {
        return this.f38826H0;
    }

    public int getWidth() {
        return this.f38838T0.mo44732A();
    }

    @C12580l
    /* renamed from: h0 */
    public final AndroidViewHolder mo44681h0() {
        return this.f38860w;
    }

    /* renamed from: h1 */
    public final void mo44682h1() {
        boolean p = mo44456p();
        this.f38827I0 = true;
        if (!p) {
            if (mo44704t0()) {
                mo44612B1(true);
            } else if (mo44695o0()) {
                mo44713x1(true);
            }
        }
        NodeCoordinator A0 = mo44610A0();
        NodeCoordinator v4 = mo44674d0().mo44887v4();
        while (!Intrinsics.areEqual((Object) A0, (Object) v4) && A0 != null) {
            if (A0.mo44842M3()) {
                A0.mo44851V4();
            }
            A0 = A0.mo44887v4();
        }
        C8423g<LayoutNode> I0 = mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) d0[i];
                if (layoutNode.f38828J0 != Integer.MAX_VALUE) {
                    layoutNode.mo44682h1();
                    mo44615D1(layoutNode);
                }
                i++;
            } while (i < h0);
        }
    }

    @C12579k
    /* renamed from: i0 */
    public final C15731t mo44683i0() {
        return this.f38846Z;
    }

    /* renamed from: i1 */
    public final void mo44684i1() {
        if (mo44456p()) {
            int i = 0;
            this.f38827I0 = false;
            C8423g<LayoutNode> I0 = mo44627I0();
            int h0 = I0.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = I0.mo15462d0();
                do {
                    ((LayoutNode) d0[i]).mo44684i1();
                    i++;
                } while (i < h0);
            }
        }
    }

    @C12579k
    /* renamed from: j0 */
    public final UsageByParent mo44685j0() {
        return this.f38833O0;
    }

    /* renamed from: j1 */
    public final void mo44686j1(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i != i2) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (i > i2) {
                    i4 = i + i6;
                } else {
                    i4 = i;
                }
                if (i > i2) {
                    i5 = i2 + i6;
                } else {
                    i5 = (i2 + i3) - 2;
                }
                this.f38854d.mo45183a(i5, this.f38854d.mo45191i(i4));
            }
            mo44694n1();
            mo44664X0();
            mo44656T0();
        }
    }

    /* renamed from: k */
    public boolean mo44455k() {
        return this.f38859v != null;
    }

    @C12579k
    /* renamed from: k0 */
    public final LayoutNodeLayoutDelegate mo44687k0() {
        return this.f38838T0;
    }

    /* renamed from: k1 */
    public final void mo44688k1(LayoutNode layoutNode) {
        if (layoutNode.f38838T0.mo44748m() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f38838T0;
            layoutNodeLayoutDelegate.mo44744M(layoutNodeLayoutDelegate.mo44748m() - 1);
        }
        if (this.f38859v != null) {
            layoutNode.mo44637N();
        }
        layoutNode.f38858g = null;
        layoutNode.mo44610A0().mo44884s6((NodeCoordinator) null);
        if (layoutNode.f38848a) {
            this.f38852c--;
            C8423g<LayoutNode> h = layoutNode.f38854d.mo45190h();
            int h0 = h.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = h.mo15462d0();
                int i = 0;
                do {
                    ((LayoutNode) d0[i]).mo44610A0().mo44884s6((NodeCoordinator) null);
                    i++;
                } while (i < h0);
            }
        }
        mo44664X0();
        mo44694n1();
    }

    /* renamed from: l */
    public void mo16259l() {
        AndroidViewHolder androidViewHolder = this.f38860w;
        if (androidViewHolder != null) {
            androidViewHolder.mo16259l();
        }
        this.f38855d1 = true;
        mo44617E1();
    }

    /* renamed from: l0 */
    public final boolean mo44689l0() {
        return this.f38838T0.mo44753r();
    }

    /* renamed from: l1 */
    public final void mo44690l1() {
        mo44656T0();
        LayoutNode C0 = mo44613C0();
        if (C0 != null) {
            C0.mo44650R0();
        }
        mo44653S0();
    }

    /* renamed from: m */
    public void mo44580m(@C12579k C15863c4 c4Var) {
        Intrinsics.checkNotNullParameter(c4Var, "<set-?>");
        this.f38826H0 = c4Var;
    }

    @C12579k
    /* renamed from: m0 */
    public final LayoutState mo44691m0() {
        return this.f38838T0.mo44754s();
    }

    /* renamed from: m1 */
    public final void mo44692m1() {
        boolean z;
        LayoutNode C0 = mo44613C0();
        float A4 = mo44674d0().mo44820A4();
        NodeCoordinator A0 = mo44610A0();
        NodeCoordinator d0 = mo44674d0();
        while (A0 != d0) {
            Intrinsics.checkNotNull(A0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C15742x xVar = (C15742x) A0;
            A4 += xVar.mo44820A4();
            A0 = xVar.mo44887v4();
        }
        boolean z2 = false;
        if (A4 == this.f38839U0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f38839U0 = A4;
            if (C0 != null) {
                C0.mo44694n1();
            }
            if (C0 != null) {
                C0.mo44650R0();
            }
        }
        if (!mo44456p()) {
            if (C0 != null) {
                C0.mo44650R0();
            }
            mo44682h1();
        }
        if (C0 == null) {
            this.f38828J0 = 0;
        } else if (!this.f38853c1 && C0.mo44691m0() == LayoutState.LayingOut) {
            if (this.f38828J0 == Integer.MAX_VALUE) {
                z2 = true;
            }
            if (z2) {
                int i = C0.f38830L0;
                this.f38828J0 = i;
                C0.f38830L0 = i + 1;
            } else {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
        }
        this.f38838T0.mo44747l().mo44767Y();
    }

    /* renamed from: n */
    public void mo44572n() {
        NodeCoordinator d0 = mo44674d0();
        int b = C15739v0.m70597b(128);
        boolean g = C15741w0.m70618g(b);
        C8767m.C8772d s4 = d0.mo44883s4();
        if (g || (s4 = s4.mo17234M()) != null) {
            C8767m.C8772d i2 = d0.mo44830E4(g);
            while (i2 != null && (i2.mo17228E() & b) != 0) {
                if ((i2.mo17232I() & b) != 0 && (i2 instanceof C15738v)) {
                    ((C15738v) i2).mo44446p(mo44674d0());
                }
                if (i2 != s4) {
                    i2 = i2.mo17229F();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: n0 */
    public final boolean mo44693n0() {
        return this.f38838T0.mo44756u();
    }

    /* renamed from: n1 */
    public final void mo44694n1() {
        if (this.f38848a) {
            LayoutNode C0 = mo44613C0();
            if (C0 != null) {
                C0.mo44694n1();
                return;
            }
            return;
        }
        this.f38842X = true;
    }

    /* renamed from: o */
    public void mo44581o(@C12579k C15560f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "value");
        if (!Intrinsics.areEqual((Object) this.f38844Y, (Object) f0Var)) {
            this.f38844Y = f0Var;
            this.f38846Z.mo45208m(mo44584x());
            mo44656T0();
        }
    }

    /* renamed from: o0 */
    public final boolean mo44695o0() {
        return this.f38838T0.mo44757v();
    }

    /* renamed from: o1 */
    public final void mo44696o1(int i, int i2) {
        NodeCoordinator nodeCoordinator;
        if (this.f38833O0 == UsageByParent.NotUsed) {
            mo44629J();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate s0 = mo44702s0();
        C15611w0.C15612a.C15613a aVar = C15611w0.C15612a.f38749a;
        int Z = s0.mo44416Z();
        LayoutDirection layoutDirection = getLayoutDirection();
        LayoutNode C0 = mo44613C0();
        if (C0 != null) {
            nodeCoordinator = C0.mo44674d0();
        } else {
            nodeCoordinator = null;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        C15588o f = C15611w0.C15612a.f38753e;
        int I = aVar.mo44480n();
        LayoutDirection H = aVar.mo44479m();
        LayoutNodeLayoutDelegate a = C15611w0.C15612a.f38754f;
        C15611w0.C15612a.f38752d = Z;
        C15611w0.C15612a.f38751c = layoutDirection;
        boolean G = aVar.mo44488J(nodeCoordinator2);
        C15611w0.C15612a.m69414v(aVar, s0, i, i2, 0.0f, 4, (Object) null);
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.mo45024r1(G);
        }
        C15611w0.C15612a.f38752d = I;
        C15611w0.C15612a.f38751c = H;
        C15611w0.C15612a.f38753e = f;
        C15611w0.C15612a.f38754f = a;
    }

    /* renamed from: p */
    public boolean mo44456p() {
        return this.f38827I0;
    }

    /* renamed from: p0 */
    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate mo44697p0() {
        return this.f38838T0.mo44758w();
    }

    /* renamed from: p1 */
    public final void mo44698p1() {
        if (this.f38857f) {
            int i = 0;
            this.f38857f = false;
            C8423g<LayoutNode> gVar = this.f38856e;
            if (gVar == null) {
                gVar = new C8423g<>(new LayoutNode[16], 0);
                this.f38856e = gVar;
            }
            gVar.mo15490w();
            C8423g<LayoutNode> h = this.f38854d.mo45190h();
            int h0 = h.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = h.mo15462d0();
                do {
                    LayoutNode layoutNode = (LayoutNode) d0[i];
                    if (layoutNode.f38848a) {
                        gVar.mo15464f(gVar.mo15469h0(), layoutNode.mo44627I0());
                    } else {
                        gVar.mo15463e(layoutNode);
                    }
                    i++;
                } while (i < h0);
            }
            this.f38838T0.mo44735D();
        }
    }

    /* renamed from: q */
    public int mo44457q() {
        return this.f38850b;
    }

    @C12579k
    /* renamed from: q0 */
    public final C15674c0 mo44699q0() {
        return C15682e0.m70247b(this).getSharedDrawScope();
    }

    /* renamed from: q1 */
    public final boolean mo44700q1(@C12580l C16476b bVar) {
        if (bVar == null) {
            return false;
        }
        if (this.f38833O0 == UsageByParent.NotUsed) {
            mo44626I();
        }
        return mo44702s0().mo44803m1(bVar.mo47807x());
    }

    @C12580l
    /* renamed from: r */
    public C15601t mo44458r() {
        return mo44613C0();
    }

    @C12580l
    /* renamed from: r0 */
    public final C15553d0 mo44701r0() {
        return this.f38824F0;
    }

    @C12579k
    /* renamed from: s */
    public List<C15577j0> mo44459s() {
        return this.f38837S0.mo45234p();
    }

    /* renamed from: s0 */
    public final LayoutNodeLayoutDelegate.MeasurePassDelegate mo44702s0() {
        return this.f38838T0.mo44759x();
    }

    /* renamed from: s1 */
    public final void mo44703s1() {
        int g = this.f38854d.mo45189g();
        while (true) {
            g--;
            if (-1 < g) {
                mo44688k1(this.f38854d.mo45187e(g));
            } else {
                this.f38854d.mo45185c();
                return;
            }
        }
    }

    /* renamed from: t */
    public void mo16260t() {
        AndroidViewHolder androidViewHolder = this.f38860w;
        if (androidViewHolder != null) {
            androidViewHolder.mo16260t();
        }
        if (this.f38855d1) {
            this.f38855d1 = false;
        } else {
            mo44617E1();
        }
        this.f38837S0.mo45224f();
    }

    /* renamed from: t0 */
    public final boolean mo44704t0() {
        return this.f38838T0.mo44760y();
    }

    /* renamed from: t1 */
    public final void mo44705t1(int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = (i2 + i) - 1;
            if (i <= i3) {
                while (true) {
                    mo44688k1(this.f38854d.mo45191i(i3));
                    if (i3 != i) {
                        i3--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i2 + ") must be greater than 0").toString());
        }
    }

    @C12579k
    public String toString() {
        return C15999y0.m71811b(this, (String) null) + " children: " + mo44667Z().size() + " measurePolicy: " + mo44584x();
    }

    /* renamed from: u */
    public void mo44582u(@C12579k C8767m mVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "value");
        if (!this.f38848a || mo44576b() == C8767m.f23478j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f38845Y0 = mVar;
            this.f38837S0.mo45221M(mVar);
            NodeCoordinator A0 = mo44610A0();
            NodeCoordinator v4 = mo44674d0().mo44887v4();
            while (!Intrinsics.areEqual((Object) A0, (Object) v4) && A0 != null) {
                A0.mo44833F6(this.f38824F0);
                A0 = A0.mo44887v4();
            }
            this.f38838T0.mo44746O();
            return;
        }
        throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
    }

    @C12579k
    /* renamed from: u0 */
    public final UsageByParent mo44707u0() {
        return this.f38831M0;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: u1 */
    public final void mo44708u1() {
        if (this.f38833O0 == UsageByParent.NotUsed) {
            mo44629J();
        }
        try {
            this.f38853c1 = true;
            mo44702s0().mo44804q1();
            this.f38853c1 = false;
        } catch (Throwable th) {
            this.f38853c1 = false;
            throw th;
        }
    }

    @C12579k
    /* renamed from: v */
    public C15588o mo44460v() {
        return mo44674d0();
    }

    @C12579k
    /* renamed from: v0 */
    public final UsageByParent mo44709v0() {
        return this.f38832N0;
    }

    /* renamed from: v1 */
    public final void mo44710v1(boolean z) {
        C15675c1 c1Var;
        if (!this.f38848a && (c1Var = this.f38859v) != null) {
            c1Var.mo44965e(this, true, z);
        }
    }

    /* renamed from: w */
    public void mo44583w(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "value");
        if (!Intrinsics.areEqual((Object) this.f38823E0, (Object) dVar)) {
            this.f38823E0 = dVar;
            mo44690l1();
        }
    }

    /* renamed from: w0 */
    public final boolean mo44711w0() {
        return this.f38851b1;
    }

    @C12579k
    /* renamed from: x */
    public C15560f0 mo44584x() {
        return this.f38844Y;
    }

    @C12579k
    /* renamed from: x0 */
    public final C15733t0 mo44712x0() {
        return this.f38837S0;
    }

    /* renamed from: x1 */
    public final void mo44713x1(boolean z) {
        boolean z2;
        if (this.f38824F0 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C15675c1 c1Var = this.f38859v;
            if (c1Var != null && !this.f38862y && !this.f38848a) {
                c1Var.mo44964c(this, true, z);
                LayoutNodeLayoutDelegate.LookaheadPassDelegate p0 = mo44697p0();
                Intrinsics.checkNotNull(p0);
                p0.mo44776g1(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    @C12580l
    @C8762h
    /* renamed from: y */
    public View mo44714y() {
        AndroidViewHolder androidViewHolder = this.f38860w;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    @C12580l
    /* renamed from: y0 */
    public final C11300l<C15675c1, C11079d2> mo44715y0() {
        return this.f38847Z0;
    }

    @C12580l
    /* renamed from: z0 */
    public final C11300l<C15675c1, C11079d2> mo44716z0() {
        return this.f38849a1;
    }

    /* renamed from: z1 */
    public final void mo44717z1(boolean z) {
        C15675c1 c1Var;
        if (!this.f38848a && (c1Var = this.f38859v) != null) {
            C15675c1.m70190g(c1Var, this, false, z, 2, (Object) null);
        }
    }

    public LayoutNode(boolean z, int i) {
        this.f38848a = z;
        this.f38850b = i;
        this.f38854d = new C15726q0<>(new C8423g(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this.f38863z = new C8423g<>(new LayoutNode[16], 0);
        this.f38842X = true;
        this.f38844Y = f38818f1;
        this.f38846Z = new C15731t(this);
        this.f38823E0 = C16482f.m74434b(1.0f, 0.0f, 2, (Object) null);
        this.f38825G0 = LayoutDirection.Ltr;
        this.f38826H0 = f38821i1;
        this.f38828J0 = Integer.MAX_VALUE;
        this.f38829K0 = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.f38831M0 = usageByParent;
        this.f38832N0 = usageByParent;
        this.f38833O0 = usageByParent;
        this.f38834P0 = usageByParent;
        this.f38837S0 = new C15733t0(this);
        this.f38838T0 = new LayoutNodeLayoutDelegate(this);
        this.f38843X0 = true;
        this.f38845Y0 = C8767m.f23478j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? C16038l.f39832e.mo46172a() : i);
    }
}
