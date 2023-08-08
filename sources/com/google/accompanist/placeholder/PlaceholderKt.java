package com.google.accompanist.placeholder;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15204e3;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\ncom/google/accompanist/placeholder/PlaceholderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,263:1\n135#2:264\n245#3:265\n*S KotlinDebug\n*F\n+ 1 Placeholder.kt\ncom/google/accompanist/placeholder/PlaceholderKt\n*L\n113#1:264\n258#1:265\n*E\n"})
public final class PlaceholderKt {
    /* renamed from: b */
    public static final C15174d3 m64427b(C15187e eVar, C15218g4 g4Var, long j, C15037b bVar, float f, C15174d3 d3Var, LayoutDirection layoutDirection, C15104m mVar) {
        boolean z;
        C15218g4 g4Var2 = g4Var;
        C15037b bVar2 = bVar;
        float f2 = f;
        C15174d3 d3Var2 = null;
        if (g4Var2 == C15321t3.m66567a()) {
            C15187e.m65710e5(eVar, j, 0, 0, 0.0f, (C15192h) null, (C15249k2) null, 0, 126, (Object) null);
            if (bVar2 != null) {
                C15187e.m65700T3(eVar, bVar2.mo42039a(f2, eVar.mo42718b()), 0, 0, bVar.mo42041c(f), (C15192h) null, (C15249k2) null, 0, 118, (Object) null);
            }
            return null;
        }
        if (!C15104m.m65013j(eVar.mo42718b(), mVar) || eVar.getLayoutDirection() != layoutDirection) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            d3Var2 = d3Var;
        }
        if (d3Var2 == null) {
            d3Var2 = g4Var2.mo7615a(eVar.mo42718b(), eVar.getLayoutDirection(), eVar);
        } else {
            C15187e eVar2 = eVar;
        }
        C15204e3.m65907g(eVar, d3Var2, j, 0.0f, (C15192h) null, (C15249k2) null, 0, 60, (Object) null);
        if (bVar2 != null) {
            C15204e3.m65905e(eVar, d3Var2, bVar2.mo42039a(f2, eVar.mo42718b()), bVar.mo42041c(f), (C15192h) null, (C15249k2) null, 0, 56, (Object) null);
        }
        return d3Var2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.accompanist.placeholder.PlaceholderKt$placeholder-cf5BqRc$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.accompanist.placeholder.PlaceholderKt$placeholder-cf5BqRc$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v5, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8544h(scheme = "[0[0][0]]")
    @org.jetbrains.annotations.C12579k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m64428c(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r12, boolean r13, long r14, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.C15218g4 r16, @org.jetbrains.annotations.C12580l com.google.accompanist.placeholder.C15037b r17, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.animation.core.Transition.C1927b<java.lang.Boolean>, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, ? extends androidx.compose.animation.core.C1956d0<java.lang.Float>> r18, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.animation.core.Transition.C1927b<java.lang.Boolean>, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, ? extends androidx.compose.animation.core.C1956d0<java.lang.Float>> r19) {
        /*
            r0 = r12
            java.lang.String r1 = "$this$placeholder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "shape"
            r9 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "placeholderFadeTransitionSpec"
            r8 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "contentFadeTransitionSpec"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            boolean r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r1 == 0) goto L_0x002e
            com.google.accompanist.placeholder.PlaceholderKt$placeholder-cf5BqRc$$inlined$debugInspectorInfo$1 r1 = new com.google.accompanist.placeholder.PlaceholderKt$placeholder-cf5BqRc$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r13
            r4 = r14
            r6 = r17
            r7 = r16
            r2.<init>(r3, r4, r6, r7)
            goto L_0x0032
        L_0x002e:
            kotlin.jvm.functions.l r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0032:
            com.google.accompanist.placeholder.PlaceholderKt$placeholder$4 r11 = new com.google.accompanist.placeholder.PlaceholderKt$placeholder$4
            r2 = r11
            r3 = r18
            r4 = r19
            r5 = r17
            r6 = r13
            r7 = r14
            r9 = r16
            r2.<init>(r3, r4, r5, r6, r7, r9)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r12, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.placeholder.PlaceholderKt.m64428c(androidx.compose.ui.m, boolean, long, androidx.compose.ui.graphics.g4, com.google.accompanist.placeholder.b, kotlin.jvm.functions.q, kotlin.jvm.functions.q):androidx.compose.ui.m");
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m64429d(C8767m mVar, boolean z, long j, C15218g4 g4Var, C15037b bVar, C11305q qVar, C11305q qVar2, int i, Object obj) {
        C15218g4 g4Var2;
        C15037b bVar2;
        PlaceholderKt$placeholder$1 placeholderKt$placeholder$1;
        PlaceholderKt$placeholder$2 placeholderKt$placeholder$2;
        if ((i & 4) != 0) {
            g4Var2 = C15321t3.m66567a();
        } else {
            g4Var2 = g4Var;
        }
        if ((i & 8) != 0) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        if ((i & 16) != 0) {
            placeholderKt$placeholder$1 = PlaceholderKt$placeholder$1.f37161f;
        } else {
            placeholderKt$placeholder$1 = qVar;
        }
        if ((i & 32) != 0) {
            placeholderKt$placeholder$2 = PlaceholderKt$placeholder$2.f37162f;
        } else {
            placeholderKt$placeholder$2 = qVar2;
        }
        return m64428c(mVar, z, j, g4Var2, bVar2, placeholderKt$placeholder$1, placeholderKt$placeholder$2);
    }

    /* renamed from: e */
    public static final void m64430e(C15187e eVar, C15211f3 f3Var, C11300l<? super C15187e, C11079d2> lVar) {
        C15118b2 c = eVar.mo42683q5().mo42705c();
        c.mo42447x(C15106n.m65045m(eVar.mo42718b()), f3Var);
        lVar.invoke(eVar);
        c.mo42443q();
    }
}
