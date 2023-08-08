package androidx.compose.p004ui.node;

import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15553d0;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.runtime.collection.C8423g;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1237:1\n1#2:1238\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate */
public final class LayoutNodeLayoutDelegate {
    @C12579k

    /* renamed from: a */
    public final LayoutNode f38876a;
    @C12579k

    /* renamed from: b */
    public LayoutNode.LayoutState f38877b = LayoutNode.LayoutState.Idle;

    /* renamed from: c */
    public boolean f38878c;

    /* renamed from: d */
    public boolean f38879d;

    /* renamed from: e */
    public boolean f38880e;

    /* renamed from: f */
    public boolean f38881f;

    /* renamed from: g */
    public boolean f38882g;

    /* renamed from: h */
    public boolean f38883h;

    /* renamed from: i */
    public boolean f38884i;

    /* renamed from: j */
    public int f38885j;
    @C12579k

    /* renamed from: k */
    public final MeasurePassDelegate f38886k = new MeasurePassDelegate();
    @C12580l

    /* renamed from: l */
    public LookaheadPassDelegate f38887l;

    @C11363r0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1237:1\n685#1:1252\n686#1,2:1261\n1161#2,2:1238\n163#3:1240\n163#3:1253\n163#3:1279\n163#3:1291\n460#4,11:1241\n460#4,7:1254\n467#4,4:1263\n460#4,11:1280\n460#4,11:1292\n33#5,6:1267\n33#5,6:1273\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n750#1:1252\n750#1:1261,2\n668#1:1238,2\n685#1:1240\n750#1:1253\n1020#1:1279\n1049#1:1291\n685#1:1241,11\n750#1:1254,7\n750#1:1263,4\n1020#1:1280,11\n1049#1:1292,11\n776#1:1267,6\n802#1:1273,6\n*E\n"})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate */
    public final class LookaheadPassDelegate extends C15611w0 implements C15557e0, C15665a {

        /* renamed from: E0 */
        public boolean f38888E0 = true;

        /* renamed from: F0 */
        public boolean f38889F0 = true;
        @C12580l

        /* renamed from: G0 */
        public Object f38890G0;

        /* renamed from: H0 */
        public final /* synthetic */ LayoutNodeLayoutDelegate f38891H0;

        /* renamed from: X */
        public boolean f38892X;
        @C12579k

        /* renamed from: Y */
        public final AlignmentLines f38893Y = new C15691h0(this);
        @C12579k

        /* renamed from: Z */
        public final C8423g<C15557e0> f38894Z = new C8423g<>(new C15557e0[16], 0);
        @C12579k

        /* renamed from: f */
        public final C15553d0 f38895f;

        /* renamed from: g */
        public boolean f38896g;

        /* renamed from: v */
        public boolean f38897v;

        /* renamed from: w */
        public boolean f38898w;
        @C12580l

        /* renamed from: x */
        public C16476b f38899x;

        /* renamed from: y */
        public long f38900y = C16494m.f40890b.mo47857a();

        /* renamed from: z */
        public boolean f38901z = true;

