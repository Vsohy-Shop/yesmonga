package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.C15059d;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15733t0;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.C8423g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,173:1\n1#2:174\n87#3:175\n87#3:205\n87#3:235\n340#4:176\n206#4,2:177\n208#4,7:182\n215#4,15:190\n340#4:206\n206#4,2:207\n208#4,7:212\n215#4,15:220\n314#4:236\n78#4,17:237\n1182#5:179\n1161#5,2:180\n1182#5:209\n1161#5,2:210\n48#6:189\n48#6:219\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n142#1:175\n156#1:205\n168#1:235\n142#1:176\n142#1:177,2\n142#1:182,7\n142#1:190,15\n156#1:206\n156#1:207,2\n156#1:212,7\n156#1:220,15\n168#1:236\n168#1:237,17\n142#1:179\n142#1:180,2\n156#1:209\n156#1:210,2\n142#1:189\n156#1:219\n*E\n"})
/* renamed from: androidx.compose.ui.focus.a0 */
public final class C15054a0 {

    /* renamed from: androidx.compose.ui.focus.a0$a */
    public /* synthetic */ class C15055a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.p004ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.compose.ui.unit.LayoutDirection r2 = androidx.compose.p004ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.p004ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.p004ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r3 = androidx.compose.p004ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.focus.C15054a0.C15055a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final FocusRequester m64681a(@C12579k FocusTargetModifierNode focusTargetModifierNode, int i, @C12579k LayoutDirection layoutDirection) {
        FocusRequester focusRequester;
        FocusRequester focusRequester2;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusProperties p0 = focusTargetModifierNode.mo42161p0();
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42189i())) {
            return p0.mo42111q();
        }
        if (C15059d.m64709n(i, aVar.mo42191l())) {
            return p0.mo42110p();
        }
        if (C15059d.m64709n(i, aVar.mo42193n())) {
            return p0.mo42096d();
        }
        if (C15059d.m64709n(i, aVar.mo42184a())) {
            return p0.mo42099g();
        }
        if (C15059d.m64709n(i, aVar.mo42188h())) {
            int i2 = C15055a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                focusRequester2 = p0.getStart();
            } else if (i2 == 2) {
                focusRequester2 = p0.getEnd();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual((Object) focusRequester2, (Object) FocusRequester.f37201b.mo42132d())) {
                focusRequester2 = null;
            }
            if (focusRequester2 == null) {
                return p0.mo42093a();
            }
        } else if (C15059d.m64709n(i, aVar.mo42192m())) {
            int i3 = C15055a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                focusRequester = p0.getEnd();
            } else if (i3 == 2) {
                focusRequester = p0.getStart();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual((Object) focusRequester, (Object) FocusRequester.f37201b.mo42132d())) {
                focusRequester = null;
            }
            if (focusRequester2 == null) {
                return p0.mo42094b();
            }
        } else if (C15059d.m64709n(i, aVar.mo42185b())) {
            return p0.mo42103i().invoke(C15059d.m64706k(i));
        } else {
            if (C15059d.m64709n(i, aVar.mo42186d())) {
                return p0.mo42097e().invoke(C15059d.m64706k(i));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return focusRequester2;
    }

    @C12580l
    /* renamed from: b */
    public static final FocusTargetModifierNode m64682b(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        FocusTargetModifierNode b;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i = C15055a.$EnumSwitchMapping$1[focusTargetModifierNode.mo42165s0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                int b2 = C15739v0.m70597b(1024);
                if (focusTargetModifierNode.mo17252q().mo17236Q()) {
                    C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
                    C8767m.C8772d F = focusTargetModifierNode.mo17252q().mo17229F();
                    if (F == null) {
                        C15681e.m70221b(gVar, focusTargetModifierNode.mo17252q());
                    } else {
                        gVar.mo15463e(F);
                    }
                    while (gVar.mo15477m0()) {
                        C8767m.C8772d dVar = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                        if ((dVar.mo17228E() & b2) == 0) {
                            C15681e.m70221b(gVar, dVar);
                        } else {
                            while (true) {
                                if (dVar == null) {
                                    continue;
                                    break;
                                } else if ((dVar.mo17232I() & b2) == 0) {
                                    dVar = dVar.mo17229F();
                                } else if ((dVar instanceof FocusTargetModifierNode) && (b = m64682b((FocusTargetModifierNode) dVar)) != null) {
                                    return b;
                                }
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Check failed.".toString());
            } else if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return focusTargetModifierNode;
    }

    /* renamed from: c */
    public static final FocusTargetModifierNode m64683c(FocusTargetModifierNode focusTargetModifierNode) {
        C15733t0 x0;
        int b = C15739v0.m70597b(1024);
        if (focusTargetModifierNode.mo17252q().mo17236Q()) {
            C8767m.C8772d M = focusTargetModifierNode.mo17252q().mo17234M();
            LayoutNode p = C15681e.m70235p(focusTargetModifierNode);
            while (p != null) {
                if ((p.mo44712x0().mo45231m().mo17228E() & b) != 0) {
                    while (M != null) {
                        if ((M.mo17232I() & b) != 0 && (M instanceof FocusTargetModifierNode)) {
                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) M;
                            if (focusTargetModifierNode2.mo42161p0().mo42109o()) {
                                return focusTargetModifierNode2;
                            }
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
    @C12579k
    /* renamed from: d */
    public static final C15098i m64684d(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        C15098i n0;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        NodeCoordinator G = focusTargetModifierNode.mo17230G();
        if (G == null || (n0 = C15591p.m69302d(G).mo44437n0(G, false)) == null) {
            return C15098i.f37261e.mo42285a();
        }
        return n0;
    }

    /* renamed from: e */
    public static final boolean m64685e(@C12579k FocusTargetModifierNode focusTargetModifierNode, int i, @C12579k LayoutDirection layoutDirection, @C12579k C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        FocusTargetModifierNode focusTargetModifierNode2;
        int i2;
        Boolean t;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(lVar, "onFound");
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42189i())) {
            z = true;
        } else {
            z = C15059d.m64709n(i, aVar.mo42191l());
        }
        if (z) {
            return OneDimensionalFocusSearchKt.m64654h(focusTargetModifierNode, i, lVar);
        }
        if (C15059d.m64709n(i, aVar.mo42188h())) {
            z2 = true;
        } else {
            z2 = C15059d.m64709n(i, aVar.mo42192m());
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = C15059d.m64709n(i, aVar.mo42193n());
        }
        if (z3) {
            z4 = true;
        } else {
            z4 = C15059d.m64709n(i, aVar.mo42184a());
        }
        if (z4) {
            Boolean t2 = TwoDimensionalFocusSearchKt.m64678t(focusTargetModifierNode, i, lVar);
            if (t2 != null) {
                return t2.booleanValue();
            }
        } else if (C15059d.m64709n(i, aVar.mo42185b())) {
            int i3 = C15055a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                i2 = aVar.mo42192m();
            } else if (i3 == 2) {
                i2 = aVar.mo42188h();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            FocusTargetModifierNode b = m64682b(focusTargetModifierNode);
            if (!(b == null || (t = TwoDimensionalFocusSearchKt.m64678t(b, i2, lVar)) == null)) {
                return t.booleanValue();
            }
        } else if (C15059d.m64709n(i, aVar.mo42186d())) {
            FocusTargetModifierNode b2 = m64682b(focusTargetModifierNode);
            if (b2 != null) {
                focusTargetModifierNode2 = m64683c(b2);
            } else {
                focusTargetModifierNode2 = null;
            }
            if (focusTargetModifierNode2 != null && !Intrinsics.areEqual((Object) focusTargetModifierNode2, (Object) focusTargetModifierNode)) {
                return lVar.invoke(focusTargetModifierNode2).booleanValue();
            }
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + C15059d.m64711p(i)).toString());
        }
        return false;
    }

    @C12580l
    /* renamed from: f */
    public static final FocusTargetModifierNode m64686f(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.mo17252q().mo17236Q()) {
            return null;
        }
        int b = C15739v0.m70597b(1024);
        if (focusTargetModifierNode.mo17252q().mo17236Q()) {
            C8423g gVar = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = focusTargetModifierNode.mo17252q().mo17229F();
            if (F == null) {
                C15681e.m70221b(gVar, focusTargetModifierNode.mo17252q());
            } else {
                gVar.mo15463e(F);
            }
            while (gVar.mo15477m0()) {
                C8767m.C8772d dVar = (C8767m.C8772d) gVar.mo15437D0(gVar.mo15469h0() - 1);
                if ((dVar.mo17228E() & b) == 0) {
                    C15681e.m70221b(gVar, dVar);
                } else {
                    while (true) {
                        if (dVar == null) {
                            continue;
                            break;
                        } else if ((dVar.mo17232I() & b) == 0) {
                            dVar = dVar.mo17229F();
                        } else if (dVar instanceof FocusTargetModifierNode) {
                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) dVar;
                            int i = C15055a.$EnumSwitchMapping$1[focusTargetModifierNode2.mo42165s0().ordinal()];
                            if (i == 1 || i == 2 || i == 3) {
                                return focusTargetModifierNode2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: g */
    public static /* synthetic */ void m64687g(FocusTargetModifierNode focusTargetModifierNode) {
    }

    /* renamed from: h */
    public static final boolean m64688h(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        boolean z;
        boolean z2;
        LayoutNode H5;
        LayoutNode H52;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        NodeCoordinator G = focusTargetModifierNode.mo17230G();
        if (G == null || (H52 = G.mo44836H5()) == null || !H52.mo44456p()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            NodeCoordinator G2 = focusTargetModifierNode.mo17230G();
            if (G2 == null || (H5 = G2.mo44836H5()) == null || !H5.mo44455k()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @C8761g
    /* renamed from: i */
    public static /* synthetic */ void m64689i(FocusTargetModifierNode focusTargetModifierNode) {
    }
}
