package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nValidatePaymentComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidatePaymentComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/ValidatePaymentComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,120:1\n154#2:121\n*S KotlinDebug\n*F\n+ 1 ValidatePaymentComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/ValidatePaymentComponentKt\n*L\n41#1:121\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentKt */
public final class ValidatePaymentComponentKt {
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104655a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r27, double r28, boolean r30, boolean r31, @org.jetbrains.annotations.C12579k java.lang.String r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r36
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onValidate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onCgvClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 528463804(0x1f7fb7bc, float:5.4150332E-20)
            r1 = r35
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r37 & 1
            if (r1 == 0) goto L_0x002a
            r2 = r13 | 6
            r3 = r2
            r2 = r27
            goto L_0x003e
        L_0x002a:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x003b
            r2 = r27
            boolean r3 = r15.mo15006n0(r2)
            if (r3 == 0) goto L_0x0038
            r3 = 4
            goto L_0x0039
        L_0x0038:
            r3 = 2
        L_0x0039:
            r3 = r3 | r13
            goto L_0x003e
        L_0x003b:
            r2 = r27
            r3 = r13
        L_0x003e:
            r4 = r37 & 2
            r5 = 16
            if (r4 == 0) goto L_0x0049
            r3 = r3 | 48
            r8 = r28
            goto L_0x005a
        L_0x0049:
            r4 = r13 & 112(0x70, float:1.57E-43)
            r8 = r28
            if (r4 != 0) goto L_0x005a
            boolean r4 = r15.mo14993k(r8)
            if (r4 == 0) goto L_0x0058
            r4 = 32
            goto L_0x0059
        L_0x0058:
            r4 = r5
        L_0x0059:
            r3 = r3 | r4
        L_0x005a:
            r4 = r37 & 4
            if (r4 == 0) goto L_0x0063
            r3 = r3 | 384(0x180, float:5.38E-43)
            r14 = r30
            goto L_0x0075
        L_0x0063:
            r4 = r13 & 896(0x380, float:1.256E-42)
            r14 = r30
            if (r4 != 0) goto L_0x0075
            boolean r4 = r15.mo14961b(r14)
            if (r4 == 0) goto L_0x0072
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0074
        L_0x0072:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0074:
            r3 = r3 | r4
        L_0x0075:
            r4 = r37 & 8
            if (r4 == 0) goto L_0x007e
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r7 = r31
            goto L_0x0090
        L_0x007e:
            r4 = r13 & 7168(0x1c00, float:1.0045E-41)
            r7 = r31
            if (r4 != 0) goto L_0x0090
            boolean r4 = r15.mo14961b(r7)
            if (r4 == 0) goto L_0x008d
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x008f
        L_0x008d:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x008f:
            r3 = r3 | r4
        L_0x0090:
            r4 = r37 & 16
            if (r4 == 0) goto L_0x0097
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a9
        L_0x0097:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x00a9
            boolean r4 = r15.mo15006n0(r10)
            if (r4 == 0) goto L_0x00a6
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r3 = r3 | r4
        L_0x00a9:
            r4 = r37 & 32
            if (r4 == 0) goto L_0x00b1
            r4 = 196608(0x30000, float:2.75506E-40)
        L_0x00af:
            r3 = r3 | r4
            goto L_0x00c2
        L_0x00b1:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x00c2
            boolean r4 = r15.mo14927P(r11)
            if (r4 == 0) goto L_0x00bf
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00bf:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00af
        L_0x00c2:
            r4 = r37 & 64
            if (r4 == 0) goto L_0x00ca
            r4 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c8:
            r3 = r3 | r4
            goto L_0x00db
        L_0x00ca:
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x00db
            boolean r4 = r15.mo14927P(r12)
            if (r4 == 0) goto L_0x00d8
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c8
        L_0x00d8:
            r4 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c8
        L_0x00db:
            r4 = 2995931(0x2db6db, float:4.198194E-39)
            r4 = r4 & r3
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r4 != r6) goto L_0x00f3
            boolean r4 = r15.mo15011p()
            if (r4 != 0) goto L_0x00eb
            goto L_0x00f3
        L_0x00eb:
            r15.mo14958a0()
            r26 = r2
            r1 = r15
            goto L_0x0155
        L_0x00f3:
            if (r1 == 0) goto L_0x00fa
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r26 = r1
            goto L_0x00fc
        L_0x00fa:
            r26 = r2
        L_0x00fc:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0108
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponent (ValidatePaymentComponent.kt:30)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r1, r2)
        L_0x0108:
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            float r0 = (float) r5
            float r23 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentKt$ValidatePaymentComponent$1 r6 = new com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentKt$ValidatePaymentComponent$1
            r0 = r6
            r1 = r26
            r2 = r34
            r4 = r28
            r10 = r6
            r6 = r30
            r7 = r32
            r8 = r31
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            r0 = 708909304(0x2a4118f8, float:1.7150506E-13)
            r1 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r0, r1, r10)
            r24 = 1769472(0x1b0000, float:2.479558E-39)
            r25 = 31
            r14 = r16
            r1 = r15
            r15 = r17
            r16 = r18
            r18 = r20
            r20 = r22
            r21 = r23
            r22 = r0
            r23 = r1
            androidx.compose.material.SurfaceKt.m13879b(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0155
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0155:
            androidx.compose.runtime.t1 r14 = r1.mo15020s()
            if (r14 != 0) goto L_0x015c
            goto L_0x0177
        L_0x015c:
            com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentKt$ValidatePaymentComponent$2 r15 = new com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentKt$ValidatePaymentComponent$2
            r0 = r15
            r1 = r26
            r2 = r28
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r36
            r10 = r37
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10)
            r14.mo15202a(r15)
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.common.ValidatePaymentComponentKt.m104655a(androidx.compose.ui.m, double, boolean, boolean, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104656b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1501340467);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1501340467, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentPreview (ValidatePaymentComponent.kt:107)");
            }
            ThemeKt.m153788a(ComposableSingletons$ValidatePaymentComponentKt.f59414a.mo68810a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ValidatePaymentComponentKt$ValidatePaymentComponentPreview$1(i));
        }
    }
}
