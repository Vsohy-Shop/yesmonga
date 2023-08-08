package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nBannerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BannerComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,269:1\n154#2:270\n154#2:271\n154#2:272\n154#2:280\n154#2:281\n154#2:289\n36#3:273\n36#3:282\n1114#4,6:274\n1114#4,6:283\n*S KotlinDebug\n*F\n+ 1 BannerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BannerComponentKt\n*L\n45#1:270\n47#1:271\n52#1:272\n134#1:280\n135#1:281\n150#1:289\n57#1:273\n140#1:282\n57#1:274,6\n140#1:283,6\n*E\n"})
public final class BannerComponentKt {
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m151325a(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-336069832);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-336069832, i, -1, "com.carrefour.fid.android.design.components.compose.BannerFillPreview (BannerComponent.kt:214)");
            }
            ThemeKt.m153788a(ComposableSingletons$BannerComponentKt.f92147a.mo112039c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BannerComponentKt$BannerFillPreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0137  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151326b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r33, @org.jetbrains.annotations.C12579k java.lang.String r34, @org.jetbrains.annotations.C12580l java.lang.String r35, @org.jetbrains.annotations.C12580l java.lang.String r36, @androidx.annotation.C0375v int r37, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.design.components.compose.C36989i r38, long r39, float r41, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r42, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r43, int r44, int r45) {
        /*
            r10 = r34
            r11 = r42
            r12 = r44
            r13 = r45
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -628233474(0xffffffffda8deafe, float:-1.99731742E16)
            r1 = r43
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0025
            r2 = r12 | 6
            r3 = r2
            r2 = r33
            goto L_0x0039
        L_0x0025:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x0036
            r2 = r33
            boolean r3 = r15.mo15006n0(r2)
            if (r3 == 0) goto L_0x0033
            r3 = 4
            goto L_0x0034
        L_0x0033:
            r3 = 2
        L_0x0034:
            r3 = r3 | r12
            goto L_0x0039
        L_0x0036:
            r2 = r33
            r3 = r12
        L_0x0039:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 48
            goto L_0x0050
        L_0x0040:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0050
            boolean r4 = r15.mo15006n0(r10)
            if (r4 == 0) goto L_0x004d
            r4 = 32
            goto L_0x004f
        L_0x004d:
            r4 = 16
        L_0x004f:
            r3 = r3 | r4
        L_0x0050:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x0057
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x006a
            r5 = r35
            boolean r6 = r15.mo15006n0(r5)
            if (r6 == 0) goto L_0x0066
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r3 = r3 | r6
            goto L_0x006c
        L_0x006a:
            r5 = r35
        L_0x006c:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x0073
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0086
            r7 = r36
            boolean r8 = r15.mo15006n0(r7)
            if (r8 == 0) goto L_0x0082
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r3 = r3 | r8
            goto L_0x0088
        L_0x0086:
            r7 = r36
        L_0x0088:
            r8 = r13 & 16
            if (r8 == 0) goto L_0x0091
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r14 = r37
            goto L_0x00a5
        L_0x0091:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r12
            r14 = r37
            if (r8 != 0) goto L_0x00a5
            boolean r8 = r15.mo14976f(r14)
            if (r8 == 0) goto L_0x00a2
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r3 = r3 | r8
        L_0x00a5:
            r16 = 458752(0x70000, float:6.42848E-40)
            r8 = r12 & r16
            if (r8 != 0) goto L_0x00c0
            r8 = r13 & 32
            if (r8 != 0) goto L_0x00ba
            r8 = r38
            boolean r9 = r15.mo15006n0(r8)
            if (r9 == 0) goto L_0x00bc
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00ba:
            r8 = r38
        L_0x00bc:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r3 = r3 | r9
            goto L_0x00c2
        L_0x00c0:
            r8 = r38
        L_0x00c2:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r12
            if (r9 != 0) goto L_0x00dd
            r9 = r13 & 64
            r43 = r1
            r0 = r39
            if (r9 != 0) goto L_0x00d8
            boolean r17 = r15.mo14980g(r0)
            if (r17 == 0) goto L_0x00d8
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r3 = r3 | r17
            goto L_0x00e1
        L_0x00dd:
            r43 = r1
            r0 = r39
        L_0x00e1:
            r9 = r13 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x00ec
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r18
            r0 = r41
            goto L_0x0100
        L_0x00ec:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r12 & r18
            r0 = r41
            if (r18 != 0) goto L_0x0100
            boolean r1 = r15.mo14968d(r0)
            if (r1 == 0) goto L_0x00fd
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ff
        L_0x00fd:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ff:
            r3 = r3 | r1
        L_0x0100:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0108
            r1 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0106:
            r3 = r3 | r1
            goto L_0x0119
        L_0x0108:
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r12
            if (r1 != 0) goto L_0x0119
            boolean r1 = r15.mo14927P(r11)
            if (r1 == 0) goto L_0x0116
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0116:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0106
        L_0x0119:
            r1 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r1 & r3
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x0137
            boolean r0 = r15.mo15011p()
            if (r0 != 0) goto L_0x0129
            goto L_0x0137
        L_0x0129:
            r15.mo14958a0()
            r9 = r41
            r1 = r2
            r3 = r5
            r4 = r7
            r6 = r8
            r2 = r15
            r7 = r39
            goto L_0x02af
        L_0x0137:
            r15.mo14930Q()
            r0 = r12 & 1
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = 0
            if (r0 == 0) goto L_0x0168
            boolean r0 = r15.mo14977f0()
            if (r0 == 0) goto L_0x014c
            goto L_0x0168
        L_0x014c:
            r15.mo14958a0()
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0155
            r3 = r3 & r19
        L_0x0155:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x015b
            r3 = r3 & r18
        L_0x015b:
            r28 = r39
            r30 = r41
            r9 = r2
            r26 = r5
            r27 = r8
            r2 = 0
        L_0x0165:
            r8 = r7
            r7 = r3
            goto L_0x01b3
        L_0x0168:
            if (r43 == 0) goto L_0x016d
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x016e
        L_0x016d:
            r0 = r2
        L_0x016e:
            if (r4 == 0) goto L_0x0171
            r5 = r1
        L_0x0171:
            if (r6 == 0) goto L_0x0174
            r7 = r1
        L_0x0174:
            r2 = r13 & 32
            if (r2 == 0) goto L_0x0187
            com.carrefour.fid.android.design.components.compose.k r2 = new com.carrefour.fid.android.design.components.compose.k
            r4 = 60
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r2.<init>(r4, r1)
            r3 = r3 & r19
            r8 = r2
        L_0x0187:
            r2 = r13 & 64
            if (r2 == 0) goto L_0x019b
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            int r4 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.q r2 = r2.mo11075a(r15, r4)
            long r21 = r2.mo10975n()
            r2 = r3 & r18
            r3 = r2
            goto L_0x019d
        L_0x019b:
            r21 = r39
        L_0x019d:
            r2 = 0
            if (r9 == 0) goto L_0x01a9
            float r4 = (float) r2
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r9 = r0
            r30 = r4
            goto L_0x01ac
        L_0x01a9:
            r30 = r41
            r9 = r0
        L_0x01ac:
            r26 = r5
            r27 = r8
            r28 = r21
            goto L_0x0165
        L_0x01b3:
            r15.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01c5
            r0 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.BannerMedium (BannerComponent.kt:38)"
            r4 = -628233474(0xffffffffda8deafe, float:-1.99731742E16)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r7, r0, r3)
        L_0x01c5:
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            r0 = 0
            r5 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r9, r0, r5, r1)
            r1 = 101(0x65, float:1.42E-43)
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r1)
            r1 = 0
            r3 = 0
            r4 = 0
            r17 = 7
            r18 = 0
            r19 = r2
            r2 = r3
            r3 = r4
            r4 = r42
            r5 = r17
            r17 = r9
            r9 = r6
            r6 = r18
            androidx.compose.ui.m r0 = androidx.compose.foundation.ClickableKt.m8878e(r0, r1, r2, r3, r4, r5, r6)
            r9.element = r0
            r0 = -1231464493(0xffffffffb69957d3, float:-4.5699794E-6)
            r15.mo14918M(r0)
            if (r8 == 0) goto L_0x0207
            boolean r0 = kotlin.text.C11622t.isBlank(r8)
            if (r0 == 0) goto L_0x0204
            goto L_0x0207
        L_0x0204:
            r1 = r19
            goto L_0x0208
        L_0x0207:
            r1 = 1
        L_0x0208:
            if (r1 != 0) goto L_0x023f
            T r0 = r9.element
            androidx.compose.ui.m r0 = (androidx.compose.p004ui.C8767m) r0
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r2 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r2)
            boolean r2 = r15.mo15006n0(r8)
            java.lang.Object r3 = r15.mo14921N()
            if (r2 != 0) goto L_0x0228
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x0230
        L_0x0228:
            com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerMedium$1$1 r3 = new com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerMedium$1$1
            r3.<init>(r8)
            r15.mo14893C(r3)
        L_0x0230:
            r15.mo15002m0()
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            androidx.compose.ui.m r1 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71866a(r1, r3)
            androidx.compose.ui.m r0 = r0.mo17224k3(r1)
            r9.element = r0
        L_0x023f:
            r15.mo15002m0()
            T r0 = r9.element
            r18 = r0
            androidx.compose.ui.m r18 = (androidx.compose.p004ui.C8767m) r18
            com.carrefour.fid.android.design.theme.a r0 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r0 = r0.mo114189l()
            androidx.compose.foundation.shape.n r19 = androidx.compose.foundation.shape.C2694o.m12166h(r0)
            r20 = 0
            r22 = 0
            r24 = 0
            com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerMedium$2 r6 = new com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerMedium$2
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r7
            r4 = r28
            r9 = r6
            r6 = r27
            r25 = r7
            r7 = r37
            r31 = r8
            r8 = r34
            r10 = r9
            r32 = r17
            r9 = r26
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            r0 = 1286519874(0x4caebc42, float:9.1611664E7)
            r1 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r0, r1, r10)
            int r1 = r25 >> 6
            r1 = r1 & r16
            r2 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r2
            r25 = 28
            r14 = r18
            r2 = r15
            r15 = r19
            r16 = r20
            r18 = r22
            r20 = r24
            r21 = r30
            r22 = r0
            r23 = r2
            r24 = r1
            androidx.compose.material.SurfaceKt.m13879b(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02a3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02a3:
            r3 = r26
            r6 = r27
            r7 = r28
            r9 = r30
            r4 = r31
            r1 = r32
        L_0x02af:
            androidx.compose.runtime.t1 r14 = r2.mo15020s()
            if (r14 != 0) goto L_0x02b6
            goto L_0x02c9
        L_0x02b6:
            com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerMedium$3 r15 = new com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerMedium$3
            r0 = r15
            r2 = r34
            r5 = r37
            r10 = r42
            r11 = r44
            r12 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            r14.mo15202a(r15)
        L_0x02c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.BannerComponentKt.m151326b(androidx.compose.ui.m, java.lang.String, java.lang.String, java.lang.String, int, com.carrefour.fid.android.design.components.compose.i, long, float, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m151327c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(121675484);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(121675484, i, -1, "com.carrefour.fid.android.design.components.compose.BannerPlaceHolderPreview (BannerComponent.kt:190)");
            }
            ThemeKt.m153788a(ComposableSingletons$BannerComponentKt.f92147a.mo112038b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BannerComponentKt$BannerPlaceHolderPreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012c  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151328d(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r33, @org.jetbrains.annotations.C12579k java.lang.String r34, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r35, @androidx.annotation.C0375v int r36, @org.jetbrains.annotations.C12580l java.lang.String r37, @org.jetbrains.annotations.C12580l java.lang.String r38, long r39, float r41, float r42, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r43, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r44, int r45, int r46) {
        /*
            r9 = r34
            r11 = r43
            r12 = r45
            r13 = r46
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1370271384(0x51acae98, float:9.2707946E10)
            r1 = r44
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0025
            r2 = r12 | 6
            r3 = r2
            r2 = r33
            goto L_0x0039
        L_0x0025:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x0036
            r2 = r33
            boolean r3 = r10.mo15006n0(r2)
            if (r3 == 0) goto L_0x0033
            r3 = 4
            goto L_0x0034
        L_0x0033:
            r3 = 2
        L_0x0034:
            r3 = r3 | r12
            goto L_0x0039
        L_0x0036:
            r2 = r33
            r3 = r12
        L_0x0039:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 48
            goto L_0x0050
        L_0x0040:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0050
            boolean r4 = r10.mo15006n0(r9)
            if (r4 == 0) goto L_0x004d
            r4 = 32
            goto L_0x004f
        L_0x004d:
            r4 = 16
        L_0x004f:
            r3 = r3 | r4
        L_0x0050:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x0057
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x006a
            r5 = r35
            boolean r6 = r10.mo14927P(r5)
            if (r6 == 0) goto L_0x0066
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r3 = r3 | r6
            goto L_0x006c
        L_0x006a:
            r5 = r35
        L_0x006c:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x0075
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r15 = r36
            goto L_0x0087
        L_0x0075:
            r6 = r12 & 7168(0x1c00, float:1.0045E-41)
            r15 = r36
            if (r6 != 0) goto L_0x0087
            boolean r6 = r10.mo14976f(r15)
            if (r6 == 0) goto L_0x0084
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r3 = r3 | r6
        L_0x0087:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x008e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x008e:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r12
            if (r7 != 0) goto L_0x00a3
            r7 = r37
            boolean r8 = r10.mo15006n0(r7)
            if (r8 == 0) goto L_0x009f
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r3 = r3 | r8
            goto L_0x00a5
        L_0x00a3:
            r7 = r37
        L_0x00a5:
            r8 = r13 & 32
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r8 == 0) goto L_0x00b2
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r14 = r38
            goto L_0x00c5
        L_0x00b2:
            r16 = r12 & r14
            r14 = r38
            if (r16 != 0) goto L_0x00c5
            boolean r16 = r10.mo15006n0(r14)
            if (r16 == 0) goto L_0x00c1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r3 = r3 | r16
        L_0x00c5:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00e1
            r16 = r13 & 64
            r17 = r1
            r0 = r39
            if (r16 != 0) goto L_0x00dc
            boolean r18 = r10.mo14980g(r0)
            if (r18 == 0) goto L_0x00dc
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r3 = r3 | r18
            goto L_0x00e5
        L_0x00e1:
            r17 = r1
            r0 = r39
        L_0x00e5:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00ed
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r1
            goto L_0x0102
        L_0x00ed:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r12
            if (r1 != 0) goto L_0x0102
            r1 = r41
            boolean r18 = r10.mo14968d(r1)
            if (r18 == 0) goto L_0x00fd
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ff
        L_0x00fd:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ff:
            r3 = r3 | r18
            goto L_0x0104
        L_0x0102:
            r1 = r41
        L_0x0104:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x010f
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r18
            r2 = r42
            goto L_0x0124
        L_0x010f:
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            r18 = r12 & r18
            r2 = r42
            if (r18 != 0) goto L_0x0124
            boolean r18 = r10.mo14968d(r2)
            if (r18 == 0) goto L_0x0120
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0122
        L_0x0120:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0122:
            r3 = r3 | r18
        L_0x0124:
            r2 = r13 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x012c
            r2 = 805306368(0x30000000, float:4.656613E-10)
        L_0x012a:
            r3 = r3 | r2
            goto L_0x013d
        L_0x012c:
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r12
            if (r2 != 0) goto L_0x013d
            boolean r2 = r10.mo14927P(r11)
            if (r2 == 0) goto L_0x013a
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x013a:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012a
        L_0x013d:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r3
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r5) goto L_0x015e
            boolean r2 = r10.mo15011p()
            if (r2 != 0) goto L_0x014d
            goto L_0x015e
        L_0x014d:
            r10.mo14958a0()
            r1 = r33
            r3 = r35
            r9 = r41
            r31 = r42
            r5 = r7
            r6 = r14
            r7 = r39
            goto L_0x02af
        L_0x015e:
            r10.mo14930Q()
            r2 = r12 & 1
            r5 = 0
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r2 == 0) goto L_0x0188
            boolean r2 = r10.mo14977f0()
            if (r2 == 0) goto L_0x0170
            goto L_0x0188
        L_0x0170:
            r10.mo14958a0()
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0179
            r3 = r3 & r18
        L_0x0179:
            r26 = r35
            r28 = r39
            r30 = r41
            r31 = r42
            r27 = r7
            r8 = r14
            r14 = r33
        L_0x0186:
            r7 = r3
            goto L_0x01de
        L_0x0188:
            if (r17 == 0) goto L_0x018d
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x018f
        L_0x018d:
            r2 = r33
        L_0x018f:
            if (r4 == 0) goto L_0x0198
            com.carrefour.fid.android.design.components.compose.ComposableSingletons$BannerComponentKt r4 = com.carrefour.fid.android.design.components.compose.ComposableSingletons$BannerComponentKt.f92147a
            kotlin.jvm.functions.p r4 = r4.mo112037a()
            goto L_0x019a
        L_0x0198:
            r4 = r35
        L_0x019a:
            r17 = 0
            if (r6 == 0) goto L_0x01a0
            r7 = r17
        L_0x01a0:
            if (r8 == 0) goto L_0x01a4
            r14 = r17
        L_0x01a4:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x01b7
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            int r8 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.q r6 = r6.mo11075a(r10, r8)
            long r19 = r6.mo10975n()
            r3 = r3 & r18
            goto L_0x01b9
        L_0x01b7:
            r19 = r39
        L_0x01b9:
            if (r0 == 0) goto L_0x01c1
            float r0 = (float) r5
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            goto L_0x01c3
        L_0x01c1:
            r0 = r41
        L_0x01c3:
            if (r1 == 0) goto L_0x01d1
            r1 = 40
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r30 = r0
            r31 = r1
            goto L_0x01d5
        L_0x01d1:
            r31 = r42
            r30 = r0
        L_0x01d5:
            r26 = r4
            r27 = r7
            r8 = r14
            r28 = r19
            r14 = r2
            goto L_0x0186
        L_0x01de:
            r10.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01f0
            r0 = -1
            java.lang.String r1 = "com.carrefour.fid.android.design.components.compose.BannerSmall (BannerComponent.kt:125)"
            r2 = 1370271384(0x51acae98, float:9.2707946E10)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r7, r0, r1)
        L_0x01f0:
            r0 = 2079018959(0x7beb4fcf, float:2.443617E36)
            r10.mo14918M(r0)
            r6 = 1
            if (r8 == 0) goto L_0x01ff
            boolean r0 = kotlin.text.C11622t.isBlank(r8)
            if (r0 == 0) goto L_0x0200
        L_0x01ff:
            r5 = r6
        L_0x0200:
            if (r5 != 0) goto L_0x0230
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 1157296644(0x44faf204, float:2007.563)
            r10.mo14918M(r1)
            boolean r1 = r10.mo15006n0(r8)
            java.lang.Object r2 = r10.mo14921N()
            if (r1 != 0) goto L_0x021c
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x0224
        L_0x021c:
            com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerSmall$1$1 r2 = new com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerSmall$1$1
            r2.<init>(r8)
            r10.mo14893C(r2)
        L_0x0224:
            r10.mo15002m0()
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            androidx.compose.ui.m r0 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71866a(r0, r2)
            r14.mo17224k3(r0)
        L_0x0230:
            r10.mo15002m0()
            r0 = 98
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10115o(r14, r0)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 7
            r16 = 0
            r4 = r43
            r9 = r6
            r6 = r16
            androidx.compose.ui.m r16 = androidx.compose.foundation.ClickableKt.m8878e(r0, r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.design.theme.a r0 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r0 = r0.mo114189l()
            androidx.compose.foundation.shape.n r17 = androidx.compose.foundation.shape.C2694o.m12166h(r0)
            r18 = 0
            r20 = 0
            r22 = 0
            com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerSmall$2 r6 = new com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerSmall$2
            r0 = r6
            r1 = r28
            r3 = r31
            r4 = r36
            r5 = r7
            r11 = r6
            r6 = r27
            r23 = r7
            r7 = r34
            r32 = r8
            r8 = r26
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            r0 = -1009942564(0xffffffffc3cd7fdc, float:-410.9989)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r0, r9, r11)
            int r1 = r23 >> 6
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r2 = 1572864(0x180000, float:2.204052E-39)
            r24 = r1 | r2
            r25 = 28
            r2 = r14
            r14 = r16
            r15 = r17
            r16 = r18
            r18 = r20
            r20 = r22
            r21 = r30
            r22 = r0
            r23 = r10
            androidx.compose.material.SurfaceKt.m13879b(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02a4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02a4:
            r1 = r2
            r3 = r26
            r5 = r27
            r7 = r28
            r9 = r30
            r6 = r32
        L_0x02af:
            androidx.compose.runtime.t1 r14 = r10.mo15020s()
            if (r14 != 0) goto L_0x02b6
            goto L_0x02cb
        L_0x02b6:
            com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerSmall$3 r15 = new com.carrefour.fid.android.design.components.compose.BannerComponentKt$BannerSmall$3
            r0 = r15
            r2 = r34
            r4 = r36
            r10 = r31
            r11 = r43
            r12 = r45
            r13 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)
            r14.mo15202a(r15)
        L_0x02cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.BannerComponentKt.m151328d(androidx.compose.ui.m, java.lang.String, kotlin.jvm.functions.p, int, java.lang.String, java.lang.String, long, float, float, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m151329e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1296491368);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1296491368, i, -1, "com.carrefour.fid.android.design.components.compose.BannerSmallPreview (BannerComponent.kt:239)");
            }
            ThemeKt.m153788a(ComposableSingletons$BannerComponentKt.f92147a.mo112041e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BannerComponentKt$BannerSmallPreview$1(i));
        }
    }
}
