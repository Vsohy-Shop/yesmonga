package androidx.compose.material;

import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.C2193f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C7875k1;
import androidx.compose.material.ripple.C7922j;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.ShadowKt;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.contentsquare.android.api.C14092c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1189:1\n25#2:1190\n36#2:1198\n25#2:1206\n25#2:1213\n36#2:1220\n460#2,13:1247\n473#2,3:1264\n460#2,13:1288\n36#2:1306\n36#2:1313\n473#2,3:1320\n460#2,13:1344\n25#2:1358\n50#2:1365\n49#2:1366\n473#2,3:1374\n83#2,3:1393\n1114#3,6:1191\n1114#3,6:1199\n1114#3,6:1207\n1114#3,6:1214\n1114#3,6:1221\n1114#3,6:1307\n1114#3,6:1314\n1114#3,6:1359\n1114#3,6:1367\n1114#3,6:1396\n1#4:1197\n92#5:1205\n92#5:1227\n92#5:1262\n88#5:1263\n92#5:1303\n88#5:1304\n88#5:1305\n67#6,6:1228\n73#6:1260\n77#6:1268\n67#6,6:1269\n73#6:1301\n77#6:1324\n67#6,6:1325\n73#6:1357\n77#6:1378\n75#7:1234\n76#7,11:1236\n89#7:1267\n75#7:1275\n76#7,11:1277\n89#7:1323\n75#7:1331\n76#7,11:1333\n89#7:1377\n76#8:1235\n76#8:1261\n76#8:1276\n76#8:1302\n76#8:1332\n154#9:1373\n154#9:1403\n154#9:1404\n154#9:1405\n154#9:1406\n154#9:1407\n154#9:1408\n154#9:1409\n2333#10,14:1379\n135#11:1402\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n154#1:1190\n159#1:1198\n301#1:1206\n302#1:1213\n306#1:1220\n588#1:1247,13\n588#1:1264,3\n632#1:1288,13\n660#1:1306\n671#1:1313\n632#1:1320,3\n692#1:1344,13\n696#1:1358\n697#1:1365\n697#1:1366\n692#1:1374,3\n839#1:1393,3\n154#1:1191,6\n159#1:1199,6\n301#1:1207,6\n302#1:1214,6\n306#1:1221,6\n660#1:1307,6\n671#1:1314,6\n696#1:1359,6\n697#1:1367,6\n839#1:1396,6\n165#1:1205\n313#1:1227\n598#1:1262\n599#1:1263\n642#1:1303\n643#1:1304\n644#1:1305\n588#1:1228,6\n588#1:1260\n588#1:1268\n632#1:1269,6\n632#1:1301\n632#1:1324\n692#1:1325,6\n692#1:1357\n692#1:1378\n588#1:1234\n588#1:1236,11\n588#1:1267\n632#1:1275\n632#1:1277,11\n632#1:1323\n692#1:1331\n692#1:1333,11\n692#1:1377\n588#1:1235\n592#1:1261\n632#1:1276\n636#1:1302\n692#1:1332\n723#1:1373\n1148#1:1403\n1149#1:1404\n1150#1:1405\n1151#1:1406\n1154#1:1407\n1155#1:1408\n1156#1:1409\n797#1:1379,14\n934#1:1402\n*E\n"})
public final class SliderKt {

    /* renamed from: a */
    public static final float f7821a = C16483g.m74435M((float) 10);

    /* renamed from: b */
    public static final float f7822b = C16483g.m74435M((float) 24);

    /* renamed from: c */
    public static final float f7823c = C16483g.m74435M((float) 1);

    /* renamed from: d */
    public static final float f7824d = C16483g.m74435M((float) 6);

    /* renamed from: e */
    public static final float f7825e = C16483g.m74435M((float) 4);

    /* renamed from: f */
    public static final float f7826f;

    /* renamed from: g */
    public static final float f7827g;
    @C12579k

    /* renamed from: h */
    public static final C8767m f7828h;
    @C12579k

    /* renamed from: i */
    public static final C2023z0<Float> f7829i = new C2023z0(100, 0, (C2022z) null, 6, (DefaultConstructorMarker) null);

    static {
        float M = C16483g.m74435M((float) 48);
        f7826f = M;
        float M2 = C16483g.m74435M((float) C14092c.f34532K1);
        f7827g = M2;
        f7828h = SizeKt.m10117q(SizeKt.m10094J(C8767m.f23478j, M2, 0.0f, 2, (Object) null), 0.0f, M, 1, (Object) null);
    }

    /* renamed from: A */
    public static final float m13772A() {
        return f7821a;
    }

    /* renamed from: B */
    public static final float m13773B() {
        return f7825e;
    }

    /* renamed from: C */
    public static final C8767m m13774C(C8767m mVar, C2243g gVar, C2243g gVar2, C8578k2<Float> k2Var, C8578k2<Float> k2Var2, boolean z, boolean z2, float f, C11457f<Float> fVar, C8578k2<? extends C11300l<? super Boolean, C11079d2>> k2Var3, C8578k2<? extends C11304p<? super Boolean, ? super Float, C11079d2>> k2Var4) {
        if (!z) {
            return mVar;
        }
        C8767m mVar2 = mVar;
        return SuspendingPointerInputFilterKt.m68439e(mVar, new Object[]{gVar, gVar2, Float.valueOf(f), Boolean.valueOf(z2), fVar}, new SliderKt$rangeSliderPressDragModifier$1(gVar, gVar2, k2Var, k2Var2, k2Var4, z2, f, k2Var3, (C11045c<? super SliderKt$rangeSliderPressDragModifier$1>) null));
    }

