package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15594q;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,291:1\n74#2:292\n75#2,11:294\n75#2:322\n76#2,11:324\n89#2:352\n75#2:360\n76#2,11:362\n89#2:390\n88#2:395\n71#2,4:396\n75#2,11:401\n88#2:426\n76#3:293\n76#3:323\n76#3:361\n76#3:400\n456#4,11:305\n460#4,13:335\n473#4,3:349\n460#4,13:373\n473#4,3:387\n467#4,3:392\n456#4,14:412\n67#5,6:316\n73#5:348\n77#5:353\n67#5,6:354\n73#5:386\n77#5:391\n154#6:427\n154#6:428\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n*L\n97#1:292\n97#1:294,11\n100#1:322\n100#1:324,11\n100#1:352\n105#1:360\n105#1:362,11\n105#1:390\n97#1:395\n193#1:396,4\n193#1:401,11\n193#1:426\n97#1:293\n100#1:323\n105#1:361\n193#1:400\n97#1:305,11\n100#1:335,13\n100#1:349,3\n105#1:373,13\n105#1:387,3\n97#1:392,3\n193#1:412,14\n100#1:316,6\n100#1:348\n100#1:353\n105#1:354,6\n105#1:386\n105#1:391\n282#1:427\n283#1:428\n*E\n"})
public final class AlertDialogKt {
    @C12579k

    /* renamed from: a */
    public static final C8767m f7495a;
    @C12579k

    /* renamed from: b */
    public static final C8767m f7496b;

    /* renamed from: c */
    public static final long f7497c = C16506u.m74712m(40);

    /* renamed from: d */
    public static final long f7498d = C16506u.m74712m(36);

    /* renamed from: e */
    public static final long f7499e = C16506u.m74712m(38);

