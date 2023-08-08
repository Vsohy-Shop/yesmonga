package androidx.compose.material3;

import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.C7922j;
import androidx.compose.material3.tokens.C8297d1;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import com.urbanairship.util.C9647e0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,478:1\n25#2:479\n50#2:491\n49#2:492\n25#2:499\n25#2:510\n460#2,13:540\n473#2,3:554\n460#2,13:586\n36#2:600\n460#2,13:626\n473#2,3:640\n473#2,3:645\n1114#3,6:480\n1114#3,6:493\n1114#3,6:500\n1114#3,3:511\n1117#3,3:517\n1114#3,6:601\n58#4:486\n75#4:487\n58#4:560\n58#4:561\n81#4:562\n88#4:563\n51#4:564\n58#4:566\n75#4:607\n58#4:653\n75#4:654\n58#4:655\n76#5:488\n76#5:490\n76#5:528\n76#5:559\n76#5:565\n76#5:574\n76#5:614\n1#6:489\n474#7,4:506\n478#7,2:514\n482#7:520\n474#8:516\n67#9,6:521\n73#9:553\n77#9:558\n67#9,6:567\n73#9:599\n68#9,5:608\n73#9:639\n77#9:644\n77#9:649\n75#10:527\n76#10,11:529\n89#10:557\n75#10:573\n76#10,11:575\n75#10:613\n76#10,11:615\n89#10:643\n89#10:648\n76#11:650\n76#11:651\n76#11:652\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n*L\n98#1:479\n109#1:491\n109#1:492\n114#1:499\n115#1:510\n146#1:540,13\n146#1:554,3\n223#1:586,13\n229#1:600\n226#1:626,13\n226#1:640,3\n223#1:645,3\n98#1:480,6\n109#1:493,6\n114#1:500,6\n115#1:511,3\n115#1:517,3\n229#1:601,6\n106#1:486\n106#1:487\n195#1:560\n196#1:561\n196#1:562\n195#1:563\n195#1:564\n202#1:566\n232#1:607\n253#1:653\n253#1:654\n254#1:655\n107#1:488\n108#1:490\n146#1:528\n191#1:559\n200#1:565\n223#1:574\n226#1:614\n115#1:506,4\n115#1:514,2\n115#1:520\n115#1:516\n146#1:521,6\n146#1:553\n146#1:558\n223#1:567,6\n223#1:599\n226#1:608,5\n226#1:639\n226#1:644\n223#1:649\n146#1:527\n146#1:529,11\n146#1:557\n223#1:573\n223#1:575,11\n226#1:613\n226#1:615,11\n226#1:643\n223#1:648\n188#1:650\n189#1:651\n224#1:652\n*E\n"})
public final class SwitchKt {

    /* renamed from: a */
    public static final float f19810a;

    /* renamed from: b */
    public static final float f19811b;

    /* renamed from: c */
    public static final float f19812c;

    /* renamed from: d */
    public static final float f19813d;

    /* renamed from: e */
    public static final float f19814e;

    /* renamed from: f */
    public static final float f19815f;
    @C12579k

    /* renamed from: g */
    public static final C2023z0<Float> f19816g = new C2023z0(100, 0, (C2022z) null, 6, (DefaultConstructorMarker) null);

