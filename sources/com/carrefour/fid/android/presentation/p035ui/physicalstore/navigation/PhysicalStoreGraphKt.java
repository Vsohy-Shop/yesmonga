package com.carrefour.fid.android.presentation.p035ui.physicalstore.navigation;

import androidx.compose.runtime.C8578k2;
import androidx.navigation.C19754h0;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nPhysicalStoreGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreGraph.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/navigation/PhysicalStoreGraphKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,68:1\n43#2,6:69\n45#3,3:75\n76#4:78\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreGraph.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/navigation/PhysicalStoreGraphKt\n*L\n14#1:69,6\n14#1:75,3\n28#1:78\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreGraphKt */
public final class PhysicalStoreGraphKt {
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x015d  */
    @androidx.compose.runtime.C8540g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109676a(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel r25, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.tracking.physicalstore.C29018a r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r27, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r30, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40, int r41) {
        /*
            r15 = r26
            r14 = r27
            r13 = r28
            r12 = r29
            r11 = r30
            r10 = r31
            r9 = r32
            r8 = r33
            r7 = r34
            r6 = r35
            r5 = r36
            r4 = r37
            r3 = r39
            r2 = r40
            r1 = r41
            java.lang.String r0 = "analytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onNavigateToFacilitiesSearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onNavigateToCatalogs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onOpenCatalogWebView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onNavigateToChallengeFidFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onNavigateToLoyaltyHome"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onNavigateToLoyaltyAmountHistoryFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onNavigateToLoyaltyCardFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onNavigationToCouponFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onOpenArsenalWebView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onArsenalError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onRedirectToPhoneClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 80197413(0x4c7b725, float:4.6952867E-36)
            r4 = r38
            androidx.compose.runtime.o r4 = r4.mo15009o(r0)
            r0 = r1 & 1
            if (r0 == 0) goto L_0x006a
            r16 = r3 | 2
            goto L_0x006c
        L_0x006a:
            r16 = r3
        L_0x006c:
            r17 = r1 & 2
            r18 = 32
            r19 = 16
            if (r17 == 0) goto L_0x0077
            r16 = r16 | 48
            goto L_0x0088
        L_0x0077:
            r17 = r3 & 112(0x70, float:1.57E-43)
            if (r17 != 0) goto L_0x0088
            boolean r17 = r4.mo15006n0(r15)
            if (r17 == 0) goto L_0x0084
            r17 = r18
            goto L_0x0086
        L_0x0084:
            r17 = r19
        L_0x0086:
            r16 = r16 | r17
        L_0x0088:
            r15 = r16
            r16 = r1 & 4
            r17 = 256(0x100, float:3.59E-43)
            r20 = 128(0x80, float:1.794E-43)
            if (r16 == 0) goto L_0x0097
            r15 = r15 | 384(0x180, float:5.38E-43)
            r38 = r0
            goto L_0x00a9
        L_0x0097:
            r38 = r0
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x00a9
            boolean r0 = r4.mo14927P(r14)
            if (r0 == 0) goto L_0x00a6
            r0 = r17
            goto L_0x00a8
        L_0x00a6:
            r0 = r20
        L_0x00a8:
            r15 = r15 | r0
        L_0x00a9:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x00b0
            r15 = r15 | 3072(0xc00, float:4.305E-42)
            goto L_0x00c0
        L_0x00b0:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r4.mo14927P(r13)
            if (r0 == 0) goto L_0x00bd
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x00bf
        L_0x00bd:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x00bf:
            r15 = r15 | r0
        L_0x00c0:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x00c7
            r15 = r15 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00d9
        L_0x00c7:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00d9
            boolean r0 = r4.mo14927P(r12)
            if (r0 == 0) goto L_0x00d6
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00d8
        L_0x00d6:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x00d8:
            r15 = r15 | r0
        L_0x00d9:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x00e1
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x00df:
            r15 = r15 | r0
            goto L_0x00f2
        L_0x00e1:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r4.mo14927P(r11)
            if (r0 == 0) goto L_0x00ef
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00df
        L_0x00ef:
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00df
        L_0x00f2:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x00fa
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x00f8:
            r15 = r15 | r0
            goto L_0x010b
        L_0x00fa:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x010b
            boolean r0 = r4.mo14927P(r10)
            if (r0 == 0) goto L_0x0108
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f8
        L_0x0108:
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00f8
        L_0x010b:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0113
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0111:
            r15 = r15 | r0
            goto L_0x0124
        L_0x0113:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0124
            boolean r0 = r4.mo14927P(r9)
            if (r0 == 0) goto L_0x0121
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x0121:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0111
        L_0x0124:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x012c
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x012a:
            r15 = r15 | r0
            goto L_0x013d
        L_0x012c:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x013d
            boolean r0 = r4.mo14927P(r8)
            if (r0 == 0) goto L_0x013a
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x013a:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x012a
        L_0x013d:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0145
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0143:
            r15 = r15 | r0
            goto L_0x0156
        L_0x0145:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0156
            boolean r0 = r4.mo14927P(r7)
            if (r0 == 0) goto L_0x0153
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0143
        L_0x0153:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0143
        L_0x0156:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x015d
            r0 = r2 | 6
            goto L_0x016d
        L_0x015d:
            r0 = r2 & 14
            if (r0 != 0) goto L_0x016c
            boolean r0 = r4.mo14927P(r6)
            if (r0 == 0) goto L_0x0169
            r0 = 4
            goto L_0x016a
        L_0x0169:
            r0 = 2
        L_0x016a:
            r0 = r0 | r2
            goto L_0x016d
        L_0x016c:
            r0 = r2
        L_0x016d:
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0174
            r0 = r0 | 48
            goto L_0x0183
        L_0x0174:
            r6 = r2 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0183
            boolean r6 = r4.mo14927P(r5)
            if (r6 == 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r18 = r19
        L_0x0181:
            r0 = r0 | r18
        L_0x0183:
            r6 = r1 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x018a
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x019c
        L_0x018a:
            r6 = r2 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x019c
            r6 = r37
            boolean r16 = r4.mo14927P(r6)
            if (r16 == 0) goto L_0x0197
            goto L_0x0199
        L_0x0197:
            r17 = r20
        L_0x0199:
            r0 = r0 | r17
            goto L_0x019e
        L_0x019c:
            r6 = r37
        L_0x019e:
            r1 = 1
            r5 = r38
            if (r5 != r1) goto L_0x01c2
            r1 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r1 & r15
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r15) goto L_0x01c2
            r0 = r0 & 731(0x2db, float:1.024E-42)
            r1 = 146(0x92, float:2.05E-43)
            if (r0 != r1) goto L_0x01c2
            boolean r0 = r4.mo15011p()
            if (r0 != 0) goto L_0x01b9
            goto L_0x01c2
        L_0x01b9:
            r4.mo14958a0()
            r1 = r25
            r22 = r4
            goto L_0x027f
        L_0x01c2:
            r4.mo14930Q()
            r0 = r3 & 1
            r1 = 8
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r4.mo14977f0()
            if (r0 == 0) goto L_0x01d2
            goto L_0x01d6
        L_0x01d2:
            r4.mo14958a0()
            goto L_0x0216
        L_0x01d6:
            if (r5 == 0) goto L_0x0216
            r0 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r4.mo14918M(r0)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r0 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r0 = r0.mo57681a(r4, r1)
            if (r0 == 0) goto L_0x020a
            androidx.lifecycle.x0$b r19 = androidx.hilt.navigation.compose.C19298a.m90444a(r0, r4, r1)
            r5 = 564614654(0x21a755fe, float:1.1339122E-18)
            r4.mo14918M(r5)
            r18 = 0
            java.lang.Class<com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel> r16 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel.class
            r21 = 4168(0x1048, float:5.84E-42)
            r22 = 0
            r17 = r0
            r20 = r4
            androidx.lifecycle.v0 r0 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r16, r17, r18, r19, r20, r21, r22)
            r4.mo15002m0()
            r4.mo15002m0()
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel) r0
            r15 = r0
            goto L_0x0218
        L_0x020a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0216:
            r15 = r25
        L_0x0218:
            r4.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0229
            java.lang.String r0 = "com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreGraph (PhysicalStoreGraph.kt:12)"
            r5 = 80197413(0x4c7b725, float:4.6952867E-36)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r3, r2, r0)
        L_0x0229:
            r0 = 0
            androidx.navigation.Navigator[] r0 = new androidx.navigation.Navigator[r0]
            androidx.navigation.h0 r0 = androidx.navigation.compose.NavHostControllerKt.m91709e(r0, r4, r1)
            androidx.compose.runtime.k2 r16 = androidx.compose.runtime.C8415c2.m30251t(r0, r4, r1)
            androidx.navigation.h0 r17 = m109677b(r16)
            java.lang.String r18 = "physical_store_screen"
            r19 = 0
            r20 = 0
            com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreGraphKt$PhysicalStoreGraph$1 r21 = new com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreGraphKt$PhysicalStoreGraph$1
            r0 = r21
            r1 = r26
            r2 = r27
            r3 = r28
            r22 = r4
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r15
            r13 = r37
            r14 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r7 = 56
            r8 = 12
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            androidx.navigation.compose.NavHostKt.m91714b(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x027e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x027e:
            r1 = r15
        L_0x027f:
            androidx.compose.runtime.t1 r15 = r22.mo15020s()
            if (r15 != 0) goto L_0x0286
            goto L_0x02b5
        L_0x0286:
            com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreGraphKt$PhysicalStoreGraph$2 r14 = new com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreGraphKt$PhysicalStoreGraph$2
            r0 = r14
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            r23 = r14
            r14 = r39
            r24 = r15
            r15 = r40
            r16 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r23
            r0 = r24
            r0.mo15202a(r1)
        L_0x02b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.navigation.PhysicalStoreGraphKt.m109676a(com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel, com.carrefour.fid.android.tracking.physicalstore.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.a, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: b */
    public static final C19754h0 m109677b(C8578k2<? extends C19754h0> k2Var) {
        return (C19754h0) k2Var.getValue();
    }
}
