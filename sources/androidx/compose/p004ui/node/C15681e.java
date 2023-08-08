package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.collection.C8423g;
import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,381:1\n262#1,11:404\n276#1,9:415\n78#1,17:424\n171#1,25:441\n206#1,2:466\n208#1,7:471\n215#1,15:479\n237#1,2:494\n239#1,20:499\n1182#2:382\n1161#2,2:383\n1182#2:397\n1161#2,2:398\n1182#2:401\n1161#2,2:402\n1182#2:468\n1161#2,2:469\n1182#2:496\n1161#2,2:497\n48#3:385\n492#3,11:386\n48#3:400\n48#3:478\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n290#1:404,11\n298#1:415,9\n314#1:424,17\n334#1:441,25\n340#1:466,2\n340#1:471,7\n340#1:479,15\n346#1:494,2\n346#1:499,20\n143#1:382\n143#1:383,2\n207#1:397\n207#1:398,2\n238#1:401\n238#1:402,2\n340#1:468\n340#1:469,2\n346#1:496\n346#1:497,2\n150#1:385\n199#1:386,11\n214#1:400\n340#1:478\n*E\n"})
/* renamed from: androidx.compose.ui.node.e */
public final class C15681e {
    @C8761g
    /* renamed from: A */
    public static final /* synthetic */ <T> void m70217A(C15678d dVar, int i, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "$this$visitSubtree");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            C8767m.C8772d F = dVar.mo17252q().mo17229F();
            LayoutNode p = m70235p(dVar);
            C15730s0 s0Var = new C15730s0();
            while (p != null) {
                if (F == null) {
                    F = p.mo44712x0().mo45231m();
                }
                if ((F.mo17228E() & i) != 0) {
                    while (F != null) {
                        if ((F.mo17232I() & i) != 0) {
                            Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                            lVar.invoke(F);
                        }
                        F = F.mo17229F();
                    }
                    F = null;
                }
                s0Var.mo45194c(p.mo44627I0());
                if (s0Var.mo45192a()) {
                    p = (LayoutNode) s0Var.mo45193b();
                } else {
                    p = null;
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: B */
    public static final void m70218B(@C12579k C15678d dVar, int i, @C12579k C11300l<? super C8767m.C8772d, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = dVar.mo17252q().mo17229F();
            if (F == null) {
                m70221b(gVar, dVar.mo17252q());
            } else {
                gVar.mo15463e(F);
            }
            while (gVar.mo15477m0()) {
                C8767m.C8772d dVar2 = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                if ((dVar2.mo17228E() & i) != 0) {
                    C8767m.C8772d dVar3 = dVar2;
                    while (true) {
                        if (dVar3 != null) {
                            if ((dVar3.mo17232I() & i) != 0 && !lVar.invoke(dVar3).booleanValue()) {
                                break;
                            }
                            dVar3 = dVar3.mo17229F();
                        } else {
                            break;
                        }
                    }
                }
                m70221b(gVar, dVar2);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: C */
    public static final /* synthetic */ <T> void m70219C(C15678d dVar, int i, C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "$this$visitSubtreeIf");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = dVar.mo17252q().mo17229F();
            if (F == null) {
                m70221b(gVar, dVar.mo17252q());
            } else {
                gVar.mo15463e(F);
            }
            while (gVar.mo15477m0()) {
                C8767m.C8772d dVar2 = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                if ((dVar2.mo17228E() & i) != 0) {
                    C8767m.C8772d dVar3 = dVar2;
                    while (true) {
                        if (dVar3 == null) {
                            break;
                        }
                        if ((dVar3.mo17232I() & i) != 0) {
                            Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                            if (!lVar.invoke(dVar3).booleanValue()) {
                                break;
                            }
                        }
                        dVar3 = dVar3.mo17229F();
                    }
                }
                m70221b(gVar, dVar2);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public static final void m70221b(C8423g<C8767m.C8772d> gVar, C8767m.C8772d dVar) {
        C8423g<LayoutNode> I0 = m70235p(dVar).mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            int i = h0 - 1;
            Object[] d0 = I0.mo15462d0();
            do {
                gVar.mo15463e(((LayoutNode) d0[i]).mo44712x0().mo45231m());
                i--;
            } while (i >= 0);
        }
    }

    @C12580l
    @C8761g
    /* renamed from: c */
    public static final List<C8767m.C8772d> m70222c(@C12579k C15678d dVar, int i) {
        C15733t0 x0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.mo17252q().mo17236Q()) {
            C8767m.C8772d M = dVar.mo17252q().mo17234M();
            LayoutNode p = m70235p(dVar);
            ArrayList arrayList = null;
            while (p != null) {
                if ((p.mo44712x0().mo45231m().mo17228E() & i) != 0) {
                    while (M != null) {
                        if ((M.mo17232I() & i) != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(M);
                        }
                        M = M.mo17234M();
                    }
                }
                p = p.mo44613C0();
                if (p == null || (x0 = p.mo44712x0()) == null) {
                    M = null;
                } else {
                    M = x0.mo45236r();
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: d */
    public static final /* synthetic */ <T> List<T> m70223d(C15678d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "$this$ancestors");
        List<C8767m.C8772d> c = m70222c(dVar, i);
        if (c instanceof List) {
            return c;
        }
        return null;
    }

    @C12580l
    @C8761g
    /* renamed from: e */
    public static final C8767m.C8772d m70224e(@C12579k C15678d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.mo17252q().mo17236Q()) {
            C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = dVar.mo17252q().mo17229F();
            if (F == null) {
                m70221b(gVar, dVar.mo17252q());
            } else {
                gVar.mo15463e(F);
            }
            while (gVar.mo15477m0()) {
                C8767m.C8772d dVar2 = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                if ((dVar2.mo17228E() & i) == 0) {
                    m70221b(gVar, dVar2);
                } else {
                    while (dVar2 != null) {
                        if ((dVar2.mo17232I() & i) != 0) {
                            return dVar2;
                        }
                        dVar2 = dVar2.mo17229F();
                    }
                    continue;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: f */
    public static final /* synthetic */ <T> T m70225f(C15678d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "$this$firstChild");
        T e = m70224e(dVar, i);
        Intrinsics.reifiedOperationMarker(2, C19135a.f48928d5);
        return e;
    }

    @C8761g
    /* renamed from: g */
    public static final boolean m70226g(@C12579k C15678d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "$this$has");
        if ((dVar.mo17252q().mo17228E() & i) != 0) {
            return true;
        }
        return false;
    }

    @C8761g
    /* renamed from: h */
    public static final void m70227h(@C12579k C15678d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.mo17252q().mo17236Q()) {
            LayoutNode.m69655W0(m70235p(dVar), false, 1, (Object) null);
        }
    }

    @C12580l
    @C8761g
    /* renamed from: i */
    public static final C8767m.C8772d m70228i(@C12579k C15678d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        C8767m.C8772d F = dVar.mo17252q().mo17229F();
        if (F == null || (F.mo17228E() & i) == 0) {
            return null;
        }
        while (F != null) {
            if ((F.mo17232I() & i) != 0) {
                return F;
            }
            F = F.mo17229F();
        }
        return null;
    }

    @C8761g
    /* renamed from: j */
    public static final /* synthetic */ <T> T m70229j(C15678d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "$this$localChild");
        T i2 = m70228i(dVar, i);
        Intrinsics.reifiedOperationMarker(2, C19135a.f48928d5);
        return i2;
    }

    @C12580l
    @C8761g
    /* renamed from: k */
    public static final C8767m.C8772d m70230k(@C12579k C15678d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        for (C8767m.C8772d M = dVar.mo17252q().mo17234M(); M != null; M = M.mo17234M()) {
            if ((M.mo17232I() & i) != 0) {
                return M;
            }
        }
        return null;
    }

    @C8761g
    /* renamed from: l */
    public static final /* synthetic */ <T> T m70231l(C15678d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "$this$localParent");
        T k = m70230k(dVar, i);
        Intrinsics.reifiedOperationMarker(2, C19135a.f48928d5);
        return k;
    }

    @C12580l
    @C8761g
    /* renamed from: m */
    public static final C8767m.C8772d m70232m(@C12579k C15678d dVar, int i) {
        C15733t0 x0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.mo17252q().mo17236Q()) {
            C8767m.C8772d M = dVar.mo17252q().mo17234M();
            LayoutNode p = m70235p(dVar);
            while (p != null) {
                if ((p.mo44712x0().mo45231m().mo17228E() & i) != 0) {
                    while (M != null) {
                        if ((M.mo17232I() & i) != 0) {
                            return M;
                        }
                        M = M.mo17234M();
                    }
                }
                p = p.mo44613C0();
                if (p == null || (x0 = p.mo44712x0()) == null) {
                    M = null;
                } else {
                    M = x0.mo45236r();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: n */
    public static final /* synthetic */ <T> T m70233n(C15678d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "$this$nearestAncestor");
        T m = m70232m(dVar, i);
        Intrinsics.reifiedOperationMarker(2, C19135a.f48928d5);
        return m;
    }

    @C8761g
    @C12579k
    /* renamed from: o */
    public static final NodeCoordinator m70234o(@C12579k C15678d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "$this$requireCoordinator");
        NodeCoordinator G = dVar.mo17252q().mo17230G();
        Intrinsics.checkNotNull(G);
        if (G.mo44883s4() != dVar || !C15741w0.m70618g(i)) {
            return G;
        }
        NodeCoordinator v4 = G.mo44887v4();
        Intrinsics.checkNotNull(v4);
        return v4;
    }

    @C8761g
    @C12579k
    /* renamed from: p */
    public static final LayoutNode m70235p(@C12579k C15678d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        NodeCoordinator G = dVar.mo17252q().mo17230G();
        if (G != null) {
            return G.mo44836H5();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @C8761g
    @C12579k
    /* renamed from: q */
    public static final C15675c1 m70236q(@C12579k C15678d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        C15675c1 B0 = m70235p(dVar).mo44611B0();
        if (B0 != null) {
            return B0;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @C8761g
    /* renamed from: r */
    public static final void m70237r(@C12579k C15678d dVar, int i, @C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        C15733t0 x0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            C8767m.C8772d M = dVar.mo17252q().mo17234M();
            LayoutNode p = m70235p(dVar);
            while (p != null) {
                if ((p.mo44712x0().mo45231m().mo17228E() & i) != 0) {
                    while (M != null) {
                        if ((M.mo17232I() & i) != 0) {
                            lVar.invoke(M);
                        }
                        M = M.mo17234M();
                    }
                }
                p = p.mo44613C0();
                if (p == null || (x0 = p.mo44712x0()) == null) {
                    M = null;
                } else {
                    M = x0.mo45236r();
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: s */
    public static final /* synthetic */ <T> void m70238s(C15678d dVar, int i, C11300l<? super T, C11079d2> lVar) {
        C15733t0 x0;
        Intrinsics.checkNotNullParameter(dVar, "$this$visitAncestors");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            C8767m.C8772d M = dVar.mo17252q().mo17234M();
            LayoutNode p = m70235p(dVar);
            while (p != null) {
                if ((p.mo44712x0().mo45231m().mo17228E() & i) != 0) {
                    while (M != null) {
                        if ((M.mo17232I() & i) != 0) {
                            Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                            lVar.invoke(M);
                        }
                        M = M.mo17234M();
                    }
                }
                p = p.mo44613C0();
                if (p == null || (x0 = p.mo44712x0()) == null) {
                    M = null;
                } else {
                    M = x0.mo45236r();
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: t */
    public static final void m70239t(@C12579k C15678d dVar, int i, @C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = dVar.mo17252q().mo17229F();
            if (F == null) {
                m70221b(gVar, dVar.mo17252q());
            } else {
                gVar.mo15463e(F);
            }
            while (gVar.mo15477m0()) {
                C8767m.C8772d dVar2 = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                if ((dVar2.mo17228E() & i) == 0) {
                    m70221b(gVar, dVar2);
                } else {
                    while (true) {
                        if (dVar2 == null) {
                            break;
                        } else if ((dVar2.mo17232I() & i) != 0) {
                            lVar.invoke(dVar2);
                            break;
                        } else {
                            dVar2 = dVar2.mo17229F();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: u */
    public static final /* synthetic */ <T> void m70240u(C15678d dVar, int i, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "$this$visitChildren");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = dVar.mo17252q().mo17229F();
            if (F == null) {
                m70221b(gVar, dVar.mo17252q());
            } else {
                gVar.mo15463e(F);
            }
            while (gVar.mo15477m0()) {
                C8767m.C8772d dVar2 = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                if ((dVar2.mo17228E() & i) == 0) {
                    m70221b(gVar, dVar2);
                } else {
                    while (true) {
                        if (dVar2 == null) {
                            break;
                        } else if ((dVar2.mo17232I() & i) != 0) {
                            Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                            lVar.invoke(dVar2);
                            break;
                        } else {
                            dVar2 = dVar2.mo17229F();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: v */
    public static final void m70241v(@C12579k C15678d dVar, int i, @C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            C8767m.C8772d q = dVar.mo17252q();
            if ((q.mo17228E() & i) != 0) {
                for (C8767m.C8772d F = q.mo17229F(); F != null; F = F.mo17229F()) {
                    if ((F.mo17232I() & i) != 0) {
                        lVar.invoke(F);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: w */
    public static final /* synthetic */ <T> void m70242w(C15678d dVar, int i, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "$this$visitLocalChildren");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            C8767m.C8772d q = dVar.mo17252q();
            if ((q.mo17228E() & i) != 0) {
                for (C8767m.C8772d F = q.mo17229F(); F != null; F = F.mo17229F()) {
                    if ((F.mo17232I() & i) != 0) {
                        Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                        lVar.invoke(F);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: x */
    public static final void m70243x(@C12579k C15678d dVar, int i, @C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            for (C8767m.C8772d M = dVar.mo17252q().mo17234M(); M != null; M = M.mo17234M()) {
                if ((M.mo17232I() & i) != 0) {
                    lVar.invoke(M);
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: y */
    public static final /* synthetic */ <T> void m70244y(C15678d dVar, int i, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "$this$visitLocalParents");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            for (C8767m.C8772d M = dVar.mo17252q().mo17234M(); M != null; M = M.mo17234M()) {
                if ((M.mo17232I() & i) != 0) {
                    Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
                    lVar.invoke(M);
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: z */
    public static final void m70245z(@C12579k C15678d dVar, int i, @C12579k C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (dVar.mo17252q().mo17236Q()) {
            C8767m.C8772d F = dVar.mo17252q().mo17229F();
            LayoutNode p = m70235p(dVar);
            C15730s0 s0Var = new C15730s0();
            while (p != null) {
                if (F == null) {
                    F = p.mo44712x0().mo45231m();
                }
                if ((F.mo17228E() & i) != 0) {
                    while (F != null) {
                        if ((F.mo17232I() & i) != 0) {
                            lVar.invoke(F);
                        }
                        F = F.mo17229F();
                    }
                    F = null;
                }
                s0Var.mo45194c(p.mo44627I0());
                if (s0Var.mo45192a()) {
                    p = (LayoutNode) s0Var.mo45193b();
                } else {
                    p = null;
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
