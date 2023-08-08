package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDeliveryChoiceInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryChoiceInfoScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/DeliveryChoiceInfoScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,255:1\n154#2:256\n154#2:257\n154#2:258\n154#2:310\n75#3,6:259\n81#3:291\n85#3:309\n75#4:265\n76#4,11:267\n89#4:308\n76#5:266\n460#6,13:278\n473#6,3:305\n1098#7:292\n927#7,6:293\n927#7,6:299\n*S KotlinDebug\n*F\n+ 1 DeliveryChoiceInfoScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/DeliveryChoiceInfoScreenKt\n*L\n178#1:256\n184#1:257\n193#1:258\n236#1:310\n206#1:259,6\n206#1:291\n206#1:309\n206#1:265\n206#1:267,11\n206#1:308\n206#1:266\n206#1:278,13\n206#1:305,3\n208#1:292\n211#1:293,6\n218#1:299,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt */
public final class DeliveryChoiceInfoScreenKt {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116807a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.ScrollState r32, boolean r33, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r1 = r32
            r2 = r33
            r4 = r36
            java.lang.String r0 = "scrollState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -1849851108(0xffffffff91bd831c, float:-2.9899745E-28)
            r3 = r35
            androidx.compose.runtime.o r3 = r3.mo15009o(r0)
            r5 = r37 & 1
            if (r5 == 0) goto L_0x001b
            r5 = r4 | 6
            goto L_0x002b
        L_0x001b:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x002a
            boolean r5 = r3.mo15006n0(r1)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r4
            goto L_0x002b
        L_0x002a:
            r5 = r4
        L_0x002b:
            r6 = r37 & 2
            if (r6 == 0) goto L_0x0032
            r5 = r5 | 48
            goto L_0x0042
        L_0x0032:
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r3.mo14961b(r2)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r5 = r5 | r6
        L_0x0042:
            r6 = r37 & 4
            if (r6 == 0) goto L_0x0049
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005c
            r7 = r34
            boolean r8 = r3.mo14927P(r7)
            if (r8 == 0) goto L_0x0058
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r5 = r5 | r8
            goto L_0x005e
        L_0x005c:
            r7 = r34
        L_0x005e:
            r15 = r5
            r5 = r15 & 731(0x2db, float:1.024E-42)
            r8 = 146(0x92, float:2.05E-43)
            if (r5 != r8) goto L_0x0070
            boolean r5 = r3.mo15011p()
            if (r5 != 0) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            r3.mo14958a0()
            goto L_0x00d2
        L_0x0070:
            if (r6 == 0) goto L_0x0076
            com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$1 r5 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$1.f67436f
            r14 = r5
            goto L_0x0077
        L_0x0076:
            r14 = r7
        L_0x0077:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x0083
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreen (DeliveryChoiceInfoScreen.kt:50)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r15, r5, r6)
        L_0x0083:
            r5 = 0
            r6 = 0
            com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$2 r0 = new com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$2
            r0.<init>(r14, r15)
            r7 = -1645703945(0xffffffff9de88cf7, float:-6.1555643E-21)
            r13 = 1
            androidx.compose.runtime.internal.a r7 = androidx.compose.runtime.internal.C8553b.m31048b(r3, r7, r13, r0)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r0 = 0
            r5 = r13
            r13 = r0
            r0 = 0
            r6 = r14
            r14 = r0
            r0 = 0
            r8 = r15
            r15 = r0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$3 r0 = new com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$3
            r0.<init>(r1, r2, r6, r8)
            r8 = 692321822(0x2943fe1e, float:4.351911E-14)
            androidx.compose.runtime.internal.a r27 = androidx.compose.runtime.internal.C8553b.m31048b(r3, r8, r5, r0)
            r29 = 384(0x180, float:5.38E-43)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r31 = 131067(0x1fffb, float:1.83664E-40)
            r28 = r3
            r0 = r6
            r5 = 0
            r6 = 0
            r8 = 0
            androidx.compose.material.ScaffoldKt.m13747a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31)
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x00d1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d1:
            r7 = r0
        L_0x00d2:
            androidx.compose.runtime.t1 r6 = r3.mo15020s()
            if (r6 != 0) goto L_0x00d9
            goto L_0x00eb
        L_0x00d9:
            com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$4 r8 = new com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$4
            r0 = r8
            r1 = r32
            r2 = r33
            r3 = r7
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r8)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116807a(androidx.compose.foundation.ScrollState, boolean, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m116808b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1921289976);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1921289976, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenPreview (DeliveryChoiceInfoScreen.kt:245)");
            }
            ThemeKt.m153788a(ComposableSingletons$DeliveryChoiceInfoScreenKt.f67416a.mo80794c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreenPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m116809c(boolean z, @C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(1011422020);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo14961b(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(aVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                aVar = DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoStateful$1.f67437f;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1011422020, i3, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoStateful (DeliveryChoiceInfoScreen.kt:37)");
            }
            int i7 = i3 << 3;
            m116807a(ScrollKt.m9056c(0, o, 0, 1), z, aVar, o, (i7 & 112) | (i7 & 896), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoStateful$2(z, aVar, i, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012a  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116810d(boolean r37, boolean r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, androidx.compose.runtime.C8592o r44, int r45, int r46) {
        /*
            r4 = r40
            r8 = r45
            r0 = -2026275237(0xffffffff87397e5b, float:-1.3954986E-34)
            r1 = r44
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r46 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r8 | 6
            r5 = r3
            r3 = r37
            goto L_0x002b
        L_0x0017:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x0028
            r3 = r37
            boolean r5 = r1.mo14961b(r3)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r8
            goto L_0x002b
        L_0x0028:
            r3 = r37
            r5 = r8
        L_0x002b:
            r6 = r46 & 2
            if (r6 == 0) goto L_0x0032
            r5 = r5 | 48
            goto L_0x0045
        L_0x0032:
            r9 = r8 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0045
            r9 = r38
            boolean r10 = r1.mo14961b(r9)
            if (r10 == 0) goto L_0x0041
            r10 = 32
            goto L_0x0043
        L_0x0041:
            r10 = 16
        L_0x0043:
            r5 = r5 | r10
            goto L_0x0047
        L_0x0045:
            r9 = r38
        L_0x0047:
            r10 = r8 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0060
            r10 = r46 & 4
            if (r10 != 0) goto L_0x005a
            r10 = r39
            boolean r11 = r1.mo15006n0(r10)
            if (r11 == 0) goto L_0x005c
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005a:
            r10 = r39
        L_0x005c:
            r11 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r11
            goto L_0x0062
        L_0x0060:
            r10 = r39
        L_0x0062:
            r11 = r46 & 8
            if (r11 == 0) goto L_0x0069
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0069:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0079
            boolean r11 = r1.mo15006n0(r4)
            if (r11 == 0) goto L_0x0076
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r5 = r5 | r11
        L_0x0079:
            r11 = r46 & 16
            r34 = 57344(0xe000, float:8.0356E-41)
            if (r11 == 0) goto L_0x0085
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r15 = r41
            goto L_0x0097
        L_0x0085:
            r11 = r8 & r34
            r15 = r41
            if (r11 != 0) goto L_0x0097
            boolean r11 = r1.mo15006n0(r15)
            if (r11 == 0) goto L_0x0094
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r5 = r5 | r11
        L_0x0097:
            r11 = r46 & 32
            r35 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00a2
            r5 = r5 | r35
            r13 = r42
            goto L_0x00b5
        L_0x00a2:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r8
            r13 = r42
            if (r11 != 0) goto L_0x00b5
            boolean r11 = r1.mo15006n0(r13)
            if (r11 == 0) goto L_0x00b2
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r5 = r5 | r11
        L_0x00b5:
            r11 = r46 & 64
            if (r11 == 0) goto L_0x00bd
            r12 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r12
            goto L_0x00d1
        L_0x00bd:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x00d1
            r12 = r43
            boolean r14 = r1.mo15006n0(r12)
            if (r14 == 0) goto L_0x00cd
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r5 = r5 | r14
            goto L_0x00d3
        L_0x00d1:
            r12 = r43
        L_0x00d3:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r5
            r7 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r7) goto L_0x00ea
            boolean r7 = r1.mo15011p()
            if (r7 != 0) goto L_0x00e3
            goto L_0x00ea
        L_0x00e3:
            r1.mo14958a0()
            r2 = r9
            r7 = r12
            goto L_0x01de
        L_0x00ea:
            r1.mo14930Q()
            r7 = r8 & 1
            r14 = 0
            if (r7 == 0) goto L_0x0107
            boolean r7 = r1.mo14977f0()
            if (r7 == 0) goto L_0x00f9
            goto L_0x0107
        L_0x00f9:
            r1.mo14958a0()
            r2 = r46 & 4
            if (r2 == 0) goto L_0x0102
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0102:
            r7 = r5
            r2 = r9
            r5 = r10
            r6 = r12
            goto L_0x0121
        L_0x0107:
            if (r2 == 0) goto L_0x010a
            r3 = r14
        L_0x010a:
            if (r6 == 0) goto L_0x010d
            r9 = r14
        L_0x010d:
            r2 = r46 & 4
            if (r2 == 0) goto L_0x0119
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r10 = r2
        L_0x0119:
            if (r11 == 0) goto L_0x0102
            java.lang.String r2 = ""
            r6 = r2
            r7 = r5
            r2 = r9
            r5 = r10
        L_0x0121:
            r1.mo14899E()
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0130
            r9 = -1
            java.lang.String r10 = "com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryTypeComponent (DeliveryChoiceInfoScreen.kt:167)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r9, r10)
        L_0x0130:
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r9 = 8
            float r9 = (float) r9
            float r17 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 14
            r22 = 0
            r16 = r0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            int r10 = r7 >> 9
            r10 = r10 & 14
            r10 = r10 | 48
            m116813g(r4, r9, r1, r10, r14)
            androidx.compose.material.t0 r9 = androidx.compose.material.C7933t0.f19075a
            int r10 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r9 = r9.mo11077c(r1, r10)
            androidx.compose.ui.text.p0 r29 = com.carrefour.fid.android.design.theme.C37477d.m153890b(r9)
            int r9 = com.carrefour.fid.android.product.C27609f.C27615f.ds_grey_10
            long r11 = androidx.compose.p004ui.res.C16009b.m71825a(r9, r1, r14)
            r9 = 16
            float r9 = (float) r9
            float r17 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r16 = 0
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            int r30 = r7 >> 12
            r30 = r30 & 14
            r31 = r30 | 48
            r32 = 0
            r33 = 65528(0xfff8, float:9.1824E-41)
            r36 = r9
            r9 = r41
            r30 = r1
            androidx.compose.material.TextKt.m14196c(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            float r16 = androidx.compose.p004ui.unit.C16483g.m74435M(r36)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 14
            r15 = r0
            androidx.compose.ui.m r14 = androidx.compose.foundation.layout.PaddingKt.m10028o(r15, r16, r17, r18, r19, r20, r21)
            int r0 = r7 >> 15
            r0 = r0 & 14
            r0 = r0 | r35
            int r9 = r7 << 3
            r10 = r9 & 112(0x70, float:1.57E-43)
            r0 = r0 | r10
            r10 = r9 & 896(0x380, float:1.256E-42)
            r0 = r0 | r10
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r9
            int r7 = r7 >> 6
            r7 = r7 & r34
            r16 = r0 | r7
            r17 = 0
            r9 = r42
            r10 = r3
            r11 = r2
            r12 = r5
            r13 = r6
            r15 = r1
            m116812f(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01dc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01dc:
            r10 = r5
            r7 = r6
        L_0x01de:
            androidx.compose.runtime.t1 r11 = r1.mo15020s()
            if (r11 != 0) goto L_0x01e5
            goto L_0x01fa
        L_0x01e5:
            com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryTypeComponent$1 r12 = new com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryTypeComponent$1
            r0 = r12
            r1 = r3
            r3 = r10
            r4 = r40
            r5 = r41
            r6 = r42
            r8 = r45
            r9 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.mo15202a(r12)
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116810d(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    /* renamed from: e */
    public static final void m116811e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1952458053);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1952458053, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.FreeShipping (DeliveryChoiceInfoScreen.kt:240)");
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DeliveryChoiceInfoScreenKt$FreeShipping$1(i));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0210  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116812f(java.lang.String r39, boolean r40, boolean r41, java.lang.String r42, java.lang.String r43, androidx.compose.p004ui.C8767m r44, androidx.compose.runtime.C8592o r45, int r46, int r47) {
        /*
            r0 = r39
            r3 = r40
            r8 = r46
            r1 = 1028158689(0x3d4874e1, float:0.04893959)
            r2 = r45
            androidx.compose.runtime.o r2 = r2.mo15009o(r1)
            r4 = r47 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r8 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r8 & 14
            if (r4 != 0) goto L_0x0025
            boolean r4 = r2.mo15006n0(r0)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r8
            goto L_0x0026
        L_0x0025:
            r4 = r8
        L_0x0026:
            r5 = r47 & 2
            if (r5 == 0) goto L_0x002d
            r4 = r4 | 48
            goto L_0x003d
        L_0x002d:
            r5 = r8 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x003d
            boolean r5 = r2.mo14961b(r3)
            if (r5 == 0) goto L_0x003a
            r5 = 32
            goto L_0x003c
        L_0x003a:
            r5 = 16
        L_0x003c:
            r4 = r4 | r5
        L_0x003d:
            r5 = r47 & 4
            if (r5 == 0) goto L_0x0044
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0057
        L_0x0044:
            r7 = r8 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0057
            r7 = r41
            boolean r9 = r2.mo14961b(r7)
            if (r9 == 0) goto L_0x0053
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0053:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r4 = r4 | r9
            goto L_0x0059
        L_0x0057:
            r7 = r41
        L_0x0059:
            r9 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0072
            r9 = r47 & 8
            if (r9 != 0) goto L_0x006c
            r9 = r42
            boolean r10 = r2.mo15006n0(r9)
            if (r10 == 0) goto L_0x006e
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0070
        L_0x006c:
            r9 = r42
        L_0x006e:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0070:
            r4 = r4 | r10
            goto L_0x0074
        L_0x0072:
            r9 = r42
        L_0x0074:
            r10 = r47 & 16
            if (r10 == 0) goto L_0x007b
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0090
        L_0x007b:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r8
            if (r11 != 0) goto L_0x0090
            r11 = r43
            boolean r12 = r2.mo15006n0(r11)
            if (r12 == 0) goto L_0x008c
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008e
        L_0x008c:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r4 = r4 | r12
            goto L_0x0092
        L_0x0090:
            r11 = r43
        L_0x0092:
            r12 = r47 & 32
            if (r12 == 0) goto L_0x009c
            r12 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r12
            r15 = r44
            goto L_0x00af
        L_0x009c:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r8
            r15 = r44
            if (r12 != 0) goto L_0x00af
            boolean r12 = r2.mo15006n0(r15)
            if (r12 == 0) goto L_0x00ac
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r4 = r4 | r12
        L_0x00af:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r4
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00c7
            boolean r12 = r2.mo15011p()
            if (r12 != 0) goto L_0x00bf
            goto L_0x00c7
        L_0x00bf:
            r2.mo14958a0()
            r4 = r7
            r5 = r9
            r6 = r11
            goto L_0x0329
        L_0x00c7:
            r2.mo14930Q()
            r12 = r8 & 1
            if (r12 == 0) goto L_0x00e2
            boolean r12 = r2.mo14977f0()
            if (r12 == 0) goto L_0x00d5
            goto L_0x00e2
        L_0x00d5:
            r2.mo14958a0()
            r5 = r47 & 8
            if (r5 == 0) goto L_0x00de
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00de:
            r14 = r4
            r4 = r9
            r5 = r11
            goto L_0x00f7
        L_0x00e2:
            if (r5 == 0) goto L_0x00e5
            r7 = 0
        L_0x00e5:
            r5 = r47 & 8
            if (r5 == 0) goto L_0x00f1
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r9 = r5
        L_0x00f1:
            if (r10 == 0) goto L_0x00de
            java.lang.String r5 = ""
            r14 = r4
            r4 = r9
        L_0x00f7:
            r2.mo14899E()
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0106
            r9 = -1
            java.lang.String r10 = "com.carrefour.fid.android.product.presentation.ui.details.nal.ShippingFeesComponent (DeliveryChoiceInfoScreen.kt:197)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r14, r9, r10)
        L_0x0106:
            int r1 = r14 >> 15
            r1 = r1 & 14
            r9 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r9 = r9.mo7630p()
            androidx.compose.ui.c$a r10 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r10 = r10.mo17073w()
            int r11 = r1 >> 3
            r12 = r11 & 14
            r11 = r11 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            androidx.compose.ui.layout.f0 r9 = androidx.compose.foundation.layout.RowKt.m10071d(r9, r10, r2, r11)
            int r1 = r1 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r10)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r2.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r2.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r16.mo44585a()
            kotlin.jvm.functions.q r13 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r44)
            int r1 = r1 << 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | 6
            androidx.compose.runtime.d r8 = r2.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x016a
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x016a:
            r2.mo14938T()
            boolean r8 = r2.mo14997l()
            if (r8 == 0) goto L_0x0177
            r2.mo14947W(r6)
            goto L_0x017a
        L_0x0177:
            r2.mo14888A()
        L_0x017a:
            r2.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r8 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r9, r8)
            kotlin.jvm.functions.p r8 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r10, r8)
            kotlin.jvm.functions.p r8 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r11, r8)
            kotlin.jvm.functions.p r8 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r12, r8)
            r2.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            int r1 = r1 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.invoke(r6, r2, r1)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r1)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r1 = -447866217(0xffffffffe54e1a97, float:-6.0831124E22)
            r2.mo14918M(r1)
            androidx.compose.ui.text.d$a r1 = new androidx.compose.ui.text.d$a
            r6 = 0
            r8 = 1
            r9 = 0
            r1.<init>(r9, r8, r6)
            int r6 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_delivery_fees
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r6, r2, r9)
            r1.mo46707l(r6)
            java.lang.String r6 = " "
            r1.mo46707l(r6)
            androidx.compose.ui.text.c0 r8 = new androidx.compose.ui.text.c0
            r18 = r8
            r19 = 0
            r21 = 0
            androidx.compose.ui.text.font.i0$a r9 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r23 = r9.mo46947c()
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 16379(0x3ffb, float:2.2952E-41)
            r38 = 0
            r18.<init>((long) r19, (long) r21, (androidx.compose.p004ui.text.font.C16209i0) r23, (androidx.compose.p004ui.text.font.C16190e0) r24, (androidx.compose.p004ui.text.font.C16194f0) r25, (androidx.compose.p004ui.text.font.C16242u) r26, (java.lang.String) r27, (long) r28, (androidx.compose.p004ui.text.style.C16410a) r30, (androidx.compose.p004ui.text.style.C16439m) r31, (androidx.compose.p004ui.text.intl.C16342f) r32, (long) r33, (androidx.compose.p004ui.text.style.C16434j) r35, (androidx.compose.p004ui.graphics.C15205e4) r36, (int) r37, (kotlin.jvm.internal.DefaultConstructorMarker) r38)
            int r8 = r1.mo46713r(r8)
            r1.mo46707l(r0)     // Catch:{ all -> 0x0344 }
            kotlin.d2 r10 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0344 }
            r1.mo46710o(r8)
            if (r3 == 0) goto L_0x027b
            r1.mo46707l(r6)
            int r8 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_or
            r10 = 0
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r2, r10)
            r1.mo46707l(r8)
            r1.mo46707l(r6)
            r8 = -447865744(0xffffffffe54e1c70, float:-6.0833255E22)
            r2.mo14918M(r8)
            androidx.compose.ui.text.c0 r8 = new androidx.compose.ui.text.c0
            r18 = r8
            r19 = 0
            r21 = 0
            androidx.compose.ui.text.font.i0 r23 = r9.mo46947c()
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 16379(0x3ffb, float:2.2952E-41)
            r38 = 0
            r18.<init>((long) r19, (long) r21, (androidx.compose.p004ui.text.font.C16209i0) r23, (androidx.compose.p004ui.text.font.C16190e0) r24, (androidx.compose.p004ui.text.font.C16194f0) r25, (androidx.compose.p004ui.text.font.C16242u) r26, (java.lang.String) r27, (long) r28, (androidx.compose.p004ui.text.style.C16410a) r30, (androidx.compose.p004ui.text.style.C16439m) r31, (androidx.compose.p004ui.text.intl.C16342f) r32, (long) r33, (androidx.compose.p004ui.text.style.C16434j) r35, (androidx.compose.p004ui.graphics.C15205e4) r36, (int) r37, (kotlin.jvm.internal.DefaultConstructorMarker) r38)
            int r8 = r1.mo46713r(r8)
            int r9 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_free     // Catch:{ all -> 0x0276 }
            r10 = 0
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r9, r2, r10)     // Catch:{ all -> 0x0276 }
            r1.mo46707l(r9)     // Catch:{ all -> 0x0276 }
            r1.mo46710o(r8)
            r2.mo15002m0()
            r1.mo46707l(r6)
            int r8 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_condition
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r2, r10)
            r1.mo46707l(r8)
            r1.mo46707l(r6)
            r1.mo46707l(r5)
            goto L_0x027b
        L_0x0276:
            r0 = move-exception
            r1.mo46710o(r8)
            throw r0
        L_0x027b:
            androidx.compose.ui.text.d r9 = r1.mo46716u()
            r2.mo15002m0()
            androidx.compose.material.t0 r1 = androidx.compose.material.C7933t0.f19075a
            int r6 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r8 = r1.mo11077c(r2, r6)
            androidx.compose.ui.text.p0 r30 = com.carrefour.fid.android.design.theme.C37477d.m153890b(r8)
            int r8 = com.carrefour.fid.android.product.C27609f.C27615f.ds_grey_10
            r13 = 0
            long r11 = androidx.compose.p004ui.res.C16009b.m71825a(r8, r2, r13)
            r10 = 0
            r16 = 0
            r35 = r14
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r32 = 0
            r33 = 0
            r34 = 131066(0x1fffa, float:1.83663E-40)
            r31 = r2
            androidx.compose.material.TextKt.m14197d(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            if (r7 == 0) goto L_0x031d
            androidx.compose.material.w1 r1 = r1.mo11077c(r2, r6)
            androidx.compose.ui.text.p0 r29 = com.carrefour.fid.android.design.theme.C37477d.m153890b(r1)
            r1 = 0
            long r11 = androidx.compose.p004ui.res.C16009b.m71825a(r8, r2, r1)
            androidx.compose.ui.m$a r13 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 16
            float r1 = (float) r1
            float r14 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 14
            r19 = 0
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10028o(r13, r14, r15, r16, r17, r18, r19)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            int r1 = r35 >> 9
            r1 = r1 & 14
            r31 = r1 | 48
            r32 = 0
            r33 = 65528(0xfff8, float:9.1824E-41)
            r9 = r4
            r30 = r2
            androidx.compose.material.TextKt.m14196c(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x031d:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0326
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0326:
            r6 = r5
            r5 = r4
            r4 = r7
        L_0x0329:
            androidx.compose.runtime.t1 r10 = r2.mo15020s()
            if (r10 != 0) goto L_0x0330
            goto L_0x0343
        L_0x0330:
            com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$ShippingFeesComponent$2 r11 = new com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$ShippingFeesComponent$2
            r1 = r11
            r2 = r39
            r3 = r40
            r7 = r44
            r8 = r46
            r9 = r47
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x0343:
            return
        L_0x0344:
            r0 = move-exception
            r1.mo46710o(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116812f(java.lang.String, boolean, boolean, java.lang.String, java.lang.String, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116813g(java.lang.String r27, androidx.compose.p004ui.C8767m r28, androidx.compose.runtime.C8592o r29, int r30, int r31) {
        /*
            r1 = r27
            r0 = r30
            r15 = r31
            r2 = 386165016(0x17046918, float:4.2784147E-25)
            r3 = r29
            androidx.compose.runtime.o r13 = r3.mo15009o(r2)
            r3 = r15 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r0 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r0 & 14
            if (r3 != 0) goto L_0x0025
            boolean r3 = r13.mo15006n0(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r0
            goto L_0x0026
        L_0x0025:
            r3 = r0
        L_0x0026:
            r4 = r15 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
            goto L_0x0040
        L_0x002d:
            r5 = r0 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0040
            r5 = r28
            boolean r6 = r13.mo15006n0(r5)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r3 = r3 | r6
            goto L_0x0042
        L_0x0040:
            r5 = r28
        L_0x0042:
            r14 = r3
            r3 = r14 & 91
            r6 = 18
            if (r3 != r6) goto L_0x0056
            boolean r3 = r13.mo15011p()
            if (r3 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r13.mo14958a0()
            r26 = r13
            goto L_0x00b7
        L_0x0056:
            if (r4 == 0) goto L_0x005d
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r25 = r3
            goto L_0x005f
        L_0x005d:
            r25 = r5
        L_0x005f:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x006b
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.product.presentation.ui.details.nal.TitleComponent (DeliveryChoiceInfoScreen.kt:157)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r14, r3, r4)
        L_0x006b:
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            int r3 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r2 = r2.mo11077c(r13, r3)
            androidx.compose.ui.text.p0 r20 = com.carrefour.fid.android.design.theme.C37477d.m153886M(r2)
            com.carrefour.fid.android.design.theme.b r2 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r2 = r2.mo114205B()
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r26 = r13
            r21 = r14
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = r21 & 14
            r21 = r21 & 112(0x70, float:1.57E-43)
            r22 = r22 | r21
            r23 = 0
            r24 = 65528(0xfff8, float:9.1824E-41)
            r0 = r27
            r1 = r25
            r21 = r26
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00b5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00b5:
            r5 = r25
        L_0x00b7:
            androidx.compose.runtime.t1 r0 = r26.mo15020s()
            if (r0 != 0) goto L_0x00be
            goto L_0x00cc
        L_0x00be:
            com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$TitleComponent$1 r1 = new com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$TitleComponent$1
            r2 = r27
            r3 = r30
            r4 = r31
            r1.<init>(r2, r5, r3, r4)
            r0.mo15202a(r1)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116813g(java.lang.String, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }
}
