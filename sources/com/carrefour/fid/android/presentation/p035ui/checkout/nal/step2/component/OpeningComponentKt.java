package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.gifdecoder.C22073d;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.pickup.C38082c;
import com.contentsquare.android.api.C14092c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p073j$.time.DayOfWeek;

@C11363r0({"SMAP\nOpeningComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpeningComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/OpeningComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n154#2:185\n154#2:219\n154#2:253\n154#2:254\n154#2:260\n154#2:261\n154#2:295\n154#2:296\n154#2:302\n154#2:303\n74#3,6:186\n80#3:218\n84#3:308\n75#4:192\n76#4,11:194\n75#4:226\n76#4,11:228\n89#4:258\n75#4:268\n76#4,11:270\n89#4:300\n89#4:307\n76#5:193\n76#5:227\n76#5:269\n460#6,13:205\n460#6,13:239\n473#6,3:255\n460#6,13:281\n473#6,3:297\n473#6,3:304\n67#7,6:220\n73#7:252\n77#7:259\n75#8,6:262\n81#8:294\n85#8:301\n1549#9:309\n1620#9,3:310\n*S KotlinDebug\n*F\n+ 1 OpeningComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/OpeningComponentKt\n*L\n50#1:185\n52#1:219\n56#1:253\n68#1:254\n76#1:260\n77#1:261\n82#1:295\n85#1:296\n94#1:302\n95#1:303\n47#1:186,6\n47#1:218\n47#1:308\n47#1:192\n47#1:194,11\n52#1:226\n52#1:228,11\n52#1:258\n74#1:268\n74#1:270,11\n74#1:300\n47#1:307\n47#1:193\n52#1:227\n74#1:269\n47#1:205,13\n52#1:239,13\n52#1:255,3\n74#1:281,13\n74#1:297,3\n47#1:304,3\n52#1:220,6\n52#1:252\n52#1:259\n74#1:262,6\n74#1:294\n74#1:301\n134#1:309\n134#1:310,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.OpeningComponentKt */
public final class OpeningComponentKt {

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.OpeningComponentKt$a */
    public /* synthetic */ class C23650a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                j$.time.DayOfWeek[] r0 = p073j$.time.DayOfWeek.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                j$.time.DayOfWeek r1 = p073j$.time.DayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                j$.time.DayOfWeek r1 = p073j$.time.DayOfWeek.TUESDAY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                j$.time.DayOfWeek r1 = p073j$.time.DayOfWeek.WEDNESDAY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                j$.time.DayOfWeek r1 = p073j$.time.DayOfWeek.THURSDAY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                j$.time.DayOfWeek r1 = p073j$.time.DayOfWeek.FRIDAY     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                j$.time.DayOfWeek r1 = p073j$.time.DayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                j$.time.DayOfWeek r1 = p073j$.time.DayOfWeek.SUNDAY     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.OpeningComponentKt.C23650a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m105029a(@C12580l C8767m mVar, @C12579k String str, @C12579k List<C23659a> list, @C12579k DayOfWeek dayOfWeek, @C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        OpeningComponentKt$OpeningComponent$1 openingComponentKt$OpeningComponent$1;
        List<C23659a> list2 = list;
        DayOfWeek dayOfWeek2 = dayOfWeek;
        int i3 = i;
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(list2, "openings");
        Intrinsics.checkNotNullParameter(dayOfWeek2, "currentDayOfWeek");
        C8592o o = oVar.mo15009o(1149623541);
        if ((i2 & 1) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i2 & 16) != 0) {
            openingComponentKt$OpeningComponent$1 = OpeningComponentKt$OpeningComponent$1.f59689f;
        } else {
            openingComponentKt$OpeningComponent$1 = aVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1149623541, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.OpeningComponent (OpeningComponent.kt:39)");
        }
        C8767m d = BackgroundKt.m8825d(mVar2, C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null);
        float f = (float) 24;
        C8767m m = PaddingKt.m10026m(d, 0.0f, C16483g.m74435M(f), 1, (Object) null);
        o.mo14918M(-483455358);
        Arrangement arrangement = Arrangement.f6010a;
        Arrangement.C2279l r = arrangement.mo7631r();
        C8734c.C8735a aVar2 = C8734c.f23406a;
        C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(m);
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
        C8767m.C8768a aVar3 = C8767m.f23478j;
        C8767m o2 = PaddingKt.m10028o(aVar3, C16483g.m74435M((float) 16), 0.0f, C16483g.m74435M((float) 12), 0.0f, 10, (Object) null);
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
        C8767m c = boxScopeInstance.mo7701c(SizeKt.m10114n(PaddingKt.m10028o(aVar3, 0.0f, 0.0f, C16483g.m74435M((float) 30), 0.0f, 11, (Object) null), 0.0f, 1, (Object) null), aVar2.mo17069o());
        int c2 = C16449r.f40760b.mo47727c();
        C7933t0 t0Var = C7933t0.f19075a;
        int i4 = C7933t0.f19076b;
        int i5 = (i3 >> 3) & 14;
        float f4 = f;
        C7933t0 t0Var2 = t0Var;
        int i6 = i4;
        TextKt.m14196c(str, c, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, c2, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(o, i4).mo11097j(), o, i5, 3120, 55292);
        C8767m.C8768a aVar4 = aVar3;
        C8767m.C8768a aVar5 = aVar4;
        float f5 = (float) 8;
        float f6 = f5;
        IconKt.m13539b(C16015f.m71849d(R.drawable.ic_close_cross, o, 0), (String) null, PaddingKt.m10024k(ClickableKt.m8878e(boxScopeInstance.mo7701c(aVar4, aVar2.mo17067k()), false, (String) null, (C16031g) null, openingComponentKt$OpeningComponent$1, 7, (Object) null), C16483g.m74435M(f5)), C37475b.f94185a.mo114257y(), o, 56, 0);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        C8767m m2 = PaddingKt.m10026m(SizeKt.m10115o(aVar5, C16483g.m74435M((float) 46)), C16483g.m74435M(f4), 0.0f, 2, (Object) null);
        C8734c.C8737c q = aVar2.mo17070q();
        o.mo14918M(693286680);
        C15560f0 d2 = RowKt.m10071d(arrangement.mo7630p(), q, o, 48);
        o.mo14918M(-1323940314);
        C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a3 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f7 = LayoutKt.m68908f(m2);
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
        C8592o b4 = Updater.m30180b(o);
        Updater.m30188j(b4, d2, companion.mo44588d());
        Updater.m30188j(b4, dVar3, companion.mo44586b());
        Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
        Updater.m30188j(b4, c4Var3, companion.mo44590f());
        o.mo14972e();
        f7.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        C8767m.C8768a aVar6 = aVar5;
        ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_strore_active, o, 0), C16018i.m71858d(R.string.pickup_map_see_openings_button, o, 0), SizeKt.m10087C(aVar5, C16483g.m74435M(f4)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, C14092c.f34507C0, 120);
        C2428y0.m10726a(SizeKt.m10092H(aVar6, C16483g.m74435M(f6)), o, 6);
        TextKt.m14196c(C16018i.m71858d(R.string.pickup_openings, o, 0), (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var2.mo11077c(o, i6).mo11098k(), o, 0, 0, 65534);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        LazyDslKt.m10737b(PaddingKt.m10026m(SizeKt.m10115o(aVar6, C16483g.m74435M((float) C14092c.f34599f0)), C16483g.m74435M(f4), 0.0f, 2, (Object) null), (LazyListState) null, (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new OpeningComponentKt$OpeningComponent$2$3(list2, dayOfWeek2), o, 6, C22073d.f56678l);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OpeningComponentKt$OpeningComponent$3(mVar2, str, list, dayOfWeek, openingComponentKt$OpeningComponent$1, i, i2));
        }
    }

    @C8540g
    @C16464c(widthDp = 270)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m105030b(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1459218498);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1459218498, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.OpeningComponentPreview (OpeningComponent.kt:144)");
            }
            ThemeKt.m153788a(C8553b.m31048b(o, -812082811, true, new OpeningComponentKt$OpeningComponentPreview$1(CollectionsKt__CollectionsKt.m40448L(new C23659a(DayOfWeek.MONDAY, C10976s.m41419k(new C38082c("15:00", "19:00"))), new C23659a(DayOfWeek.TUESDAY, CollectionsKt__CollectionsKt.m40448L(new C38082c("10:00:00", "14:00"), new C38082c("15:00:00", "19:00"))), new C23659a(DayOfWeek.WEDNESDAY, CollectionsKt__CollectionsKt.m40448L(new C38082c("10:00", "14:00"), new C38082c("15:00", "19:00"))), new C23659a(DayOfWeek.THURSDAY, CollectionsKt__CollectionsKt.m40448L(new C38082c("10:00", "14:00"), new C38082c("15:00", "19:00"))), new C23659a(DayOfWeek.FRIDAY, CollectionsKt__CollectionsKt.m40448L(new C38082c("10:00", "14:00"), new C38082c("15:00", "19:00"))), new C23659a(DayOfWeek.SATURDAY, CollectionsKt__CollectionsKt.m40448L(new C38082c("10:00", "14:00"), new C38082c("15:00", "19:00"))), new C23659a(DayOfWeek.SUNDAY, CollectionsKt__CollectionsKt.m40441E())))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OpeningComponentKt$OpeningComponentPreview$2(i));
        }
    }

    /* renamed from: e */
    public static final String m105033e(DayOfWeek dayOfWeek) {
        switch (C23650a.$EnumSwitchMapping$0[dayOfWeek.ordinal()]) {
            case 1:
                return "Lun.";
            case 2:
                return "Mar.";
            case 3:
                return "Mer.";
            case 4:
                return "Jeu.";
            case 5:
                return "Ven.";
            case 6:
                return "Sam.";
            case 7:
                return "Dim.";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: f */
    public static final String m105034f(List<C38082c> list, String str) {
        String str2;
        Iterable<C38082c> E5 = CollectionsKt___CollectionsKt.m40497E5(list, 2);
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(E5, 10));
        for (C38082c cVar : E5) {
            String str3 = null;
            if (!(cVar.mo118307e() == null || cVar.mo118309f() == null)) {
                String e = cVar.mo118307e();
                if (e != null) {
                    str2 = StringsKt___StringsKt.take(e, 5);
                } else {
                    str2 = null;
                }
                String f = cVar.mo118309f();
                if (f != null) {
                    str3 = StringsKt___StringsKt.take(f, 5);
                }
                str3 = str2 + "-" + str3;
            }
            arrayList.add(str3);
        }
        String h3 = CollectionsKt___CollectionsKt.m40639h3(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null);
        if (list.isEmpty()) {
            return str;
        }
        return h3;
    }
}