    /* renamed from: D */
    public static final float m13775D(float f, float f2, float f3, float f4, float f5) {
        return C16515d.m74781a(f4, f5, m13807z(f, f2, f3));
    }

    /* renamed from: E */
    public static final C11457f<Float> m13776E(float f, float f2, C11457f<Float> fVar, float f3, float f4) {
        return C11478t.m44305e(m13775D(f, f2, fVar.getStart().floatValue(), f3, f4), m13775D(f, f2, fVar.mo23013q().floatValue(), f3, f4));
    }

    /* renamed from: F */
    public static final C8767m m13777F(C8767m mVar, float f, boolean z, C11300l<? super Float, C11079d2> lVar, C11289a<C11079d2> aVar, C11457f<Float> fVar, int i) {
        return ProgressSemanticsKt.m9052b(SemanticsModifierKt.m71868c(mVar, false, new SliderKt$sliderSemantics$1(z, fVar, i, C11479u.m44331H(f, fVar.getStart().floatValue(), fVar.mo23013q().floatValue()), lVar, aVar), 1, (Object) null), f, fVar, i);
    }

    /* renamed from: G */
    public static /* synthetic */ C8767m m13778G(C8767m mVar, float f, boolean z, C11300l lVar, C11289a aVar, C11457f<Float> fVar, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            aVar = null;
        }
        C11289a aVar2 = aVar;
        if ((i2 & 16) != 0) {
            fVar = C11478t.m44305e(0.0f, 1.0f);
        }
        C11457f<Float> fVar2 = fVar;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        return m13777F(mVar, f, z, lVar, aVar2, fVar2, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m13779H(androidx.compose.p004ui.C8767m r11, androidx.compose.foundation.gestures.C2193f r12, androidx.compose.foundation.interaction.C2243g r13, float r14, boolean r15, androidx.compose.runtime.C8578k2<java.lang.Float> r16, androidx.compose.runtime.C8578k2<? extends kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2>> r17, androidx.compose.runtime.C8700z0<java.lang.Float> r18, boolean r19) {
        /*
            boolean r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r0 == 0) goto L_0x0019
            androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x001d
        L_0x0019:
            kotlin.jvm.functions.l r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x001d:
            androidx.compose.material.SliderKt$sliderTapModifier$2 r10 = new androidx.compose.material.SliderKt$sliderTapModifier$2
            r1 = r10
            r2 = r19
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r18
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r11
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r11, r0, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m13779H(androidx.compose.ui.m, androidx.compose.foundation.gestures.f, androidx.compose.foundation.interaction.g, float, boolean, androidx.compose.runtime.k2, androidx.compose.runtime.k2, androidx.compose.runtime.z0, boolean):androidx.compose.ui.m");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Number} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float m13780I(float r5, java.util.List<java.lang.Float> r6, float r7, float r8) {
        /*
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x000e
            r6 = 0
            goto L_0x004d
        L_0x000e:
            java.lang.Object r0 = r6.next()
            boolean r1 = r6.hasNext()
            if (r1 != 0) goto L_0x001a
        L_0x0018:
            r6 = r0
            goto L_0x004d
        L_0x001a:
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = androidx.compose.p004ui.util.C16515d.m74781a(r7, r8, r1)
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
        L_0x002a:
            java.lang.Object r2 = r6.next()
            r3 = r2
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = androidx.compose.p004ui.util.C16515d.m74781a(r7, r8, r3)
            float r3 = r3 - r5
            float r3 = java.lang.Math.abs(r3)
            int r4 = java.lang.Float.compare(r1, r3)
            if (r4 <= 0) goto L_0x0046
            r0 = r2
            r1 = r3
        L_0x0046:
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L_0x002a
            goto L_0x0018
        L_0x004d:
            java.lang.Float r6 = (java.lang.Float) r6
            if (r6 == 0) goto L_0x0059
            float r5 = r6.floatValue()
            float r5 = androidx.compose.p004ui.util.C16515d.m74781a(r7, r8, r5)
        L_0x0059:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m13780I(float, java.util.List, float, float):float");
    }

    /* renamed from: J */
    public static final List<Float> m13781J(int i) {
        if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        int i2 = i + 2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(((float) i3) / ((float) (i + 1))));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bb, code lost:
        if (r0 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x00bd;
     */
    @androidx.compose.runtime.C8540g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13782a(kotlin.jvm.functions.C11300l<? super java.lang.Float, java.lang.Float> r15, kotlin.ranges.C11457f<java.lang.Float> r16, kotlin.ranges.C11457f<java.lang.Float> r17, androidx.compose.runtime.C8700z0<java.lang.Float> r18, float r19, androidx.compose.runtime.C8592o r20, int r21) {
        /*
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r21
            r0 = -743965752(0xffffffffd3a7fbc8, float:-1.44296745E12)
            r1 = r20
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r10 & 14
            r2 = 4
            r3 = 2
            if (r1 != 0) goto L_0x0023
            boolean r1 = r11.mo14927P(r15)
            if (r1 == 0) goto L_0x0020
            r1 = r2
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            r1 = r1 | r10
            goto L_0x0024
        L_0x0023:
            r1 = r10
        L_0x0024:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0034
            boolean r4 = r11.mo15006n0(r7)
            if (r4 == 0) goto L_0x0031
            r4 = 32
            goto L_0x0033
        L_0x0031:
            r4 = 16
        L_0x0033:
            r1 = r1 | r4
        L_0x0034:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0044
            boolean r4 = r11.mo15006n0(r8)
            if (r4 == 0) goto L_0x0041
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r1 = r1 | r4
        L_0x0044:
            r4 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0054
            boolean r4 = r11.mo15006n0(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r1 = r1 | r4
        L_0x0054:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r10
            r12 = r19
            if (r4 != 0) goto L_0x0068
            boolean r4 = r11.mo14968d(r12)
            if (r4 == 0) goto L_0x0065
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r1 = r1 | r4
        L_0x0068:
            r4 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r4
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r4) goto L_0x007b
            boolean r1 = r11.mo15011p()
            if (r1 != 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            r11.mo14958a0()
            goto L_0x00e0
        L_0x007b:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0087
            r1 = -1
            java.lang.String r4 = "androidx.compose.material.CorrectValueSideEffect (Slider.kt:831)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r1, r4)
        L_0x0087:
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r13 = 0
            r1[r13] = r7
            r4 = 1
            r1[r4] = r6
            java.lang.Float r4 = java.lang.Float.valueOf(r19)
            r1[r3] = r4
            r3 = 3
            r1[r3] = r9
            r1[r2] = r8
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r11.mo14918M(r2)
            r2 = r13
            r3 = r2
        L_0x00a3:
            if (r2 >= r0) goto L_0x00af
            r4 = r1[r2]
            boolean r4 = r11.mo15006n0(r4)
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00af:
            java.lang.Object r0 = r11.mo14921N()
            if (r3 != 0) goto L_0x00bd
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x00cf
        L_0x00bd:
            androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1 r14 = new androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
            r0 = r14
            r1 = r16
            r2 = r15
            r3 = r19
            r4 = r18
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r11.mo14893C(r14)
        L_0x00cf:
            r11.mo15002m0()
            kotlin.jvm.functions.a r0 = (kotlin.jvm.functions.C11289a) r0
            androidx.compose.runtime.EffectsKt.m29899k(r0, r11, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00e0
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00e0:
            androidx.compose.runtime.t1 r11 = r11.mo15020s()
            if (r11 != 0) goto L_0x00e7
            goto L_0x00fb
        L_0x00e7:
            androidx.compose.material.SliderKt$CorrectValueSideEffect$2 r13 = new androidx.compose.material.SliderKt$CorrectValueSideEffect$2
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.mo15202a(r13)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m13782a(kotlin.jvm.functions.l, kotlin.ranges.f, kotlin.ranges.f, androidx.compose.runtime.z0, float, androidx.compose.runtime.o, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0119  */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13783b(@org.jetbrains.annotations.C12579k kotlin.ranges.C11457f<java.lang.Float> r42, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlin.ranges.C11457f<java.lang.Float>, kotlin.C11079d2> r43, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r44, boolean r45, @org.jetbrains.annotations.C12580l kotlin.ranges.C11457f<java.lang.Float> r46, int r47, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r48, @org.jetbrains.annotations.C12580l androidx.compose.material.C3045g1 r49, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r50, int r51, int r52) {
        /*
            r12 = r42
            r13 = r43
            r14 = r51
            r15 = r52
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -1556183027(0xffffffffa33e880d, float:-1.03287305E-17)
            r1 = r50
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r14 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.mo15006n0(r12)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r14
            goto L_0x0032
        L_0x0031:
            r1 = r14
        L_0x0032:
            r4 = r15 & 2
            if (r4 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r4 = r14 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            boolean r4 = r11.mo14927P(r13)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
        L_0x0049:
            r4 = r15 & 4
            if (r4 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r5 = r14 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0063
            r5 = r44
            boolean r6 = r11.mo15006n0(r5)
            if (r6 == 0) goto L_0x005f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r6
            goto L_0x0065
        L_0x0063:
            r5 = r44
        L_0x0065:
            r6 = r15 & 8
            if (r6 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r7 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r45
            boolean r8 = r11.mo14961b(r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r8
            goto L_0x0081
        L_0x007f:
            r7 = r45
        L_0x0081:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r14
            if (r8 != 0) goto L_0x009c
            r8 = r15 & 16
            if (r8 != 0) goto L_0x0096
            r8 = r46
            boolean r9 = r11.mo15006n0(r8)
            if (r9 == 0) goto L_0x0098
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0096:
            r8 = r46
        L_0x0098:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r9
            goto L_0x009e
        L_0x009c:
            r8 = r46
        L_0x009e:
            r9 = r15 & 32
            if (r9 == 0) goto L_0x00a6
            r10 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r10
            goto L_0x00bb
        L_0x00a6:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x00bb
            r10 = r47
            boolean r16 = r11.mo14976f(r10)
            if (r16 == 0) goto L_0x00b6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r16
            goto L_0x00bd
        L_0x00bb:
            r10 = r47
        L_0x00bd:
            r16 = r15 & 64
            if (r16 == 0) goto L_0x00c8
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r3 = r48
            goto L_0x00dd
        L_0x00c8:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r14 & r17
            r3 = r48
            if (r17 != 0) goto L_0x00dd
            boolean r17 = r11.mo14927P(r3)
            if (r17 == 0) goto L_0x00d9
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r17
        L_0x00dd:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r14 & r17
            if (r17 != 0) goto L_0x00f9
            r2 = r15 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f2
            r2 = r49
            boolean r17 = r11.mo15006n0(r2)
            if (r17 == 0) goto L_0x00f4
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f2:
            r2 = r49
        L_0x00f4:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r17
            goto L_0x00fb
        L_0x00f9:
            r2 = r49
        L_0x00fb:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r1 & r17
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0119
            boolean r0 = r11.mo15011p()
            if (r0 != 0) goto L_0x010c
            goto L_0x0119
        L_0x010c:
            r11.mo14958a0()
            r4 = r7
            r6 = r10
            r14 = r11
            r7 = r3
            r3 = r5
            r5 = r8
            r8 = r49
            goto L_0x029b
        L_0x0119:
            r11.mo14930Q()
            r0 = r14 & 1
            r2 = 0
            r41 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r12 = 1
            if (r0 == 0) goto L_0x015b
            boolean r0 = r11.mo14977f0()
            if (r0 == 0) goto L_0x012f
            goto L_0x015b
        L_0x012f:
            r11.mo14958a0()
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0138
            r1 = r1 & r17
        L_0x0138:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x014d
            r0 = r1 & r41
            r21 = r49
            r20 = r3
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r10
            r3 = r0
            goto L_0x01b3
        L_0x014d:
            r21 = r49
            r20 = r3
        L_0x0151:
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r10
            r3 = r1
            goto L_0x01b3
        L_0x015b:
            if (r4 == 0) goto L_0x0160
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r5 = r0
        L_0x0160:
            if (r6 == 0) goto L_0x0163
            r7 = r12
        L_0x0163:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0171
            r0 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.f r0 = kotlin.ranges.C11478t.m44305e(r0, r4)
            r1 = r1 & r17
            r8 = r0
        L_0x0171:
            if (r9 == 0) goto L_0x0174
            r10 = r2
        L_0x0174:
            if (r16 == 0) goto L_0x0178
            r0 = 0
            goto L_0x0179
        L_0x0178:
            r0 = r3
        L_0x0179:
            r3 = r15 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x01a6
            androidx.compose.material.h1 r16 = androidx.compose.material.C3048h1.f8126a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r38 = 0
            r39 = 6
            r40 = 1023(0x3ff, float:1.434E-42)
            r37 = r11
            androidx.compose.material.g1 r3 = r16.mo10774a(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r39, r40)
            r1 = r1 & r41
            r20 = r0
            r21 = r3
            goto L_0x0151
        L_0x01a6:
            r21 = r49
            r20 = r0
            r3 = r1
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r10
        L_0x01b3:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01c5
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.RangeSlider (Slider.kt:289)"
            r4 = -1556183027(0xffffffffa33e880d, float:-1.03287305E-17)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r3, r0, r1)
        L_0x01c5:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r0)
            java.lang.Object r1 = r11.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r4.mo16277a()
            if (r1 != r5) goto L_0x01de
            androidx.compose.foundation.interaction.g r1 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r1)
        L_0x01de:
            r11.mo15002m0()
            r5 = r1
            androidx.compose.foundation.interaction.g r5 = (androidx.compose.foundation.interaction.C2243g) r5
            r11.mo14918M(r0)
            java.lang.Object r0 = r11.mo14921N()
            java.lang.Object r1 = r4.mo16277a()
            if (r0 != r1) goto L_0x01f8
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r0)
        L_0x01f8:
            r11.mo15002m0()
            r6 = r0
            androidx.compose.foundation.interaction.g r6 = (androidx.compose.foundation.interaction.C2243g) r6
            if (r19 < 0) goto L_0x0201
            r2 = r12
        L_0x0201:
            if (r2 == 0) goto L_0x02b4
            int r0 = r3 >> 3
            r0 = r0 & 14
            androidx.compose.runtime.k2 r7 = androidx.compose.runtime.C8415c2.m30251t(r13, r11, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r1)
            boolean r0 = r11.mo15006n0(r0)
            java.lang.Object r1 = r11.mo14921N()
            if (r0 != 0) goto L_0x0225
            java.lang.Object r0 = r4.mo16277a()
            if (r1 != r0) goto L_0x022c
        L_0x0225:
            java.util.List r1 = m13781J(r19)
            r11.mo14893C(r1)
        L_0x022c:
            r11.mo15002m0()
            r10 = r1
            java.util.List r10 = (java.util.List) r10
            androidx.compose.ui.m r22 = androidx.compose.material.InteractiveComponentSizeKt.m13549f(r16)
            float r0 = f7821a
            r1 = 4
            float r1 = (float) r1
            float r1 = r1 * r0
            float r23 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r1 = 2
            float r1 = (float) r1
            float r0 = r0 * r1
            float r24 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r25 = 0
            r26 = 0
            r27 = 12
            r28 = 0
            androidx.compose.ui.m r22 = androidx.compose.foundation.layout.SizeKt.m10125y(r22, r23, r24, r25, r26, r27, r28)
            r23 = 0
            r24 = 0
            androidx.compose.material.SliderKt$RangeSlider$2 r9 = new androidx.compose.material.SliderKt$RangeSlider$2
            r0 = r9
            r1 = r18
            r2 = r42
            r4 = r7
            r7 = r17
            r8 = r19
            r13 = r9
            r9 = r20
            r14 = r11
            r11 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 652589923(0x26e5bb63, float:1.5940858E-15)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r0, r12, r13)
            r1 = 3072(0xc00, float:4.305E-42)
            r2 = 6
            r44 = r22
            r45 = r23
            r46 = r24
            r47 = r0
            r48 = r14
            r49 = r1
            r50 = r2
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m9860a(r44, r45, r46, r47, r48, r49, r50)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x028f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x028f:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
        L_0x029b:
            androidx.compose.runtime.t1 r11 = r14.mo15020s()
            if (r11 != 0) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            androidx.compose.material.SliderKt$RangeSlider$3 r12 = new androidx.compose.material.SliderKt$RangeSlider$3
            r0 = r12
            r1 = r42
            r2 = r43
            r9 = r51
            r10 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x02b3:
            return
        L_0x02b4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m13783b(kotlin.ranges.f, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, kotlin.ranges.f, int, kotlin.jvm.functions.a, androidx.compose.material.g1, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m13784c(boolean z, float f, float f2, List<Float> list, C3045g1 g1Var, float f3, C2243g gVar, C2243g gVar2, C8767m mVar, C8767m mVar2, C8767m mVar3, C8592o oVar, int i, int i2) {
        int i3 = i;
        C8592o o = oVar.mo15009o(-278895713);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-278895713, i3, i2, "androidx.compose.material.RangeSliderImpl (Slider.kt:615)");
        } else {
            int i4 = i2;
        }
        C7875k1.C7876a aVar = C7875k1.f18863b;
        String a = C7879l1.m25061a(aVar.mo10867g(), o, 6);
        String a2 = C7879l1.m25061a(aVar.mo10866f(), o, 6);
        C8767m k3 = mVar.mo17224k3(f7828h);
        o.mo14918M(733328855);
        C8734c.C8735a aVar2 = C8734c.f23406a;
        C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a3 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(k3);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a3);
        } else {
            o.mo14888A();
        }
        o.mo14941U();
        C8592o b = Updater.m30180b(o);
        Updater.m30188j(b, k, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        o.mo14972e();
        f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        float g5 = dVar2.mo7425g5(f7825e);
        float f5 = f7821a;
        float g52 = dVar2.mo7425g5(f5);
        float M = dVar2.mo7418M(f3);
        float M2 = C16483g.m74435M(f5 * ((float) 2));
        float M3 = C16483g.m74435M(M * f);
        float M4 = C16483g.m74435M(M * f2);
        C8767m.C8768a aVar3 = C8767m.f23478j;
        int i5 = i3 >> 9;
        int i6 = i3 << 6;
        int i7 = i5;
        String str = a2;
        C8767m.C8768a aVar4 = aVar3;
        BoxScopeInstance boxScopeInstance2 = boxScopeInstance;
        m13788g(SizeKt.m10112l(boxScopeInstance.mo7701c(aVar3, aVar2.mo17069o()), 0.0f, 1, (Object) null), g1Var, z, f, f2, list, g52, g5, o, (i5 & 112) | 262144 | (i6 & 896) | (i6 & 7168) | (i6 & 57344));
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(a);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new SliderKt$RangeSliderImpl$1$2$1(a);
            o.mo14893C(N);
        }
        o.mo15002m0();
        int i8 = i3 & 57344;
        int i9 = (i3 << 15) & 458752;
        m13787f(boxScopeInstance2, FocusableKt.m8919b(SemanticsModifierKt.m71867b(aVar4, true, (C11300l) N), true, gVar).mo17224k3(mVar2), M3, gVar, g1Var, z, M2, o, (i7 & 7168) | 1572870 | i8 | i9);
        o.mo14918M(1157296644);
        String str2 = str;
        boolean n02 = o.mo15006n0(str2);
        Object N2 = o.mo14921N();
        if (n02 || N2 == C8592o.f23032a.mo16277a()) {
            N2 = new SliderKt$RangeSliderImpl$1$3$1(str2);
            o.mo14893C(N2);
        }
        o.mo15002m0();
        m13787f(boxScopeInstance2, FocusableKt.m8919b(SemanticsModifierKt.m71867b(aVar4, true, (C11300l) N2), true, gVar2).mo17224k3(mVar3), M4, gVar2, g1Var, z, M2, o, ((i3 >> 12) & 7168) | 1572870 | i8 | i9);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            SliderKt$RangeSliderImpl$2 sliderKt$RangeSliderImpl$2 = r0;
            SliderKt$RangeSliderImpl$2 sliderKt$RangeSliderImpl$22 = new SliderKt$RangeSliderImpl$2(z, f, f2, list, g1Var, f3, gVar, gVar2, mVar, mVar2, mVar3, i, i2);
            s.mo15202a(sliderKt$RangeSliderImpl$2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0118  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13785d(float r39, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r40, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r41, boolean r42, @org.jetbrains.annotations.C12580l kotlin.ranges.C11457f<java.lang.Float> r43, int r44, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r46, @org.jetbrains.annotations.C12580l androidx.compose.material.C3045g1 r47, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r48, int r49, int r50) {
        /*
            r2 = r40
            r10 = r49
            r11 = r50
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = -1962335196(0xffffffff8b092424, float:-2.641243E-32)
            r1 = r48
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x001e
            r3 = r10 | 6
            r5 = r3
            r3 = r39
            goto L_0x0032
        L_0x001e:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x002f
            r3 = r39
            boolean r5 = r1.mo14968d(r3)
            if (r5 == 0) goto L_0x002c
            r5 = 4
            goto L_0x002d
        L_0x002c:
            r5 = 2
        L_0x002d:
            r5 = r5 | r10
            goto L_0x0032
        L_0x002f:
            r3 = r39
            r5 = r10
        L_0x0032:
            r6 = r11 & 2
            if (r6 == 0) goto L_0x0039
            r5 = r5 | 48
            goto L_0x0049
        L_0x0039:
            r6 = r10 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0049
            boolean r6 = r1.mo14927P(r2)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r5 = r5 | r6
        L_0x0049:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0050
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0063
            r7 = r41
            boolean r8 = r1.mo15006n0(r7)
            if (r8 == 0) goto L_0x005f
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r5 = r5 | r8
            goto L_0x0065
        L_0x0063:
            r7 = r41
        L_0x0065:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006c
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007f
            r9 = r42
            boolean r12 = r1.mo14961b(r9)
            if (r12 == 0) goto L_0x007b
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r5 = r5 | r12
            goto L_0x0081
        L_0x007f:
            r9 = r42
        L_0x0081:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x009c
            r12 = r11 & 16
            if (r12 != 0) goto L_0x0096
            r12 = r43
            boolean r13 = r1.mo15006n0(r12)
            if (r13 == 0) goto L_0x0098
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0096:
            r12 = r43
        L_0x0098:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r5 = r5 | r13
            goto L_0x009e
        L_0x009c:
            r12 = r43
        L_0x009e:
            r13 = r11 & 32
            if (r13 == 0) goto L_0x00a6
            r14 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r14
            goto L_0x00ba
        L_0x00a6:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00ba
            r14 = r44
            boolean r15 = r1.mo14976f(r14)
            if (r15 == 0) goto L_0x00b6
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r5 = r5 | r15
            goto L_0x00bc
        L_0x00ba:
            r14 = r44
        L_0x00bc:
            r15 = r11 & 64
            if (r15 == 0) goto L_0x00c7
            r16 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r16
            r4 = r45
            goto L_0x00dc
        L_0x00c7:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            r4 = r45
            if (r16 != 0) goto L_0x00dc
            boolean r16 = r1.mo14927P(r4)
            if (r16 == 0) goto L_0x00d8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r5 = r5 | r16
        L_0x00dc:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e7
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r16
            r3 = r46
            goto L_0x00fc
        L_0x00e7:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r10 & r16
            r3 = r46
            if (r16 != 0) goto L_0x00fc
            boolean r16 = r1.mo15006n0(r3)
            if (r16 == 0) goto L_0x00f8
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r5 = r5 | r16
        L_0x00fc:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x0118
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0111
            r3 = r47
            boolean r16 = r1.mo15006n0(r3)
            if (r16 == 0) goto L_0x0113
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0111:
            r3 = r47
        L_0x0113:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r5 = r5 | r16
            goto L_0x011a
        L_0x0118:
            r3 = r47
        L_0x011a:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r5 & r16
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r4) goto L_0x013a
            boolean r3 = r1.mo15011p()
            if (r3 != 0) goto L_0x012b
            goto L_0x013a
        L_0x012b:
            r1.mo14958a0()
            r8 = r46
            r3 = r7
            r4 = r9
            r5 = r12
            r6 = r14
            r7 = r45
            r9 = r47
            goto L_0x02b2
        L_0x013a:
            r1.mo14930Q()
            r3 = r10 & 1
            r37 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = 1
            if (r3 == 0) goto L_0x0174
            boolean r3 = r1.mo14977f0()
            if (r3 == 0) goto L_0x014f
            goto L_0x0174
        L_0x014f:
            r1.mo14958a0()
            r0 = r11 & 16
            if (r0 == 0) goto L_0x0158
            r5 = r5 & r16
        L_0x0158:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0169
            r0 = r5 & r37
            r8 = r45
            r5 = r47
            r3 = r12
            r6 = r14
            r14 = r0
            r0 = r46
            goto L_0x01e3
        L_0x0169:
            r8 = r45
            r0 = r46
            r3 = r12
            r6 = r14
        L_0x016f:
            r14 = r5
            r5 = r47
            goto L_0x01e3
        L_0x0174:
            if (r6 == 0) goto L_0x0179
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r7 = r3
        L_0x0179:
            if (r8 == 0) goto L_0x017c
            r9 = r4
        L_0x017c:
            r3 = r11 & 16
            if (r3 == 0) goto L_0x018a
            r3 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.f r3 = kotlin.ranges.C11478t.m44305e(r3, r6)
            r5 = r5 & r16
            goto L_0x018b
        L_0x018a:
            r3 = r12
        L_0x018b:
            if (r13 == 0) goto L_0x018f
            r6 = 0
            goto L_0x0190
        L_0x018f:
            r6 = r14
        L_0x0190:
            if (r15 == 0) goto L_0x0194
            r8 = 0
            goto L_0x0196
        L_0x0194:
            r8 = r45
        L_0x0196:
            if (r0 == 0) goto L_0x01b7
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r0)
            java.lang.Object r0 = r1.mo14921N()
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r0 != r12) goto L_0x01b1
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r1.mo14893C(r0)
        L_0x01b1:
            r1.mo15002m0()
            androidx.compose.foundation.interaction.g r0 = (androidx.compose.foundation.interaction.C2243g) r0
            goto L_0x01b9
        L_0x01b7:
            r0 = r46
        L_0x01b9:
            r12 = r11 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x016f
            androidx.compose.material.h1 r12 = androidx.compose.material.C3048h1.f8126a
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r34 = 0
            r35 = 6
            r36 = 1023(0x3ff, float:1.434E-42)
            r33 = r1
            androidx.compose.material.g1 r12 = r12.mo10774a(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35, r36)
            r5 = r5 & r37
            r14 = r5
            r5 = r12
        L_0x01e3:
            r1.mo14899E()
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x01f5
            r12 = -1
            java.lang.String r13 = "androidx.compose.material.Slider (Slider.kt:144)"
            r15 = -1962335196(0xffffffff8b092424, float:-2.641243E-32)
            androidx.compose.runtime.ComposerKt.m29845w0(r15, r14, r12, r13)
        L_0x01f5:
            if (r6 < 0) goto L_0x01fa
            r38 = r4
            goto L_0x01fc
        L_0x01fa:
            r38 = 0
        L_0x01fc:
            if (r38 == 0) goto L_0x02cb
            int r12 = r14 >> 3
            r12 = r12 & 14
            androidx.compose.runtime.k2 r20 = androidx.compose.runtime.C8415c2.m30251t(r2, r1, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r13 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r13)
            boolean r12 = r1.mo15006n0(r12)
            java.lang.Object r13 = r1.mo14921N()
            if (r12 != 0) goto L_0x0222
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r13 != r12) goto L_0x0229
        L_0x0222:
            java.util.List r13 = m13781J(r6)
            r1.mo14893C(r13)
        L_0x0229:
            r1.mo15002m0()
            r18 = r13
            java.util.List r18 = (java.util.List) r18
            androidx.compose.ui.m r12 = androidx.compose.material.InteractiveComponentSizeKt.m13549f(r7)
            float r13 = f7821a
            r15 = 2
            float r15 = (float) r15
            float r16 = r13 * r15
            float r16 = androidx.compose.p004ui.unit.C16483g.m74435M(r16)
            float r13 = r13 * r15
            float r13 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            r15 = 0
            r17 = 0
            r19 = 12
            r21 = 0
            r41 = r12
            r42 = r16
            r43 = r13
            r44 = r15
            r45 = r17
            r46 = r19
            r47 = r21
            androidx.compose.ui.m r12 = androidx.compose.foundation.layout.SizeKt.m10125y(r41, r42, r43, r44, r45, r46, r47)
            r41 = r12
            r42 = r39
            r43 = r9
            r44 = r40
            r45 = r8
            r46 = r3
            r47 = r6
            androidx.compose.ui.m r12 = m13777F(r41, r42, r43, r44, r45, r46, r47)
            androidx.compose.ui.m r22 = androidx.compose.foundation.FocusableKt.m8919b(r12, r9, r0)
            r23 = 0
            r24 = 0
            androidx.compose.material.SliderKt$Slider$3 r15 = new androidx.compose.material.SliderKt$Slider$3
            r12 = r15
            r13 = r3
            r2 = r15
            r15 = r39
            r16 = r0
            r17 = r9
            r19 = r5
            r21 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r12 = 2085116814(0x7c485b8e, float:4.1612653E36)
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r12, r4, r2)
            r4 = 3072(0xc00, float:4.305E-42)
            r12 = 6
            r41 = r22
            r42 = r23
            r43 = r24
            r44 = r2
            r45 = r1
            r46 = r4
            r47 = r12
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m9860a(r41, r42, r43, r44, r45, r46, r47)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x02ac
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02ac:
            r4 = r9
            r9 = r5
            r5 = r3
            r3 = r7
            r7 = r8
            r8 = r0
        L_0x02b2:
            androidx.compose.runtime.t1 r12 = r1.mo15020s()
            if (r12 != 0) goto L_0x02b9
            goto L_0x02ca
        L_0x02b9:
            androidx.compose.material.SliderKt$Slider$4 r13 = new androidx.compose.material.SliderKt$Slider$4
            r0 = r13
            r1 = r39
            r2 = r40
            r10 = r49
            r11 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x02ca:
            return
        L_0x02cb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m13785d(float, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, kotlin.ranges.f, int, kotlin.jvm.functions.a, androidx.compose.foundation.interaction.g, androidx.compose.material.g1, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m13786e(boolean z, float f, List<Float> list, C3045g1 g1Var, float f2, C2243g gVar, C8767m mVar, C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(1679682785);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1679682785, i2, -1, "androidx.compose.material.SliderImpl (Slider.kt:578)");
        }
        C8767m k3 = mVar.mo17224k3(f7828h);
        o.mo14918M(733328855);
        C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(k3);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a);
        } else {
            o.mo14888A();
        }
        o.mo14941U();
        C8592o b = Updater.m30180b(o);
        Updater.m30188j(b, k, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        o.mo14972e();
        f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        float g5 = dVar2.mo7425g5(f7825e);
        float f4 = f7821a;
        float g52 = dVar2.mo7425g5(f4);
        float M = dVar2.mo7418M(f2);
        float M2 = C16483g.m74435M(f4 * ((float) 2));
        float M3 = C16483g.m74435M(M * f);
        C8767m.C8768a aVar = C8767m.f23478j;
        int i3 = i2 >> 6;
        m13788g(SizeKt.m10112l(aVar, 0.0f, 1, (Object) null), g1Var, z, 0.0f, f, list, g52, g5, o, (i3 & 112) | 265222 | ((i2 << 6) & 896) | ((i2 << 9) & 57344));
        m13787f(boxScopeInstance, aVar, M3, gVar, g1Var, z, M2, o, (i3 & 7168) | 1572918 | ((i2 << 3) & 57344) | ((i2 << 15) & 458752));
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SliderKt$SliderImpl$2(z, f, list, g1Var, f2, gVar, mVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m13787f(C2362h hVar, C8767m mVar, float f, C2243g gVar, C3045g1 g1Var, boolean z, float f2, C8592o oVar, int i) {
        int i2;
        float f3;
        float f4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C2362h hVar2 = hVar;
        C8767m mVar2 = mVar;
        C2243g gVar2 = gVar;
        C3045g1 g1Var2 = g1Var;
        boolean z2 = z;
        float f5 = f2;
        int i10 = i;
        C8592o o = oVar.mo15009o(428907178);
        if ((i10 & 14) == 0) {
            if (o.mo15006n0(hVar2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i10;
        } else {
            i2 = i10;
        }
        if ((i10 & 112) == 0) {
            if (o.mo15006n0(mVar2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        float f6 = f;
        if ((i10 & 896) == 0) {
            if (o.mo14968d(f6)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i10 & 7168) == 0) {
            if (o.mo15006n0(gVar2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((57344 & i10) == 0) {
            if (o.mo15006n0(g1Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((458752 & i10) == 0) {
            if (o.mo14961b(z2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((3670016 & i10) == 0) {
            if (o.mo14968d(f5)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((2995931 & i11) != 599186 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(428907178, i11, -1, "androidx.compose.material.SliderThumb (Slider.kt:683)");
            }
            C8767m o2 = PaddingKt.m10028o(C8767m.f23478j, f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            C8734c.C8735a aVar = C8734c.f23406a;
            C8767m c = hVar2.mo7701c(o2, aVar.mo17069o());
            o.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(aVar.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f7 = LayoutKt.m68908f(c);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f7.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar2 = C8592o.f23032a;
            if (N == aVar2.mo16277a()) {
                N = C8415c2.m30237f();
                o.mo14893C(N);
            }
            o.mo15002m0();
            SnapshotStateList snapshotStateList = (SnapshotStateList) N;
            int i12 = i11 >> 9;
            int i13 = i12 & 14;
            o.mo14918M(511388516);
            boolean n0 = o.mo15006n0(gVar2) | o.mo15006n0(snapshotStateList);
            Object N2 = o.mo14921N();
            if (n0 || N2 == aVar2.mo16277a()) {
                N2 = new SliderKt$SliderThumb$1$1$1(gVar2, snapshotStateList, (C11045c<? super SliderKt$SliderThumb$1$1$1>) null);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            EffectsKt.m29896h(gVar2, (C11304p) N2, o, i13 | 64);
            if (!snapshotStateList.isEmpty()) {
                f3 = f7824d;
            } else {
                f3 = f7823c;
            }
            int i14 = i11;
            float f8 = f3;
            C8767m b2 = HoverableKt.m8951b(IndicationKt.m8973b(SizeKt.m10089E(mVar2, f5, f5), gVar2, C7922j.m25285e(false, f7822b, 0, o, 54, 4)), gVar2, false, 2, (Object) null);
            if (z2) {
                f4 = f8;
            } else {
                f4 = C16483g.m74435M((float) 0);
            }
            C2428y0.m10726a(BackgroundKt.m8824c(ShadowKt.m32495b(b2, f4, C2694o.m12169k(), false, 0, 0, 24, (Object) null), g1Var2.mo10767c(z2, o, ((i14 >> 15) & 14) | (i12 & 112)).getValue().mo42833M(), C2694o.m12169k()), o, 0);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SliderKt$SliderThumb$2(hVar, mVar, f, gVar, g1Var, z, f2, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m13788g(C8767m mVar, C3045g1 g1Var, boolean z, float f, float f2, List<Float> list, float f3, float f4, C8592o oVar, int i) {
        C3045g1 g1Var2 = g1Var;
        boolean z2 = z;
        int i2 = i;
        C8592o o = oVar.mo15009o(1833126050);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1833126050, i2, -1, "androidx.compose.material.Track (Slider.kt:729)");
        }
        int i3 = ((i2 >> 6) & 14) | 48 | ((i2 << 3) & 896);
        C8767m mVar2 = mVar;
        CanvasKt.m8873b(mVar2, new SliderKt$Track$1(f3, g1Var2.mo10765a(z2, false, o, i3), f4, f2, f, g1Var2.mo10765a(z2, true, o, i3), list, g1Var2.mo10766b(z2, false, o, i3), g1Var2.mo10766b(z2, true, o, i3)), o, i2 & 14);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SliderKt$Track$2(mVar, g1Var, z, f, f2, list, f3, f4, i));
        }
    }

    /* renamed from: x */
    public static final Object m13805x(C2193f fVar, float f, float f2, float f3, C11045c<? super C11079d2> cVar) {
        Object c = C2193f.m9521c(fVar, (MutatePriority) null, new SliderKt$animateToTarget$2(f, f2, f3, (C11045c<? super SliderKt$animateToTarget$2>) null), cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m13806y(androidx.compose.p004ui.input.pointer.C15465c r8, long r9, int r11, kotlin.coroutines.C11045c<? super kotlin.Pair<androidx.compose.p004ui.input.pointer.C15507w, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
            r0.<init>(r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0054
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            kotlin.C11661u0.m45747n(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>(r12)
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.m13429a(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r7 = r12
            r12 = r8
            r8 = r7
        L_0x0054:
            androidx.compose.ui.input.pointer.w r12 = (androidx.compose.p004ui.input.pointer.C15507w) r12
            if (r12 == 0) goto L_0x0063
            float r8 = r8.element
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r8)
            kotlin.Pair r8 = kotlin.C11078d1.m42659a(r12, r8)
            goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m13806y(androidx.compose.ui.input.pointer.c, long, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: z */
    public static final float m13807z(float f, float f2, float f3) {
        float f4 = f2 - f;
        return C11479u.m44331H((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }
}
