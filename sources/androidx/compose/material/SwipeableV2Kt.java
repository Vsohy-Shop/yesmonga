package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.material.SwipeableV2State;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C10977s0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n135#2:656\n1#3:657\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt\n*L\n127#1:656\n*E\n"})
public final class SwipeableV2Kt {
    /* renamed from: d */
    public static final <T> T m13990d(Map<T, Float> map, float f, boolean z) {
        float f2;
        float f3;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    if (z) {
                        f2 = floatValue - f;
                    } else {
                        f2 = f - floatValue;
                    }
                    if (f2 < 0.0f) {
                        f2 = Float.POSITIVE_INFINITY;
                    }
                    do {
                        Object next2 = it.next();
                        float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                        if (z) {
                            f3 = floatValue2 - f;
                        } else {
                            f3 = f - floatValue2;
                        }
                        if (f3 < 0.0f) {
                            f3 = Float.POSITIVE_INFINITY;
                        }
                        if (Float.compare(f2, f3) > 0) {
                            next = next2;
                            f2 = f3;
                        }
                    } while (it.hasNext());
                }
                return ((Map.Entry) next).getKey();
            }
            throw new NoSuchElementException();
        }
        throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
    }

    /* renamed from: e */
    public static /* synthetic */ Object m13991e(Map map, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return m13990d(map, f, z);
    }

    @C3044g0
    @C12579k
    /* renamed from: f */
    public static final C11304p<C16479d, Float, Float> m13992f(float f) {
        return new SwipeableV2Kt$fixedPositionalThreshold$1(f);
    }

    @C3044g0
    @C12579k
    /* renamed from: g */
    public static final C11304p<C16479d, Float, Float> m13993g(float f) {
        return new SwipeableV2Kt$fractionalPositionalThreshold$1(f);
    }

    /* renamed from: h */
    public static final <T> Float m13994h(Map<T, Float> map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: i */
    public static final <T> Float m13995i(Map<T, Float> map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C3044g0
    @C8540g
    @C12579k
    /* renamed from: j */
    public static final <T> SwipeableV2State<T> m13996j(@C12579k T t, @C12580l C1968g<Float> gVar, @C12580l C11300l<? super T, Boolean> lVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(t, "initialValue");
        oVar.mo14918M(-1791789117);
        if ((i2 & 2) != 0) {
            gVar = C7888o1.f18893a.mo10901b();
        }
        if ((i2 & 4) != 0) {
            lVar = SwipeableV2Kt$rememberSwipeableV2State$1.f7903f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1791789117, i, -1, "androidx.compose.material.rememberSwipeableV2State (SwipeableV2.kt:477)");
        }
        SwipeableV2State.Companion companion = SwipeableV2State.f7904p;
        C7888o1 o1Var = C7888o1.f18893a;
        SwipeableV2State<T> swipeableV2State = (SwipeableV2State) RememberSaveableKt.m31343d(new Object[]{t, gVar, lVar}, companion.mo10576a(gVar, lVar, o1Var.mo10902d(), o1Var.mo10903f()), (String) null, new SwipeableV2Kt$rememberSwipeableV2State$2(t, gVar, lVar), oVar, 72, 4);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return swipeableV2State;
    }

    /* renamed from: k */
    public static final <T> float m13997k(Map<T, Float> map, T t) {
        Float f = map.get(t);
        if (f != null) {
            return f.floatValue();
        }
        throw new IllegalArgumentException(("Required anchor " + t + " was not found in anchors. Current anchors: " + C10977s0.m41430D0(map)).toString());
    }

    @C3044g0
    @C12579k
    /* renamed from: l */
    public static final <T> C8767m m13998l(@C12579k C8767m mVar, @C12579k SwipeableV2State<T> swipeableV2State, @C12579k Set<? extends T> set, @C12580l C3025a<T> aVar, @C12579k C11304p<? super T, ? super C16500q, Float> pVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(swipeableV2State, "state");
        Intrinsics.checkNotNullParameter(set, "possibleValues");
        Intrinsics.checkNotNullParameter(pVar, "calculateAnchor");
        SwipeableV2Kt$swipeAnchors$1 swipeableV2Kt$swipeAnchors$1 = new SwipeableV2Kt$swipeAnchors$1(swipeableV2State);
        SwipeableV2Kt$swipeAnchors$2 swipeableV2Kt$swipeAnchors$2 = new SwipeableV2Kt$swipeAnchors$2(swipeableV2State, set, aVar, pVar);
        if (InspectableValueKt.m71063e()) {
            lVar = new SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1(swipeableV2State, set, aVar, pVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SwipeAnchorsModifier(swipeableV2Kt$swipeAnchors$1, swipeableV2Kt$swipeAnchors$2, lVar));
    }

    /* renamed from: m */
    public static /* synthetic */ C8767m m13999m(C8767m mVar, SwipeableV2State swipeableV2State, Set set, C3025a aVar, C11304p pVar, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        return m13998l(mVar, swipeableV2State, set, aVar, pVar);
    }

    @C3044g0
    @C12579k
    /* renamed from: n */
    public static final <T> C8767m m14000n(@C12579k C8767m mVar, @C12579k SwipeableV2State<T> swipeableV2State, @C12579k Orientation orientation, boolean z, boolean z2, @C12580l C2243g gVar) {
        SwipeableV2State<T> swipeableV2State2 = swipeableV2State;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(swipeableV2State, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return DraggableKt.m9307k(mVar, swipeableV2State.mo10564p(), orientation, z, gVar, swipeableV2State.mo10574z(), (C11305q) null, new SwipeableV2Kt$swipeableV2$1(swipeableV2State, (C11045c<? super SwipeableV2Kt$swipeableV2$1>) null), z2, 32, (Object) null);
    }

    /* renamed from: o */
    public static /* synthetic */ C8767m m14001o(C8767m mVar, SwipeableV2State swipeableV2State, Orientation orientation, boolean z, boolean z2, C2243g gVar, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            gVar = null;
        }
        return m14000n(mVar, swipeableV2State, orientation, z3, z4, gVar);
    }
}
