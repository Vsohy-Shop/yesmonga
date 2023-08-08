package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C2855v;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,334:1\n25#2:335\n25#2:346\n50#2:357\n49#2:358\n83#2,3:366\n1114#3,6:336\n1114#3,3:347\n1117#3,3:353\n1114#3,6:359\n1114#3,6:369\n474#4,4:342\n478#4,2:350\n482#4:356\n474#5:352\n76#6:365\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n81#1:335\n82#1:346\n83#1:357\n83#1:358\n178#1:366,3\n81#1:336,6\n82#1:347,3\n82#1:353,3\n83#1:359,6\n178#1:369,6\n82#1:342,4\n82#1:350,2\n82#1:356\n82#1:352\n123#1:365\n*E\n"})
public final class LazyListKt {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0139  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m10800a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r37, @org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.LazyListState r38, @org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r39, boolean r40, boolean r41, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2195g r42, boolean r43, int r44, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8736b r45, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.Arrangement.C2279l r46, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8737c r47, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.Arrangement.C2269d r48, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.C11079d2> r49, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r50, int r51, int r52, int r53) {
        /*
            r1 = r37
            r0 = r38
            r15 = r39
            r14 = r40
            r13 = r41
            r12 = r42
            r11 = r49
            r10 = r51
            r9 = r52
            r8 = r53
            java.lang.String r2 = "modifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "contentPadding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "flingBehavior"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            r2 = 620764179(0x25001c13, float:1.1111742E-16)
            r3 = r50
            androidx.compose.runtime.o r7 = r3.mo15009o(r2)
            r3 = r8 & 1
            if (r3 == 0) goto L_0x003d
            r3 = r10 | 6
            goto L_0x004d
        L_0x003d:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x004c
            boolean r3 = r7.mo15006n0(r1)
            if (r3 == 0) goto L_0x0049
            r3 = 4
            goto L_0x004a
        L_0x0049:
            r3 = 2
        L_0x004a:
            r3 = r3 | r10
            goto L_0x004d
        L_0x004c:
            r3 = r10
        L_0x004d:
            r6 = r8 & 2
            r16 = 32
            r17 = 16
            if (r6 == 0) goto L_0x0058
            r3 = r3 | 48
            goto L_0x0068
        L_0x0058:
            r6 = r10 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0068
            boolean r6 = r7.mo15006n0(r0)
            if (r6 == 0) goto L_0x0065
            r6 = r16
            goto L_0x0067
        L_0x0065:
            r6 = r17
        L_0x0067:
            r3 = r3 | r6
        L_0x0068:
            r6 = r8 & 4
            r18 = 256(0x100, float:3.59E-43)
            r19 = 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0073
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0083
        L_0x0073:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0083
            boolean r6 = r7.mo15006n0(r15)
            if (r6 == 0) goto L_0x0080
            r6 = r18
            goto L_0x0082
        L_0x0080:
            r6 = r19
        L_0x0082:
            r3 = r3 | r6
        L_0x0083:
            r6 = r8 & 8
            if (r6 == 0) goto L_0x008a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x009a
        L_0x008a:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x009a
            boolean r6 = r7.mo14961b(r14)
            if (r6 == 0) goto L_0x0097
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0099
        L_0x0097:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0099:
            r3 = r3 | r6
        L_0x009a:
            r6 = r8 & 16
            r20 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x00a4
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b4
        L_0x00a4:
            r6 = r10 & r20
            if (r6 != 0) goto L_0x00b4
            boolean r6 = r7.mo14961b(r13)
            if (r6 == 0) goto L_0x00b1
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b3
        L_0x00b1:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x00b3:
            r3 = r3 | r6
        L_0x00b4:
            r6 = r8 & 32
            r21 = 458752(0x70000, float:6.42848E-40)
            if (r6 == 0) goto L_0x00be
            r6 = 196608(0x30000, float:2.75506E-40)
        L_0x00bc:
            r3 = r3 | r6
            goto L_0x00ce
        L_0x00be:
            r6 = r10 & r21
            if (r6 != 0) goto L_0x00ce
            boolean r6 = r7.mo15006n0(r12)
            if (r6 == 0) goto L_0x00cb
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00cb:
            r6 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00bc
        L_0x00ce:
            r6 = r8 & 64
            r22 = 3670016(0x380000, float:5.142788E-39)
            if (r6 == 0) goto L_0x00d8
            r6 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r6
            goto L_0x00ec
        L_0x00d8:
            r6 = r10 & r22
            if (r6 != 0) goto L_0x00ec
            r6 = r43
            boolean r23 = r7.mo14961b(r6)
            if (r23 == 0) goto L_0x00e7
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e9
        L_0x00e7:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00e9:
            r3 = r3 | r23
            goto L_0x00ee
        L_0x00ec:
            r6 = r43
        L_0x00ee:
            r4 = r8 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x00f9
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r23
            r5 = r44
            goto L_0x010e
        L_0x00f9:
            r23 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r10 & r23
            r5 = r44
            if (r23 != 0) goto L_0x010e
            boolean r24 = r7.mo14976f(r5)
            if (r24 == 0) goto L_0x010a
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010c
        L_0x010a:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x010c:
            r3 = r3 | r24
        L_0x010e:
            r2 = r8 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0119
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r25
            r5 = r45
            goto L_0x012e
        L_0x0119:
            r25 = 234881024(0xe000000, float:1.5777218E-30)
            r25 = r10 & r25
            r5 = r45
            if (r25 != 0) goto L_0x012e
            boolean r25 = r7.mo15006n0(r5)
            if (r25 == 0) goto L_0x012a
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012c
        L_0x012a:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012c:
            r3 = r3 | r25
        L_0x012e:
            r5 = r8 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0139
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r25
            r6 = r46
            goto L_0x014e
        L_0x0139:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r10 & r25
            r6 = r46
            if (r25 != 0) goto L_0x014e
            boolean r25 = r7.mo15006n0(r6)
            if (r25 == 0) goto L_0x014a
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014c
        L_0x014a:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014c:
            r3 = r3 | r25
        L_0x014e:
            r6 = r8 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0157
            r23 = r9 | 6
            r10 = r47
            goto L_0x016d
        L_0x0157:
            r25 = r9 & 14
            r10 = r47
            if (r25 != 0) goto L_0x016b
            boolean r25 = r7.mo15006n0(r10)
            if (r25 == 0) goto L_0x0166
            r23 = 4
            goto L_0x0168
        L_0x0166:
            r23 = 2
        L_0x0168:
            r23 = r9 | r23
            goto L_0x016d
        L_0x016b:
            r23 = r9
        L_0x016d:
            r10 = r8 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0174
            r23 = r23 | 48
            goto L_0x0185
        L_0x0174:
            r25 = r9 & 112(0x70, float:1.57E-43)
            r12 = r48
            if (r25 != 0) goto L_0x0185
            boolean r25 = r7.mo15006n0(r12)
            if (r25 == 0) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            r16 = r17
        L_0x0183:
            r23 = r23 | r16
        L_0x0185:
            r12 = r23
            r14 = r8 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x018e
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x019d
        L_0x018e:
            r14 = r9 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x019d
            boolean r14 = r7.mo14927P(r11)
            if (r14 == 0) goto L_0x0199
            goto L_0x019b
        L_0x0199:
            r18 = r19
        L_0x019b:
            r12 = r12 | r18
        L_0x019d:
            r14 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r14 & r3
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r8) goto L_0x01c5
            r8 = r12 & 731(0x2db, float:1.024E-42)
            r14 = 146(0x92, float:2.05E-43)
            if (r8 != r14) goto L_0x01c5
            boolean r8 = r7.mo15011p()
            if (r8 != 0) goto L_0x01b3
            goto L_0x01c5
        L_0x01b3:
            r7.mo14958a0()
            r12 = r40
            r8 = r44
            r9 = r45
            r10 = r46
            r25 = r47
            r26 = r48
            r11 = r7
            goto L_0x038e
        L_0x01c5:
            if (r4 == 0) goto L_0x01cb
            r4 = 0
            r18 = r4
            goto L_0x01cd
        L_0x01cb:
            r18 = r44
        L_0x01cd:
            r4 = 0
            if (r2 == 0) goto L_0x01d3
            r19 = r4
            goto L_0x01d5
        L_0x01d3:
            r19 = r45
        L_0x01d5:
            if (r5 == 0) goto L_0x01da
            r23 = r4
            goto L_0x01dc
        L_0x01da:
            r23 = r46
        L_0x01dc:
            if (r6 == 0) goto L_0x01e1
            r25 = r4
            goto L_0x01e3
        L_0x01e1:
            r25 = r47
        L_0x01e3:
            if (r10 == 0) goto L_0x01e8
            r26 = r4
            goto L_0x01ea
        L_0x01e8:
            r26 = r48
        L_0x01ea:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x01f8
            java.lang.String r2 = "androidx.compose.foundation.lazy.LazyList (LazyList.kt:49)"
            r4 = 620764179(0x25001c13, float:1.1111742E-16)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r3, r12, r2)
        L_0x01f8:
            androidx.compose.foundation.gestures.m r14 = androidx.compose.foundation.gestures.C2202m.f5935a
            r10 = 6
            androidx.compose.foundation.k0 r8 = r14.mo7541b(r7, r10)
            int r2 = r3 >> 3
            r4 = r2 & 14
            int r5 = r12 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | r4
            androidx.compose.foundation.lazy.n r6 = androidx.compose.foundation.lazy.LazyListItemProviderKt.m10791a(r0, r11, r7, r5)
            int r5 = r3 >> 9
            r5 = r5 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            androidx.compose.foundation.lazy.layout.q r24 = androidx.compose.foundation.lazy.C2619t.m11864a(r0, r13, r7, r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo14918M(r4)
            java.lang.Object r4 = r7.mo14921N()
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r5.mo16277a()
            if (r4 != r10) goto L_0x022f
            androidx.compose.foundation.lazy.g r4 = new androidx.compose.foundation.lazy.g
            r4.<init>()
            r7.mo14893C(r4)
        L_0x022f:
            r7.mo15002m0()
            r27 = r4
            androidx.compose.foundation.lazy.g r27 = (androidx.compose.foundation.lazy.C2458g) r27
            r4 = 773894976(0x2e20b340, float:3.6538994E-11)
            r7.mo14918M(r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo14918M(r4)
            java.lang.Object r4 = r7.mo14921N()
            java.lang.Object r10 = r5.mo16277a()
            if (r4 != r10) goto L_0x025b
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r4 = androidx.compose.runtime.EffectsKt.m29901m(r4, r7)
            androidx.compose.runtime.w r10 = new androidx.compose.runtime.w
            r10.<init>(r4)
            r7.mo14893C(r10)
            r4 = r10
        L_0x025b:
            r7.mo15002m0()
            androidx.compose.runtime.w r4 = (androidx.compose.runtime.C8690w) r4
            kotlinx.coroutines.o0 r4 = r4.mo16831a()
            r7.mo15002m0()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r41)
            r45 = r8
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.mo14918M(r8)
            boolean r8 = r7.mo15006n0(r0)
            boolean r10 = r7.mo15006n0(r10)
            r8 = r8 | r10
            java.lang.Object r10 = r7.mo14921N()
            if (r8 != 0) goto L_0x0288
            java.lang.Object r5 = r5.mo16277a()
            if (r10 != r5) goto L_0x0290
        L_0x0288:
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r10 = new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator
            r10.<init>(r4, r13)
            r7.mo14893C(r10)
        L_0x0290:
            r7.mo15002m0()
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r10 = (androidx.compose.foundation.lazy.LazyListItemPlacementAnimator) r10
            r0.mo8328L(r10)
            r8 = r3 & 112(0x70, float:1.57E-43)
            int r28 = androidx.compose.runtime.collection.C8423g.f22782d
            int r4 = r28 << 6
            r4 = r4 | r8
            int r5 = r3 << 3
            r50 = r7
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r7
            r7 = r5 & r20
            r4 = r4 | r7
            r5 = r5 & r21
            r4 = r4 | r5
            r5 = r2 & r22
            r4 = r4 | r5
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r5
            r2 = r2 | r4
            int r4 = r12 << 24
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r4
            r2 = r2 | r5
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r5
            r16 = r2 | r4
            int r2 = r3 >> 27
            r2 = r2 & 14
            r17 = r2 | 64
            r22 = 0
            r2 = r6
            r12 = r3
            r3 = r38
            r4 = r27
            r5 = r39
            r7 = r6
            r6 = r40
            r46 = r50
            r1 = r7
            r7 = r41
            r29 = r45
            r30 = r8
            r8 = r18
            r9 = r19
            r31 = r10
            r32 = 6
            r10 = r25
            r11 = r26
            r33 = r12
            r12 = r23
            r13 = r31
            r34 = r14
            r14 = r46
            r15 = r16
            r16 = r17
            r17 = r22
            kotlin.jvm.functions.p r10 = m10803d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r11 = r46
            r12 = r30
            m10801b(r1, r0, r11, r12)
            if (r41 == 0) goto L_0x0306
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0308
        L_0x0306:
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0308:
            r13 = r2
            androidx.compose.ui.layout.c1 r2 = r38.mo8320C()
            r14 = r1
            r1 = r37
            androidx.compose.ui.m r2 = r1.mo17224k3(r2)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r3 = r38.mo8337o()
            androidx.compose.ui.m r2 = r2.mo17224k3(r3)
            r15 = r33
            int r3 = r15 >> 6
            r3 = r3 & r20
            int r4 = r15 << 6
            r4 = r4 & r21
            r9 = r3 | r4
            r3 = r14
            r4 = r24
            r5 = r13
            r6 = r43
            r7 = r40
            r8 = r11
            androidx.compose.ui.m r2 = androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.m11357a(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.m r2 = androidx.compose.foundation.C2254l.m9703a(r2, r13)
            int r3 = r28 << 6
            r3 = r3 | r12
            r4 = r15 & 7168(0x1c00, float:1.0045E-41)
            r8 = r3 | r4
            r3 = r38
            r4 = r27
            r5 = r40
            r6 = r13
            r7 = r11
            androidx.compose.ui.m r2 = androidx.compose.foundation.lazy.C2513h.m11292a(r2, r3, r4, r5, r6, r7, r8)
            r5 = r29
            androidx.compose.ui.m r2 = androidx.compose.foundation.C2257l0.m9707a(r2, r5)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r11.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            r12 = r40
            r4 = r34
            boolean r7 = r4.mo7542c(r3, r13, r12)
            androidx.compose.foundation.interaction.g r9 = r38.mo8342t()
            r3 = r38
            r4 = r13
            r6 = r43
            r8 = r42
            androidx.compose.ui.m r4 = androidx.compose.foundation.gestures.ScrollableKt.m9385j(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.foundation.lazy.layout.o r5 = r38.mo8347y()
            r8 = 0
            r9 = 0
            r3 = r14
            r6 = r10
            r7 = r11
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.m11349a(r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0388
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0388:
            r8 = r18
            r9 = r19
            r10 = r23
        L_0x038e:
            androidx.compose.runtime.t1 r15 = r11.mo15020s()
            if (r15 != 0) goto L_0x0395
            goto L_0x03c0
        L_0x0395:
            androidx.compose.foundation.lazy.LazyListKt$LazyList$1 r14 = new androidx.compose.foundation.lazy.LazyListKt$LazyList$1
            r0 = r14
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r11 = r25
            r12 = r26
            r13 = r49
            r35 = r14
            r14 = r51
            r36 = r15
            r15 = r52
            r16 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r35
            r0 = r36
            r0.mo15202a(r1)
        L_0x03c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.m10800a(androidx.compose.ui.m, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.i0, boolean, boolean, androidx.compose.foundation.gestures.g, boolean, int, androidx.compose.ui.c$b, androidx.compose.foundation.layout.Arrangement$l, androidx.compose.ui.c$c, androidx.compose.foundation.layout.Arrangement$d, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C2855v
    /* renamed from: b */
    public static final void m10801b(C2569n nVar, LazyListState lazyListState, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(3173830);
        if ((i & 14) == 0) {
            if (o.mo15006n0(nVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(lazyListState)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(3173830, i, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:141)");
            }
            if (nVar.mo8288a() > 0) {
                lazyListState.mo8333Q(nVar);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LazyListKt$ScrollPositionUpdater$1(nVar, lazyListState, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1} */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        if (r1 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0089;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.foundation.C2855v
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.C11304p<androidx.compose.foundation.lazy.layout.C2552k, androidx.compose.p004ui.unit.C16476b, androidx.compose.p004ui.layout.C15564g0> m10803d(androidx.compose.foundation.lazy.C2569n r18, androidx.compose.foundation.lazy.LazyListState r19, androidx.compose.foundation.lazy.C2458g r20, androidx.compose.foundation.layout.C2366i0 r21, boolean r22, boolean r23, int r24, androidx.compose.p004ui.C8734c.C8736b r25, androidx.compose.p004ui.C8734c.C8737c r26, androidx.compose.foundation.layout.Arrangement.C2269d r27, androidx.compose.foundation.layout.Arrangement.C2279l r28, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r29, androidx.compose.runtime.C8592o r30, int r31, int r32, int r33) {
        /*
            r0 = r30
            r1 = r33
            r2 = -966179815(0xffffffffc6694419, float:-14929.024)
            r0.mo14918M(r2)
            r3 = r1 & 128(0x80, float:1.794E-43)
            r4 = 0
            if (r3 == 0) goto L_0x0012
            r16 = r4
            goto L_0x0014
        L_0x0012:
            r16 = r25
        L_0x0014:
            r3 = r1 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x001b
            r17 = r4
            goto L_0x001d
        L_0x001b:
            r17 = r26
        L_0x001d:
            r3 = r1 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0023
            r12 = r4
            goto L_0x0025
        L_0x0023:
            r12 = r27
        L_0x0025:
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x002b
            r11 = r4
            goto L_0x002d
        L_0x002b:
            r11 = r28
        L_0x002d:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x003c
            java.lang.String r1 = "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)"
            r3 = r31
            r4 = r32
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r4, r1)
        L_0x003c:
            r1 = 10
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r19
            r4 = 1
            r2[r4] = r20
            r4 = 2
            r2[r4] = r21
            r4 = 3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r22)
            r2[r4] = r5
            r4 = 4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r23)
            r2[r4] = r5
            r4 = 5
            r2[r4] = r16
            r4 = 6
            r2[r4] = r17
            r4 = 7
            r2[r4] = r12
            r4 = 8
            r2[r4] = r11
            r4 = 9
            r2[r4] = r29
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.mo14918M(r4)
            r4 = r3
        L_0x006f:
            if (r3 >= r1) goto L_0x007b
            r5 = r2[r3]
            boolean r5 = r0.mo15006n0(r5)
            r4 = r4 | r5
            int r3 = r3 + 1
            goto L_0x006f
        L_0x007b:
            java.lang.Object r1 = r30.mo14921N()
            if (r4 != 0) goto L_0x0089
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r1 != r2) goto L_0x00a2
        L_0x0089:
            androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1 r1 = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
            r5 = r1
            r6 = r23
            r7 = r21
            r8 = r22
            r9 = r19
            r10 = r18
            r13 = r29
            r14 = r20
            r15 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.mo14893C(r1)
        L_0x00a2:
            r30.mo15002m0()
            kotlin.jvm.functions.p r1 = (kotlin.jvm.functions.C11304p) r1
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00b0
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00b0:
            r30.mo15002m0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.m10803d(androidx.compose.foundation.lazy.n, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.lazy.g, androidx.compose.foundation.layout.i0, boolean, boolean, int, androidx.compose.ui.c$b, androidx.compose.ui.c$c, androidx.compose.foundation.layout.Arrangement$d, androidx.compose.foundation.layout.Arrangement$l, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator, androidx.compose.runtime.o, int, int, int):kotlin.jvm.functions.p");
    }
}
