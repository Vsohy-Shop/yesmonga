package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15577j0;
import androidx.compose.runtime.collection.C8423g;
import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.actions.PromptPermissionAction;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,751:1\n633#1,6:763\n641#1,3:770\n644#1,3:776\n664#1,6:779\n610#1,8:785\n633#1,3:793\n618#1,2:796\n611#1,12:798\n636#1,3:810\n623#1:813\n613#1:814\n616#1,2:815\n633#1,3:817\n618#1,5:820\n636#1,3:825\n623#1:828\n633#1,6:829\n655#1,15:835\n664#1,6:850\n649#1,21:856\n610#1,8:877\n633#1,3:885\n618#1,2:888\n611#1,12:890\n636#1,3:902\n623#1:905\n613#1:906\n641#1,6:907\n1162#2:752\n1182#2:753\n1161#2,2:754\n1162#2:769\n523#3:756\n523#3:757\n523#3:758\n523#3:759\n523#3:773\n728#3,2:774\n1#4:760\n69#5:761\n196#6:762\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n268#1:763,6\n295#1:770,3\n295#1:776,3\n306#1:779,6\n603#1:785,8\n603#1:793,3\n603#1:796,2\n603#1:798,12\n603#1:810,3\n603#1:813\n603#1:814\n610#1:815,2\n610#1:817,3\n610#1:820,5\n610#1:825,3\n610#1:828\n617#1:829,6\n649#1:835,15\n656#1:850,6\n672#1:856,21\n679#1:877,8\n679#1:885,3\n679#1:888,2\n679#1:890,12\n679#1:902,3\n679#1:905\n679#1:906\n695#1:907,6\n100#1:752\n101#1:753\n101#1:754,2\n293#1:769\n112#1:756\n113#1:757\n175#1:758\n190#1:759\n297#1:773\n297#1:774,2\n243#1:761\n243#1:762\n*E\n"})
/* renamed from: androidx.compose.ui.node.t0 */
public final class C15733t0 {
    @C12579k

    /* renamed from: a */
    public final LayoutNode f39061a;
    @C12579k

    /* renamed from: b */
    public final C15716o f39062b;
    @C12579k

    /* renamed from: c */
    public NodeCoordinator f39063c;
    @C12579k

    /* renamed from: d */
    public final C8767m.C8772d f39064d;
    @C12579k

    /* renamed from: e */
    public C8767m.C8772d f39065e;
    @C12580l

    /* renamed from: f */
    public C8423g<C8767m.C8770c> f39066f;
    @C12580l

    /* renamed from: g */
    public C8423g<C8767m.C8770c> f39067g;
    @C12580l

    /* renamed from: h */
    public C15734a f39068h;
    @C12580l

    /* renamed from: i */
    public C15735b f39069i;

