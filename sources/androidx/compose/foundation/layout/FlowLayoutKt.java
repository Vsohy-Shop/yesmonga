package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C11079d2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10953k0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,724:1\n75#2:725\n76#2,11:727\n89#2:754\n75#2:755\n76#2,11:757\n89#2:784\n76#3:726\n76#3:756\n460#4,16:738\n460#4,16:768\n36#4:785\n36#4:792\n36#4:799\n67#4,3:806\n66#4:809\n36#4:816\n67#4,3:823\n66#4:826\n1057#5,6:786\n1057#5,6:793\n1057#5,6:800\n1057#5,6:810\n1057#5,6:817\n1057#5,6:827\n49#6,6:833\n49#6,6:840\n1#7:839\n1182#8:846\n1161#8,2:847\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n66#1:725\n66#1:727,11\n66#1:754\n116#1:755\n116#1:757,11\n116#1:784\n66#1:726\n116#1:756\n66#1:738,16\n116#1:768,16\n126#1:785\n137#1:792\n165#1:799\n168#1:806,3\n168#1:809\n188#1:816\n191#1:823,3\n191#1:826\n126#1:786,6\n137#1:793,6\n165#1:800,6\n168#1:810,6\n188#1:817,6\n191#1:827,6\n427#1:833,6\n542#1:840,6\n580#1:846\n580#1:847,2\n*E\n"})
public final class FlowLayoutKt {
    @C12579k

    /* renamed from: a */
    public static final C11306r<Integer, int[], C15568h0, int[], C11079d2> f6064a = FlowLayoutKt$crossAxisRowArrangement$1.f6067f;
    @C12579k

