package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCreateLoyaltyStepOneScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateLoyaltyStepOneScreen.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/compose/CreateLoyaltyStepOneScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,137:1\n154#2:138\n154#2:172\n154#2:173\n154#2:181\n154#2:182\n154#2:216\n154#2:250\n154#2:284\n74#3,6:139\n80#3:171\n74#3,6:251\n80#3:283\n84#3:289\n84#3:304\n75#4:145\n76#4,11:147\n75#4:189\n76#4,11:191\n75#4:223\n76#4,11:225\n75#4:257\n76#4,11:259\n89#4:288\n89#4:293\n89#4:298\n89#4:303\n76#5:146\n76#5:190\n76#5:224\n76#5:258\n460#6,13:158\n36#6:174\n460#6,13:202\n460#6,13:236\n460#6,13:270\n473#6,3:285\n473#6,3:290\n473#6,3:295\n473#6,3:300\n1114#7,6:175\n67#8,6:183\n73#8:215\n77#8:299\n75#9,6:217\n81#9:249\n85#9:294\n*S KotlinDebug\n*F\n+ 1 CreateLoyaltyStepOneScreen.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/compose/CreateLoyaltyStepOneScreenKt\n*L\n57#1:138\n68#1:172\n77#1:173\n87#1:181\n92#1:182\n97#1:216\n107#1:250\n116#1:284\n54#1:139,6\n54#1:171\n104#1:251,6\n104#1:283\n104#1:289\n54#1:304\n54#1:145\n54#1:147,11\n89#1:189\n89#1:191,11\n94#1:223\n94#1:225,11\n104#1:257\n104#1:259,11\n104#1:288\n94#1:293\n89#1:298\n54#1:303\n54#1:146\n89#1:190\n94#1:224\n104#1:258\n54#1:158,13\n82#1:174\n89#1:202,13\n94#1:236,13\n104#1:270,13\n104#1:285,3\n94#1:290,3\n89#1:295,3\n54#1:300,3\n82#1:175,6\n89#1:183,6\n89#1:215\n89#1:299\n94#1:217,6\n94#1:249\n94#1:294\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneScreenKt */
public final class CreateLoyaltyStepOneScreenKt {
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m107089a(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-445959611);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-445959611, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyStepOnePreview (CreateLoyaltyStepOneScreen.kt:130)");
            }
            m107090b(C28892e.C28896d.f70785b, CreateLoyaltyStepOneScreenKt$CreateLoyaltyStepOnePreview$1.f60845f, o, C28892e.C28896d.f70786c | 48);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CreateLoyaltyStepOneScreenKt$CreateLoyaltyStepOnePreview$2(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m107090b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.shared.type.C28892e<kotlin.C11079d2> r41, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r42, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r43, int r44) {
        /*
            r0 = r41
            r1 = r42
            r2 = r44
            java.lang.String r3 = "loyaltyCardCreatedResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "onValidateCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = -1431842080(0xffffffffaaa7d2e0, float:-2.9811483E-13)
            r4 = r43
            androidx.compose.runtime.o r15 = r4.mo15009o(r3)
            r4 = r2 & 14
            if (r4 != 0) goto L_0x0028
            boolean r4 = r15.mo15006n0(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r2
            goto L_0x0029
        L_0x0028:
            r4 = r2
        L_0x0029:
            r5 = r2 & 112(0x70, float:1.57E-43)
            r6 = 32
            r14 = 16
            if (r5 != 0) goto L_0x003b
            boolean r5 = r15.mo14927P(r1)
            if (r5 == 0) goto L_0x0039
            r5 = r6
            goto L_0x003a
        L_0x0039:
            r5 = r14
        L_0x003a:
            r4 = r4 | r5
        L_0x003b:
            r5 = r4 & 91
            r7 = 18
            if (r5 != r7) goto L_0x004e
            boolean r5 = r15.mo15011p()
            if (r5 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            r15.mo14958a0()
            r0 = r15
            goto L_0x04f1
        L_0x004e:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x005a
            r5 = -1
            java.lang.String r7 = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneScreen (CreateLoyaltyStepOneScreen.kt:49)"
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r4, r5, r7)
        L_0x005a:
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r12 = 0
            r11 = 1
            r10 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r12, r11, r10)
            float r5 = (float) r14
            float r17 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            float r19 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            float r8 = (float) r6
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            r20 = 0
            r21 = 8
            r22 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.c$a r29 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r6 = r29.mo17068m()
            r9 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement r30 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r7 = r30.mo7631r()
            r9 = 48
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.ColumnKt.m9863b(r7, r6, r15, r9)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r9)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r15.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r15.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r31 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r31.mo44585a()
            kotlin.jvm.functions.q r4 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r4)
            androidx.compose.runtime.d r12 = r15.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x00cc
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00cc:
            r15.mo14938T()
            boolean r12 = r15.mo14997l()
            if (r12 == 0) goto L_0x00d9
            r15.mo14947W(r11)
            goto L_0x00dc
        L_0x00d9:
            r15.mo14888A()
        L_0x00dc:
            r15.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r12 = r31.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r12)
            kotlin.jvm.functions.p r6 = r31.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r6)
            kotlin.jvm.functions.p r6 = r31.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r6)
            kotlin.jvm.functions.p r6 = r31.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r10, r6)
            r15.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            r12 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r4.invoke(r6, r15, r7)
            r11 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r11)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r4 = 2131953038(0x7f13058e, float:1.9542536E38)
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r15, r12)
            com.carrefour.fid.android.design.theme.b r32 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r6 = r32.mo114212I()
            r9 = 20
            long r9 = androidx.compose.p004ui.unit.C16506u.m74712m(r9)
            r33 = r8
            r8 = r9
            androidx.compose.material.t0 r10 = androidx.compose.material.C7933t0.f19075a
            int r13 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r16 = r10.mo11077c(r15, r13)
            androidx.compose.ui.text.p0 r24 = r16.mo11097j()
            androidx.compose.ui.text.style.i$a r34 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r16 = r34.mo47667a()
            r20 = 0
            r35 = r5
            r5 = r20
            r36 = r10
            r10 = r20
            r17 = 0
            r11 = r17
            r12 = r17
            r17 = 0
            r37 = r13
            r38 = r14
            r13 = r17
            r17 = 0
            r43 = r15
            r15 = r17
            androidx.compose.ui.text.style.i r16 = androidx.compose.p004ui.text.style.C16432i.m74172g(r16)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 3072(0xc00, float:4.305E-42)
            r27 = 0
            r28 = 65010(0xfdf2, float:9.1098E-41)
            r25 = r43
            androidx.compose.material.TextKt.m14196c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4 = 8
            float r15 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r15)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r4)
            r13 = 6
            r14 = r43
            androidx.compose.foundation.layout.C2428y0.m10726a(r4, r14, r13)
            r4 = 2131953037(0x7f13058d, float:1.9542534E38)
            r12 = 0
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r14, r12)
            long r6 = r32.mo114207D()
            r11 = r36
            r10 = r37
            androidx.compose.material.w1 r5 = r11.mo11077c(r14, r10)
            androidx.compose.ui.text.p0 r24 = com.carrefour.fid.android.design.theme.C37477d.m153890b(r5)
            int r16 = r34.mo47667a()
            r5 = 0
            r8 = 0
            r17 = 0
            r39 = r10
            r10 = r17
            r40 = r11
            r11 = r17
            r12 = r17
            r17 = 0
            r13 = r17
            r17 = 0
            r34 = r15
            r15 = r17
            androidx.compose.ui.text.style.i r16 = androidx.compose.p004ui.text.style.C16432i.m74172g(r16)
            r17 = 0
            r26 = 0
            r28 = 65018(0xfdfa, float:9.111E-41)
            androidx.compose.material.TextKt.m14196c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r33)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r4)
            r15 = r43
            r14 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r4, r15, r14)
            com.carrefour.fid.android.design.components.compose.c$a r4 = com.carrefour.fid.android.design.components.compose.C36971c.C36972a.f92358a
            boolean r5 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r5 == 0) goto L_0x01e7
            com.carrefour.fid.android.design.components.compose.d$f r5 = com.carrefour.fid.android.design.components.compose.C36975d.C36981f.f92374a
            goto L_0x01e9
        L_0x01e7:
            com.carrefour.fid.android.design.components.compose.d$d r5 = com.carrefour.fid.android.design.components.compose.C36975d.C36979d.f92370a
        L_0x01e9:
            r6 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r6)
            boolean r6 = r15.mo15006n0(r1)
            java.lang.Object r7 = r15.mo14921N()
            if (r6 != 0) goto L_0x0201
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r7 != r6) goto L_0x0209
        L_0x0201:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneScreenKt$CreateLoyaltyStepOneScreen$1$1$1 r7 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneScreenKt$CreateLoyaltyStepOneScreen$1$1$1
            r7.<init>(r1)
            r15.mo14893C(r7)
        L_0x0209:
            r15.mo15002m0()
            r6 = r7
            kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneScreenKt$CreateLoyaltyStepOneScreen$1$2 r7 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneScreenKt$CreateLoyaltyStepOneScreen$1$2.f60846f
            r8 = 0
            r9 = 2131953046(0x7f130596, float:1.9542552E38)
            r13 = 0
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r9, r15, r13)
            r10 = 0
            r11 = 0
            r12 = 0
            int r13 = com.carrefour.fid.android.design.components.compose.C36971c.C36972a.f92359b
            r13 = r13 | 3136(0xc40, float:4.394E-42)
            r16 = 464(0x1d0, float:6.5E-43)
            r17 = r13
            r13 = r15
            r14 = r17
            r0 = r15
            r15 = r16
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt.m151374b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r33)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r4)
            r15 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r4, r0, r15)
            r12 = 0
            r13 = 1
            r14 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r12, r13, r14)
            long r5 = r32.mo114234c()
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r34)
            androidx.compose.foundation.shape.n r7 = androidx.compose.foundation.shape.C2694o.m12166h(r7)
            androidx.compose.ui.m r4 = androidx.compose.foundation.BackgroundKt.m8824c(r4, r5, r7)
            r5 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r0.mo14918M(r5)
            androidx.compose.ui.c r5 = r29.mo17061C()
            r11 = 0
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.BoxKt.m9849k(r5, r11, r0, r11)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo14918M(r10)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r0.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r0.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r0.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r9 = r31.mo44585a()
            kotlin.jvm.functions.q r4 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r4)
            androidx.compose.runtime.d r15 = r0.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x0297
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0297:
            r0.mo14938T()
            boolean r15 = r0.mo14997l()
            if (r15 == 0) goto L_0x02a4
            r0.mo14947W(r9)
            goto L_0x02a7
        L_0x02a4:
            r0.mo14888A()
        L_0x02a7:
            r0.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r0)
            kotlin.jvm.functions.p r15 = r31.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r15)
            kotlin.jvm.functions.p r5 = r31.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r5)
            kotlin.jvm.functions.p r5 = r31.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r5)
            kotlin.jvm.functions.p r5 = r31.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r5)
            r0.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r0)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r4.invoke(r5, r0, r6)
            r15 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo14918M(r15)
            androidx.compose.foundation.layout.BoxScopeInstance r4 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r12, r13, r14)
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r35)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10024k(r4, r5)
            r5 = 693286680(0x2952b718, float:4.6788176E-14)
            r0.mo14918M(r5)
            androidx.compose.foundation.layout.Arrangement$d r5 = r30.mo7630p()
            androidx.compose.ui.c$c r6 = r29.mo17073w()
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.RowKt.m10071d(r5, r6, r0, r11)
            r0.mo14918M(r10)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r0.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r0.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r0.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r9 = r31.mo44585a()
            kotlin.jvm.functions.q r4 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r4)
            androidx.compose.runtime.d r10 = r0.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x0336
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0336:
            r0.mo14938T()
            boolean r10 = r0.mo14997l()
            if (r10 == 0) goto L_0x0343
            r0.mo14947W(r9)
            goto L_0x0346
        L_0x0343:
            r0.mo14888A()
        L_0x0346:
            r0.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r0)
            kotlin.jvm.functions.p r10 = r31.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r10)
            kotlin.jvm.functions.p r5 = r31.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r5)
            kotlin.jvm.functions.p r5 = r31.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r5)
            kotlin.jvm.functions.p r5 = r31.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r5)
            r0.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r0)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r4.invoke(r5, r0, r6)
            r0.mo14918M(r15)
            androidx.compose.foundation.layout.RowScopeInstance r4 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r4 = 2131231186(0x7f0801d2, float:1.8078446E38)
            androidx.compose.ui.graphics.painter.Painter r4 = androidx.compose.p004ui.res.C16015f.m71849d(r4, r0, r11)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r16 = 56
            r17 = 124(0x7c, float:1.74E-43)
            r15 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15 = r11
            r11 = r0
            r15 = r12
            r12 = r16
            r1 = r13
            r13 = r17
            androidx.compose.foundation.ImageKt.m8967b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.ui.m r18 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r15, r1, r14)
            float r19 = androidx.compose.p004ui.unit.C16483g.m74435M(r34)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 14
            r24 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r18, r19, r20, r21, r22, r23, r24)
            r4 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r0.mo14918M(r4)
            androidx.compose.foundation.layout.Arrangement$l r4 = r30.mo7631r()
            androidx.compose.ui.c$b r5 = r29.mo17072u()
            r6 = 0
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r5, r0, r6)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo14918M(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r0.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r0.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r0.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            kotlin.jvm.functions.a r8 = r31.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r9 = r0.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x03ff
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x03ff:
            r0.mo14938T()
            boolean r9 = r0.mo14997l()
            if (r9 == 0) goto L_0x040c
            r0.mo14947W(r8)
            goto L_0x040f
        L_0x040c:
            r0.mo14888A()
        L_0x040f:
            r0.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r0)
            kotlin.jvm.functions.p r9 = r31.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r9)
            kotlin.jvm.functions.p r4 = r31.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r4)
            kotlin.jvm.functions.p r4 = r31.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r4)
            kotlin.jvm.functions.p r4 = r31.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r7, r4)
            r0.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r0)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r15 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r1.invoke(r4, r0, r5)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo14918M(r1)
            r1 = 2131953036(0x7f13058c, float:1.9542532E38)
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r0, r15)
            r5 = 0
            long r6 = r32.mo114212I()
            long r8 = androidx.compose.p004ui.unit.C16506u.m74712m(r38)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r1 = 0
            r15 = r1
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r5 = r39
            r1 = r40
            androidx.compose.material.w1 r24 = r1.mo11077c(r0, r5)
            androidx.compose.ui.text.p0 r24 = com.carrefour.fid.android.design.theme.C37477d.m153891c(r24)
            r26 = 3072(0xc00, float:4.305E-42)
            r27 = 0
            r28 = 65522(0xfff2, float:9.1816E-41)
            r25 = r0
            r2 = r5
            r5 = 0
            androidx.compose.material.TextKt.m14196c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4 = 4
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r4)
            r4 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r0, r4)
            r3 = 2131953035(0x7f13058b, float:1.954253E38)
            r4 = 0
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r0, r4)
            androidx.compose.material.w1 r1 = r1.mo11077c(r0, r2)
            androidx.compose.ui.text.p0 r24 = com.carrefour.fid.android.design.theme.C37477d.m153906r(r1)
            long r6 = r32.mo114257y()
            r5 = 0
            r8 = 0
            r15 = 0
            r26 = 0
            r28 = 65530(0xfffa, float:9.1827E-41)
            androidx.compose.material.TextKt.m14196c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x04f1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04f1:
            androidx.compose.runtime.t1 r0 = r0.mo15020s()
            if (r0 != 0) goto L_0x04f8
            goto L_0x0506
        L_0x04f8:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneScreenKt$CreateLoyaltyStepOneScreen$2 r1 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneScreenKt$CreateLoyaltyStepOneScreen$2
            r2 = r41
            r3 = r42
            r4 = r44
            r1.<init>(r2, r3, r4)
            r0.mo15202a(r1)
        L_0x0506:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneScreenKt.m107090b(com.carrefour.fid.android.shared.type.e, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m107091c(@C12579k InitLoyaltyCardViewModel initLoyaltyCardViewModel, @C12580l C11300l<? super String, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(initLoyaltyCardViewModel, "viewModel");
        C8592o o = oVar.mo15009o(-2001974758);
        if ((i2 & 2) != 0) {
            lVar = CreateLoyaltyStepOneScreenKt$CreateLoyaltyStepOneStateful$1.f60847f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2001974758, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyStepOneStateful (CreateLoyaltyStepOneScreen.kt:36)");
        }
        m107090b(C8415c2.m30233b(initLoyaltyCardViewModel.getLoyaltyCardCreatedResult(), (CoroutineContext) null, o, 8, 1).getValue(), lVar, o, C28892e.f70778a | (i & 112));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CreateLoyaltyStepOneScreenKt$CreateLoyaltyStepOneStateful$2(initLoyaltyCardViewModel, lVar, i, i2));
        }
    }
}
