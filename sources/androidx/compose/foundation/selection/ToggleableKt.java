package androidx.compose.foundation.selection;

import androidx.compose.foundation.C2104a0;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.state.ToggleableState;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,228:1\n135#2:229\n135#2:230\n146#2:231\n135#2:232\n135#2:233\n146#2:234\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n59#1:229\n108#1:230\n107#1:231\n156#1:232\n208#1:233\n207#1:234\n*E\n"})
public final class ToggleableKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v4, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m12065a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r8, boolean r9, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2243g r10, @org.jetbrains.annotations.C12580l androidx.compose.foundation.C2104a0 r11, boolean r12, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.semantics.C16031g r13, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r14) {
        /*
            java.lang.String r0 = "$this$toggleable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r0 == 0) goto L_0x0022
            androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0026
        L_0x0022:
            kotlin.jvm.functions.l r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0026:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.state.ToggleableState r2 = androidx.compose.p004ui.state.C16046a.m72186a(r9)
            androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1 r7 = new androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1
            r7.<init>(r14, r9)
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            androidx.compose.ui.m r9 = m12069e(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.m r8 = androidx.compose.p004ui.platform.InspectableValueKt.m71062d(r8, r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.selection.ToggleableKt.m12065a(androidx.compose.ui.m, boolean, androidx.compose.foundation.interaction.g, androidx.compose.foundation.a0, boolean, androidx.compose.ui.semantics.g, kotlin.jvm.functions.l):androidx.compose.ui.m");
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m12066b(C8767m mVar, boolean z, C2243g gVar, C2104a0 a0Var, boolean z2, C16031g gVar2, C11300l lVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            gVar2 = null;
        }
        return m12065a(mVar, z, gVar, a0Var, z3, gVar2, lVar);
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m12067c(@C12579k C8767m mVar, boolean z, boolean z2, @C12580l C16031g gVar, @C12579k C11300l<? super Boolean, C11079d2> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "$this$toggleable");
        Intrinsics.checkNotNullParameter(lVar, "onValueChange");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(z, z2, gVar, lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar2, new ToggleableKt$toggleable$2(z, z2, gVar, lVar));
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m12068d(C8767m mVar, boolean z, boolean z2, C16031g gVar, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        return m12067c(mVar, z, z2, gVar, lVar);
    }

    @C12579k
    /* renamed from: e */
    public static final C8767m m12069e(@C12579k C8767m mVar, @C12579k ToggleableState toggleableState, @C12579k C2243g gVar, @C12580l C2104a0 a0Var, boolean z, @C12580l C16031g gVar2, @C12579k C11289a<C11079d2> aVar) {
        C11300l<C15983v0, C11079d2> lVar;
        C8767m mVar2 = mVar;
        ToggleableState toggleableState2 = toggleableState;
        Intrinsics.checkNotNullParameter(mVar2, "$this$triStateToggleable");
        Intrinsics.checkNotNullParameter(toggleableState2, "state");
        Intrinsics.checkNotNullParameter(gVar, "interactionSource");
        Intrinsics.checkNotNullParameter(aVar, "onClick");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2677x99d816ae(toggleableState, z, gVar2, gVar, a0Var, aVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return InspectableValueKt.m71062d(mVar2, lVar, SemanticsModifierKt.m71868c(ClickableKt.m8876c(C8767m.f23478j, gVar, a0Var, z, (String) null, gVar2, aVar, 8, (Object) null), false, new ToggleableKt$triStateToggleable$4$1(toggleableState2), 1, (Object) null));
    }

    /* renamed from: f */
    public static /* synthetic */ C8767m m12070f(C8767m mVar, ToggleableState toggleableState, C2243g gVar, C2104a0 a0Var, boolean z, C16031g gVar2, C11289a aVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            gVar2 = null;
        }
        return m12069e(mVar, toggleableState, gVar, a0Var, z2, gVar2, aVar);
    }

    @C12579k
    /* renamed from: g */
    public static final C8767m m12071g(@C12579k C8767m mVar, @C12579k ToggleableState toggleableState, boolean z, @C12580l C16031g gVar, @C12579k C11289a<C11079d2> aVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$triStateToggleable");
        Intrinsics.checkNotNullParameter(toggleableState, "state");
        Intrinsics.checkNotNullParameter(aVar, "onClick");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2678xe307cea3(toggleableState, z, gVar, aVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new ToggleableKt$triStateToggleable$2(toggleableState, z, gVar, aVar));
    }

    /* renamed from: h */
    public static /* synthetic */ C8767m m12072h(C8767m mVar, ToggleableState toggleableState, boolean z, C16031g gVar, C11289a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        return m12071g(mVar, toggleableState, z, gVar, aVar);
    }
}
