package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.p004ui.C8767m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,410:1\n36#2:411\n1114#3,6:412\n135#4:418\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n72#1:411\n72#1:412,6\n317#1:418\n*E\n"})
public final class ScrollKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m9054a(@C12579k C8767m mVar, @C12579k ScrollState scrollState, boolean z, @C12580l C2195g gVar, boolean z2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(scrollState, "state");
        return m9057d(mVar, scrollState, z2, gVar, z, false);
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m9055b(C8767m mVar, ScrollState scrollState, boolean z, C2195g gVar, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return m9054a(mVar, scrollState, z, gVar, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.ScrollState m9056c(int r10, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r11, int r12, int r13) {
        /*
            r0 = -1464256199(0xffffffffa8b93939, float:-2.0563942E-14)
            r11.mo14918M(r0)
            r13 = r13 & 1
            r1 = 0
            if (r13 == 0) goto L_0x000c
            r10 = r1
        L_0x000c:
            boolean r13 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r13 == 0) goto L_0x0018
            r13 = -1
            java.lang.String r2 = "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r12, r13, r2)
        L_0x0018:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            androidx.compose.foundation.ScrollState$a r12 = androidx.compose.foundation.ScrollState.f5779i
            androidx.compose.runtime.saveable.e r4 = r12.mo7264a()
            r5 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r13 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r13)
            boolean r12 = r11.mo15006n0(r12)
            java.lang.Object r13 = r11.mo14921N()
            if (r12 != 0) goto L_0x003d
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r13 != r12) goto L_0x0045
        L_0x003d:
            androidx.compose.foundation.ScrollKt$rememberScrollState$1$1 r13 = new androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
            r13.<init>(r10)
            r11.mo14893C(r13)
        L_0x0045:
            r11.mo15002m0()
            r6 = r13
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            r8 = 72
            r9 = 4
            r7 = r11
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.foundation.ScrollState r10 = (androidx.compose.foundation.ScrollState) r10
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x005e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x005e:
            r11.mo15002m0()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollKt.m9056c(int, androidx.compose.runtime.o, int, int):androidx.compose.foundation.ScrollState");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m9057d(androidx.compose.p004ui.C8767m r8, androidx.compose.foundation.ScrollState r9, boolean r10, androidx.compose.foundation.gestures.C2195g r11, boolean r12, boolean r13) {
        /*
            boolean r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r0 == 0) goto L_0x0012
            androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0016
        L_0x0012:
            kotlin.jvm.functions.l r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0016:
            androidx.compose.foundation.ScrollKt$scroll$2 r7 = new androidx.compose.foundation.ScrollKt$scroll$2
            r1 = r7
            r2 = r13
            r3 = r10
            r4 = r9
            r5 = r12
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.compose.ui.m r8 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r8, r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollKt.m9057d(androidx.compose.ui.m, androidx.compose.foundation.ScrollState, boolean, androidx.compose.foundation.gestures.g, boolean, boolean):androidx.compose.ui.m");
    }

    @C12579k
    /* renamed from: e */
    public static final C8767m m9058e(@C12579k C8767m mVar, @C12579k ScrollState scrollState, boolean z, @C12580l C2195g gVar, boolean z2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(scrollState, "state");
        return m9057d(mVar, scrollState, z2, gVar, z, true);
    }

    /* renamed from: f */
    public static /* synthetic */ C8767m m9059f(C8767m mVar, ScrollState scrollState, boolean z, C2195g gVar, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return m9058e(mVar, scrollState, z, gVar, z2);
    }
}
