package com.carrefour.fid.android.presentation.p035ui.loyalty.view;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nManageLoyaltyCardButtonsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageLoyaltyCardButtonsComponent.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/view/ManageLoyaltyCardButtonsComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,116:1\n25#2:117\n460#2,13:144\n36#2:160\n50#2:168\n49#2:169\n473#2,3:176\n1114#3,6:118\n1114#3,6:161\n1114#3,6:170\n154#4:124\n154#4:158\n154#4:159\n154#4:167\n74#5,6:125\n80#5:157\n84#5:180\n75#6:131\n76#6,11:133\n89#6:179\n76#7:132\n*S KotlinDebug\n*F\n+ 1 ManageLoyaltyCardButtonsComponent.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/view/ManageLoyaltyCardButtonsComponentKt\n*L\n35#1:117\n36#1:144,13\n47#1:160\n64#1:168\n64#1:169\n36#1:176,3\n35#1:118,6\n47#1:161,6\n64#1:170,6\n39#1:124\n43#1:158\n45#1:159\n62#1:167\n36#1:125,6\n36#1:157\n36#1:180\n36#1:131\n36#1:133,11\n36#1:179\n36#1:132\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt */
public final class ManageLoyaltyCardButtonsComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m107683a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r2 = r32
            r3 = r33
            r4 = r35
            java.lang.String r0 = "onClickDisplayCard"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "onClickCopyCardNumber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = -1845843724(0xffffffff91faa8f4, float:-3.954717E-28)
            r1 = r34
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r5 = r36 & 1
            r6 = 2
            if (r5 == 0) goto L_0x0024
            r7 = r4 | 6
            r8 = r7
            r7 = r31
            goto L_0x0038
        L_0x0024:
            r7 = r4 & 14
            if (r7 != 0) goto L_0x0035
            r7 = r31
            boolean r8 = r1.mo15006n0(r7)
            if (r8 == 0) goto L_0x0032
            r8 = 4
            goto L_0x0033
        L_0x0032:
            r8 = r6
        L_0x0033:
            r8 = r8 | r4
            goto L_0x0038
        L_0x0035:
            r7 = r31
            r8 = r4
        L_0x0038:
            r9 = r36 & 2
            r10 = 16
            if (r9 == 0) goto L_0x0041
            r8 = r8 | 48
            goto L_0x0050
        L_0x0041:
            r9 = r4 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0050
            boolean r9 = r1.mo14927P(r2)
            if (r9 == 0) goto L_0x004e
            r9 = 32
            goto L_0x004f
        L_0x004e:
            r9 = r10
        L_0x004f:
            r8 = r8 | r9
        L_0x0050:
            r9 = r36 & 4
            if (r9 == 0) goto L_0x0057
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0067
            boolean r9 = r1.mo14927P(r3)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r8 = r8 | r9
        L_0x0067:
            r9 = r8 & 731(0x2db, float:1.024E-42)
            r11 = 146(0x92, float:2.05E-43)
            if (r9 != r11) goto L_0x0079
            boolean r9 = r1.mo15011p()
            if (r9 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r1.mo14958a0()
            goto L_0x029a
        L_0x0079:
            if (r5 == 0) goto L_0x007f
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r15 = r5
            goto L_0x0080
        L_0x007f:
            r15 = r7
        L_0x0080:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x008c
            r5 = -1
            java.lang.String r7 = "com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponent (ManageLoyaltyCardButtonsComponent.kt:29)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r5, r7)
        L_0x008c:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r0)
            java.lang.Object r0 = r1.mo14921N()
            androidx.compose.runtime.o$a r18 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r18.mo16277a()
            r14 = 0
            if (r0 != r5) goto L_0x00a8
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r14, r6, r14)
            r1.mo14893C(r0)
        L_0x00a8:
            r1.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            r13 = 0
            r12 = 1
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r13, r12, r14)
            float r7 = (float) r10
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10026m(r5, r7, r13, r6, r14)
            r6 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r6 = r6.mo7631r()
            androidx.compose.ui.c$a r19 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r7 = r19.mo17072u()
            r8 = 0
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.ColumnKt.m9863b(r6, r7, r1, r8)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r13 = r1.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x010c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x010c:
            r1.mo14938T()
            boolean r13 = r1.mo14997l()
            if (r13 == 0) goto L_0x0119
            r1.mo14947W(r12)
            goto L_0x011c
        L_0x0119:
            r1.mo14888A()
        L_0x011c:
            r1.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r13 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r6, r13)
            kotlin.jvm.functions.p r6 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r7, r6)
            kotlin.jvm.functions.p r6 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r6)
            kotlin.jvm.functions.p r6 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r6)
            r1.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r5.invoke(r6, r1, r7)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r5)
            androidx.compose.foundation.layout.ColumnScopeInstance r13 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.ui.m$a r12 = androidx.compose.p004ui.C8767m.f23478j
            r6 = 0
            r7 = 0
            r8 = 0
            r5 = 8
            float r5 = (float) r5
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r10 = 7
            r11 = 0
            r5 = r12
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r5, r6, r7, r8, r9, r10, r11)
            r10 = 0
            r11 = 1
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10114n(r5, r10, r11, r14)
            r6 = 40
            float r8 = (float) r6
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10115o(r5, r6)
            androidx.compose.ui.c$b r6 = r19.mo17068m()
            androidx.compose.ui.m r16 = r13.mo7714e(r5, r6)
            androidx.compose.material.i r20 = androidx.compose.material.C3049i.f8133a
            com.carrefour.fid.android.design.theme.b r21 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r6 = r21.mo114218O()
            long r22 = r21.mo114231a0()
            r24 = 0
            int r26 = androidx.compose.material.C3049i.f8145m
            int r17 = r26 << 9
            r27 = 4
            r5 = r20
            r28 = r8
            r8 = r22
            r22 = r10
            r23 = r11
            r10 = r24
            r29 = r12
            r12 = r1
            r30 = r13
            r13 = r17
            r4 = r14
            r14 = r27
            androidx.compose.material.h r12 = r5.mo10786l(r6, r8, r10, r12, r13, r14)
            r5 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r5)
            boolean r5 = r1.mo15006n0(r2)
            java.lang.Object r6 = r1.mo14921N()
            if (r5 != 0) goto L_0x01c9
            java.lang.Object r5 = r18.mo16277a()
            if (r6 != r5) goto L_0x01d1
        L_0x01c9:
            com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$1$1$1 r6 = new com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$1$1$1
            r6.<init>(r2)
            r1.mo14893C(r6)
        L_0x01d1:
            r1.mo15002m0()
            r5 = r6
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            com.carrefour.fid.android.presentation.ui.loyalty.view.ComposableSingletons$ManageLoyaltyCardButtonsComponentKt r6 = com.carrefour.fid.android.presentation.p035ui.loyalty.view.ComposableSingletons$ManageLoyaltyCardButtonsComponentKt.f61220a
            kotlin.jvm.functions.q r14 = r6.mo72025a()
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r22 = 380(0x17c, float:5.32E-43)
            r6 = r16
            r23 = r15
            r15 = r1
            r16 = r17
            r17 = r22
            androidx.compose.material.ButtonKt.m13345c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5 = r29
            r6 = 0
            r15 = 1
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10114n(r5, r6, r15, r4)
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r28)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10115o(r4, r5)
            androidx.compose.ui.c$b r5 = r19.mo17068m()
            r6 = r30
            androidx.compose.ui.m r4 = r6.mo7714e(r4, r5)
            long r6 = r21.mo114231a0()
            long r8 = r21.mo114218O()
            r10 = 0
            int r13 = r26 << 9
            r14 = 4
            r5 = r20
            r12 = r1
            androidx.compose.material.h r12 = r5.mo10786l(r6, r8, r10, r12, r13, r14)
            com.carrefour.fid.android.design.theme.a r5 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r5 = r5.mo114178a()
            java.lang.Object r6 = r0.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0238
            long r6 = r21.mo114218O()
            goto L_0x023c
        L_0x0238:
            long r6 = r21.mo114252t()
        L_0x023c:
            androidx.compose.foundation.i r11 = androidx.compose.foundation.C2250j.m9695a(r5, r6)
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r5)
            boolean r5 = r1.mo15006n0(r3)
            boolean r6 = r1.mo15006n0(r0)
            r5 = r5 | r6
            java.lang.Object r6 = r1.mo14921N()
            if (r5 != 0) goto L_0x025b
            java.lang.Object r5 = r18.mo16277a()
            if (r6 != r5) goto L_0x0263
        L_0x025b:
            com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$1$2$1 r6 = new com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$1$2$1
            r6.<init>(r3, r0)
            r1.mo14893C(r6)
        L_0x0263:
            r1.mo15002m0()
            r5 = r6
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$1$3 r6 = new com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$1$3
            r6.<init>(r0)
            r0 = 2143337461(0x7fc0bbf5, float:NaN)
            androidx.compose.runtime.internal.a r14 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r0, r15, r6)
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r17 = 316(0x13c, float:4.43E-43)
            r6 = r4
            r15 = r1
            androidx.compose.material.ButtonKt.m13345c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0298
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0298:
            r7 = r23
        L_0x029a:
            androidx.compose.runtime.t1 r6 = r1.mo15020s()
            if (r6 != 0) goto L_0x02a1
            goto L_0x02b3
        L_0x02a1:
            com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$2 r8 = new com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt$ManageLoyaltyCardButtonsComponent$2
            r0 = r8
            r1 = r7
            r2 = r32
            r3 = r33
            r4 = r35
            r5 = r36
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r8)
        L_0x02b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.view.ManageLoyaltyCardButtonsComponentKt.m107683a(androidx.compose.ui.m, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m107684b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1267268474);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1267268474, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.view.ManageLoyaltyCardButtonsPreview (ManageLoyaltyCardButtonsComponent.kt:106)");
            }
            ThemeKt.m153788a(ComposableSingletons$ManageLoyaltyCardButtonsComponentKt.f61220a.mo72026b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C24645x5588e717(i));
        }
    }
}
