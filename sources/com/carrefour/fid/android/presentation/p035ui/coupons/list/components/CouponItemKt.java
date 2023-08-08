package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.models.Facility;
import com.carrefour.fid.android.presentation.p035ui.coupons.helpers.C23815a;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.glide.C35326d;
import com.skydoves.landscapist.palette.BitmapPalette;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nCouponItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponItem.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponItemKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n1#1,461:1\n76#2:462\n76#2:479\n76#2:520\n76#2:594\n76#2:647\n76#2:687\n25#3:463\n460#3,13:491\n36#3:505\n460#3,13:532\n36#3:547\n36#3:554\n36#3:562\n36#3:569\n473#3,3:576\n473#3,3:582\n460#3,13:606\n473#3,3:621\n36#3:631\n460#3,13:659\n473#3,3:674\n460#3,13:699\n473#3,3:715\n36#3:721\n25#3:732\n1114#4,6:464\n1114#4,6:506\n1114#4,6:548\n1114#4,6:555\n1114#4,6:563\n1114#4,6:570\n1114#4,6:632\n1114#4,6:722\n955#4,6:733\n154#5:470\n154#5:471\n154#5:512\n154#5:546\n154#5:561\n154#5:587\n154#5:620\n154#5:626\n154#5:627\n154#5:628\n154#5:629\n154#5:630\n154#5:638\n154#5:639\n154#5:673\n154#5:679\n154#5:713\n154#5:714\n154#5:720\n67#6,6:472\n73#6:504\n77#6:586\n68#6,5:588\n73#6:619\n77#6:625\n67#6,6:640\n73#6:672\n77#6:678\n75#7:478\n76#7,11:480\n75#7:519\n76#7,11:521\n89#7:579\n89#7:585\n75#7:593\n76#7,11:595\n89#7:624\n75#7:646\n76#7,11:648\n89#7:677\n75#7:686\n76#7,11:688\n89#7:718\n74#8,6:513\n80#8:545\n84#8:580\n1#9:581\n75#10,6:680\n81#10:712\n85#10:719\n73#11,4:728\n77#11,20:739\n*S KotlinDebug\n*F\n+ 1 CouponItem.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponItemKt\n*L\n95#1:462\n98#1:479\n103#1:520\n186#1:594\n262#1:647\n278#1:687\n96#1:463\n98#1:491,13\n106#1:505\n103#1:532,13\n127#1:547\n131#1:554\n164#1:562\n170#1:569\n103#1:576,3\n98#1:582,3\n186#1:606,13\n186#1:621,3\n243#1:631\n262#1:659,13\n262#1:674,3\n278#1:699,13\n278#1:715,3\n319#1:721\n348#1:732\n96#1:464,6\n106#1:506,6\n127#1:548,6\n131#1:555,6\n164#1:563,6\n170#1:570,6\n243#1:632,6\n319#1:722,6\n348#1:733,6\n100#1:470\n101#1:471\n108#1:512\n126#1:546\n150#1:561\n188#1:587\n193#1:620\n204#1:626\n205#1:627\n233#1:628\n241#1:629\n242#1:630\n256#1:638\n262#1:639\n264#1:673\n279#1:679\n283#1:713\n287#1:714\n306#1:720\n98#1:472,6\n98#1:504\n98#1:586\n186#1:588,5\n186#1:619\n186#1:625\n262#1:640,6\n262#1:672\n262#1:678\n98#1:478\n98#1:480,11\n103#1:519\n103#1:521,11\n103#1:579\n98#1:585\n186#1:593\n186#1:595,11\n186#1:624\n262#1:646\n262#1:648,11\n262#1:677\n278#1:686\n278#1:688,11\n278#1:718\n103#1:513,6\n103#1:545\n103#1:580\n278#1:680,6\n278#1:712\n278#1:719\n348#1:728,4\n348#1:739,20\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt */
public final class CouponItemKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105620a(java.lang.String r21, boolean r22, boolean r23, boolean r24, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r1 = r21
            r2 = r22
            r3 = r23
            r5 = r25
            r6 = r27
            r0 = 762465963(0x2d724eab, float:1.3773575E-11)
            r4 = r26
            androidx.compose.runtime.o r4 = r4.mo15009o(r0)
            r7 = r28 & 1
            if (r7 == 0) goto L_0x001a
            r7 = r6 | 6
            goto L_0x002a
        L_0x001a:
            r7 = r6 & 14
            if (r7 != 0) goto L_0x0029
            boolean r7 = r4.mo15006n0(r1)
            if (r7 == 0) goto L_0x0026
            r7 = 4
            goto L_0x0027
        L_0x0026:
            r7 = 2
        L_0x0027:
            r7 = r7 | r6
            goto L_0x002a
        L_0x0029:
            r7 = r6
        L_0x002a:
            r8 = r28 & 2
            if (r8 == 0) goto L_0x0031
            r7 = r7 | 48
            goto L_0x0041
        L_0x0031:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0041
            boolean r8 = r4.mo14961b(r2)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r7 = r7 | r8
        L_0x0041:
            r8 = r28 & 4
            if (r8 == 0) goto L_0x0048
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0058
        L_0x0048:
            r8 = r6 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0058
            boolean r8 = r4.mo14961b(r3)
            if (r8 == 0) goto L_0x0055
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r7 = r7 | r8
        L_0x0058:
            r8 = r28 & 8
            if (r8 == 0) goto L_0x005f
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0072
        L_0x005f:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0072
            r9 = r24
            boolean r10 = r4.mo14961b(r9)
            if (r10 == 0) goto L_0x006e
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0070
        L_0x006e:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0070:
            r7 = r7 | r10
            goto L_0x0074
        L_0x0072:
            r9 = r24
        L_0x0074:
            r10 = r28 & 16
            if (r10 == 0) goto L_0x007b
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008d
        L_0x007b:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r6
            if (r10 != 0) goto L_0x008d
            boolean r10 = r4.mo14927P(r5)
            if (r10 == 0) goto L_0x008a
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x008a:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r7 = r7 | r10
        L_0x008d:
            r10 = 46811(0xb6db, float:6.5596E-41)
            r10 = r10 & r7
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r10 != r11) goto L_0x00a1
            boolean r10 = r4.mo15011p()
            if (r10 != 0) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            r4.mo14958a0()
            goto L_0x0115
        L_0x00a1:
            r10 = 1
            if (r8 == 0) goto L_0x00a7
            r20 = r10
            goto L_0x00a9
        L_0x00a7:
            r20 = r9
        L_0x00a9:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x00b5
            r8 = -1
            java.lang.String r9 = "com.carrefour.fid.android.presentation.ui.coupons.list.components.AddButtonBlock (CouponItem.kt:311)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r8, r9)
        L_0x00b5:
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.mo14918M(r0)
            boolean r0 = r4.mo15006n0(r5)
            java.lang.Object r8 = r4.mo14921N()
            if (r0 != 0) goto L_0x00cd
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r8 != r0) goto L_0x00d5
        L_0x00cd:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$AddButtonBlock$1$1 r8 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$AddButtonBlock$1$1
            r8.<init>(r5)
            r4.mo14893C(r8)
        L_0x00d5:
            r4.mo15002m0()
            r0 = r8
            kotlin.jvm.functions.a r0 = (kotlin.jvm.functions.C11289a) r0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$AddButtonBlock$2 r9 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$AddButtonBlock$2
            r9.<init>(r2, r1, r3, r7)
            r15 = 743099752(0x2c4acd68, float:2.881995E-12)
            androidx.compose.runtime.internal.a r17 = androidx.compose.runtime.internal.C8553b.m31048b(r4, r15, r10, r9)
            int r7 = r7 >> 3
            r7 = r7 & 896(0x380, float:1.256E-42)
            r9 = 805306368(0x30000000, float:4.656613E-10)
            r18 = r7 | r9
            r19 = 506(0x1fa, float:7.09E-43)
            r7 = r0
            r9 = r20
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r0 = 0
            r14 = r0
            r15 = r16
            r16 = r17
            r17 = r4
            androidx.compose.material.ButtonKt.m13346d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0113
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0113:
            r9 = r20
        L_0x0115:
            androidx.compose.runtime.t1 r8 = r4.mo15020s()
            if (r8 != 0) goto L_0x011c
            goto L_0x0132
        L_0x011c:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$AddButtonBlock$3 r10 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$AddButtonBlock$3
            r0 = r10
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r9
            r5 = r25
            r6 = r27
            r7 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r10)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponItemKt.m105620a(java.lang.String, boolean, boolean, boolean, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105621b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.CouponModel r36, boolean r37, boolean r38, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r39, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r40, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r41, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r42, int r43) {
        /*
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r43
            java.lang.String r0 = "couponModel"
            r1 = r36
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onCouponClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "onScanClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onAddToCardClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = -1361239624(0xffffffffaedd21b8, float:-1.0055906E-10)
            r2 = r42
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0033
            r3 = -1
            java.lang.String r8 = "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItem (CouponItem.kt:79)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r3, r8)
        L_0x0033:
            if (r38 == 0) goto L_0x0055
            com.carrefour.fid.android.presentation.models.CouponModel$State r0 = r36.mo121402R()
            com.carrefour.fid.android.presentation.models.CouponModel$State r3 = com.carrefour.fid.android.presentation.models.CouponModel.State.NEUTRAL
            if (r0 != r3) goto L_0x003e
            goto L_0x0055
        L_0x003e:
            boolean r0 = r36.isSelected()
            if (r0 == 0) goto L_0x0047
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponColor r0 = com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponColor.SUCCESS
            goto L_0x0057
        L_0x0047:
            com.carrefour.fid.android.presentation.models.CouponModel$State r0 = r36.mo121402R()
            com.carrefour.fid.android.presentation.models.CouponModel$State r3 = com.carrefour.fid.android.presentation.models.CouponModel.State.ERROR
            if (r0 != r3) goto L_0x0052
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponColor r0 = com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponColor.ERROR
            goto L_0x0057
        L_0x0052:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponColor r0 = com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponColor.NEUTRAL
            goto L_0x0057
        L_0x0055:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponColor r0 = com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponColor.NEUTRAL
        L_0x0057:
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r2.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r8)
            java.lang.Object r8 = r2.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r16.mo16277a()
            r15 = 0
            r14 = 0
            if (r8 != r9) goto L_0x0081
            java.lang.Float r8 = java.lang.Float.valueOf(r15)
            r9 = 2
            androidx.compose.runtime.z0 r8 = androidx.compose.runtime.C8539f2.m30981g(r8, r14, r9, r14)
            r2.mo14893C(r8)
        L_0x0081:
            r2.mo15002m0()
            r13 = r8
            androidx.compose.runtime.z0 r13 = (androidx.compose.runtime.C8700z0) r13
            androidx.compose.ui.m$a r12 = androidx.compose.p004ui.C8767m.f23478j
            r8 = 180(0xb4, float:2.52E-43)
            float r8 = (float) r8
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.SizeKt.m10092H(r12, r8)
            r9 = 8
            float r9 = (float) r9
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.PaddingKt.m10024k(r8, r9)
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r9)
            androidx.compose.ui.c$a r17 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r9 = r17.mo17061C()
            r11 = 0
            androidx.compose.ui.layout.f0 r9 = androidx.compose.foundation.layout.BoxKt.m9849k(r9, r11, r2, r11)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r10)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r2.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r2.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r20 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r20.mo44585a()
            kotlin.jvm.functions.q r8 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r8)
            androidx.compose.runtime.d r1 = r2.mo15017r()
            boolean r1 = r1 instanceof androidx.compose.runtime.C8428d
            if (r1 != 0) goto L_0x00e9
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00e9:
            r2.mo14938T()
            boolean r1 = r2.mo14997l()
            if (r1 == 0) goto L_0x00f6
            r2.mo14947W(r11)
            goto L_0x00f9
        L_0x00f6:
            r2.mo14888A()
        L_0x00f9:
            r2.mo14941U()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r11 = r20.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r9, r11)
            kotlin.jvm.functions.p r9 = r20.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r10, r9)
            kotlin.jvm.functions.p r9 = r20.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r14, r9)
            kotlin.jvm.functions.p r9 = r20.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r15, r9)
            r2.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r8.invoke(r1, r2, r10)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r1)
            androidx.compose.foundation.layout.BoxScopeInstance r15 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r14 = 1
            r9 = 0
            r11 = 0
            androidx.compose.ui.m r21 = androidx.compose.foundation.layout.SizeKt.m10114n(r12, r11, r14, r9)
            r22 = 0
            r23 = 0
            r24 = 0
            r10 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r10)
            boolean r8 = r2.mo15006n0(r4)
            java.lang.Object r9 = r2.mo14921N()
            if (r8 != 0) goto L_0x015a
            java.lang.Object r8 = r16.mo16277a()
            if (r9 != r8) goto L_0x0162
        L_0x015a:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$1$1 r9 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$1$1
            r9.<init>(r4)
            r2.mo14893C(r9)
        L_0x0162:
            r2.mo15002m0()
            r25 = r9
            kotlin.jvm.functions.a r25 = (kotlin.jvm.functions.C11289a) r25
            r26 = 7
            r27 = 0
            androidx.compose.ui.m r28 = androidx.compose.foundation.ClickableKt.m8878e(r21, r22, r23, r24, r25, r26, r27)
            com.carrefour.fid.android.design.theme.b r8 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r29 = r8.mo114231a0()
            r31 = 0
            r32 = 2
            r33 = 0
            androidx.compose.ui.m r8 = androidx.compose.foundation.BackgroundKt.m8825d(r28, r29, r31, r32, r33)
            float r9 = (float) r14
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            r21 = r15
            long r14 = r0.mo69877q()
            androidx.compose.material.t0 r10 = androidx.compose.material.C7933t0.f19075a
            int r1 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.f1 r1 = r10.mo11076b(r2, r1)
            androidx.compose.foundation.shape.e r1 = r1.mo10758e()
            androidx.compose.ui.m r1 = androidx.compose.foundation.BorderKt.m8852h(r8, r11, r14, r1)
            androidx.compose.ui.c$b r8 = r17.mo17068m()
            r10 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r2.mo14918M(r10)
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r10 = r10.mo7631r()
            r11 = 48
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.ColumnKt.m9863b(r10, r8, r2, r11)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r10)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r2.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r2.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            kotlin.jvm.functions.a r15 = r20.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            r42 = r3
            androidx.compose.runtime.d r3 = r2.mo15017r()
            boolean r3 = r3 instanceof androidx.compose.runtime.C8428d
            if (r3 != 0) goto L_0x01eb
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01eb:
            r2.mo14938T()
            boolean r3 = r2.mo14997l()
            if (r3 == 0) goto L_0x01f8
            r2.mo14947W(r15)
            goto L_0x01fb
        L_0x01f8:
            r2.mo14888A()
        L_0x01fb:
            r2.mo14941U()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r15 = r20.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r3, r8, r15)
            kotlin.jvm.functions.p r8 = r20.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r3, r10, r8)
            kotlin.jvm.functions.p r8 = r20.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r3, r11, r8)
            kotlin.jvm.functions.p r8 = r20.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r3, r14, r8)
            r2.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            r8 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r1.invoke(r3, r2, r10)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            m105628i(r2, r8)
            com.carrefour.fid.android.presentation.models.Image r1 = r36.mo121397M()
            if (r1 == 0) goto L_0x0247
            java.lang.String r1 = r1.mo121644a()
            goto L_0x0248
        L_0x0247:
            r1 = 0
        L_0x0248:
            if (r1 != 0) goto L_0x024c
            java.lang.String r1 = ""
        L_0x024c:
            m105627h(r1, r2, r8)
            com.carrefour.fid.android.presentation.ui.coupons.helpers.a r1 = com.carrefour.fid.android.presentation.p035ui.coupons.helpers.C23815a.f59923a
            java.lang.Double r3 = r36.mo121438z()
            com.carrefour.fid.android.domain.models.DiscountType r10 = r36.mo121391G()
            java.lang.String r3 = r1.mo69743a(r3, r10)
            m105629j(r3, r2, r8)
            com.carrefour.fid.android.data.entities.coupons.CouponType r3 = r36.mo121388D()
            com.carrefour.fid.android.data.entities.coupons.CouponType r10 = com.carrefour.fid.android.data.entities.coupons.CouponType.DIGIT
            if (r3 != r10) goto L_0x026d
            java.lang.String r3 = r36.mo121389E()
            goto L_0x0271
        L_0x026d:
            java.lang.String r3 = r36.mo121401Q()
        L_0x0271:
            m105624e(r3, r2, r8)
            r3 = 16
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10024k(r12, r3)
            r8 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r8)
            boolean r8 = r2.mo15006n0(r13)
            java.lang.Object r11 = r2.mo14921N()
            if (r8 != 0) goto L_0x0295
            java.lang.Object r8 = r16.mo16277a()
            if (r11 != r8) goto L_0x029d
        L_0x0295:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$2$1$1 r11 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$2$1$1
            r11.<init>(r13)
            r2.mo14893C(r11)
        L_0x029d:
            r2.mo15002m0()
            kotlin.jvm.functions.l r11 = (kotlin.jvm.functions.C11300l) r11
            androidx.compose.ui.m r3 = androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt.m68999a(r3, r11)
            r8 = 0
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r2, r8)
            r3 = -1997856323(0xffffffff88eb21bd, float:-1.415148E-33)
            r2.mo14918M(r3)
            if (r38 == 0) goto L_0x02e8
            java.util.List r3 = r36.mo121437y()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r8 = 1
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x02e8
            r3 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r3)
            boolean r8 = r2.mo15006n0(r5)
            java.lang.Object r11 = r2.mo14921N()
            if (r8 != 0) goto L_0x02d6
            java.lang.Object r8 = r16.mo16277a()
            if (r11 != r8) goto L_0x02de
        L_0x02d6:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$2$2$1 r11 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$2$2$1
            r11.<init>(r5)
            r2.mo14893C(r11)
        L_0x02de:
            r2.mo15002m0()
            kotlin.jvm.functions.a r11 = (kotlin.jvm.functions.C11289a) r11
            r8 = 0
            m105631l(r11, r2, r8)
            goto L_0x02eb
        L_0x02e8:
            r3 = 1157296644(0x44faf204, float:2007.563)
        L_0x02eb:
            r2.mo15002m0()
            boolean r8 = com.carrefour.fid.android.presentation.models.extension.C38465d.m159627f(r36)
            r11 = 64
            if (r8 != 0) goto L_0x0315
            r8 = -1997856114(0xffffffff88eb228e, float:-1.4151672E-33)
            r2.mo14918M(r8)
            r14 = 1
            java.lang.Object[] r8 = new java.lang.Object[r14]
            java.lang.String r15 = r36.mo121407W()
            java.lang.String r15 = com.carrefour.fid.android.shared.extension.DateExtensionsKt.m118759e(r15)
            r3 = 0
            r8[r3] = r15
            r15 = 2131952504(0x7f130378, float:1.9541453E38)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71859e(r15, r8, r2, r11)
            r2.mo15002m0()
            goto L_0x0333
        L_0x0315:
            r3 = 0
            r14 = 1
            r8 = -1997855935(0xffffffff88eb2341, float:-1.4151836E-33)
            r2.mo14918M(r8)
            java.lang.Object[] r8 = new java.lang.Object[r14]
            java.lang.String r15 = r36.mo121406V()
            java.lang.String r15 = com.carrefour.fid.android.shared.extension.DateExtensionsKt.m118759e(r15)
            r8[r3] = r15
            r15 = 2131952503(0x7f130377, float:1.954145E38)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71859e(r15, r8, r2, r11)
            r2.mo15002m0()
        L_0x0333:
            m105625f(r8, r2, r3)
            com.carrefour.fid.android.data.entities.coupons.CouponType r8 = r36.mo121388D()
            if (r8 != r10) goto L_0x0341
            java.lang.String r8 = r36.mo121390F()
            goto L_0x0345
        L_0x0341:
            java.lang.String r8 = r36.mo121389E()
        L_0x0345:
            m105623d(r8, r2, r3)
            com.carrefour.fid.android.presentation.models.Facility r8 = r36.mo121394J()
            m105626g(r8, r2, r3)
            java.lang.String r8 = r36.mo121399O()
            java.lang.Integer r1 = r1.mo69751i(r8)
            m105630k(r1, r2, r3)
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            long r9 = r0.mo69877q()
            r8 = 0
            r1 = 0
            r15 = 384(0x180, float:5.38E-43)
            r20 = 9
            r3 = 1157296644(0x44faf204, float:2007.563)
            r18 = 0
            r3 = 0
            r19 = 0
            r34 = r12
            r12 = r1
            r1 = r13
            r13 = r2
            r14 = r15
            r35 = r21
            r15 = r20
            androidx.compose.material.DividerKt.m13428a(r8, r9, r11, r12, r13, r14, r15)
            if (r38 == 0) goto L_0x03e2
            r8 = -1997855339(0xffffffff88eb2595, float:-1.41523835E-33)
            r2.mo14918M(r8)
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r8 = r36.mo121403S()
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r9 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.INBASKET
            if (r8 != r9) goto L_0x0391
            r8 = 2131952453(0x7f130345, float:1.954135E38)
            goto L_0x039e
        L_0x0391:
            boolean r8 = r36.isSelected()
            if (r8 == 0) goto L_0x039b
            r8 = 2131952452(0x7f130344, float:1.9541347E38)
            goto L_0x039e
        L_0x039b:
            r8 = 2131952451(0x7f130343, float:1.9541345E38)
        L_0x039e:
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r2, r3)
            boolean r10 = r36.isSelected()
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r11 = r36.mo121403S()
            if (r11 == r9) goto L_0x03b1
            r9 = 1157296644(0x44faf204, float:2007.563)
            r11 = 1
            goto L_0x03b5
        L_0x03b1:
            r11 = r3
            r9 = 1157296644(0x44faf204, float:2007.563)
        L_0x03b5:
            r2.mo14918M(r9)
            boolean r9 = r2.mo15006n0(r6)
            java.lang.Object r12 = r2.mo14921N()
            if (r9 != 0) goto L_0x03c8
            java.lang.Object r9 = r16.mo16277a()
            if (r12 != r9) goto L_0x03d0
        L_0x03c8:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$2$3$1 r12 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$2$3$1
            r12.<init>(r6)
            r2.mo14893C(r12)
        L_0x03d0:
            r2.mo15002m0()
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            r14 = r7 & 112(0x70, float:1.57E-43)
            r15 = 0
            r9 = r37
            r13 = r2
            m105620a(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.mo15002m0()
            goto L_0x0421
        L_0x03e2:
            r8 = -1997854726(0xffffffff88eb27fa, float:-1.41529465E-33)
            r2.mo14918M(r8)
            r8 = 2131952496(0x7f130370, float:1.9541436E38)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r2, r3)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r12)
            boolean r12 = r2.mo15006n0(r4)
            java.lang.Object r13 = r2.mo14921N()
            if (r12 != 0) goto L_0x0408
            java.lang.Object r12 = r16.mo16277a()
            if (r13 != r12) goto L_0x0410
        L_0x0408:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$2$4$1 r13 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$2$4$1
            r13.<init>(r4)
            r2.mo14893C(r13)
        L_0x0410:
            r2.mo15002m0()
            r12 = r13
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            r14 = 432(0x1b0, float:6.05E-43)
            r15 = 8
            r13 = r2
            m105620a(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.mo15002m0()
        L_0x0421:
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            androidx.compose.ui.c r8 = r17.mo17074y()
            r9 = r34
            r10 = r35
            androidx.compose.ui.m r8 = r10.mo7701c(r9, r8)
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r9 = r42
            float r1 = r9.mo7418M(r1)
            r9 = 0
            r10 = 0
            r11 = 1
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.OffsetKt.m10000f(r8, r9, r1, r11, r10)
            long r8 = r0.mo69877q()
            m105632m(r1, r8, r2, r3)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x046c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x046c:
            androidx.compose.runtime.t1 r8 = r2.mo15020s()
            if (r8 != 0) goto L_0x0473
            goto L_0x048a
        L_0x0473:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$2 r9 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$2
            r0 = r9
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x048a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponItemKt.m105621b(com.carrefour.fid.android.presentation.models.CouponModel, boolean, boolean, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m105622c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(702830529);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(702830529, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemPreview (CouponItem.kt:424)");
            }
            ThemeKt.m153788a(ComposableSingletons$CouponItemKt.f59994a.mo69854b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponItemKt$CouponItemPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m105623d(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(372594004);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(str2)) {
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
                ComposerKt.m29845w0(372594004, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.DescriptionBlock (CouponItem.kt:260)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m o2 = SizeKt.m10115o(aVar, C16483g.m74435M((float) 65));
            o.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(o2);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            oVar2 = o;
            String str3 = str;
            TextKt.m14196c(str3, PaddingKt.m10024k(aVar, C16483g.m74435M((float) 8)), C37475b.f94185a.mo114257y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, C16449r.f40760b.mo47727c(), false, 3, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153906r(C37477d.m153887N()), oVar2, (i2 & 14) | 48, 3120, 54776);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponItemKt$DescriptionBlock$2(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m105624e(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(-313881893);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(str2)) {
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
                ComposerKt.m29845w0(-313881893, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.DescriptionRequirementBlock (CouponItem.kt:226)");
            }
            oVar2 = o;
            String str3 = str;
            TextKt.m14196c(str3, PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 6), 0.0f, 0.0f, 13, (Object) null), C37475b.f94185a.mo114228Y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153903o(C37477d.m153887N()), oVar2, (i2 & 14) | 48, 0, 65016);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponItemKt$DescriptionRequirementBlock$1(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m105625f(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(440303937);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(str2)) {
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
                ComposerKt.m29845w0(440303937, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.EndDateBlock (CouponItem.kt:249)");
            }
            oVar2 = o;
            String str3 = str;
            TextKt.m14196c(str3, PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 8)), C37475b.f94185a.mo114230a(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153905q(C37477d.m153887N()), oVar2, (i2 & 14) | 48, 0, 65016);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponItemKt$EndDateBlock$1(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m105626g(Facility facility, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        Facility facility2 = facility;
        int i4 = i;
        C8592o o = oVar.mo15009o(-2076214167);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(facility2)) {
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
                ComposerKt.m29845w0(-2076214167, i4, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.FacilityBlock (CouponItem.kt:275)");
            }
            if (facility2 == null) {
                oVar2 = o;
            } else {
                C8767m.C8768a aVar = C8767m.f23478j;
                C8767m m = PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M((float) 6), 1, (Object) null);
                C8734c.C8737c q = C8734c.f23406a.mo17070q();
                o.mo14918M(693286680);
                C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, o, 48);
                o.mo14918M(-1323940314);
                C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(m);
                if (!(o.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                o.mo14938T();
                if (o.mo14997l()) {
                    o.mo14947W(a);
                } else {
                    o.mo14888A();
                }
                o.mo14941U();
                C8592o b = Updater.m30180b(o);
                Updater.m30188j(b, d, companion.mo44588d());
                Updater.m30188j(b, dVar, companion.mo44586b());
                Updater.m30188j(b, layoutDirection, companion.mo44587c());
                Updater.m30188j(b, c4Var, companion.mo44590f());
                o.mo14972e();
                f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                ImageKt.m8967b(C16015f.m71849d(C23815a.f59923a.mo69744b(facility.mo121601e()), o, 0), (String) null, SizeKt.m10087C(aVar, C16483g.m74435M((float) 28)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 440, 120);
                C2428y0.m10726a(SizeKt.m10092H(aVar, C16483g.m74435M((float) 4)), o, 6);
                oVar2 = o;
                TextKt.m14196c(facility.mo121603f(), (C8767m) null, C37475b.f94185a.mo114257y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153906r(C37477d.m153887N()), oVar2, 0, 0, 65018);
                oVar2.mo15002m0();
                oVar2.mo14896D();
                oVar2.mo15002m0();
                oVar2.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponItemKt$FacilityBlock$2(facility2, i4));
        }
    }

    @C8540g
    /* renamed from: h */
    public static final void m105627h(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(997806451);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(str2)) {
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
                ComposerKt.m29845w0(997806451, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.ImageBlock (CouponItem.kt:200)");
            }
            oVar2 = o;
            C35325c.m145645b(str, C8744d.m32514a(PaddingKt.m10026m(SizeKt.m10087C(C8767m.f23478j, C16483g.m74435M((float) 150)), 0.0f, C16483g.m74435M((float) 4), 1, (Object) null), C7933t0.f19075a.mo11076b(o, C7933t0.f19076b).mo10758e()), (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, C15541c.f38696a.mo44373i(), (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, 0, (C11306r<? super C2362h, ? super C35326d.C35328b, ? super C8592o, ? super Integer, C11079d2>) null, (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, ComposableSingletons$CouponItemKt.f59994a.mo69853a(), oVar2, (i2 & 14) | 1572864, C20022q.C20025c.f51280k, 32700);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponItemKt$ImageBlock$1(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m105628i(C8592o oVar, int i) {
        C8592o oVar2;
        int i2 = i;
        C8592o o = oVar.mo15009o(858417942);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(858417942, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.JusteForYouBlock (CouponItem.kt:184)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m k = PaddingKt.m10024k(aVar, C16483g.m74435M((float) 16));
            long c = C37475b.f94185a.mo114234c();
            C7933t0 t0Var = C7933t0.f19075a;
            int i3 = C7933t0.f19076b;
            C8767m c2 = BackgroundKt.m8824c(k, c, t0Var.mo11076b(o, i3).mo10758e());
            C8734c i4 = C8734c.f23406a.mo17066i();
            o.mo14918M(733328855);
            C15560f0 k2 = BoxKt.m9849k(i4, false, o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(c2);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, k2, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            oVar2 = o;
            TextKt.m14196c("Juste pour vous", PaddingKt.m10024k(aVar, C16483g.m74435M((float) 8)), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153905q(t0Var.mo11077c(o, i3)), oVar2, 54, 0, 65532);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponItemKt$JusteForYouBlock$2(i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m105629j(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(433070049);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(str2)) {
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
                ComposerKt.m29845w0(433070049, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.PriceBlock (CouponItem.kt:215)");
            }
            oVar2 = o;
            String str3 = str;
            TextKt.m14196c(str3, (C8767m) null, C37475b.f94185a.mo114228Y(), C16506u.m74712m(32), (C16190e0) null, C16209i0.f40292b.mo46947c(), C37477d.m153888O(), 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, (i2 & 14) | 199680, 0, 130962);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponItemKt$PriceBlock$1(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    public static final void m105630k(Integer num, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        Integer num2 = num;
        int i4 = i;
        C8592o o = oVar.mo15009o(812198464);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(num2)) {
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
                ComposerKt.m29845w0(812198464, i4, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.PromotionChannelBlock (CouponItem.kt:298)");
            }
            if (num2 == null) {
                oVar2 = o;
            } else {
                float f = (float) 6;
                oVar2 = o;
                TextKt.m14196c(C16018i.m71858d(num.intValue(), o, 0), PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M(f), 0.0f, C16483g.m74435M(f), 5, (Object) null), C37475b.f94185a.mo114257y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153907s(C37477d.m153887N()), oVar2, 48, 0, 65016);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponItemKt$PromotionChannelBlock$2(num2, i4));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105631l(kotlin.jvm.functions.C11289a<kotlin.C11079d2> r11, androidx.compose.runtime.C8592o r12, int r13) {
        /*
            r0 = -228636561(0xfffffffff25f486f, float:-4.4225743E30)
            androidx.compose.runtime.o r12 = r12.mo15009o(r0)
            r1 = r13 & 14
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r12.mo14927P(r11)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r13
            goto L_0x0018
        L_0x0017:
            r1 = r13
        L_0x0018:
            r3 = r1 & 11
            if (r3 != r2) goto L_0x0027
            boolean r2 = r12.mo15011p()
            if (r2 != 0) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            r12.mo14958a0()
            goto L_0x0098
        L_0x0027:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0033
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.coupons.list.components.ScanbarBlock (CouponItem.kt:237)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0033:
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 50
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10087C(r0, r1)
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r1)
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r0)
            boolean r0 = r12.mo15006n0(r11)
            java.lang.Object r1 = r12.mo14921N()
            if (r0 != 0) goto L_0x0066
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x006e
        L_0x0066:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$ScanbarBlock$1$1 r1 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$ScanbarBlock$1$1
            r1.<init>(r11)
            r12.mo14893C(r1)
        L_0x006e:
            r12.mo15002m0()
            r6 = r1
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            r7 = 7
            r8 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.ClickableKt.m8878e(r2, r3, r4, r5, r6, r7, r8)
            r0 = 2131231244(0x7f08020c, float:1.8078564E38)
            r1 = 0
            androidx.compose.ui.graphics.painter.Painter r1 = androidx.compose.p004ui.res.C16015f.m71849d(r0, r12, r1)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 56
            r10 = 120(0x78, float:1.68E-43)
            r8 = r12
            androidx.compose.foundation.ImageKt.m8967b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0098
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0098:
            androidx.compose.runtime.t1 r12 = r12.mo15020s()
            if (r12 != 0) goto L_0x009f
            goto L_0x00a7
        L_0x009f:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$ScanbarBlock$2 r0 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$ScanbarBlock$2
            r0.<init>(r11, r13)
            r12.mo15202a(r0)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponItemKt.m105631l(kotlin.jvm.functions.a, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    public static final void m105632m(C8767m mVar, long j, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        C8767m mVar2 = mVar;
        long j2 = j;
        int i5 = i;
        C8592o o = oVar.mo15009o(-1142502567);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(mVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14980g(j2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1142502567, i6, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.Separator (CouponItem.kt:346)");
            }
            C8767m n = SizeKt.m10114n(mVar2, 0.0f, 1, (Object) null);
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
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(n, false, new CouponItemKt$SeparatorRPmYEkk$$inlined$ConstraintLayout$1(measurer), 1, (Object) null), C8553b.m31048b(o, -819894182, true, new CouponItemKt$SeparatorRPmYEkk$$inlined$ConstraintLayout$2(constraintLayoutScope, 0, E.mo21847b(), j, i6)), E.mo21846a(), o, 48, 0);
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponItemKt$Separator$2(mVar2, j2, i5));
        }
    }
}
