package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.component;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nValidateConsentBagComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidateConsentBagComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/component/ValidateConsentBagComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,53:1\n73#2,7:54\n80#2:87\n84#2:101\n75#3:61\n76#3,11:63\n89#3:100\n76#4:62\n460#5,13:74\n36#5:88\n473#5,3:97\n1114#6,6:89\n154#7:95\n164#7:96\n*S KotlinDebug\n*F\n+ 1 ValidateConsentBagComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/component/ValidateConsentBagComponentKt\n*L\n26#1:54,7\n26#1:87\n26#1:101\n26#1:61\n26#1:63,11\n26#1:100\n26#1:62\n26#1:74,13\n28#1:88\n26#1:97,3\n28#1:89,6\n30#1:95\n31#1:96\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.component.ValidateConsentBagComponentKt */
public final class ValidateConsentBagComponentKt {
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104226a(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-658494749);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-658494749, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.component.PreviewButton (ValidateConsentBagComponent.kt:45)");
            }
            ThemeKt.m153788a(ComposableSingletons$ValidateConsentBagComponentKt.f59140a.mo68411c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ValidateConsentBagComponentKt$PreviewButton$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.carrefour.fid.android.presentation.ui.checkout.al.component.ValidateConsentBagComponentKt$ValidateConsentBagComponent$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104227b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r24, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r0 = r27
            r1 = r28
            r2 = 1002716543(0x3bc43d7f, float:0.005988776)
            r3 = r26
            androidx.compose.runtime.o r15 = r3.mo15009o(r2)
            r3 = r1 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0018
            r5 = r0 | 6
            r6 = r5
            r5 = r24
            goto L_0x002c
        L_0x0018:
            r5 = r0 & 14
            if (r5 != 0) goto L_0x0029
            r5 = r24
            boolean r6 = r15.mo15006n0(r5)
            if (r6 == 0) goto L_0x0026
            r6 = 4
            goto L_0x0027
        L_0x0026:
            r6 = r4
        L_0x0027:
            r6 = r6 | r0
            goto L_0x002c
        L_0x0029:
            r5 = r24
            r6 = r0
        L_0x002c:
            r7 = r1 & 2
            r8 = 16
            if (r7 == 0) goto L_0x0035
            r6 = r6 | 48
            goto L_0x0047
        L_0x0035:
            r9 = r0 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0047
            r9 = r25
            boolean r10 = r15.mo14927P(r9)
            if (r10 == 0) goto L_0x0044
            r10 = 32
            goto L_0x0045
        L_0x0044:
            r10 = r8
        L_0x0045:
            r6 = r6 | r10
            goto L_0x0049
        L_0x0047:
            r9 = r25
        L_0x0049:
            r10 = r6 & 91
            r11 = 18
            if (r10 != r11) goto L_0x005c
            boolean r10 = r15.mo15011p()
            if (r10 != 0) goto L_0x0056
            goto L_0x005c
        L_0x0056:
            r15.mo14958a0()
            r2 = r15
            goto L_0x01a5
        L_0x005c:
            if (r3 == 0) goto L_0x0063
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r23 = r3
            goto L_0x0065
        L_0x0063:
            r23 = r5
        L_0x0065:
            if (r7 == 0) goto L_0x006b
            com.carrefour.fid.android.presentation.ui.checkout.al.component.ValidateConsentBagComponentKt$ValidateConsentBagComponent$1 r3 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.component.ValidateConsentBagComponentKt$ValidateConsentBagComponent$1.f59147f
            r14 = r3
            goto L_0x006c
        L_0x006b:
            r14 = r9
        L_0x006c:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0078
            r3 = -1
            java.lang.String r5 = "com.carrefour.fid.android.presentation.ui.checkout.al.component.ValidateConsentBagComponent (ValidateConsentBagComponent.kt:21)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r6, r3, r5)
        L_0x0078:
            r2 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r2)
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r3 = r3.mo7631r()
            androidx.compose.ui.c$a r5 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r6 = r5.mo17072u()
            r7 = 0
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.ColumnKt.m9863b(r3, r6, r15, r7)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r15.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r15.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r13 = r15.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x00ca
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00ca:
            r15.mo14938T()
            boolean r13 = r15.mo14997l()
            if (r13 == 0) goto L_0x00d7
            r15.mo14947W(r12)
            goto L_0x00da
        L_0x00d7:
            r15.mo14888A()
        L_0x00da:
            r15.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r13 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r3, r13)
            kotlin.jvm.functions.p r3 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r6, r3)
            kotlin.jvm.functions.p r3 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r3)
            kotlin.jvm.functions.p r3 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r3)
            r15.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r2.invoke(r3, r15, r6)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r2 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r3 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r3)
            boolean r3 = r15.mo15006n0(r14)
            java.lang.Object r6 = r15.mo14921N()
            if (r3 != 0) goto L_0x012f
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r6 != r3) goto L_0x0137
        L_0x012f:
            com.carrefour.fid.android.presentation.ui.checkout.al.component.ValidateConsentBagComponentKt$ValidateConsentBagComponent$2$1$1 r6 = new com.carrefour.fid.android.presentation.ui.checkout.al.component.ValidateConsentBagComponentKt$ValidateConsentBagComponent$2$1$1
            r6.<init>(r14)
            r15.mo14893C(r6)
        L_0x0137:
            r15.mo15002m0()
            r3 = r6
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r17 = 0
            r6 = 24
            float r6 = (float) r6
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            r19 = 0
            float r6 = (float) r8
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            r21 = 5
            r22 = 0
            r16 = r23
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r7 = 4622663542519103488(0x4027000000000000, double:11.5)
            float r7 = (float) r7
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r8 = 0
            r9 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10026m(r6, r7, r8, r4, r9)
            r6 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10113m(r4, r6)
            androidx.compose.ui.c$b r5 = r5.mo17068m()
            androidx.compose.ui.m r4 = r2.mo7714e(r4, r5)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            com.carrefour.fid.android.presentation.ui.checkout.al.component.ComposableSingletons$ValidateConsentBagComponentKt r2 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.component.ComposableSingletons$ValidateConsentBagComponentKt.f59140a
            kotlin.jvm.functions.q r12 = r2.mo68409a()
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r16 = 508(0x1fc, float:7.12E-43)
            r13 = r15
            r17 = r14
            r14 = r2
            r2 = r15
            r15 = r16
            androidx.compose.material.ButtonKt.m13343a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x01a1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01a1:
            r9 = r17
            r5 = r23
        L_0x01a5:
            androidx.compose.runtime.t1 r2 = r2.mo15020s()
            if (r2 != 0) goto L_0x01ac
            goto L_0x01b4
        L_0x01ac:
            com.carrefour.fid.android.presentation.ui.checkout.al.component.ValidateConsentBagComponentKt$ValidateConsentBagComponent$3 r3 = new com.carrefour.fid.android.presentation.ui.checkout.al.component.ValidateConsentBagComponentKt$ValidateConsentBagComponent$3
            r3.<init>(r5, r9, r0, r1)
            r2.mo15202a(r3)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.component.ValidateConsentBagComponentKt.m104227b(androidx.compose.ui.m, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }
}