        /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$a */
        public /* synthetic */ class C15648a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|5|6|7|8|9|10|11|13|14|15|16|17|19) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
            static {
                /*
                    androidx.compose.ui.node.LayoutNode$LayoutState[] r0 = androidx.compose.p004ui.node.LayoutNode.LayoutState.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    r1 = 1
                    androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    r2 = 2
                    androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.p004ui.node.LayoutNode.LayoutState.Measuring     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LayingOut     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r4 = 3
                    r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r4 = 4
                    r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    $EnumSwitchMapping$0 = r0
                    androidx.compose.ui.node.LayoutNode$UsageByParent[] r0 = androidx.compose.p004ui.node.LayoutNode.UsageByParent.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.compose.ui.node.LayoutNode$UsageByParent r3 = androidx.compose.p004ui.node.LayoutNode.UsageByParent.InMeasureBlock     // Catch:{ NoSuchFieldError -> 0x003c }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                    r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
                L_0x003c:
                    androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.p004ui.node.LayoutNode.UsageByParent.InLayoutBlock     // Catch:{ NoSuchFieldError -> 0x0044 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
                L_0x0044:
                    $EnumSwitchMapping$1 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.C15648a.<clinit>():void");
            }
        }

        public LookaheadPassDelegate(@C12579k LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, C15553d0 d0Var) {
            Intrinsics.checkNotNullParameter(d0Var, "lookaheadScope");
            this.f38891H0 = layoutNodeLayoutDelegate;
            this.f38895f = d0Var;
            this.f38890G0 = layoutNodeLayoutDelegate.mo44759x().mo44417c();
        }

        /* renamed from: A */
        public int mo44325A(@C12579k C15531a aVar) {
            LayoutNode.LayoutState layoutState;
            Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
            LayoutNode C0 = this.f38891H0.f38876a.mo44613C0();
            LayoutNode.LayoutState layoutState2 = null;
            if (C0 != null) {
                layoutState = C0.mo44691m0();
            } else {
                layoutState = null;
            }
            if (layoutState == LayoutNode.LayoutState.LookaheadMeasuring) {
                mo44789w().mo44547z(true);
            } else {
                LayoutNode C02 = this.f38891H0.f38876a.mo44613C0();
                if (C02 != null) {
                    layoutState2 = C02.mo44691m0();
                }
                if (layoutState2 == LayoutNode.LayoutState.LookaheadLayingOut) {
                    mo44789w().mo44546y(true);
                }
            }
            this.f38896g = true;
            C15697j0 j4 = this.f38891H0.mo44761z().mo44868j4();
            Intrinsics.checkNotNull(j4);
            int A = j4.mo44325A(aVar);
            this.f38896g = false;
            return A;
        }

        /* renamed from: A0 */
        public void mo44762A0() {
            LayoutNode.m69659y1(this.f38891H0.f38876a, false, 1, (Object) null);
        }

        /* renamed from: I1 */
        public final boolean mo44763I1(long j) {
            boolean z;
            boolean z2;
            boolean z3;
            LayoutNode C0 = this.f38891H0.f38876a.mo44613C0();
            LayoutNode a = this.f38891H0.f38876a;
            if (this.f38891H0.f38876a.mo44661V() || (C0 != null && C0.mo44661V())) {
                z = true;
            } else {
                z = false;
            }
            a.mo44623G1(z);
            if (!this.f38891H0.f38876a.mo44695o0()) {
                C16476b bVar = this.f38899x;
                if (bVar == null) {
                    z3 = false;
                } else {
                    z3 = C16476b.m74353g(bVar.mo47807x(), j);
                }
                if (z3) {
                    return false;
                }
            }
            this.f38899x = C16476b.m74348b(j);
            mo44789w().mo44545x(false);
            mo44790y0(LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1.f38917f);
            this.f38898w = true;
            C15697j0 j4 = this.f38891H0.mo44761z().mo44868j4();
            if (j4 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long a2 = C16502r.m74668a(j4.mo44471K0(), j4.mo44468G0());
                this.f38891H0.mo44741J(j);
                mo44473Q0(C16502r.m74668a(j4.mo44471K0(), j4.mo44468G0()));
                if (C16500q.m74662m(a2) == j4.mo44471K0() && C16500q.m74659j(a2) == j4.mo44468G0()) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
        }

        /* renamed from: L1 */
        public final void mo44764L1() {
            if (this.f38897v) {
                mo44326N0(this.f38900y, 0.0f, (C11300l<? super C15327u2, C11079d2>) null);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* renamed from: N0 */
        public void mo44326N0(long j, float f, @C12580l C11300l<? super C15327u2, C11079d2> lVar) {
            this.f38891H0.f38877b = LayoutNode.LayoutState.LookaheadLayingOut;
            this.f38897v = true;
            if (!C16494m.m74578j(j, this.f38900y)) {
                mo44783m1();
            }
            mo44789w().mo44544w(false);
            C15675c1 b = C15682e0.m70247b(this.f38891H0.f38876a);
            this.f38891H0.mo44745N(false);
            OwnerSnapshotObserver.m70087d(b.getSnapshotObserver(), this.f38891H0.f38876a, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1(this.f38891H0, j), 2, (Object) null);
            this.f38900y = j;
            this.f38891H0.f38877b = LayoutNode.LayoutState.Idle;
        }

        /* renamed from: N1 */
        public final void mo44765N1() {
            C8423g<LayoutNode> I0 = this.f38891H0.f38876a.mo44627I0();
            int h0 = I0.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = I0.mo15462d0();
                int i = 0;
                do {
                    LayoutNode layoutNode = (LayoutNode) d0[i];
                    layoutNode.mo44615D1(layoutNode);
                    LookaheadPassDelegate w = layoutNode.mo44687k0().mo44758w();
                    Intrinsics.checkNotNull(w);
                    w.mo44765N1();
                    i++;
                } while (i < h0);
            }
        }

        /* renamed from: S1 */
        public final void mo44766S1(boolean z) {
            this.f38888E0 = z;
        }

        /* renamed from: Y */
        public void mo44767Y() {
            mo44789w().mo44540s();
            if (this.f38891H0.mo44756u()) {
                mo44785q1();
            }
            C15697j0 j4 = mo44775g0().mo44868j4();
            Intrinsics.checkNotNull(j4);
            if (this.f38891H0.f38883h || (!this.f38896g && !j4.mo45022k1() && this.f38891H0.mo44756u())) {
                this.f38891H0.f38882g = false;
                LayoutNode.LayoutState s = this.f38891H0.mo44754s();
                this.f38891H0.f38877b = LayoutNode.LayoutState.LookaheadLayingOut;
                OwnerSnapshotObserver.m70088f(C15682e0.m70247b(this.f38891H0.f38876a).getSnapshotObserver(), this.f38891H0.f38876a, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(this, this.f38891H0, j4), 2, (Object) null);
                this.f38891H0.f38877b = s;
                if (this.f38891H0.mo44749n() && j4.mo45022k1()) {
                    requestLayout();
                }
                this.f38891H0.f38883h = false;
            }
            if (mo44789w().mo44536o()) {
                mo44789w().mo44543v(true);
            }
            if (mo44789w().mo44528g() && mo44789w().mo44533l()) {
                mo44789w().mo44539r();
            }
        }

        /* renamed from: Z */
        public int mo44416Z() {
            C15697j0 j4 = this.f38891H0.mo44761z().mo44868j4();
            Intrinsics.checkNotNull(j4);
            return j4.mo44416Z();
        }

        /* renamed from: Z0 */
        public final void mo44768Z0(C11300l<? super LookaheadPassDelegate, C11079d2> lVar) {
            C8423g<LayoutNode> I0 = this.f38891H0.f38876a.mo44627I0();
            int h0 = I0.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = I0.mo15462d0();
                int i = 0;
                do {
                    LookaheadPassDelegate w = ((LayoutNode) d0[i]).mo44687k0().mo44758w();
                    Intrinsics.checkNotNull(w);
                    lVar.invoke(w);
                    i++;
                } while (i < h0);
            }
        }

        /* renamed from: a0 */
        public int mo44317a0(int i) {
            mo44786r1();
            C15697j0 j4 = this.f38891H0.mo44761z().mo44868j4();
            Intrinsics.checkNotNull(j4);
            return j4.mo44317a0(i);
        }

        @C12579k
        /* renamed from: b1 */
        public final List<C15557e0> mo44769b1() {
            this.f38891H0.f38876a.mo44667Z();
            if (!this.f38888E0) {
                return this.f38894Z.mo15485s();
            }
            C15685f0.m70257b(this.f38891H0.f38876a, this.f38894Z, C15650xc4ae5339.f38914f);
            this.f38888E0 = false;
            return this.f38894Z.mo15485s();
        }

        @C12580l
        /* renamed from: c */
        public Object mo44417c() {
            return this.f38890G0;
        }

        /* renamed from: c1 */
        public final boolean mo44770c1() {
            return this.f38888E0;
        }

        /* renamed from: c2 */
        public final void mo44771c2(boolean z) {
            this.f38896g = z;
        }

        /* renamed from: d */
        public int mo44320d(int i) {
            mo44786r1();
            C15697j0 j4 = this.f38891H0.mo44761z().mo44868j4();
            Intrinsics.checkNotNull(j4);
            return j4.mo44320d(i);
        }

        /* renamed from: d2 */
        public void mo44772d2(boolean z) {
            this.f38901z = z;
        }

        /* renamed from: e1 */
        public final boolean mo44773e1() {
            return this.f38896g;
        }

        /* renamed from: f */
        public int mo44418f() {
            C15697j0 j4 = this.f38891H0.mo44761z().mo44868j4();
            Intrinsics.checkNotNull(j4);
            return j4.mo44418f();
        }

        @C12580l
        /* renamed from: f1 */
        public final C16476b mo44774f1() {
            return this.f38899x;
        }

        @C12579k
        /* renamed from: g0 */
        public NodeCoordinator mo44775g0() {
            return this.f38891H0.f38876a.mo44674d0();
        }

        /* renamed from: g1 */
        public final void mo44776g1(boolean z) {
            LayoutNode C0;
            LayoutNode C02 = this.f38891H0.f38876a.mo44613C0();
            LayoutNode.UsageByParent j0 = this.f38891H0.f38876a.mo44685j0();
            if (C02 != null && j0 != LayoutNode.UsageByParent.NotUsed) {
                while (C02.mo44685j0() == j0 && (C0 = C02.mo44613C0()) != null) {
                    C02 = C0;
                }
                int i = C15648a.$EnumSwitchMapping$1[j0.ordinal()];
                if (i == 1) {
                    C02.mo44713x1(z);
                } else if (i == 2) {
                    C02.mo44710v1(z);
                } else {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
            }
        }

        @C12579k
        /* renamed from: h */
        public Map<C15531a, Integer> mo44777h() {
            if (!this.f38896g) {
                if (this.f38891H0.mo44754s() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    mo44789w().mo44545x(true);
                    if (mo44789w().mo44528g()) {
                        this.f38891H0.mo44737F();
                    }
                } else {
                    mo44789w().mo44544w(true);
                }
            }
            C15697j0 j4 = mo44775g0().mo44868j4();
            if (j4 != null) {
                j4.mo45024r1(true);
            }
            mo44767Y();
            C15697j0 j42 = mo44775g0().mo44868j4();
            if (j42 != null) {
                j42.mo45024r1(false);
            }
            return mo44789w().mo44529h();
        }

        /* renamed from: h2 */
        public final void mo44778h2(LayoutNode layoutNode) {
            boolean z;
            LayoutNode.UsageByParent usageByParent;
            LayoutNode C0 = layoutNode.mo44613C0();
            if (C0 != null) {
                if (layoutNode.mo44709v0() == LayoutNode.UsageByParent.NotUsed || layoutNode.mo44661V()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i = C15648a.$EnumSwitchMapping$0[C0.mo44691m0().ordinal()];
                    if (i == 1 || i == 2) {
                        usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                    } else if (i == 3 || i == 4) {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    } else {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + C0.mo44691m0());
                    }
                    layoutNode.mo44642O1(usageByParent);
                    return;
                }
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode.mo44709v0() + ". Parent state " + C0.mo44691m0() + '.').toString());
            }
            layoutNode.mo44642O1(LayoutNode.UsageByParent.NotUsed);
        }

