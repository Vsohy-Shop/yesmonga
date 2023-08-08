package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nListQuantityComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListQuantityComponent.kt\ncom/carrefour/fid/android/design/components/compose/ListQuantityComponentKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,133:1\n766#2:134\n857#2,2:135\n74#3,6:137\n80#3:169\n84#3:175\n75#4:143\n76#4,11:145\n89#4:174\n75#4:190\n76#4,11:192\n75#4:223\n76#4,11:225\n89#4:253\n89#4:258\n76#5:144\n76#5:191\n76#5:224\n460#6,13:156\n473#6,3:171\n36#6:177\n460#6,13:203\n460#6,13:236\n473#6,3:250\n473#6,3:255\n154#7:170\n154#7:176\n1114#8,6:178\n67#9,6:184\n73#9:216\n77#9:259\n75#10,6:217\n81#10:249\n85#10:254\n*S KotlinDebug\n*F\n+ 1 ListQuantityComponent.kt\ncom/carrefour/fid/android/design/components/compose/ListQuantityComponentKt\n*L\n45#1:134\n45#1:135,2\n48#1:137,6\n48#1:169\n48#1:175\n48#1:143\n48#1:145,11\n48#1:174\n81#1:190\n81#1:192,11\n87#1:223\n87#1:225,11\n87#1:253\n81#1:258\n48#1:144\n81#1:191\n87#1:224\n48#1:156,13\n48#1:171,3\n85#1:177\n81#1:203,13\n87#1:236,13\n87#1:250,3\n81#1:255,3\n56#1:170\n83#1:176\n85#1:178,6\n81#1:184,6\n81#1:216\n81#1:259\n87#1:217,6\n87#1:249\n87#1:254\n*E\n"})
public final class ListQuantityComponentKt {
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d7  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151522a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r36, int r37, int r38, int r39, int r40, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Integer, kotlin.C11079d2> r41, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r42, int r43, int r44) {
        /*
            r7 = r43
            r0 = 1194481088(0x473255c0, float:45653.75)
            r1 = r42
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r44 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r7 | 6
            r4 = r3
            r3 = r36
            goto L_0x0029
        L_0x0015:
            r3 = r7 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r36
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r7
            goto L_0x0029
        L_0x0026:
            r3 = r36
            r4 = r7
        L_0x0029:
            r5 = r44 & 2
            if (r5 == 0) goto L_0x0030
            r4 = r4 | 48
            goto L_0x0043
        L_0x0030:
            r8 = r7 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0043
            r8 = r37
            boolean r9 = r1.mo14976f(r8)
            if (r9 == 0) goto L_0x003f
            r9 = 32
            goto L_0x0041
        L_0x003f:
            r9 = 16
        L_0x0041:
            r4 = r4 | r9
            goto L_0x0045
        L_0x0043:
            r8 = r37
        L_0x0045:
            r9 = r44 & 4
            if (r9 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r10 = r7 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x005f
            r10 = r38
            boolean r11 = r1.mo14976f(r10)
            if (r11 == 0) goto L_0x005b
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r11 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r11
            goto L_0x0061
        L_0x005f:
            r10 = r38
        L_0x0061:
            r11 = r44 & 8
            if (r11 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r12 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x007b
            r12 = r39
            boolean r13 = r1.mo14976f(r12)
            if (r13 == 0) goto L_0x0077
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r13
            goto L_0x007d
        L_0x007b:
            r12 = r39
        L_0x007d:
            r13 = r44 & 16
            if (r13 == 0) goto L_0x0084
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0099
        L_0x0084:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r7
            if (r14 != 0) goto L_0x0099
            r14 = r40
            boolean r15 = r1.mo14976f(r14)
            if (r15 == 0) goto L_0x0095
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r4 = r4 | r15
            goto L_0x009b
        L_0x0099:
            r14 = r40
        L_0x009b:
            r15 = r44 & 32
            if (r15 == 0) goto L_0x00a6
            r16 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r16
            r6 = r41
            goto L_0x00bb
        L_0x00a6:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r7 & r16
            r6 = r41
            if (r16 != 0) goto L_0x00bb
            boolean r16 = r1.mo14927P(r6)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r4 = r4 | r16
        L_0x00bb:
            r16 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r4 & r16
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r3) goto L_0x00d7
            boolean r0 = r1.mo15011p()
            if (r0 != 0) goto L_0x00cc
            goto L_0x00d7
        L_0x00cc:
            r1.mo14958a0()
            r34 = r36
            r2 = r8
            r3 = r10
            r4 = r12
            r5 = r14
            goto L_0x02a6
        L_0x00d7:
            if (r2 == 0) goto L_0x00dd
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r2 = r0
            goto L_0x00df
        L_0x00dd:
            r2 = r36
        L_0x00df:
            r0 = 1
            if (r5 == 0) goto L_0x00e4
            r3 = r0
            goto L_0x00e5
        L_0x00e4:
            r3 = r8
        L_0x00e5:
            if (r9 == 0) goto L_0x00e9
            r5 = r0
            goto L_0x00ea
        L_0x00e9:
            r5 = r10
        L_0x00ea:
            r8 = 0
            if (r11 == 0) goto L_0x00ee
            r12 = r8
        L_0x00ee:
            if (r13 == 0) goto L_0x00f1
            r14 = r0
        L_0x00f1:
            if (r15 == 0) goto L_0x00f5
            com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$1 r6 = com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$1.f92300f
        L_0x00f5:
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0104
            r9 = -1
            java.lang.String r10 = "com.carrefour.fid.android.design.components.compose.ListQuantityComponent (ListQuantityComponent.kt:32)"
            r11 = 1194481088(0x473255c0, float:45653.75)
            androidx.compose.runtime.ComposerKt.m29845w0(r11, r4, r9, r10)
        L_0x0104:
            int r9 = kotlin.ranges.C11479u.m44447u(r12, r8)
            int r10 = kotlin.ranges.C11479u.m44447u(r14, r0)
            int r11 = kotlin.ranges.C11479u.m44447u(r5, r9)
            kotlin.ranges.l r13 = new kotlin.ranges.l
            r13.<init>(r9, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r13.iterator()
        L_0x011e:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x0146
            java.lang.Object r13 = r9.next()
            r15 = r13
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            int r15 = r15 % r10
            r16 = r15 ^ r10
            int r8 = -r15
            r8 = r8 | r15
            r8 = r16 & r8
            int r8 = r8 >> 31
            r8 = r8 & r10
            int r15 = r15 + r8
            if (r15 != 0) goto L_0x013e
            r8 = r0
            goto L_0x013f
        L_0x013e:
            r8 = 0
        L_0x013f:
            if (r8 == 0) goto L_0x0144
            r11.add(r13)
        L_0x0144:
            r8 = 0
            goto L_0x011e
        L_0x0146:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r8 = r11.contains(r8)
            if (r8 != 0) goto L_0x0173
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0159
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0159:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x0160
            goto L_0x0172
        L_0x0160:
            com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$2 r10 = new com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$2
            r0 = r10
            r1 = r2
            r2 = r3
            r3 = r5
            r4 = r12
            r5 = r14
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x0172:
            return
        L_0x0173:
            androidx.compose.ui.c$a r33 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r8 = r33.mo17068m()
            r9 = 0
            r10 = 0
            androidx.compose.ui.m r13 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r9, r0, r10)
            r15 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r15)
            androidx.compose.foundation.layout.Arrangement r15 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r15 = r15.mo7631r()
            r0 = 48
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.ColumnKt.m9863b(r15, r8, r1, r0)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r15 = r1.mo15032w(r15)
            androidx.compose.ui.unit.LayoutDirection r15 = (androidx.compose.p004ui.unit.LayoutDirection) r15
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.platform.c4 r9 = (androidx.compose.p004ui.platform.C15863c4) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r17.mo44585a()
            kotlin.jvm.functions.q r13 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r13)
            r34 = r2
            androidx.compose.runtime.d r2 = r1.mo15017r()
            boolean r2 = r2 instanceof androidx.compose.runtime.C8428d
            if (r2 != 0) goto L_0x01cc
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01cc:
            r1.mo14938T()
            boolean r2 = r1.mo14997l()
            if (r2 == 0) goto L_0x01d9
            r1.mo14947W(r10)
            goto L_0x01dc
        L_0x01d9:
            r1.mo14888A()
        L_0x01dc:
            r1.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r10 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r0, r10)
            kotlin.jvm.functions.p r0 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r8, r0)
            kotlin.jvm.functions.p r0 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r15, r0)
            kotlin.jvm.functions.p r0 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r9, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r2 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r13.invoke(r0, r1, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36912p.quantity_backdrop_title
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r2)
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r2 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r0 = r0.mo11077c(r1, r2)
            androidx.compose.ui.text.p0 r28 = r0.mo11096i()
            androidx.compose.ui.text.font.i0$a r0 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r15 = r0.mo46947c()
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r2 = 16
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r9 = 0
            r10 = 0
            r13 = 1
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r0, r10, r2, r13, r9)
            r16 = 0
            r0 = r11
            r10 = r16
            r2 = r12
            r12 = r16
            r16 = 0
            r35 = r14
            r14 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 196656(0x30030, float:2.75574E-40)
            r31 = 0
            r32 = 65500(0xffdc, float:9.1785E-41)
            r29 = r1
            androidx.compose.material.TextKt.m14196c(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            androidx.compose.ui.c$b r13 = r33.mo17068m()
            r14 = 0
            com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$3$1 r15 = new com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$3$1
            r15.<init>(r0, r3, r6, r4)
            r18 = 196608(0x30000, float:2.75506E-40)
            r19 = 223(0xdf, float:3.12E-43)
            r4 = r15
            r0 = 0
            r15 = r0
            r16 = r4
            r17 = r1
            androidx.compose.foundation.lazy.LazyDslKt.m10737b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02a1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02a1:
            r4 = r2
            r2 = r3
            r3 = r5
            r5 = r35
        L_0x02a6:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x02ad
            goto L_0x02bc
        L_0x02ad:
            com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$4 r10 = new com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$4
            r0 = r10
            r1 = r34
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt.m151522a(androidx.compose.ui.m, int, int, int, int, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151523b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(333489132);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(333489132, i, -1, "com.carrefour.fid.android.design.components.compose.ListQuantityComponentPreview (ListQuantityComponent.kt:111)");
            }
            ThemeKt.m153788a(ComposableSingletons$ListQuantityComponentKt.f92228a.mo112098b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ListQuantityComponentKt$ListQuantityComponentPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151524c(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r32, int r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r3 = r34
            r4 = r36
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 905046312(0x35f1e928, float:1.8023757E-6)
            r1 = r35
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r37 & 1
            if (r2 == 0) goto L_0x001c
            r5 = r4 | 6
            r6 = r5
            r5 = r32
            goto L_0x0030
        L_0x001c:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x002d
            r5 = r32
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x002a
            r6 = 4
            goto L_0x002b
        L_0x002a:
            r6 = 2
        L_0x002b:
            r6 = r6 | r4
            goto L_0x0030
        L_0x002d:
            r5 = r32
            r6 = r4
        L_0x0030:
            r7 = r37 & 2
            if (r7 == 0) goto L_0x0039
            r6 = r6 | 48
            r14 = r33
            goto L_0x004b
        L_0x0039:
            r7 = r4 & 112(0x70, float:1.57E-43)
            r14 = r33
            if (r7 != 0) goto L_0x004b
            boolean r7 = r1.mo14976f(r14)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r6 = r6 | r7
        L_0x004b:
            r7 = r37 & 4
            if (r7 == 0) goto L_0x0052
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0062
            boolean r7 = r1.mo14927P(r3)
            if (r7 == 0) goto L_0x005f
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r6 = r6 | r7
        L_0x0062:
            r7 = r6 & 731(0x2db, float:1.024E-42)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0075
            boolean r7 = r1.mo15011p()
            if (r7 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            r1.mo14958a0()
            r2 = r5
            goto L_0x02af
        L_0x0075:
            if (r2 == 0) goto L_0x007a
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x007b
        L_0x007a:
            r2 = r5
        L_0x007b:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x0087
            r5 = -1
            java.lang.String r7 = "com.carrefour.fid.android.design.components.compose.QuantityComponent (ListQuantityComponent.kt:79)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r5, r7)
        L_0x0087:
            r0 = 40
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10087C(r2, r0)
            com.carrefour.fid.android.design.theme.b r30 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r5 = r30.mo114219P()
            androidx.compose.material.t0 r7 = androidx.compose.material.C7933t0.f19075a
            int r8 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.f1 r9 = r7.mo11076b(r1, r8)
            androidx.compose.foundation.shape.e r9 = r9.mo10757d()
            androidx.compose.ui.m r15 = androidx.compose.foundation.BackgroundKt.m8824c(r0, r5, r9)
            r16 = 0
            r17 = 0
            r18 = 0
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r3)
            java.lang.Object r5 = r1.mo14921N()
            if (r0 != 0) goto L_0x00c6
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r5 != r0) goto L_0x00ce
        L_0x00c6:
            com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$QuantityComponent$1$1 r5 = new com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$QuantityComponent$1$1
            r5.<init>(r3)
            r1.mo14893C(r5)
        L_0x00ce:
            r1.mo15002m0()
            r19 = r5
            kotlin.jvm.functions.a r19 = (kotlin.jvm.functions.C11289a) r19
            r20 = 7
            r21 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.ClickableKt.m8878e(r15, r16, r17, r18, r19, r20, r21)
            r5 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.mo14918M(r5)
            androidx.compose.ui.c$a r5 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r6 = r5.mo17061C()
            r15 = 0
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.BoxKt.m9849k(r6, r15, r1, r15)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r9)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r9 = r13.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r15 = r1.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x0127
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0127:
            r1.mo14938T()
            boolean r15 = r1.mo14997l()
            if (r15 == 0) goto L_0x0134
            r1.mo14947W(r9)
            goto L_0x0137
        L_0x0134:
            r1.mo14888A()
        L_0x0137:
            r1.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r13.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r15)
            kotlin.jvm.functions.p r6 = r13.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r10, r6)
            kotlin.jvm.functions.p r6 = r13.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r11, r6)
            kotlin.jvm.functions.p r6 = r13.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r12, r6)
            r1.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r0.invoke(r6, r1, r10)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r6 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            r6 = 0
            r9 = 0
            r10 = 1
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10112l(r11, r6, r10, r9)
            androidx.compose.ui.c$c r5 = r5.mo17070q()
            r9 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r9 = r9.mo7630p()
            r10 = 48
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.RowKt.m10071d(r9, r5, r1, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            kotlin.jvm.functions.a r15 = r13.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r0 = r1.mo15017r()
            boolean r0 = r0 instanceof androidx.compose.runtime.C8428d
            if (r0 != 0) goto L_0x01cb
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01cb:
            r1.mo14938T()
            boolean r0 = r1.mo14997l()
            if (r0 == 0) goto L_0x01d8
            r1.mo14947W(r15)
            goto L_0x01db
        L_0x01d8:
            r1.mo14888A()
        L_0x01db:
            r1.mo14941U()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r13.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r0, r5, r15)
            kotlin.jvm.functions.p r5 = r13.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r0, r9, r5)
            kotlin.jvm.functions.p r5 = r13.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r0, r10, r5)
            kotlin.jvm.functions.p r5 = r13.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r0, r12, r5)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r21 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            r6.invoke(r0, r1, r5)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r19 = 2
            r20 = 0
            r15 = r0
            r16 = r11
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.C2411u0.m10660e(r15, r16, r17, r18, r19, r20)
            java.lang.String r5 = java.lang.String.valueOf(r33)
            androidx.compose.ui.text.style.i$a r9 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r17 = r9.mo47668b()
            androidx.compose.material.w1 r7 = r7.mo11077c(r1, r8)
            androidx.compose.ui.text.p0 r25 = r7.mo11098k()
            long r7 = r30.mo114231a0()
            androidx.compose.ui.text.font.i0$a r9 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r12 = r9.mo46947c()
            r9 = 0
            r13 = 0
            r31 = r11
            r11 = r13
            r15 = 0
            r14 = r15
            r16 = 0
            androidx.compose.ui.text.style.i r17 = androidx.compose.p004ui.text.style.C16432i.m74172g(r17)
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 196608(0x30000, float:2.75506E-40)
            r28 = 0
            r29 = 64984(0xfdd8, float:9.1062E-41)
            r26 = r1
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r18 = 2
            r19 = 0
            r14 = r0
            r15 = r31
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.C2411u0.m10660e(r14, r15, r16, r17, r18, r19)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_chevrons_up_down
            r5 = 0
            androidx.compose.ui.graphics.painter.Painter r5 = androidx.compose.p004ui.res.C16015f.m71849d(r0, r1, r5)
            long r8 = r30.mo114231a0()
            r6 = 0
            r11 = 56
            r12 = 0
            r10 = r1
            androidx.compose.material.IconKt.m13539b(r5, r6, r7, r8, r10, r11, r12)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02af
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02af:
            androidx.compose.runtime.t1 r6 = r1.mo15020s()
            if (r6 != 0) goto L_0x02b6
            goto L_0x02c8
        L_0x02b6:
            com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$QuantityComponent$3 r7 = new com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$QuantityComponent$3
            r0 = r7
            r1 = r2
            r2 = r33
            r3 = r34
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt.m151524c(androidx.compose.ui.m, int, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m151525d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-2143409874);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2143409874, i, -1, "com.carrefour.fid.android.design.components.compose.QuantityComponentPreview (ListQuantityComponent.kt:125)");
            }
            ThemeKt.m153788a(ComposableSingletons$ListQuantityComponentKt.f92228a.mo112100d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ListQuantityComponentKt$QuantityComponentPreview$1(i));
        }
    }
}
