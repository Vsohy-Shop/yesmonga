package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.C8336r0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 6 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,445:1\n76#2:446\n76#2:454\n76#2:462\n76#2:493\n76#2:523\n76#2:561\n25#3:447\n25#3:455\n25#3:463\n36#3:475\n456#3,11:505\n460#3,13:535\n473#3,3:549\n460#3,13:573\n473#3,3:587\n467#3,3:592\n1114#4,6:448\n1114#4,6:456\n1114#4,6:464\n1057#4,3:476\n1060#4,3:480\n66#5,5:470\n71#5:479\n74#5:483\n857#6,5:484\n71#7,4:489\n75#7,11:494\n75#7:522\n76#7,11:524\n89#7:552\n75#7:560\n76#7,11:562\n89#7:590\n88#7:595\n67#8,6:516\n73#8:548\n77#8:553\n67#8,6:554\n73#8:586\n77#8:591\n76#9:596\n154#10:597\n154#10:598\n154#10:599\n154#10:600\n154#10:601\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n*L\n100#1:446\n162#1:454\n232#1:462\n308#1:493\n311#1:523\n318#1:561\n102#1:447\n164#1:455\n234#1:463\n274#1:475\n308#1:505,11\n311#1:535,13\n311#1:549,3\n318#1:573,13\n318#1:587,3\n308#1:592,3\n102#1:448,6\n164#1:456,6\n234#1:464,6\n274#1:476,3\n274#1:480,3\n274#1:470,5\n274#1:479\n274#1:483\n274#1:484,5\n308#1:489,4\n308#1:494,11\n311#1:522\n311#1:524,11\n311#1:552\n318#1:560\n318#1:562,11\n318#1:590\n308#1:595\n311#1:516,6\n311#1:548\n311#1:553\n318#1:554,6\n318#1:586\n318#1:591\n274#1:596\n425#1:597\n433#1:598\n437#1:599\n440#1:600\n444#1:601\n*E\n"})
public final class TabKt {

    /* renamed from: a */
    public static final float f19817a = C8336r0.f21997a.mo14357n();

    /* renamed from: b */
    public static final float f19818b = C16483g.m74435M((float) 72);

    /* renamed from: c */
    public static final int f19819c = 150;

    /* renamed from: d */
    public static final int f19820d = 100;

    /* renamed from: e */
    public static final int f19821e = 100;

    /* renamed from: f */
    public static final float f19822f = C16483g.m74435M((float) 16);

    /* renamed from: g */
    public static final float f19823g = C16483g.m74435M((float) 14);

    /* renamed from: h */
    public static final float f19824h = C16483g.m74435M((float) 6);

    /* renamed from: i */
    public static final long f19825i = C16506u.m74712m(20);

