package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,713:1\n50#2:714\n49#2:715\n50#2:722\n49#2:723\n25#2:734\n25#2:749\n36#2:761\n50#2:768\n49#2:769\n50#2:776\n49#2:777\n36#2:784\n50#2:791\n49#2:792\n50#2:799\n49#2:800\n1114#3,6:716\n1114#3,6:724\n1114#3,3:735\n1117#3,3:741\n1114#3,3:750\n1117#3,3:756\n1114#3,6:762\n1114#3,6:770\n1114#3,6:778\n1114#3,6:785\n1114#3,6:793\n1114#3,6:801\n474#4,4:730\n478#4,2:738\n482#4:744\n474#4,4:745\n478#4,2:753\n482#4:759\n474#5:740\n474#5:755\n646#6:760\n76#7:807\n154#8:808\n154#8:809\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n*L\n333#1:714\n333#1:715\n350#1:722\n350#1:723\n398#1:734\n532#1:749\n656#1:761\n659#1:768\n659#1:769\n671#1:776\n671#1:777\n687#1:784\n688#1:791\n688#1:792\n700#1:799\n700#1:800\n333#1:716,6\n350#1:724,6\n398#1:735,3\n398#1:741,3\n532#1:750,3\n532#1:756,3\n656#1:762,6\n659#1:770,6\n671#1:778,6\n687#1:785,6\n688#1:793,6\n700#1:801,6\n398#1:730,4\n398#1:738,2\n398#1:744\n532#1:745,4\n532#1:753,2\n532#1:759\n398#1:740\n532#1:755\n648#1:760\n649#1:807\n705#1:808\n706#1:809\n*E\n"})
public final class DrawerKt {

    /* renamed from: a */
    public static final float f7644a = C16483g.m74435M((float) 56);

    /* renamed from: b */
    public static final float f7645b = C16483g.m74435M((float) 400);
    @C12579k

