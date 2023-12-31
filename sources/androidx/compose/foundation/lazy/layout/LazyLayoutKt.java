package androidx.compose.foundation.lazy.layout;

public final class LazyLayoutKt {

    /* renamed from: a */
    public static final int f6701a = 7;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.foundation.C2855v
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m11349a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.layout.C2549h r14, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r15, @org.jetbrains.annotations.C12580l androidx.compose.foundation.lazy.layout.C2557o r16, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.foundation.lazy.layout.C2552k, ? super androidx.compose.p004ui.unit.C16476b, ? extends androidx.compose.p004ui.layout.C15564g0> r17, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r18, int r19, int r20) {
        /*
            r1 = r14
            r8 = r17
            r9 = r19
            java.lang.String r0 = "itemProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "measurePolicy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 852831187(0x32d52bd3, float:2.4816392E-8)
            r2 = r18
            androidx.compose.runtime.o r10 = r2.mo15009o(r0)
            r2 = r20 & 1
            if (r2 == 0) goto L_0x001f
            r2 = r9 | 6
            goto L_0x002f
        L_0x001f:
            r2 = r9 & 14
            if (r2 != 0) goto L_0x002e
            boolean r2 = r10.mo15006n0(r14)
            if (r2 == 0) goto L_0x002b
            r2 = 4
            goto L_0x002c
        L_0x002b:
            r2 = 2
        L_0x002c:
            r2 = r2 | r9
            goto L_0x002f
        L_0x002e:
            r2 = r9
        L_0x002f:
            r3 = r20 & 2
            if (r3 == 0) goto L_0x0036
            r2 = r2 | 48
            goto L_0x0048
        L_0x0036:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0048
            r4 = r15
            boolean r5 = r10.mo15006n0(r15)
            if (r5 == 0) goto L_0x0044
            r5 = 32
            goto L_0x0046
        L_0x0044:
            r5 = 16
        L_0x0046:
            r2 = r2 | r5
            goto L_0x0049
        L_0x0048:
            r4 = r15
        L_0x0049:
            r5 = r20 & 4
            if (r5 == 0) goto L_0x0050
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r6 = r9 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0063
            r6 = r16
            boolean r7 = r10.mo15006n0(r6)
            if (r7 == 0) goto L_0x005f
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r2 = r2 | r7
            goto L_0x0065
        L_0x0063:
            r6 = r16
        L_0x0065:
            r7 = r20 & 8
            if (r7 == 0) goto L_0x006c
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r7 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007c
            boolean r7 = r10.mo14927P(r8)
            if (r7 == 0) goto L_0x0079
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r2 = r2 | r7
        L_0x007c:
            r7 = r2
            r2 = r7 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r2 != r11) goto L_0x0090
            boolean r2 = r10.mo15011p()
            if (r2 != 0) goto L_0x008a
            goto L_0x0090
        L_0x008a:
            r10.mo14958a0()
            r2 = r4
            r3 = r6
            goto L_0x00d2
        L_0x0090:
            if (r3 == 0) goto L_0x0096
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r11 = r2
            goto L_0x0097
        L_0x0096:
            r11 = r4
        L_0x0097:
            if (r5 == 0) goto L_0x009c
            r2 = 0
            r12 = r2
            goto L_0x009d
        L_0x009c:
            r12 = r6
        L_0x009d:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00a9
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r2, r3)
        L_0x00a9:
            r0 = r7 & 14
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30251t(r14, r10, r0)
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1 r13 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
            r2 = r13
            r3 = r12
            r4 = r11
            r5 = r17
            r6 = r7
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 1342877611(0x500aafab, float:9.3070735E9)
            r2 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r0, r2, r13)
            r2 = 6
            androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt.m11383a(r0, r10, r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00d0
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d0:
            r2 = r11
            r3 = r12
        L_0x00d2:
            androidx.compose.runtime.t1 r7 = r10.mo15020s()
            if (r7 != 0) goto L_0x00d9
            goto L_0x00e9
        L_0x00d9:
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2 r10 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2
            r0 = r10
            r1 = r14
            r4 = r17
            r5 = r19
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r10)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutKt.m11349a(androidx.compose.foundation.lazy.layout.h, androidx.compose.ui.m, androidx.compose.foundation.lazy.layout.o, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }
}
