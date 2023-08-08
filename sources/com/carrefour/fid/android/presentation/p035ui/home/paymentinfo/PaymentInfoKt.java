package com.carrefour.fid.android.presentation.p035ui.home.paymentinfo;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
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
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPaymentInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentInfo.kt\ncom/carrefour/fid/android/presentation/ui/home/paymentinfo/PaymentInfoKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,166:1\n154#2:167\n154#2:168\n154#2:169\n154#2:210\n154#2:274\n154#2:275\n154#2:293\n154#2:323\n154#2:324\n154#2:325\n154#2:326\n154#2:327\n154#2:328\n154#2:363\n154#2:364\n154#2:365\n154#2:366\n154#2:367\n36#3:170\n460#3,13:196\n460#3,13:226\n460#3,13:260\n473#3,3:276\n36#3:281\n473#3,3:288\n460#3,13:309\n473#3,3:329\n460#3,13:349\n473#3,3:368\n473#3,3:373\n1114#4,6:171\n1114#4,6:282\n74#5,6:177\n80#5:209\n84#5:377\n75#6:183\n76#6,11:185\n75#6:213\n76#6,11:215\n75#6:247\n76#6,11:249\n89#6:279\n89#6:291\n75#6:296\n76#6,11:298\n89#6:332\n75#6:336\n76#6,11:338\n89#6:371\n89#6:376\n76#7:184\n76#7:214\n76#7:248\n76#7:297\n76#7:337\n79#8,2:211\n81#8:239\n74#8,7:240\n81#8:273\n85#8:280\n85#8:292\n79#8,2:294\n81#8:322\n85#8:333\n79#8,2:334\n81#8:362\n85#8:372\n*S KotlinDebug\n*F\n+ 1 PaymentInfo.kt\ncom/carrefour/fid/android/presentation/ui/home/paymentinfo/PaymentInfoKt\n*L\n34#1:167\n44#1:168\n47#1:169\n53#1:210\n61#1:274\n66#1:275\n84#1:293\n89#1:323\n94#1:324\n99#1:325\n104#1:326\n109#1:327\n114#1:328\n127#1:363\n132#1:364\n137#1:365\n142#1:366\n147#1:367\n48#1:170\n42#1:196,13\n52#1:226,13\n57#1:260,13\n57#1:276,3\n73#1:281\n52#1:288,3\n81#1:309,13\n81#1:329,3\n119#1:349,13\n119#1:368,3\n42#1:373,3\n48#1:171,6\n73#1:282,6\n42#1:177,6\n42#1:209\n42#1:377\n42#1:183\n42#1:185,11\n52#1:213\n52#1:215,11\n57#1:247\n57#1:249,11\n57#1:279\n52#1:291\n81#1:296\n81#1:298,11\n81#1:332\n119#1:336\n119#1:338,11\n119#1:371\n42#1:376\n42#1:184\n52#1:214\n57#1:248\n81#1:297\n119#1:337\n52#1:211,2\n52#1:239\n57#1:240,7\n57#1:273\n57#1:280\n52#1:292\n81#1:294,2\n81#1:322\n81#1:333\n119#1:334,2\n119#1:362\n119#1:372\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.paymentinfo.PaymentInfoKt */
public final class PaymentInfoKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m106526a(@C12580l C8767m mVar, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m mVar3;
        int i4;
        int i5;
        C11289a<C11079d2> aVar2 = aVar;
        int i6 = i;
        int i7 = i2;
        Intrinsics.checkNotNullParameter(aVar2, "onLearnMoreButtonClick");
        C8592o o = oVar.mo15009o(-1587062990);
        int i8 = i7 & 1;
        if (i8 != 0) {
            i3 = i6 | 6;
            mVar2 = mVar;
        } else if ((i6 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i6;
        } else {
            mVar2 = mVar;
            i3 = i6;
        }
        if ((i7 & 2) != 0) {
            i3 |= 48;
        } else if ((i6 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i8 != 0) {
                mVar3 = PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16));
            } else {
                mVar3 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1587062990, i6, -1, "com.carrefour.fid.android.presentation.ui.home.paymentinfo.PaymentInfo (PaymentInfo.kt:32)");
            }
            String d = C16018i.m71858d(R.string.accessibility_payment_methods, o, 0);
            String d2 = C16018i.m71858d(R.string.accessibility_open_learn_more_page, o, 0);
            C8767m n = SizeKt.m10114n(C8744d.m32514a(mVar3, C2694o.m12166h(C16483g.m74435M((float) 8))), 0.0f, 1, (Object) null);
            C37475b bVar = C37475b.f94185a;
            float f = (float) 16;
            C8767m k = PaddingKt.m10024k(BackgroundKt.m8825d(n, bVar.mo114208E(), (C15218g4) null, 2, (Object) null), C16483g.m74435M(f));
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(d);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new PaymentInfoKt$PaymentInfo$1$1(d);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8767m c = SemanticsModifierKt.m71868c(k, false, (C11300l) N, 1, (Object) null);
            o.mo14918M(-483455358);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2279l r = arrangement.mo7631r();
            C8734c.C8735a aVar3 = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(r, aVar3.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(c);
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
            C8767m.C8768a aVar4 = C8767m.f23478j;
            C8767m o2 = PaddingKt.m10028o(SizeKt.m10114n(aVar4, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, C16483g.m74435M(f), 7, (Object) null);
            Arrangement.C2271e l = arrangement.mo7628l();
            C8734c.C8737c q = aVar3.mo17070q();
            String str = d2;
            o.mo14918M(693286680);
            C15560f0 d3 = RowKt.m10071d(l, q, o, 54);
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
            Updater.m30188j(b3, d3, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            o.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C8734c.C8737c q2 = aVar3.mo17070q();
            o.mo14918M(693286680);
            C15560f0 d4 = RowKt.m10071d(arrangement.mo7630p(), q2, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(aVar4);
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
            Updater.m30188j(b4, d4, companion.mo44588d());
            Updater.m30188j(b4, dVar3, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b4, c4Var3, companion.mo44590f());
            o.mo14972e();
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_ic_lock_1, o, 0), (String) null, SizeKt.m10087C(aVar4, C16483g.m74435M(f)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 440, 120);
            C8767m o3 = PaddingKt.m10028o(aVar4, C16483g.m74435M((float) 5), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            C7933t0 t0Var = C7933t0.f19075a;
            int i9 = C7933t0.f19076b;
            TextKt.m14196c(C16018i.m71858d(R.string.home_payment_info_secured, o, 0), o3, bVar.mo114257y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(o, i9).mo11098k(), o, 48, 0, 65528);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            C8767m.C8768a aVar5 = aVar4;
            int i10 = i9;
            String str2 = str;
            C8767m mVar4 = mVar3;
            C7933t0 t0Var2 = t0Var;
            C8592o oVar3 = o;
            C8767m e = ClickableKt.m8878e(aVar4, false, (String) null, (C16031g) null, aVar, 7, (Object) null);
            oVar3.mo14918M(1157296644);
            boolean n02 = oVar3.mo15006n0(str2);
            Object N2 = oVar3.mo14921N();
            if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                N2 = new PaymentInfoKt$PaymentInfo$2$1$2$1(str2);
                oVar3.mo14893C(N2);
            }
            oVar3.mo15002m0();
            C8767m c2 = SemanticsModifierKt.m71868c(e, false, (C11300l) N2, 1, (Object) null);
            oVar2 = oVar3;
            C8767m.C8768a aVar6 = aVar5;
            TextKt.m14196c(C16018i.m71858d(R.string.learn_more, oVar3, 0), c2, bVar.mo114218O(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153896h(t0Var2.mo11077c(oVar3, i10)), oVar2, 0, 0, 65528);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            C8767m o4 = PaddingKt.m10028o(SizeKt.m10114n(aVar6, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, C16483g.m74435M((float) 10), 7, (Object) null);
            Arrangement.C2271e l2 = arrangement.mo7628l();
            C8734c.C8737c q3 = aVar3.mo17070q();
            oVar2.mo14918M(693286680);
            C15560f0 d5 = RowKt.m10071d(l2, q3, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar4 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection4 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var4 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a4 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(o4);
            if (!(oVar2.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar2.mo14938T();
            if (oVar2.mo14997l()) {
                oVar2.mo14947W(a4);
            } else {
                oVar2.mo14888A();
            }
            oVar2.mo14941U();
            C8592o b5 = Updater.m30180b(oVar2);
            Updater.m30188j(b5, d5, companion.mo44588d());
            Updater.m30188j(b5, dVar4, companion.mo44586b());
            Updater.m30188j(b5, layoutDirection4, companion.mo44587c());
            Updater.m30188j(b5, c4Var4, companion.mo44590f());
            oVar2.mo14972e();
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar2)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            float f6 = (float) 24;
            float f7 = f6;
            C8592o oVar4 = oVar2;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_credit_card, oVar2, 0), (String) null, SizeKt.m10115o(aVar6, C16483g.m74435M(f6)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar4, 440, 120);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_visa, oVar2, 0), (String) null, SizeKt.m10115o(aVar6, C16483g.m74435M(f7)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar4, 440, 120);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_master_card, oVar2, 0), (String) null, SizeKt.m10115o(aVar6, C16483g.m74435M(f7)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar4, 440, 120);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_american_express, oVar2, 0), (String) null, SizeKt.m10115o(aVar6, C16483g.m74435M(f7)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar4, 440, 120);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_horizontal_blue_pass_card, oVar2, 0), (String) null, SizeKt.m10115o(aVar6, C16483g.m74435M(f7)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar4, 440, 120);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_4x_cb, oVar2, 0), (String) null, SizeKt.m10115o(aVar6, C16483g.m74435M((float) 20)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar4, 440, 120);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            C8767m m = PaddingKt.m10026m(SizeKt.m10114n(aVar6, 0.0f, 1, (Object) null), 0.0f, 0.0f, 3, (Object) null);
            Arrangement.C2271e l3 = arrangement.mo7628l();
            C8734c.C8737c q4 = aVar3.mo17070q();
            oVar2.mo14918M(693286680);
            C15560f0 d6 = RowKt.m10071d(l3, q4, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar5 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection5 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var5 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a5 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f8 = LayoutKt.m68908f(m);
            if (!(oVar2.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar2.mo14938T();
            if (oVar2.mo14997l()) {
                oVar2.mo14947W(a5);
            } else {
                oVar2.mo14888A();
            }
            oVar2.mo14941U();
            C8592o b6 = Updater.m30180b(oVar2);
            Updater.m30188j(b6, d6, companion.mo44588d());
            Updater.m30188j(b6, dVar5, companion.mo44586b());
            Updater.m30188j(b6, layoutDirection5, companion.mo44587c());
            Updater.m30188j(b6, c4Var5, companion.mo44590f());
            oVar2.mo14972e();
            f8.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar2)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            C8592o oVar5 = oVar2;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_paypal, oVar2, 0), (String) null, SizeKt.m10115o(aVar6, C16483g.m74435M((float) 30)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar5, 440, 120);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_gift_card_1, oVar2, 0), (String) null, SizeKt.m10115o(aVar6, C16483g.m74435M(f7)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar5, 440, 120);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_gift_card_2, oVar2, 0), (String) null, SizeKt.m10115o(aVar6, C16483g.m74435M(f7)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar5, 440, 120);
            float f9 = (float) 22;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_carrefour_gift_card, oVar2, 0), (String) null, SizeKt.m10092H(aVar6, C16483g.m74435M(f9)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar5, 440, 120);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_gr_every_wish, oVar2, 0), (String) null, SizeKt.m10092H(aVar6, C16483g.m74435M(f9)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar5, 440, 120);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = mVar4;
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new PaymentInfoKt$PaymentInfo$3(mVar2, aVar2, i6, i7));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m106527b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1818461869);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1818461869, i, -1, "com.carrefour.fid.android.presentation.ui.home.paymentinfo.PaymentInfoPreview (PaymentInfo.kt:156)");
            }
            ThemeKt.m153788a(ComposableSingletons$PaymentInfoKt.f60493a.mo70783a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PaymentInfoKt$PaymentInfoPreview$1(i));
        }
    }
}