    static {
        C8297d1 d1Var = C8297d1.f20938a;
        float r = d1Var.mo13392r();
        f19810a = r;
        f19811b = d1Var.mo13362N();
        float G = d1Var.mo13355G();
        f19812c = G;
        float D = d1Var.mo13352D();
        f19813d = D;
        float M = C16483g.m74435M(C16483g.m74435M(D - r) / ((float) 2));
        f19814e = M;
        f19815f = C16483g.m74435M(C16483g.m74435M(G - r) - M);
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ee  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26538a(boolean r52, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r53, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r54, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r55, boolean r56, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8379z2 r57, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r58, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r59, int r60, int r61) {
        /*
            r7 = r53
            r8 = r60
            r0 = 1580463220(0x5e33f474, float:3.24177919E18)
            r1 = r59
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r61 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r8 | 6
            r4 = r52
            goto L_0x0028
        L_0x0016:
            r1 = r8 & 14
            r4 = r52
            if (r1 != 0) goto L_0x0027
            boolean r1 = r6.mo14961b(r4)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r8
            goto L_0x0028
        L_0x0027:
            r1 = r8
        L_0x0028:
            r2 = r61 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003f
        L_0x002f:
            r2 = r8 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x003f
            boolean r2 = r6.mo14927P(r7)
            if (r2 == 0) goto L_0x003c
            r2 = 32
            goto L_0x003e
        L_0x003c:
            r2 = 16
        L_0x003e:
            r1 = r1 | r2
        L_0x003f:
            r2 = r61 & 4
            if (r2 == 0) goto L_0x0046
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0046:
            r3 = r8 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0059
            r3 = r54
            boolean r9 = r6.mo15006n0(r3)
            if (r9 == 0) goto L_0x0055
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r1 = r1 | r9
            goto L_0x005b
        L_0x0059:
            r3 = r54
        L_0x005b:
            r9 = r61 & 8
            if (r9 == 0) goto L_0x0062
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0062:
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0075
            r10 = r55
            boolean r11 = r6.mo14927P(r10)
            if (r11 == 0) goto L_0x0071
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r1 = r1 | r11
            goto L_0x0077
        L_0x0075:
            r10 = r55
        L_0x0077:
            r11 = r61 & 16
            if (r11 == 0) goto L_0x007e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0093
        L_0x007e:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0093
            r12 = r56
            boolean r13 = r6.mo14961b(r12)
            if (r13 == 0) goto L_0x008f
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r13
            goto L_0x0095
        L_0x0093:
            r12 = r56
        L_0x0095:
            r46 = 458752(0x70000, float:6.42848E-40)
            r13 = r8 & r46
            if (r13 != 0) goto L_0x00b0
            r13 = r61 & 32
            if (r13 != 0) goto L_0x00aa
            r13 = r57
            boolean r14 = r6.mo15006n0(r13)
            if (r14 == 0) goto L_0x00ac
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00aa:
            r13 = r57
        L_0x00ac:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r1 = r1 | r14
            goto L_0x00b2
        L_0x00b0:
            r13 = r57
        L_0x00b2:
            r47 = r61 & 64
            r48 = 3670016(0x380000, float:5.142788E-39)
            if (r47 == 0) goto L_0x00bc
            r14 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r14
            goto L_0x00cf
        L_0x00bc:
            r14 = r8 & r48
            if (r14 != 0) goto L_0x00cf
            r14 = r58
            boolean r15 = r6.mo15006n0(r14)
            if (r15 == 0) goto L_0x00cb
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r1 = r1 | r15
            goto L_0x00d1
        L_0x00cf:
            r14 = r58
        L_0x00d1:
            r15 = 2995931(0x2db6db, float:4.198194E-39)
            r15 = r15 & r1
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r5) goto L_0x00ee
            boolean r5 = r6.mo15011p()
            if (r5 != 0) goto L_0x00e1
            goto L_0x00ee
        L_0x00e1:
            r6.mo14958a0()
            r4 = r3
            r3 = r6
            r23 = r10
            r5 = r12
            r6 = r13
            r25 = r14
            goto L_0x03b9
        L_0x00ee:
            r6.mo14930Q()
            r5 = r8 & 1
            r49 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            if (r5 == 0) goto L_0x0119
            boolean r5 = r6.mo14977f0()
            if (r5 == 0) goto L_0x0102
            goto L_0x0119
        L_0x0102:
            r6.mo14958a0()
            r2 = r61 & 32
            if (r2 == 0) goto L_0x010b
            r1 = r1 & r49
        L_0x010b:
            r9 = r1
            r23 = r10
            r50 = r12
            r24 = r13
            r25 = r14
            r3 = r15
            r15 = r54
            goto L_0x0193
        L_0x0119:
            if (r2 == 0) goto L_0x011e
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0120
        L_0x011e:
            r2 = r54
        L_0x0120:
            if (r9 == 0) goto L_0x0124
            r5 = 0
            goto L_0x0125
        L_0x0124:
            r5 = r10
        L_0x0125:
            if (r11 == 0) goto L_0x012b
            r9 = 1
            r50 = r9
            goto L_0x012d
        L_0x012b:
            r50 = r12
        L_0x012d:
            r9 = r61 & 32
            if (r9 == 0) goto L_0x0164
            androidx.compose.material3.a3 r9 = androidx.compose.material3.C8172a3.f19988a
            r10 = 0
            r12 = 0
            r16 = 0
            r3 = r15
            r14 = r16
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
            r43 = 0
            r44 = 1572864(0x180000, float:2.204052E-39)
            r45 = 65535(0xffff, float:9.1834E-41)
            r42 = r6
            androidx.compose.material3.z2 r9 = r9.mo12449a(r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r43, r44, r45)
            r1 = r1 & r49
            goto L_0x0166
        L_0x0164:
            r3 = r15
            r9 = r13
        L_0x0166:
            if (r47 == 0) goto L_0x018b
            r6.mo14918M(r3)
            java.lang.Object r10 = r6.mo14921N()
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r10 != r11) goto L_0x017e
            androidx.compose.foundation.interaction.g r10 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r6.mo14893C(r10)
        L_0x017e:
            r6.mo15002m0()
            androidx.compose.foundation.interaction.g r10 = (androidx.compose.foundation.interaction.C2243g) r10
            r15 = r2
            r23 = r5
            r24 = r9
            r25 = r10
            goto L_0x0192
        L_0x018b:
            r25 = r58
            r15 = r2
            r23 = r5
            r24 = r9
        L_0x0192:
            r9 = r1
        L_0x0193:
            r6.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01a2
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.Switch (Switch.kt:90)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r1, r2)
        L_0x01a2:
            if (r23 != 0) goto L_0x01a7
            float r0 = f19811b
            goto L_0x01a9
        L_0x01a7:
            float r0 = f19810a
        L_0x01a9:
            r17 = r0
            float r10 = f19813d
            float r0 = r10 - r17
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r1 = 2
            float r2 = (float) r1
            float r0 = r0 / r2
            float r14 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r6.mo15032w(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.p004ui.unit.C16479d) r0
            float r0 = r0.mo7425g5(r14)
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r1 = r6.mo15032w(r1)
            androidx.compose.ui.unit.d r1 = (androidx.compose.p004ui.unit.C16479d) r1
            float r13 = f19815f
            float r1 = r1.mo7425g5(r13)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.mo14918M(r11)
            boolean r2 = r6.mo15006n0(r2)
            boolean r5 = r6.mo15006n0(r5)
            r2 = r2 | r5
            java.lang.Object r5 = r6.mo14921N()
            if (r2 != 0) goto L_0x01fd
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r5 != r2) goto L_0x0205
        L_0x01fd:
            androidx.compose.material3.SwitchKt$Switch$valueToOffset$1$1 r5 = new androidx.compose.material3.SwitchKt$Switch$valueToOffset$1$1
            r5.<init>(r1, r0)
            r6.mo14893C(r5)
        L_0x0205:
            r6.mo15002m0()
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r52)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r6.mo14918M(r3)
            java.lang.Object r2 = r6.mo14921N()
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r5.mo16277a()
            if (r2 != r11) goto L_0x0232
            r2 = 0
            r11 = 0
            r12 = 2
            androidx.compose.animation.core.Animatable r2 = androidx.compose.animation.core.C1946b.m8288b(r1, r2, r12, r11)
            r6.mo14893C(r2)
            goto L_0x0234
        L_0x0232:
            r11 = 0
            r12 = 2
        L_0x0234:
            r6.mo15002m0()
            androidx.compose.animation.core.Animatable r2 = (androidx.compose.animation.core.Animatable) r2
            r11 = 773894976(0x2e20b340, float:3.6538994E-11)
            r6.mo14918M(r11)
            r6.mo14918M(r3)
            java.lang.Object r3 = r6.mo14921N()
            java.lang.Object r5 = r5.mo16277a()
            if (r3 != r5) goto L_0x025b
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r3 = androidx.compose.runtime.EffectsKt.m29901m(r3, r6)
            androidx.compose.runtime.w r5 = new androidx.compose.runtime.w
            r5.<init>(r3)
            r6.mo14893C(r5)
            r3 = r5
        L_0x025b:
            r6.mo15002m0()
            androidx.compose.runtime.w r3 = (androidx.compose.runtime.C8690w) r3
            kotlinx.coroutines.o0 r3 = r3.mo16831a()
            r6.mo15002m0()
            androidx.compose.material3.SwitchKt$Switch$2 r5 = new androidx.compose.material3.SwitchKt$Switch$2
            r5.<init>(r2, r0)
            r11 = 0
            androidx.compose.runtime.EffectsKt.m29899k(r5, r6, r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r52)
            androidx.compose.material3.SwitchKt$Switch$3 r5 = new androidx.compose.material3.SwitchKt$Switch$3
            r5.<init>(r2, r1, r3)
            r1 = r9 & 14
            androidx.compose.runtime.EffectsKt.m29891c(r0, r5, r6, r1)
            if (r7 == 0) goto L_0x029f
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.semantics.g$a r1 = androidx.compose.p004ui.semantics.C16031g.f39793b
            int r1 = r1.mo46126f()
            r3 = 0
            androidx.compose.ui.semantics.g r5 = androidx.compose.p004ui.semantics.C16031g.m72093h(r1)
            r1 = r52
            r16 = r2
            r2 = r25
            r12 = 0
            r4 = r50
            r51 = r6
            r6 = r53
            androidx.compose.ui.m r0 = androidx.compose.foundation.selection.ToggleableKt.m12065a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02a6
        L_0x029f:
            r16 = r2
            r51 = r6
            r12 = 0
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
        L_0x02a6:
            if (r7 == 0) goto L_0x02af
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r1 = androidx.compose.material3.InteractiveComponentSizeKt.m25834f(r1)
            goto L_0x02b1
        L_0x02af:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
        L_0x02b1:
            androidx.compose.ui.m r1 = r15.mo17224k3(r1)
            androidx.compose.ui.m r0 = r1.mo17224k3(r0)
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r2 = r1.mo17066i()
            r3 = 2
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10098N(r0, r2, r11, r3, r12)
            float r2 = f19812c
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10123w(r0, r2, r10)
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r3 = r51
            r3.mo14918M(r2)
            androidx.compose.ui.c r1 = r1.mo17061C()
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.BoxKt.m9849k(r1, r11, r3, r11)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r3.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r3.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r3.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r6.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r12 = r3.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x0313
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0313:
            r3.mo14938T()
            boolean r12 = r3.mo14997l()
            if (r12 == 0) goto L_0x0320
            r3.mo14947W(r10)
            goto L_0x0323
        L_0x0320:
            r3.mo14888A()
        L_0x0323:
            r3.mo14941U()
            androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r3)
            kotlin.jvm.functions.p r12 = r6.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r10, r1, r12)
            kotlin.jvm.functions.p r1 = r6.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r10, r2, r1)
            kotlin.jvm.functions.p r1 = r6.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r10, r4, r1)
            kotlin.jvm.functions.p r1 = r6.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r10, r5, r1)
            r3.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r3)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r0.invoke(r1, r3, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.runtime.k2 r1 = r16.mo6602j()
            androidx.compose.material3.tokens.d1 r2 = androidx.compose.material3.tokens.C8297d1.f20938a
            androidx.compose.material3.tokens.ShapeKeyTokens r2 = r2.mo13382h()
            r4 = 6
            androidx.compose.ui.graphics.g4 r16 = androidx.compose.material3.ShapesKt.m26127f(r2, r3, r4)
            int r2 = r9 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r9 >> 6
            r5 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r5
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r9 << 6
            r4 = r4 & r46
            r2 = r2 | r4
            r4 = r9 & r48
            r21 = r2 | r4
            r22 = 6
            r9 = r0
            r10 = r52
            r11 = r50
            r12 = r24
            r0 = r13
            r13 = r1
            r1 = r14
            r14 = r23
            r2 = r15
            r15 = r25
            r18 = r1
            r19 = r0
            r20 = r3
            m26539b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.mo15002m0()
            r3.mo14896D()
            r3.mo15002m0()
            r3.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03b4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03b4:
            r4 = r2
            r6 = r24
            r5 = r50
        L_0x03b9:
            androidx.compose.runtime.t1 r10 = r3.mo15020s()
            if (r10 != 0) goto L_0x03c0
            goto L_0x03d6
        L_0x03c0:
            androidx.compose.material3.SwitchKt$Switch$5 r11 = new androidx.compose.material3.SwitchKt$Switch$5
            r0 = r11
            r1 = r52
            r2 = r53
            r3 = r4
            r4 = r23
            r7 = r25
            r8 = r60
            r9 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x03d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.m26538a(boolean, kotlin.jvm.functions.l, androidx.compose.ui.m, kotlin.jvm.functions.p, boolean, androidx.compose.material3.z2, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final void m26539b(C2362h hVar, boolean z, boolean z2, C8379z2 z2Var, C8578k2<Float> k2Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C2241e eVar, C15218g4 g4Var, float f, float f2, float f3, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        float f4;
        float f5;
        float f6;
        C2362h hVar2 = hVar;
        boolean z3 = z;
        boolean z4 = z2;
        C8379z2 z2Var2 = z2Var;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        C2241e eVar2 = eVar;
        C15218g4 g4Var2 = g4Var;
        float f7 = f;
        float f8 = f2;
        float f9 = f3;
        int i5 = i;
        C8592o o = oVar.mo15009o(-1968109941);
        if ((i5 & 14) == 0) {
            i3 = (o.mo15006n0(hVar2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            i3 |= o.mo14961b(z3) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i3 |= o.mo14961b(z4) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i3 |= o.mo15006n0(z2Var2) ? 2048 : 1024;
        }
        if ((57344 & i5) == 0) {
            i3 |= o.mo15006n0(k2Var) ? 16384 : 8192;
        } else {
            C8578k2<Float> k2Var2 = k2Var;
        }
        if ((i5 & 458752) == 0) {
            i3 |= o.mo14927P(pVar2) ? 131072 : 65536;
        }
        if ((i5 & 3670016) == 0) {
            i3 |= o.mo15006n0(eVar2) ? 1048576 : 524288;
        }
        if ((i5 & 29360128) == 0) {
            i3 |= o.mo15006n0(g4Var2) ? 8388608 : 4194304;
        }
        if ((i5 & 234881024) == 0) {
            i3 |= o.mo14968d(f7) ? C8698y1.f23302n : C9647e0.f26435a;
        }
        if ((i5 & 1879048192) == 0) {
            i3 |= o.mo14968d(f8) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (o.mo14968d(f9) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && o.mo15011p()) {
            o.mo14958a0();
            C2241e eVar3 = eVar2;
        } else {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1968109941, i3, i4, "androidx.compose.material3.SwitchImpl (Switch.kt:175)");
            }
            int i6 = ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896);
            C8578k2<C15240j2> d = z2Var2.mo14868d(z4, z3, o, i6);
            C8578k2<Boolean> a = PressInteractionKt.m9677a(eVar2, o, (i3 >> 18) & 14);
            int i7 = i3;
            float M = ((C16479d) o.mo15032w(CompositionLocalsKt.m71011i())).mo7418M(k2Var.getValue().floatValue());
            if (m26542e(a)) {
                f4 = C8297d1.f20938a.mo13386l();
            } else {
                f4 = C16483g.m74435M(C16483g.m74435M(C16483g.m74435M(f19810a - f7) * (C16483g.m74435M(M - f8) / C16483g.m74435M(f9 - f8))) + f7);
            }
            float f10 = f4;
            o.mo14918M(-993794105);
            if (m26542e(a)) {
                C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                if (z3) {
                    f6 = C16483g.m74435M(f19815f - C8297d1.f20938a.mo13353E());
                } else {
                    f6 = C8297d1.f20938a.mo13353E();
                }
                f5 = dVar.mo7425g5(f6);
            } else {
                f5 = k2Var.getValue().floatValue();
            }
            o.mo15002m0();
            C8297d1 d1Var = C8297d1.f20938a;
            C15218g4 f11 = ShapesKt.m26127f(d1Var.mo13354F(), o, 6);
            C8767m.C8768a aVar = C8767m.f23478j;
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C8767m c = BackgroundKt.m8824c(BorderKt.m8852h(SizeKt.m10115o(SizeKt.m10092H(hVar2.mo7701c(aVar, aVar2.mo17066i()), f19812c), f19813d), d1Var.mo13353E(), z2Var2.mo14865a(z4, z3, o, i6).getValue().mo42833M(), f11), m26541d(d), f11);
            o.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f12 = LayoutKt.m68908f(c);
            float f13 = f10;
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
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar2, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f12.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            long c2 = m26540c(z2Var2.mo14867c(z4, z3, o, i6));
            C8767m c3 = boxScopeInstance.mo7701c(aVar, aVar2.mo17069o());
            Float valueOf = Float.valueOf(f5);
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(valueOf);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new SwitchKt$SwitchImpl$1$1$1(f5);
                o.mo14893C(N);
            }
            o.mo15002m0();
            int i8 = i7;
            C8767m c4 = BackgroundKt.m8824c(SizeKt.m10121u(IndicationKt.m8973b(OffsetKt.m9998d(c3, (C11300l) N), eVar, C7922j.m25285e(false, C16483g.m74435M(d1Var.mo13351C() / ((float) 2)), 0, o, 54, 4)), f13), c2, g4Var2);
            C8734c i9 = aVar2.mo17066i();
            o.mo14918M(733328855);
            C15560f0 k2 = BoxKt.m9849k(i9, false, o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f14 = LayoutKt.m68908f(c4);
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
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, k2, companion.mo44588d());
            Updater.m30188j(b2, dVar3, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b2, c4Var2, companion.mo44590f());
            o.mo14972e();
            f14.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            o.mo14918M(1420970387);
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar3 = pVar;
            if (pVar3 != null) {
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(z2Var2.mo14866b(z4, z3, o, i6).getValue())}, pVar3, o, ((i8 >> 12) & 112) | 8);
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SwitchKt$SwitchImpl$2(hVar, z, z2, z2Var, k2Var, pVar, eVar, g4Var, f, f2, f3, i, i2));
        }
    }

    /* renamed from: c */
    public static final long m26540c(C8578k2<C15240j2> k2Var) {
        return k2Var.getValue().mo42833M();
    }

    /* renamed from: d */
    public static final long m26541d(C8578k2<C15240j2> k2Var) {
        return k2Var.getValue().mo42833M();
    }

    /* renamed from: e */
    public static final boolean m26542e(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* renamed from: h */
    public static final float m26545h() {
        return f19810a;
    }

    /* renamed from: i */
    public static final float m26546i() {
        return f19811b;
    }
}
