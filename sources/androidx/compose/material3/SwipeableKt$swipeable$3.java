package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"T", "Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableKt$swipeable$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,886:1\n76#2:887\n36#3:888\n1114#4,6:889\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableKt$swipeable$3\n*L\n589#1:887\n612#1:888\n612#1:889,6\n*E\n"})
public final class SwipeableKt$swipeable$3 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ Map<Float, T> $anchors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ C8177b2 $resistance;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ SwipeableState<T> $state;
    final /* synthetic */ C11304p<T, T, C8201f3> $thresholds;
    final /* synthetic */ float $velocityThreshold;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$3(Map<Float, ? extends T> map, SwipeableState<T> swipeableState, Orientation orientation, boolean z, C2243g gVar, boolean z2, C8177b2 b2Var, C11304p<? super T, ? super T, ? extends C8201f3> pVar, float f) {
        super(3);
        this.$anchors = map;
        this.$state = swipeableState;
        this.$orientation = orientation;
        this.$enabled = z;
        this.$interactionSource = gVar;
        this.$reverseDirection = z2;
        this.$resistance = b2Var;
        this.$thresholds = pVar;
        this.$velocityThreshold = f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo12030a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            java.lang.String r2 = "$this$composed"
            r3 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            r2 = 1169892884(0x45bb2614, float:5988.76)
            r1.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.swipeable.<anonymous> (Swipeable.kt:581)"
            r5 = r27
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r5, r3, r4)
        L_0x001f:
            java.util.Map<java.lang.Float, T> r2 = r0.$anchors
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00da
            java.util.Map<java.lang.Float, T> r2 = r0.$anchors
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40578V1(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            java.util.Map<java.lang.Float, T> r4 = r0.$anchors
            int r4 = r4.size()
            if (r2 != r4) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 == 0) goto L_0x00ce
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r1.mo15032w(r2)
            r7 = r2
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.material3.SwipeableState<T> r2 = r0.$state
            java.util.Map<java.lang.Float, T> r3 = r0.$anchors
            r2.mo12054l(r3)
            java.util.Map<java.lang.Float, T> r2 = r0.$anchors
            androidx.compose.material3.SwipeableState<T> r11 = r0.$state
            androidx.compose.material3.SwipeableKt$swipeable$3$3 r12 = new androidx.compose.material3.SwipeableKt$swipeable$3$3
            androidx.compose.material3.b2 r6 = r0.$resistance
            kotlin.jvm.functions.p<T, T, androidx.compose.material3.f3> r8 = r0.$thresholds
            float r9 = r0.$velocityThreshold
            r10 = 0
            r3 = r12
            r4 = r11
            r5 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3 = 520(0x208, float:7.29E-43)
            androidx.compose.runtime.EffectsKt.m29895g(r2, r11, r12, r1, r3)
            androidx.compose.ui.m$a r13 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.material3.SwipeableState<T> r2 = r0.$state
            boolean r18 = r2.mo12038E()
            androidx.compose.material3.SwipeableState<T> r2 = r0.$state
            androidx.compose.foundation.gestures.f r14 = r2.mo12060s()
            androidx.compose.foundation.gestures.Orientation r15 = r0.$orientation
            boolean r2 = r0.$enabled
            androidx.compose.foundation.interaction.g r3 = r0.$interactionSource
            r19 = 0
            androidx.compose.material3.SwipeableState<T> r4 = r0.$state
            r5 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r5)
            boolean r5 = r1.mo15006n0(r4)
            java.lang.Object r6 = r26.mo14921N()
            if (r5 != 0) goto L_0x00a1
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x00aa
        L_0x00a1:
            androidx.compose.material3.SwipeableKt$swipeable$3$4$1 r6 = new androidx.compose.material3.SwipeableKt$swipeable$3$4$1
            r5 = 0
            r6.<init>(r4, r5)
            r1.mo14893C(r6)
        L_0x00aa:
            r26.mo15002m0()
            r20 = r6
            kotlin.jvm.functions.q r20 = (kotlin.jvm.functions.C11305q) r20
            boolean r4 = r0.$reverseDirection
            r22 = 32
            r23 = 0
            r16 = r2
            r17 = r3
            r21 = r4
            androidx.compose.ui.m r2 = androidx.compose.foundation.gestures.DraggableKt.m9307k(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x00ca
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00ca:
            r26.mo15002m0()
            return r2
        L_0x00ce:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "You cannot have two anchors mapped to the same state."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00da:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "You must have at least one anchor."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableKt$swipeable$3.mo12030a(androidx.compose.ui.m, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo12030a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
