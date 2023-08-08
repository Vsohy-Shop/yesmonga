package androidx.compose.material3;

import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2013v;
import androidx.compose.animation.core.C2017x;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.tokens.C8310i;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C8251n0
@C11363r0({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1920:1\n36#2:1921\n36#2:1929\n1114#3,6:1922\n1114#3,6:1930\n76#4:1928\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n*L\n480#1:1921\n502#1:1929\n480#1:1922,6\n502#1:1930,6\n501#1:1928\n*E\n"})
public final class DatePickerDefaults {
    @C12579k

    /* renamed from: a */
    public static final DatePickerDefaults f19304a = new DatePickerDefaults();
    @C12579k

    /* renamed from: b */
    public static final C11466l f19305b = new C11466l(1900, 2100);

    /* renamed from: c */
    public static final float f19306c = C8310i.f21329a.mo13727b();
    @C12579k

    /* renamed from: d */
    public static final String f19307d = "yMMMM";
    @C12579k

    /* renamed from: e */
    public static final String f19308e = "yMMMd";
    @C12579k

    /* renamed from: f */
    public static final String f19309f = "yMMMMEEEEd";

    /* renamed from: g */
    public static final int f19310g = 0;

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11345a(@org.jetbrains.annotations.C12579k androidx.compose.material3.DatePickerState r38, @org.jetbrains.annotations.C12579k androidx.compose.material3.C8186d0 r39, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r40, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r41, int r42, int r43) {
        /*
            r37 = this;
            r2 = r38
            r10 = r39
            r11 = r42
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "dateFormatter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1893194407(0xffffffff8f282559, float:-8.2902324E-30)
            r1 = r41
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r43 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x002f
            boolean r3 = r1.mo15006n0(r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r11
            goto L_0x0030
        L_0x002f:
            r3 = r11
        L_0x0030:
            r4 = r43 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x0047
        L_0x0037:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0047
            boolean r4 = r1.mo15006n0(r10)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r3 = r3 | r4
        L_0x0047:
            r4 = r43 & 4
            if (r4 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r5 = r11 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0061
            r5 = r40
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x005d
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r6
            goto L_0x0063
        L_0x0061:
            r5 = r40
        L_0x0063:
            r3 = r3 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r3 != r6) goto L_0x0076
            boolean r3 = r1.mo15011p()
            if (r3 != 0) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            r1.mo14958a0()
        L_0x0073:
            r4 = r5
            goto L_0x024b
        L_0x0076:
            if (r4 == 0) goto L_0x007c
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r12 = r3
            goto L_0x007d
        L_0x007c:
            r12 = r5
        L_0x007d:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0089
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:442)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r11, r3, r4)
        L_0x0089:
            androidx.compose.material3.StateData r0 = r38.mo11434c()
            r13 = 0
            java.util.Locale r14 = androidx.compose.material3.C8260p.m27433b(r1, r13)
            androidx.compose.runtime.z0 r3 = r0.mo11993g()
            java.lang.Object r3 = r3.getValue()
            r4 = r3
            androidx.compose.material3.l r4 = (androidx.compose.material3.C8238l) r4
            androidx.compose.material3.m r5 = r0.mo11987a()
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r39
            r6 = r14
            java.lang.String r3 = androidx.compose.material3.C8186d0.m27008b(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.runtime.z0 r4 = r0.mo11993g()
            java.lang.Object r4 = r4.getValue()
            androidx.compose.material3.l r4 = (androidx.compose.material3.C8238l) r4
            androidx.compose.material3.m r5 = r0.mo11987a()
            r6 = 1
            java.lang.String r4 = r10.mo12519a(r4, r5, r14, r6)
            r5 = 729783869(0x2b7f9e3d, float:9.08138E-13)
            r1.mo14918M(r5)
            java.lang.String r5 = ""
            r7 = 6
            if (r4 != 0) goto L_0x0120
            androidx.compose.runtime.z0 r4 = r0.mo11989c()
            java.lang.Object r4 = r4.getValue()
            androidx.compose.material3.h0 r4 = (androidx.compose.material3.C8208h0) r4
            int r4 = r4.mo12624i()
            androidx.compose.material3.h0$a r8 = androidx.compose.material3.C8208h0.f20150b
            int r9 = r8.mo12627b()
            boolean r9 = androidx.compose.material3.C8208h0.m27132f(r4, r9)
            if (r9 == 0) goto L_0x00f8
            r4 = 933108990(0x379e1cfe, float:1.8848568E-5)
            r1.mo14918M(r4)
            androidx.compose.material3.t2$a r4 = androidx.compose.material3.C8284t2.f20507b
            int r4 = r4.mo13070s()
            java.lang.String r4 = androidx.compose.material3.C8357u2.m29348a(r4, r1, r7)
            r1.mo15002m0()
            goto L_0x0120
        L_0x00f8:
            int r8 = r8.mo12626a()
            boolean r4 = androidx.compose.material3.C8208h0.m27132f(r4, r8)
            if (r4 == 0) goto L_0x0116
            r4 = 933109079(0x379e1d57, float:1.884873E-5)
            r1.mo14918M(r4)
            androidx.compose.material3.t2$a r4 = androidx.compose.material3.C8284t2.f20507b
            int r4 = r4.mo13065n()
            java.lang.String r4 = androidx.compose.material3.C8357u2.m29348a(r4, r1, r7)
            r1.mo15002m0()
            goto L_0x0120
        L_0x0116:
            r4 = -1138387422(0xffffffffbc259622, float:-0.010106595)
            r1.mo14918M(r4)
            r1.mo15002m0()
            r4 = r5
        L_0x0120:
            r1.mo15002m0()
            r8 = 729784366(0x2b7fa02e, float:9.0816493E-13)
            r1.mo14918M(r8)
            if (r3 != 0) goto L_0x0181
            androidx.compose.runtime.z0 r3 = r0.mo11989c()
            java.lang.Object r3 = r3.getValue()
            androidx.compose.material3.h0 r3 = (androidx.compose.material3.C8208h0) r3
            int r3 = r3.mo12624i()
            androidx.compose.material3.h0$a r8 = androidx.compose.material3.C8208h0.f20150b
            int r9 = r8.mo12627b()
            boolean r9 = androidx.compose.material3.C8208h0.m27132f(r3, r9)
            if (r9 == 0) goto L_0x0159
            r3 = 933109281(0x379e1e21, float:1.8849098E-5)
            r1.mo14918M(r3)
            androidx.compose.material3.t2$a r3 = androidx.compose.material3.C8284t2.f20507b
            int r3 = r3.mo13067p()
            java.lang.String r3 = androidx.compose.material3.C8357u2.m29348a(r3, r1, r7)
            r1.mo15002m0()
            goto L_0x0181
        L_0x0159:
            int r8 = r8.mo12626a()
            boolean r3 = androidx.compose.material3.C8208h0.m27132f(r3, r8)
            if (r3 == 0) goto L_0x0177
            r3 = 933109356(0x379e1e6c, float:1.8849234E-5)
            r1.mo14918M(r3)
            androidx.compose.material3.t2$a r3 = androidx.compose.material3.C8284t2.f20507b
            int r3 = r3.mo13054h()
            java.lang.String r3 = androidx.compose.material3.C8357u2.m29348a(r3, r1, r7)
            r1.mo15002m0()
            goto L_0x0181
        L_0x0177:
            r3 = -1138379145(0xffffffffbc25b677, float:-0.010114304)
            r1.mo14918M(r3)
            r1.mo15002m0()
            r3 = r5
        L_0x0181:
            r1.mo15002m0()
            androidx.compose.runtime.z0 r0 = r0.mo11989c()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.material3.h0 r0 = (androidx.compose.material3.C8208h0) r0
            int r0 = r0.mo12624i()
            androidx.compose.material3.h0$a r8 = androidx.compose.material3.C8208h0.f20150b
            int r9 = r8.mo12627b()
            boolean r9 = androidx.compose.material3.C8208h0.m27132f(r0, r9)
            if (r9 == 0) goto L_0x01b2
            r0 = 933109538(0x379e1f22, float:1.8849565E-5)
            r1.mo14918M(r0)
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13068q()
            java.lang.String r5 = androidx.compose.material3.C8357u2.m29348a(r0, r1, r7)
            r1.mo15002m0()
            goto L_0x01d9
        L_0x01b2:
            int r8 = r8.mo12626a()
            boolean r0 = androidx.compose.material3.C8208h0.m27132f(r0, r8)
            if (r0 == 0) goto L_0x01d0
            r0 = 933109624(0x379e1f78, float:1.8849722E-5)
            r1.mo14918M(r0)
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13056i()
            java.lang.String r5 = androidx.compose.material3.C8357u2.m29348a(r0, r1, r7)
            r1.mo15002m0()
            goto L_0x01d9
        L_0x01d0:
            r0 = -1138370496(0xffffffffbc25d840, float:-0.010122359)
            r1.mo14918M(r0)
            r1.mo15002m0()
        L_0x01d9:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r13] = r4
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = java.lang.String.format(r5, r0)
            java.lang.String r4 = "format(this, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r4)
            boolean r4 = r1.mo15006n0(r0)
            java.lang.Object r5 = r1.mo14921N()
            if (r4 != 0) goto L_0x0202
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r5 != r4) goto L_0x020a
        L_0x0202:
            androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$1$1$1 r5 = new androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$1$1$1
            r5.<init>(r0)
            r1.mo14893C(r5)
        L_0x020a:
            r1.mo15002m0()
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            r0 = 0
            androidx.compose.ui.m r13 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r12, r13, r5, r6, r0)
            r14 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 1
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 3072(0xc00, float:4.305E-42)
            r36 = 122876(0x1dffc, float:1.72186E-40)
            r5 = r12
            r12 = r3
            r33 = r1
            androidx.compose.material3.TextKt.m26700c(r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0073
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x0073
        L_0x024b:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x0252
            goto L_0x0265
        L_0x0252:
            androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$2 r8 = new androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$2
            r0 = r8
            r1 = r37
            r2 = r38
            r3 = r39
            r5 = r42
            r6 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0265:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.mo11345a(androidx.compose.material3.DatePickerState, androidx.compose.material3.d0, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11346b(@org.jetbrains.annotations.C12579k androidx.compose.material3.DatePickerState r30, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r32, int r33, int r34) {
        /*
            r29 = this;
            r2 = r30
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = -1157401173(0xffffffffbb0375ab, float:-0.002005915)
            r1 = r32
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r34 & 1
            if (r3 == 0) goto L_0x0017
            r3 = r33 | 6
            goto L_0x0029
        L_0x0017:
            r3 = r33 & 14
            if (r3 != 0) goto L_0x0027
            boolean r3 = r1.mo15006n0(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r33 | r3
            goto L_0x0029
        L_0x0027:
            r3 = r33
        L_0x0029:
            r4 = r34 & 2
            if (r4 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r5 = r33 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0043
            r5 = r31
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r3 = r3 | r6
            goto L_0x0045
        L_0x0043:
            r5 = r31
        L_0x0045:
            r15 = r3
            r3 = r15 & 91
            r6 = 18
            if (r3 != r6) goto L_0x0059
            boolean r3 = r1.mo15011p()
            if (r3 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            r1.mo14958a0()
            r3 = r5
            goto L_0x0116
        L_0x0059:
            if (r4 == 0) goto L_0x0060
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r28 = r3
            goto L_0x0062
        L_0x0060:
            r28 = r5
        L_0x0062:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x006e
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:419)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r15, r3, r4)
        L_0x006e:
            int r0 = r30.mo11432a()
            androidx.compose.material3.h0$a r3 = androidx.compose.material3.C8208h0.f20150b
            int r4 = r3.mo12627b()
            boolean r4 = androidx.compose.material3.C8208h0.m27132f(r0, r4)
            r5 = 6
            if (r4 == 0) goto L_0x00bc
            r0 = -2065111000(0xffffffff84e8e828, float:-5.475614E-36)
            r1.mo14918M(r0)
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13016B()
            java.lang.String r3 = androidx.compose.material3.C8357u2.m29348a(r0, r1, r5)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r0 = 0
            r4 = r15
            r15 = r0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r4 & 112(0x70, float:1.57E-43)
            r26 = 0
            r27 = 131068(0x1fffc, float:1.83665E-40)
            r4 = r28
            r24 = r1
            androidx.compose.material3.TextKt.m26700c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.mo15002m0()
            goto L_0x010b
        L_0x00bc:
            r4 = r15
            int r3 = r3.mo12626a()
            boolean r0 = androidx.compose.material3.C8208h0.m27132f(r0, r3)
            if (r0 == 0) goto L_0x0102
            r0 = -2065110842(0xffffffff84e8e8c6, float:-5.4756707E-36)
            r1.mo14918M(r0)
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13066o()
            java.lang.String r3 = androidx.compose.material3.C8357u2.m29348a(r0, r1, r5)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r4 & 112(0x70, float:1.57E-43)
            r26 = 0
            r27 = 131068(0x1fffc, float:1.83665E-40)
            r4 = r28
            r24 = r1
            androidx.compose.material3.TextKt.m26700c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.mo15002m0()
            goto L_0x010b
        L_0x0102:
            r0 = -2065110710(0xffffffff84e8e94a, float:-5.475718E-36)
            r1.mo14918M(r0)
            r1.mo15002m0()
        L_0x010b:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0114
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0114:
            r3 = r28
        L_0x0116:
            androidx.compose.runtime.t1 r6 = r1.mo15020s()
            if (r6 != 0) goto L_0x011d
            goto L_0x012e
        L_0x011d:
            androidx.compose.material3.DatePickerDefaults$DatePickerTitle$1 r7 = new androidx.compose.material3.DatePickerDefaults$DatePickerTitle$1
            r0 = r7
            r1 = r29
            r2 = r30
            r4 = r33
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.mo11346b(androidx.compose.material3.DatePickerState, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C8180c0 mo11347c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @C12580l C8592o oVar, int i, int i2, int i3) {
        C8592o oVar2 = oVar;
        int i4 = i3;
        oVar2.mo14918M(543433842);
        long k = (i4 & 1) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13726a(), oVar2, 6) : j;
        long k2 = (i4 & 2) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13749x(), oVar2, 6) : j2;
        long k3 = (i4 & 4) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13747v(), oVar2, 6) : j3;
        long k4 = (i4 & 8) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13724S(), oVar2, 6) : j4;
        long k5 = (i4 & 16) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13712G(), oVar2, 6) : j5;
        long k6 = (i4 & 32) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13723R(), oVar2, 6) : j6;
        long k7 = (i4 & 64) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13743r(), oVar2, 6) : j7;
        long k8 = (i4 & 128) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13719N(), oVar2, 6) : j8;
        long k9 = (i4 & 256) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13718M(), oVar2, 6) : j9;
        long k10 = (i4 & 512) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13744s(), oVar2, 6) : j10;
        long w = (i4 & 1024) != 0 ? C15240j2.m66080w(k10, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long k11 = (i4 & 2048) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13737l(), oVar2, 6) : j12;
        long w2 = (i4 & 4096) != 0 ? C15240j2.m66080w(k11, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long k12 = (i4 & 8192) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13736k(), oVar2, 6) : j14;
        long w3 = (i4 & 16384) != 0 ? C15240j2.m66080w(k12, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long k13 = (32768 & i4) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13743r(), oVar2, 6) : j16;
        long k14 = (65536 & i4) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13741p(), oVar2, 6) : j17;
        long k15 = (131072 & i4) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13714I(), oVar2, 6) : j18;
        long k16 = (i4 & 262144) != 0 ? ColorSchemeKt.m25524k(C8310i.f21329a.mo13751z(), oVar2, 6) : j19;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(543433842, i, i2, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:358)");
        }
        C8180c0 c0Var = new C8180c0(k, k2, k3, k4, k5, k6, k7, k8, k9, k10, w, k11, w2, k12, w3, k13, k14, k16, k15, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c0Var;
    }

    @C8540g
    @C11314h(name = "getShape")
    @C12579k
    /* renamed from: d */
    public final C15218g4 mo11348d(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(700927667);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(700927667, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:518)");
        }
        C15218g4 f = ShapesKt.m26127f(C8310i.f21329a.mo13729d(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    /* renamed from: e */
    public final float mo11349e() {
        return f19306c;
    }

    @C12579k
    /* renamed from: f */
    public final C11466l mo11350f() {
        return f19305b;
    }

    @C8540g
    @C12579k
    /* renamed from: g */
    public final C2195g mo11351g(@C12579k LazyListState lazyListState, @C12580l C2013v<Float> vVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        oVar.mo14918M(-2036003494);
        if ((i2 & 2) != 0) {
            vVar = C2017x.m8657d(0.0f, 0.0f, 3, (Object) null);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2036003494, i, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:496)");
        }
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(dVar);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new SnapFlingBehavior(lazyListState, vVar, C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null), dVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return snapFlingBehavior;
    }
}
