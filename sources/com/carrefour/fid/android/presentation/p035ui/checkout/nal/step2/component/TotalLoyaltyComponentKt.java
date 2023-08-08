package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTotalLoyaltyComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/TotalLoyaltyComponentKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,87:1\n73#2,4:88\n77#2,20:99\n25#3:92\n460#3,13:139\n473#3,3:153\n955#4,6:93\n154#5:119\n75#6,6:120\n81#6:152\n85#6:157\n75#7:126\n76#7,11:128\n89#7:156\n76#8:127\n*S KotlinDebug\n*F\n+ 1 TotalLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/TotalLoyaltyComponentKt\n*L\n29#1:88,4\n29#1:99,20\n29#1:92\n65#1:139,13\n65#1:153,3\n29#1:93,6\n70#1:119\n65#1:120,6\n65#1:152\n65#1:157\n65#1:126\n65#1:128,11\n65#1:156\n65#1:127\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalLoyaltyComponentKt */
public final class TotalLoyaltyComponentKt {
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105069a(androidx.compose.p004ui.C8767m r33, long r34, long r36, java.lang.String r38, androidx.compose.runtime.C8592o r39, int r40, int r41) {
        /*
            r7 = r40
            r0 = 191064975(0xb636b8f, float:4.3799528E-32)
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
            java.lang.String r8 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PriceFid (TotalLoyaltyComponent.kt:58)"
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
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalLoyaltyComponentKt$PriceFid$2 r10 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalLoyaltyComponentKt$PriceFid$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.TotalLoyaltyComponentKt.m105069a(androidx.compose.ui.m, long, long, java.lang.String, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m105070b(double d, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        double d2 = d;
        int i4 = i;
        C8592o o = oVar.mo15009o(-1267571227);
        if ((i4 & 14) == 0) {
            if (o.mo14993k(d2)) {
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
                ComposerKt.m29845w0(-1267571227, i4, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalLoyaltyComponent (TotalLoyaltyComponent.kt:27)");
            }
            C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
            o.mo14918M(-270267587);
            o.mo14918M(-3687241);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                N = new Measurer();
                o.mo14893C(N);
            }
            o.mo15002m0();
            Measurer measurer = (Measurer) N;
            o.mo14918M(-3687241);
            Object N2 = o.mo14921N();
            if (N2 == aVar.mo16277a()) {
                N2 = new ConstraintLayoutScope();
                o.mo14893C(N2);
            }
            o.mo15002m0();
            ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) N2;
            o.mo14918M(-3687241);
            Object N3 = o.mo14921N();
            if (N3 == aVar.mo16277a()) {
                N3 = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            Pair<C15560f0, C11289a<C11079d2>> E = ConstraintLayoutKt.m75199E(257, constraintLayoutScope, (C8700z0) N3, measurer, o, 4544);
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(n, false, new C23657x3a8ca408(measurer), 1, (Object) null), C8553b.m31048b(o, -819894182, true, new C23658x3a8ca409(constraintLayoutScope, 6, E.mo21847b(), d)), E.mo21846a(), o, 48, 0);
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TotalLoyaltyComponentKt$TotalLoyaltyComponent$2(d2, i4));
        }
    }

    @C8540g
    @C16464c(showBackground = true, widthDp = 350)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m105071c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-722857786);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-722857786, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalLoyaltyComponentPreview (TotalLoyaltyComponent.kt:81)");
            }
            ThemeKt.m153788a(ComposableSingletons$TotalLoyaltyComponentKt.f59681a.mo69286a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TotalLoyaltyComponentKt$TotalLoyaltyComponentPreview$1(i));
        }
    }
}
