package androidx.compose.p004ui.node;

import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.collection.C8423g;
import androidx.compose.runtime.internal.C8567o;
import com.google.android.gms.common.internal.C40852x;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,557:1\n390#1,8:565\n399#1,5:584\n390#1,14:589\n390#1,14:614\n1182#2:558\n1161#2,2:559\n1182#2:561\n1161#2,2:562\n100#3:564\n100#3:573\n91#3,10:574\n460#4,11:603\n728#4,2:628\n460#4,11:630\n460#4,11:641\n460#4,11:653\n163#5:652\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n327#1:565,8\n327#1:584,5\n347#1:589,14\n370#1:614,14\n63#1:558\n63#1:559,2\n84#1:561\n84#1:562,2\n48#1:564\n328#1:573\n329#1:574,10\n359#1:603,11\n406#1:628,2\n410#1:630,11\n452#1:641,11\n499#1:653,11\n499#1:652\n*E\n"})
/* renamed from: androidx.compose.ui.node.k0 */
public final class C15700k0 {
    @C12579k

    /* renamed from: a */
    public final LayoutNode f39015a;
    @C12579k

    /* renamed from: b */
    public final DepthSortedSet f39016b;

    /* renamed from: c */
    public boolean f39017c;
    @C12579k

    /* renamed from: d */
    public final C15667a1 f39018d = new C15667a1();
    @C12579k

    /* renamed from: e */
    public final C8423g<C15675c1.C15677b> f39019e = new C8423g<>(new C15675c1.C15677b[16], 0);

    /* renamed from: f */
    public long f39020f = 1;
    @C12579k

    /* renamed from: g */
    public final C8423g<C15701a> f39021g;
    @C12580l

    /* renamed from: h */
    public C16476b f39022h;
    @C12580l

    /* renamed from: i */
    public final C15688g0 f39023i;

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.node.k0$a */
    public static final class C15701a {

        /* renamed from: d */
        public static final int f39024d = 8;
        @C12579k

        /* renamed from: a */
        public final LayoutNode f39025a;

        /* renamed from: b */
        public final boolean f39026b;

        /* renamed from: c */
        public final boolean f39027c;

        public C15701a(@C12579k LayoutNode layoutNode, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "node");
            this.f39025a = layoutNode;
            this.f39026b = z;
            this.f39027c = z2;
        }

        @C12579k
        /* renamed from: a */
        public final LayoutNode mo45071a() {
            return this.f39025a;
        }

        /* renamed from: b */
        public final boolean mo45072b() {
            return this.f39027c;
        }

