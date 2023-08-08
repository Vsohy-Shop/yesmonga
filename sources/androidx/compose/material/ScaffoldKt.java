package androidx.compose.material;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.C8782q;
import androidx.compose.p004ui.layout.SubcomposeLayoutKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,375:1\n25#2:376\n25#2:383\n83#2,3:390\n1114#3,6:377\n1114#3,6:384\n1114#3,6:393\n154#4:399\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n*L\n65#1:376\n66#1:383\n237#1:390,3\n65#1:377,6\n66#1:384,6\n237#1:393,6\n372#1:399\n*E\n"})
public final class ScaffoldKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C3047h0> f7802a = CompositionLocalKt.m29859e(ScaffoldKt$LocalFabPlacement$1.f7804f);

    /* renamed from: b */
    public static final float f7803b = C16483g.m74435M((float) 16);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: kotlin.jvm.functions.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v1, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: kotlin.jvm.functions.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kotlin.jvm.functions.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: kotlin.jvm.functions.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01b8, code lost:
        if (r0.mo14980g(r55) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01d2, code lost:
        if (r0.mo14980g(r57) != false) goto L_0x01d9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x013f  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13747a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r41, @org.jetbrains.annotations.C12580l androidx.compose.material.C3036d1 r42, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r43, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r46, int r47, boolean r48, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r49, boolean r50, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r51, float r52, long r53, long r55, long r57, long r59, long r61, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2366i0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r63, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r64, int r65, int r66, int r67) {
        /*
            r15 = r63
            r13 = r65
            r14 = r66
            r12 = r67
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 1037492569(0x3dd6e159, float:0.104922004)
            r1 = r64
            androidx.compose.runtime.o r0 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0020
            r4 = r13 | 6
            r5 = r4
            r4 = r41
            goto L_0x0034
        L_0x0020:
            r4 = r13 & 14
            if (r4 != 0) goto L_0x0031
            r4 = r41
            boolean r5 = r0.mo15006n0(r4)
            if (r5 == 0) goto L_0x002e
            r5 = 4
            goto L_0x002f
        L_0x002e:
            r5 = 2
        L_0x002f:
            r5 = r5 | r13
            goto L_0x0034
        L_0x0031:
            r4 = r41
            r5 = r13
        L_0x0034:
            r6 = r13 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004d
            r6 = r12 & 2
            if (r6 != 0) goto L_0x0047
            r6 = r42
            boolean r9 = r0.mo15006n0(r6)
            if (r9 == 0) goto L_0x0049
            r9 = 32
            goto L_0x004b
        L_0x0047:
            r6 = r42
        L_0x0049:
            r9 = 16
        L_0x004b:
            r5 = r5 | r9
            goto L_0x004f
        L_0x004d:
            r6 = r42
        L_0x004f:
            r9 = r12 & 4
            if (r9 == 0) goto L_0x0056
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0056:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006a
            r2 = r43
            boolean r16 = r0.mo14927P(r2)
            if (r16 == 0) goto L_0x0065
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r5 = r5 | r16
            goto L_0x006c
        L_0x006a:
            r2 = r43
        L_0x006c:
            r16 = r12 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0077
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x008b
        L_0x0077:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x008b
            r3 = r44
            boolean r20 = r0.mo14927P(r3)
            if (r20 == 0) goto L_0x0086
            r20 = r17
            goto L_0x0088
        L_0x0086:
            r20 = r18
        L_0x0088:
            r5 = r5 | r20
            goto L_0x008d
        L_0x008b:
            r3 = r44
        L_0x008d:
            r20 = r12 & 16
            r21 = 57344(0xe000, float:8.0356E-41)
            r22 = 16384(0x4000, float:2.2959E-41)
            r23 = 8192(0x2000, float:1.14794E-41)
            if (r20 == 0) goto L_0x009d
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r7 = r45
            goto L_0x00b0
        L_0x009d:
            r24 = r13 & r21
            r7 = r45
            if (r24 != 0) goto L_0x00b0
            boolean r25 = r0.mo14927P(r7)
            if (r25 == 0) goto L_0x00ac
            r25 = r22
            goto L_0x00ae
        L_0x00ac:
            r25 = r23
        L_0x00ae:
            r5 = r5 | r25
        L_0x00b0:
            r25 = r12 & 32
            r26 = 131072(0x20000, float:1.83671E-40)
            r27 = 458752(0x70000, float:6.42848E-40)
            r28 = 65536(0x10000, float:9.18355E-41)
            if (r25 == 0) goto L_0x00c1
            r29 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r29
            r8 = r46
            goto L_0x00d4
        L_0x00c1:
            r29 = r13 & r27
            r8 = r46
            if (r29 != 0) goto L_0x00d4
            boolean r30 = r0.mo14927P(r8)
            if (r30 == 0) goto L_0x00d0
            r30 = r26
            goto L_0x00d2
        L_0x00d0:
            r30 = r28
        L_0x00d2:
            r5 = r5 | r30
        L_0x00d4:
            r30 = r12 & 64
            r31 = 3670016(0x380000, float:5.142788E-39)
            if (r30 == 0) goto L_0x00e1
            r32 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r32
            r10 = r47
            goto L_0x00f4
        L_0x00e1:
            r32 = r13 & r31
            r10 = r47
            if (r32 != 0) goto L_0x00f4
            boolean r33 = r0.mo14976f(r10)
            if (r33 == 0) goto L_0x00f0
            r33 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f2
        L_0x00f0:
            r33 = 524288(0x80000, float:7.34684E-40)
        L_0x00f2:
            r5 = r5 | r33
        L_0x00f4:
            r11 = r12 & 128(0x80, float:1.794E-43)
            r34 = 29360128(0x1c00000, float:7.052966E-38)
            if (r11 == 0) goto L_0x0101
            r35 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r35
            r2 = r48
            goto L_0x0114
        L_0x0101:
            r35 = r13 & r34
            r2 = r48
            if (r35 != 0) goto L_0x0114
            boolean r35 = r0.mo14961b(r2)
            if (r35 == 0) goto L_0x0110
            r35 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0112
        L_0x0110:
            r35 = 4194304(0x400000, float:5.877472E-39)
        L_0x0112:
            r5 = r5 | r35
        L_0x0114:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x011f
            r35 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r35
            r3 = r49
            goto L_0x0134
        L_0x011f:
            r35 = 234881024(0xe000000, float:1.5777218E-30)
            r35 = r13 & r35
            r3 = r49
            if (r35 != 0) goto L_0x0134
            boolean r35 = r0.mo14927P(r3)
            if (r35 == 0) goto L_0x0130
            r35 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0132
        L_0x0130:
            r35 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0132:
            r5 = r5 | r35
        L_0x0134:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x013f
            r35 = 805306368(0x30000000, float:4.656613E-10)
            r5 = r5 | r35
            r4 = r50
            goto L_0x0154
        L_0x013f:
            r35 = 1879048192(0x70000000, float:1.58456325E29)
            r35 = r13 & r35
            r4 = r50
            if (r35 != 0) goto L_0x0154
            boolean r35 = r0.mo14961b(r4)
            if (r35 == 0) goto L_0x0150
            r35 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0152
        L_0x0150:
            r35 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0152:
            r5 = r5 | r35
        L_0x0154:
            r35 = r14 & 14
            if (r35 != 0) goto L_0x016e
            r4 = r12 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L_0x0167
            r4 = r51
            boolean r35 = r0.mo15006n0(r4)
            if (r35 == 0) goto L_0x0169
            r19 = 4
            goto L_0x016b
        L_0x0167:
            r4 = r51
        L_0x0169:
            r19 = 2
        L_0x016b:
            r19 = r14 | r19
            goto L_0x0172
        L_0x016e:
            r4 = r51
            r19 = r14
        L_0x0172:
            r4 = r12 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x017b
            r19 = r19 | 48
            r6 = r52
            goto L_0x018e
        L_0x017b:
            r35 = r14 & 112(0x70, float:1.57E-43)
            r6 = r52
            if (r35 != 0) goto L_0x018e
            boolean r35 = r0.mo14968d(r6)
            if (r35 == 0) goto L_0x018a
            r24 = 32
            goto L_0x018c
        L_0x018a:
            r24 = 16
        L_0x018c:
            r19 = r19 | r24
        L_0x018e:
            r6 = r14 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x01a8
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 != 0) goto L_0x01a1
            r6 = r53
            boolean r24 = r0.mo14980g(r6)
            if (r24 == 0) goto L_0x01a3
            r32 = 256(0x100, float:3.59E-43)
            goto L_0x01a5
        L_0x01a1:
            r6 = r53
        L_0x01a3:
            r32 = 128(0x80, float:1.794E-43)
        L_0x01a5:
            r19 = r19 | r32
            goto L_0x01aa
        L_0x01a8:
            r6 = r53
        L_0x01aa:
            r6 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x01c2
            r6 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r6 != 0) goto L_0x01bb
            r6 = r55
            boolean r24 = r0.mo14980g(r6)
            if (r24 == 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bb:
            r6 = r55
        L_0x01bd:
            r17 = r18
        L_0x01bf:
            r19 = r19 | r17
            goto L_0x01c4
        L_0x01c2:
            r6 = r55
        L_0x01c4:
            r17 = r14 & r21
            if (r17 != 0) goto L_0x01dc
            r6 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r6 != 0) goto L_0x01d5
            r6 = r57
            boolean r17 = r0.mo14980g(r6)
            if (r17 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d5:
            r6 = r57
        L_0x01d7:
            r22 = r23
        L_0x01d9:
            r19 = r19 | r22
            goto L_0x01de
        L_0x01dc:
            r6 = r57
        L_0x01de:
            r17 = r14 & r27
            if (r17 != 0) goto L_0x01f9
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r12 & r17
            r6 = r59
            if (r17 != 0) goto L_0x01f4
            boolean r17 = r0.mo14980g(r6)
            if (r17 == 0) goto L_0x01f4
            r17 = r26
            goto L_0x01f6
        L_0x01f4:
            r17 = r28
        L_0x01f6:
            r19 = r19 | r17
            goto L_0x01fb
        L_0x01f9:
            r6 = r59
        L_0x01fb:
            r17 = r14 & r31
            if (r17 != 0) goto L_0x0213
            r17 = r12 & r28
            r6 = r61
            if (r17 != 0) goto L_0x020e
            boolean r17 = r0.mo14980g(r6)
            if (r17 == 0) goto L_0x020e
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0210
        L_0x020e:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0210:
            r19 = r19 | r17
            goto L_0x0215
        L_0x0213:
            r6 = r61
        L_0x0215:
            r17 = r12 & r26
            if (r17 == 0) goto L_0x021e
            r17 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x021b:
            r19 = r19 | r17
            goto L_0x022e
        L_0x021e:
            r17 = r14 & r34
            if (r17 != 0) goto L_0x022e
            boolean r17 = r0.mo14927P(r15)
            if (r17 == 0) goto L_0x022b
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021b
        L_0x022b:
            r17 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x021b
        L_0x022e:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r5 & r17
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x026e
            r6 = 23967451(0x16db6db, float:4.3661218E-38)
            r6 = r19 & r6
            r7 = 4793490(0x492492, float:6.71711E-39)
            if (r6 != r7) goto L_0x026e
            boolean r6 = r0.mo15011p()
            if (r6 != 0) goto L_0x0249
            goto L_0x026e
        L_0x0249:
            r0.mo14958a0()
            r1 = r41
            r2 = r42
            r3 = r43
            r4 = r44
            r5 = r45
            r9 = r49
            r11 = r51
            r12 = r52
            r13 = r53
            r15 = r55
            r17 = r57
            r19 = r59
            r21 = r61
            r6 = r8
            r7 = r10
            r8 = r48
            r10 = r50
            goto L_0x04d6
        L_0x026e:
            r0.mo14930Q()
            r6 = r13 & 1
            if (r6 == 0) goto L_0x02d6
            boolean r6 = r0.mo14977f0()
            if (r6 == 0) goto L_0x027c
            goto L_0x02d6
        L_0x027c:
            r0.mo14958a0()
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0285
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0285:
            r1 = r12 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x028b
            r19 = r19 & -15
        L_0x028b:
            r1 = r19
            r2 = r12 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0293
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0293:
            r2 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0299
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0299:
            r2 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x02a1
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r2
        L_0x02a1:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r12
            if (r2 == 0) goto L_0x02ab
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r2
        L_0x02ab:
            r2 = r12 & r28
            if (r2 == 0) goto L_0x02b3
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r2
        L_0x02b3:
            r2 = r42
            r6 = r43
            r7 = r44
            r11 = r48
            r3 = r49
            r4 = r50
            r16 = r52
            r18 = r53
            r22 = r55
            r24 = r57
            r28 = r59
            r32 = r61
            r12 = r1
            r13 = r5
            r9 = r8
            r1 = r41
            r8 = r45
            r5 = r51
            goto L_0x03ff
        L_0x02d6:
            if (r1 == 0) goto L_0x02db
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x02dd
        L_0x02db:
            r1 = r41
        L_0x02dd:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x02ee
            r6 = 0
            r7 = 3
            r41 = r1
            r1 = 0
            r8 = 0
            androidx.compose.material.d1 r1 = m13752f(r1, r8, r0, r6, r7)
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02f2
        L_0x02ee:
            r41 = r1
            r1 = r42
        L_0x02f2:
            if (r9 == 0) goto L_0x02fb
            androidx.compose.material.ComposableSingletons$ScaffoldKt r6 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7597a
            kotlin.jvm.functions.p r6 = r6.mo10105a()
            goto L_0x02fd
        L_0x02fb:
            r6 = r43
        L_0x02fd:
            if (r16 == 0) goto L_0x0306
            androidx.compose.material.ComposableSingletons$ScaffoldKt r7 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7597a
            kotlin.jvm.functions.p r7 = r7.mo10106b()
            goto L_0x0308
        L_0x0306:
            r7 = r44
        L_0x0308:
            if (r20 == 0) goto L_0x0311
            androidx.compose.material.ComposableSingletons$ScaffoldKt r8 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7597a
            kotlin.jvm.functions.q r8 = r8.mo10107c()
            goto L_0x0313
        L_0x0311:
            r8 = r45
        L_0x0313:
            if (r25 == 0) goto L_0x031c
            androidx.compose.material.ComposableSingletons$ScaffoldKt r9 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7597a
            kotlin.jvm.functions.p r9 = r9.mo10108d()
            goto L_0x031e
        L_0x031c:
            r9 = r46
        L_0x031e:
            if (r30 == 0) goto L_0x0326
            androidx.compose.material.i0$a r10 = androidx.compose.material.C3050i0.f8146b
            int r10 = r10.mo10793b()
        L_0x0326:
            if (r11 == 0) goto L_0x032a
            r11 = 0
            goto L_0x032c
        L_0x032a:
            r11 = r48
        L_0x032c:
            if (r2 == 0) goto L_0x0330
            r2 = 0
            goto L_0x0332
        L_0x0330:
            r2 = r49
        L_0x0332:
            if (r3 == 0) goto L_0x0336
            r3 = 1
            goto L_0x0338
        L_0x0336:
            r3 = r50
        L_0x0338:
            r42 = r1
            r1 = r12 & 1024(0x400, float:1.435E-42)
            r43 = r2
            r2 = 6
            if (r1 == 0) goto L_0x034e
            androidx.compose.material.t0 r1 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.f1 r1 = r1.mo11076b(r0, r2)
            androidx.compose.foundation.shape.e r1 = r1.mo10756c()
            r19 = r19 & -15
            goto L_0x0350
        L_0x034e:
            r1 = r51
        L_0x0350:
            r36 = r19
            if (r4 == 0) goto L_0x035b
            androidx.compose.material.c0 r4 = androidx.compose.material.C3032c0.f8090a
            float r4 = r4.mo10725a()
            goto L_0x035d
        L_0x035b:
            r4 = r52
        L_0x035d:
            r2 = r12 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x037c
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            r45 = r1
            r1 = 6
            androidx.compose.material.q r2 = r2.mo11075a(r0, r1)
            long r1 = r2.mo10975n()
            r46 = r1
            r1 = r36
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r39 = r3
            r3 = r1
            r1 = r46
            r46 = r39
            goto L_0x0385
        L_0x037c:
            r45 = r1
            r1 = r36
            r46 = r3
            r3 = r1
            r1 = r53
        L_0x0385:
            r47 = r4
            r4 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0396
            int r4 = r3 >> 6
            r4 = r4 & 14
            long r16 = androidx.compose.material.ColorsKt.m13381b(r1, r0, r4)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0398
        L_0x0396:
            r16 = r55
        L_0x0398:
            r4 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x03aa
            androidx.compose.material.c0 r4 = androidx.compose.material.C3032c0.f8090a
            r18 = r1
            r1 = 6
            long r22 = r4.mo10726b(r0, r1)
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r2
            goto L_0x03af
        L_0x03aa:
            r18 = r1
            r1 = 6
            r22 = r57
        L_0x03af:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r12
            if (r2 == 0) goto L_0x03c4
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r1 = r2.mo11075a(r0, r1)
            long r1 = r1.mo10964c()
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
            goto L_0x03c6
        L_0x03c4:
            r1 = r59
        L_0x03c6:
            r4 = r12 & r28
            if (r4 == 0) goto L_0x03e9
            int r4 = r3 >> 15
            r4 = r4 & 14
            long r24 = androidx.compose.material.ColorsKt.m13381b(r1, r0, r4)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r4
            r4 = r46
            r28 = r1
            r12 = r3
            r13 = r5
            r32 = r24
            r1 = r41
            r2 = r42
            r3 = r43
            r5 = r45
            r24 = r22
            goto L_0x03fb
        L_0x03e9:
            r4 = r46
            r32 = r61
            r28 = r1
            r12 = r3
            r13 = r5
            r24 = r22
            r1 = r41
            r2 = r42
            r3 = r43
            r5 = r45
        L_0x03fb:
            r22 = r16
            r16 = r47
        L_0x03ff:
            r0.mo14899E()
            boolean r17 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r17 == 0) goto L_0x0410
            r14 = 1037492569(0x3dd6e159, float:0.104922004)
            java.lang.String r15 = "androidx.compose.material.Scaffold (Scaffold.kt:158)"
            androidx.compose.runtime.ComposerKt.m29845w0(r14, r13, r12, r15)
        L_0x0410:
            androidx.compose.material.ScaffoldKt$Scaffold$child$1 r14 = new androidx.compose.material.ScaffoldKt$Scaffold$child$1
            r41 = r14
            r42 = r28
            r44 = r32
            r46 = r12
            r47 = r11
            r48 = r10
            r49 = r6
            r50 = r63
            r51 = r9
            r52 = r7
            r53 = r13
            r54 = r8
            r55 = r2
            r41.<init>(r42, r44, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r15 = 1823402604(0x6caeea6c, float:1.691681E27)
            r57 = r6
            r6 = 1
            androidx.compose.runtime.internal.a r14 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r15, r6, r14)
            if (r3 == 0) goto L_0x0499
            r15 = -1013848234(0xffffffffc391e756, float:-291.8073)
            r0.mo14918M(r15)
            androidx.compose.material.DrawerState r15 = r2.mo10746a()
            androidx.compose.material.ScaffoldKt$Scaffold$1 r6 = new androidx.compose.material.ScaffoldKt$Scaffold$1
            r6.<init>(r14)
            r14 = 100842932(0x602bdb4, float:2.4589654E-35)
            r58 = r2
            r2 = 1
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r14, r2, r6)
            int r6 = r13 >> 24
            r6 = r6 & 14
            r14 = 805306368(0x30000000, float:4.656613E-10)
            r6 = r6 | r14
            int r14 = r13 << 3
            r14 = r14 & 112(0x70, float:1.57E-43)
            r6 = r6 | r14
            int r13 = r13 >> 18
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r13
            int r12 = r12 << 12
            r13 = r12 & r21
            r6 = r6 | r13
            r13 = r12 & r27
            r6 = r6 | r13
            r13 = r12 & r31
            r6 = r6 | r13
            r13 = r12 & r34
            r6 = r6 | r13
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r13
            r6 = r6 | r12
            r12 = 0
            r41 = r3
            r42 = r1
            r43 = r15
            r44 = r4
            r45 = r5
            r46 = r16
            r47 = r18
            r49 = r22
            r51 = r24
            r53 = r2
            r54 = r0
            r55 = r6
            r56 = r12
            androidx.compose.material.DrawerKt.m13436d(r41, r42, r43, r44, r45, r46, r47, r49, r51, r53, r54, r55, r56)
            r0.mo15002m0()
            goto L_0x04af
        L_0x0499:
            r58 = r2
            r2 = -1013847725(0xffffffffc391e953, float:-291.82285)
            r0.mo14918M(r2)
            r2 = r13 & 14
            r2 = r2 | 48
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14.invoke(r1, r0, r2)
            r0.mo15002m0()
        L_0x04af:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x04b8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04b8:
            r2 = r58
            r6 = r9
            r12 = r16
            r13 = r18
            r15 = r22
            r17 = r24
            r19 = r28
            r21 = r32
            r9 = r3
            r3 = r57
            r39 = r10
            r10 = r4
            r4 = r7
            r7 = r39
            r40 = r11
            r11 = r5
            r5 = r8
            r8 = r40
        L_0x04d6:
            androidx.compose.runtime.t1 r0 = r0.mo15020s()
            if (r0 != 0) goto L_0x04dd
            goto L_0x04fa
        L_0x04dd:
            r41 = r15
            androidx.compose.material.ScaffoldKt$Scaffold$2 r15 = new androidx.compose.material.ScaffoldKt$Scaffold$2
            r37 = r0
            r0 = r15
            r38 = r15
            r15 = r41
            r23 = r63
            r24 = r65
            r25 = r66
            r26 = r67
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r19, r21, r23, r24, r25, r26)
            r0 = r37
            r1 = r38
            r0.mo15202a(r1)
        L_0x04fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m13747a(androidx.compose.ui.m, androidx.compose.material.d1, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.q, kotlin.jvm.functions.p, int, boolean, kotlin.jvm.functions.q, boolean, androidx.compose.ui.graphics.g4, float, long, long, long, long, long, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C8782q
    /* renamed from: b */
    public static final void m13748b(boolean z, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar5 = pVar;
        C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar2 = qVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar6 = pVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar7 = pVar3;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar8 = pVar4;
        int i13 = i2;
        C8592o o = oVar.mo15009o(-1401632215);
        boolean z2 = z;
        if ((i13 & 14) == 0) {
            if (o.mo14961b(z2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i13;
        } else {
            i3 = i13;
        }
        int i14 = i;
        if ((i13 & 112) == 0) {
            if (o.mo14976f(i14)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        if ((i13 & 896) == 0) {
            if (o.mo14927P(pVar5)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        if ((i13 & 7168) == 0) {
            if (o.mo14927P(qVar2)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((57344 & i13) == 0) {
            if (o.mo14927P(pVar6)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((458752 & i13) == 0) {
            if (o.mo14927P(pVar7)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((3670016 & i13) == 0) {
            if (o.mo14927P(pVar8)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        int i15 = i3;
        if ((2995931 & i15) != 599186 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1401632215, i15, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:227)");
            }
            Object[] objArr = {pVar5, pVar6, pVar7, C3050i0.m14309c(i), Boolean.valueOf(z), pVar8, qVar2};
            o.mo14918M(-568225417);
            int i16 = 0;
            boolean z3 = false;
            for (int i17 = 7; i16 < i17; i17 = 7) {
                z3 |= o.mo15006n0(objArr[i16]);
                i16++;
            }
            Object N = o.mo14921N();
            if (z3 || N == C8592o.f23032a.mo16277a()) {
                ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$1 = r0;
                i5 = 1;
                i4 = 0;
                ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$12 = new ScaffoldKt$ScaffoldLayout$1$1(pVar, pVar2, pVar3, i, z, pVar4, i15, qVar);
                o.mo14893C(scaffoldKt$ScaffoldLayout$1$1);
                N = scaffoldKt$ScaffoldLayout$1$1;
            } else {
                i5 = 1;
                i4 = 0;
            }
            o.mo15002m0();
            SubcomposeLayoutKt.m69021a((C8767m) null, (C11304p) N, o, i4, i5);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ScaffoldKt$ScaffoldLayout$2(z, i, pVar, qVar, pVar2, pVar3, pVar4, i2));
        }
    }

    @C12579k
    /* renamed from: e */
    public static final C8550i1<C3047h0> m13751e() {
        return f7802a;
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public static final C3036d1 m13752f(@C12580l DrawerState drawerState, @C12580l SnackbarHostState snackbarHostState, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(1569641925);
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.m13447o(DrawerValue.Closed, (C11300l<? super DrawerValue, Boolean>) null, oVar, 6, 2);
        }
        if ((i2 & 2) != 0) {
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = new SnackbarHostState();
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            snackbarHostState = (SnackbarHostState) N;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:62)");
        }
        oVar.mo14918M(-492369756);
        Object N2 = oVar.mo14921N();
        if (N2 == C8592o.f23032a.mo16277a()) {
            N2 = new C3036d1(drawerState, snackbarHostState);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C3036d1 d1Var = (C3036d1) N2;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d1Var;
    }
}
