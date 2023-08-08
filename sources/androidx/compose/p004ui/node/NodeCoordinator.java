package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15092d;
import androidx.compose.p004ui.geometry.C15093e;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15112a3;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15121b4;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15553d0;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.layout.C15619z;
import androidx.compose.p004ui.semantics.C16035j;
import androidx.compose.p004ui.semantics.C16040m;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.snapshots.C8646f;
import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.collections.C10930d1;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1354:1\n100#1,9:1355\n100#1,9:1364\n100#1,9:1373\n111#1:1384\n100#1,15:1385\n111#1:1418\n100#1,15:1419\n121#1:1437\n100#1,9:1438\n122#1:1447\n111#1:1449\n100#1,15:1450\n111#1:1466\n100#1,15:1467\n1#2:1382\n71#3:1383\n79#3:1400\n79#3:1404\n81#3:1409\n81#3:1417\n71#3:1436\n81#3:1448\n81#3:1465\n69#3:1482\n69#3:1483\n75#3:1493\n75#3:1494\n664#4,3:1401\n667#4,3:1406\n196#5:1405\n480#6,4:1410\n485#6:1435\n122#7,3:1414\n126#7:1434\n276#8,9:1484\n290#8:1495\n262#8,7:1496\n291#8,2:1503\n270#8,3:1505\n66#9,5:1508\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n111#1:1355,9\n121#1:1364,9\n126#1:1373,9\n247#1:1384\n247#1:1385,15\n315#1:1418\n315#1:1419,15\n365#1:1437\n365#1:1438,9\n365#1:1447\n382#1:1449\n382#1:1450,15\n386#1:1466\n386#1:1467,15\n247#1:1383\n262#1:1400\n266#1:1404\n313#1:1409\n315#1:1417\n365#1:1436\n382#1:1448\n386#1:1465\n686#1:1482\n1075#1:1483\n1107#1:1493\n1108#1:1494\n264#1:1401,3\n264#1:1406,3\n266#1:1405\n314#1:1410,4\n314#1:1435\n314#1:1414,3\n314#1:1434\n1075#1:1484,9\n1108#1:1495\n1108#1:1496,7\n1108#1:1503,2\n1108#1:1505,3\n1150#1:1508,5\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeCoordinator */
public abstract class NodeCoordinator extends C15694i0 implements C15557e0, C15588o, C15680d1, C11300l<C15118b2, C11079d2> {
    @C12579k