    /* renamed from: b */
    public static final C11306r<Integer, int[], C15568h0, int[], C11079d2> f6065b = FlowLayoutKt$crossAxisColumnArrangement$1.f6066f;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.foundation.layout.C2396p
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m9893a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r16, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.Arrangement.C2279l r17, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8736b r18, int r19, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r5 = r20
            r6 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = -310290901(0xffffffffed81562b, float:-5.003467E27)
            r1 = r21
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r6 | 6
            r4 = r3
            r3 = r16
            goto L_0x0030
        L_0x001c:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r16
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r6
            goto L_0x0030
        L_0x002d:
            r3 = r16
            r4 = r6
        L_0x0030:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x004a
        L_0x0037:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r17
            boolean r9 = r1.mo15006n0(r8)
            if (r9 == 0) goto L_0x0046
            r9 = 32
            goto L_0x0048
        L_0x0046:
            r9 = 16
        L_0x0048:
            r4 = r4 | r9
            goto L_0x004c
        L_0x004a:
            r8 = r17
        L_0x004c:
            r9 = r23 & 4
            if (r9 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r10 = r6 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r18
            boolean r11 = r1.mo15006n0(r10)
            if (r11 == 0) goto L_0x0062
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r11
            goto L_0x0068
        L_0x0066:
            r10 = r18
        L_0x0068:
            r11 = r23 & 8
            if (r11 == 0) goto L_0x006f
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r12 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r19
            boolean r13 = r1.mo14976f(r12)
            if (r13 == 0) goto L_0x007e
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r4 = r4 | r13
            goto L_0x0084
        L_0x0082:
            r12 = r19
        L_0x0084:
            r13 = r23 & 16
            if (r13 == 0) goto L_0x008b
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r6
            if (r13 != 0) goto L_0x009d
            boolean r13 = r1.mo15006n0(r5)
            if (r13 == 0) goto L_0x009a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r4 = r4 | r13
        L_0x009d:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b3
            boolean r13 = r1.mo15011p()
            if (r13 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r1.mo14958a0()
            r2 = r8
            r4 = r12
            goto L_0x01b0
        L_0x00b3:
            if (r2 == 0) goto L_0x00b8
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00b9
        L_0x00b8:
            r2 = r3
        L_0x00b9:
            if (r7 == 0) goto L_0x00c2
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r3 = r3.mo7631r()
            goto L_0x00c3
        L_0x00c2:
            r3 = r8
        L_0x00c3:
            if (r9 == 0) goto L_0x00cd
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r7 = r7.mo17072u()
            r13 = r7
            goto L_0x00ce
        L_0x00cd:
            r13 = r10
        L_0x00ce:
            if (r11 == 0) goto L_0x00d5
            r7 = 2147483647(0x7fffffff, float:NaN)
            r14 = r7
            goto L_0x00d6
        L_0x00d5:
            r14 = r12
        L_0x00d6:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00e2
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:103)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r7, r8)
        L_0x00e2:
            int r0 = r4 >> 3
            r7 = r0 & 14
            r8 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            r0 = r0 & 896(0x380, float:1.256E-42)
            r11 = r7 | r0
            r12 = 0
            r7 = r3
            r8 = r13
            r9 = r14
            r10 = r1
            androidx.compose.ui.layout.f0 r0 = m9899g(r7, r8, r9, r10, r11, r12)
            int r7 = r4 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r15 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 6
            r16 = r2
            androidx.compose.runtime.d r2 = r1.mo15017r()
            boolean r2 = r2 instanceof androidx.compose.runtime.C8428d
            if (r2 != 0) goto L_0x013b
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x013b:
            r1.mo14938T()
            boolean r2 = r1.mo14997l()
            if (r2 == 0) goto L_0x0148
            r1.mo14947W(r12)
            goto L_0x014b
        L_0x0148:
            r1.mo14888A()
        L_0x014b:
            r1.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r12 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r0, r12)
            kotlin.jvm.functions.p r0 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r8, r0)
            kotlin.jvm.functions.p r0 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r9, r0)
            kotlin.jvm.functions.p r0 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r10, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            int r2 = r7 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15.invoke(r0, r1, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r2 = r4 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.invoke(r0, r1, r2)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ab
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ab:
            r2 = r3
            r10 = r13
            r4 = r14
            r3 = r16
        L_0x01b0:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x01b7
            goto L_0x01c8
        L_0x01b7:
            androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$2 r9 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$2
            r0 = r9
            r1 = r3
            r3 = r10
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.m9893a(androidx.compose.ui.m, androidx.compose.foundation.layout.Arrangement$l, androidx.compose.ui.c$b, int, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.foundation.layout.C2396p
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m9894b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r16, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.Arrangement.C2269d r17, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8737c r18, int r19, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r5 = r20
            r6 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1098475987(0x417969d3, float:15.588336)
            r1 = r21
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r6 | 6
            r4 = r3
            r3 = r16
            goto L_0x0030
        L_0x001c:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r16
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r6
            goto L_0x0030
        L_0x002d:
            r3 = r16
            r4 = r6
        L_0x0030:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x004a
        L_0x0037:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r17
            boolean r9 = r1.mo15006n0(r8)
            if (r9 == 0) goto L_0x0046
            r9 = 32
            goto L_0x0048
        L_0x0046:
            r9 = 16
        L_0x0048:
            r4 = r4 | r9
            goto L_0x004c
        L_0x004a:
            r8 = r17
        L_0x004c:
            r9 = r23 & 4
            if (r9 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r10 = r6 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r18
            boolean r11 = r1.mo15006n0(r10)
            if (r11 == 0) goto L_0x0062
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r11
            goto L_0x0068
        L_0x0066:
            r10 = r18
        L_0x0068:
            r11 = r23 & 8
            if (r11 == 0) goto L_0x006f
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r12 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r19
            boolean r13 = r1.mo14976f(r12)
            if (r13 == 0) goto L_0x007e
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r4 = r4 | r13
            goto L_0x0084
        L_0x0082:
            r12 = r19
        L_0x0084:
            r13 = r23 & 16
            if (r13 == 0) goto L_0x008b
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r6
            if (r13 != 0) goto L_0x009d
            boolean r13 = r1.mo15006n0(r5)
            if (r13 == 0) goto L_0x009a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r4 = r4 | r13
        L_0x009d:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b3
            boolean r13 = r1.mo15011p()
            if (r13 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r1.mo14958a0()
            r2 = r8
            r4 = r12
            goto L_0x01b0
        L_0x00b3:
            if (r2 == 0) goto L_0x00b8
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00b9
        L_0x00b8:
            r2 = r3
        L_0x00b9:
            if (r7 == 0) goto L_0x00c2
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r3 = r3.mo7630p()
            goto L_0x00c3
        L_0x00c2:
            r3 = r8
        L_0x00c3:
            if (r9 == 0) goto L_0x00cd
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r7 = r7.mo17073w()
            r13 = r7
            goto L_0x00ce
        L_0x00cd:
            r13 = r10
        L_0x00ce:
            if (r11 == 0) goto L_0x00d5
            r7 = 2147483647(0x7fffffff, float:NaN)
            r14 = r7
            goto L_0x00d6
        L_0x00d5:
            r14 = r12
        L_0x00d6:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00e2
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:53)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r7, r8)
        L_0x00e2:
            int r0 = r4 >> 3
            r7 = r0 & 14
            r8 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            r0 = r0 & 896(0x380, float:1.256E-42)
            r11 = r7 | r0
            r12 = 0
            r7 = r3
            r8 = r13
            r9 = r14
            r10 = r1
            androidx.compose.ui.layout.f0 r0 = m9912t(r7, r8, r9, r10, r11, r12)
            int r7 = r4 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r15 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 6
            r16 = r2
            androidx.compose.runtime.d r2 = r1.mo15017r()
            boolean r2 = r2 instanceof androidx.compose.runtime.C8428d
            if (r2 != 0) goto L_0x013b
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x013b:
            r1.mo14938T()
            boolean r2 = r1.mo14997l()
            if (r2 == 0) goto L_0x0148
            r1.mo14947W(r12)
            goto L_0x014b
        L_0x0148:
            r1.mo14888A()
        L_0x014b:
            r1.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r12 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r0, r12)
            kotlin.jvm.functions.p r0 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r8, r0)
            kotlin.jvm.functions.p r0 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r9, r0)
            kotlin.jvm.functions.p r0 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r10, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            int r2 = r7 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15.invoke(r0, r1, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            int r2 = r4 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.invoke(r0, r1, r2)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ab
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ab:
            r2 = r3
            r10 = r13
            r4 = r14
            r3 = r16
        L_0x01b0:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x01b7
            goto L_0x01c8
        L_0x01b7:
            androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2 r9 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
            r0 = r9
            r1 = r3
            r3 = r10
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.m9894b(androidx.compose.ui.m, androidx.compose.foundation.layout.Arrangement$d, androidx.compose.ui.c$c, int, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.layout.C2406s m9898f(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15568h0 r22, @org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2407s0 r23, @org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.LayoutOrientation r24, @org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2363h0 r25, int r26) {
        /*
            r6 = r22
            r0 = r24
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = "measureHelper"
            r7 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "constraints"
            r8 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            androidx.compose.runtime.collection.g r9 = new androidx.compose.runtime.collection.g
            r1 = 16
            androidx.compose.foundation.layout.r0[] r1 = new androidx.compose.foundation.layout.C2404r0[r1]
            r2 = 0
            r9.<init>(r1, r2)
            int r1 = r25.mo8078i()
            int r3 = r25.mo8079j()
            int r4 = r25.mo8075g()
            java.util.List r5 = r23.mo8170g()
            androidx.compose.ui.layout.w0[] r10 = r23.mo8172i()
            float r11 = r23.mo8166c()
            float r11 = r6.mo7425g5(r11)
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            float r11 = (float) r11
            int r11 = (int) r11
            androidx.compose.foundation.layout.h0 r12 = new androidx.compose.foundation.layout.h0
            r12.<init>(r3, r1, r2, r4)
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40559R2(r5, r2)
            androidx.compose.ui.layout.e0 r4 = (androidx.compose.p004ui.layout.C15557e0) r4
            if (r4 == 0) goto L_0x0064
            androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1 r14 = new androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1
            r14.<init>(r10)
            int r4 = m9910r(r4, r12, r0, r14)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            int r14 = r5.size()
            java.lang.Integer[] r15 = new java.lang.Integer[r14]
            int r14 = r5.size()
            r18 = r1
            r13 = r2
            r17 = r13
            r19 = r17
            r20 = r19
        L_0x0078:
            if (r13 >= r14) goto L_0x00e9
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r4 = r4.intValue()
            int r2 = r17 + r4
            int r18 = r18 - r4
            int r4 = r13 + 1
            java.lang.Object r17 = kotlin.collections.CollectionsKt___CollectionsKt.m40559R2(r5, r4)
            r21 = r1
            r1 = r17
            androidx.compose.ui.layout.e0 r1 = (androidx.compose.p004ui.layout.C15557e0) r1
            if (r1 == 0) goto L_0x00a2
            androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1 r6 = new androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1
            r6.<init>(r10, r13)
            int r1 = m9910r(r1, r12, r0, r6)
            int r1 = r1 + r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            int r6 = r5.size()
            if (r4 >= r6) goto L_0x00bf
            int r6 = r4 - r19
            r13 = r26
            if (r6 >= r13) goto L_0x00c1
            if (r1 == 0) goto L_0x00b6
            int r6 = r1.intValue()
            goto L_0x00b7
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            int r6 = r18 - r6
            if (r6 >= 0) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            r17 = r2
            goto L_0x00e1
        L_0x00bf:
            r13 = r26
        L_0x00c1:
            int r2 = java.lang.Math.max(r3, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r15[r20] = r3
            int r20 = r20 + 1
            if (r1 == 0) goto L_0x00d9
            int r1 = r1.intValue()
            int r1 = r1 - r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            r3 = r2
            r19 = r4
            r18 = r21
            r17 = 0
        L_0x00e1:
            r2 = 0
            r6 = r22
            r13 = r4
            r4 = r1
            r1 = r21
            goto L_0x0078
        L_0x00e9:
            r14 = 0
            r1 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            r13 = r3
            r6 = r15
            r15 = r1
            androidx.compose.foundation.layout.h0 r1 = androidx.compose.foundation.layout.C2363h0.m10414f(r12, r13, r14, r15, r16, r17, r18)
            long r10 = r1.mo8083n(r0)
            r0 = 0
            java.lang.Object r1 = kotlin.collections.ArraysKt___ArraysKt.m40121qf(r6, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r4 = r0
            r13 = r4
            r14 = r13
            r12 = r1
            r15 = r3
        L_0x0108:
            if (r12 == 0) goto L_0x0135
            int r5 = r12.intValue()
            r0 = r23
            r1 = r22
            r2 = r10
            androidx.compose.foundation.layout.r0 r0 = r0.mo8175l(r1, r2, r4, r5)
            int r1 = r0.mo8156b()
            int r13 = r13 + r1
            int r1 = r0.mo8159e()
            int r15 = java.lang.Math.max(r15, r1)
            r9.mo15463e(r0)
            int r4 = r12.intValue()
            int r14 = r14 + 1
            java.lang.Object r0 = kotlin.collections.ArraysKt___ArraysKt.m40121qf(r6, r14)
            r12 = r0
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L_0x0108
        L_0x0135:
            int r0 = r25.mo8076h()
            int r0 = java.lang.Math.max(r13, r0)
            int r1 = r25.mo8079j()
            int r1 = java.lang.Math.max(r15, r1)
            androidx.compose.foundation.layout.s r2 = new androidx.compose.foundation.layout.s
            r2.<init>(r1, r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.m9898f(androidx.compose.ui.layout.h0, androidx.compose.foundation.layout.s0, androidx.compose.foundation.layout.LayoutOrientation, androidx.compose.foundation.layout.h0, int):androidx.compose.foundation.layout.s");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.foundation.layout.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.layout.C15560f0 m9899g(androidx.compose.foundation.layout.Arrangement.C2279l r7, androidx.compose.p004ui.C8734c.C8736b r8, int r9, androidx.compose.runtime.C8592o r10, int r11, int r12) {
        /*
            r0 = -2013098357(0xffffffff88028e8b, float:-3.928801E-34)
            r10.mo14918M(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0010
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r7 = r7.mo7631r()
        L_0x0010:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x001a
            androidx.compose.ui.c$a r8 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r8 = r8.mo17072u()
        L_0x001a:
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x0026
            r12 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:181)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r11, r12, r1)
        L_0x0026:
            r11 = r11 & 14
            kotlin.jvm.functions.s r1 = m9905m(r7, r10, r11)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r10.mo14918M(r11)
            boolean r11 = r10.mo15006n0(r8)
            java.lang.Object r12 = r10.mo14921N()
            if (r11 != 0) goto L_0x0044
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r12 != r11) goto L_0x004d
        L_0x0044:
            androidx.compose.foundation.layout.m$c r11 = androidx.compose.foundation.layout.C2380m.f6293a
            androidx.compose.foundation.layout.m r12 = r11.mo8126i(r8)
            r10.mo14893C(r12)
        L_0x004d:
            r10.mo15002m0()
            r4 = r12
            androidx.compose.foundation.layout.m r4 = (androidx.compose.foundation.layout.C2380m) r4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r12 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.mo14918M(r12)
            boolean r12 = r10.mo15006n0(r7)
            boolean r8 = r10.mo15006n0(r8)
            r8 = r8 | r12
            boolean r11 = r10.mo15006n0(r11)
            r8 = r8 | r11
            java.lang.Object r11 = r10.mo14921N()
            if (r8 != 0) goto L_0x0079
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r11 != r8) goto L_0x008b
        L_0x0079:
            androidx.compose.foundation.layout.LayoutOrientation r0 = androidx.compose.foundation.layout.LayoutOrientation.Vertical
            float r2 = r7.mo7658a()
            kotlin.jvm.functions.r<java.lang.Integer, int[], androidx.compose.ui.layout.h0, int[], kotlin.d2> r5 = f6065b
            androidx.compose.foundation.layout.SizeMode r3 = androidx.compose.foundation.layout.SizeMode.Wrap
            r6 = r9
            androidx.compose.ui.layout.f0 r11 = m9902j(r0, r1, r2, r3, r4, r5, r6)
            r10.mo14893C(r11)
        L_0x008b:
            r10.mo15002m0()
            androidx.compose.ui.layout.f0 r11 = (androidx.compose.p004ui.layout.C15560f0) r11
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x0099
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0099:
            r10.mo15002m0()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.m9899g(androidx.compose.foundation.layout.Arrangement$l, androidx.compose.ui.c$b, int, androidx.compose.runtime.o, int, int):androidx.compose.ui.layout.f0");
    }

    /* renamed from: h */
    public static final int m9900h(@C12579k C15557e0 e0Var, @C12579k LayoutOrientation layoutOrientation, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return e0Var.mo44317a0(i);
        }
        return e0Var.mo44322o0(i);
    }

    /* renamed from: i */
    public static final int m9901i(@C12579k C15611w0 w0Var, @C12579k LayoutOrientation layoutOrientation) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return w0Var.mo44468G0();
        }
        return w0Var.mo44471K0();
    }

    /* renamed from: j */
    public static final C15560f0 m9902j(LayoutOrientation layoutOrientation, C11307s<? super Integer, ? super int[], ? super LayoutDirection, ? super C16479d, ? super int[], C11079d2> sVar, float f, SizeMode sizeMode, C2380m mVar, C11306r<? super Integer, ? super int[], ? super C15568h0, ? super int[], C11079d2> rVar, int i) {
        return new FlowLayoutKt$flowMeasurePolicy$1(layoutOrientation, sVar, f, sizeMode, mVar, i, rVar);
    }

    /* renamed from: k */
    public static final int m9903k(List<? extends C15580l> list, C11305q<? super C15580l, ? super Integer, ? super Integer, Integer> qVar, C11305q<? super C15580l, ? super Integer, ? super Integer, Integer> qVar2, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        List<? extends C15580l> list2 = list;
        C11305q<? super C15580l, ? super Integer, ? super Integer, Integer> qVar3 = qVar;
        C11305q<? super C15580l, ? super Integer, ? super Integer, Integer> qVar4 = qVar2;
        if (list.isEmpty()) {
            return 0;
        }
        Object R2 = CollectionsKt___CollectionsKt.m40559R2(list2, 0);
        C15580l lVar = (C15580l) R2;
        if (lVar != null) {
            i4 = qVar4.invoke(lVar, 0, Integer.valueOf(i)).intValue();
        } else {
            i4 = 0;
        }
        if (lVar != null) {
            i5 = qVar3.invoke(lVar, 0, Integer.valueOf(i4)).intValue();
        } else {
            i5 = 0;
        }
        int size = list.size();
        int i8 = i;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < size) {
            C15580l lVar2 = (C15580l) list2.get(i9);
            Intrinsics.checkNotNull(R2);
            i8 -= i5;
            int max = Math.max(i11, i4);
            i9++;
            Object R22 = CollectionsKt___CollectionsKt.m40559R2(list2, i9);
            C15580l lVar3 = (C15580l) R22;
            if (lVar3 != null) {
                i6 = qVar4.invoke(lVar3, Integer.valueOf(i9), Integer.valueOf(i)).intValue();
            } else {
                i6 = 0;
            }
            if (lVar3 != null) {
                i7 = qVar3.invoke(lVar3, Integer.valueOf(i9), Integer.valueOf(i6)).intValue() + i2;
            } else {
                i7 = 0;
            }
            if (i8 < 0 || i9 == list.size()) {
                int i13 = i3;
            } else if (i9 - i12 != i3 && i8 - i7 >= 0) {
                int i14 = i6;
                i11 = max;
                R2 = R22;
                i5 = i7;
                i4 = i14;
            }
            i10 += max;
            i7 -= i2;
            i8 = i;
            max = 0;
            i12 = i9;
            int i142 = i6;
            i11 = max;
            R2 = R22;
            i5 = i7;
            i4 = i142;
        }
        return i10;
    }

    /* renamed from: l */
    public static final int m9904l(List<? extends C15580l> list, int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return m9903k(list, new FlowLayoutKt$intrinsicCrossAxisSize$1(iArr), new FlowLayoutKt$intrinsicCrossAxisSize$2(iArr2), i, i2, i3);
    }

    @C8540g
    /* renamed from: m */
    public static final C11307s<Integer, int[], LayoutDirection, C16479d, int[], C11079d2> m9905m(Arrangement.C2279l lVar, C8592o oVar, int i) {
        oVar.mo14918M(-1642644113);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1642644113, i, -1, "androidx.compose.foundation.layout.mainAxisColumnArrangement (FlowLayout.kt:134)");
        }
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(lVar);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new FlowLayoutKt$mainAxisColumnArrangement$1$1(lVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C11307s<Integer, int[], LayoutDirection, C16479d, int[], C11079d2> sVar = (C11307s) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return sVar;
    }

    /* renamed from: n */
    public static final int m9906n(@C12579k C15557e0 e0Var, @C12579k LayoutOrientation layoutOrientation, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return e0Var.mo44322o0(i);
        }
        return e0Var.mo44317a0(i);
    }

    @C8540g
    /* renamed from: o */
    public static final C11307s<Integer, int[], LayoutDirection, C16479d, int[], C11079d2> m9907o(Arrangement.C2269d dVar, C8592o oVar, int i) {
        oVar.mo14918M(746410833);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(746410833, i, -1, "androidx.compose.foundation.layout.mainAxisRowArrangement (FlowLayout.kt:123)");
        }
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(dVar);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new FlowLayoutKt$mainAxisRowArrangement$1$1(dVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C11307s<Integer, int[], LayoutDirection, C16479d, int[], C11079d2> sVar = (C11307s) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return sVar;
    }

    /* renamed from: p */
    public static final int m9908p(@C12579k C15611w0 w0Var, @C12579k LayoutOrientation layoutOrientation) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return w0Var.mo44471K0();
        }
        return w0Var.mo44468G0();
    }

    /* renamed from: q */
    public static final int m9909q(List<? extends C15580l> list, C11305q<? super C15580l, ? super Integer, ? super Integer, Integer> qVar, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = qVar.invoke((C15580l) list.get(i4), Integer.valueOf(i4), Integer.valueOf(i)).intValue() + i2;
            int i8 = i4 + 1;
            if (i8 - i6 == i3 || i8 == list.size()) {
                i5 = Math.max(i5, i7 + intValue);
                i7 = 0;
                i6 = i4;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    /* renamed from: r */
    public static final int m9910r(C15557e0 e0Var, C2363h0 h0Var, LayoutOrientation layoutOrientation, C11300l<? super C15611w0, C11079d2> lVar) {
        boolean z;
        if (RowColumnImplKt.m10056m(RowColumnImplKt.m10055l(e0Var)) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return m9906n(e0Var, layoutOrientation, Integer.MAX_VALUE);
        }
        C15611w0 t0 = e0Var.mo44324t0(C2363h0.m10414f(h0Var, 0, 0, 0, 0, 14, (Object) null).mo8083n(layoutOrientation));
        lVar.invoke(t0);
        return m9908p(t0, layoutOrientation);
    }

    /* renamed from: s */
    public static final int m9911s(List<? extends C15580l> list, C11305q<? super C15580l, ? super Integer, ? super Integer, Integer> qVar, C11305q<? super C15580l, ? super Integer, ? super Integer, Integer> qVar2, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        int size = list.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            iArr2[i5] = 0;
        }
        int size3 = list.size();
        for (int i6 = 0; i6 < size3; i6++) {
            C15580l lVar = (C15580l) list.get(i6);
            int intValue = qVar.invoke(lVar, Integer.valueOf(i6), Integer.valueOf(i)).intValue();
            iArr[i6] = intValue;
            iArr2[i6] = qVar2.invoke(lVar, Integer.valueOf(i6), Integer.valueOf(intValue)).intValue();
        }
        int Bw = ArraysKt___ArraysKt.m38837Bw(iArr);
        if (size2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i7 = iArr2[0];
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr2)).iterator();
            while (H.hasNext()) {
                int i8 = iArr2[H.mo6374c()];
                if (i7 < i8) {
                    i7 = i8;
                }
            }
            if (size == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                int i9 = iArr[0];
                C10953k0 H2 = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
                while (H2.hasNext()) {
                    int i10 = iArr[H2.mo6374c()];
                    if (i9 < i10) {
                        i9 = i10;
                    }
                }
                int i11 = Bw;
                while (i9 < Bw && i7 != i) {
                    i11 = (i9 + Bw) / 2;
                    i7 = m9904l(list, iArr, iArr2, i11, i2, i3);
                    if (i7 == i) {
                        return i11;
                    }
                    if (i7 > i) {
                        i9 = i11 + 1;
                    } else {
                        Bw = i11 - 1;
                    }
                }
                return i11;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.foundation.layout.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.layout.C15560f0 m9912t(androidx.compose.foundation.layout.Arrangement.C2269d r7, androidx.compose.p004ui.C8734c.C8737c r8, int r9, androidx.compose.runtime.C8592o r10, int r11, int r12) {
        /*
            r0 = 1479255111(0x582ba447, float:7.5488822E14)
            r10.mo14918M(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0010
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r7 = r7.mo7626h()
        L_0x0010:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x001a
            androidx.compose.ui.c$a r8 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r8 = r8.mo17073w()
        L_0x001a:
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x0026
            r12 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:158)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r11, r12, r1)
        L_0x0026:
            r11 = r11 & 14
            kotlin.jvm.functions.s r1 = m9907o(r7, r10, r11)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r10.mo14918M(r11)
            boolean r11 = r10.mo15006n0(r8)
            java.lang.Object r12 = r10.mo14921N()
            if (r11 != 0) goto L_0x0044
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r12 != r11) goto L_0x004d
        L_0x0044:
            androidx.compose.foundation.layout.m$c r11 = androidx.compose.foundation.layout.C2380m.f6293a
            androidx.compose.foundation.layout.m r12 = r11.mo8127j(r8)
            r10.mo14893C(r12)
        L_0x004d:
            r10.mo15002m0()
            r4 = r12
            androidx.compose.foundation.layout.m r4 = (androidx.compose.foundation.layout.C2380m) r4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r12 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.mo14918M(r12)
            boolean r12 = r10.mo15006n0(r7)
            boolean r8 = r10.mo15006n0(r8)
            r8 = r8 | r12
            boolean r11 = r10.mo15006n0(r11)
            r8 = r8 | r11
            java.lang.Object r11 = r10.mo14921N()
            if (r8 != 0) goto L_0x0079
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r11 != r8) goto L_0x008b
        L_0x0079:
            androidx.compose.foundation.layout.LayoutOrientation r0 = androidx.compose.foundation.layout.LayoutOrientation.Horizontal
            float r2 = r7.mo7658a()
            androidx.compose.foundation.layout.SizeMode r3 = androidx.compose.foundation.layout.SizeMode.Wrap
            kotlin.jvm.functions.r<java.lang.Integer, int[], androidx.compose.ui.layout.h0, int[], kotlin.d2> r5 = f6064a
            r6 = r9
            androidx.compose.ui.layout.f0 r11 = m9902j(r0, r1, r2, r3, r4, r5, r6)
            r10.mo14893C(r11)
        L_0x008b:
            r10.mo15002m0()
            androidx.compose.ui.layout.f0 r11 = (androidx.compose.p004ui.layout.C15560f0) r11
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x0099
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0099:
            r10.mo15002m0()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.m9912t(androidx.compose.foundation.layout.Arrangement$d, androidx.compose.ui.c$c, int, androidx.compose.runtime.o, int, int):androidx.compose.ui.layout.f0");
    }
}
