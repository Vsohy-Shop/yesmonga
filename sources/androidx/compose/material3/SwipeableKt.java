package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,886:1\n25#2:887\n25#2:894\n1114#3,6:888\n1114#3,6:895\n135#4:901\n766#5:902\n857#5,2:903\n766#5:905\n857#5,2:906\n288#5,2:908\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableKt\n*L\n502#1:887\n509#1:894\n502#1:888,6\n509#1:895,6\n570#1:901\n735#1:902\n735#1:903,2\n736#1:905\n736#1:906,2\n793#1:908,2\n*E\n"})
public final class SwipeableKt {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r3 < r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5)).floatValue()) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r3 > r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0)).floatValue()) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float m26378d(float r3, float r4, java.util.Set<java.lang.Float> r5, kotlin.jvm.functions.C11304p<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> r6, float r7, float r8) {
        /*
            java.util.List r5 = m26379e(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L_0x006c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0062
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0042
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x002b
            return r5
        L_0x002b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x005e
            goto L_0x0060
        L_0x0042:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0060
        L_0x005e:
            r4 = r5
            goto L_0x006c
        L_0x0060:
            r4 = r0
            goto L_0x006c
        L_0x0062:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L_0x006c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableKt.m26378d(float, float, java.util.Set, kotlin.jvm.functions.p, float, float):float");
    }

    /* renamed from: e */
    public static final List<Float> m26379e(float f, Set<Float> set) {
        boolean z;
        Iterable iterable = set;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((double) ((Number) next).floatValue()) > ((double) f) + 0.001d) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        Float M3 = CollectionsKt___CollectionsKt.m40535M3(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            if (((double) ((Number) next2).floatValue()) >= ((double) f) - 0.001d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next2);
            }
        }
        Float e4 = CollectionsKt___CollectionsKt.m40625e4(arrayList2);
        if (M3 == null) {
            return CollectionsKt__CollectionsKt.m40449M(e4);
        }
        if (e4 == null) {
            return C10976s.m41419k(M3);
        }
        if (Intrinsics.areEqual(M3, e4)) {
            return C10976s.m41419k(M3);
        }
        return CollectionsKt__CollectionsKt.m40448L(M3, e4);
    }

    /* renamed from: f */
    public static final <T> Float m26380f(Map<Float, ? extends T> map, T t) {
        Object obj;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Map.Entry) obj).getValue(), (Object) t)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C15446a m26381g(@C12579k SwipeableState<T> swipeableState) {
        Intrinsics.checkNotNullParameter(swipeableState, "<this>");
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    @C8251n0
    /* renamed from: h */
    public static /* synthetic */ void m26382h(SwipeableState swipeableState) {
    }

    @C8251n0
    @C8540g
    @C12579k
    /* renamed from: i */
    public static final <T> SwipeableState<T> m26383i(@C12579k T t, @C12580l C1968g<Float> gVar, @C12580l C11300l<? super T, Boolean> lVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(t, "initialValue");
        oVar.mo14918M(102743774);
        if ((i2 & 2) != 0) {
            gVar = C8369x2.f22476a.mo14790a();
        }
        if ((i2 & 4) != 0) {
            lVar = SwipeableKt$rememberSwipeableState$1.f19755f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(102743774, i, -1, "androidx.compose.material3.rememberSwipeableState (Swipeable.kt:467)");
        }
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveableKt.m31343d(new Object[0], SwipeableState.f19758q.mo12068a(gVar, lVar), (String) null, new SwipeableKt$rememberSwipeableState$2(t, gVar, lVar), oVar, 72, 4);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return swipeableState;
    }

    @C8251n0
    @C8540g
    @C12579k
    /* renamed from: j */
    public static final <T> SwipeableState<T> m26384j(@C12579k T t, @C12579k C11300l<? super T, C11079d2> lVar, @C12580l C1968g<Float> gVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(t, "value");
        Intrinsics.checkNotNullParameter(lVar, "onValueChange");
        oVar.mo14918M(1306709399);
        if ((i2 & 4) != 0) {
            gVar = C8369x2.f22476a.mo14790a();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1306709399, i, -1, "androidx.compose.material3.rememberSwipeableStateFor (Swipeable.kt:496)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = new SwipeableState(t, gVar, SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1.f19756f);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        SwipeableState<T> swipeableState = (SwipeableState) N;
        oVar.mo14918M(-492369756);
        Object N2 = oVar.mo14921N();
        if (N2 == aVar.mo16277a()) {
            N2 = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N2;
        int i3 = i & 8;
        EffectsKt.m29895g(t, z0Var.getValue(), new SwipeableKt$rememberSwipeableStateFor$1(t, swipeableState, (C11045c<? super SwipeableKt$rememberSwipeableStateFor$1>) null), oVar, (i & 14) | i3 | 512);
        EffectsKt.m29891c(swipeableState.mo12058p(), new SwipeableKt$rememberSwipeableStateFor$2(t, swipeableState, lVar, z0Var), oVar, i3);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return swipeableState;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: androidx.compose.material3.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.material3.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v6, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material3.C8251n0
    @org.jetbrains.annotations.C12579k
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> androidx.compose.p004ui.C8767m m26385k(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r16, @org.jetbrains.annotations.C12579k androidx.compose.material3.SwipeableState<T> r17, @org.jetbrains.annotations.C12579k java.util.Map<java.lang.Float, ? extends T> r18, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.Orientation r19, boolean r20, boolean r21, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r22, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super T, ? super T, ? extends androidx.compose.material3.C8201f3> r23, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8177b2 r24, float r25) {
        /*
            r0 = r16
            java.lang.String r1 = "$this$swipeable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "state"
            r12 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "anchors"
            r13 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "orientation"
            r14 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "thresholds"
            r15 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            boolean r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r1 == 0) goto L_0x0042
            androidx.compose.material3.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.material3.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0046
        L_0x0042:
            kotlin.jvm.functions.l r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0046:
            androidx.compose.material3.SwipeableKt$swipeable$3 r11 = new androidx.compose.material3.SwipeableKt$swipeable$3
            r2 = r11
            r3 = r18
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r22
            r8 = r21
            r9 = r24
            r10 = r23
            r12 = r11
            r11 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r0, r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableKt.m26385k(androidx.compose.ui.m, androidx.compose.material3.SwipeableState, java.util.Map, androidx.compose.foundation.gestures.Orientation, boolean, boolean, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.p, androidx.compose.material3.b2, float):androidx.compose.ui.m");
    }

    /* renamed from: l */
    public static /* synthetic */ C8767m m26386l(C8767m mVar, SwipeableState swipeableState, Map map, Orientation orientation, boolean z, boolean z2, C2243g gVar, C11304p pVar, C8177b2 b2Var, float f, int i, Object obj) {
        boolean z3;
        boolean z4;
        C2243g gVar2;
        SwipeableKt$swipeable$1 swipeableKt$swipeable$1;
        C8177b2 b2Var2;
        float f2;
        int i2 = i;
        if ((i2 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i2 & 32) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 64) != 0) {
            swipeableKt$swipeable$1 = SwipeableKt$swipeable$1.f19757f;
        } else {
            swipeableKt$swipeable$1 = pVar;
        }
        if ((i2 & 128) != 0) {
            b2Var2 = C8369x2.m29399d(C8369x2.f22476a, map.keySet(), 0.0f, 0.0f, 6, (Object) null);
        } else {
            b2Var2 = b2Var;
        }
        if ((i2 & 256) != 0) {
            f2 = C8369x2.f22476a.mo14791b();
        } else {
            f2 = f;
        }
        return m26385k(mVar, swipeableState, map, orientation, z3, z4, gVar2, swipeableKt$swipeable$1, b2Var2, f2);
    }
}
