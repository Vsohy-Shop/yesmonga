package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2014v0;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.tokens.C8310i;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.DrawModifierKt;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.C16026d;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.profileinstaller.C20022q;
import com.urbanairship.util.C9647e0;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1920:1\n25#2:1921\n460#2,13:1947\n473#2,3:1961\n36#2:1966\n36#2:1973\n25#2:1984\n36#2:1995\n460#2,13:2022\n36#2:2036\n460#2,13:2063\n460#2,13:2096\n473#2,3:2110\n473#2,3:2115\n473#2,3:2120\n460#2,13:2143\n473#2,3:2157\n36#2:2162\n83#2,3:2169\n50#2:2178\n49#2:2179\n36#2:2186\n50#2:2193\n49#2:2194\n36#2:2201\n50#2:2208\n49#2:2209\n36#2:2216\n460#2,13:2238\n460#2,13:2272\n473#2,3:2287\n473#2,3:2292\n1114#3,6:1922\n1114#3,6:1967\n1114#3,6:1974\n1114#3,3:1985\n1117#3,3:1991\n1114#3,6:1996\n1114#3,6:2037\n1114#3,6:2163\n1114#3,6:2172\n1114#3,6:2180\n1114#3,6:2187\n1114#3,6:2195\n1114#3,6:2202\n1114#3,6:2210\n1114#3,6:2217\n74#4,6:1928\n80#4:1960\n84#4:1965\n73#4,7:2002\n80#4:2035\n74#4,6:2077\n80#4:2109\n84#4:2114\n84#4:2124\n75#4,5:2125\n80#4:2156\n84#4:2161\n75#5:1934\n76#5,11:1936\n89#5:1964\n75#5:2009\n76#5,11:2011\n75#5:2050\n76#5,11:2052\n75#5:2083\n76#5,11:2085\n89#5:2113\n89#5:2118\n89#5:2123\n75#5:2130\n76#5,11:2132\n89#5:2160\n75#5:2225\n76#5,11:2227\n75#5:2259\n76#5,11:2261\n89#5:2290\n89#5:2295\n76#6:1935\n76#6:2010\n76#6:2051\n76#6:2084\n76#6:2131\n76#6:2226\n76#6:2260\n76#6:2286\n474#7,4:1980\n478#7,2:1988\n482#7:1994\n474#8:1990\n66#9,7:2043\n73#9:2076\n77#9:2119\n79#10,2:2223\n81#10:2251\n74#10,7:2252\n81#10:2285\n85#10:2291\n85#10:2296\n76#11:2297\n102#11,2:2298\n154#12:2300\n154#12:2301\n154#12:2302\n154#12:2303\n154#12:2304\n154#12:2305\n154#12:2306\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n*L\n153#1:1921\n1022#1:1947,13\n1022#1:1961,3\n1072#1:1966\n1079#1:1973\n1133#1:1984\n1135#1:1995\n1142#1:2022,13\n1167#1:2036\n1170#1:2063,13\n1171#1:2096,13\n1171#1:2110,3\n1170#1:2115,3\n1142#1:2120,3\n1244#1:2143,13\n1244#1:2157,3\n1283#1:2162\n1300#1:2169,3\n1324#1:2178\n1324#1:2179\n1415#1:2186\n1430#1:2193\n1430#1:2194\n1595#1:2201\n1726#1:2208\n1726#1:2209\n1743#1:2216\n1776#1:2238,13\n1802#1:2272,13\n1802#1:2287,3\n1776#1:2292,3\n153#1:1922,6\n1072#1:1967,6\n1079#1:1974,6\n1133#1:1985,3\n1133#1:1991,3\n1135#1:1996,6\n1167#1:2037,6\n1283#1:2163,6\n1300#1:2172,6\n1324#1:2180,6\n1415#1:2187,6\n1430#1:2195,6\n1595#1:2202,6\n1726#1:2210,6\n1743#1:2217,6\n1022#1:1928,6\n1022#1:1960\n1022#1:1965\n1142#1:2002,7\n1142#1:2035\n1171#1:2077,6\n1171#1:2109\n1171#1:2114\n1142#1:2124\n1244#1:2125,5\n1244#1:2156\n1244#1:2161\n1022#1:1934\n1022#1:1936,11\n1022#1:1964\n1142#1:2009\n1142#1:2011,11\n1170#1:2050\n1170#1:2052,11\n1171#1:2083\n1171#1:2085,11\n1171#1:2113\n1170#1:2118\n1142#1:2123\n1244#1:2130\n1244#1:2132,11\n1244#1:2160\n1776#1:2225\n1776#1:2227,11\n1802#1:2259\n1802#1:2261,11\n1802#1:2290\n1776#1:2295\n1022#1:1935\n1142#1:2010\n1170#1:2051\n1171#1:2084\n1244#1:2131\n1776#1:2226\n1802#1:2260\n1803#1:2286\n1133#1:1980,4\n1133#1:1988,2\n1133#1:1994\n1133#1:1990\n1170#1:2043,7\n1170#1:2076\n1170#1:2119\n1776#1:2223,2\n1776#1:2251\n1802#1:2252,7\n1802#1:2285\n1802#1:2291\n1776#1:2296\n1140#1:2297\n1140#1:2298,2\n1908#1:2300\n1909#1:2301\n1910#1:2302\n1911#1:2303\n1913#1:2304\n1914#1:2305\n1916#1:2306\n*E\n"})
public final class DatePickerKt {

    /* renamed from: a */
    public static final float f19314a = C16483g.m74435M((float) 48);

    /* renamed from: b */
    public static final float f19315b = C16483g.m74435M((float) 56);

    /* renamed from: c */
    public static final float f19316c;
    @C12579k

    /* renamed from: d */
    public static final C2366i0 f19317d;
    @C12579k

    /* renamed from: e */
    public static final C2366i0 f19318e;
    @C12579k

    /* renamed from: f */
    public static final C2366i0 f19319f;

    /* renamed from: g */
    public static final float f19320g;

    /* renamed from: h */
    public static final int f19321h = 6;

    /* renamed from: i */
    public static final int f19322i = 3;

    /* renamed from: androidx.compose.material3.DatePickerKt$a */
    public static final class C7984a implements C11908f<Integer> {

        /* renamed from: a */
        public final /* synthetic */ LazyListState f19323a;

        /* renamed from: b */
        public final /* synthetic */ StateData f19324b;

        public C7984a(LazyListState lazyListState, StateData stateData) {
            this.f19323a = lazyListState;
            this.f19324b = stateData;
        }

        @C12580l
        /* renamed from: c */
        public final Object mo11361c(int i, @C12579k C11045c<? super C11079d2> cVar) {
            int q = this.f19323a.mo8339q() / 12;
            int q2 = (this.f19323a.mo8339q() % 12) + 1;
            StateData stateData = this.f19324b;
            if (!(stateData.mo11990d().mo12919l() == q2 && stateData.mo11990d().mo12922o() == stateData.mo11995i().mo23049r() + q)) {
                stateData.mo11997k(stateData.mo11987a().mo12490g(stateData.mo11995i().mo23049r() + q, q2));
            }
            return C11079d2.f28267a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
            return mo11361c(((Number) obj).intValue(), cVar);
        }
    }

    static {
        float f = (float) 12;
        f19316c = C16483g.m74435M(f);
        f19317d = PaddingKt.m10018e(0.0f, 0.0f, C16483g.m74435M(f), C16483g.m74435M(f), 3, (Object) null);
        float f2 = (float) 24;
        float f3 = (float) 16;
        f19318e = PaddingKt.m10018e(C16483g.m74435M(f2), C16483g.m74435M(f3), C16483g.m74435M(f), 0.0f, 8, (Object) null);
        f19319f = PaddingKt.m10018e(C16483g.m74435M(f2), 0.0f, C16483g.m74435M(f), C16483g.m74435M(f), 2, (Object) null);
        f19320g = C16483g.m74435M(f3);
    }

    /* renamed from: F */
    public static final List<C16026d> m25586F(LazyGridState lazyGridState, C12074o0 o0Var, String str, String str2) {
        return CollectionsKt__CollectionsKt.m40448L(new C16026d(str, new DatePickerKt$customScrollActions$scrollUpAction$1(lazyGridState, o0Var)), new C16026d(str2, new DatePickerKt$customScrollActions$scrollDownAction$1(lazyGridState, o0Var)));
    }

    @C8540g
    /* renamed from: G */
    public static final String m25587G(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C8592o oVar, int i) {
        String str;
        boolean z6;
        oVar.mo14918M(502032503);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(502032503, i, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1538)");
        }
        StringBuilder sb = new StringBuilder();
        oVar.mo14918M(-852204210);
        if (z) {
            if (z3) {
                oVar.mo14918M(-852204120);
                sb.append(C8357u2.m29348a(C8284t2.f20507b.mo13025K(), oVar, 6));
                oVar.mo15002m0();
            } else if (z4) {
                oVar.mo14918M(-852203980);
                sb.append(C8357u2.m29348a(C8284t2.f20507b.mo13022H(), oVar, 6));
                oVar.mo15002m0();
            } else if (z5) {
                oVar.mo14918M(-852203842);
                sb.append(C8357u2.m29348a(C8284t2.f20507b.mo13021G(), oVar, 6));
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(-852203741);
                oVar.mo15002m0();
            }
        }
        oVar.mo15002m0();
        boolean z7 = true;
        if (z2) {
            if (sb.length() > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                sb.append(", ");
            }
            sb.append(C8357u2.m29348a(C8284t2.f20507b.mo13017C(), oVar, 6));
        }
        if (sb.length() != 0) {
            z7 = false;
        }
        if (z7) {
            str = null;
        } else {
            str = sb.toString();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return str;
    }

