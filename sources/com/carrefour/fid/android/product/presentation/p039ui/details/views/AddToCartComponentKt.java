package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nAddToCartComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddToCartComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/AddToCartComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,85:1\n25#2:86\n50#2:94\n49#2:95\n1114#3,3:87\n1117#3,3:91\n1114#3,6:96\n154#4:90\n*S KotlinDebug\n*F\n+ 1 AddToCartComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/AddToCartComponentKt\n*L\n36#1:86\n39#1:94\n39#1:95\n36#1:87,3\n36#1:91,3\n39#1:96,6\n36#1:90\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt */
public final class AddToCartComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117105a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r23, boolean r24, int r25, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r26, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r27, int r28, int r29) {
        /*
            r2 = r24
            r5 = r28
            r0 = 472865856(0x1c2f5c40, float:5.8021873E-22)
            r1 = r27
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r29 & 1
            if (r3 == 0) goto L_0x0017
            r4 = r5 | 6
            r6 = r4
            r4 = r23
            goto L_0x002b
        L_0x0017:
            r4 = r5 & 14
            if (r4 != 0) goto L_0x0028
            r4 = r23
            boolean r6 = r1.mo15006n0(r4)
            if (r6 == 0) goto L_0x0025
            r6 = 4
            goto L_0x0026
        L_0x0025:
            r6 = 2
        L_0x0026:
            r6 = r6 | r5
            goto L_0x002b
        L_0x0028:
            r4 = r23
            r6 = r5
        L_0x002b:
            r7 = r29 & 2
            if (r7 == 0) goto L_0x0032
            r6 = r6 | 48
            goto L_0x0042
        L_0x0032:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0042
            boolean r7 = r1.mo14961b(r2)
            if (r7 == 0) goto L_0x003f
            r7 = 32
            goto L_0x0041
        L_0x003f:
            r7 = 16
        L_0x0041:
            r6 = r6 | r7
        L_0x0042:
            r7 = r29 & 4
            if (r7 == 0) goto L_0x0049
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x005c
            r8 = r25
            boolean r9 = r1.mo14976f(r8)
            if (r9 == 0) goto L_0x0058
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r6 = r6 | r9
            goto L_0x005e
        L_0x005c:
            r8 = r25
        L_0x005e:
            r9 = r29 & 8
            if (r9 == 0) goto L_0x0065
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0065:
            r10 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0078
            r10 = r26
            boolean r11 = r1.mo14927P(r10)
            if (r11 == 0) goto L_0x0074
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r6 = r6 | r11
            goto L_0x007a
        L_0x0078:
            r10 = r26
        L_0x007a:
            r11 = r6 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x0090
            boolean r11 = r1.mo15011p()
            if (r11 != 0) goto L_0x0087
            goto L_0x0090
        L_0x0087:
            r1.mo14958a0()
            r3 = r4
            r19 = r8
            r4 = r10
            goto L_0x0156
        L_0x0090:
            if (r3 == 0) goto L_0x0095
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0096
        L_0x0095:
            r3 = r4
        L_0x0096:
            if (r7 == 0) goto L_0x009a
            r15 = 1
            goto L_0x009b
        L_0x009a:
            r15 = r8
        L_0x009b:
            if (r9 == 0) goto L_0x00a1
            com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$1 r7 = com.carrefour.fid.android.product.presentation.p039ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$1.f67578f
            r13 = r7
            goto L_0x00a2
        L_0x00a1:
            r13 = r10
        L_0x00a2:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00ae
            r7 = -1
            java.lang.String r8 = "com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartWithQuantityComponent (AddToCartComponent.kt:29)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r7, r8)
        L_0x00ae:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r0)
            java.lang.Object r0 = r1.mo14921N()
            androidx.compose.runtime.o$a r18 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r18.mo16277a()
            if (r0 != r6) goto L_0x00ce
            r0 = 40
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.unit.g r0 = androidx.compose.p004ui.unit.C16483g.m74451w(r0)
            r1.mo14893C(r0)
        L_0x00ce:
            r1.mo15002m0()
            androidx.compose.ui.unit.g r0 = (androidx.compose.p004ui.unit.C16483g) r0
            float r0 = r0.mo47823t0()
            androidx.compose.ui.m r19 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r0)
            androidx.compose.material.i r6 = androidx.compose.material.C3049i.f8133a
            com.carrefour.fid.android.design.theme.b r7 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r7 = r7.mo114219P()
            r9 = 0
            r11 = 0
            r16 = 0
            int r14 = androidx.compose.material.C3049i.f8145m
            int r20 = r14 << 12
            r21 = 14
            r4 = r13
            r13 = r16
            r22 = r15
            r15 = r1
            r16 = r20
            r17 = r21
            androidx.compose.material.h r13 = r6.mo10775a(r7, r9, r11, r13, r15, r16, r17)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r24)
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r7)
            boolean r6 = r1.mo15006n0(r6)
            boolean r7 = r1.mo15006n0(r4)
            r6 = r6 | r7
            java.lang.Object r7 = r1.mo14921N()
            if (r6 != 0) goto L_0x011c
            java.lang.Object r6 = r18.mo16277a()
            if (r7 != r6) goto L_0x0124
        L_0x011c:
            com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$2$1 r7 = new com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$2$1
            r7.<init>(r2, r4)
            r1.mo14893C(r7)
        L_0x0124:
            r1.mo15002m0()
            r6 = r7
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$3 r7 = new com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$3
            r15 = r22
            r7.<init>(r2, r0, r15)
            r0 = -506987472(0xffffffffe1c7fc30, float:-4.6113426E20)
            r14 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r0, r14, r7)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r18 = 380(0x17c, float:5.32E-43)
            r7 = r19
            r14 = 0
            r19 = r15
            r15 = r0
            r16 = r1
            androidx.compose.material.ButtonKt.m13343a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0156
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0156:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x015d
            goto L_0x016f
        L_0x015d:
            com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$4 r8 = new com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$4
            r0 = r8
            r1 = r3
            r2 = r24
            r3 = r19
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.views.AddToCartComponentKt.m117105a(androidx.compose.ui.m, boolean, int, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m117106b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-680619470);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-680619470, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.ServiceChoiceQuantityOnlyComponentPreview (AddToCartComponent.kt:72)");
            }
            ThemeKt.m153788a(ComposableSingletons$AddToCartComponentKt.f67580a.mo81146b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AddToCartComponentKt$ServiceChoiceQuantityOnlyComponentPreview$1(i));
        }
    }
}
