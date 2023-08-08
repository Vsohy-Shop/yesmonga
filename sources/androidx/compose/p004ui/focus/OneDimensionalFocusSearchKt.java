package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.C15059d;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.runtime.collection.C8423g;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,273:1\n187#1,3:306\n190#1,2:310\n193#1,5:313\n202#1,3:318\n205#1,2:322\n208#1,5:325\n1161#2,2:274\n1182#2:280\n1161#2,2:281\n1161#2,2:330\n1182#2:336\n1161#2,2:337\n1161#2,2:373\n1182#2:379\n1161#2,2:380\n87#3:276\n87#3:332\n87#3:375\n87#3:416\n340#4:277\n206#4,2:278\n208#4,7:283\n215#4,15:291\n340#4:333\n206#4,2:334\n208#4,7:339\n215#4,15:347\n340#4:376\n206#4,2:377\n208#4,7:382\n215#4,15:390\n324#4:417\n48#5:290\n53#5:309\n523#5:312\n53#5:321\n523#5:324\n48#5:346\n204#5,11:362\n48#5:389\n492#5,11:405\n53#5:418\n523#5:419\n523#5:420\n53#5:421\n523#5:422\n523#5:423\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n136#1:306,3\n136#1:310,2\n136#1:313,5\n139#1:318,3\n139#1:322,2\n139#1:325,5\n131#1:274,2\n132#1:280\n132#1:281,2\n158#1:330,2\n159#1:336\n159#1:337,2\n169#1:373,2\n170#1:379\n170#1:380,2\n132#1:276\n159#1:332\n170#1:375\n182#1:416\n132#1:277\n132#1:278,2\n132#1:283,7\n132#1:291,15\n159#1:333\n159#1:334,2\n159#1:339,7\n159#1:347,15\n170#1:376\n170#1:377,2\n170#1:382,7\n170#1:390,15\n182#1:417\n132#1:290\n136#1:309\n136#1:312\n139#1:321\n139#1:324\n159#1:346\n162#1:362,11\n170#1:389\n173#1:405,11\n189#1:418\n191#1:419\n193#1:420\n204#1:421\n206#1:422\n208#1:423\n*E\n"})
/* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt */
public final class OneDimensionalFocusSearchKt {
    @C12579k

    /* renamed from: a */
    public static final String f37221a = "This function should only be used for 1-D focus search";
    @C12579k

    /* renamed from: b */
    public static final String f37222b = "ActiveParent must have a focusedChild";