    /* renamed from: H */
    public static final float m25588H() {
        return f19316c;
    }

    @C12579k
    /* renamed from: I */
    public static final C2366i0 m25589I() {
        return f19317d;
    }

    /* renamed from: J */
    public static final float m25590J() {
        return f19315b;
    }

    /* renamed from: K */
    public static final float m25591K() {
        return f19314a;
    }

    @C8540g
    @C8251n0
    @C12579k
    /* renamed from: L */
    public static final DatePickerState m25592L(@C12580l Long l, @C12580l Long l2, @C12580l C11466l lVar, int i, @C12580l C8592o oVar, int i2, int i3) {
        oVar.mo14918M(1574672255);
        if ((i3 & 1) != 0) {
            l = null;
        }
        if ((i3 & 2) != 0) {
            l2 = l;
        }
        if ((i3 & 4) != 0) {
            lVar = DatePickerDefaults.f19304a.mo11350f();
        }
        if ((i3 & 8) != 0) {
            i = C8208h0.f20150b.mo12627b();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1574672255, i2, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:219)");
        }
        DatePickerState datePickerState = (DatePickerState) RememberSaveableKt.m31343d(new Object[0], DatePickerState.f19337c.mo11437a(), (String) null, new DatePickerKt$rememberDatePickerState$1(l, l2, lVar, i), oVar, 72, 4);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return datePickerState;
    }

    @C12579k
    /* renamed from: M */
    public static final String m25593M(int i) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        String format = integerInstance.format(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(this)");
        return format;
    }

    @C12580l
    /* renamed from: N */
    public static final Object m25594N(@C12579k LazyListState lazyListState, @C12579k StateData stateData, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = C8415c2.m30253v(new DatePickerKt$updateDisplayedMonth$2(lazyListState)).collect(new C7984a(lazyListState, stateData), cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m25595a(@C12579k C8767m mVar, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, @C12579k C8180c0 c0Var, @C12579k C16361p0 p0Var, float f, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C8767m mVar2 = mVar;
        C8180c0 c0Var2 = c0Var;
        C16361p0 p0Var2 = p0Var;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar5 = pVar4;
        int i11 = i;
        Intrinsics.checkNotNullParameter(mVar2, "modifier");
        Intrinsics.checkNotNullParameter(c0Var2, C9874a.f27063h);
        Intrinsics.checkNotNullParameter(p0Var2, "headlineTextStyle");
        Intrinsics.checkNotNullParameter(pVar5, "content");
        C8592o o = oVar.mo15009o(1507356255);
        if ((i11 & 14) == 0) {
            if (o.mo15006n0(mVar2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i11;
        } else {
            i2 = i11;
        }
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar6 = pVar;
        if ((i11 & 112) == 0) {
            if (o.mo14927P(pVar6)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar7 = pVar2;
        if ((i11 & 896) == 0) {
            if (o.mo14927P(pVar7)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar8 = pVar3;
        if ((i11 & 7168) == 0) {
            if (o.mo14927P(pVar8)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i11 & 57344) == 0) {
            if (o.mo15006n0(c0Var2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((458752 & i11) == 0) {
            if (o.mo15006n0(p0Var2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        float f2 = f;
        if ((3670016 & i11) == 0) {
            if (o.mo14968d(f2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((29360128 & i11) == 0) {
            if (o.mo14927P(pVar5)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i12 = i2;
        if ((23967451 & i12) != 4793490 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1507356255, i12, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1011)");
            }
            int i13 = i12;
            C8767m c = SemanticsModifierKt.m71868c(SizeKt.m10091G(mVar, C8310i.f21329a.mo13731f(), 0.0f, 0.0f, 0.0f, 14, (Object) null), false, DatePickerKt$DateEntryContainer$1.f19325f, 1, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(c);
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
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C8767m.C8768a aVar = C8767m.f23478j;
            long g = c0Var.mo12479g();
            long e = c0Var.mo12476e();
            DatePickerKt$DateEntryContainer$2$1 datePickerKt$DateEntryContainer$2$1 = r0;
            DatePickerKt$DateEntryContainer$2$1 datePickerKt$DateEntryContainer$2$12 = new DatePickerKt$DateEntryContainer$2$1(pVar2, pVar3, pVar, p0Var, i13);
            oVar2 = o;
            m25600f(aVar, pVar, g, e, f, C8553b.m31048b(o, -229007058, true, datePickerKt$DateEntryContainer$2$1), oVar2, 196614 | (i13 & 112) | ((i13 >> 6) & 57344));
            pVar5.invoke(oVar2, Integer.valueOf((i13 >> 21) & 14));
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
            s.mo15202a(new DatePickerKt$DateEntryContainer$3(mVar, pVar, pVar2, pVar3, c0Var, p0Var, f, pVar4, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x011a  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25596b(@org.jetbrains.annotations.C12579k androidx.compose.material3.DatePickerState r56, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r57, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8186d0 r58, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Long, java.lang.Boolean> r59, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r60, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r61, boolean r62, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8180c0 r63, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r64, int r65, int r66) {
        /*
            r1 = r56
            r9 = r65
            r10 = r66
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -1765097918(0xffffffff96cabe42, float:-3.275493E-25)
            r2 = r64
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r10 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r9 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r9
            goto L_0x002b
        L_0x002a:
            r3 = r9
        L_0x002b:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r57
            boolean r6 = r2.mo15006n0(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
            goto L_0x0047
        L_0x0045:
            r5 = r57
        L_0x0047:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r58
            boolean r8 = r2.mo15006n0(r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r58
        L_0x0063:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007d
            r11 = r59
            boolean r12 = r2.mo14927P(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
            goto L_0x007f
        L_0x007d:
            r11 = r59
        L_0x007f:
            r12 = r10 & 16
            r54 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x0089
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0089:
            r13 = r9 & r54
            if (r13 != 0) goto L_0x009c
            r13 = r60
            boolean r14 = r2.mo14927P(r13)
            if (r14 == 0) goto L_0x0098
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r3 = r3 | r14
            goto L_0x009e
        L_0x009c:
            r13 = r60
        L_0x009e:
            r14 = r10 & 32
            if (r14 == 0) goto L_0x00a6
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00bb
        L_0x00a6:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00bb
            r15 = r61
            boolean r16 = r2.mo14927P(r15)
            if (r16 == 0) goto L_0x00b6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r3 = r3 | r16
            goto L_0x00bd
        L_0x00bb:
            r15 = r61
        L_0x00bd:
            r16 = r10 & 64
            if (r16 == 0) goto L_0x00c8
            r17 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r17
            r0 = r62
            goto L_0x00dd
        L_0x00c8:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r9 & r17
            r0 = r62
            if (r17 != 0) goto L_0x00dd
            boolean r17 = r2.mo14961b(r0)
            if (r17 == 0) goto L_0x00d9
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r3 = r3 | r17
        L_0x00dd:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r9 & r17
            if (r17 != 0) goto L_0x00f9
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f2
            r0 = r63
            boolean r17 = r2.mo15006n0(r0)
            if (r17 == 0) goto L_0x00f4
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f2:
            r0 = r63
        L_0x00f4:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r3 = r3 | r17
            goto L_0x00fb
        L_0x00f9:
            r0 = r63
        L_0x00fb:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r3 & r17
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r5) goto L_0x011a
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x010c
            goto L_0x011a
        L_0x010c:
            r2.mo14958a0()
            r3 = r57
            r55 = r62
            r8 = r63
            r4 = r11
            r5 = r13
            r6 = r15
            goto L_0x025f
        L_0x011a:
            r2.mo14930Q()
            r0 = r9 & 1
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r15 = 1
            if (r0 == 0) goto L_0x0141
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x012c
            goto L_0x0141
        L_0x012c:
            r2.mo14958a0()
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0134
            r3 = r3 & r5
        L_0x0134:
            r0 = r57
            r8 = r61
            r55 = r62
            r5 = r3
            r4 = r11
            r6 = r13
        L_0x013d:
            r3 = r63
            goto L_0x01e4
        L_0x0141:
            if (r4 == 0) goto L_0x0146
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0148
        L_0x0146:
            r0 = r57
        L_0x0148:
            if (r6 == 0) goto L_0x0176
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r4)
            java.lang.Object r4 = r2.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r4 != r6) goto L_0x0170
            androidx.compose.material3.d0 r4 = new androidx.compose.material3.d0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 7
            r22 = 0
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            r2.mo14893C(r4)
        L_0x0170:
            r2.mo15002m0()
            androidx.compose.material3.d0 r4 = (androidx.compose.material3.C8186d0) r4
            r7 = r4
        L_0x0176:
            if (r8 == 0) goto L_0x017b
            androidx.compose.material3.DatePickerKt$DatePicker$2 r4 = androidx.compose.material3.DatePickerKt$DatePicker$2.f19326f
            goto L_0x017c
        L_0x017b:
            r4 = r11
        L_0x017c:
            if (r12 == 0) goto L_0x018b
            androidx.compose.material3.DatePickerKt$DatePicker$3 r6 = new androidx.compose.material3.DatePickerKt$DatePicker$3
            r6.<init>(r1, r3)
            r8 = 448469326(0x1abb194e, float:7.738227E-23)
            androidx.compose.runtime.internal.a r6 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r8, r15, r6)
            goto L_0x018c
        L_0x018b:
            r6 = r13
        L_0x018c:
            if (r14 == 0) goto L_0x019b
            androidx.compose.material3.DatePickerKt$DatePicker$4 r8 = new androidx.compose.material3.DatePickerKt$DatePicker$4
            r8.<init>(r1, r7, r3)
            r11 = 1578326756(0x5e135ae4, float:2.65451244E18)
            androidx.compose.runtime.internal.a r8 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r11, r15, r8)
            goto L_0x019d
        L_0x019b:
            r8 = r61
        L_0x019d:
            if (r16 == 0) goto L_0x01a2
            r55 = r15
            goto L_0x01a4
        L_0x01a2:
            r55 = r62
        L_0x01a4:
            r11 = r10 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x01e1
            androidx.compose.material3.DatePickerDefaults r11 = androidx.compose.material3.DatePickerDefaults.f19304a
            r12 = 0
            r16 = 0
            r14 = r16
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
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r51 = 0
            r52 = 805306368(0x30000000, float:4.656613E-10)
            r53 = 524287(0x7ffff, float:7.34683E-40)
            r50 = r2
            androidx.compose.material3.c0 r11 = r11.mo11347c(r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r51, r52, r53)
            r3 = r3 & r5
            r5 = r3
            r3 = r11
            goto L_0x01e4
        L_0x01e1:
            r5 = r3
            goto L_0x013d
        L_0x01e4:
            r2.mo14899E()
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x01f6
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.DatePicker (DatePicker.kt:149)"
            r13 = -1765097918(0xffffffff96cabe42, float:-3.275493E-25)
            androidx.compose.runtime.ComposerKt.m29845w0(r13, r5, r11, r12)
        L_0x01f6:
            if (r55 == 0) goto L_0x0206
            androidx.compose.material3.DatePickerKt$DatePicker$5 r11 = new androidx.compose.material3.DatePickerKt$DatePicker$5
            r11.<init>(r1, r5)
            r12 = -1702543532(0xffffffff9a853f54, float:-5.510982E-23)
            r13 = 1
            androidx.compose.runtime.internal.a r11 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r12, r13, r11)
            goto L_0x0208
        L_0x0206:
            r13 = 1
            r11 = 0
        L_0x0208:
            r14 = r11
            androidx.compose.material3.i1 r11 = androidx.compose.material3.C8215i1.f20180a
            r12 = 6
            androidx.compose.material3.s3 r11 = r11.mo12654c(r2, r12)
            androidx.compose.material3.tokens.i r12 = androidx.compose.material3.tokens.C8310i.f21329a
            androidx.compose.material3.tokens.TypographyKeyTokens r15 = r12.mo13748w()
            androidx.compose.ui.text.p0 r16 = androidx.compose.material3.TypographyKt.m26914a(r11, r15)
            float r17 = r12.mo13745t()
            androidx.compose.material3.DatePickerKt$DatePicker$6 r11 = new androidx.compose.material3.DatePickerKt$DatePicker$6
            r57 = r11
            r58 = r56
            r59 = r7
            r60 = r4
            r61 = r3
            r62 = r5
            r57.<init>(r58, r59, r60, r61, r62)
            r12 = 173769747(0xa5b8413, float:1.0569307E-32)
            androidx.compose.runtime.internal.a r18 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r12, r13, r11)
            int r11 = r5 >> 3
            r11 = r11 & 14
            r12 = 14155776(0xd80000, float:1.9836467E-38)
            r11 = r11 | r12
            int r5 = r5 >> 9
            r12 = r5 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            r12 = r5 & 896(0x380, float:1.256E-42)
            r11 = r11 | r12
            r5 = r5 & r54
            r20 = r11 | r5
            r11 = r0
            r12 = r6
            r13 = r8
            r15 = r3
            r19 = r2
            m25595a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x025b
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x025b:
            r5 = r6
            r6 = r8
            r8 = r3
            r3 = r0
        L_0x025f:
            androidx.compose.runtime.t1 r11 = r2.mo15020s()
            if (r11 != 0) goto L_0x0266
            goto L_0x0279
        L_0x0266:
            androidx.compose.material3.DatePickerKt$DatePicker$7 r12 = new androidx.compose.material3.DatePickerKt$DatePicker$7
            r0 = r12
            r1 = r56
            r2 = r3
            r3 = r7
            r7 = r55
            r9 = r65
            r10 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x0279:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.m25596b(androidx.compose.material3.DatePickerState, androidx.compose.ui.m, androidx.compose.material3.d0, kotlin.jvm.functions.l, kotlin.jvm.functions.p, kotlin.jvm.functions.p, boolean, androidx.compose.material3.c0, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25597c(androidx.compose.material3.StateData r30, androidx.compose.material3.C8186d0 r31, kotlin.jvm.functions.C11300l<? super java.lang.Long, java.lang.Boolean> r32, androidx.compose.material3.C8180c0 r33, androidx.compose.runtime.C8592o r34, int r35) {
        /*
            r8 = r30
            r9 = r31
            r10 = r33
            r11 = r35
            r0 = -1512850300(0xffffffffa5d3bc84, float:-3.6730408E-16)
            r1 = r34
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r11 & 14
            r14 = 2
            if (r1 != 0) goto L_0x0021
            boolean r1 = r15.mo15006n0(r8)
            if (r1 == 0) goto L_0x001e
            r1 = 4
            goto L_0x001f
        L_0x001e:
            r1 = r14
        L_0x001f:
            r1 = r1 | r11
            goto L_0x0022
        L_0x0021:
            r1 = r11
        L_0x0022:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0032
            boolean r2 = r15.mo15006n0(r9)
            if (r2 == 0) goto L_0x002f
            r2 = 32
            goto L_0x0031
        L_0x002f:
            r2 = 16
        L_0x0031:
            r1 = r1 | r2
        L_0x0032:
            r2 = r11 & 896(0x380, float:1.256E-42)
            r13 = r32
            if (r2 != 0) goto L_0x0044
            boolean r2 = r15.mo14927P(r13)
            if (r2 == 0) goto L_0x0041
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r1 = r1 | r2
        L_0x0044:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0054
            boolean r2 = r15.mo15006n0(r10)
            if (r2 == 0) goto L_0x0051
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r1 = r1 | r2
        L_0x0054:
            r12 = r1
            r1 = r12 & 5851(0x16db, float:8.199E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 != r2) goto L_0x0068
            boolean r1 = r15.mo15011p()
            if (r1 != 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            r15.mo14958a0()
            r11 = r15
            goto L_0x03ec
        L_0x0068:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0074
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.DatePickerContent (DatePicker.kt:1124)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r12, r1, r2)
        L_0x0074:
            int r0 = r30.mo11991e()
            r7 = 0
            androidx.compose.foundation.lazy.LazyListState r0 = androidx.compose.foundation.lazy.LazyListStateKt.m10895a(r0, r7, r15, r7, r14)
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r15.mo14918M(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo14918M(r1)
            java.lang.Object r1 = r15.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r16.mo16277a()
            if (r1 != r2) goto L_0x00a4
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r1 = androidx.compose.runtime.EffectsKt.m29901m(r1, r15)
            androidx.compose.runtime.w r2 = new androidx.compose.runtime.w
            r2.<init>(r1)
            r15.mo14893C(r2)
            r1 = r2
        L_0x00a4:
            r15.mo15002m0()
            androidx.compose.runtime.w r1 = (androidx.compose.runtime.C8690w) r1
            kotlinx.coroutines.o0 r6 = r1.mo16831a()
            r15.mo15002m0()
            r5 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r5)
            boolean r1 = r15.mo15006n0(r8)
            java.lang.Object r2 = r15.mo14921N()
            if (r1 != 0) goto L_0x00c6
            java.lang.Object r1 = r16.mo16277a()
            if (r2 != r1) goto L_0x00ce
        L_0x00c6:
            androidx.compose.material3.DatePickerKt$DatePickerContent$onDateSelected$1$1 r2 = new androidx.compose.material3.DatePickerKt$DatePickerContent$onDateSelected$1$1
            r2.<init>(r8)
            r15.mo14893C(r2)
        L_0x00ce:
            r15.mo15002m0()
            r22 = r2
            kotlin.jvm.functions.l r22 = (kotlin.jvm.functions.C11300l) r22
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r2 = 0
            r3 = 0
            androidx.compose.material3.DatePickerKt$DatePickerContent$yearPickerVisible$2 r4 = androidx.compose.material3.DatePickerKt$DatePickerContent$yearPickerVisible$2.f19327f
            r17 = 3080(0xc08, float:4.316E-42)
            r18 = 6
            r5 = r15
            r23 = r6
            r6 = r17
            r14 = r7
            r7 = r18
            java.lang.Object r1 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            androidx.compose.runtime.z0 r7 = (androidx.compose.runtime.C8700z0) r7
            java.util.Locale r1 = androidx.compose.material3.C8260p.m27433b(r15, r14)
            r2 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r2)
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r4 = r3.mo7631r()
            androidx.compose.ui.c$a r5 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r2 = r5.mo17072u()
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r2, r15, r14)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r15.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r15.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r15.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r24 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r24.mo44585a()
            r18 = r12
            kotlin.jvm.functions.q r12 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r13 = r15.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x0145
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0145:
            r15.mo14938T()
            boolean r13 = r15.mo14997l()
            if (r13 == 0) goto L_0x0152
            r15.mo14947W(r11)
            goto L_0x0155
        L_0x0152:
            r15.mo14888A()
        L_0x0155:
            r15.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r13 = r24.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r2, r13)
            kotlin.jvm.functions.p r2 = r24.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r4, r2)
            kotlin.jvm.functions.p r2 = r24.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r14, r2)
            kotlin.jvm.functions.p r2 = r24.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r2)
            r15.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r4 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r12.invoke(r2, r15, r8)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r8 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            float r8 = f19316c
            r11 = 0
            r14 = 0
            r13 = 2
            androidx.compose.ui.m r12 = androidx.compose.foundation.layout.PaddingKt.m10026m(r6, r8, r11, r13, r14)
            boolean r17 = r0.mo7249a()
            boolean r19 = r0.mo7252f()
            boolean r20 = m25598d(r7)
            androidx.compose.material3.q r4 = r30.mo11990d()
            androidx.compose.material3.m r13 = r30.mo11987a()
            java.lang.String r1 = r9.mo12520c(r4, r13, r1)
            if (r1 != 0) goto L_0x01b8
            java.lang.String r1 = "-"
        L_0x01b8:
            androidx.compose.material3.DatePickerKt$DatePickerContent$1$1 r4 = new androidx.compose.material3.DatePickerKt$DatePickerContent$1$1
            r13 = r23
            r4.<init>(r13, r0)
            androidx.compose.material3.DatePickerKt$DatePickerContent$1$2 r11 = new androidx.compose.material3.DatePickerKt$DatePickerContent$1$2
            r11.<init>(r13, r0)
            r14 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r14)
            boolean r14 = r15.mo15006n0(r7)
            java.lang.Object r2 = r15.mo14921N()
            if (r14 != 0) goto L_0x01da
            java.lang.Object r14 = r16.mo16277a()
            if (r2 != r14) goto L_0x01e2
        L_0x01da:
            androidx.compose.material3.DatePickerKt$DatePickerContent$1$3$1 r2 = new androidx.compose.material3.DatePickerKt$DatePickerContent$1$3$1
            r2.<init>(r7)
            r15.mo14893C(r2)
        L_0x01e2:
            r15.mo15002m0()
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r26 = 6
            r27 = r18
            r28 = r13
            r14 = 2
            r13 = r17
            r29 = r0
            r0 = 0
            r9 = 0
            r14 = r19
            r25 = r15
            r15 = r20
            r16 = r1
            r17 = r4
            r18 = r11
            r19 = r2
            r20 = r25
            r21 = r26
            m25605k(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11 = r25
            r11.mo14918M(r1)
            androidx.compose.ui.c r1 = r5.mo17061C()
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.BoxKt.m9849k(r1, r0, r11, r0)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r11.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r11.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r11.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            kotlin.jvm.functions.a r13 = r24.mo44585a()
            kotlin.jvm.functions.q r14 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r15 = r11.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x0250
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0250:
            r11.mo14938T()
            boolean r15 = r11.mo14997l()
            if (r15 == 0) goto L_0x025d
            r11.mo14947W(r13)
            goto L_0x0260
        L_0x025d:
            r11.mo14888A()
        L_0x0260:
            r11.mo14941U()
            androidx.compose.runtime.o r13 = androidx.compose.runtime.Updater.m30180b(r11)
            kotlin.jvm.functions.p r15 = r24.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r13, r1, r15)
            kotlin.jvm.functions.p r1 = r24.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r13, r2, r1)
            kotlin.jvm.functions.p r1 = r24.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r13, r4, r1)
            kotlin.jvm.functions.p r1 = r24.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r13, r12, r1)
            r11.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r11)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r14.invoke(r1, r11, r2)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.mo14918M(r1)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r1 = 0
            r2 = 2
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10026m(r6, r8, r1, r2, r9)
            r1 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r11.mo14918M(r1)
            androidx.compose.foundation.layout.Arrangement$l r1 = r3.mo7631r()
            androidx.compose.ui.c$b r3 = r5.mo17072u()
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.ColumnKt.m9863b(r1, r3, r11, r0)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r11.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r11.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r11.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            kotlin.jvm.functions.a r8 = r24.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r12 = r11.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x02ec
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02ec:
            r11.mo14938T()
            boolean r12 = r11.mo14997l()
            if (r12 == 0) goto L_0x02f9
            r11.mo14947W(r8)
            goto L_0x02fc
        L_0x02f9:
            r11.mo14888A()
        L_0x02fc:
            r11.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r11)
            kotlin.jvm.functions.p r12 = r24.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r1, r12)
            kotlin.jvm.functions.p r1 = r24.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r3, r1)
            kotlin.jvm.functions.p r1 = r24.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r1)
            kotlin.jvm.functions.p r1 = r24.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r1)
            r11.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r11)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r1, r11, r0)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.mo14918M(r0)
            androidx.compose.material3.m r0 = r30.mo11987a()
            int r1 = r27 >> 9
            r1 = r1 & 14
            m25607m(r10, r0, r11, r1)
            int r0 = r27 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r1 = r27 << 6
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r8 = r0 | r1
            r12 = r29
            r0 = r22
            r1 = r30
            r2 = r12
            r3 = r31
            r4 = r32
            r5 = r33
            r13 = r6
            r6 = r11
            r14 = r7
            r7 = r8
            m25603i(r0, r1, r2, r3, r4, r5, r6, r7)
            r11.mo15002m0()
            r11.mo14896D()
            r11.mo15002m0()
            r11.mo15002m0()
            boolean r7 = m25598d(r14)
            androidx.compose.ui.m r13 = androidx.compose.p004ui.draw.C8744d.m32515b(r13)
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 15
            r5 = 0
            androidx.compose.animation.e r0 = androidx.compose.animation.EnterExitTransitionKt.m7840t(r0, r1, r2, r3, r4, r5)
            r1 = 1058642330(0x3f19999a, float:0.6)
            r8 = 1
            androidx.compose.animation.e r1 = androidx.compose.animation.EnterExitTransitionKt.m7842v(r9, r1, r8, r9)
            androidx.compose.animation.e r15 = r0.mo7023c(r1)
            r0 = 0
            r1 = 0
            androidx.compose.animation.g r0 = androidx.compose.animation.EnterExitTransitionKt.m7805I(r0, r1, r2, r3, r4, r5)
            r1 = 3
            r2 = 0
            androidx.compose.animation.g r1 = androidx.compose.animation.EnterExitTransitionKt.m7844x(r9, r2, r1, r9)
            androidx.compose.animation.g r9 = r0.mo7029c(r1)
            r16 = 0
            androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2 r6 = new androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2
            r0 = r6
            r1 = r33
            r2 = r30
            r3 = r27
            r4 = r28
            r5 = r14
            r14 = r6
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 760161496(0x2d4f24d8, float:1.1774769E-11)
            androidx.compose.runtime.internal.a r17 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r0, r8, r14)
            r19 = 200112(0x30db0, float:2.80417E-40)
            r20 = 16
            r12 = r7
            r14 = r15
            r15 = r9
            r18 = r11
            androidx.compose.animation.AnimatedVisibilityKt.m7744i(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r11.mo15002m0()
            r11.mo14896D()
            r11.mo15002m0()
            r11.mo15002m0()
            r11.mo15002m0()
            r11.mo14896D()
            r11.mo15002m0()
            r11.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03ec
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03ec:
            androidx.compose.runtime.t1 r6 = r11.mo15020s()
            if (r6 != 0) goto L_0x03f3
            goto L_0x0406
        L_0x03f3:
            androidx.compose.material3.DatePickerKt$DatePickerContent$2 r7 = new androidx.compose.material3.DatePickerKt$DatePickerContent$2
            r0 = r7
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x0406:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.m25597c(androidx.compose.material3.StateData, androidx.compose.material3.d0, kotlin.jvm.functions.l, androidx.compose.material3.c0, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: d */
    public static final boolean m25598d(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: e */
    public static final void m25599e(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: f */
    public static final void m25600f(@C12579k C8767m mVar, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar, long j, long j2, float f, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, @C12580l C8592o oVar, int i) {
        int i2;
        C8767m mVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C8767m mVar3 = mVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar3 = pVar;
        float f2 = f;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar2;
        int i9 = i;
        Intrinsics.checkNotNullParameter(mVar3, "modifier");
        Intrinsics.checkNotNullParameter(pVar4, "content");
        C8592o o = oVar.mo15009o(-996037719);
        if ((i9 & 14) == 0) {
            if (o.mo15006n0(mVar3)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 112) == 0) {
            if (o.mo14927P(pVar3)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 896) == 0) {
            if (o.mo14980g(j)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        } else {
            long j3 = j;
        }
        if ((i9 & 7168) == 0) {
            if (o.mo14980g(j2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        } else {
            long j4 = j2;
        }
        if ((57344 & i9) == 0) {
            if (o.mo14968d(f2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i9) == 0) {
            if (o.mo14927P(pVar4)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) != 74898 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-996037719, i2, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1228)");
            }
            if (pVar3 != null) {
                mVar2 = SizeKt.m10108h(C8767m.f23478j, 0.0f, f2, 1, (Object) null);
            } else {
                mVar2 = C8767m.f23478j;
            }
            C8767m k3 = SizeKt.m10114n(mVar3, 0.0f, 1, (Object) null).mo17224k3(mVar2);
            Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(l, C8734c.f23406a.mo17072u(), o, 6);
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
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            o.mo14918M(1127524835);
            if (pVar3 != null) {
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j))}, C8553b.m31048b(o, 1005061498, true, new DatePickerKt$DatePickerHeader$1$1(pVar3, i2)), o, 56);
            }
            o.mo15002m0();
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j2))}, pVar4, o, ((i2 >> 12) & 112) | 8);
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
            s.mo15202a(new DatePickerKt$DatePickerHeader$2(mVar, pVar, j, j2, f, pVar2, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: g */
    public static final void m25601g(C8767m mVar, boolean z, C11289a<C11079d2> aVar, boolean z2, boolean z3, boolean z4, boolean z5, String str, C8180c0 c0Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        C2223i iVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6 = z;
        boolean z7 = z4;
        String str2 = str;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        int i13 = i;
        C8592o o = oVar.mo15009o(-1434777861);
        C8767m mVar2 = mVar;
        if ((i13 & 14) == 0) {
            if (o.mo15006n0(mVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i13;
        } else {
            i2 = i13;
        }
        if ((i13 & 112) == 0) {
            if (o.mo14961b(z6)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        C11289a<C11079d2> aVar2 = aVar;
        if ((i13 & 896) == 0) {
            if (o.mo14927P(aVar2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        boolean z8 = z2;
        if ((i13 & 7168) == 0) {
            if (o.mo14961b(z8)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        boolean z9 = z3;
        if ((i13 & 57344) == 0) {
            if (o.mo14961b(z9)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((458752 & i13) == 0) {
            if (o.mo14961b(z7)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        boolean z10 = z5;
        if ((3670016 & i13) == 0) {
            if (o.mo14961b(z10)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((29360128 & i13) == 0) {
            if (o.mo15006n0(str2)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        C8180c0 c0Var2 = c0Var;
        if ((234881024 & i13) == 0) {
            if (o.mo15006n0(c0Var2)) {
                i4 = C8698y1.f23302n;
            } else {
                i4 = C9647e0.f26435a;
            }
            i2 |= i4;
        }
        if ((1879048192 & i13) == 0) {
            if (o.mo14927P(pVar2)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        int i14 = i2;
        if ((1533916891 & i14) != 306783378 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1434777861, i14, -1, "androidx.compose.material3.Day (DatePicker.kt:1570)");
            }
            C8767m f = InteractiveComponentSizeKt.m25834f(mVar);
            C8310i iVar2 = C8310i.f21329a;
            C8767m w = SizeKt.m10123w(f, iVar2.mo13740o(), iVar2.mo13738m());
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(str2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new DatePickerKt$Day$1$1(str2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8767m b = SemanticsModifierKt.m71867b(w, true, (C11300l) N);
            C15218g4 f2 = ShapesKt.m26127f(iVar2.mo13733h(), o, 6);
            int i15 = i14 >> 3;
            int i16 = i15 & 14;
            int i17 = i14 >> 15;
            int i18 = i14;
            long M = c0Var.mo12472a(z, z3, z2, o, i16 | ((i14 >> 9) & 112) | (i15 & 896) | (i17 & 7168)).getValue().mo42833M();
            int i19 = i18 >> 12;
            int i20 = i15 & 7168;
            int i21 = i20;
            int i22 = i15;
            long M2 = c0Var.mo12473b(z4, z, z5, z3, o, (i17 & 14) | (i18 & 112) | (i19 & 896) | i20 | (i19 & 57344)).getValue().mo42833M();
            if (!z7 || z6) {
                iVar = null;
            } else {
                iVar = C2250j.m9695a(iVar2.mo13742q(), c0Var.mo12480h());
            }
            oVar2 = o;
            SurfaceKt.m26353b(z, aVar, b, z3, f2, M, M2, 0.0f, 0.0f, iVar, (C2243g) null, C8553b.m31048b(o, -2031780827, true, new DatePickerKt$Day$2(pVar2, i18)), oVar2, i16 | (i22 & 112) | i21, 48, 1408);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DatePickerKt$Day$3(mVar, z, aVar, z2, z3, z4, z5, str, c0Var, pVar, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25602h(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r10, int r11, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.compose.material3.C8208h0, kotlin.C11079d2> r12, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r13, int r14) {
        /*
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onDisplayModeChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 1393846115(0x53146763, float:6.373897E11)
            androidx.compose.runtime.o r13 = r13.mo15009o(r0)
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0020
            boolean r1 = r13.mo15006n0(r10)
            if (r1 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 2
        L_0x001e:
            r1 = r1 | r14
            goto L_0x0021
        L_0x0020:
            r1 = r14
        L_0x0021:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0031
            boolean r2 = r13.mo14976f(r11)
            if (r2 == 0) goto L_0x002e
            r2 = 32
            goto L_0x0030
        L_0x002e:
            r2 = 16
        L_0x0030:
            r1 = r1 | r2
        L_0x0031:
            r2 = r14 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0041
            boolean r2 = r13.mo14927P(r12)
            if (r2 == 0) goto L_0x003e
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r1 = r1 | r2
        L_0x0041:
            r2 = r1 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L_0x0053
            boolean r2 = r13.mo15011p()
            if (r2 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r13.mo14958a0()
            goto L_0x0100
        L_0x0053:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x005f
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1065)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x005f:
            androidx.compose.material3.h0$a r0 = androidx.compose.material3.C8208h0.f20150b
            int r0 = r0.mo12627b()
            boolean r0 = androidx.compose.material3.C8208h0.m27132f(r11, r0)
            r2 = 196608(0x30000, float:2.75506E-40)
            r3 = 1157296644(0x44faf204, float:2007.563)
            if (r0 == 0) goto L_0x00b4
            r0 = -1814971324(0xffffffff93d1bc44, float:-5.294466E-27)
            r13.mo14918M(r0)
            r13.mo14918M(r3)
            boolean r0 = r13.mo15006n0(r12)
            java.lang.Object r3 = r13.mo14921N()
            if (r0 != 0) goto L_0x008b
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r3 != r0) goto L_0x0093
        L_0x008b:
            androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1 r3 = new androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1
            r3.<init>(r12)
            r13.mo14893C(r3)
        L_0x0093:
            r13.mo15002m0()
            r0 = r3
            kotlin.jvm.functions.a r0 = (kotlin.jvm.functions.C11289a) r0
            r3 = 0
            r4 = 0
            r5 = 0
            androidx.compose.material3.ComposableSingletons$DatePickerKt r6 = androidx.compose.material3.ComposableSingletons$DatePickerKt.f19259a
            kotlin.jvm.functions.p r6 = r6.mo11302a()
            int r1 = r1 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r8 = r1 | r2
            r9 = 28
            r1 = r0
            r2 = r10
            r7 = r13
            androidx.compose.material3.IconButtonKt.m25819e(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.mo15002m0()
            goto L_0x00f7
        L_0x00b4:
            r0 = -1814971040(0xffffffff93d1bd60, float:-5.2945756E-27)
            r13.mo14918M(r0)
            r13.mo14918M(r3)
            boolean r0 = r13.mo15006n0(r12)
            java.lang.Object r3 = r13.mo14921N()
            if (r0 != 0) goto L_0x00cf
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r3 != r0) goto L_0x00d7
        L_0x00cf:
            androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1 r3 = new androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1
            r3.<init>(r12)
            r13.mo14893C(r3)
        L_0x00d7:
            r13.mo15002m0()
            r0 = r3
            kotlin.jvm.functions.a r0 = (kotlin.jvm.functions.C11289a) r0
            r3 = 0
            r4 = 0
            r5 = 0
            androidx.compose.material3.ComposableSingletons$DatePickerKt r6 = androidx.compose.material3.ComposableSingletons$DatePickerKt.f19259a
            kotlin.jvm.functions.p r6 = r6.mo11303b()
            int r1 = r1 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r8 = r1 | r2
            r9 = 28
            r1 = r0
            r2 = r10
            r7 = r13
            androidx.compose.material3.IconButtonKt.m25819e(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.mo15002m0()
        L_0x00f7:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0100
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0100:
            androidx.compose.runtime.t1 r13 = r13.mo15020s()
            if (r13 != 0) goto L_0x0107
            goto L_0x010f
        L_0x0107:
            androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$3 r0 = new androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$3
            r0.<init>(r10, r11, r12, r14)
            r13.mo15202a(r0)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.m25602h(androidx.compose.ui.m, int, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: androidx.compose.material3.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25603i(kotlin.jvm.functions.C11300l<? super java.lang.Long, kotlin.C11079d2> r29, androidx.compose.material3.StateData r30, androidx.compose.foundation.lazy.LazyListState r31, androidx.compose.material3.C8186d0 r32, kotlin.jvm.functions.C11300l<? super java.lang.Long, java.lang.Boolean> r33, androidx.compose.material3.C8180c0 r34, androidx.compose.runtime.C8592o r35, int r36) {
        /*
            r9 = r29
            r10 = r30
            r15 = r31
            r14 = r32
            r13 = r33
            r12 = r34
            r11 = r36
            r0 = 1933363608(0x733cc998, float:1.4957285E31)
            r1 = r35
            androidx.compose.runtime.o r8 = r1.mo15009o(r0)
            r1 = r11 & 14
            r6 = 4
            r7 = 2
            if (r1 != 0) goto L_0x0028
            boolean r1 = r8.mo14927P(r9)
            if (r1 == 0) goto L_0x0025
            r1 = r6
            goto L_0x0026
        L_0x0025:
            r1 = r7
        L_0x0026:
            r1 = r1 | r11
            goto L_0x0029
        L_0x0028:
            r1 = r11
        L_0x0029:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0039
            boolean r2 = r8.mo15006n0(r10)
            if (r2 == 0) goto L_0x0036
            r2 = 32
            goto L_0x0038
        L_0x0036:
            r2 = 16
        L_0x0038:
            r1 = r1 | r2
        L_0x0039:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0049
            boolean r2 = r8.mo15006n0(r15)
            if (r2 == 0) goto L_0x0046
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0048
        L_0x0046:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0059
            boolean r2 = r8.mo15006n0(r14)
            if (r2 == 0) goto L_0x0056
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0058
        L_0x0056:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0058:
            r1 = r1 | r2
        L_0x0059:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r11
            if (r2 != 0) goto L_0x006b
            boolean r2 = r8.mo14927P(r13)
            if (r2 == 0) goto L_0x0068
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006a
        L_0x0068:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x006a:
            r1 = r1 | r2
        L_0x006b:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r11
            if (r2 != 0) goto L_0x007c
            boolean r2 = r8.mo15006n0(r12)
            if (r2 == 0) goto L_0x0079
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007b
        L_0x0079:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x007b:
            r1 = r1 | r2
        L_0x007c:
            r5 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r5
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x0094
            boolean r1 = r8.mo15011p()
            if (r1 != 0) goto L_0x008d
            goto L_0x0094
        L_0x008d:
            r8.mo14958a0()
            r4 = r8
            r3 = r15
            goto L_0x01cb
        L_0x0094:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00a0
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1273)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r1, r2)
        L_0x00a0:
            androidx.compose.material3.m r0 = r30.mo11987a()
            androidx.compose.material3.l r16 = r0.mo12487c()
            kotlin.ranges.l r0 = r30.mo11995i()
            r1 = 1157296644(0x44faf204, float:2007.563)
            r8.mo14918M(r1)
            boolean r0 = r8.mo15006n0(r0)
            java.lang.Object r1 = r8.mo14921N()
            r4 = 1
            if (r0 != 0) goto L_0x00c5
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x00d8
        L_0x00c5:
            androidx.compose.material3.m r0 = r30.mo11987a()
            kotlin.ranges.l r1 = r30.mo11995i()
            int r1 = r1.mo23049r()
            androidx.compose.material3.q r1 = r0.mo12490g(r1, r4)
            r8.mo14893C(r1)
        L_0x00d8:
            r8.mo15002m0()
            r17 = r1
            androidx.compose.material3.q r17 = (androidx.compose.material3.C8266q) r17
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1 r1 = androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1.f19328f
            r3 = 0
            r2 = 0
            androidx.compose.ui.m r18 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r0, r3, r1, r4, r2)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.material3.DatePickerDefaults r0 = androidx.compose.material3.DatePickerDefaults.f19304a
            r23 = 0
            int r1 = r5 >> 6
            r1 = r1 & 14
            r4 = r1 | 384(0x180, float:5.38E-43)
            r24 = 2
            r25 = r1
            r1 = r31
            r2 = r23
            r23 = r3
            r3 = r8
            r26 = 1
            r27 = r5
            r5 = r24
            androidx.compose.foundation.gestures.g r24 = r0.mo11351g(r1, r2, r3, r4, r5)
            r28 = 0
            r0 = 7
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r23] = r10
            r1[r26] = r17
            r1[r7] = r9
            r26 = 3
            r1[r26] = r16
            r1[r6] = r13
            r2 = 5
            r1[r2] = r14
            r2 = 6
            r1[r2] = r12
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r8.mo14918M(r2)
            r3 = r23
        L_0x012f:
            if (r3 >= r0) goto L_0x013c
            r2 = r1[r3]
            boolean r2 = r8.mo15006n0(r2)
            r23 = r23 | r2
            int r3 = r3 + 1
            goto L_0x012f
        L_0x013c:
            java.lang.Object r0 = r8.mo14921N()
            if (r23 != 0) goto L_0x014d
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x014b
            goto L_0x014d
        L_0x014b:
            r15 = r8
            goto L_0x0169
        L_0x014d:
            androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1 r7 = new androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1
            r0 = r7
            r1 = r30
            r2 = r17
            r3 = r29
            r4 = r16
            r5 = r33
            r6 = r32
            r9 = r7
            r7 = r34
            r15 = r8
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.mo14893C(r9)
            r0 = r9
        L_0x0169:
            r15.mo15002m0()
            kotlin.jvm.functions.l r0 = (kotlin.jvm.functions.C11300l) r0
            int r1 = r27 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 188(0xbc, float:2.63E-43)
            r11 = r18
            r12 = r31
            r13 = r19
            r14 = r20
            r3 = r31
            r4 = r15
            r15 = r21
            r16 = r22
            r17 = r24
            r18 = r28
            r19 = r0
            r20 = r4
            r21 = r1
            r22 = r2
            androidx.compose.foundation.lazy.LazyDslKt.m10739d(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r4.mo14918M(r0)
            boolean r0 = r4.mo15006n0(r3)
            boolean r1 = r4.mo15006n0(r10)
            r0 = r0 | r1
            java.lang.Object r1 = r4.mo14921N()
            if (r0 != 0) goto L_0x01af
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x01b8
        L_0x01af:
            androidx.compose.material3.DatePickerKt$HorizontalMonthsList$3$1 r1 = new androidx.compose.material3.DatePickerKt$HorizontalMonthsList$3$1
            r0 = 0
            r1.<init>(r3, r10, r0)
            r4.mo14893C(r1)
        L_0x01b8:
            r4.mo15002m0()
            kotlin.jvm.functions.p r1 = (kotlin.jvm.functions.C11304p) r1
            r0 = r25 | 64
            androidx.compose.runtime.EffectsKt.m29896h(r3, r1, r4, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01cb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01cb:
            androidx.compose.runtime.t1 r8 = r4.mo15020s()
            if (r8 != 0) goto L_0x01d2
            goto L_0x01e9
        L_0x01d2:
            androidx.compose.material3.DatePickerKt$HorizontalMonthsList$4 r9 = new androidx.compose.material3.DatePickerKt$HorizontalMonthsList$4
            r0 = r9
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.m25603i(kotlin.jvm.functions.l, androidx.compose.material3.StateData, androidx.compose.foundation.lazy.LazyListState, androidx.compose.material3.d0, kotlin.jvm.functions.l, androidx.compose.material3.c0, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m25604j(@C12579k C8266q qVar, @C12579k C11300l<? super Long, C11079d2> lVar, @C12579k C8238l lVar2, @C12579k StateData stateData, boolean z, @C12579k C11300l<? super Long, Boolean> lVar3, @C12579k C8186d0 d0Var, @C12579k C8180c0 c0Var, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        C8767m mVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C8266q qVar2 = qVar;
        C11300l<? super Long, C11079d2> lVar4 = lVar;
        C8238l lVar5 = lVar2;
        StateData stateData2 = stateData;
        boolean z2 = z;
        C11300l<? super Long, Boolean> lVar6 = lVar3;
        C8186d0 d0Var2 = d0Var;
        C8180c0 c0Var2 = c0Var;
        int i11 = i;
        Intrinsics.checkNotNullParameter(qVar2, "month");
        Intrinsics.checkNotNullParameter(lVar4, "onDateSelected");
        Intrinsics.checkNotNullParameter(lVar5, "today");
        Intrinsics.checkNotNullParameter(stateData2, "stateData");
        Intrinsics.checkNotNullParameter(lVar6, "dateValidator");
        Intrinsics.checkNotNullParameter(d0Var2, "dateFormatter");
        Intrinsics.checkNotNullParameter(c0Var2, C9874a.f27063h);
        C8592o o = oVar.mo15009o(-1561090804);
        if ((i11 & 14) == 0) {
            if (o.mo15006n0(qVar2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i11;
        } else {
            i2 = i11;
        }
        if ((i11 & 112) == 0) {
            if (o.mo14927P(lVar4)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i11 & 896) == 0) {
            if (o.mo15006n0(lVar5)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i11 & 7168) == 0) {
            if (o.mo15006n0(stateData2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((57344 & i11) == 0) {
            if (o.mo14961b(z2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((458752 & i11) == 0) {
            if (o.mo14927P(lVar6)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((3670016 & i11) == 0) {
            if (o.mo15006n0(d0Var2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((29360128 & i11) == 0) {
            if (o.mo15006n0(c0Var2)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i12 = i2;
        if ((23967451 & i12) != 4793490 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1561090804, i12, -1, "androidx.compose.material3.Month (DatePicker.kt:1404)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(valueOf);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = C8415c2.m30235d(new DatePickerKt$Month$rangeSelectionInfo$1$1(z2, qVar2, stateData2));
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8578k2 k2Var = (C8578k2) N;
            o.mo14918M(-2019479227);
            if (z2) {
                C8767m.C8768a aVar = C8767m.f23478j;
                o.mo14918M(511388516);
                boolean n02 = o.mo15006n0(k2Var) | o.mo15006n0(c0Var2);
                Object N2 = o.mo14921N();
                if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                    N2 = new DatePickerKt$Month$rangeSelectionDrawModifier$1$1(k2Var, c0Var2);
                    o.mo14893C(N2);
                }
                o.mo15002m0();
                mVar = DrawModifierKt.m32438c(aVar, (C11300l) N2);
            } else {
                mVar = C8767m.f23478j;
            }
            o.mo15002m0();
            Locale b = C8260p.m27433b(o, 0);
            C8700z0<C8238l> g = stateData.mo11993g();
            C8700z0<C8238l> f = stateData.mo11992f();
            DatePickerKt$Month$1 datePickerKt$Month$1 = r0;
            int i13 = i12;
            C8700z0<C8238l> z0Var = f;
            C16361p0 a = TypographyKt.m26914a(C8215i1.f20180a.mo12654c(o, 6), C8310i.f21329a.mo13735j());
            oVar2 = o;
            DatePickerKt$Month$1 datePickerKt$Month$12 = new DatePickerKt$Month$1(mVar, qVar, lVar2, g, z0Var, z, i13, d0Var, b, lVar, c0Var, stateData, lVar3);
            TextKt.m26698a(a, C8553b.m31048b(oVar2, -1776200645, true, datePickerKt$Month$1), oVar2, 48);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DatePickerKt$Month$2(qVar, lVar, lVar2, stateData, z, lVar3, d0Var, c0Var, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    public static final void m25605k(C8767m mVar, boolean z, boolean z2, boolean z3, String str, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        Arrangement.C2269d dVar;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C8767m mVar2 = mVar;
        boolean z5 = z3;
        String str2 = str;
        int i11 = i;
        C8592o o = oVar.mo15009o(-1127095896);
        if ((i11 & 14) == 0) {
            if (o.mo15006n0(mVar2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i11;
        } else {
            i2 = i11;
        }
        boolean z6 = z;
        if ((i11 & 112) == 0) {
            if (o.mo14961b(z6)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        boolean z7 = z2;
        if ((i11 & 896) == 0) {
            if (o.mo14961b(z7)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i11 & 7168) == 0) {
            if (o.mo14961b(z5)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((57344 & i11) == 0) {
            if (o.mo15006n0(str2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        C11289a<C11079d2> aVar4 = aVar;
        if ((458752 & i11) == 0) {
            if (o.mo14927P(aVar4)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        C11289a<C11079d2> aVar5 = aVar2;
        if ((3670016 & i11) == 0) {
            if (o.mo14927P(aVar5)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        C11289a<C11079d2> aVar6 = aVar3;
        if ((29360128 & i11) == 0) {
            if (o.mo14927P(aVar6)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i12 = i2;
        if ((23967451 & i12) != 4793490 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1127095896, i12, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:1765)");
            }
            C8767m r = SizeKt.m10118r(SizeKt.m10114n(mVar2, 0.0f, 1, (Object) null), f19315b);
            if (z5) {
                dVar = Arrangement.f6010a.mo7630p();
            } else {
                dVar = Arrangement.f6010a.mo7628l();
            }
            C8734c.C8735a aVar7 = C8734c.f23406a;
            C8734c.C8737c q = aVar7.mo17070q();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(dVar, q, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(r);
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
            Updater.m30188j(b, dVar2, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            int i13 = i12;
            m25610p(aVar3, z3, (C8767m) null, C8553b.m31048b(o, -1156508456, true, new DatePickerKt$MonthsNavigation$1$1(str2, i12)), o, ((i12 >> 21) & 14) | 3072 | ((i12 >> 6) & 112), 4);
            o.mo14918M(979007906);
            if (!z5) {
                o.mo14918M(693286680);
                C8767m.C8768a aVar8 = C8767m.f23478j;
                C15560f0 d2 = RowKt.m10071d(Arrangement.f6010a.mo7630p(), aVar7.mo17073w(), o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a2 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar8);
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
                Updater.m30188j(b2, d2, companion.mo44588d());
                Updater.m30188j(b2, dVar3, companion.mo44586b());
                Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
                Updater.m30188j(b2, c4Var2, companion.mo44590f());
                o.mo14972e();
                f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                if (o.mo15032w(CompositionLocalsKt.m71018p()) == LayoutDirection.Rtl) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                oVar2 = o;
                C8592o oVar3 = oVar2;
                IconButtonKt.m25819e(aVar2, (C8767m) null, z2, (C8363w0) null, (C2243g) null, C8553b.m31048b(o, -1143715416, true, new DatePickerKt$MonthsNavigation$1$2$1(z4)), oVar3, ((i13 >> 18) & 14) | C20022q.C20025c.f51280k | (i13 & 896), 26);
                IconButtonKt.m25819e(aVar, (C8767m) null, z, (C8363w0) null, (C2243g) null, C8553b.m31048b(oVar2, 1336532191, true, new DatePickerKt$MonthsNavigation$1$2$2(z4)), oVar3, ((i13 >> 15) & 14) | C20022q.C20025c.f51280k | ((i13 << 3) & 896), 26);
                oVar2.mo15002m0();
                oVar2.mo14896D();
                oVar2.mo15002m0();
                oVar2.mo15002m0();
            } else {
                oVar2 = o;
            }
            oVar2.mo15002m0();
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
            s.mo15202a(new DatePickerKt$MonthsNavigation$2(mVar, z, z2, z3, str, aVar, aVar2, aVar3, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    public static final void m25606l(DatePickerState datePickerState, C8186d0 d0Var, C11300l<? super Long, Boolean> lVar, C8180c0 c0Var, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        C8592o o = oVar.mo15009o(1613036224);
        if ((i7 & 14) == 0) {
            if (o.mo15006n0(datePickerState)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            DatePickerState datePickerState2 = datePickerState;
            i2 = i7;
        }
        if ((i7 & 112) == 0) {
            if (o.mo15006n0(d0Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        } else {
            C8186d0 d0Var2 = d0Var;
        }
        C11300l<? super Long, Boolean> lVar2 = lVar;
        if ((i7 & 896) == 0) {
            if (o.mo14927P(lVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        C8180c0 c0Var2 = c0Var;
        if ((i7 & 7168) == 0) {
            if (o.mo15006n0(c0Var2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((i8 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1613036224, i8, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1093)");
            }
            int a = datePickerState.mo11432a();
            C2014v0 o2 = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
            C8767m c = SemanticsModifierKt.m71868c(C8767m.f23478j, false, DatePickerKt$SwitchableDateEntryContent$1.f19332f, 1, (Object) null);
            C8208h0 c2 = C8208h0.m27129c(a);
            DatePickerKt$SwitchableDateEntryContent$2 datePickerKt$SwitchableDateEntryContent$2 = r6;
            DatePickerKt$SwitchableDateEntryContent$2 datePickerKt$SwitchableDateEntryContent$22 = new DatePickerKt$SwitchableDateEntryContent$2(datePickerState, d0Var, lVar, c0Var, i8);
            CrossfadeKt.m7789b(c2, c, o2, (String) null, C8553b.m31048b(o, 1854706084, true, datePickerKt$SwitchableDateEntryContent$2), o, 24960, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DatePickerKt$SwitchableDateEntryContent$3(datePickerState, d0Var, lVar, c0Var, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    public static final void m25607m(@C12579k C8180c0 c0Var, @C12579k C8244m mVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(c0Var, C9874a.f27063h);
        Intrinsics.checkNotNullParameter(mVar, "calendarModel");
        C8592o o = oVar.mo15009o(-1849465391);
        if ((i & 14) == 0) {
            if (o.mo15006n0(c0Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(mVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1849465391, i, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1354)");
            }
            int k = mVar.mo12494k();
            List<Pair<String, String>> l = mVar.mo12495l();
            ArrayList arrayList = new ArrayList();
            int i5 = k - 1;
            int size = l.size();
            for (int i6 = i5; i6 < size; i6++) {
                arrayList.add(l.get(i6));
            }
            for (int i7 = 0; i7 < i5; i7++) {
                arrayList.add(l.get(i7));
            }
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(c0Var.mo12482i()))}, C8553b.m31048b(o, -1445541615, true, new DatePickerKt$WeekDays$1(arrayList)), o, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DatePickerKt$WeekDays$2(c0Var, mVar, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: n */
    public static final void m25608n(C8767m mVar, boolean z, boolean z2, C11289a<C11079d2> aVar, String str, C8180c0 c0Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        C2223i iVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C8767m mVar2 = mVar;
        boolean z3 = z;
        boolean z4 = z2;
        String str2 = str;
        C8180c0 c0Var2 = c0Var;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        int i10 = i;
        C8592o o = oVar.mo15009o(-1441573940);
        if ((i10 & 14) == 0) {
            if (o.mo15006n0(mVar2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i10;
        } else {
            i2 = i10;
        }
        if ((i10 & 112) == 0) {
            if (o.mo14961b(z3)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i10 & 896) == 0) {
            if (o.mo14961b(z4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        C11289a<C11079d2> aVar2 = aVar;
        if ((i10 & 7168) == 0) {
            if (o.mo14927P(aVar2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((57344 & i10) == 0) {
            if (o.mo15006n0(str2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((458752 & i10) == 0) {
            if (o.mo15006n0(c0Var2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((3670016 & i10) == 0) {
            if (o.mo14927P(pVar2)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((2995931 & i11) != 599186 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1441573940, i11, -1, "androidx.compose.material3.Year (DatePicker.kt:1716)");
            }
            Boolean valueOf = Boolean.valueOf(z2);
            Boolean valueOf2 = Boolean.valueOf(z);
            int i12 = i11 >> 6;
            int i13 = (i12 & 14) | (i11 & 112);
            o.mo14918M(511388516);
            boolean n0 = o.mo15006n0(valueOf) | o.mo15006n0(valueOf2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                if (!z4 || z3) {
                    iVar = null;
                } else {
                    iVar = C2250j.m9695a(C8310i.f21329a.mo13742q(), c0Var.mo12480h());
                }
                N = iVar;
                o.mo14893C(N);
            }
            o.mo15002m0();
            C2223i iVar2 = (C2223i) N;
            int i14 = i11 >> 12;
            o.mo14918M(1157296644);
            boolean n02 = o.mo15006n0(str2);
            Object N2 = o.mo14921N();
            if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                N2 = new DatePickerKt$Year$1$1(str2);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            int i15 = (i11 >> 3) & 14;
            C8592o oVar3 = o;
            boolean z5 = z;
            C11289a<C11079d2> aVar3 = aVar;
            C2223i iVar3 = iVar2;
            C8592o oVar4 = oVar3;
            oVar2 = oVar3;
            SurfaceKt.m26353b(z5, aVar3, SemanticsModifierKt.m71867b(mVar2, true, (C11300l) N2), false, ShapesKt.m26127f(C8310i.f21329a.mo13721P(), o, 6), c0Var2.mo12483j(z3, o, i15 | (i14 & 112)).getValue().mo42833M(), c0Var2.mo12484k(z4, z3, o, ((i11 >> 9) & 896) | i13).getValue().mo42833M(), 0.0f, 0.0f, iVar3, (C2243g) null, C8553b.m31048b(oVar3, -68753950, true, new DatePickerKt$Year$2(pVar2, i11)), oVar4, i15 | (i12 & 112), 48, 1416);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DatePickerKt$Year$3(mVar, z, z2, aVar, str, c0Var, pVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: o */
    public static final void m25609o(C8767m mVar, C11300l<? super Integer, C11079d2> lVar, C8180c0 c0Var, StateData stateData, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(-1038904873);
        if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14927P(lVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (o.mo15006n0(c0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (o.mo15006n0(stateData)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1038904873, i7, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:1628)");
            }
            TextKt.m26698a(TypographyKt.m26914a(C8215i1.f20180a.mo12654c(o, 6), C8310i.f21329a.mo13717L()), C8553b.m31048b(o, -145469688, true, new DatePickerKt$YearPicker$1(stateData, c0Var, mVar, lVar, i7)), o, 48);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DatePickerKt$YearPicker$2(mVar, lVar, c0Var, stateData, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25610p(kotlin.jvm.functions.C11289a<kotlin.C11079d2> r20, boolean r21, androidx.compose.p004ui.C8767m r22, kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r23, androidx.compose.runtime.C8592o r24, int r25, int r26) {
        /*
            r2 = r21
            r4 = r23
            r5 = r25
            r0 = 409654418(0x186ad492, float:3.0351112E-24)
            r1 = r24
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r26 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r5 | 6
            r6 = r3
            r3 = r20
            goto L_0x002d
        L_0x0019:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x002a
            r3 = r20
            boolean r6 = r1.mo14927P(r3)
            if (r6 == 0) goto L_0x0027
            r6 = 4
            goto L_0x0028
        L_0x0027:
            r6 = 2
        L_0x0028:
            r6 = r6 | r5
            goto L_0x002d
        L_0x002a:
            r3 = r20
            r6 = r5
        L_0x002d:
            r7 = r26 & 2
            if (r7 == 0) goto L_0x0034
            r6 = r6 | 48
            goto L_0x0044
        L_0x0034:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0044
            boolean r7 = r1.mo14961b(r2)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r7 = r26 & 4
            if (r7 == 0) goto L_0x004b
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004b:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x005e
            r8 = r22
            boolean r9 = r1.mo15006n0(r8)
            if (r9 == 0) goto L_0x005a
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r6 = r6 | r9
            goto L_0x0060
        L_0x005e:
            r8 = r22
        L_0x0060:
            r9 = r26 & 8
            if (r9 == 0) goto L_0x0067
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0077
        L_0x0067:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0077
            boolean r9 = r1.mo14927P(r4)
            if (r9 == 0) goto L_0x0074
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r6 = r6 | r9
        L_0x0077:
            r15 = r6
            r6 = r15 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r6 != r9) goto L_0x008b
            boolean r6 = r1.mo15011p()
            if (r6 != 0) goto L_0x0085
            goto L_0x008b
        L_0x0085:
            r1.mo14958a0()
            r19 = r8
            goto L_0x00f6
        L_0x008b:
            if (r7 == 0) goto L_0x0092
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r19 = r6
            goto L_0x0094
        L_0x0092:
            r19 = r8
        L_0x0094:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x00a0
            r6 = -1
            java.lang.String r7 = "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:1830)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r15, r6, r7)
        L_0x00a0:
            androidx.compose.foundation.shape.n r18 = androidx.compose.foundation.shape.C2694o.m12169k()
            androidx.compose.material3.k r6 = androidx.compose.material3.C8232k.f20254a
            r7 = 0
            androidx.compose.material3.i1 r9 = androidx.compose.material3.C8215i1.f20180a
            r10 = 6
            androidx.compose.material3.z r9 = r9.mo12652a(r1, r10)
            long r9 = r9.mo14851q()
            r11 = 0
            r13 = 0
            r16 = 24576(0x6000, float:3.4438E-41)
            r17 = 13
            r0 = r15
            r15 = r1
            androidx.compose.material3.j r10 = r6.mo12750v(r7, r9, r11, r13, r15, r16, r17)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1 r6 = new androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1
            r6.<init>(r4, r0, r2)
            r7 = 1899012021(0x71309fb5, float:8.74599E29)
            r8 = 1
            androidx.compose.runtime.internal.a r15 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r7, r8, r6)
            r6 = 807075840(0x301b0000, float:5.638867E-10)
            r7 = r0 & 14
            r6 = r6 | r7
            int r0 = r0 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r17 = r6 | r0
            r0 = 388(0x184, float:5.44E-43)
            r6 = r20
            r7 = r19
            r8 = 0
            r9 = r18
            r16 = r1
            r18 = r0
            androidx.compose.material3.ButtonKt.m25461e(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00f6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00f6:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x00fd
            goto L_0x0112
        L_0x00fd:
            androidx.compose.material3.DatePickerKt$YearPickerMenuButton$2 r8 = new androidx.compose.material3.DatePickerKt$YearPickerMenuButton$2
            r0 = r8
            r1 = r20
            r2 = r21
            r3 = r19
            r4 = r23
            r5 = r25
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.m25610p(kotlin.jvm.functions.a, boolean, androidx.compose.ui.m, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }
}
