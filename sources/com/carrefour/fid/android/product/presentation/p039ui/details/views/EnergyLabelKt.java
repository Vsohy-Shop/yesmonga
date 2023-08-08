package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nEnergyLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyLabel.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/EnergyLabelKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,206:1\n154#2:207\n154#2:208\n154#2:242\n154#2:243\n74#3,6:209\n80#3:241\n84#3:248\n75#4:215\n76#4,11:217\n89#4:247\n76#5:216\n460#6,13:228\n473#6,3:244\n*S KotlinDebug\n*F\n+ 1 EnergyLabel.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/EnergyLabelKt\n*L\n53#1:207\n65#1:208\n76#1:242\n81#1:243\n63#1:209,6\n63#1:241\n63#1:248\n63#1:215\n63#1:217,11\n63#1:247\n63#1:216\n63#1:228,13\n63#1:244,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelKt */
public final class EnergyLabelKt {
    @C12579k

    /* renamed from: a */
    public static final String f67703a = "A+++";
    @C12579k

    /* renamed from: b */
    public static final String f67704b = "A++";
    @C12579k

    /* renamed from: c */
    public static final String f67705c = "A+";
    @C12579k

    /* renamed from: d */
    public static final String f67706d = "A";
    @C12579k

    /* renamed from: e */
    public static final String f67707e = "B";
    @C12579k

    /* renamed from: f */
    public static final String f67708f = "C";
    @C12579k

    /* renamed from: g */
    public static final String f67709g = "D";
    @C12579k

    /* renamed from: h */
    public static final String f67710h = "E";
    @C12579k

    /* renamed from: i */
    public static final String f67711i = "F";
    @C12579k

