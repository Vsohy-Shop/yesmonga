package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTotalBasketComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalBasketComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/TotalBasketComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,208:1\n154#2:209\n154#2:243\n154#2:244\n154#2:245\n154#2:246\n154#2:247\n154#2:248\n154#2:249\n154#2:289\n74#3,6:210\n80#3:242\n84#3:254\n75#4:216\n76#4,11:218\n89#4:253\n75#4:257\n76#4,11:259\n89#4:287\n75#4:296\n76#4,11:298\n89#4:326\n76#5:217\n76#5:258\n76#5:297\n460#6,13:229\n473#6,3:250\n460#6,13:270\n473#6,3:284\n460#6,13:309\n473#6,3:323\n79#7,2:255\n81#7:283\n85#7:288\n75#7,6:290\n81#7:322\n85#7:327\n*S KotlinDebug\n*F\n+ 1 TotalBasketComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/TotalBasketComponentKt\n*L\n40#1:209\n42#1:243\n57#1:244\n73#1:245\n89#1:246\n104#1:247\n125#1:248\n129#1:249\n173#1:289\n36#1:210,6\n36#1:242\n36#1:254\n36#1:216\n36#1:218,11\n36#1:253\n152#1:257\n152#1:259,11\n152#1:287\n168#1:296\n168#1:298,11\n168#1:326\n36#1:217\n152#1:258\n168#1:297\n36#1:229,13\n36#1:250,3\n152#1:270,13\n152#1:284,3\n168#1:309,13\n168#1:323,3\n152#1:255,2\n152#1:283\n152#1:288\n168#1:290,6\n168#1:322\n168#1:327\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalBasketComponentKt */
public final class TotalBasketComponentKt {
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105062a(androidx.compose.p004ui.C8767m r33, long r34, long r36, java.lang.String r38, androidx.compose.runtime.C8592o r39, int r40, int r41) {
        /*
            r7 = r40
            r0 = 367994127(0x15ef250f, float:9.65898E-26)
            r1 = r39
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r41 & 1
            r3 = 4
            if (r2 == 0) goto L_0x0016
            r4 = r7 | 6
            r5 = r4
            r4 = r33
            goto L_0x002a
        L_0x0016:
            r4 = r7 & 14
            if (r4 != 0) goto L_0x0027
            r4 = r33
            boolean r5 = r1.mo15006n0(r4)
            if (r5 == 0) goto L_0x0024
            r5 = r3
            goto L_0x0025
        L_0x0024:
            r5 = 2
        L_0x0025:
            r5 = r5 | r7
            goto L_0x002a
        L_0x0027:
            r4 = r33
            r5 = r7
        L_0x002a:
            r6 = r41 & 2
            if (r6 == 0) goto L_0x0033
            r5 = r5 | 48
            r14 = r34
            goto L_0x0045
        L_0x0033:
            r6 = r7 & 112(0x70, float:1.57E-43)
            r14 = r34
            if (r6 != 0) goto L_0x0045
            boolean r6 = r1.mo14980g(r14)
            if (r6 == 0) goto L_0x0042
            r6 = 32
            goto L_0x0044
        L_0x0042:
            r6 = 16
        L_0x0044:
            r5 = r5 | r6
        L_0x0045:
            r6 = r41 & 4
            if (r6 == 0) goto L_0x004e
            r5 = r5 | 384(0x180, float:5.38E-43)
            r12 = r36
            goto L_0x0060
        L_0x004e:
            r6 = r7 & 896(0x380, float:1.256E-42)
            r12 = r36
            if (r6 != 0) goto L_0x0060
            boolean r6 = r1.mo14980g(r12)
            if (r6 == 0) goto L_0x005d
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r5 = r5 | r6
        L_0x0060:
            r6 = r41 & 8
            if (r6 == 0) goto L_0x0067
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x0067:
            r6 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007a
            r6 = r38
            boolean r8 = r1.mo15006n0(r6)
            if (r8 == 0) goto L_0x0076
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r5 = r5 | r8
            goto L_0x007c
        L_0x007a:
            r6 = r38
        L_0x007c:
            r8 = r5 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x008f
            boolean r8 = r1.mo15011p()
            if (r8 != 0) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            r1.mo14958a0()
            r2 = r4
            goto L_0x01ad
        L_0x008f:
            if (r2 == 0) goto L_0x0094
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0095
        L_0x0094:
            r2 = r4
        L_0x0095:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x00a1
            r4 = -1
            java.lang.String r8 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PromoPrice (TotalBasketComponent.kt:161)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r4, r8)
        L_0x00a1:
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r0 = r0.mo17070q()
            r4 = 1112014848(0x42480000, float:50.0)
            androidx.compose.foundation.shape.n r4 = androidx.compose.foundation.shape.C2694o.m12159a(r4)
            androidx.compose.ui.m r8 = androidx.compose.p004ui.draw.C8744d.m32514a(r2, r4)
            r11 = 0
            r4 = 2
            r16 = 0
            r9 = r34
            r12 = r4
            r13 = r16
            androidx.compose.ui.m r4 = androidx.compose.foundation.BackgroundKt.m8825d(r8, r9, r11, r12, r13)
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10024k(r4, r3)
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r4)
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r4 = r4.mo7630p()
            r8 = 48
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.RowKt.m10071d(r4, r0, r1, r8)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r1.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.platform.c4 r9 = (androidx.compose.p004ui.platform.C15863c4) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r10.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r12 = r1.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x0112
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0112:
            r1.mo14938T()
            boolean r12 = r1.mo14997l()
            if (r12 == 0) goto L_0x011f
            r1.mo14947W(r11)
            goto L_0x0122
        L_0x011f:
            r1.mo14888A()
        L_0x0122:
            r1.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r12 = r10.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r0, r12)
            kotlin.jvm.functions.p r0 = r10.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r4, r0)
            kotlin.jvm.functions.p r0 = r10.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r0)
            kotlin.jvm.functions.p r0 = r10.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.invoke(r0, r1, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r9 = 0
            r12 = 0
            r0 = 0
            r14 = r0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            androidx.compose.material.w1 r0 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r28 = com.carrefour.fid.android.design.theme.C37477d.m153901m(r0)
            int r0 = r5 >> 9
            r0 = r0 & 14
            r3 = r5 & 896(0x380, float:1.256E-42)
            r30 = r0 | r3
            r31 = 0
            r32 = 65530(0xfffa, float:9.1827E-41)
            r8 = r38
            r10 = r36
            r29 = r1
            androidx.compose.material.TextKt.m14196c(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ad
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ad:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x01b4
            goto L_0x01c8
        L_0x01b4:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalBasketComponentKt$PromoPrice$2 r10 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalBasketComponentKt$PromoPrice$2
            r0 = r10
            r1 = r2
            r2 = r34
            r4 = r36
            r6 = r38
            r7 = r40
            r8 = r41
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.TotalBasketComponentKt.m105062a(androidx.compose.ui.m, long, long, java.lang.String, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final void m105063b(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(250805826);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(250805826, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.SpacedItemsRow (TotalBasketComponent.kt:150)");
            }
            C8767m n = SizeKt.m10114n(mVar, 0.0f, 1, (Object) null);
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(l, q, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            pVar.invoke(o, Integer.valueOf((i3 >> 3) & 14));
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
            s.mo15202a(new TotalBasketComponentKt$SpacedItemsRow$2(mVar, pVar, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m105064c(@C12579k BasketAmounts basketAmounts, @C12580l BasketPromotionCode basketPromotionCode, int i, @C12580l C8592o oVar, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        BasketAmounts basketAmounts2 = basketAmounts;
        BasketPromotionCode basketPromotionCode2 = basketPromotionCode;
        int i3 = i;
        int i4 = i2;
        Intrinsics.checkNotNullParameter(basketAmounts2, "basketAmount");
        C8592o o = oVar.mo15009o(1497793496);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1497793496, i4, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalBasketComponent (TotalBasketComponent.kt:34)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
        C37475b bVar = C37475b.f94185a;
        C8767m k = PaddingKt.m10024k(BackgroundKt.m8825d(n, bVar.mo114231a0(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 16));
        o.mo14918M(-483455358);
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
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
        float f3 = (float) 8;
        m105063b(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M(f3), 1, (Object) null), C8553b.m31048b(o, 699869204, true, new TotalBasketComponentKt$TotalBasketComponent$1$1(basketAmounts2)), o, 54, 0);
        o.mo14918M(-42770695);
        if (basketAmounts.mo116888r() == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m105063b(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M(f3), 1, (Object) null), C8553b.m31048b(o, 44674863, true, new TotalBasketComponentKt$TotalBasketComponent$1$2(basketAmounts2)), o, 54, 0);
        }
        o.mo15002m0();
        o.mo14918M(-42770044);
        if (basketAmounts.mo116866B() == 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            z3 = true;
            m105063b(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M(f3), 1, (Object) null), C8553b.m31048b(o, 1742001766, true, new TotalBasketComponentKt$TotalBasketComponent$1$3(basketAmounts2)), o, 54, 0);
        } else {
            z3 = true;
        }
        o.mo15002m0();
        o.mo14918M(-42769409);
        if (basketPromotionCode2 != null) {
            f = 0.0f;
            m105063b(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M(f3), z3, (Object) null), C8553b.m31048b(o, -737478041, z3, new TotalBasketComponentKt$TotalBasketComponent$1$4(basketPromotionCode2)), o, 54, 0);
        } else {
            f = 0.0f;
        }
        o.mo15002m0();
        m105063b(PaddingKt.m10026m(aVar, f, C16483g.m74435M(f3), z3 ? 1 : 0, (Object) null), C8553b.m31048b(o, 23570955, z3, new TotalBasketComponentKt$TotalBasketComponent$1$5(basketAmounts2)), o, 54, 0);
        C2428y0.m10726a(BackgroundKt.m8825d(SizeKt.m10115o(SizeKt.m10114n(aVar, f, z3, (Object) null), C16483g.m74435M(z3 ? 1.0f : 0.0f)), bVar.mo114206C(), (C15218g4) null, 2, (Object) null), o, 0);
        m105063b(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M(f3), 1, (Object) null), C8553b.m31048b(o, 1839058444, true, new TotalBasketComponentKt$TotalBasketComponent$1$6(i3, basketAmounts2)), o, 54, 0);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TotalBasketComponentKt$TotalBasketComponent$2(basketAmounts2, basketPromotionCode2, i3, i4));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m105065d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-656786842);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-656786842, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalBasketComponentPreview (TotalBasketComponent.kt:184)");
            }
            ThemeKt.m153788a(ComposableSingletons$TotalBasketComponentKt.f59678a.mo69284a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TotalBasketComponentKt$TotalBasketComponentPreview$1(i));
        }
    }
}
