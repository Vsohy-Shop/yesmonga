package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSecretCodeVerification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecretCodeVerification.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/SecretCodeVerificationKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,83:1\n73#2,7:84\n80#2:117\n84#2:127\n75#3:91\n76#3,11:93\n89#3:126\n76#4:92\n460#5,13:104\n473#5,3:123\n154#6:118\n154#6:119\n154#6:120\n154#6:121\n154#6:122\n*S KotlinDebug\n*F\n+ 1 SecretCodeVerification.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/SecretCodeVerificationKt\n*L\n32#1:84,7\n32#1:117\n32#1:127\n32#1:91\n32#1:93,11\n32#1:126\n32#1:92\n32#1:104,13\n32#1:123,3\n40#1:118\n52#1:119\n56#1:120\n61#1:121\n65#1:122\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.SecretCodeVerificationKt */
public final class SecretCodeVerificationKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104650a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a r37, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r38, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r39, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r40, int r41, int r42) {
        /*
            r1 = r37
            r4 = r41
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 1265728093(0x4b717a5d, float:1.5825501E7)
            r2 = r40
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r42 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r4 | 6
            goto L_0x0029
        L_0x0019:
            r3 = r4 & 14
            if (r3 != 0) goto L_0x0028
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0028:
            r3 = r4
        L_0x0029:
            r5 = r42 & 2
            r14 = 16
            if (r5 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0044
        L_0x0032:
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0044
            r6 = r38
            boolean r7 = r2.mo14927P(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0042
        L_0x0041:
            r7 = r14
        L_0x0042:
            r3 = r3 | r7
            goto L_0x0046
        L_0x0044:
            r6 = r38
        L_0x0046:
            r7 = r42 & 4
            if (r7 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x004d:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0060
            r8 = r39
            boolean r9 = r2.mo14927P(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
            goto L_0x0062
        L_0x0060:
            r8 = r39
        L_0x0062:
            r9 = r3 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 != r10) goto L_0x0077
            boolean r9 = r2.mo15011p()
            if (r9 != 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            r2.mo14958a0()
            r30 = r6
            r3 = r8
            goto L_0x0287
        L_0x0077:
            if (r5 == 0) goto L_0x007e
            com.carrefour.fid.android.presentation.ui.checkout.common.SecretCodeVerificationKt$SecretCodeVerification$1 r5 = com.carrefour.fid.android.presentation.p035ui.checkout.common.SecretCodeVerificationKt$SecretCodeVerification$1.f59423f
            r30 = r5
            goto L_0x0080
        L_0x007e:
            r30 = r6
        L_0x0080:
            if (r7 == 0) goto L_0x0087
            com.carrefour.fid.android.presentation.ui.checkout.common.SecretCodeVerificationKt$SecretCodeVerification$2 r5 = com.carrefour.fid.android.presentation.p035ui.checkout.common.SecretCodeVerificationKt$SecretCodeVerification$2.f59424f
            r31 = r5
            goto L_0x0089
        L_0x0087:
            r31 = r8
        L_0x0089:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x0095
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.checkout.common.SecretCodeVerification (SecretCodeVerification.kt:26)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r5, r6)
        L_0x0095:
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r0 = r0.mo17068m()
            r5 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r2.mo14918M(r5)
            androidx.compose.ui.m$a r15 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r5 = r5.mo7631r()
            r6 = 48
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.ColumnKt.m9863b(r5, r0, r2, r6)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r2.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r2.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r2.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r9 = r8.mo44585a()
            kotlin.jvm.functions.q r10 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r15)
            androidx.compose.runtime.d r11 = r2.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x00e8
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00e8:
            r2.mo14938T()
            boolean r11 = r2.mo14997l()
            if (r11 == 0) goto L_0x00f5
            r2.mo14947W(r9)
            goto L_0x00f8
        L_0x00f5:
            r2.mo14888A()
        L_0x00f8:
            r2.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r11 = r8.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r0, r11)
            kotlin.jvm.functions.p r0 = r8.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r0)
            kotlin.jvm.functions.p r0 = r8.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r0)
            kotlin.jvm.functions.p r0 = r8.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r0)
            r2.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r13 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r10.invoke(r0, r2, r5)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r0 = 2131953056(0x7f1305a0, float:1.9542572E38)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r2, r13)
            com.carrefour.fid.android.design.theme.b r0 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r7 = r0.mo114220Q()
            androidx.compose.material.t0 r12 = androidx.compose.material.C7933t0.f19075a
            int r11 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r6 = r12.mo11077c(r2, r11)
            androidx.compose.ui.text.p0 r25 = r6.mo11097j()
            androidx.compose.ui.text.style.i$a r6 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r17 = r6.mo47667a()
            r6 = 0
            r9 = 0
            r16 = 0
            r32 = r11
            r11 = r16
            r33 = r12
            r12 = r16
            r13 = r16
            r18 = 0
            r34 = r15
            r14 = r18
            androidx.compose.ui.text.style.i r17 = androidx.compose.p004ui.text.style.C16432i.m74172g(r17)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 65018(0xfdfa, float:9.111E-41)
            r26 = r2
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r5 = 24
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r15 = r34
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10115o(r15, r5)
            r14 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r5, r2, r14)
            com.carrefour.fid.android.design.components.compose.c$a r5 = com.carrefour.fid.android.design.components.compose.C36971c.C36972a.f92358a
            boolean r6 = r37.mo75937f()
            if (r6 == 0) goto L_0x01a0
            com.carrefour.fid.android.design.components.compose.d$g r6 = com.carrefour.fid.android.design.components.compose.C36975d.C36982g.f92376a
            goto L_0x01a2
        L_0x01a0:
            com.carrefour.fid.android.design.components.compose.d$d r6 = com.carrefour.fid.android.design.components.compose.C36975d.C36979d.f92370a
        L_0x01a2:
            com.carrefour.fid.android.presentation.ui.checkout.common.SecretCodeVerificationKt$SecretCodeVerification$3$1 r8 = com.carrefour.fid.android.presentation.p035ui.checkout.common.SecretCodeVerificationKt$SecretCodeVerification$3$1.f59425f
            r9 = 0
            r7 = 2131953055(0x7f13059f, float:1.954257E38)
            r13 = 0
            java.lang.String r10 = androidx.compose.p004ui.res.C16018i.m71858d(r7, r2, r13)
            r11 = 0
            boolean r12 = r37.mo75935e()
            r16 = 1
            r7 = 100666432(0x6000c40, float:2.4083124E-35)
            int r17 = com.carrefour.fid.android.design.components.compose.C36971c.C36972a.f92359b
            r7 = r17 | r7
            int r3 = r3 << 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | r7
            r17 = 80
            r7 = r30
            r13 = r16
            r14 = r2
            r35 = r15
            r15 = r3
            r16 = r17
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt.m151374b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = 16
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            r14 = r35
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10115o(r14, r3)
            r15 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r2, r15)
            r3 = 2131953053(0x7f13059d, float:1.9542566E38)
            r13 = 0
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r2, r13)
            r3 = 250(0xfa, float:3.5E-43)
            float r3 = (float) r3
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10092H(r14, r6)
            r8 = r32
            r7 = r33
            androidx.compose.material.w1 r7 = r7.mo11077c(r2, r8)
            androidx.compose.ui.text.p0 r25 = r7.mo11099l()
            long r7 = r0.mo114258z()
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r13 = r16
            r16 = 0
            r36 = r14
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 48
            r28 = 0
            r29 = 65528(0xfff8, float:9.1824E-41)
            r26 = r2
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r5 = 8
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r6 = r36
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10115o(r6, r5)
            r7 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r5, r2, r7)
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10092H(r6, r3)
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 7
            r10 = r31
            androidx.compose.ui.m r6 = androidx.compose.foundation.ClickableKt.m8878e(r6, r7, r8, r9, r10, r11, r12)
            r3 = 2131953052(0x7f13059c, float:1.9542564E38)
            r5 = 0
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r2, r5)
            long r7 = r0.mo114218O()
            r0 = 14
            long r9 = androidx.compose.p004ui.unit.C16506u.m74712m(r0)
            r11 = 0
            r13 = 0
            r14 = 0
            r25 = 0
            r27 = 3072(0xc00, float:4.305E-42)
            r29 = 131056(0x1fff0, float:1.83649E-40)
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0285
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0285:
            r3 = r31
        L_0x0287:
            androidx.compose.runtime.t1 r6 = r2.mo15020s()
            if (r6 != 0) goto L_0x028e
            goto L_0x029f
        L_0x028e:
            com.carrefour.fid.android.presentation.ui.checkout.common.SecretCodeVerificationKt$SecretCodeVerification$4 r7 = new com.carrefour.fid.android.presentation.ui.checkout.common.SecretCodeVerificationKt$SecretCodeVerification$4
            r0 = r7
            r1 = r37
            r2 = r30
            r4 = r41
            r5 = r42
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x029f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.common.SecretCodeVerificationKt.m104650a(com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104651b(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1351623507);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1351623507, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.SecretCodeVerificationPreview (SecretCodeVerification.kt:75)");
            }
            ThemeKt.m153788a(ComposableSingletons$SecretCodeVerificationKt.f59406a.mo68804a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SecretCodeVerificationKt$SecretCodeVerificationPreview$1(i));
        }
    }
}
