package com.carrefour.fid.android.design.components.compose.productcards;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nNonFoodProductCardComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodProductCardComponent.kt\ncom/carrefour/fid/android/design/components/compose/productcards/NonFoodProductCardComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n1#1,203:1\n154#2:204\n36#3:205\n25#3:216\n1114#4,6:206\n955#4,6:217\n73#5,4:212\n77#5,20:223\n*S KotlinDebug\n*F\n+ 1 NonFoodProductCardComponent.kt\ncom/carrefour/fid/android/design/components/compose/productcards/NonFoodProductCardComponentKt\n*L\n57#1:204\n58#1:205\n53#1:216\n58#1:206,6\n53#1:217,6\n53#1:212,4\n53#1:223,20\n*E\n"})
public final class NonFoodProductCardComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0139  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151922a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r29, @org.jetbrains.annotations.C12579k java.lang.String r30, @org.jetbrains.annotations.C12579k java.lang.String r31, @org.jetbrains.annotations.C12579k java.lang.String r32, int r33, boolean r34, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r37, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r38, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r39, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r40, int r41, int r42, int r43) {
        /*
            r15 = r30
            r14 = r31
            r13 = r32
            r12 = r35
            r11 = r36
            r10 = r37
            r9 = r39
            r8 = r41
            r7 = r43
            java.lang.String r0 = "productUrl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "packaging"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "price"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onRemoveClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onQuantityClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -1710545344(0xffffffff9a0b2640, float:-2.8775424E-23)
            r1 = r40
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0048
            r4 = r8 | 6
            r5 = r4
            r4 = r29
            goto L_0x005c
        L_0x0048:
            r4 = r8 & 14
            if (r4 != 0) goto L_0x0059
            r4 = r29
            boolean r5 = r6.mo15006n0(r4)
            if (r5 == 0) goto L_0x0056
            r5 = 4
            goto L_0x0057
        L_0x0056:
            r5 = 2
        L_0x0057:
            r5 = r5 | r8
            goto L_0x005c
        L_0x0059:
            r4 = r29
            r5 = r8
        L_0x005c:
            r16 = r7 & 2
            if (r16 == 0) goto L_0x0063
            r5 = r5 | 48
            goto L_0x0074
        L_0x0063:
            r16 = r8 & 112(0x70, float:1.57E-43)
            if (r16 != 0) goto L_0x0074
            boolean r16 = r6.mo15006n0(r15)
            if (r16 == 0) goto L_0x0070
            r16 = 32
            goto L_0x0072
        L_0x0070:
            r16 = 16
        L_0x0072:
            r5 = r5 | r16
        L_0x0074:
            r16 = r7 & 4
            if (r16 == 0) goto L_0x007b
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x008b
        L_0x007b:
            r2 = r8 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x008b
            boolean r2 = r6.mo15006n0(r14)
            if (r2 == 0) goto L_0x0088
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x008a
        L_0x0088:
            r2 = 128(0x80, float:1.794E-43)
        L_0x008a:
            r5 = r5 | r2
        L_0x008b:
            r2 = r7 & 8
            if (r2 == 0) goto L_0x0092
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a2
        L_0x0092:
            r2 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x00a2
            boolean r2 = r6.mo15006n0(r13)
            if (r2 == 0) goto L_0x009f
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x00a1
        L_0x009f:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x00a1:
            r5 = r5 | r2
        L_0x00a2:
            r2 = r7 & 16
            if (r2 == 0) goto L_0x00a9
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00bf
        L_0x00a9:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r8
            if (r2 != 0) goto L_0x00bf
            r2 = r33
            boolean r17 = r6.mo14976f(r2)
            if (r17 == 0) goto L_0x00ba
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00bc
        L_0x00ba:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00bc:
            r5 = r5 | r17
            goto L_0x00c1
        L_0x00bf:
            r2 = r33
        L_0x00c1:
            r17 = r7 & 32
            if (r17 == 0) goto L_0x00cc
            r17 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r17
            r0 = r34
            goto L_0x00e1
        L_0x00cc:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r8 & r17
            r0 = r34
            if (r17 != 0) goto L_0x00e1
            boolean r18 = r6.mo14961b(r0)
            if (r18 == 0) goto L_0x00dd
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00df
        L_0x00dd:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00df:
            r5 = r5 | r18
        L_0x00e1:
            r18 = r7 & 64
            if (r18 == 0) goto L_0x00ea
            r18 = 1572864(0x180000, float:2.204052E-39)
        L_0x00e7:
            r5 = r5 | r18
            goto L_0x00fc
        L_0x00ea:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r8 & r18
            if (r18 != 0) goto L_0x00fc
            boolean r18 = r6.mo14927P(r12)
            if (r18 == 0) goto L_0x00f9
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e7
        L_0x00f9:
            r18 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00e7
        L_0x00fc:
            r3 = r7 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0104
            r3 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0102:
            r5 = r5 | r3
            goto L_0x0115
        L_0x0104:
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r8
            if (r3 != 0) goto L_0x0115
            boolean r3 = r6.mo14927P(r11)
            if (r3 == 0) goto L_0x0112
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0112:
            r3 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0102
        L_0x0115:
            r3 = r7 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x011d
            r3 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x011b:
            r5 = r5 | r3
            goto L_0x012e
        L_0x011d:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r8
            if (r3 != 0) goto L_0x012e
            boolean r3 = r6.mo14927P(r10)
            if (r3 == 0) goto L_0x012b
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x012b:
            r3 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x011b
        L_0x012e:
            r3 = r7 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0139
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r5 = r5 | r19
            r0 = r38
            goto L_0x014e
        L_0x0139:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r8 & r19
            r0 = r38
            if (r19 != 0) goto L_0x014e
            boolean r19 = r6.mo14927P(r0)
            if (r19 == 0) goto L_0x014a
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014c
        L_0x014a:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014c:
            r5 = r5 | r19
        L_0x014e:
            r0 = r7 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0155
            r0 = r42 | 6
            goto L_0x0167
        L_0x0155:
            r0 = r42 & 14
            if (r0 != 0) goto L_0x0165
            boolean r0 = r6.mo14927P(r9)
            if (r0 == 0) goto L_0x0161
            r0 = 4
            goto L_0x0162
        L_0x0161:
            r0 = 2
        L_0x0162:
            r0 = r42 | r0
            goto L_0x0167
        L_0x0165:
            r0 = r42
        L_0x0167:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r5 & r19
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r4) goto L_0x0187
            r2 = r0 & 11
            r4 = 2
            if (r2 != r4) goto L_0x0187
            boolean r2 = r6.mo15011p()
            if (r2 != 0) goto L_0x017d
            goto L_0x0187
        L_0x017d:
            r6.mo14958a0()
            r1 = r29
            r10 = r38
            r15 = r6
            goto L_0x02e2
        L_0x0187:
            if (r1 == 0) goto L_0x018d
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r4 = r1
            goto L_0x018f
        L_0x018d:
            r4 = r29
        L_0x018f:
            if (r3 == 0) goto L_0x0193
            r3 = 0
            goto L_0x0195
        L_0x0193:
            r3 = r38
        L_0x0195:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01a3
            java.lang.String r1 = "com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCard (NonFoodProductCardComponent.kt:39)"
            r2 = -1710545344(0xffffffff9a0b2640, float:-2.8775424E-23)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r5, r0, r1)
        L_0x01a3:
            r1 = 0
            r2 = 1
            r40 = r0
            r0 = 0
            androidx.compose.ui.m r19 = androidx.compose.foundation.layout.SizeKt.m10114n(r4, r1, r2, r0)
            com.carrefour.fid.android.design.theme.b r0 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r20 = r0.mo114231a0()
            r22 = 0
            r23 = 2
            r24 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.BackgroundKt.m8825d(r19, r20, r22, r23, r24)
            r2 = 16
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r16 = r4
            r17 = r5
            r4 = 0
            r5 = 2
            androidx.compose.ui.m r19 = androidx.compose.foundation.layout.PaddingKt.m10026m(r0, r2, r1, r5, r4)
            if (r3 == 0) goto L_0x01d2
            r20 = 1
            goto L_0x01d4
        L_0x01d2:
            r20 = 0
        L_0x01d4:
            r21 = 0
            r22 = 0
            r1 = 1157296644(0x44faf204, float:2007.563)
            r6.mo14918M(r1)
            boolean r1 = r6.mo15006n0(r3)
            java.lang.Object r2 = r6.mo14921N()
            if (r1 != 0) goto L_0x01f0
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x01f8
        L_0x01f0:
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$1$1 r2 = new com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$1$1
            r2.<init>(r3)
            r6.mo14893C(r2)
        L_0x01f8:
            r6.mo15002m0()
            r23 = r2
            kotlin.jvm.functions.a r23 = (kotlin.jvm.functions.C11289a) r23
            r24 = 6
            r25 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.ClickableKt.m8878e(r19, r20, r21, r22, r23, r24, r25)
            r1 = -270267587(0xffffffffefe40b3d, float:-1.4115234E29)
            r6.mo14918M(r1)
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r6.mo14918M(r2)
            java.lang.Object r4 = r6.mo14921N()
            androidx.compose.runtime.o$a r19 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r19.mo16277a()
            if (r4 != r0) goto L_0x0227
            androidx.constraintlayout.compose.Measurer r4 = new androidx.constraintlayout.compose.Measurer
            r4.<init>()
            r6.mo14893C(r4)
        L_0x0227:
            r6.mo15002m0()
            r0 = r4
            androidx.constraintlayout.compose.Measurer r0 = (androidx.constraintlayout.compose.Measurer) r0
            r6.mo14918M(r2)
            java.lang.Object r4 = r6.mo14921N()
            java.lang.Object r1 = r19.mo16277a()
            if (r4 != r1) goto L_0x0242
            androidx.constraintlayout.compose.ConstraintLayoutScope r4 = new androidx.constraintlayout.compose.ConstraintLayoutScope
            r4.<init>()
            r6.mo14893C(r4)
        L_0x0242:
            r6.mo15002m0()
            r22 = r4
            androidx.constraintlayout.compose.ConstraintLayoutScope r22 = (androidx.constraintlayout.compose.ConstraintLayoutScope) r22
            r6.mo14918M(r2)
            java.lang.Object r1 = r6.mo14921N()
            java.lang.Object r2 = r19.mo16277a()
            if (r1 != r2) goto L_0x0262
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = 0
            r4 = 2
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r1, r2, r4, r2)
            r6.mo14893C(r1)
            goto L_0x0263
        L_0x0262:
            r2 = 0
        L_0x0263:
            r6.mo15002m0()
            r4 = r1
            androidx.compose.runtime.z0 r4 = (androidx.compose.runtime.C8700z0) r4
            r18 = 4544(0x11c0, float:6.368E-42)
            r1 = 257(0x101, float:3.6E-43)
            r2 = r22
            r19 = r3
            r3 = r4
            r4 = r0
            r26 = r5
            r5 = r6
            r15 = r6
            r6 = r18
            kotlin.Pair r1 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75199E(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r1.mo21846a()
            r18 = r2
            androidx.compose.ui.layout.f0 r18 = (androidx.compose.p004ui.layout.C15560f0) r18
            java.lang.Object r1 = r1.mo21847b()
            r3 = r1
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$$inlined$ConstraintLayout$1 r1 = new com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$$inlined$ConstraintLayout$1
            r1.<init>(r0)
            r0 = r26
            r2 = 0
            r4 = 0
            r6 = 1
            androidx.compose.ui.m r20 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r0, r2, r1, r6, r4)
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$$inlined$ConstraintLayout$2 r5 = new com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$$inlined$ConstraintLayout$2
            r2 = 0
            r21 = r40
            r0 = r5
            r1 = r22
            r4 = r30
            r27 = r5
            r5 = r17
            r6 = r34
            r7 = r37
            r8 = r39
            r9 = r21
            r10 = r33
            r11 = r31
            r12 = r32
            r13 = r36
            r14 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -819894182(0xffffffffcf21685a, float:-2.70797056E9)
            r1 = r27
            r2 = 1
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r0, r2, r1)
            r5 = 48
            r6 = 0
            r1 = r20
            r3 = r18
            r4 = r15
            androidx.compose.p004ui.layout.LayoutKt.m68906d(r1, r2, r3, r4, r5, r6)
            r15.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02de
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02de:
            r1 = r16
            r10 = r19
        L_0x02e2:
            androidx.compose.runtime.t1 r15 = r15.mo15020s()
            if (r15 != 0) goto L_0x02e9
            goto L_0x030e
        L_0x02e9:
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$3 r14 = new com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$3
            r0 = r14
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r11 = r39
            r12 = r41
            r13 = r42
            r28 = r14
            r14 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r28
            r15.mo15202a(r0)
        L_0x030e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt.m151922a(androidx.compose.ui.m, java.lang.String, java.lang.String, java.lang.String, int, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151923b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1459612089);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1459612089, i, -1, "com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardPreview (NonFoodProductCardComponent.kt:171)");
            }
            ThemeKt.m153788a(ComposableSingletons$NonFoodProductCardComponentKt.f92540a.mo112667e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodProductCardComponentKt$NonFoodProductCardPreview$1(i));
        }
    }
}
