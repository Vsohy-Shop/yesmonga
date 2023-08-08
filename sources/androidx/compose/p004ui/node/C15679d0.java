package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,114:1\n71#2:115\n69#2:116\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n101#1:115\n102#1:116\n*E\n"})
/* renamed from: androidx.compose.ui.node.d0 */
public final class C15679d0 {
    /* renamed from: b */
    public static final C15693i m70215b(C15678d dVar) {
        int b = C15739v0.m70597b(4);
        int b2 = C15739v0.m70597b(2);
        C8767m.C8772d F = dVar.mo17252q().mo17229F();
        if (F == null || (F.mo17228E() & b) == 0) {
            return null;
        }
        while (F != null && (F.mo17232I() & b2) == 0) {
            if ((F.mo17232I() & b) != 0) {
                return (C15693i) F;
            }
            F = F.mo17229F();
        }
        return null;
    }
}
