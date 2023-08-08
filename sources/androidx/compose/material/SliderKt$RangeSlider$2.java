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
@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1189:1\n76#2:1190\n76#2:1191\n25#3:1192\n25#3:1199\n25#3:1210\n83#3,3:1221\n50#3:1230\n49#3:1231\n50#3:1238\n49#3:1239\n1114#4,6:1193\n1114#4,6:1200\n1114#4,3:1211\n1117#4,3:1217\n1114#4,6:1224\n1114#4,6:1232\n1114#4,6:1240\n474#5,4:1206\n478#5,2:1214\n482#5:1220\n474#6:1216\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n315#1:1190\n320#1:1191\n331#1:1192\n332#1:1199\n349#1:1210\n374#1:1221,3\n416#1:1230\n416#1:1231\n424#1:1238\n424#1:1239\n331#1:1193,6\n332#1:1200,6\n349#1:1211,3\n349#1:1217,3\n374#1:1224,6\n416#1:1232,6\n424#1:1240,6\n349#1:1206,4\n349#1:1214,2\n349#1:1220\n349#1:1216\n*E\n"})
public final class SliderKt$RangeSlider$2 extends Lambda implements C11305q<C2365i, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C3045g1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $endInteractionSource;
    final /* synthetic */ C11289a<C11079d2> $onValueChangeFinished;
    final /* synthetic */ C8578k2<C11300l<C11457f<Float>, C11079d2>> $onValueChangeState;
    final /* synthetic */ C2243g $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ C11457f<Float> $value;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2(C11457f<Float> fVar, C11457f<Float> fVar2, int i, C8578k2<? extends C11300l<? super C11457f<Float>, C11079d2>> k2Var, C2243g gVar, C2243g gVar2, boolean z, int i2, C11289a<C11079d2> aVar, List<Float> list, C3045g1 g1Var) {
        super(3);
        this.$valueRange = fVar;
        this.$value = fVar2;
        this.$$dirty = i;
        this.$onValueChangeState = k2Var;
        this.$startInteractionSource = gVar;
        this.$endInteractionSource = gVar2;
        this.$enabled = z;
        this.$steps = i2;
        this.$onValueChangeFinished = aVar;
        this.$tickFractions = list;
        this.$colors = g1Var;
    }

    /* renamed from: d */
    public static final float m13811d(C11457f<Float> fVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
        return SliderKt.m13775D(fVar.getStart().floatValue(), fVar.mo23013q().floatValue(), f, floatRef.element, floatRef2.element);
    }

    /* renamed from: e */
    public static final C11457f<Float> m13812e(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, C11457f<Float> fVar, C11457f<Float> fVar2) {
        return SliderKt.m13776E(floatRef.element, floatRef2.element, fVar2, fVar.getStart().floatValue(), fVar.mo23013q().floatValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01e2, code lost:
        if (r2 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x01e4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10383c(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2365i r31, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r32, int r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r12 = r32
            r2 = r33
            java.lang.String r3 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r2 & 14
            r9 = 2
            if (r3 != 0) goto L_0x001d
            boolean r3 = r12.mo15006n0(r1)
            if (r3 == 0) goto L_0x001a
            r3 = 4
            goto L_0x001b
        L_0x001a:
            r3 = r9
        L_0x001b:
            r3 = r3 | r2
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            r3 = r3 & 91
            r4 = 18
            if (r3 != r4) goto L_0x0030
            boolean r3 = r32.mo15011p()
            if (r3 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r32.mo14958a0()
            goto L_0x03a6
        L_0x0030:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x003f
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:313)"
            r5 = 652589923(0x26e5bb63, float:1.5940858E-15)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r2, r3, r4)
        L_0x003f:
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r2 = r12.mo15032w(r2)
            androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.p004ui.unit.LayoutDirection.Rtl
            r10 = 1
            r11 = 0
            if (r2 != r3) goto L_0x0050
            r19 = r10
            goto L_0x0052
        L_0x0050:
            r19 = r11
        L_0x0052:
            long r1 = r31.mo8086b()
            int r1 = androidx.compose.p004ui.unit.C16476b.m74362p(r1)
            float r15 = (float) r1
            kotlin.jvm.internal.Ref$FloatRef r14 = new kotlin.jvm.internal.Ref$FloatRef
            r14.<init>()
            kotlin.jvm.internal.Ref$FloatRef r13 = new kotlin.jvm.internal.Ref$FloatRef
            r13.<init>()
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r1 = r12.mo15032w(r1)
            androidx.compose.ui.unit.d r1 = (androidx.compose.p004ui.unit.C16479d) r1
            float r2 = androidx.compose.material.SliderKt.m13772A()
            float r2 = r1.mo7425g5(r2)
            float r2 = r15 - r2
            r14.element = r2
            float r2 = androidx.compose.material.SliderKt.m13772A()
            float r1 = r1.mo7425g5(r2)
            r13.element = r1
            kotlin.ranges.f<java.lang.Float> r1 = r0.$value
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.mo14918M(r7)
            java.lang.Object r3 = r32.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r16.mo16277a()
            r5 = 0
            if (r3 != r4) goto L_0x00b5
            java.lang.Comparable r1 = r1.getStart()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = m13811d(r2, r13, r14, r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r1, r5, r9, r5)
            r12.mo14893C(r3)
        L_0x00b5:
            r32.mo15002m0()
            r17 = r3
            androidx.compose.runtime.z0 r17 = (androidx.compose.runtime.C8700z0) r17
            kotlin.ranges.f<java.lang.Float> r1 = r0.$value
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            r12.mo14918M(r7)
            java.lang.Object r3 = r32.mo14921N()
            java.lang.Object r4 = r16.mo16277a()
            if (r3 != r4) goto L_0x00e6
            java.lang.Comparable r1 = r1.mo23013q()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = m13811d(r2, r13, r14, r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r1, r5, r9, r5)
            r12.mo14893C(r3)
        L_0x00e6:
            r32.mo15002m0()
            r18 = r3
            androidx.compose.runtime.z0 r18 = (androidx.compose.runtime.C8700z0) r18
            androidx.compose.material.SliderKt$RangeSlider$2$2 r1 = new androidx.compose.material.SliderKt$RangeSlider$2$2
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            r1.<init>(r2, r13, r14)
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            float r3 = r13.element
            float r4 = r14.element
            kotlin.ranges.f r3 = kotlin.ranges.C11478t.m44305e(r3, r4)
            kotlin.ranges.f<java.lang.Float> r4 = r0.$value
            java.lang.Comparable r4 = r4.getStart()
            java.lang.Number r4 = (java.lang.Number) r4
            float r5 = r4.floatValue()
            int r4 = r0.$$dirty
            int r4 = r4 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r6 = r4 | 3072(0xc00, float:4.305E-42)
            r4 = r17
            r20 = r6
            r6 = r32
            r8 = r7
            r7 = r20
            androidx.compose.material.SliderKt.m13782a(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.material.SliderKt$RangeSlider$2$3 r1 = new androidx.compose.material.SliderKt$RangeSlider$2$3
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            r1.<init>(r2, r13, r14)
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            float r3 = r13.element
            float r4 = r14.element
            kotlin.ranges.f r3 = kotlin.ranges.C11478t.m44305e(r3, r4)
            kotlin.ranges.f<java.lang.Float> r4 = r0.$value
            java.lang.Comparable r4 = r4.mo23013q()
            java.lang.Number r4 = (java.lang.Number) r4
            float r5 = r4.floatValue()
            int r4 = r0.$$dirty
            int r4 = r4 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r7 = r4 | 3072(0xc00, float:4.305E-42)
            r4 = r18
            androidx.compose.material.SliderKt.m13782a(r1, r2, r3, r4, r5, r6, r7)
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r12.mo14918M(r1)
            r12.mo14918M(r8)
            java.lang.Object r1 = r32.mo14921N()
            java.lang.Object r2 = r16.mo16277a()
            if (r1 != r2) goto L_0x016a
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r1 = androidx.compose.runtime.EffectsKt.m29901m(r1, r12)
            androidx.compose.runtime.w r2 = new androidx.compose.runtime.w
            r2.<init>(r1)
            r12.mo14893C(r2)
            r1 = r2
        L_0x016a:
            r32.mo15002m0()
            androidx.compose.runtime.w r1 = (androidx.compose.runtime.C8690w) r1
            kotlinx.coroutines.o0 r27 = r1.mo16831a()
            r32.mo15002m0()
            androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1 r1 = new androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1
            java.util.List<java.lang.Float> r2 = r0.$tickFractions
            kotlin.jvm.functions.a<kotlin.d2> r3 = r0.$onValueChangeFinished
            androidx.compose.runtime.k2<kotlin.jvm.functions.l<kotlin.ranges.f<java.lang.Float>, kotlin.d2>> r4 = r0.$onValueChangeState
            kotlin.ranges.f<java.lang.Float> r5 = r0.$valueRange
            r20 = r1
            r21 = r17
            r22 = r18
            r23 = r2
            r24 = r13
            r25 = r14
            r26 = r3
            r28 = r4
            r29 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.runtime.k2 r1 = androidx.compose.runtime.C8415c2.m30251t(r1, r12, r11)
            r2 = 7
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r11] = r17
            r3[r10] = r18
            kotlin.ranges.f<java.lang.Float> r4 = r0.$valueRange
            r3[r9] = r4
            float r4 = r13.element
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            float r4 = r14.element
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5 = 4
            r3[r5] = r4
            kotlin.ranges.f<java.lang.Float> r4 = r0.$value
            r5 = 5
            r3[r5] = r4
            androidx.compose.runtime.k2<kotlin.jvm.functions.l<kotlin.ranges.f<java.lang.Float>, kotlin.d2>> r5 = r0.$onValueChangeState
            r6 = 6
            r3[r6] = r5
            kotlin.ranges.f<java.lang.Float> r6 = r0.$valueRange
            r7 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r12.mo14918M(r7)
            r7 = r11
            r8 = r7
        L_0x01ca:
            if (r7 >= r2) goto L_0x01d6
            r9 = r3[r7]
            boolean r9 = r12.mo15006n0(r9)
            r8 = r8 | r9
            int r7 = r7 + 1
            goto L_0x01ca
        L_0x01d6:
            java.lang.Object r2 = r32.mo14921N()
            if (r8 != 0) goto L_0x01e4
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r2 != r3) goto L_0x01fc
        L_0x01e4:
            androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1 r2 = new androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
            r20 = r2
            r21 = r17
            r22 = r18
            r23 = r4
            r24 = r13
            r25 = r14
            r26 = r5
            r27 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r12.mo14893C(r2)
        L_0x01fc:
            r32.mo15002m0()
            androidx.compose.runtime.k2 r23 = androidx.compose.runtime.C8415c2.m30251t(r2, r12, r11)
            androidx.compose.ui.m$a r9 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.interaction.g r2 = r0.$startInteractionSource
            androidx.compose.foundation.interaction.g r3 = r0.$endInteractionSource
            boolean r4 = r0.$enabled
            kotlin.ranges.f<java.lang.Float> r5 = r0.$valueRange
            r10 = r13
            r13 = r9
            r11 = r14
            r14 = r2
            r2 = r15
            r15 = r3
            r16 = r17
            r17 = r18
            r18 = r4
            r20 = r2
            r21 = r5
            r22 = r1
            androidx.compose.ui.m r13 = androidx.compose.material.SliderKt.m13774C(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            kotlin.ranges.f<java.lang.Float> r1 = r0.$value
            java.lang.Comparable r1 = r1.getStart()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.getStart()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.f<java.lang.Float> r3 = r0.$value
            java.lang.Comparable r3 = r3.mo23013q()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r1 = kotlin.ranges.C11479u.m44331H(r1, r2, r3)
            kotlin.ranges.f<java.lang.Float> r2 = r0.$value
            java.lang.Comparable r2 = r2.mo23013q()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.f<java.lang.Float> r3 = r0.$value
            java.lang.Comparable r3 = r3.getStart()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            kotlin.ranges.f<java.lang.Float> r4 = r0.$valueRange
            java.lang.Comparable r4 = r4.mo23013q()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r14 = kotlin.ranges.C11479u.m44331H(r2, r3, r4)
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.getStart()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.f<java.lang.Float> r3 = r0.$valueRange
            java.lang.Comparable r3 = r3.mo23013q()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r15 = androidx.compose.material.SliderKt.m13807z(r2, r3, r1)
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.getStart()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.f<java.lang.Float> r3 = r0.$valueRange
            java.lang.Comparable r3 = r3.mo23013q()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r16 = androidx.compose.material.SliderKt.m13807z(r2, r3, r14)
            int r2 = r0.$steps
            float r2 = (float) r2
            float r2 = r2 * r16
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r8 = (int) r2
            int r2 = r0.$steps
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r15
            float r2 = r2 * r3
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r7 = (int) r2
            boolean r4 = r0.$enabled
            androidx.compose.runtime.k2<kotlin.jvm.functions.l<kotlin.ranges.f<java.lang.Float>, kotlin.d2>> r2 = r0.$onValueChangeState
            java.lang.Float r3 = java.lang.Float.valueOf(r14)
            androidx.compose.runtime.k2<kotlin.jvm.functions.l<kotlin.ranges.f<java.lang.Float>, kotlin.d2>> r5 = r0.$onValueChangeState
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.mo14918M(r6)
            boolean r2 = r12.mo15006n0(r2)
            boolean r3 = r12.mo15006n0(r3)
            r2 = r2 | r3
            java.lang.Object r3 = r32.mo14921N()
            if (r2 != 0) goto L_0x02ec
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x02f4
        L_0x02ec:
            androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1 r3 = new androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
            r3.<init>(r5, r14)
            r12.mo14893C(r3)
        L_0x02f4:
            r32.mo15002m0()
            r5 = r3
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            kotlin.jvm.functions.a<kotlin.d2> r3 = r0.$onValueChangeFinished
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.getStart()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.f r17 = kotlin.ranges.C11478t.m44305e(r2, r14)
            r2 = r9
            r18 = r3
            r3 = r1
            r31 = r13
            r13 = r6
            r6 = r18
            r18 = r7
            r7 = r17
            androidx.compose.ui.m r17 = androidx.compose.material.SliderKt.m13777F(r2, r3, r4, r5, r6, r7, r8)
            boolean r4 = r0.$enabled
            androidx.compose.runtime.k2<kotlin.jvm.functions.l<kotlin.ranges.f<java.lang.Float>, kotlin.d2>> r2 = r0.$onValueChangeState
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            androidx.compose.runtime.k2<kotlin.jvm.functions.l<kotlin.ranges.f<java.lang.Float>, kotlin.d2>> r5 = r0.$onValueChangeState
            r12.mo14918M(r13)
            boolean r2 = r12.mo15006n0(r2)
            boolean r3 = r12.mo15006n0(r3)
            r2 = r2 | r3
            java.lang.Object r3 = r32.mo14921N()
            if (r2 != 0) goto L_0x0341
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x0349
        L_0x0341:
            androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1 r3 = new androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
            r3.<init>(r5, r1)
            r12.mo14893C(r3)
        L_0x0349:
            r32.mo15002m0()
            r5 = r3
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            kotlin.jvm.functions.a<kotlin.d2> r6 = r0.$onValueChangeFinished
            kotlin.ranges.f<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.mo23013q()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            kotlin.ranges.f r7 = kotlin.ranges.C11478t.m44305e(r1, r2)
            r2 = r9
            r3 = r14
            r8 = r18
            androidx.compose.ui.m r13 = androidx.compose.material.SliderKt.m13777F(r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = r0.$enabled
            java.util.List<java.lang.Float> r4 = r0.$tickFractions
            androidx.compose.material.g1 r5 = r0.$colors
            float r2 = r11.element
            float r3 = r10.element
            float r6 = r2 - r3
            androidx.compose.foundation.interaction.g r7 = r0.$startInteractionSource
            androidx.compose.foundation.interaction.g r8 = r0.$endInteractionSource
            int r2 = r0.$$dirty
            int r3 = r2 >> 9
            r3 = r3 & 14
            r9 = 14159872(0xd81000, float:1.9842207E-38)
            r3 = r3 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            int r2 = r2 >> 9
            r2 = r2 & r9
            r14 = r3 | r2
            r18 = 0
            r2 = r15
            r3 = r16
            r9 = r31
            r10 = r17
            r11 = r13
            r12 = r32
            r13 = r14
            r14 = r18
            androidx.compose.material.SliderKt.m13784c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x03a6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$RangeSlider$2.mo10383c(androidx.compose.foundation.layout.i, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10383c((C2365i) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
