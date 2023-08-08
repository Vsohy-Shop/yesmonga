package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C2837n;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,319:1\n76#2:320\n76#2:321\n76#2:322\n76#2:330\n76#2:332\n76#2:355\n76#2:356\n76#2:357\n76#2:358\n76#2:367\n25#3:323\n286#3,8:338\n294#3,2:352\n25#3:359\n456#3,14:379\n1114#4,6:324\n1114#4,6:360\n120#5:331\n121#5,5:333\n127#5,6:346\n134#5:354\n74#5:366\n75#5,11:368\n88#5:393\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n81#1:320\n82#1:321\n83#1:322\n139#1:330\n142#1:332\n188#1:355\n189#1:356\n190#1:357\n191#1:358\n253#1:367\n103#1:323\n142#1:338,8\n142#1:352,2\n213#1:359\n253#1:379,14\n103#1:324,6\n213#1:360,6\n142#1:331\n142#1:333,5\n142#1:346,6\n142#1:354\n253#1:366\n253#1:368,11\n253#1:393\n*E\n"})
public final class BasicTextKt {
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010a  */
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m12206a(androidx.compose.p004ui.text.C16156d r26, androidx.compose.p004ui.C8767m r27, androidx.compose.p004ui.text.C16361p0 r28, kotlin.jvm.functions.C11300l r29, int r30, boolean r31, int r32, java.util.Map r33, androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r12 = r26
            r13 = r35
            r14 = r36
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -648605928(0xffffffffd9570f18, float:-3.78335723E15)
            r1 = r34
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r13 | 6
            goto L_0x002b
        L_0x001b:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002a
            boolean r1 = r15.mo15006n0(r12)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r13
            goto L_0x002b
        L_0x002a:
            r1 = r13
        L_0x002b:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
            goto L_0x0045
        L_0x0032:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0045
            r3 = r27
            boolean r4 = r15.mo15006n0(r3)
            if (r4 == 0) goto L_0x0041
            r4 = 32
            goto L_0x0043
        L_0x0041:
            r4 = 16
        L_0x0043:
            r1 = r1 | r4
            goto L_0x0047
        L_0x0045:
            r3 = r27
        L_0x0047:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r28
            boolean r7 = r15.mo15006n0(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r7
            goto L_0x0063
        L_0x0061:
            r6 = r28
        L_0x0063:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007d
            r8 = r29
            boolean r9 = r15.mo14927P(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r1 = r1 | r9
            goto L_0x007f
        L_0x007d:
            r8 = r29
        L_0x007f:
            r9 = r14 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x0089:
            r11 = r13 & r10
            if (r11 != 0) goto L_0x009d
            r11 = r30
            boolean r16 = r15.mo14976f(r11)
            if (r16 == 0) goto L_0x0098
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r16
            goto L_0x009f
        L_0x009d:
            r11 = r30
        L_0x009f:
            r16 = r14 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00ac
            r18 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r18
            r10 = r31
            goto L_0x00bf
        L_0x00ac:
            r18 = r13 & r17
            r10 = r31
            if (r18 != 0) goto L_0x00bf
            boolean r18 = r15.mo14961b(r10)
            if (r18 == 0) goto L_0x00bb
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r18
        L_0x00bf:
            r18 = r14 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00cc
            r20 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r20
            r0 = r32
            goto L_0x00df
        L_0x00cc:
            r20 = r13 & r19
            r0 = r32
            if (r20 != 0) goto L_0x00df
            boolean r21 = r15.mo14976f(r0)
            if (r21 == 0) goto L_0x00db
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r1 = r1 | r21
        L_0x00df:
            r5 = r14 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00e7
            r22 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r22
        L_0x00e7:
            r0 = 128(0x80, float:1.794E-43)
            if (r5 != r0) goto L_0x010a
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x010a
            boolean r0 = r15.mo15011p()
            if (r0 != 0) goto L_0x00fb
            goto L_0x010a
        L_0x00fb:
            r15.mo14958a0()
            r2 = r27
            r7 = r32
            r3 = r6
            r4 = r8
            r6 = r10
            r5 = r11
            r8 = r33
            goto L_0x01a9
        L_0x010a:
            if (r2 == 0) goto L_0x0111
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r21 = r0
            goto L_0x0113
        L_0x0111:
            r21 = r27
        L_0x0113:
            if (r4 == 0) goto L_0x011e
            androidx.compose.ui.text.p0$a r0 = androidx.compose.p004ui.text.C16361p0.f40603d
            androidx.compose.ui.text.p0 r0 = r0.mo47519a()
            r22 = r0
            goto L_0x0120
        L_0x011e:
            r22 = r6
        L_0x0120:
            if (r7 == 0) goto L_0x0127
            androidx.compose.foundation.text.BasicTextKt$BasicText$8 r0 = androidx.compose.foundation.text.BasicTextKt$BasicText$8.f7072f
            r23 = r0
            goto L_0x0129
        L_0x0127:
            r23 = r8
        L_0x0129:
            if (r9 == 0) goto L_0x0134
            androidx.compose.ui.text.style.r$a r0 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r0 = r0.mo47726a()
            r24 = r0
            goto L_0x0136
        L_0x0134:
            r24 = r11
        L_0x0136:
            if (r16 == 0) goto L_0x013c
            r0 = 1
            r16 = r0
            goto L_0x013e
        L_0x013c:
            r16 = r10
        L_0x013e:
            if (r18 == 0) goto L_0x0146
            r0 = 2147483647(0x7fffffff, float:NaN)
            r18 = r0
            goto L_0x0148
        L_0x0146:
            r18 = r32
        L_0x0148:
            if (r5 == 0) goto L_0x0151
            java.util.Map r0 = kotlin.collections.C10977s0.m41492z()
            r25 = r0
            goto L_0x0153
        L_0x0151:
            r25 = r33
        L_0x0153:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0162
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.BasicText (BasicText.kt:288)"
            r3 = -648605928(0xffffffffd9570f18, float:-3.78335723E15)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x0162:
            r7 = 1
            r0 = 146800640(0x8c00000, float:1.155558E-33)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = r1 & r17
            r0 = r0 | r2
            r1 = r1 & r19
            r10 = r0 | r1
            r11 = 0
            r0 = r26
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r16
            r6 = r18
            r8 = r25
            r9 = r15
            m12209d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x019b
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x019b:
            r6 = r16
            r7 = r18
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r8 = r25
        L_0x01a9:
            androidx.compose.runtime.t1 r11 = r15.mo15020s()
            if (r11 != 0) goto L_0x01b0
            goto L_0x01bf
        L_0x01b0:
            androidx.compose.foundation.text.BasicTextKt$BasicText$9 r15 = new androidx.compose.foundation.text.BasicTextKt$BasicText$9
            r0 = r15
            r1 = r26
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo15202a(r15)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m12206a(androidx.compose.ui.text.d, androidx.compose.ui.m, androidx.compose.ui.text.p0, kotlin.jvm.functions.l, int, boolean, int, java.util.Map, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011d  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m12207b(@org.jetbrains.annotations.C12579k java.lang.String r31, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r32, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r33, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.text.C16260h0, kotlin.C11079d2> r34, int r35, boolean r36, int r37, int r38, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r39, int r40, int r41) {
        /*
            r9 = r31
            r10 = r40
            r11 = r41
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 1542716361(0x5bf3fbc9, float:1.3735052E17)
            r1 = r39
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r10 | 6
            goto L_0x002b
        L_0x001b:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x002a
            boolean r1 = r12.mo15006n0(r9)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r10
            goto L_0x002b
        L_0x002a:
            r1 = r10
        L_0x002b:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0032
            r1 = r1 | 48
            goto L_0x0045
        L_0x0032:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0045
            r4 = r32
            boolean r5 = r12.mo15006n0(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r1 = r1 | r5
            goto L_0x0047
        L_0x0045:
            r4 = r32
        L_0x0047:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r33
            boolean r7 = r12.mo15006n0(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r7
            goto L_0x0063
        L_0x0061:
            r6 = r33
        L_0x0063:
            r7 = r11 & 8
            if (r7 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007d
            r8 = r34
            boolean r13 = r12.mo14927P(r8)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r1 = r1 | r13
            goto L_0x007f
        L_0x007d:
            r8 = r34
        L_0x007f:
            r13 = r11 & 16
            if (r13 == 0) goto L_0x0086
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0086:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x009b
            r14 = r35
            boolean r15 = r12.mo14976f(r14)
            if (r15 == 0) goto L_0x0097
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r15
            goto L_0x009d
        L_0x009b:
            r14 = r35
        L_0x009d:
            r15 = r11 & 32
            if (r15 == 0) goto L_0x00a8
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r2 = r36
            goto L_0x00bd
        L_0x00a8:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r10 & r16
            r2 = r36
            if (r16 != 0) goto L_0x00bd
            boolean r16 = r12.mo14961b(r2)
            if (r16 == 0) goto L_0x00b9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r16
        L_0x00bd:
            r16 = r11 & 64
            if (r16 == 0) goto L_0x00c8
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r0 = r37
            goto L_0x00dd
        L_0x00c8:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r10 & r17
            r0 = r37
            if (r17 != 0) goto L_0x00dd
            boolean r18 = r12.mo14976f(r0)
            if (r18 == 0) goto L_0x00d9
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r18
        L_0x00dd:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e8
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r18
            r2 = r38
            goto L_0x00fd
        L_0x00e8:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r10 & r18
            r2 = r38
            if (r18 != 0) goto L_0x00fd
            boolean r18 = r12.mo14976f(r2)
            if (r18 == 0) goto L_0x00f9
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r1 = r1 | r18
        L_0x00fd:
            r18 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r18
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r2) goto L_0x011d
            boolean r1 = r12.mo15011p()
            if (r1 != 0) goto L_0x010e
            goto L_0x011d
        L_0x010e:
            r12.mo14958a0()
            r7 = r37
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r14
            r6 = r36
            r8 = r38
            goto L_0x0322
        L_0x011d:
            if (r3 == 0) goto L_0x0122
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r4 = r1
        L_0x0122:
            if (r5 == 0) goto L_0x012d
            androidx.compose.ui.text.p0$a r1 = androidx.compose.p004ui.text.C16361p0.f40603d
            androidx.compose.ui.text.p0 r1 = r1.mo47519a()
            r30 = r1
            goto L_0x012f
        L_0x012d:
            r30 = r6
        L_0x012f:
            if (r7 == 0) goto L_0x0134
            androidx.compose.foundation.text.BasicTextKt$BasicText$1 r1 = androidx.compose.foundation.text.BasicTextKt$BasicText$1.f7069f
            r8 = r1
        L_0x0134:
            if (r13 == 0) goto L_0x013d
            androidx.compose.ui.text.style.r$a r1 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r1 = r1.mo47726a()
            r14 = r1
        L_0x013d:
            r1 = 1
            if (r15 == 0) goto L_0x0142
            r13 = r1
            goto L_0x0144
        L_0x0142:
            r13 = r36
        L_0x0144:
            if (r16 == 0) goto L_0x014b
            r2 = 2147483647(0x7fffffff, float:NaN)
            r15 = r2
            goto L_0x014d
        L_0x014b:
            r15 = r37
        L_0x014d:
            if (r0 == 0) goto L_0x0151
            r7 = r1
            goto L_0x0153
        L_0x0151:
            r7 = r38
        L_0x0153:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0162
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.BasicText (BasicText.kt:60)"
            r3 = 1542716361(0x5bf3fbc9, float:1.3735052E17)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r10, r0, r2)
        L_0x0162:
            androidx.compose.foundation.text.HeightInLinesModifierKt.m12295c(r7, r15)
            androidx.compose.runtime.i1 r0 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.m12853a()
            java.lang.Object r0 = r12.mo15032w(r0)
            r6 = r0
            androidx.compose.foundation.text.selection.n r6 = (androidx.compose.foundation.text.selection.C2837n) r6
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r12.mo15032w(r0)
            r3 = r0
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71013k()
            java.lang.Object r0 = r12.mo15032w(r0)
            r5 = r0
            androidx.compose.ui.text.font.u$b r5 = (androidx.compose.p004ui.text.font.C16242u.C16244b) r5
            r0 = 959238681(0x392cd219, float:1.6481466E-4)
            r12.mo14918M(r0)
            if (r6 != 0) goto L_0x0191
            r0 = 0
            goto L_0x01bf
        L_0x0191:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r9
            r0[r1] = r6
            androidx.compose.runtime.saveable.e r1 = m12210e(r6)
            androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1 r2 = new androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
            r2.<init>(r6)
            r16 = 72
            r17 = 4
            r32 = r0
            r33 = r1
            r0 = 0
            r34 = r0
            r35 = r2
            r36 = r12
            r37 = r16
            r38 = r17
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r32, r33, r34, r35, r36, r37, r38)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
        L_0x01bf:
            r12.mo15002m0()
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.mo14918M(r2)
            java.lang.Object r2 = r12.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            r39 = r4
            java.lang.Object r4 = r16.mo16277a()
            if (r2 != r4) goto L_0x021a
            androidx.compose.foundation.text.TextController r2 = new androidx.compose.foundation.text.TextController
            androidx.compose.foundation.text.TextState r4 = new androidx.compose.foundation.text.TextState
            androidx.compose.ui.text.d r19 = new androidx.compose.ui.text.d
            r16 = 0
            r17 = 0
            r18 = 6
            r20 = 0
            r32 = r19
            r33 = r31
            r34 = r16
            r35 = r17
            r36 = r18
            r37 = r20
            r32.<init>(r33, r34, r35, r36, r37)
            r32 = r6
            androidx.compose.foundation.text.r r6 = new androidx.compose.foundation.text.r
            r27 = 0
            r28 = 256(0x100, float:3.59E-43)
            r29 = 0
            r18 = r6
            r20 = r30
            r21 = r15
            r22 = r7
            r23 = r13
            r24 = r14
            r25 = r3
            r26 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r4.<init>(r6, r0)
            r2.<init>(r4)
            r12.mo14893C(r2)
            goto L_0x021c
        L_0x021a:
            r32 = r6
        L_0x021c:
            r12.mo15002m0()
            r6 = r2
            androidx.compose.foundation.text.TextController r6 = (androidx.compose.foundation.text.TextController) r6
            androidx.compose.foundation.text.TextState r4 = r6.mo9331l()
            boolean r0 = r12.mo14997l()
            if (r0 != 0) goto L_0x024f
            androidx.compose.foundation.text.r r0 = r4.mo9475j()
            r1 = r31
            r2 = r30
            r10 = r39
            r9 = r4
            r4 = r5
            r5 = r13
            r11 = r32
            r32 = r13
            r13 = r6
            r6 = r14
            r16 = r7
            r7 = r15
            r33 = r14
            r14 = r8
            r8 = r16
            androidx.compose.foundation.text.r r0 = androidx.compose.foundation.text.CoreTextKt.m12287e(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r13.mo9334o(r0)
            goto L_0x025c
        L_0x024f:
            r11 = r32
            r10 = r39
            r9 = r4
            r16 = r7
            r32 = r13
            r33 = r14
            r13 = r6
            r14 = r8
        L_0x025c:
            r9.mo9480o(r14)
            r13.mo9335p(r11)
            r0 = 959240076(0x392cd78c, float:1.6483496E-4)
            r12.mo14918M(r0)
            if (r11 == 0) goto L_0x027b
            androidx.compose.runtime.i1 r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.m12954c()
            java.lang.Object r0 = r12.mo15032w(r0)
            androidx.compose.foundation.text.selection.t r0 = (androidx.compose.foundation.text.selection.C2844t) r0
            long r0 = r0.mo9906a()
            r9.mo9483r(r0)
        L_0x027b:
            r12.mo15002m0()
            androidx.compose.ui.m r0 = r13.mo9329j()
            androidx.compose.ui.m r0 = r10.mo17224k3(r0)
            androidx.compose.ui.layout.f0 r1 = r13.mo9328i()
            r2 = 544976794(0x207baf9a, float:2.1318629E-19)
            r12.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r12.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r12.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r12.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ComposedModifierKt.m32288k(r12, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r5.mo44585a()
            r7 = 1405779621(0x53ca7ea5, float:1.73941627E12)
            r12.mo14918M(r7)
            androidx.compose.runtime.d r7 = r12.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x02c9
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02c9:
            r12.mo14938T()
            boolean r7 = r12.mo14997l()
            if (r7 == 0) goto L_0x02db
            androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1 r7 = new androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
            r7.<init>(r6)
            r12.mo14947W(r7)
            goto L_0x02de
        L_0x02db:
            r12.mo14888A()
        L_0x02de:
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r12)
            kotlin.jvm.functions.p r7 = r5.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r7)
            kotlin.jvm.functions.p r1 = r5.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r1)
            kotlin.jvm.functions.p r1 = r5.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r1)
            kotlin.jvm.functions.p r1 = r5.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            kotlin.jvm.functions.p r1 = r5.mo44589e()
            androidx.compose.runtime.Updater.m30188j(r6, r0, r1)
            r12.mo14896D()
            r12.mo15002m0()
            r12.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0317
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0317:
            r6 = r32
            r5 = r33
            r2 = r10
            r4 = r14
            r7 = r15
            r8 = r16
            r3 = r30
        L_0x0322:
            androidx.compose.runtime.t1 r11 = r12.mo15020s()
            if (r11 != 0) goto L_0x0329
            goto L_0x0338
        L_0x0329:
            androidx.compose.foundation.text.BasicTextKt$BasicText$2 r12 = new androidx.compose.foundation.text.BasicTextKt$BasicText$2
            r0 = r12
            r1 = r31
            r9 = r40
            r10 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x0338:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m12207b(java.lang.String, androidx.compose.ui.m, androidx.compose.ui.text.p0, kotlin.jvm.functions.l, int, boolean, int, int, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f9  */
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m12208c(java.lang.String r23, androidx.compose.p004ui.C8767m r24, androidx.compose.p004ui.text.C16361p0 r25, kotlin.jvm.functions.C11300l r26, int r27, boolean r28, int r29, androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r11 = r23
            r12 = r31
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1022429478(0x3cf10926, float:0.029423308)
            r1 = r30
            androidx.compose.runtime.o r13 = r1.mo15009o(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r12 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x0028
            boolean r1 = r13.mo15006n0(r11)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r12
            goto L_0x0029
        L_0x0028:
            r1 = r12
        L_0x0029:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0043
        L_0x0030:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0043
            r3 = r24
            boolean r4 = r13.mo15006n0(r3)
            if (r4 == 0) goto L_0x003f
            r4 = 32
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r1 = r1 | r4
            goto L_0x0045
        L_0x0043:
            r3 = r24
        L_0x0045:
            r4 = r32 & 4
            if (r4 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x005f
            r5 = r25
            boolean r6 = r13.mo15006n0(r5)
            if (r6 == 0) goto L_0x005b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r6
            goto L_0x0061
        L_0x005f:
            r5 = r25
        L_0x0061:
            r6 = r32 & 8
            if (r6 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007b
            r7 = r26
            boolean r8 = r13.mo14927P(r7)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r8
            goto L_0x007d
        L_0x007b:
            r7 = r26
        L_0x007d:
            r8 = r32 & 16
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0087
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009a
        L_0x0087:
            r10 = r12 & r9
            if (r10 != 0) goto L_0x009a
            r10 = r27
            boolean r14 = r13.mo14976f(r10)
            if (r14 == 0) goto L_0x0096
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r14
            goto L_0x009c
        L_0x009a:
            r10 = r27
        L_0x009c:
            r14 = r32 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00a9
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r15 = r28
            goto L_0x00bc
        L_0x00a9:
            r16 = r12 & r15
            r15 = r28
            if (r16 != 0) goto L_0x00bc
            boolean r16 = r13.mo14961b(r15)
            if (r16 == 0) goto L_0x00b8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r16
        L_0x00bc:
            r16 = r32 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00c9
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r29
            goto L_0x00dc
        L_0x00c9:
            r18 = r12 & r17
            r9 = r29
            if (r18 != 0) goto L_0x00dc
            boolean r19 = r13.mo14976f(r9)
            if (r19 == 0) goto L_0x00d8
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r1 = r1 | r19
        L_0x00dc:
            r19 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r1 & r19
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r3) goto L_0x00f9
            boolean r0 = r13.mo15011p()
            if (r0 != 0) goto L_0x00ed
            goto L_0x00f9
        L_0x00ed:
            r13.mo14958a0()
            r2 = r24
            r3 = r5
            r4 = r7
            r7 = r9
            r5 = r10
            r6 = r15
            goto L_0x0180
        L_0x00f9:
            if (r2 == 0) goto L_0x0100
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r19 = r0
            goto L_0x0102
        L_0x0100:
            r19 = r24
        L_0x0102:
            if (r4 == 0) goto L_0x010d
            androidx.compose.ui.text.p0$a r0 = androidx.compose.p004ui.text.C16361p0.f40603d
            androidx.compose.ui.text.p0 r0 = r0.mo47519a()
            r20 = r0
            goto L_0x010f
        L_0x010d:
            r20 = r5
        L_0x010f:
            if (r6 == 0) goto L_0x0116
            androidx.compose.foundation.text.BasicTextKt$BasicText$6 r0 = androidx.compose.foundation.text.BasicTextKt$BasicText$6.f7071f
            r21 = r0
            goto L_0x0118
        L_0x0116:
            r21 = r7
        L_0x0118:
            if (r8 == 0) goto L_0x0123
            androidx.compose.ui.text.style.r$a r0 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r0 = r0.mo47726a()
            r22 = r0
            goto L_0x0125
        L_0x0123:
            r22 = r10
        L_0x0125:
            if (r14 == 0) goto L_0x0129
            r0 = 1
            r15 = r0
        L_0x0129:
            if (r16 == 0) goto L_0x0130
            r0 = 2147483647(0x7fffffff, float:NaN)
            r14 = r0
            goto L_0x0131
        L_0x0130:
            r14 = r9
        L_0x0131:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0140
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.BasicText (BasicText.kt:265)"
            r3 = 1022429478(0x3cf10926, float:0.029423308)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x0140:
            r7 = 1
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r17
            r9 = r0 | r1
            r10 = 0
            r0 = r23
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r15
            r6 = r14
            r8 = r13
            m12207b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0176
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0176:
            r7 = r14
            r6 = r15
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
        L_0x0180:
            androidx.compose.runtime.t1 r10 = r13.mo15020s()
            if (r10 != 0) goto L_0x0187
            goto L_0x0196
        L_0x0187:
            androidx.compose.foundation.text.BasicTextKt$BasicText$7 r13 = new androidx.compose.foundation.text.BasicTextKt$BasicText$7
            r0 = r13
            r1 = r23
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r13)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m12208c(java.lang.String, androidx.compose.ui.m, androidx.compose.ui.text.p0, kotlin.jvm.functions.l, int, boolean, int, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012d  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m12209d(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.C16156d r34, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r35, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r36, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.text.C16260h0, kotlin.C11079d2> r37, int r38, boolean r39, int r40, int r41, @org.jetbrains.annotations.C12580l java.util.Map<java.lang.String, androidx.compose.foundation.text.C2762c> r42, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r43, int r44, int r45) {
        /*
            r11 = r34
            r12 = r44
            r13 = r45
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 851408699(0x32bf773b, float:2.2289546E-8)
            r1 = r43
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r12 | 6
            goto L_0x002b
        L_0x001b:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x002a
            boolean r1 = r14.mo15006n0(r11)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r12
            goto L_0x002b
        L_0x002a:
            r1 = r12
        L_0x002b:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x0032
            r1 = r1 | 48
            goto L_0x0045
        L_0x0032:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0045
            r4 = r35
            boolean r5 = r14.mo15006n0(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r1 = r1 | r5
            goto L_0x0047
        L_0x0045:
            r4 = r35
        L_0x0047:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r36
            boolean r8 = r14.mo15006n0(r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r36
        L_0x0063:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007d
            r9 = r37
            boolean r10 = r14.mo14927P(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r1 = r1 | r10
            goto L_0x007f
        L_0x007d:
            r9 = r37
        L_0x007f:
            r10 = r13 & 16
            if (r10 == 0) goto L_0x0086
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0086:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r12
            if (r15 != 0) goto L_0x009c
            r15 = r38
            boolean r16 = r14.mo14976f(r15)
            if (r16 == 0) goto L_0x0097
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r16
            goto L_0x009e
        L_0x009c:
            r15 = r38
        L_0x009e:
            r16 = r13 & 32
            if (r16 == 0) goto L_0x00a9
            r17 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r17
            r2 = r39
            goto L_0x00be
        L_0x00a9:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r12 & r17
            r2 = r39
            if (r17 != 0) goto L_0x00be
            boolean r17 = r14.mo14961b(r2)
            if (r17 == 0) goto L_0x00ba
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r1 = r1 | r17
        L_0x00be:
            r17 = r13 & 64
            if (r17 == 0) goto L_0x00c9
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r0 = r40
            goto L_0x00de
        L_0x00c9:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r12 & r18
            r0 = r40
            if (r18 != 0) goto L_0x00de
            boolean r19 = r14.mo14976f(r0)
            if (r19 == 0) goto L_0x00da
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r19
        L_0x00de:
            r6 = r13 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00e9
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r20
            r0 = r41
            goto L_0x00fe
        L_0x00e9:
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r20 = r12 & r20
            r0 = r41
            if (r20 != 0) goto L_0x00fe
            boolean r20 = r14.mo14976f(r0)
            if (r20 == 0) goto L_0x00fa
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r20
        L_0x00fe:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0106
            r20 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r20
        L_0x0106:
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x012d
            r2 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r2 & r1
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r4) goto L_0x012d
            boolean r2 = r14.mo15011p()
            if (r2 != 0) goto L_0x011a
            goto L_0x012d
        L_0x011a:
            r14.mo14958a0()
            r2 = r35
            r6 = r39
            r8 = r41
            r3 = r7
            r4 = r9
            r1 = r11
            r5 = r15
            r7 = r40
            r9 = r42
            goto L_0x0383
        L_0x012d:
            if (r3 == 0) goto L_0x0133
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r4 = r2
            goto L_0x0135
        L_0x0133:
            r4 = r35
        L_0x0135:
            if (r5 == 0) goto L_0x0140
            androidx.compose.ui.text.p0$a r2 = androidx.compose.p004ui.text.C16361p0.f40603d
            androidx.compose.ui.text.p0 r2 = r2.mo47519a()
            r19 = r2
            goto L_0x0142
        L_0x0140:
            r19 = r7
        L_0x0142:
            if (r8 == 0) goto L_0x0147
            androidx.compose.foundation.text.BasicTextKt$BasicText$3 r2 = androidx.compose.foundation.text.BasicTextKt$BasicText$3.f7070f
            r9 = r2
        L_0x0147:
            if (r10 == 0) goto L_0x0150
            androidx.compose.ui.text.style.r$a r2 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r2 = r2.mo47726a()
            r15 = r2
        L_0x0150:
            if (r16 == 0) goto L_0x0155
            r16 = 1
            goto L_0x0157
        L_0x0155:
            r16 = r39
        L_0x0157:
            if (r17 == 0) goto L_0x015e
            r2 = 2147483647(0x7fffffff, float:NaN)
            r8 = r2
            goto L_0x0160
        L_0x015e:
            r8 = r40
        L_0x0160:
            if (r6 == 0) goto L_0x0164
            r7 = 1
            goto L_0x0166
        L_0x0164:
            r7 = r41
        L_0x0166:
            if (r0 == 0) goto L_0x016e
            java.util.Map r0 = kotlin.collections.C10977s0.m41492z()
            r6 = r0
            goto L_0x0170
        L_0x016e:
            r6 = r42
        L_0x0170:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x017f
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.BasicText (BasicText.kt:170)"
            r3 = 851408699(0x32bf773b, float:2.2289546E-8)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x017f:
            androidx.compose.foundation.text.HeightInLinesModifierKt.m12295c(r7, r8)
            androidx.compose.runtime.i1 r0 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.m12853a()
            java.lang.Object r0 = r14.mo15032w(r0)
            r5 = r0
            androidx.compose.foundation.text.selection.n r5 = (androidx.compose.foundation.text.selection.C2837n) r5
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r14.mo15032w(r0)
            r17 = r0
            androidx.compose.ui.unit.d r17 = (androidx.compose.p004ui.unit.C16479d) r17
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71013k()
            java.lang.Object r0 = r14.mo15032w(r0)
            r18 = r0
            androidx.compose.ui.text.font.u$b r18 = (androidx.compose.p004ui.text.font.C16242u.C16244b) r18
            androidx.compose.runtime.i1 r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.m12954c()
            java.lang.Object r0 = r14.mo15032w(r0)
            androidx.compose.foundation.text.selection.t r0 = (androidx.compose.foundation.text.selection.C2844t) r0
            long r2 = r0.mo9906a()
            kotlin.Pair r0 = androidx.compose.foundation.text.CoreTextKt.m12284b(r11, r6)
            java.lang.Object r20 = r0.mo21846a()
            java.util.List r20 = (java.util.List) r20
            java.lang.Object r0 = r0.mo21847b()
            java.util.List r0 = (java.util.List) r0
            r10 = 959243860(0x392ce654, float:1.6489002E-4)
            r14.mo14918M(r10)
            r22 = 0
            if (r5 != 0) goto L_0x01d6
            r23 = 0
            r42 = r0
            r27 = r23
            r21 = 1
            goto L_0x020a
        L_0x01d6:
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r22] = r11
            r21 = 1
            r10[r21] = r5
            androidx.compose.runtime.saveable.e r23 = m12210e(r5)
            r24 = 0
            r42 = r0
            androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2 r0 = new androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
            r0.<init>(r5)
            r25 = 72
            r26 = 4
            r35 = r10
            r36 = r23
            r37 = r24
            r38 = r0
            r39 = r14
            r40 = r25
            r41 = r26
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r35, r36, r37, r38, r39, r40, r41)
            java.lang.Number r0 = (java.lang.Number) r0
            long r23 = r0.longValue()
            r27 = r23
        L_0x020a:
            r14.mo15002m0()
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo14918M(r0)
            java.lang.Object r0 = r14.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r0 != r10) goto L_0x0262
            androidx.compose.foundation.text.TextController r10 = new androidx.compose.foundation.text.TextController
            androidx.compose.foundation.text.TextState r0 = new androidx.compose.foundation.text.TextState
            r35 = r10
            androidx.compose.foundation.text.r r10 = new androidx.compose.foundation.text.r
            r23 = 0
            r36 = r42
            r12 = r0
            r0 = r10
            r29 = r1
            r1 = r34
            r30 = r2
            r2 = r19
            r3 = r8
            r32 = r4
            r4 = r7
            r33 = r5
            r5 = r16
            r24 = r6
            r6 = r15
            r25 = r7
            r7 = r17
            r26 = r8
            r8 = r18
            r13 = r9
            r9 = r20
            r11 = r35
            r21 = r13
            r13 = r10
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r27
            r12.<init>(r13, r0)
            r11.<init>(r12)
            r14.mo14893C(r11)
            r0 = r11
            goto L_0x0274
        L_0x0262:
            r36 = r42
            r29 = r1
            r30 = r2
            r32 = r4
            r33 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r21 = r9
        L_0x0274:
            r14.mo15002m0()
            r10 = r0
            androidx.compose.foundation.text.TextController r10 = (androidx.compose.foundation.text.TextController) r10
            androidx.compose.foundation.text.TextState r11 = r10.mo9331l()
            boolean r0 = r14.mo14997l()
            if (r0 != 0) goto L_0x02a0
            androidx.compose.foundation.text.r r0 = r11.mo9475j()
            r1 = r34
            r2 = r19
            r3 = r17
            r4 = r18
            r5 = r16
            r6 = r15
            r7 = r26
            r8 = r25
            r9 = r20
            androidx.compose.foundation.text.r r0 = androidx.compose.foundation.text.CoreTextKt.m12285c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo9334o(r0)
        L_0x02a0:
            r9 = r21
            r11.mo9480o(r9)
            r0 = r30
            r11.mo9483r(r0)
            r0 = r33
            r10.mo9335p(r0)
            boolean r0 = r36.isEmpty()
            if (r0 == 0) goto L_0x02be
            androidx.compose.foundation.text.ComposableSingletons$BasicTextKt r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextKt.f7085a
            kotlin.jvm.functions.p r0 = r0.mo9262a()
            r1 = r34
            goto L_0x02d1
        L_0x02be:
            androidx.compose.foundation.text.BasicTextKt$BasicText$4 r0 = new androidx.compose.foundation.text.BasicTextKt$BasicText$4
            r1 = r34
            r3 = r36
            r2 = r29
            r0.<init>(r1, r3, r2)
            r2 = 1749415830(0x6845f796, float:3.7394934E24)
            r3 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r2, r3, r0)
        L_0x02d1:
            androidx.compose.ui.m r2 = r10.mo9329j()
            r3 = r32
            androidx.compose.ui.m r2 = r3.mo17224k3(r2)
            androidx.compose.ui.layout.f0 r4 = r10.mo9328i()
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r14.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r14.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r8.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r11 = r14.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x0318
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0318:
            r14.mo14938T()
            boolean r11 = r14.mo14997l()
            if (r11 == 0) goto L_0x0325
            r14.mo14947W(r10)
            goto L_0x0328
        L_0x0325:
            r14.mo14888A()
        L_0x0328:
            androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r11 = r8.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r10, r4, r11)
            kotlin.jvm.functions.p r4 = r8.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r10, r5, r4)
            kotlin.jvm.functions.p r4 = r8.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r10, r6, r4)
            kotlin.jvm.functions.p r4 = r8.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r10, r7, r4)
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r2.invoke(r4, r14, r5)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r0.invoke(r14, r2)
            r14.mo15002m0()
            r14.mo14896D()
            r14.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0376
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0376:
            r2 = r3
            r4 = r9
            r5 = r15
            r6 = r16
            r3 = r19
            r9 = r24
            r8 = r25
            r7 = r26
        L_0x0383:
            androidx.compose.runtime.t1 r12 = r14.mo15020s()
            if (r12 != 0) goto L_0x038a
            goto L_0x0399
        L_0x038a:
            androidx.compose.foundation.text.BasicTextKt$BasicText$5 r13 = new androidx.compose.foundation.text.BasicTextKt$BasicText$5
            r0 = r13
            r1 = r34
            r10 = r44
            r11 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x0399:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m12209d(androidx.compose.ui.text.d, androidx.compose.ui.m, androidx.compose.ui.text.p0, kotlin.jvm.functions.l, int, boolean, int, int, java.util.Map, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: e */
    public static final C8628e<Long, Long> m12210e(C2837n nVar) {
        return SaverKt.m31375a(new BasicTextKt$selectionIdSaver$1(nVar), BasicTextKt$selectionIdSaver$2.f7073f);
    }
}
