package androidx.compose.material3;

import androidx.compose.p004ui.geometry.C15090b;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15197l;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.util.C16515d;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11363r0({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,516:1\n25#2:517\n50#2:524\n49#2:525\n25#2:532\n25#2:558\n83#2,3:565\n1114#3,6:518\n1114#3,6:526\n1114#3,6:533\n1114#3,6:559\n1114#3,6:568\n75#4:539\n936#5,4:540\n857#5,5:544\n936#5,4:549\n857#5,5:553\n154#6:574\n154#6:575\n154#6:576\n154#6:577\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n*L\n94#1:517\n99#1:524\n99#1:525\n144#1:532\n268#1:558\n276#1:565,3\n94#1:518,6\n99#1:526,6\n144#1:533,6\n268#1:559,6\n276#1:568,6\n156#1:539\n237#1:540,4\n237#1:544,5\n253#1:549,4\n253#1:553,5\n512#1:574\n513#1:575\n514#1:576\n515#1:577\n*E\n"})
public final class CheckboxKt {

    /* renamed from: a */
    public static final int f19203a = 50;

    /* renamed from: b */
    public static final int f19204b = 100;

    /* renamed from: c */
    public static final int f19205c = 100;

    /* renamed from: d */
    public static final float f19206d;

    /* renamed from: e */
    public static final float f19207e = C16483g.m74435M((float) 20);

    /* renamed from: f */
    public static final float f19208f;

    /* renamed from: g */
    public static final float f19209g;

    /* renamed from: androidx.compose.material3.CheckboxKt$a */
    public /* synthetic */ class C7977a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.p004ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p004ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p004ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p004ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.C7977a.<clinit>():void");
        }
    }

    static {
        float f = (float) 2;
        f19206d = C16483g.m74435M(f);
        f19208f = C16483g.m74435M(f);
        f19209g = C16483g.m74435M(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25477a(boolean r29, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, boolean r32, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8353u r33, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r1 = r29
            r2 = r30
            r7 = r36
            r0 = -1406741137(0xffffffffac26d56f, float:-2.3708498E-12)
            r3 = r35
            androidx.compose.runtime.o r3 = r3.mo15009o(r0)
            r4 = r37 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r7 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r7 & 14
            if (r4 != 0) goto L_0x0025
            boolean r4 = r3.mo14961b(r1)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r7
            goto L_0x0026
        L_0x0025:
            r4 = r7
        L_0x0026:
            r5 = r37 & 2
            if (r5 == 0) goto L_0x002d
            r4 = r4 | 48
            goto L_0x003d
        L_0x002d:
            r5 = r7 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x003d
            boolean r5 = r3.mo14927P(r2)
            if (r5 == 0) goto L_0x003a
            r5 = 32
            goto L_0x003c
        L_0x003a:
            r5 = 16
        L_0x003c:
            r4 = r4 | r5
        L_0x003d:
            r5 = r37 & 4
            if (r5 == 0) goto L_0x0044
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0057
        L_0x0044:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0057
            r6 = r31
            boolean r8 = r3.mo15006n0(r6)
            if (r8 == 0) goto L_0x0053
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0053:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r4 = r4 | r8
            goto L_0x0059
        L_0x0057:
            r6 = r31
        L_0x0059:
            r8 = r37 & 8
            if (r8 == 0) goto L_0x0060
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0073
        L_0x0060:
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0073
            r9 = r32
            boolean r10 = r3.mo14961b(r9)
            if (r10 == 0) goto L_0x006f
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006f:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r4 = r4 | r10
            goto L_0x0075
        L_0x0073:
            r9 = r32
        L_0x0075:
            r24 = 57344(0xe000, float:8.0356E-41)
            r10 = r7 & r24
            if (r10 != 0) goto L_0x0091
            r10 = r37 & 16
            if (r10 != 0) goto L_0x008b
            r10 = r33
            boolean r11 = r3.mo15006n0(r10)
            if (r11 == 0) goto L_0x008d
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008b:
            r10 = r33
        L_0x008d:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r4 = r4 | r11
            goto L_0x0093
        L_0x0091:
            r10 = r33
        L_0x0093:
            r25 = r37 & 32
            r26 = 458752(0x70000, float:6.42848E-40)
            if (r25 == 0) goto L_0x009f
            r11 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r11
            r15 = r34
            goto L_0x00b1
        L_0x009f:
            r11 = r7 & r26
            r15 = r34
            if (r11 != 0) goto L_0x00b1
            boolean r11 = r3.mo15006n0(r15)
            if (r11 == 0) goto L_0x00ae
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r4 = r4 | r11
        L_0x00b1:
            r11 = 374491(0x5b6db, float:5.24774E-40)
            r11 = r11 & r4
            r12 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r12) goto L_0x00c9
            boolean r11 = r3.mo15011p()
            if (r11 != 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            r3.mo14958a0()
            r5 = r6
            r4 = r9
            r6 = r15
            goto L_0x01b9
        L_0x00c9:
            r3.mo14930Q()
            r11 = r7 & 1
            r27 = -57345(0xffffffffffff1fff, float:NaN)
            if (r11 == 0) goto L_0x00ea
            boolean r11 = r3.mo14977f0()
            if (r11 == 0) goto L_0x00da
            goto L_0x00ea
        L_0x00da:
            r3.mo14958a0()
            r5 = r37 & 16
            if (r5 == 0) goto L_0x00e3
            r4 = r4 & r27
        L_0x00e3:
            r8 = r4
            r5 = r6
            r6 = r9
            r4 = r10
            r17 = r15
            goto L_0x0145
        L_0x00ea:
            if (r5 == 0) goto L_0x00ef
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00f0
        L_0x00ef:
            r5 = r6
        L_0x00f0:
            if (r8 == 0) goto L_0x00f4
            r6 = 1
            goto L_0x00f5
        L_0x00f4:
            r6 = r9
        L_0x00f5:
            r8 = r37 & 16
            if (r8 == 0) goto L_0x011a
            androidx.compose.material3.v r8 = androidx.compose.material3.C8358v.f22436a
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 1572864(0x180000, float:2.204052E-39)
            r23 = 63
            r15 = r16
            r17 = r18
            r19 = r20
            r21 = r3
            androidx.compose.material3.u r8 = r8.mo14734a(r9, r11, r13, r15, r17, r19, r21, r22, r23)
            r4 = r4 & r27
            goto L_0x011b
        L_0x011a:
            r8 = r10
        L_0x011b:
            if (r25 == 0) goto L_0x013e
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r9)
            java.lang.Object r9 = r3.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r9 != r10) goto L_0x0136
            androidx.compose.foundation.interaction.g r9 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r3.mo14893C(r9)
        L_0x0136:
            r3.mo15002m0()
            androidx.compose.foundation.interaction.g r9 = (androidx.compose.foundation.interaction.C2243g) r9
            r17 = r9
            goto L_0x0140
        L_0x013e:
            r17 = r34
        L_0x0140:
            r28 = r8
            r8 = r4
            r4 = r28
        L_0x0145:
            r3.mo14899E()
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0154
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.Checkbox (Checkbox.kt:87)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r9, r10)
        L_0x0154:
            androidx.compose.ui.state.ToggleableState r0 = androidx.compose.p004ui.state.C16046a.m72186a(r29)
            r9 = 1557792622(0x5cda076e, float:4.90957712E17)
            r3.mo14918M(r9)
            if (r2 == 0) goto L_0x0190
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r29)
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.mo14918M(r10)
            boolean r10 = r3.mo15006n0(r2)
            boolean r9 = r3.mo15006n0(r9)
            r9 = r9 | r10
            java.lang.Object r10 = r3.mo14921N()
            if (r9 != 0) goto L_0x0181
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r10 != r9) goto L_0x0189
        L_0x0181:
            androidx.compose.material3.CheckboxKt$Checkbox$2$1 r10 = new androidx.compose.material3.CheckboxKt$Checkbox$2$1
            r10.<init>(r2, r1)
            r3.mo14893C(r10)
        L_0x0189:
            r3.mo15002m0()
            kotlin.jvm.functions.a r10 = (kotlin.jvm.functions.C11289a) r10
            r9 = r10
            goto L_0x0191
        L_0x0190:
            r9 = 0
        L_0x0191:
            r3.mo15002m0()
            r10 = r8 & 896(0x380, float:1.256E-42)
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = r8 & r24
            r10 = r10 | r11
            r8 = r8 & r26
            r15 = r10 | r8
            r16 = 0
            r8 = r0
            r10 = r5
            r11 = r6
            r12 = r4
            r13 = r17
            r14 = r3
            m25479c(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01b5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01b5:
            r10 = r4
            r4 = r6
            r6 = r17
        L_0x01b9:
            androidx.compose.runtime.t1 r9 = r3.mo15020s()
            if (r9 != 0) goto L_0x01c0
            goto L_0x01d3
        L_0x01c0:
            androidx.compose.material3.CheckboxKt$Checkbox$3 r11 = new androidx.compose.material3.CheckboxKt$Checkbox$3
            r0 = r11
            r1 = r29
            r2 = r30
            r3 = r5
            r5 = r10
            r7 = r36
            r8 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r11)
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.m25477a(boolean, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, androidx.compose.material3.u, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v42, resolved type: androidx.compose.material3.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: androidx.compose.material3.t} */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0286, code lost:
        if (r6 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0288;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0270 A[LOOP:0: B:106:0x026e->B:107:0x0270, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01cf  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25478b(boolean r34, androidx.compose.p004ui.state.ToggleableState r35, androidx.compose.p004ui.C8767m r36, androidx.compose.material3.C8353u r37, androidx.compose.runtime.C8592o r38, int r39) {
        /*
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r39
            r0 = 2007131616(0x77a265e0, float:6.5876434E33)
            r6 = r38
            androidx.compose.runtime.o r14 = r6.mo15009o(r0)
            r6 = r5 & 14
            r13 = 2
            if (r6 != 0) goto L_0x0023
            boolean r6 = r14.mo14961b(r1)
            if (r6 == 0) goto L_0x0020
            r6 = 4
            goto L_0x0021
        L_0x0020:
            r6 = r13
        L_0x0021:
            r6 = r6 | r5
            goto L_0x0024
        L_0x0023:
            r6 = r5
        L_0x0024:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0034
            boolean r7 = r14.mo15006n0(r2)
            if (r7 == 0) goto L_0x0031
            r7 = 32
            goto L_0x0033
        L_0x0031:
            r7 = 16
        L_0x0033:
            r6 = r6 | r7
        L_0x0034:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0044
            boolean r7 = r14.mo15006n0(r3)
            if (r7 == 0) goto L_0x0041
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0054
            boolean r7 = r14.mo15006n0(r4)
            if (r7 == 0) goto L_0x0051
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r6 = r6 | r7
        L_0x0054:
            r12 = r6
            r6 = r12 & 5851(0x16db, float:8.199E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0067
            boolean r6 = r14.mo15011p()
            if (r6 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r14.mo14958a0()
            goto L_0x02a4
        L_0x0067:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            r11 = -1
            if (r6 == 0) goto L_0x0073
            java.lang.String r6 = "androidx.compose.material3.CheckboxImpl (Checkbox.kt:229)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r12, r11, r6)
        L_0x0073:
            int r0 = r12 >> 3
            r10 = r0 & 14
            r9 = 0
            androidx.compose.animation.core.Transition r16 = androidx.compose.animation.core.TransitionKt.m8196o(r2, r9, r14, r10, r13)
            androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1 r6 = androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1.f19211f
            r8 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r14.mo14918M(r8)
            java.lang.String r17 = "FloatAnimation"
            kotlin.jvm.internal.x r18 = kotlin.jvm.internal.C11377x.f28521a
            androidx.compose.animation.core.a1 r19 = androidx.compose.animation.core.VectorConvertersKt.m8224i(r18)
            r7 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r14.mo14918M(r7)
            java.lang.Object r20 = r16.mo6700h()
            androidx.compose.ui.state.ToggleableState r20 = (androidx.compose.p004ui.state.ToggleableState) r20
            r7 = 1800065638(0x6b4ad266, float:2.451966E26)
            r14.mo14918M(r7)
            boolean r21 = androidx.compose.runtime.ComposerKt.m29813g0()
            java.lang.String r8 = "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:244)"
            r15 = 0
            if (r21 == 0) goto L_0x00aa
            androidx.compose.runtime.ComposerKt.m29845w0(r7, r15, r11, r8)
        L_0x00aa:
            int[] r21 = androidx.compose.material3.CheckboxKt.C7977a.$EnumSwitchMapping$0
            int r20 = r20.ordinal()
            r9 = r21[r20]
            r20 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r11 = 1
            r15 = 3
            if (r9 == r11) goto L_0x00c8
            if (r9 == r13) goto L_0x00c5
            if (r9 != r15) goto L_0x00bf
            goto L_0x00c8
        L_0x00bf:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00c5:
            r9 = r20
            goto L_0x00ca
        L_0x00c8:
            r9 = r23
        L_0x00ca:
            boolean r25 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r25 == 0) goto L_0x00d3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d3:
            r14.mo15002m0()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r25 = r16.mo6706o()
            androidx.compose.ui.state.ToggleableState r25 = (androidx.compose.p004ui.state.ToggleableState) r25
            r14.mo14918M(r7)
            boolean r26 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r26 == 0) goto L_0x00ef
            r13 = 0
            r15 = -1
            androidx.compose.runtime.ComposerKt.m29845w0(r7, r13, r15, r8)
            goto L_0x00f0
        L_0x00ef:
            r15 = -1
        L_0x00f0:
            int r7 = r25.ordinal()
            r7 = r21[r7]
            if (r7 == r11) goto L_0x0108
            r13 = 2
            if (r7 == r13) goto L_0x0105
            r8 = 3
            if (r7 != r8) goto L_0x00ff
            goto L_0x0109
        L_0x00ff:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0105:
            r7 = r20
            goto L_0x010b
        L_0x0108:
            r13 = 2
        L_0x0109:
            r7 = r23
        L_0x010b:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0114
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0114:
            r14.mo15002m0()
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            androidx.compose.animation.core.Transition$b r7 = r16.mo6704m()
            r24 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r24)
            java.lang.Object r6 = r6.invoke(r7, r14, r11)
            r11 = r6
            androidx.compose.animation.core.d0 r11 = (androidx.compose.animation.core.C1956d0) r11
            r24 = 0
            r6 = r16
            r15 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r7 = r9
            r9 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r15 = r9
            r9 = r11
            r22 = r10
            r10 = r19
            r11 = r17
            r17 = r12
            r12 = r14
            r13 = r24
            androidx.compose.runtime.k2 r31 = androidx.compose.animation.core.TransitionKt.m8194m(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.mo15002m0()
            r14.mo15002m0()
            androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 r6 = androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1.f19210f
            r14.mo14918M(r15)
            java.lang.String r11 = "FloatAnimation"
            androidx.compose.animation.core.a1 r10 = androidx.compose.animation.core.VectorConvertersKt.m8224i(r18)
            r7 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r14.mo14918M(r7)
            java.lang.Object r7 = r16.mo6700h()
            androidx.compose.ui.state.ToggleableState r7 = (androidx.compose.p004ui.state.ToggleableState) r7
            r8 = -1426969489(0xffffffffaaf22c6f, float:-4.3018668E-13)
            r14.mo14918M(r8)
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            java.lang.String r12 = "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:260)"
            if (r9 == 0) goto L_0x0179
            r9 = -1
            r13 = 0
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r13, r9, r12)
            goto L_0x017a
        L_0x0179:
            r9 = -1
        L_0x017a:
            int r7 = r7.ordinal()
            r7 = r21[r7]
            r15 = 1
            if (r7 == r15) goto L_0x0192
            r13 = 2
            if (r7 == r13) goto L_0x0192
            r13 = 3
            if (r7 != r13) goto L_0x018c
            r7 = r23
            goto L_0x0194
        L_0x018c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0192:
            r7 = r20
        L_0x0194:
            boolean r13 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r13 == 0) goto L_0x019d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x019d:
            r14.mo15002m0()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r13 = r16.mo6706o()
            androidx.compose.ui.state.ToggleableState r13 = (androidx.compose.p004ui.state.ToggleableState) r13
            r14.mo14918M(r8)
            boolean r18 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r18 == 0) goto L_0x01b7
            r15 = 0
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r15, r9, r12)
        L_0x01b7:
            int r8 = r13.ordinal()
            r8 = r21[r8]
            r9 = 1
            if (r8 == r9) goto L_0x01cf
            r13 = 2
            if (r8 == r13) goto L_0x01d0
            r9 = 3
            if (r8 != r9) goto L_0x01c9
            r20 = r23
            goto L_0x01d0
        L_0x01c9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01cf:
            r13 = 2
        L_0x01d0:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x01d9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d9:
            r14.mo15002m0()
            java.lang.Float r8 = java.lang.Float.valueOf(r20)
            androidx.compose.animation.core.Transition$b r9 = r16.mo6704m()
            r12 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r6.invoke(r9, r14, r15)
            r9 = r6
            androidx.compose.animation.core.d0 r9 = (androidx.compose.animation.core.C1956d0) r9
            r6 = r16
            r12 = r14
            r15 = r13
            r13 = r24
            androidx.compose.runtime.k2 r32 = androidx.compose.animation.core.TransitionKt.m8194m(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.mo15002m0()
            r14.mo15002m0()
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo14918M(r6)
            java.lang.Object r6 = r14.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r6 != r7) goto L_0x0220
            androidx.compose.material3.t r6 = new androidx.compose.material3.t
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 7
            r13 = 0
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r14.mo14893C(r6)
        L_0x0220:
            r14.mo15002m0()
            r33 = r6
            androidx.compose.material3.t r33 = (androidx.compose.material3.C8281t) r33
            int r6 = r17 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r22 | r6
            androidx.compose.runtime.k2 r30 = r4.mo14716c(r2, r14, r6)
            r6 = r17 & 14
            r7 = r17 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            androidx.compose.runtime.k2 r28 = r4.mo14715b(r1, r2, r14, r0)
            androidx.compose.runtime.k2 r29 = r4.mo14714a(r1, r2, r14, r0)
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r0 = r0.mo17066i()
            r6 = 0
            r7 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10098N(r3, r0, r7, r15, r6)
            float r6 = f19207e
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10121u(r0, r6)
            r6 = 6
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r7] = r28
            r7 = 1
            r8[r7] = r29
            r8[r15] = r30
            r7 = 3
            r8[r7] = r31
            r7 = 4
            r8[r7] = r32
            r7 = 5
            r8[r7] = r33
            r7 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r14.mo14918M(r7)
            r7 = 0
            r13 = 0
        L_0x026e:
            if (r13 >= r6) goto L_0x027a
            r9 = r8[r13]
            boolean r9 = r14.mo15006n0(r9)
            r7 = r7 | r9
            int r13 = r13 + 1
            goto L_0x026e
        L_0x027a:
            java.lang.Object r6 = r14.mo14921N()
            if (r7 != 0) goto L_0x0288
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r6 != r7) goto L_0x0292
        L_0x0288:
            androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1 r6 = new androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1
            r27 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r14.mo14893C(r6)
        L_0x0292:
            r14.mo15002m0()
            kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
            r7 = 0
            androidx.compose.foundation.CanvasKt.m8873b(r0, r6, r14, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02a4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02a4:
            androidx.compose.runtime.t1 r6 = r14.mo15020s()
            if (r6 != 0) goto L_0x02ab
            goto L_0x02be
        L_0x02ab:
            androidx.compose.material3.CheckboxKt$CheckboxImpl$2 r7 = new androidx.compose.material3.CheckboxKt$CheckboxImpl$2
            r0 = r7
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r39
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x02be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.m25478b(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.m, androidx.compose.material3.u, androidx.compose.runtime.o, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a2  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25479c(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.state.ToggleableState r28, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r30, boolean r31, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8353u r32, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r7 = r28
            r8 = r29
            r9 = r35
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -1608358065(0xffffffffa022674f, float:-1.3756116E-19)
            r1 = r34
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r36 & 1
            r2 = 2
            if (r1 == 0) goto L_0x001c
            r1 = r9 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x002b
            boolean r1 = r6.mo15006n0(r7)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            r1 = r1 | r9
            goto L_0x002c
        L_0x002b:
            r1 = r9
        L_0x002c:
            r3 = r36 & 2
            if (r3 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x0043
        L_0x0033:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0043
            boolean r3 = r6.mo14927P(r8)
            if (r3 == 0) goto L_0x0040
            r3 = 32
            goto L_0x0042
        L_0x0040:
            r3 = 16
        L_0x0042:
            r1 = r1 | r3
        L_0x0043:
            r3 = r36 & 4
            if (r3 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005d
        L_0x004a:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x005d
            r4 = r30
            boolean r5 = r6.mo15006n0(r4)
            if (r5 == 0) goto L_0x0059
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r5
            goto L_0x005f
        L_0x005d:
            r4 = r30
        L_0x005f:
            r5 = r36 & 8
            if (r5 == 0) goto L_0x0066
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0066:
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0079
            r10 = r31
            boolean r11 = r6.mo14961b(r10)
            if (r11 == 0) goto L_0x0075
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r1 = r1 | r11
            goto L_0x007b
        L_0x0079:
            r10 = r31
        L_0x007b:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x0096
            r11 = r36 & 16
            if (r11 != 0) goto L_0x0090
            r11 = r32
            boolean r12 = r6.mo15006n0(r11)
            if (r12 == 0) goto L_0x0092
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0090:
            r11 = r32
        L_0x0092:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r1 = r1 | r12
            goto L_0x0098
        L_0x0096:
            r11 = r32
        L_0x0098:
            r26 = r36 & 32
            if (r26 == 0) goto L_0x00a2
            r12 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r12
            r15 = r33
            goto L_0x00b5
        L_0x00a2:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            r15 = r33
            if (r12 != 0) goto L_0x00b5
            boolean r12 = r6.mo15006n0(r15)
            if (r12 == 0) goto L_0x00b2
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r1 = r1 | r12
        L_0x00b5:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00cf
            boolean r12 = r6.mo15011p()
            if (r12 != 0) goto L_0x00c5
            goto L_0x00cf
        L_0x00c5:
            r6.mo14958a0()
            r3 = r4
            r4 = r10
            r5 = r11
            r10 = r6
            r6 = r15
            goto L_0x01ec
        L_0x00cf:
            r6.mo14930Q()
            r12 = r9 & 1
            r27 = -57345(0xffffffffffff1fff, float:NaN)
            if (r12 == 0) goto L_0x00f3
            boolean r12 = r6.mo14977f0()
            if (r12 == 0) goto L_0x00e0
            goto L_0x00f3
        L_0x00e0:
            r6.mo14958a0()
            r3 = r36 & 16
            if (r3 == 0) goto L_0x00e9
            r1 = r1 & r27
        L_0x00e9:
            r5 = r4
            r17 = r10
            r18 = r11
            r19 = r15
        L_0x00f0:
            r4 = r1
            goto L_0x0156
        L_0x00f3:
            if (r3 == 0) goto L_0x00f8
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00f9
        L_0x00f8:
            r3 = r4
        L_0x00f9:
            if (r5 == 0) goto L_0x00fd
            r4 = 1
            goto L_0x00fe
        L_0x00fd:
            r4 = r10
        L_0x00fe:
            r5 = r36 & 16
            if (r5 == 0) goto L_0x0125
            androidx.compose.material3.v r10 = androidx.compose.material3.C8358v.f22436a
            r11 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 63
            r15 = r16
            r17 = r18
            r19 = r20
            r21 = r22
            r23 = r6
            androidx.compose.material3.u r5 = r10.mo14734a(r11, r13, r15, r17, r19, r21, r23, r24, r25)
            r1 = r1 & r27
            r11 = r5
        L_0x0125:
            if (r26 == 0) goto L_0x014e
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r5)
            java.lang.Object r5 = r6.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r5 != r10) goto L_0x0140
            androidx.compose.foundation.interaction.g r5 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r6.mo14893C(r5)
        L_0x0140:
            r6.mo15002m0()
            androidx.compose.foundation.interaction.g r5 = (androidx.compose.foundation.interaction.C2243g) r5
            r17 = r4
            r19 = r5
            r18 = r11
            r4 = r1
            r5 = r3
            goto L_0x0156
        L_0x014e:
            r19 = r33
            r5 = r3
            r17 = r4
            r18 = r11
            goto L_0x00f0
        L_0x0156:
            r6.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0165
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r1, r3)
        L_0x0165:
            r0 = 1797978260(0x6b2af894, float:2.0669127E26)
            r6.mo14918M(r0)
            if (r8 == 0) goto L_0x01a2
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.semantics.g$a r1 = androidx.compose.p004ui.semantics.C16031g.f39793b
            int r1 = r1.mo46122b()
            r10 = 0
            androidx.compose.material3.tokens.d r3 = androidx.compose.material3.tokens.C8295d.f20875a
            float r3 = r3.mo13295F()
            float r2 = (float) r2
            float r3 = r3 / r2
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            r12 = 0
            r15 = 54
            r16 = 4
            r14 = r6
            androidx.compose.foundation.a0 r3 = androidx.compose.material.ripple.C7922j.m25285e(r10, r11, r12, r14, r15, r16)
            androidx.compose.ui.semantics.g r10 = androidx.compose.p004ui.semantics.C16031g.m72093h(r1)
            r1 = r28
            r2 = r19
            r11 = r4
            r4 = r17
            r12 = r5
            r5 = r10
            r10 = r6
            r6 = r29
            androidx.compose.ui.m r0 = androidx.compose.foundation.selection.ToggleableKt.m12069e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01a7
        L_0x01a2:
            r11 = r4
            r12 = r5
            r10 = r6
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
        L_0x01a7:
            r10.mo15002m0()
            if (r8 == 0) goto L_0x01b3
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r1 = androidx.compose.material3.InteractiveComponentSizeKt.m25834f(r1)
            goto L_0x01b5
        L_0x01b3:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
        L_0x01b5:
            androidx.compose.ui.m r1 = r12.mo17224k3(r1)
            androidx.compose.ui.m r0 = r1.mo17224k3(r0)
            float r1 = f19206d
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r1)
            int r0 = r11 >> 9
            r0 = r0 & 14
            int r1 = r11 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r11 >> 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r0 = r17
            r1 = r28
            r3 = r18
            r4 = r10
            m25478b(r0, r1, r2, r3, r4, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01e5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01e5:
            r3 = r12
            r4 = r17
            r5 = r18
            r6 = r19
        L_0x01ec:
            androidx.compose.runtime.t1 r10 = r10.mo15020s()
            if (r10 != 0) goto L_0x01f3
            goto L_0x0204
        L_0x01f3:
            androidx.compose.material3.CheckboxKt$TriStateCheckbox$2 r11 = new androidx.compose.material3.CheckboxKt$TriStateCheckbox$2
            r0 = r11
            r1 = r28
            r2 = r29
            r7 = r35
            r8 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.mo15202a(r11)
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.m25479c(androidx.compose.ui.state.ToggleableState, kotlin.jvm.functions.a, androidx.compose.ui.m, boolean, androidx.compose.material3.u, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: i */
    public static final void m25485i(C15187e eVar, long j, long j2, float f, float f2) {
        float f3 = f;
        float f4 = f2;
        float f5 = f4 / 2.0f;
        C15198m mVar = new C15198m(f2, 0.0f, 0, 0, (C15242j3) null, 30, (DefaultConstructorMarker) null);
        float t = C15104m.m65023t(eVar.mo42718b());
        if (C15240j2.m66082y(j, j2)) {
            C15187e.m65706b6(eVar, j, 0, C15106n.m65033a(t, t), C15090b.m64846b(f3, 0.0f, 2, (Object) null), C15197l.f37504a, 0.0f, (C15249k2) null, 0, 226, (Object) null);
            return;
        }
        float f6 = t - (((float) 2) * f4);
        C15187e.m65706b6(eVar, j, C15096g.m64898a(f4, f4), C15106n.m65033a(f6, f6), C15090b.m64846b(Math.max(0.0f, f3 - f4), 0.0f, 2, (Object) null), C15197l.f37504a, 0.0f, (C15249k2) null, 0, 224, (Object) null);
        float f7 = t - f4;
        C15187e.m65706b6(eVar, j2, C15096g.m64898a(f5, f5), C15106n.m65033a(f7, f7), C15090b.m64846b(f3 - f5, 0.0f, 2, (Object) null), mVar, 0.0f, (C15249k2) null, 0, 224, (Object) null);
    }

    /* renamed from: j */
    public static final void m25486j(C15187e eVar, long j, float f, float f2, float f3, C8281t tVar) {
        float f4 = f2;
        C15198m mVar = new C15198m(f3, 0.0f, C15244j4.f37564b.mo42864c(), 0, (C15242j3) null, 26, (DefaultConstructorMarker) null);
        float t = C15104m.m65023t(eVar.mo42718b());
        float a = C16515d.m74781a(0.4f, 0.5f, f2);
        float a2 = C16515d.m74781a(0.7f, 0.5f, f2);
        float a3 = C16515d.m74781a(0.5f, 0.5f, f2);
        float a4 = C16515d.m74781a(0.3f, 0.5f, f2);
        tVar.mo13001a().reset();
        tVar.mo13001a().mo42815p(0.2f * t, a3 * t);
        tVar.mo13001a().mo42823w(a * t, a2 * t);
        tVar.mo13001a().mo42823w(0.8f * t, t * a4);
        tVar.mo13002b().mo42884c(tVar.mo13001a(), false);
        tVar.mo13003c().reset();
        tVar.mo13002b().mo42883b(0.0f, tVar.mo13002b().mo42886f() * f, tVar.mo13003c(), true);
        C15187e.m65698O1(eVar, tVar.mo13003c(), j, 0.0f, mVar, (C15249k2) null, 0, 52, (Object) null);
    }
}
