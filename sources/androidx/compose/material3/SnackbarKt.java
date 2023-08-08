package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,435:1\n154#2:436\n154#2:508\n154#2:591\n154#2:734\n154#2:735\n154#2:736\n154#2:737\n154#2:738\n154#2:739\n154#2:740\n154#2:741\n74#3,6:437\n80#3:469\n84#3:590\n75#4:443\n76#4,11:445\n75#4:476\n76#4,11:478\n89#4:506\n75#4:515\n76#4,11:517\n75#4:549\n76#4,11:551\n89#4:579\n89#4:584\n89#4:589\n74#4:592\n75#4,11:594\n75#4:622\n76#4,11:624\n89#4:652\n75#4:660\n76#4,11:662\n89#4:690\n75#4:698\n76#4,11:700\n89#4:728\n88#4:733\n76#5:444\n76#5:477\n76#5:516\n76#5:550\n76#5:593\n76#5:623\n76#5:661\n76#5:699\n460#6,13:456\n460#6,13:489\n473#6,3:503\n460#6,13:528\n460#6,13:562\n473#6,3:576\n473#6,3:581\n473#6,3:586\n456#6,11:605\n460#6,13:635\n473#6,3:649\n460#6,13:673\n473#6,3:687\n460#6,13:711\n473#6,3:725\n467#6,3:730\n67#7,6:470\n73#7:502\n77#7:507\n67#7,6:509\n73#7:541\n77#7:585\n67#7,6:616\n73#7:648\n77#7:653\n67#7,6:654\n73#7:686\n77#7:691\n67#7,6:692\n73#7:724\n77#7:729\n74#8,7:542\n81#8:575\n85#8:580\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n*L\n238#1:436\n277#1:508\n331#1:591\n427#1:734\n428#1:735\n429#1:736\n430#1:737\n431#1:738\n432#1:739\n433#1:740\n434#1:741\n260#1:437,6\n260#1:469\n260#1:590\n260#1:443\n260#1:445,11\n270#1:476\n270#1:478,11\n270#1:506\n275#1:515\n275#1:517,11\n279#1:549\n279#1:551,11\n279#1:579\n275#1:584\n260#1:589\n308#1:592\n308#1:594,11\n310#1:622\n310#1:624,11\n310#1:652\n312#1:660\n312#1:662,11\n312#1:690\n321#1:698\n321#1:700,11\n321#1:728\n308#1:733\n260#1:444\n270#1:477\n275#1:516\n279#1:550\n308#1:593\n310#1:623\n312#1:661\n321#1:699\n260#1:456,13\n270#1:489,13\n270#1:503,3\n275#1:528,13\n279#1:562,13\n279#1:576,3\n275#1:581,3\n260#1:586,3\n308#1:605,11\n310#1:635,13\n310#1:649,3\n312#1:673,13\n312#1:687,3\n321#1:711,13\n321#1:725,3\n308#1:730,3\n270#1:470,6\n270#1:502\n270#1:507\n275#1:509,6\n275#1:541\n275#1:585\n310#1:616,6\n310#1:648\n310#1:653\n312#1:654,6\n312#1:686\n312#1:691\n321#1:692,6\n321#1:724\n321#1:729\n279#1:542,7\n279#1:575\n279#1:580\n*E\n"})
public final class SnackbarKt {

    /* renamed from: a */
    public static final float f19709a = C16483g.m74435M((float) 600);

    /* renamed from: b */
    public static final float f19710b = C16483g.m74435M((float) 30);

    /* renamed from: c */
    public static final float f19711c = C16483g.m74435M((float) 16);

    /* renamed from: d */
    public static final float f19712d;

    /* renamed from: e */
    public static final float f19713e = C16483g.m74435M((float) 2);

    /* renamed from: f */
    public static final float f19714f = C16483g.m74435M((float) 6);

    /* renamed from: g */
    public static final float f19715g;

