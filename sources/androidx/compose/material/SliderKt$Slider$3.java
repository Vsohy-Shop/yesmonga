package androidx.compose.material;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2365i;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C11457f;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1189:1\n76#2:1190\n76#2:1191\n474#3,4:1192\n478#3,2:1200\n482#3:1206\n25#4:1196\n25#4:1207\n25#4:1214\n67#4,3:1221\n66#4:1224\n36#4:1231\n1114#5,3:1197\n1117#5,3:1203\n1114#5,6:1208\n1114#5,6:1215\n1114#5,6:1225\n1114#5,6:1232\n474#6:1202\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n*L\n176#1:1190\n181#1:1191\n192#1:1192,4\n192#1:1200,2\n192#1:1206\n192#1:1196\n193#1:1207\n194#1:1214\n196#1:1221,3\n196#1:1224\n236#1:1231\n192#1:1197,3\n192#1:1203,3\n193#1:1208,6\n194#1:1215,6\n196#1:1225,6\n236#1:1232,6\n192#1:1202\n*E\n"})
public final class SliderKt$Slider$3 extends Lambda implements C11305q<C2365i, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C3045g1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C11289a<C11079d2> $onValueChangeFinished;
    final /* synthetic */ C8578k2<C11300l<Float, C11079d2>> $onValueChangeState;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $value;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3(C11457f<Float> fVar, int i, float f, C2243g gVar, boolean z, List<Float> list, C3045g1 g1Var, C8578k2<? extends C11300l<? super Float, C11079d2>> k2Var, C11289a<C11079d2> aVar) {
        super(3);
        this.$valueRange = fVar;
        this.$$dirty = i;
        this.$value = f;
        this.$interactionSource = gVar;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$colors = g1Var;
        this.$onValueChangeState = k2Var;
        this.$onValueChangeFinished = aVar;
    }

    /* renamed from: d */
    public static final float m13823d(C11457f<Float> fVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
        return SliderKt.m13775D(fVar.getStart().floatValue(), fVar.mo23013q().floatValue(), f, floatRef.element, floatRef2.element);
    }

    /* renamed from: e */
    public static final float m13824e(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, C11457f<Float> fVar, float f) {
        return SliderKt.m13775D(floatRef.element, floatRef2.element, f, fVar.getStart().floatValue(), fVar.mo23013q().floatValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: androidx.compose.material.SliderDraggableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: kotlin.jvm.functions.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10396c(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2365i r31, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r32, int r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r8 = r32
            r2 = r33
            java.lang.String r3 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r2 & 14
            r4 = 2
            if (r3 != 0) goto L_0x001d
            boolean r3 = r8.mo15006n0(r1)
            if (r3 == 0) goto L_0x001a
            r3 = 4
            goto L_0x001b
        L_0x001a:
            r3 = r4
        L_0x001b:
            r3 = r3 | r2
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            r3 = r3 & 91
            r5 = 18
            if (r3 != r5) goto L_0x0030
            boolean r3 = r32.mo15011p()
            if (r3 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r32.mo14958a0()
            goto L_0x0270
        L_0x0030:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x003f
            r3 = -1
            java.lang.String r5 = "androidx.compose.material.Slider.<anonymous> (Slider.kt:174)"
            r6 = 2085116814(0x7c485b8e, float:4.1612653E36)
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r2, r3, r5)
        L_0x003f:
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r2 = r8.mo15032w(r2)
            androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.p004ui.unit.LayoutDirection.Rtl
            r9 = 0
            if (r2 != r3) goto L_0x0050
            r2 = 1
            r19 = r2
            goto L_0x0052
        L_0x0050:
            r19 = r9
        L_0x0052:
            long r1 = r31.mo8086b()
            int r1 = androidx.compose.p004ui.unit.C16476b.m74362p(r1)
            float r13 = (float) r1
            kotlin.jvm.internal.Ref$FloatRef r15 = new kotlin.jvm.internal.Ref$FloatRef
            r15.<init>()
            kotlin.jvm.internal.Ref$FloatRef r14 = new kotlin.jvm.internal.Ref$FloatRef
            r14.<init>()
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r1 = r8.mo15032w(r1)
            androidx.compose.ui.unit.d r1 = (androidx.compose.p004ui.unit.C16479d) r1
            float r2 = androidx.compose.material.SliderKt.m13772A()
            float r2 = r1.mo7425g5(r2)
            float r2 = r13 - r2
            r3 = 0
            float r2 = java.lang.Math.max(r2, r3)
            r15.element = r2
            float r2 = androidx.compose.material.SliderKt.m13772A()
            float r1 = r1.mo7425g5(r2)
            float r2 = r15.element
            float r1 = java.lang.Math.min(r1, r2)
            r14.element = r1
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r8.mo14918M(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo14918M(r1)
            java.lang.Object r2 = r32.mo14921N()
            androidx.compose.runtime.o$a r28 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r28.mo16277a()
            if (r2 != r5) goto L_0x00b7
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r2 = androidx.compose.runtime.EffectsKt.m29901m(r2, r8)
            androidx.compose.runtime.w r5 = new androidx.compose.runtime.w
            r5.<init>(r2)
            r8.mo14893C(r5)
            r2 = r5
        L_0x00b7:
            r32.mo15002m0()
            androidx.compose.runtime.w r2 = (androidx.compose.runtime.C8690w) r2
            kotlinx.coroutines.o0 r10 = r2.mo16831a()
            r32.mo15002m0()
            float r2 = r0.$value
            kotlin.ranges.f<java.lang.Float> r5 = r0.$valueRange
            r8.mo14918M(r1)
            java.lang.Object r6 = r32.mo14921N()
            java.lang.Object r7 = r28.mo16277a()
            r12 = 0
            if (r6 != r7) goto L_0x00e4
            float r2 = m13823d(r5, r14, r15, r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r2, r12, r4, r12)
            r8.mo14893C(r6)
        L_0x00e4:
            r32.mo15002m0()
            r16 = r6
            androidx.compose.runtime.z0 r16 = (androidx.compose.runtime.C8700z0) r16
            r8.mo14918M(r1)
            java.lang.Object r1 = r32.mo14921N()
            java.lang.Object r2 = r28.mo16277a()
            if (r1 != r2) goto L_0x0103
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r1, r12, r4, r12)
            r8.mo14893C(r1)
        L_0x0103:
            r32.mo15002m0()
            r17 = r1
            androidx.compose.runtime.z0 r17 = (androidx.compose.runtime.C8700z0) r17
            float r1 = r14.element
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r15.element
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            kotlin.ranges.f<java.lang.Float> r3 = r0.$valueRange
            androidx.compose.runtime.k2<kotlin.jvm.functions.l<java.lang.Float, kotlin.d2>> r4 = r0.$onValueChangeState
            r5 = 1618982084(0x607fb4c4, float:7.370227E19)
            r8.mo14918M(r5)
            boolean r1 = r8.mo15006n0(r1)
            boolean r2 = r8.mo15006n0(r2)
            r1 = r1 | r2
            boolean r2 = r8.mo15006n0(r3)
            r1 = r1 | r2
            java.lang.Object r2 = r32.mo14921N()
            if (r1 != 0) goto L_0x013a
            java.lang.Object r1 = r28.mo16277a()
            if (r2 != r1) goto L_0x0155
        L_0x013a:
            androidx.compose.material.SliderDraggableState r2 = new androidx.compose.material.SliderDraggableState
            androidx.compose.material.SliderKt$Slider$3$draggableState$1$1 r1 = new androidx.compose.material.SliderKt$Slider$3$draggableState$1$1
            r20 = r1
            r21 = r16
            r22 = r17
            r23 = r14
            r24 = r15
            r25 = r4
            r26 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r2.<init>(r1)
            r8.mo14893C(r2)
        L_0x0155:
            r32.mo15002m0()
            r29 = r2
            androidx.compose.material.SliderDraggableState r29 = (androidx.compose.material.SliderDraggableState) r29
            androidx.compose.material.SliderKt$Slider$3$2 r1 = new androidx.compose.material.SliderKt$Slider$3$2
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            r1.<init>(r2, r14, r15)
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            float r3 = r14.element
            float r4 = r15.element
            kotlin.ranges.f r3 = kotlin.ranges.C11478t.m44305e(r3, r4)
            float r5 = r0.$value
            int r4 = r0.$$dirty
            int r6 = r4 >> 9
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            int r4 = r4 << 12
            r7 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r7
            r7 = r6 | r4
            r4 = r16
            r6 = r32
            androidx.compose.material.SliderKt.m13782a(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1 r1 = new androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1
            java.util.List<java.lang.Float> r2 = r0.$tickFractions
            kotlin.jvm.functions.a<kotlin.d2> r3 = r0.$onValueChangeFinished
            r20 = r1
            r21 = r16
            r22 = r2
            r23 = r14
            r24 = r15
            r25 = r10
            r26 = r29
            r27 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            androidx.compose.runtime.k2 r1 = androidx.compose.runtime.C8415c2.m30251t(r1, r8, r9)
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.interaction.g r3 = r0.$interactionSource
            boolean r4 = r0.$enabled
            r10 = r2
            r11 = r29
            r5 = r12
            r12 = r3
            r3 = r14
            r14 = r19
            r6 = r15
            r15 = r16
            r16 = r1
            r18 = r4
            androidx.compose.ui.m r4 = androidx.compose.material.SliderKt.m13779H(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            androidx.compose.foundation.gestures.Orientation r12 = androidx.compose.foundation.gestures.Orientation.Horizontal
            boolean r15 = r29.mo10378h()
            boolean r13 = r0.$enabled
            androidx.compose.foundation.interaction.g r14 = r0.$interactionSource
            r16 = 0
            r7 = 1157296644(0x44faf204, float:2007.563)
            r8.mo14918M(r7)
            boolean r7 = r8.mo15006n0(r1)
            java.lang.Object r9 = r32.mo14921N()
            if (r7 != 0) goto L_0x01de
            java.lang.Object r7 = r28.mo16277a()
            if (r9 != r7) goto L_0x01e6
        L_0x01de:
            androidx.compose.material.SliderKt$Slider$3$drag$1$1 r9 = new androidx.compose.material.SliderKt$Slider$3$drag$1$1
            r9.<init>(r1, r5)
            r8.mo14893C(r9)
        L_0x01e6:
            r32.mo15002m0()
            r17 = r9
            kotlin.jvm.functions.q r17 = (kotlin.jvm.functions.C11305q) r17
            r1 = 32
            r20 = 0
            r10 = r2
            r11 = r29
            r18 = r19
            r19 = r1
            androidx.compose.ui.m r1 = androidx.compose.foundation.gestures.DraggableKt.m9307k(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r2 = r0.$value
            kotlin.ranges.f<java.lang.Float> r5 = r0.$valueRange
            java.lang.Comparable r5 = r5.getStart()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            kotlin.ranges.f<java.lang.Float> r7 = r0.$valueRange
            java.lang.Comparable r7 = r7.mo23013q()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r2 = kotlin.ranges.C11479u.m44331H(r2, r5, r7)
            kotlin.ranges.f<java.lang.Float> r5 = r0.$valueRange
            java.lang.Comparable r5 = r5.getStart()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            kotlin.ranges.f<java.lang.Float> r7 = r0.$valueRange
            java.lang.Comparable r7 = r7.mo23013q()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r2 = androidx.compose.material.SliderKt.m13807z(r5, r7, r2)
            boolean r5 = r0.$enabled
            java.util.List<java.lang.Float> r7 = r0.$tickFractions
            androidx.compose.material.g1 r9 = r0.$colors
            float r6 = r6.element
            float r3 = r3.element
            float r6 = r6 - r3
            androidx.compose.foundation.interaction.g r10 = r0.$interactionSource
            androidx.compose.ui.m r11 = r4.mo17224k3(r1)
            int r1 = r0.$$dirty
            int r3 = r1 >> 9
            r3 = r3 & 14
            r3 = r3 | 512(0x200, float:7.175E-43)
            int r4 = r1 >> 15
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            int r1 = r1 >> 6
            r4 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r4
            r12 = r3 | r1
            r1 = r5
            r3 = r7
            r4 = r9
            r5 = r6
            r6 = r10
            r7 = r11
            r8 = r32
            r9 = r12
            androidx.compose.material.SliderKt.m13786e(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0270
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$Slider$3.mo10396c(androidx.compose.foundation.layout.i, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10396c((C2365i) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
