package androidx.compose.material3;

import androidx.compose.material.ripple.C7917e;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,145:1\n25#2:146\n36#2:153\n1114#3,6:147\n1114#3,6:154\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n*L\n64#1:146\n135#1:153\n64#1:147,6\n135#1:154,6\n*E\n"})
public final class MaterialThemeKt {
    @C12579k

    /* renamed from: a */
    public static final C7917e f19473a = new C7917e(0.16f, 0.12f, 0.08f, 0.12f);

    /* renamed from: b */
    public static final float f19474b = 0.4f;

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00af, code lost:
        if ((r84 & 4) != 0) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c0  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25865a(@org.jetbrains.annotations.C12580l androidx.compose.material3.C8376z r78, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8253n2 r79, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8280s3 r80, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r81, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r82, int r83, int r84) {
        /*
            r4 = r81
            r5 = r83
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -2127166334(0xffffffff81360482, float:-3.3431355E-38)
            r1 = r82
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r5 & 14
            r3 = 4
            r13 = 2
            if (r2 != 0) goto L_0x002b
            r2 = r84 & 1
            if (r2 != 0) goto L_0x0026
            r2 = r78
            boolean r6 = r1.mo15006n0(r2)
            if (r6 == 0) goto L_0x0028
            r6 = r3
            goto L_0x0029
        L_0x0026:
            r2 = r78
        L_0x0028:
            r6 = r13
        L_0x0029:
            r6 = r6 | r5
            goto L_0x002e
        L_0x002b:
            r2 = r78
            r6 = r5
        L_0x002e:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r84 & 2
            if (r7 != 0) goto L_0x0041
            r7 = r79
            boolean r8 = r1.mo15006n0(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0041:
            r7 = r79
        L_0x0043:
            r8 = 16
        L_0x0045:
            r6 = r6 | r8
            goto L_0x0049
        L_0x0047:
            r7 = r79
        L_0x0049:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r84 & 4
            if (r8 != 0) goto L_0x005c
            r8 = r80
            boolean r9 = r1.mo15006n0(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005c:
            r8 = r80
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r9
            goto L_0x0064
        L_0x0062:
            r8 = r80
        L_0x0064:
            r9 = r84 & 8
            if (r9 == 0) goto L_0x006b
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007b
            boolean r9 = r1.mo14927P(r4)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r6 = r6 | r9
        L_0x007b:
            r9 = r6 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008f
            boolean r9 = r1.mo15011p()
            if (r9 != 0) goto L_0x0088
            goto L_0x008f
        L_0x0088:
            r1.mo14958a0()
            r15 = r7
        L_0x008c:
            r3 = r8
            goto L_0x01c5
        L_0x008f:
            r1.mo14930Q()
            r9 = r5 & 1
            r14 = 6
            if (r9 == 0) goto L_0x00b2
            boolean r9 = r1.mo14977f0()
            if (r9 == 0) goto L_0x009e
            goto L_0x00b2
        L_0x009e:
            r1.mo14958a0()
            r9 = r84 & 1
            if (r9 == 0) goto L_0x00a7
            r6 = r6 & -15
        L_0x00a7:
            r9 = r84 & 2
            if (r9 == 0) goto L_0x00ad
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ad:
            r9 = r84 & 4
            if (r9 == 0) goto L_0x00d6
            goto L_0x00d4
        L_0x00b2:
            r9 = r84 & 1
            if (r9 == 0) goto L_0x00be
            androidx.compose.material3.i1 r2 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.z r2 = r2.mo12652a(r1, r14)
            r6 = r6 & -15
        L_0x00be:
            r9 = r84 & 2
            if (r9 == 0) goto L_0x00ca
            androidx.compose.material3.i1 r7 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.n2 r7 = r7.mo12653b(r1, r14)
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ca:
            r9 = r84 & 4
            if (r9 == 0) goto L_0x00d6
            androidx.compose.material3.i1 r8 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.s3 r8 = r8.mo12654c(r1, r14)
        L_0x00d4:
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00d6:
            r10 = r6
            r12 = r7
            r11 = r8
            r1.mo14899E()
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x00e8
            r6 = -1
            java.lang.String r7 = "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:57)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r6, r7)
        L_0x00e8:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r0)
            java.lang.Object r0 = r1.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r0 != r6) goto L_0x0141
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 536870911(0x1fffffff, float:1.0842021E-19)
            r75 = 0
            r15 = r2
            androidx.compose.material3.z r0 = androidx.compose.material3.C8376z.m29414b(r15, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r75)
            r1.mo14893C(r0)
        L_0x0141:
            r1.mo15002m0()
            androidx.compose.material3.z r0 = (androidx.compose.material3.C8376z) r0
            androidx.compose.material3.ColorSchemeKt.m25525l(r0, r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r15 = 0
            r16 = 7
            r76 = r10
            r10 = r1
            r77 = r11
            r11 = r15
            r15 = r12
            r12 = r16
            androidx.compose.foundation.a0 r6 = androidx.compose.material.ripple.C7922j.m25285e(r6, r7, r8, r10, r11, r12)
            r7 = 0
            androidx.compose.foundation.text.selection.t r8 = m25867c(r0, r1, r7)
            androidx.compose.runtime.j1[] r9 = new androidx.compose.runtime.C8572j1[r14]
            androidx.compose.runtime.i1 r10 = androidx.compose.material3.ColorSchemeKt.m25520g()
            androidx.compose.runtime.j1 r0 = r10.mo16141f(r0)
            r9[r7] = r0
            androidx.compose.runtime.i1 r0 = androidx.compose.foundation.IndicationKt.m8972a()
            androidx.compose.runtime.j1 r0 = r0.mo16141f(r6)
            r6 = 1
            r9[r6] = r0
            androidx.compose.runtime.i1 r0 = androidx.compose.material.ripple.RippleThemeKt.m25257d()
            androidx.compose.material3.h1 r7 = androidx.compose.material3.C8210h1.f20154b
            androidx.compose.runtime.j1 r0 = r0.mo16141f(r7)
            r9[r13] = r0
            androidx.compose.runtime.i1 r0 = androidx.compose.material3.ShapesKt.m26125d()
            androidx.compose.runtime.j1 r0 = r0.mo16141f(r15)
            r7 = 3
            r9[r7] = r0
            androidx.compose.runtime.i1 r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.m12954c()
            androidx.compose.runtime.j1 r0 = r0.mo16141f(r8)
            r9[r3] = r0
            androidx.compose.runtime.i1 r0 = androidx.compose.material3.TypographyKt.m26915b()
            r8 = r77
            androidx.compose.runtime.j1 r0 = r0.mo16141f(r8)
            r3 = 5
            r9[r3] = r0
            androidx.compose.material3.MaterialThemeKt$MaterialTheme$1 r0 = new androidx.compose.material3.MaterialThemeKt$MaterialTheme$1
            r3 = r76
            r0.<init>(r8, r4, r3)
            r3 = -1066563262(0xffffffffc06d8942, float:-3.7115026)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r3, r6, r0)
            r3 = 56
            androidx.compose.runtime.CompositionLocalKt.m29856b(r9, r0, r1, r3)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x008c
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x008c
        L_0x01c5:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x01cc
            goto L_0x01dd
        L_0x01cc:
            androidx.compose.material3.MaterialThemeKt$MaterialTheme$2 r8 = new androidx.compose.material3.MaterialThemeKt$MaterialTheme$2
            r0 = r8
            r1 = r2
            r2 = r15
            r4 = r81
            r5 = r83
            r6 = r84
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x01dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.m25865a(androidx.compose.material3.z, androidx.compose.material3.n2, androidx.compose.material3.s3, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: androidx.compose.foundation.text.selection.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.foundation.text.selection.t} */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        if (r13 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0037;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.C2844t m25867c(@org.jetbrains.annotations.C12579k androidx.compose.material3.C8376z r11, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13) {
        /*
            java.lang.String r0 = "colorScheme"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1866455512(0x6f3fd9d8, float:5.9374994E28)
            r12.mo14918M(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0017
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:132)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r13, r1, r2)
        L_0x0017:
            long r0 = r11.mo14857v()
            androidx.compose.ui.graphics.j2 r11 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r0)
            r13 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r13)
            boolean r11 = r12.mo15006n0(r11)
            java.lang.Object r13 = r12.mo14921N()
            if (r11 != 0) goto L_0x0037
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r13 != r11) goto L_0x0050
        L_0x0037:
            androidx.compose.foundation.text.selection.t r13 = new androidx.compose.foundation.text.selection.t
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 14
            r10 = 0
            r3 = r0
            long r6 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r3, r5, r6, r7, r8, r9, r10)
            r8 = 0
            r3 = r13
            r4 = r0
            r3.<init>(r4, r6, r8)
            r12.mo14893C(r13)
        L_0x0050:
            r12.mo15002m0()
            androidx.compose.foundation.text.selection.t r13 = (androidx.compose.foundation.text.selection.C2844t) r13
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x005e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x005e:
            r12.mo15002m0()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.m25867c(androidx.compose.material3.z, androidx.compose.runtime.o, int):androidx.compose.foundation.text.selection.t");
    }
}
