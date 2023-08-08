package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.components.compose.ExpandButtonPosition;
import com.carrefour.fid.android.design.components.compose.ExpandableComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import java.util.List;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCharacteristic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Characteristic.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/CharacteristicKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,166:1\n36#2:167\n460#2,13:193\n473#2,3:210\n1114#3,6:168\n75#4,6:174\n81#4:206\n85#4:214\n75#5:180\n76#5,11:182\n89#5:213\n76#6:181\n154#7:207\n154#7:208\n154#7:209\n*S KotlinDebug\n*F\n+ 1 Characteristic.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/CharacteristicKt\n*L\n52#1:167\n88#1:193,13\n88#1:210,3\n52#1:168,6\n88#1:174,6\n88#1:206\n88#1:214\n88#1:180\n88#1:182,11\n88#1:213\n88#1:181\n97#1:207\n104#1:208\n110#1:209\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.CharacteristicKt */
public final class CharacteristicKt {

    /* renamed from: a */
    public static final int f67579a = 4;

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m117108a(@C12579k List<Pair<String, String>> list, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l C8767m mVar, int i, @C12579k C11300l<? super Float, C11079d2> lVar, @C12580l C8592o oVar, int i2, int i3) {
        C8767m mVar2;
        int i4;
        int i5;
        boolean z;
        List<Pair<String, String>> list2 = list;
        C11300l<? super Float, C11079d2> lVar2 = lVar;
        int i6 = i2;
        Intrinsics.checkNotNullParameter(list2, "data");
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "labelMore");
        Intrinsics.checkNotNullParameter(str3, "labelLess");
        Intrinsics.checkNotNullParameter(lVar2, "onScrollPositionKnown");
        C8592o o = oVar.mo15009o(-1257136019);
        if ((i3 & 16) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i3 & 32) != 0) {
            i4 = 4;
        } else {
            i4 = i;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1257136019, i6, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.Characteristic (Characteristic.kt:36)");
        }
        if (!list2.isEmpty()) {
            if (list.size() > 4) {
                z = true;
            } else {
                z = false;
            }
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new CharacteristicKt$Characteristic$1$1(lVar2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            int i7 = i6 >> 3;
            i5 = i4;
            ExpandableComponentKt.m151485a(str, str2, str3, SemanticsModifierKt.m71867b(OnGloballyPositionedModifierKt.m68999a(mVar2, (C11300l) N), true, new CharacteristicKt$Characteristic$2(list2)), z, false, (C8734c.C8736b) null, (ExpandButtonPosition) null, 0, 0, (C11300l<? super Boolean, C11079d2>) null, C8553b.m31048b(o, -2039451732, true, new CharacteristicKt$Characteristic$3(list2, i4)), o, (i7 & 14) | (i7 & 112) | (i7 & 896), 48, 2016);
        } else {
            i5 = i4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CharacteristicKt$Characteristic$4(list, str, str2, str3, mVar2, i5, lVar, i2, i3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117109b(long r33, @org.jetbrains.annotations.C12579k java.lang.String r35, @org.jetbrains.annotations.C12579k java.lang.String r36, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40) {
        /*
            r0 = r35
            r15 = r36
            r13 = r39
            java.lang.String r1 = "labelLeft"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "labelRight"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            r1 = 139504454(0x850ab46, float:6.2794054E-34)
            r2 = r38
            androidx.compose.runtime.o r14 = r2.mo15009o(r1)
            r2 = r40 & 1
            if (r2 == 0) goto L_0x0022
            r2 = r13 | 6
            r11 = r33
            goto L_0x0034
        L_0x0022:
            r2 = r13 & 14
            r11 = r33
            if (r2 != 0) goto L_0x0033
            boolean r2 = r14.mo14980g(r11)
            if (r2 == 0) goto L_0x0030
            r2 = 4
            goto L_0x0031
        L_0x0030:
            r2 = 2
        L_0x0031:
            r2 = r2 | r13
            goto L_0x0034
        L_0x0033:
            r2 = r13
        L_0x0034:
            r3 = r40 & 2
            if (r3 == 0) goto L_0x003b
            r2 = r2 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            boolean r3 = r14.mo15006n0(r0)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r2 = r2 | r3
        L_0x004b:
            r3 = r40 & 4
            if (r3 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0062
            boolean r3 = r14.mo15006n0(r15)
            if (r3 == 0) goto L_0x005f
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r2 = r2 | r3
        L_0x0062:
            r3 = r40 & 8
            if (r3 == 0) goto L_0x0069
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r4 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x007c
            r4 = r37
            boolean r5 = r14.mo15006n0(r4)
            if (r5 == 0) goto L_0x0078
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r2 = r2 | r5
            goto L_0x007e
        L_0x007c:
            r4 = r37
        L_0x007e:
            r9 = r2
            r2 = r9 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r2 != r5) goto L_0x0094
            boolean r2 = r14.mo15011p()
            if (r2 != 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            r14.mo14958a0()
            r5 = r4
            r26 = r14
            goto L_0x0239
        L_0x0094:
            if (r3 == 0) goto L_0x009b
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r25 = r2
            goto L_0x009d
        L_0x009b:
            r25 = r4
        L_0x009d:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00a9
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.product.presentation.ui.details.views.CharacteristicItem (Characteristic.kt:81)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r9, r2, r3)
        L_0x00a9:
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r1 = r1.mo17070q()
            r6 = 0
            r7 = 2
            r8 = 0
            r3 = r25
            r4 = r33
            androidx.compose.ui.m r2 = androidx.compose.foundation.BackgroundKt.m8825d(r3, r4, r6, r7, r8)
            androidx.compose.foundation.layout.IntrinsicSize r3 = androidx.compose.foundation.layout.IntrinsicSize.Min
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.C2426y.m10722a(r2, r3)
            r3 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r3)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r3 = r3.mo7630p()
            r4 = 48
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.RowKt.m10071d(r3, r1, r14, r4)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r7 = r6.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r8 = r14.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x010b
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x010b:
            r14.mo14938T()
            boolean r8 = r14.mo14997l()
            if (r8 == 0) goto L_0x0118
            r14.mo14947W(r7)
            goto L_0x011b
        L_0x0118:
            r14.mo14888A()
        L_0x011b:
            r14.mo14941U()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r8 = r6.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r7, r1, r8)
            kotlin.jvm.functions.p r1 = r6.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r7, r3, r1)
            kotlin.jvm.functions.p r1 = r6.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r7, r4, r1)
            kotlin.jvm.functions.p r1 = r6.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r7, r5, r1)
            r14.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r10 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2.invoke(r1, r14, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r1)
            androidx.compose.foundation.layout.RowScopeInstance r26 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = 2
            r7 = 0
            r2 = r26
            r3 = r8
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.C2411u0.m10660e(r2, r3, r4, r5, r6, r7)
            r2 = 8
            float r7 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10024k(r1, r2)
            r2 = 0
            r4 = 0
            r6 = 0
            r16 = 0
            r27 = r7
            r7 = r16
            r28 = r8
            r8 = r16
            r16 = 0
            r29 = r9
            r9 = r16
            r16 = 0
            r11 = r16
            r12 = 0
            r16 = 0
            r2 = r14
            r13 = r16
            r3 = 0
            r15 = r3
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
            int r4 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r5 = r3.mo11077c(r2, r4)
            androidx.compose.ui.text.p0 r20 = com.carrefour.fid.android.design.theme.C37477d.m153905q(r5)
            int r5 = r29 >> 3
            r22 = r5 & 14
            r23 = 0
            r24 = 65532(0xfffc, float:9.183E-41)
            r0 = r35
            r21 = r2
            r30 = r2
            r31 = r3
            r32 = r4
            r2 = 0
            r4 = 0
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            int r0 = com.carrefour.fid.android.product.C27609f.C27615f.ds_grey_40
            r15 = r30
            r1 = 0
            long r3 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r15, r1)
            r0 = 0
            r1 = 0
            r2 = 1
            r10 = r28
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10110j(r10, r0, r2, r1)
            float r1 = (float) r2
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10092H(r0, r1)
            r5 = 0
            r6 = 0
            r8 = 6
            r9 = 12
            r7 = r15
            androidx.compose.material.DividerKt.m13428a(r2, r3, r5, r6, r7, r8, r9)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = 2
            r7 = 0
            r2 = r26
            r3 = r10
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.C2411u0.m10660e(r2, r3, r4, r5, r6, r7)
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r27)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r1)
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r0 = 0
            r2 = r15
            r15 = r0
            r0 = r31
            r3 = r32
            androidx.compose.material.w1 r0 = r0.mo11077c(r2, r3)
            androidx.compose.ui.text.p0 r20 = com.carrefour.fid.android.design.theme.C37477d.m153906r(r0)
            int r0 = r29 >> 6
            r22 = r0 & 14
            r0 = r36
            r21 = r2
            r26 = r2
            r2 = 0
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r26.mo15002m0()
            r26.mo14896D()
            r26.mo15002m0()
            r26.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0237
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0237:
            r5 = r25
        L_0x0239:
            androidx.compose.runtime.t1 r8 = r26.mo15020s()
            if (r8 != 0) goto L_0x0240
            goto L_0x0253
        L_0x0240:
            com.carrefour.fid.android.product.presentation.ui.details.views.CharacteristicKt$CharacteristicItem$2 r9 = new com.carrefour.fid.android.product.presentation.ui.details.views.CharacteristicKt$CharacteristicItem$2
            r0 = r9
            r1 = r33
            r3 = r35
            r4 = r36
            r6 = r39
            r7 = r40
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x0253:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.views.CharacteristicKt.m117109b(long, java.lang.String, java.lang.String, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m117110c(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1725741302);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1725741302, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.CharacteristicItemPreview (Characteristic.kt:117)");
            }
            ThemeKt.m153788a(ComposableSingletons$CharacteristicKt.f67585a.mo81150b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CharacteristicKt$CharacteristicItemPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m117111d(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-423042524);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-423042524, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.CharacteristicItemSecondRowPreview (Characteristic.kt:131)");
            }
            ThemeKt.m153788a(ComposableSingletons$CharacteristicKt.f67585a.mo81152d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CharacteristicKt$CharacteristicItemSecondRowPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m117112e(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-722215613);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-722215613, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.CharacteristicPreview (Characteristic.kt:145)");
            }
            ThemeKt.m153788a(ComposableSingletons$CharacteristicKt.f67585a.mo81153e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CharacteristicKt$CharacteristicPreview$1(i));
        }
    }
}
