package com.carrefour.fid.android.presentation.components.arsenal;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nJoBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoBannerView.kt\ncom/carrefour/fid/android/presentation/components/arsenal/JoBannerViewKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,40:1\n1098#2:41\n927#2,6:42\n927#2,6:48\n50#3:54\n49#3:55\n1114#4,6:56\n*S KotlinDebug\n*F\n+ 1 JoBannerView.kt\ncom/carrefour/fid/android/presentation/components/arsenal/JoBannerViewKt\n*L\n19#1:41\n20#1:42,6\n24#1:48,6\n37#1:54\n37#1:55\n37#1:56,6\n*E\n"})
public final class JoBannerViewKt {
    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m158848a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r32, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.ArsenalJOBanner r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r0 = r33
            r4 = r34
            r5 = r36
            java.lang.String r1 = "banner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            r1 = -200059121(0xfffffffff413570f, float:-4.6693933E31)
            r2 = r35
            androidx.compose.runtime.o r2 = r2.mo15009o(r1)
            r3 = r37 & 1
            if (r3 == 0) goto L_0x0023
            r6 = r5 | 6
            r7 = r6
            r6 = r32
            goto L_0x0037
        L_0x0023:
            r6 = r5 & 14
            if (r6 != 0) goto L_0x0034
            r6 = r32
            boolean r7 = r2.mo15006n0(r6)
            if (r7 == 0) goto L_0x0031
            r7 = 4
            goto L_0x0032
        L_0x0031:
            r7 = 2
        L_0x0032:
            r7 = r7 | r5
            goto L_0x0037
        L_0x0034:
            r6 = r32
            r7 = r5
        L_0x0037:
            r8 = r37 & 2
            if (r8 == 0) goto L_0x003e
            r7 = r7 | 48
            goto L_0x004e
        L_0x003e:
            r8 = r5 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004e
            boolean r8 = r2.mo15006n0(r0)
            if (r8 == 0) goto L_0x004b
            r8 = 32
            goto L_0x004d
        L_0x004b:
            r8 = 16
        L_0x004d:
            r7 = r7 | r8
        L_0x004e:
            r8 = r37 & 4
            if (r8 == 0) goto L_0x0055
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0065
            boolean r8 = r2.mo14927P(r4)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r7 = r7 | r8
        L_0x0065:
            r8 = r7 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0078
            boolean r8 = r2.mo15011p()
            if (r8 != 0) goto L_0x0072
            goto L_0x0078
        L_0x0072:
            r2.mo14958a0()
            r3 = r6
            goto L_0x01b3
        L_0x0078:
            if (r3 == 0) goto L_0x007d
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x007e
        L_0x007d:
            r3 = r6
        L_0x007e:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x008a
            r6 = -1
            java.lang.String r8 = "com.carrefour.fid.android.presentation.components.arsenal.JOBannerView (JoBannerView.kt:17)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r7, r6, r8)
        L_0x008a:
            r1 = 2146218270(0x7fecb11e, float:NaN)
            r2.mo14918M(r1)
            androidx.compose.ui.text.d$a r1 = new androidx.compose.ui.text.d$a
            r6 = 0
            r8 = 0
            r9 = 1
            r1.<init>(r8, r9, r6)
            r6 = 2146218301(0x7fecb13d, float:NaN)
            r2.mo14918M(r6)
            androidx.compose.ui.text.font.i0$a r6 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r15 = r6.mo46947c()
            com.carrefour.fid.android.design.theme.b r31 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r11 = r31.mo114245m()
            androidx.compose.ui.text.c0 r13 = new androidx.compose.ui.text.c0
            r10 = r13
            r16 = 0
            r8 = r13
            r13 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 16378(0x3ffa, float:2.295E-41)
            r30 = 0
            r10.<init>((long) r11, (long) r13, (androidx.compose.p004ui.text.font.C16209i0) r15, (androidx.compose.p004ui.text.font.C16190e0) r16, (androidx.compose.p004ui.text.font.C16194f0) r17, (androidx.compose.p004ui.text.font.C16242u) r18, (java.lang.String) r19, (long) r20, (androidx.compose.p004ui.text.style.C16410a) r22, (androidx.compose.p004ui.text.style.C16439m) r23, (androidx.compose.p004ui.text.intl.C16342f) r24, (long) r25, (androidx.compose.p004ui.text.style.C16434j) r27, (androidx.compose.p004ui.graphics.C15205e4) r28, (int) r29, (kotlin.jvm.internal.DefaultConstructorMarker) r30)
            int r8 = r1.mo46713r(r8)
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x01d2 }
            java.lang.String r11 = r33.getAccountBalance()     // Catch:{ all -> 0x01d2 }
            r12 = 0
            r10[r12] = r11     // Catch:{ all -> 0x01d2 }
            r11 = 64
            r12 = 2131952890(0x7f1304fa, float:1.9542236E38)
            java.lang.String r10 = androidx.compose.p004ui.res.C16018i.m71859e(r12, r10, r2, r11)     // Catch:{ all -> 0x01d2 }
            r1.mo46707l(r10)     // Catch:{ all -> 0x01d2 }
            kotlin.d2 r10 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x01d2 }
            r1.mo46710o(r8)
            r2.mo15002m0()
            java.lang.String r8 = " "
            r1.mo46707l(r8)
            androidx.compose.ui.text.font.i0 r15 = r6.mo46952m()
            long r11 = r31.mo114212I()
            androidx.compose.ui.text.c0 r6 = new androidx.compose.ui.text.c0
            r10 = r6
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 16378(0x3ffa, float:2.295E-41)
            r30 = 0
            r10.<init>((long) r11, (long) r13, (androidx.compose.p004ui.text.font.C16209i0) r15, (androidx.compose.p004ui.text.font.C16190e0) r16, (androidx.compose.p004ui.text.font.C16194f0) r17, (androidx.compose.p004ui.text.font.C16242u) r18, (java.lang.String) r19, (long) r20, (androidx.compose.p004ui.text.style.C16410a) r22, (androidx.compose.p004ui.text.style.C16439m) r23, (androidx.compose.p004ui.text.intl.C16342f) r24, (long) r25, (androidx.compose.p004ui.text.style.C16434j) r27, (androidx.compose.p004ui.graphics.C15205e4) r28, (int) r29, (kotlin.jvm.internal.DefaultConstructorMarker) r30)
            int r6 = r1.mo46713r(r6)
            r8 = 2131952888(0x7f1304f8, float:1.9542231E38)
            r10 = 0
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r2, r10)     // Catch:{ all -> 0x01cd }
            r1.mo46707l(r8)     // Catch:{ all -> 0x01cd }
            r1.mo46710o(r6)
            androidx.compose.ui.text.d r1 = r1.mo46716u()
            r2.mo15002m0()
            r6 = 2146218779(0x7fecb31b, float:NaN)
            r2.mo14918M(r6)
            boolean r6 = r33.getAssociationClientClub()
            if (r6 == 0) goto L_0x0149
            java.lang.String r6 = r33.getAssociationClubName()
            goto L_0x0151
        L_0x0149:
            r6 = 2131952889(0x7f1304f9, float:1.9542233E38)
            r8 = 0
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r6, r2, r8)
        L_0x0151:
            r8 = r6
            r2.mo15002m0()
            long r12 = r31.mo114208E()
            com.carrefour.fid.android.presentation.components.arsenal.JoBannerViewKt$JOBannerView$1 r6 = new com.carrefour.fid.android.presentation.components.arsenal.JoBannerViewKt$JOBannerView$1
            r6.<init>(r1)
            r1 = -1425849763(0xffffffffab03425d, float:-4.6632647E-13)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r1, r9, r6)
            r9 = 2131231637(0x7f080395, float:1.807936E38)
            r10 = 0
            r11 = 0
            r14 = 0
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2.mo14918M(r6)
            boolean r6 = r2.mo15006n0(r4)
            boolean r16 = r2.mo15006n0(r0)
            r6 = r6 | r16
            java.lang.Object r15 = r2.mo14921N()
            if (r6 != 0) goto L_0x0189
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r15 != r6) goto L_0x0191
        L_0x0189:
            com.carrefour.fid.android.presentation.components.arsenal.JoBannerViewKt$JOBannerView$2$1 r15 = new com.carrefour.fid.android.presentation.components.arsenal.JoBannerViewKt$JOBannerView$2$1
            r15.<init>(r4, r0)
            r2.mo14893C(r15)
        L_0x0191:
            r2.mo15002m0()
            r16 = r15
            kotlin.jvm.functions.a r16 = (kotlin.jvm.functions.C11289a) r16
            r6 = r7 & 14
            r15 = r6 | 384(0x180, float:5.38E-43)
            r19 = 432(0x1b0, float:6.05E-43)
            r6 = r3
            r7 = r8
            r8 = r1
            r18 = r15
            r1 = 0
            r15 = r1
            r17 = r2
            com.carrefour.fid.android.design.components.compose.BannerComponentKt.m151328d(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01b3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01b3:
            androidx.compose.runtime.t1 r7 = r2.mo15020s()
            if (r7 != 0) goto L_0x01ba
            goto L_0x01cc
        L_0x01ba:
            com.carrefour.fid.android.presentation.components.arsenal.JoBannerViewKt$JOBannerView$3 r8 = new com.carrefour.fid.android.presentation.components.arsenal.JoBannerViewKt$JOBannerView$3
            r1 = r8
            r2 = r3
            r3 = r33
            r4 = r34
            r5 = r36
            r6 = r37
            r1.<init>(r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x01cc:
            return
        L_0x01cd:
            r0 = move-exception
            r1.mo46710o(r6)
            throw r0
        L_0x01d2:
            r0 = move-exception
            r1.mo46710o(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.components.arsenal.JoBannerViewKt.m158848a(androidx.compose.ui.m, com.carrefour.fid.android.domain.models.ArsenalJOBanner, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }
}