        @C12580l
        /* renamed from: i */
        public C15665a mo44779i() {
            LayoutNodeLayoutDelegate k0;
            LayoutNode C0 = this.f38891H0.f38876a.mo44613C0();
            if (C0 == null || (k0 = C0.mo44687k0()) == null) {
                return null;
            }
            return k0.mo44755t();
        }

        /* renamed from: i2 */
        public final boolean mo44780i2() {
            if (!this.f38889F0) {
                return false;
            }
            this.f38889F0 = false;
            Object c = mo44417c();
            C15697j0 j4 = this.f38891H0.mo44761z().mo44868j4();
            Intrinsics.checkNotNull(j4);
            boolean z = !Intrinsics.areEqual(c, j4.mo44417c());
            C15697j0 j42 = this.f38891H0.mo44761z().mo44868j4();
            Intrinsics.checkNotNull(j42);
            this.f38890G0 = j42.mo44417c();
            return z;
        }

        /* renamed from: j1 */
        public final void mo44781j1() {
            this.f38889F0 = true;
        }

        /* renamed from: k1 */
        public final void mo44782k1() {
            int i = 0;
            mo44772d2(false);
            C8423g<LayoutNode> I0 = this.f38891H0.f38876a.mo44627I0();
            int h0 = I0.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = I0.mo15462d0();
                do {
                    LookaheadPassDelegate w = ((LayoutNode) d0[i]).mo44687k0().mo44758w();
                    Intrinsics.checkNotNull(w);
                    w.mo44782k1();
                    i++;
                } while (i < h0);
            }
        }

        /* renamed from: m1 */
        public final void mo44783m1() {
            if (this.f38891H0.mo44748m() > 0) {
                List<LayoutNode> Z = this.f38891H0.f38876a.mo44667Z();
                int size = Z.size();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode = Z.get(i);
                    LayoutNodeLayoutDelegate k0 = layoutNode.mo44687k0();
                    if (k0.mo44749n() && !k0.mo44753r()) {
                        LayoutNode.m69658w1(layoutNode, false, 1, (Object) null);
                    }
                    LookaheadPassDelegate w = k0.mo44758w();
                    if (w != null) {
                        w.mo44783m1();
                    }
                }
            }
        }

        /* renamed from: o0 */
        public int mo44322o0(int i) {
            mo44786r1();
            C15697j0 j4 = this.f38891H0.mo44761z().mo44868j4();
            Intrinsics.checkNotNull(j4);
            return j4.mo44322o0(i);
        }

        /* renamed from: p */
        public boolean mo44784p() {
            return this.f38901z;
        }

        /* renamed from: p0 */
        public int mo44323p0(int i) {
            mo44786r1();
            C15697j0 j4 = this.f38891H0.mo44761z().mo44868j4();
            Intrinsics.checkNotNull(j4);
            return j4.mo44323p0(i);
        }

        /* renamed from: q1 */
        public final void mo44785q1() {
            LayoutNode a = this.f38891H0.f38876a;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f38891H0;
            C8423g<LayoutNode> I0 = a.mo44627I0();
            int h0 = I0.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = I0.mo15462d0();
                int i = 0;
                do {
                    LayoutNode layoutNode = (LayoutNode) d0[i];
                    if (layoutNode.mo44695o0() && layoutNode.mo44709v0() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate w = layoutNode.mo44687k0().mo44758w();
                        Intrinsics.checkNotNull(w);
                        C16476b f1 = mo44774f1();
                        Intrinsics.checkNotNull(f1);
                        if (w.mo44763I1(f1.mo47807x())) {
                            LayoutNode.m69659y1(layoutNodeLayoutDelegate.f38876a, false, 1, (Object) null);
                        }
                    }
                    i++;
                } while (i < h0);
            }
        }

        /* renamed from: r1 */
        public final void mo44786r1() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.m69659y1(this.f38891H0.f38876a, false, 1, (Object) null);
            LayoutNode C0 = this.f38891H0.f38876a.mo44613C0();
            if (C0 != null && this.f38891H0.f38876a.mo44685j0() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNode a = this.f38891H0.f38876a;
                int i = C15648a.$EnumSwitchMapping$0[C0.mo44691m0().ordinal()];
                if (i == 2) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i != 3) {
                    usageByParent = C0.mo44685j0();
                } else {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                }
                a.mo44632K1(usageByParent);
            }
        }

        public void requestLayout() {
            LayoutNode.m69658w1(this.f38891H0.f38876a, false, 1, (Object) null);
        }

        @C12579k
        /* renamed from: t0 */
        public C15611w0 mo44324t0(long j) {
            mo44778h2(this.f38891H0.f38876a);
            if (this.f38891H0.f38876a.mo44685j0() == LayoutNode.UsageByParent.NotUsed) {
                this.f38891H0.f38876a.mo44626I();
            }
            mo44763I1(j);
            return this;
        }

        /* renamed from: u1 */
        public final void mo44788u1() {
            if (!mo44784p()) {
                mo44772d2(true);
                if (!this.f38892X) {
                    mo44765N1();
                }
            }
        }

        @C12579k
        /* renamed from: w */
        public AlignmentLines mo44789w() {
            return this.f38893Y;
        }

        /* renamed from: y0 */
        public void mo44790y0(@C12579k C11300l<? super C15665a, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
            List<LayoutNode> Z = this.f38891H0.f38876a.mo44667Z();
            int size = Z.size();
            for (int i = 0; i < size; i++) {
                C15665a t = Z.get(i).mo44687k0().mo44755t();
                Intrinsics.checkNotNull(t);
                lVar.invoke(t);
            }
        }
    }

    @C11363r0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n1161#2,2:1238\n33#3,6:1240\n33#3,6:1246\n163#4:1252\n460#5,11:1253\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n235#1:1238,2\n548#1:1240,6\n574#1:1246,6\n609#1:1252\n609#1:1253,11\n*E\n"})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate */
    public final class MeasurePassDelegate extends C15611w0 implements C15557e0, C15665a {

        /* renamed from: E0 */
        public boolean f38902E0 = true;
        @C12580l

        /* renamed from: X */
        public Object f38904X;
        @C12579k

        /* renamed from: Y */
        public final AlignmentLines f38905Y = new C15671b0(this);
        @C12579k

        /* renamed from: Z */
        public final C8423g<C15557e0> f38906Z = new C8423g<>(new C15557e0[16], 0);

        /* renamed from: f */
        public boolean f38907f;

        /* renamed from: g */
        public boolean f38908g;

        /* renamed from: v */
        public boolean f38909v;

        /* renamed from: w */
        public long f38910w = C16494m.f40890b.mo47857a();
        @C12580l

        /* renamed from: x */
        public C11300l<? super C15327u2, C11079d2> f38911x;

        /* renamed from: y */
        public float f38912y;

        /* renamed from: z */
        public boolean f38913z = true;

        /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$a */
        public /* synthetic */ class C15649a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
            static {
                /*
                    androidx.compose.ui.node.LayoutNode$LayoutState[] r0 = androidx.compose.p004ui.node.LayoutNode.LayoutState.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    r1 = 1
                    androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.p004ui.node.LayoutNode.LayoutState.Measuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    r2 = 2
                    androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LayingOut     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    $EnumSwitchMapping$0 = r0
                    androidx.compose.ui.node.LayoutNode$UsageByParent[] r0 = androidx.compose.p004ui.node.LayoutNode.UsageByParent.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.compose.ui.node.LayoutNode$UsageByParent r3 = androidx.compose.p004ui.node.LayoutNode.UsageByParent.InMeasureBlock     // Catch:{ NoSuchFieldError -> 0x002a }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                    r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
                L_0x002a:
                    androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.p004ui.node.LayoutNode.UsageByParent.InLayoutBlock     // Catch:{ NoSuchFieldError -> 0x0032 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
                L_0x0032:
                    $EnumSwitchMapping$1 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.C15649a.<clinit>():void");
            }
        }

        public MeasurePassDelegate() {
        }

        /* renamed from: A */
        public int mo44325A(@C12579k C15531a aVar) {
            LayoutNode.LayoutState layoutState;
            Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
            LayoutNode C0 = LayoutNodeLayoutDelegate.this.f38876a.mo44613C0();
            LayoutNode.LayoutState layoutState2 = null;
            if (C0 != null) {
                layoutState = C0.mo44691m0();
            } else {
                layoutState = null;
            }
            if (layoutState == LayoutNode.LayoutState.Measuring) {
                mo44789w().mo44547z(true);
            } else {
                LayoutNode C02 = LayoutNodeLayoutDelegate.this.f38876a.mo44613C0();
                if (C02 != null) {
                    layoutState2 = C02.mo44691m0();
                }
                if (layoutState2 == LayoutNode.LayoutState.LayingOut) {
                    mo44789w().mo44546y(true);
                }
            }
            this.f38909v = true;
            int A = LayoutNodeLayoutDelegate.this.mo44761z().mo44325A(aVar);
            this.f38909v = false;
            return A;
        }

        /* renamed from: A0 */
        public void mo44762A0() {
            LayoutNode.m69647C1(LayoutNodeLayoutDelegate.this.f38876a, false, 1, (Object) null);
        }

        /* renamed from: I1 */
        public final void mo44791I1(LayoutNode layoutNode) {
            boolean z;
            LayoutNode.UsageByParent usageByParent;
            LayoutNode C0 = layoutNode.mo44613C0();
            if (C0 != null) {
                if (layoutNode.mo44707u0() == LayoutNode.UsageByParent.NotUsed || layoutNode.mo44661V()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i = C15649a.$EnumSwitchMapping$0[C0.mo44691m0().ordinal()];
                    if (i == 1) {
                        usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                    } else if (i == 2) {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    } else {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + C0.mo44691m0());
                    }
                    layoutNode.mo44639N1(usageByParent);
                    return;
                }
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode.mo44707u0() + ". Parent state " + C0.mo44691m0() + '.').toString());
            }
            layoutNode.mo44639N1(LayoutNode.UsageByParent.NotUsed);
        }

        /* renamed from: L1 */
        public final boolean mo44792L1() {
            if (!this.f38913z) {
                return false;
            }
            this.f38913z = false;
            boolean z = !Intrinsics.areEqual(mo44417c(), LayoutNodeLayoutDelegate.this.mo44761z().mo44417c());
            this.f38904X = LayoutNodeLayoutDelegate.this.mo44761z().mo44417c();
            return z;
        }

        /* renamed from: N0 */
        public void mo44326N0(long j, float f, @C12580l C11300l<? super C15327u2, C11079d2> lVar) {
            if (!C16494m.m74578j(j, this.f38910w)) {
                mo44799f1();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.mo44734C(layoutNodeLayoutDelegate.f38876a)) {
                C15611w0.C15612a.C15613a aVar = C15611w0.C15612a.f38749a;
                LookaheadPassDelegate w = LayoutNodeLayoutDelegate.this.mo44758w();
                Intrinsics.checkNotNull(w);
                C15611w0.C15612a.m69412p(aVar, w, C16494m.m74581m(j), C16494m.m74583o(j), 0.0f, 4, (Object) null);
            }
            LayoutNodeLayoutDelegate.this.f38877b = LayoutNode.LayoutState.LayingOut;
            mo44802k1(j, f, lVar);
            LayoutNodeLayoutDelegate.this.f38877b = LayoutNode.LayoutState.Idle;
        }

        @C12579k
        /* renamed from: U0 */
        public final List<C15557e0> mo44793U0() {
            LayoutNodeLayoutDelegate.this.f38876a.mo44660U1();
            if (!this.f38902E0) {
                return this.f38906Z.mo15485s();
            }
            C15685f0.m70257b(LayoutNodeLayoutDelegate.this.f38876a, this.f38906Z, LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1.f38918f);
            this.f38902E0 = false;
            return this.f38906Z.mo15485s();
        }

        /* renamed from: W0 */
        public final boolean mo44794W0() {
            return this.f38902E0;
        }

        /* renamed from: Y */
        public void mo44767Y() {
            mo44789w().mo44540s();
            if (LayoutNodeLayoutDelegate.this.mo44753r()) {
                mo44800g1();
            }
            if (LayoutNodeLayoutDelegate.this.f38880e || (!this.f38909v && !mo44775g0().mo45022k1() && LayoutNodeLayoutDelegate.this.mo44753r())) {
                LayoutNodeLayoutDelegate.this.f38879d = false;
                LayoutNode.LayoutState s = LayoutNodeLayoutDelegate.this.mo44754s();
                LayoutNodeLayoutDelegate.this.f38877b = LayoutNode.LayoutState.LayingOut;
                LayoutNode a = LayoutNodeLayoutDelegate.this.f38876a;
                C15682e0.m70247b(a).getSnapshotObserver().mo44916e(a, false, new LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1(LayoutNodeLayoutDelegate.this, this, a));
                LayoutNodeLayoutDelegate.this.f38877b = s;
                if (mo44775g0().mo45022k1() && LayoutNodeLayoutDelegate.this.mo44749n()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.f38880e = false;
            }
            if (mo44789w().mo44536o()) {
                mo44789w().mo44543v(true);
            }
            if (mo44789w().mo44528g() && mo44789w().mo44533l()) {
                mo44789w().mo44539r();
            }
        }

        /* renamed from: Z */
        public int mo44416Z() {
            return LayoutNodeLayoutDelegate.this.mo44761z().mo44416Z();
        }

        /* renamed from: Z0 */
        public final boolean mo44795Z0() {
            return this.f38909v;
        }

        /* renamed from: a0 */
        public int mo44317a0(int i) {
            mo44801j1();
            return LayoutNodeLayoutDelegate.this.mo44761z().mo44317a0(i);
        }

        @C12580l
        /* renamed from: b1 */
        public final C16476b mo44796b1() {
            if (this.f38907f) {
                return C16476b.m74348b(mo44470J0());
            }
            return null;
        }

        @C12580l
        /* renamed from: c */
        public Object mo44417c() {
            return this.f38904X;
        }

        /* renamed from: c1 */
        public final void mo44797c1(boolean z) {
            LayoutNode C0;
            LayoutNode C02 = LayoutNodeLayoutDelegate.this.f38876a.mo44613C0();
            LayoutNode.UsageByParent j0 = LayoutNodeLayoutDelegate.this.f38876a.mo44685j0();
            if (C02 != null && j0 != LayoutNode.UsageByParent.NotUsed) {
                while (C02.mo44685j0() == j0 && (C0 = C02.mo44613C0()) != null) {
                    C02 = C0;
                }
                int i = C15649a.$EnumSwitchMapping$1[j0.ordinal()];
                if (i == 1) {
                    C02.mo44612B1(z);
                } else if (i == 2) {
                    C02.mo44717z1(z);
                } else {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
            }
        }

        /* renamed from: d */
        public int mo44320d(int i) {
            mo44801j1();
            return LayoutNodeLayoutDelegate.this.mo44761z().mo44320d(i);
        }

        /* renamed from: e1 */
        public final void mo44798e1() {
            this.f38913z = true;
        }

        /* renamed from: f */
        public int mo44418f() {
            return LayoutNodeLayoutDelegate.this.mo44761z().mo44418f();
        }

        /* renamed from: f1 */
        public final void mo44799f1() {
            if (LayoutNodeLayoutDelegate.this.mo44748m() > 0) {
                List<LayoutNode> Z = LayoutNodeLayoutDelegate.this.f38876a.mo44667Z();
                int size = Z.size();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode = Z.get(i);
                    LayoutNodeLayoutDelegate k0 = layoutNode.mo44687k0();
                    if (k0.mo44749n() && !k0.mo44753r()) {
                        LayoutNode.m69644A1(layoutNode, false, 1, (Object) null);
                    }
                    k0.mo44759x().mo44799f1();
                }
            }
        }

        @C12579k
        /* renamed from: g0 */
        public NodeCoordinator mo44775g0() {
            return LayoutNodeLayoutDelegate.this.f38876a.mo44674d0();
        }

        /* renamed from: g1 */
        public final void mo44800g1() {
            LayoutNode a = LayoutNodeLayoutDelegate.this.f38876a;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            C8423g<LayoutNode> I0 = a.mo44627I0();
            int h0 = I0.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = I0.mo15462d0();
                int i = 0;
                do {
                    LayoutNode layoutNode = (LayoutNode) d0[i];
                    if (layoutNode.mo44704t0() && layoutNode.mo44707u0() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m69657r1(layoutNode, (C16476b) null, 1, (Object) null)) {
                        LayoutNode.m69647C1(layoutNodeLayoutDelegate.f38876a, false, 1, (Object) null);
                    }
                    i++;
                } while (i < h0);
            }
        }

        @C12579k
        /* renamed from: h */
        public Map<C15531a, Integer> mo44777h() {
            if (!this.f38909v) {
                if (LayoutNodeLayoutDelegate.this.mo44754s() == LayoutNode.LayoutState.Measuring) {
                    mo44789w().mo44545x(true);
                    if (mo44789w().mo44528g()) {
                        LayoutNodeLayoutDelegate.this.mo44736E();
                    }
                } else {
                    mo44789w().mo44544w(true);
                }
            }
            mo44775g0().mo45024r1(true);
            mo44767Y();
            mo44775g0().mo45024r1(false);
            return mo44789w().mo44529h();
        }

        @C12580l
        /* renamed from: i */
        public C15665a mo44779i() {
            LayoutNodeLayoutDelegate k0;
            LayoutNode C0 = LayoutNodeLayoutDelegate.this.f38876a.mo44613C0();
            if (C0 == null || (k0 = C0.mo44687k0()) == null) {
                return null;
            }
            return k0.mo44747l();
        }

        /* renamed from: j1 */
        public final void mo44801j1() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.m69647C1(LayoutNodeLayoutDelegate.this.f38876a, false, 1, (Object) null);
            LayoutNode C0 = LayoutNodeLayoutDelegate.this.f38876a.mo44613C0();
            if (C0 != null && LayoutNodeLayoutDelegate.this.f38876a.mo44685j0() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNode a = LayoutNodeLayoutDelegate.this.f38876a;
                int i = C15649a.$EnumSwitchMapping$0[C0.mo44691m0().ordinal()];
                if (i == 1) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i != 2) {
                    usageByParent = C0.mo44685j0();
                } else {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                }
                a.mo44632K1(usageByParent);
            }
        }

        /* renamed from: k1 */
        public final void mo44802k1(long j, float f, C11300l<? super C15327u2, C11079d2> lVar) {
            this.f38910w = j;
            this.f38912y = f;
            this.f38911x = lVar;
            this.f38908g = true;
            mo44789w().mo44544w(false);
            LayoutNodeLayoutDelegate.this.mo44745N(false);
            C15682e0.m70247b(LayoutNodeLayoutDelegate.this.f38876a).getSnapshotObserver().mo44915c(LayoutNodeLayoutDelegate.this.f38876a, false, new C15655x14fd4410(lVar, LayoutNodeLayoutDelegate.this, j, f));
        }

        /* renamed from: m1 */
        public final boolean mo44803m1(long j) {
            boolean z;
            C15675c1 b = C15682e0.m70247b(LayoutNodeLayoutDelegate.this.f38876a);
            LayoutNode C0 = LayoutNodeLayoutDelegate.this.f38876a.mo44613C0();
            LayoutNode a = LayoutNodeLayoutDelegate.this.f38876a;
            boolean z2 = true;
            if (LayoutNodeLayoutDelegate.this.f38876a.mo44661V() || (C0 != null && C0.mo44661V())) {
                z = true;
            } else {
                z = false;
            }
            a.mo44623G1(z);
            if (LayoutNodeLayoutDelegate.this.f38876a.mo44704t0() || !C16476b.m74353g(mo44470J0(), j)) {
                mo44789w().mo44545x(false);
                mo44790y0(LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$1.f38921f);
                this.f38907f = true;
                long a2 = LayoutNodeLayoutDelegate.this.mo44761z().mo44434a();
                mo44474T0(j);
                LayoutNodeLayoutDelegate.this.mo44742K(j);
                if (C16500q.m74657h(LayoutNodeLayoutDelegate.this.mo44761z().mo44434a(), a2) && LayoutNodeLayoutDelegate.this.mo44761z().mo44471K0() == mo44471K0() && LayoutNodeLayoutDelegate.this.mo44761z().mo44468G0() == mo44468G0()) {
                    z2 = false;
                }
                mo44473Q0(C16502r.m74668a(LayoutNodeLayoutDelegate.this.mo44761z().mo44471K0(), LayoutNodeLayoutDelegate.this.mo44761z().mo44468G0()));
                return z2;
            }
            b.mo44993m(LayoutNodeLayoutDelegate.this.f38876a);
            LayoutNodeLayoutDelegate.this.f38876a.mo44620F1();
            return false;
        }

        /* renamed from: o0 */
        public int mo44322o0(int i) {
            mo44801j1();
            return LayoutNodeLayoutDelegate.this.mo44761z().mo44322o0(i);
        }

        /* renamed from: p */
        public boolean mo44784p() {
            return LayoutNodeLayoutDelegate.this.f38876a.mo44456p();
        }

        /* renamed from: p0 */
        public int mo44323p0(int i) {
            mo44801j1();
            return LayoutNodeLayoutDelegate.this.mo44761z().mo44323p0(i);
        }

        /* renamed from: q1 */
        public final void mo44804q1() {
            if (this.f38908g) {
                mo44802k1(this.f38910w, this.f38912y, this.f38911x);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* renamed from: r1 */
        public final void mo44805r1(boolean z) {
            this.f38902E0 = z;
        }

        public void requestLayout() {
            LayoutNode.m69644A1(LayoutNodeLayoutDelegate.this.f38876a, false, 1, (Object) null);
        }

        @C12579k
        /* renamed from: t0 */
        public C15611w0 mo44324t0(long j) {
            LayoutNode.UsageByParent j0 = LayoutNodeLayoutDelegate.this.f38876a.mo44685j0();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (j0 == usageByParent) {
                LayoutNodeLayoutDelegate.this.f38876a.mo44626I();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.mo44734C(layoutNodeLayoutDelegate.f38876a)) {
                this.f38907f = true;
                mo44474T0(j);
                LayoutNodeLayoutDelegate.this.f38876a.mo44642O1(usageByParent);
                LookaheadPassDelegate w = LayoutNodeLayoutDelegate.this.mo44758w();
                Intrinsics.checkNotNull(w);
                w.mo44324t0(j);
            }
            mo44791I1(LayoutNodeLayoutDelegate.this.f38876a);
            mo44803m1(j);
            return this;
        }

        /* renamed from: u1 */
        public final void mo44806u1(boolean z) {
            this.f38909v = z;
        }

        @C12579k
        /* renamed from: w */
        public AlignmentLines mo44789w() {
            return this.f38905Y;
        }

        /* renamed from: y0 */
        public void mo44790y0(@C12579k C11300l<? super C15665a, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
            List<LayoutNode> Z = LayoutNodeLayoutDelegate.this.f38876a.mo44667Z();
            int size = Z.size();
            for (int i = 0; i < size; i++) {
                lVar.invoke(Z.get(i).mo44687k0().mo44747l());
            }
        }
    }

    public LayoutNodeLayoutDelegate(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f38876a = layoutNode;
    }

    /* renamed from: A */
    public final int mo44732A() {
        return this.f38886k.mo44471K0();
    }

    /* renamed from: B */
    public final void mo44733B() {
        this.f38886k.mo44798e1();
        LookaheadPassDelegate lookaheadPassDelegate = this.f38887l;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.mo44781j1();
        }
    }

    /* renamed from: C */
    public final boolean mo44734C(LayoutNode layoutNode) {
        C15553d0 r0 = layoutNode.mo44701r0();
        return Intrinsics.areEqual((Object) r0 != null ? r0.mo44379a() : null, (Object) layoutNode);
    }

    /* renamed from: D */
    public final void mo44735D() {
        this.f38886k.mo44805r1(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.f38887l;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.mo44766S1(true);
        }
    }

    /* renamed from: E */
    public final void mo44736E() {
        this.f38879d = true;
        this.f38880e = true;
    }

    /* renamed from: F */
    public final void mo44737F() {
        this.f38882g = true;
        this.f38883h = true;
    }

    /* renamed from: G */
    public final void mo44738G() {
        this.f38881f = true;
    }

    /* renamed from: H */
    public final void mo44739H() {
        this.f38878c = true;
    }

    /* renamed from: I */
    public final void mo44740I(@C12580l C15553d0 d0Var) {
        LookaheadPassDelegate lookaheadPassDelegate;
        if (d0Var != null) {
            lookaheadPassDelegate = new LookaheadPassDelegate(this, d0Var);
        } else {
            lookaheadPassDelegate = null;
        }
        this.f38887l = lookaheadPassDelegate;
    }

    /* renamed from: J */
    public final void mo44741J(long j) {
        this.f38877b = LayoutNode.LayoutState.LookaheadMeasuring;
        this.f38881f = false;
        OwnerSnapshotObserver.m70089h(C15682e0.m70247b(this.f38876a).getSnapshotObserver(), this.f38876a, false, new LayoutNodeLayoutDelegate$performLookaheadMeasure$1(this, j), 2, (Object) null);
        mo44737F();
        if (mo44734C(this.f38876a)) {
            mo44736E();
        } else {
            mo44739H();
        }
        this.f38877b = LayoutNode.LayoutState.Idle;
    }

    /* renamed from: K */
    public final void mo44742K(long j) {
        boolean z;
        LayoutNode.LayoutState layoutState = this.f38877b;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (layoutState == layoutState2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
            this.f38877b = layoutState3;
            this.f38878c = false;
            C15682e0.m70247b(this.f38876a).getSnapshotObserver().mo44917g(this.f38876a, false, new LayoutNodeLayoutDelegate$performMeasure$2(this, j));
            if (this.f38877b == layoutState3) {
                mo44736E();
                this.f38877b = layoutState2;
                return;
            }
            return;
        }
        throw new IllegalStateException("layout state is not idle before measure starts".toString());
    }

    /* renamed from: L */
    public final void mo44743L() {
        AlignmentLines w;
        this.f38886k.mo44789w().mo44541t();
        LookaheadPassDelegate lookaheadPassDelegate = this.f38887l;
        if (lookaheadPassDelegate != null && (w = lookaheadPassDelegate.mo44789w()) != null) {
            w.mo44541t();
        }
    }

    /* renamed from: M */
    public final void mo44744M(int i) {
        boolean z;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        int i2 = this.f38885j;
        this.f38885j = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            LayoutNode C0 = this.f38876a.mo44613C0();
            if (C0 != null) {
                layoutNodeLayoutDelegate = C0.mo44687k0();
            } else {
                layoutNodeLayoutDelegate = null;
            }
            if (layoutNodeLayoutDelegate == null) {
                return;
            }
            if (i == 0) {
                layoutNodeLayoutDelegate.mo44744M(layoutNodeLayoutDelegate.f38885j - 1);
            } else {
                layoutNodeLayoutDelegate.mo44744M(layoutNodeLayoutDelegate.f38885j + 1);
            }
        }
    }

    /* renamed from: N */
    public final void mo44745N(boolean z) {
        if (this.f38884i != z) {
            this.f38884i = z;
            if (z) {
                mo44744M(this.f38885j + 1);
            } else {
                mo44744M(this.f38885j - 1);
            }
        }
    }

    /* renamed from: O */
    public final void mo44746O() {
        boolean z;
        LayoutNode C0;
        if (this.f38886k.mo44792L1() && (C0 = this.f38876a.mo44613C0()) != null) {
            LayoutNode.m69647C1(C0, false, 1, (Object) null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.f38887l;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.mo44780i2()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        if (mo44734C(this.f38876a)) {
            LayoutNode C02 = this.f38876a.mo44613C0();
            if (C02 != null) {
                LayoutNode.m69647C1(C02, false, 1, (Object) null);
                return;
            }
            return;
        }
        LayoutNode C03 = this.f38876a.mo44613C0();
        if (C03 != null) {
            LayoutNode.m69659y1(C03, false, 1, (Object) null);
        }
    }

    @C12579k
    /* renamed from: l */
    public final C15665a mo44747l() {
        return this.f38886k;
    }

    /* renamed from: m */
    public final int mo44748m() {
        return this.f38885j;
    }

    /* renamed from: n */
    public final boolean mo44749n() {
        return this.f38884i;
    }

    /* renamed from: o */
    public final int mo44750o() {
        return this.f38886k.mo44468G0();
    }

    @C12580l
    /* renamed from: p */
    public final C16476b mo44751p() {
        return this.f38886k.mo44796b1();
    }

    @C12580l
    /* renamed from: q */
    public final C16476b mo44752q() {
        LookaheadPassDelegate lookaheadPassDelegate = this.f38887l;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.mo44774f1();
        }
        return null;
    }

    /* renamed from: r */
    public final boolean mo44753r() {
        return this.f38879d;
    }

    @C12579k
    /* renamed from: s */
    public final LayoutNode.LayoutState mo44754s() {
        return this.f38877b;
    }

    @C12580l
    /* renamed from: t */
    public final C15665a mo44755t() {
        return this.f38887l;
    }

    /* renamed from: u */
    public final boolean mo44756u() {
        return this.f38882g;
    }

    /* renamed from: v */
    public final boolean mo44757v() {
        return this.f38881f;
    }

    @C12580l
    /* renamed from: w */
    public final LookaheadPassDelegate mo44758w() {
        return this.f38887l;
    }

    @C12579k
    /* renamed from: x */
    public final MeasurePassDelegate mo44759x() {
        return this.f38886k;
    }

    /* renamed from: y */
    public final boolean mo44760y() {
        return this.f38878c;
    }

    @C12579k
    /* renamed from: z */
    public final NodeCoordinator mo44761z() {
        return this.f38876a.mo44712x0().mo45235q();
    }
}
