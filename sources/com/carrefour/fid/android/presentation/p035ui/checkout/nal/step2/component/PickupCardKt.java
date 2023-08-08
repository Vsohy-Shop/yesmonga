package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.C3046h;
import androidx.compose.material.C7870j;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
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
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
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
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.shared.extension.StringKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPickupCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickupCard.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/PickupCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,218:1\n154#2:219\n154#2:220\n154#2:287\n154#2:288\n154#2:289\n154#2:295\n154#2:330\n154#2:331\n154#2:332\n154#2:333\n154#2:339\n74#3,6:221\n80#3:253\n84#3:381\n75#4:227\n76#4,11:229\n75#4:260\n76#4,11:262\n89#4:293\n75#4:303\n76#4,11:305\n89#4:337\n75#4:345\n76#4,11:347\n89#4:375\n89#4:380\n76#5:228\n76#5:261\n76#5:304\n76#5:346\n460#6,13:240\n460#6,13:273\n473#6,3:290\n460#6,13:316\n473#6,3:334\n460#6,13:358\n473#6,3:372\n473#6,3:377\n75#7,6:254\n81#7:286\n85#7:294\n74#7,7:296\n81#7:329\n85#7:338\n76#7,5:340\n81#7:371\n85#7:376\n*S KotlinDebug\n*F\n+ 1 PickupCard.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/PickupCardKt\n*L\n53#1:219\n55#1:220\n66#1:287\n67#1:288\n75#1:289\n88#1:295\n107#1:330\n111#1:331\n113#1:332\n117#1:333\n132#1:339\n51#1:221,6\n51#1:253\n51#1:381\n51#1:227\n51#1:229,11\n57#1:260\n57#1:262,11\n57#1:293\n101#1:303\n101#1:305,11\n101#1:337\n128#1:345\n128#1:347,11\n128#1:375\n51#1:380\n51#1:228\n57#1:261\n101#1:304\n128#1:346\n51#1:240,13\n57#1:273,13\n57#1:290,3\n101#1:316,13\n101#1:334,3\n128#1:358,13\n128#1:372,3\n51#1:377,3\n57#1:254,6\n57#1:286\n57#1:294\n101#1:296,7\n101#1:329\n101#1:338\n128#1:340,5\n128#1:371\n128#1:376\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupCardKt */
public final class PickupCardKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m105037a(@C12580l C8767m mVar, @C12579k C38080a aVar, @C12580l String str, @C12580l C11300l<? super C38080a, C11079d2> lVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        C11300l<? super C38080a, C11079d2> lVar2;
        PickupCardKt$PickupCard$2 pickupCardKt$PickupCard$2;
        RowScopeInstance rowScopeInstance;
        C8767m.C8768a aVar3;
        C38080a aVar4 = aVar;
        String str2 = str;
        int i3 = i;
        Intrinsics.checkNotNullParameter(aVar4, "pickupPoint");
        C8592o o = oVar.mo15009o(-744328507);
        if ((i2 & 1) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i2 & 8) != 0) {
            lVar2 = PickupCardKt$PickupCard$1.f59691f;
        } else {
            lVar2 = lVar;
        }
        if ((i2 & 16) != 0) {
            pickupCardKt$PickupCard$2 = PickupCardKt$PickupCard$2.f59692f;
        } else {
            pickupCardKt$PickupCard$2 = aVar2;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-744328507, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupCard (PickupCard.kt:43)");
        }
        float f = (float) 8;
        C8767m k = PaddingKt.m10024k(BackgroundKt.m8825d(C8744d.m32514a(mVar2, C2694o.m12166h(C16483g.m74435M(f))), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 16));
        o.mo14918M(-483455358);
        Arrangement arrangement = Arrangement.f6010a;
        Arrangement.C2279l r = arrangement.mo7631r();
        C8734c.C8735a aVar5 = C8734c.f23406a;
        C15560f0 b = ColumnKt.m9863b(r, aVar5.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(k);
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
        C8767m.C8768a aVar6 = C8767m.f23478j;
        C8767m n = SizeKt.m10114n(aVar6, 0.0f, 1, (Object) null);
        C8734c.C8737c q = aVar5.mo17070q();
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(arrangement.mo7630p(), q, o, 48);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(n);
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
        Updater.m30188j(b3, d, companion.mo44588d());
        Updater.m30188j(b3, dVar2, companion.mo44586b());
        Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
        Updater.m30188j(b3, c4Var2, companion.mo44590f());
        o.mo14972e();
        f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6147a;
        o.mo14918M(425236100);
        if (aVar.mo118295v()) {
            aVar3 = aVar6;
            rowScopeInstance = rowScopeInstance2;
            ImageKt.m8967b(C16015f.m71849d(m105041e(aVar.mo118290r()), o, 0), "carrefour pictogram", SizeKt.m10087C(PaddingKt.m10028o(aVar6, 0.0f, 0.0f, C16483g.m74435M(f), 0.0f, 11, (Object) null), C16483g.m74435M((float) 24)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 440, 120);
        } else {
            aVar3 = aVar6;
            rowScopeInstance = rowScopeInstance2;
        }
        o.mo15002m0();
        String r2 = aVar.mo118290r();
        C8767m.C8768a aVar7 = aVar3;
        C8767m o2 = PaddingKt.m10028o(rowScopeInstance.mo7842b(aVar7, 1.0f, true), 0.0f, 0.0f, C16483g.m74435M(f), 0.0f, 11, (Object) null);
        int c = C16449r.f40760b.mo47727c();
        C37475b bVar = C37475b.f94185a;
        long B = bVar.mo114205B();
        C7933t0 t0Var = C7933t0.f19075a;
        int i4 = C7933t0.f19076b;
        C8767m.C8768a aVar8 = aVar7;
        C8592o oVar2 = o;
        TextKt.m14196c(r2, o2, B, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, c, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(o, i4).mo11098k(), oVar2, 0, 3120, 55288);
        int i5 = i4;
        C7933t0 t0Var2 = t0Var;
        int i6 = i5;
        C7933t0 t0Var3 = t0Var2;
        TextKt.m14196c(StringKt.m118929i(String.valueOf(((float) Math.rint((double) (aVar.mo118287o() / ((float) 100)))) / ((float) 10))) + "km", (C8767m) null, bVar.mo114205B(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153900l(t0Var2.mo11077c(o, i5)), oVar2, 0, 3072, 57338);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        C8767m.C8768a aVar9 = aVar8;
        C2428y0.m10726a(SizeKt.m10115o(aVar9, C16483g.m74435M((float) 11)), o, 6);
        String m = aVar.mo118285m();
        C37474a aVar10 = C37474a.f94133a;
        C8767m.C8768a aVar11 = aVar9;
        TextKt.m14196c(m, (C8767m) null, bVar.mo114257y(), aVar10.mo114185h(), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, 0, 0, 131058);
        TextKt.m14196c(aVar.mo118286n(), (C8767m) null, bVar.mo114257y(), aVar10.mo114185h(), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, 0, 0, 131058);
        C2428y0.m10726a(C2373k.m10461c(columnScopeInstance, aVar11, 1.0f, false, 2, (Object) null), o, 0);
        if (str2 != null) {
            o.mo14918M(507805716);
            String str3 = C16018i.m71858d(R.string.pickup_map_fees, o, 0) + " : " + StringKt.m118910S(str2, (String) null, 1, (Object) null);
            long h = aVar10.mo114185h();
            C16209i0 i0Var = r10;
            C16209i0 i0Var2 = new C16209i0(700);
            TextKt.m14196c(str3, (C8767m) null, bVar.mo114257y(), h, (C16190e0) null, i0Var, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, o, C20022q.C20025c.f51280k, 0, 131026);
            o.mo15002m0();
        } else {
            o.mo14918M(507805974);
            C8734c.C8737c q2 = aVar5.mo17070q();
            o.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(arrangement.mo7630p(), q2, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(aVar11);
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
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            C8592o oVar3 = o;
            TextKt.m14196c(C16018i.m71858d(R.string.pickup_map_in_store_pick, o, 0), (C8767m) null, bVar.mo114257y(), aVar10.mo114185h(), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar3, 0, 0, 131058);
            C8767m.C8768a aVar12 = aVar11;
            C2428y0.m10726a(SizeKt.m10092H(aVar12, C16483g.m74435M((float) 6)), o, 6);
            String d3 = C16018i.m71858d(R.string.free, o, 0);
            C8767m m2 = PaddingKt.m10026m(BorderKt.m8850f(SizeKt.m10115o(aVar12, C16483g.m74435M((float) 18)), C2250j.m9695a(C16483g.m74435M((float) 1), bVar.mo114223T()), C2694o.m12159a(50.0f)), C16483g.m74435M((float) 5), 0.0f, 2, (Object) null);
            long T = bVar.mo114223T();
            C16209i0 i0Var3 = r15;
            C16209i0 i0Var4 = new C16209i0(700);
            TextKt.m14196c(d3, m2, T, 0, (C16190e0) null, i0Var3, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var3.mo11077c(o, i6).mo11099l(), oVar3, C20022q.C20025c.f51280k, 0, DefaultImageHeaderParser.f57417e);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            o.mo15002m0();
        }
        C2428y0.m10726a(C2373k.m10461c(columnScopeInstance, aVar11, 1.0f, false, 2, (Object) null), o, 0);
        Arrangement.C2271e l = arrangement.mo7628l();
        C8767m o3 = SizeKt.m10115o(SizeKt.m10114n(aVar11, 0.0f, 1, (Object) null), C16483g.m74435M((float) 36));
        o.mo14918M(693286680);
        C15560f0 d4 = RowKt.m10071d(l, aVar5.mo17073w(), o, 6);
        o.mo14918M(-1323940314);
        C16479d dVar4 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection4 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var4 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a4 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(o3);
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
        Updater.m30188j(b5, d4, companion.mo44588d());
        Updater.m30188j(b5, dVar4, companion.mo44586b());
        Updater.m30188j(b5, layoutDirection4, companion.mo44587c());
        Updater.m30188j(b5, c4Var4, companion.mo44590f());
        o.mo14972e();
        f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        PickupCardKt$PickupCard$3$3$1 pickupCardKt$PickupCard$3$3$1 = new PickupCardKt$PickupCard$3$3$1(lVar2, aVar4);
        ComposableSingletons$PickupCardKt composableSingletons$PickupCardKt = ComposableSingletons$PickupCardKt.f59634a;
        C8592o oVar4 = o;
        ButtonKt.m13343a(pickupCardKt$PickupCard$3$3$1, (C8767m) null, false, (C2243g) null, (C7870j) null, (C15218g4) null, (C2223i) null, (C3046h) null, (C2366i0) null, composableSingletons$PickupCardKt.mo69246a(), oVar4, 805306368, C16717v.C16724g.f42314r);
        ButtonKt.m13346d(pickupCardKt$PickupCard$2, (C8767m) null, false, (C2243g) null, (C7870j) null, (C15218g4) null, (C2223i) null, (C3046h) null, (C2366i0) null, composableSingletons$PickupCardKt.mo69247b(), oVar4, ((i3 >> 12) & 14) | 805306368, C16717v.C16724g.f42314r);
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
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PickupCardKt$PickupCard$4(mVar2, aVar, str, lVar2, pickupCardKt$PickupCard$2, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m105038b(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1327581864);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1327581864, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupCardFreePreview (PickupCard.kt:204)");
            }
            ThemeKt.m153788a(ComposableSingletons$PickupCardKt.f59634a.mo69250e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PickupCardKt$PickupCardFreePreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m105039c(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(2135260474);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2135260474, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupCardNotCarrefourPreview (PickupCard.kt:188)");
            }
            ThemeKt.m153788a(ComposableSingletons$PickupCardKt.f59634a.mo69249d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PickupCardKt$PickupCardNotCarrefourPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m105040d(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1302394804);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1302394804, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupCardPreview (PickupCard.kt:172)");
            }
            ThemeKt.m153788a(ComposableSingletons$PickupCardKt.f59634a.mo69248c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PickupCardKt$PickupCardPreview$1(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        return com.carrefour.fid.android.R.drawable.ic_crf_express_logo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        return com.carrefour.fid.android.R.drawable.ic_crf_market_logo;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m105041e(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = 2131231438(0x7f0802ce, float:1.8078957E38)
            switch(r0) {
                case -2027976644: goto L_0x0074;
                case -1162676091: goto L_0x0067;
                case -1033870472: goto L_0x005a;
                case -734094995: goto L_0x0051;
                case -117562718: goto L_0x0048;
                case 65768: goto L_0x003b;
                case 780456706: goto L_0x002e;
                case 1300366525: goto L_0x0025;
                case 1673062174: goto L_0x0016;
                case 1773813039: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0081
        L_0x000c:
            java.lang.String r0 = "CARREFOUR MARKET"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x007d
            goto L_0x0081
        L_0x0016:
            java.lang.String r0 = "CARREFOUR CITY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0020
            goto L_0x0081
        L_0x0020:
            r1 = 2131231437(0x7f0802cd, float:1.8078955E38)
            goto L_0x0084
        L_0x0025:
            java.lang.String r0 = "CARREFOUR EXPRESS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0070
            goto L_0x0081
        L_0x002e:
            java.lang.String r0 = "BON APP"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0037
            goto L_0x0081
        L_0x0037:
            r1 = 2131231436(0x7f0802cc, float:1.8078953E38)
            goto L_0x0084
        L_0x003b:
            java.lang.String r0 = "BIO"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0044
            goto L_0x0081
        L_0x0044:
            r1 = 2131231435(0x7f0802cb, float:1.807895E38)
            goto L_0x0084
        L_0x0048:
            java.lang.String r0 = "CONTACT MARCHE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0084
            goto L_0x0081
        L_0x0051:
            java.lang.String r0 = "CARREFOUR CONTACT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0084
            goto L_0x0081
        L_0x005a:
            java.lang.String r0 = "CARREFOUR MONTAGNE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0063
            goto L_0x0081
        L_0x0063:
            r1 = 2131231443(0x7f0802d3, float:1.8078967E38)
            goto L_0x0084
        L_0x0067:
            java.lang.String r0 = "CORNER EXPRESS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0070
            goto L_0x0081
        L_0x0070:
            r1 = 2131231441(0x7f0802d1, float:1.8078963E38)
            goto L_0x0084
        L_0x0074:
            java.lang.String r0 = "MARKET"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x007d
            goto L_0x0081
        L_0x007d:
            r1 = 2131231442(0x7f0802d2, float:1.8078965E38)
            goto L_0x0084
        L_0x0081:
            r1 = 2131231517(0x7f08031d, float:1.8079117E38)
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.PickupCardKt.m105041e(java.lang.String):int");
    }
}