    /* renamed from: j */
    public static final float f19826j = C16483g.m74435M((float) 8);

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0138  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26551a(boolean r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r28, boolean r29, long r30, long r32, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r36
            r14 = r37
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -777316544(0xffffffffd1ab1740, float:-9.1853685E10)
            r1 = r35
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r13 | 6
            r9 = r24
            goto L_0x003d
        L_0x002b:
            r1 = r13 & 14
            r9 = r24
            if (r1 != 0) goto L_0x003c
            boolean r1 = r15.mo14961b(r9)
            if (r1 == 0) goto L_0x0039
            r1 = 4
            goto L_0x003a
        L_0x0039:
            r1 = 2
        L_0x003a:
            r1 = r1 | r13
            goto L_0x003d
        L_0x003c:
            r1 = r13
        L_0x003d:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 48
            goto L_0x0054
        L_0x0044:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0054
            boolean r2 = r15.mo14927P(r10)
            if (r2 == 0) goto L_0x0051
            r2 = 32
            goto L_0x0053
        L_0x0051:
            r2 = 16
        L_0x0053:
            r1 = r1 | r2
        L_0x0054:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x005b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x005b:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006b
            boolean r2 = r15.mo14927P(r11)
            if (r2 == 0) goto L_0x0068
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r2
        L_0x006b:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x0072
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x0072:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0082
            boolean r2 = r15.mo14927P(r12)
            if (r2 == 0) goto L_0x007f
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r2
        L_0x0082:
            r2 = r14 & 16
            if (r2 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x0089:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x009e
            r3 = r28
            boolean r4 = r15.mo15006n0(r3)
            if (r4 == 0) goto L_0x009a
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r4
            goto L_0x00a0
        L_0x009e:
            r3 = r28
        L_0x00a0:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x00a8
            r5 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r5
            goto L_0x00bc
        L_0x00a8:
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r13
            if (r5 != 0) goto L_0x00bc
            r5 = r29
            boolean r6 = r15.mo14961b(r5)
            if (r6 == 0) goto L_0x00b8
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r6
            goto L_0x00be
        L_0x00bc:
            r5 = r29
        L_0x00be:
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00d8
            r6 = r14 & 64
            if (r6 != 0) goto L_0x00d2
            r6 = r30
            boolean r8 = r15.mo14980g(r6)
            if (r8 == 0) goto L_0x00d4
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d2:
            r6 = r30
        L_0x00d4:
            r8 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r1 = r1 | r8
            goto L_0x00da
        L_0x00d8:
            r6 = r30
        L_0x00da:
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00f5
            r8 = r14 & 128(0x80, float:1.794E-43)
            r35 = r1
            r0 = r32
            if (r8 != 0) goto L_0x00f0
            boolean r16 = r15.mo14980g(r0)
            if (r16 == 0) goto L_0x00f0
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r16 = r35 | r16
            goto L_0x00fb
        L_0x00f5:
            r35 = r1
            r0 = r32
            r16 = r35
        L_0x00fb:
            r8 = r14 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0106
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r16 = r16 | r17
            r0 = r34
            goto L_0x011b
        L_0x0106:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r17
            r0 = r34
            if (r17 != 0) goto L_0x011b
            boolean r1 = r15.mo15006n0(r0)
            if (r1 == 0) goto L_0x0117
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r1 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r16 = r16 | r1
        L_0x011b:
            r1 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r16 & r1
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x0138
            boolean r0 = r15.mo15011p()
            if (r0 != 0) goto L_0x012c
            goto L_0x0138
        L_0x012c:
            r15.mo14958a0()
            r9 = r32
            r11 = r34
            r7 = r6
            r6 = r5
            r5 = r3
            goto L_0x023f
        L_0x0138:
            r15.mo14930Q()
            r0 = r13 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = 1
            if (r0 == 0) goto L_0x0169
            boolean r0 = r15.mo14977f0()
            if (r0 == 0) goto L_0x014a
            goto L_0x0169
        L_0x014a:
            r15.mo14958a0()
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0153
            r16 = r16 & r17
        L_0x0153:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x015c
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r16 = r16 & r0
        L_0x015c:
            r20 = r32
            r22 = r34
            r17 = r5
            r18 = r6
            r8 = r16
            r16 = r3
            goto L_0x01c4
        L_0x0169:
            if (r2 == 0) goto L_0x016e
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r3 = r0
        L_0x016e:
            if (r4 == 0) goto L_0x0171
            r5 = r1
        L_0x0171:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0185
            androidx.compose.runtime.i1 r0 = androidx.compose.material3.ContentColorKt.m25558a()
            java.lang.Object r0 = r15.mo15032w(r0)
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r6 = r0.mo42833M()
            r16 = r16 & r17
        L_0x0185:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0191
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r16 & r0
            r16 = r6
            goto L_0x0195
        L_0x0191:
            r0 = r16
            r16 = r32
        L_0x0195:
            if (r8 == 0) goto L_0x01b9
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo14918M(r2)
            java.lang.Object r2 = r15.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r2 != r4) goto L_0x01b0
            androidx.compose.foundation.interaction.g r2 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r15.mo14893C(r2)
        L_0x01b0:
            r15.mo15002m0()
            androidx.compose.foundation.interaction.g r2 = (androidx.compose.foundation.interaction.C2243g) r2
            r8 = r0
            r22 = r2
            goto L_0x01bc
        L_0x01b9:
            r22 = r34
            r8 = r0
        L_0x01bc:
            r18 = r6
            r20 = r16
            r16 = r3
            r17 = r5
        L_0x01c4:
            r15.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01d6
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.LeadingIconTab (Tab.kt:154)"
            r3 = -777316544(0xffffffffd1ab1740, float:-9.1853685E10)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r8, r0, r2)
        L_0x01d6:
            r0 = 1
            r2 = 0
            int r3 = r8 >> 12
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | 6
            r4 = 2
            r28 = r0
            r29 = r2
            r30 = r18
            r32 = r15
            r33 = r3
            r34 = r4
            androidx.compose.foundation.a0 r4 = androidx.compose.material.ripple.C7922j.m25285e(r28, r29, r30, r32, r33, r34)
            androidx.compose.material3.TabKt$LeadingIconTab$2 r7 = new androidx.compose.material3.TabKt$LeadingIconTab$2
            r0 = r7
            r6 = r1
            r1 = r16
            r2 = r24
            r3 = r22
            r5 = r17
            r10 = r6
            r6 = r25
            r11 = r7
            r7 = r27
            r23 = r8
            r9 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -429037564(0xffffffffe66d6804, float:-2.802799E23)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r0, r10, r11)
            int r1 = r23 >> 18
            r2 = r1 & 14
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r23 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r28 = r18
            r30 = r20
            r32 = r24
            r33 = r0
            r34 = r15
            r35 = r1
            m26555e(r28, r30, r32, r33, r34, r35)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0235
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0235:
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r20
            r11 = r22
        L_0x023f:
            androidx.compose.runtime.t1 r15 = r15.mo15020s()
            if (r15 != 0) goto L_0x0246
            goto L_0x025c
        L_0x0246:
            androidx.compose.material3.TabKt$LeadingIconTab$3 r4 = new androidx.compose.material3.TabKt$LeadingIconTab$3
            r0 = r4
            r1 = r24
            r2 = r25
            r3 = r26
            r14 = r4
            r4 = r27
            r12 = r36
            r13 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r15.mo15202a(r14)
        L_0x025c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m26551a(boolean, kotlin.jvm.functions.a, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.ui.m, boolean, long, long, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0116  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26552b(boolean r23, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, boolean r26, long r27, long r29, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r9 = r24
            r10 = r32
            r11 = r34
            r12 = r35
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -202735880(0xfffffffff3ea7ef8, float:-3.715737E31)
            r1 = r33
            androidx.compose.runtime.o r13 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r11 | 6
            r14 = r23
            goto L_0x0036
        L_0x0024:
            r1 = r11 & 14
            r14 = r23
            if (r1 != 0) goto L_0x0035
            boolean r1 = r13.mo14961b(r14)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r11
            goto L_0x0036
        L_0x0035:
            r1 = r11
        L_0x0036:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 48
            goto L_0x004d
        L_0x003d:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004d
            boolean r2 = r13.mo14927P(r9)
            if (r2 == 0) goto L_0x004a
            r2 = 32
            goto L_0x004c
        L_0x004a:
            r2 = 16
        L_0x004c:
            r1 = r1 | r2
        L_0x004d:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0067
            r3 = r25
            boolean r4 = r13.mo15006n0(r3)
            if (r4 == 0) goto L_0x0063
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r4
            goto L_0x0069
        L_0x0067:
            r3 = r25
        L_0x0069:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0083
            r5 = r26
            boolean r6 = r13.mo14961b(r5)
            if (r6 == 0) goto L_0x007f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r6
            goto L_0x0085
        L_0x0083:
            r5 = r26
        L_0x0085:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x00a0
            r6 = r12 & 16
            if (r6 != 0) goto L_0x009a
            r6 = r27
            boolean r8 = r13.mo14980g(r6)
            if (r8 == 0) goto L_0x009c
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r6 = r27
        L_0x009c:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r8
            goto L_0x00a2
        L_0x00a0:
            r6 = r27
        L_0x00a2:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r11
            if (r8 != 0) goto L_0x00bd
            r8 = r12 & 32
            r33 = r1
            r0 = r29
            if (r8 != 0) goto L_0x00b8
            boolean r15 = r13.mo14980g(r0)
            if (r15 == 0) goto L_0x00b8
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r15 = r33 | r15
            goto L_0x00c3
        L_0x00bd:
            r33 = r1
            r0 = r29
            r15 = r33
        L_0x00c3:
            r16 = r12 & 64
            if (r16 == 0) goto L_0x00ce
            r17 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 | r17
            r8 = r31
            goto L_0x00e3
        L_0x00ce:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r11 & r17
            r8 = r31
            if (r17 != 0) goto L_0x00e3
            boolean r17 = r13.mo15006n0(r8)
            if (r17 == 0) goto L_0x00df
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e1
        L_0x00df:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e1:
            r15 = r15 | r17
        L_0x00e3:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00eb
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e9:
            r15 = r15 | r0
            goto L_0x00fc
        L_0x00eb:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r11
            if (r0 != 0) goto L_0x00fc
            boolean r0 = r13.mo14927P(r10)
            if (r0 == 0) goto L_0x00f9
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00f9:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e9
        L_0x00fc:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r15
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r1) goto L_0x0116
            boolean r0 = r13.mo15011p()
            if (r0 != 0) goto L_0x010c
            goto L_0x0116
        L_0x010c:
            r13.mo14958a0()
            r4 = r5
            r5 = r6
            r9 = r8
            r7 = r29
            goto L_0x0210
        L_0x0116:
            r13.mo14930Q()
            r0 = r11 & 1
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = 1
            if (r0 == 0) goto L_0x0144
            boolean r0 = r13.mo14977f0()
            if (r0 == 0) goto L_0x0128
            goto L_0x0144
        L_0x0128:
            r13.mo14958a0()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0131
            r15 = r15 & r17
        L_0x0131:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0139
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = r15 & r0
        L_0x0139:
            r19 = r29
            r16 = r5
            r17 = r6
            r21 = r8
            r8 = r15
            r15 = r3
            goto L_0x019d
        L_0x0144:
            if (r2 == 0) goto L_0x0149
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r3 = r0
        L_0x0149:
            if (r4 == 0) goto L_0x014c
            r5 = r1
        L_0x014c:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0160
            androidx.compose.runtime.i1 r0 = androidx.compose.material3.ContentColorKt.m25558a()
            java.lang.Object r0 = r13.mo15032w(r0)
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r6 = r0.mo42833M()
            r15 = r15 & r17
        L_0x0160:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x016c
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r15
            r15 = r0
            r17 = r6
            goto L_0x016e
        L_0x016c:
            r17 = r29
        L_0x016e:
            if (r16 == 0) goto L_0x0193
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo14918M(r0)
            java.lang.Object r0 = r13.mo14921N()
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r0 != r2) goto L_0x0189
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r13.mo14893C(r0)
        L_0x0189:
            r13.mo15002m0()
            androidx.compose.foundation.interaction.g r0 = (androidx.compose.foundation.interaction.C2243g) r0
            r21 = r0
            r16 = r5
            goto L_0x0197
        L_0x0193:
            r16 = r5
            r21 = r8
        L_0x0197:
            r8 = r15
            r19 = r17
            r15 = r3
            r17 = r6
        L_0x019d:
            r13.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01af
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.Tab (Tab.kt:226)"
            r3 = -202735880(0xfffffffff3ea7ef8, float:-3.715737E31)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r8, r0, r2)
        L_0x01af:
            r0 = 1
            r2 = 0
            int r3 = r8 >> 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | 6
            r4 = 2
            r25 = r0
            r26 = r2
            r27 = r17
            r29 = r13
            r30 = r3
            r31 = r4
            androidx.compose.foundation.a0 r4 = androidx.compose.material.ripple.C7922j.m25285e(r25, r26, r27, r29, r30, r31)
            androidx.compose.material3.TabKt$Tab$5 r7 = new androidx.compose.material3.TabKt$Tab$5
            r0 = r7
            r6 = r1
            r1 = r15
            r2 = r23
            r3 = r21
            r5 = r16
            r9 = r6
            r6 = r24
            r10 = r7
            r7 = r32
            r22 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -551896140(0xffffffffdf1abbb4, float:-1.1149703E19)
            androidx.compose.runtime.internal.a r6 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r0, r9, r10)
            int r0 = r22 >> 12
            r1 = r0 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r22 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r8 = r0 | r1
            r1 = r17
            r3 = r19
            r5 = r23
            r7 = r13
            m26555e(r1, r3, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0207
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0207:
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r19
            r9 = r21
        L_0x0210:
            androidx.compose.runtime.t1 r13 = r13.mo15020s()
            if (r13 != 0) goto L_0x0217
            goto L_0x022a
        L_0x0217:
            androidx.compose.material3.TabKt$Tab$6 r15 = new androidx.compose.material3.TabKt$Tab$6
            r0 = r15
            r1 = r23
            r2 = r24
            r10 = r32
            r11 = r34
            r12 = r35
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r13.mo15202a(r15)
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m26552b(boolean, kotlin.jvm.functions.a, androidx.compose.ui.m, boolean, long, long, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0138  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26553c(boolean r27, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r28, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r29, boolean r30, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r31, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, long r33, long r35, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r39
            r15 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -350627181(0xffffffffeb19da93, float:-1.8599784E26)
            r1 = r38
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r14 | 6
            r11 = r27
            goto L_0x002f
        L_0x001d:
            r1 = r14 & 14
            r11 = r27
            if (r1 != 0) goto L_0x002e
            boolean r1 = r12.mo14961b(r11)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r14
            goto L_0x002f
        L_0x002e:
            r1 = r14
        L_0x002f:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0046
        L_0x0036:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0046
            boolean r2 = r12.mo14927P(r13)
            if (r2 == 0) goto L_0x0043
            r2 = 32
            goto L_0x0045
        L_0x0043:
            r2 = 16
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x004d:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0060
            r3 = r29
            boolean r4 = r12.mo15006n0(r3)
            if (r4 == 0) goto L_0x005c
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r1 = r1 | r4
            goto L_0x0062
        L_0x0060:
            r3 = r29
        L_0x0062:
            r4 = r15 & 8
            if (r4 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007c
            r5 = r30
            boolean r6 = r12.mo14961b(r5)
            if (r6 == 0) goto L_0x0078
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r6
            goto L_0x007e
        L_0x007c:
            r5 = r30
        L_0x007e:
            r6 = r15 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0088:
            r8 = r14 & r7
            if (r8 != 0) goto L_0x009b
            r8 = r31
            boolean r9 = r12.mo14927P(r8)
            if (r9 == 0) goto L_0x0097
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r9
            goto L_0x009d
        L_0x009b:
            r8 = r31
        L_0x009d:
            r9 = r15 & 32
            r10 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00aa
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r10 = r32
            goto L_0x00bd
        L_0x00aa:
            r16 = r14 & r10
            r10 = r32
            if (r16 != 0) goto L_0x00bd
            boolean r16 = r12.mo14927P(r10)
            if (r16 == 0) goto L_0x00b9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r16
        L_0x00bd:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r14 & r16
            if (r17 != 0) goto L_0x00d7
            r17 = r15 & 64
            r7 = r33
            if (r17 != 0) goto L_0x00d2
            boolean r18 = r12.mo14980g(r7)
            if (r18 == 0) goto L_0x00d2
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r1 = r1 | r18
            goto L_0x00d9
        L_0x00d7:
            r7 = r33
        L_0x00d9:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r14 & r18
            if (r18 != 0) goto L_0x00f2
            r0 = r15 & 128(0x80, float:1.794E-43)
            r7 = r35
            if (r0 != 0) goto L_0x00ee
            boolean r0 = r12.mo14980g(r7)
            if (r0 == 0) goto L_0x00ee
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ee:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r1 = r1 | r0
            goto L_0x00f4
        L_0x00f2:
            r7 = r35
        L_0x00f4:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00ff
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r19
            r3 = r37
            goto L_0x0114
        L_0x00ff:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r14 & r19
            r3 = r37
            if (r19 != 0) goto L_0x0114
            boolean r19 = r12.mo15006n0(r3)
            if (r19 == 0) goto L_0x0110
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0112
        L_0x0110:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0112:
            r1 = r1 | r19
        L_0x0114:
            r19 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r1 & r19
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x0138
            boolean r3 = r12.mo15011p()
            if (r3 != 0) goto L_0x0125
            goto L_0x0138
        L_0x0125:
            r12.mo14958a0()
            r3 = r29
            r4 = r30
            r5 = r31
            r11 = r37
            r6 = r10
            r16 = r12
            r9 = r7
            r7 = r33
            goto L_0x0254
        L_0x0138:
            r12.mo14930Q()
            r3 = r14 & 1
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = 0
            r5 = 1
            if (r3 == 0) goto L_0x016c
            boolean r3 = r12.mo14977f0()
            if (r3 == 0) goto L_0x014c
            goto L_0x016c
        L_0x014c:
            r12.mo14958a0()
            r0 = r15 & 64
            if (r0 == 0) goto L_0x0155
            r1 = r1 & r19
        L_0x0155:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x015d
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x015d:
            r19 = r29
            r21 = r30
            r22 = r33
            r26 = r37
            r24 = r7
            r9 = r10
            r10 = r31
            goto L_0x01d2
        L_0x016c:
            if (r2 == 0) goto L_0x0171
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0173
        L_0x0171:
            r2 = r29
        L_0x0173:
            if (r4 == 0) goto L_0x0177
            r3 = r5
            goto L_0x0179
        L_0x0177:
            r3 = r30
        L_0x0179:
            if (r6 == 0) goto L_0x017e
            r4 = r20
            goto L_0x0180
        L_0x017e:
            r4 = r31
        L_0x0180:
            if (r9 == 0) goto L_0x0184
            r10 = r20
        L_0x0184:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x0199
            androidx.compose.runtime.i1 r6 = androidx.compose.material3.ContentColorKt.m25558a()
            java.lang.Object r6 = r12.mo15032w(r6)
            androidx.compose.ui.graphics.j2 r6 = (androidx.compose.p004ui.graphics.C15240j2) r6
            long r22 = r6.mo42833M()
            r1 = r1 & r19
            goto L_0x019b
        L_0x0199:
            r22 = r33
        L_0x019b:
            r6 = r15 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01a5
            r6 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r6
            r7 = r22
        L_0x01a5:
            if (r0 == 0) goto L_0x01c8
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.mo14918M(r0)
            java.lang.Object r0 = r12.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r0 != r6) goto L_0x01c0
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r12.mo14893C(r0)
        L_0x01c0:
            r12.mo15002m0()
            androidx.compose.foundation.interaction.g r0 = (androidx.compose.foundation.interaction.C2243g) r0
            r26 = r0
            goto L_0x01ca
        L_0x01c8:
            r26 = r37
        L_0x01ca:
            r19 = r2
            r21 = r3
            r24 = r7
            r9 = r10
            r10 = r4
        L_0x01d2:
            r12.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01e4
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.Tab (Tab.kt:92)"
            r3 = -350627181(0xffffffffeb19da93, float:-1.8599784E26)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x01e4:
            if (r10 == 0) goto L_0x01f2
            androidx.compose.material3.TabKt$Tab$styledText$1$1 r0 = new androidx.compose.material3.TabKt$Tab$styledText$1$1
            r0.<init>(r10, r1)
            r2 = 708874428(0x2a4090bc, float:1.710324E-13)
            androidx.compose.runtime.internal.a r20 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r2, r5, r0)
        L_0x01f2:
            r0 = r20
            androidx.compose.material3.TabKt$Tab$2 r2 = new androidx.compose.material3.TabKt$Tab$2
            r2.<init>(r0, r9, r1)
            r0 = 1540996038(0x5bd9bbc6, float:1.22573058E17)
            androidx.compose.runtime.internal.a r18 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r0, r5, r2)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r1 = r1 >> 6
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r16 = r0 | r1
            r17 = 0
            r0 = r27
            r1 = r28
            r2 = r19
            r3 = r21
            r4 = r22
            r6 = r24
            r8 = r26
            r20 = r9
            r9 = r18
            r18 = r10
            r10 = r12
            r11 = r16
            r16 = r12
            r12 = r17
            m26552b(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0246
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0246:
            r5 = r18
            r3 = r19
            r6 = r20
            r4 = r21
            r7 = r22
            r9 = r24
            r11 = r26
        L_0x0254:
            androidx.compose.runtime.t1 r12 = r16.mo15020s()
            if (r12 != 0) goto L_0x025b
            goto L_0x026f
        L_0x025b:
            androidx.compose.material3.TabKt$Tab$3 r2 = new androidx.compose.material3.TabKt$Tab$3
            r0 = r2
            r1 = r27
            r14 = r2
            r2 = r28
            r13 = r12
            r12 = r39
            r15 = r13
            r13 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r15.mo15202a(r14)
        L_0x026f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m26553c(boolean, kotlin.jvm.functions.a, androidx.compose.ui.m, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, long, long, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    public static final void m26554d(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar3 = pVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar2;
        int i5 = i;
        C8592o o = oVar.mo15009o(514131524);
        if ((i5 & 14) == 0) {
            if (o.mo14927P(pVar3)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(pVar4)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(514131524, i2, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:303)");
            }
            TabKt$TabBaselineLayout$2 tabKt$TabBaselineLayout$2 = new TabKt$TabBaselineLayout$2(pVar3, pVar4);
            o.mo14918M(-1323940314);
            C8767m.C8768a aVar = C8767m.f23478j;
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, tabKt$TabBaselineLayout$2, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            o.mo14918M(720851189);
            if (pVar3 != null) {
                C8767m m = PaddingKt.m10026m(C15594q.m69318b(aVar, "text"), f19822f, 0.0f, 2, (Object) null);
                o.mo14918M(733328855);
                C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a2 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(m);
                if (!(o.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                o.mo14938T();
                if (o.mo14997l()) {
                    o.mo14947W(a2);
                } else {
                    o.mo14888A();
                }
                o.mo14941U();
                C8592o b2 = Updater.m30180b(o);
                Updater.m30188j(b2, k, companion.mo44588d());
                Updater.m30188j(b2, dVar2, companion.mo44586b());
                Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
                Updater.m30188j(b2, c4Var2, companion.mo44590f());
                o.mo14972e();
                f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                pVar3.invoke(o, Integer.valueOf(i2 & 14));
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
            }
            o.mo15002m0();
            o.mo14918M(150513216);
            if (pVar4 != null) {
                C8767m b3 = C15594q.m69318b(aVar, "icon");
                o.mo14918M(733328855);
                C15560f0 k2 = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a3 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(b3);
                if (!(o.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                o.mo14938T();
                if (o.mo14997l()) {
                    o.mo14947W(a3);
                } else {
                    o.mo14888A();
                }
                o.mo14941U();
                C8592o b4 = Updater.m30180b(o);
                Updater.m30188j(b4, k2, companion.mo44588d());
                Updater.m30188j(b4, dVar3, companion.mo44586b());
                Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
                Updater.m30188j(b4, c4Var3, companion.mo44590f());
                o.mo14972e();
                f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f6046a;
                pVar4.invoke(o, Integer.valueOf((i2 >> 3) & 14));
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TabKt$TabBaselineLayout$3(pVar3, pVar4, i5));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: androidx.compose.animation.core.a1} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26555e(long r18, long r20, boolean r22, kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r23, androidx.compose.runtime.C8592o r24, int r25) {
        /*
            r6 = r23
            r7 = r25
            r0 = 735731848(0x2bda6088, float:1.5516624E-12)
            r1 = r24
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r7 & 14
            r3 = 2
            r4 = r18
            if (r2 != 0) goto L_0x001f
            boolean r2 = r1.mo14980g(r4)
            if (r2 == 0) goto L_0x001c
            r2 = 4
            goto L_0x001d
        L_0x001c:
            r2 = r3
        L_0x001d:
            r2 = r2 | r7
            goto L_0x0020
        L_0x001f:
            r2 = r7
        L_0x0020:
            r8 = r7 & 112(0x70, float:1.57E-43)
            r14 = r20
            if (r8 != 0) goto L_0x0032
            boolean r8 = r1.mo14980g(r14)
            if (r8 == 0) goto L_0x002f
            r8 = 32
            goto L_0x0031
        L_0x002f:
            r8 = 16
        L_0x0031:
            r2 = r2 | r8
        L_0x0032:
            r8 = r7 & 896(0x380, float:1.256E-42)
            r13 = r22
            if (r8 != 0) goto L_0x0044
            boolean r8 = r1.mo14961b(r13)
            if (r8 == 0) goto L_0x0041
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r2 = r2 | r8
        L_0x0044:
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0054
            boolean r8 = r1.mo14927P(r6)
            if (r8 == 0) goto L_0x0051
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r2 = r2 | r8
        L_0x0054:
            r8 = r2 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x0066
            boolean r8 = r1.mo15011p()
            if (r8 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r1.mo14958a0()
            goto L_0x0194
        L_0x0066:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            r9 = -1
            if (r8 == 0) goto L_0x0072
            java.lang.String r8 = "androidx.compose.material3.TabTransition (Tab.kt:266)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r9, r8)
        L_0x0072:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            int r2 = r2 >> 6
            r8 = r2 & 14
            r10 = 0
            androidx.compose.animation.core.Transition r8 = androidx.compose.animation.core.TransitionKt.m8196o(r0, r10, r1, r8, r3)
            androidx.compose.material3.TabKt$TabTransition$color$2 r0 = androidx.compose.material3.TabKt$TabTransition$color$2.f19829f
            r3 = -1939694975(0xffffffff8c629a81, float:-1.7456901E-31)
            r1.mo14918M(r3)
            java.lang.String r3 = "ColorAnimation"
            java.lang.Object r10 = r8.mo6706o()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r11 = -1997025499(0xffffffff88f7cf25, float:-1.4914471E-33)
            r1.mo14918M(r11)
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            java.lang.String r9 = "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:288)"
            r15 = 0
            if (r12 == 0) goto L_0x00a6
            r12 = -1
            androidx.compose.runtime.ComposerKt.m29845w0(r11, r15, r12, r9)
        L_0x00a6:
            if (r10 == 0) goto L_0x00ab
            r16 = r4
            goto L_0x00ad
        L_0x00ab:
            r16 = r20
        L_0x00ad:
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x00b6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00b6:
            r1.mo15002m0()
            androidx.compose.ui.graphics.colorspace.c r10 = androidx.compose.p004ui.graphics.C15240j2.m66051E(r16)
            r12 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r12)
            boolean r12 = r1.mo15006n0(r10)
            java.lang.Object r14 = r1.mo14921N()
            if (r12 != 0) goto L_0x00d5
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r14 != r12) goto L_0x00e5
        L_0x00d5:
            androidx.compose.ui.graphics.j2$a r12 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            kotlin.jvm.functions.l r12 = androidx.compose.animation.ColorVectorConverterKt.m7783d(r12)
            java.lang.Object r10 = r12.invoke(r10)
            r14 = r10
            androidx.compose.animation.core.a1 r14 = (androidx.compose.animation.core.C1945a1) r14
            r1.mo14893C(r14)
        L_0x00e5:
            r1.mo15002m0()
            r12 = r14
            androidx.compose.animation.core.a1 r12 = (androidx.compose.animation.core.C1945a1) r12
            r10 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r1.mo14918M(r10)
            java.lang.Object r10 = r8.mo6700h()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r1.mo14918M(r11)
            boolean r14 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r14 == 0) goto L_0x0108
            r14 = -1
            androidx.compose.runtime.ComposerKt.m29845w0(r11, r15, r14, r9)
        L_0x0108:
            if (r10 == 0) goto L_0x010d
            r16 = r4
            goto L_0x010f
        L_0x010d:
            r16 = r20
        L_0x010f:
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x0118
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0118:
            r1.mo15002m0()
            androidx.compose.ui.graphics.j2 r10 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r16)
            java.lang.Object r14 = r8.mo6706o()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r1.mo14918M(r11)
            boolean r16 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r16 == 0) goto L_0x0136
            r4 = -1
            androidx.compose.runtime.ComposerKt.m29845w0(r11, r15, r4, r9)
        L_0x0136:
            if (r14 == 0) goto L_0x013b
            r4 = r18
            goto L_0x013d
        L_0x013b:
            r4 = r20
        L_0x013d:
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0146
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0146:
            r1.mo15002m0()
            androidx.compose.ui.graphics.j2 r4 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r4)
            androidx.compose.animation.core.Transition$b r5 = r8.mo6704m()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r0.invoke(r5, r1, r9)
            r11 = r0
            androidx.compose.animation.core.d0 r11 = (androidx.compose.animation.core.C1956d0) r11
            r0 = 32768(0x8000, float:4.5918E-41)
            r9 = r10
            r10 = r4
            r13 = r3
            r14 = r1
            r3 = r15
            r15 = r0
            androidx.compose.runtime.k2 r0 = androidx.compose.animation.core.TransitionKt.m8194m(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.mo15002m0()
            r1.mo15002m0()
            r4 = 1
            androidx.compose.runtime.j1[] r4 = new androidx.compose.runtime.C8572j1[r4]
            androidx.compose.runtime.i1 r5 = androidx.compose.material3.ContentColorKt.m25558a()
            long r8 = m26556f(r0)
            androidx.compose.ui.graphics.j2 r0 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r8)
            androidx.compose.runtime.j1 r0 = r5.mo16141f(r0)
            r4[r3] = r0
            r0 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            androidx.compose.runtime.CompositionLocalKt.m29856b(r4, r6, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0194
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0194:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x019b
            goto L_0x01ae
        L_0x019b:
            androidx.compose.material3.TabKt$TabTransition$1 r9 = new androidx.compose.material3.TabKt$TabTransition$1
            r0 = r9
            r1 = r18
            r3 = r20
            r5 = r22
            r6 = r23
            r7 = r25
            r0.<init>(r1, r3, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m26555e(long, long, boolean, kotlin.jvm.functions.p, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: f */
    public static final long m26556f(C8578k2<C15240j2> k2Var) {
        return k2Var.getValue().mo42833M();
    }

    /* renamed from: p */
    public static final void m26566p(C15611w0.C15612a aVar, C16479d dVar, C15611w0 w0Var, C15611w0 w0Var2, int i, int i2, int i3, int i4) {
        float f;
        C16479d dVar2 = dVar;
        int i5 = i3;
        int i6 = i4;
        if (i5 == i6) {
            f = f19823g;
        } else {
            f = f19824h;
        }
        int n2 = dVar.mo7429n2(f) + dVar.mo7429n2(C8336r0.f21997a.mo14350g());
        int G0 = (w0Var2.mo44468G0() + dVar.mo7433u5(f19825i)) - i5;
        int i7 = (i2 - i6) - n2;
        C15611w0.C15612a aVar2 = aVar;
        C15611w0.C15612a.m69414v(aVar2, w0Var, (i - w0Var.mo44471K0()) / 2, i7, 0.0f, 4, (Object) null);
        C15611w0.C15612a.m69414v(aVar2, w0Var2, (i - w0Var2.mo44471K0()) / 2, i7 - G0, 0.0f, 4, (Object) null);
    }

    /* renamed from: q */
    public static final void m26567q(C15611w0.C15612a aVar, C15611w0 w0Var, int i) {
        C15611w0.C15612a.m69414v(aVar, w0Var, 0, (i - w0Var.mo44468G0()) / 2, 0.0f, 4, (Object) null);
    }
}
