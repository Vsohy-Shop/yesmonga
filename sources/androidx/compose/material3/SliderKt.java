package androidx.compose.material3;

import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.C2193f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.C8352z0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16485h;
import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import com.contentsquare.android.api.C14092c;
import kotlin.C11079d2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10953k0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11478t;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1508:1\n25#2:1509\n25#2:1517\n25#2:1524\n25#2:1531\n25#2:1538\n25#2:1545\n50#2:1552\n49#2:1553\n36#2:1560\n25#2:1567\n25#2:1574\n25#2:1582\n25#2:1589\n25#2:1596\n36#2:1603\n36#2:1610\n456#2,11:1630\n460#2,13:1660\n473#2,3:1674\n460#2,13:1698\n473#2,3:1712\n467#2,3:1717\n50#2:1721\n49#2:1722\n36#2:1729\n25#2:1736\n25#2:1743\n25#2:1750\n25#2:1758\n25#2:1765\n25#2:1772\n36#2:1779\n25#2:1786\n50#2:1793\n49#2:1794\n50#2:1801\n49#2:1802\n456#2,11:1822\n36#2:1833\n460#2,13:1859\n473#2,3:1873\n36#2:1878\n460#2,13:1904\n473#2,3:1918\n460#2,13:1942\n473#2,3:1956\n467#2,3:1961\n1114#3,6:1510\n1114#3,6:1518\n1114#3,6:1525\n1114#3,6:1532\n1114#3,6:1539\n1114#3,6:1546\n1114#3,6:1554\n1114#3,6:1561\n1114#3,6:1568\n1114#3,6:1575\n1114#3,6:1583\n1114#3,6:1590\n1114#3,6:1597\n1114#3,6:1604\n1114#3,6:1611\n1114#3,6:1723\n1114#3,6:1730\n1114#3,6:1737\n1114#3,6:1744\n1114#3,6:1751\n1114#3,6:1759\n1114#3,6:1766\n1114#3,6:1773\n1114#3,6:1780\n1114#3,6:1787\n1114#3,6:1795\n1114#3,6:1803\n1114#3,6:1834\n1114#3,6:1879\n1#4:1516\n76#5:1581\n76#5:1618\n76#5:1648\n76#5:1686\n76#5:1757\n76#5:1810\n76#5:1847\n76#5:1892\n76#5:1930\n74#6:1617\n75#6,11:1619\n75#6:1647\n76#6,11:1649\n89#6:1677\n75#6:1685\n76#6,11:1687\n89#6:1715\n88#6:1720\n74#6:1809\n75#6,11:1811\n75#6:1846\n76#6,11:1848\n89#6:1876\n75#6:1891\n76#6,11:1893\n89#6:1921\n75#6:1929\n76#6,11:1931\n89#6:1959\n88#6:1964\n67#7,6:1641\n73#7:1673\n77#7:1678\n67#7,6:1679\n73#7:1711\n77#7:1716\n67#7,6:1840\n73#7:1872\n77#7:1877\n67#7,6:1885\n73#7:1917\n77#7:1922\n67#7,6:1923\n73#7:1955\n77#7:1960\n16867#8,14:1965\n135#9:1979\n76#10:1980\n102#10,2:1981\n76#10:1983\n102#10,2:1984\n76#10:1986\n102#10,2:1987\n154#11:1989\n154#11:1990\n154#11:1991\n154#11:1992\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n*L\n157#1:1509\n252#1:1517\n331#1:1524\n332#1:1531\n437#1:1538\n438#1:1545\n494#1:1552\n494#1:1553\n500#1:1560\n504#1:1567\n505#1:1574\n514#1:1582\n515#1:1589\n519#1:1596\n525#1:1603\n559#1:1610\n564#1:1630,11\n566#1:1660,13\n566#1:1674,3\n567#1:1698,13\n567#1:1712,3\n564#1:1717,3\n642#1:1721\n642#1:1722\n648#1:1729\n652#1:1736\n653#1:1743\n654#1:1750\n666#1:1758\n667#1:1765\n668#1:1772\n670#1:1779\n719#1:1786\n734#1:1793\n734#1:1794\n742#1:1801\n742#1:1802\n751#1:1822,11\n755#1:1833\n753#1:1859,13\n753#1:1873,3\n763#1:1878\n761#1:1904,13\n761#1:1918,3\n769#1:1942,13\n769#1:1956,3\n751#1:1961,3\n157#1:1510,6\n252#1:1518,6\n331#1:1525,6\n332#1:1532,6\n437#1:1539,6\n438#1:1546,6\n494#1:1554,6\n500#1:1561,6\n504#1:1568,6\n505#1:1575,6\n514#1:1583,6\n515#1:1590,6\n519#1:1597,6\n525#1:1604,6\n559#1:1611,6\n642#1:1723,6\n648#1:1730,6\n652#1:1737,6\n653#1:1744,6\n654#1:1751,6\n666#1:1759,6\n667#1:1766,6\n668#1:1773,6\n670#1:1780,6\n719#1:1787,6\n734#1:1795,6\n742#1:1803,6\n755#1:1834,6\n763#1:1879,6\n513#1:1581\n564#1:1618\n566#1:1648\n567#1:1686\n656#1:1757\n751#1:1810\n753#1:1847\n761#1:1892\n769#1:1930\n564#1:1617\n564#1:1619,11\n566#1:1647\n566#1:1649,11\n566#1:1677\n567#1:1685\n567#1:1687,11\n567#1:1715\n564#1:1720\n751#1:1809\n751#1:1811,11\n753#1:1846\n753#1:1848,11\n753#1:1876\n761#1:1891\n761#1:1893,11\n761#1:1921\n769#1:1929\n769#1:1931,11\n769#1:1959\n751#1:1964\n566#1:1641,6\n566#1:1673\n566#1:1678\n567#1:1679,6\n567#1:1711\n567#1:1716\n753#1:1840,6\n753#1:1872\n753#1:1877\n761#1:1885,6\n761#1:1917\n761#1:1922\n769#1:1923,6\n769#1:1955\n769#1:1960\n1081#1:1965,14\n1201#1:1979\n652#1:1980\n652#1:1981,2\n653#1:1983\n653#1:1984,2\n654#1:1986\n654#1:1987,2\n1416#1:1989\n1417#1:1990\n1422#1:1991\n1423#1:1992\n*E\n"})
public final class SliderKt {

    /* renamed from: a */
    public static final float f19668a;

    /* renamed from: b */
    public static final float f19669b;

    /* renamed from: c */
    public static final long f19670c;

    /* renamed from: d */
    public static final float f19671d = C16483g.m74435M((float) 1);

    /* renamed from: e */
    public static final float f19672e = C16483g.m74435M((float) 6);

    /* renamed from: f */
    public static final float f19673f;

    /* renamed from: g */
    public static final float f19674g;

    /* renamed from: h */
    public static final float f19675h;

    /* renamed from: i */
    public static final float f19676i;
    @C12579k

    /* renamed from: j */
    public static final C8767m f19677j;
    @C12579k

    /* renamed from: k */
    public static final C2023z0<Float> f19678k = new C2023z0(100, 0, (C2022z) null, 6, (DefaultConstructorMarker) null);

    static {
        C8352z0 z0Var = C8352z0.f22392a;
        float m = z0Var.mo14700m();
        f19668a = m;
        float k = z0Var.mo14698k();
        f19669b = k;
        f19670c = C16485h.m74483b(m, k);
        f19673f = z0Var.mo14684C();
        f19674g = z0Var.mo14703p();
        float M = C16483g.m74435M((float) 48);
        f19675h = M;
        float M2 = C16483g.m74435M((float) C14092c.f34532K1);
        f19676i = M2;
        f19677j = SizeKt.m10117q(SizeKt.m10094J(C8767m.f23478j, M2, 0.0f, 2, (Object) null), 0.0f, M, 1, (Object) null);
    }

