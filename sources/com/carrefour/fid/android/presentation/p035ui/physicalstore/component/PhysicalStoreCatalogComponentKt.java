package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nPhysicalStoreCatalogComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreCatalogComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreCatalogComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,68:1\n74#2,6:69\n80#2:101\n84#2:114\n75#3:75\n76#3,11:77\n89#3:113\n76#4:76\n460#5,13:88\n36#5:103\n473#5,3:110\n154#6:102\n1114#7,6:104\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreCatalogComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreCatalogComponentKt\n*L\n27#1:69,6\n27#1:101\n27#1:114\n27#1:75\n27#1:77,11\n27#1:113\n27#1:76\n27#1:88,13\n46#1:103\n27#1:110,3\n30#1:102\n46#1:104,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreCatalogComponentKt */
public final class PhysicalStoreCatalogComponentKt {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109577a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r23, boolean r24, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r2 = r24
            r4 = r27
            r0 = 909021338(0x362e909a, float:2.601219E-6)
            r1 = r26
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0017
            r5 = r4 | 6
            r6 = r5
            r5 = r23
            goto L_0x002b
        L_0x0017:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x0028
            r5 = r23
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x0025
            r6 = 4
            goto L_0x0026
        L_0x0025:
            r6 = 2
        L_0x0026:
            r6 = r6 | r4
            goto L_0x002b
        L_0x0028:
            r5 = r23
            r6 = r4
        L_0x002b:
            r7 = r28 & 2
            r8 = 16
            if (r7 == 0) goto L_0x0034
            r6 = r6 | 48
            goto L_0x0043
        L_0x0034:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0043
            boolean r7 = r1.mo14961b(r2)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0042
        L_0x0041:
            r7 = r8
        L_0x0042:
            r6 = r6 | r7
        L_0x0043:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x004a
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x005d
        L_0x004a:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005d
            r9 = r25
            boolean r10 = r1.mo14927P(r9)
            if (r10 == 0) goto L_0x0059
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r6 = r6 | r10
            goto L_0x005f
        L_0x005d:
            r9 = r25
        L_0x005f:
            r10 = r6 & 731(0x2db, float:1.024E-42)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0072
            boolean r10 = r1.mo15011p()
            if (r10 != 0) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            r1.mo14958a0()
            r3 = r5
            goto L_0x01ca
        L_0x0072:
            if (r3 == 0) goto L_0x0077
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0078
        L_0x0077:
            r3 = r5
        L_0x0078:
            if (r7 == 0) goto L_0x007e
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreCatalogComponentKt$PhysicalStoreCatalogComponent$1 r5 = com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreCatalogComponentKt$PhysicalStoreCatalogComponent$1.f62506f
            r15 = r5
            goto L_0x007f
        L_0x007e:
            r15 = r9
        L_0x007f:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x008b
            r5 = -1
            java.lang.String r7 = "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreCatalogComponent (PhysicalStoreCatalogComponent.kt:21)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r5, r7)
        L_0x008b:
            r0 = 0
            r5 = 0
            r6 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r0, r6, r5)
            androidx.compose.ui.c$a r5 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r5 = r5.mo17068m()
            r6 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r6 = r6.mo7631r()
            r7 = 48
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.ColumnKt.m9863b(r6, r5, r1, r7)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r1.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.platform.c4 r9 = (androidx.compose.p004ui.platform.C15863c4) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r10.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r12 = r1.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x00e3
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00e3:
            r1.mo14938T()
            boolean r12 = r1.mo14997l()
            if (r12 == 0) goto L_0x00f0
            r1.mo14947W(r11)
            goto L_0x00f3
        L_0x00f0:
            r1.mo14888A()
        L_0x00f3:
            r1.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r12 = r10.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r5, r12)
            kotlin.jvm.functions.p r5 = r10.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r5)
            kotlin.jvm.functions.p r5 = r10.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r5)
            kotlin.jvm.functions.p r5 = r10.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r5)
            r1.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r0.invoke(r5, r1, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r0 = 2131953494(0x7f130756, float:1.954346E38)
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r6)
            androidx.compose.ui.m$a r9 = androidx.compose.p004ui.C8767m.f23478j
            r17 = 0
            r18 = 0
            r19 = 0
            float r5 = (float) r8
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r21 = 7
            r22 = 0
            r16 = r9
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r7 = 6
            com.carrefour.fid.android.presentation.p035ui.physicalstore.PhysicalStoreScreenKt.m109462e(r5, r0, r1, r7, r6)
            if (r2 == 0) goto L_0x0159
            r0 = 2131952851(0x7f1304d3, float:1.9542156E38)
            goto L_0x015c
        L_0x0159:
            r0 = 2131952852(0x7f1304d4, float:1.9542158E38)
        L_0x015c:
            androidx.compose.ui.graphics.j2$a r5 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r10 = r5.mo42852w()
            r12 = 0
            r13 = 2
            r14 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.BackgroundKt.m8825d(r9, r10, r12, r13, r14)
            r7 = 2131952853(0x7f1304d5, float:1.954216E38)
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r7, r1, r6)
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r6)
            com.carrefour.fid.android.design.components.compose.g r10 = com.carrefour.fid.android.design.components.compose.C36987g.f92392a
            r8 = 2131099849(0x7f0600c9, float:1.7812063E38)
            long r11 = androidx.compose.p004ui.res.C16009b.m71825a(r8, r1, r6)
            r8 = 0
            r9 = 2131231167(0x7f0801bf, float:1.8078407E38)
            r13 = 0
            r6 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r6)
            boolean r6 = r1.mo15006n0(r15)
            java.lang.Object r14 = r1.mo14921N()
            if (r6 != 0) goto L_0x019a
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r14 != r6) goto L_0x01a2
        L_0x019a:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreCatalogComponentKt$PhysicalStoreCatalogComponent$2$1$1 r14 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreCatalogComponentKt$PhysicalStoreCatalogComponent$2$1$1
            r14.<init>(r15)
            r1.mo14893C(r14)
        L_0x01a2:
            r1.mo15002m0()
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            int r6 = com.carrefour.fid.android.design.components.compose.C36987g.f92393b
            int r16 = r6 << 15
            r17 = 136(0x88, float:1.9E-43)
            r6 = r7
            r7 = r0
            r0 = r15
            r15 = r1
            com.carrefour.fid.android.design.components.compose.BannerComponentKt.m151326b(r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x01c9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01c9:
            r9 = r0
        L_0x01ca:
            androidx.compose.runtime.t1 r6 = r1.mo15020s()
            if (r6 != 0) goto L_0x01d1
            goto L_0x01e2
        L_0x01d1:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreCatalogComponentKt$PhysicalStoreCatalogComponent$3 r7 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreCatalogComponentKt$PhysicalStoreCatalogComponent$3
            r0 = r7
            r1 = r3
            r2 = r24
            r3 = r9
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreCatalogComponentKt.m109577a(androidx.compose.ui.m, boolean, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109578b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1530298049);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1530298049, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreCatalogComponentPreview (PhysicalStoreCatalogComponent.kt:62)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreCatalogComponentKt.f62411a.mo73917b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25349xbe319ad4(i));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109579c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-477562973);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-477562973, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreCatalogStoreSelectedComponentPreview (PhysicalStoreCatalogComponent.kt:54)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreCatalogComponentKt.f62411a.mo73916a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25350x7696d618(i));
        }
    }
}
