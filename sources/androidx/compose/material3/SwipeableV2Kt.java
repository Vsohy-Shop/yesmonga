package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.material3.SwipeableV2State;
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
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,692:1\n135#2:693\n1#3:694\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt\n*L\n136#1:693\n*E\n"})
public final class SwipeableV2Kt {
    /* renamed from: d */
    public static final <T> T m26463d(Map<T, Float> map, float f, boolean z) {
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
    public static /* synthetic */ Object m26464e(Map map, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return m26463d(map, f, z);
    }

    @C8251n0
    @C12579k
    /* renamed from: f */
    public static final C11304p<C16479d, Float, Float> m26465f(float f) {
        return new SwipeableV2Kt$fixedPositionalThreshold$1(f);
    }

    @C8251n0
    @C12579k
    /* renamed from: g */
    public static final C11304p<C16479d, Float, Float> m26466g(float f) {
        return new SwipeableV2Kt$fractionalPositionalThreshold$1(f);
    }

    /* renamed from: h */
    public static final <T> Float m26467h(Map<T, Float> map) {
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
    public static final <T> Float m26468i(Map<T, Float> map) {
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

    @C8251n0
    @C8540g
    @C12579k
    /* renamed from: j */
    public static final <T> SwipeableV2State<T> m26469j(@C12579k T t, @C12580l C1968g<Float> gVar, @C12580l C11300l<? super T, Boolean> lVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(t, "initialValue");
        oVar.mo14918M(856267266);
        if ((i2 & 2) != 0) {
            gVar = C8374y2.f22489a.mo14799b();
        }
        if ((i2 & 4) != 0) {
            lVar = SwipeableV2Kt$rememberSwipeableV2State$1.f19787f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(856267266, i, -1, "androidx.compose.material3.rememberSwipeableV2State (SwipeableV2.kt:517)");
        }
        SwipeableV2State.Companion companion = SwipeableV2State.f19788q;
        C8374y2 y2Var = C8374y2.f22489a;
        SwipeableV2State<T> swipeableV2State = (SwipeableV2State) RememberSaveableKt.m31343d(new Object[]{t, gVar, lVar}, companion.mo12124a(gVar, lVar, y2Var.mo14800d(), y2Var.mo14801f()), (String) null, new SwipeableV2Kt$rememberSwipeableV2State$2(t, gVar, lVar), oVar, 72, 4);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return swipeableV2State;
    }

    @C8251n0
    @C12579k
    /* renamed from: k */
    public static final <T> C8767m m26470k(@C12579k C8767m mVar, @C12579k SwipeableV2State<T> swipeableV2State, @C12579k Set<? extends T> set, @C12580l C8179c<T> cVar, @C12579k C11304p<? super T, ? super C16500q, Float> pVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(swipeableV2State, "state");
        Intrinsics.checkNotNullParameter(set, "possibleValues");
        Intrinsics.checkNotNullParameter(pVar, "calculateAnchor");
        SwipeableV2Kt$swipeAnchors$1 swipeableV2Kt$swipeAnchors$1 = new SwipeableV2Kt$swipeAnchors$1(swipeableV2State);
        SwipeableV2Kt$swipeAnchors$2 swipeableV2Kt$swipeAnchors$2 = new SwipeableV2Kt$swipeAnchors$2(swipeableV2State, set, cVar, pVar);
        if (InspectableValueKt.m71063e()) {
            lVar = new SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1(swipeableV2State, set, cVar, pVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SwipeAnchorsModifier(swipeableV2Kt$swipeAnchors$1, swipeableV2Kt$swipeAnchors$2, lVar));
    }

    /* renamed from: l */
    public static /* synthetic */ C8767m m26471l(C8767m mVar, SwipeableV2State swipeableV2State, Set set, C8179c cVar, C11304p pVar, int i, Object obj) {
        if ((i & 4) != 0) {
            cVar = null;
        }
        return m26470k(mVar, swipeableV2State, set, cVar, pVar);
    }

    @C8251n0
    @C12579k
    /* renamed from: m */
    public static final <T> C8767m m26472m(@C12579k C8767m mVar, @C12579k SwipeableV2State<T> swipeableV2State, @C12579k Orientation orientation, boolean z, boolean z2, @C12580l C2243g gVar) {
        SwipeableV2State<T> swipeableV2State2 = swipeableV2State;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(swipeableV2State, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return DraggableKt.m9307k(mVar, swipeableV2State.mo12121y(), orientation, z, gVar, swipeableV2State.mo12091C(), (C11305q) null, new SwipeableV2Kt$swipeableV2$1(swipeableV2State, (C11045c<? super SwipeableV2Kt$swipeableV2$1>) null), z2, 32, (Object) null);
    }

    /* renamed from: n */
    public static /* synthetic */ C8767m m26473n(C8767m mVar, SwipeableV2State swipeableV2State, Orientation orientation, boolean z, boolean z2, C2243g gVar, int i, Object obj) {
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
        return m26472m(mVar, swipeableV2State, orientation, z3, z4, gVar);
    }
}
