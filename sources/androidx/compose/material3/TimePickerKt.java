package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2683e;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material3.C8241l2;
import androidx.compose.material3.tokens.C8303f1;
import androidx.compose.material3.tokens.C8306g1;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.ZIndexModifierKt;
import androidx.compose.p004ui.draw.DrawModifierKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16051a0;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16415e;
import androidx.compose.p004ui.text.style.C16417f;
import androidx.compose.p004ui.text.style.C16426h;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.contentsquare.android.api.C14092c;
import com.google.firebase.installations.C33124s;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11601c;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11363r0({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 15 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1673:1\n67#2,3:1674\n66#2:1677\n460#2,13:1703\n473#2,3:1717\n460#2,13:1741\n473#2,3:1755\n36#2:1760\n36#2:1767\n460#2,13:1793\n460#2,13:1826\n473#2,3:1840\n473#2,3:1845\n460#2,13:1870\n460#2,13:1903\n473#2,3:1917\n473#2,3:1922\n460#2,13:1947\n460#2,13:1980\n473#2,3:1994\n473#2,3:1999\n25#2:2004\n25#2:2011\n36#2:2018\n456#2,11:2038\n36#2:2049\n36#2:2056\n467#2,3:2063\n36#2:2067\n460#2,13:2094\n473#2,3:2108\n25#2:2117\n36#2:2128\n25#2:2138\n25#2:2149\n36#2:2160\n460#2,13:2185\n36#2:2199\n473#2,3:2206\n25#2:2211\n25#2:2218\n460#2,13:2244\n460#2,13:2277\n36#2:2291\n473#2,3:2299\n473#2,3:2304\n67#2,3:2309\n66#2:2312\n456#2,14:2332\n1114#3,6:1678\n1114#3,6:1761\n1114#3,6:1768\n1114#3,6:2005\n1114#3,6:2012\n1114#3,6:2019\n1114#3,6:2050\n1114#3,6:2057\n1114#3,6:2068\n1114#3,3:2118\n1117#3,3:2124\n1114#3,6:2129\n1114#3,6:2139\n1114#3,3:2150\n1117#3,3:2156\n1114#3,6:2161\n1114#3,6:2200\n1114#3,6:2212\n1114#3,6:2219\n1114#3,6:2292\n1114#3,6:2313\n74#4,6:1684\n80#4:1716\n84#4:1721\n73#4,7:1850\n80#4:1883\n84#4:1926\n74#4,6:2225\n80#4:2257\n84#4:2308\n75#5:1690\n76#5,11:1692\n89#5:1720\n75#5:1728\n76#5,11:1730\n89#5:1758\n75#5:1780\n76#5,11:1782\n75#5:1813\n76#5,11:1815\n89#5:1843\n89#5:1848\n75#5:1857\n76#5,11:1859\n75#5:1890\n76#5,11:1892\n89#5:1920\n89#5:1925\n75#5:1934\n76#5,11:1936\n75#5:1967\n76#5,11:1969\n89#5:1997\n89#5:2002\n74#5:2025\n75#5,11:2027\n88#5:2066\n75#5:2081\n76#5,11:2083\n89#5:2111\n75#5:2172\n76#5,11:2174\n89#5:2209\n75#5:2231\n76#5,11:2233\n75#5:2264\n76#5,11:2266\n89#5:2302\n89#5:2307\n74#5:2319\n75#5,11:2321\n88#5:2346\n76#6:1691\n76#6:1729\n76#6:1781\n76#6:1814\n76#6:1858\n76#6:1891\n76#6:1935\n76#6:1968\n76#6:2026\n76#6:2075\n76#6:2082\n76#6:2136\n76#6:2173\n76#6:2232\n76#6:2265\n76#6:2298\n76#6:2320\n75#7,6:1722\n81#7:1754\n85#7:1759\n75#7,6:1774\n81#7:1806\n85#7:1849\n74#7,7:1927\n81#7:1960\n85#7:2003\n67#8,6:1807\n73#8:1839\n77#8:1844\n67#8,6:1884\n73#8:1916\n77#8:1921\n67#8,6:1961\n73#8:1993\n77#8:1998\n68#8,5:2076\n73#8:2107\n77#8:2112\n68#8,5:2167\n73#8:2198\n77#8:2210\n67#8,6:2258\n73#8:2290\n77#8:2303\n154#9:2074\n154#9:2358\n154#9:2359\n154#9:2360\n154#9:2361\n154#9:2362\n154#9:2363\n154#9:2364\n154#9:2365\n154#9:2366\n154#9:2371\n474#10,4:2113\n478#10,2:2121\n482#10:2127\n474#10,4:2145\n478#10,2:2153\n482#10:2159\n474#11:2123\n474#11:2155\n135#12:2135\n135#12:2347\n1#13:2137\n76#14:2348\n76#14:2349\n102#14,2:2350\n76#14:2352\n102#14,2:2353\n76#14:2355\n102#14,2:2356\n1549#15:2367\n1620#15,3:2368\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n445#1:1674,3\n445#1:1677\n668#1:1703,13\n668#1:1717,3\n683#1:1741,13\n683#1:1755,3\n699#1:1760\n702#1:1767\n706#1:1793,13\n787#1:1826,13\n787#1:1840,3\n706#1:1845,3\n803#1:1870,13\n806#1:1903,13\n806#1:1917,3\n803#1:1922,3\n822#1:1947,13\n825#1:1980,13\n825#1:1994,3\n822#1:1999,3\n884#1:2004\n927#1:2011\n982#1:2018\n980#1:2038,11\n994#1:2049\n1010#1:2056\n980#1:2063,3\n1034#1:2067\n1057#1:2094,13\n1057#1:2108,3\n1089#1:2117\n1092#1:2128\n1293#1:2138\n1294#1:2149\n1314#1:2160\n1309#1:2185,13\n1325#1:2199\n1309#1:2206,3\n1397#1:2211\n1398#1:2218\n1405#1:2244,13\n1424#1:2277,13\n1431#1:2291\n1424#1:2299,3\n1405#1:2304,3\n1489#1:2309,3\n1489#1:2312\n1503#1:2332,14\n445#1:1678,6\n699#1:1761,6\n702#1:1768,6\n884#1:2005,6\n927#1:2012,6\n982#1:2019,6\n994#1:2050,6\n1010#1:2057,6\n1034#1:2068,6\n1089#1:2118,3\n1089#1:2124,3\n1092#1:2129,6\n1293#1:2139,6\n1294#1:2150,3\n1294#1:2156,3\n1314#1:2161,6\n1325#1:2200,6\n1397#1:2212,6\n1398#1:2219,6\n1431#1:2292,6\n1489#1:2313,6\n668#1:1684,6\n668#1:1716\n668#1:1721\n803#1:1850,7\n803#1:1883\n803#1:1926\n1405#1:2225,6\n1405#1:2257\n1405#1:2308\n668#1:1690\n668#1:1692,11\n668#1:1720\n683#1:1728\n683#1:1730,11\n683#1:1758\n706#1:1780\n706#1:1782,11\n787#1:1813\n787#1:1815,11\n787#1:1843\n706#1:1848\n803#1:1857\n803#1:1859,11\n806#1:1890\n806#1:1892,11\n806#1:1920\n803#1:1925\n822#1:1934\n822#1:1936,11\n825#1:1967\n825#1:1969,11\n825#1:1997\n822#1:2002\n980#1:2025\n980#1:2027,11\n980#1:2066\n1057#1:2081\n1057#1:2083,11\n1057#1:2111\n1309#1:2172\n1309#1:2174,11\n1309#1:2209\n1405#1:2231\n1405#1:2233,11\n1424#1:2264\n1424#1:2266,11\n1424#1:2302\n1405#1:2307\n1503#1:2319\n1503#1:2321,11\n1503#1:2346\n668#1:1691\n683#1:1729\n706#1:1781\n787#1:1814\n803#1:1858\n806#1:1891\n822#1:1935\n825#1:1968\n980#1:2026\n1049#1:2075\n1057#1:2082\n1292#1:2136\n1309#1:2173\n1405#1:2232\n1424#1:2265\n1437#1:2298\n1503#1:2320\n683#1:1722,6\n683#1:1754\n683#1:1759\n706#1:1774,6\n706#1:1806\n706#1:1849\n822#1:1927,7\n822#1:1960\n822#1:2003\n787#1:1807,6\n787#1:1839\n787#1:1844\n806#1:1884,6\n806#1:1916\n806#1:1921\n825#1:1961,6\n825#1:1993\n825#1:1998\n1057#1:2076,5\n1057#1:2107\n1057#1:2112\n1309#1:2167,5\n1309#1:2198\n1309#1:2210\n1424#1:2258,6\n1424#1:2290\n1424#1:2303\n1035#1:2074\n1609#1:2358\n1610#1:2359\n1611#1:2360\n1612#1:2361\n1613#1:2362\n1615#1:2363\n1616#1:2364\n1617#1:2365\n1618#1:2366\n1622#1:2371\n1089#1:2113,4\n1089#1:2121,2\n1089#1:2127\n1294#1:2145,4\n1294#1:2153,2\n1294#1:2159\n1089#1:2123\n1294#1:2155\n1242#1:2135\n1632#1:2347\n195#1:2348\n699#1:2349\n699#1:2350,2\n702#1:2352\n702#1:2353,2\n1293#1:2355\n1293#1:2356,2\n1621#1:2367\n1621#1:2368,3\n*E\n"})
public final class TimePickerKt {

    /* renamed from: a */
    public static final float f19891a = 6.2831855f;

    /* renamed from: b */
    public static final double f19892b = 1.5707963267948966d;

    /* renamed from: c */
    public static final float f19893c = 0.10471976f;

    /* renamed from: d */
    public static final float f19894d = 0.5235988f;

    /* renamed from: e */
    public static final float f19895e = 2.0f;

    /* renamed from: f */
    public static final float f19896f = C16483g.m74435M((float) 101);

    /* renamed from: g */
    public static final float f19897g = C16483g.m74435M((float) 69);

    /* renamed from: h */
    public static final float f19898h = C16483g.m74435M((float) 36);

    /* renamed from: i */
    public static final float f19899i;

    /* renamed from: j */
    public static final float f19900j;

    /* renamed from: k */
    public static final float f19901k = C16483g.m74435M((float) 7);

    /* renamed from: l */
    public static final float f19902l;

    /* renamed from: m */
    public static final float f19903m = C16483g.m74435M((float) 74);

    /* renamed from: n */
    public static final float f19904n = C16483g.m74435M((float) 48);
    @C12579k

    /* renamed from: o */
    public static final List<Integer> f19905o = CollectionsKt__CollectionsKt.m40448L(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
    @C12579k

    /* renamed from: p */
    public static final List<Integer> f19906p;
    @C12579k

    /* renamed from: q */
    public static final List<Integer> f19907q;

    /* renamed from: r */
    public static final float f19908r = C16483g.m74435M((float) 12);

    static {
        float f = (float) 24;
        f19899i = C16483g.m74435M(f);
        f19900j = C16483g.m74435M(f);
        f19902l = C16483g.m74435M(f);
        List<Integer> L = CollectionsKt__CollectionsKt.m40448L(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f19906p = L;
        Iterable<Number> iterable = L;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (Number intValue : iterable) {
            arrayList.add(Integer.valueOf((intValue.intValue() % 12) + 12));
        }
        f19907q = arrayList;
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m26735a(C8767m mVar, float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(1548175696);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14968d(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14927P(pVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1548175696, i3, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1497)");
            }
            TimePickerKt$CircularLayout$1 timePickerKt$CircularLayout$1 = new TimePickerKt$CircularLayout$1(f);
            int i8 = ((i3 >> 6) & 14) | ((i3 << 3) & 112);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(mVar);
            int i9 = ((i8 << 9) & 7168) | 6;
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, timePickerKt$CircularLayout$1, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i9 >> 3) & 112));
            o.mo14918M(2058660585);
            pVar.invoke(o, Integer.valueOf((i9 >> 9) & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TimePickerKt$CircularLayout$2(mVar2, f, pVar, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m26737b(TimePickerState timePickerState, C8212h3 h3Var, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(-934561141);
        if ((i & 14) == 0) {
            if (o.mo15006n0(timePickerState)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(h3Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-934561141, i2, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:839)");
            }
            CompositionLocalKt.m29856b(new C8572j1[]{TextKt.m26703f().mo16141f(TypographyKt.m26914a(C8215i1.f20180a.mo12654c(o, 6), C8306g1.f21226a.mo13617P()))}, C8553b.m31048b(o, -477913269, true, new TimePickerKt$ClockDisplayNumbers$1(timePickerState, h3Var, i2)), o, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TimePickerKt$ClockDisplayNumbers$2(timePickerState, h3Var, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m26739c(@C12579k TimePickerState timePickerState, @C12579k C8212h3 h3Var, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(timePickerState, "state");
        Intrinsics.checkNotNullParameter(h3Var, C9874a.f27063h);
        C8592o o = oVar.mo15009o(-1525091100);
        if ((i & 14) == 0) {
            if (o.mo15006n0(timePickerState)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(h3Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (o.mo14961b(z)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1525091100, i2, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1125)");
            }
            C8767m c = SemanticsModifierKt.m71868c(SizeKt.m10087C(BackgroundKt.m8824c(C8767m.f23478j, h3Var.mo12638b(), C2694o.m12169k()), C8306g1.f21226a.mo13630b()), false, TimePickerKt$ClockFace$1.f19910f, 1, (Object) null);
            CrossfadeKt.m7789b(timePickerState.mo12353n(), c, C1972h.m8392q(350, 0, (C2022z) null, 6, (Object) null), (String) null, C8553b.m31048b(o, 1628166511, true, new TimePickerKt$ClockFace$2(timePickerState, z, h3Var, i2)), o, 24584, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TimePickerKt$ClockFace$3(timePickerState, h3Var, z, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0145, code lost:
        if (r13 == r14.mo16277a()) goto L_0x014a;
     */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26741d(androidx.compose.material3.TimePickerState r38, int r39, boolean r40, androidx.compose.runtime.C8592o r41, int r42) {
        /*
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = r42
            r0 = -1317232110(0xffffffffb17ca212, float:-3.6762953E-9)
            r1 = r41
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r10 & 14
            r2 = 2
            if (r1 != 0) goto L_0x0021
            boolean r1 = r11.mo15006n0(r7)
            if (r1 == 0) goto L_0x001e
            r1 = 4
            goto L_0x001f
        L_0x001e:
            r1 = r2
        L_0x001f:
            r1 = r1 | r10
            goto L_0x0022
        L_0x0021:
            r1 = r10
        L_0x0022:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0032
            boolean r3 = r11.mo14976f(r8)
            if (r3 == 0) goto L_0x002f
            r3 = 32
            goto L_0x0031
        L_0x002f:
            r3 = 16
        L_0x0031:
            r1 = r1 | r3
        L_0x0032:
            r3 = r10 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0042
            boolean r3 = r11.mo14961b(r9)
            if (r3 == 0) goto L_0x003f
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0041
        L_0x003f:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r1 = r1 | r3
        L_0x0042:
            r3 = r1 & 731(0x2db, float:1.024E-42)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x0055
            boolean r3 = r11.mo15011p()
            if (r3 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            r11.mo14958a0()
            r0 = r11
            goto L_0x027c
        L_0x0055:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0061
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.ClockText (TimePicker.kt:1286)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r3, r4)
        L_0x0061:
            androidx.compose.material3.i1 r0 = androidx.compose.material3.C8215i1.f20180a
            r12 = 6
            androidx.compose.material3.s3 r0 = r0.mo12654c(r11, r12)
            androidx.compose.material3.tokens.g1 r3 = androidx.compose.material3.tokens.C8306g1.f21226a
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.mo13632c()
            androidx.compose.ui.text.p0 r0 = androidx.compose.material3.TypographyKt.m26914a(r0, r3)
            r13 = 0
            androidx.compose.ui.text.p0 r31 = androidx.compose.material3.C8377z0.m29474a(r0, r13)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r11.mo15032w(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.p004ui.unit.C16479d) r0
            float r3 = f19903m
            float r4 = r0.mo7425g5(r3)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r0)
            java.lang.Object r3 = r11.mo14921N()
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r14.mo16277a()
            r6 = 0
            if (r3 != r5) goto L_0x00ab
            androidx.compose.ui.geometry.f$a r3 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r15 = r3.mo42248e()
            androidx.compose.ui.geometry.f r3 = androidx.compose.p004ui.geometry.C15094f.m64868d(r15)
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r6, r2, r6)
            r11.mo14893C(r3)
        L_0x00ab:
            r11.mo15002m0()
            r15 = r3
            androidx.compose.runtime.z0 r15 = (androidx.compose.runtime.C8700z0) r15
            r2 = 773894976(0x2e20b340, float:3.6538994E-11)
            r11.mo14918M(r2)
            r11.mo14918M(r0)
            java.lang.Object r0 = r11.mo14921N()
            java.lang.Object r2 = r14.mo16277a()
            if (r0 != r2) goto L_0x00d3
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r0 = androidx.compose.runtime.EffectsKt.m29901m(r0, r11)
            androidx.compose.runtime.w r2 = new androidx.compose.runtime.w
            r2.<init>(r0)
            r11.mo14893C(r2)
            r0 = r2
        L_0x00d3:
            r11.mo15002m0()
            androidx.compose.runtime.w r0 = (androidx.compose.runtime.C8690w) r0
            kotlinx.coroutines.o0 r2 = r0.mo16831a()
            r11.mo15002m0()
            int r0 = r38.mo12351l()
            boolean r3 = r38.mo12355p()
            r5 = 3
            int r1 = r1 << r5
            r1 = r1 & 896(0x380, float:1.256E-42)
            java.lang.String r3 = m26756k0(r0, r3, r8, r11, r1)
            r1 = 1
            java.lang.String r0 = m26762n0(r8, r1)
            int r12 = r38.mo12351l()
            androidx.compose.material3.l2$a r16 = androidx.compose.material3.C8241l2.f20286b
            int r5 = r16.mo12785b()
            boolean r5 = androidx.compose.material3.C8241l2.m27284f(r12, r5)
            if (r5 == 0) goto L_0x0111
            int r5 = r38.mo12349j()
            java.lang.String r5 = m26762n0(r5, r1)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            goto L_0x011d
        L_0x0111:
            int r5 = r38.mo12346g()
            java.lang.String r5 = m26762n0(r5, r1)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
        L_0x011d:
            androidx.compose.ui.c$a r12 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r12 = r12.mo17066i()
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r1 = androidx.compose.material3.InteractiveComponentSizeKt.m25834f(r6)
            float r13 = f19904n
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10087C(r1, r13)
            r13 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r13)
            boolean r20 = r11.mo15006n0(r15)
            java.lang.Object r13 = r11.mo14921N()
            if (r20 != 0) goto L_0x0148
            r20 = r0
            java.lang.Object r0 = r14.mo16277a()
            if (r13 != r0) goto L_0x0152
            goto L_0x014a
        L_0x0148:
            r20 = r0
        L_0x014a:
            androidx.compose.material3.TimePickerKt$ClockText$1$1 r13 = new androidx.compose.material3.TimePickerKt$ClockText$1$1
            r13.<init>(r15)
            r11.mo14893C(r13)
        L_0x0152:
            r11.mo15002m0()
            kotlin.jvm.functions.l r13 = (kotlin.jvm.functions.C11300l) r13
            androidx.compose.ui.m r0 = androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt.m68999a(r1, r13)
            r16 = r3
            r1 = 3
            r3 = 0
            r13 = 0
            androidx.compose.ui.m r13 = androidx.compose.foundation.FocusableKt.m8920c(r0, r3, r13, r1, r13)
            androidx.compose.material3.TimePickerKt$ClockText$2 r3 = new androidx.compose.material3.TimePickerKt$ClockText$2
            r32 = r20
            r0 = r3
            r7 = 1
            r1 = r5
            r8 = r3
            r5 = r16
            r3 = r38
            r36 = r5
            r5 = r40
            r37 = r6
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71867b(r13, r7, r8)
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11.mo14918M(r1)
            r1 = 6
            r2 = 0
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.BoxKt.m9849k(r12, r2, r11, r1)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r11.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r11.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r11.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r5.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r7 = r11.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x01c3
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01c3:
            r11.mo14938T()
            boolean r7 = r11.mo14997l()
            if (r7 == 0) goto L_0x01d0
            r11.mo14947W(r6)
            goto L_0x01d3
        L_0x01d0:
            r11.mo14888A()
        L_0x01d3:
            r11.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r11)
            kotlin.jvm.functions.p r7 = r5.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r7)
            kotlin.jvm.functions.p r1 = r5.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r1)
            kotlin.jvm.functions.p r1 = r5.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r1)
            kotlin.jvm.functions.p r1 = r5.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            r11.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r11)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r11, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r0 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r0)
            r0 = r36
            boolean r1 = r11.mo15006n0(r0)
            java.lang.Object r2 = r11.mo14921N()
            if (r1 != 0) goto L_0x0229
            java.lang.Object r1 = r14.mo16277a()
            if (r2 != r1) goto L_0x0231
        L_0x0229:
            androidx.compose.material3.TimePickerKt$ClockText$3$1$1 r2 = new androidx.compose.material3.TimePickerKt$ClockText$3$1$1
            r2.<init>(r0)
            r11.mo14893C(r2)
        L_0x0231:
            r11.mo15002m0()
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            r0 = r37
            androidx.compose.ui.m r12 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71866a(r0, r2)
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r33 = 0
            r34 = 0
            r35 = 65532(0xfffc, float:9.183E-41)
            r0 = r11
            r11 = r32
            r32 = r0
            androidx.compose.material3.TextKt.m26700c(r11, r12, r13, r15, r17, r18, r19, r20, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x027c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x027c:
            androidx.compose.runtime.t1 r0 = r0.mo15020s()
            if (r0 != 0) goto L_0x0283
            goto L_0x028f
        L_0x0283:
            androidx.compose.material3.TimePickerKt$ClockText$4 r1 = new androidx.compose.material3.TimePickerKt$ClockText$4
            r2 = r38
            r3 = r39
            r1.<init>(r2, r3, r9, r10)
            r0.mo15202a(r1)
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m26741d(androidx.compose.material3.TimePickerState, int, boolean, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: e */
    public static final long m26743e(C8700z0<C15094f> z0Var) {
        return z0Var.getValue().mo42242A();
    }

    /* renamed from: f */
    public static final void m26745f(C8700z0<C15094f> z0Var, long j) {
        z0Var.setValue(C15094f.m64868d(j));
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m26747g(C8767m mVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        C8767m mVar2 = mVar;
        int i4 = i;
        C8592o o = oVar.mo15009o(2100674302);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(mVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2100674302, i4, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1046)");
            }
            C16432i g = C16432i.m74172g(C16432i.f40718b.mo47667a());
            C16426h hVar = r2;
            C16426h hVar2 = new C16426h(C16426h.C16427a.f40704b.mo47651c(), C16426h.C16430c.f40710b.mo47659a(), (DefaultConstructorMarker) null);
            C16361p0 a = C8377z0.m29474a(C16361p0.m73795c((C16361p0) o.mo15032w(TextKt.m26703f()), 0, 0, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, g, (C16436k) null, 0, (C16442o) null, (C16051a0) null, hVar, (C16417f) null, (C16415e) null, 3653631, (Object) null), false);
            C8767m a2 = SemanticsModifierKt.m71866a(mVar2, TimePickerKt$DisplaySeparator$1.f19911f);
            C8734c i5 = C8734c.f23406a.mo17066i();
            o.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(i5, false, o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(a2);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            oVar2 = o;
            TextKt.m26700c(C33124s.f80355c, (C8767m) null, ColorSchemeKt.m25524k(C8303f1.f21117a.mo13533G(), o, 6), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, a, oVar2, 6, 0, 65530);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new TimePickerKt$DisplaySeparator$3(mVar2, i4));
        }
    }

    /* renamed from: g0 */
    public static final float m26748g0(float f, float f2) {
        float atan2 = ((float) Math.atan2((double) f, (double) f2)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + 6.2831855f : atan2;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m26749h(TimePickerState timePickerState, C8212h3 h3Var, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        TimePickerState timePickerState2 = timePickerState;
        C8212h3 h3Var2 = h3Var;
        int i5 = i;
        C8592o o = oVar.mo15009o(755539561);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(timePickerState2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo15006n0(h3Var2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(755539561, i2, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:801)");
            }
            Arrangement.C2271e f = Arrangement.f6010a.mo7625f();
            o.mo14918M(-483455358);
            C8767m.C8768a aVar = C8767m.f23478j;
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(f, aVar2.mo17072u(), o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar);
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
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            m26737b(timePickerState2, h3Var2, o, (i2 & 14) | (i2 & 112));
            o.mo14918M(-552398963);
            if (!timePickerState.mo12355p()) {
                C8767m o2 = PaddingKt.m10028o(aVar, 0.0f, f19908r, 0.0f, 0.0f, 13, (Object) null);
                o.mo14918M(733328855);
                C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a2 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(o2);
                if (!(o.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                o.mo14938T();
                if (o.mo14997l()) {
                    o.mo14947W(a2);
                } else {
                    o.mo14888A();
                }
                o.mo14941U();
                C8592o b3 = Updater.m30180b(o);
                Updater.m30188j(b3, k, companion.mo44588d());
                Updater.m30188j(b3, dVar2, companion.mo44586b());
                Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
                Updater.m30188j(b3, c4Var2, companion.mo44590f());
                o.mo14972e();
                f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                C8306g1 g1Var = C8306g1.f21226a;
                int i6 = i2 << 3;
                m26751i(SizeKt.m10089E(aVar, g1Var.mo13651v(), g1Var.mo13650u()), timePickerState2, h3Var2, o, (i6 & 896) | (i6 & 112) | 6);
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
            }
            o.mo15002m0();
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
            s.mo15202a(new TimePickerKt$HorizontalClockDisplay$2(timePickerState2, h3Var2, i5));
        }
    }

    /* renamed from: h0 */
    public static final C8767m m26750h0(C8767m mVar, TimePickerState timePickerState, boolean z) {
        C11300l lVar;
        if (InspectableValueKt.m71063e()) {
            lVar = new TimePickerKt$clockDial$$inlined$debugInspectorInfo$1(timePickerState);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new TimePickerKt$clockDial$2(timePickerState, z));
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m26751i(C8767m mVar, TimePickerState timePickerState, C8212h3 h3Var, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(1261215927);
        if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(timePickerState)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (o.mo15006n0(h3Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1261215927, i2, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:878)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.f19912a;
                o.mo14893C(N);
            }
            o.mo15002m0();
            C15218g4 f = ShapesKt.m26127f(C8306g1.f21226a.mo13649t(), o, 6);
            Intrinsics.checkNotNull(f, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            C2683e eVar = (C2683e) f;
            int i6 = (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896);
            C8767m mVar2 = mVar;
            TimePickerState timePickerState2 = timePickerState;
            C8212h3 h3Var2 = h3Var;
            m26755k(mVar2, timePickerState2, h3Var2, (C15560f0) N, ShapesKt.m26126e(eVar), ShapesKt.m26123b(eVar), o, i6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TimePickerKt$HorizontalPeriodToggle$1(mVar, timePickerState, h3Var, i));
        }
    }

    /* renamed from: i0 */
    public static final float m26752i0(float f, float f2, int i, int i2) {
        return (float) Math.hypot((double) (((float) i) - f), (double) (((float) i2) - f2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26753j(@org.jetbrains.annotations.C12579k androidx.compose.material3.TimePickerState r40, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r41, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8212h3 r42, boolean r43, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r44, int r45, int r46) {
        /*
            r1 = r40
            r4 = r43
            r5 = r45
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 5079681(0x4d8281, float:7.118149E-39)
            r2 = r44
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r46 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r5 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r5
            goto L_0x002b
        L_0x002a:
            r3 = r5
        L_0x002b:
            r6 = r46 & 2
            if (r6 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r41
            boolean r8 = r2.mo15006n0(r7)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r3 = r3 | r8
            goto L_0x0047
        L_0x0045:
            r7 = r41
        L_0x0047:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0060
            r8 = r46 & 4
            if (r8 != 0) goto L_0x005a
            r8 = r42
            boolean r9 = r2.mo15006n0(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005a:
            r8 = r42
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
            goto L_0x0062
        L_0x0060:
            r8 = r42
        L_0x0062:
            r9 = r46 & 8
            if (r9 == 0) goto L_0x0069
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0069:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0079
            boolean r9 = r2.mo14961b(r4)
            if (r9 == 0) goto L_0x0076
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r9
        L_0x0079:
            r9 = r3 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008c
            boolean r9 = r2.mo15011p()
            if (r9 != 0) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            r2.mo14958a0()
            r3 = r8
            goto L_0x01d0
        L_0x008c:
            r2.mo14930Q()
            r9 = r5 & 1
            if (r9 == 0) goto L_0x00a6
            boolean r9 = r2.mo14977f0()
            if (r9 == 0) goto L_0x009a
            goto L_0x00a6
        L_0x009a:
            r2.mo14958a0()
            r6 = r46 & 4
            if (r6 == 0) goto L_0x00a3
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a3:
            r39 = r7
            goto L_0x00e0
        L_0x00a6:
            if (r6 == 0) goto L_0x00ad
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r39 = r6
            goto L_0x00af
        L_0x00ad:
            r39 = r7
        L_0x00af:
            r6 = r46 & 4
            if (r6 == 0) goto L_0x00e0
            androidx.compose.material3.i3 r6 = androidx.compose.material3.C8217i3.f20189a
            r7 = 0
            r9 = 0
            r11 = 0
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
            r33 = 0
            r36 = 0
            r37 = 24576(0x6000, float:3.4438E-41)
            r38 = 16383(0x3fff, float:2.2957E-41)
            r35 = r2
            androidx.compose.material3.h3 r6 = r6.mo12658a(r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r36, r37, r38)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00e1
        L_0x00e0:
            r6 = r8
        L_0x00e1:
            r2.mo14899E()
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00f0
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:676)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r7, r8)
        L_0x00f0:
            r8 = 0
            r9 = 0
            r10 = 0
            float r11 = f19899i
            r12 = 7
            r13 = 0
            r7 = r39
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r7 = r7.mo17070q()
            r8 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r8 = r8.mo7630p()
            r9 = 48
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.RowKt.m10071d(r8, r7, r2, r9)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r2.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r13 = r2.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x014e
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x014e:
            r2.mo14938T()
            boolean r13 = r2.mo14997l()
            if (r13 == 0) goto L_0x015b
            r2.mo14947W(r12)
            goto L_0x015e
        L_0x015b:
            r2.mo14888A()
        L_0x015e:
            r2.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r13 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r7, r13)
            kotlin.jvm.functions.p r7 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r7)
            kotlin.jvm.functions.p r7 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r7)
            kotlin.jvm.functions.p r7 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r7)
            r2.mo14972e()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r7 = androidx.compose.runtime.C8684u1.m31905a(r7)
            r8 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.invoke(r7, r2, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r0 = r3 & 14
            int r3 = r3 >> 3
            r7 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            m26749h(r1, r6, r2, r0)
            androidx.compose.ui.m$a r7 = androidx.compose.p004ui.C8767m.f23478j
            float r8 = f19898h
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10092H(r7, r8)
            r8 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r7, r2, r8)
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            m26739c(r1, r6, r4, r2, r0)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01cd
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01cd:
            r3 = r6
            r7 = r39
        L_0x01d0:
            androidx.compose.runtime.t1 r8 = r2.mo15020s()
            if (r8 != 0) goto L_0x01d7
            goto L_0x01e9
        L_0x01d7:
            androidx.compose.material3.TimePickerKt$HorizontalTimePicker$2 r9 = new androidx.compose.material3.TimePickerKt$HorizontalTimePicker$2
            r0 = r9
            r1 = r40
            r2 = r7
            r4 = r43
            r5 = r45
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.mo15202a(r9)
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m26753j(androidx.compose.material3.TimePickerState, androidx.compose.ui.m, androidx.compose.material3.h3, boolean, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: j0 */
    public static final C8767m m26754j0(C8767m mVar, TimePickerState timePickerState, C8212h3 h3Var) {
        return DrawModifierKt.m32438c(mVar, new TimePickerKt$drawSelector$1(timePickerState, h3Var));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26755k(androidx.compose.p004ui.C8767m r25, androidx.compose.material3.TimePickerState r26, androidx.compose.material3.C8212h3 r27, androidx.compose.p004ui.layout.C15560f0 r28, androidx.compose.p004ui.graphics.C15218g4 r29, androidx.compose.p004ui.graphics.C15218g4 r30, androidx.compose.runtime.C8592o r31, int r32) {
        /*
            r1 = r25
            r2 = r26
            r4 = r28
            r7 = r32
            r0 = 1374241901(0x51e9446d, float:1.25234422E11)
            r3 = r31
            androidx.compose.runtime.o r3 = r3.mo15009o(r0)
            r5 = r7 & 14
            if (r5 != 0) goto L_0x0020
            boolean r5 = r3.mo15006n0(r1)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r7
            goto L_0x0021
        L_0x0020:
            r5 = r7
        L_0x0021:
            r6 = r7 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0031
            boolean r6 = r3.mo15006n0(r2)
            if (r6 == 0) goto L_0x002e
            r6 = 32
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r5 = r5 | r6
        L_0x0031:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0044
            r6 = r27
            boolean r8 = r3.mo15006n0(r6)
            if (r8 == 0) goto L_0x0040
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0042
        L_0x0040:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r5 = r5 | r8
            goto L_0x0046
        L_0x0044:
            r6 = r27
        L_0x0046:
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0056
            boolean r8 = r3.mo15006n0(r4)
            if (r8 == 0) goto L_0x0053
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r5 = r5 | r8
        L_0x0056:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r7
            r15 = r29
            if (r8 != 0) goto L_0x006a
            boolean r8 = r3.mo15006n0(r15)
            if (r8 == 0) goto L_0x0067
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0069
        L_0x0067:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0069:
            r5 = r5 | r8
        L_0x006a:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r7
            r14 = r30
            if (r8 != 0) goto L_0x007d
            boolean r8 = r3.mo15006n0(r14)
            if (r8 == 0) goto L_0x007a
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007c
        L_0x007a:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x007c:
            r5 = r5 | r8
        L_0x007d:
            r8 = 374491(0x5b6db, float:5.24774E-40)
            r8 = r8 & r5
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r9) goto L_0x0092
            boolean r8 = r3.mo15011p()
            if (r8 != 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            r3.mo14958a0()
            goto L_0x0253
        L_0x0092:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x009e
            r8 = -1
            java.lang.String r9 = "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:964)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r8, r9)
        L_0x009e:
            androidx.compose.material3.tokens.g1 r0 = androidx.compose.material3.tokens.C8306g1.f21226a
            float r8 = r0.mo13654y()
            long r9 = r27.mo12640d()
            androidx.compose.foundation.i r8 = androidx.compose.foundation.C2250j.m9695a(r8, r9)
            androidx.compose.material3.tokens.ShapeKeyTokens r9 = r0.mo13649t()
            r13 = 6
            androidx.compose.ui.graphics.g4 r9 = androidx.compose.material3.ShapesKt.m26127f(r9, r3, r13)
            java.lang.String r10 = "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9, r10)
            androidx.compose.foundation.shape.e r9 = (androidx.compose.foundation.shape.C2683e) r9
            androidx.compose.material3.t2$a r10 = androidx.compose.material3.C8284t2.f20507b
            int r10 = r10.mo13057i0()
            java.lang.String r10 = androidx.compose.material3.C8357u2.m29348a(r10, r3, r13)
            r12 = 1157296644(0x44faf204, float:2007.563)
            r3.mo14918M(r12)
            boolean r11 = r3.mo15006n0(r10)
            java.lang.Object r12 = r3.mo14921N()
            if (r11 != 0) goto L_0x00de
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r12 != r11) goto L_0x00e6
        L_0x00de:
            androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1 r12 = new androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
            r12.<init>(r10)
            r3.mo14893C(r12)
        L_0x00e6:
            r3.mo15002m0()
            kotlin.jvm.functions.l r12 = (kotlin.jvm.functions.C11300l) r12
            r11 = 0
            r10 = 1
            r13 = 0
            androidx.compose.ui.m r12 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r1, r11, r12, r10, r13)
            androidx.compose.ui.m r12 = androidx.compose.foundation.selection.SelectableGroupKt.m12057a(r12)
            androidx.compose.ui.m r12 = r12.mo17224k3(r1)
            androidx.compose.ui.m r8 = androidx.compose.foundation.BorderKt.m8850f(r12, r8, r9)
            int r9 = r5 >> 3
            r9 = r9 & 896(0x380, float:1.256E-42)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.mo14918M(r12)
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r12 = r3.mo15032w(r12)
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r3.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r3.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r17.mo44585a()
            kotlin.jvm.functions.q r8 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r8)
            int r9 = r9 << 9
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r16 = 6
            r9 = r9 | 6
            androidx.compose.runtime.d r1 = r3.mo15017r()
            boolean r1 = r1 instanceof androidx.compose.runtime.C8428d
            if (r1 != 0) goto L_0x0143
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0143:
            r3.mo14938T()
            boolean r1 = r3.mo14997l()
            if (r1 == 0) goto L_0x0150
            r3.mo14947W(r10)
            goto L_0x0153
        L_0x0150:
            r3.mo14888A()
        L_0x0153:
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r3)
            kotlin.jvm.functions.p r10 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r4, r10)
            kotlin.jvm.functions.p r10 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r12, r10)
            kotlin.jvm.functions.p r10 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r11, r10)
            kotlin.jvm.functions.p r10 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r13, r10)
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r3)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            int r9 = r9 >> 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.invoke(r1, r3, r9)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.mo14918M(r1)
            boolean r1 = r26.mo12357r()
            r10 = 1
            r8 = r1 ^ 1
            r1 = 1157296644(0x44faf204, float:2007.563)
            r3.mo14918M(r1)
            boolean r9 = r3.mo15006n0(r2)
            java.lang.Object r11 = r3.mo14921N()
            if (r9 != 0) goto L_0x01ab
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r11 != r9) goto L_0x01b3
        L_0x01ab:
            androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1 r11 = new androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
            r11.<init>(r2)
            r3.mo14893C(r11)
        L_0x01b3:
            r3.mo15002m0()
            kotlin.jvm.functions.a r11 = (kotlin.jvm.functions.C11289a) r11
            androidx.compose.material3.ComposableSingletons$TimePickerKt r17 = androidx.compose.material3.ComposableSingletons$TimePickerKt.f19293a
            kotlin.jvm.functions.q r12 = r17.mo11328a()
            int r9 = r5 >> 9
            r9 = r9 & 112(0x70, float:1.57E-43)
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            int r13 = r5 << 3
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r18 = r9 | r13
            r9 = r29
            r1 = r10
            r10 = r11
            r11 = r27
            r16 = r13
            r4 = 0
            r13 = r3
            r14 = r18
            m26772v(r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            java.lang.String r9 = "Spacer"
            androidx.compose.ui.m r8 = androidx.compose.p004ui.layout.C15594q.m69318b(r8, r9)
            r9 = 1073741824(0x40000000, float:2.0)
            androidx.compose.ui.m r8 = androidx.compose.p004ui.ZIndexModifierKt.m32294a(r8, r9)
            r9 = 0
            androidx.compose.ui.m r19 = androidx.compose.foundation.layout.SizeKt.m10112l(r8, r9, r1, r4)
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r0 = r0.mo13653x()
            r1 = 6
            long r20 = androidx.compose.material3.ColorSchemeKt.m25524k(r0, r3, r1)
            r22 = 0
            r23 = 2
            r24 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.BackgroundKt.m8825d(r19, r20, r22, r23, r24)
            r1 = 0
            androidx.compose.foundation.layout.C2428y0.m10726a(r0, r3, r1)
            boolean r8 = r26.mo12357r()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r3.mo14918M(r0)
            boolean r0 = r3.mo15006n0(r2)
            java.lang.Object r1 = r3.mo14921N()
            if (r0 != 0) goto L_0x021f
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0227
        L_0x021f:
            androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1 r1 = new androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
            r1.<init>(r2)
            r3.mo14893C(r1)
        L_0x0227:
            r3.mo15002m0()
            r10 = r1
            kotlin.jvm.functions.a r10 = (kotlin.jvm.functions.C11289a) r10
            kotlin.jvm.functions.q r12 = r17.mo11329b()
            int r0 = r5 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r14 = r0 | r16
            r9 = r30
            r11 = r27
            r13 = r3
            m26772v(r8, r9, r10, r11, r12, r13, r14)
            r3.mo15002m0()
            r3.mo14896D()
            r3.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0253
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0253:
            androidx.compose.runtime.t1 r8 = r3.mo15020s()
            if (r8 != 0) goto L_0x025a
            goto L_0x0271
        L_0x025a:
            androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3 r9 = new androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3
            r0 = r9
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x0271:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m26755k(androidx.compose.ui.m, androidx.compose.material3.TimePickerState, androidx.compose.material3.h3, androidx.compose.ui.layout.f0, androidx.compose.ui.graphics.g4, androidx.compose.ui.graphics.g4, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: k0 */
    public static final String m26756k0(int i, boolean z, int i2, @C12580l C8592o oVar, int i3) {
        int i4;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1826155772, i3, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1542)");
        }
        if (C8241l2.m27284f(i, C8241l2.f20286b.mo12785b())) {
            i4 = C8284t2.f20507b.mo13051f0();
        } else if (z) {
            i4 = C8284t2.f20507b.mo13038X();
        } else {
            i4 = C8284t2.f20507b.mo13043b0();
        }
        String b = C8357u2.m29349b(i4, new Object[]{Integer.valueOf(i2)}, oVar, 64);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26757l(@org.jetbrains.annotations.C12579k androidx.compose.material3.TimePickerState r39, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r40, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8212h3 r41, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r42, int r43, int r44) {
        /*
            r1 = r39
            r4 = r43
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -760850373(0xffffffffd2a6583b, float:-3.57222416E11)
            r2 = r42
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r44 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r4 | 6
            goto L_0x0029
        L_0x0019:
            r3 = r4 & 14
            if (r3 != 0) goto L_0x0028
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0028:
            r3 = r4
        L_0x0029:
            r5 = r44 & 2
            if (r5 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0043
            r6 = r40
            boolean r7 = r2.mo15006n0(r6)
            if (r7 == 0) goto L_0x003f
            r7 = 32
            goto L_0x0041
        L_0x003f:
            r7 = 16
        L_0x0041:
            r3 = r3 | r7
            goto L_0x0045
        L_0x0043:
            r6 = r40
        L_0x0045:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005e
            r7 = r44 & 4
            if (r7 != 0) goto L_0x0058
            r7 = r41
            boolean r8 = r2.mo15006n0(r7)
            if (r8 == 0) goto L_0x005a
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x0058:
            r7 = r41
        L_0x005a:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r3 = r3 | r8
            goto L_0x0060
        L_0x005e:
            r7 = r41
        L_0x0060:
            r8 = r3 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0073
            boolean r8 = r2.mo15011p()
            if (r8 != 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            r2.mo14958a0()
        L_0x0070:
            r3 = r7
            goto L_0x00ef
        L_0x0073:
            r2.mo14930Q()
            r8 = r4 & 1
            if (r8 == 0) goto L_0x008b
            boolean r8 = r2.mo14977f0()
            if (r8 == 0) goto L_0x0081
            goto L_0x008b
        L_0x0081:
            r2.mo14958a0()
            r5 = r44 & 4
            if (r5 == 0) goto L_0x00c7
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00c7
        L_0x008b:
            if (r5 == 0) goto L_0x0092
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r38 = r5
            goto L_0x0094
        L_0x0092:
            r38 = r6
        L_0x0094:
            r5 = r44 & 4
            if (r5 == 0) goto L_0x00c5
            androidx.compose.material3.i3 r5 = androidx.compose.material3.C8217i3.f20189a
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r35 = 0
            r36 = 24576(0x6000, float:3.4438E-41)
            r37 = 16383(0x3fff, float:2.2957E-41)
            r34 = r2
            androidx.compose.material3.h3 r5 = r5.mo12658a(r6, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r35, r36, r37)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r7 = r5
        L_0x00c5:
            r6 = r38
        L_0x00c7:
            r2.mo14899E()
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x00d6
            r5 = -1
            java.lang.String r8 = "androidx.compose.material3.TimeInput (TimePicker.kt:230)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r5, r8)
        L_0x00d6:
            int r0 = r3 >> 3
            r5 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r5
            int r3 = r3 << 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            m26759m(r6, r7, r1, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0070
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x0070
        L_0x00ef:
            androidx.compose.runtime.t1 r7 = r2.mo15020s()
            if (r7 != 0) goto L_0x00f6
            goto L_0x0106
        L_0x00f6:
            androidx.compose.material3.TimePickerKt$TimeInput$1 r8 = new androidx.compose.material3.TimePickerKt$TimeInput$1
            r0 = r8
            r1 = r39
            r2 = r6
            r4 = r43
            r5 = r44
            r0.<init>(r1, r2, r3, r4, r5)
            r7.mo15202a(r8)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m26757l(androidx.compose.material3.TimePickerState, androidx.compose.ui.m, androidx.compose.material3.h3, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.material3.C8251n0
    @org.jetbrains.annotations.C12579k
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.TimePickerState m26758l0(int r10, int r11, boolean r12, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r13, int r14, int r15) {
        /*
            r0 = 1237715277(0x49c6094d, float:1622313.6)
            r13.mo14918M(r0)
            r1 = r15 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000c
            r10 = r2
        L_0x000c:
            r1 = r15 & 2
            if (r1 == 0) goto L_0x0011
            r11 = r2
        L_0x0011:
            r15 = r15 & 4
            if (r15 == 0) goto L_0x0019
            boolean r12 = androidx.compose.material3.C8206g3.m27121a(r13, r2)
        L_0x0019:
            boolean r15 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r15 == 0) goto L_0x0025
            r15 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:438)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r15, r1)
        L_0x0025:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            androidx.compose.material3.TimePickerState$Companion r14 = androidx.compose.material3.TimePickerState.f19915l
            androidx.compose.runtime.saveable.e r4 = r14.mo12366a()
            r5 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r13.mo14918M(r1)
            boolean r14 = r13.mo15006n0(r14)
            boolean r15 = r13.mo15006n0(r15)
            r14 = r14 | r15
            boolean r15 = r13.mo15006n0(r0)
            r14 = r14 | r15
            java.lang.Object r15 = r13.mo14921N()
            if (r14 != 0) goto L_0x005c
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r14 = r14.mo16277a()
            if (r15 != r14) goto L_0x0064
        L_0x005c:
            androidx.compose.material3.TimePickerKt$rememberTimePickerState$1$1 r15 = new androidx.compose.material3.TimePickerKt$rememberTimePickerState$1$1
            r15.<init>(r10, r11, r12)
            r13.mo14893C(r15)
        L_0x0064:
            r13.mo15002m0()
            r6 = r15
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            r8 = 72
            r9 = 4
            r7 = r13
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.material3.TimePickerState r10 = (androidx.compose.material3.TimePickerState) r10
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x007d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x007d:
            r13.mo15002m0()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m26758l0(int, int, boolean, androidx.compose.runtime.o, int, int):androidx.compose.material3.TimePickerState");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26759m(androidx.compose.p004ui.C8767m r49, androidx.compose.material3.C8212h3 r50, androidx.compose.material3.TimePickerState r51, androidx.compose.runtime.C8592o r52, int r53) {
        /*
            r7 = r49
            r8 = r50
            r9 = r51
            r10 = r53
            r0 = -475657989(0xffffffffe3a608fb, float:-6.125613E21)
            r1 = r52
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0020
            boolean r1 = r6.mo15006n0(r7)
            if (r1 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 2
        L_0x001e:
            r1 = r1 | r10
            goto L_0x0021
        L_0x0020:
            r1 = r10
        L_0x0021:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0031
            boolean r2 = r6.mo15006n0(r8)
            if (r2 == 0) goto L_0x002e
            r2 = 32
            goto L_0x0030
        L_0x002e:
            r2 = 16
        L_0x0030:
            r1 = r1 | r2
        L_0x0031:
            r2 = r10 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0041
            boolean r2 = r6.mo15006n0(r9)
            if (r2 == 0) goto L_0x003e
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r1 = r1 | r2
        L_0x0041:
            r5 = r1
            r1 = r5 & 731(0x2db, float:1.024E-42)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x0055
            boolean r1 = r6.mo15011p()
            if (r1 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            r6.mo14958a0()
            r13 = r6
            goto L_0x02e8
        L_0x0055:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0061
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.TimeInputImpl (TimePicker.kt:693)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r1, r2)
        L_0x0061:
            r4 = 0
            java.lang.Object[] r11 = new java.lang.Object[r4]
            androidx.compose.ui.text.input.TextFieldValue$a r0 = androidx.compose.p004ui.text.input.TextFieldValue.f40411d
            androidx.compose.runtime.saveable.e r12 = r0.mo47117a()
            r13 = 0
            r1 = 1157296644(0x44faf204, float:2007.563)
            r6.mo14918M(r1)
            boolean r2 = r6.mo15006n0(r9)
            java.lang.Object r3 = r6.mo14921N()
            if (r2 != 0) goto L_0x0083
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x008b
        L_0x0083:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1 r3 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
            r3.<init>(r9)
            r6.mo14893C(r3)
        L_0x008b:
            r6.mo15002m0()
            r14 = r3
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            r16 = 72
            r17 = 4
            r15 = r6
            androidx.compose.runtime.z0 r18 = androidx.compose.runtime.saveable.RememberSaveableKt.m31342c(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            androidx.compose.runtime.saveable.e r12 = r0.mo47117a()
            r13 = 0
            r6.mo14918M(r1)
            boolean r0 = r6.mo15006n0(r9)
            java.lang.Object r1 = r6.mo14921N()
            if (r0 != 0) goto L_0x00b6
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x00be
        L_0x00b6:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1 r1 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
            r1.<init>(r9)
            r6.mo14893C(r1)
        L_0x00be:
            r6.mo15002m0()
            r14 = r1
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            r16 = 72
            r17 = 4
            r15 = r6
            androidx.compose.runtime.z0 r11 = androidx.compose.runtime.saveable.RememberSaveableKt.m31342c(r11, r12, r13, r14, r15, r16, r17)
            r1 = 0
            r2 = 0
            r3 = 0
            float r12 = f19902l
            r13 = 7
            r14 = 0
            r0 = r49
            r15 = r4
            r4 = r12
            r12 = r5
            r5 = r13
            r13 = r6
            r6 = r14
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.c$a r14 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r1 = r14.mo17073w()
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r13.mo14918M(r2)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r2 = r2.mo7630p()
            r3 = 48
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.RowKt.m10071d(r2, r1, r13, r3)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.mo14918M(r6)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r13.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r13.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r13.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r5 = r16.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r6 = r13.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x0131
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0131:
            r13.mo14938T()
            boolean r6 = r13.mo14997l()
            if (r6 == 0) goto L_0x013e
            r13.mo14947W(r5)
            goto L_0x0141
        L_0x013e:
            r13.mo14888A()
        L_0x0141:
            r13.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r13)
            kotlin.jvm.functions.p r6 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r1, r6)
            kotlin.jvm.functions.p r1 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r2, r1)
            kotlin.jvm.functions.p r1 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r3, r1)
            kotlin.jvm.functions.p r1 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r4, r1)
            r13.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r13)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r0.invoke(r1, r13, r2)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r6)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.material3.i1 r0 = androidx.compose.material3.C8215i1.f20180a
            r5 = 6
            androidx.compose.material3.s3 r0 = r0.mo12654c(r13, r5)
            androidx.compose.material3.tokens.f1 r17 = androidx.compose.material3.tokens.C8303f1.f21117a
            androidx.compose.material3.tokens.TypographyKeyTokens r1 = r17.mo13532F()
            androidx.compose.ui.text.p0 r19 = androidx.compose.material3.TypographyKt.m26914a(r0, r1)
            androidx.compose.ui.text.style.i$a r0 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r0 = r0.mo47667a()
            r4 = 1
            long r20 = r8.mo12647i(r4)
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r36 = 0
            r37 = 0
            androidx.compose.ui.text.style.i r38 = androidx.compose.p004ui.text.style.C16432i.m74172g(r0)
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 4177918(0x3fbffe, float:5.85451E-39)
            r48 = 0
            androidx.compose.ui.text.p0 r0 = androidx.compose.p004ui.text.C16361p0.m73795c(r19, r20, r22, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r36, r37, r38, r39, r40, r42, r43, r44, r45, r46, r47, r48)
            androidx.compose.runtime.j1[] r3 = new androidx.compose.runtime.C8572j1[r4]
            androidx.compose.runtime.i1 r1 = androidx.compose.material3.TextKt.m26703f()
            androidx.compose.runtime.j1 r0 = r1.mo16141f(r0)
            r3[r15] = r0
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1 r2 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
            r0 = r2
            r1 = r18
            r6 = r2
            r2 = r51
            r15 = r3
            r3 = r12
            r7 = r4
            r4 = r50
            r20 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1306700887(0x4de2ac57, float:4.7536816E8)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r0, r7, r6)
            r1 = 56
            androidx.compose.runtime.CompositionLocalKt.m29856b(r15, r0, r13, r1)
            r0 = 565119480(0x21af09f8, float:1.18611E-18)
            r13.mo14918M(r0)
            boolean r0 = r51.mo12355p()
            if (r0 != 0) goto L_0x02d0
            float r1 = f19908r
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r0 = r49
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r0, r1, r2, r3, r4, r5, r6)
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r13.mo14918M(r1)
            androidx.compose.ui.c r1 = r14.mo17061C()
            r2 = 0
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.BoxKt.m9849k(r1, r2, r13, r2)
            r13.mo14918M(r11)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r13.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r13.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r13.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            kotlin.jvm.functions.a r5 = r16.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r6 = r13.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x025d
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x025d:
            r13.mo14938T()
            boolean r6 = r13.mo14997l()
            if (r6 == 0) goto L_0x026a
            r13.mo14947W(r5)
            goto L_0x026d
        L_0x026a:
            r13.mo14888A()
        L_0x026d:
            r13.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r13)
            kotlin.jvm.functions.p r6 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r1, r6)
            kotlin.jvm.functions.p r1 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r2, r1)
            kotlin.jvm.functions.p r1 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r3, r1)
            kotlin.jvm.functions.p r1 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r4, r1)
            r13.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r13)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r13, r2)
            r13.mo14918M(r7)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            float r1 = r17.mo13544h()
            float r2 = r17.mo13542f()
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10089E(r0, r1, r2)
            int r1 = r12 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            int r2 = r12 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            m26774x(r0, r9, r8, r13, r1)
            r13.mo15002m0()
            r13.mo14896D()
            r13.mo15002m0()
            r13.mo15002m0()
        L_0x02d0:
            r13.mo15002m0()
            r13.mo15002m0()
            r13.mo14896D()
            r13.mo15002m0()
            r13.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02e8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02e8:
            androidx.compose.runtime.t1 r0 = r13.mo15020s()
            if (r0 != 0) goto L_0x02ef
            goto L_0x02f9
        L_0x02ef:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$2 r1 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$2
            r2 = r49
            r1.<init>(r2, r8, r9, r10)
            r0.mo15202a(r1)
        L_0x02f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m26759m(androidx.compose.ui.m, androidx.compose.material3.h3, androidx.compose.material3.TimePickerState, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: m0 */
    public static final void m26760m0(int i, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i2, C11300l<? super TextFieldValue, C11079d2> lVar) {
        boolean z;
        int i3;
        if (Intrinsics.areEqual((Object) textFieldValue.mo47115i(), (Object) textFieldValue2.mo47115i())) {
            lVar.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.mo47115i().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C8241l2.m27284f(i, C8241l2.f20286b.mo12784a())) {
                timePickerState.mo12365z(0);
            } else {
                timePickerState.mo12336C(0);
            }
            lVar.invoke(TextFieldValue.m73308e(textFieldValue, "", 0, (C16356n0) null, 6, (Object) null));
            return;
        }
        try {
            if (textFieldValue.mo47115i().length() == 3 && C16356n0.m73742n(textFieldValue.mo47113h()) == 1) {
                i3 = C11601c.m45200F(textFieldValue.mo47115i().charAt(0));
            } else {
                i3 = Integer.parseInt(textFieldValue.mo47115i());
            }
            if (i3 <= i2) {
                C8241l2.C8242a aVar = C8241l2.f20286b;
                if (C8241l2.m27284f(i, aVar.mo12784a())) {
                    timePickerState.mo12365z(i3);
                    if (i3 > 1 && !timePickerState.mo12355p()) {
                        timePickerState.mo12338E(aVar.mo12785b());
                    }
                } else {
                    timePickerState.mo12336C(i3);
                }
                if (textFieldValue.mo47115i().length() > 2) {
                    textFieldValue = TextFieldValue.m73308e(textFieldValue, String.valueOf(textFieldValue.mo47115i().charAt(0)), 0, (C16356n0) null, 6, (Object) null);
                }
                lVar.invoke(textFieldValue);
            }
        } catch (IllegalArgumentException | NumberFormatException unused) {
        }
    }

    /* renamed from: n */
    public static final TextFieldValue m26761n(C8700z0<TextFieldValue> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: n0 */
    public static final String m26762n0(int i, int i2) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        integerInstance.setMinimumIntegerDigits(i2);
        String format = integerInstance.format(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(this)");
        return format;
    }

    /* renamed from: o */
    public static final void m26763o(C8700z0<TextFieldValue> z0Var, TextFieldValue textFieldValue) {
        z0Var.setValue(textFieldValue);
    }

    /* renamed from: o0 */
    public static final Pair<Float, Float> m26764o0(float f, float f2) {
        if (((double) Math.abs(f - f2)) <= 3.141592653589793d) {
            return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
        }
        double d = (double) f;
        if (d > 3.141592653589793d && ((double) f2) < 3.141592653589793d) {
            f2 += 6.2831855f;
        } else if (d < 3.141592653589793d && ((double) f2) > 3.141592653589793d) {
            f += 6.2831855f;
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
    }

    /* renamed from: p */
    public static final TextFieldValue m26765p(C8700z0<TextFieldValue> z0Var) {
        return z0Var.getValue();
    }

    @C8547h2
    /* renamed from: p0 */
    public static final C8767m m26766p0(C8767m mVar, boolean z) {
        C11300l lVar;
        if (InspectableValueKt.m71063e()) {
            lVar = new TimePickerKt$visible$$inlined$debugInspectorInfo$1(z);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new VisibleModifier(z, lVar));
    }

    /* renamed from: q */
    public static final void m26767q(C8700z0<TextFieldValue> z0Var, TextFieldValue textFieldValue) {
        z0Var.setValue(textFieldValue);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26768r(@org.jetbrains.annotations.C12579k androidx.compose.material3.TimePickerState r42, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r43, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8212h3 r44, int r45, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r46, int r47, int r48) {
        /*
            r7 = r42
            r8 = r47
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -619286452(0xffffffffdb16704c, float:-4.2344718E16)
            r1 = r46
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r48 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r8 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r8 & 14
            if (r1 != 0) goto L_0x0028
            boolean r1 = r6.mo15006n0(r7)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r8
            goto L_0x0029
        L_0x0028:
            r1 = r8
        L_0x0029:
            r2 = r48 & 2
            if (r2 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0043
        L_0x0030:
            r3 = r8 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0043
            r3 = r43
            boolean r4 = r6.mo15006n0(r3)
            if (r4 == 0) goto L_0x003f
            r4 = 32
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r1 = r1 | r4
            goto L_0x0045
        L_0x0043:
            r3 = r43
        L_0x0045:
            r4 = r8 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x005e
            r4 = r48 & 4
            if (r4 != 0) goto L_0x0058
            r4 = r44
            boolean r5 = r6.mo15006n0(r4)
            if (r5 == 0) goto L_0x005a
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x0058:
            r4 = r44
        L_0x005a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r1 = r1 | r5
            goto L_0x0060
        L_0x005e:
            r4 = r44
        L_0x0060:
            r5 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0079
            r5 = r48 & 8
            if (r5 != 0) goto L_0x0073
            r5 = r45
            boolean r9 = r6.mo14976f(r5)
            if (r9 == 0) goto L_0x0075
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0073:
            r5 = r45
        L_0x0075:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r1 = r1 | r9
            goto L_0x007b
        L_0x0079:
            r5 = r45
        L_0x007b:
            r9 = r1 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0091
            boolean r9 = r6.mo15011p()
            if (r9 != 0) goto L_0x0088
            goto L_0x0091
        L_0x0088:
            r6.mo14958a0()
            r2 = r3
            r3 = r4
            r4 = r5
            r13 = r6
            goto L_0x016f
        L_0x0091:
            r6.mo14930Q()
            r9 = r8 & 1
            if (r9 == 0) goto L_0x00b1
            boolean r9 = r6.mo14977f0()
            if (r9 == 0) goto L_0x009f
            goto L_0x00b1
        L_0x009f:
            r6.mo14958a0()
            r2 = r48 & 4
            if (r2 == 0) goto L_0x00a8
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a8:
            r2 = r48 & 8
            if (r2 == 0) goto L_0x00ae
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ae:
            r9 = r3
            r10 = r4
            goto L_0x00fc
        L_0x00b1:
            if (r2 == 0) goto L_0x00b6
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00b7
        L_0x00b6:
            r2 = r3
        L_0x00b7:
            r3 = r48 & 4
            if (r3 == 0) goto L_0x00e8
            androidx.compose.material3.i3 r9 = androidx.compose.material3.C8217i3.f20189a
            r10 = 0
            r12 = 0
            r14 = 0
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
            r36 = 0
            r39 = 0
            r40 = 24576(0x6000, float:3.4438E-41)
            r41 = 16383(0x3fff, float:2.2957E-41)
            r38 = r6
            androidx.compose.material3.h3 r3 = r9.mo12658a(r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r39, r40, r41)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00e9
        L_0x00e8:
            r3 = r4
        L_0x00e9:
            r4 = r48 & 8
            if (r4 == 0) goto L_0x00fa
            androidx.compose.material3.i3 r4 = androidx.compose.material3.C8217i3.f20189a
            r5 = 6
            int r4 = r4.mo12659b(r6, r5)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r9 = r2
            r10 = r3
            r11 = r4
            goto L_0x00fd
        L_0x00fa:
            r9 = r2
            r10 = r3
        L_0x00fc:
            r11 = r5
        L_0x00fd:
            r6.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x010c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimePicker (TimePicker.kt:188)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x010c:
            r0 = 0
            androidx.compose.runtime.k2 r0 = androidx.compose.material3.TouchExplorationStateProvider_androidKt.m26908c(r6, r0)
            androidx.compose.material3.j3$a r2 = androidx.compose.material3.C8230j3.f20250b
            int r2 = r2.mo12728b()
            boolean r2 = androidx.compose.material3.C8230j3.m27219f(r11, r2)
            if (r2 == 0) goto L_0x0141
            r2 = 1318081657(0x4e905479, float:1.21072755E9)
            r6.mo14918M(r2)
            boolean r0 = m26770t(r0)
            r3 = r0 ^ 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r12 = 0
            r0 = r42
            r1 = r9
            r2 = r10
            r4 = r6
            r13 = r6
            r6 = r12
            m26775y(r0, r1, r2, r3, r4, r5, r6)
            r13.mo15002m0()
            goto L_0x0163
        L_0x0141:
            r13 = r6
            r2 = 1318081863(0x4e905547, float:1.21075392E9)
            r13.mo14918M(r2)
            boolean r0 = m26770t(r0)
            r3 = r0 ^ 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r6 = 0
            r0 = r42
            r1 = r9
            r2 = r10
            r4 = r13
            m26753j(r0, r1, r2, r3, r4, r5, r6)
            r13.mo15002m0()
        L_0x0163:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x016c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x016c:
            r2 = r9
            r3 = r10
            r4 = r11
        L_0x016f:
            androidx.compose.runtime.t1 r9 = r13.mo15020s()
            if (r9 != 0) goto L_0x0176
            goto L_0x0185
        L_0x0176:
            androidx.compose.material3.TimePickerKt$TimePicker$1 r10 = new androidx.compose.material3.TimePickerKt$TimePicker$1
            r0 = r10
            r1 = r42
            r5 = r47
            r6 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.mo15202a(r10)
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m26768r(androidx.compose.material3.TimePickerState, androidx.compose.ui.m, androidx.compose.material3.h3, int, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0107  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26769s(androidx.compose.p004ui.C8767m r118, androidx.compose.p004ui.text.input.TextFieldValue r119, kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.text.input.TextFieldValue, kotlin.C11079d2> r120, androidx.compose.material3.TimePickerState r121, int r122, androidx.compose.foundation.text.C2779m r123, androidx.compose.foundation.text.C2776k r124, androidx.compose.material3.C8212h3 r125, androidx.compose.runtime.C8592o r126, int r127, int r128) {
        /*
            r13 = r119
            r7 = r121
            r15 = r122
            r12 = r125
            r11 = r127
            r10 = r128
            r0 = -367523658(0xffffffffea1808b6, float:-4.5949465E25)
            r1 = r126
            androidx.compose.runtime.o r9 = r1.mo15009o(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x001e
            r1 = r11 | 6
            r6 = r118
            goto L_0x0030
        L_0x001e:
            r1 = r11 & 14
            r6 = r118
            if (r1 != 0) goto L_0x002f
            boolean r1 = r9.mo15006n0(r6)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r11
            goto L_0x0030
        L_0x002f:
            r1 = r11
        L_0x0030:
            r2 = r10 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x0047
        L_0x0037:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0047
            boolean r2 = r9.mo15006n0(r13)
            if (r2 == 0) goto L_0x0044
            r2 = 32
            goto L_0x0046
        L_0x0044:
            r2 = 16
        L_0x0046:
            r1 = r1 | r2
        L_0x0047:
            r2 = r10 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            r5 = r120
            goto L_0x0062
        L_0x0050:
            r2 = r11 & 896(0x380, float:1.256E-42)
            r5 = r120
            if (r2 != 0) goto L_0x0062
            boolean r2 = r9.mo14927P(r5)
            if (r2 == 0) goto L_0x005f
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r2
        L_0x0062:
            r2 = r10 & 8
            if (r2 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0069:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0079
            boolean r2 = r9.mo15006n0(r7)
            if (r2 == 0) goto L_0x0076
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r1 = r1 | r2
        L_0x0079:
            r2 = r10 & 16
            r3 = 57344(0xe000, float:8.0356E-41)
            if (r2 == 0) goto L_0x0083
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0093
        L_0x0083:
            r2 = r11 & r3
            if (r2 != 0) goto L_0x0093
            boolean r2 = r9.mo14976f(r15)
            if (r2 == 0) goto L_0x0090
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r2
        L_0x0093:
            r2 = r10 & 32
            if (r2 == 0) goto L_0x009b
            r4 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r4
            goto L_0x00b0
        L_0x009b:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r11
            if (r4 != 0) goto L_0x00b0
            r4 = r123
            boolean r16 = r9.mo15006n0(r4)
            if (r16 == 0) goto L_0x00ab
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r1 = r1 | r16
            goto L_0x00b2
        L_0x00b0:
            r4 = r123
        L_0x00b2:
            r16 = r10 & 64
            r110 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00bf
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r8 = r124
            goto L_0x00d2
        L_0x00bf:
            r17 = r11 & r110
            r8 = r124
            if (r17 != 0) goto L_0x00d2
            boolean r17 = r9.mo15006n0(r8)
            if (r17 == 0) goto L_0x00ce
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r1 = r1 | r17
        L_0x00d2:
            r14 = r10 & 128(0x80, float:1.794E-43)
            r111 = 29360128(0x1c00000, float:7.052966E-38)
            if (r14 == 0) goto L_0x00dc
            r14 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00da:
            r1 = r1 | r14
            goto L_0x00ec
        L_0x00dc:
            r14 = r11 & r111
            if (r14 != 0) goto L_0x00ec
            boolean r14 = r9.mo15006n0(r12)
            if (r14 == 0) goto L_0x00e9
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00da
        L_0x00e9:
            r14 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00da
        L_0x00ec:
            r14 = r1
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r14
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r3) goto L_0x0107
            boolean r1 = r9.mo15011p()
            if (r1 != 0) goto L_0x00fd
            goto L_0x0107
        L_0x00fd:
            r9.mo14958a0()
            r6 = r4
            r5 = r7
            r7 = r8
            r4 = r9
            r0 = r15
            goto L_0x05ca
        L_0x0107:
            if (r2 == 0) goto L_0x0112
            androidx.compose.foundation.text.m$a r1 = androidx.compose.foundation.text.C2779m.f7294e
            androidx.compose.foundation.text.m r1 = r1.mo9541a()
            r112 = r1
            goto L_0x0114
        L_0x0112:
            r112 = r4
        L_0x0114:
            if (r16 == 0) goto L_0x011f
            androidx.compose.foundation.text.k$a r1 = androidx.compose.foundation.text.C2776k.f7285g
            androidx.compose.foundation.text.k r1 = r1.mo9531a()
            r113 = r1
            goto L_0x0121
        L_0x011f:
            r113 = r8
        L_0x0121:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x012d
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1386)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r1, r2)
        L_0x012d:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.mo14918M(r0)
            java.lang.Object r1 = r9.mo14921N()
            androidx.compose.runtime.o$a r114 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r114.mo16277a()
            if (r1 != r2) goto L_0x0146
            androidx.compose.foundation.interaction.g r1 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r9.mo14893C(r1)
        L_0x0146:
            r9.mo15002m0()
            r8 = r1
            androidx.compose.foundation.interaction.g r8 = (androidx.compose.foundation.interaction.C2243g) r8
            r9.mo14918M(r0)
            java.lang.Object r0 = r9.mo14921N()
            java.lang.Object r1 = r114.mo16277a()
            if (r0 != r1) goto L_0x0161
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r9.mo14893C(r0)
        L_0x0161:
            r9.mo15002m0()
            r4 = r0
            androidx.compose.ui.focus.FocusRequester r4 = (androidx.compose.p004ui.focus.FocusRequester) r4
            androidx.compose.material3.OutlinedTextFieldDefaults r16 = androidx.compose.material3.OutlinedTextFieldDefaults.f19530a
            r3 = 1
            long r25 = r12.mo12645h(r3)
            long r27 = r12.mo12645h(r3)
            long r17 = r12.mo12647i(r3)
            r19 = 0
            r21 = 0
            r23 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            r107 = 3072(0xc00, float:4.305E-42)
            r108 = 2147483598(0x7fffffce, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r102 = r9
            androidx.compose.material3.d3 r2 = r16.mo11746c(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            int r0 = r121.mo12351l()
            boolean r1 = androidx.compose.material3.C8241l2.m27284f(r15, r0)
            r0 = r14 & 14
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r9.mo14918M(r3)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r3 = r3.mo7631r()
            androidx.compose.ui.c$a r16 = androidx.compose.p004ui.C8734c.f23406a
            r124 = r2
            androidx.compose.ui.c$b r2 = r16.mo17072u()
            int r17 = r0 >> 3
            r18 = r17 & 14
            r17 = r17 & 112(0x70, float:1.57E-43)
            r19 = r4
            r4 = r18 | r17
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.ColumnKt.m9863b(r3, r2, r9, r4)
            r17 = 3
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r9.mo14918M(r4)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r9.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r9.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r9.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r20 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r20.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r118)
            int r0 = r0 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r12 = 6
            r0 = r0 | r12
            androidx.compose.runtime.d r12 = r9.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x024c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x024c:
            r9.mo14938T()
            boolean r12 = r9.mo14997l()
            if (r12 == 0) goto L_0x0259
            r9.mo14947W(r6)
            goto L_0x025c
        L_0x0259:
            r9.mo14888A()
        L_0x025c:
            r9.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r9)
            kotlin.jvm.functions.p r12 = r20.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r12)
            kotlin.jvm.functions.p r2 = r20.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r2)
            kotlin.jvm.functions.p r2 = r20.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r2)
            kotlin.jvm.functions.p r2 = r20.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r2)
            r9.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r9)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            int r0 = r0 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.invoke(r2, r9, r0)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r9.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r0 = 896149831(0x356a2947, float:8.723186E-7)
            r9.mo14918M(r0)
            if (r1 != 0) goto L_0x02f3
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.material3.tokens.f1 r2 = androidx.compose.material3.tokens.C8303f1.f21117a
            float r3 = r2.mo13561y()
            float r2 = r2.mo13559w()
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10089E(r0, r3, r2)
            androidx.compose.material3.l2$a r2 = androidx.compose.material3.C8241l2.f20286b
            int r2 = r2.mo12784a()
            boolean r2 = androidx.compose.material3.C8241l2.m27284f(r15, r2)
            if (r2 == 0) goto L_0x02c6
            int r2 = r121.mo12348i()
            goto L_0x02ca
        L_0x02c6:
            int r2 = r121.mo12349j()
        L_0x02ca:
            int r3 = r14 >> 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r5 = 6
            r4 = r4 | r5
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            int r4 = r14 >> 9
            r5 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r5
            r6 = r3 | r4
            r7 = r1
            r1 = r2
            r12 = r124
            r2 = r121
            r5 = 1
            r3 = r122
            r123 = r8
            r12 = r19
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4 = r125
            r11 = r5
            r5 = r9
            m26771u(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02fc
        L_0x02f3:
            r7 = r1
            r123 = r8
            r12 = r19
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11 = 1
        L_0x02fc:
            r9.mo15002m0()
            androidx.compose.material3.l2$a r22 = androidx.compose.material3.C8241l2.f20286b
            int r0 = r22.mo12785b()
            boolean r0 = androidx.compose.material3.C8241l2.m27284f(r15, r0)
            if (r0 == 0) goto L_0x0312
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13053g0()
            goto L_0x0318
        L_0x0312:
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13045c0()
        L_0x0318:
            r6 = 0
            java.lang.String r0 = androidx.compose.material3.C8357u2.m29348a(r0, r9, r6)
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r2 = m26766p0(r1, r7)
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r9.mo14918M(r3)
            androidx.compose.ui.c r3 = r16.mo17061C()
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.BoxKt.m9849k(r3, r6, r9, r6)
            r9.mo14918M(r8)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r9.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r9.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r9.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            kotlin.jvm.functions.a r8 = r20.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r11 = r9.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x0365
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0365:
            r9.mo14938T()
            boolean r11 = r9.mo14997l()
            if (r11 == 0) goto L_0x0372
            r9.mo14947W(r8)
            goto L_0x0375
        L_0x0372:
            r9.mo14888A()
        L_0x0375:
            r9.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r9)
            kotlin.jvm.functions.p r11 = r20.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r3, r11)
            kotlin.jvm.functions.p r3 = r20.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r3)
            kotlin.jvm.functions.p r3 = r20.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r3)
            kotlin.jvm.functions.p r3 = r20.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r7, r3)
            r9.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r9)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2.invoke(r3, r9, r4)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r9.mo14918M(r2)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.ui.m r2 = androidx.compose.p004ui.focus.C15083v.m64810a(r1, r12)
            androidx.compose.material3.tokens.f1 r20 = androidx.compose.material3.tokens.C8303f1.f21117a
            float r3 = r20.mo13561y()
            float r4 = r20.mo13559w()
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10089E(r2, r3, r4)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r9.mo14918M(r3)
            boolean r3 = r9.mo15006n0(r0)
            java.lang.Object r4 = r9.mo14921N()
            if (r3 != 0) goto L_0x03da
            java.lang.Object r3 = r114.mo16277a()
            if (r4 != r3) goto L_0x03e2
        L_0x03da:
            androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1 r4 = new androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1
            r4.<init>(r0)
            r9.mo14893C(r4)
        L_0x03e2:
            r9.mo15002m0()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            r7 = 0
            r0 = 1
            androidx.compose.ui.m r2 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r2, r6, r4, r0, r7)
            androidx.compose.runtime.i1 r0 = androidx.compose.material3.TextKt.m26703f()
            java.lang.Object r0 = r9.mo15032w(r0)
            r5 = r0
            androidx.compose.ui.text.p0 r5 = (androidx.compose.p004ui.text.C16361p0) r5
            androidx.compose.ui.graphics.z1$a r23 = androidx.compose.p004ui.graphics.C15421z1.f38108b
            r0 = 6
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.ui.graphics.j2$a r4 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r18 = r4.mo42850s()
            androidx.compose.ui.graphics.j2 r8 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r18)
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r0, r8)
            r3[r6] = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            long r18 = r4.mo42850s()
            androidx.compose.ui.graphics.j2 r8 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r18)
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r0, r8)
            r11 = 1
            r3[r11] = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.material3.i1 r8 = androidx.compose.material3.C8215i1.f20180a
            r6 = 6
            androidx.compose.material3.z r18 = r8.mo12652a(r9, r6)
            long r18 = r18.mo14857v()
            androidx.compose.ui.graphics.j2 r7 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r18)
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r0, r7)
            r7 = 2
            r3[r7] = r0
            r0 = 1063675494(0x3f666666, float:0.9)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.material3.z r7 = r8.mo12652a(r9, r6)
            long r18 = r7.mo14857v()
            androidx.compose.ui.graphics.j2 r7 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r18)
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r0, r7)
            r3[r17] = r0
            r0 = 1063675494(0x3f666666, float:0.9)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            long r18 = r4.mo42850s()
            androidx.compose.ui.graphics.j2 r7 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r18)
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r0, r7)
            r7 = 4
            r3[r7] = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            long r18 = r4.mo42850s()
            androidx.compose.ui.graphics.j2 r4 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r18)
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r0, r4)
            r4 = 5
            r3[r4] = r0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 14
            r29 = 0
            r24 = r3
            androidx.compose.ui.graphics.z1 r0 = androidx.compose.p004ui.graphics.C15421z1.C15422a.m67321t(r23, r24, r25, r26, r27, r28, r29)
            r7 = r14
            r14 = r0
            r3 = 1
            r4 = 0
            r0 = 1
            r3 = r123
            r115 = r8
            r8 = r0
            r0 = 0
            r4 = r9
            r9 = r0
            r10 = r0
            r0 = 0
            r8 = r11
            r11 = r0
            r9 = r124
            r6 = r12
            r12 = r0
            androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2 r0 = new androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
            r0.<init>(r13, r3, r9)
            r9 = 2133555260(0x7f2b783c, float:2.2792228E38)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r4, r9, r8, r0)
            r9 = r15
            r15 = r0
            int r0 = r7 >> 3
            r18 = r0 & 14
            r19 = 100666368(0x6000c00, float:2.408294E-35)
            r18 = r18 | r19
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r18 | r0
            int r7 = r7 << 3
            r17 = r7 & r110
            r0 = r0 | r17
            r7 = r7 & r111
            r17 = r0 | r7
            r18 = 199680(0x30c00, float:2.79811E-40)
            r19 = 7696(0x1e10, float:1.0784E-41)
            r0 = r119
            r7 = r1
            r1 = r120
            r116 = r6
            r6 = r112
            r117 = r7
            r7 = r113
            r13 = r3
            r16 = r4
            r123 = r4
            r3 = 1
            r4 = 0
            r8 = 1
            r9 = 0
            androidx.compose.foundation.text.BasicTextFieldKt.m12188a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r123.mo15002m0()
            r123.mo14896D()
            r123.mo15002m0()
            r123.mo15002m0()
            r0 = 0
            float r1 = f19901k
            r2 = r117
            r3 = 1
            r14 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.OffsetKt.m10000f(r2, r0, r1, r3, r14)
            androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2 r1 = androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2.f19913f
            androidx.compose.ui.m r2 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71866a(r0, r1)
            int r0 = r22.mo12784a()
            r15 = r122
            boolean r0 = androidx.compose.material3.C8241l2.m27284f(r15, r0)
            if (r0 == 0) goto L_0x0521
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13040Z()
            goto L_0x0527
        L_0x0521:
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13047d0()
        L_0x0527:
            r13 = r123
            r1 = 0
            java.lang.String r1 = androidx.compose.material3.C8357u2.m29348a(r0, r13, r1)
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r0 = r20.mo13535I()
            r5 = 6
            long r3 = androidx.compose.material3.ColorSchemeKt.m25524k(r0, r13, r5)
            r0 = r115
            androidx.compose.material3.s3 r0 = r0.mo12654c(r13, r5)
            androidx.compose.material3.tokens.TypographyKeyTokens r5 = r20.mo13536J()
            androidx.compose.ui.text.p0 r21 = androidx.compose.material3.TypographyKt.m26914a(r0, r5)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r0 = 0
            r123 = r13
            r13 = r0
            r16 = 0
            r0 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 65528(0xfff8, float:9.1824E-41)
            r22 = r123
            androidx.compose.material3.TextKt.m26700c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r123.mo15002m0()
            r123.mo14896D()
            r123.mo15002m0()
            r123.mo15002m0()
            int r1 = r121.mo12351l()
            androidx.compose.material3.l2 r1 = androidx.compose.material3.C8241l2.m27281c(r1)
            androidx.compose.material3.l2 r2 = androidx.compose.material3.C8241l2.m27281c(r122)
            r3 = 1618982084(0x607fb4c4, float:7.370227E19)
            r4 = r123
            r4.mo14918M(r3)
            r5 = r121
            boolean r3 = r4.mo15006n0(r5)
            boolean r2 = r4.mo15006n0(r2)
            r2 = r2 | r3
            r3 = r116
            boolean r6 = r4.mo15006n0(r3)
            r2 = r2 | r6
            java.lang.Object r6 = r4.mo14921N()
            if (r2 != 0) goto L_0x05aa
            java.lang.Object r2 = r114.mo16277a()
            if (r6 != r2) goto L_0x05b3
        L_0x05aa:
            androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1 r6 = new androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1
            r2 = 0
            r6.<init>(r5, r0, r3, r2)
            r4.mo14893C(r6)
        L_0x05b3:
            r4.mo15002m0()
            kotlin.jvm.functions.p r6 = (kotlin.jvm.functions.C11304p) r6
            r2 = 64
            androidx.compose.runtime.EffectsKt.m29896h(r1, r6, r4, r2)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x05c6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x05c6:
            r6 = r112
            r7 = r113
        L_0x05ca:
            androidx.compose.runtime.t1 r11 = r4.mo15020s()
            if (r11 != 0) goto L_0x05d1
            goto L_0x05ea
        L_0x05d1:
            androidx.compose.material3.TimePickerKt$TimePickerTextField$3 r12 = new androidx.compose.material3.TimePickerKt$TimePickerTextField$3
            r0 = r12
            r1 = r118
            r2 = r119
            r3 = r120
            r4 = r121
            r5 = r122
            r8 = r125
            r9 = r127
            r10 = r128
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x05ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m26769s(androidx.compose.ui.m, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.l, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.m, androidx.compose.foundation.text.k, androidx.compose.material3.h3, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: t */
    public static final boolean m26770t(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: u */
    public static final void m26771u(C8767m mVar, int i, TimePickerState timePickerState, int i2, C8212h3 h3Var, C8592o oVar, int i3) {
        int i4;
        C8592o oVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C8767m mVar2 = mVar;
        TimePickerState timePickerState2 = timePickerState;
        int i11 = i2;
        C8212h3 h3Var2 = h3Var;
        int i12 = i3;
        C8592o o = oVar.mo15009o(21099367);
        if ((i12 & 14) == 0) {
            if (o.mo15006n0(mVar2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | i12;
        } else {
            i4 = i12;
        }
        int i13 = i;
        if ((i12 & 112) == 0) {
            if (o.mo14976f(i13)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i4 |= i9;
        }
        if ((i12 & 896) == 0) {
            if (o.mo15006n0(timePickerState2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i4 |= i8;
        }
        if ((i12 & 7168) == 0) {
            if (o.mo14976f(i11)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i4 |= i7;
        }
        if ((57344 & i12) == 0) {
            if (o.mo15006n0(h3Var2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        int i14 = i4;
        if ((46811 & i14) != 9362 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(21099367, i14, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1070)");
            }
            boolean f = C8241l2.m27284f(timePickerState.mo12351l(), i11);
            if (C8241l2.m27284f(i11, C8241l2.f20286b.mo12784a())) {
                i5 = C8284t2.f20507b.mo13041a0();
            } else {
                i5 = C8284t2.f20507b.mo13049e0();
            }
            String a = C8357u2.m29348a(i5, o, 0);
            long h = h3Var2.mo12645h(f);
            long i15 = h3Var2.mo12647i(f);
            o.mo14918M(773894976);
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
                o.mo14893C(wVar);
                N = wVar;
            }
            o.mo15002m0();
            C12074o0 a2 = ((C8690w) N).mo16831a();
            o.mo15002m0();
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(a);
            Object N2 = o.mo14921N();
            if (n0 || N2 == aVar.mo16277a()) {
                N2 = new TimePickerKt$TimeSelector$1$1(a);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            C8767m b = SemanticsModifierKt.m71867b(mVar2, true, (C11300l) N2);
            C15218g4 f2 = ShapesKt.m26127f(C8306g1.f21226a.mo13615N(), o, 6);
            TimePickerKt$TimeSelector$2 timePickerKt$TimeSelector$2 = r2;
            TimePickerKt$TimeSelector$2 timePickerKt$TimeSelector$22 = new TimePickerKt$TimeSelector$2(i11, timePickerState2, a2);
            TimePickerKt$TimeSelector$3 timePickerKt$TimeSelector$3 = r2;
            TimePickerKt$TimeSelector$3 timePickerKt$TimeSelector$32 = new TimePickerKt$TimeSelector$3(i2, timePickerState, i, i14, i15);
            oVar2 = o;
            SurfaceKt.m26353b(f, timePickerKt$TimeSelector$2, b, false, f2, h, 0, 0.0f, 0.0f, (C2223i) null, (C2243g) null, C8553b.m31048b(o, -1338709103, true, timePickerKt$TimeSelector$3), oVar2, 0, 48, 1992);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new TimePickerKt$TimeSelector$4(mVar, i, timePickerState, i2, h3Var, i3));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: v */
    public static final void m26772v(boolean z, C15218g4 g4Var, C11289a<C11079d2> aVar, C8212h3 h3Var, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, C8592o oVar, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2 = z;
        C8212h3 h3Var2 = h3Var;
        int i8 = i;
        C8592o o = oVar.mo15009o(-1937408098);
        if ((i8 & 14) == 0) {
            if (o.mo14961b(z2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i8;
        } else {
            i2 = i8;
        }
        if ((i8 & 112) == 0) {
            if (o.mo15006n0(g4Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        } else {
            C15218g4 g4Var2 = g4Var;
        }
        C11289a<C11079d2> aVar2 = aVar;
        if ((i8 & 896) == 0) {
            if (o.mo14927P(aVar2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i8 & 7168) == 0) {
            if (o.mo15006n0(h3Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar2 = qVar;
        if ((57344 & i8) == 0) {
            if (o.mo14927P(qVar2)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((46811 & i2) != 9362 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1937408098, i2, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1019)");
            }
            long g = h3Var2.mo12644g(z2);
            long f2 = h3Var2.mo12643f(z2);
            C8767m.C8768a aVar3 = C8767m.f23478j;
            if (z2) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C8767m l = SizeKt.m10112l(ZIndexModifierKt.m32294a(aVar3, f), 0.0f, 1, (Object) null);
            Boolean valueOf = Boolean.valueOf(z);
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(valueOf);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new TimePickerKt$ToggleItem$1$1(z2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            ButtonKt.m25461e(aVar, SemanticsModifierKt.m71868c(l, false, (C11300l) N, 1, (Object) null), false, g4Var, C8232k.f20254a.mo12750v(f2, g, 0, 0, o, C12888a.f31808q, 12), (ButtonElevation) null, (C2223i) null, PaddingKt.m10014a(C16483g.m74435M((float) 0)), (C2243g) null, qVar, o, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 7168) | ((i2 << 15) & 1879048192), C14092c.f34658u);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TimePickerKt$ToggleItem$2(z, g4Var, aVar, h3Var, qVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: w */
    public static final void m26773w(TimePickerState timePickerState, C8212h3 h3Var, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        TimePickerState timePickerState2 = timePickerState;
        C8212h3 h3Var2 = h3Var;
        int i5 = i;
        C8592o o = oVar.mo15009o(2054675515);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(timePickerState2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo15006n0(h3Var2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2054675515, i2, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:820)");
            }
            Arrangement.C2271e f = Arrangement.f6010a.mo7625f();
            o.mo14918M(693286680);
            C8767m.C8768a aVar = C8767m.f23478j;
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 d = RowKt.m10071d(f, aVar2.mo17073w(), o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar);
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
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            m26737b(timePickerState2, h3Var2, o, (i2 & 14) | (i2 & 112));
            o.mo14918M(952907597);
            if (!timePickerState.mo12355p()) {
                C8767m o2 = PaddingKt.m10028o(aVar, f19908r, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                o.mo14918M(733328855);
                C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a2 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(o2);
                if (!(o.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                o.mo14938T();
                if (o.mo14997l()) {
                    o.mo14947W(a2);
                } else {
                    o.mo14888A();
                }
                o.mo14941U();
                C8592o b2 = Updater.m30180b(o);
                Updater.m30188j(b2, k, companion.mo44588d());
                Updater.m30188j(b2, dVar2, companion.mo44586b());
                Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
                Updater.m30188j(b2, c4Var2, companion.mo44590f());
                o.mo14972e();
                f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                C8306g1 g1Var = C8306g1.f21226a;
                int i6 = i2 << 3;
                m26774x(SizeKt.m10089E(aVar, g1Var.mo13611J(), g1Var.mo13610I()), timePickerState2, h3Var2, o, (i6 & 896) | (i6 & 112) | 6);
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
            }
            o.mo15002m0();
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
            s.mo15202a(new TimePickerKt$VerticalClockDisplay$2(timePickerState2, h3Var2, i5));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: x */
    public static final void m26774x(C8767m mVar, TimePickerState timePickerState, C8212h3 h3Var, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(-1898918107);
        if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(timePickerState)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (o.mo15006n0(h3Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1898918107, i2, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:921)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.f19914a;
                o.mo14893C(N);
            }
            o.mo15002m0();
            C15218g4 f = ShapesKt.m26127f(C8306g1.f21226a.mo13649t(), o, 6);
            Intrinsics.checkNotNull(f, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            C2683e eVar = (C2683e) f;
            int i6 = (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896);
            C8767m mVar2 = mVar;
            TimePickerState timePickerState2 = timePickerState;
            C8212h3 h3Var2 = h3Var;
            m26755k(mVar2, timePickerState2, h3Var2, (C15560f0) N, ShapesKt.m26128g(eVar), ShapesKt.m26122a(eVar), o, i6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TimePickerKt$VerticalPeriodToggle$1(mVar, timePickerState, h3Var, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26775y(@org.jetbrains.annotations.C12579k androidx.compose.material3.TimePickerState r40, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r41, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8212h3 r42, boolean r43, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r44, int r45, int r46) {
        /*
            r1 = r40
            r4 = r43
            r5 = r45
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 310683247(0x1284a66f, float:8.3714E-28)
            r2 = r44
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r46 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r5 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r5
            goto L_0x002b
        L_0x002a:
            r3 = r5
        L_0x002b:
            r6 = r46 & 2
            if (r6 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r41
            boolean r8 = r2.mo15006n0(r7)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r3 = r3 | r8
            goto L_0x0047
        L_0x0045:
            r7 = r41
        L_0x0047:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0060
            r8 = r46 & 4
            if (r8 != 0) goto L_0x005a
            r8 = r42
            boolean r9 = r2.mo15006n0(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005a:
            r8 = r42
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
            goto L_0x0062
        L_0x0060:
            r8 = r42
        L_0x0062:
            r9 = r46 & 8
            if (r9 == 0) goto L_0x0069
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0069:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0079
            boolean r9 = r2.mo14961b(r4)
            if (r9 == 0) goto L_0x0076
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r9
        L_0x0079:
            r9 = r3 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008c
            boolean r9 = r2.mo15011p()
            if (r9 != 0) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            r2.mo14958a0()
            r3 = r8
            goto L_0x01e1
        L_0x008c:
            r2.mo14930Q()
            r9 = r5 & 1
            if (r9 == 0) goto L_0x00a6
            boolean r9 = r2.mo14977f0()
            if (r9 == 0) goto L_0x009a
            goto L_0x00a6
        L_0x009a:
            r2.mo14958a0()
            r6 = r46 & 4
            if (r6 == 0) goto L_0x00a3
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a3:
            r39 = r7
            goto L_0x00e0
        L_0x00a6:
            if (r6 == 0) goto L_0x00ad
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r39 = r6
            goto L_0x00af
        L_0x00ad:
            r39 = r7
        L_0x00af:
            r6 = r46 & 4
            if (r6 == 0) goto L_0x00e0
            androidx.compose.material3.i3 r6 = androidx.compose.material3.C8217i3.f20189a
            r7 = 0
            r9 = 0
            r11 = 0
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
            r33 = 0
            r36 = 0
            r37 = 24576(0x6000, float:3.4438E-41)
            r38 = 16383(0x3fff, float:2.2957E-41)
            r35 = r2
            androidx.compose.material3.h3 r6 = r6.mo12658a(r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r36, r37, r38)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r8 = r6
        L_0x00e0:
            r2.mo14899E()
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x00ef
            r6 = -1
            java.lang.String r7 = "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:661)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r6, r7)
        L_0x00ef:
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r0 = r0.mo17068m()
            int r6 = r3 >> 3
            r7 = r6 & 14
            r7 = r7 | 384(0x180, float:5.38E-43)
            r9 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r2.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r9 = r9.mo7631r()
            int r10 = r7 >> 3
            r11 = r10 & 14
            r10 = r10 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.ColumnKt.m9863b(r9, r0, r2, r10)
            int r7 = r7 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r2.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r11 = r2.mo15032w(r11)
            androidx.compose.ui.platform.c4 r11 = (androidx.compose.p004ui.platform.C15863c4) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r13 = r12.mo44585a()
            kotlin.jvm.functions.q r14 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r39)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r15 = 6
            r7 = r7 | r15
            androidx.compose.runtime.d r15 = r2.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x0155
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0155:
            r2.mo14938T()
            boolean r15 = r2.mo14997l()
            if (r15 == 0) goto L_0x0162
            r2.mo14947W(r13)
            goto L_0x0165
        L_0x0162:
            r2.mo14888A()
        L_0x0165:
            r2.mo14941U()
            androidx.compose.runtime.o r13 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r15 = r12.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r13, r0, r15)
            kotlin.jvm.functions.p r0 = r12.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r13, r9, r0)
            kotlin.jvm.functions.p r0 = r12.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r13, r10, r0)
            kotlin.jvm.functions.p r0 = r12.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r13, r11, r0)
            r2.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            int r7 = r7 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r14.invoke(r0, r2, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r0 = r3 & 14
            r3 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            m26773w(r1, r8, r2, r0)
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            float r7 = f19898h
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r7)
            r9 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r7, r2, r9)
            r6 = r6 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            m26739c(r1, r8, r4, r2, r0)
            float r0 = f19899i
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r0)
            androidx.compose.foundation.layout.C2428y0.m10726a(r0, r2, r9)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01de
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01de:
            r3 = r8
            r7 = r39
        L_0x01e1:
            androidx.compose.runtime.t1 r8 = r2.mo15020s()
            if (r8 != 0) goto L_0x01e8
            goto L_0x01fa
        L_0x01e8:
            androidx.compose.material3.TimePickerKt$VerticalTimePicker$2 r9 = new androidx.compose.material3.TimePickerKt$VerticalTimePicker$2
            r0 = r9
            r1 = r40
            r2 = r7
            r4 = r43
            r5 = r45
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.mo15202a(r9)
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m26775y(androidx.compose.material3.TimePickerState, androidx.compose.ui.m, androidx.compose.material3.h3, boolean, androidx.compose.runtime.o, int, int):void");
    }
}
