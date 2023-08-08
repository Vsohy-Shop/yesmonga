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
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.runtime.collection.C8423g;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,223:1\n306#2,2:224\n308#2,2:238\n163#3:226\n460#4,11:227\n460#4,11:240\n222#4,11:253\n178#5,2:251\n180#5,2:264\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n96#1:224,2\n96#1:238,2\n98#1:226\n98#1:227,11\n149#1:240,11\n185#1:253,11\n182#1:251,2\n182#1:264,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.o */
public final class C15716o extends NodeCoordinator {
    @C12579k

    /* renamed from: a1 */
    public static final C15717a f39040a1 = new C15717a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b1 */
    public static final C15211f3 f39041b1;
    @C12579k

    /* renamed from: Z0 */
    public final C8767m.C8772d f39042Z0 = new C15719c();

    /* renamed from: androidx.compose.ui.node.o$a */
    public static final class C15717a {
        public /* synthetic */ C15717a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C15211f3 mo45163a() {
            return C15716o.f39041b1;
        }

        public C15717a() {
        }
    }

    @C11363r0({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,223:1\n173#2,2:224\n175#2:238\n163#3:226\n460#4,11:227\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n53#1:224,2\n53#1:238\n55#1:226\n55#1:227,11\n*E\n"})
    /* renamed from: androidx.compose.ui.node.o$b */
    public final class C15718b extends C15697j0 {

        /* renamed from: Z */
        public final /* synthetic */ C15716o f39043Z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15718b(@C12579k C15716o oVar, C15553d0 d0Var) {
            super(oVar, d0Var);
            Intrinsics.checkNotNullParameter(d0Var, "scope");
            this.f39043Z = oVar;
        }

        /* renamed from: U0 */
        public int mo45020U0(@C12579k C15531a aVar) {
            int i;
            Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
            Integer num = mo44852W0().mo44777h().get(aVar);
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MIN_VALUE;
            }
            mo45032S1().put(aVar, Integer.valueOf(i));
            return i;
        }

        /* renamed from: a0 */
        public int mo44317a0(int i) {
            return mo44836H5().mo44683i0().mo45205j(i);
        }

        /* renamed from: d */
        public int mo44320d(int i) {
            return mo44836H5().mo44683i0().mo45200e(i);
        }

        /* renamed from: o0 */
        public int mo44322o0(int i) {
            return mo44836H5().mo44683i0().mo45206k(i);
        }

        /* renamed from: p0 */
        public int mo44323p0(int i) {
            return mo44836H5().mo44683i0().mo45201f(i);
        }

        @C12579k
        /* renamed from: t0 */
        public C15611w0 mo44324t0(long j) {
            mo44474T0(j);
            C8423g<LayoutNode> I0 = mo44836H5().mo44627I0();
            int h0 = I0.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = I0.mo15462d0();
                int i = 0;
                do {
                    ((LayoutNode) d0[i]).mo44642O1(LayoutNode.UsageByParent.NotUsed);
                    i++;
                } while (i < h0);
            }
            mo45031Q2(mo44836H5().mo44584x().mo6397a(this, mo44836H5().mo44663X(), j));
            return this;
        }

        /* renamed from: v2 */
        public void mo45037v2() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate w = mo44836H5().mo44687k0().mo44758w();
            Intrinsics.checkNotNull(w);
            w.mo44788u1();
            mo44852W0().mo44767Y();
        }
    }

    /* renamed from: androidx.compose.ui.node.o$c */
    public static final class C15719c extends C8767m.C8772d {
        @C12579k
        public String toString() {
            return "<tail>";
        }
    }

    static {
        C15211f3 a = C15271n0.m66286a();
        a.mo42759l(C15240j2.f37547b.mo42849q());
        a.mo42772y(1.0f);
        a.mo42771x(C15223h3.f37530b.mo42780b());
        f39041b1 = a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15716o(@C12579k LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        mo44883s4().mo17251i0(this);
    }

    /* renamed from: L6 */
    public static /* synthetic */ void m70444L6() {
    }

    /* renamed from: N0 */
    public void mo44326N0(long j, float f, @C12580l C11300l<? super C15327u2, C11079d2> lVar) {
        super.mo44326N0(j, f, lVar);
        if (!mo45023m1()) {
            mo44825C5();
            mo44836H5().mo44692m1();
        }
    }

    /* renamed from: O5 */
    public void mo44845O5(@C12579k C15118b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        C15675c1 b = C15682e0.m70247b(mo44836H5());
        C8423g<LayoutNode> G0 = mo44836H5().mo44622G0();
        int h0 = G0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = G0.mo15462d0();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) d0[i];
                if (layoutNode.mo44456p()) {
                    layoutNode.mo44643P(b2Var);
                }
                i++;
            } while (i < h0);
        }
        if (b.getShowLayoutBounds()) {
            mo44876p3(b2Var, f39041b1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[EDGE_INSN: B:35:0x00a0->B:34:0x00a0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: T4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends androidx.compose.p004ui.node.C15678d> void mo44848T4(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.node.NodeCoordinator.C15661d<T> r20, long r21, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.node.C15707m<T> r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r0 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            java.lang.String r1 = "hitTestSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "hitTestResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            androidx.compose.ui.node.LayoutNode r1 = r19.mo44836H5()
            boolean r1 = r8.mo44899d(r1)
            r12 = 1
            r13 = 0
            if (r1 == 0) goto L_0x0046
            boolean r1 = r0.mo44839J6(r9)
            if (r1 == 0) goto L_0x0028
            r14 = r25
            r1 = r12
            goto L_0x0049
        L_0x0028:
            if (r24 == 0) goto L_0x0046
            long r1 = r19.mo44871l4()
            float r1 = r0.mo44869k3(r9, r1)
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L_0x0040
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0040
            r1 = r12
            goto L_0x0041
        L_0x0040:
            r1 = r13
        L_0x0041:
            if (r1 == 0) goto L_0x0046
            r1 = r12
            r14 = r13
            goto L_0x0049
        L_0x0046:
            r14 = r25
            r1 = r13
        L_0x0049:
            if (r1 == 0) goto L_0x00a3
            int r15 = r23.f39030c
            androidx.compose.ui.node.LayoutNode r1 = r19.mo44836H5()
            androidx.compose.runtime.collection.g r1 = r1.mo44622G0()
            int r2 = r1.mo15469h0()
            if (r2 <= 0) goto L_0x00a0
            int r2 = r2 - r12
            java.lang.Object[] r16 = r1.mo15462d0()
            r17 = r2
        L_0x0064:
            r1 = r16[r17]
            r18 = r1
            androidx.compose.ui.node.LayoutNode r18 = (androidx.compose.p004ui.node.LayoutNode) r18
            boolean r1 = r18.mo44456p()
            if (r1 == 0) goto L_0x0099
            r1 = r20
            r2 = r18
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r14
            r1.mo44897b(r2, r3, r5, r6, r7)
            boolean r1 = r23.mo45079H()
            if (r1 != 0) goto L_0x0086
        L_0x0084:
            r1 = r12
            goto L_0x0095
        L_0x0086:
            androidx.compose.ui.node.NodeCoordinator r1 = r18.mo44610A0()
            boolean r1 = r1.mo44886u6()
            if (r1 == 0) goto L_0x0094
            r23.mo45091e()
            goto L_0x0084
        L_0x0094:
            r1 = r13
        L_0x0095:
            if (r1 != 0) goto L_0x0099
            r1 = r12
            goto L_0x009a
        L_0x0099:
            r1 = r13
        L_0x009a:
            if (r1 != 0) goto L_0x00a0
            int r17 = r17 + -1
            if (r17 >= 0) goto L_0x0064
        L_0x00a0:
            r11.f39030c = r15
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.C15716o.mo44848T4(androidx.compose.ui.node.NodeCoordinator$d, long, androidx.compose.ui.node.m, boolean, boolean):void");
    }

    /* renamed from: U0 */
    public int mo45020U0(@C12579k C15531a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
        C15697j0 j4 = mo44868j4();
        if (j4 != null) {
            return j4.mo45020U0(aVar);
        }
        Integer num = mo44852W0().mo44777h().get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: a0 */
    public int mo44317a0(int i) {
        return mo44836H5().mo44683i0().mo45203h(i);
    }

    /* renamed from: d */
    public int mo44320d(int i) {
        return mo44836H5().mo44683i0().mo45198c(i);
    }

    @C12579k
    /* renamed from: f3 */
    public C15697j0 mo44864f3(@C12579k C15553d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "scope");
        return new C15718b(this, d0Var);
    }

    /* renamed from: o0 */
    public int mo44322o0(int i) {
        return mo44836H5().mo44683i0().mo45204i(i);
    }

    /* renamed from: p0 */
    public int mo44323p0(int i) {
        return mo44836H5().mo44683i0().mo45199d(i);
    }

    @C12579k
    /* renamed from: s4 */
    public C8767m.C8772d mo44883s4() {
        return this.f39042Z0;
    }

    @C12579k
    /* renamed from: t0 */
    public C15611w0 mo44324t0(long j) {
        mo44474T0(j);
        C8423g<LayoutNode> I0 = mo44836H5().mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                ((LayoutNode) d0[i]).mo44639N1(LayoutNode.UsageByParent.NotUsed);
                i++;
            } while (i < h0);
        }
        mo44877p6(mo44836H5().mo44584x().mo6397a(this, mo44836H5().mo44665Y(), j));
        mo44821A5();
        return this;
    }
}