    /* renamed from: h */
    public static final float f19716h = C16483g.m74435M((float) 12);

    static {
        float f = (float) 8;
        f19712d = C16483g.m74435M(f);
        f19715g = C16483g.m74435M(f);
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m26287a(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C16361p0 p0Var, long j, long j2, C8592o oVar, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar5 = pVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar6 = pVar3;
        C16361p0 p0Var2 = p0Var;
        int i9 = i;
        C8592o o = oVar.mo15009o(-1332496681);
        if ((i9 & 14) == 0) {
            if (o.mo14927P(pVar4)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 112) == 0) {
            if (o.mo14927P(pVar5)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 896) == 0) {
            if (o.mo14927P(pVar6)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i9 & 7168) == 0) {
            if (o.mo15006n0(p0Var2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        long j3 = j;
        if ((57344 & i9) == 0) {
            if (o.mo14980g(j3)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        long j4 = j2;
        if ((458752 & i9) == 0) {
            if (o.mo14980g(j4)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) != 74898 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1332496681, i2, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:251)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m o2 = PaddingKt.m10028o(SizeKt.m10114n(SizeKt.m10094J(aVar, 0.0f, f19709a, 1, (Object) null), 0.0f, 1, (Object) null), f19711c, 0.0f, 0.0f, f19713e, 6, (Object) null);
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
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(o2);
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
            C8767m i10 = AlignmentLineKt.m9716i(aVar, f19710b, f19716h);
            float f3 = f19712d;
            C8767m o3 = PaddingKt.m10028o(i10, 0.0f, 0.0f, f3, 0.0f, 11, (Object) null);
            o.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            float f4 = f3;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(o3);
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
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            pVar4.invoke(o, Integer.valueOf(i2 & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            C8767m e = columnScopeInstance.mo7714e(aVar, aVar2.mo17071s());
            if (pVar6 == null) {
                f = f4;
            } else {
                f = C16483g.m74435M((float) 0);
            }
            C8767m o4 = PaddingKt.m10028o(e, 0.0f, 0.0f, f, 0.0f, 11, (Object) null);
            o.mo14918M(733328855);
            C15560f0 k2 = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(o4);
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
            Updater.m30188j(b4, k2, companion.mo44588d());
            Updater.m30188j(b4, dVar3, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b4, c4Var3, companion.mo44590f());
            o.mo14972e();
            f6.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(arrangement.mo7630p(), aVar2.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar4 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection4 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var4 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a4 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f7 = LayoutKt.m68908f(aVar);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a4);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b5 = Updater.m30180b(o);
            Updater.m30188j(b5, d, companion.mo44588d());
            Updater.m30188j(b5, dVar4, companion.mo44586b());
            Updater.m30188j(b5, layoutDirection4, companion.mo44587c());
            Updater.m30188j(b5, c4Var4, companion.mo44590f());
            o.mo14972e();
            f7.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j)), TextKt.m26703f().mo16141f(p0Var2)}, pVar2, o, (i2 & 112) | 8);
            o.mo14918M(302366994);
            if (pVar6 != null) {
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j2))}, pVar6, o, ((i2 >> 3) & 112) | 8);
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
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
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar7 = pVar5;
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SnackbarKt$NewLineButtonSnackbar$2(pVar, pVar2, pVar3, p0Var, j, j2, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final void m26288b(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C16361p0 p0Var, long j, long j2, C8592o oVar, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar5 = pVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar6 = pVar3;
        C16361p0 p0Var2 = p0Var;
        int i9 = i;
        C8592o o = oVar.mo15009o(-903235475);
        if ((i9 & 14) == 0) {
            if (o.mo14927P(pVar4)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 112) == 0) {
            if (o.mo14927P(pVar5)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 896) == 0) {
            if (o.mo14927P(pVar6)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i9 & 7168) == 0) {
            if (o.mo15006n0(p0Var2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        long j3 = j;
        if ((57344 & i9) == 0) {
            if (o.mo14980g(j3)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        long j4 = j2;
        if ((458752 & i9) == 0) {
            if (o.mo14980g(j4)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) != 74898 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-903235475, i2, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:296)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f2 = f19711c;
            if (pVar6 == null) {
                f = f19712d;
            } else {
                f = C16483g.m74435M((float) 0);
            }
            C8767m o2 = PaddingKt.m10028o(aVar, f2, 0.0f, f, 0.0f, 10, (Object) null);
            SnackbarKt$OneRowSnackbar$2 snackbarKt$OneRowSnackbar$2 = new SnackbarKt$OneRowSnackbar$2("action", "dismissAction", "text");
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            Object obj = "dismissAction";
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(o2);
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
            Updater.m30188j(b, snackbarKt$OneRowSnackbar$2, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            C8767m m = PaddingKt.m10026m(C15594q.m69318b(aVar, "text"), 0.0f, f19714f, 1, (Object) null);
            o.mo14918M(733328855);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(m);
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
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            pVar4.invoke(o, Integer.valueOf(i2 & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            o.mo14918M(-167734350);
            if (pVar5 != null) {
                C8767m b3 = C15594q.m69318b(aVar, "action");
                o.mo14918M(733328855);
                C15560f0 k2 = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a3 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(b3);
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
                Updater.m30188j(b4, k2, companion.mo44588d());
                Updater.m30188j(b4, dVar3, companion.mo44586b());
                Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
                Updater.m30188j(b4, c4Var3, companion.mo44590f());
                o.mo14972e();
                f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j)), TextKt.m26703f().mo16141f(p0Var2)}, pVar5, o, (i2 & 112) | 8);
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
            }
            o.mo15002m0();
            o.mo14918M(44738809);
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar7 = pVar3;
            if (pVar7 != null) {
                C8767m b5 = C15594q.m69318b(aVar, obj);
                o.mo14918M(733328855);
                C15560f0 k3 = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar4 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection4 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var4 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a4 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(b5);
                if (!(o.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                o.mo14938T();
                if (o.mo14997l()) {
                    o.mo14947W(a4);
                } else {
                    o.mo14888A();
                }
                o.mo14941U();
                C8592o b6 = Updater.m30180b(o);
                Updater.m30188j(b6, k3, companion.mo44588d());
                Updater.m30188j(b6, dVar4, companion.mo44586b());
                Updater.m30188j(b6, layoutDirection4, companion.mo44587c());
                Updater.m30188j(b6, c4Var4, companion.mo44590f());
                o.mo14972e();
                f6.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j2))}, pVar7, o, ((i2 >> 3) & 112) | 8);
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SnackbarKt$OneRowSnackbar$3(pVar, pVar2, pVar3, p0Var, j, j2, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0113  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26289c(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r26, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, boolean r28, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r29, long r30, long r32, long r34, long r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r38, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r39, int r40, int r41) {
        /*
            r14 = r38
            r15 = r40
            r12 = r41
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1235788955(0xffffffffb6575b65, float:-3.2090695E-6)
            r1 = r39
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x001e
            r3 = r15 | 6
            r4 = r3
            r3 = r25
            goto L_0x0032
        L_0x001e:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x002f
            r3 = r25
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x002c
            r4 = 4
            goto L_0x002d
        L_0x002c:
            r4 = 2
        L_0x002d:
            r4 = r4 | r15
            goto L_0x0032
        L_0x002f:
            r3 = r25
            r4 = r15
        L_0x0032:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0039
            r4 = r4 | 48
            goto L_0x004c
        L_0x0039:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r26
            boolean r7 = r1.mo14927P(r6)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r4 = r4 | r7
            goto L_0x004e
        L_0x004c:
            r6 = r26
        L_0x004e:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0055
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r8 = r15 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0068
            r8 = r27
            boolean r9 = r1.mo14927P(r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r9
            goto L_0x006a
        L_0x0068:
            r8 = r27
        L_0x006a:
            r9 = r12 & 8
            if (r9 == 0) goto L_0x0071
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r10 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0084
            r10 = r28
            boolean r11 = r1.mo14961b(r10)
            if (r11 == 0) goto L_0x0080
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r4 = r4 | r11
            goto L_0x0086
        L_0x0084:
            r10 = r28
        L_0x0086:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r15
            if (r11 != 0) goto L_0x00a1
            r11 = r12 & 16
            if (r11 != 0) goto L_0x009b
            r11 = r29
            boolean r13 = r1.mo15006n0(r11)
            if (r13 == 0) goto L_0x009d
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r11 = r29
        L_0x009d:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r4 = r4 | r13
            goto L_0x00a3
        L_0x00a1:
            r11 = r29
        L_0x00a3:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r15
            if (r13 != 0) goto L_0x00bb
            r13 = r12 & 32
            r10 = r30
            if (r13 != 0) goto L_0x00b7
            boolean r13 = r1.mo14980g(r10)
            if (r13 == 0) goto L_0x00b7
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r4 = r4 | r13
            goto L_0x00bd
        L_0x00bb:
            r10 = r30
        L_0x00bd:
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r15
            if (r13 != 0) goto L_0x00d5
            r13 = r12 & 64
            r10 = r32
            if (r13 != 0) goto L_0x00d1
            boolean r13 = r1.mo14980g(r10)
            if (r13 == 0) goto L_0x00d1
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r4 = r4 | r13
            goto L_0x00d7
        L_0x00d5:
            r10 = r32
        L_0x00d7:
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r15
            if (r13 != 0) goto L_0x00ef
            r13 = r12 & 128(0x80, float:1.794E-43)
            r10 = r34
            if (r13 != 0) goto L_0x00eb
            boolean r13 = r1.mo14980g(r10)
            if (r13 == 0) goto L_0x00eb
            r13 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r13 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r4 = r4 | r13
            goto L_0x00f1
        L_0x00ef:
            r10 = r34
        L_0x00f1:
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r15
            if (r13 != 0) goto L_0x0109
            r13 = r12 & 256(0x100, float:3.59E-43)
            r10 = r36
            if (r13 != 0) goto L_0x0105
            boolean r13 = r1.mo14980g(r10)
            if (r13 == 0) goto L_0x0105
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0107
        L_0x0105:
            r13 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0107:
            r4 = r4 | r13
            goto L_0x010b
        L_0x0109:
            r10 = r36
        L_0x010b:
            r13 = r12 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0113
            r13 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0111:
            r4 = r4 | r13
            goto L_0x0124
        L_0x0113:
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            r13 = r13 & r15
            if (r13 != 0) goto L_0x0124
            boolean r13 = r1.mo14927P(r14)
            if (r13 == 0) goto L_0x0121
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0111
        L_0x0121:
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0111
        L_0x0124:
            r13 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r13 = r13 & r4
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r0) goto L_0x0145
            boolean r0 = r1.mo15011p()
            if (r0 != 0) goto L_0x0134
            goto L_0x0145
        L_0x0134:
            r1.mo14958a0()
            r4 = r28
            r5 = r29
            r19 = r32
            r2 = r6
            r12 = r10
            r6 = r30
            r10 = r34
            goto L_0x0265
        L_0x0145:
            r1.mo14930Q()
            r0 = r15 & 1
            r13 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r17 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0190
            boolean r0 = r1.mo14977f0()
            if (r0 == 0) goto L_0x0162
            goto L_0x0190
        L_0x0162:
            r1.mo14958a0()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x016b
            r4 = r4 & r20
        L_0x016b:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0171
            r4 = r4 & r19
        L_0x0171:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0177
            r4 = r4 & r18
        L_0x0177:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x017d
            r4 = r4 & r17
        L_0x017d:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0182
            r4 = r4 & r13
        L_0x0182:
            r5 = r29
            r19 = r32
            r21 = r34
            r0 = r3
            r2 = r8
            r3 = r28
            r8 = r30
            goto L_0x01ef
        L_0x0190:
            if (r2 == 0) goto L_0x0195
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0196
        L_0x0195:
            r0 = r3
        L_0x0196:
            r2 = 0
            if (r5 == 0) goto L_0x019a
            r6 = r2
        L_0x019a:
            if (r7 == 0) goto L_0x019d
            goto L_0x019e
        L_0x019d:
            r2 = r8
        L_0x019e:
            if (r9 == 0) goto L_0x01a2
            r3 = 0
            goto L_0x01a4
        L_0x01a2:
            r3 = r28
        L_0x01a4:
            r5 = r12 & 16
            r7 = 6
            if (r5 == 0) goto L_0x01b2
            androidx.compose.material3.r2 r5 = androidx.compose.material3.C8274r2.f20442a
            androidx.compose.ui.graphics.g4 r5 = r5.mo12958f(r1, r7)
            r4 = r4 & r20
            goto L_0x01b4
        L_0x01b2:
            r5 = r29
        L_0x01b4:
            r8 = r12 & 32
            if (r8 == 0) goto L_0x01c1
            androidx.compose.material3.r2 r8 = androidx.compose.material3.C8274r2.f20442a
            long r8 = r8.mo12955c(r1, r7)
            r4 = r4 & r19
            goto L_0x01c3
        L_0x01c1:
            r8 = r30
        L_0x01c3:
            r19 = r12 & 64
            if (r19 == 0) goto L_0x01d0
            androidx.compose.material3.r2 r13 = androidx.compose.material3.C8274r2.f20442a
            long r19 = r13.mo12956d(r1, r7)
            r4 = r4 & r18
            goto L_0x01d2
        L_0x01d0:
            r19 = r32
        L_0x01d2:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01df
            androidx.compose.material3.r2 r13 = androidx.compose.material3.C8274r2.f20442a
            long r21 = r13.mo12954b(r1, r7)
            r4 = r4 & r17
            goto L_0x01e1
        L_0x01df:
            r21 = r34
        L_0x01e1:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x01ef
            androidx.compose.material3.r2 r10 = androidx.compose.material3.C8274r2.f20442a
            long r10 = r10.mo12957e(r1, r7)
            r7 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = r4 & r7
        L_0x01ef:
            r1.mo14899E()
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x0201
            r7 = -1
            java.lang.String r13 = "androidx.compose.material3.Snackbar (Snackbar.kt:94)"
            r12 = -1235788955(0xffffffffb6575b65, float:-3.2090695E-6)
            androidx.compose.runtime.ComposerKt.m29845w0(r12, r4, r7, r13)
        L_0x0201:
            androidx.compose.material3.tokens.a1 r12 = androidx.compose.material3.tokens.C8288a1.f20706a
            float r12 = r12.mo13175g()
            androidx.compose.material3.SnackbarKt$Snackbar$1 r13 = new androidx.compose.material3.SnackbarKt$Snackbar$1
            r25 = r13
            r26 = r6
            r27 = r38
            r28 = r2
            r29 = r21
            r31 = r10
            r33 = r4
            r34 = r3
            r25.<init>(r26, r27, r28, r29, r31, r33, r34)
            r7 = -1829663446(0xffffffff92f18d2a, float:-1.5244038E-27)
            r39 = r2
            r2 = 1
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r7, r2, r13)
            r7 = 12779520(0xc30000, float:1.7907922E-38)
            r13 = r4 & 14
            r7 = r7 | r13
            int r4 = r4 >> 9
            r13 = r4 & 112(0x70, float:1.57E-43)
            r7 = r7 | r13
            r13 = r4 & 896(0x380, float:1.256E-42)
            r7 = r7 | r13
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r7
            r7 = 80
            r25 = r0
            r26 = r5
            r27 = r8
            r29 = r19
            r13 = 0
            r31 = r13
            r32 = r12
            r12 = 0
            r33 = r12
            r34 = r2
            r35 = r1
            r36 = r4
            r37 = r7
            androidx.compose.material3.SurfaceKt.m26352a(r25, r26, r27, r29, r31, r32, r33, r34, r35, r36, r37)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x025c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x025c:
            r4 = r3
            r2 = r6
            r6 = r8
            r12 = r10
            r10 = r21
            r8 = r39
            r3 = r0
        L_0x0265:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x026c
            goto L_0x0287
        L_0x026c:
            androidx.compose.material3.SnackbarKt$Snackbar$2 r1 = new androidx.compose.material3.SnackbarKt$Snackbar$2
            r0 = r1
            r23 = r1
            r1 = r3
            r3 = r8
            r24 = r9
            r8 = r19
            r14 = r38
            r15 = r40
            r16 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r14, r15, r16)
            r1 = r23
            r0 = r24
            r0.mo15202a(r1)
        L_0x0287:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m26289c(androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.p, boolean, androidx.compose.ui.graphics.g4, long, long, long, long, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011a  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26290d(@org.jetbrains.annotations.C12579k androidx.compose.material3.C8269q2 r39, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r40, boolean r41, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r42, long r43, long r45, long r47, long r49, long r51, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r53, int r54, int r55) {
        /*
            r1 = r39
            r15 = r54
            r13 = r55
            java.lang.String r0 = "snackbarData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 274621471(0x105e641f, float:4.385891E-29)
            r2 = r53
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r15 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r15
            goto L_0x002b
        L_0x002a:
            r3 = r15
        L_0x002b:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r40
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
            r5 = r40
        L_0x0047:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r15 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r41
            boolean r8 = r2.mo14961b(r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r41
        L_0x0063:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007c
            r8 = r13 & 8
            if (r8 != 0) goto L_0x0076
            r8 = r42
            boolean r9 = r2.mo15006n0(r8)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r8 = r42
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r3 = r3 | r9
            goto L_0x007e
        L_0x007c:
            r8 = r42
        L_0x007e:
            r9 = 57344(0xe000, float:8.0356E-41)
            r10 = r15 & r9
            if (r10 != 0) goto L_0x009a
            r10 = r13 & 16
            if (r10 != 0) goto L_0x0094
            r10 = r43
            boolean r12 = r2.mo14980g(r10)
            if (r12 == 0) goto L_0x0096
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0094:
            r10 = r43
        L_0x0096:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r12
            goto L_0x009c
        L_0x009a:
            r10 = r43
        L_0x009c:
            r12 = 458752(0x70000, float:6.42848E-40)
            r14 = r15 & r12
            if (r14 != 0) goto L_0x00b5
            r14 = r13 & 32
            r9 = r45
            if (r14 != 0) goto L_0x00b1
            boolean r11 = r2.mo14980g(r9)
            if (r11 == 0) goto L_0x00b1
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r3 = r3 | r11
            goto L_0x00b7
        L_0x00b5:
            r9 = r45
        L_0x00b7:
            r11 = 3670016(0x380000, float:5.142788E-39)
            r14 = r15 & r11
            if (r14 != 0) goto L_0x00d1
            r14 = r13 & 64
            r11 = r47
            if (r14 != 0) goto L_0x00cc
            boolean r16 = r2.mo14980g(r11)
            if (r16 == 0) goto L_0x00cc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r16
            goto L_0x00d3
        L_0x00d1:
            r11 = r47
        L_0x00d3:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r15 & r18
            if (r16 != 0) goto L_0x00ed
            r14 = r13 & 128(0x80, float:1.794E-43)
            r0 = r49
            if (r14 != 0) goto L_0x00e8
            boolean r16 = r2.mo14980g(r0)
            if (r16 == 0) goto L_0x00e8
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r3 = r3 | r16
            goto L_0x00ef
        L_0x00ed:
            r0 = r49
        L_0x00ef:
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r15 & r20
            if (r16 != 0) goto L_0x0108
            r14 = r13 & 256(0x100, float:3.59E-43)
            r0 = r51
            if (r14 != 0) goto L_0x0104
            boolean r14 = r2.mo14980g(r0)
            if (r14 == 0) goto L_0x0104
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0104:
            r14 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r3 = r3 | r14
            goto L_0x010a
        L_0x0108:
            r0 = r51
        L_0x010a:
            r14 = 191739611(0xb6db6db, float:4.5782105E-32)
            r14 = r14 & r3
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r14 != r0) goto L_0x0129
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x011a
            goto L_0x0129
        L_0x011a:
            r2.mo14958a0()
            r6 = r39
            r33 = r49
            r35 = r51
            r3 = r7
            r4 = r8
            r7 = r43
            goto L_0x028c
        L_0x0129:
            r2.mo14930Q()
            r0 = r15 & 1
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r14 = -3670017(0xffffffffffc7ffff, float:NaN)
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r22 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0175
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x0143
            goto L_0x0175
        L_0x0143:
            r2.mo14958a0()
            r0 = r13 & 8
            if (r0 == 0) goto L_0x014c
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x014c:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0152
            r3 = r3 & r22
        L_0x0152:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0158
            r3 = r3 & r21
        L_0x0158:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x015d
            r3 = r3 & r14
        L_0x015d:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0162
            r3 = r3 & r1
        L_0x0162:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x016a
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r0
        L_0x016a:
            r33 = r49
            r35 = r51
            r0 = r5
            r4 = r7
            r5 = r8
            r7 = r43
            goto L_0x01db
        L_0x0175:
            if (r4 == 0) goto L_0x017a
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x017b
        L_0x017a:
            r0 = r5
        L_0x017b:
            if (r6 == 0) goto L_0x017f
            r4 = 0
            goto L_0x0180
        L_0x017f:
            r4 = r7
        L_0x0180:
            r5 = r13 & 8
            r6 = 6
            if (r5 == 0) goto L_0x018e
            androidx.compose.material3.r2 r5 = androidx.compose.material3.C8274r2.f20442a
            androidx.compose.ui.graphics.g4 r5 = r5.mo12958f(r2, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x018f
        L_0x018e:
            r5 = r8
        L_0x018f:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x019c
            androidx.compose.material3.r2 r7 = androidx.compose.material3.C8274r2.f20442a
            long r7 = r7.mo12955c(r2, r6)
            r3 = r3 & r22
            goto L_0x019e
        L_0x019c:
            r7 = r43
        L_0x019e:
            r22 = r13 & 32
            if (r22 == 0) goto L_0x01aa
            androidx.compose.material3.r2 r9 = androidx.compose.material3.C8274r2.f20442a
            long r9 = r9.mo12956d(r2, r6)
            r3 = r3 & r21
        L_0x01aa:
            r21 = r13 & 64
            if (r21 == 0) goto L_0x01b5
            androidx.compose.material3.r2 r11 = androidx.compose.material3.C8274r2.f20442a
            long r11 = r11.mo12953a(r2, r6)
            r3 = r3 & r14
        L_0x01b5:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x01c2
            androidx.compose.material3.r2 r14 = androidx.compose.material3.C8274r2.f20442a
            long r21 = r14.mo12954b(r2, r6)
            r1 = r1 & r3
            r3 = r1
            goto L_0x01c4
        L_0x01c2:
            r21 = r49
        L_0x01c4:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x01d7
            androidx.compose.material3.r2 r1 = androidx.compose.material3.C8274r2.f20442a
            long r23 = r1.mo12957e(r2, r6)
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r1
            r33 = r21
            r35 = r23
            goto L_0x01db
        L_0x01d7:
            r35 = r51
            r33 = r21
        L_0x01db:
            r2.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01ed
            r1 = -1
            java.lang.String r6 = "androidx.compose.material3.Snackbar (Snackbar.kt:197)"
            r14 = 274621471(0x105e641f, float:4.385891E-29)
            androidx.compose.runtime.ComposerKt.m29845w0(r14, r3, r1, r6)
        L_0x01ed:
            androidx.compose.material3.s2 r1 = r39.mo11946a()
            java.lang.String r1 = r1.mo11951a()
            r6 = 1
            if (r1 == 0) goto L_0x020f
            androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1 r14 = new androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
            r40 = r14
            r41 = r11
            r43 = r3
            r44 = r39
            r45 = r1
            r40.<init>(r41, r43, r44, r45)
            r1 = -1378313599(0xffffffffadd89a81, float:-2.462497E-11)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r1, r6, r14)
            goto L_0x0210
        L_0x020f:
            r1 = 0
        L_0x0210:
            androidx.compose.material3.s2 r14 = r39.mo11946a()
            boolean r14 = r14.mo11952b()
            if (r14 == 0) goto L_0x022c
            androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1 r14 = new androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
            r6 = r39
            r14.<init>(r6, r3)
            r41 = r11
            r11 = -1812633777(0xffffffff93f5674f, float:-6.1948565E-27)
            r12 = 1
            androidx.compose.runtime.internal.a r11 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r11, r12, r14)
            goto L_0x0231
        L_0x022c:
            r6 = r39
            r41 = r11
            r11 = 0
        L_0x0231:
            r12 = 12
            float r12 = (float) r12
            float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r12)
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r12)
            androidx.compose.material3.SnackbarKt$Snackbar$3 r12 = new androidx.compose.material3.SnackbarKt$Snackbar$3
            r12.<init>(r6)
            r14 = -1266389126(0xffffffffb4846f7a, float:-2.4668026E-7)
            r43 = r0
            r0 = 1
            androidx.compose.runtime.internal.a r29 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r14, r0, r12)
            int r0 = r3 << 3
            r12 = r0 & 7168(0x1c00, float:1.0045E-41)
            r14 = 805306368(0x30000000, float:4.656613E-10)
            r12 = r12 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r0
            r12 = r12 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r0
            r12 = r12 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r14
            r0 = r0 | r12
            r12 = r3 & r18
            r0 = r0 | r12
            r3 = r3 & r20
            r31 = r0 | r3
            r32 = 0
            r17 = r1
            r18 = r11
            r19 = r4
            r20 = r5
            r21 = r7
            r23 = r9
            r25 = r33
            r27 = r35
            r30 = r2
            m26289c(r16, r17, r18, r19, r20, r21, r23, r25, r27, r29, r30, r31, r32)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0286
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0286:
            r11 = r41
            r3 = r4
            r4 = r5
            r5 = r43
        L_0x028c:
            androidx.compose.runtime.t1 r14 = r2.mo15020s()
            if (r14 != 0) goto L_0x0293
            goto L_0x02b3
        L_0x0293:
            androidx.compose.material3.SnackbarKt$Snackbar$4 r2 = new androidx.compose.material3.SnackbarKt$Snackbar$4
            r0 = r2
            r1 = r39
            r6 = r2
            r2 = r5
            r37 = r6
            r5 = r7
            r7 = r9
            r9 = r11
            r11 = r33
            r38 = r14
            r13 = r35
            r15 = r54
            r16 = r55
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r13, r15, r16)
            r1 = r37
            r0 = r38
            r0.mo15202a(r1)
        L_0x02b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m26290d(androidx.compose.material3.q2, androidx.compose.ui.m, boolean, androidx.compose.ui.graphics.g4, long, long, long, long, long, androidx.compose.runtime.o, int, int):void");
    }
}