    /* renamed from: P0 */
    public static final C15660c f38930P0 = new C15660c((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: Q0 */
    public static final String f38931Q0 = "LayoutCoordinate operations are only valid when isAttached is true";
    @C12579k

    /* renamed from: R0 */
    public static final String f38932R0 = "Asking for measurement result of unmeasured layout modifier";
    @C12579k

    /* renamed from: S0 */
    public static final C11300l<NodeCoordinator, C11079d2> f38933S0 = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.f38960f;
    @C12579k

    /* renamed from: T0 */
    public static final C11300l<NodeCoordinator, C11079d2> f38934T0 = NodeCoordinator$Companion$onCommitAffectingLayer$1.f38959f;
    @C12579k

    /* renamed from: U0 */
    public static final C15121b4 f38935U0 = new C15121b4();
    @C12579k

    /* renamed from: V0 */
    public static final C15736u f38936V0 = new C15736u();
    @C12579k

    /* renamed from: W0 */
    public static final float[] f38937W0 = C15112a3.m65154c((float[]) null, 1, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: X0 */
    public static final C15661d<C15689g1> f38938X0 = new C15658a();
    @C12579k

    /* renamed from: Y0 */
    public static final C15661d<C15703k1> f38939Y0 = new C15659b();

    /* renamed from: E0 */
    public float f38940E0 = 0.8f;
    @C12580l

    /* renamed from: F0 */
    public C15564g0 f38941F0;
    @C12580l

    /* renamed from: G0 */
    public C15697j0 f38942G0;
    @C12580l

    /* renamed from: H0 */
    public Map<C15531a, Integer> f38943H0;

    /* renamed from: I0 */
    public long f38944I0 = C16494m.f40890b.mo47857a();

    /* renamed from: J0 */
    public float f38945J0;
    @C12580l

    /* renamed from: K0 */
    public C15092d f38946K0;
    @C12580l

    /* renamed from: L0 */
    public C15736u f38947L0;
    @C12579k

    /* renamed from: M0 */
    public final C11289a<C11079d2> f38948M0 = new NodeCoordinator$invalidateParentLayer$1(this);

    /* renamed from: N0 */
    public boolean f38949N0;
    @C12580l

    /* renamed from: O0 */
    public C15672b1 f38950O0;
    @C12580l

    /* renamed from: X */
    public C11300l<? super C15327u2, C11079d2> f38951X;
    @C12579k

    /* renamed from: Y */
    public C16479d f38952Y = mo44836H5().getDensity();
    @C12579k

    /* renamed from: Z */
    public LayoutDirection f38953Z = mo44836H5().getLayoutDirection();
    @C12579k

    /* renamed from: v */
    public final LayoutNode f38954v;
    @C12580l

    /* renamed from: w */
    public NodeCoordinator f38955w;
    @C12580l

    /* renamed from: x */
    public NodeCoordinator f38956x;

    /* renamed from: y */
    public boolean f38957y;

    /* renamed from: z */
    public boolean f38958z;

    @C11363r0({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n75#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n*L\n1242#1:1355\n*E\n"})
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$a */
    public static final class C15658a implements C15661d<C15689g1> {
        /* renamed from: a */
        public int mo44896a() {
            return C15739v0.m70597b(16);
        }

        /* renamed from: b */
        public void mo44897b(@C12579k LayoutNode layoutNode, long j, @C12579k C15707m<C15689g1> mVar, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(mVar, "hitTestResult");
            layoutNode.mo44630J0(j, mVar, z, z2);
        }

        /* renamed from: d */
        public boolean mo44899d(@C12579k LayoutNode layoutNode) {
            Intrinsics.checkNotNullParameter(layoutNode, "parentLayoutNode");
            return true;
        }

        /* renamed from: e */
        public boolean mo44898c(@C12579k C15689g1 g1Var) {
            Intrinsics.checkNotNullParameter(g1Var, "node");
            return g1Var.mo44561n();
        }
    }

    @C11363r0({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n73#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n*L\n1263#1:1355\n*E\n"})
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$b */
    public static final class C15659b implements C15661d<C15703k1> {
        /* renamed from: a */
        public int mo44896a() {
            return C15739v0.m70597b(8);
        }

        /* renamed from: b */
        public void mo44897b(@C12579k LayoutNode layoutNode, long j, @C12579k C15707m<C15703k1> mVar, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(mVar, "hitTestResult");
            layoutNode.mo44634L0(j, mVar, z, z2);
        }

        /* renamed from: d */
        public boolean mo44899d(@C12579k LayoutNode layoutNode) {
            C16035j a;
            Intrinsics.checkNotNullParameter(layoutNode, "parentLayoutNode");
            C15703k1 j = C16040m.m72168j(layoutNode);
            boolean z = false;
            if (!(j == null || (a = C15706l1.m70387a(j)) == null || !a.mo46152H())) {
                z = true;
            }
            return !z;
        }

        /* renamed from: e */
        public boolean mo44898c(@C12579k C15703k1 k1Var) {
            Intrinsics.checkNotNullParameter(k1Var, "node");
            return false;
        }
    }

    /* renamed from: androidx.compose.ui.node.NodeCoordinator$c */
    public static final class C15660c {
        public /* synthetic */ C15660c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m70061b() {
        }

        @C12579k
        /* renamed from: a */
        public final C15661d<C15689g1> mo44902a() {
            return NodeCoordinator.f38938X0;
        }

        @C12579k
        /* renamed from: c */
        public final C15661d<C15703k1> mo44903c() {
            return NodeCoordinator.f38939Y0;
        }

        public C15660c() {
        }
    }

    /* renamed from: androidx.compose.ui.node.NodeCoordinator$d */
    public interface C15661d<N extends C15678d> {
        /* renamed from: a */
        int mo44896a();

        /* renamed from: b */
        void mo44897b(@C12579k LayoutNode layoutNode, long j, @C12579k C15707m<N> mVar, boolean z, boolean z2);

        /* renamed from: c */
        boolean mo44898c(@C12579k N n);

        /* renamed from: d */
        boolean mo44899d(@C12579k LayoutNode layoutNode);
    }

    public NodeCoordinator(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f38954v = layoutNode;
    }

    /* renamed from: C6 */
    public static /* synthetic */ void m69943C6(NodeCoordinator nodeCoordinator, C11300l lVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            nodeCoordinator.mo44823B6(lVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    /* renamed from: j6 */
    public static /* synthetic */ Object m69956j6(NodeCoordinator nodeCoordinator, C15098i iVar, C11045c<? super C11079d2> cVar) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f38956x;
        if (nodeCoordinator2 == null) {
            return C11079d2.f28267a;
        }
        Object T5 = nodeCoordinator2.mo44849T5(iVar.mo42261S(nodeCoordinator2.mo44437n0(nodeCoordinator, false).mo42251E()), cVar);
        if (T5 == C11063b.m42612h()) {
            return T5;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: m5 */
    public static /* synthetic */ void m69957m5(NodeCoordinator nodeCoordinator, C11300l lVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            nodeCoordinator.mo44870k5(lVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLayerBlockUpdated");
    }

    /* renamed from: o6 */
    public static /* synthetic */ void m69958o6(NodeCoordinator nodeCoordinator, C15092d dVar, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            nodeCoordinator.mo44874n6(dVar, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    /* renamed from: A4 */
    public final float mo44820A4() {
        return this.f38945J0;
    }

    /* renamed from: A5 */
    public final void mo44821A5() {
        C8646f p;
        C8767m.C8772d dVar;
        if (mo44824C4(C15739v0.m70597b(128))) {
            C8646f a = C8646f.f23196e.mo16621a();
            try {
                p = a.mo16617p();
                int b = C15739v0.m70597b(128);
                boolean g = C15741w0.m70618g(b);
                if (g) {
                    dVar = mo44883s4();
                } else {
                    dVar = mo44883s4().mo17234M();
                    if (dVar == null) {
                        C11079d2 d2Var = C11079d2.f28267a;
                        a.mo16619w(p);
                        a.mo16415d();
                    }
                }
                C8767m.C8772d i2 = mo44830E4(g);
                while (i2 != null && (i2.mo17228E() & b) != 0) {
                    if ((i2.mo17232I() & b) != 0 && (i2 instanceof C15738v)) {
                        ((C15738v) i2).mo44555k(mo44469I0());
                    }
                    if (i2 == dVar) {
                        break;
                    }
                    i2 = i2.mo17229F();
                }
                C11079d2 d2Var2 = C11079d2.f28267a;
                a.mo16619w(p);
                a.mo16415d();
            } catch (Throwable th) {
                a.mo16415d();
                throw th;
            }
        }
    }

    /* renamed from: A6 */
    public final void mo44822A6(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!Intrinsics.areEqual((Object) nodeCoordinator2, (Object) nodeCoordinator)) {
            C15672b1 b1Var = nodeCoordinator2.f38950O0;
            if (b1Var != null) {
                b1Var.mo44939a(fArr);
            }
            long g1 = nodeCoordinator2.mo44865g1();
            if (!C16494m.m74578j(g1, C16494m.f40890b.mo47857a())) {
                float[] fArr2 = f38937W0;
                C15112a3.m65163m(fArr2);
                C15112a3.m65174x(fArr2, (float) C16494m.m74581m(g1), (float) C16494m.m74583o(g1), 0.0f, 4, (Object) null);
                C15112a3.m65171u(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.f38956x;
            Intrinsics.checkNotNull(nodeCoordinator2);
        }
    }

    /* renamed from: B6 */
    public final void mo44823B6(@C12580l C11300l<? super C15327u2, C11079d2> lVar, boolean z) {
        boolean z2;
        if (this.f38951X != lVar || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f38951X = lVar;
        mo44870k5(lVar, z2);
    }

    /* renamed from: C4 */
    public final boolean mo44824C4(int i) {
        C8767m.C8772d E4 = mo44830E4(C15741w0.m70618g(i));
        return E4 != null && C15681e.m70226g(E4, i);
    }

    /* renamed from: C5 */
    public final void mo44825C5() {
        C15697j0 j0Var = this.f38942G0;
        if (j0Var != null) {
            int b = C15739v0.m70597b(128);
            boolean g = C15741w0.m70618g(b);
            C8767m.C8772d s4 = mo44883s4();
            if (g || (s4 = s4.mo17234M()) != null) {
                C8767m.C8772d i2 = mo44830E4(g);
                while (i2 != null && (i2.mo17228E() & b) != 0) {
                    if ((i2.mo17232I() & b) != 0 && (i2 instanceof C15738v)) {
                        ((C15738v) i2).mo44559m(j0Var.mo45034d2());
                    }
                    if (i2 == s4) {
                        break;
                    }
                    i2 = i2.mo17229F();
                }
            }
        }
        int b2 = C15739v0.m70597b(128);
        boolean g2 = C15741w0.m70618g(b2);
        C8767m.C8772d s42 = mo44883s4();
        if (g2 || (s42 = s42.mo17234M()) != null) {
            C8767m.C8772d i22 = mo44830E4(g2);
            while (i22 != null && (i22.mo17228E() & b2) != 0) {
                if ((i22.mo17232I() & b2) != 0 && (i22 instanceof C15738v)) {
                    ((C15738v) i22).mo44446p(this);
                }
                if (i22 != s42) {
                    i22 = i22.mo17229F();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: D4 */
    public final /* synthetic */ <T> T mo44826D4(int i) {
        boolean g = C15741w0.m70618g(i);
        T s4 = mo44883s4();
        if (!g && (s4 = s4.mo17234M()) == null) {
            return null;
        }
        T i2 = mo44830E4(g);
        while (i2 != null && (i2.mo17228E() & i) != 0) {
            if ((i2.mo17232I() & i) != 0) {
                Intrinsics.reifiedOperationMarker(2, C19135a.f48928d5);
                return i2;
            } else if (i2 == s4) {
                return null;
            } else {
                i2 = i2.mo17229F();
            }
        }
        return null;
    }

    /* renamed from: D5 */
    public final void mo44827D5() {
        this.f38957y = true;
        if (this.f38950O0 != null) {
            m69957m5(this, (C11300l) null, false, 2, (Object) null);
        }
    }

    /* renamed from: D6 */
    public final void mo44828D6() {
        boolean z;
        C15672b1 b1Var = this.f38950O0;
        if (b1Var != null) {
            C11300l<? super C15327u2, C11079d2> lVar = this.f38951X;
            if (lVar != null) {
                C15121b4 b4Var = f38935U0;
                b4Var.mo42469d();
                b4Var.mo42472f(mo44836H5().getDensity());
                b4Var.mo42476h(C16502r.m74673f(mo44434a()));
                mo44879q4().mo44918i(this, f38933S0, new NodeCoordinator$updateLayerParameters$1(lVar));
                C15736u uVar = this.f38947L0;
                if (uVar == null) {
                    uVar = new C15736u();
                    this.f38947L0 = uVar;
                }
                uVar.mo45259a(b4Var);
                C15121b4 b4Var2 = b4Var;
                b1Var.mo44940b(b4Var.mo42454G(), b4Var.mo42466X(), b4Var.getAlpha(), b4Var.mo42459Q(), b4Var.mo42458P(), b4Var.mo42465W5(), b4Var.mo42461R(), b4Var.mo42484s(), b4Var.mo42486v(), b4Var.mo42488z(), b4Var.mo42474g2(), b4Var.mo42485t4(), b4Var.mo42470e(), b4Var2.mo42478l(), b4Var.mo42481p1(), b4Var.mo42463T1(), b4Var2.mo42455H(), mo44836H5().getLayoutDirection(), mo44836H5().getDensity());
                this.f38958z = b4Var2.mo42470e();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            if (this.f38951X == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.f38940E0 = f38935U0.getAlpha();
        C15675c1 B0 = mo44836H5().mo44611B0();
        if (B0 != null) {
            B0.mo44992l(mo44836H5());
        }
    }

    @C12579k
    /* renamed from: E3 */
    public final NodeCoordinator mo44829E3(@C12579k NodeCoordinator nodeCoordinator) {
        Intrinsics.checkNotNullParameter(nodeCoordinator, "other");
        LayoutNode H5 = nodeCoordinator.mo44836H5();
        LayoutNode H52 = mo44836H5();
        if (H5 == H52) {
            C8767m.C8772d s4 = nodeCoordinator.mo44883s4();
            C8767m.C8772d s42 = mo44883s4();
            int b = C15739v0.m70597b(2);
            if (s42.mo17252q().mo17236Q()) {
                for (C8767m.C8772d M = s42.mo17252q().mo17234M(); M != null; M = M.mo17234M()) {
                    if ((M.mo17232I() & b) != 0 && M == s4) {
                        return nodeCoordinator;
                    }
                }
                return this;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        while (H5.mo44669a0() > H52.mo44669a0()) {
            H5 = H5.mo44613C0();
            Intrinsics.checkNotNull(H5);
        }
        while (H52.mo44669a0() > H5.mo44669a0()) {
            H52 = H52.mo44613C0();
            Intrinsics.checkNotNull(H52);
        }
        while (H5 != H52) {
            H5 = H5.mo44613C0();
            H52 = H52.mo44613C0();
            if (H5 != null) {
                if (H52 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (H52 == mo44836H5()) {
            return this;
        }
        if (H5 == nodeCoordinator.mo44836H5()) {
            return nodeCoordinator;
        }
        return H5.mo44674d0();
    }

    /* renamed from: E4 */
    public final C8767m.C8772d mo44830E4(boolean z) {
        C8767m.C8772d s4;
        if (mo44836H5().mo44610A0() == this) {
            return mo44836H5().mo44712x0().mo45231m();
        }
        if (z) {
            NodeCoordinator nodeCoordinator = this.f38956x;
            if (!(nodeCoordinator == null || (s4 = nodeCoordinator.mo44883s4()) == null)) {
                return s4.mo17229F();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.f38956x;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.mo44883s4();
            }
        }
        return null;
    }

    /* renamed from: E6 */
    public final void mo44831E6(@C12579k C15697j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "lookaheadDelegate");
        this.f38942G0 = j0Var;
    }

    @C12580l
    /* renamed from: F4 */
    public final <T> T mo44832F4(int i) {
        boolean g = C15741w0.m70618g(i);
        T s4 = mo44883s4();
        if (!g && (s4 = s4.mo17234M()) == null) {
            return null;
        }
        T i2 = mo44830E4(g);
        while (i2 != null && (i2.mo17228E() & i) != 0) {
            if ((i2.mo17232I() & i) != 0) {
                return i2;
            }
            if (i2 == s4) {
                return null;
            }
            i2 = i2.mo17229F();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.compose.ui.layout.d0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44833F6(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.layout.C15553d0 r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0019
            androidx.compose.ui.node.j0 r1 = r2.f38942G0
            if (r1 == 0) goto L_0x000b
            androidx.compose.ui.layout.d0 r0 = r1.mo45035h2()
        L_0x000b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r0 != 0) goto L_0x0016
            androidx.compose.ui.node.j0 r3 = r2.mo44864f3(r3)
            goto L_0x0018
        L_0x0016:
            androidx.compose.ui.node.j0 r3 = r2.f38942G0
        L_0x0018:
            r0 = r3
        L_0x0019:
            r2.f38942G0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.NodeCoordinator.mo44833F6(androidx.compose.ui.layout.d0):void");
    }

    /* renamed from: G4 */
    public final <T extends C15678d> void mo44834G4(T t, C15661d<T> dVar, long j, C15707m<T> mVar, boolean z, boolean z2) {
        if (t == null) {
            mo44848T4(dVar, j, mVar, z, z2);
            return;
        }
        mVar.mo45080M(t, z2, new NodeCoordinator$hit$1(this, t, dVar, j, mVar, z, z2));
    }

    /* renamed from: G6 */
    public final void mo44835G6(int i, boolean z, @C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C8767m.C8772d s4 = mo44883s4();
        if (z || (s4 = s4.mo17234M()) != null) {
            C8767m.C8772d i2 = mo44830E4(z);
            while (i2 != null && (i2.mo17228E() & i) != 0) {
                if ((i2.mo17232I() & i) != 0) {
                    lVar.invoke(i2);
                }
                if (i2 != s4) {
                    i2 = i2.mo17229F();
                } else {
                    return;
                }
            }
        }
    }

    @C12579k
    /* renamed from: H5 */
    public LayoutNode mo44836H5() {
        return this.f38954v;
    }

    /* renamed from: H6 */
    public final /* synthetic */ <T> void mo44837H6(int i, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        boolean g = C15741w0.m70618g(i);
        C8767m.C8772d s4 = mo44883s4();
        if (g || (s4 = s4.mo17234M()) != null) {
            C8767m.C8772d i2 = mo44830E4(g);
            while (i2 != null && (i2.mo17228E() & i) != 0) {
                if ((i2.mo17232I() & i) != 0) {
                    Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                    lVar.invoke(i2);
                }
                if (i2 != s4) {
                    i2 = i2.mo17229F();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: I6 */
    public final void mo44838I6(@C12579k C15118b2 b2Var, @C12579k C11300l<? super C15118b2, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        float m = (float) C16494m.m74581m(mo44865g1());
        float o = (float) C16494m.m74583o(mo44865g1());
        b2Var.mo42433e(m, o);
        lVar.invoke(b2Var);
        b2Var.mo42433e(-m, -o);
    }

    /* renamed from: J6 */
    public final boolean mo44839J6(long j) {
        if (!C15096g.m64899b(j)) {
            return false;
        }
        C15672b1 b1Var = this.f38950O0;
        if (b1Var == null || !this.f38958z || b1Var.mo44947i(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public long mo44430K(@C12579k C15588o oVar, long j) {
        Intrinsics.checkNotNullParameter(oVar, "sourceCoordinates");
        NodeCoordinator w6 = mo44891w6(oVar);
        NodeCoordinator E3 = mo44829E3(w6);
        while (w6 != E3) {
            j = w6.mo44892x6(j);
            w6 = w6.f38956x;
            Intrinsics.checkNotNull(w6);
        }
        return mo44857a3(E3, j);
    }

    /* renamed from: K3 */
    public long mo44840K3(long j) {
        long c = C16496n.m74595c(j, mo44865g1());
        C15672b1 b1Var = this.f38950O0;
        if (b1Var != null) {
            return b1Var.mo44941c(c, true);
        }
        return c;
    }

    /* renamed from: L3 */
    public final void mo44841L3(C15092d dVar, boolean z) {
        float m = (float) C16494m.m74581m(mo44865g1());
        dVar.mo42238m(dVar.mo42229d() - m);
        dVar.mo42239n(dVar.mo42230e() - m);
        float o = (float) C16494m.m74583o(mo44865g1());
        dVar.mo42240o(dVar.mo42232g() - o);
        dVar.mo42237l(dVar.mo42227b() - o);
        C15672b1 b1Var = this.f38950O0;
        if (b1Var != null) {
            b1Var.mo44943e(dVar, true);
            if (this.f38958z && z) {
                dVar.mo42234i(0.0f, 0.0f, (float) C16500q.m74662m(mo44434a()), (float) C16500q.m74659j(mo44434a()));
                dVar.mo42235j();
            }
        }
    }

    /* renamed from: M3 */
    public final boolean mo44842M3() {
        return this.f38949N0;
    }

    /* renamed from: M4 */
    public final <T extends C15678d> void mo44843M4(T t, C15661d<T> dVar, long j, C15707m<T> mVar, boolean z, boolean z2, float f) {
        if (t == null) {
            mo44848T4(dVar, j, mVar, z, z2);
            return;
        }
        float f2 = f;
        mVar.mo45081Q(t, f2, z2, new NodeCoordinator$hitNear$1(this, t, dVar, j, mVar, z, z2, f));
    }

    @C12580l
    /* renamed from: N */
    public final C15588o mo44431N() {
        if (mo44436k()) {
            return this.f38956x;
        }
        throw new IllegalStateException(f38931Q0.toString());
    }

    /* renamed from: N0 */
    public void mo44326N0(long j, float f, @C12580l C11300l<? super C15327u2, C11079d2> lVar) {
        m69957m5(this, lVar, false, 2, (Object) null);
        if (!C16494m.m74578j(mo44865g1(), j)) {
            mo44880q6(j);
            mo44836H5().mo44687k0().mo44759x().mo44799f1();
            C15672b1 b1Var = this.f38950O0;
            if (b1Var != null) {
                b1Var.mo44950l(j);
            } else {
                NodeCoordinator nodeCoordinator = this.f38956x;
                if (nodeCoordinator != null) {
                    nodeCoordinator.mo44851V4();
                }
            }
            mo45021j1(this);
            C15675c1 B0 = mo44836H5().mo44611B0();
            if (B0 != null) {
                B0.mo44992l(mo44836H5());
            }
        }
        this.f38945J0 = f;
    }

    /* renamed from: N3 */
    public final long mo44844N3() {
        return mo44470J0();
    }

    /* renamed from: O5 */
    public void mo44845O5(@C12579k C15118b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        NodeCoordinator nodeCoordinator = this.f38955w;
        if (nodeCoordinator != null) {
            nodeCoordinator.mo44872m3(b2Var);
        }
    }

    /* renamed from: P4 */
    public final <T extends C15678d> void mo44846P4(@C12579k C15661d<T> dVar, long j, @C12579k C15707m<T> mVar, boolean z, boolean z2) {
        float f;
        long j2 = j;
        C15707m<T> mVar2 = mVar;
        C15661d<T> dVar2 = dVar;
        Intrinsics.checkNotNullParameter(dVar, "hitTestSource");
        Intrinsics.checkNotNullParameter(mVar2, "hitTestResult");
        C15678d dVar3 = (C15678d) mo44832F4(dVar.mo44896a());
        boolean z3 = true;
        if (!mo44839J6(j)) {
            if (z) {
                float k3 = mo44869k3(j, mo44871l4());
                if (Float.isInfinite(k3) || Float.isNaN(k3)) {
                    z3 = false;
                }
                if (z3 && mVar2.mo45082W(k3, false)) {
                    mo44843M4(dVar3, dVar, j, mVar, z, false, k3);
                }
            }
        } else if (dVar3 == null) {
            mo44848T4(dVar, j, mVar, z, z2);
        } else if (mo44855Y4(j)) {
            mo44834G4(dVar3, dVar, j, mVar, z, z2);
        } else {
            if (!z) {
                f = Float.POSITIVE_INFINITY;
            } else {
                f = mo44869k3(j, mo44871l4());
            }
            float f2 = f;
            if (Float.isInfinite(f2) || Float.isNaN(f2)) {
                z3 = false;
            }
            boolean z4 = z2;
            if (!z3 || !mVar2.mo45082W(f2, z4)) {
                mo44888v6(dVar3, dVar, j, mVar, z, z2, f2);
            } else {
                mo44843M4(dVar3, dVar, j, mVar, z, z2, f2);
            }
        }
    }

    @C12579k
    /* renamed from: P5 */
    public final C15611w0 mo44847P5(long j, @C12579k C11289a<? extends C15611w0> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        mo44474T0(j);
        C15611w0 w0Var = (C15611w0) aVar.invoke();
        C15672b1 V3 = mo44850V3();
        if (V3 != null) {
            V3.mo44942d(mo44469I0());
        }
        return w0Var;
    }

    /* renamed from: R4 */
    public float mo7419R4() {
        return mo44836H5().getDensity().mo7419R4();
    }

    /* renamed from: T */
    public long mo44432T(long j) {
        if (mo44436k()) {
            C15588o d = C15591p.m69302d(this);
            return mo44430K(d, C15094f.m64885u(C15682e0.m70247b(mo44836H5()).mo45000z(j), C15591p.m69304f(d)));
        }
        throw new IllegalStateException(f38931Q0.toString());
    }

    /* renamed from: T4 */
    public <T extends C15678d> void mo44848T4(@C12579k C15661d<T> dVar, long j, @C12579k C15707m<T> mVar, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(dVar, "hitTestSource");
        Intrinsics.checkNotNullParameter(mVar, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.f38955w;
        if (nodeCoordinator != null) {
            nodeCoordinator.mo44846P4(dVar, nodeCoordinator.mo44840K3(j), mVar, z, z2);
        }
    }

    @C12580l
    /* renamed from: T5 */
    public Object mo44849T5(@C12579k C15098i iVar, @C12579k C11045c<? super C11079d2> cVar) {
        return m69956j6(this, iVar, cVar);
    }

    @C12580l
    /* renamed from: V3 */
    public final C15672b1 mo44850V3() {
        return this.f38950O0;
    }

    /* renamed from: V4 */
    public void mo44851V4() {
        C15672b1 b1Var = this.f38950O0;
        if (b1Var != null) {
            b1Var.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.f38956x;
        if (nodeCoordinator != null) {
            nodeCoordinator.mo44851V4();
        }
    }

    /* renamed from: W */
    public void mo44433W(@C12579k C15588o oVar, @C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(oVar, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        NodeCoordinator w6 = mo44891w6(oVar);
        NodeCoordinator E3 = mo44829E3(w6);
        C15112a3.m65163m(fArr);
        w6.mo44822A6(E3, fArr);
        mo44895z6(E3, fArr);
    }

    @C12579k
    /* renamed from: W0 */
    public C15665a mo44852W0() {
        return mo44836H5().mo44687k0().mo44747l();
    }

    /* renamed from: W4 */
    public void mo44853W4(@C12579k C15118b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        if (mo44836H5().mo44456p()) {
            mo44879q4().mo44918i(this, f38934T0, new NodeCoordinator$invoke$1(this, b2Var));
            this.f38949N0 = false;
            return;
        }
        this.f38949N0 = true;
    }

    /* renamed from: X2 */
    public final void mo44854X2(NodeCoordinator nodeCoordinator, C15092d dVar, boolean z) {
        if (nodeCoordinator != this) {
            NodeCoordinator nodeCoordinator2 = this.f38956x;
            if (nodeCoordinator2 != null) {
                nodeCoordinator2.mo44854X2(nodeCoordinator, dVar, z);
            }
            mo44841L3(dVar, z);
        }
    }

    /* renamed from: Y4 */
    public final boolean mo44855Y4(long j) {
        float p = C15094f.m64880p(j);
        float r = C15094f.m64882r(j);
        if (p < 0.0f || r < 0.0f || p >= ((float) mo44416Z()) || r >= ((float) mo44418f())) {
            return false;
        }
        return true;
    }

    @C12580l
    /* renamed from: Z0 */
    public C15694i0 mo44856Z0() {
        return this.f38955w;
    }

    /* renamed from: a */
    public final long mo44434a() {
        return mo44469I0();
    }

    /* renamed from: a3 */
    public final long mo44857a3(NodeCoordinator nodeCoordinator, long j) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.f38956x;
        if (nodeCoordinator2 == null || Intrinsics.areEqual((Object) nodeCoordinator, (Object) nodeCoordinator2)) {
            return mo44840K3(j);
        }
        return mo44840K3(nodeCoordinator2.mo44857a3(nodeCoordinator, j));
    }

    /* renamed from: b0 */
    public long mo44435b0(long j) {
        return C15682e0.m70247b(mo44836H5()).mo44990h(mo44440z0(j));
    }

    @C12579k
    /* renamed from: b1 */
    public C15588o mo44858b1() {
        return this;
    }

    /* renamed from: b3 */
    public final long mo44859b3(long j) {
        return C15106n.m65033a(Math.max(0.0f, (C15104m.m65023t(j) - ((float) mo44416Z())) / 2.0f), Math.max(0.0f, (C15104m.m65016m(j) - ((float) mo44418f())) / 2.0f));
    }

    @C12580l
    /* renamed from: c */
    public Object mo44417c() {
        boolean z;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C8767m.C8772d s4 = mo44883s4();
        if (mo44836H5().mo44712x0().mo45238t(C15739v0.m70597b(64))) {
            C16479d density = mo44836H5().getDensity();
            for (C8767m.C8772d r = mo44836H5().mo44712x0().mo45236r(); r != null; r = r.mo17234M()) {
                if (r != s4) {
                    if ((C15739v0.m70597b(64) & r.mo17232I()) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (r instanceof C15683e1)) {
                        objectRef.element = ((C15683e1) r).mo44447N(density, objectRef.element);
                    }
                }
            }
        }
        return objectRef.element;
    }

    /* renamed from: c1 */
    public boolean mo44860c1() {
        return this.f38941F0 != null;
    }

    /* renamed from: c5 */
    public final boolean mo44861c5() {
        if (this.f38950O0 != null && this.f38940E0 <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.f38956x;
        if (nodeCoordinator != null) {
            return nodeCoordinator.mo44861c5();
        }
        return false;
    }

    /* renamed from: e0 */
    public boolean mo44553e0() {
        return this.f38950O0 != null && mo44436k();
    }

    @C12579k
    /* renamed from: e1 */
    public C15564g0 mo44862e1() {
        C15564g0 g0Var = this.f38941F0;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException(f38932R0.toString());
    }

    @C12580l
    /* renamed from: f1 */
    public C15694i0 mo44863f1() {
        return this.f38956x;
    }

    @C12579k
    /* renamed from: f3 */
    public abstract C15697j0 mo44864f3(@C12579k C15553d0 d0Var);

    /* renamed from: g1 */
    public long mo44865g1() {
        return this.f38944I0;
    }

    public float getDensity() {
        return mo44836H5().getDensity().getDensity();
    }

    @C12579k
    public LayoutDirection getLayoutDirection() {
        return mo44836H5().getLayoutDirection();
    }

    @C12580l
    /* renamed from: h4 */
    public final C11300l<C15327u2, C11079d2> mo44866h4() {
        return this.f38951X;
    }

    /* renamed from: i5 */
    public final long mo44867i5(long j) {
        float f;
        float f2;
        float p = C15094f.m64880p(j);
        if (p < 0.0f) {
            f = -p;
        } else {
            f = p - ((float) mo44416Z());
        }
        float max = Math.max(0.0f, f);
        float r = C15094f.m64882r(j);
        if (r < 0.0f) {
            f2 = -r;
        } else {
            f2 = r - ((float) mo44418f());
        }
        return C15096g.m64898a(max, Math.max(0.0f, f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo44853W4((C15118b2) obj);
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: j4 */
    public final C15697j0 mo44868j4() {
        return this.f38942G0;
    }

    /* renamed from: k */
    public boolean mo44436k() {
        return !this.f38957y && mo44836H5().mo44455k();
    }

    /* renamed from: k3 */
    public final float mo44869k3(long j, long j2) {
        if (((float) mo44416Z()) >= C15104m.m65023t(j2) && ((float) mo44418f()) >= C15104m.m65016m(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long b3 = mo44859b3(j2);
        float t = C15104m.m65023t(b3);
        float m = C15104m.m65016m(b3);
        long i5 = mo44867i5(j);
        if ((t > 0.0f || m > 0.0f) && C15094f.m64880p(i5) <= t && C15094f.m64882r(i5) <= m) {
            return C15094f.m64878n(i5);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* renamed from: k5 */
    public final void mo44870k5(C11300l<? super C15327u2, C11079d2> lVar, boolean z) {
        boolean z2;
        C15675c1 B0;
        if (this.f38951X != lVar || !Intrinsics.areEqual((Object) this.f38952Y, (Object) mo44836H5().getDensity()) || this.f38953Z != mo44836H5().getLayoutDirection() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f38951X = lVar;
        this.f38952Y = mo44836H5().getDensity();
        this.f38953Z = mo44836H5().getLayoutDirection();
        if (!mo44436k() || lVar == null) {
            C15672b1 b1Var = this.f38950O0;
            if (b1Var != null) {
                b1Var.mo44946h();
                mo44836H5().mo44628I1(true);
                this.f38948M0.invoke();
                if (mo44436k() && (B0 = mo44836H5().mo44611B0()) != null) {
                    B0.mo44992l(mo44836H5());
                }
            }
            this.f38950O0 = null;
            this.f38949N0 = false;
        } else if (this.f38950O0 == null) {
            C15672b1 F = C15682e0.m70247b(mo44836H5()).mo44959F(this, this.f38948M0);
            F.mo44942d(mo44469I0());
            F.mo44950l(mo44865g1());
            this.f38950O0 = F;
            mo44828D6();
            mo44836H5().mo44628I1(true);
            this.f38948M0.invoke();
        } else if (z2) {
            mo44828D6();
        }
    }

    /* renamed from: l4 */
    public final long mo44871l4() {
        return this.f38952Y.mo7420V(mo44836H5().getViewConfiguration().mo44721d());
    }

    /* renamed from: m3 */
    public final void mo44872m3(@C12579k C15118b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        C15672b1 b1Var = this.f38950O0;
        if (b1Var != null) {
            b1Var.mo44944f(b2Var);
            return;
        }
        float m = (float) C16494m.m74581m(mo44865g1());
        float o = (float) C16494m.m74583o(mo44865g1());
        b2Var.mo42433e(m, o);
        mo44889w3(b2Var);
        b2Var.mo42433e(-m, -o);
    }

    @C12579k
    /* renamed from: n0 */
    public C15098i mo44437n0(@C12579k C15588o oVar, boolean z) {
        Intrinsics.checkNotNullParameter(oVar, "sourceCoordinates");
        if (!mo44436k()) {
            throw new IllegalStateException(f38931Q0.toString());
        } else if (oVar.mo44436k()) {
            NodeCoordinator w6 = mo44891w6(oVar);
            NodeCoordinator E3 = mo44829E3(w6);
            C15092d n4 = mo44873n4();
            n4.mo42238m(0.0f);
            n4.mo42240o(0.0f);
            n4.mo42239n((float) C16500q.m74662m(oVar.mo44434a()));
            n4.mo42237l((float) C16500q.m74659j(oVar.mo44434a()));
            while (w6 != E3) {
                m69958o6(w6, n4, z, false, 4, (Object) null);
                if (n4.mo42235j()) {
                    return C15098i.f37261e.mo42285a();
                }
                w6 = w6.f38956x;
                Intrinsics.checkNotNull(w6);
            }
            mo44854X2(E3, n4, z);
            return C15093e.m64864a(n4);
        } else {
            throw new IllegalStateException(("LayoutCoordinates " + oVar + " is not attached!").toString());
        }
    }

    @C12579k
    /* renamed from: n4 */
    public final C15092d mo44873n4() {
        C15092d dVar = this.f38946K0;
        if (dVar != null) {
            return dVar;
        }
        C15092d dVar2 = new C15092d(0.0f, 0.0f, 0.0f, 0.0f);
        this.f38946K0 = dVar2;
        return dVar2;
    }

    /* renamed from: n6 */
    public final void mo44874n6(@C12579k C15092d dVar, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(dVar, "bounds");
        C15672b1 b1Var = this.f38950O0;
        if (b1Var != null) {
            if (this.f38958z) {
                if (z2) {
                    long l4 = mo44871l4();
                    float t = C15104m.m65023t(l4) / 2.0f;
                    float m = C15104m.m65016m(l4) / 2.0f;
                    dVar.mo42234i(-t, -m, ((float) C16500q.m74662m(mo44434a())) + t, ((float) C16500q.m74659j(mo44434a())) + m);
                } else if (z) {
                    dVar.mo42234i(0.0f, 0.0f, (float) C16500q.m74662m(mo44434a()), (float) C16500q.m74659j(mo44434a()));
                }
                if (dVar.mo42235j()) {
                    return;
                }
            }
            b1Var.mo44943e(dVar, false);
        }
        float m2 = (float) C16494m.m74581m(mo44865g1());
        dVar.mo42238m(dVar.mo42229d() + m2);
        dVar.mo42239n(dVar.mo42230e() + m2);
        float o = (float) C16494m.m74583o(mo44865g1());
        dVar.mo42240o(dVar.mo42232g() + o);
        dVar.mo42237l(dVar.mo42227b() + o);
    }

    /* renamed from: o5 */
    public void mo44875o5() {
        C15672b1 b1Var = this.f38950O0;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    /* renamed from: p3 */
    public final void mo44876p3(@C12579k C15118b2 b2Var, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        b2Var.mo42428K(new C15098i(0.5f, 0.5f, ((float) C16500q.m74662m(mo44469I0())) - 0.5f, ((float) C16500q.m74659j(mo44469I0())) - 0.5f), f3Var);
    }

    /* renamed from: p6 */
    public void mo44877p6(@C12579k C15564g0 g0Var) {
        boolean z;
        Intrinsics.checkNotNullParameter(g0Var, "value");
        C15564g0 g0Var2 = this.f38941F0;
        if (g0Var != g0Var2) {
            this.f38941F0 = g0Var;
            if (!(g0Var2 != null && g0Var.getWidth() == g0Var2.getWidth() && g0Var.getHeight() == g0Var2.getHeight())) {
                mo44890w5(g0Var.getWidth(), g0Var.getHeight());
            }
            Map<C15531a, Integer> map = this.f38943H0;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if ((!z || (!g0Var.mo8593w().isEmpty())) && !Intrinsics.areEqual((Object) g0Var.mo8593w(), (Object) this.f38943H0)) {
                mo44852W0().mo44789w().mo44538q();
                Map map2 = this.f38943H0;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f38943H0 = map2;
                }
                map2.clear();
                map2.putAll(g0Var.mo8593w());
            }
        }
    }

    /* renamed from: q1 */
    public void mo44878q1() {
        mo44326N0(mo44865g1(), this.f38945J0, this.f38951X);
    }

    /* renamed from: q4 */
    public final OwnerSnapshotObserver mo44879q4() {
        return C15682e0.m70247b(mo44836H5()).getSnapshotObserver();
    }

    /* renamed from: q6 */
    public void mo44880q6(long j) {
        this.f38944I0 = j;
    }

    /* renamed from: r5 */
    public final void mo44881r5() {
        m69957m5(this, this.f38951X, false, 2, (Object) null);
    }

    /* renamed from: r6 */
    public final void mo44882r6(@C12580l NodeCoordinator nodeCoordinator) {
        this.f38955w = nodeCoordinator;
    }

    @C12579k
    /* renamed from: s4 */
    public abstract C8767m.C8772d mo44883s4();

    /* renamed from: s6 */
    public final void mo44884s6(@C12580l NodeCoordinator nodeCoordinator) {
        this.f38956x = nodeCoordinator;
    }

    /* renamed from: t6 */
    public final void mo44885t6(float f) {
        this.f38945J0 = f;
    }

    /* renamed from: u6 */
    public final boolean mo44886u6() {
        C8767m.C8772d E4 = mo44830E4(C15741w0.m70618g(C15739v0.m70597b(16)));
        if (E4 == null) {
            return false;
        }
        int b = C15739v0.m70597b(16);
        if (E4.mo17252q().mo17236Q()) {
            C8767m.C8772d q = E4.mo17252q();
            if ((q.mo17228E() & b) != 0) {
                for (C8767m.C8772d F = q.mo17229F(); F != null; F = F.mo17229F()) {
                    if ((F.mo17232I() & b) != 0 && (F instanceof C15689g1) && ((C15689g1) F).mo44549A()) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C12580l
    /* renamed from: v4 */
    public final NodeCoordinator mo44887v4() {
        return this.f38955w;
    }

    /* renamed from: v6 */
    public final <T extends C15678d> void mo44888v6(T t, C15661d<T> dVar, long j, C15707m<T> mVar, boolean z, boolean z2, float f) {
        if (t == null) {
            mo44848T4(dVar, j, mVar, z, z2);
            return;
        }
        C15661d<T> dVar2 = dVar;
        if (dVar.mo44898c(t)) {
            boolean z3 = z2;
            float f2 = f;
            mVar.mo45093f0(t, f2, z3, new NodeCoordinator$speculativeHit$1(this, t, dVar, j, mVar, z, z3, f2));
            return;
        }
        C15707m<T> mVar2 = mVar;
        mo44888v6((C15678d) C15737u0.m70592b(t, dVar.mo44896a(), C15739v0.m70597b(2)), dVar, j, mVar, z, z2, f);
    }

    @C12580l
    /* renamed from: w0 */
    public final C15588o mo44438w0() {
        if (mo44436k()) {
            return mo44836H5().mo44610A0().f38956x;
        }
        throw new IllegalStateException(f38931Q0.toString());
    }

    /* renamed from: w3 */
    public final void mo44889w3(C15118b2 b2Var) {
        int b = C15739v0.m70597b(4);
        boolean g = C15741w0.m70618g(b);
        C15693i iVar = null;
        C8767m.C8772d s4 = mo44883s4();
        if (g || (s4 = s4.mo17234M()) != null) {
            C8767m.C8772d i2 = mo44830E4(g);
            while (true) {
                if (i2 != null && (i2.mo17228E() & b) != 0) {
                    if ((i2.mo17232I() & b) == 0) {
                        if (i2 == s4) {
                            break;
                        }
                        i2 = i2.mo17229F();
                    } else {
                        if (i2 instanceof C15693i) {
                            iVar = i2;
                        }
                        iVar = iVar;
                    }
                } else {
                    break;
                }
            }
        }
        C15693i iVar2 = iVar;
        if (iVar2 == null) {
            mo44845O5(b2Var);
            return;
        }
        mo44836H5().mo44699q0().mo44956c(b2Var, C16502r.m74673f(mo44434a()), this, iVar2);
    }

    /* renamed from: w5 */
    public void mo44890w5(int i, int i2) {
        C15672b1 b1Var = this.f38950O0;
        if (b1Var != null) {
            b1Var.mo44942d(C16502r.m74668a(i, i2));
        } else {
            NodeCoordinator nodeCoordinator = this.f38956x;
            if (nodeCoordinator != null) {
                nodeCoordinator.mo44851V4();
            }
        }
        C15675c1 B0 = mo44836H5().mo44611B0();
        if (B0 != null) {
            B0.mo44992l(mo44836H5());
        }
        mo44473Q0(C16502r.m74668a(i, i2));
        f38935U0.mo42476h(C16502r.m74673f(mo44469I0()));
        int b = C15739v0.m70597b(4);
        boolean g = C15741w0.m70618g(b);
        C8767m.C8772d s4 = mo44883s4();
        if (g || (s4 = s4.mo17234M()) != null) {
            C8767m.C8772d i22 = mo44830E4(g);
            while (i22 != null && (i22.mo17228E() & b) != 0) {
                if ((i22.mo17232I() & b) != 0 && (i22 instanceof C15693i)) {
                    ((C15693i) i22).mo44571z();
                }
                if (i22 != s4) {
                    i22 = i22.mo17229F();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: w6 */
    public final NodeCoordinator mo44891w6(C15588o oVar) {
        NodeCoordinator b;
        C15619z zVar = oVar instanceof C15619z ? (C15619z) oVar : null;
        if (zVar != null && (b = zVar.mo44496b()) != null) {
            return b;
        }
        Intrinsics.checkNotNull(oVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) oVar;
    }

    @C12579k
    /* renamed from: x0 */
    public Set<C15531a> mo44439x0() {
        Map<C15531a, Integer> map;
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f38955w) {
            C15564g0 g0Var = nodeCoordinator.f38941F0;
            if (g0Var != null) {
                map = g0Var.mo8593w();
            } else {
                map = null;
            }
            boolean z = false;
            if (map != null && (!map.isEmpty())) {
                z = true;
            }
            if (z) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(map.keySet());
            }
        }
        if (linkedHashSet == null) {
            return C10930d1.m40892k();
        }
        return linkedHashSet;
    }

    /* renamed from: x6 */
    public long mo44892x6(long j) {
        C15672b1 b1Var = this.f38950O0;
        if (b1Var != null) {
            j = b1Var.mo44941c(j, false);
        }
        return C16496n.m74597e(j, mo44865g1());
    }

    @C12579k
    /* renamed from: y6 */
    public final C15098i mo44893y6() {
        if (!mo44436k()) {
            return C15098i.f37261e.mo42285a();
        }
        C15588o d = C15591p.m69302d(this);
        C15092d n4 = mo44873n4();
        long b3 = mo44859b3(mo44871l4());
        n4.mo42238m(-C15104m.m65023t(b3));
        n4.mo42240o(-C15104m.m65016m(b3));
        n4.mo42239n(((float) mo44416Z()) + C15104m.m65023t(b3));
        n4.mo42237l(((float) mo44418f()) + C15104m.m65016m(b3));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != d) {
            nodeCoordinator.mo44874n6(n4, false, true);
            if (n4.mo42235j()) {
                return C15098i.f37261e.mo42285a();
            }
            nodeCoordinator = nodeCoordinator.f38956x;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
        return C15093e.m64864a(n4);
    }

    /* renamed from: z0 */
    public long mo44440z0(long j) {
        if (mo44436k()) {
            for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f38956x) {
                j = nodeCoordinator.mo44892x6(j);
            }
            return j;
        }
        throw new IllegalStateException(f38931Q0.toString());
    }

    @C12580l
    /* renamed from: z4 */
    public final NodeCoordinator mo44894z4() {
        return this.f38956x;
    }

    /* renamed from: z6 */
    public final void mo44895z6(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (!Intrinsics.areEqual((Object) nodeCoordinator, (Object) this)) {
            NodeCoordinator nodeCoordinator2 = this.f38956x;
            Intrinsics.checkNotNull(nodeCoordinator2);
            nodeCoordinator2.mo44895z6(nodeCoordinator, fArr);
            if (!C16494m.m74578j(mo44865g1(), C16494m.f40890b.mo47857a())) {
                float[] fArr2 = f38937W0;
                C15112a3.m65163m(fArr2);
                C15112a3.m65174x(fArr2, -((float) C16494m.m74581m(mo44865g1())), -((float) C16494m.m74583o(mo44865g1())), 0.0f, 4, (Object) null);
                C15112a3.m65171u(fArr, fArr2);
            }
            C15672b1 b1Var = this.f38950O0;
            if (b1Var != null) {
                b1Var.mo44949k(fArr);
            }
        }
    }
}
