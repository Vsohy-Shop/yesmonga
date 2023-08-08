package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C2198j;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.key.C15434a;
import androidx.compose.p004ui.input.key.C15441f;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,565:1\n135#2:566\n135#2:567\n135#2:568\n135#2:569\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n86#1:566\n198#1:567\n243#1:568\n395#1:569\n*E\n"})
public final class ClickableKt {
    @C8540g
    /* renamed from: a */
    public static final void m8874a(@C12579k C2243g gVar, @C12579k C8700z0<C2245i.C2247b> z0Var, @C12579k Map<C15434a, C2245i.C2247b> map, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(gVar, "interactionSource");
        Intrinsics.checkNotNullParameter(z0Var, "pressedInteraction");
        Intrinsics.checkNotNullParameter(map, "currentKeyPressInteractions");
        C8592o o = oVar.mo15009o(1297229208);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1297229208, i, -1, "androidx.compose.foundation.PressedInteractionSourceDisposableEffect (Clickable.kt:409)");
        }
        EffectsKt.m29891c(gVar, new ClickableKt$PressedInteractionSourceDisposableEffect$1(z0Var, map, gVar), o, i & 14);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ClickableKt$PressedInteractionSourceDisposableEffect$2(gVar, z0Var, map, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v4, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m8875b(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r9, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2243g r10, @org.jetbrains.annotations.C12580l androidx.compose.foundation.C2104a0 r11, boolean r12, @org.jetbrains.annotations.C12580l java.lang.String r13, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.semantics.C16031g r14, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r15) {
        /*
            java.lang.String r0 = "$this$clickable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            boolean r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r0 == 0) goto L_0x0022
            androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r11
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0026
        L_0x0022:
            kotlin.jvm.functions.l r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0026:
            androidx.compose.foundation.ClickableKt$clickable$4 r8 = new androidx.compose.foundation.ClickableKt$clickable$4
            r1 = r8
            r2 = r15
            r3 = r12
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.m r9 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r9, r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.m8875b(androidx.compose.ui.m, androidx.compose.foundation.interaction.g, androidx.compose.foundation.a0, boolean, java.lang.String, androidx.compose.ui.semantics.g, kotlin.jvm.functions.a):androidx.compose.ui.m");
    }

    /* renamed from: c */
    public static /* synthetic */ C8767m m8876c(C8767m mVar, C2243g gVar, C2104a0 a0Var, boolean z, String str, C16031g gVar2, C11289a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m8875b(mVar, gVar, a0Var, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : gVar2, aVar);
    }

    @C12579k
    /* renamed from: d */
    public static final C8767m m8877d(@C12579k C8767m mVar, boolean z, @C12580l String str, @C12580l C16031g gVar, @C12579k C11289a<C11079d2> aVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$clickable");
        Intrinsics.checkNotNullParameter(aVar, "onClick");
        if (InspectableValueKt.m71063e()) {
            lVar = new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(z, str, gVar, aVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new ClickableKt$clickable$2(z, str, gVar, aVar));
    }

    /* renamed from: e */
    public static /* synthetic */ C8767m m8878e(C8767m mVar, boolean z, String str, C16031g gVar, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        return m8877d(mVar, z, str, gVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.foundation.C2855v
    @org.jetbrains.annotations.C12579k
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m8879f(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r15, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2243g r16, @org.jetbrains.annotations.C12580l androidx.compose.foundation.C2104a0 r17, boolean r18, @org.jetbrains.annotations.C12580l java.lang.String r19, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.semantics.C16031g r20, @org.jetbrains.annotations.C12580l java.lang.String r21, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r22, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r23, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r24) {
        /*
            r0 = r15
            java.lang.String r1 = "$this$combinedClickable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "interactionSource"
            r12 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "onClick"
            r13 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            boolean r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r1 == 0) goto L_0x0033
            androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r24
            r7 = r23
            r8 = r22
            r9 = r21
            r10 = r17
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0037
        L_0x0033:
            kotlin.jvm.functions.l r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0037:
            androidx.compose.foundation.ClickableKt$combinedClickable$4 r14 = new androidx.compose.foundation.ClickableKt$combinedClickable$4
            r2 = r14
            r3 = r24
            r4 = r22
            r5 = r23
            r6 = r18
            r7 = r16
            r8 = r17
            r9 = r19
            r10 = r20
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r15, r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.m8879f(androidx.compose.ui.m, androidx.compose.foundation.interaction.g, androidx.compose.foundation.a0, boolean, java.lang.String, androidx.compose.ui.semantics.g, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a):androidx.compose.ui.m");
    }

    /* renamed from: g */
    public static /* synthetic */ C8767m m8880g(C8767m mVar, C2243g gVar, C2104a0 a0Var, boolean z, String str, C16031g gVar2, String str2, C11289a aVar, C11289a aVar2, C11289a aVar3, int i, Object obj) {
        int i2 = i;
        return m8879f(mVar, gVar, a0Var, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : gVar2, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : aVar, (i2 & 128) != 0 ? null : aVar2, aVar3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v3, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.foundation.C2855v
    @org.jetbrains.annotations.C12579k
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m8881h(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r12, boolean r13, @org.jetbrains.annotations.C12580l java.lang.String r14, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.semantics.C16031g r15, @org.jetbrains.annotations.C12580l java.lang.String r16, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r17, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r18, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r19) {
        /*
            r0 = r12
            java.lang.String r1 = "$this$combinedClickable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "onClick"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            boolean r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r1 == 0) goto L_0x0025
            androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r19
            r7 = r18
            r8 = r17
            r9 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0029
        L_0x0025:
            kotlin.jvm.functions.l r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0029:
            androidx.compose.foundation.ClickableKt$combinedClickable$2 r11 = new androidx.compose.foundation.ClickableKt$combinedClickable$2
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r12, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.m8881h(androidx.compose.ui.m, boolean, java.lang.String, androidx.compose.ui.semantics.g, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a):androidx.compose.ui.m");
    }

    /* renamed from: i */
    public static /* synthetic */ C8767m m8882i(C8767m mVar, boolean z, String str, C16031g gVar, String str2, C11289a aVar, C11289a aVar2, C11289a aVar3, int i, Object obj) {
        return m8881h(mVar, (i & 1) != 0 ? true : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : gVar, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : aVar2, aVar3);
    }

    @C12579k
    /* renamed from: j */
    public static final C8767m m8883j(@C12579k C8767m mVar, @C12579k C8767m mVar2, @C12579k C2243g gVar, @C12580l C2104a0 a0Var, @C12579k C12074o0 o0Var, @C12579k Map<C15434a, C2245i.C2247b> map, @C12579k C8578k2<C15094f> k2Var, boolean z, @C12580l String str, @C12580l C16031g gVar2, @C12580l String str2, @C12580l C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2) {
        C8767m mVar3 = mVar2;
        C2243g gVar3 = gVar;
        boolean z2 = z;
        C8767m mVar4 = mVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$genericClickableWithoutGesture");
        Intrinsics.checkNotNullParameter(mVar2, "gestureModifiers");
        Intrinsics.checkNotNullParameter(gVar3, "interactionSource");
        Intrinsics.checkNotNullParameter(o0Var, "indicationScope");
        Intrinsics.checkNotNullParameter(map, "currentKeyPressInteractions");
        Intrinsics.checkNotNullParameter(k2Var, "keyClickOffset");
        Intrinsics.checkNotNullParameter(aVar2, "onClick");
        return FocusableKt.m8921d(HoverableKt.m8950a(IndicationKt.m8973b(m8886m(m8885l(mVar, gVar2, str, aVar, str2, z, aVar2), z, map, k2Var, o0Var, aVar2, gVar), gVar3, a0Var), gVar3, z2), z2, gVar3).mo17224k3(mVar2);
    }

    /* renamed from: k */
    public static /* synthetic */ C8767m m8884k(C8767m mVar, C8767m mVar2, C2243g gVar, C2104a0 a0Var, C12074o0 o0Var, Map map, C8578k2 k2Var, boolean z, String str, C16031g gVar2, String str2, C11289a aVar, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m8883j(mVar, mVar2, gVar, a0Var, o0Var, map, k2Var, (i2 & 64) != 0 ? true : z, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : gVar2, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? null : aVar, aVar2);
    }

    /* renamed from: l */
    public static final C8767m m8885l(C8767m mVar, C16031g gVar, String str, C11289a<C11079d2> aVar, String str2, boolean z, C11289a<C11079d2> aVar2) {
        return SemanticsModifierKt.m71867b(mVar, true, new ClickableKt$genericClickableWithoutGesture$clickSemantics$1(gVar, str, aVar, str2, z, aVar2));
    }

    /* renamed from: m */
    public static final C8767m m8886m(C8767m mVar, boolean z, Map<C15434a, C2245i.C2247b> map, C8578k2<C15094f> k2Var, C12074o0 o0Var, C11289a<C11079d2> aVar, C2243g gVar) {
        return C15441f.m68286a(mVar, new C2069x6b176470(z, map, k2Var, o0Var, aVar, gVar));
    }

    @C12580l
    /* renamed from: n */
    public static final Object m8887n(@C12579k C2198j jVar, long j, @C12579k C2243g gVar, @C12579k C8700z0<C2245i.C2247b> z0Var, @C12579k C8578k2<? extends C11289a<Boolean>> k2Var, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new ClickableKt$handlePressInteraction$2(jVar, j, gVar, z0Var, k2Var, (C11045c<? super ClickableKt$handlePressInteraction$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }
}
