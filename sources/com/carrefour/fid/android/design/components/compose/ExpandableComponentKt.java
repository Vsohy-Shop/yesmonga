package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nExpandableComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpandableComponent.kt\ncom/carrefour/fid/android/design/components/compose/ExpandableComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,190:1\n25#2:191\n460#2,13:217\n50#2:232\n49#2:233\n460#2,13:260\n473#2,3:274\n460#2,13:299\n473#2,3:313\n50#2:318\n49#2:319\n473#2,3:326\n36#2:331\n460#2,13:353\n473#2,3:369\n1114#3,6:192\n1114#3,6:234\n1114#3,6:320\n1114#3,6:332\n74#4,6:198\n80#4:230\n73#4,7:240\n80#4:273\n84#4:278\n74#4,6:280\n80#4:312\n84#4:317\n84#4:330\n75#5:204\n76#5,11:206\n75#5:247\n76#5,11:249\n89#5:277\n75#5:286\n76#5,11:288\n89#5:316\n89#5:329\n75#5:340\n76#5,11:342\n89#5:372\n76#6:205\n76#6:248\n76#6:287\n76#6:341\n154#7:231\n154#7:279\n154#7:367\n154#7:368\n79#8,2:338\n81#8:366\n85#8:373\n76#9:374\n102#9,2:375\n*S KotlinDebug\n*F\n+ 1 ExpandableComponent.kt\ncom/carrefour/fid/android/design/components/compose/ExpandableComponentKt\n*L\n51#1:191\n53#1:217,13\n74#1:232\n74#1:233\n82#1:260,13\n82#1:274,3\n86#1:299,13\n86#1:313,3\n96#1:318\n96#1:319\n53#1:326,3\n119#1:331\n117#1:353,13\n117#1:369,3\n51#1:192,6\n74#1:234,6\n96#1:320,6\n119#1:332,6\n53#1:198,6\n53#1:230\n82#1:240,7\n82#1:273\n82#1:278\n86#1:280,6\n86#1:312\n86#1:317\n53#1:330\n53#1:204\n53#1:206,11\n82#1:247\n82#1:249,11\n82#1:277\n86#1:286\n86#1:288,11\n86#1:316\n53#1:329\n117#1:340\n117#1:342,11\n117#1:372\n53#1:205\n82#1:248\n86#1:287\n117#1:341\n71#1:231\n87#1:279\n129#1:367\n130#1:368\n117#1:338,2\n117#1:366\n117#1:373\n51#1:374\n51#1:375,2\n*E\n"})
public final class ExpandableComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.lang.Object, androidx.compose.animation.core.d0, kotlin.jvm.functions.p] */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012e  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151485a(@org.jetbrains.annotations.C12580l java.lang.String r48, @org.jetbrains.annotations.C12579k java.lang.String r49, @org.jetbrains.annotations.C12579k java.lang.String r50, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r51, boolean r52, boolean r53, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8736b r54, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.design.components.compose.ExpandButtonPosition r55, @androidx.annotation.C0375v int r56, @androidx.annotation.C0375v int r57, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r58, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11306r<? super androidx.compose.foundation.layout.C2373k, ? super java.lang.Boolean, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r59, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r60, int r61, int r62, int r63) {
        /*
            r2 = r49
            r3 = r50
            r12 = r59
            r13 = r61
            r15 = r63
            java.lang.String r0 = "labelMore"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "labelLess"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -358156082(0xffffffffeaa6f8ce, float:-1.0092832E26)
            r1 = r60
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r4 = r15 & 1
            if (r4 == 0) goto L_0x002c
            r7 = r13 | 6
            r8 = r7
            r7 = r48
            goto L_0x0040
        L_0x002c:
            r7 = r13 & 14
            if (r7 != 0) goto L_0x003d
            r7 = r48
            boolean r8 = r1.mo15006n0(r7)
            if (r8 == 0) goto L_0x003a
            r8 = 4
            goto L_0x003b
        L_0x003a:
            r8 = 2
        L_0x003b:
            r8 = r8 | r13
            goto L_0x0040
        L_0x003d:
            r7 = r48
            r8 = r13
        L_0x0040:
            r9 = r15 & 2
            if (r9 == 0) goto L_0x0047
            r8 = r8 | 48
            goto L_0x0057
        L_0x0047:
            r9 = r13 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0057
            boolean r9 = r1.mo15006n0(r2)
            if (r9 == 0) goto L_0x0054
            r9 = 32
            goto L_0x0056
        L_0x0054:
            r9 = 16
        L_0x0056:
            r8 = r8 | r9
        L_0x0057:
            r9 = r15 & 4
            if (r9 == 0) goto L_0x005e
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x006e
            boolean r9 = r1.mo15006n0(r3)
            if (r9 == 0) goto L_0x006b
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r8 = r8 | r9
        L_0x006e:
            r9 = r15 & 8
            if (r9 == 0) goto L_0x0075
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0075:
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x0089
            r14 = r51
            boolean r16 = r1.mo15006n0(r14)
            if (r16 == 0) goto L_0x0084
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r8 = r8 | r16
            goto L_0x008b
        L_0x0089:
            r14 = r51
        L_0x008b:
            r16 = r15 & 16
            r41 = 57344(0xe000, float:8.0356E-41)
            if (r16 == 0) goto L_0x0097
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r5 = r52
            goto L_0x00aa
        L_0x0097:
            r17 = r13 & r41
            r5 = r52
            if (r17 != 0) goto L_0x00aa
            boolean r17 = r1.mo14961b(r5)
            if (r17 == 0) goto L_0x00a6
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r8 = r8 | r17
        L_0x00aa:
            r17 = r15 & 32
            if (r17 == 0) goto L_0x00b5
            r18 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 | r18
            r10 = r53
            goto L_0x00ca
        L_0x00b5:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r13 & r18
            r10 = r53
            if (r18 != 0) goto L_0x00ca
            boolean r19 = r1.mo14961b(r10)
            if (r19 == 0) goto L_0x00c6
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c8
        L_0x00c6:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00c8:
            r8 = r8 | r19
        L_0x00ca:
            r19 = r15 & 64
            if (r19 == 0) goto L_0x00d5
            r20 = 1572864(0x180000, float:2.204052E-39)
            r8 = r8 | r20
            r11 = r54
            goto L_0x00ea
        L_0x00d5:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r13 & r20
            r11 = r54
            if (r20 != 0) goto L_0x00ea
            boolean r21 = r1.mo15006n0(r11)
            if (r21 == 0) goto L_0x00e6
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e8
        L_0x00e6:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00e8:
            r8 = r8 | r21
        L_0x00ea:
            r6 = r15 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00f5
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r8 = r8 | r22
            r0 = r55
            goto L_0x010a
        L_0x00f5:
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r13 & r22
            r0 = r55
            if (r22 != 0) goto L_0x010a
            boolean r23 = r1.mo15006n0(r0)
            if (r23 == 0) goto L_0x0106
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0108
        L_0x0106:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x0108:
            r8 = r8 | r23
        L_0x010a:
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            r23 = r13 & r23
            if (r23 != 0) goto L_0x0126
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x011f
            r0 = r56
            boolean r23 = r1.mo14976f(r0)
            if (r23 == 0) goto L_0x0121
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0123
        L_0x011f:
            r0 = r56
        L_0x0121:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0123:
            r8 = r8 | r23
            goto L_0x0128
        L_0x0126:
            r0 = r56
        L_0x0128:
            r23 = 1879048192(0x70000000, float:1.58456325E29)
            r23 = r13 & r23
            if (r23 != 0) goto L_0x0144
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x013d
            r0 = r57
            boolean r23 = r1.mo14976f(r0)
            if (r23 == 0) goto L_0x013f
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0141
        L_0x013d:
            r0 = r57
        L_0x013f:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0141:
            r8 = r8 | r23
            goto L_0x0146
        L_0x0144:
            r0 = r57
        L_0x0146:
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x014f
            r23 = r62 | 6
            r2 = r58
            goto L_0x0165
        L_0x014f:
            r23 = r62 & 14
            r2 = r58
            if (r23 != 0) goto L_0x0163
            boolean r23 = r1.mo14927P(r2)
            if (r23 == 0) goto L_0x015e
            r23 = 4
            goto L_0x0160
        L_0x015e:
            r23 = 2
        L_0x0160:
            r23 = r62 | r23
            goto L_0x0165
        L_0x0163:
            r23 = r62
        L_0x0165:
            r2 = r15 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x016c
            r23 = r23 | 48
            goto L_0x017d
        L_0x016c:
            r2 = r62 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x017d
            boolean r2 = r1.mo14927P(r12)
            if (r2 == 0) goto L_0x0179
            r18 = 32
            goto L_0x017b
        L_0x0179:
            r18 = 16
        L_0x017b:
            r23 = r23 | r18
        L_0x017d:
            r2 = r23
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r8 & r18
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r5) goto L_0x01a9
            r3 = r2 & 91
            r5 = 18
            if (r3 != r5) goto L_0x01a9
            boolean r3 = r1.mo15011p()
            if (r3 != 0) goto L_0x0196
            goto L_0x01a9
        L_0x0196:
            r1.mo14958a0()
            r5 = r52
            r8 = r55
            r6 = r10
            r9 = r11
            r13 = r12
            r4 = r14
            r10 = r56
            r11 = r57
            r12 = r58
            goto L_0x05da
        L_0x01a9:
            r1.mo14930Q()
            r3 = r13 & 1
            if (r3 == 0) goto L_0x01d7
            boolean r3 = r1.mo14977f0()
            if (r3 == 0) goto L_0x01b7
            goto L_0x01d7
        L_0x01b7:
            r1.mo14958a0()
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01c2
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r8 = r8 & r0
        L_0x01c2:
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01ca
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r8 = r8 & r0
        L_0x01ca:
            r4 = r52
            r6 = r55
            r0 = r58
            r9 = r11
            r3 = r14
            r11 = r56
            r14 = r57
            goto L_0x021b
        L_0x01d7:
            if (r4 == 0) goto L_0x01da
            r7 = 0
        L_0x01da:
            if (r9 == 0) goto L_0x01df
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01e0
        L_0x01df:
            r3 = r14
        L_0x01e0:
            if (r16 == 0) goto L_0x01e4
            r4 = 1
            goto L_0x01e6
        L_0x01e4:
            r4 = r52
        L_0x01e6:
            if (r17 == 0) goto L_0x01e9
            r10 = 0
        L_0x01e9:
            if (r19 == 0) goto L_0x01f2
            androidx.compose.ui.c$a r9 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r9 = r9.mo17068m()
            goto L_0x01f3
        L_0x01f2:
            r9 = r11
        L_0x01f3:
            if (r6 == 0) goto L_0x01f8
            com.carrefour.fid.android.design.components.compose.ExpandButtonPosition r6 = com.carrefour.fid.android.design.components.compose.ExpandButtonPosition.Bottom
            goto L_0x01fa
        L_0x01f8:
            r6 = r55
        L_0x01fa:
            r11 = r15 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0205
            int r11 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_chevron_down
            r14 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r8 = r8 & r14
            goto L_0x0207
        L_0x0205:
            r11 = r56
        L_0x0207:
            r14 = r15 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x0213
            int r14 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_chevron_up
            r16 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r8 = r8 & r16
            goto L_0x0215
        L_0x0213:
            r14 = r57
        L_0x0215:
            if (r0 == 0) goto L_0x0219
            r0 = 0
            goto L_0x021b
        L_0x0219:
            r0 = r58
        L_0x021b:
            r1.mo14899E()
            boolean r16 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r16 == 0) goto L_0x022c
            java.lang.String r5 = "com.carrefour.fid.android.design.components.compose.ExpandableComponent (ExpandableComponent.kt:36)"
            r13 = -358156082(0xffffffffeaa6f8ce, float:-1.0092832E26)
            androidx.compose.runtime.ComposerKt.m29845w0(r13, r8, r2, r5)
        L_0x022c:
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r5)
            java.lang.Object r5 = r1.mo14921N()
            androidx.compose.runtime.o$a r13 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r15 = r13.mo16277a()
            if (r5 != r15) goto L_0x024e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
            r48 = r10
            r10 = 0
            r15 = 2
            androidx.compose.runtime.z0 r5 = androidx.compose.runtime.C8539f2.m30981g(r5, r10, r15, r10)
            r1.mo14893C(r5)
            goto L_0x0251
        L_0x024e:
            r48 = r10
            r10 = 0
        L_0x0251:
            r1.mo15002m0()
            androidx.compose.runtime.z0 r5 = (androidx.compose.runtime.C8700z0) r5
            boolean r15 = m151486b(r5)
            if (r15 == 0) goto L_0x025f
            r15 = r50
            goto L_0x0261
        L_0x025f:
            r15 = r49
        L_0x0261:
            r12 = 3
            androidx.compose.ui.m r16 = androidx.compose.animation.AnimationModifierKt.m7766b(r3, r10, r10, r12, r10)
            r10 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r10)
            androidx.compose.foundation.layout.Arrangement r42 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r12 = r42.mo7631r()
            androidx.compose.ui.c$a r43 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r10 = r43.mo17072u()
            r44 = r2
            r2 = 0
            androidx.compose.ui.layout.f0 r10 = androidx.compose.foundation.layout.ColumnKt.m9863b(r12, r10, r1, r2)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r2)
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r2 = r1.mo15032w(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p004ui.unit.LayoutDirection) r2
            r54 = r14
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            androidx.compose.ui.node.ComposeUiNode$Companion r45 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r55 = r11
            kotlin.jvm.functions.a r11 = r45.mo44585a()
            r56 = r15
            kotlin.jvm.functions.q r15 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r16)
            r57 = r13
            androidx.compose.runtime.d r13 = r1.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x02c0
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02c0:
            r1.mo14938T()
            boolean r13 = r1.mo14997l()
            if (r13 == 0) goto L_0x02cd
            r1.mo14947W(r11)
            goto L_0x02d0
        L_0x02cd:
            r1.mo14888A()
        L_0x02d0:
            r1.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r13 = r45.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r10, r13)
            kotlin.jvm.functions.p r10 = r45.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r12, r10)
            kotlin.jvm.functions.p r10 = r45.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r2, r10)
            kotlin.jvm.functions.p r2 = r45.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r14, r2)
            r1.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r15.invoke(r2, r1, r11)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r10 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r11 = 1655673147(0x62af913b, float:1.6193226E21)
            r1.mo14918M(r11)
            if (r7 == 0) goto L_0x031f
            boolean r11 = kotlin.text.C11622t.isBlank(r7)
            if (r11 == 0) goto L_0x031d
            goto L_0x031f
        L_0x031d:
            r11 = 0
            goto L_0x0320
        L_0x031f:
            r11 = 1
        L_0x0320:
            if (r11 != 0) goto L_0x0367
            int r11 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_grey_5
            r12 = 0
            long r18 = androidx.compose.p004ui.res.C16009b.m71825a(r11, r1, r12)
            androidx.compose.material.t0 r11 = androidx.compose.material.C7933t0.f19075a
            int r12 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r11 = r11.mo11077c(r1, r12)
            androidx.compose.ui.text.p0 r36 = r11.mo11097j()
            androidx.compose.ui.text.font.i0$a r11 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r23 = r11.mo46947c()
            r17 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r11 = 196608(0x30000, float:2.75506E-40)
            r12 = r8 & 14
            r38 = r12 | r11
            r39 = 0
            r40 = 65498(0xffda, float:9.1782E-41)
            r16 = r7
            r37 = r1
            androidx.compose.material.TextKt.m14196c(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
        L_0x0367:
            r1.mo15002m0()
            com.carrefour.fid.android.design.components.compose.ExpandButtonPosition r11 = com.carrefour.fid.android.design.components.compose.ExpandButtonPosition.Top
            r12 = 8
            if (r6 != r11) goto L_0x0499
            r11 = 1655673473(0x62af9281, float:1.6193685E21)
            r1.mo14918M(r11)
            r11 = 1655673487(0x62af928f, float:1.6193704E21)
            r1.mo14918M(r11)
            if (r4 == 0) goto L_0x03d1
            boolean r17 = m151486b(r5)
            androidx.compose.ui.m r11 = r10.mo7714e(r3, r9)
            float r12 = (float) r12
            float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r12)
            r14 = 0
            r13 = 1
            r15 = 0
            androidx.compose.ui.m r21 = androidx.compose.foundation.layout.PaddingKt.m10026m(r11, r14, r12, r13, r15)
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r11)
            boolean r11 = r1.mo15006n0(r5)
            boolean r12 = r1.mo15006n0(r0)
            r11 = r11 | r12
            java.lang.Object r12 = r1.mo14921N()
            if (r11 != 0) goto L_0x03ad
            java.lang.Object r11 = r57.mo16277a()
            if (r12 != r11) goto L_0x03b5
        L_0x03ad:
            com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$ExpandableComponent$1$1$1 r12 = new com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$ExpandableComponent$1$1$1
            r12.<init>(r0, r5)
            r1.mo14893C(r12)
        L_0x03b5:
            r1.mo15002m0()
            r18 = r12
            kotlin.jvm.functions.a r18 = (kotlin.jvm.functions.C11289a) r18
            int r8 = r8 >> 15
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 & r41
            r23 = r11 | r8
            r24 = 0
            r16 = r56
            r19 = r55
            r20 = r54
            r22 = r1
            m151489e(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x03d1:
            r1.mo15002m0()
            r8 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r8)
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement$l r11 = r42.mo7631r()
            androidx.compose.ui.c$b r12 = r43.mo17072u()
            r13 = 0
            androidx.compose.ui.layout.f0 r11 = androidx.compose.foundation.layout.ColumnKt.m9863b(r11, r12, r1, r13)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r12)
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r13 = r1.mo15032w(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p004ui.unit.LayoutDirection) r13
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            kotlin.jvm.functions.a r15 = r45.mo44585a()
            kotlin.jvm.functions.q r8 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r8)
            androidx.compose.runtime.d r2 = r1.mo15017r()
            boolean r2 = r2 instanceof androidx.compose.runtime.C8428d
            if (r2 != 0) goto L_0x0420
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0420:
            r1.mo14938T()
            boolean r2 = r1.mo14997l()
            if (r2 == 0) goto L_0x042d
            r1.mo14947W(r15)
            goto L_0x0430
        L_0x042d:
            r1.mo14888A()
        L_0x0430:
            r1.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r45.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r11, r15)
            kotlin.jvm.functions.p r11 = r45.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r12, r11)
            kotlin.jvm.functions.p r11 = r45.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r13, r11)
            kotlin.jvm.functions.p r11 = r45.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r14, r11)
            r1.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r11 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.invoke(r2, r1, r11)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r2)
            boolean r2 = m151486b(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5 = 3
            int r5 = r44 << 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r8 = 6
            r5 = r5 | r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13 = r59
            r13.invoke(r10, r2, r1, r5)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo15002m0()
            r25 = r6
            r52 = r7
            goto L_0x05b8
        L_0x0499:
            r13 = r59
            r2 = 3
            r11 = 1655674283(0x62af95ab, float:1.6194825E21)
            r1.mo14918M(r11)
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            float r12 = (float) r12
            float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r12)
            r14 = 0
            r2 = 1
            r15 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10026m(r11, r14, r12, r2, r15)
            r11 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r11)
            androidx.compose.foundation.layout.Arrangement$l r11 = r42.mo7631r()
            androidx.compose.ui.c$b r12 = r43.mo17072u()
            r14 = 0
            androidx.compose.ui.layout.f0 r11 = androidx.compose.foundation.layout.ColumnKt.m9863b(r11, r12, r1, r14)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r12)
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r1.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            r25 = r6
            kotlin.jvm.functions.a r6 = r45.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            r52 = r7
            androidx.compose.runtime.d r7 = r1.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x04fe
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x04fe:
            r1.mo14938T()
            boolean r7 = r1.mo14997l()
            if (r7 == 0) goto L_0x050b
            r1.mo14947W(r6)
            goto L_0x050e
        L_0x050b:
            r1.mo14888A()
        L_0x050e:
            r1.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r7 = r45.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r11, r7)
            kotlin.jvm.functions.p r7 = r45.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r12, r7)
            kotlin.jvm.functions.p r7 = r45.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r14, r7)
            kotlin.jvm.functions.p r7 = r45.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r15, r7)
            r1.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.invoke(r6, r1, r7)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r2)
            boolean r2 = m151486b(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6 = 3
            int r6 = r44 << 3
            r6 = r6 & 896(0x380, float:1.256E-42)
            r7 = 6
            r6 = r6 | r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r13.invoke(r10, r2, r1, r6)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            if (r4 == 0) goto L_0x05b5
            boolean r17 = m151486b(r5)
            androidx.compose.ui.m r21 = r10.mo7714e(r3, r9)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r2)
            boolean r2 = r1.mo15006n0(r5)
            boolean r6 = r1.mo15006n0(r0)
            r2 = r2 | r6
            java.lang.Object r6 = r1.mo14921N()
            if (r2 != 0) goto L_0x0591
            java.lang.Object r2 = r57.mo16277a()
            if (r6 != r2) goto L_0x0599
        L_0x0591:
            com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$ExpandableComponent$1$4$1 r6 = new com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$ExpandableComponent$1$4$1
            r6.<init>(r0, r5)
            r1.mo14893C(r6)
        L_0x0599:
            r1.mo15002m0()
            r18 = r6
            kotlin.jvm.functions.a r18 = (kotlin.jvm.functions.C11289a) r18
            int r2 = r8 >> 15
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 & r41
            r23 = r5 | r2
            r24 = 0
            r16 = r56
            r19 = r55
            r20 = r54
            r22 = r1
            m151489e(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x05b5:
            r1.mo15002m0()
        L_0x05b8:
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x05cd
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x05cd:
            r6 = r48
            r7 = r52
            r11 = r54
            r10 = r55
            r12 = r0
            r5 = r4
            r8 = r25
            r4 = r3
        L_0x05da:
            androidx.compose.runtime.t1 r15 = r1.mo15020s()
            if (r15 != 0) goto L_0x05e1
            goto L_0x0603
        L_0x05e1:
            com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$ExpandableComponent$2 r14 = new com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$ExpandableComponent$2
            r0 = r14
            r1 = r7
            r2 = r49
            r3 = r50
            r7 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r59
            r13 = r61
            r46 = r14
            r14 = r62
            r47 = r15
            r15 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r46
            r0 = r47
            r0.mo15202a(r1)
        L_0x0603:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.ExpandableComponentKt.m151485a(java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.m, boolean, boolean, androidx.compose.ui.c$b, com.carrefour.fid.android.design.components.compose.ExpandButtonPosition, int, int, kotlin.jvm.functions.l, kotlin.jvm.functions.r, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: b */
    public static final boolean m151486b(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: c */
    public static final void m151487c(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m151488d(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-101959998);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-101959998, i, -1, "com.carrefour.fid.android.design.components.compose.ExpandableComponentPreview (ExpandableComponent.kt:175)");
            }
            ThemeKt.m153788a(ComposableSingletons$ExpandableComponentKt.f92174a.mo112061g(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ExpandableComponentKt$ExpandableComponentPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: androidx.compose.ui.m$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$MoreLessComponent$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0265  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151489e(@org.jetbrains.annotations.C12579k java.lang.String r29, boolean r30, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r31, @androidx.annotation.C0375v int r32, @androidx.annotation.C0375v int r33, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r0 = r29
            r15 = r30
            r13 = r36
            java.lang.String r1 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = -585131168(0xffffffffdd1f9b60, float:-7.1880573E17)
            r2 = r35
            androidx.compose.runtime.o r14 = r2.mo15009o(r1)
            r2 = r37 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r13 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r14.mo15006n0(r0)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r13
            goto L_0x002b
        L_0x002a:
            r2 = r13
        L_0x002b:
            r3 = r37 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0042
        L_0x0032:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0042
            boolean r3 = r14.mo14961b(r15)
            if (r3 == 0) goto L_0x003f
            r3 = 32
            goto L_0x0041
        L_0x003f:
            r3 = 16
        L_0x0041:
            r2 = r2 | r3
        L_0x0042:
            r3 = r37 & 4
            if (r3 == 0) goto L_0x0049
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r4 = r13 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x005c
            r4 = r31
            boolean r5 = r14.mo14927P(r4)
            if (r5 == 0) goto L_0x0058
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r2 = r2 | r5
            goto L_0x005e
        L_0x005c:
            r4 = r31
        L_0x005e:
            r5 = r37 & 8
            if (r5 == 0) goto L_0x0067
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r9 = r32
            goto L_0x0079
        L_0x0067:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            r9 = r32
            if (r5 != 0) goto L_0x0079
            boolean r5 = r14.mo14976f(r9)
            if (r5 == 0) goto L_0x0076
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r2 = r2 | r5
        L_0x0079:
            r5 = r37 & 16
            if (r5 == 0) goto L_0x0082
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r10 = r33
            goto L_0x0096
        L_0x0082:
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r13
            r10 = r33
            if (r5 != 0) goto L_0x0096
            boolean r5 = r14.mo14976f(r10)
            if (r5 == 0) goto L_0x0093
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r2 = r2 | r5
        L_0x0096:
            r5 = r37 & 32
            if (r5 == 0) goto L_0x009e
            r6 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r6
            goto L_0x00b2
        L_0x009e:
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00b2
            r6 = r34
            boolean r7 = r14.mo15006n0(r6)
            if (r7 == 0) goto L_0x00ae
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r2 = r2 | r7
            goto L_0x00b4
        L_0x00b2:
            r6 = r34
        L_0x00b4:
            r8 = r2
            r2 = 374491(0x5b6db, float:5.24774E-40)
            r2 = r2 & r8
            r7 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r7) goto L_0x00cc
            boolean r2 = r14.mo15011p()
            if (r2 != 0) goto L_0x00c5
            goto L_0x00cc
        L_0x00c5:
            r14.mo14958a0()
            r3 = r4
            r0 = r14
            goto L_0x025e
        L_0x00cc:
            if (r3 == 0) goto L_0x00d2
            com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$MoreLessComponent$1 r2 = com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$MoreLessComponent$1.f92297f
            r7 = r2
            goto L_0x00d3
        L_0x00d2:
            r7 = r4
        L_0x00d3:
            if (r5 == 0) goto L_0x00da
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r25 = r2
            goto L_0x00dc
        L_0x00da:
            r25 = r6
        L_0x00dc:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00e8
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.MoreLessComponent (ExpandableComponent.kt:108)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r8, r2, r3)
        L_0x00e8:
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r1 = r1.mo17070q()
            r17 = 0
            r18 = 0
            r19 = 0
            r2 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r2)
            boolean r2 = r14.mo15006n0(r7)
            java.lang.Object r3 = r14.mo14921N()
            if (r2 != 0) goto L_0x010c
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x0114
        L_0x010c:
            com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$MoreLessComponent$2$1 r3 = new com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$MoreLessComponent$2$1
            r3.<init>(r7)
            r14.mo14893C(r3)
        L_0x0114:
            r14.mo15002m0()
            r20 = r3
            kotlin.jvm.functions.a r20 = (kotlin.jvm.functions.C11289a) r20
            r21 = 7
            r22 = 0
            r16 = r25
            androidx.compose.ui.m r2 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r3 = r3.mo7628l()
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r4)
            r4 = 54
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.RowKt.m10071d(r3, r1, r14, r4)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r6.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r12 = r14.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x0170
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0170:
            r14.mo14938T()
            boolean r12 = r14.mo14997l()
            if (r12 == 0) goto L_0x017d
            r14.mo14947W(r11)
            goto L_0x0180
        L_0x017d:
            r14.mo14888A()
        L_0x0180:
            r14.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r12 = r6.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r1, r12)
            kotlin.jvm.functions.p r1 = r6.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r3, r1)
            kotlin.jvm.functions.p r1 = r6.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r4, r1)
            kotlin.jvm.functions.p r1 = r6.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r5, r1)
            r14.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r12 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2.invoke(r1, r14, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r1)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r1 = 0
            int r11 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_primary
            long r2 = androidx.compose.p004ui.res.C16009b.m71825a(r11, r14, r12)
            r4 = 0
            r6 = 0
            r17 = 0
            r26 = r7
            r7 = r17
            r21 = r8
            r8 = r17
            r17 = 0
            r9 = r17
            r17 = 0
            r27 = r11
            r11 = r17
            r12 = r17
            r16 = 0
            r1 = r14
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            int r5 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r4 = r4.mo11077c(r1, r5)
            androidx.compose.ui.text.p0 r20 = com.carrefour.fid.android.design.theme.C37477d.m153896h(r4)
            r22 = r21 & 14
            r23 = 0
            r24 = 65530(0xfffa, float:9.1827E-41)
            r0 = r29
            r21 = r1
            r28 = r1
            r1 = 0
            r4 = 0
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 16
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10087C(r0, r1)
            r0 = 4
            float r0 = (float) r0
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10028o(r2, r3, r4, r5, r6, r7, r8)
            if (r30 == 0) goto L_0x022e
            r9 = r33
            goto L_0x0230
        L_0x022e:
            r9 = r32
        L_0x0230:
            r0 = r28
            r1 = 0
            androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.p004ui.res.C16015f.m71849d(r9, r0, r1)
            r3 = r27
            long r5 = androidx.compose.p004ui.res.C16009b.m71825a(r3, r0, r1)
            r3 = 0
            r8 = 440(0x1b8, float:6.17E-43)
            r9 = 0
            r7 = r0
            androidx.compose.material.IconKt.m13539b(r2, r3, r4, r5, r7, r8, r9)
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x025a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x025a:
            r6 = r25
            r3 = r26
        L_0x025e:
            androidx.compose.runtime.t1 r9 = r0.mo15020s()
            if (r9 != 0) goto L_0x0265
            goto L_0x027a
        L_0x0265:
            com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$MoreLessComponent$4 r10 = new com.carrefour.fid.android.design.components.compose.ExpandableComponentKt$MoreLessComponent$4
            r0 = r10
            r1 = r29
            r2 = r30
            r4 = r32
            r5 = r33
            r7 = r36
            r8 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x027a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.ExpandableComponentKt.m151489e(java.lang.String, boolean, kotlin.jvm.functions.a, int, int, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(name = "view Expanded")
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151490f(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(819947683);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(819947683, i, -1, "com.carrefour.fid.android.design.components.compose.MoreLessComponentExpandedPreview (ExpandableComponent.kt:145)");
            }
            ThemeKt.m153788a(ComposableSingletons$ExpandableComponentKt.f92174a.mo112056b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ExpandableComponentKt$MoreLessComponentExpandedPreview$1(i));
        }
    }

    @C8540g
    @C16464c(device = "id:pixel_4")
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m151491g(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1278779044);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1278779044, i, -1, "com.carrefour.fid.android.design.components.compose.MoreLessComponentPreview (ExpandableComponent.kt:160)");
            }
            ThemeKt.m153788a(ComposableSingletons$ExpandableComponentKt.f92174a.mo112058d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ExpandableComponentKt$MoreLessComponentPreview$1(i));
        }
    }
}