    static {
        C8767m.C8768a aVar = C8767m.f23478j;
        float f = (float) 24;
        f7495a = PaddingKt.m10028o(aVar, C16483g.m74435M(f), 0.0f, C16483g.m74435M(f), 0.0f, 10, (Object) null);
        f7496b = PaddingKt.m10028o(aVar, C16483g.m74435M(f), 0.0f, C16483g.m74435M(f), C16483g.m74435M((float) 28), 2, (Object) null);
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m13188a(@C12579k C2373k kVar, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C2373k kVar2 = kVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar3 = pVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar2;
        int i6 = i;
        Intrinsics.checkNotNullParameter(kVar2, "<this>");
        C8592o o = oVar.mo15009o(-555573207);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(kVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14927P(pVar3)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14927P(pVar4)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-555573207, i6, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:92)");
            }
            C8767m b = kVar2.mo7712b(C8767m.f23478j, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = AlertDialogKt$AlertDialogBaselineLayout$2.f7500a;
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(b);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, alertDialogKt$AlertDialogBaselineLayout$2, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            o.mo14918M(-1160646206);
            if (pVar3 != null) {
                C8767m b3 = C15594q.m69318b(f7495a, "title");
                C8734c.C8735a aVar = C8734c.f23406a;
                C8767m e = kVar2.mo7714e(b3, aVar.mo17072u());
                o.mo14918M(733328855);
                C15560f0 k = BoxKt.m9849k(aVar.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a2 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(e);
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
                C8592o b4 = Updater.m30180b(o);
                Updater.m30188j(b4, k, companion.mo44588d());
                Updater.m30188j(b4, dVar2, companion.mo44586b());
                Updater.m30188j(b4, layoutDirection2, companion.mo44587c());
                Updater.m30188j(b4, c4Var2, companion.mo44590f());
                o.mo14972e();
                f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                pVar3.invoke(o, 0);
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
            }
            o.mo15002m0();
            o.mo14918M(-1735756597);
            if (pVar4 != null) {
                C8767m b5 = C15594q.m69318b(f7496b, "text");
                C8734c.C8735a aVar2 = C8734c.f23406a;
                C8767m e2 = kVar2.mo7714e(b5, aVar2.mo17072u());
                o.mo14918M(733328855);
                C15560f0 k2 = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a3 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(e2);
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
                C8592o b6 = Updater.m30180b(o);
                Updater.m30188j(b6, k2, companion.mo44588d());
                Updater.m30188j(b6, dVar3, companion.mo44586b());
                Updater.m30188j(b6, layoutDirection3, companion.mo44587c());
                Updater.m30188j(b6, c4Var3, companion.mo44590f());
                o.mo14972e();
                f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f6046a;
                pVar4.invoke(o, 0);
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
            s.mo15202a(new AlertDialogKt$AlertDialogBaselineLayout$3(kVar2, pVar3, pVar4, i6));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f0  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13189b(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r28, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r29, long r30, long r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r1 = r25
            r10 = r35
            java.lang.String r0 = "buttons"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -453679601(0xffffffffe4f5660f, float:-3.6214451E22)
            r2 = r34
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r36 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r10 | 6
            goto L_0x0029
        L_0x0019:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0028
            boolean r3 = r2.mo14927P(r1)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r10
            goto L_0x0029
        L_0x0028:
            r3 = r10
        L_0x0029:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0043
            r5 = r26
            boolean r6 = r2.mo15006n0(r5)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r3 = r3 | r6
            goto L_0x0045
        L_0x0043:
            r5 = r26
        L_0x0045:
            r6 = r36 & 4
            if (r6 == 0) goto L_0x004c
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005f
            r7 = r27
            boolean r8 = r2.mo14927P(r7)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r8
            goto L_0x0061
        L_0x005f:
            r7 = r27
        L_0x0061:
            r8 = r36 & 8
            if (r8 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007b
            r9 = r28
            boolean r11 = r2.mo14927P(r9)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
            goto L_0x007d
        L_0x007b:
            r9 = r28
        L_0x007d:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r10
            if (r11 != 0) goto L_0x0098
            r11 = r36 & 16
            if (r11 != 0) goto L_0x0092
            r11 = r29
            boolean r12 = r2.mo15006n0(r11)
            if (r12 == 0) goto L_0x0094
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0092:
            r11 = r29
        L_0x0094:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r12
            goto L_0x009a
        L_0x0098:
            r11 = r29
        L_0x009a:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x00b4
            r12 = r36 & 32
            if (r12 != 0) goto L_0x00ae
            r12 = r30
            boolean r14 = r2.mo14980g(r12)
            if (r14 == 0) goto L_0x00b0
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00ae:
            r12 = r30
        L_0x00b0:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r3 = r3 | r14
            goto L_0x00b6
        L_0x00b4:
            r12 = r30
        L_0x00b6:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00d1
            r14 = r36 & 64
            if (r14 != 0) goto L_0x00ca
            r14 = r32
            boolean r16 = r2.mo14980g(r14)
            if (r16 == 0) goto L_0x00cc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00ca:
            r14 = r32
        L_0x00cc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r16
            goto L_0x00d3
        L_0x00d1:
            r14 = r32
        L_0x00d3:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00f0
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x00e4
            goto L_0x00f0
        L_0x00e4:
            r2.mo14958a0()
            r3 = r26
            r4 = r9
            r5 = r11
            r8 = r12
            r23 = r14
            goto L_0x01b3
        L_0x00f0:
            r2.mo14930Q()
            r0 = r10 & 1
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0123
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x0107
            goto L_0x0123
        L_0x0107:
            r2.mo14958a0()
            r0 = r36 & 16
            if (r0 == 0) goto L_0x0110
            r3 = r3 & r18
        L_0x0110:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x0116
            r3 = r3 & r16
        L_0x0116:
            r0 = r36 & 64
            if (r0 == 0) goto L_0x011b
            r3 = r3 & r5
        L_0x011b:
            r0 = r26
            r4 = r9
            r6 = r11
            r8 = r12
        L_0x0120:
            r23 = r14
            goto L_0x0166
        L_0x0123:
            if (r4 == 0) goto L_0x0128
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x012a
        L_0x0128:
            r0 = r26
        L_0x012a:
            r4 = 0
            if (r6 == 0) goto L_0x012e
            r7 = r4
        L_0x012e:
            if (r8 == 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r4 = r9
        L_0x0132:
            r6 = r36 & 16
            r8 = 6
            if (r6 == 0) goto L_0x0144
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.f1 r6 = r6.mo11076b(r2, r8)
            androidx.compose.foundation.shape.e r6 = r6.mo10757d()
            r3 = r3 & r18
            goto L_0x0145
        L_0x0144:
            r6 = r11
        L_0x0145:
            r9 = r36 & 32
            if (r9 == 0) goto L_0x0156
            androidx.compose.material.t0 r9 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r8 = r9.mo11075a(r2, r8)
            long r8 = r8.mo10975n()
            r3 = r3 & r16
            goto L_0x0157
        L_0x0156:
            r8 = r12
        L_0x0157:
            r11 = r36 & 64
            if (r11 == 0) goto L_0x0120
            int r11 = r3 >> 15
            r11 = r11 & 14
            long r11 = androidx.compose.material.ColorsKt.m13381b(r8, r2, r11)
            r3 = r3 & r5
            r23 = r11
        L_0x0166:
            r2.mo14899E()
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x0178
            r5 = -1
            java.lang.String r11 = "androidx.compose.material.AlertDialogContent (AlertDialog.kt:43)"
            r12 = -453679601(0xffffffffe4f5660f, float:-3.6214451E22)
            androidx.compose.runtime.ComposerKt.m29845w0(r12, r3, r5, r11)
        L_0x0178:
            r17 = 0
            r18 = 0
            androidx.compose.material.AlertDialogKt$AlertDialogContent$1 r5 = new androidx.compose.material.AlertDialogKt$AlertDialogContent$1
            r5.<init>(r7, r4, r1, r3)
            r11 = 629950291(0x258c4753, float:2.433446E-16)
            r12 = 1
            androidx.compose.runtime.internal.a r19 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r11, r12, r5)
            int r5 = r3 >> 3
            r5 = r5 & 14
            r11 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r11
            int r3 = r3 >> 9
            r11 = r3 & 112(0x70, float:1.57E-43)
            r5 = r5 | r11
            r11 = r3 & 896(0x380, float:1.256E-42)
            r5 = r5 | r11
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r21 = r5 | r3
            r22 = 48
            r11 = r0
            r12 = r6
            r13 = r8
            r15 = r23
            r20 = r2
            androidx.compose.material.SurfaceKt.m13879b(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x01b1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01b1:
            r3 = r0
            r5 = r6
        L_0x01b3:
            androidx.compose.runtime.t1 r12 = r2.mo15020s()
            if (r12 != 0) goto L_0x01ba
            goto L_0x01ce
        L_0x01ba:
            androidx.compose.material.AlertDialogKt$AlertDialogContent$2 r13 = new androidx.compose.material.AlertDialogKt$AlertDialogContent$2
            r0 = r13
            r1 = r25
            r2 = r3
            r3 = r7
            r6 = r8
            r8 = r23
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11)
            r12.mo15202a(r13)
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.m13189b(kotlin.jvm.functions.p, androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.ui.graphics.g4, long, long, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m13190c(float f, float f2, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(73434452);
        if ((i & 14) == 0) {
            if (o.mo14968d(f)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14968d(f2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(73434452, i2, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:187)");
            }
            AlertDialogKt$AlertDialogFlowRow$1 alertDialogKt$AlertDialogFlowRow$1 = new AlertDialogKt$AlertDialogFlowRow$1(f, f2);
            o.mo14918M(-1323940314);
            C8767m.C8768a aVar = C8767m.f23478j;
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(aVar);
            int i6 = ((((i2 >> 6) & 14) << 9) & 7168) | 6;
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
            Updater.m30188j(b, alertDialogKt$AlertDialogFlowRow$1, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i6 >> 3) & 112));
            o.mo14918M(2058660585);
            pVar.invoke(o, Integer.valueOf((i6 >> 9) & 14));
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
            s.mo15202a(new AlertDialogKt$AlertDialogFlowRow$2(f, f2, pVar, i));
        }
    }
}