    /* renamed from: L */
    public static final Object m26192L(C2193f fVar, float f, float f2, float f3, C11045c<? super C11079d2> cVar) {
        Object c = C2193f.m9521c(fVar, (MutatePriority) null, new SliderKt$animateToTarget$2(f, f2, f3, (C11045c<? super SliderKt$animateToTarget$2>) null), cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m26193M(androidx.compose.p004ui.input.pointer.C15465c r8, long r9, int r11, kotlin.coroutines.C11045c<? super kotlin.Pair<androidx.compose.p004ui.input.pointer.C15507w, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
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
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>(r12)
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.DragGestureDetectorCopyKt.m25705a(r1, r2, r4, r5, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m26193M(androidx.compose.ui.input.pointer.c, long, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: N */
    public static final float m26194N(float f, float f2, float f3) {
        float f4 = f2 - f;
        return C11479u.m44331H((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    /* renamed from: O */
    public static final float m26195O() {
        return f19668a;
    }

    /* renamed from: P */
    public static final float m26196P() {
        return f19674g;
    }

    /* renamed from: Q */
    public static final C8767m m26197Q(C8767m mVar, C2243g gVar, C2243g gVar2, C8578k2<Float> k2Var, C8578k2<Float> k2Var2, boolean z, boolean z2, int i, C11457f<Float> fVar, C8578k2<? extends C11300l<? super Boolean, C11079d2>> k2Var3, C8578k2<? extends C11304p<? super Boolean, ? super Float, C11079d2>> k2Var4) {
        if (!z) {
            return mVar;
        }
        C8767m mVar2 = mVar;
        return SuspendingPointerInputFilterKt.m68439e(mVar, new Object[]{gVar, gVar2, Integer.valueOf(i), Boolean.valueOf(z2), fVar}, new SliderKt$rangeSliderPressDragModifier$1(gVar, gVar2, k2Var, k2Var2, k2Var4, z2, i, k2Var3, (C11045c<? super SliderKt$rangeSliderPressDragModifier$1>) null));
    }

    /* renamed from: R */
    public static final float m26198R(float f, float f2, float f3, float f4, float f5) {
        return C16515d.m74781a(f4, f5, m26194N(f, f2, f3));
    }

    /* renamed from: S */
    public static final C11457f<Float> m26199S(float f, float f2, C11457f<Float> fVar, float f3, float f4) {
        return C11478t.m44305e(m26198R(f, f2, fVar.getStart().floatValue(), f3, f4), m26198R(f, f2, fVar.mo23013q().floatValue(), f3, f4));
    }

    /* renamed from: T */
    public static final C8767m m26200T(C8767m mVar, float f, boolean z, C11300l<? super Float, C11079d2> lVar, C11289a<C11079d2> aVar, C11457f<Float> fVar, int i) {
        return ProgressSemanticsKt.m9052b(SemanticsModifierKt.m71868c(mVar, false, new SliderKt$sliderSemantics$1(z, fVar, i, C11479u.m44331H(f, fVar.getStart().floatValue(), fVar.mo23013q().floatValue()), lVar, aVar), 1, (Object) null), f, fVar, i);
    }

    /* renamed from: U */
    public static /* synthetic */ C8767m m26201U(C8767m mVar, float f, boolean z, C11300l lVar, C11289a aVar, C11457f<Float> fVar, int i, int i2, Object obj) {
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
        return m26200T(mVar, f, z, lVar, aVar2, fVar2, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: androidx.compose.material3.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.material3.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m26202V(androidx.compose.p004ui.C8767m r11, androidx.compose.foundation.gestures.C2193f r12, androidx.compose.foundation.interaction.C2243g r13, int r14, boolean r15, androidx.compose.runtime.C8578k2<java.lang.Float> r16, androidx.compose.runtime.C8578k2<? extends kotlin.jvm.functions.C11289a<kotlin.C11079d2>> r17, androidx.compose.runtime.C8700z0<java.lang.Float> r18, boolean r19) {
        /*
            boolean r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r0 == 0) goto L_0x0019
            androidx.compose.material3.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.material3.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
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
            androidx.compose.material3.SliderKt$sliderTapModifier$2 r10 = new androidx.compose.material3.SliderKt$sliderTapModifier$2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m26202V(androidx.compose.ui.m, androidx.compose.foundation.gestures.f, androidx.compose.foundation.interaction.g, int, boolean, androidx.compose.runtime.k2, androidx.compose.runtime.k2, androidx.compose.runtime.z0, boolean):androidx.compose.ui.m");
    }

    /* renamed from: W */
    public static final float m26203W(float f, float[] fArr, float f2, float f3) {
        boolean z;
        Float f4;
        if (fArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = null;
        } else {
            float f5 = fArr[0];
            int Ue = ArraysKt___ArraysKt.m39427Ue(fArr);
            if (Ue == 0) {
                f4 = Float.valueOf(f5);
            } else {
                float abs = Math.abs(C16515d.m74781a(f2, f3, f5) - f);
                C10953k0 H = new C11466l(1, Ue).iterator();
                while (H.hasNext()) {
                    float f6 = fArr[H.mo6374c()];
                    float abs2 = Math.abs(C16515d.m74781a(f2, f3, f6) - f);
                    if (Float.compare(abs, abs2) > 0) {
                        f5 = f6;
                        abs = abs2;
                    }
                }
                f4 = Float.valueOf(f5);
            }
        }
        if (f4 != null) {
            return C16515d.m74781a(f2, f3, f4.floatValue());
        }
        return f;
    }

    /* renamed from: X */
    public static final float[] m26204X(int i) {
        if (i == 0) {
            return new float[0];
        }
        int i2 = i + 2;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = ((float) i3) / ((float) (i + 1));
        }
        return fArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011c  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26205a(@org.jetbrains.annotations.C12579k kotlin.ranges.C11457f<java.lang.Float> r44, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlin.ranges.C11457f<java.lang.Float>, kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r46, boolean r47, @org.jetbrains.annotations.C12580l kotlin.ranges.C11457f<java.lang.Float> r48, int r49, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r50, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8258o2 r51, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r52, int r53, int r54) {
        /*
            r15 = r44
            r14 = r45
            r13 = r53
            r12 = r54
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -743091416(0xffffffffd3b55328, float:-1.55756842E12)
            r1 = r52
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.mo15006n0(r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0049
            boolean r2 = r11.mo14927P(r14)
            if (r2 == 0) goto L_0x0046
            r2 = 32
            goto L_0x0048
        L_0x0046:
            r2 = 16
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0063
            r3 = r46
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
            goto L_0x0065
        L_0x0063:
            r3 = r46
        L_0x0065:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007f
            r5 = r47
            boolean r6 = r11.mo14961b(r5)
            if (r6 == 0) goto L_0x007b
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r6
            goto L_0x0081
        L_0x007f:
            r5 = r47
        L_0x0081:
            r6 = 57344(0xe000, float:8.0356E-41)
            r7 = r13 & r6
            if (r7 != 0) goto L_0x009d
            r7 = r12 & 16
            if (r7 != 0) goto L_0x0097
            r7 = r48
            boolean r8 = r11.mo15006n0(r7)
            if (r8 == 0) goto L_0x0099
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0097:
            r7 = r48
        L_0x0099:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r1 = r1 | r8
            goto L_0x009f
        L_0x009d:
            r7 = r48
        L_0x009f:
            r8 = r12 & 32
            r9 = 458752(0x70000, float:6.42848E-40)
            if (r8 == 0) goto L_0x00a9
            r10 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r10
            goto L_0x00bd
        L_0x00a9:
            r10 = r13 & r9
            if (r10 != 0) goto L_0x00bd
            r10 = r49
            boolean r16 = r11.mo14976f(r10)
            if (r16 == 0) goto L_0x00b8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r16
            goto L_0x00bf
        L_0x00bd:
            r10 = r49
        L_0x00bf:
            r16 = r12 & 64
            r41 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00cc
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r9 = r50
            goto L_0x00df
        L_0x00cc:
            r17 = r13 & r41
            r9 = r50
            if (r17 != 0) goto L_0x00df
            boolean r17 = r11.mo14927P(r9)
            if (r17 == 0) goto L_0x00db
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r1 = r1 | r17
        L_0x00df:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00fb
            r6 = r12 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x00f4
            r6 = r51
            boolean r17 = r11.mo15006n0(r6)
            if (r17 == 0) goto L_0x00f6
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f4:
            r6 = r51
        L_0x00f6:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r1 = r1 | r17
            goto L_0x00fd
        L_0x00fb:
            r6 = r51
        L_0x00fd:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r1 & r17
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x011c
            boolean r0 = r11.mo15011p()
            if (r0 != 0) goto L_0x010e
            goto L_0x011c
        L_0x010e:
            r11.mo14958a0()
            r3 = r46
            r4 = r5
            r8 = r6
            r5 = r7
            r7 = r9
            r6 = r10
            r21 = r11
            goto L_0x0274
        L_0x011c:
            r11.mo14930Q()
            r0 = r13 & 1
            r42 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = 1
            if (r0 == 0) goto L_0x014b
            boolean r0 = r11.mo14977f0()
            if (r0 == 0) goto L_0x0131
            goto L_0x014b
        L_0x0131:
            r11.mo14958a0()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x013a
            r1 = r1 & r17
        L_0x013a:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0140
            r1 = r1 & r42
        L_0x0140:
            r16 = r46
        L_0x0142:
            r17 = r7
            r19 = r9
            r18 = r10
            r10 = r5
            r9 = r6
            goto L_0x01a0
        L_0x014b:
            if (r2 == 0) goto L_0x0150
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0152
        L_0x0150:
            r0 = r46
        L_0x0152:
            if (r4 == 0) goto L_0x0155
            r5 = r3
        L_0x0155:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x0163
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.f r2 = kotlin.ranges.C11478t.m44305e(r2, r4)
            r1 = r1 & r17
            r7 = r2
        L_0x0163:
            if (r8 == 0) goto L_0x0166
            r10 = 0
        L_0x0166:
            if (r16 == 0) goto L_0x016a
            r2 = 0
            r9 = r2
        L_0x016a:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x019d
            androidx.compose.material3.SliderDefaults r16 = androidx.compose.material3.SliderDefaults.f19660a
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
            androidx.compose.material3.o2 r2 = r16.mo11878c(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r39, r40)
            r1 = r1 & r42
            r16 = r0
            r17 = r7
            r19 = r9
            r18 = r10
            r9 = r2
            r10 = r5
            goto L_0x01a0
        L_0x019d:
            r16 = r0
            goto L_0x0142
        L_0x01a0:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01b2
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.RangeSlider (Slider.kt:319)"
            r4 = -743091416(0xffffffffd3b55328, float:-1.55756842E12)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r0, r2)
        L_0x01b2:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r0)
            java.lang.Object r2 = r11.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r4.mo16277a()
            if (r2 != r5) goto L_0x01cb
            androidx.compose.foundation.interaction.g r2 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r2)
        L_0x01cb:
            r11.mo15002m0()
            r7 = r2
            androidx.compose.foundation.interaction.g r7 = (androidx.compose.foundation.interaction.C2243g) r7
            r11.mo14918M(r0)
            java.lang.Object r0 = r11.mo14921N()
            java.lang.Object r2 = r4.mo16277a()
            if (r0 != r2) goto L_0x01e5
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r0)
        L_0x01e5:
            r11.mo15002m0()
            r8 = r0
            androidx.compose.foundation.interaction.g r8 = (androidx.compose.foundation.interaction.C2243g) r8
            if (r18 < 0) goto L_0x01f0
            r43 = r3
            goto L_0x01f2
        L_0x01f0:
            r43 = 0
        L_0x01f2:
            if (r43 == 0) goto L_0x028d
            androidx.compose.material3.SliderKt$RangeSlider$2 r0 = new androidx.compose.material3.SliderKt$RangeSlider$2
            r0.<init>(r7, r9, r10, r1)
            r2 = 1361279243(0x5123790b, float:4.3881902E10)
            androidx.compose.runtime.internal.a r20 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r2, r3, r0)
            androidx.compose.material3.SliderKt$RangeSlider$3 r0 = new androidx.compose.material3.SliderKt$RangeSlider$3
            r0.<init>(r8, r9, r10, r1)
            r2 = 741565023(0x2c33625f, float:2.5492037E-12)
            androidx.compose.runtime.internal.a r21 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r2, r3, r0)
            androidx.compose.material3.SliderKt$RangeSlider$4 r0 = new androidx.compose.material3.SliderKt$RangeSlider$4
            r0.<init>(r9, r10, r1)
            r2 = -298726816(0xffffffffee31ca60, float:-1.3755876E28)
            androidx.compose.runtime.internal.a r22 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r2, r3, r0)
            int r0 = r1 >> 6
            r0 = r0 & 14
            r2 = 918552576(0x36c00000, float:5.722046E-6)
            r0 = r0 | r2
            int r2 = r1 << 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r41
            r23 = r0 | r1
            r24 = 54
            r25 = 0
            r0 = r16
            r1 = r44
            r2 = r45
            r3 = r10
            r4 = r17
            r5 = r18
            r6 = r19
            r26 = r9
            r9 = r20
            r20 = r10
            r10 = r21
            r21 = r11
            r11 = r22
            r12 = r21
            r13 = r23
            r14 = r24
            r15 = r25
            m26207c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0268
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0268:
            r3 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r4 = r20
            r8 = r26
        L_0x0274:
            androidx.compose.runtime.t1 r11 = r21.mo15020s()
            if (r11 != 0) goto L_0x027b
            goto L_0x028c
        L_0x027b:
            androidx.compose.material3.SliderKt$RangeSlider$5 r12 = new androidx.compose.material3.SliderKt$RangeSlider$5
            r0 = r12
            r1 = r44
            r2 = r45
            r9 = r53
            r10 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x028c:
            return
        L_0x028d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m26205a(kotlin.ranges.f, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, kotlin.ranges.f, int, kotlin.jvm.functions.a, androidx.compose.material3.o2, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0129  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26206b(@org.jetbrains.annotations.C12579k kotlin.ranges.C11457f<java.lang.Float> r47, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlin.ranges.C11457f<java.lang.Float>, kotlin.C11079d2> r48, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r49, boolean r50, @org.jetbrains.annotations.C12580l kotlin.ranges.C11457f<java.lang.Float> r51, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r52, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8258o2 r53, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r54, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r55, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8264p2, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r56, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8264p2, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r57, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8264p2, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r58, int r59, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r60, int r61, int r62, int r63) {
        /*
            r15 = r47
            r14 = r48
            r13 = r61
            r12 = r62
            r11 = r63
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1048796133(0xffffffffc17ca41b, float:-15.790065)
            r1 = r60
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r10.mo15006n0(r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r13
            goto L_0x0034
        L_0x0033:
            r1 = r13
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r10.mo14927P(r14)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0052:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0066
            r9 = r49
            boolean r16 = r10.mo15006n0(r9)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r16
            goto L_0x0068
        L_0x0066:
            r9 = r49
        L_0x0068:
            r16 = r11 & 8
            if (r16 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x006f:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0083
            r2 = r50
            boolean r17 = r10.mo14961b(r2)
            if (r17 == 0) goto L_0x007e
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r17
            goto L_0x0085
        L_0x0083:
            r2 = r50
        L_0x0085:
            r41 = 57344(0xe000, float:8.0356E-41)
            r17 = r13 & r41
            if (r17 != 0) goto L_0x00a0
            r17 = r11 & 16
            r3 = r51
            if (r17 != 0) goto L_0x009b
            boolean r18 = r10.mo15006n0(r3)
            if (r18 == 0) goto L_0x009b
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r18
            goto L_0x00a2
        L_0x00a0:
            r3 = r51
        L_0x00a2:
            r18 = r11 & 32
            r42 = 458752(0x70000, float:6.42848E-40)
            if (r18 == 0) goto L_0x00af
            r19 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r19
            r5 = r52
            goto L_0x00c2
        L_0x00af:
            r19 = r13 & r42
            r5 = r52
            if (r19 != 0) goto L_0x00c2
            boolean r20 = r10.mo14927P(r5)
            if (r20 == 0) goto L_0x00be
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r1 = r1 | r20
        L_0x00c2:
            r43 = 3670016(0x380000, float:5.142788E-39)
            r20 = r13 & r43
            if (r20 != 0) goto L_0x00dc
            r20 = r11 & 64
            r6 = r53
            if (r20 != 0) goto L_0x00d7
            boolean r21 = r10.mo15006n0(r6)
            if (r21 == 0) goto L_0x00d7
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r21
            goto L_0x00de
        L_0x00dc:
            r6 = r53
        L_0x00de:
            r7 = r11 & 128(0x80, float:1.794E-43)
            r44 = 29360128(0x1c00000, float:7.052966E-38)
            if (r7 == 0) goto L_0x00eb
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r22
            r8 = r54
            goto L_0x00fe
        L_0x00eb:
            r22 = r13 & r44
            r8 = r54
            if (r22 != 0) goto L_0x00fe
            boolean r23 = r10.mo15006n0(r8)
            if (r23 == 0) goto L_0x00fa
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r23
        L_0x00fe:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0109
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r23
            r2 = r55
            goto L_0x011e
        L_0x0109:
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            r23 = r13 & r23
            r2 = r55
            if (r23 != 0) goto L_0x011e
            boolean r23 = r10.mo15006n0(r2)
            if (r23 == 0) goto L_0x011a
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r1 = r1 | r23
        L_0x011e:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0129
            r23 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r23
            r3 = r56
            goto L_0x013e
        L_0x0129:
            r23 = 1879048192(0x70000000, float:1.58456325E29)
            r23 = r13 & r23
            r3 = r56
            if (r23 != 0) goto L_0x013e
            boolean r23 = r10.mo14927P(r3)
            if (r23 == 0) goto L_0x013a
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r1 = r1 | r23
        L_0x013e:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0147
            r17 = r12 | 6
            r5 = r57
            goto L_0x015d
        L_0x0147:
            r23 = r12 & 14
            r5 = r57
            if (r23 != 0) goto L_0x015b
            boolean r23 = r10.mo14927P(r5)
            if (r23 == 0) goto L_0x0156
            r17 = 4
            goto L_0x0158
        L_0x0156:
            r17 = 2
        L_0x0158:
            r17 = r12 | r17
            goto L_0x015d
        L_0x015b:
            r17 = r12
        L_0x015d:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0164
            r17 = r17 | 48
            goto L_0x0177
        L_0x0164:
            r23 = r12 & 112(0x70, float:1.57E-43)
            r6 = r58
            if (r23 != 0) goto L_0x0177
            boolean r23 = r10.mo14927P(r6)
            if (r23 == 0) goto L_0x0173
            r19 = 32
            goto L_0x0175
        L_0x0173:
            r19 = 16
        L_0x0175:
            r17 = r17 | r19
        L_0x0177:
            r6 = r17
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0180
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0194
        L_0x0180:
            r9 = r12 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0194
            r9 = r59
            boolean r17 = r10.mo14976f(r9)
            if (r17 == 0) goto L_0x018f
            r21 = 256(0x100, float:3.59E-43)
            goto L_0x0191
        L_0x018f:
            r21 = 128(0x80, float:1.794E-43)
        L_0x0191:
            r6 = r6 | r21
            goto L_0x0196
        L_0x0194:
            r9 = r59
        L_0x0196:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r1 & r17
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r12) goto L_0x01ca
            r9 = r6 & 731(0x2db, float:1.024E-42)
            r12 = 146(0x92, float:2.05E-43)
            if (r9 != r12) goto L_0x01ca
            boolean r9 = r10.mo15011p()
            if (r9 != 0) goto L_0x01ad
            goto L_0x01ca
        L_0x01ad:
            r10.mo14958a0()
            r3 = r49
            r4 = r50
            r5 = r51
            r6 = r52
            r7 = r53
            r8 = r54
            r9 = r55
            r11 = r57
            r12 = r58
            r13 = r59
            r30 = r10
            r10 = r56
            goto L_0x0396
        L_0x01ca:
            r10.mo14930Q()
            r9 = r13 & 1
            if (r9 == 0) goto L_0x0204
            boolean r9 = r10.mo14977f0()
            if (r9 == 0) goto L_0x01d8
            goto L_0x0204
        L_0x01d8:
            r10.mo14958a0()
            r0 = r11 & 16
            if (r0 == 0) goto L_0x01e3
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r0
        L_0x01e3:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x01eb
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
        L_0x01eb:
            r16 = r49
            r17 = r50
            r18 = r51
            r19 = r52
            r20 = r53
            r21 = r54
            r22 = r55
            r23 = r56
            r24 = r57
            r25 = r58
            r26 = r59
            r7 = 1
            goto L_0x030c
        L_0x0204:
            if (r4 == 0) goto L_0x0209
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x020b
        L_0x0209:
            r4 = r49
        L_0x020b:
            if (r16 == 0) goto L_0x020f
            r9 = 1
            goto L_0x0211
        L_0x020f:
            r9 = r50
        L_0x0211:
            r16 = r11 & 16
            if (r16 == 0) goto L_0x0223
            r12 = 0
            r49 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.f r4 = kotlin.ranges.C11478t.m44305e(r12, r4)
            r12 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r12
            goto L_0x0227
        L_0x0223:
            r49 = r4
            r4 = r51
        L_0x0227:
            if (r18 == 0) goto L_0x022b
            r12 = 0
            goto L_0x022d
        L_0x022b:
            r12 = r52
        L_0x022d:
            r16 = r11 & 64
            if (r16 == 0) goto L_0x025e
            androidx.compose.material3.SliderDefaults r16 = androidx.compose.material3.SliderDefaults.f19660a
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
            r37 = r10
            androidx.compose.material3.o2 r16 = r16.mo11878c(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r39, r40)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r17
            r50 = r4
            r4 = r1
            r1 = r16
            goto L_0x0263
        L_0x025e:
            r50 = r4
            r4 = r1
            r1 = r53
        L_0x0263:
            if (r7 == 0) goto L_0x0284
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r7)
            java.lang.Object r7 = r10.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r16.mo16277a()
            if (r7 != r11) goto L_0x027e
            androidx.compose.foundation.interaction.g r7 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r10.mo14893C(r7)
        L_0x027e:
            r10.mo15002m0()
            androidx.compose.foundation.interaction.g r7 = (androidx.compose.foundation.interaction.C2243g) r7
            goto L_0x0286
        L_0x0284:
            r7 = r54
        L_0x0286:
            if (r0 == 0) goto L_0x02a7
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r0)
            java.lang.Object r0 = r10.mo14921N()
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r0 != r11) goto L_0x02a1
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r10.mo14893C(r0)
        L_0x02a1:
            r10.mo15002m0()
            androidx.compose.foundation.interaction.g r0 = (androidx.compose.foundation.interaction.C2243g) r0
            goto L_0x02a9
        L_0x02a7:
            r0 = r55
        L_0x02a9:
            if (r2 == 0) goto L_0x02bb
            androidx.compose.material3.SliderKt$RangeSlider$8 r2 = new androidx.compose.material3.SliderKt$RangeSlider$8
            r2.<init>(r7, r1, r9, r4)
            r11 = 585242822(0x22e218c6, float:6.1283653E-18)
            r16 = r7
            r7 = 1
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r11, r7, r2)
            goto L_0x02c0
        L_0x02bb:
            r16 = r7
            r7 = 1
            r2 = r56
        L_0x02c0:
            if (r3 == 0) goto L_0x02cf
            androidx.compose.material3.SliderKt$RangeSlider$9 r3 = new androidx.compose.material3.SliderKt$RangeSlider$9
            r3.<init>(r0, r1, r9, r4)
            r11 = 1397395775(0x534a913f, float:8.7002022E11)
            androidx.compose.runtime.internal.a r3 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r11, r7, r3)
            goto L_0x02d1
        L_0x02cf:
            r3 = r57
        L_0x02d1:
            if (r5 == 0) goto L_0x02e0
            androidx.compose.material3.SliderKt$RangeSlider$10 r5 = new androidx.compose.material3.SliderKt$RangeSlider$10
            r5.<init>(r1, r9, r4)
            r11 = -2139066097(0xffffffff8080710f, float:-1.1795501E-38)
            androidx.compose.runtime.internal.a r5 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r11, r7, r5)
            goto L_0x02e2
        L_0x02e0:
            r5 = r58
        L_0x02e2:
            if (r8 == 0) goto L_0x02f5
            r8 = 0
            r18 = r50
            r22 = r0
            r20 = r1
            r23 = r2
            r24 = r3
            r1 = r4
            r25 = r5
            r26 = r8
            goto L_0x0304
        L_0x02f5:
            r18 = r50
            r26 = r59
            r22 = r0
            r20 = r1
            r23 = r2
            r24 = r3
            r1 = r4
            r25 = r5
        L_0x0304:
            r17 = r9
            r19 = r12
            r21 = r16
            r16 = r49
        L_0x030c:
            r10.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x031d
            java.lang.String r0 = "androidx.compose.material3.RangeSlider (Slider.kt:428)"
            r2 = -1048796133(0xffffffffc17ca41b, float:-15.790065)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r6, r0)
        L_0x031d:
            if (r26 < 0) goto L_0x0321
            r12 = r7
            goto L_0x0322
        L_0x0321:
            r12 = 0
        L_0x0322:
            if (r12 == 0) goto L_0x03b9
            int r0 = r1 >> 6
            r0 = r0 & 14
            int r2 = r1 << 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = r1 & r41
            r0 = r0 | r3
            int r3 = r6 << 9
            r3 = r3 & r42
            r0 = r0 | r3
            r2 = r2 & r43
            r0 = r0 | r2
            r2 = r1 & r44
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r27 = r0 | r1
            r0 = r6 & 14
            r1 = r6 & 112(0x70, float:1.57E-43)
            r28 = r0 | r1
            r29 = 0
            r0 = r16
            r1 = r47
            r2 = r48
            r3 = r17
            r4 = r18
            r5 = r26
            r6 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r30 = r10
            r10 = r24
            r11 = r25
            r12 = r30
            r13 = r27
            r14 = r28
            r15 = r29
            m26207c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0380
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0380:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
        L_0x0396:
            androidx.compose.runtime.t1 r15 = r30.mo15020s()
            if (r15 != 0) goto L_0x039d
            goto L_0x03b8
        L_0x039d:
            androidx.compose.material3.SliderKt$RangeSlider$12 r14 = new androidx.compose.material3.SliderKt$RangeSlider$12
            r0 = r14
            r1 = r47
            r2 = r48
            r45 = r14
            r14 = r61
            r46 = r15
            r15 = r62
            r16 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r45
            r0 = r46
            r0.mo15202a(r1)
        L_0x03b8:
            return
        L_0x03b9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m26206b(kotlin.ranges.f, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, kotlin.ranges.f, kotlin.jvm.functions.a, androidx.compose.material3.o2, androidx.compose.foundation.interaction.g, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.q, kotlin.jvm.functions.q, kotlin.jvm.functions.q, int, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0817  */
    /* JADX WARNING: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0122  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26207c(androidx.compose.p004ui.C8767m r34, kotlin.ranges.C11457f<java.lang.Float> r35, kotlin.jvm.functions.C11300l<? super kotlin.ranges.C11457f<java.lang.Float>, kotlin.C11079d2> r36, boolean r37, kotlin.ranges.C11457f<java.lang.Float> r38, int r39, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r40, androidx.compose.foundation.interaction.C2243g r41, androidx.compose.foundation.interaction.C2243g r42, kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8264p2, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r43, kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8264p2, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8264p2, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r45, androidx.compose.runtime.C8592o r46, int r47, int r48, int r49) {
        /*
            r11 = r35
            r12 = r36
            r13 = r37
            r14 = r40
            r15 = r41
            r10 = r42
            r9 = r43
            r8 = r44
            r7 = r45
            r6 = r47
            r5 = r49
            r0 = 2067530570(0x7b3c034a, float:9.762185E35)
            r1 = r46
            androidx.compose.runtime.o r4 = r1.mo15009o(r0)
            r1 = r5 & 1
            if (r1 == 0) goto L_0x002a
            r1 = r6 | 6
            r16 = r1
            r1 = r34
            goto L_0x0042
        L_0x002a:
            r1 = r6 & 14
            if (r1 != 0) goto L_0x003e
            r1 = r34
            boolean r16 = r4.mo15006n0(r1)
            if (r16 == 0) goto L_0x0039
            r16 = 4
            goto L_0x003b
        L_0x0039:
            r16 = 2
        L_0x003b:
            r16 = r6 | r16
            goto L_0x0042
        L_0x003e:
            r1 = r34
            r16 = r6
        L_0x0042:
            r17 = r5 & 2
            r18 = 32
            r19 = 16
            if (r17 == 0) goto L_0x004d
            r16 = r16 | 48
            goto L_0x005e
        L_0x004d:
            r17 = r6 & 112(0x70, float:1.57E-43)
            if (r17 != 0) goto L_0x005e
            boolean r17 = r4.mo15006n0(r11)
            if (r17 == 0) goto L_0x005a
            r17 = r18
            goto L_0x005c
        L_0x005a:
            r17 = r19
        L_0x005c:
            r16 = r16 | r17
        L_0x005e:
            r2 = r16
            r16 = r5 & 4
            if (r16 == 0) goto L_0x0067
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0077
        L_0x0067:
            r3 = r6 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0077
            boolean r3 = r4.mo14927P(r12)
            if (r3 == 0) goto L_0x0074
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0076
        L_0x0074:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0076:
            r2 = r2 | r3
        L_0x0077:
            r3 = r5 & 8
            if (r3 == 0) goto L_0x007e
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007e:
            r3 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x008e
            boolean r3 = r4.mo14961b(r13)
            if (r3 == 0) goto L_0x008b
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r2 = r2 | r3
        L_0x008e:
            r3 = r5 & 16
            if (r3 == 0) goto L_0x0095
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ab
        L_0x0095:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x00ab
            r3 = r38
            boolean r17 = r4.mo15006n0(r3)
            if (r17 == 0) goto L_0x00a6
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r2 = r2 | r17
            goto L_0x00ad
        L_0x00ab:
            r3 = r38
        L_0x00ad:
            r17 = r5 & 32
            if (r17 == 0) goto L_0x00b8
            r20 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r20
            r0 = r39
            goto L_0x00cd
        L_0x00b8:
            r20 = 458752(0x70000, float:6.42848E-40)
            r20 = r6 & r20
            r0 = r39
            if (r20 != 0) goto L_0x00cd
            boolean r21 = r4.mo14976f(r0)
            if (r21 == 0) goto L_0x00c9
            r21 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cb
        L_0x00c9:
            r21 = 65536(0x10000, float:9.18355E-41)
        L_0x00cb:
            r2 = r2 | r21
        L_0x00cd:
            r21 = r5 & 64
            if (r21 == 0) goto L_0x00d6
            r21 = 1572864(0x180000, float:2.204052E-39)
        L_0x00d3:
            r2 = r2 | r21
            goto L_0x00e8
        L_0x00d6:
            r21 = 3670016(0x380000, float:5.142788E-39)
            r21 = r6 & r21
            if (r21 != 0) goto L_0x00e8
            boolean r21 = r4.mo14927P(r14)
            if (r21 == 0) goto L_0x00e5
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00e5:
            r21 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00d3
        L_0x00e8:
            r0 = r5 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f0
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00ee:
            r2 = r2 | r0
            goto L_0x0101
        L_0x00f0:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r6
            if (r0 != 0) goto L_0x0101
            boolean r0 = r4.mo15006n0(r15)
            if (r0 == 0) goto L_0x00fe
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00fe:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00ee
        L_0x0101:
            r0 = r5 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0109
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0107:
            r2 = r2 | r0
            goto L_0x011a
        L_0x0109:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r6
            if (r0 != 0) goto L_0x011a
            boolean r0 = r4.mo15006n0(r10)
            if (r0 == 0) goto L_0x0117
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0107
        L_0x0117:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0107
        L_0x011a:
            r0 = r5 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0122
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0120:
            r2 = r2 | r0
            goto L_0x0133
        L_0x0122:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r6
            if (r0 != 0) goto L_0x0133
            boolean r0 = r4.mo14927P(r9)
            if (r0 == 0) goto L_0x0130
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0120
        L_0x0130:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0120
        L_0x0133:
            r0 = r5 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x013a
            r0 = r48 | 6
            goto L_0x014c
        L_0x013a:
            r0 = r48 & 14
            if (r0 != 0) goto L_0x014a
            boolean r0 = r4.mo14927P(r8)
            if (r0 == 0) goto L_0x0146
            r0 = 4
            goto L_0x0147
        L_0x0146:
            r0 = 2
        L_0x0147:
            r0 = r48 | r0
            goto L_0x014c
        L_0x014a:
            r0 = r48
        L_0x014c:
            r1 = r5 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0153
            r0 = r0 | 48
            goto L_0x0162
        L_0x0153:
            r1 = r48 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0162
            boolean r1 = r4.mo14927P(r7)
            if (r1 == 0) goto L_0x015e
            goto L_0x0160
        L_0x015e:
            r18 = r19
        L_0x0160:
            r0 = r0 | r18
        L_0x0162:
            r1 = r0
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r2
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x0186
            r0 = r1 & 91
            r3 = 18
            if (r0 != r3) goto L_0x0186
            boolean r0 = r4.mo15011p()
            if (r0 != 0) goto L_0x0179
            goto L_0x0186
        L_0x0179:
            r4.mo14958a0()
            r27 = r39
            r12 = r8
            r11 = r10
            r6 = r13
            r13 = r7
            r10 = r9
            r7 = r4
            goto L_0x0810
        L_0x0186:
            if (r17 == 0) goto L_0x018a
            r0 = 0
            goto L_0x018c
        L_0x018a:
            r0 = r39
        L_0x018c:
            boolean r17 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r17 == 0) goto L_0x019a
            java.lang.String r3 = "androidx.compose.material3.RangeSliderImpl (Slider.kt:627)"
            r5 = 2067530570(0x7b3c034a, float:9.762185E35)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r2, r1, r3)
        L_0x019a:
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r4.mo14918M(r5)
            boolean r3 = r4.mo15006n0(r11)
            boolean r17 = r4.mo15006n0(r12)
            r3 = r3 | r17
            java.lang.Object r5 = r4.mo14921N()
            if (r3 != 0) goto L_0x01b8
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r5 != r3) goto L_0x01c0
        L_0x01b8:
            androidx.compose.material3.SliderKt$RangeSliderImpl$onValueChangeState$1$1 r5 = new androidx.compose.material3.SliderKt$RangeSliderImpl$onValueChangeState$1$1
            r5.<init>(r11, r12)
            r4.mo14893C(r5)
        L_0x01c0:
            r4.mo15002m0()
            r3 = 0
            androidx.compose.runtime.k2 r5 = androidx.compose.runtime.C8415c2.m30251t(r5, r4, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r4.mo14918M(r11)
            boolean r3 = r4.mo15006n0(r3)
            java.lang.Object r11 = r4.mo14921N()
            if (r3 != 0) goto L_0x01e4
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r11 != r3) goto L_0x01eb
        L_0x01e4:
            float[] r11 = m26204X(r0)
            r4.mo14893C(r11)
        L_0x01eb:
            r4.mo15002m0()
            float[] r11 = (float[]) r11
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.mo14918M(r3)
            java.lang.Object r3 = r4.mo14921N()
            androidx.compose.runtime.o$a r19 = androidx.compose.runtime.C8592o.f23032a
            r20 = r0
            java.lang.Object r0 = r19.mo16277a()
            r21 = r1
            r1 = 0
            if (r3 != r0) goto L_0x0218
            float r0 = m26195O()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3 = 2
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r1, r3, r1)
            r4.mo14893C(r0)
            r3 = r0
        L_0x0218:
            r4.mo15002m0()
            r22 = r3
            androidx.compose.runtime.z0 r22 = (androidx.compose.runtime.C8700z0) r22
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.mo14918M(r0)
            java.lang.Object r0 = r4.mo14921N()
            java.lang.Object r3 = r19.mo16277a()
            if (r0 != r3) goto L_0x0240
            float r0 = m26195O()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3 = 2
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r1, r3, r1)
            r4.mo14893C(r0)
            goto L_0x0241
        L_0x0240:
            r3 = 2
        L_0x0241:
            r4.mo15002m0()
            r23 = r0
            androidx.compose.runtime.z0 r23 = (androidx.compose.runtime.C8700z0) r23
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.mo14918M(r0)
            java.lang.Object r0 = r4.mo14921N()
            java.lang.Object r1 = r19.mo16277a()
            if (r0 != r1) goto L_0x0265
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r1 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r1, r3, r1)
            r4.mo14893C(r0)
        L_0x0265:
            r4.mo15002m0()
            r25 = r0
            androidx.compose.runtime.z0 r25 = (androidx.compose.runtime.C8700z0) r25
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r4.mo15032w(r0)
            androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p004ui.unit.LayoutDirection.Rtl
            if (r0 != r1) goto L_0x027b
            r26 = 1
            goto L_0x027d
        L_0x027b:
            r26 = 0
        L_0x027d:
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.mo14918M(r0)
            java.lang.Object r3 = r4.mo14921N()
            java.lang.Object r0 = r19.mo16277a()
            if (r3 != r0) goto L_0x02a1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r28 = r2
            r2 = 0
            r3 = 2
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r2, r3, r2)
            r4.mo14893C(r0)
            r3 = r0
            goto L_0x02a3
        L_0x02a1:
            r28 = r2
        L_0x02a3:
            r4.mo15002m0()
            r1.element = r3
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.mo14918M(r0)
            java.lang.Object r0 = r4.mo14921N()
            java.lang.Object r2 = r19.mo16277a()
            if (r0 != r2) goto L_0x02c6
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 2
            r3 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r3, r2, r3)
            r4.mo14893C(r0)
        L_0x02c6:
            r4.mo15002m0()
            r29 = r0
            androidx.compose.runtime.z0 r29 = (androidx.compose.runtime.C8700z0) r29
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.mo14918M(r3)
            java.lang.Object r0 = r4.mo14921N()
            java.lang.Object r2 = r19.mo16277a()
            if (r0 != r2) goto L_0x02eb
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 2
            r3 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r3, r2, r3)
            r4.mo14893C(r0)
        L_0x02eb:
            r4.mo15002m0()
            r16 = r0
            androidx.compose.runtime.z0 r16 = (androidx.compose.runtime.C8700z0) r16
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.mo14918M(r0)
            boolean r0 = r4.mo15006n0(r14)
            java.lang.Object r2 = r4.mo14921N()
            if (r0 != 0) goto L_0x0308
            java.lang.Object r0 = r19.mo16277a()
            if (r2 != r0) goto L_0x0310
        L_0x0308:
            androidx.compose.material3.SliderKt$RangeSliderImpl$gestureEndAction$1$1 r2 = new androidx.compose.material3.SliderKt$RangeSliderImpl$gestureEndAction$1$1
            r2.<init>(r14)
            r4.mo14893C(r2)
        L_0x0310:
            r4.mo15002m0()
            r3 = 0
            androidx.compose.runtime.k2 r24 = androidx.compose.runtime.C8415c2.m30251t(r2, r4, r3)
            androidx.compose.material3.SliderKt$RangeSliderImpl$onDrag$1 r2 = new androidx.compose.material3.SliderKt$RangeSliderImpl$onDrag$1
            r12 = r20
            r0 = r2
            r20 = r21
            r21 = r1
            r1 = r29
            r10 = r2
            r2 = r16
            r14 = r3
            r3 = r35
            r13 = r4
            r4 = r11
            r39 = r5
            r6 = r25
            r7 = r23
            r8 = r22
            r9 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.runtime.k2 r10 = androidx.compose.runtime.C8415c2.m30251t(r10, r13, r14)
            androidx.compose.ui.m$a r9 = androidx.compose.p004ui.C8767m.f23478j
            int r7 = m26212h(r25)
            r0 = r9
            r1 = r41
            r2 = r42
            r3 = r29
            r4 = r16
            r5 = r37
            r6 = r26
            r8 = r38
            r46 = r9
            r9 = r24
            androidx.compose.ui.m r7 = m26197Q(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Comparable r0 = r35.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r1 = r38.getStart()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Comparable r2 = r35.mo23013q()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r8 = kotlin.ranges.C11479u.m44331H(r0, r1, r2)
            java.lang.Comparable r0 = r35.mo23013q()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r1 = r35.getStart()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Comparable r2 = r38.mo23013q()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r9 = kotlin.ranges.C11479u.m44331H(r0, r1, r2)
            java.lang.Comparable r0 = r38.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r1 = r38.mo23013q()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r10 = m26194N(r0, r1, r8)
            java.lang.Comparable r0 = r38.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r1 = r38.mo23013q()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r6 = m26194N(r0, r1, r9)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo14918M(r0)
            java.lang.Object r0 = r13.mo14921N()
            java.lang.Object r1 = r19.mo16277a()
            if (r0 != r1) goto L_0x03e9
            androidx.compose.material3.p2 r0 = new androidx.compose.material3.p2
            kotlin.ranges.f r1 = kotlin.ranges.C11478t.m44305e(r10, r6)
            r0.<init>(r1, r11)
            r13.mo14893C(r0)
        L_0x03e9:
            r13.mo15002m0()
            r5 = r0
            androidx.compose.material3.p2 r5 = (androidx.compose.material3.C8264p2) r5
            kotlin.ranges.f r0 = kotlin.ranges.C11478t.m44305e(r10, r6)
            r5.mo12904c(r0)
            r5.mo12905d(r11)
            float r0 = (float) r12
            float r1 = r0 * r6
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            float r1 = (float) r1
            int r11 = (int) r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r10
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            float r0 = (float) r0
            int r4 = (int) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo14918M(r3)
            r2 = r39
            boolean r1 = r13.mo15006n0(r2)
            boolean r0 = r13.mo15006n0(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r13.mo14921N()
            if (r0 != 0) goto L_0x042f
            java.lang.Object r0 = r19.mo16277a()
            if (r1 != r0) goto L_0x0437
        L_0x042f:
            androidx.compose.material3.SliderKt$RangeSliderImpl$startThumbSemantics$1$1 r1 = new androidx.compose.material3.SliderKt$RangeSliderImpl$startThumbSemantics$1$1
            r1.<init>(r2, r9)
            r13.mo14893C(r1)
        L_0x0437:
            r13.mo15002m0()
            r18 = r1
            kotlin.jvm.functions.l r18 = (kotlin.jvm.functions.C11300l) r18
            java.lang.Comparable r0 = r38.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            kotlin.ranges.f r24 = kotlin.ranges.C11478t.m44305e(r0, r9)
            r0 = r46
            r1 = r8
            r14 = r2
            r2 = r37
            r27 = r12
            r12 = r3
            r3 = r18
            r18 = r4
            r4 = r40
            r30 = r5
            r5 = r24
            r24 = r6
            r6 = r11
            androidx.compose.ui.m r11 = m26200T(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            r13.mo14918M(r12)
            boolean r1 = r13.mo15006n0(r14)
            boolean r0 = r13.mo15006n0(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r13.mo14921N()
            if (r0 != 0) goto L_0x0482
            java.lang.Object r0 = r19.mo16277a()
            if (r1 != r0) goto L_0x048a
        L_0x0482:
            androidx.compose.material3.SliderKt$RangeSliderImpl$endThumbSemantics$1$1 r1 = new androidx.compose.material3.SliderKt$RangeSliderImpl$endThumbSemantics$1$1
            r1.<init>(r14, r8)
            r13.mo14893C(r1)
        L_0x048a:
            r13.mo15002m0()
            r3 = r1
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            java.lang.Comparable r0 = r38.mo23013q()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            kotlin.ranges.f r5 = kotlin.ranges.C11478t.m44305e(r8, r0)
            r0 = r46
            r1 = r9
            r2 = r37
            r4 = r40
            r6 = r18
            androidx.compose.ui.m r12 = m26200T(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r1 = r0.mo13035U()
            r14 = 6
            java.lang.String r9 = androidx.compose.material3.C8357u2.m29348a(r1, r13, r14)
            int r0 = r0.mo13034T()
            java.lang.String r8 = androidx.compose.material3.C8357u2.m29348a(r0, r13, r14)
            androidx.compose.ui.m r0 = androidx.compose.material3.InteractiveComponentSizeKt.m25834f(r34)
            androidx.compose.material3.tokens.z0 r1 = androidx.compose.material3.tokens.C8352z0.f22392a
            float r2 = r1.mo14700m()
            float r3 = r1.mo14698k()
            r4 = 0
            r5 = 0
            r6 = 12
            r18 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r18
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10125y(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.m r18 = r0.mo17224k3(r7)
            androidx.compose.material3.SliderKt$RangeSliderImpl$2 r7 = new androidx.compose.material3.SliderKt$RangeSliderImpl$2
            r0 = r7
            r1 = r21
            r2 = r29
            r3 = r35
            r4 = r16
            r5 = r10
            r6 = r24
            r10 = r7
            r7 = r22
            r31 = r8
            r8 = r23
            r14 = r9
            r9 = r25
            r16 = r12
            r12 = r10
            r10 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.mo14918M(r0)
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r1 = r13.mo15032w(r1)
            androidx.compose.ui.unit.d r1 = (androidx.compose.p004ui.unit.C16479d) r1
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r2 = r13.mo15032w(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p004ui.unit.LayoutDirection) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r3 = r13.mo15032w(r3)
            androidx.compose.ui.platform.c4 r3 = (androidx.compose.p004ui.platform.C15863c4) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r5 = r4.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r18)
            androidx.compose.runtime.d r7 = r13.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x053a
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x053a:
            r13.mo14938T()
            boolean r7 = r13.mo14997l()
            if (r7 == 0) goto L_0x0547
            r13.mo14947W(r5)
            goto L_0x054a
        L_0x0547:
            r13.mo14888A()
        L_0x054a:
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r13)
            kotlin.jvm.functions.p r7 = r4.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r12, r7)
            kotlin.jvm.functions.p r7 = r4.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r1, r7)
            kotlin.jvm.functions.p r1 = r4.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r2, r1)
            kotlin.jvm.functions.p r1 = r4.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r3, r1)
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r13)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r6.invoke(r1, r13, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r1)
            androidx.compose.material3.RangeSliderComponents r2 = androidx.compose.material3.RangeSliderComponents.STARTTHUMB
            r3 = r46
            androidx.compose.ui.m r2 = androidx.compose.p004ui.layout.C15594q.m69318b(r3, r2)
            r5 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r5)
            boolean r5 = r13.mo15006n0(r14)
            java.lang.Object r6 = r13.mo14921N()
            if (r5 != 0) goto L_0x059e
            java.lang.Object r5 = r19.mo16277a()
            if (r6 != r5) goto L_0x05a6
        L_0x059e:
            androidx.compose.material3.SliderKt$RangeSliderImpl$1$1$1 r6 = new androidx.compose.material3.SliderKt$RangeSliderImpl$1$1$1
            r6.<init>(r14)
            r13.mo14893C(r6)
        L_0x05a6:
            r13.mo15002m0()
            kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
            r5 = 1
            androidx.compose.ui.m r2 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71867b(r2, r5, r6)
            r6 = r37
            r7 = r13
            androidx.compose.ui.m r2 = androidx.compose.foundation.FocusableKt.m8919b(r2, r6, r15)
            androidx.compose.ui.m r2 = r2.mo17224k3(r11)
            r8 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r7.mo14918M(r8)
            androidx.compose.ui.c$a r9 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r10 = r9.mo17061C()
            r11 = 0
            androidx.compose.ui.layout.f0 r10 = androidx.compose.foundation.layout.BoxKt.m9849k(r10, r11, r7, r11)
            r7.mo14918M(r0)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r7.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r7.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r7.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            kotlin.jvm.functions.a r14 = r4.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r0 = r7.mo15017r()
            boolean r0 = r0 instanceof androidx.compose.runtime.C8428d
            if (r0 != 0) goto L_0x0600
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0600:
            r7.mo14938T()
            boolean r0 = r7.mo14997l()
            if (r0 == 0) goto L_0x060d
            r7.mo14947W(r14)
            goto L_0x0610
        L_0x060d:
            r7.mo14888A()
        L_0x0610:
            r7.mo14941U()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r7)
            kotlin.jvm.functions.p r14 = r4.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r0, r10, r14)
            kotlin.jvm.functions.p r10 = r4.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r0, r11, r10)
            kotlin.jvm.functions.p r10 = r4.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r0, r12, r10)
            kotlin.jvm.functions.p r10 = r4.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r0, r13, r10)
            r7.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r7)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r2.invoke(r0, r7, r11)
            r7.mo14918M(r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            int r0 = r28 >> 24
            r0 = r0 & 112(0x70, float:1.57E-43)
            r2 = 6
            r0 = r0 | r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10 = r43
            r2 = r30
            r10.invoke(r2, r7, r0)
            r7.mo15002m0()
            r7.mo14896D()
            r7.mo15002m0()
            r7.mo15002m0()
            androidx.compose.material3.RangeSliderComponents r0 = androidx.compose.material3.RangeSliderComponents.ENDTHUMB
            androidx.compose.ui.m r0 = androidx.compose.p004ui.layout.C15594q.m69318b(r3, r0)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r7.mo14918M(r11)
            r11 = r31
            boolean r12 = r7.mo15006n0(r11)
            java.lang.Object r13 = r7.mo14921N()
            if (r12 != 0) goto L_0x0686
            java.lang.Object r12 = r19.mo16277a()
            if (r13 != r12) goto L_0x068e
        L_0x0686:
            androidx.compose.material3.SliderKt$RangeSliderImpl$1$3$1 r13 = new androidx.compose.material3.SliderKt$RangeSliderImpl$1$3$1
            r13.<init>(r11)
            r7.mo14893C(r13)
        L_0x068e:
            r7.mo15002m0()
            kotlin.jvm.functions.l r13 = (kotlin.jvm.functions.C11300l) r13
            androidx.compose.ui.m r0 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71867b(r0, r5, r13)
            r11 = r42
            androidx.compose.ui.m r0 = androidx.compose.foundation.FocusableKt.m8919b(r0, r6, r11)
            r5 = r16
            androidx.compose.ui.m r0 = r0.mo17224k3(r5)
            r7.mo14918M(r8)
            androidx.compose.ui.c r5 = r9.mo17061C()
            r12 = 0
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.BoxKt.m9849k(r5, r12, r7, r12)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.mo14918M(r12)
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r12 = r7.mo15032w(r12)
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r13 = r7.mo15032w(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p004ui.unit.LayoutDirection) r13
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r7.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            kotlin.jvm.functions.a r8 = r4.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r1 = r7.mo15017r()
            boolean r1 = r1 instanceof androidx.compose.runtime.C8428d
            if (r1 != 0) goto L_0x06e6
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x06e6:
            r7.mo14938T()
            boolean r1 = r7.mo14997l()
            if (r1 == 0) goto L_0x06f3
            r7.mo14947W(r8)
            goto L_0x06f6
        L_0x06f3:
            r7.mo14888A()
        L_0x06f6:
            r7.mo14941U()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r7)
            kotlin.jvm.functions.p r8 = r4.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r5, r8)
            kotlin.jvm.functions.p r5 = r4.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r12, r5)
            kotlin.jvm.functions.p r5 = r4.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r13, r5)
            kotlin.jvm.functions.p r5 = r4.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r14, r5)
            r7.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r7)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r5 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r0.invoke(r1, r7, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r7.mo14918M(r0)
            int r0 = r20 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 6
            r0 = r0 | r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12 = r44
            r12.invoke(r2, r7, r0)
            r7.mo15002m0()
            r7.mo14896D()
            r7.mo15002m0()
            r7.mo15002m0()
            androidx.compose.material3.RangeSliderComponents r0 = androidx.compose.material3.RangeSliderComponents.TRACK
            androidx.compose.ui.m r0 = androidx.compose.p004ui.layout.C15594q.m69318b(r3, r0)
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r7.mo14918M(r1)
            androidx.compose.ui.c r1 = r9.mo17061C()
            r3 = 0
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.BoxKt.m9849k(r1, r3, r7, r3)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r7.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r7.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r7.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r9 = r4.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r13 = r7.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x0799
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0799:
            r7.mo14938T()
            boolean r13 = r7.mo14997l()
            if (r13 == 0) goto L_0x07a6
            r7.mo14947W(r9)
            goto L_0x07a9
        L_0x07a6:
            r7.mo14888A()
        L_0x07a9:
            r7.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r7)
            kotlin.jvm.functions.p r13 = r4.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r1, r13)
            kotlin.jvm.functions.p r1 = r4.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r3, r1)
            kotlin.jvm.functions.p r1 = r4.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r1)
            kotlin.jvm.functions.p r1 = r4.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r1)
            r7.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r7)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.invoke(r1, r7, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r7.mo14918M(r0)
            r0 = r20 & 112(0x70, float:1.57E-43)
            r1 = 6
            r0 = r0 | r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13 = r45
            r13.invoke(r2, r7, r0)
            r7.mo15002m0()
            r7.mo14896D()
            r7.mo15002m0()
            r7.mo15002m0()
            r7.mo15002m0()
            r7.mo14896D()
            r7.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0810
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0810:
            androidx.compose.runtime.t1 r14 = r7.mo15020s()
            if (r14 != 0) goto L_0x0817
            goto L_0x0847
        L_0x0817:
            androidx.compose.material3.SliderKt$RangeSliderImpl$3 r9 = new androidx.compose.material3.SliderKt$RangeSliderImpl$3
            r0 = r9
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r27
            r7 = r40
            r8 = r41
            r15 = r9
            r9 = r42
            r10 = r43
            r11 = r44
            r12 = r45
            r13 = r47
            r32 = r14
            r14 = r48
            r33 = r15
            r15 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r32
            r1 = r33
            r0.mo15202a(r1)
        L_0x0847:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m26207c(androidx.compose.ui.m, kotlin.ranges.f, kotlin.jvm.functions.l, boolean, kotlin.ranges.f, int, kotlin.jvm.functions.a, androidx.compose.foundation.interaction.g, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.q, kotlin.jvm.functions.q, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: d */
    public static final float m26208d(C8700z0<Float> z0Var) {
        return z0Var.getValue().floatValue();
    }

    /* renamed from: e */
    public static final void m26209e(C8700z0<Float> z0Var, float f) {
        z0Var.setValue(Float.valueOf(f));
    }

    /* renamed from: f */
    public static final float m26210f(C8700z0<Float> z0Var) {
        return z0Var.getValue().floatValue();
    }

    /* renamed from: g */
    public static final void m26211g(C8700z0<Float> z0Var, float f) {
        z0Var.setValue(Float.valueOf(f));
    }

    /* renamed from: h */
    public static final int m26212h(C8700z0<Integer> z0Var) {
        return z0Var.getValue().intValue();
    }

    /* renamed from: i */
    public static final void m26213i(C8700z0<Integer> z0Var, int i) {
        z0Var.setValue(Integer.valueOf(i));
    }

    /* renamed from: j */
    public static final float m26214j(C11457f<Float> fVar, float f, float f2, float f3) {
        return m26198R(fVar.getStart().floatValue(), fVar.mo23013q().floatValue(), f3, f, f2);
    }

    /* renamed from: k */
    public static final C11457f<Float> m26215k(C11457f<Float> fVar, float f, float f2, C11457f<Float> fVar2) {
        return m26199S(f, f2, fVar2, fVar.getStart().floatValue(), fVar.mo23013q().floatValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26216l(float r44, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r46, boolean r47, @org.jetbrains.annotations.C12580l kotlin.ranges.C11457f<java.lang.Float> r48, int r49, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r50, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8258o2 r51, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r52, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r53, int r54, int r55) {
        /*
            r12 = r45
            r13 = r54
            r14 = r55
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -202044027(0xfffffffff3f50d85, float:-3.8830168E31)
            r1 = r53
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r13 | 6
            r10 = r44
            goto L_0x002f
        L_0x001d:
            r1 = r13 & 14
            r10 = r44
            if (r1 != 0) goto L_0x002e
            boolean r1 = r11.mo14968d(r10)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r13
            goto L_0x002f
        L_0x002e:
            r1 = r13
        L_0x002f:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0046
        L_0x0036:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0046
            boolean r2 = r11.mo14927P(r12)
            if (r2 == 0) goto L_0x0043
            r2 = 32
            goto L_0x0045
        L_0x0043:
            r2 = 16
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x004d:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0060
            r3 = r46
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x005c
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r1 = r1 | r4
            goto L_0x0062
        L_0x0060:
            r3 = r46
        L_0x0062:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007c
            r5 = r47
            boolean r6 = r11.mo14961b(r5)
            if (r6 == 0) goto L_0x0078
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r6
            goto L_0x007e
        L_0x007c:
            r5 = r47
        L_0x007e:
            r6 = 57344(0xe000, float:8.0356E-41)
            r7 = r13 & r6
            if (r7 != 0) goto L_0x009a
            r7 = r14 & 16
            if (r7 != 0) goto L_0x0094
            r7 = r48
            boolean r8 = r11.mo15006n0(r7)
            if (r8 == 0) goto L_0x0096
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0094:
            r7 = r48
        L_0x0096:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r8
            goto L_0x009c
        L_0x009a:
            r7 = r48
        L_0x009c:
            r8 = r14 & 32
            r9 = 458752(0x70000, float:6.42848E-40)
            if (r8 == 0) goto L_0x00a6
            r15 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r15
            goto L_0x00ba
        L_0x00a6:
            r15 = r13 & r9
            if (r15 != 0) goto L_0x00ba
            r15 = r49
            boolean r16 = r11.mo14976f(r15)
            if (r16 == 0) goto L_0x00b5
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r1 = r1 | r16
            goto L_0x00bc
        L_0x00ba:
            r15 = r49
        L_0x00bc:
            r16 = r14 & 64
            r40 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00c9
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r9 = r50
            goto L_0x00dc
        L_0x00c9:
            r17 = r13 & r40
            r9 = r50
            if (r17 != 0) goto L_0x00dc
            boolean r17 = r11.mo14927P(r9)
            if (r17 == 0) goto L_0x00d8
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r1 = r1 | r17
        L_0x00dc:
            r41 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r41
            if (r17 != 0) goto L_0x00f8
            r6 = r14 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x00f1
            r6 = r51
            boolean r17 = r11.mo15006n0(r6)
            if (r17 == 0) goto L_0x00f3
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x00f1:
            r6 = r51
        L_0x00f3:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f5:
            r1 = r1 | r17
            goto L_0x00fa
        L_0x00f8:
            r6 = r51
        L_0x00fa:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0105
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r17
            r3 = r52
            goto L_0x011a
        L_0x0105:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r17
            r3 = r52
            if (r17 != 0) goto L_0x011a
            boolean r17 = r11.mo15006n0(r3)
            if (r17 == 0) goto L_0x0116
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r1 = r1 | r17
        L_0x011a:
            r17 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r1 & r17
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x013c
            boolean r3 = r11.mo15011p()
            if (r3 != 0) goto L_0x012b
            goto L_0x013c
        L_0x012b:
            r11.mo14958a0()
            r3 = r46
            r4 = r47
            r8 = r6
            r5 = r7
            r7 = r9
            r20 = r11
            r6 = r15
            r9 = r52
            goto L_0x0282
        L_0x013c:
            r11.mo14930Q()
            r3 = r13 & 1
            r42 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = 1
            if (r3 == 0) goto L_0x016f
            boolean r3 = r11.mo14977f0()
            if (r3 == 0) goto L_0x0151
            goto L_0x016f
        L_0x0151:
            r11.mo14958a0()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x015a
            r1 = r1 & r17
        L_0x015a:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0160
            r1 = r1 & r42
        L_0x0160:
            r8 = r6
            r16 = r7
            r18 = r9
            r17 = r15
            r15 = r46
            r9 = r47
            r7 = r52
            goto L_0x01f2
        L_0x016f:
            if (r2 == 0) goto L_0x0174
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0176
        L_0x0174:
            r2 = r46
        L_0x0176:
            if (r4 == 0) goto L_0x017a
            r3 = r5
            goto L_0x017c
        L_0x017a:
            r3 = r47
        L_0x017c:
            r4 = r14 & 16
            if (r4 == 0) goto L_0x018a
            r4 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.f r4 = kotlin.ranges.C11478t.m44305e(r4, r7)
            r1 = r1 & r17
            goto L_0x018b
        L_0x018a:
            r4 = r7
        L_0x018b:
            if (r8 == 0) goto L_0x018f
            r7 = 0
            goto L_0x0190
        L_0x018f:
            r7 = r15
        L_0x0190:
            if (r16 == 0) goto L_0x0194
            r8 = 0
            goto L_0x0195
        L_0x0194:
            r8 = r9
        L_0x0195:
            r9 = r14 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01bd
            androidx.compose.material3.SliderDefaults r15 = androidx.compose.material3.SliderDefaults.f19660a
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r37 = 0
            r38 = 6
            r39 = 1023(0x3ff, float:1.434E-42)
            r36 = r11
            androidx.compose.material3.o2 r6 = r15.mo11878c(r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r37, r38, r39)
            r1 = r1 & r42
        L_0x01bd:
            if (r0 == 0) goto L_0x01e7
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r0)
            java.lang.Object r0 = r11.mo14921N()
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r0 != r9) goto L_0x01d8
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r0)
        L_0x01d8:
            r11.mo15002m0()
            androidx.compose.foundation.interaction.g r0 = (androidx.compose.foundation.interaction.C2243g) r0
            r15 = r2
            r9 = r3
            r16 = r4
            r17 = r7
            r18 = r8
            r7 = r0
            goto L_0x01f1
        L_0x01e7:
            r15 = r2
            r9 = r3
            r16 = r4
            r17 = r7
            r18 = r8
            r7 = r52
        L_0x01f1:
            r8 = r6
        L_0x01f2:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0204
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.Slider (Slider.kt:146)"
            r3 = -202044027(0xfffffffff3f50d85, float:-3.8830168E31)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x0204:
            if (r17 < 0) goto L_0x0209
            r43 = r5
            goto L_0x020b
        L_0x0209:
            r43 = 0
        L_0x020b:
            if (r43 == 0) goto L_0x029c
            androidx.compose.material3.SliderKt$Slider$3 r0 = new androidx.compose.material3.SliderKt$Slider$3
            r0.<init>(r7, r8, r9, r1)
            r2 = -1522452856(0xffffffffa5413688, float:-1.6758557E-16)
            androidx.compose.runtime.internal.a r19 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r2, r5, r0)
            androidx.compose.material3.SliderKt$Slider$4 r0 = new androidx.compose.material3.SliderKt$Slider$4
            r0.<init>(r8, r9, r1)
            r2 = 686671625(0x28edc709, float:2.6398603E-14)
            androidx.compose.runtime.internal.a r20 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r2, r5, r0)
            int r0 = r1 >> 6
            r2 = r0 & 14
            r3 = 905969664(0x36000000, float:1.9073486E-6)
            r2 = r2 | r3
            r3 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r1 >> 18
            r3 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r1 << 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r3
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            int r2 = r1 << 18
            r2 = r2 & r40
            r0 = r0 | r2
            int r1 = r1 << 9
            r1 = r1 & r41
            r21 = r0 | r1
            r0 = r15
            r1 = r9
            r2 = r7
            r3 = r45
            r4 = r18
            r5 = r17
            r6 = r44
            r22 = r7
            r7 = r16
            r23 = r8
            r8 = r19
            r19 = r9
            r9 = r20
            r10 = r11
            r20 = r11
            r11 = r21
            m26218n(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0275
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0275:
            r3 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r4 = r19
            r9 = r22
            r8 = r23
        L_0x0282:
            androidx.compose.runtime.t1 r15 = r20.mo15020s()
            if (r15 != 0) goto L_0x0289
            goto L_0x029b
        L_0x0289:
            androidx.compose.material3.SliderKt$Slider$5 r11 = new androidx.compose.material3.SliderKt$Slider$5
            r0 = r11
            r1 = r44
            r2 = r45
            r10 = r54
            r12 = r11
            r11 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.mo15202a(r12)
        L_0x029b:
            return
        L_0x029c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m26216l(float, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, kotlin.ranges.f, int, kotlin.jvm.functions.a, androidx.compose.material3.o2, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0125  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26217m(float r46, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r47, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r48, boolean r49, @org.jetbrains.annotations.C12580l kotlin.ranges.C11457f<java.lang.Float> r50, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r51, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8258o2 r52, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r53, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8264p2, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r54, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8264p2, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r55, int r56, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r57, int r58, int r59, int r60) {
        /*
            r12 = r47
            r13 = r58
            r14 = r60
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 251663723(0xf00156b, float:6.315012E-30)
            r1 = r57
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r13 | 6
            r10 = r46
            goto L_0x002f
        L_0x001d:
            r1 = r13 & 14
            r10 = r46
            if (r1 != 0) goto L_0x002e
            boolean r1 = r11.mo14968d(r10)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r13
            goto L_0x002f
        L_0x002e:
            r1 = r13
        L_0x002f:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0046
        L_0x0036:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0046
            boolean r4 = r11.mo14927P(r12)
            if (r4 == 0) goto L_0x0043
            r4 = 32
            goto L_0x0045
        L_0x0043:
            r4 = 16
        L_0x0045:
            r1 = r1 | r4
        L_0x0046:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x004d:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0060
            r5 = r48
            boolean r6 = r11.mo15006n0(r5)
            if (r6 == 0) goto L_0x005c
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r1 = r1 | r6
            goto L_0x0062
        L_0x0060:
            r5 = r48
        L_0x0062:
            r6 = r14 & 8
            if (r6 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007c
            r7 = r49
            boolean r8 = r11.mo14961b(r7)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r8
            goto L_0x007e
        L_0x007c:
            r7 = r49
        L_0x007e:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r13 & r8
            if (r9 != 0) goto L_0x009a
            r9 = r14 & 16
            if (r9 != 0) goto L_0x0094
            r9 = r50
            boolean r15 = r11.mo15006n0(r9)
            if (r15 == 0) goto L_0x0096
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0094:
            r9 = r50
        L_0x0096:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r15
            goto L_0x009c
        L_0x009a:
            r9 = r50
        L_0x009c:
            r15 = r14 & 32
            r40 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00a9
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r2 = r51
            goto L_0x00bc
        L_0x00a9:
            r16 = r13 & r40
            r2 = r51
            if (r16 != 0) goto L_0x00bc
            boolean r16 = r11.mo14927P(r2)
            if (r16 == 0) goto L_0x00b8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r16
        L_0x00bc:
            r41 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r41
            if (r16 != 0) goto L_0x00d6
            r16 = r14 & 64
            r8 = r52
            if (r16 != 0) goto L_0x00d1
            boolean r16 = r11.mo15006n0(r8)
            if (r16 == 0) goto L_0x00d1
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r1 = r1 | r16
            goto L_0x00d8
        L_0x00d6:
            r8 = r52
        L_0x00d8:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r42 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00e5
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r3 = r53
            goto L_0x00f8
        L_0x00e5:
            r16 = r13 & r42
            r3 = r53
            if (r16 != 0) goto L_0x00f8
            boolean r17 = r11.mo15006n0(r3)
            if (r17 == 0) goto L_0x00f4
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r17
        L_0x00f8:
            r2 = r14 & 256(0x100, float:3.59E-43)
            r43 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x0105
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r17
            r3 = r54
            goto L_0x0118
        L_0x0105:
            r17 = r13 & r43
            r3 = r54
            if (r17 != 0) goto L_0x0118
            boolean r17 = r11.mo14927P(r3)
            if (r17 == 0) goto L_0x0114
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r1 = r1 | r17
        L_0x0118:
            r3 = r14 & 512(0x200, float:7.175E-43)
            r44 = 1879048192(0x70000000, float:1.58456325E29)
            if (r3 == 0) goto L_0x0125
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r17
            r5 = r55
            goto L_0x0138
        L_0x0125:
            r17 = r13 & r44
            r5 = r55
            if (r17 != 0) goto L_0x0138
            boolean r17 = r11.mo14927P(r5)
            if (r17 == 0) goto L_0x0134
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r1 = r1 | r17
        L_0x0138:
            r5 = r14 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0141
            r17 = r59 | 6
        L_0x013e:
            r7 = r17
            goto L_0x0157
        L_0x0141:
            r17 = r59 & 14
            r7 = r56
            if (r17 != 0) goto L_0x0155
            boolean r17 = r11.mo14976f(r7)
            if (r17 == 0) goto L_0x0150
            r17 = 4
            goto L_0x0152
        L_0x0150:
            r17 = 2
        L_0x0152:
            r17 = r59 | r17
            goto L_0x013e
        L_0x0155:
            r7 = r59
        L_0x0157:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r1 & r17
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r9) goto L_0x0186
            r8 = r7 & 11
            r9 = 2
            if (r8 != r9) goto L_0x0186
            boolean r8 = r11.mo15011p()
            if (r8 != 0) goto L_0x016d
            goto L_0x0186
        L_0x016d:
            r11.mo14958a0()
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
            r9 = r54
            r10 = r55
            r25 = r11
            r11 = r56
            goto L_0x02f5
        L_0x0186:
            r11.mo14930Q()
            r8 = r13 & 1
            if (r8 == 0) goto L_0x01bc
            boolean r8 = r11.mo14977f0()
            if (r8 == 0) goto L_0x0194
            goto L_0x01bc
        L_0x0194:
            r11.mo14958a0()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x019f
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r0
        L_0x019f:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x01a7
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
        L_0x01a7:
            r15 = r48
            r16 = r49
            r17 = r50
            r18 = r51
            r19 = r52
            r20 = r53
            r21 = r54
            r22 = r55
            r23 = r56
            r0 = 1
            goto L_0x027a
        L_0x01bc:
            if (r4 == 0) goto L_0x01c1
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01c3
        L_0x01c1:
            r4 = r48
        L_0x01c3:
            if (r6 == 0) goto L_0x01c7
            r6 = 1
            goto L_0x01c9
        L_0x01c7:
            r6 = r49
        L_0x01c9:
            r8 = r14 & 16
            if (r8 == 0) goto L_0x01d9
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.f r8 = kotlin.ranges.C11478t.m44305e(r8, r9)
            r9 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r9
            goto L_0x01db
        L_0x01d9:
            r8 = r50
        L_0x01db:
            if (r15 == 0) goto L_0x01df
            r9 = 0
            goto L_0x01e1
        L_0x01df:
            r9 = r51
        L_0x01e1:
            r15 = r14 & 64
            if (r15 == 0) goto L_0x020d
            androidx.compose.material3.SliderDefaults r15 = androidx.compose.material3.SliderDefaults.f19660a
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r37 = 0
            r38 = 6
            r39 = 1023(0x3ff, float:1.434E-42)
            r36 = r11
            androidx.compose.material3.o2 r15 = r15.mo11878c(r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r37, r38, r39)
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r16
            goto L_0x020f
        L_0x020d:
            r15 = r52
        L_0x020f:
            if (r0 == 0) goto L_0x0232
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r0)
            java.lang.Object r0 = r11.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            r48 = r4
            java.lang.Object r4 = r16.mo16277a()
            if (r0 != r4) goto L_0x022c
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r0)
        L_0x022c:
            r11.mo15002m0()
            androidx.compose.foundation.interaction.g r0 = (androidx.compose.foundation.interaction.C2243g) r0
            goto L_0x0236
        L_0x0232:
            r48 = r4
            r0 = r53
        L_0x0236:
            if (r2 == 0) goto L_0x0248
            androidx.compose.material3.SliderKt$Slider$7 r2 = new androidx.compose.material3.SliderKt$Slider$7
            r2.<init>(r0, r15, r6, r1)
            r4 = 1998248322(0x771ad982, float:3.1407238E33)
            r16 = r0
            r0 = 1
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r4, r0, r2)
            goto L_0x024d
        L_0x0248:
            r16 = r0
            r0 = 1
            r2 = r54
        L_0x024d:
            if (r3 == 0) goto L_0x025c
            androidx.compose.material3.SliderKt$Slider$8 r3 = new androidx.compose.material3.SliderKt$Slider$8
            r3.<init>(r15, r6, r1)
            r4 = 1543282935(0x5bfca0f7, float:1.42217354E17)
            androidx.compose.runtime.internal.a r3 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r4, r0, r3)
            goto L_0x025e
        L_0x025c:
            r3 = r55
        L_0x025e:
            if (r5 == 0) goto L_0x0268
            r4 = 0
            r21 = r2
            r22 = r3
            r23 = r4
            goto L_0x026e
        L_0x0268:
            r23 = r56
            r21 = r2
            r22 = r3
        L_0x026e:
            r17 = r8
            r18 = r9
            r19 = r15
            r20 = r16
            r15 = r48
            r16 = r6
        L_0x027a:
            r11.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x028b
            java.lang.String r2 = "androidx.compose.material3.Slider (Slider.kt:243)"
            r3 = 251663723(0xf00156b, float:6.315012E-30)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r7, r2)
        L_0x028b:
            if (r23 < 0) goto L_0x028f
            r9 = r0
            goto L_0x0290
        L_0x028f:
            r9 = 0
        L_0x0290:
            if (r9 == 0) goto L_0x0314
            int r0 = r1 >> 6
            r2 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r2 = r1 >> 15
            r2 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            int r2 = r1 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 >> 3
            r3 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r3
            r0 = r0 | r2
            int r2 = r7 << 15
            r2 = r2 & r40
            r0 = r0 | r2
            int r2 = r1 << 18
            r2 = r2 & r41
            r0 = r0 | r2
            int r2 = r1 << 9
            r2 = r2 & r42
            r0 = r0 | r2
            r2 = r1 & r43
            r0 = r0 | r2
            r1 = r1 & r44
            r24 = r0 | r1
            r0 = r15
            r1 = r16
            r2 = r20
            r3 = r47
            r4 = r18
            r5 = r23
            r6 = r46
            r7 = r17
            r8 = r21
            r9 = r22
            r10 = r11
            r25 = r11
            r11 = r24
            m26218n(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02e4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02e4:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
        L_0x02f5:
            androidx.compose.runtime.t1 r15 = r25.mo15020s()
            if (r15 != 0) goto L_0x02fc
            goto L_0x0313
        L_0x02fc:
            androidx.compose.material3.SliderKt$Slider$10 r2 = new androidx.compose.material3.SliderKt$Slider$10
            r0 = r2
            r1 = r46
            r45 = r2
            r2 = r47
            r12 = r58
            r13 = r59
            r14 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r45
            r15.mo15202a(r0)
        L_0x0313:
            return
        L_0x0314:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m26217m(float, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, kotlin.ranges.f, kotlin.jvm.functions.a, androidx.compose.material3.o2, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.q, kotlin.jvm.functions.q, int, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26218n(androidx.compose.p004ui.C8767m r30, boolean r31, androidx.compose.foundation.interaction.C2243g r32, kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r33, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r34, int r35, float r36, kotlin.ranges.C11457f<java.lang.Float> r37, kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8264p2, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r38, kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8264p2, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r39, androidx.compose.runtime.C8592o r40, int r41) {
        /*
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r36
            r10 = r37
            r9 = r38
            r8 = r39
            r7 = r41
            r0 = 851260148(0x32bd32f4, float:2.2025667E-8)
            r1 = r40
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r7 & 14
            r5 = r30
            if (r1 != 0) goto L_0x002c
            boolean r1 = r6.mo15006n0(r5)
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r7
            goto L_0x002d
        L_0x002c:
            r1 = r7
        L_0x002d:
            r3 = r7 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003d
            boolean r3 = r6.mo14961b(r11)
            if (r3 == 0) goto L_0x003a
            r3 = 32
            goto L_0x003c
        L_0x003a:
            r3 = 16
        L_0x003c:
            r1 = r1 | r3
        L_0x003d:
            r3 = r7 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x004d
            boolean r3 = r6.mo15006n0(r12)
            if (r3 == 0) goto L_0x004a
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x004c
        L_0x004a:
            r3 = 128(0x80, float:1.794E-43)
        L_0x004c:
            r1 = r1 | r3
        L_0x004d:
            r3 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x005d
            boolean r3 = r6.mo14927P(r13)
            if (r3 == 0) goto L_0x005a
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x005c
        L_0x005a:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x005c:
            r1 = r1 | r3
        L_0x005d:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x006f
            boolean r3 = r6.mo14927P(r14)
            if (r3 == 0) goto L_0x006c
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006e
        L_0x006c:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x006e:
            r1 = r1 | r3
        L_0x006f:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r7
            r4 = r35
            if (r3 != 0) goto L_0x0082
            boolean r3 = r6.mo14976f(r4)
            if (r3 == 0) goto L_0x007f
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0081
        L_0x007f:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x0081:
            r1 = r1 | r3
        L_0x0082:
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x0093
            boolean r3 = r6.mo14968d(r15)
            if (r3 == 0) goto L_0x0090
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0092
        L_0x0090:
            r3 = 524288(0x80000, float:7.34684E-40)
        L_0x0092:
            r1 = r1 | r3
        L_0x0093:
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x00a4
            boolean r3 = r6.mo15006n0(r10)
            if (r3 == 0) goto L_0x00a1
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00a3
        L_0x00a1:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x00a3:
            r1 = r1 | r3
        L_0x00a4:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x00b5
            boolean r3 = r6.mo14927P(r9)
            if (r3 == 0) goto L_0x00b2
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00b4
        L_0x00b2:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00b4:
            r1 = r1 | r3
        L_0x00b5:
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x00c6
            boolean r3 = r6.mo14927P(r8)
            if (r3 == 0) goto L_0x00c3
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00c5
        L_0x00c3:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00c5:
            r1 = r1 | r3
        L_0x00c6:
            r3 = r1
            r1 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r1 & r3
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r2) goto L_0x00de
            boolean r1 = r6.mo15011p()
            if (r1 != 0) goto L_0x00d7
            goto L_0x00de
        L_0x00d7:
            r6.mo14958a0()
            r13 = r6
            r14 = r8
            goto L_0x0557
        L_0x00de:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00ea
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.SliderImpl (Slider.kt:481)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r1, r2)
        L_0x00ea:
            java.lang.Float r0 = java.lang.Float.valueOf(r36)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.mo14918M(r1)
            boolean r0 = r6.mo15006n0(r0)
            boolean r1 = r6.mo15006n0(r13)
            r0 = r0 | r1
            java.lang.Object r1 = r6.mo14921N()
            if (r0 != 0) goto L_0x010b
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0113
        L_0x010b:
            androidx.compose.material3.SliderKt$SliderImpl$onValueChangeState$1$1 r1 = new androidx.compose.material3.SliderKt$SliderImpl$onValueChangeState$1$1
            r1.<init>(r15, r13)
            r6.mo14893C(r1)
        L_0x0113:
            r6.mo15002m0()
            r2 = 0
            androidx.compose.runtime.k2 r16 = androidx.compose.runtime.C8415c2.m30251t(r1, r6, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r35)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r6.mo14918M(r1)
            boolean r0 = r6.mo15006n0(r0)
            java.lang.Object r1 = r6.mo14921N()
            if (r0 != 0) goto L_0x0137
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x013e
        L_0x0137:
            float[] r1 = m26204X(r35)
            r6.mo14893C(r1)
        L_0x013e:
            r6.mo15002m0()
            float[] r1 = (float[]) r1
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r0)
            java.lang.Object r2 = r6.mo14921N()
            androidx.compose.runtime.o$a r19 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r19.mo16277a()
            r9 = 0
            if (r2 != r0) goto L_0x016c
            float r0 = m26195O()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 2
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r9, r2, r9)
            r6.mo14893C(r0)
            r29 = r2
            r2 = r0
            r0 = r29
            goto L_0x016d
        L_0x016c:
            r0 = 2
        L_0x016d:
            r6.mo15002m0()
            androidx.compose.runtime.z0 r2 = (androidx.compose.runtime.C8700z0) r2
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r0)
            java.lang.Object r0 = r6.mo14921N()
            java.lang.Object r9 = r19.mo16277a()
            if (r0 != r9) goto L_0x0193
            r9 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r21 = r2
            r2 = 0
            r9 = 2
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r2, r9, r2)
            r6.mo14893C(r0)
            goto L_0x0195
        L_0x0193:
            r21 = r2
        L_0x0195:
            r6.mo15002m0()
            r9 = r0
            androidx.compose.runtime.z0 r9 = (androidx.compose.runtime.C8700z0) r9
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r6.mo15032w(r0)
            androidx.compose.ui.unit.LayoutDirection r2 = androidx.compose.p004ui.unit.LayoutDirection.Rtl
            if (r0 != r2) goto L_0x01ae
            r0 = 1
            r22 = r0
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            goto L_0x01b3
        L_0x01ae:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r22 = 0
        L_0x01b3:
            r6.mo14918M(r0)
            java.lang.Object r0 = r6.mo14921N()
            java.lang.Object r2 = r19.mo16277a()
            r4 = 0
            if (r0 != r2) goto L_0x01d3
            float r0 = m26219o(r10, r4, r4, r15)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 2
            r4 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r4, r2, r4)
            r6.mo14893C(r0)
            goto L_0x01d5
        L_0x01d3:
            r2 = 2
            r4 = 0
        L_0x01d5:
            r6.mo15002m0()
            r23 = r0
            androidx.compose.runtime.z0 r23 = (androidx.compose.runtime.C8700z0) r23
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r0)
            java.lang.Object r0 = r6.mo14921N()
            java.lang.Object r2 = r19.mo16277a()
            if (r0 != r2) goto L_0x01f9
            r2 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r2 = 2
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r4, r2, r4)
            r6.mo14893C(r0)
        L_0x01f9:
            r6.mo15002m0()
            r24 = r0
            androidx.compose.runtime.z0 r24 = (androidx.compose.runtime.C8700z0) r24
            java.lang.Comparable r0 = r37.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r2 = r37.mo23013q()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r0 = kotlin.ranges.C11479u.m44331H(r15, r0, r2)
            java.lang.Comparable r2 = r37.getStart()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.lang.Comparable r4 = r37.mo23013q()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r4 = m26194N(r2, r4, r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r0)
            java.lang.Object r0 = r6.mo14921N()
            java.lang.Object r2 = r19.mo16277a()
            if (r0 != r2) goto L_0x024e
            androidx.compose.material3.p2 r0 = new androidx.compose.material3.p2
            r2 = 0
            kotlin.ranges.f r5 = kotlin.ranges.C11478t.m44305e(r2, r4)
            r0.<init>(r5, r1)
            r6.mo14893C(r0)
            goto L_0x024f
        L_0x024e:
            r2 = 0
        L_0x024f:
            r6.mo15002m0()
            r5 = r0
            androidx.compose.material3.p2 r5 = (androidx.compose.material3.C8264p2) r5
            kotlin.ranges.f r0 = kotlin.ranges.C11478t.m44305e(r2, r4)
            r5.mo12904c(r0)
            r5.mo12905d(r1)
            int r20 = r3 >> 21
            r2 = 1157296644(0x44faf204, float:2007.563)
            r6.mo14918M(r2)
            boolean r0 = r6.mo15006n0(r10)
            java.lang.Object r2 = r6.mo14921N()
            if (r0 != 0) goto L_0x0282
            java.lang.Object r0 = r19.mo16277a()
            if (r2 != r0) goto L_0x0278
            goto L_0x0282
        L_0x0278:
            r26 = r4
            r27 = r5
            r13 = r6
            r25 = r21
            r21 = r3
            goto L_0x02af
        L_0x0282:
            androidx.compose.material3.SliderDraggableState r2 = new androidx.compose.material3.SliderDraggableState
            androidx.compose.material3.SliderKt$SliderImpl$draggableState$1$1 r0 = new androidx.compose.material3.SliderKt$SliderImpl$draggableState$1$1
            r40 = r0
            r17 = r1
            r10 = 1157296644(0x44faf204, float:2007.563)
            r1 = r9
            r10 = r2
            r25 = r21
            r13 = 0
            r2 = r25
            r21 = r3
            r3 = r23
            r26 = r4
            r4 = r24
            r27 = r5
            r5 = r17
            r13 = r6
            r6 = r16
            r7 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.<init>(r0)
            r13.mo14893C(r10)
            r2 = r10
        L_0x02af:
            r13.mo15002m0()
            r10 = r2
            androidx.compose.material3.SliderDraggableState r10 = (androidx.compose.material3.SliderDraggableState) r10
            androidx.compose.material3.SliderKt$SliderImpl$gestureEndAction$1 r0 = new androidx.compose.material3.SliderKt$SliderImpl$gestureEndAction$1
            r0.<init>(r10, r14)
            r1 = 0
            androidx.compose.runtime.k2 r7 = androidx.compose.runtime.C8415c2.m30251t(r0, r13, r1)
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            java.lang.Object r0 = r9.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            r0 = r6
            r1 = r10
            r2 = r32
            r4 = r22
            r5 = r23
            r40 = r6
            r6 = r7
            r16 = r9
            r9 = r7
            r7 = r24
            r14 = r8
            r8 = r31
            androidx.compose.ui.m r8 = m26202V(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
            boolean r5 = r10.mo11885h()
            r6 = 0
            r0 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r0)
            boolean r0 = r13.mo15006n0(r9)
            java.lang.Object r1 = r13.mo14921N()
            if (r0 != 0) goto L_0x02ff
            java.lang.Object r0 = r19.mo16277a()
            if (r1 != r0) goto L_0x0308
        L_0x02ff:
            androidx.compose.material3.SliderKt$SliderImpl$drag$1$1 r1 = new androidx.compose.material3.SliderKt$SliderImpl$drag$1$1
            r0 = 0
            r1.<init>(r9, r0)
            r13.mo14893C(r1)
        L_0x0308:
            r13.mo15002m0()
            r7 = r1
            kotlin.jvm.functions.q r7 = (kotlin.jvm.functions.C11305q) r7
            r9 = 32
            r18 = 0
            r0 = r40
            r1 = r10
            r3 = r31
            r4 = r32
            r10 = r8
            r8 = r22
            r28 = r16
            r15 = r10
            r10 = r18
            androidx.compose.ui.m r7 = androidx.compose.foundation.gestures.DraggableKt.m9307k(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.m r0 = androidx.compose.material3.InteractiveComponentSizeKt.m25834f(r30)
            androidx.compose.material3.tokens.z0 r1 = androidx.compose.material3.tokens.C8352z0.f22392a
            float r2 = r1.mo14700m()
            float r3 = r1.mo14698k()
            r4 = 0
            r5 = 0
            r6 = 12
            r8 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10125y(r0, r1, r2, r3, r4, r5, r6)
            r1 = r36
            r2 = r31
            r3 = r33
            r4 = r34
            r5 = r37
            r6 = r35
            androidx.compose.ui.m r0 = m26200T(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.m r0 = androidx.compose.foundation.FocusableKt.m8919b(r0, r11, r12)
            androidx.compose.ui.m r0 = r0.mo17224k3(r15)
            androidx.compose.ui.m r0 = r0.mo17224k3(r7)
            androidx.compose.material3.SliderKt$SliderImpl$2 r1 = new androidx.compose.material3.SliderKt$SliderImpl$2
            r2 = r25
            r4 = r26
            r3 = r28
            r1.<init>(r2, r3, r4)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.mo14918M(r2)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r13.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r13.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r13.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r7 = r6.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r8 = r13.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x03a2
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x03a2:
            r13.mo14938T()
            boolean r8 = r13.mo14997l()
            if (r8 == 0) goto L_0x03af
            r13.mo14947W(r7)
            goto L_0x03b2
        L_0x03af:
            r13.mo14888A()
        L_0x03b2:
            androidx.compose.runtime.o r7 = androidx.compose.runtime.Updater.m30180b(r13)
            kotlin.jvm.functions.p r8 = r6.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r7, r1, r8)
            kotlin.jvm.functions.p r1 = r6.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r7, r3, r1)
            kotlin.jvm.functions.p r1 = r6.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r7, r4, r1)
            kotlin.jvm.functions.p r1 = r6.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r7, r5, r1)
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r13)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.invoke(r1, r13, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r0)
            androidx.compose.material3.SliderComponents r1 = androidx.compose.material3.SliderComponents.THUMB
            r4 = r40
            androidx.compose.ui.m r1 = androidx.compose.p004ui.layout.C15594q.m69318b(r4, r1)
            r5 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r13.mo14918M(r5)
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r8 = r7.mo17061C()
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.BoxKt.m9849k(r8, r3, r13, r3)
            r13.mo14918M(r2)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r13.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r13.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r13.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            kotlin.jvm.functions.a r15 = r6.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r2 = r13.mo15017r()
            boolean r2 = r2 instanceof androidx.compose.runtime.C8428d
            if (r2 != 0) goto L_0x0434
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0434:
            r13.mo14938T()
            boolean r2 = r13.mo14997l()
            if (r2 == 0) goto L_0x0441
            r13.mo14947W(r15)
            goto L_0x0444
        L_0x0441:
            r13.mo14888A()
        L_0x0444:
            r13.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r13)
            kotlin.jvm.functions.p r15 = r6.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r8, r15)
            kotlin.jvm.functions.p r8 = r6.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r3, r8)
            kotlin.jvm.functions.p r3 = r6.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r9, r3)
            kotlin.jvm.functions.p r3 = r6.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r10, r3)
            r13.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r13)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r3 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r1.invoke(r2, r13, r8)
            r13.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r1 = r20 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9 = r38
            r2 = r27
            r9.invoke(r2, r13, r1)
            r13.mo15002m0()
            r13.mo14896D()
            r13.mo15002m0()
            r13.mo15002m0()
            androidx.compose.material3.SliderComponents r1 = androidx.compose.material3.SliderComponents.TRACK
            androidx.compose.ui.m r1 = androidx.compose.p004ui.layout.C15594q.m69318b(r4, r1)
            r13.mo14918M(r5)
            androidx.compose.ui.c r3 = r7.mo17061C()
            r4 = 0
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.BoxKt.m9849k(r3, r4, r13, r4)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r13.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r13.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r13.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            kotlin.jvm.functions.a r8 = r6.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r10 = r13.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x04e3
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x04e3:
            r13.mo14938T()
            boolean r10 = r13.mo14997l()
            if (r10 == 0) goto L_0x04f0
            r13.mo14947W(r8)
            goto L_0x04f3
        L_0x04f0:
            r13.mo14888A()
        L_0x04f3:
            r13.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r13)
            kotlin.jvm.functions.p r10 = r6.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r3, r10)
            kotlin.jvm.functions.p r3 = r6.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r3)
            kotlin.jvm.functions.p r3 = r6.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r3)
            kotlin.jvm.functions.p r3 = r6.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r7, r3)
            r13.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r13)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.invoke(r3, r13, r4)
            r13.mo14918M(r0)
            int r0 = r21 >> 24
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.invoke(r2, r13, r0)
            r13.mo15002m0()
            r13.mo14896D()
            r13.mo15002m0()
            r13.mo15002m0()
            r13.mo15002m0()
            r13.mo14896D()
            r13.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0557
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0557:
            androidx.compose.runtime.t1 r13 = r13.mo15020s()
            if (r13 != 0) goto L_0x055e
            goto L_0x057d
        L_0x055e:
            androidx.compose.material3.SliderKt$SliderImpl$3 r15 = new androidx.compose.material3.SliderKt$SliderImpl$3
            r0 = r15
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.mo15202a(r15)
        L_0x057d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m26218n(androidx.compose.ui.m, boolean, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.l, kotlin.jvm.functions.a, int, float, kotlin.ranges.f, kotlin.jvm.functions.q, kotlin.jvm.functions.q, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: o */
    public static final float m26219o(C11457f<Float> fVar, float f, float f2, float f3) {
        return m26198R(fVar.getStart().floatValue(), fVar.mo23013q().floatValue(), f3, f, f2);
    }

    /* renamed from: p */
    public static final float m26220p(C11457f<Float> fVar, float f, float f2, float f3) {
        return m26198R(f, f2, f3, fVar.getStart().floatValue(), fVar.mo23013q().floatValue());
    }
}