    /* renamed from: c */
    public static final C2023z0<Float> f7646c = new C2023z0(256, 0, (C2022z) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final float f7647d = 0.5f;

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011e  */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13433a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r35, @org.jetbrains.annotations.C12580l androidx.compose.material.BottomDrawerState r36, boolean r37, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r38, float r39, long r40, long r42, long r44, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r46, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r47, int r48, int r49) {
        /*
            r15 = r34
            r14 = r46
            r13 = r48
            r12 = r49
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 625649286(0x254aa686, float:1.7577127E-16)
            r1 = r47
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r10.mo14927P(r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004c
            r4 = r35
            boolean r5 = r10.mo15006n0(r4)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r1 = r1 | r5
            goto L_0x004e
        L_0x004c:
            r4 = r35
        L_0x004e:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r12 & 4
            if (r5 != 0) goto L_0x0061
            r5 = r36
            boolean r6 = r10.mo15006n0(r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r5 = r36
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r36
        L_0x0069:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r37
            boolean r8 = r10.mo14961b(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r37
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00a0
            r8 = r12 & 16
            if (r8 != 0) goto L_0x009a
            r8 = r38
            boolean r9 = r10.mo15006n0(r8)
            if (r9 == 0) goto L_0x009c
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r8 = r38
        L_0x009c:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r9
            goto L_0x00a2
        L_0x00a0:
            r8 = r38
        L_0x00a2:
            r9 = r12 & 32
            if (r9 == 0) goto L_0x00aa
            r11 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r11
            goto L_0x00bf
        L_0x00aa:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r13
            if (r11 != 0) goto L_0x00bf
            r11 = r39
            boolean r16 = r10.mo14968d(r11)
            if (r16 == 0) goto L_0x00ba
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r1 = r1 | r16
            goto L_0x00c1
        L_0x00bf:
            r11 = r39
        L_0x00c1:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00e1
            r16 = r12 & 64
            if (r16 != 0) goto L_0x00d8
            r16 = r3
            r2 = r40
            boolean r17 = r10.mo14980g(r2)
            if (r17 == 0) goto L_0x00dc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00d8:
            r16 = r3
            r2 = r40
        L_0x00dc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r17
            goto L_0x00e5
        L_0x00e1:
            r16 = r3
            r2 = r40
        L_0x00e5:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00fe
            r0 = r12 & 128(0x80, float:1.794E-43)
            r2 = r42
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r10.mo14980g(r2)
            if (r0 == 0) goto L_0x00fa
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r0
            goto L_0x0100
        L_0x00fe:
            r2 = r42
        L_0x0100:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0118
            r0 = r12 & 256(0x100, float:3.59E-43)
            r2 = r44
            if (r0 != 0) goto L_0x0114
            boolean r0 = r10.mo14980g(r2)
            if (r0 == 0) goto L_0x0114
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r1 = r1 | r0
            goto L_0x011a
        L_0x0118:
            r2 = r44
        L_0x011a:
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0122
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0120:
            r1 = r1 | r0
            goto L_0x0133
        L_0x0122:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0133
            boolean r0 = r10.mo14927P(r14)
            if (r0 == 0) goto L_0x0130
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0120
        L_0x0130:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0120
        L_0x0133:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r1
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x0154
            boolean r0 = r10.mo15011p()
            if (r0 != 0) goto L_0x0143
            goto L_0x0154
        L_0x0143:
            r10.mo14958a0()
            r2 = r4
            r3 = r5
            r4 = r7
            r5 = r8
            r1 = r10
            r6 = r11
            r7 = r40
            r9 = r42
            r11 = r44
            goto L_0x02e3
        L_0x0154:
            r10.mo14930Q()
            r0 = r13 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r10.mo14977f0()
            if (r0 == 0) goto L_0x016b
            goto L_0x01b1
        L_0x016b:
            r10.mo14958a0()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0174
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0174:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x017a
            r1 = r1 & r19
        L_0x017a:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0180
            r1 = r1 & r18
        L_0x0180:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0185
            r1 = r1 & r3
        L_0x0185:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x019f
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r1
            r23 = r40
            r25 = r42
            r27 = r44
            r18 = r5
            r19 = r7
            r20 = r8
            r22 = r11
            r11 = r4
            r4 = r0
            goto L_0x023c
        L_0x019f:
            r23 = r40
            r25 = r42
            r27 = r44
            r18 = r5
            r19 = r7
            r20 = r8
            r22 = r11
            r11 = r4
            r4 = r1
            goto L_0x023c
        L_0x01b1:
            if (r16 == 0) goto L_0x01b6
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01b7
        L_0x01b6:
            r0 = r4
        L_0x01b7:
            r4 = r12 & 4
            r2 = 6
            if (r4 == 0) goto L_0x01c7
            androidx.compose.material.BottomDrawerValue r4 = androidx.compose.material.BottomDrawerValue.Closed
            r3 = 2
            r5 = 0
            androidx.compose.material.BottomDrawerState r3 = m13446n(r4, r5, r10, r2, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01c8
        L_0x01c7:
            r3 = r5
        L_0x01c8:
            if (r6 == 0) goto L_0x01cb
            r7 = 1
        L_0x01cb:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x01dc
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.f1 r4 = r4.mo11076b(r10, r2)
            androidx.compose.foundation.shape.e r4 = r4.mo10756c()
            r1 = r1 & r19
            goto L_0x01dd
        L_0x01dc:
            r4 = r8
        L_0x01dd:
            if (r9 == 0) goto L_0x01e6
            androidx.compose.material.c0 r5 = androidx.compose.material.C3032c0.f8090a
            float r5 = r5.mo10725a()
            goto L_0x01e7
        L_0x01e6:
            r5 = r11
        L_0x01e7:
            r6 = r12 & 64
            if (r6 == 0) goto L_0x01f8
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r6 = r6.mo11075a(r10, r2)
            long r8 = r6.mo10975n()
            r1 = r1 & r18
            goto L_0x01fa
        L_0x01f8:
            r8 = r40
        L_0x01fa:
            r6 = r12 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x020b
            int r6 = r1 >> 18
            r6 = r6 & 14
            long r18 = androidx.compose.material.ColorsKt.m13381b(r8, r10, r6)
            r6 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r6
            goto L_0x020d
        L_0x020b:
            r18 = r42
        L_0x020d:
            r6 = r12 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x022c
            androidx.compose.material.c0 r6 = androidx.compose.material.C3032c0.f8090a
            long r22 = r6.mo10726b(r10, r2)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r2
            r11 = r0
            r20 = r4
            r25 = r18
            r27 = r22
            r4 = r1
            r18 = r3
            r22 = r5
            r19 = r7
            r23 = r8
            goto L_0x023c
        L_0x022c:
            r27 = r44
            r11 = r0
            r20 = r4
            r22 = r5
            r23 = r8
            r25 = r18
            r4 = r1
            r18 = r3
            r19 = r7
        L_0x023c:
            r10.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x024e
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.BottomDrawer (Drawer.kt:519)"
            r2 = 625649286(0x254aa686, float:1.7577127E-16)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r4, r0, r1)
        L_0x024e:
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r10.mo14918M(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r0)
            java.lang.Object r0 = r10.mo14921N()
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x0275
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r0 = androidx.compose.runtime.EffectsKt.m29901m(r0, r10)
            androidx.compose.runtime.w r1 = new androidx.compose.runtime.w
            r1.<init>(r0)
            r10.mo14893C(r1)
            r0 = r1
        L_0x0275:
            r10.mo15002m0()
            androidx.compose.runtime.w r0 = (androidx.compose.runtime.C8690w) r0
            kotlinx.coroutines.o0 r17 = r0.mo16831a()
            r10.mo15002m0()
            r0 = 0
            r1 = 0
            r2 = 1
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10112l(r11, r0, r2, r1)
            r21 = 0
            r29 = 0
            androidx.compose.material.DrawerKt$BottomDrawer$1 r8 = new androidx.compose.material.DrawerKt$BottomDrawer$1
            r0 = r8
            r1 = r19
            r9 = r2
            r2 = r18
            r3 = r46
            r5 = r27
            r7 = r20
            r15 = r8
            r8 = r23
            r30 = r10
            r31 = r11
            r10 = r25
            r12 = r22
            r13 = r17
            r14 = r34
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r10, r12, r13, r14)
            r0 = 1220102512(0x48b94970, float:379467.5)
            r1 = r30
            r2 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r0, r2, r15)
            r2 = 3072(0xc00, float:4.305E-42)
            r3 = 6
            r35 = r16
            r36 = r21
            r37 = r29
            r38 = r0
            r39 = r1
            r40 = r2
            r41 = r3
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m9860a(r35, r36, r37, r38, r39, r40, r41)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02d3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02d3:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r23
            r9 = r25
            r11 = r27
            r2 = r31
        L_0x02e3:
            androidx.compose.runtime.t1 r15 = r1.mo15020s()
            if (r15 != 0) goto L_0x02ea
            goto L_0x0303
        L_0x02ea:
            androidx.compose.material.DrawerKt$BottomDrawer$2 r14 = new androidx.compose.material.DrawerKt$BottomDrawer$2
            r0 = r14
            r1 = r34
            r13 = r46
            r32 = r14
            r14 = r48
            r33 = r15
            r15 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r1 = r32
            r0 = r33
            r0.mo15202a(r1)
        L_0x0303:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m13433a(kotlin.jvm.functions.q, androidx.compose.ui.m, androidx.compose.material.BottomDrawerState, boolean, androidx.compose.ui.graphics.g4, float, long, long, long, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m13434b(long j, C11289a<C11079d2> aVar, boolean z, C8592o oVar, int i) {
        int i2;
        boolean z2;
        float f;
        C8767m mVar;
        int i3;
        int i4;
        int i5;
        long j2 = j;
        C11289a<C11079d2> aVar2 = aVar;
        boolean z3 = z;
        int i6 = i;
        C8592o o = oVar.mo15009o(-513067266);
        if ((i6 & 14) == 0) {
            if (o.mo14980g(j2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14961b(z3)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-513067266, i2, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:642)");
            }
            if (j2 != C15240j2.f37547b.mo42851u()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                C8578k2 f2 = AnimateAsStateKt.m7972f(f, new C2023z0(0, 0, (C2022z) null, 7, (DefaultConstructorMarker) null), 0.0f, (C11300l) null, o, 48, 12);
                String a = C7879l1.m25061a(C7875k1.f18863b.mo10861a(), o, 6);
                o.mo14918M(-1298948652);
                if (z3) {
                    C8767m.C8768a aVar3 = C8767m.f23478j;
                    o.mo14918M(1157296644);
                    boolean n0 = o.mo15006n0(aVar2);
                    Object N = o.mo14921N();
                    if (n0 || N == C8592o.f23032a.mo16277a()) {
                        N = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(aVar2, (C11045c<? super DrawerKt$BottomDrawerScrim$dismissModifier$1$1>) null);
                        o.mo14893C(N);
                    }
                    o.mo15002m0();
                    C8767m c = SuspendingPointerInputFilterKt.m68437c(aVar3, aVar2, (C11304p) N);
                    o.mo14918M(511388516);
                    boolean n02 = o.mo15006n0(a) | o.mo15006n0(aVar2);
                    Object N2 = o.mo14921N();
                    if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                        N2 = new DrawerKt$BottomDrawerScrim$dismissModifier$2$1(a, aVar2);
                        o.mo14893C(N2);
                    }
                    o.mo15002m0();
                    mVar = SemanticsModifierKt.m71867b(c, true, (C11300l) N2);
                } else {
                    mVar = C8767m.f23478j;
                }
                o.mo15002m0();
                C8767m k3 = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null).mo17224k3(mVar);
                C15240j2 n = C15240j2.m66071n(j);
                o.mo14918M(511388516);
                boolean n03 = o.mo15006n0(n) | o.mo15006n0(f2);
                Object N3 = o.mo14921N();
                if (n03 || N3 == C8592o.f23032a.mo16277a()) {
                    N3 = new DrawerKt$BottomDrawerScrim$1$1(j2, f2);
                    o.mo14893C(N3);
                }
                o.mo15002m0();
                CanvasKt.m8873b(k3, (C11300l) N3, o, 0);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DrawerKt$BottomDrawerScrim$2(j, aVar, z, i));
        }
    }

    /* renamed from: c */
    public static final float m13435c(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011e  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13436d(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r36, @org.jetbrains.annotations.C12580l androidx.compose.material.DrawerState r37, boolean r38, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r39, float r40, long r41, long r43, long r45, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r47, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r48, int r49, int r50) {
        /*
            r15 = r35
            r14 = r47
            r13 = r49
            r12 = r50
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 1305806945(0x4dd50861, float:4.46762016E8)
            r1 = r48
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.mo14927P(r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004c
            r4 = r36
            boolean r5 = r11.mo15006n0(r4)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r1 = r1 | r5
            goto L_0x004e
        L_0x004c:
            r4 = r36
        L_0x004e:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r12 & 4
            if (r5 != 0) goto L_0x0061
            r5 = r37
            boolean r6 = r11.mo15006n0(r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r5 = r37
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r37
        L_0x0069:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r38
            boolean r8 = r11.mo14961b(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r38
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00a0
            r8 = r12 & 16
            if (r8 != 0) goto L_0x009a
            r8 = r39
            boolean r9 = r11.mo15006n0(r8)
            if (r9 == 0) goto L_0x009c
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r8 = r39
        L_0x009c:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r9
            goto L_0x00a2
        L_0x00a0:
            r8 = r39
        L_0x00a2:
            r9 = r12 & 32
            if (r9 == 0) goto L_0x00aa
            r10 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r10
            goto L_0x00bf
        L_0x00aa:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r13
            if (r10 != 0) goto L_0x00bf
            r10 = r40
            boolean r16 = r11.mo14968d(r10)
            if (r16 == 0) goto L_0x00ba
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r1 = r1 | r16
            goto L_0x00c1
        L_0x00bf:
            r10 = r40
        L_0x00c1:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00e1
            r16 = r12 & 64
            if (r16 != 0) goto L_0x00d8
            r16 = r3
            r2 = r41
            boolean r17 = r11.mo14980g(r2)
            if (r17 == 0) goto L_0x00dc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00d8:
            r16 = r3
            r2 = r41
        L_0x00dc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r17
            goto L_0x00e5
        L_0x00e1:
            r16 = r3
            r2 = r41
        L_0x00e5:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00fe
            r0 = r12 & 128(0x80, float:1.794E-43)
            r2 = r43
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r11.mo14980g(r2)
            if (r0 == 0) goto L_0x00fa
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r0
            goto L_0x0100
        L_0x00fe:
            r2 = r43
        L_0x0100:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0118
            r0 = r12 & 256(0x100, float:3.59E-43)
            r2 = r45
            if (r0 != 0) goto L_0x0114
            boolean r0 = r11.mo14980g(r2)
            if (r0 == 0) goto L_0x0114
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r1 = r1 | r0
            goto L_0x011a
        L_0x0118:
            r2 = r45
        L_0x011a:
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0122
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0120:
            r1 = r1 | r0
            goto L_0x0133
        L_0x0122:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0133
            boolean r0 = r11.mo14927P(r14)
            if (r0 == 0) goto L_0x0130
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0120
        L_0x0130:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0120
        L_0x0133:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r1
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x0154
            boolean r0 = r11.mo15011p()
            if (r0 != 0) goto L_0x0143
            goto L_0x0154
        L_0x0143:
            r11.mo14958a0()
            r2 = r4
            r3 = r5
            r4 = r7
            r5 = r8
            r6 = r10
            r1 = r11
            r7 = r41
            r9 = r43
            r11 = r45
            goto L_0x02db
        L_0x0154:
            r11.mo14930Q()
            r0 = r13 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x01a7
            boolean r0 = r11.mo14977f0()
            if (r0 == 0) goto L_0x016b
            goto L_0x01a7
        L_0x016b:
            r11.mo14958a0()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0174
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0174:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x017a
            r1 = r1 & r19
        L_0x017a:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0180
            r1 = r1 & r18
        L_0x0180:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0185
            r1 = r1 & r3
        L_0x0185:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0195
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r1
            r23 = r41
            r25 = r43
            r27 = r45
            r3 = r0
            goto L_0x019c
        L_0x0195:
            r23 = r41
            r25 = r43
            r27 = r45
            r3 = r1
        L_0x019c:
            r9 = r4
            r18 = r5
            r19 = r7
            r20 = r8
            r22 = r10
            goto L_0x0231
        L_0x01a7:
            if (r16 == 0) goto L_0x01ac
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01ad
        L_0x01ac:
            r0 = r4
        L_0x01ad:
            r4 = r12 & 4
            r2 = 6
            if (r4 == 0) goto L_0x01bd
            androidx.compose.material.DrawerValue r4 = androidx.compose.material.DrawerValue.Closed
            r3 = 2
            r5 = 0
            androidx.compose.material.DrawerState r3 = m13447o(r4, r5, r11, r2, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01be
        L_0x01bd:
            r3 = r5
        L_0x01be:
            if (r6 == 0) goto L_0x01c1
            r7 = 1
        L_0x01c1:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x01d2
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.f1 r4 = r4.mo11076b(r11, r2)
            androidx.compose.foundation.shape.e r4 = r4.mo10756c()
            r1 = r1 & r19
            goto L_0x01d3
        L_0x01d2:
            r4 = r8
        L_0x01d3:
            if (r9 == 0) goto L_0x01dc
            androidx.compose.material.c0 r5 = androidx.compose.material.C3032c0.f8090a
            float r5 = r5.mo10725a()
            goto L_0x01dd
        L_0x01dc:
            r5 = r10
        L_0x01dd:
            r6 = r12 & 64
            if (r6 == 0) goto L_0x01ee
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r6 = r6.mo11075a(r11, r2)
            long r8 = r6.mo10975n()
            r1 = r1 & r18
            goto L_0x01f0
        L_0x01ee:
            r8 = r41
        L_0x01f0:
            r6 = r12 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0201
            int r6 = r1 >> 18
            r6 = r6 & 14
            long r18 = androidx.compose.material.ColorsKt.m13381b(r8, r11, r6)
            r6 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r6
            goto L_0x0203
        L_0x0201:
            r18 = r43
        L_0x0203:
            r6 = r12 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0221
            androidx.compose.material.c0 r6 = androidx.compose.material.C3032c0.f8090a
            long r22 = r6.mo10726b(r11, r2)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r2
            r20 = r4
            r25 = r18
            r27 = r22
            r18 = r3
            r22 = r5
            r19 = r7
            r23 = r8
            r9 = r0
            goto L_0x0230
        L_0x0221:
            r27 = r45
            r20 = r4
            r22 = r5
            r23 = r8
            r25 = r18
            r9 = r0
            r18 = r3
            r19 = r7
        L_0x0230:
            r3 = r1
        L_0x0231:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0243
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.ModalDrawer (Drawer.kt:385)"
            r2 = 1305806945(0x4dd50861, float:4.46762016E8)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r0, r1)
        L_0x0243:
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r11.mo14918M(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r0)
            java.lang.Object r0 = r11.mo14921N()
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x026a
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r0 = androidx.compose.runtime.EffectsKt.m29901m(r0, r11)
            androidx.compose.runtime.w r1 = new androidx.compose.runtime.w
            r1.<init>(r0)
            r11.mo14893C(r1)
            r0 = r1
        L_0x026a:
            r11.mo15002m0()
            androidx.compose.runtime.w r0 = (androidx.compose.runtime.C8690w) r0
            kotlinx.coroutines.o0 r17 = r0.mo16831a()
            r11.mo15002m0()
            r0 = 0
            r1 = 0
            r2 = 1
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10112l(r9, r0, r2, r1)
            r21 = 0
            r29 = 0
            androidx.compose.material.DrawerKt$ModalDrawer$1 r10 = new androidx.compose.material.DrawerKt$ModalDrawer$1
            r0 = r10
            r1 = r18
            r7 = r2
            r2 = r19
            r4 = r27
            r6 = r20
            r15 = r7
            r7 = r23
            r30 = r9
            r31 = r10
            r9 = r25
            r32 = r11
            r11 = r22
            r12 = r47
            r13 = r17
            r14 = r35
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r11, r12, r13, r14)
            r0 = 816674999(0x30ad78b7, float:1.2621716E-9)
            r2 = r31
            r1 = r32
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r0, r15, r2)
            r2 = 3072(0xc00, float:4.305E-42)
            r3 = 6
            r36 = r16
            r37 = r21
            r38 = r29
            r39 = r0
            r40 = r1
            r41 = r2
            r42 = r3
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m9860a(r36, r37, r38, r39, r40, r41, r42)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02cb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02cb:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r23
            r9 = r25
            r11 = r27
            r2 = r30
        L_0x02db:
            androidx.compose.runtime.t1 r15 = r1.mo15020s()
            if (r15 != 0) goto L_0x02e2
            goto L_0x02fb
        L_0x02e2:
            androidx.compose.material.DrawerKt$ModalDrawer$2 r14 = new androidx.compose.material.DrawerKt$ModalDrawer$2
            r0 = r14
            r1 = r35
            r13 = r47
            r33 = r14
            r14 = r49
            r34 = r15
            r15 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r1 = r33
            r0 = r34
            r0.mo15202a(r1)
        L_0x02fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m13436d(kotlin.jvm.functions.q, androidx.compose.ui.m, androidx.compose.material.DrawerState, boolean, androidx.compose.ui.graphics.g4, float, long, long, long, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m13437e(boolean z, C11289a<C11079d2> aVar, C11289a<Float> aVar2, long j, C8592o oVar, int i) {
        int i2;
        C8767m mVar;
        int i3;
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(1983403750);
        if ((i & 14) == 0) {
            if (o.mo14961b(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14927P(aVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (o.mo14927P(aVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (o.mo14980g(j)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1983403750, i2, -1, "androidx.compose.material.Scrim (Drawer.kt:677)");
            }
            String a = C7879l1.m25061a(C7875k1.f18863b.mo10861a(), o, 6);
            o.mo14918M(1010554804);
            if (z) {
                C8767m.C8768a aVar3 = C8767m.f23478j;
                o.mo14918M(1157296644);
                boolean n0 = o.mo15006n0(aVar);
                Object N = o.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new DrawerKt$Scrim$dismissDrawer$1$1(aVar, (C11045c<? super DrawerKt$Scrim$dismissDrawer$1$1>) null);
                    o.mo14893C(N);
                }
                o.mo15002m0();
                C8767m c = SuspendingPointerInputFilterKt.m68437c(aVar3, aVar, (C11304p) N);
                o.mo14918M(511388516);
                boolean n02 = o.mo15006n0(a) | o.mo15006n0(aVar);
                Object N2 = o.mo14921N();
                if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                    N2 = new DrawerKt$Scrim$dismissDrawer$2$1(a, aVar);
                    o.mo14893C(N2);
                }
                o.mo15002m0();
                mVar = SemanticsModifierKt.m71867b(c, true, (C11300l) N2);
            } else {
                mVar = C8767m.f23478j;
            }
            o.mo15002m0();
            C8767m k3 = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null).mo17224k3(mVar);
            C15240j2 n = C15240j2.m66071n(j);
            o.mo14918M(511388516);
            boolean n03 = o.mo15006n0(n) | o.mo15006n0(aVar2);
            Object N3 = o.mo14921N();
            if (n03 || N3 == C8592o.f23032a.mo16277a()) {
                N3 = new DrawerKt$Scrim$1$1(j, aVar2);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            CanvasKt.m8873b(k3, (C11300l) N3, o, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DrawerKt$Scrim$2(z, aVar, aVar2, j, i));
        }
    }

    /* renamed from: m */
    public static final float m13445m(float f, float f2, float f3) {
        return C11479u.m44331H((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material.BottomDrawerState m13446n(@org.jetbrains.annotations.C12579k androidx.compose.material.BottomDrawerValue r7, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.material.BottomDrawerValue, java.lang.Boolean> r8, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r9, int r10, int r11) {
        /*
            java.lang.String r0 = "initialValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -598115156(0xffffffffdc597cac, float:-2.44868592E17)
            r9.mo14918M(r0)
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0011
            androidx.compose.material.DrawerKt$rememberBottomDrawerState$1 r8 = androidx.compose.material.DrawerKt$rememberBottomDrawerState$1.f7648f
        L_0x0011:
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x001d
            r11 = -1
            java.lang.String r1 = "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:345)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r11, r1)
        L_0x001d:
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            androidx.compose.material.BottomDrawerState$Companion r10 = androidx.compose.material.BottomDrawerState.f7530t
            androidx.compose.runtime.saveable.e r1 = r10.mo10019a(r8)
            r2 = 0
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.mo14918M(r10)
            boolean r10 = r9.mo15006n0(r7)
            boolean r11 = r9.mo15006n0(r8)
            r10 = r10 | r11
            java.lang.Object r11 = r9.mo14921N()
            if (r10 != 0) goto L_0x0044
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r11 != r10) goto L_0x004c
        L_0x0044:
            androidx.compose.material.DrawerKt$rememberBottomDrawerState$2$1 r11 = new androidx.compose.material.DrawerKt$rememberBottomDrawerState$2$1
            r11.<init>(r7, r8)
            r9.mo14893C(r11)
        L_0x004c:
            r9.mo15002m0()
            r3 = r11
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r5 = 72
            r6 = 4
            r4 = r9
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.material.BottomDrawerState r7 = (androidx.compose.material.BottomDrawerState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0065:
            r9.mo15002m0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m13446n(androidx.compose.material.BottomDrawerValue, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):androidx.compose.material.BottomDrawerState");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material.DrawerState m13447o(@org.jetbrains.annotations.C12579k androidx.compose.material.DrawerValue r7, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.material.DrawerValue, java.lang.Boolean> r8, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r9, int r10, int r11) {
        /*
            java.lang.String r0 = "initialValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -1435874229(0xffffffffaa6a4c4b, float:-2.0809844E-13)
            r9.mo14918M(r0)
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0011
            androidx.compose.material.DrawerKt$rememberDrawerState$1 r8 = androidx.compose.material.DrawerKt$rememberDrawerState$1.f7649f
        L_0x0011:
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x001d
            r11 = -1
            java.lang.String r1 = "androidx.compose.material.rememberDrawerState (Drawer.kt:328)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r11, r1)
        L_0x001d:
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            androidx.compose.material.DrawerState$Companion r10 = androidx.compose.material.DrawerState.f7650b
            androidx.compose.runtime.saveable.e r1 = r10.mo10183a(r8)
            r2 = 0
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.mo14918M(r10)
            boolean r10 = r9.mo15006n0(r7)
            boolean r11 = r9.mo15006n0(r8)
            r10 = r10 | r11
            java.lang.Object r11 = r9.mo14921N()
            if (r10 != 0) goto L_0x0044
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r11 != r10) goto L_0x004c
        L_0x0044:
            androidx.compose.material.DrawerKt$rememberDrawerState$2$1 r11 = new androidx.compose.material.DrawerKt$rememberDrawerState$2$1
            r11.<init>(r7, r8)
            r9.mo14893C(r11)
        L_0x004c:
            r9.mo15002m0()
            r3 = r11
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r5 = 72
            r6 = 4
            r4 = r9
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.material.DrawerState r7 = (androidx.compose.material.DrawerState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0065:
            r9.mo15002m0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m13447o(androidx.compose.material.DrawerValue, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):androidx.compose.material.DrawerState");
    }
}
