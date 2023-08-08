package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.product.presentation.mapper.C27641a;
import com.carrefour.fid.android.product.presentation.models.extensions.C27659c;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nNonFoodBasketComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodBasketComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodBasketComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,90:1\n154#2:91\n68#3,5:92\n73#3:123\n77#3:144\n75#4:97\n76#4,11:99\n89#4:143\n76#5:98\n460#6,13:110\n50#6:124\n49#6:125\n50#6:132\n49#6:133\n473#6,3:140\n1114#7,6:126\n1114#7,6:134\n*S KotlinDebug\n*F\n+ 1 NonFoodBasketComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodBasketComponentKt\n*L\n39#1:91\n35#1:92,5\n35#1:123\n35#1:144\n35#1:97\n35#1:99,11\n35#1:143\n35#1:98\n35#1:110,13\n47#1:124\n47#1:125\n58#1:132\n58#1:133\n35#1:140,3\n47#1:126,6\n58#1:134,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentKt */
public final class NonFoodBasketComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: com.carrefour.fid.android.product.presentation.models.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116824a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r24, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.offer.Prices r25, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.offer.Discount r26, boolean r27, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.product.presentation.models.C27647a r28, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.models.C27647a, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r7 = r31
            r0 = 1550037297(0x5c63b131, float:2.56358575E17)
            r1 = r30
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r32 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r7 | 6
            r4 = r3
            r3 = r24
            goto L_0x0029
        L_0x0015:
            r3 = r7 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r24
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
            r3 = r24
            r4 = r7
        L_0x0029:
            r5 = r32 & 2
            if (r5 == 0) goto L_0x002f
            r4 = r4 | 16
        L_0x002f:
            r6 = r32 & 4
            if (r6 == 0) goto L_0x0035
            r4 = r4 | 128(0x80, float:1.794E-43)
        L_0x0035:
            r8 = r32 & 8
            if (r8 == 0) goto L_0x003e
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r15 = r27
            goto L_0x0050
        L_0x003e:
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            r15 = r27
            if (r8 != 0) goto L_0x0050
            boolean r8 = r1.mo14961b(r15)
            if (r8 == 0) goto L_0x004d
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x004f
        L_0x004d:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x004f:
            r4 = r4 | r8
        L_0x0050:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r7
            if (r8 != 0) goto L_0x006b
            r8 = r32 & 16
            if (r8 != 0) goto L_0x0065
            r8 = r28
            boolean r9 = r1.mo15006n0(r8)
            if (r9 == 0) goto L_0x0067
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0069
        L_0x0065:
            r8 = r28
        L_0x0067:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0069:
            r4 = r4 | r9
            goto L_0x006d
        L_0x006b:
            r8 = r28
        L_0x006d:
            r9 = r32 & 32
            if (r9 == 0) goto L_0x0075
            r10 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r10
            goto L_0x0089
        L_0x0075:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r7
            if (r10 != 0) goto L_0x0089
            r10 = r29
            boolean r11 = r1.mo14927P(r10)
            if (r11 == 0) goto L_0x0085
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0087
        L_0x0085:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x0087:
            r4 = r4 | r11
            goto L_0x008b
        L_0x0089:
            r10 = r29
        L_0x008b:
            r11 = r32 & 6
            r12 = 6
            if (r11 != r12) goto L_0x00ab
            r11 = 374491(0x5b6db, float:5.24774E-40)
            r11 = r11 & r4
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r13) goto L_0x00ab
            boolean r11 = r1.mo15011p()
            if (r11 != 0) goto L_0x00a0
            goto L_0x00ab
        L_0x00a0:
            r1.mo14958a0()
            r5 = r26
            r2 = r3
            r6 = r10
            r3 = r25
            goto L_0x02ba
        L_0x00ab:
            r1.mo14930Q()
            r11 = r7 & 1
            r13 = -57345(0xffffffffffff1fff, float:NaN)
            r14 = 0
            r12 = 0
            r0 = 1
            if (r11 == 0) goto L_0x00d3
            boolean r11 = r1.mo14977f0()
            if (r11 == 0) goto L_0x00bf
            goto L_0x00d3
        L_0x00bf:
            r1.mo14958a0()
            r2 = r32 & 16
            if (r2 == 0) goto L_0x00c7
            r4 = r4 & r13
        L_0x00c7:
            r5 = r26
            r2 = r3
            r6 = r10
            r3 = r25
        L_0x00cd:
            r23 = r8
            r8 = r4
            r4 = r23
            goto L_0x00f7
        L_0x00d3:
            if (r2 == 0) goto L_0x00d8
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00d9
        L_0x00d8:
            r2 = r3
        L_0x00d9:
            if (r5 == 0) goto L_0x00dd
            r3 = r12
            goto L_0x00df
        L_0x00dd:
            r3 = r25
        L_0x00df:
            if (r6 == 0) goto L_0x00e3
            r5 = r12
            goto L_0x00e5
        L_0x00e3:
            r5 = r26
        L_0x00e5:
            r6 = r32 & 16
            if (r6 == 0) goto L_0x00f0
            com.carrefour.fid.android.product.presentation.models.a$a r6 = new com.carrefour.fid.android.product.presentation.models.a$a
            r6.<init>(r14, r0, r12)
            r4 = r4 & r13
            r8 = r6
        L_0x00f0:
            if (r9 == 0) goto L_0x00f5
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentKt$NonFoodBasketComponent$1 r6 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodBasketComponentKt$NonFoodBasketComponent$1.f67439f
            goto L_0x00cd
        L_0x00f5:
            r6 = r10
            goto L_0x00cd
        L_0x00f7:
            r1.mo14899E()
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0109
            r9 = -1
            java.lang.String r10 = "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponent (NonFoodBasketComponent.kt:26)"
            r11 = 1550037297(0x5c63b131, float:2.56358575E17)
            androidx.compose.runtime.ComposerKt.m29845w0(r11, r8, r9, r10)
        L_0x0109:
            androidx.compose.ui.c$a r9 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r9 = r9.mo17066i()
            com.carrefour.fid.android.design.theme.b r10 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r18 = r10.mo114231a0()
            r20 = 0
            r21 = 2
            r22 = 0
            r17 = r2
            androidx.compose.ui.m r10 = androidx.compose.foundation.BackgroundKt.m8825d(r17, r18, r20, r21, r22)
            r11 = 16
            float r11 = (float) r11
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r11)
            r13 = 0
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10026m(r10, r13, r11, r0, r12)
            r11 = 3
            androidx.compose.ui.m r10 = androidx.compose.animation.AnimationModifierKt.m7766b(r10, r12, r12, r11, r12)
            r11 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.mo14918M(r11)
            r11 = 6
            androidx.compose.ui.layout.f0 r9 = androidx.compose.foundation.layout.BoxKt.m9849k(r9, r14, r1, r11)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r11)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r1.mo15032w(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.p004ui.unit.LayoutDirection) r0
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r13 = r18.mo44585a()
            kotlin.jvm.functions.q r10 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r10)
            androidx.compose.runtime.d r14 = r1.mo15017r()
            boolean r14 = r14 instanceof androidx.compose.runtime.C8428d
            if (r14 != 0) goto L_0x0176
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0176:
            r1.mo14938T()
            boolean r14 = r1.mo14997l()
            if (r14 == 0) goto L_0x0183
            r1.mo14947W(r13)
            goto L_0x0186
        L_0x0183:
            r1.mo14888A()
        L_0x0186:
            r1.mo14941U()
            androidx.compose.runtime.o r13 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r14 = r18.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r13, r9, r14)
            kotlin.jvm.functions.p r9 = r18.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r13, r11, r9)
            kotlin.jvm.functions.p r9 = r18.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r13, r0, r9)
            kotlin.jvm.functions.p r0 = r18.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r13, r12, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r9 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r10.invoke(r0, r1, r11)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            boolean r0 = r4 instanceof com.carrefour.fid.android.product.presentation.models.C27647a.C27648a
            r9 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            if (r0 == 0) goto L_0x022b
            r0 = 116739005(0x6f54bbd, float:9.2270045E-35)
            r1.mo14918M(r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r10 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r10, r12, r11)
            r10 = 0
            java.lang.String r14 = m116827d(r3, r5)
            r16 = 0
            r17 = 0
            r1.mo14918M(r9)
            boolean r9 = r1.mo15006n0(r6)
            boolean r18 = r1.mo15006n0(r4)
            r9 = r9 | r18
            java.lang.Object r12 = r1.mo14921N()
            if (r9 != 0) goto L_0x01ff
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r12 != r9) goto L_0x0207
        L_0x01ff:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentKt$NonFoodBasketComponent$2$1$1 r12 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentKt$NonFoodBasketComponent$2$1$1
            r12.<init>(r6, r4)
            r1.mo14893C(r12)
        L_0x0207:
            r1.mo15002m0()
            r18 = r12
            kotlin.jvm.functions.a r18 = (kotlin.jvm.functions.C11289a) r18
            r9 = 6
            int r8 = r8 >> r9
            r8 = r8 & 112(0x70, float:1.57E-43)
            r19 = r8 | 6
            r20 = 108(0x6c, float:1.51E-43)
            r8 = r0
            r9 = r27
            r12 = 0
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r1
            com.carrefour.fid.android.design.components.compose.AddToCartComponentKt.m151307c(r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20)
            r1.mo15002m0()
            goto L_0x02a4
        L_0x022b:
            com.carrefour.fid.android.product.presentation.models.a$b r0 = com.carrefour.fid.android.product.presentation.models.C27647a.C27649b.f67173b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x024b
            r0 = 116739333(0x6f54d05, float:9.227193E-35)
            r1.mo14918M(r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r10 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r10, r12, r11)
            r8 = 0
            r9 = 6
            com.carrefour.fid.android.design.components.compose.AddToCartComponentKt.m151309e(r0, r1, r9, r8)
            r1.mo15002m0()
            goto L_0x02a4
        L_0x024b:
            r10 = 0
            r11 = 0
            r12 = 1
            boolean r0 = r4 instanceof com.carrefour.fid.android.product.presentation.models.C27647a.C27650c
            if (r0 == 0) goto L_0x029b
            r0 = 116739485(0x6f54d9d, float:9.22728E-35)
            r1.mo14918M(r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r10, r12, r11)
            int r10 = r4.mo80334a()
            r1.mo14918M(r9)
            boolean r9 = r1.mo15006n0(r6)
            boolean r11 = r1.mo15006n0(r4)
            r9 = r9 | r11
            java.lang.Object r11 = r1.mo14921N()
            if (r9 != 0) goto L_0x027c
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r11 != r9) goto L_0x0284
        L_0x027c:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentKt$NonFoodBasketComponent$2$2$1 r11 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentKt$NonFoodBasketComponent$2$2$1
            r11.<init>(r6, r4)
            r1.mo14893C(r11)
        L_0x0284:
            r1.mo15002m0()
            kotlin.jvm.functions.a r11 = (kotlin.jvm.functions.C11289a) r11
            r9 = 6
            int r8 = r8 >> r9
            r8 = r8 & 112(0x70, float:1.57E-43)
            r13 = r8 | 6
            r14 = 0
            r8 = r0
            r9 = r27
            r12 = r1
            com.carrefour.fid.android.product.presentation.p039ui.details.views.AddToCartComponentKt.m117105a(r8, r9, r10, r11, r12, r13, r14)
            r1.mo15002m0()
            goto L_0x02a4
        L_0x029b:
            r0 = 116739799(0x6f54ed7, float:9.22746E-35)
            r1.mo14918M(r0)
            r1.mo15002m0()
        L_0x02a4:
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02b9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02b9:
            r8 = r4
        L_0x02ba:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x02c1
            goto L_0x02d4
        L_0x02c1:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentKt$NonFoodBasketComponent$3 r10 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentKt$NonFoodBasketComponent$3
            r0 = r10
            r1 = r2
            r2 = r3
            r3 = r5
            r4 = r27
            r5 = r8
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x02d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodBasketComponentKt.m116824a(androidx.compose.ui.m, com.carrefour.fid.android.domain.models.offer.Prices, com.carrefour.fid.android.domain.models.offer.Discount, boolean, com.carrefour.fid.android.product.presentation.models.a, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m116825b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1000658584);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1000658584, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentPreview (NonFoodBasketComponent.kt:82)");
            }
            ThemeKt.m153788a(ComposableSingletons$NonFoodBasketComponentKt.f67423a.mo80799b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodBasketComponentKt$NonFoodBasketComponentPreview$1(i));
        }
    }

    /* renamed from: d */
    public static final String m116827d(Prices prices, Discount discount) {
        OfferDiscountType offerDiscountType;
        double d;
        PromoType A;
        if (prices == null) {
            return "";
        }
        if (discount == null || (A = discount.mo117953A()) == null) {
            offerDiscountType = null;
        } else {
            offerDiscountType = C27659c.m116373k(A);
        }
        if (offerDiscountType != null) {
            return C27641a.m116296a(discount.mo117980t());
        }
        if (prices.mo118171l() > 0.0d) {
            d = prices.mo118171l();
        } else {
            d = prices.mo118172m();
        }
        return C28782t.m119105b(Double.valueOf(d));
    }
}
