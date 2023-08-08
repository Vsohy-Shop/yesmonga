package com.carrefour.fid.android.design.components.compose.label;

import androidx.annotation.C0375v;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLabelComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LabelComponent.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,451:1\n154#2:452\n154#2:453\n154#2:454\n154#2:455\n*S KotlinDebug\n*F\n+ 1 LabelComponent.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelComponentKt\n*L\n36#1:452\n73#1:453\n111#1:454\n148#1:455\n*E\n"})
public final class LabelComponentKt {
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151828a(long r20, long r22, long r24, @androidx.annotation.C0375v int r26, @org.jetbrains.annotations.C12579k java.lang.String r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r28, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r29, int r30, int r31) {
        /*
            r3 = r22
            r5 = r24
            r7 = r26
            r8 = r27
            r10 = r30
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = -1993296064(0xffffffff8930b740, float:-2.1271393E-33)
            r1 = r29
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0021
            r2 = r10 | 6
            r14 = r20
            goto L_0x0033
        L_0x0021:
            r2 = r10 & 14
            r14 = r20
            if (r2 != 0) goto L_0x0032
            boolean r2 = r1.mo14980g(r14)
            if (r2 == 0) goto L_0x002f
            r2 = 4
            goto L_0x0030
        L_0x002f:
            r2 = 2
        L_0x0030:
            r2 = r2 | r10
            goto L_0x0033
        L_0x0032:
            r2 = r10
        L_0x0033:
            r9 = r31 & 2
            if (r9 == 0) goto L_0x003a
            r2 = r2 | 48
            goto L_0x004a
        L_0x003a:
            r9 = r10 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x004a
            boolean r9 = r1.mo14980g(r3)
            if (r9 == 0) goto L_0x0047
            r9 = 32
            goto L_0x0049
        L_0x0047:
            r9 = 16
        L_0x0049:
            r2 = r2 | r9
        L_0x004a:
            r9 = r31 & 4
            if (r9 == 0) goto L_0x0051
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x0051:
            r9 = r10 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0061
            boolean r9 = r1.mo14980g(r5)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r2 = r2 | r9
        L_0x0061:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x0068
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0068:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0078
            boolean r9 = r1.mo14976f(r7)
            if (r9 == 0) goto L_0x0075
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r2 = r2 | r9
        L_0x0078:
            r9 = r31 & 16
            if (r9 == 0) goto L_0x007f
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0091
        L_0x007f:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x0091
            boolean r9 = r1.mo15006n0(r8)
            if (r9 == 0) goto L_0x008e
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r2 = r2 | r9
        L_0x0091:
            r9 = r31 & 32
            if (r9 == 0) goto L_0x0099
            r11 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r11
            goto L_0x00ad
        L_0x0099:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r10
            if (r11 != 0) goto L_0x00ad
            r11 = r28
            boolean r12 = r1.mo15006n0(r11)
            if (r12 == 0) goto L_0x00a9
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r2 = r2 | r12
            goto L_0x00af
        L_0x00ad:
            r11 = r28
        L_0x00af:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r2
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00c4
            boolean r12 = r1.mo15011p()
            if (r12 != 0) goto L_0x00bf
            goto L_0x00c4
        L_0x00bf:
            r1.mo14958a0()
            r9 = r11
            goto L_0x0117
        L_0x00c4:
            if (r9 == 0) goto L_0x00c9
            androidx.compose.ui.m$a r9 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00ca
        L_0x00c9:
            r9 = r11
        L_0x00ca:
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x00d6
            r11 = -1
            java.lang.String r12 = "com.carrefour.fid.android.design.components.compose.label.LabelLarge (LabelComponent.kt:62)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r11, r12)
        L_0x00d6:
            r0 = 6
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLarge$1 r11 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLarge$1
            r11.<init>(r5, r7, r2)
            r12 = 235187414(0xe04acd6, float:1.6353474E-30)
            r13 = 1
            androidx.compose.runtime.internal.a r16 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r12, r13, r11)
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLarge$2 r11 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLarge$2
            r11.<init>(r3, r8, r2)
            r12 = -109728331(0xfffffffff975adb5, float:-7.9727245E34)
            androidx.compose.runtime.internal.a r17 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r12, r13, r11)
            r11 = r2 & 14
            r11 = r11 | 28032(0x6d80, float:3.9281E-41)
            int r2 = r2 >> 12
            r2 = r2 & 112(0x70, float:1.57E-43)
            r18 = r11 | r2
            r19 = 0
            r11 = r20
            r13 = r9
            r14 = r0
            r15 = r16
            r16 = r17
            r17 = r1
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt.m151753d(r11, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0117
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0117:
            androidx.compose.runtime.t1 r12 = r1.mo15020s()
            if (r12 != 0) goto L_0x011e
            goto L_0x0135
        L_0x011e:
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLarge$3 r13 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLarge$3
            r0 = r13
            r1 = r20
            r3 = r22
            r5 = r24
            r7 = r26
            r8 = r27
            r10 = r30
            r11 = r31
            r0.<init>(r1, r3, r5, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151828a(long, long, long, int, java.lang.String, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151829b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(524615250);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(524615250, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelLargeCouponAppliedLargePreview (LabelComponent.kt:348)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelComponentKt.f92437a.mo112485o(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelLargeCouponAppliedLargePreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151830c(@androidx.annotation.C0375v int r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21, int r22) {
        /*
            r12 = r18
            r13 = r21
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1208179497(0xffffffffb7fca4d7, float:-3.01175E-5)
            r1 = r20
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r13 | 6
            r15 = r17
            goto L_0x002d
        L_0x001b:
            r1 = r13 & 14
            r15 = r17
            if (r1 != 0) goto L_0x002c
            boolean r1 = r14.mo14976f(r15)
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r13
            goto L_0x002d
        L_0x002c:
            r1 = r13
        L_0x002d:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0034
            r1 = r1 | 48
            goto L_0x0044
        L_0x0034:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0044
            boolean r2 = r14.mo15006n0(r12)
            if (r2 == 0) goto L_0x0041
            r2 = 32
            goto L_0x0043
        L_0x0041:
            r2 = 16
        L_0x0043:
            r1 = r1 | r2
        L_0x0044:
            r2 = r22 & 4
            if (r2 == 0) goto L_0x004b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004b:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005e
            r3 = r19
            boolean r4 = r14.mo15006n0(r3)
            if (r4 == 0) goto L_0x005a
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r1 = r1 | r4
            goto L_0x0060
        L_0x005e:
            r3 = r19
        L_0x0060:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0071
            boolean r4 = r14.mo15011p()
            if (r4 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            r14.mo14958a0()
            goto L_0x00be
        L_0x0071:
            if (r2 == 0) goto L_0x0078
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r2
            goto L_0x007a
        L_0x0078:
            r16 = r3
        L_0x007a:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0086
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.label.LabelLargeDisabled (LabelComponent.kt:86)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0086:
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_grey_60
            r2 = 0
            long r3 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r14, r2)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_grey_10
            long r5 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r14, r2)
            long r7 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r14, r2)
            int r0 = r1 << 9
            r1 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r0
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r10 = r1 | r0
            r11 = 0
            r0 = r3
            r2 = r5
            r4 = r7
            r6 = r17
            r7 = r18
            r8 = r16
            r9 = r14
            m151828a(r0, r2, r4, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00bc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00bc:
            r3 = r16
        L_0x00be:
            androidx.compose.runtime.t1 r6 = r14.mo15020s()
            if (r6 != 0) goto L_0x00c5
            goto L_0x00d6
        L_0x00c5:
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargeDisabled$1 r7 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargeDisabled$1
            r0 = r7
            r1 = r17
            r2 = r18
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151830c(int, java.lang.String, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m151831d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1283655483);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1283655483, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelLargeFidPreview (LabelComponent.kt:375)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelComponentKt.f92437a.mo112472b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelLargeFidPreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151832e(long r17, @androidx.annotation.C0375v int r19, @org.jetbrains.annotations.C12579k java.lang.String r20, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r1 = r17
            r3 = r19
            r4 = r20
            r6 = r23
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 939705120(0x3802c320, float:3.117614E-5)
            r5 = r22
            androidx.compose.runtime.o r5 = r5.mo15009o(r0)
            r7 = r24 & 1
            if (r7 == 0) goto L_0x001d
            r7 = r6 | 6
            goto L_0x002d
        L_0x001d:
            r7 = r6 & 14
            if (r7 != 0) goto L_0x002c
            boolean r7 = r5.mo14980g(r1)
            if (r7 == 0) goto L_0x0029
            r7 = 4
            goto L_0x002a
        L_0x0029:
            r7 = 2
        L_0x002a:
            r7 = r7 | r6
            goto L_0x002d
        L_0x002c:
            r7 = r6
        L_0x002d:
            r8 = r24 & 2
            if (r8 == 0) goto L_0x0034
            r7 = r7 | 48
            goto L_0x0044
        L_0x0034:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0044
            boolean r8 = r5.mo14976f(r3)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r7 = r7 | r8
        L_0x0044:
            r8 = r24 & 4
            if (r8 == 0) goto L_0x004b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x005b
        L_0x004b:
            r8 = r6 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x005b
            boolean r8 = r5.mo15006n0(r4)
            if (r8 == 0) goto L_0x0058
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r7 = r7 | r8
        L_0x005b:
            r8 = r24 & 8
            if (r8 == 0) goto L_0x0062
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0062:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0075
            r9 = r21
            boolean r10 = r5.mo15006n0(r9)
            if (r10 == 0) goto L_0x0071
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r7 = r7 | r10
            goto L_0x0077
        L_0x0075:
            r9 = r21
        L_0x0077:
            r10 = r7 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x0088
            boolean r10 = r5.mo15011p()
            if (r10 != 0) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            r5.mo14958a0()
            goto L_0x00db
        L_0x0088:
            if (r8 == 0) goto L_0x008f
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r8
            goto L_0x0091
        L_0x008f:
            r16 = r9
        L_0x0091:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x009d
            r8 = -1
            java.lang.String r9 = "com.carrefour.fid.android.design.components.compose.label.LabelLargeInfo (LabelComponent.kt:139)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r8, r9)
        L_0x009d:
            androidx.compose.ui.graphics.j2$a r0 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r8 = r0.mo42850s()
            r0 = 6
            float r10 = (float) r0
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargeInfo$1 r11 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargeInfo$1
            r11.<init>(r3, r7)
            r12 = -1344753994(0xffffffffafd8aeb6, float:-3.941431E-10)
            r13 = 1
            androidx.compose.runtime.internal.a r11 = androidx.compose.runtime.internal.C8553b.m31048b(r5, r12, r13, r11)
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargeInfo$2 r12 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargeInfo$2
            r12.<init>(r1, r4, r7)
            r14 = -1737752939(0xffffffff986bfe95, float:-3.050157E-24)
            androidx.compose.runtime.internal.a r12 = androidx.compose.runtime.internal.C8553b.m31048b(r5, r14, r13, r12)
            int r0 = r7 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r14 = r0 | 28038(0x6d86, float:3.929E-41)
            r15 = 0
            r7 = r8
            r9 = r16
            r13 = r5
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt.m151753d(r7, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00d9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d9:
            r9 = r16
        L_0x00db:
            androidx.compose.runtime.t1 r8 = r5.mo15020s()
            if (r8 != 0) goto L_0x00e2
            goto L_0x00f6
        L_0x00e2:
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargeInfo$3 r10 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargeInfo$3
            r0 = r10
            r1 = r17
            r3 = r19
            r4 = r20
            r5 = r9
            r6 = r23
            r7 = r24
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r8.mo15202a(r10)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151832e(long, int, java.lang.String, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151833f(@C0375v int i, @C12579k String str, @C12580l C8767m mVar, @C12580l C8592o oVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(str, "text");
        C8592o o = oVar.mo15009o(-612645741);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (o.mo14976f(i)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i7 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (o.mo15006n0(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= C22132b.f56831b;
        } else if ((i2 & 896) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        if ((i4 & 731) != 146 || !o.mo15011p()) {
            if (i8 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-612645741, i4, -1, "com.carrefour.fid.android.design.components.compose.label.LabelLargeInfoUnavailable (LabelComponent.kt:162)");
            }
            int i9 = i4 << 3;
            m151832e(C16009b.m71825a(C36896b.C36902f.ds_grey_10, o, 0), i, str, mVar, o, (i9 & 112) | (i9 & 896) | (i9 & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelLargeInfoUnavailable$1(i, str, mVar2, i2, i3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151834g(@org.jetbrains.annotations.C12579k java.lang.String r17, boolean r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21, int r22) {
        /*
            r12 = r17
            r13 = r18
            r14 = r21
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 301383768(0x11f6c058, float:3.8930498E-28)
            r1 = r20
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r14 | 6
            goto L_0x002b
        L_0x001b:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x002a
            boolean r1 = r15.mo15006n0(r12)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r14
            goto L_0x002b
        L_0x002a:
            r1 = r14
        L_0x002b:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
            goto L_0x0042
        L_0x0032:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r15.mo14961b(r13)
            if (r2 == 0) goto L_0x003f
            r2 = 32
            goto L_0x0041
        L_0x003f:
            r2 = 16
        L_0x0041:
            r1 = r1 | r2
        L_0x0042:
            r2 = r22 & 4
            if (r2 == 0) goto L_0x0049
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005c
            r3 = r19
            boolean r4 = r15.mo15006n0(r3)
            if (r4 == 0) goto L_0x0058
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r1 = r1 | r4
            goto L_0x005e
        L_0x005c:
            r3 = r19
        L_0x005e:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0070
            boolean r4 = r15.mo15011p()
            if (r4 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r15.mo14958a0()
            goto L_0x00e5
        L_0x0070:
            if (r2 == 0) goto L_0x0077
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r2
            goto L_0x0079
        L_0x0077:
            r16 = r3
        L_0x0079:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0085
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.label.LabelLargeLoyalty (LabelComponent.kt:277)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0085:
            if (r13 == 0) goto L_0x00be
            r0 = 584062984(0x22d01808, float:5.6403957E-18)
            r15.mo14918M(r0)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_blue_light
            r2 = 0
            long r3 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r15, r2)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_primary_dark
            long r5 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r15, r2)
            long r7 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r15, r2)
            int r9 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_diagonal_card_fid
            int r0 = r1 << 12
            r2 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r2
            int r1 = r1 << 9
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 0
            r0 = r3
            r2 = r5
            r4 = r7
            r6 = r9
            r7 = r17
            r8 = r16
            r9 = r15
            m151828a(r0, r2, r4, r6, r7, r8, r9, r10, r11)
            r15.mo15002m0()
            goto L_0x00da
        L_0x00be:
            r0 = 584063346(0x22d01972, float:5.6405454E-18)
            r15.mo14918M(r0)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_diagonal_card_fid
            int r2 = r1 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 & 896(0x380, float:1.256E-42)
            r4 = r2 | r1
            r5 = 0
            r1 = r17
            r2 = r16
            r3 = r15
            m151830c(r0, r1, r2, r3, r4, r5)
            r15.mo15002m0()
        L_0x00da:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00e3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00e3:
            r3 = r16
        L_0x00e5:
            androidx.compose.runtime.t1 r6 = r15.mo15020s()
            if (r6 != 0) goto L_0x00ec
            goto L_0x00fd
        L_0x00ec:
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargeLoyalty$1 r7 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargeLoyalty$1
            r0 = r7
            r1 = r17
            r2 = r18
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151834g(java.lang.String, boolean, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151835h(@org.jetbrains.annotations.C12579k java.lang.String r17, boolean r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21, int r22) {
        /*
            r12 = r17
            r13 = r18
            r14 = r21
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1342290015(0xffffffffaffe47a1, float:-4.6253226E-10)
            r1 = r20
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r14 | 6
            goto L_0x002b
        L_0x001b:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x002a
            boolean r1 = r15.mo15006n0(r12)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r14
            goto L_0x002b
        L_0x002a:
            r1 = r14
        L_0x002b:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
            goto L_0x0042
        L_0x0032:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r15.mo14961b(r13)
            if (r2 == 0) goto L_0x003f
            r2 = 32
            goto L_0x0041
        L_0x003f:
            r2 = 16
        L_0x0041:
            r1 = r1 | r2
        L_0x0042:
            r2 = r22 & 4
            if (r2 == 0) goto L_0x0049
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005c
            r3 = r19
            boolean r4 = r15.mo15006n0(r3)
            if (r4 == 0) goto L_0x0058
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r1 = r1 | r4
            goto L_0x005e
        L_0x005c:
            r3 = r19
        L_0x005e:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0070
            boolean r4 = r15.mo15011p()
            if (r4 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r15.mo14958a0()
            goto L_0x00e7
        L_0x0070:
            if (r2 == 0) goto L_0x0077
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r2
            goto L_0x0079
        L_0x0077:
            r16 = r3
        L_0x0079:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0085
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.label.LabelLargePromo (LabelComponent.kt:200)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0085:
            if (r13 == 0) goto L_0x00c0
            r0 = 1605880133(0x5fb7c945, float:2.6486384E19)
            r15.mo14918M(r0)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_red_1
            r2 = 0
            long r2 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r15, r2)
            androidx.compose.ui.graphics.j2$a r0 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r4 = r0.mo42852w()
            long r6 = r0.mo42852w()
            int r8 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_promotion_percentage
            int r0 = r1 << 12
            r9 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r9
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            int r1 = r1 << 9
            r9 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r9
            r10 = r0 | r1
            r11 = 0
            r0 = r2
            r2 = r4
            r4 = r6
            r6 = r8
            r7 = r17
            r8 = r16
            r9 = r15
            m151828a(r0, r2, r4, r6, r7, r8, r9, r10, r11)
            r15.mo15002m0()
            goto L_0x00dc
        L_0x00c0:
            r0 = 1605880429(0x5fb7ca6d, float:2.6487035E19)
            r15.mo14918M(r0)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_promotion_percentage
            int r2 = r1 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 & 896(0x380, float:1.256E-42)
            r4 = r2 | r1
            r5 = 0
            r1 = r17
            r2 = r16
            r3 = r15
            m151830c(r0, r1, r2, r3, r4, r5)
            r15.mo15002m0()
        L_0x00dc:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00e5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00e5:
            r3 = r16
        L_0x00e7:
            androidx.compose.runtime.t1 r6 = r15.mo15020s()
            if (r6 != 0) goto L_0x00ee
            goto L_0x00ff
        L_0x00ee:
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargePromo$1 r7 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelLargePromo$1
            r0 = r7
            r1 = r17
            r2 = r18
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151835h(java.lang.String, boolean, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m151836i(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1594891373);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1594891373, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelLargePromoPreview (LabelComponent.kt:328)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelComponentKt.f92437a.mo112481k(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelLargePromoPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m151837j(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(390038543);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(390038543, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelLargePromoUnavailablePreview (LabelComponent.kt:338)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelComponentKt.f92437a.mo112483m(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelLargePromoUnavailablePreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151838k(long r20, long r22, long r24, @androidx.annotation.C0375v int r26, @org.jetbrains.annotations.C12579k java.lang.String r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r28, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r29, int r30, int r31) {
        /*
            r3 = r22
            r5 = r24
            r7 = r26
            r8 = r27
            r10 = r30
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1865404684(0x6f2fd10c, float:5.44126E28)
            r1 = r29
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0021
            r2 = r10 | 6
            r14 = r20
            goto L_0x0033
        L_0x0021:
            r2 = r10 & 14
            r14 = r20
            if (r2 != 0) goto L_0x0032
            boolean r2 = r1.mo14980g(r14)
            if (r2 == 0) goto L_0x002f
            r2 = 4
            goto L_0x0030
        L_0x002f:
            r2 = 2
        L_0x0030:
            r2 = r2 | r10
            goto L_0x0033
        L_0x0032:
            r2 = r10
        L_0x0033:
            r11 = r31 & 2
            if (r11 == 0) goto L_0x003a
            r2 = r2 | 48
            goto L_0x004a
        L_0x003a:
            r11 = r10 & 112(0x70, float:1.57E-43)
            if (r11 != 0) goto L_0x004a
            boolean r11 = r1.mo14980g(r3)
            if (r11 == 0) goto L_0x0047
            r11 = 32
            goto L_0x0049
        L_0x0047:
            r11 = 16
        L_0x0049:
            r2 = r2 | r11
        L_0x004a:
            r11 = r31 & 4
            if (r11 == 0) goto L_0x0051
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x0051:
            r11 = r10 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0061
            boolean r11 = r1.mo14980g(r5)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r2 = r2 | r11
        L_0x0061:
            r11 = r31 & 8
            if (r11 == 0) goto L_0x0068
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0068:
            r11 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0078
            boolean r11 = r1.mo14976f(r7)
            if (r11 == 0) goto L_0x0075
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r2 = r2 | r11
        L_0x0078:
            r11 = r31 & 16
            if (r11 == 0) goto L_0x007f
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0091
        L_0x007f:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r10
            if (r11 != 0) goto L_0x0091
            boolean r11 = r1.mo15006n0(r8)
            if (r11 == 0) goto L_0x008e
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r2 = r2 | r11
        L_0x0091:
            r11 = r31 & 32
            if (r11 == 0) goto L_0x0099
            r12 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r12
            goto L_0x00ad
        L_0x0099:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x00ad
            r12 = r28
            boolean r13 = r1.mo15006n0(r12)
            if (r13 == 0) goto L_0x00a9
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r2 = r2 | r13
            goto L_0x00af
        L_0x00ad:
            r12 = r28
        L_0x00af:
            r13 = 374491(0x5b6db, float:5.24774E-40)
            r13 = r13 & r2
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r9) goto L_0x00c4
            boolean r9 = r1.mo15011p()
            if (r9 != 0) goto L_0x00bf
            goto L_0x00c4
        L_0x00bf:
            r1.mo14958a0()
            r9 = r12
            goto L_0x0117
        L_0x00c4:
            if (r11 == 0) goto L_0x00c9
            androidx.compose.ui.m$a r9 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00ca
        L_0x00c9:
            r9 = r12
        L_0x00ca:
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x00d6
            r11 = -1
            java.lang.String r12 = "com.carrefour.fid.android.design.components.compose.label.LabelSmall (LabelComponent.kt:25)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r11, r12)
        L_0x00d6:
            r0 = 4
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmall$1 r11 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmall$1
            r11.<init>(r5, r7, r2)
            r12 = -201079134(0xfffffffff403c6a2, float:-4.1761453E31)
            r13 = 1
            androidx.compose.runtime.internal.a r16 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r12, r13, r11)
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmall$2 r11 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmall$2
            r11.<init>(r3, r8, r2)
            r12 = -545994879(0xffffffffdf74c781, float:-1.7638208E19)
            androidx.compose.runtime.internal.a r17 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r12, r13, r11)
            r11 = r2 & 14
            r11 = r11 | 28032(0x6d80, float:3.9281E-41)
            int r2 = r2 >> 12
            r2 = r2 & 112(0x70, float:1.57E-43)
            r18 = r11 | r2
            r19 = 0
            r11 = r20
            r13 = r9
            r14 = r0
            r15 = r16
            r16 = r17
            r17 = r1
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt.m151753d(r11, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0117
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0117:
            androidx.compose.runtime.t1 r12 = r1.mo15020s()
            if (r12 != 0) goto L_0x011e
            goto L_0x0135
        L_0x011e:
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmall$3 r13 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmall$3
            r0 = r13
            r1 = r20
            r3 = r22
            r5 = r24
            r7 = r26
            r8 = r27
            r10 = r30
            r11 = r31
            r0.<init>(r1, r3, r5, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151838k(long, long, long, int, java.lang.String, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    public static final void m151839l(@C12579k String str, boolean z, @C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(str, "label");
        C8592o o = oVar.mo15009o(1532501279);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14961b(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1532501279, i3, -1, "com.carrefour.fid.android.design.components.compose.label.LabelSmallCatalog (LabelComponent.kt:263)");
            }
            int i8 = (i3 & 14) | (i3 & 112) | ((i3 << 3) & 7168);
            m151841n(str, z, C36896b.C36904h.ds_ic_catalogs, mVar, o, i8, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelSmallCatalog$1(str, z, mVar2, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    public static final void m151840m(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(640747684);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(640747684, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelSmallCouponAppliedLargeUnavailablePreview (LabelComponent.kt:362)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelComponentKt.f92437a.mo112487q(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C37013x90b30d0e(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151841n(@org.jetbrains.annotations.C12579k java.lang.String r18, boolean r19, @androidx.annotation.C0375v int r20, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r12 = r18
            r13 = r19
            r14 = r23
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1687145498(0xffffffff9b7033e6, float:-1.9869104E-22)
            r1 = r22
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r24 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r14 | 6
            goto L_0x002b
        L_0x001b:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x002a
            boolean r1 = r15.mo15006n0(r12)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r14
            goto L_0x002b
        L_0x002a:
            r1 = r14
        L_0x002b:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
            goto L_0x0042
        L_0x0032:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r15.mo14961b(r13)
            if (r2 == 0) goto L_0x003f
            r2 = 32
            goto L_0x0041
        L_0x003f:
            r2 = 16
        L_0x0041:
            r1 = r1 | r2
        L_0x0042:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x004b
            r1 = r1 | 384(0x180, float:5.38E-43)
            r11 = r20
            goto L_0x005d
        L_0x004b:
            r2 = r14 & 896(0x380, float:1.256E-42)
            r11 = r20
            if (r2 != 0) goto L_0x005d
            boolean r2 = r15.mo14976f(r11)
            if (r2 == 0) goto L_0x005a
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r1 = r1 | r2
        L_0x005d:
            r2 = r24 & 8
            if (r2 == 0) goto L_0x0064
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0077
        L_0x0064:
            r3 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0077
            r3 = r21
            boolean r4 = r15.mo15006n0(r3)
            if (r4 == 0) goto L_0x0073
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r1 = r1 | r4
            goto L_0x0079
        L_0x0077:
            r3 = r21
        L_0x0079:
            r4 = r1 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x008c
            boolean r4 = r15.mo15011p()
            if (r4 != 0) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            r15.mo14958a0()
            r4 = r3
            goto L_0x0111
        L_0x008c:
            if (r2 == 0) goto L_0x0093
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r2
            goto L_0x0095
        L_0x0093:
            r16 = r3
        L_0x0095:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00a1
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.label.LabelSmallDiscount (LabelComponent.kt:224)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x00a1:
            if (r13 == 0) goto L_0x00e3
            r0 = 1524012071(0x5ad69427, float:3.01992701E16)
            r15.mo14918M(r0)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_red_1
            r2 = 0
            long r2 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r15, r2)
            androidx.compose.ui.graphics.j2$a r0 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r4 = r0.mo42852w()
            long r6 = r0.mo42852w()
            int r0 = r1 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            int r8 = r1 << 12
            r9 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r9
            r0 = r0 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            int r1 = r1 << 6
            r1 = r1 & r8
            r10 = r0 | r1
            r17 = 0
            r0 = r2
            r2 = r4
            r4 = r6
            r6 = r20
            r7 = r18
            r8 = r16
            r9 = r15
            r11 = r17
            m151838k(r0, r2, r4, r6, r7, r8, r9, r10, r11)
            r15.mo15002m0()
            goto L_0x0106
        L_0x00e3:
            r0 = 1524012334(0x5ad6952e, float:3.01998349E16)
            r15.mo14918M(r0)
            int r0 = r1 >> 6
            r0 = r0 & 14
            int r2 = r1 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r1 = r1 >> 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r4 = r0 | r1
            r5 = 0
            r0 = r20
            r1 = r18
            r2 = r16
            r3 = r15
            m151849v(r0, r1, r2, r3, r4, r5)
            r15.mo15002m0()
        L_0x0106:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x010f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x010f:
            r4 = r16
        L_0x0111:
            androidx.compose.runtime.t1 r7 = r15.mo15020s()
            if (r7 != 0) goto L_0x0118
            goto L_0x012b
        L_0x0118:
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallDiscount$1 r8 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallDiscount$1
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151841n(java.lang.String, boolean, int, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: o */
    public static final void m151842o(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(2119225691);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2119225691, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelSmallDiscountPreview (LabelComponent.kt:420)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelComponentKt.f92437a.mo112478h(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelSmallDiscountPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: p */
    public static final void m151843p(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-788935319);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-788935319, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelSmallFidUnavailablePreview (LabelComponent.kt:391)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelComponentKt.f92437a.mo112474d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelSmallFidUnavailablePreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151844q(long r17, @androidx.annotation.C0375v int r19, @org.jetbrains.annotations.C12579k java.lang.String r20, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r1 = r17
            r3 = r19
            r4 = r20
            r6 = r23
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -152147732(0xfffffffff6ee68ec, float:-2.4177631E33)
            r5 = r22
            androidx.compose.runtime.o r5 = r5.mo15009o(r0)
            r7 = r24 & 1
            r8 = 4
            if (r7 == 0) goto L_0x001e
            r7 = r6 | 6
            goto L_0x002e
        L_0x001e:
            r7 = r6 & 14
            if (r7 != 0) goto L_0x002d
            boolean r7 = r5.mo14980g(r1)
            if (r7 == 0) goto L_0x002a
            r7 = r8
            goto L_0x002b
        L_0x002a:
            r7 = 2
        L_0x002b:
            r7 = r7 | r6
            goto L_0x002e
        L_0x002d:
            r7 = r6
        L_0x002e:
            r9 = r24 & 2
            if (r9 == 0) goto L_0x0035
            r7 = r7 | 48
            goto L_0x0045
        L_0x0035:
            r9 = r6 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0045
            boolean r9 = r5.mo14976f(r3)
            if (r9 == 0) goto L_0x0042
            r9 = 32
            goto L_0x0044
        L_0x0042:
            r9 = 16
        L_0x0044:
            r7 = r7 | r9
        L_0x0045:
            r9 = r24 & 4
            if (r9 == 0) goto L_0x004c
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x004c:
            r9 = r6 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005c
            boolean r9 = r5.mo15006n0(r4)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r7 = r7 | r9
        L_0x005c:
            r9 = r24 & 8
            if (r9 == 0) goto L_0x0063
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0063:
            r10 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0076
            r10 = r21
            boolean r11 = r5.mo15006n0(r10)
            if (r11 == 0) goto L_0x0072
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r7 = r7 | r11
            goto L_0x0078
        L_0x0076:
            r10 = r21
        L_0x0078:
            r11 = r7 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x0089
            boolean r11 = r5.mo15011p()
            if (r11 != 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            r5.mo14958a0()
            goto L_0x00dc
        L_0x0089:
            if (r9 == 0) goto L_0x0090
            androidx.compose.ui.m$a r9 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r9
            goto L_0x0092
        L_0x0090:
            r16 = r10
        L_0x0092:
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x009e
            r9 = -1
            java.lang.String r10 = "com.carrefour.fid.android.design.components.compose.label.LabelSmallInfo (LabelComponent.kt:102)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r9, r10)
        L_0x009e:
            androidx.compose.ui.graphics.j2$a r0 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r9 = r0.mo42850s()
            float r0 = (float) r8
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallInfo$1 r8 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallInfo$1
            r8.<init>(r3, r7)
            r11 = 1858360450(0x6ec45482, float:3.0380613E28)
            r12 = 1
            androidx.compose.runtime.internal.a r11 = androidx.compose.runtime.internal.C8553b.m31048b(r5, r11, r12, r8)
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallInfo$2 r8 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallInfo$2
            r8.<init>(r1, r4, r7)
            r13 = 1465361505(0x5757a461, float:2.37101002E14)
            androidx.compose.runtime.internal.a r12 = androidx.compose.runtime.internal.C8553b.m31048b(r5, r13, r12, r8)
            int r7 = r7 >> 6
            r7 = r7 & 112(0x70, float:1.57E-43)
            r14 = r7 | 28038(0x6d86, float:3.929E-41)
            r15 = 0
            r7 = r9
            r9 = r16
            r10 = r0
            r13 = r5
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt.m151753d(r7, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00da
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00da:
            r10 = r16
        L_0x00dc:
            androidx.compose.runtime.t1 r8 = r5.mo15020s()
            if (r8 != 0) goto L_0x00e3
            goto L_0x00f7
        L_0x00e3:
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallInfo$3 r9 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallInfo$3
            r0 = r9
            r1 = r17
            r3 = r19
            r4 = r20
            r5 = r10
            r6 = r23
            r7 = r24
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151844q(long, int, java.lang.String, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: r */
    public static final void m151845r(@C0375v int i, @C12579k String str, @C12580l C8767m mVar, @C12580l C8592o oVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(str, "text");
        C8592o o = oVar.mo15009o(-1557406137);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (o.mo14976f(i)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i7 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (o.mo15006n0(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= C22132b.f56831b;
        } else if ((i2 & 896) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        if ((i4 & 731) != 146 || !o.mo15011p()) {
            if (i8 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1557406137, i4, -1, "com.carrefour.fid.android.design.components.compose.label.LabelSmallInfoUnavailable (LabelComponent.kt:125)");
            }
            int i9 = i4 << 3;
            m151844q(C16009b.m71825a(C36896b.C36902f.ds_grey_10, o, 0), i, str, mVar, o, (i9 & 112) | (i9 & 896) | (i9 & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelSmallInfoUnavailable$1(i, str, mVar2, i2, i3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151846s(@org.jetbrains.annotations.C12579k java.lang.String r17, boolean r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21, int r22) {
        /*
            r12 = r17
            r13 = r18
            r14 = r21
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 813683724(0x307fd40c, float:9.3069796E-10)
            r1 = r20
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r14 | 6
            goto L_0x002b
        L_0x001b:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x002a
            boolean r1 = r15.mo15006n0(r12)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r14
            goto L_0x002b
        L_0x002a:
            r1 = r14
        L_0x002b:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
            goto L_0x0042
        L_0x0032:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r15.mo14961b(r13)
            if (r2 == 0) goto L_0x003f
            r2 = 32
            goto L_0x0041
        L_0x003f:
            r2 = 16
        L_0x0041:
            r1 = r1 | r2
        L_0x0042:
            r2 = r22 & 4
            if (r2 == 0) goto L_0x0049
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005c
            r3 = r19
            boolean r4 = r15.mo15006n0(r3)
            if (r4 == 0) goto L_0x0058
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r1 = r1 | r4
            goto L_0x005e
        L_0x005c:
            r3 = r19
        L_0x005e:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0070
            boolean r4 = r15.mo15011p()
            if (r4 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r15.mo14958a0()
            goto L_0x00e5
        L_0x0070:
            if (r2 == 0) goto L_0x0077
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r2
            goto L_0x0079
        L_0x0077:
            r16 = r3
        L_0x0079:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0085
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.label.LabelSmallLoyalty (LabelComponent.kt:301)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0085:
            if (r13 == 0) goto L_0x00be
            r0 = -187209612(0xfffffffff4d76874, float:-1.3653105E32)
            r15.mo14918M(r0)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_blue_light
            r2 = 0
            long r3 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r15, r2)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_primary_dark
            long r5 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r15, r2)
            long r7 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r15, r2)
            int r9 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_diagonal_card_fid
            int r0 = r1 << 12
            r2 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r2
            int r1 = r1 << 9
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 0
            r0 = r3
            r2 = r5
            r4 = r7
            r6 = r9
            r7 = r17
            r8 = r16
            r9 = r15
            m151838k(r0, r2, r4, r6, r7, r8, r9, r10, r11)
            r15.mo15002m0()
            goto L_0x00da
        L_0x00be:
            r0 = -187209250(0xfffffffff4d769de, float:-1.3653455E32)
            r15.mo14918M(r0)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_diagonal_card_fid
            int r2 = r1 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 & 896(0x380, float:1.256E-42)
            r4 = r2 | r1
            r5 = 0
            r1 = r17
            r2 = r16
            r3 = r15
            m151849v(r0, r1, r2, r3, r4, r5)
            r15.mo15002m0()
        L_0x00da:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00e3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00e3:
            r3 = r16
        L_0x00e5:
            androidx.compose.runtime.t1 r6 = r15.mo15020s()
            if (r6 != 0) goto L_0x00ec
            goto L_0x00fd
        L_0x00ec:
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallLoyalty$1 r7 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallLoyalty$1
            r0 = r7
            r1 = r17
            r2 = r18
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151846s(java.lang.String, boolean, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: t */
    public static final void m151847t(@C12579k String str, boolean z, @C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(str, "label");
        C8592o o = oVar.mo15009o(-1654605739);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14961b(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1654605739, i3, -1, "com.carrefour.fid.android.design.components.compose.label.LabelSmallPromo (LabelComponent.kt:249)");
            }
            int i8 = (i3 & 14) | (i3 & 112) | ((i3 << 3) & 7168);
            m151841n(str, z, C36896b.C36904h.ds_ic_promotion_percentage, mVar, o, i8, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelSmallPromo$1(str, z, mVar2, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: u */
    public static final void m151848u(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-158188473);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-158188473, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelSmallPromoPreview (LabelComponent.kt:404)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelComponentKt.f92437a.mo112476f(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelSmallPromoPreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151849v(@androidx.annotation.C0375v int r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21, int r22) {
        /*
            r12 = r18
            r13 = r21
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1213889835(0xffffffffb7a582d5, float:-1.9730456E-5)
            r1 = r20
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r13 | 6
            r15 = r17
            goto L_0x002d
        L_0x001b:
            r1 = r13 & 14
            r15 = r17
            if (r1 != 0) goto L_0x002c
            boolean r1 = r14.mo14976f(r15)
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r13
            goto L_0x002d
        L_0x002c:
            r1 = r13
        L_0x002d:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0034
            r1 = r1 | 48
            goto L_0x0044
        L_0x0034:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0044
            boolean r2 = r14.mo15006n0(r12)
            if (r2 == 0) goto L_0x0041
            r2 = 32
            goto L_0x0043
        L_0x0041:
            r2 = 16
        L_0x0043:
            r1 = r1 | r2
        L_0x0044:
            r2 = r22 & 4
            if (r2 == 0) goto L_0x004b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004b:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005e
            r3 = r19
            boolean r4 = r14.mo15006n0(r3)
            if (r4 == 0) goto L_0x005a
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r1 = r1 | r4
            goto L_0x0060
        L_0x005e:
            r3 = r19
        L_0x0060:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0071
            boolean r4 = r14.mo15011p()
            if (r4 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            r14.mo14958a0()
            goto L_0x00be
        L_0x0071:
            if (r2 == 0) goto L_0x0078
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r2
            goto L_0x007a
        L_0x0078:
            r16 = r3
        L_0x007a:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0086
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.label.LabelSmallUnavailable (LabelComponent.kt:46)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0086:
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_grey_60
            r2 = 0
            long r3 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r14, r2)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_grey_10
            long r5 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r14, r2)
            long r7 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r14, r2)
            int r0 = r1 << 9
            r1 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r0
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r10 = r1 | r0
            r11 = 0
            r0 = r3
            r2 = r5
            r4 = r7
            r6 = r17
            r7 = r18
            r8 = r16
            r9 = r14
            m151838k(r0, r2, r4, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00bc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00bc:
            r3 = r16
        L_0x00be:
            androidx.compose.runtime.t1 r6 = r14.mo15020s()
            if (r6 != 0) goto L_0x00c5
            goto L_0x00d6
        L_0x00c5:
            com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallUnavailable$1 r7 = new com.carrefour.fid.android.design.components.compose.label.LabelComponentKt$LabelSmallUnavailable$1
            r0 = r7
            r1 = r17
            r2 = r18
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelComponentKt.m151849v(int, java.lang.String, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: w */
    public static final void m151850w(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1821071774);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1821071774, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelTextOfferPreview (LabelComponent.kt:436)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelComponentKt.f92437a.mo112480j(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$LabelTextOfferPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: x */
    public static final void m151851x(long j, @C12579k String str, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        long j2 = j;
        String str2 = str;
        int i5 = i;
        Intrinsics.checkNotNullParameter(str2, "text");
        C8592o o = oVar.mo15009o(-1580697189);
        if ((i5 & 14) == 0) {
            if (o.mo14980g(j2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo15006n0(str2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1580697189, i6, -1, "com.carrefour.fid.android.design.components.compose.label.TextLarge (LabelComponent.kt:188)");
            }
            oVar2 = o;
            int i7 = i6;
            String str3 = str2;
            String str4 = str;
            long j3 = j;
            TextKt.m14196c(str4, (C8767m) null, j3, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153901m(C37477d.m153887N()), oVar2, ((i7 >> 3) & 14) | ((i7 << 6) & 896), 0, 65530);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$TextLarge$1(j, str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: y */
    public static final void m151852y(long j, @C12579k String str, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        long j2 = j;
        String str2 = str;
        int i5 = i;
        Intrinsics.checkNotNullParameter(str2, "text");
        C8592o o = oVar.mo15009o(-143994289);
        if ((i5 & 14) == 0) {
            if (o.mo14980g(j2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo15006n0(str2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-143994289, i6, -1, "com.carrefour.fid.android.design.components.compose.label.TextSmall (LabelComponent.kt:176)");
            }
            oVar2 = o;
            int i7 = i6;
            String str3 = str2;
            String str4 = str;
            long j3 = j;
            TextKt.m14196c(str4, (C8767m) null, j3, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153905q(C37477d.m153887N()), oVar2, ((i7 >> 3) & 14) | ((i7 << 6) & 896), 0, 65530);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelComponentKt$TextSmall$1(j, str, i));
        }
    }
}
