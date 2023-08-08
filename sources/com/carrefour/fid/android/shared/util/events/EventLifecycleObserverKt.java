package com.carrefour.fid.android.shared.util.events;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nEventLifecycleObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLifecycleObserver.kt\ncom/carrefour/fid/android/shared/util/events/EventLifecycleObserverKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,49:1\n76#2:50\n*S KotlinDebug\n*F\n+ 1 EventLifecycleObserver.kt\ncom/carrefour/fid/android/shared/util/events/EventLifecycleObserverKt\n*L\n21#1:50\n*E\n"})
public final class EventLifecycleObserverKt {
    /* JADX WARNING: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0106  */
    @androidx.compose.runtime.C8540g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m119612a(@org.jetbrains.annotations.C12580l androidx.lifecycle.C19499w r19, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r20, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r21, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r22, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r23, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r24, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r26, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r27, int r28, int r29) {
        /*
            r9 = r28
            r10 = r29
            r0 = 1701086213(0x65648405, float:6.744593E22)
            r1 = r27
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0014
            r3 = r9 | 2
            goto L_0x0015
        L_0x0014:
            r3 = r9
        L_0x0015:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x001c
            r3 = r3 | 48
            goto L_0x002f
        L_0x001c:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x002f
            r5 = r20
            boolean r6 = r1.mo14927P(r5)
            if (r6 == 0) goto L_0x002b
            r6 = 32
            goto L_0x002d
        L_0x002b:
            r6 = 16
        L_0x002d:
            r3 = r3 | r6
            goto L_0x0031
        L_0x002f:
            r5 = r20
        L_0x0031:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x0038
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x004b
        L_0x0038:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x004b
            r7 = r21
            boolean r8 = r1.mo14927P(r7)
            if (r8 == 0) goto L_0x0047
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0049
        L_0x0047:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0049:
            r3 = r3 | r8
            goto L_0x004d
        L_0x004b:
            r7 = r21
        L_0x004d:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x0054
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0067
        L_0x0054:
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0067
            r11 = r22
            boolean r12 = r1.mo14927P(r11)
            if (r12 == 0) goto L_0x0063
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0065
        L_0x0063:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0065:
            r3 = r3 | r12
            goto L_0x0069
        L_0x0067:
            r11 = r22
        L_0x0069:
            r12 = r10 & 16
            if (r12 == 0) goto L_0x0070
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0085
        L_0x0070:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r9
            if (r13 != 0) goto L_0x0085
            r13 = r23
            boolean r14 = r1.mo14927P(r13)
            if (r14 == 0) goto L_0x0081
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0083
        L_0x0081:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0083:
            r3 = r3 | r14
            goto L_0x0087
        L_0x0085:
            r13 = r23
        L_0x0087:
            r14 = r10 & 32
            if (r14 == 0) goto L_0x008f
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00a4
        L_0x008f:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00a4
            r15 = r24
            boolean r16 = r1.mo14927P(r15)
            if (r16 == 0) goto L_0x009f
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a1
        L_0x009f:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a1:
            r3 = r3 | r16
            goto L_0x00a6
        L_0x00a4:
            r15 = r24
        L_0x00a6:
            r16 = r10 & 64
            if (r16 == 0) goto L_0x00b1
            r17 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r17
            r0 = r25
            goto L_0x00c6
        L_0x00b1:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r9 & r17
            r0 = r25
            if (r17 != 0) goto L_0x00c6
            boolean r18 = r1.mo14927P(r0)
            if (r18 == 0) goto L_0x00c2
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c2:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r3 = r3 | r18
        L_0x00c6:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00cf
            r18 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00cc:
            r3 = r3 | r18
            goto L_0x00e3
        L_0x00cf:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r9 & r18
            r5 = r26
            if (r18 != 0) goto L_0x00e3
            boolean r18 = r1.mo14927P(r5)
            if (r18 == 0) goto L_0x00e0
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00cc
        L_0x00e0:
            r18 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00cc
        L_0x00e3:
            r5 = 1
            if (r2 != r5) goto L_0x0106
            r5 = 23967451(0x16db6db, float:4.3661218E-38)
            r3 = r3 & r5
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r5) goto L_0x0106
            boolean r3 = r1.mo15011p()
            if (r3 != 0) goto L_0x00f6
            goto L_0x0106
        L_0x00f6:
            r1.mo14958a0()
            r2 = r19
            r3 = r20
            r8 = r25
            r4 = r11
            r5 = r13
            r6 = r15
            r11 = r26
            goto L_0x0191
        L_0x0106:
            r1.mo14930Q()
            r3 = r9 & 1
            if (r3 == 0) goto L_0x0120
            boolean r3 = r1.mo14977f0()
            if (r3 == 0) goto L_0x0114
            goto L_0x0120
        L_0x0114:
            r1.mo14958a0()
            r2 = r19
            r3 = r20
            r4 = r25
        L_0x011d:
            r0 = r26
            goto L_0x0155
        L_0x0120:
            if (r2 == 0) goto L_0x012d
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r2 = r1.mo15032w(r2)
            androidx.lifecycle.w r2 = (androidx.lifecycle.C19499w) r2
            goto L_0x012f
        L_0x012d:
            r2 = r19
        L_0x012f:
            if (r4 == 0) goto L_0x0134
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$1 r3 = com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$1.f70847f
            goto L_0x0136
        L_0x0134:
            r3 = r20
        L_0x0136:
            if (r6 == 0) goto L_0x013b
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$2 r4 = com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$2.f70848f
            r7 = r4
        L_0x013b:
            if (r8 == 0) goto L_0x0140
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$3 r4 = com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$3.f70849f
            r11 = r4
        L_0x0140:
            if (r12 == 0) goto L_0x0145
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$4 r4 = com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$4.f70850f
            r13 = r4
        L_0x0145:
            if (r14 == 0) goto L_0x014a
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$5 r4 = com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$5.f70851f
            r15 = r4
        L_0x014a:
            if (r16 == 0) goto L_0x014f
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$6 r4 = com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$6.f70852f
            goto L_0x0151
        L_0x014f:
            r4 = r25
        L_0x0151:
            if (r0 == 0) goto L_0x011d
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$7 r0 = com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$7.f70853f
        L_0x0155:
            r1.mo14899E()
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x0167
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.shared.util.events.EventLifecycleObserver (EventLifecycleObserver.kt:19)"
            r8 = 1701086213(0x65648405, float:6.744593E22)
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r9, r5, r6)
        L_0x0167:
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$8 r5 = new com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$8
            r19 = r5
            r20 = r2
            r21 = r3
            r22 = r7
            r23 = r11
            r24 = r13
            r25 = r15
            r26 = r4
            r27 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r6 = 8
            androidx.compose.runtime.EffectsKt.m29891c(r2, r5, r1, r6)
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x018c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x018c:
            r8 = r4
            r4 = r11
            r5 = r13
            r6 = r15
            r11 = r0
        L_0x0191:
            androidx.compose.runtime.t1 r12 = r1.mo15020s()
            if (r12 != 0) goto L_0x0198
            goto L_0x01aa
        L_0x0198:
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$9 r13 = new com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$9
            r0 = r13
            r1 = r2
            r2 = r3
            r3 = r7
            r7 = r8
            r8 = r11
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.mo15202a(r13)
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt.m119612a(androidx.lifecycle.w, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }
}
