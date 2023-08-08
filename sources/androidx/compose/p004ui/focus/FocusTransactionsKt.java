package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.p004ui.node.C15751z0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,242:1\n87#2:243\n87#2:245\n87#2:247\n324#3:244\n324#3:246\n324#3:248\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n55#1:243\n185#1:245\n209#1:247\n55#1:244\n185#1:246\n209#1:248\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusTransactionsKt */
public final class FocusTransactionsKt {

    /* renamed from: androidx.compose.ui.focus.FocusTransactionsKt$a */
    public /* synthetic */ class C15050a {
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
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0022 }
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.focus.FocusTransactionsKt.C15050a.<clinit>():void");
        }
    }

    @C8761g
    /* renamed from: a */
    public static final boolean m64636a(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i = C15050a.$EnumSwitchMapping$0[focusTargetModifierNode.mo42165s0().ordinal()];
        if (i == 1) {
            focusTargetModifierNode.mo42168v0(FocusStateImpl.Captured);
            C15066i.m64744b(focusTargetModifierNode);
            return true;
        } else if (i == 2) {
            return true;
        } else {
            if (i == 3 || i == 4) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @C8761g
    /* renamed from: b */
    public static final boolean m64637b(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2) {
        FocusTargetModifierNode f = C15054a0.m64686f(focusTargetModifierNode);
        if (f != null) {
            return m64639d(f, z, z2);
        }
        return true;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m64638c(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m64637b(focusTargetModifierNode, z, z2);
    }

    @C8761g
    /* renamed from: d */
    public static final boolean m64639d(@C12579k FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i = C15050a.$EnumSwitchMapping$0[focusTargetModifierNode.mo42165s0().ordinal()];
        if (i == 1) {
            focusTargetModifierNode.mo42168v0(FocusStateImpl.Inactive);
            if (z2) {
                C15066i.m64744b(focusTargetModifierNode);
            }
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!m64637b(focusTargetModifierNode, z, z2)) {
                return false;
            } else {
                focusTargetModifierNode.mo42168v0(FocusStateImpl.Inactive);
                if (z2) {
                    C15066i.m64744b(focusTargetModifierNode);
                }
            }
        } else if (!z) {
            return z;
        } else {
            focusTargetModifierNode.mo42168v0(FocusStateImpl.Inactive);
            if (!z2) {
                return z;
            }
            C15066i.m64744b(focusTargetModifierNode);
            return z;
        }
        return true;
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m64640e(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m64639d(focusTargetModifierNode, z, z2);
    }

    @C8761g
    /* renamed from: f */
    public static final boolean m64641f(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i = C15050a.$EnumSwitchMapping$0[focusTargetModifierNode.mo42165s0().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            focusTargetModifierNode.mo42168v0(FocusStateImpl.Active);
            C15066i.m64744b(focusTargetModifierNode);
            return true;
        } else if (i == 3 || i == 4) {
            return false;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: g */
    public static final boolean m64642g(FocusTargetModifierNode focusTargetModifierNode) {
        C15751z0.m70687a(focusTargetModifierNode, new FocusTransactionsKt$grantFocus$1(focusTargetModifierNode));
        int i = C15050a.$EnumSwitchMapping$0[focusTargetModifierNode.mo42165s0().ordinal()];
        if (i != 3 && i != 4) {
            return true;
        }
        focusTargetModifierNode.mo42168v0(FocusStateImpl.Active);
        return true;
    }

    @C8761g
    /* renamed from: h */
    public static final boolean m64643h(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.mo17252q().mo17236Q()) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (!focusTargetModifierNode.mo42161p0().mo42109o()) {
            return TwoDimensionalFocusSearchKt.m64669k(focusTargetModifierNode, C15059d.f37228b.mo42185b(), FocusTransactionsKt$requestFocus$1.f37220f);
        } else {
            int i = C15050a.$EnumSwitchMapping$0[focusTargetModifierNode.mo42165s0().ordinal()];
            boolean z = true;
            if (i == 1 || i == 2) {
                C15066i.m64744b(focusTargetModifierNode);
                return true;
            }
            FocusTargetModifierNode focusTargetModifierNode2 = null;
            if (i == 3) {
                if (!m64638c(focusTargetModifierNode, false, false, 3, (Object) null) || !m64642g(focusTargetModifierNode)) {
                    z = false;
                }
                if (z) {
                    C15066i.m64744b(focusTargetModifierNode);
                }
                return z;
            } else if (i == 4) {
                C8767m.C8772d m = C15681e.m70232m(focusTargetModifierNode, C15739v0.m70597b(1024));
                if (m instanceof FocusTargetModifierNode) {
                    focusTargetModifierNode2 = m;
                }
                FocusTargetModifierNode focusTargetModifierNode3 = focusTargetModifierNode2;
                if (focusTargetModifierNode3 != null) {
                    return m64644i(focusTargetModifierNode3, focusTargetModifierNode);
                }
                if (!m64645j(focusTargetModifierNode) || !m64642g(focusTargetModifierNode)) {
                    z = false;
                }
                if (z) {
                    C15066i.m64744b(focusTargetModifierNode);
                }
                return z;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: i */
    public static final boolean m64644i(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        C8767m.C8772d m = C15681e.m70232m(focusTargetModifierNode2, C15739v0.m70597b(1024));
        FocusTargetModifierNode focusTargetModifierNode3 = null;
        if (!(m instanceof FocusTargetModifierNode)) {
            m = null;
        }
        if (Intrinsics.areEqual((Object) (FocusTargetModifierNode) m, (Object) focusTargetModifierNode)) {
            int i = C15050a.$EnumSwitchMapping$0[focusTargetModifierNode.mo42165s0().ordinal()];
            boolean z = true;
            if (i == 1) {
                boolean g = m64642g(focusTargetModifierNode2);
                if (!g) {
                    return g;
                }
                focusTargetModifierNode.mo42168v0(FocusStateImpl.ActiveParent);
                C15066i.m64744b(focusTargetModifierNode2);
                C15066i.m64744b(focusTargetModifierNode);
                return g;
            } else if (i == 2) {
                return false;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        C8767m.C8772d m2 = C15681e.m70232m(focusTargetModifierNode, C15739v0.m70597b(1024));
                        if (m2 instanceof FocusTargetModifierNode) {
                            focusTargetModifierNode3 = m2;
                        }
                        FocusTargetModifierNode focusTargetModifierNode4 = focusTargetModifierNode3;
                        if (focusTargetModifierNode4 == null && m64645j(focusTargetModifierNode)) {
                            focusTargetModifierNode.mo42168v0(FocusStateImpl.Active);
                            C15066i.m64744b(focusTargetModifierNode);
                            return m64644i(focusTargetModifierNode, focusTargetModifierNode2);
                        } else if (focusTargetModifierNode4 == null || !m64644i(focusTargetModifierNode4, focusTargetModifierNode)) {
                            return false;
                        } else {
                            boolean i2 = m64644i(focusTargetModifierNode, focusTargetModifierNode2);
                            if (focusTargetModifierNode.mo42164r0() != FocusStateImpl.ActiveParent) {
                                z = false;
                            }
                            if (z) {
                                return i2;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (C15054a0.m64686f(focusTargetModifierNode) != null) {
                    if (!m64638c(focusTargetModifierNode, false, false, 3, (Object) null) || !m64642g(focusTargetModifierNode2)) {
                        z = false;
                    }
                    if (z) {
                        C15066i.m64744b(focusTargetModifierNode2);
                    }
                    return z;
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        } else {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
    }

    /* renamed from: j */
    public static final boolean m64645j(FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode H5;
        C15675c1 B0;
        NodeCoordinator G = focusTargetModifierNode.mo17230G();
        if (G != null && (H5 = G.mo44836H5()) != null && (B0 = H5.mo44611B0()) != null) {
            return B0.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