    @C11363r0({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,751:1\n523#2:752\n523#2:753\n523#2:754\n523#2:755\n523#2:756\n523#2:757\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n348#1:752\n353#1:753\n356#1:754\n363#1:755\n369#1:756\n370#1:757\n*E\n"})
    /* renamed from: androidx.compose.ui.node.t0$a */
    public final class C15734a implements C15687g {
        @C12579k

        /* renamed from: a */
        public C8767m.C8772d f39070a;

        /* renamed from: b */
        public int f39071b;
        @C12579k

        /* renamed from: c */
        public C8423g<C8767m.C8770c> f39072c;
        @C12579k

        /* renamed from: d */
        public C8423g<C8767m.C8770c> f39073d;

        /* renamed from: e */
        public final /* synthetic */ C15733t0 f39074e;

        public C15734a(@C12579k C15733t0 t0Var, C8767m.C8772d dVar, @C12579k int i, @C12579k C8423g<C8767m.C8770c> gVar, C8423g<C8767m.C8770c> gVar2) {
            Intrinsics.checkNotNullParameter(dVar, "node");
            Intrinsics.checkNotNullParameter(gVar, PromptPermissionAction.f87451p);
            Intrinsics.checkNotNullParameter(gVar2, PromptPermissionAction.f87452q);
            this.f39074e = t0Var;
            this.f39070a = dVar;
            this.f39071b = i;
            this.f39072c = gVar;
            this.f39073d = gVar2;
        }

        /* renamed from: a */
        public boolean mo45006a(int i, int i2) {
            if (NodeChainKt.m69939d((C8767m.C8770c) this.f39072c.mo15462d0()[i], (C8767m.C8770c) this.f39073d.mo15462d0()[i2]) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public void mo45007b(int i, int i2) {
            C8767m.C8772d M = this.f39070a.mo17234M();
            Intrinsics.checkNotNull(M);
            this.f39070a = M;
            C8767m.C8770c cVar = (C8767m.C8770c) this.f39072c.mo15462d0()[i];
            C8767m.C8770c cVar2 = (C8767m.C8770c) this.f39073d.mo15462d0()[i2];
            if (!Intrinsics.areEqual((Object) cVar, (Object) cVar2)) {
                C8767m.C8772d dVar = this.f39070a;
                this.f39070a = this.f39074e.mo45222N(cVar, cVar2, dVar);
                C15735b d = this.f39074e.f39069i;
                if (d != null) {
                    d.mo45255b(i, i2, cVar, cVar2, dVar, this.f39070a);
                }
            } else {
                C15735b d2 = this.f39074e.f39069i;
                if (d2 != null) {
                    d2.mo45258e(i, i2, cVar, cVar2, this.f39070a);
                }
            }
            int I = this.f39071b | this.f39070a.mo17232I();
            this.f39071b = I;
            this.f39070a.mo17242X(I);
        }

        /* renamed from: c */
        public void mo45008c(int i, int i2) {
            C8767m.C8772d dVar = this.f39070a;
            C8767m.C8772d a = this.f39074e.mo45225g((C8767m.C8770c) this.f39073d.mo15462d0()[i2], dVar);
            this.f39070a = a;
            if (!a.mo17236Q()) {
                this.f39070a.mo17245b0(true);
                C15735b d = this.f39074e.f39069i;
                if (d != null) {
                    d.mo45254a(i, i2, (C8767m.C8770c) this.f39073d.mo15462d0()[i2], dVar, this.f39070a);
                }
                int I = this.f39071b | this.f39070a.mo17232I();
                this.f39071b = I;
                this.f39070a.mo17242X(I);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @C12579k
        /* renamed from: d */
        public final C8423g<C8767m.C8770c> mo45246d() {
            return this.f39073d;
        }

        /* renamed from: e */
        public final int mo45247e() {
            return this.f39071b;
        }

        @C12579k
        /* renamed from: f */
        public final C8423g<C8767m.C8770c> mo45248f() {
            return this.f39072c;
        }

        @C12579k
        /* renamed from: g */
        public final C8767m.C8772d mo45249g() {
            return this.f39070a;
        }

        /* renamed from: h */
        public final void mo45250h(@C12579k C8423g<C8767m.C8770c> gVar) {
            Intrinsics.checkNotNullParameter(gVar, "<set-?>");
            this.f39073d = gVar;
        }

        /* renamed from: i */
        public final void mo45251i(int i) {
            this.f39071b = i;
        }

        /* renamed from: j */
        public final void mo45252j(@C12579k C8423g<C8767m.C8770c> gVar) {
            Intrinsics.checkNotNullParameter(gVar, "<set-?>");
            this.f39072c = gVar;
        }

        /* renamed from: k */
        public final void mo45253k(@C12579k C8767m.C8772d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            this.f39070a = dVar;
        }

        public void remove(int i) {
            C8767m.C8772d M = this.f39070a.mo17234M();
            Intrinsics.checkNotNull(M);
            this.f39070a = M;
            C15735b d = this.f39074e.f39069i;
            if (d != null) {
                d.mo45257d(i, (C8767m.C8770c) this.f39072c.mo15462d0()[i], this.f39070a);
            }
            this.f39070a = this.f39074e.mo45227i(this.f39070a);
        }
    }

    /* renamed from: androidx.compose.ui.node.t0$b */
    public interface C15735b {
        /* renamed from: a */
        void mo45254a(int i, int i2, @C12579k C8767m.C8770c cVar, @C12579k C8767m.C8772d dVar, @C12579k C8767m.C8772d dVar2);

        /* renamed from: b */
        void mo45255b(int i, int i2, @C12579k C8767m.C8770c cVar, @C12579k C8767m.C8770c cVar2, @C12579k C8767m.C8772d dVar, @C12579k C8767m.C8772d dVar2);

        /* renamed from: c */
        void mo45256c(int i, @C12579k C8767m.C8770c cVar, @C12579k C8767m.C8770c cVar2, @C12579k C8767m.C8772d dVar);

        /* renamed from: d */
        void mo45257d(int i, @C12579k C8767m.C8770c cVar, @C12579k C8767m.C8772d dVar);

        /* renamed from: e */
        void mo45258e(int i, int i2, @C12579k C8767m.C8770c cVar, @C12579k C8767m.C8770c cVar2, @C12579k C8767m.C8772d dVar);
    }

    public C15733t0(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f39061a = layoutNode;
        C15716o oVar = new C15716o(layoutNode);
        this.f39062b = oVar;
        this.f39063c = oVar;
        C8767m.C8772d s4 = oVar.mo44883s4();
        this.f39064d = s4;
        this.f39065e = s4;
    }

    /* renamed from: A */
    public final boolean mo45209A() {
        return this.f39065e == NodeChainKt.f38926a;
    }

    /* renamed from: B */
    public final void mo45210B() {
        boolean z;
        if (this.f39065e != NodeChainKt.f38926a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8767m.C8772d dVar = this.f39065e;
            dVar.mo17248f0(NodeChainKt.f38926a);
            NodeChainKt.f38926a.mo17244a0(dVar);
            this.f39065e = NodeChainKt.f38926a;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: C */
    public final C8767m.C8772d mo45211C(C8767m.C8772d dVar) {
        C8767m.C8772d F = dVar.mo17229F();
        C8767m.C8772d M = dVar.mo17234M();
        if (F != null) {
            F.mo17248f0(M);
            dVar.mo17244a0((C8767m.C8772d) null);
        }
        if (M != null) {
            M.mo17244a0(F);
            dVar.mo17248f0((C8767m.C8772d) null);
        }
        Intrinsics.checkNotNull(F);
        return F;
    }

    /* renamed from: D */
    public final C8767m.C8772d mo45212D(C8767m.C8772d dVar, C8767m.C8772d dVar2) {
        C8767m.C8772d M = dVar.mo17234M();
        if (M != null) {
            dVar2.mo17248f0(M);
            M.mo17244a0(dVar2);
            dVar.mo17248f0((C8767m.C8772d) null);
        }
        C8767m.C8772d F = dVar.mo17229F();
        if (F != null) {
            dVar2.mo17244a0(F);
            F.mo17248f0(dVar2);
            dVar.mo17244a0((C8767m.C8772d) null);
        }
        dVar2.mo17251i0(dVar.mo17230G());
        return dVar2;
    }

    /* renamed from: E */
    public final void mo45213E() {
        C8423g<C8767m.C8770c> gVar = this.f39066f;
        if (gVar != null) {
            int h0 = gVar.mo15469h0();
            C8767m.C8772d M = this.f39064d.mo17234M();
            int i = h0 - 1;
            while (M != null && i >= 0) {
                if (M.mo17236Q()) {
                    M.mo17241V();
                    M.mo17227D();
                }
                M = M.mo17234M();
                i--;
            }
        }
    }

    /* renamed from: F */
    public final void mo45214F(C8423g<C8767m.C8770c> gVar, int i, C8423g<C8767m.C8770c> gVar2, int i2, C8767m.C8772d dVar) {
        C15728r0.m70508e(i, i2, mo45230l(dVar, gVar, gVar2));
    }

    /* renamed from: G */
    public final void mo45215G() {
        NodeCoordinator nodeCoordinator;
        boolean z;
        C15742x xVar;
        NodeCoordinator nodeCoordinator2 = this.f39062b;
        for (C8767m.C8772d M = this.f39064d.mo17234M(); M != null; M = M.mo17234M()) {
            if ((C15739v0.m70597b(2) & M.mo17232I()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !(M instanceof C15740w)) {
                M.mo17251i0(nodeCoordinator2);
            } else {
                if (M.mo17230G() != null) {
                    NodeCoordinator G = M.mo17230G();
                    Intrinsics.checkNotNull(G, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    C15742x xVar2 = (C15742x) G;
                    C15740w L6 = xVar2.mo45267L6();
                    xVar2.mo45269N6((C15740w) M);
                    xVar = xVar2;
                    if (L6 != M) {
                        xVar2.mo44875o5();
                        xVar = xVar2;
                    }
                } else {
                    C15742x xVar3 = new C15742x(this.f39061a, (C15740w) M);
                    M.mo17251i0(xVar3);
                    xVar = xVar3;
                }
                nodeCoordinator2.mo44884s6(xVar);
                xVar.mo44882r6(nodeCoordinator2);
                nodeCoordinator2 = xVar;
            }
        }
        LayoutNode C0 = this.f39061a.mo44613C0();
        if (C0 != null) {
            nodeCoordinator = C0.mo44674d0();
        } else {
            nodeCoordinator = null;
        }
        nodeCoordinator2.mo44884s6(nodeCoordinator);
        this.f39063c = nodeCoordinator2;
    }

    /* renamed from: H */
    public final /* synthetic */ <T> T mo45216H(int i) {
        if ((mo45229k() & i) == 0) {
            return null;
        }
        for (T r = mo45236r(); r != null; r = r.mo17234M()) {
            if ((r.mo17232I() & i) != 0) {
                Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                return r;
            }
        }
        return null;
    }

    /* renamed from: I */
    public final void mo45217I(int i, @C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if ((mo45229k() & i) != 0) {
            for (C8767m.C8772d r = mo45236r(); r != null; r = r.mo17234M()) {
                if ((r.mo17232I() & i) != 0) {
                    lVar.invoke(r);
                }
            }
        }
    }

    /* renamed from: J */
    public final void mo45218J(@C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        for (C8767m.C8772d r = mo45236r(); r != null; r = r.mo17234M()) {
            lVar.invoke(r);
        }
    }

    /* renamed from: K */
    public final /* synthetic */ <T> void mo45219K(int i, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if ((mo45229k() & i) != 0) {
            for (C8767m.C8772d r = mo45236r(); r != null; r = r.mo17234M()) {
                if ((r.mo17232I() & i) != 0) {
                    Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                    lVar.invoke(r);
                }
            }
        }
    }

    /* renamed from: L */
    public final void mo45220L() {
        boolean z;
        boolean z2 = true;
        if (this.f39065e == NodeChainKt.f38926a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8767m.C8772d F = NodeChainKt.f38926a.mo17229F();
            if (F == null) {
                F = this.f39064d;
            }
            this.f39065e = F;
            F.mo17248f0((C8767m.C8772d) null);
            NodeChainKt.f38926a.mo17244a0((C8767m.C8772d) null);
            if (this.f39065e == NodeChainKt.f38926a) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45221M(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r19) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            java.lang.String r1 = "m"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r18.mo45210B()
            androidx.compose.runtime.collection.g<androidx.compose.ui.m$c> r1 = r6.f39066f
            r2 = 0
            if (r1 != 0) goto L_0x0018
            androidx.compose.runtime.collection.g r1 = new androidx.compose.runtime.collection.g
            androidx.compose.ui.m$c[] r3 = new androidx.compose.p004ui.C8767m.C8770c[r2]
            r1.<init>(r3, r2)
        L_0x0018:
            r7 = r1
            androidx.compose.runtime.collection.g<androidx.compose.ui.m$c> r1 = r6.f39067g
            if (r1 != 0) goto L_0x0026
            androidx.compose.runtime.collection.g r1 = new androidx.compose.runtime.collection.g
            r3 = 16
            androidx.compose.ui.m$c[] r3 = new androidx.compose.p004ui.C8767m.C8770c[r3]
            r1.<init>(r3, r2)
        L_0x0026:
            androidx.compose.runtime.collection.g r8 = androidx.compose.p004ui.node.NodeChainKt.m69940e(r0, r1)
            int r0 = r8.mo15469h0()
            int r1 = r7.mo15469h0()
            r9 = 1
            if (r0 != r1) goto L_0x00c7
            int r0 = r7.mo15469h0()
            androidx.compose.ui.m$d r1 = r6.f39064d
            androidx.compose.ui.m$d r1 = r1.mo17234M()
            int r0 = r0 - r9
            r3 = r2
            r4 = r3
        L_0x0042:
            if (r1 == 0) goto L_0x00a3
            if (r0 < 0) goto L_0x00a3
            java.lang.Object[] r5 = r7.mo15462d0()
            r5 = r5[r0]
            r13 = r5
            androidx.compose.ui.m$c r13 = (androidx.compose.p004ui.C8767m.C8770c) r13
            java.lang.Object[] r5 = r8.mo15462d0()
            r5 = r5[r0]
            r14 = r5
            androidx.compose.ui.m$c r14 = (androidx.compose.p004ui.C8767m.C8770c) r14
            int r5 = androidx.compose.p004ui.node.NodeChainKt.m69939d(r13, r14)
            if (r5 == 0) goto L_0x0096
            if (r5 == r9) goto L_0x006f
            r10 = 2
            if (r5 == r10) goto L_0x0064
            goto L_0x0080
        L_0x0064:
            androidx.compose.ui.node.t0$b r10 = r6.f39069i
            if (r10 == 0) goto L_0x0080
            r11 = r0
            r12 = r0
            r15 = r1
            r10.mo45258e(r11, r12, r13, r14, r15)
            goto L_0x0080
        L_0x006f:
            androidx.compose.ui.m$d r5 = r6.mo45222N(r13, r14, r1)
            androidx.compose.ui.node.t0$b r10 = r6.f39069i
            if (r10 == 0) goto L_0x007f
            r11 = r0
            r12 = r0
            r15 = r1
            r16 = r5
            r10.mo45255b(r11, r12, r13, r14, r15, r16)
        L_0x007f:
            r1 = r5
        L_0x0080:
            boolean r5 = r1.mo17236Q()
            if (r5 != 0) goto L_0x0087
            r4 = r9
        L_0x0087:
            int r5 = r1.mo17232I()
            r3 = r3 | r5
            r1.mo17242X(r3)
            androidx.compose.ui.m$d r1 = r1.mo17234M()
            int r0 = r0 + -1
            goto L_0x0042
        L_0x0096:
            androidx.compose.ui.node.t0$b r3 = r6.f39069i
            if (r3 == 0) goto L_0x009d
            r3.mo45256c(r0, r13, r14, r1)
        L_0x009d:
            int r0 = r0 + 1
            androidx.compose.ui.m$d r1 = r1.mo17229F()
        L_0x00a3:
            r5 = r0
            r10 = r1
            if (r5 <= 0) goto L_0x00c4
            if (r10 == 0) goto L_0x00aa
            r2 = r9
        L_0x00aa:
            if (r2 == 0) goto L_0x00b8
            r0 = r18
            r1 = r7
            r2 = r5
            r3 = r8
            r4 = r5
            r5 = r10
            r0.mo45214F(r1, r2, r3, r4, r5)
            goto L_0x013f
        L_0x00b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c4:
            r9 = r4
            goto L_0x0140
        L_0x00c7:
            int r0 = r7.mo15469h0()
            if (r0 != 0) goto L_0x00f9
            int r0 = r8.mo15469h0()
            int r0 = r0 - r9
            androidx.compose.ui.m$d r1 = r6.f39064d
        L_0x00d4:
            r14 = r1
            if (r0 < 0) goto L_0x013f
            java.lang.Object[] r1 = r8.mo15462d0()
            r1 = r1[r0]
            r13 = r1
            androidx.compose.ui.m$c r13 = (androidx.compose.p004ui.C8767m.C8770c) r13
            androidx.compose.ui.m$d r1 = r6.mo45225g(r13, r14)
            androidx.compose.ui.node.t0$b r10 = r6.f39069i
            if (r10 == 0) goto L_0x00ee
            r11 = 0
            r12 = r0
            r15 = r1
            r10.mo45254a(r11, r12, r13, r14, r15)
        L_0x00ee:
            int r3 = r1.mo17232I()
            r2 = r2 | r3
            r1.mo17242X(r2)
            int r0 = r0 + -1
            goto L_0x00d4
        L_0x00f9:
            int r0 = r8.mo15469h0()
            if (r0 != 0) goto L_0x012e
            int r0 = r7.mo15469h0()
            int r0 = r0 - r9
            androidx.compose.ui.m$d r1 = r6.f39064d
            androidx.compose.ui.m$d r1 = r1.mo17234M()
        L_0x010a:
            if (r1 == 0) goto L_0x0128
            if (r0 < 0) goto L_0x0128
            androidx.compose.ui.node.t0$b r3 = r6.f39069i
            if (r3 == 0) goto L_0x011d
            java.lang.Object[] r4 = r7.mo15462d0()
            r4 = r4[r0]
            androidx.compose.ui.m$c r4 = (androidx.compose.p004ui.C8767m.C8770c) r4
            r3.mo45257d(r0, r4, r1)
        L_0x011d:
            androidx.compose.ui.m$d r3 = r1.mo17234M()
            r6.mo45227i(r1)
            int r0 = r0 + -1
            r1 = r3
            goto L_0x010a
        L_0x0128:
            r17 = r9
            r9 = r2
            r2 = r17
            goto L_0x0140
        L_0x012e:
            int r2 = r7.mo15469h0()
            int r4 = r8.mo15469h0()
            androidx.compose.ui.m$d r5 = r6.f39064d
            r0 = r18
            r1 = r7
            r3 = r8
            r0.mo45214F(r1, r2, r3, r4, r5)
        L_0x013f:
            r2 = r9
        L_0x0140:
            r6.f39066f = r8
            r7.mo15490w()
            r6.f39067g = r7
            r18.mo45220L()
            if (r2 == 0) goto L_0x014f
            r18.mo45215G()
        L_0x014f:
            if (r9 == 0) goto L_0x015c
            androidx.compose.ui.node.LayoutNode r0 = r6.f39061a
            boolean r0 = r0.mo44455k()
            if (r0 == 0) goto L_0x015c
            r18.mo45224f()
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.C15733t0.mo45221M(androidx.compose.ui.m):void");
    }

    /* renamed from: N */
    public final C8767m.C8772d mo45222N(C8767m.C8770c cVar, C8767m.C8770c cVar2, C8767m.C8772d dVar) {
        if ((cVar instanceof C15723p0) && (cVar2 instanceof C15723p0)) {
            C15723p0 p0Var = (C15723p0) cVar2;
            C8767m.C8772d c = NodeChainKt.m69941f(p0Var, dVar);
            if (c == dVar) {
                if (p0Var.mo17151m()) {
                    if (c.mo17236Q()) {
                        C15741w0.m70615d(c);
                    } else {
                        c.mo17249g0(true);
                    }
                }
                return c;
            } else if (!c.mo17236Q()) {
                c.mo17245b0(true);
                if (dVar.mo17236Q()) {
                    C15741w0.m70614c(dVar);
                    dVar.mo17227D();
                }
                return mo45212D(dVar, c);
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } else if (dVar instanceof BackwardsCompatNode) {
            ((BackwardsCompatNode) dVar).mo44563o0(cVar2);
            if (dVar.mo17236Q()) {
                C15741w0.m70615d(dVar);
            } else {
                dVar.mo17249g0(true);
            }
            return dVar;
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
    }

    /* renamed from: O */
    public final void mo45223O(@C12580l C15735b bVar) {
        this.f39069i = bVar;
    }

    /* renamed from: f */
    public final void mo45224f() {
        for (C8767m.C8772d m = mo45231m(); m != null; m = m.mo17229F()) {
            if (!m.mo17236Q()) {
                m.mo17226B();
                if (m.mo17231H()) {
                    C15741w0.m70612a(m);
                }
                if (m.mo17235P()) {
                    C15741w0.m70615d(m);
                }
                m.mo17245b0(false);
                m.mo17249g0(false);
            }
        }
    }

    /* renamed from: g */
    public final C8767m.C8772d mo45225g(C8767m.C8770c cVar, C8767m.C8772d dVar) {
        C8767m.C8772d dVar2;
        if (cVar instanceof C15723p0) {
            dVar2 = ((C15723p0) cVar).mo17098a();
            dVar2.mo17246c0(C15741w0.m70617f(dVar2));
        } else {
            dVar2 = new BackwardsCompatNode(cVar);
        }
        if (!dVar2.mo17236Q()) {
            dVar2.mo17245b0(true);
            return mo45245z(dVar2, dVar);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: h */
    public final void mo45226h() {
        for (C8767m.C8772d r = mo45236r(); r != null; r = r.mo17234M()) {
            if (r.mo17236Q()) {
                r.mo17227D();
            }
        }
    }

    /* renamed from: i */
    public final C8767m.C8772d mo45227i(C8767m.C8772d dVar) {
        if (dVar.mo17236Q()) {
            C15741w0.m70614c(dVar);
            dVar.mo17227D();
        }
        return mo45211C(dVar);
    }

    /* renamed from: j */
    public final /* synthetic */ <T> T mo45228j(int i, C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if ((mo45229k() & i) == 0) {
            return null;
        }
        for (T m = mo45231m(); m != null; m = m.mo17229F()) {
            if ((m.mo17232I() & i) != 0) {
                Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                if (lVar.invoke(m).booleanValue()) {
                    return m;
                }
            }
            if ((m.mo17228E() & i) == 0) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: k */
    public final int mo45229k() {
        return this.f39065e.mo17228E();
    }

    /* renamed from: l */
    public final C15734a mo45230l(C8767m.C8772d dVar, C8423g<C8767m.C8770c> gVar, C8423g<C8767m.C8770c> gVar2) {
        C15734a aVar = this.f39068h;
        if (aVar == null) {
            C15734a aVar2 = new C15734a(this, dVar, dVar.mo17228E(), gVar, gVar2);
            this.f39068h = aVar2;
            return aVar2;
        }
        aVar.mo45253k(dVar);
        aVar.mo45251i(dVar.mo17228E());
        aVar.mo45252j(gVar);
        aVar.mo45250h(gVar2);
        return aVar;
    }

    @C12579k
    /* renamed from: m */
    public final C8767m.C8772d mo45231m() {
        return this.f39065e;
    }

    @C12579k
    /* renamed from: n */
    public final C15716o mo45232n() {
        return this.f39062b;
    }

    @C12579k
    /* renamed from: o */
    public final LayoutNode mo45233o() {
        return this.f39061a;
    }

    @C12579k
    /* renamed from: p */
    public final List<C15577j0> mo45234p() {
        C8423g<C8767m.C8770c> gVar = this.f39066f;
        if (gVar == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        int i = 0;
        C8423g gVar2 = new C8423g(new C15577j0[gVar.mo15469h0()], 0);
        C8767m.C8772d m = mo45231m();
        while (m != null && m != mo45236r()) {
            NodeCoordinator G = m.mo17230G();
            if (G != null) {
                gVar2.mo15463e(new C15577j0((C8767m) gVar.mo15462d0()[i], G, G.mo44850V3()));
                m = m.mo17229F();
                i++;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return gVar2.mo15485s();
    }

    @C12579k
    /* renamed from: q */
    public final NodeCoordinator mo45235q() {
        return this.f39063c;
    }

    @C12579k
    /* renamed from: r */
    public final C8767m.C8772d mo45236r() {
        return this.f39064d;
    }

    /* renamed from: s */
    public final boolean mo45237s(int i) {
        return (i & mo45229k()) != 0;
    }

    /* renamed from: t */
    public final boolean mo45238t(int i) {
        return (i & mo45229k()) != 0;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f39065e != this.f39064d) {
            C8767m.C8772d m = mo45231m();
            while (true) {
                if (m == null || m == mo45236r()) {
                    break;
                }
                sb.append(String.valueOf(m));
                if (m.mo17229F() == this.f39064d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                m = m.mo17229F();
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: u */
    public final /* synthetic */ <T> T mo45240u(int i) {
        if ((mo45229k() & i) == 0) {
            return null;
        }
        T m = mo45231m();
        while (m != null) {
            if ((m.mo17232I() & i) != 0) {
                Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                return m;
            } else if ((m.mo17228E() & i) == 0) {
                return null;
            } else {
                m = m.mo17229F();
            }
        }
        return null;
    }

    /* renamed from: v */
    public final void mo45241v(int i, @C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if ((mo45229k() & i) != 0) {
            C8767m.C8772d m = mo45231m();
            while (m != null) {
                if ((m.mo17232I() & i) != 0) {
                    lVar.invoke(m);
                }
                if ((m.mo17228E() & i) != 0) {
                    m = m.mo17229F();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo45242w(@C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        for (C8767m.C8772d m = mo45231m(); m != null; m = m.mo17229F()) {
            lVar.invoke(m);
        }
    }

    /* renamed from: x */
    public final /* synthetic */ <T> void mo45243x(int i, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if ((mo45229k() & i) != 0) {
            C8767m.C8772d m = mo45231m();
            while (m != null) {
                if ((m.mo17232I() & i) != 0) {
                    Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                    lVar.invoke(m);
                }
                if ((m.mo17228E() & i) != 0) {
                    m = m.mo17229F();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo45244y(@C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C8767m.C8772d m = mo45231m();
        while (m != null && m != mo45236r()) {
            lVar.invoke(m);
            m = m.mo17229F();
        }
    }

    /* renamed from: z */
    public final C8767m.C8772d mo45245z(C8767m.C8772d dVar, C8767m.C8772d dVar2) {
        C8767m.C8772d M = dVar2.mo17234M();
        if (M != null) {
            M.mo17244a0(dVar);
            dVar.mo17248f0(M);
        }
        dVar2.mo17248f0(dVar);
        dVar.mo17244a0(dVar2);
        return dVar;
    }
}
