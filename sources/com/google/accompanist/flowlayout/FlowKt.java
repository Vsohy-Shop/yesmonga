package com.google.accompanist.flowlayout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.urbanairship.util.C9647e0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flow.kt\ncom/google/accompanist/flowlayout/FlowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,334:1\n154#2:335\n154#2:336\n154#2:337\n154#2:338\n74#3:339\n75#3,11:341\n88#3:366\n76#4:340\n456#5,14:352\n*S KotlinDebug\n*F\n+ 1 Flow.kt\ncom/google/accompanist/flowlayout/FlowKt\n*L\n51#1:335\n53#1:336\n89#1:337\n91#1:338\n148#1:339\n148#1:341,11\n148#1:366\n148#1:340\n148#1:352,14\n*E\n"})
public final class FlowKt {
    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m64328a(C8767m mVar, LayoutOrientation layoutOrientation, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f, FlowCrossAxisAlignment flowCrossAxisAlignment, float f2, MainAxisAlignment mainAxisAlignment2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        int i2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        int i3 = i;
        C8592o o = oVar.mo15009o(-1567419051);
        if ((i3 & 14) == 0) {
            i2 = (o.mo15006n0(mVar) ? 4 : 2) | i3;
        } else {
            C8767m mVar2 = mVar;
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= o.mo15006n0(layoutOrientation) ? 32 : 16;
        } else {
            LayoutOrientation layoutOrientation2 = layoutOrientation;
        }
        if ((i3 & 896) == 0) {
            i2 |= o.mo15006n0(sizeMode) ? 256 : 128;
        } else {
            SizeMode sizeMode2 = sizeMode;
        }
        if ((i3 & 7168) == 0) {
            i2 |= o.mo15006n0(mainAxisAlignment) ? 2048 : 1024;
        } else {
            MainAxisAlignment mainAxisAlignment3 = mainAxisAlignment;
        }
        if ((57344 & i3) == 0) {
            i2 |= o.mo14968d(f) ? 16384 : 8192;
        } else {
            float f3 = f;
        }
        if ((458752 & i3) == 0) {
            i2 |= o.mo15006n0(flowCrossAxisAlignment) ? 131072 : 65536;
        } else {
            FlowCrossAxisAlignment flowCrossAxisAlignment2 = flowCrossAxisAlignment;
        }
        float f4 = f2;
        if ((3670016 & i3) == 0) {
            i2 |= o.mo14968d(f4) ? 1048576 : 524288;
        }
        MainAxisAlignment mainAxisAlignment4 = mainAxisAlignment2;
        if ((29360128 & i3) == 0) {
            i2 |= o.mo15006n0(mainAxisAlignment4) ? 8388608 : 4194304;
        }
        if ((234881024 & i3) == 0) {
            i2 |= o.mo14927P(pVar2) ? C8698y1.f23302n : C9647e0.f26435a;
        }
        if ((191739611 & i2) != 38347922 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1567419051, i2, -1, "com.google.accompanist.flowlayout.Flow (Flow.kt:131)");
            }
            FlowKt$Flow$1 flowKt$Flow$1 = new FlowKt$Flow$1(layoutOrientation, f, sizeMode, f2, mainAxisAlignment, mainAxisAlignment2, flowCrossAxisAlignment);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(mVar);
            int i4 = (((((i2 << 3) & 112) | ((i2 >> 24) & 14)) << 9) & 7168) | 6;
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
            Updater.m30188j(b, flowKt$Flow$1, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i4 >> 3) & 112));
            o.mo14918M(2058660585);
            pVar2.invoke(o, Integer.valueOf((i4 >> 9) & 14));
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
            s.mo15202a(new FlowKt$Flow$2(mVar, layoutOrientation, sizeMode, mainAxisAlignment, f, flowCrossAxisAlignment, f2, mainAxisAlignment2, pVar, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011a  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64329b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, @org.jetbrains.annotations.C12580l com.google.accompanist.flowlayout.SizeMode r27, @org.jetbrains.annotations.C12580l com.google.accompanist.flowlayout.MainAxisAlignment r28, float r29, @org.jetbrains.annotations.C12580l com.google.accompanist.flowlayout.FlowCrossAxisAlignment r30, float r31, @org.jetbrains.annotations.C12580l com.google.accompanist.flowlayout.MainAxisAlignment r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r11 = r33
            r12 = r35
            r13 = r36
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 203669733(0xc23c0e5, float:1.261511E-31)
            r1 = r34
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x001e
            r2 = r12 | 6
            r3 = r2
            r2 = r26
            goto L_0x0032
        L_0x001e:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x002f
            r2 = r26
            boolean r3 = r14.mo15006n0(r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r12
            goto L_0x0032
        L_0x002f:
            r2 = r26
            r3 = r12
        L_0x0032:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r27
            boolean r6 = r14.mo15006n0(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r27
        L_0x004e:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r28
            boolean r8 = r14.mo15006n0(r7)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r8
            goto L_0x006a
        L_0x0068:
            r7 = r28
        L_0x006a:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x0071
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0084
            r9 = r29
            boolean r10 = r14.mo14968d(r9)
            if (r10 == 0) goto L_0x0080
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r3 = r3 | r10
            goto L_0x0086
        L_0x0084:
            r9 = r29
        L_0x0086:
            r10 = r13 & 16
            r15 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x0092
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r15 = r30
            goto L_0x00a5
        L_0x0092:
            r16 = r12 & r15
            r15 = r30
            if (r16 != 0) goto L_0x00a5
            boolean r16 = r14.mo15006n0(r15)
            if (r16 == 0) goto L_0x00a1
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r3 = r3 | r16
        L_0x00a5:
            r16 = r13 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00b2
            r18 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r18
            r0 = r31
            goto L_0x00c5
        L_0x00b2:
            r18 = r12 & r17
            r0 = r31
            if (r18 != 0) goto L_0x00c5
            boolean r19 = r14.mo14968d(r0)
            if (r19 == 0) goto L_0x00c1
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r3 = r3 | r19
        L_0x00c5:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r20 = r12 & r19
            if (r20 != 0) goto L_0x00df
            r20 = r13 & 64
            r0 = r32
            if (r20 != 0) goto L_0x00da
            boolean r20 = r14.mo15006n0(r0)
            if (r20 == 0) goto L_0x00da
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r3 = r3 | r20
            goto L_0x00e1
        L_0x00df:
            r0 = r32
        L_0x00e1:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00eb
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e9:
            r3 = r3 | r0
            goto L_0x00fb
        L_0x00eb:
            r0 = r12 & r20
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r14.mo14927P(r11)
            if (r0 == 0) goto L_0x00f8
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00f8:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e9
        L_0x00fb:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r3
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x011a
            boolean r0 = r14.mo15011p()
            if (r0 != 0) goto L_0x010b
            goto L_0x011a
        L_0x010b:
            r14.mo14958a0()
            r1 = r26
            r6 = r31
            r2 = r5
            r3 = r7
            r4 = r9
            r5 = r15
            r7 = r32
            goto L_0x01e2
        L_0x011a:
            r14.mo14930Q()
            r0 = r12 & 1
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r0 == 0) goto L_0x0142
            boolean r0 = r14.mo14977f0()
            if (r0 == 0) goto L_0x012b
            goto L_0x0142
        L_0x012b:
            r14.mo14958a0()
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0133
            r3 = r3 & r2
        L_0x0133:
            r24 = r31
            r25 = r32
            r16 = r5
            r21 = r7
            r22 = r9
            r23 = r15
            r15 = r26
            goto L_0x0186
        L_0x0142:
            if (r1 == 0) goto L_0x0147
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0149
        L_0x0147:
            r0 = r26
        L_0x0149:
            if (r4 == 0) goto L_0x014e
            com.google.accompanist.flowlayout.SizeMode r1 = com.google.accompanist.flowlayout.SizeMode.Wrap
            r5 = r1
        L_0x014e:
            if (r6 == 0) goto L_0x0153
            com.google.accompanist.flowlayout.MainAxisAlignment r1 = com.google.accompanist.flowlayout.MainAxisAlignment.Start
            r7 = r1
        L_0x0153:
            r1 = 0
            if (r8 == 0) goto L_0x015c
            float r4 = (float) r1
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r9 = r4
        L_0x015c:
            if (r10 == 0) goto L_0x0161
            com.google.accompanist.flowlayout.FlowCrossAxisAlignment r4 = com.google.accompanist.flowlayout.FlowCrossAxisAlignment.Start
            r15 = r4
        L_0x0161:
            if (r16 == 0) goto L_0x0169
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            goto L_0x016b
        L_0x0169:
            r1 = r31
        L_0x016b:
            r4 = r13 & 64
            if (r4 == 0) goto L_0x0179
            r3 = r3 & r2
            r24 = r1
            r16 = r5
            r21 = r7
            r25 = r21
            goto L_0x0181
        L_0x0179:
            r25 = r32
            r24 = r1
            r16 = r5
            r21 = r7
        L_0x0181:
            r22 = r9
            r23 = r15
            r15 = r0
        L_0x0186:
            r14.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0198
            r0 = -1
            java.lang.String r1 = "com.google.accompanist.flowlayout.FlowColumn (Flow.kt:84)"
            r2 = 203669733(0xc23c0e5, float:1.261511E-31)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r0, r1)
        L_0x0198:
            com.google.accompanist.flowlayout.LayoutOrientation r1 = com.google.accompanist.flowlayout.LayoutOrientation.Vertical
            r0 = r3 & 14
            r0 = r0 | 48
            int r2 = r3 << 3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = r2 & r17
            r0 = r0 | r3
            r3 = r2 & r19
            r0 = r0 | r3
            r3 = r2 & r20
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r10 = r0 | r2
            r0 = r15
            r2 = r16
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r33
            r9 = r14
            m64328a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01d5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d5:
            r1 = r15
            r2 = r16
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
        L_0x01e2:
            androidx.compose.runtime.t1 r14 = r14.mo15020s()
            if (r14 != 0) goto L_0x01e9
            goto L_0x01f8
        L_0x01e9:
            com.google.accompanist.flowlayout.FlowKt$FlowColumn$1 r15 = new com.google.accompanist.flowlayout.FlowKt$FlowColumn$1
            r0 = r15
            r8 = r33
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo15202a(r15)
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.flowlayout.FlowKt.m64329b(androidx.compose.ui.m, com.google.accompanist.flowlayout.SizeMode, com.google.accompanist.flowlayout.MainAxisAlignment, float, com.google.accompanist.flowlayout.FlowCrossAxisAlignment, float, com.google.accompanist.flowlayout.MainAxisAlignment, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011a  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64330c(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, @org.jetbrains.annotations.C12580l com.google.accompanist.flowlayout.SizeMode r27, @org.jetbrains.annotations.C12580l com.google.accompanist.flowlayout.MainAxisAlignment r28, float r29, @org.jetbrains.annotations.C12580l com.google.accompanist.flowlayout.FlowCrossAxisAlignment r30, float r31, @org.jetbrains.annotations.C12580l com.google.accompanist.flowlayout.MainAxisAlignment r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r11 = r33
            r12 = r35
            r13 = r36
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -137566119(0xfffffffff7cce859, float:-8.31204E33)
            r1 = r34
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x001e
            r2 = r12 | 6
            r3 = r2
            r2 = r26
            goto L_0x0032
        L_0x001e:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x002f
            r2 = r26
            boolean r3 = r14.mo15006n0(r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r12
            goto L_0x0032
        L_0x002f:
            r2 = r26
            r3 = r12
        L_0x0032:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r27
            boolean r6 = r14.mo15006n0(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r27
        L_0x004e:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r28
            boolean r8 = r14.mo15006n0(r7)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r8
            goto L_0x006a
        L_0x0068:
            r7 = r28
        L_0x006a:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x0071
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0084
            r9 = r29
            boolean r10 = r14.mo14968d(r9)
            if (r10 == 0) goto L_0x0080
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r3 = r3 | r10
            goto L_0x0086
        L_0x0084:
            r9 = r29
        L_0x0086:
            r10 = r13 & 16
            r15 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x0092
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r15 = r30
            goto L_0x00a5
        L_0x0092:
            r16 = r12 & r15
            r15 = r30
            if (r16 != 0) goto L_0x00a5
            boolean r16 = r14.mo15006n0(r15)
            if (r16 == 0) goto L_0x00a1
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r3 = r3 | r16
        L_0x00a5:
            r16 = r13 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00b2
            r18 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r18
            r0 = r31
            goto L_0x00c5
        L_0x00b2:
            r18 = r12 & r17
            r0 = r31
            if (r18 != 0) goto L_0x00c5
            boolean r19 = r14.mo14968d(r0)
            if (r19 == 0) goto L_0x00c1
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r3 = r3 | r19
        L_0x00c5:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r20 = r12 & r19
            if (r20 != 0) goto L_0x00df
            r20 = r13 & 64
            r0 = r32
            if (r20 != 0) goto L_0x00da
            boolean r20 = r14.mo15006n0(r0)
            if (r20 == 0) goto L_0x00da
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r3 = r3 | r20
            goto L_0x00e1
        L_0x00df:
            r0 = r32
        L_0x00e1:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00eb
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e9:
            r3 = r3 | r0
            goto L_0x00fb
        L_0x00eb:
            r0 = r12 & r20
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r14.mo14927P(r11)
            if (r0 == 0) goto L_0x00f8
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00f8:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e9
        L_0x00fb:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r3
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x011a
            boolean r0 = r14.mo15011p()
            if (r0 != 0) goto L_0x010b
            goto L_0x011a
        L_0x010b:
            r14.mo14958a0()
            r1 = r26
            r6 = r31
            r2 = r5
            r3 = r7
            r4 = r9
            r5 = r15
            r7 = r32
            goto L_0x01e2
        L_0x011a:
            r14.mo14930Q()
            r0 = r12 & 1
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r0 == 0) goto L_0x0142
            boolean r0 = r14.mo14977f0()
            if (r0 == 0) goto L_0x012b
            goto L_0x0142
        L_0x012b:
            r14.mo14958a0()
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0133
            r3 = r3 & r2
        L_0x0133:
            r24 = r31
            r25 = r32
            r16 = r5
            r21 = r7
            r22 = r9
            r23 = r15
            r15 = r26
            goto L_0x0186
        L_0x0142:
            if (r1 == 0) goto L_0x0147
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0149
        L_0x0147:
            r0 = r26
        L_0x0149:
            if (r4 == 0) goto L_0x014e
            com.google.accompanist.flowlayout.SizeMode r1 = com.google.accompanist.flowlayout.SizeMode.Wrap
            r5 = r1
        L_0x014e:
            if (r6 == 0) goto L_0x0153
            com.google.accompanist.flowlayout.MainAxisAlignment r1 = com.google.accompanist.flowlayout.MainAxisAlignment.Start
            r7 = r1
        L_0x0153:
            r1 = 0
            if (r8 == 0) goto L_0x015c
            float r4 = (float) r1
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r9 = r4
        L_0x015c:
            if (r10 == 0) goto L_0x0161
            com.google.accompanist.flowlayout.FlowCrossAxisAlignment r4 = com.google.accompanist.flowlayout.FlowCrossAxisAlignment.Start
            r15 = r4
        L_0x0161:
            if (r16 == 0) goto L_0x0169
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            goto L_0x016b
        L_0x0169:
            r1 = r31
        L_0x016b:
            r4 = r13 & 64
            if (r4 == 0) goto L_0x0179
            r3 = r3 & r2
            r24 = r1
            r16 = r5
            r21 = r7
            r25 = r21
            goto L_0x0181
        L_0x0179:
            r25 = r32
            r24 = r1
            r16 = r5
            r21 = r7
        L_0x0181:
            r22 = r9
            r23 = r15
            r15 = r0
        L_0x0186:
            r14.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0198
            r0 = -1
            java.lang.String r1 = "com.google.accompanist.flowlayout.FlowRow (Flow.kt:46)"
            r2 = -137566119(0xfffffffff7cce859, float:-8.31204E33)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r0, r1)
        L_0x0198:
            com.google.accompanist.flowlayout.LayoutOrientation r1 = com.google.accompanist.flowlayout.LayoutOrientation.Horizontal
            r0 = r3 & 14
            r0 = r0 | 48
            int r2 = r3 << 3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = r2 & r17
            r0 = r0 | r3
            r3 = r2 & r19
            r0 = r0 | r3
            r3 = r2 & r20
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r10 = r0 | r2
            r0 = r15
            r2 = r16
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r33
            r9 = r14
            m64328a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01d5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d5:
            r1 = r15
            r2 = r16
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
        L_0x01e2:
            androidx.compose.runtime.t1 r14 = r14.mo15020s()
            if (r14 != 0) goto L_0x01e9
            goto L_0x01f8
        L_0x01e9:
            com.google.accompanist.flowlayout.FlowKt$FlowRow$1 r15 = new com.google.accompanist.flowlayout.FlowKt$FlowRow$1
            r0 = r15
            r8 = r33
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo15202a(r15)
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.flowlayout.FlowKt.m64330c(androidx.compose.ui.m, com.google.accompanist.flowlayout.SizeMode, com.google.accompanist.flowlayout.MainAxisAlignment, float, com.google.accompanist.flowlayout.FlowCrossAxisAlignment, float, com.google.accompanist.flowlayout.MainAxisAlignment, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: d */
    public static final int m64331d(C15611w0 w0Var, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? w0Var.mo44468G0() : w0Var.mo44471K0();
    }

    /* renamed from: e */
    public static final int m64332e(C15611w0 w0Var, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? w0Var.mo44471K0() : w0Var.mo44468G0();
    }
}
