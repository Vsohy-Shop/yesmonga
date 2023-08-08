package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
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
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nConsentBagInnerDescriptionComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentBagInnerDescriptionComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/component/ConsentBagInnerDescriptionComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,142:1\n154#2:143\n154#2:177\n154#2:178\n154#2:179\n154#2:180\n154#2:181\n154#2:220\n154#2:221\n154#2:222\n154#2:260\n154#2:266\n154#2:267\n74#3,6:144\n80#3:176\n84#3:186\n74#3,6:187\n80#3:219\n84#3:227\n75#4:150\n76#4,11:152\n89#4:185\n75#4:193\n76#4,11:195\n89#4:226\n75#4:233\n76#4,11:235\n89#4:264\n76#5:151\n76#5:194\n76#5:234\n460#6,13:163\n473#6,3:182\n460#6,13:206\n473#6,3:223\n460#6,13:246\n473#6,3:261\n76#7,5:228\n81#7:259\n85#7:265\n*S KotlinDebug\n*F\n+ 1 ConsentBagInnerDescriptionComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/component/ConsentBagInnerDescriptionComponentKt\n*L\n40#1:143\n46#1:177\n52#1:178\n56#1:179\n59#1:180\n62#1:181\n80#1:220\n86#1:221\n92#1:222\n119#1:260\n124#1:266\n125#1:267\n38#1:144,6\n38#1:176\n38#1:186\n74#1:187,6\n74#1:219\n74#1:227\n38#1:150\n38#1:152,11\n38#1:185\n74#1:193\n74#1:195,11\n74#1:226\n107#1:233\n107#1:235,11\n107#1:264\n38#1:151\n74#1:194\n107#1:234\n38#1:163,13\n38#1:182,3\n74#1:206,13\n74#1:223,3\n107#1:246,13\n107#1:261,3\n107#1:228,5\n107#1:259\n107#1:265\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.component.ConsentBagInnerDescriptionComponentKt */
public final class ConsentBagInnerDescriptionComponentKt {
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104217a(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-2033829566);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2033829566, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.component.ConsentBagBottomSheetDialogFragmentComponentPreview (ConsentBagInnerDescriptionComponent.kt:134)");
            }
            ThemeKt.m153788a(ComposableSingletons$ConsentBagInnerDescriptionComponentKt.f59130a.mo68402b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C23354x77064524(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104218b(@C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(971753483);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i5 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(971753483, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.component.ConsentBagExplanationList (ConsentBagInnerDescriptionComponent.kt:70)");
            }
            int i6 = i3 & 14;
            o.mo14918M(-483455358);
            int i7 = i6 >> 3;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, (i7 & 112) | (i7 & 14));
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar);
            int i8 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i8 >> 3) & 112));
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            m104220d(R.string.checkout_bag_retrieve_title, R.drawable.ic_drive_pieton, R.string.checkout_bag_retrieve_text, o, 0);
            C8767m.C8768a aVar = C8767m.f23478j;
            float f2 = (float) 24;
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f2)), o, 6);
            m104220d(R.string.checkout_bag_return_bag_title, R.drawable.ic_shopping_bag, R.string.checkout_bag_return_bag_text, o, 0);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f2)), o, 6);
            m104220d(R.string.checkout_bag_refund_title, R.drawable.ic_money_2, R.string.checkout_bag_refund_text, o, 0);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f2)), o, 6);
            m104220d(R.string.checkout_bag_recycled_title, R.drawable.ds_ic_refresh, R.string.checkout_bag_recycled_text, o, 0);
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
            s.mo15202a(new C23355xa90cfc85(mVar, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m104219c(@C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m mVar3;
        C8767m.C8768a aVar;
        int i4;
        int i5 = i;
        int i6 = i2;
        C8592o o = oVar.mo15009o(-1693688693);
        int i7 = i6 & 1;
        if (i7 != 0) {
            i3 = i5 | 6;
            mVar2 = mVar;
        } else if ((i5 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i5;
        } else {
            mVar2 = mVar;
            i3 = i5;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i7 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1693688693, i5, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.component.ConsentBagInnerDescriptionComponent (ConsentBagInnerDescriptionComponent.kt:34)");
            }
            float f = (float) 16;
            C8767m f2 = ScrollKt.m9059f(PaddingKt.m10026m(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f), 0.0f, 2, (Object) null), ScrollKt.m9056c(0, o, 0, 1), false, (C2195g) null, false, 14, (Object) null);
            o.mo14918M(-483455358);
            Arrangement.C2279l r = Arrangement.f6010a.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(f2);
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
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C8767m.C8768a aVar4 = aVar3;
            float f4 = f;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_zero_waste_challenge_logo, o, 0), "défi zéro déchet", PaddingKt.m10028o(SizeKt.m10114n(aVar3, 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M((float) 8), 0.0f, 0.0f, 13, (Object) null), aVar2.mo17066i(), (C15541c) null, 0.0f, (C15249k2) null, o, 3512, 112);
            C8767m e = columnScopeInstance.mo7714e(PaddingKt.m10028o(aVar4, 0.0f, C16483g.m74435M(f4), 0.0f, 0.0f, 13, (Object) null), aVar2.mo17068m());
            C37475b bVar = C37475b.f94185a;
            m104218b(PaddingKt.m10026m(SizeKt.m10114n(BackgroundKt.m8824c(e, bVar.mo114234c(), C2694o.m12166h(C16483g.m74435M((float) 10))), 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M(f4), 1, (Object) null), o, 0, 0);
            mVar3 = aVar;
            oVar2 = o;
            TextKt.m14196c(C16018i.m71858d(R.string.checkout_bag_bottom_sheet_text, o, 0), PaddingKt.m10028o(aVar4, 0.0f, C16483g.m74435M(f4), 0.0f, 0.0f, 13, (Object) null), bVar.mo114212I(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153906r(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b)), oVar2, 48, 0, 65528);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C23356xa0bd1605(mVar3, i5, i6));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m104220d(int i, int i2, int i3, @C12580l C8592o oVar, int i4) {
        int i5;
        C8592o oVar2;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i2;
        int i11 = i3;
        int i12 = i4;
        C8592o o = oVar.mo15009o(-853506134);
        if ((i12 & 14) == 0) {
            if (o.mo14976f(i9)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i5 = i8 | i12;
        } else {
            i5 = i12;
        }
        if ((i12 & 112) == 0) {
            if (o.mo14976f(i10)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        if ((i12 & 896) == 0) {
            if (o.mo14976f(i11)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i5 |= i6;
        }
        int i13 = i5;
        if ((i13 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-853506134, i13, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.component.ExplanationTitleWithIconAndText (ConsentBagInnerDescriptionComponent.kt:101)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            Arrangement.C2271e f = Arrangement.f6010a.mo7625f();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(f, C8734c.f23406a.mo17073w(), o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(n);
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
            String d2 = C16018i.m71858d(i9, o, i13 & 14);
            C7933t0 t0Var = C7933t0.f19075a;
            int i14 = C7933t0.f19076b;
            C16361p0 g = C37477d.m153895g(t0Var.mo11077c(o, i14));
            C16432i.C16433a aVar2 = C16432i.f40718b;
            int i15 = i13;
            C8592o oVar3 = o;
            TextKt.m14196c(d2, (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(aVar2.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, g, oVar3, 0, 0, 65022);
            C8592o oVar4 = oVar3;
            float f3 = (float) 8;
            C8767m.C8768a aVar3 = aVar;
            IconKt.m13539b(C16015f.m71849d(i10, oVar4, (i15 >> 3) & 14), "", PaddingKt.m10028o(aVar3, C16483g.m74435M(f3), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, oVar4, 440, 8);
            oVar4.mo15002m0();
            oVar4.mo14896D();
            oVar4.mo15002m0();
            oVar4.mo15002m0();
            C8767m m = PaddingKt.m10026m(PaddingKt.m10028o(aVar3, 0.0f, C16483g.m74435M(f3), 0.0f, 0.0f, 13, (Object) null), C16483g.m74435M((float) 24), 0.0f, 2, (Object) null);
            String d3 = C16018i.m71858d(i11, oVar4, (i15 >> 6) & 14);
            C16361p0 B = C37477d.m153875B(t0Var.mo11077c(oVar4, i14));
            long I = C37475b.f94185a.mo114212I();
            int a2 = aVar2.mo47667a();
            oVar2 = oVar4;
            TextKt.m14196c(d3, m, I, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(a2), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, B, oVar2, 48, 0, 65016);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C23357x285cfa62(i9, i10, i11, i12));
        }
    }
}