    /* renamed from: j */
    public static final String f67712j = "G";

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m117183a(C8767m mVar, int i, C8592o oVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(781065097);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i6 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (o.mo14976f(i)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i4 & 91) != 18 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(781065097, i4, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabel (EnergyLabel.kt:45)");
            }
            ImageKt.m8967b(C16015f.m71849d(i, o, (i4 >> 3) & 14), (String) null, SizeKt.m10087C(mVar, C16483g.m74435M((float) 60)), (C8734c) null, C15541c.f38696a.mo44373i(), 0.0f, (C15249k2) null, o, 24632, 104);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabel$2(mVar, i, i2, i3));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015b  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117184b(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r6, int r7) {
        /*
            java.lang.String r0 = "energyLabel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 2061440722(0x7adf16d2, float:5.7917253E35)
            androidx.compose.runtime.o r6 = r6.mo15009o(r0)
            r1 = r7 & 14
            r2 = 2
            if (r1 != 0) goto L_0x001c
            boolean r1 = r6.mo15006n0(r5)
            if (r1 == 0) goto L_0x0019
            r1 = 4
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            r1 = r1 | r7
            goto L_0x001d
        L_0x001c:
            r1 = r7
        L_0x001d:
            r1 = r1 & 11
            if (r1 != r2) goto L_0x002d
            boolean r1 = r6.mo15011p()
            if (r1 != 0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            r6.mo14958a0()
            goto L_0x015e
        L_0x002d:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0039
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabel (EnergyLabel.kt:28)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r1, r2)
        L_0x0039:
            int r0 = r5.hashCode()
            r1 = 2058(0x80a, float:2.884E-42)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == r1) goto L_0x0135
            r1 = 63841(0xf961, float:8.946E-41)
            if (r0 == r1) goto L_0x011d
            r1 = 1979114(0x1e32ea, float:2.77333E-39)
            if (r0 == r1) goto L_0x0105
            switch(r0) {
                case 65: goto L_0x00ed;
                case 66: goto L_0x00d5;
                case 67: goto L_0x00bb;
                case 68: goto L_0x00a1;
                case 69: goto L_0x0087;
                case 70: goto L_0x006d;
                case 71: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x013d
        L_0x0053:
            java.lang.String r0 = "G"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x005d
            goto L_0x013d
        L_0x005d:
            r0 = -170306072(0xfffffffff5d955e8, float:-5.5101113E32)
            r6.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_pa_energetic_g
            m117183a(r4, r0, r6, r3, r2)
            r6.mo15002m0()
            goto L_0x0155
        L_0x006d:
            java.lang.String r0 = "F"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0077
            goto L_0x013d
        L_0x0077:
            r0 = -170306140(0xfffffffff5d955a4, float:-5.510085E32)
            r6.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_pa_energetic_f
            m117183a(r4, r0, r6, r3, r2)
            r6.mo15002m0()
            goto L_0x0155
        L_0x0087:
            java.lang.String r0 = "E"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0091
            goto L_0x013d
        L_0x0091:
            r0 = -170306208(0xfffffffff5d95560, float:-5.5100587E32)
            r6.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_pa_energetic_e
            m117183a(r4, r0, r6, r3, r2)
            r6.mo15002m0()
            goto L_0x0155
        L_0x00a1:
            java.lang.String r0 = "D"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00ab
            goto L_0x013d
        L_0x00ab:
            r0 = -170306276(0xfffffffff5d9551c, float:-5.5100324E32)
            r6.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_pa_energetic_d
            m117183a(r4, r0, r6, r3, r2)
            r6.mo15002m0()
            goto L_0x0155
        L_0x00bb:
            java.lang.String r0 = "C"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00c5
            goto L_0x013d
        L_0x00c5:
            r0 = -170306344(0xfffffffff5d954d8, float:-5.510006E32)
            r6.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_pa_energetic_c
            m117183a(r4, r0, r6, r3, r2)
            r6.mo15002m0()
            goto L_0x0155
        L_0x00d5:
            java.lang.String r0 = "B"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00de
            goto L_0x013d
        L_0x00de:
            r0 = -170306412(0xfffffffff5d95494, float:-5.50998E32)
            r6.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_pa_energetic_b
            m117183a(r4, r0, r6, r3, r2)
            r6.mo15002m0()
            goto L_0x0155
        L_0x00ed:
            java.lang.String r0 = "A"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00f6
            goto L_0x013d
        L_0x00f6:
            r0 = -170306480(0xfffffffff5d95450, float:-5.5099535E32)
            r6.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_pa_energetic_a
            m117183a(r4, r0, r6, r3, r2)
            r6.mo15002m0()
            goto L_0x0155
        L_0x0105:
            java.lang.String r0 = "A+++"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x010e
            goto L_0x013d
        L_0x010e:
            r0 = -170306729(0xfffffffff5d95357, float:-5.509857E32)
            r6.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_pa_energetic_a_plus_plus_plus
            m117183a(r4, r0, r6, r3, r2)
            r6.mo15002m0()
            goto L_0x0155
        L_0x011d:
            java.lang.String r0 = "A++"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0126
            goto L_0x013d
        L_0x0126:
            r0 = -170306636(0xfffffffff5d953b4, float:-5.509893E32)
            r6.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_pa_energetic_a_plus_plus
            m117183a(r4, r0, r6, r3, r2)
            r6.mo15002m0()
            goto L_0x0155
        L_0x0135:
            java.lang.String r0 = "A+"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0147
        L_0x013d:
            r0 = -170306001(0xfffffffff5d9562f, float:-5.510139E32)
            r6.mo14918M(r0)
            r6.mo15002m0()
            goto L_0x0155
        L_0x0147:
            r0 = -170306553(0xfffffffff5d95407, float:-5.5099253E32)
            r6.mo14918M(r0)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_pa_energetic_a_plus
            m117183a(r4, r0, r6, r3, r2)
            r6.mo15002m0()
        L_0x0155:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x015e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x015e:
            androidx.compose.runtime.t1 r6 = r6.mo15020s()
            if (r6 != 0) goto L_0x0165
            goto L_0x016d
        L_0x0165:
            com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelKt$EnergyLabel$1 r0 = new com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelKt$EnergyLabel$1
            r0.<init>(r5, r7)
            r6.mo15202a(r0)
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt.m117184b(java.lang.String, androidx.compose.runtime.o, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117185c(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r34, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r35, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r36, int r37, int r38) {
        /*
            r0 = r37
            r1 = r38
            r2 = -1916439986(0xffffffff8dc5724e, float:-1.216858E-30)
            r3 = r36
            androidx.compose.runtime.o r15 = r3.mo15009o(r2)
            r3 = r1 & 1
            if (r3 == 0) goto L_0x0017
            r4 = r0 | 6
            r5 = r4
            r4 = r34
            goto L_0x002b
        L_0x0017:
            r4 = r0 & 14
            if (r4 != 0) goto L_0x0028
            r4 = r34
            boolean r5 = r15.mo15006n0(r4)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r0
            goto L_0x002b
        L_0x0028:
            r4 = r34
            r5 = r0
        L_0x002b:
            r6 = r1 & 2
            r7 = 16
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
            goto L_0x0046
        L_0x0034:
            r8 = r0 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0046
            r8 = r35
            boolean r9 = r15.mo14927P(r8)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0044
        L_0x0043:
            r9 = r7
        L_0x0044:
            r5 = r5 | r9
            goto L_0x0048
        L_0x0046:
            r8 = r35
        L_0x0048:
            r14 = r5
            r5 = r14 & 91
            r9 = 18
            if (r5 != r9) goto L_0x005e
            boolean r5 = r15.mo15011p()
            if (r5 != 0) goto L_0x0056
            goto L_0x005e
        L_0x0056:
            r15.mo14958a0()
            r2 = r4
            r29 = r15
            goto L_0x0225
        L_0x005e:
            if (r3 == 0) goto L_0x0064
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r12 = r3
            goto L_0x0065
        L_0x0064:
            r12 = r4
        L_0x0065:
            if (r6 == 0) goto L_0x006c
            com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelKt$EnergyLabelInfo$1 r3 = com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt$EnergyLabelInfo$1.f67713f
            r28 = r3
            goto L_0x006e
        L_0x006c:
            r28 = r8
        L_0x006e:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x007a
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelInfo (EnergyLabel.kt:58)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r14, r3, r4)
        L_0x007a:
            float r2 = (float) r7
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10024k(r12, r3)
            com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelKt$EnergyLabelInfo$2 r4 = com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt$EnergyLabelInfo$2.f67714f
            r13 = 1
            androidx.compose.ui.m r3 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71867b(r3, r13, r4)
            r4 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r4)
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r4 = r4.mo7631r()
            androidx.compose.ui.c$a r5 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r5 = r5.mo17072u()
            r11 = 0
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r5, r15, r11)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r9 = r8.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r10 = r15.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x00da
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00da:
            r15.mo14938T()
            boolean r10 = r15.mo14997l()
            if (r10 == 0) goto L_0x00e7
            r15.mo14947W(r9)
            goto L_0x00ea
        L_0x00e7:
            r15.mo14888A()
        L_0x00ea:
            r15.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r10 = r8.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r4, r10)
            kotlin.jvm.functions.p r4 = r8.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r4)
            kotlin.jvm.functions.p r4 = r8.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r4)
            kotlin.jvm.functions.p r4 = r8.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r4)
            r15.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r3.invoke(r4, r15, r5)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r3 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_energy_label_info_title
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r11)
            androidx.compose.material.t0 r10 = androidx.compose.material.C7933t0.f19075a
            int r9 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r4 = r10.mo11077c(r15, r9)
            androidx.compose.ui.text.p0 r23 = r4.mo11098k()
            androidx.compose.ui.m$a r29 = androidx.compose.p004ui.C8767m.f23478j
            r4 = r29
            r5 = 0
            r7 = 0
            r16 = 0
            r30 = r9
            r9 = r16
            r31 = r10
            r10 = r16
            r11 = r16
            r16 = 0
            r32 = r12
            r12 = r16
            r16 = 0
            r33 = r14
            r14 = r16
            r34 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 48
            r26 = 0
            r27 = 65532(0xfffc, float:9.183E-41)
            r24 = r34
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r3 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_energy_label_info_text
            r4 = 0
            r15 = r34
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r4)
            r5 = r30
            r4 = r31
            androidx.compose.material.w1 r4 = r4.mo11077c(r15, r5)
            androidx.compose.ui.text.p0 r23 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r4)
            r17 = 0
            r4 = 8
            float r4 = (float) r4
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r19 = 0
            r20 = 0
            r21 = 13
            r16 = r29
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r5 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r29 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = r29
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = 0
            r4 = 0
            r15 = r32
            r5 = 1
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r3, r5, r4)
            r7 = 0
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r9 = 0
            r10 = 0
            r11 = 13
            r12 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10028o(r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.material.i r3 = androidx.compose.material.C3049i.f8133a
            com.carrefour.fid.android.design.theme.b r4 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r4 = r4.mo114218O()
            r6 = 0
            r8 = 0
            r10 = 0
            int r12 = androidx.compose.material.C3049i.f8145m
            int r13 = r12 << 12
            r14 = 14
            r12 = r29
            androidx.compose.material.h r10 = r3.mo10775a(r4, r6, r8, r10, r12, r13, r14)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            com.carrefour.fid.android.product.presentation.ui.details.views.ComposableSingletons$EnergyLabelKt r3 = com.carrefour.fid.android.product.presentation.p039ui.details.views.ComposableSingletons$EnergyLabelKt.f67602a
            kotlin.jvm.functions.q r12 = r3.mo81165a()
            int r3 = r33 >> 3
            r3 = r3 & 14
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r14 = r3 | r4
            r16 = 380(0x17c, float:5.32E-43)
            r3 = r28
            r4 = r2
            r13 = r29
            r2 = r15
            r15 = r16
            androidx.compose.material.ButtonKt.m13343a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r29.mo15002m0()
            r29.mo14896D()
            r29.mo15002m0()
            r29.mo15002m0()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0223
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0223:
            r8 = r28
        L_0x0225:
            androidx.compose.runtime.t1 r3 = r29.mo15020s()
            if (r3 != 0) goto L_0x022c
            goto L_0x0234
        L_0x022c:
            com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelKt$EnergyLabelInfo$4 r4 = new com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelKt$EnergyLabelInfo$4
            r4.<init>(r2, r8, r0, r1)
            r3.mo15202a(r4)
        L_0x0234:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt.m117185c(androidx.compose.ui.m, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m117186d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1441751996);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1441751996, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelPreviewA (EnergyLabel.kt:127)");
            }
            ThemeKt.m153788a(ComposableSingletons$EnergyLabelKt.f67602a.mo81185u(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabelPreviewA$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m117187e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-2115379082);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2115379082, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelPreviewAPlus (EnergyLabel.kt:117)");
            }
            ThemeKt.m153788a(ComposableSingletons$EnergyLabelKt.f67602a.mo81183s(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabelPreviewAPlus$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m117188f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-24940496);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-24940496, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelPreviewAPlusPlus (EnergyLabel.kt:107)");
            }
            ThemeKt.m153788a(ComposableSingletons$EnergyLabelKt.f67602a.mo81181q(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabelPreviewAPlusPlus$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m117189g(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1878692586);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1878692586, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelPreviewAPlusPlusPlus (EnergyLabel.kt:97)");
            }
            ThemeKt.m153788a(ComposableSingletons$EnergyLabelKt.f67602a.mo81179o(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabelPreviewAPlusPlusPlus$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m117190h(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(2117444605);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2117444605, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelPreviewB (EnergyLabel.kt:137)");
            }
            ThemeKt.m153788a(ComposableSingletons$EnergyLabelKt.f67602a.mo81167c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabelPreviewB$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m117191i(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1501830082);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1501830082, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelPreviewC (EnergyLabel.kt:147)");
            }
            ThemeKt.m153788a(ComposableSingletons$EnergyLabelKt.f67602a.mo81169e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabelPreviewC$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m117192j(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-826137473);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-826137473, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelPreviewD (EnergyLabel.kt:157)");
            }
            ThemeKt.m153788a(ComposableSingletons$EnergyLabelKt.f67602a.mo81171g(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabelPreviewD$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    public static final void m117193k(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-150444864);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-150444864, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelPreviewE (EnergyLabel.kt:167)");
            }
            ThemeKt.m153788a(ComposableSingletons$EnergyLabelKt.f67602a.mo81173i(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabelPreviewE$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    public static final void m117194l(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(525247745);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(525247745, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelPreviewF (EnergyLabel.kt:177)");
            }
            ThemeKt.m153788a(ComposableSingletons$EnergyLabelKt.f67602a.mo81175k(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabelPreviewF$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    public static final void m117195m(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1200940354);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1200940354, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.EnergyLabelPreviewG (EnergyLabel.kt:187)");
            }
            ThemeKt.m153788a(ComposableSingletons$EnergyLabelKt.f67602a.mo81178n(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EnergyLabelKt$EnergyLabelPreviewG$1(i));
        }
    }
}
