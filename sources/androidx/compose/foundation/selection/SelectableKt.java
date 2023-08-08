package androidx.compose.foundation.selection;

import androidx.compose.foundation.C2104a0;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.semantics.C16031g;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,134:1\n135#2:135\n135#2:136\n146#2:137\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n61#1:135\n114#1:136\n113#1:137\n*E\n"})
public final class SelectableKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m12058a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r13, boolean r14, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2243g r15, @org.jetbrains.annotations.C12580l androidx.compose.foundation.C2104a0 r16, boolean r17, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.semantics.C16031g r18, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r19) {
        /*
            r0 = r13
            java.lang.String r1 = "$this$selectable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "interactionSource"
            r9 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "onClick"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            boolean r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r1 == 0) goto L_0x002a
            androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x002e
        L_0x002a:
            kotlin.jvm.functions.l r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x002e:
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r6 = 0
            r11 = 8
            r12 = 0
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r18
            r8 = r19
            r9 = r11
            r10 = r12
            androidx.compose.ui.m r2 = androidx.compose.foundation.ClickableKt.m8876c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.foundation.selection.SelectableKt$selectable$4$1 r3 = new androidx.compose.foundation.selection.SelectableKt$selectable$4$1
            r4 = r14
            r3.<init>(r14)
            r4 = 1
            r5 = 0
            r6 = 0
            androidx.compose.ui.m r2 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r2, r6, r3, r4, r5)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71062d(r13, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.selection.SelectableKt.m12058a(androidx.compose.ui.m, boolean, androidx.compose.foundation.interaction.g, androidx.compose.foundation.a0, boolean, androidx.compose.ui.semantics.g, kotlin.jvm.functions.a):androidx.compose.ui.m");
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m12059b(C8767m mVar, boolean z, C2243g gVar, C2104a0 a0Var, boolean z2, C16031g gVar2, C11289a aVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            gVar2 = null;
        }
        return m12058a(mVar, z, gVar, a0Var, z3, gVar2, aVar);
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m12060c(@C12579k C8767m mVar, boolean z, boolean z2, @C12580l C16031g gVar, @C12579k C11289a<C11079d2> aVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$selectable");
        Intrinsics.checkNotNullParameter(aVar, "onClick");
        if (InspectableValueKt.m71063e()) {
            lVar = new SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1(z, z2, gVar, aVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new SelectableKt$selectable$2(z, z2, gVar, aVar));
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m12061d(C8767m mVar, boolean z, boolean z2, C16031g gVar, C11289a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        return m12060c(mVar, z, z2, gVar, aVar);
    }
}
