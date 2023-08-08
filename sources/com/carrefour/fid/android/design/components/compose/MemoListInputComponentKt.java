package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nMemoListInputComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoListInputComponent.kt\ncom/carrefour/fid/android/design/components/compose/MemoListInputComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,170:1\n25#2:171\n25#2:178\n67#2,3:185\n66#2:188\n36#2:195\n36#2:204\n460#2,13:230\n473#2,3:244\n50#2:250\n49#2:251\n36#2:258\n50#2:267\n49#2:268\n1114#3,6:172\n1114#3,6:179\n1114#3,6:189\n1114#3,6:196\n1114#3,6:205\n1114#3,6:252\n1114#3,6:259\n1114#3,6:269\n154#4:202\n154#4:203\n154#4:249\n154#4:265\n154#4:266\n75#5,6:211\n81#5:243\n85#5:248\n75#6:217\n76#6,11:219\n89#6:247\n76#7:218\n76#8:275\n102#8,2:276\n*S KotlinDebug\n*F\n+ 1 MemoListInputComponent.kt\ncom/carrefour/fid/android/design/components/compose/MemoListInputComponentKt\n*L\n58#1:171\n59#1:178\n61#1:185,3\n61#1:188\n79#1:195\n89#1:204\n83#1:230,13\n83#1:244,3\n129#1:250\n129#1:251\n120#1:258\n156#1:267\n156#1:268\n58#1:172,6\n59#1:179,6\n61#1:189,6\n79#1:196,6\n89#1:205,6\n129#1:252,6\n120#1:259,6\n156#1:269,6\n86#1:202\n87#1:203\n116#1:249\n154#1:265\n155#1:266\n83#1:211,6\n83#1:243\n83#1:248\n83#1:217\n83#1:219,11\n83#1:247\n83#1:218\n58#1:275\n58#1:276,2\n*E\n"})
public final class MemoListInputComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151531a(java.lang.String r11, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.design.components.compose.C36990j, kotlin.C11079d2> r12, androidx.compose.runtime.C8592o r13, int r14) {
        /*
            r0 = 452491485(0x1af878dd, float:1.0276566E-22)
            androidx.compose.runtime.o r13 = r13.mo15009o(r0)
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0016
            boolean r1 = r13.mo15006n0(r11)
            if (r1 == 0) goto L_0x0013
            r1 = 4
            goto L_0x0014
        L_0x0013:
            r1 = 2
        L_0x0014:
            r1 = r1 | r14
            goto L_0x0017
        L_0x0016:
            r1 = r14
        L_0x0017:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0027
            boolean r2 = r13.mo14927P(r12)
            if (r2 == 0) goto L_0x0024
            r2 = 32
            goto L_0x0026
        L_0x0024:
            r2 = 16
        L_0x0026:
            r1 = r1 | r2
        L_0x0027:
            r2 = r1 & 91
            r3 = 18
            if (r2 != r3) goto L_0x0039
            boolean r2 = r13.mo15011p()
            if (r2 != 0) goto L_0x0034
            goto L_0x0039
        L_0x0034:
            r13.mo14958a0()
            goto L_0x00c8
        L_0x0039:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0045
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.AddMemoIcon (MemoListInputComponent.kt:145)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0045:
            boolean r0 = kotlin.text.C11622t.isBlank(r11)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00bf
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_circle_plus
            r1 = 0
            androidx.compose.ui.graphics.painter.Painter r0 = androidx.compose.p004ui.res.C16015f.m71849d(r0, r13, r1)
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r3 = 6
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            r4 = 0
            r5 = 12
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r6 = 0
            r7 = 10
            r8 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10028o(r2, r3, r4, r5, r6, r7, r8)
            r3 = 15
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10087C(r2, r3)
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo14918M(r2)
            boolean r2 = r13.mo15006n0(r12)
            boolean r3 = r13.mo15006n0(r11)
            r2 = r2 | r3
            java.lang.Object r3 = r13.mo14921N()
            if (r2 != 0) goto L_0x0097
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x009f
        L_0x0097:
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$AddMemoIcon$1$1 r3 = new com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$AddMemoIcon$1$1
            r3.<init>(r12, r11)
            r13.mo14893C(r3)
        L_0x009f:
            r13.mo15002m0()
            r8 = r3
            kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
            r9 = 7
            r10 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.ClickableKt.m8878e(r4, r5, r6, r7, r8, r9, r10)
            com.carrefour.fid.android.design.theme.b r2 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r4 = r2.mo114258z()
            int r2 = com.carrefour.fid.android.design.components.C36896b.C36912p.accessibility_memo_icon
            java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r13, r1)
            r7 = 8
            r8 = 0
            r1 = r0
            r6 = r13
            androidx.compose.material.IconKt.m13539b(r1, r2, r3, r4, r6, r7, r8)
        L_0x00bf:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00c8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00c8:
            androidx.compose.runtime.t1 r13 = r13.mo15020s()
            if (r13 != 0) goto L_0x00cf
            goto L_0x00d7
        L_0x00cf:
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$AddMemoIcon$2 r0 = new com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$AddMemoIcon$2
            r0.<init>(r11, r12, r14)
            r13.mo15202a(r0)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt.m151531a(java.lang.String, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b5  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151532b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, boolean r27, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8700z0<java.lang.Boolean> r28, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r6 = r32
            r0 = 782877579(0x2ea9c38b, float:7.7199656E-11)
            r1 = r31
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r33 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r4 = r6 | 6
            r5 = r4
            r4 = r26
            goto L_0x002a
        L_0x0016:
            r4 = r6 & 14
            if (r4 != 0) goto L_0x0027
            r4 = r26
            boolean r5 = r1.mo15006n0(r4)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            r5 = r5 | r6
            goto L_0x002a
        L_0x0027:
            r4 = r26
            r5 = r6
        L_0x002a:
            r7 = r33 & 2
            if (r7 == 0) goto L_0x0031
            r5 = r5 | 48
            goto L_0x0044
        L_0x0031:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0044
            r8 = r27
            boolean r9 = r1.mo14961b(r8)
            if (r9 == 0) goto L_0x0040
            r9 = 32
            goto L_0x0042
        L_0x0040:
            r9 = 16
        L_0x0042:
            r5 = r5 | r9
            goto L_0x0046
        L_0x0044:
            r8 = r27
        L_0x0046:
            r9 = r6 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005f
            r9 = r33 & 4
            if (r9 != 0) goto L_0x0059
            r9 = r28
            boolean r10 = r1.mo15006n0(r9)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x0059:
            r9 = r28
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r5 = r5 | r10
            goto L_0x0061
        L_0x005f:
            r9 = r28
        L_0x0061:
            r10 = r33 & 8
            if (r10 == 0) goto L_0x0068
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r11 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007b
            r11 = r29
            boolean r12 = r1.mo14927P(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r5 = r5 | r12
            goto L_0x007d
        L_0x007b:
            r11 = r29
        L_0x007d:
            r12 = r33 & 16
            if (r12 == 0) goto L_0x0084
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0099
        L_0x0084:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r6
            if (r13 != 0) goto L_0x0099
            r13 = r30
            boolean r14 = r1.mo14927P(r13)
            if (r14 == 0) goto L_0x0095
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r5 = r5 | r14
            goto L_0x009b
        L_0x0099:
            r13 = r30
        L_0x009b:
            r14 = 46811(0xb6db, float:6.5596E-41)
            r14 = r14 & r5
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r14 != r15) goto L_0x00b5
            boolean r14 = r1.mo15011p()
            if (r14 != 0) goto L_0x00aa
            goto L_0x00b5
        L_0x00aa:
            r1.mo14958a0()
            r17 = r4
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = r13
            goto L_0x0308
        L_0x00b5:
            r1.mo14930Q()
            r14 = r6 & 1
            r15 = 0
            if (r14 == 0) goto L_0x00d3
            boolean r14 = r1.mo14977f0()
            if (r14 == 0) goto L_0x00c4
            goto L_0x00d3
        L_0x00c4:
            r1.mo14958a0()
            r2 = r33 & 4
            if (r2 == 0) goto L_0x00cd
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00cd:
            r2 = r4
        L_0x00ce:
            r7 = r5
            r4 = r8
            r5 = r9
            r14 = r11
            goto L_0x00f4
        L_0x00d3:
            if (r2 == 0) goto L_0x00d8
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00d9
        L_0x00d8:
            r2 = r4
        L_0x00d9:
            if (r7 == 0) goto L_0x00dc
            r8 = 1
        L_0x00dc:
            r4 = r33 & 4
            if (r4 == 0) goto L_0x00e9
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r4, r15, r3, r15)
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r9 = r4
        L_0x00e9:
            if (r10 == 0) goto L_0x00ee
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$1 r4 = com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$1.f92301f
            r11 = r4
        L_0x00ee:
            if (r12 == 0) goto L_0x00ce
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$2 r4 = com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$2.f92302f
            r13 = r4
            goto L_0x00ce
        L_0x00f4:
            r1.mo14899E()
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0106
            r8 = -1
            java.lang.String r9 = "com.carrefour.fid.android.design.components.compose.MemoListInputComponent (MemoListInputComponent.kt:50)"
            r10 = 782877579(0x2ea9c38b, float:7.7199656E-11)
            androidx.compose.runtime.ComposerKt.m29845w0(r10, r7, r8, r9)
        L_0x0106:
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r8)
            java.lang.Object r9 = r1.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r10.mo16277a()
            if (r9 != r11) goto L_0x0130
            androidx.compose.ui.text.input.TextFieldValue r9 = new androidx.compose.ui.text.input.TextFieldValue
            java.lang.String r17 = ""
            r18 = 0
            r20 = 0
            r21 = 6
            r22 = 0
            r16 = r9
            r16.<init>((java.lang.String) r17, (long) r18, (androidx.compose.p004ui.text.C16356n0) r20, (int) r21, (kotlin.jvm.internal.DefaultConstructorMarker) r22)
            androidx.compose.runtime.z0 r9 = androidx.compose.runtime.C8539f2.m30981g(r9, r15, r3, r15)
            r1.mo14893C(r9)
        L_0x0130:
            r1.mo15002m0()
            r3 = r9
            androidx.compose.runtime.z0 r3 = (androidx.compose.runtime.C8700z0) r3
            r1.mo14918M(r8)
            java.lang.Object r8 = r1.mo14921N()
            java.lang.Object r9 = r10.mo16277a()
            if (r8 != r9) goto L_0x014b
            androidx.compose.ui.focus.FocusRequester r8 = new androidx.compose.ui.focus.FocusRequester
            r8.<init>()
            r1.mo14893C(r8)
        L_0x014b:
            r1.mo15002m0()
            r11 = r8
            androidx.compose.ui.focus.FocusRequester r11 = (androidx.compose.p004ui.focus.FocusRequester) r11
            r8 = 1618982084(0x607fb4c4, float:7.370227E19)
            r1.mo14918M(r8)
            boolean r8 = r1.mo15006n0(r14)
            boolean r9 = r1.mo15006n0(r3)
            r8 = r8 | r9
            boolean r9 = r1.mo15006n0(r13)
            r8 = r8 | r9
            java.lang.Object r9 = r1.mo14921N()
            if (r8 != 0) goto L_0x0171
            java.lang.Object r8 = r10.mo16277a()
            if (r9 != r8) goto L_0x0179
        L_0x0171:
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$actioner$1$1 r9 = new com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$actioner$1$1
            r9.<init>(r14, r13, r3)
            r1.mo14893C(r9)
        L_0x0179:
            r1.mo15002m0()
            r12 = r9
            kotlin.jvm.functions.l r12 = (kotlin.jvm.functions.C11300l) r12
            java.lang.Object r8 = r5.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r9 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r9)
            boolean r16 = r1.mo15006n0(r5)
            java.lang.Object r9 = r1.mo14921N()
            if (r16 != 0) goto L_0x019f
            java.lang.Object r0 = r10.mo16277a()
            if (r9 != r0) goto L_0x01a7
        L_0x019f:
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$3$1 r9 = new com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$3$1
            r9.<init>(r5)
            r1.mo14893C(r9)
        L_0x01a7:
            r1.mo15002m0()
            r0 = r9
            kotlin.jvm.functions.a r0 = (kotlin.jvm.functions.C11289a) r0
            r9 = 48
            r18 = 0
            r26 = r8
            r27 = r11
            r28 = r0
            r29 = r1
            r30 = r9
            r31 = r18
            com.carrefour.fid.android.design.components.compose.FocusHandlerComponentKt.m151494a(r26, r27, r28, r29, r30, r31)
            r0 = 0
            r8 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r0, r8, r15)
            r8 = 40
            float r8 = (float) r8
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r8)
            r8 = 8
            float r8 = (float) r8
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            androidx.compose.foundation.shape.n r8 = androidx.compose.foundation.shape.C2694o.m12166h(r8)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.draw.C8744d.m32514a(r0, r8)
            com.carrefour.fid.android.design.theme.b r8 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r8 = r8.mo114208E()
            r15 = 0
            r16 = 2
            r18 = 0
            r26 = r0
            r27 = r8
            r29 = r15
            r30 = r16
            r31 = r18
            androidx.compose.ui.m r19 = androidx.compose.foundation.BackgroundKt.m8825d(r26, r27, r29, r30, r31)
            r20 = 0
            r21 = 0
            r22 = 0
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r12)
            java.lang.Object r8 = r1.mo14921N()
            if (r0 != 0) goto L_0x0215
            java.lang.Object r0 = r10.mo16277a()
            if (r8 != r0) goto L_0x021d
        L_0x0215:
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$4$1 r8 = new com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$4$1
            r8.<init>(r12)
            r1.mo14893C(r8)
        L_0x021d:
            r1.mo15002m0()
            r23 = r8
            kotlin.jvm.functions.a r23 = (kotlin.jvm.functions.C11289a) r23
            r24 = 7
            r25 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.ClickableKt.m8878e(r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.ui.c$a r8 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r8 = r8.mo17070q()
            r9 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r9 = r9.mo7630p()
            r10 = 48
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.RowKt.m10071d(r9, r8, r1, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r1.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r17 = r2
            kotlin.jvm.functions.a r2 = r16.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            r26 = r5
            androidx.compose.runtime.d r5 = r1.mo15017r()
            boolean r5 = r5 instanceof androidx.compose.runtime.C8428d
            if (r5 != 0) goto L_0x0281
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0281:
            r1.mo14938T()
            boolean r5 = r1.mo14997l()
            if (r5 == 0) goto L_0x028e
            r1.mo14947W(r2)
            goto L_0x0291
        L_0x028e:
            r1.mo14888A()
        L_0x0291:
            r1.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r5 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r8, r5)
            kotlin.jvm.functions.p r5 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r9, r5)
            kotlin.jvm.functions.p r5 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r10, r5)
            kotlin.jvm.functions.p r5 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r15, r5)
            r1.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r5 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r0.invoke(r2, r1, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.text.input.TextFieldValue r9 = m151533c(r3)
            r2 = 3078(0xc06, float:4.313E-42)
            r7 = r7 & 112(0x70, float:1.57E-43)
            r2 = r2 | r7
            r7 = r0
            r8 = r4
            r10 = r11
            r11 = r12
            r0 = r12
            r12 = r1
            r15 = r13
            r13 = r2
            m151536f(r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.ui.text.input.TextFieldValue r2 = m151533c(r3)
            java.lang.String r2 = r2.mo47115i()
            m151531a(r2, r0, r1, r5)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0303
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0303:
            r3 = r26
            r2 = r4
            r4 = r14
            r5 = r15
        L_0x0308:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x030f
            goto L_0x031e
        L_0x030f:
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$6 r9 = new com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoListInputComponent$6
            r0 = r9
            r1 = r17
            r6 = r32
            r7 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt.m151532b(androidx.compose.ui.m, boolean, androidx.compose.runtime.z0, kotlin.jvm.functions.l, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: c */
    public static final TextFieldValue m151533c(C8700z0<TextFieldValue> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: d */
    public static final void m151534d(C8700z0<TextFieldValue> z0Var, TextFieldValue textFieldValue) {
        z0Var.setValue(textFieldValue);
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m151535e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-511114527);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-511114527, i, -1, "com.carrefour.fid.android.design.components.compose.MemoListInputPreview (MemoListInputComponent.kt:164)");
            }
            ThemeKt.m153788a(ComposableSingletons$MemoListInputComponentKt.f92238a.mo112105a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MemoListInputComponentKt$MemoListInputPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151536f(androidx.compose.foundation.layout.C2411u0 r38, boolean r39, androidx.compose.p004ui.text.input.TextFieldValue r40, androidx.compose.p004ui.focus.FocusRequester r41, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.design.components.compose.C36990j, kotlin.C11079d2> r42, androidx.compose.runtime.C8592o r43, int r44) {
        /*
            r14 = r40
            r7 = r41
            r6 = r42
            r5 = r44
            r0 = -826995881(0xffffffffceb50b57, float:-1.51870963E9)
            r1 = r43
            androidx.compose.runtime.o r3 = r1.mo15009o(r0)
            r1 = r5 & 14
            r2 = r38
            if (r1 != 0) goto L_0x0022
            boolean r1 = r3.mo15006n0(r2)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r5
            goto L_0x0023
        L_0x0022:
            r1 = r5
        L_0x0023:
            r4 = r5 & 112(0x70, float:1.57E-43)
            r8 = 16
            r15 = r39
            if (r4 != 0) goto L_0x0036
            boolean r4 = r3.mo14961b(r15)
            if (r4 == 0) goto L_0x0034
            r4 = 32
            goto L_0x0035
        L_0x0034:
            r4 = r8
        L_0x0035:
            r1 = r1 | r4
        L_0x0036:
            r4 = r5 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0046
            boolean r4 = r3.mo15006n0(r14)
            if (r4 == 0) goto L_0x0043
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r1 = r1 | r4
        L_0x0046:
            r4 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0056
            boolean r4 = r3.mo15006n0(r7)
            if (r4 == 0) goto L_0x0053
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r1 = r1 | r4
        L_0x0056:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r5
            if (r4 != 0) goto L_0x0068
            boolean r4 = r3.mo14927P(r6)
            if (r4 == 0) goto L_0x0065
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r1 = r1 | r4
        L_0x0068:
            r4 = r1
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r4
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r9) goto L_0x007f
            boolean r1 = r3.mo15011p()
            if (r1 != 0) goto L_0x0078
            goto L_0x007f
        L_0x0078:
            r3.mo14958a0()
            r24 = r3
            goto L_0x0193
        L_0x007f:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x008b
            r1 = -1
            java.lang.String r9 = "com.carrefour.fid.android.design.components.compose.MemoTextField (MemoListInputComponent.kt:106)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r1, r9)
        L_0x008b:
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r16 = androidx.compose.p004ui.focus.C15083v.m64810a(r0, r7)
            float r0 = (float) r8
            float r17 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 14
            r22 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r12 = 2
            r13 = 0
            r8 = r38
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.C2411u0.m10660e(r8, r9, r10, r11, r12, r13)
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r1 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r0 = r0.mo11077c(r3, r1)
            androidx.compose.ui.text.p0 r20 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r0)
            androidx.compose.foundation.text.m r28 = new androidx.compose.foundation.text.m
            androidx.compose.ui.text.input.z$a r0 = androidx.compose.p004ui.text.input.C16332z.f40555b
            int r22 = r0.mo47340e()
            r23 = 1
            r24 = 0
            androidx.compose.ui.text.input.p$a r0 = androidx.compose.p004ui.text.input.C16310p.f40516b
            int r25 = r0.mo47280c()
            r26 = 4
            r27 = 0
            r21 = r28
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.mo14918M(r0)
            boolean r0 = r3.mo15006n0(r6)
            boolean r1 = r3.mo15006n0(r14)
            r0 = r0 | r1
            java.lang.Object r1 = r3.mo14921N()
            if (r0 != 0) goto L_0x00f3
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x00fb
        L_0x00f3:
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoTextField$1$1 r1 = new com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoTextField$1$1
            r1.<init>(r6, r14)
            r3.mo14893C(r1)
        L_0x00fb:
            r3.mo15002m0()
            r30 = r1
            kotlin.jvm.functions.l r30 = (kotlin.jvm.functions.C11300l) r30
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 62
            r37 = 0
            androidx.compose.foundation.text.k r21 = new androidx.compose.foundation.text.k
            r29 = r21
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37)
            androidx.compose.ui.graphics.h4 r0 = new androidx.compose.ui.graphics.h4
            com.carrefour.fid.android.design.theme.b r1 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r8 = r1.mo114218O()
            r1 = 0
            r0.<init>(r8, r1)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r3.mo14918M(r1)
            boolean r1 = r3.mo15006n0(r6)
            java.lang.Object r8 = r3.mo14921N()
            if (r1 != 0) goto L_0x013b
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r8 != r1) goto L_0x0143
        L_0x013b:
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoTextField$2$1 r8 = new com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoTextField$2$1
            r8.<init>(r6)
            r3.mo14893C(r8)
        L_0x0143:
            r3.mo15002m0()
            r1 = r8
            kotlin.jvm.functions.l r1 = (kotlin.jvm.functions.C11300l) r1
            r8 = 0
            r17 = r4
            r4 = r8
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoTextField$3 r4 = new com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoTextField$3
            r4.<init>(r14)
            r8 = 142555021(0x87f378d, float:7.680157E-34)
            r9 = 1
            androidx.compose.runtime.internal.a r4 = androidx.compose.runtime.internal.C8553b.m31048b(r3, r8, r9, r4)
            r15 = r4
            int r4 = r17 >> 6
            r4 = r4 & 14
            r8 = 102236160(0x6180000, float:2.8588023E-35)
            r4 = r4 | r8
            int r8 = r17 << 6
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r17 = r4 | r8
            r18 = 196608(0x30000, float:2.75506E-40)
            r19 = 15888(0x3e10, float:2.2264E-41)
            r4 = r0
            r0 = r40
            r2 = r16
            r24 = r3
            r3 = r39
            r5 = r20
            r6 = r28
            r7 = r21
            r14 = r4
            r16 = r24
            r4 = 0
            r8 = 1
            r9 = 0
            androidx.compose.foundation.text.BasicTextFieldKt.m12188a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0193
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0193:
            androidx.compose.runtime.t1 r7 = r24.mo15020s()
            if (r7 != 0) goto L_0x019a
            goto L_0x01af
        L_0x019a:
            com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoTextField$4 r8 = new com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt$MemoTextField$4
            r0 = r8
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt.m151536f(androidx.compose.foundation.layout.u0, boolean, androidx.compose.ui.text.input.TextFieldValue, androidx.compose.ui.focus.FocusRequester, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }
}