    /* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$a */
    public /* synthetic */ class C15051a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.p004ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.focus.OneDimensionalFocusSearchKt.C15051a.<clinit>():void");
        }
    }

    @C8761g
    /* renamed from: b */
    public static final boolean m64648b(FocusTargetModifierNode focusTargetModifierNode, C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        boolean z;
        FocusStateImpl s0 = focusTargetModifierNode.mo42165s0();
        int[] iArr = C15051a.$EnumSwitchMapping$0;
        int i = iArr[s0.ordinal()];
        if (i == 1) {
            FocusTargetModifierNode f = C15054a0.m64686f(focusTargetModifierNode);
            if (f != null) {
                int i2 = iArr[f.mo42165s0().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return m64652f(focusTargetModifierNode, f, C15059d.f37228b.mo42191l(), lVar);
                    }
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                } else if (!m64648b(f, lVar) && !m64652f(focusTargetModifierNode, f, C15059d.f37228b.mo42191l(), lVar) && (!f.mo42161p0().mo42109o() || !lVar.invoke(f).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        } else if (i == 2 || i == 3) {
            return m64655i(focusTargetModifierNode, lVar);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (!m64655i(focusTargetModifierNode, lVar)) {
                if (focusTargetModifierNode.mo42161p0().mo42109o()) {
                    z = lVar.invoke(focusTargetModifierNode).booleanValue();
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final <T> void m64649c(C8423g<T> gVar, T t, C11300l<? super T, C11079d2> lVar) {
        boolean z = false;
        C11466l lVar2 = new C11466l(0, gVar.mo15469h0() - 1);
        int r = lVar2.mo23049r();
        int w = lVar2.mo23051w();
        if (r <= w) {
            while (true) {
                if (z) {
                    lVar.invoke(gVar.mo15462d0()[r]);
                }
                if (Intrinsics.areEqual(gVar.mo15462d0()[r], (Object) t)) {
                    z = true;
                }
                if (r != w) {
                    r++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public static final <T> void m64650d(C8423g<T> gVar, T t, C11300l<? super T, C11079d2> lVar) {
        boolean z = false;
        C11466l lVar2 = new C11466l(0, gVar.mo15469h0() - 1);
        int r = lVar2.mo23049r();
        int w = lVar2.mo23051w();
        if (r <= w) {
            while (true) {
                if (z) {
                    lVar.invoke(gVar.mo15462d0()[w]);
                }
                if (Intrinsics.areEqual(gVar.mo15462d0()[w], (Object) t)) {
                    z = true;
                }
                if (w != r) {
                    w--;
                } else {
                    return;
                }
            }
        }
    }

    @C8761g
    /* renamed from: e */
    public static final boolean m64651e(FocusTargetModifierNode focusTargetModifierNode, C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        int i = C15051a.$EnumSwitchMapping$0[focusTargetModifierNode.mo42165s0().ordinal()];
        if (i == 1) {
            FocusTargetModifierNode f = C15054a0.m64686f(focusTargetModifierNode);
            if (f == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            } else if (m64651e(f, lVar) || m64652f(focusTargetModifierNode, f, C15059d.f37228b.mo42189i(), lVar)) {
                return true;
            } else {
                return false;
            }
        } else if (i == 2 || i == 3) {
            return m64656j(focusTargetModifierNode, lVar);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (focusTargetModifierNode.mo42161p0().mo42109o()) {
                return lVar.invoke(focusTargetModifierNode).booleanValue();
            } else {
                return m64656j(focusTargetModifierNode, lVar);
            }
        }
    }

    @C8761g
    /* renamed from: f */
    public static final boolean m64652f(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        if (m64657k(focusTargetModifierNode, focusTargetModifierNode2, i, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) C15053a.m64680a(focusTargetModifierNode, i, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetModifierNode, focusTargetModifierNode2, i, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m64653g(FocusTargetModifierNode focusTargetModifierNode) {
        C8767m.C8772d m = C15681e.m70232m(focusTargetModifierNode, C15739v0.m70597b(1024));
        if (!(m instanceof FocusTargetModifierNode)) {
            m = null;
        }
        if (((FocusTargetModifierNode) m) == null) {
            return true;
        }
        return false;
    }

    @C8761g
    /* renamed from: h */
    public static final boolean m64654h(@C12579k FocusTargetModifierNode focusTargetModifierNode, int i, @C12579k C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "$this$oneDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(lVar, "onFound");
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42189i())) {
            return m64651e(focusTargetModifierNode, lVar);
        }
        if (C15059d.m64709n(i, aVar.mo42191l())) {
            return m64648b(focusTargetModifierNode, lVar);
        }
        throw new IllegalStateException(f37221a.toString());
    }

    @C8761g
    /* renamed from: i */
    public static final boolean m64655i(FocusTargetModifierNode focusTargetModifierNode, C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        C8423g gVar = new C8423g(new FocusTargetModifierNode[16], 0);
        int b = C15739v0.m70597b(1024);
        if (focusTargetModifierNode.mo17252q().mo17236Q()) {
            C8423g gVar2 = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = focusTargetModifierNode.mo17252q().mo17229F();
            if (F == null) {
                C15681e.m70221b(gVar2, focusTargetModifierNode.mo17252q());
            } else {
                gVar2.mo15463e(F);
            }
            while (gVar2.mo15477m0()) {
                C8767m.C8772d dVar = (C8767m.C8772d) gVar2.mo15437D0(gVar2.mo15469h0() - 1);
                if ((dVar.mo17228E() & b) == 0) {
                    C15681e.m70221b(gVar2, dVar);
                } else {
                    while (true) {
                        if (dVar == null) {
                            break;
                        } else if ((dVar.mo17232I() & b) == 0) {
                            dVar = dVar.mo17229F();
                        } else if (dVar instanceof FocusTargetModifierNode) {
                            gVar.mo15463e((FocusTargetModifierNode) dVar);
                        }
                    }
                }
            }
            gVar.mo15445J0(C15057b0.f37225a);
            int h0 = gVar.mo15469h0();
            if (h0 > 0) {
                int i = h0 - 1;
                Object[] d0 = gVar.mo15462d0();
                do {
                    FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) d0[i];
                    if (C15054a0.m64688h(focusTargetModifierNode2) && m64648b(focusTargetModifierNode2, lVar)) {
                        return true;
                    }
                    i--;
                } while (i >= 0);
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: j */
    public static final boolean m64656j(FocusTargetModifierNode focusTargetModifierNode, C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        boolean z;
        C8423g gVar = new C8423g(new FocusTargetModifierNode[16], 0);
        int b = C15739v0.m70597b(1024);
        if (focusTargetModifierNode.mo17252q().mo17236Q()) {
            C8423g gVar2 = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = focusTargetModifierNode.mo17252q().mo17229F();
            if (F == null) {
                C15681e.m70221b(gVar2, focusTargetModifierNode.mo17252q());
            } else {
                gVar2.mo15463e(F);
            }
            while (gVar2.mo15477m0()) {
                C8767m.C8772d dVar = (C8767m.C8772d) gVar2.mo15437D0(gVar2.mo15469h0() - 1);
                if ((dVar.mo17228E() & b) == 0) {
                    C15681e.m70221b(gVar2, dVar);
                } else {
                    while (true) {
                        if (dVar == null) {
                            break;
                        } else if ((dVar.mo17232I() & b) == 0) {
                            dVar = dVar.mo17229F();
                        } else if (dVar instanceof FocusTargetModifierNode) {
                            gVar.mo15463e((FocusTargetModifierNode) dVar);
                        }
                    }
                }
            }
            gVar.mo15445J0(C15057b0.f37225a);
            int h0 = gVar.mo15469h0();
            if (h0 <= 0) {
                return false;
            }
            Object[] d0 = gVar.mo15462d0();
            int i = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) d0[i];
                if (!C15054a0.m64688h(focusTargetModifierNode2) || !m64651e(focusTargetModifierNode2, lVar)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
                i++;
            } while (i < h0);
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C8761g
    /* renamed from: k */
    public static final boolean m64657k(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        boolean z;
        if (focusTargetModifierNode.mo42165s0() == FocusStateImpl.ActiveParent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8423g gVar = new C8423g(new FocusTargetModifierNode[16], 0);
            int b = C15739v0.m70597b(1024);
            if (focusTargetModifierNode.mo17252q().mo17236Q()) {
                C8423g gVar2 = new C8423g(new C8767m.C8772d[16], 0);
                C8767m.C8772d F = focusTargetModifierNode.mo17252q().mo17229F();
                if (F == null) {
                    C15681e.m70221b(gVar2, focusTargetModifierNode.mo17252q());
                } else {
                    gVar2.mo15463e(F);
                }
                while (gVar2.mo15477m0()) {
                    C8767m.C8772d dVar = (C8767m.C8772d) gVar2.mo15437D0(gVar2.mo15469h0() - 1);
                    if ((dVar.mo17228E() & b) == 0) {
                        C15681e.m70221b(gVar2, dVar);
                    } else {
                        while (true) {
                            if (dVar == null) {
                                break;
                            } else if ((dVar.mo17232I() & b) == 0) {
                                dVar = dVar.mo17229F();
                            } else if (dVar instanceof FocusTargetModifierNode) {
                                gVar.mo15463e((FocusTargetModifierNode) dVar);
                            }
                        }
                    }
                }
                gVar.mo15445J0(C15057b0.f37225a);
                C15059d.C15060a aVar = C15059d.f37228b;
                if (C15059d.m64709n(i, aVar.mo42189i())) {
                    C11466l lVar2 = new C11466l(0, gVar.mo15469h0() - 1);
                    int r = lVar2.mo23049r();
                    int w = lVar2.mo23051w();
                    if (r <= w) {
                        boolean z2 = false;
                        while (true) {
                            if (z2) {
                                FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) gVar.mo15462d0()[r];
                                if (C15054a0.m64688h(focusTargetModifierNode3) && m64651e(focusTargetModifierNode3, lVar)) {
                                    return true;
                                }
                            }
                            if (Intrinsics.areEqual(gVar.mo15462d0()[r], (Object) focusTargetModifierNode2)) {
                                z2 = true;
                            }
                            if (r == w) {
                                break;
                            }
                            r++;
                        }
                    }
                } else if (C15059d.m64709n(i, aVar.mo42191l())) {
                    C11466l lVar3 = new C11466l(0, gVar.mo15469h0() - 1);
                    int r2 = lVar3.mo23049r();
                    int w2 = lVar3.mo23051w();
                    if (r2 <= w2) {
                        boolean z3 = false;
                        while (true) {
                            if (z3) {
                                FocusTargetModifierNode focusTargetModifierNode4 = (FocusTargetModifierNode) gVar.mo15462d0()[w2];
                                if (C15054a0.m64688h(focusTargetModifierNode4) && m64648b(focusTargetModifierNode4, lVar)) {
                                    return true;
                                }
                            }
                            if (Intrinsics.areEqual(gVar.mo15462d0()[w2], (Object) focusTargetModifierNode2)) {
                                z3 = true;
                            }
                            if (w2 == r2) {
                                break;
                            }
                            w2--;
                        }
                    }
                } else {
                    throw new IllegalStateException(f37221a.toString());
                }
                if (C15059d.m64709n(i, C15059d.f37228b.mo42189i()) || !focusTargetModifierNode.mo42161p0().mo42109o() || m64653g(focusTargetModifierNode)) {
                    return false;
                }
                return lVar.invoke(focusTargetModifierNode).booleanValue();
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
