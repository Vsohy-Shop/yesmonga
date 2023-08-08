package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.semantics.C16034i;
import androidx.compose.p004ui.semantics.C16035j;
import androidx.compose.p004ui.semantics.SemanticsConfigurationKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,73:1\n73#2:74\n73#2:76\n73#2:77\n308#3:75\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n48#1:74\n68#1:76\n71#1:77\n48#1:75\n*E\n"})
/* renamed from: androidx.compose.ui.node.l1 */
public final class C15706l1 {
    @C8761g
    @C12579k
    /* renamed from: a */
    public static final C16035j m70387a(@C12579k C15703k1 k1Var) {
        Intrinsics.checkNotNullParameter(k1Var, "<this>");
        C8767m.C8772d i = C15681e.m70228i(k1Var, C15739v0.m70597b(8));
        if (!(i instanceof C15703k1)) {
            i = null;
        }
        C15703k1 k1Var2 = (C15703k1) i;
        if (k1Var2 == null || k1Var.mo44552Y().mo46152H()) {
            return k1Var.mo44552Y();
        }
        C16035j q = k1Var.mo44552Y().mo46163q();
        q.mo46159h(m70387a(k1Var2));
        return q;
    }

    /* renamed from: b */
    public static final boolean m70388b(@C12579k C15703k1 k1Var) {
        Intrinsics.checkNotNullParameter(k1Var, "<this>");
        if (SemanticsConfigurationKt.m71865a(k1Var.mo44552Y(), C16034i.f39806a.mo46139h()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static /* synthetic */ void m70389c(C15703k1 k1Var) {
    }

    @C8761g
    /* renamed from: d */
    public static final void m70390d(@C12579k C15703k1 k1Var) {
        Intrinsics.checkNotNullParameter(k1Var, "<this>");
        C15681e.m70236q(k1Var).mo44962I();
    }

    @C12579k
    /* renamed from: e */
    public static final C15098i m70391e(@C12579k C15703k1 k1Var) {
        Intrinsics.checkNotNullParameter(k1Var, "<this>");
        if (!k1Var.mo17252q().mo17236Q()) {
            return C15098i.f37261e.mo42285a();
        }
        if (!m70388b(k1Var)) {
            return C15591p.m69300b(C15681e.m70234o(k1Var, C15739v0.m70597b(8)));
        }
        return C15681e.m70234o(k1Var, C15739v0.m70597b(8)).mo44893y6();
    }
}