        /* renamed from: c */
        public final boolean mo45073c() {
            return this.f39026b;
        }
    }

    /* renamed from: androidx.compose.ui.node.k0$b */
    public /* synthetic */ class C15702b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.node.LayoutNode$LayoutState[] r0 = androidx.compose.p004ui.node.LayoutNode.LayoutState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.Measuring     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.Idle     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.C15700k0.C15702b.<clinit>():void");
        }
    }

    public C15700k0(@C12579k LayoutNode layoutNode) {
        C15688g0 g0Var;
        Intrinsics.checkNotNullParameter(layoutNode, C10108c.f27819v);
        this.f39015a = layoutNode;
        C15675c1.C15676a aVar = C15675c1.f38993n;
        DepthSortedSet depthSortedSet = new DepthSortedSet(aVar.mo45001a());
        this.f39016b = depthSortedSet;
        C8423g<C15701a> gVar = new C8423g<>(new C15701a[16], 0);
        this.f39021g = gVar;
        if (aVar.mo45001a()) {
            g0Var = new C15688g0(layoutNode, depthSortedSet, gVar.mo15485s());
        } else {
            g0Var = null;
        }
        this.f39023i = g0Var;
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m70344A(C15700k0 k0Var, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return k0Var.mo45070z(layoutNode, z);
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m70345D(C15700k0 k0Var, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return k0Var.mo45047C(layoutNode, z);
    }

    /* renamed from: F */
    public static /* synthetic */ boolean m70346F(C15700k0 k0Var, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return k0Var.mo45048E(layoutNode, z);
    }

    /* renamed from: e */
    public static /* synthetic */ void m70349e(C15700k0 k0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        k0Var.mo45051d(z);
    }

    /* renamed from: o */
    public static /* synthetic */ boolean m70350o(C15700k0 k0Var, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        return k0Var.mo45060n(aVar);
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m70351y(C15700k0 k0Var, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return k0Var.mo45069x(layoutNode, z);
    }

    /* renamed from: B */
    public final void mo45046B(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f39018d.mo44933c(layoutNode);
    }

    /* renamed from: C */
    public final boolean mo45047C(@C12579k LayoutNode layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = C15702b.$EnumSwitchMapping$0[layoutNode.mo44691m0().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            C15688g0 g0Var = this.f39023i;
            if (g0Var != null) {
                g0Var.mo45010a();
            }
        } else if (i != 5) {
            throw new NoWhenBranchMatchedException();
        } else if (z || (!layoutNode.mo44704t0() && !layoutNode.mo44689l0())) {
            layoutNode.mo44675d1();
            if (layoutNode.mo44456p()) {
                LayoutNode C0 = layoutNode.mo44613C0();
                if (C0 == null || !C0.mo44689l0()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (C0 == null || !C0.mo44704t0()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        this.f39016b.mo44598a(layoutNode);
                    }
                }
            }
            if (!this.f39017c) {
                return true;
            }
        } else {
            C15688g0 g0Var2 = this.f39023i;
            if (g0Var2 != null) {
                g0Var2.mo45010a();
            }
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo45048E(@C12579k LayoutNode layoutNode, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = C15702b.$EnumSwitchMapping$0[layoutNode.mo44691m0().ordinal()];
        if (!(i == 1 || i == 2)) {
            if (i == 3 || i == 4) {
                this.f39021g.mo15463e(new C15701a(layoutNode, false, z));
                C15688g0 g0Var = this.f39023i;
                if (g0Var != null) {
                    g0Var.mo45010a();
                }
            } else if (i != 5) {
                throw new NoWhenBranchMatchedException();
            } else if (!layoutNode.mo44704t0() || z) {
                layoutNode.mo44680g1();
                if (layoutNode.mo44456p() || mo45055i(layoutNode)) {
                    LayoutNode C0 = layoutNode.mo44613C0();
                    if (C0 == null || !C0.mo44704t0()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        this.f39016b.mo44598a(layoutNode);
                    }
                }
                if (!this.f39017c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: G */
    public final void mo45049G(long j) {
        boolean z;
        C16476b bVar = this.f39022h;
        if (bVar == null) {
            z = false;
        } else {
            z = C16476b.m74353g(bVar.mo47807x(), j);
        }
        if (z) {
            return;
        }
        if (!this.f39017c) {
            this.f39022h = C16476b.m74348b(j);
            this.f39015a.mo44680g1();
            this.f39016b.mo44598a(this.f39015a);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public final void mo45050c() {
        C8423g<C15675c1.C15677b> gVar = this.f39019e;
        int h0 = gVar.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = gVar.mo15462d0();
            int i = 0;
            do {
                ((C15675c1.C15677b) d0[i]).mo44572n();
                i++;
            } while (i < h0);
        }
        this.f39019e.mo15490w();
    }

    /* renamed from: d */
    public final void mo45051d(boolean z) {
        if (z) {
            this.f39018d.mo44934d(this.f39015a);
        }
        this.f39018d.mo44931a();
    }

    /* renamed from: f */
    public final boolean mo45052f(LayoutNode layoutNode, C16476b bVar) {
        boolean z;
        if (layoutNode.mo44701r0() == null) {
            return false;
        }
        if (bVar != null) {
            z = layoutNode.mo44670a1(bVar);
        } else {
            z = LayoutNode.m69656b1(layoutNode, (C16476b) null, 1, (Object) null);
        }
        LayoutNode C0 = layoutNode.mo44613C0();
        if (z && C0 != null) {
            if (C0.mo44701r0() == null) {
                m70346F(this, C0, false, 2, (Object) null);
            } else if (layoutNode.mo44709v0() == LayoutNode.UsageByParent.InMeasureBlock) {
                m70344A(this, C0, false, 2, (Object) null);
            } else if (layoutNode.mo44709v0() == LayoutNode.UsageByParent.InLayoutBlock) {
                m70351y(this, C0, false, 2, (Object) null);
            }
        }
        return z;
    }

    /* renamed from: g */
    public final boolean mo45053g(LayoutNode layoutNode, C16476b bVar) {
        boolean z;
        if (bVar != null) {
            z = layoutNode.mo44700q1(bVar);
        } else {
            z = LayoutNode.m69657r1(layoutNode, (C16476b) null, 1, (Object) null);
        }
        LayoutNode C0 = layoutNode.mo44613C0();
        if (z && C0 != null) {
            if (layoutNode.mo44707u0() == LayoutNode.UsageByParent.InMeasureBlock) {
                m70346F(this, C0, false, 2, (Object) null);
            } else if (layoutNode.mo44707u0() == LayoutNode.UsageByParent.InLayoutBlock) {
                m70345D(this, C0, false, 2, (Object) null);
            }
        }
        return z;
    }

    /* renamed from: h */
    public final void mo45054h(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (!this.f39016b.mo44601d()) {
            if (!this.f39017c) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!layoutNode.mo44704t0()) {
                C8423g<LayoutNode> I0 = layoutNode.mo44627I0();
                int h0 = I0.mo15469h0();
                if (h0 > 0) {
                    Object[] d0 = I0.mo15462d0();
                    int i = 0;
                    do {
                        LayoutNode layoutNode2 = (LayoutNode) d0[i];
                        if (layoutNode2.mo44704t0() && this.f39016b.mo44605h(layoutNode2)) {
                            mo45067v(layoutNode2);
                        }
                        if (!layoutNode2.mo44704t0()) {
                            mo45054h(layoutNode2);
                        }
                        i++;
                    } while (i < h0);
                }
                if (layoutNode.mo44704t0() && this.f39016b.mo44605h(layoutNode)) {
                    mo45067v(layoutNode);
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    /* renamed from: i */
    public final boolean mo45055i(LayoutNode layoutNode) {
        return layoutNode.mo44704t0() && mo45058l(layoutNode);
    }

    /* renamed from: j */
    public final boolean mo45056j(LayoutNode layoutNode) {
        boolean z;
        AlignmentLines w;
        if (!layoutNode.mo44693n0()) {
            return false;
        }
        if (layoutNode.mo44709v0() != LayoutNode.UsageByParent.InMeasureBlock) {
            C15665a t = layoutNode.mo44687k0().mo44755t();
            if (t == null || (w = t.mo44789w()) == null || !w.mo44533l()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo45057k() {
        return !this.f39016b.mo44601d();
    }

    /* renamed from: l */
    public final boolean mo45058l(LayoutNode layoutNode) {
        if (layoutNode.mo44707u0() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.mo44687k0().mo44747l().mo44789w().mo44533l()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final long mo45059m() {
        if (this.f39017c) {
            return this.f39020f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: n */
    public final boolean mo45060n(@C12580l C11289a<C11079d2> aVar) {
        boolean z;
        if (!this.f39015a.mo44455k()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f39015a.mo44456p()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f39017c) {
            boolean z2 = false;
            if (this.f39022h != null) {
                this.f39017c = true;
                try {
                    if (!this.f39016b.mo44601d()) {
                        DepthSortedSet depthSortedSet = this.f39016b;
                        z = false;
                        while (!depthSortedSet.mo44601d()) {
                            LayoutNode f = depthSortedSet.mo44603f();
                            boolean b = mo45067v(f);
                            if (f == this.f39015a && b) {
                                z = true;
                            }
                        }
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    } else {
                        z = false;
                    }
                    this.f39017c = false;
                    C15688g0 g0Var = this.f39023i;
                    if (g0Var != null) {
                        g0Var.mo45010a();
                    }
                    z2 = z;
                } catch (Throwable th) {
                    this.f39017c = false;
                    throw th;
                }
            }
            mo45050c();
            return z2;
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: p */
    public final void mo45061p(@C12579k LayoutNode layoutNode, long j) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (!(!Intrinsics.areEqual((Object) layoutNode, (Object) this.f39015a))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f39015a.mo44455k()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f39015a.mo44456p()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f39017c) {
            if (this.f39022h != null) {
                this.f39017c = true;
                try {
                    this.f39016b.mo44605h(layoutNode);
                    boolean f = mo45052f(layoutNode, C16476b.m74348b(j));
                    mo45053g(layoutNode, C16476b.m74348b(j));
                    if ((f || layoutNode.mo44693n0()) && Intrinsics.areEqual((Object) layoutNode.mo44668Z0(), (Object) Boolean.TRUE)) {
                        layoutNode.mo44673c1();
                    }
                    if (layoutNode.mo44689l0() && layoutNode.mo44456p()) {
                        layoutNode.mo44708u1();
                        this.f39018d.mo44933c(layoutNode);
                    }
                    this.f39017c = false;
                    C15688g0 g0Var = this.f39023i;
                    if (g0Var != null) {
                        g0Var.mo45010a();
                    }
                } catch (Throwable th) {
                    this.f39017c = false;
                    throw th;
                }
            }
            mo45050c();
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: q */
    public final void mo45062q() {
        if (!this.f39015a.mo44455k()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f39015a.mo44456p()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!this.f39017c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (this.f39022h != null) {
            this.f39017c = true;
            try {
                mo45065t(this.f39015a);
                this.f39017c = false;
                C15688g0 g0Var = this.f39023i;
                if (g0Var != null) {
                    g0Var.mo45010a();
                }
            } catch (Throwable th) {
                this.f39017c = false;
                throw th;
            }
        }
    }

    /* renamed from: r */
    public final void mo45063r(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        this.f39016b.mo44605h(layoutNode);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: s */
    public final void mo45064s(C11289a<C11079d2> aVar) {
        if (!this.f39015a.mo44455k()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f39015a.mo44456p()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!this.f39017c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (this.f39022h != null) {
            this.f39017c = true;
            try {
                aVar.invoke();
                C11322b0.m43481d(1);
                this.f39017c = false;
                C11322b0.m43480c(1);
                C15688g0 g0Var = this.f39023i;
                if (g0Var != null) {
                    g0Var.mo45010a();
                }
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                this.f39017c = false;
                C11322b0.m43480c(1);
                throw th;
            }
        }
    }

    /* renamed from: t */
    public final void mo45065t(LayoutNode layoutNode) {
        mo45068w(layoutNode);
        C8423g<LayoutNode> I0 = layoutNode.mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) d0[i];
                if (mo45058l(layoutNode2)) {
                    mo45065t(layoutNode2);
                }
                i++;
            } while (i < h0);
        }
        mo45068w(layoutNode);
    }

    /* renamed from: u */
    public final void mo45066u(@C12579k C15675c1.C15677b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40852x.C40853a.f103958a);
        this.f39019e.mo15463e(bVar);
    }

    /* renamed from: v */
    public final boolean mo45067v(LayoutNode layoutNode) {
        boolean z;
        boolean z2;
        C16476b bVar;
        int i = 0;
        if (!layoutNode.mo44456p() && !mo45055i(layoutNode) && !Intrinsics.areEqual((Object) layoutNode.mo44668Z0(), (Object) Boolean.TRUE) && !mo45056j(layoutNode) && !layoutNode.mo44658U()) {
            return false;
        }
        if (layoutNode.mo44695o0() || layoutNode.mo44704t0()) {
            if (layoutNode == this.f39015a) {
                bVar = this.f39022h;
                Intrinsics.checkNotNull(bVar);
            } else {
                bVar = null;
            }
            if (layoutNode.mo44695o0()) {
                z = mo45052f(layoutNode, bVar);
            } else {
                z = false;
            }
            z2 = mo45053g(layoutNode, bVar);
        } else {
            z2 = false;
            z = false;
        }
        if ((z || layoutNode.mo44693n0()) && Intrinsics.areEqual((Object) layoutNode.mo44668Z0(), (Object) Boolean.TRUE)) {
            layoutNode.mo44673c1();
        }
        if (layoutNode.mo44689l0() && layoutNode.mo44456p()) {
            if (layoutNode == this.f39015a) {
                layoutNode.mo44696o1(0, 0);
            } else {
                layoutNode.mo44708u1();
            }
            this.f39018d.mo44933c(layoutNode);
            C15688g0 g0Var = this.f39023i;
            if (g0Var != null) {
                g0Var.mo45010a();
            }
        }
        if (this.f39021g.mo15477m0()) {
            C8423g<C15701a> gVar = this.f39021g;
            int h0 = gVar.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = gVar.mo15462d0();
                do {
                    C15701a aVar = (C15701a) d0[i];
                    if (aVar.mo45071a().mo44455k()) {
                        if (!aVar.mo45073c()) {
                            mo45048E(aVar.mo45071a(), aVar.mo45072b());
                        } else {
                            mo45070z(aVar.mo45071a(), aVar.mo45072b());
                        }
                    }
                    i++;
                } while (i < h0);
            }
            this.f39021g.mo15490w();
        }
        return z2;
    }

    /* renamed from: w */
    public final void mo45068w(LayoutNode layoutNode) {
        C16476b bVar;
        if (layoutNode.mo44704t0() || layoutNode.mo44695o0()) {
            if (layoutNode == this.f39015a) {
                bVar = this.f39022h;
                Intrinsics.checkNotNull(bVar);
            } else {
                bVar = null;
            }
            if (layoutNode.mo44695o0()) {
                mo45052f(layoutNode, bVar);
            }
            mo45053g(layoutNode, bVar);
        }
    }

    /* renamed from: x */
    public final boolean mo45069x(@C12579k LayoutNode layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = C15702b.$EnumSwitchMapping$0[layoutNode.mo44691m0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (!(i == 4 || i == 5)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.mo44695o0() || layoutNode.mo44693n0()) && !z) {
                C15688g0 g0Var = this.f39023i;
                if (g0Var != null) {
                    g0Var.mo45010a();
                }
                return false;
            }
            layoutNode.mo44676e1();
            layoutNode.mo44675d1();
            if (Intrinsics.areEqual((Object) layoutNode.mo44668Z0(), (Object) Boolean.TRUE)) {
                LayoutNode C0 = layoutNode.mo44613C0();
                if (C0 == null || !C0.mo44695o0()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (C0 == null || !C0.mo44693n0()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        this.f39016b.mo44598a(layoutNode);
                    }
                }
            }
            if (!this.f39017c) {
                return true;
            }
            return false;
        }
        C15688g0 g0Var2 = this.f39023i;
        if (g0Var2 != null) {
            g0Var2.mo45010a();
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo45070z(@C12579k LayoutNode layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (layoutNode.mo44701r0() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i = C15702b.$EnumSwitchMapping$0[layoutNode.mo44691m0().ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    this.f39021g.mo15463e(new C15701a(layoutNode, true, z));
                    C15688g0 g0Var = this.f39023i;
                    if (g0Var != null) {
                        g0Var.mo45010a();
                    }
                } else if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                } else if (!layoutNode.mo44695o0() || z) {
                    layoutNode.mo44678f1();
                    layoutNode.mo44680g1();
                    if (Intrinsics.areEqual((Object) layoutNode.mo44668Z0(), (Object) Boolean.TRUE) || mo45056j(layoutNode)) {
                        LayoutNode C0 = layoutNode.mo44613C0();
                        if (C0 == null || !C0.mo44695o0()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            this.f39016b.mo44598a(layoutNode);
                        }
                    }
                    if (!this.f39017c) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }
}
