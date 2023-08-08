package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.component;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
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
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
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
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import androidx.profileinstaller.C20022q;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.C23454a;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.contentsquare.android.api.C14092c;
import java.util.List;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jsoup.parser.C12888a;

@C11363r0({"SMAP\nItemBasket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemBasket.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/component/ItemBasketKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,220:1\n76#2:221\n76#2:265\n154#3:222\n154#3:261\n36#4:223\n25#4:234\n460#4,13:277\n473#4,3:291\n1114#5,6:224\n955#5,6:235\n73#6,4:230\n77#6,20:241\n79#7,2:262\n81#7:290\n85#7:295\n75#8:264\n76#8,11:266\n89#8:294\n*S KotlinDebug\n*F\n+ 1 ItemBasket.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/component/ItemBasketKt\n*L\n49#1:221\n182#1:265\n59#1:222\n186#1:261\n61#1:223\n89#1:234\n182#1:277,13\n182#1:291,3\n61#1:224,6\n89#1:235,6\n89#1:230,4\n89#1:241,20\n182#1:262,2\n182#1:290\n182#1:295\n182#1:264\n182#1:266,11\n182#1:294\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt */
public final class ItemBasketKt {

    /* renamed from: a */
    public static final int f59335a = 6;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104560a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.basket.Basket r23, boolean r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r1 = r23
            r3 = r25
            r4 = r27
            java.lang.String r0 = "basket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onBasketClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 733119576(0x2bb28458, float:1.2684393E-12)
            r2 = r26
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r5 = r28 & 2
            if (r5 == 0) goto L_0x0020
            r5 = 0
            r15 = r5
            goto L_0x0022
        L_0x0020:
            r15 = r24
        L_0x0022:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x002e
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasket (ItemBasket.kt:47)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r5, r6)
        L_0x002e:
            androidx.compose.runtime.i1 r0 = com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.CheckoutBasketsListFormatterKt.m104508b()
            java.lang.Object r0 = r2.mo15032w(r0)
            com.carrefour.fid.android.presentation.ui.checkout.basketslist.c r0 = (com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.C23465c) r0
            com.carrefour.fid.android.domain.models.basket.BasketType r5 = r23.mo116829N()
            com.carrefour.fid.android.domain.models.basket.BasketServiceType r6 = r23.mo116824I()
            com.carrefour.fid.android.presentation.ui.checkout.basketslist.a r0 = r0.mo68718a(r15, r5, r6)
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r6 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r5, r6, r8, r7)
            r17 = 0
            r18 = 0
            r19 = 0
            r5 = 16
            float r5 = (float) r5
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r21 = 7
            r22 = 0
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.material.t0 r5 = androidx.compose.material.C7933t0.f19075a
            int r7 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.f1 r5 = r5.mo11076b(r2, r7)
            androidx.compose.foundation.shape.e r9 = r5.mo10757d()
            r5 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r5)
            boolean r5 = r2.mo15006n0(r3)
            java.lang.Object r7 = r2.mo14921N()
            if (r5 != 0) goto L_0x0086
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r7 != r5) goto L_0x008e
        L_0x0086:
            com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$ItemBasket$1$1 r7 = new com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$ItemBasket$1$1
            r7.<init>(r3)
            r2.mo14893C(r7)
        L_0x008e:
            r2.mo15002m0()
            r5 = r7
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            r7 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$ItemBasket$2 r14 = new com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$ItemBasket$2
            r14.<init>(r15, r0, r1, r4)
            r0 = -321887009(0xffffffffecd064df, float:-2.0154634E27)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r0, r8, r14)
            r18 = 805306416(0x30000030, float:4.6566395E-10)
            r19 = 500(0x1f4, float:7.0E-43)
            r8 = r9
            r9 = r10
            r11 = r12
            r13 = 0
            r14 = r16
            r20 = r15
            r15 = r17
            r16 = r0
            r17 = r2
            androidx.compose.material.SurfaceKt.m13880c(r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00c8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00c8:
            androidx.compose.runtime.t1 r6 = r2.mo15020s()
            if (r6 != 0) goto L_0x00cf
            goto L_0x00e2
        L_0x00cf:
            com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$ItemBasket$3 r7 = new com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$ItemBasket$3
            r0 = r7
            r1 = r23
            r2 = r20
            r3 = r25
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.component.ItemBasketKt.m104560a(com.carrefour.fid.android.domain.models.basket.Basket, boolean, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104561b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1317738336);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1317738336, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketPreview (ItemBasket.kt:206)");
            }
            ThemeKt.m153788a(ComposableSingletons$ItemBasketKt.f59329a.mo68720b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ItemBasketKt$ItemBasketPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m104562c(List<String> list, boolean z, C8592o oVar, int i) {
        List<String> list2 = list;
        boolean z2 = z;
        int i2 = i;
        C8592o o = oVar.mo15009o(-1542365190);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1542365190, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.OffersRow (ItemBasket.kt:157)");
        }
        LazyDslKt.m10739d(C37019o.m151909b(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), z2, (C15218g4) null, 2, (Object) null), (LazyListState) null, (C2366i0) null, false, Arrangement.f6010a.mo7630p(), (C8734c.C8737c) null, (C2195g) null, false, new ItemBasketKt$OffersRow$1(list2), o, C12888a.f31808q, C14092c.f34603g0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ItemBasketKt$OffersRow$2(list2, z2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m104563d(boolean z, C23454a aVar, int i, C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = z;
        C23454a aVar2 = aVar;
        int i7 = i;
        int i8 = i2;
        C8592o o = oVar.mo15009o(1700056339);
        if ((i8 & 14) == 0) {
            if (o.mo14961b(z2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i8;
        } else {
            i3 = i8;
        }
        if ((i8 & 112) == 0) {
            if (o.mo15006n0(aVar2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i8 & 896) == 0) {
            if (o.mo14976f(i7)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1700056339, i8, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.PictoRow (ItemBasket.kt:87)");
            }
            C8767m b = C37019o.m151909b(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), z2, (C15218g4) null, 2, (Object) null);
            o.mo14918M(-270267587);
            o.mo14918M(-3687241);
            Object N = o.mo14921N();
            C8592o.C8593a aVar3 = C8592o.f23032a;
            if (N == aVar3.mo16277a()) {
                N = new Measurer();
                o.mo14893C(N);
            }
            o.mo15002m0();
            Measurer measurer = (Measurer) N;
            o.mo14918M(-3687241);
            Object N2 = o.mo14921N();
            if (N2 == aVar3.mo16277a()) {
                N2 = new ConstraintLayoutScope();
                o.mo14893C(N2);
            }
            o.mo15002m0();
            ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) N2;
            o.mo14918M(-3687241);
            Object N3 = o.mo14921N();
            if (N3 == aVar3.mo16277a()) {
                N3 = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            Pair<C15560f0, C11289a<C11079d2>> E = ConstraintLayoutKt.m75199E(257, constraintLayoutScope, (C8700z0) N3, measurer, o, 4544);
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(b, false, new ItemBasketKt$PictoRow$$inlined$ConstraintLayout$1(measurer), 1, (Object) null), C8553b.m31048b(o, -819894182, true, new ItemBasketKt$PictoRow$$inlined$ConstraintLayout$2(constraintLayoutScope, 0, E.mo21847b(), aVar, z, i)), E.mo21846a(), o, 48, 0);
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ItemBasketKt$PictoRow$2(z2, aVar2, i7, i8));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m104564e(boolean z, double d, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        boolean z2 = z;
        double d2 = d;
        int i5 = i;
        C8592o o = oVar.mo15009o(507551305);
        if ((i5 & 14) == 0) {
            if (o.mo14961b(z2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14993k(d2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(507551305, i5, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.PriceRow (ItemBasket.kt:180)");
            }
            C8767m o2 = PaddingKt.m10028o(C37019o.m151909b(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), z2, (C15218g4) null, 2, (Object) null), 0.0f, C16483g.m74435M((float) 16), 0.0f, 0.0f, 13, (Object) null);
            Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            o.mo14918M(693286680);
            C15560f0 d3 = RowKt.m10071d(l, q, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(o2);
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
            Updater.m30188j(b, d3, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            String b2 = C28782t.m119105b(Double.valueOf(d));
            C16361p0 j = C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j();
            C16209i0 c = C16209i0.f40292b.mo46947c();
            C37475b bVar = C37475b.f94185a;
            C8592o oVar3 = o;
            TextKt.m14196c(b2, (C8767m) null, bVar.mo114220Q(), 0, (C16190e0) null, c, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, j, oVar3, C20022q.C20025c.f51280k, 0, 65498);
            oVar2 = oVar3;
            IconKt.m13539b(C16015f.m71849d(R.drawable.ic_arrow_right, oVar2, 0), (String) null, (C8767m) null, bVar.mo114218O(), oVar2, 56, 4);
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
            s.mo15202a(new ItemBasketKt$PriceRow$2(z2, d2, i5));
        }
    }
}
