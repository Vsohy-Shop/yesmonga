package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15703k1;
import androidx.compose.p004ui.node.C15733t0;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.collection.C8423g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,436:1\n73#2:437\n73#2:471\n679#3:438\n610#3,8:439\n633#3,3:447\n618#3,2:450\n611#3:452\n680#3:453\n612#3,11:454\n636#3,3:465\n623#3:468\n613#3:469\n682#3:470\n603#3,15:472\n633#3,3:487\n618#3,2:490\n611#3:492\n604#3,19:493\n636#3,3:512\n623#3:515\n613#3:516\n606#3:517\n460#4,11:518\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n391#1:437\n395#1:471\n391#1:438\n391#1:439,8\n391#1:447,3\n391#1:450,2\n391#1:452\n391#1:453\n391#1:454,11\n391#1:465,3\n391#1:468\n391#1:469\n391#1:470\n395#1:472,15\n395#1:487,3\n395#1:490,2\n395#1:492\n395#1:493,19\n395#1:512,3\n395#1:515\n395#1:516\n395#1:517\n405#1:518,11\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.m */
public final class C16040m {
    /* renamed from: d */
    public static final int m72162d(SemanticsNode semanticsNode) {
        return semanticsNode.mo46024l() + 2000000000;
    }

    @C12580l
    /* renamed from: e */
    public static final LayoutNode m72163e(@C12579k LayoutNode layoutNode, @C12579k C11300l<? super LayoutNode, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        for (LayoutNode C0 = layoutNode.mo44613C0(); C0 != null; C0 = C0.mo44613C0()) {
            if (lVar.invoke(C0).booleanValue()) {
                return C0;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static final List<C15703k1> m72164f(LayoutNode layoutNode, List<C15703k1> list) {
        C8423g<LayoutNode> G0 = layoutNode.mo44622G0();
        int h0 = G0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = G0.mo15462d0();
            int i = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) d0[i];
                C15703k1 j = m72168j(layoutNode2);
                if (j != null) {
                    list.add(j);
                } else {
                    m72164f(layoutNode2, list);
                }
                i++;
            } while (i < h0);
        }
        return list;
    }

    /* renamed from: g */
    public static /* synthetic */ List m72165g(LayoutNode layoutNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return m72164f(layoutNode, list);
    }

    @C12580l
    /* renamed from: h */
    public static final C15703k1 m72166h(@C12579k LayoutNode layoutNode) {
        C8767m.C8772d dVar;
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        C15733t0 x0 = layoutNode.mo44712x0();
        int b = C15739v0.m70597b(8);
        if ((x0.mo45229k() & b) != 0) {
            dVar = x0.mo45231m();
            while (true) {
                if (dVar != null) {
                    if ((dVar.mo17232I() & b) == 0 || !(dVar instanceof C15703k1) || !((C15703k1) dVar).mo44552Y().mo46153M()) {
                        if ((dVar.mo17228E() & b) == 0) {
                            break;
                        }
                        dVar = dVar.mo17229F();
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        dVar = null;
        return (C15703k1) dVar;
    }

    /* renamed from: i */
    public static /* synthetic */ void m72167i(LayoutNode layoutNode) {
    }

    @C12580l
    /* renamed from: j */
    public static final C15703k1 m72168j(@C12579k LayoutNode layoutNode) {
        C8767m.C8772d dVar;
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        C15733t0 x0 = layoutNode.mo44712x0();
        int b = C15739v0.m70597b(8);
        if ((x0.mo45229k() & b) != 0) {
            dVar = x0.mo45231m();
            while (true) {
                if (dVar != null) {
                    if ((dVar.mo17232I() & b) == 0 || !(dVar instanceof C15703k1)) {
                        if ((dVar.mo17228E() & b) == 0) {
                            break;
                        }
                        dVar = dVar.mo17229F();
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        dVar = null;
        return (C15703k1) dVar;
    }

    /* renamed from: k */
    public static /* synthetic */ void m72169k(LayoutNode layoutNode) {
    }

    /* renamed from: l */
    public static final C16031g m72170l(SemanticsNode semanticsNode) {
        return (C16031g) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), SemanticsProperties.f39725a.mo46065u());
    }

    /* renamed from: m */
    public static final int m72171m(SemanticsNode semanticsNode) {
        return semanticsNode.mo46024l() + 1000000000;
    }
}
