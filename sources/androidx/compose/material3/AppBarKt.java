package androidx.compose.material3;

import androidx.compose.animation.core.C2009t;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16361p0;
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
import androidx.compose.runtime.internal.C8553b;
import com.urbanairship.util.C9647e0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1664:1\n67#2,3:1665\n66#2:1668\n50#2:1677\n49#2:1678\n36#2:1685\n36#2:1692\n67#2,3:1700\n66#2:1703\n36#2:1710\n36#2:1717\n456#2,11:1737\n460#2,13:1767\n473#2,3:1781\n460#2,13:1805\n473#2,3:1819\n460#2,13:1843\n473#2,3:1857\n467#2,3:1862\n1114#3,6:1669\n1114#3,6:1679\n1114#3,6:1686\n1114#3,6:1693\n1114#3,6:1704\n1114#3,6:1711\n1114#3,6:1718\n76#4:1675\n76#4:1699\n76#4:1725\n76#4:1755\n76#4:1793\n76#4:1831\n1#5:1676\n74#6:1724\n75#6,11:1726\n75#6:1754\n76#6,11:1756\n89#6:1784\n75#6:1792\n76#6,11:1794\n89#6:1822\n75#6:1830\n76#6,11:1832\n89#6:1860\n88#6:1865\n67#7,6:1748\n73#7:1780\n77#7:1785\n67#7,6:1786\n73#7:1818\n77#7:1823\n67#7,6:1824\n73#7:1856\n77#7:1861\n76#8:1866\n76#8:1867\n154#9:1868\n154#9:1870\n154#9:1872\n154#9:1874\n154#9:1876\n154#9:1877\n154#9:1878\n154#9:1879\n58#10:1869\n58#10:1871\n58#10:1873\n58#10:1875\n58#10:1880\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n*L\n800#1:1665,3\n800#1:1668\n1037#1:1677\n1037#1:1678\n1067#1:1685\n1070#1:1692\n1155#1:1700,3\n1155#1:1703\n1188#1:1710\n1191#1:1717\n1297#1:1737,11\n1299#1:1767,13\n1299#1:1781,3\n1309#1:1805,13\n1309#1:1819,3\n1323#1:1843,13\n1323#1:1857,3\n1297#1:1862,3\n800#1:1669,6\n1037#1:1679,6\n1067#1:1686,6\n1070#1:1693,6\n1155#1:1704,6\n1188#1:1711,6\n1191#1:1718,6\n1036#1:1675\n1147#1:1699\n1297#1:1725\n1299#1:1755\n1309#1:1793\n1323#1:1831\n1297#1:1724\n1297#1:1726,11\n1299#1:1754\n1299#1:1756,11\n1299#1:1784\n1309#1:1792\n1309#1:1794,11\n1309#1:1822\n1323#1:1830\n1323#1:1832,11\n1323#1:1860\n1297#1:1865\n1299#1:1748,6\n1299#1:1780\n1299#1:1785\n1309#1:1786,6\n1309#1:1818\n1309#1:1823\n1323#1:1824,6\n1323#1:1856\n1323#1:1861\n1049#1:1866\n1167#1:1867\n1005#1:1868\n1006#1:1870\n1009#1:1872\n1010#1:1874\n1657#1:1876\n1658#1:1877\n1659#1:1878\n1663#1:1879\n1005#1:1869\n1006#1:1871\n1009#1:1873\n1010#1:1875\n1663#1:1880\n*E\n"})
public final class AppBarKt {

    /* renamed from: a */
    public static final float f19155a;

    /* renamed from: b */
    public static final float f19156b;

    /* renamed from: c */
    public static final float f19157c;

    /* renamed from: d */
    public static final float f19158d;
    @C12579k

    /* renamed from: e */
    public static final C2009t f19159e = new C2009t(0.8f, 0.0f, 0.8f, 0.15f);

    /* renamed from: f */
    public static final float f19160f = C16483g.m74435M((float) 24);

    /* renamed from: g */
    public static final float f19161g = C16483g.m74435M((float) 28);

    /* renamed from: h */
    public static final float f19162h;

    /* renamed from: i */
    public static final float f19163i;

    static {
        float f = (float) 16;
        float f2 = (float) 12;
        float M = C16483g.m74435M(C16483g.m74435M(f) - C16483g.m74435M(f2));
        f19155a = M;
        float M2 = C16483g.m74435M(C16483g.m74435M(f) - C16483g.m74435M(f2));
        f19156b = M2;
        f19157c = C16483g.m74435M(C16483g.m74435M(f) - M);
        f19158d = C16483g.m74435M(C16483g.m74435M(f2) - M2);
        float M3 = C16483g.m74435M((float) 4);
        f19162h = M3;
        f19163i = C16483g.m74435M(C16483g.m74435M(f) - M3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f1  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25381a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r24, long r25, long r27, float r29, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r30, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r9 = r32
            r10 = r34
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -1391700845(0xffffffffad0c5493, float:-7.976858E-12)
            r1 = r33
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r10 | 6
            r4 = r3
            r3 = r24
            goto L_0x0030
        L_0x001c:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r24
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r10
            goto L_0x0030
        L_0x002d:
            r3 = r24
            r4 = r10
        L_0x0030:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r35 & 2
            if (r5 != 0) goto L_0x0043
            r5 = r25
            boolean r7 = r1.mo14980g(r5)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0043:
            r5 = r25
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
            goto L_0x004b
        L_0x0049:
            r5 = r25
        L_0x004b:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0064
            r7 = r35 & 4
            if (r7 != 0) goto L_0x005e
            r7 = r27
            boolean r11 = r1.mo14980g(r7)
            if (r11 == 0) goto L_0x0060
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r7 = r27
        L_0x0060:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r11
            goto L_0x0066
        L_0x0064:
            r7 = r27
        L_0x0066:
            r11 = r35 & 8
            if (r11 == 0) goto L_0x006d
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r12 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r29
            boolean r13 = r1.mo14968d(r12)
            if (r13 == 0) goto L_0x007c
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r4 = r4 | r13
            goto L_0x0082
        L_0x0080:
            r12 = r29
        L_0x0082:
            r13 = r35 & 16
            r14 = 57344(0xe000, float:8.0356E-41)
            if (r13 == 0) goto L_0x008c
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008c:
            r15 = r10 & r14
            if (r15 != 0) goto L_0x00a0
            r15 = r30
            boolean r16 = r1.mo15006n0(r15)
            if (r16 == 0) goto L_0x009b
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r4 = r4 | r16
            goto L_0x00a2
        L_0x00a0:
            r15 = r30
        L_0x00a2:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00bc
            r16 = r35 & 32
            r14 = r31
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r1.mo15006n0(r14)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r4 = r4 | r16
            goto L_0x00be
        L_0x00bc:
            r14 = r31
        L_0x00be:
            r16 = r35 & 64
            if (r16 == 0) goto L_0x00c7
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c4:
            r4 = r4 | r16
            goto L_0x00d9
        L_0x00c7:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00d9
            boolean r16 = r1.mo14927P(r9)
            if (r16 == 0) goto L_0x00d6
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00d6:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c4
        L_0x00d9:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r4 & r16
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r3) goto L_0x00f1
            boolean r0 = r1.mo15011p()
            if (r0 != 0) goto L_0x00ea
            goto L_0x00f1
        L_0x00ea:
            r1.mo14958a0()
            r2 = r24
            goto L_0x01be
        L_0x00f1:
            r1.mo14930Q()
            r0 = r10 & 1
            r3 = 6
            if (r0 == 0) goto L_0x011e
            boolean r0 = r1.mo14977f0()
            if (r0 == 0) goto L_0x0100
            goto L_0x011e
        L_0x0100:
            r1.mo14958a0()
            r0 = r35 & 2
            if (r0 == 0) goto L_0x0109
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0109:
            r0 = r35 & 4
            if (r0 == 0) goto L_0x010f
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x010f:
            r0 = r35 & 32
            if (r0 == 0) goto L_0x0117
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r0
        L_0x0117:
            r0 = r24
        L_0x0119:
            r11 = r4
            r2 = r12
            r4 = r15
            r15 = r14
            goto L_0x0164
        L_0x011e:
            if (r2 == 0) goto L_0x0123
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0125
        L_0x0123:
            r0 = r24
        L_0x0125:
            r2 = r35 & 2
            if (r2 == 0) goto L_0x0131
            androidx.compose.material3.h r2 = androidx.compose.material3.C8207h.f20146a
            long r5 = r2.mo12618b(r1, r3)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0131:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x0140
            int r2 = r4 >> 3
            r2 = r2 & 14
            long r7 = androidx.compose.material3.ColorSchemeKt.m25516c(r5, r1, r2)
            r2 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r2
        L_0x0140:
            if (r11 == 0) goto L_0x0149
            androidx.compose.material3.h r2 = androidx.compose.material3.C8207h.f20146a
            float r2 = r2.mo12619c()
            r12 = r2
        L_0x0149:
            if (r13 == 0) goto L_0x0152
            androidx.compose.material3.h r2 = androidx.compose.material3.C8207h.f20146a
            androidx.compose.foundation.layout.i0 r2 = r2.mo12620d()
            r15 = r2
        L_0x0152:
            r2 = r35 & 32
            if (r2 == 0) goto L_0x0119
            androidx.compose.material3.h r2 = androidx.compose.material3.C8207h.f20146a
            androidx.compose.foundation.layout.e1 r2 = r2.mo12621e(r1, r3)
            r11 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r11
            r11 = r4
            r4 = r15
            r15 = r2
            r2 = r12
        L_0x0164:
            r1.mo14899E()
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x0176
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.BottomAppBar (AppBar.kt:454)"
            r14 = -1391700845(0xffffffffad0c5493, float:-7.976858E-12)
            androidx.compose.runtime.ComposerKt.m29845w0(r14, r11, r12, r13)
        L_0x0176:
            androidx.compose.material3.tokens.c r12 = androidx.compose.material3.tokens.C8292c.f20752a
            androidx.compose.material3.tokens.ShapeKeyTokens r12 = r12.mo13209d()
            androidx.compose.ui.graphics.g4 r12 = androidx.compose.material3.ShapesKt.m26127f(r12, r1, r3)
            r18 = 0
            r19 = 0
            androidx.compose.material3.AppBarKt$BottomAppBar$3 r3 = new androidx.compose.material3.AppBarKt$BottomAppBar$3
            r3.<init>(r15, r4, r9, r11)
            r13 = -396569832(0xffffffffe85cd318, float:-4.1712585E24)
            r14 = 1
            androidx.compose.runtime.internal.a r20 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r13, r14, r3)
            r3 = r11 & 14
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r13
            int r11 = r11 << 3
            r13 = r11 & 896(0x380, float:1.256E-42)
            r3 = r3 | r13
            r13 = r11 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r13
            r22 = r3 | r11
            r23 = 96
            r11 = r0
            r13 = r5
            r3 = r15
            r15 = r7
            r17 = r2
            r21 = r1
            androidx.compose.material3.SurfaceKt.m26352a(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x01ba
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ba:
            r12 = r2
            r14 = r3
            r15 = r4
            r2 = r0
        L_0x01be:
            androidx.compose.runtime.t1 r13 = r1.mo15020s()
            if (r13 != 0) goto L_0x01c5
            goto L_0x01db
        L_0x01c5:
            androidx.compose.material3.AppBarKt$BottomAppBar$4 r11 = new androidx.compose.material3.AppBarKt$BottomAppBar$4
            r0 = r11
            r1 = r2
            r2 = r5
            r4 = r7
            r6 = r12
            r7 = r15
            r8 = r14
            r9 = r32
            r10 = r34
            r12 = r11
            r11 = r35
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11)
            r13.mo15202a(r12)
        L_0x01db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25381a(androidx.compose.ui.m, long, long, float, androidx.compose.foundation.layout.i0, androidx.compose.foundation.layout.e1, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0119  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25382b(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r28, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r29, long r30, long r32, float r34, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r35, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r36, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r37, int r38, int r39) {
        /*
            r1 = r27
            r11 = r38
            r12 = r39
            java.lang.String r0 = "actions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 2141738945(0x7fa857c1, float:NaN)
            r2 = r37
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r11 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.mo14927P(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r11
            goto L_0x002b
        L_0x002a:
            r3 = r11
        L_0x002b:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r28
            boolean r6 = r2.mo15006n0(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
            goto L_0x0047
        L_0x0045:
            r5 = r28
        L_0x0047:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r11 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r29
            boolean r8 = r2.mo14927P(r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r29
        L_0x0063:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007c
            r8 = r12 & 8
            if (r8 != 0) goto L_0x0076
            r8 = r30
            boolean r10 = r2.mo14980g(r8)
            if (r10 == 0) goto L_0x0078
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r8 = r30
        L_0x0078:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r3 = r3 | r10
            goto L_0x007e
        L_0x007c:
            r8 = r30
        L_0x007e:
            r10 = 57344(0xe000, float:8.0356E-41)
            r13 = r11 & r10
            if (r13 != 0) goto L_0x009a
            r13 = r12 & 16
            if (r13 != 0) goto L_0x0094
            r13 = r32
            boolean r15 = r2.mo14980g(r13)
            if (r15 == 0) goto L_0x0096
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0094:
            r13 = r32
        L_0x0096:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r15
            goto L_0x009c
        L_0x009a:
            r13 = r32
        L_0x009c:
            r15 = r12 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00a9
            r17 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r17
            r10 = r34
            goto L_0x00bc
        L_0x00a9:
            r17 = r11 & r16
            r10 = r34
            if (r17 != 0) goto L_0x00bc
            boolean r17 = r2.mo14968d(r10)
            if (r17 == 0) goto L_0x00b8
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r3 = r3 | r17
        L_0x00bc:
            r17 = r12 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00c7
            r3 = r3 | r18
            r0 = r35
            goto L_0x00dc
        L_0x00c7:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r11 & r19
            r0 = r35
            if (r19 != 0) goto L_0x00dc
            boolean r20 = r2.mo15006n0(r0)
            if (r20 == 0) goto L_0x00d8
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r3 = r3 | r20
        L_0x00dc:
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r20 = r11 & r20
            if (r20 != 0) goto L_0x00f8
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f1
            r0 = r36
            boolean r20 = r2.mo15006n0(r0)
            if (r20 == 0) goto L_0x00f3
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x00f1:
            r0 = r36
        L_0x00f3:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f5:
            r3 = r3 | r20
            goto L_0x00fa
        L_0x00f8:
            r0 = r36
        L_0x00fa:
            r20 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r3 & r20
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r5) goto L_0x0119
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x010b
            goto L_0x0119
        L_0x010b:
            r2.mo14958a0()
            r3 = r28
            r25 = r36
            r4 = r7
            r6 = r8
            r8 = r13
            r13 = r35
            goto L_0x01f7
        L_0x0119:
            r2.mo14930Q()
            r0 = r11 & 1
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = 6
            if (r0 == 0) goto L_0x014d
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x012b
            goto L_0x014d
        L_0x012b:
            r2.mo14958a0()
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0134
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0134:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x013a
            r3 = r3 & r20
        L_0x013a:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0142
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r0
        L_0x0142:
            r0 = r28
            r25 = r36
            r4 = r7
            r6 = r8
            r8 = r13
            r13 = r3
            r3 = r35
            goto L_0x01a2
        L_0x014d:
            if (r4 == 0) goto L_0x0152
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0154
        L_0x0152:
            r0 = r28
        L_0x0154:
            if (r6 == 0) goto L_0x0158
            r4 = 0
            goto L_0x0159
        L_0x0158:
            r4 = r7
        L_0x0159:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0166
            androidx.compose.material3.h r6 = androidx.compose.material3.C8207h.f20146a
            long r6 = r6.mo12618b(r2, r5)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0167
        L_0x0166:
            r6 = r8
        L_0x0167:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x0176
            int r8 = r3 >> 9
            r8 = r8 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m25516c(r6, r2, r8)
            r3 = r3 & r20
            goto L_0x0177
        L_0x0176:
            r8 = r13
        L_0x0177:
            if (r15 == 0) goto L_0x017f
            androidx.compose.material3.h r10 = androidx.compose.material3.C8207h.f20146a
            float r10 = r10.mo12619c()
        L_0x017f:
            if (r17 == 0) goto L_0x0188
            androidx.compose.material3.h r13 = androidx.compose.material3.C8207h.f20146a
            androidx.compose.foundation.layout.i0 r13 = r13.mo12620d()
            goto L_0x018a
        L_0x0188:
            r13 = r35
        L_0x018a:
            r14 = r12 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x019b
            androidx.compose.material3.h r14 = androidx.compose.material3.C8207h.f20146a
            androidx.compose.foundation.layout.e1 r14 = r14.mo12621e(r2, r5)
            r15 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r15
            r25 = r14
            goto L_0x019d
        L_0x019b:
            r25 = r36
        L_0x019d:
            r26 = r13
            r13 = r3
            r3 = r26
        L_0x01a2:
            r2.mo14899E()
            boolean r14 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r14 == 0) goto L_0x01b4
            r14 = -1
            java.lang.String r15 = "androidx.compose.material3.BottomAppBar (AppBar.kt:394)"
            r5 = 2141738945(0x7fa857c1, float:NaN)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r13, r14, r15)
        L_0x01b4:
            androidx.compose.material3.AppBarKt$BottomAppBar$1 r5 = new androidx.compose.material3.AppBarKt$BottomAppBar$1
            r5.<init>(r1, r13, r4)
            r14 = 1974005449(0x75a8eec9, float:4.282954E32)
            r15 = 1
            androidx.compose.runtime.internal.a r21 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r14, r15, r5)
            int r5 = r13 >> 3
            r5 = r5 & 14
            r5 = r5 | r18
            r14 = 6
            int r13 = r13 >> r14
            r14 = r13 & 112(0x70, float:1.57E-43)
            r5 = r5 | r14
            r14 = r13 & 896(0x380, float:1.256E-42)
            r5 = r5 | r14
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r13
            r5 = r5 | r14
            r13 = r13 & r16
            r23 = r5 | r13
            r24 = 0
            r13 = r0
            r14 = r6
            r16 = r8
            r18 = r10
            r19 = r3
            r20 = r25
            r22 = r2
            m25381a(r13, r14, r16, r18, r19, r20, r21, r22, r23, r24)
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x01f5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01f5:
            r13 = r3
            r3 = r0
        L_0x01f7:
            androidx.compose.runtime.t1 r14 = r2.mo15020s()
            if (r14 != 0) goto L_0x01fe
            goto L_0x0215
        L_0x01fe:
            androidx.compose.material3.AppBarKt$BottomAppBar$2 r15 = new androidx.compose.material3.AppBarKt$BottomAppBar$2
            r0 = r15
            r1 = r27
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r9 = r13
            r10 = r25
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r14.mo15202a(r15)
        L_0x0215:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25382b(kotlin.jvm.functions.q, androidx.compose.ui.m, kotlin.jvm.functions.p, long, long, float, androidx.compose.foundation.layout.i0, androidx.compose.foundation.layout.e1, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.q<androidx.compose.foundation.layout.u0, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f6  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25383c(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r34, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8270q3 r35, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8275r3 r36, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r37, int r38, int r39) {
        /*
            r12 = r30
            r13 = r38
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -2139286460(0xffffffff807d1444, float:-1.1486707E-38)
            r1 = r37
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r39 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r13 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0028
            boolean r1 = r11.mo14927P(r12)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r13
            goto L_0x0029
        L_0x0028:
            r1 = r13
        L_0x0029:
            r2 = r39 & 2
            if (r2 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0043
        L_0x0030:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0043
            r3 = r31
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x003f
            r4 = 32
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r1 = r1 | r4
            goto L_0x0045
        L_0x0043:
            r3 = r31
        L_0x0045:
            r4 = r39 & 4
            if (r4 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x005f
            r5 = r32
            boolean r6 = r11.mo14927P(r5)
            if (r6 == 0) goto L_0x005b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r6
            goto L_0x0061
        L_0x005f:
            r5 = r32
        L_0x0061:
            r6 = r39 & 8
            if (r6 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007b
            r7 = r33
            boolean r8 = r11.mo14927P(r7)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r8
            goto L_0x007d
        L_0x007b:
            r7 = r33
        L_0x007d:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r13 & r8
            if (r9 != 0) goto L_0x0099
            r9 = r39 & 16
            if (r9 != 0) goto L_0x0093
            r9 = r34
            boolean r10 = r11.mo15006n0(r9)
            if (r10 == 0) goto L_0x0095
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r9 = r34
        L_0x0095:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r10
            goto L_0x009b
        L_0x0099:
            r9 = r34
        L_0x009b:
            r10 = 458752(0x70000, float:6.42848E-40)
            r14 = r13 & r10
            if (r14 != 0) goto L_0x00b6
            r14 = r39 & 32
            if (r14 != 0) goto L_0x00b0
            r14 = r35
            boolean r15 = r11.mo15006n0(r14)
            if (r15 == 0) goto L_0x00b2
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b0:
            r14 = r35
        L_0x00b2:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r1 = r1 | r15
            goto L_0x00b8
        L_0x00b6:
            r14 = r35
        L_0x00b8:
            r28 = r39 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00c2
            r15 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r15
            goto L_0x00d6
        L_0x00c2:
            r15 = r13 & r29
            if (r15 != 0) goto L_0x00d6
            r15 = r36
            boolean r16 = r11.mo15006n0(r15)
            if (r16 == 0) goto L_0x00d1
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r1 = r1 | r16
            goto L_0x00d8
        L_0x00d6:
            r15 = r36
        L_0x00d8:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r1 & r16
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r8) goto L_0x00f6
            boolean r8 = r11.mo15011p()
            if (r8 != 0) goto L_0x00e9
            goto L_0x00f6
        L_0x00e9:
            r11.mo14958a0()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r9
            r21 = r11
            r6 = r14
            r7 = r15
            goto L_0x01e6
        L_0x00f6:
            r11.mo14930Q()
            r8 = r13 & 1
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 6
            if (r8 == 0) goto L_0x0124
            boolean r8 = r11.mo14977f0()
            if (r8 == 0) goto L_0x010b
            goto L_0x0124
        L_0x010b:
            r11.mo14958a0()
            r2 = r39 & 16
            if (r2 == 0) goto L_0x0114
            r1 = r1 & r16
        L_0x0114:
            r2 = r39 & 32
            if (r2 == 0) goto L_0x0119
            r1 = r1 & r10
        L_0x0119:
            r16 = r7
            r17 = r9
            r18 = r14
            r19 = r15
            r14 = r3
            r15 = r5
            goto L_0x0178
        L_0x0124:
            if (r2 == 0) goto L_0x0129
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x012a
        L_0x0129:
            r2 = r3
        L_0x012a:
            if (r4 == 0) goto L_0x0133
            androidx.compose.material3.ComposableSingletons$AppBarKt r3 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.p r3 = r3.mo11281h()
            goto L_0x0134
        L_0x0133:
            r3 = r5
        L_0x0134:
            if (r6 == 0) goto L_0x013d
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.q r4 = r4.mo11282i()
            r7 = r4
        L_0x013d:
            r4 = r39 & 16
            if (r4 == 0) goto L_0x014a
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f19955a
            androidx.compose.foundation.layout.e1 r4 = r4.mo12405d(r11, r0)
            r1 = r1 & r16
            r9 = r4
        L_0x014a:
            r4 = r39 & 32
            if (r4 == 0) goto L_0x0167
            androidx.compose.material3.TopAppBarDefaults r14 = androidx.compose.material3.TopAppBarDefaults.f19955a
            r4 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 31
            r15 = r4
            r25 = r11
            androidx.compose.material3.q3 r4 = r14.mo12402a(r15, r17, r19, r21, r23, r25, r26, r27)
            r1 = r1 & r10
            r14 = r4
        L_0x0167:
            if (r28 == 0) goto L_0x016e
            r4 = 0
            r15 = r3
            r19 = r4
            goto L_0x0171
        L_0x016e:
            r19 = r36
            r15 = r3
        L_0x0171:
            r16 = r7
            r17 = r9
            r18 = r14
            r14 = r2
        L_0x0178:
            r11.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x018a
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:224)"
            r4 = -2139286460(0xffffffff807d1444, float:-1.1486707E-38)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x018a:
            androidx.compose.material3.i1 r2 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.s3 r2 = r2.mo12654c(r11, r0)
            androidx.compose.material3.tokens.k1 r3 = androidx.compose.material3.tokens.C8318k1.f21543a
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.mo13932g()
            androidx.compose.ui.text.p0 r2 = androidx.compose.material3.TypographyKt.m26914a(r2, r3)
            r3 = 1
            int r4 = r1 >> 3
            r4 = r4 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            int r5 = r1 << 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            int r0 = r1 << 6
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r0
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r0
            r1 = r1 | r4
            r4 = r0 & r29
            r1 = r1 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r0
            r1 = r1 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r4
            r10 = r1 | r0
            r20 = 0
            r0 = r14
            r1 = r30
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r11
            r21 = r11
            r11 = r20
            m25386f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01dc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01dc:
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
        L_0x01e6:
            androidx.compose.runtime.t1 r10 = r21.mo15020s()
            if (r10 != 0) goto L_0x01ed
            goto L_0x01fc
        L_0x01ed:
            androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$1 r11 = new androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$1
            r0 = r11
            r1 = r30
            r8 = r38
            r9 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25383c(kotlin.jvm.functions.p, androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.foundation.layout.e1, androidx.compose.material3.q3, androidx.compose.material3.r3, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.q<androidx.compose.foundation.layout.u0, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f2  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25384d(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r31, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r32, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r35, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8270q3 r36, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8275r3 r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40) {
        /*
            r13 = r31
            r12 = r39
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -474540752(0xffffffffe3b71530, float:-6.754562E21)
            r1 = r38
            androidx.compose.runtime.o r9 = r1.mo15009o(r0)
            r1 = r40 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r12 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x0028
            boolean r1 = r9.mo14927P(r13)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r12
            goto L_0x0029
        L_0x0028:
            r1 = r12
        L_0x0029:
            r2 = r40 & 2
            if (r2 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0043
        L_0x0030:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0043
            r3 = r32
            boolean r4 = r9.mo15006n0(r3)
            if (r4 == 0) goto L_0x003f
            r4 = 32
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r1 = r1 | r4
            goto L_0x0045
        L_0x0043:
            r3 = r32
        L_0x0045:
            r4 = r40 & 4
            if (r4 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x005f
            r5 = r33
            boolean r6 = r9.mo14927P(r5)
            if (r6 == 0) goto L_0x005b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r6
            goto L_0x0061
        L_0x005f:
            r5 = r33
        L_0x0061:
            r6 = r40 & 8
            if (r6 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007b
            r7 = r34
            boolean r8 = r9.mo14927P(r7)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r8
            goto L_0x007d
        L_0x007b:
            r7 = r34
        L_0x007d:
            r8 = 57344(0xe000, float:8.0356E-41)
            r10 = r12 & r8
            if (r10 != 0) goto L_0x0099
            r10 = r40 & 16
            if (r10 != 0) goto L_0x0093
            r10 = r35
            boolean r11 = r9.mo15006n0(r10)
            if (r11 == 0) goto L_0x0095
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r10 = r35
        L_0x0095:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r11
            goto L_0x009b
        L_0x0099:
            r10 = r35
        L_0x009b:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00b5
            r11 = r40 & 32
            if (r11 != 0) goto L_0x00af
            r11 = r36
            boolean r14 = r9.mo15006n0(r11)
            if (r14 == 0) goto L_0x00b1
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00af:
            r11 = r36
        L_0x00b1:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r1 = r1 | r14
            goto L_0x00b7
        L_0x00b5:
            r11 = r36
        L_0x00b7:
            r28 = r40 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00c3
            r14 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r14
            r15 = r37
            goto L_0x00d5
        L_0x00c3:
            r14 = r12 & r29
            r15 = r37
            if (r14 != 0) goto L_0x00d5
            boolean r14 = r9.mo15006n0(r15)
            if (r14 == 0) goto L_0x00d2
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r1 = r1 | r14
        L_0x00d5:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r1
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r8) goto L_0x00f2
            boolean r8 = r9.mo15011p()
            if (r8 != 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            r9.mo14958a0()
            r2 = r3
            r3 = r5
            r4 = r7
            r23 = r9
            r5 = r10
            r6 = r11
            r7 = r15
            goto L_0x020b
        L_0x00f2:
            r9.mo14930Q()
            r8 = r12 & 1
            r30 = -458753(0xfffffffffff8ffff, float:NaN)
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 6
            if (r8 == 0) goto L_0x0122
            boolean r8 = r9.mo14977f0()
            if (r8 == 0) goto L_0x0107
            goto L_0x0122
        L_0x0107:
            r9.mo14958a0()
            r2 = r40 & 16
            if (r2 == 0) goto L_0x010f
            r1 = r1 & r14
        L_0x010f:
            r2 = r40 & 32
            if (r2 == 0) goto L_0x0115
            r1 = r1 & r30
        L_0x0115:
            r17 = r3
            r18 = r5
            r19 = r7
            r20 = r10
            r21 = r11
            r22 = r15
            goto L_0x017b
        L_0x0122:
            if (r2 == 0) goto L_0x0127
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0128
        L_0x0127:
            r2 = r3
        L_0x0128:
            if (r4 == 0) goto L_0x0131
            androidx.compose.material3.ComposableSingletons$AppBarKt r3 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.p r3 = r3.mo11285l()
            goto L_0x0132
        L_0x0131:
            r3 = r5
        L_0x0132:
            if (r6 == 0) goto L_0x013b
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.q r4 = r4.mo11275b()
            r7 = r4
        L_0x013b:
            r4 = r40 & 16
            if (r4 == 0) goto L_0x0147
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f19955a
            androidx.compose.foundation.layout.e1 r4 = r4.mo12405d(r9, r0)
            r1 = r1 & r14
            r10 = r4
        L_0x0147:
            r4 = r40 & 32
            if (r4 == 0) goto L_0x0165
            androidx.compose.material3.TopAppBarDefaults r14 = androidx.compose.material3.TopAppBarDefaults.f19955a
            r4 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 31
            r15 = r4
            r25 = r9
            androidx.compose.material3.q3 r4 = r14.mo12406e(r15, r17, r19, r21, r23, r25, r26, r27)
            r1 = r1 & r30
            r11 = r4
        L_0x0165:
            if (r28 == 0) goto L_0x016f
            r4 = 0
            r17 = r2
            r18 = r3
            r22 = r4
            goto L_0x0175
        L_0x016f:
            r22 = r37
            r17 = r2
            r18 = r3
        L_0x0175:
            r19 = r7
            r20 = r10
            r21 = r11
        L_0x017b:
            r9.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x018d
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.LargeTopAppBar (AppBar.kt:337)"
            r4 = -474540752(0xffffffffe3b71530, float:-6.754562E21)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x018d:
            androidx.compose.material3.i1 r3 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.s3 r2 = r3.mo12654c(r9, r0)
            androidx.compose.material3.tokens.h1 r4 = androidx.compose.material3.tokens.C8309h1.f21296a
            androidx.compose.material3.tokens.TypographyKeyTokens r5 = r4.mo13701g()
            androidx.compose.ui.text.p0 r2 = androidx.compose.material3.TypographyKt.m26914a(r2, r5)
            androidx.compose.material3.s3 r0 = r3.mo12654c(r9, r0)
            androidx.compose.material3.tokens.k1 r6 = androidx.compose.material3.tokens.C8318k1.f21543a
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r6.mo13932g()
            androidx.compose.ui.text.p0 r5 = androidx.compose.material3.TypographyKt.m26914a(r0, r3)
            float r3 = f19161g
            float r10 = r4.mo13697c()
            float r11 = r6.mo13928c()
            int r0 = r1 >> 3
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r4 = r1 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r0 = r0 | r4
            int r4 = r1 << 12
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = r4 & r29
            r0 = r0 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r6
            r14 = r0 | r4
            int r0 = r1 >> 12
            r0 = r0 & 896(0x380, float:1.256E-42)
            r15 = r0 | 54
            r16 = 0
            r0 = r17
            r1 = r31
            r4 = r31
            r6 = r18
            r7 = r19
            r8 = r20
            r23 = r9
            r9 = r21
            r12 = r22
            r13 = r23
            m25391k(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ff
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ff:
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
        L_0x020b:
            androidx.compose.runtime.t1 r10 = r23.mo15020s()
            if (r10 != 0) goto L_0x0212
            goto L_0x0221
        L_0x0212:
            androidx.compose.material3.AppBarKt$LargeTopAppBar$1 r11 = new androidx.compose.material3.AppBarKt$LargeTopAppBar$1
            r0 = r11
            r1 = r31
            r8 = r39
            r9 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25384d(kotlin.jvm.functions.p, androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.foundation.layout.e1, androidx.compose.material3.q3, androidx.compose.material3.r3, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.q<androidx.compose.foundation.layout.u0, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f2  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25385e(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r31, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r32, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r35, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8270q3 r36, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8275r3 r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40) {
        /*
            r13 = r31
            r12 = r39
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 1805417862(0x6b9c7d86, float:3.783704E26)
            r1 = r38
            androidx.compose.runtime.o r9 = r1.mo15009o(r0)
            r1 = r40 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r12 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x0028
            boolean r1 = r9.mo14927P(r13)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r12
            goto L_0x0029
        L_0x0028:
            r1 = r12
        L_0x0029:
            r2 = r40 & 2
            if (r2 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0043
        L_0x0030:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0043
            r3 = r32
            boolean r4 = r9.mo15006n0(r3)
            if (r4 == 0) goto L_0x003f
            r4 = 32
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r1 = r1 | r4
            goto L_0x0045
        L_0x0043:
            r3 = r32
        L_0x0045:
            r4 = r40 & 4
            if (r4 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x005f
            r5 = r33
            boolean r6 = r9.mo14927P(r5)
            if (r6 == 0) goto L_0x005b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r6
            goto L_0x0061
        L_0x005f:
            r5 = r33
        L_0x0061:
            r6 = r40 & 8
            if (r6 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007b
            r7 = r34
            boolean r8 = r9.mo14927P(r7)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r8
            goto L_0x007d
        L_0x007b:
            r7 = r34
        L_0x007d:
            r8 = 57344(0xe000, float:8.0356E-41)
            r10 = r12 & r8
            if (r10 != 0) goto L_0x0099
            r10 = r40 & 16
            if (r10 != 0) goto L_0x0093
            r10 = r35
            boolean r11 = r9.mo15006n0(r10)
            if (r11 == 0) goto L_0x0095
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r10 = r35
        L_0x0095:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r11
            goto L_0x009b
        L_0x0099:
            r10 = r35
        L_0x009b:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00b5
            r11 = r40 & 32
            if (r11 != 0) goto L_0x00af
            r11 = r36
            boolean r14 = r9.mo15006n0(r11)
            if (r14 == 0) goto L_0x00b1
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00af:
            r11 = r36
        L_0x00b1:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r1 = r1 | r14
            goto L_0x00b7
        L_0x00b5:
            r11 = r36
        L_0x00b7:
            r28 = r40 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00c3
            r14 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r14
            r15 = r37
            goto L_0x00d5
        L_0x00c3:
            r14 = r12 & r29
            r15 = r37
            if (r14 != 0) goto L_0x00d5
            boolean r14 = r9.mo15006n0(r15)
            if (r14 == 0) goto L_0x00d2
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r1 = r1 | r14
        L_0x00d5:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r1
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r8) goto L_0x00f2
            boolean r8 = r9.mo15011p()
            if (r8 != 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            r9.mo14958a0()
            r2 = r3
            r3 = r5
            r4 = r7
            r23 = r9
            r5 = r10
            r6 = r11
            r7 = r15
            goto L_0x020b
        L_0x00f2:
            r9.mo14930Q()
            r8 = r12 & 1
            r30 = -458753(0xfffffffffff8ffff, float:NaN)
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 6
            if (r8 == 0) goto L_0x0122
            boolean r8 = r9.mo14977f0()
            if (r8 == 0) goto L_0x0107
            goto L_0x0122
        L_0x0107:
            r9.mo14958a0()
            r2 = r40 & 16
            if (r2 == 0) goto L_0x010f
            r1 = r1 & r14
        L_0x010f:
            r2 = r40 & 32
            if (r2 == 0) goto L_0x0115
            r1 = r1 & r30
        L_0x0115:
            r17 = r3
            r18 = r5
            r19 = r7
            r20 = r10
            r21 = r11
            r22 = r15
            goto L_0x017b
        L_0x0122:
            if (r2 == 0) goto L_0x0127
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0128
        L_0x0127:
            r2 = r3
        L_0x0128:
            if (r4 == 0) goto L_0x0131
            androidx.compose.material3.ComposableSingletons$AppBarKt r3 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.p r3 = r3.mo11283j()
            goto L_0x0132
        L_0x0131:
            r3 = r5
        L_0x0132:
            if (r6 == 0) goto L_0x013b
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.q r4 = r4.mo11284k()
            r7 = r4
        L_0x013b:
            r4 = r40 & 16
            if (r4 == 0) goto L_0x0147
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f19955a
            androidx.compose.foundation.layout.e1 r4 = r4.mo12405d(r9, r0)
            r1 = r1 & r14
            r10 = r4
        L_0x0147:
            r4 = r40 & 32
            if (r4 == 0) goto L_0x0165
            androidx.compose.material3.TopAppBarDefaults r14 = androidx.compose.material3.TopAppBarDefaults.f19955a
            r4 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 31
            r15 = r4
            r25 = r9
            androidx.compose.material3.q3 r4 = r14.mo12407f(r15, r17, r19, r21, r23, r25, r26, r27)
            r1 = r1 & r30
            r11 = r4
        L_0x0165:
            if (r28 == 0) goto L_0x016f
            r4 = 0
            r17 = r2
            r18 = r3
            r22 = r4
            goto L_0x0175
        L_0x016f:
            r22 = r37
            r17 = r2
            r18 = r3
        L_0x0175:
            r19 = r7
            r20 = r10
            r21 = r11
        L_0x017b:
            r9.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x018d
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.MediumTopAppBar (AppBar.kt:279)"
            r4 = 1805417862(0x6b9c7d86, float:3.783704E26)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x018d:
            androidx.compose.material3.i1 r3 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.s3 r2 = r3.mo12654c(r9, r0)
            androidx.compose.material3.tokens.i1 r4 = androidx.compose.material3.tokens.C8312i1.f21390a
            androidx.compose.material3.tokens.TypographyKeyTokens r5 = r4.mo13791g()
            androidx.compose.ui.text.p0 r2 = androidx.compose.material3.TypographyKt.m26914a(r2, r5)
            androidx.compose.material3.s3 r0 = r3.mo12654c(r9, r0)
            androidx.compose.material3.tokens.k1 r6 = androidx.compose.material3.tokens.C8318k1.f21543a
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r6.mo13932g()
            androidx.compose.ui.text.p0 r5 = androidx.compose.material3.TypographyKt.m26914a(r0, r3)
            float r3 = f19160f
            float r10 = r4.mo13787c()
            float r11 = r6.mo13928c()
            int r0 = r1 >> 3
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r4 = r1 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r0 = r0 | r4
            int r4 = r1 << 12
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = r4 & r29
            r0 = r0 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r6
            r14 = r0 | r4
            int r0 = r1 >> 12
            r0 = r0 & 896(0x380, float:1.256E-42)
            r15 = r0 | 54
            r16 = 0
            r0 = r17
            r1 = r31
            r4 = r31
            r6 = r18
            r7 = r19
            r8 = r20
            r23 = r9
            r9 = r21
            r12 = r22
            r13 = r23
            m25391k(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ff
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ff:
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
        L_0x020b:
            androidx.compose.runtime.t1 r10 = r23.mo15020s()
            if (r10 != 0) goto L_0x0212
            goto L_0x0221
        L_0x0212:
            androidx.compose.material3.AppBarKt$MediumTopAppBar$1 r11 = new androidx.compose.material3.AppBarKt$MediumTopAppBar$1
            r0 = r11
            r1 = r31
            r8 = r39
            r9 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25385e(kotlin.jvm.functions.p, androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.foundation.layout.e1, androidx.compose.material3.q3, androidx.compose.material3.r3, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: kotlin.jvm.functions.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011d  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25386f(androidx.compose.p004ui.C8767m r34, kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r35, androidx.compose.p004ui.text.C16361p0 r36, boolean r37, kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r38, kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r39, androidx.compose.foundation.layout.C2354e1 r40, androidx.compose.material3.C8270q3 r41, androidx.compose.material3.C8275r3 r42, androidx.compose.runtime.C8592o r43, int r44, int r45) {
        /*
            r6 = r39
            r5 = r41
            r4 = r42
            r3 = r44
            r2 = r45
            r0 = 1841601619(0x6dc49c53, float:7.606006E27)
            r1 = r43
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r7 = r2 & 1
            if (r7 == 0) goto L_0x001d
            r8 = r3 | 6
            r9 = r8
            r8 = r34
            goto L_0x0031
        L_0x001d:
            r8 = r3 & 14
            if (r8 != 0) goto L_0x002e
            r8 = r34
            boolean r9 = r1.mo15006n0(r8)
            if (r9 == 0) goto L_0x002b
            r9 = 4
            goto L_0x002c
        L_0x002b:
            r9 = 2
        L_0x002c:
            r9 = r9 | r3
            goto L_0x0031
        L_0x002e:
            r8 = r34
            r9 = r3
        L_0x0031:
            r10 = r2 & 2
            if (r10 == 0) goto L_0x003a
            r9 = r9 | 48
            r15 = r35
            goto L_0x004c
        L_0x003a:
            r10 = r3 & 112(0x70, float:1.57E-43)
            r15 = r35
            if (r10 != 0) goto L_0x004c
            boolean r10 = r1.mo14927P(r15)
            if (r10 == 0) goto L_0x0049
            r10 = 32
            goto L_0x004b
        L_0x0049:
            r10 = 16
        L_0x004b:
            r9 = r9 | r10
        L_0x004c:
            r10 = r2 & 4
            if (r10 == 0) goto L_0x0055
            r9 = r9 | 384(0x180, float:5.38E-43)
            r14 = r36
            goto L_0x0067
        L_0x0055:
            r10 = r3 & 896(0x380, float:1.256E-42)
            r14 = r36
            if (r10 != 0) goto L_0x0067
            boolean r10 = r1.mo15006n0(r14)
            if (r10 == 0) goto L_0x0064
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r9 = r9 | r10
        L_0x0067:
            r10 = r2 & 8
            if (r10 == 0) goto L_0x0070
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r13 = r37
            goto L_0x0082
        L_0x0070:
            r10 = r3 & 7168(0x1c00, float:1.0045E-41)
            r13 = r37
            if (r10 != 0) goto L_0x0082
            boolean r10 = r1.mo14961b(r13)
            if (r10 == 0) goto L_0x007f
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r9 = r9 | r10
        L_0x0082:
            r10 = r2 & 16
            if (r10 == 0) goto L_0x008b
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            r12 = r38
            goto L_0x009f
        L_0x008b:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r3
            r12 = r38
            if (r10 != 0) goto L_0x009f
            boolean r10 = r1.mo14927P(r12)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r9 = r9 | r10
        L_0x009f:
            r10 = r2 & 32
            if (r10 == 0) goto L_0x00a7
            r10 = 196608(0x30000, float:2.75506E-40)
        L_0x00a5:
            r9 = r9 | r10
            goto L_0x00b8
        L_0x00a7:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x00b8
            boolean r10 = r1.mo14927P(r6)
            if (r10 == 0) goto L_0x00b5
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a5
        L_0x00b5:
            r10 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a5
        L_0x00b8:
            r10 = r2 & 64
            if (r10 == 0) goto L_0x00c2
            r10 = 1572864(0x180000, float:2.204052E-39)
            r9 = r9 | r10
            r11 = r40
            goto L_0x00d5
        L_0x00c2:
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r3
            r11 = r40
            if (r10 != 0) goto L_0x00d5
            boolean r10 = r1.mo15006n0(r11)
            if (r10 == 0) goto L_0x00d2
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r9 = r9 | r10
        L_0x00d5:
            r10 = r2 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00dd
            r10 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00db:
            r9 = r9 | r10
            goto L_0x00ee
        L_0x00dd:
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x00ee
            boolean r10 = r1.mo15006n0(r5)
            if (r10 == 0) goto L_0x00eb
            r10 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00db
        L_0x00eb:
            r10 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00db
        L_0x00ee:
            r10 = r2 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x00f6
            r10 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00f4:
            r9 = r9 | r10
            goto L_0x0107
        L_0x00f6:
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x0107
            boolean r10 = r1.mo15006n0(r4)
            if (r10 == 0) goto L_0x0104
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00f4
        L_0x0104:
            r10 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00f4
        L_0x0107:
            r10 = r9
            r9 = 191739611(0xb6db6db, float:4.5782105E-32)
            r9 = r9 & r10
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r9 != r0) goto L_0x011d
            boolean r0 = r1.mo15011p()
            if (r0 != 0) goto L_0x0118
            goto L_0x011d
        L_0x0118:
            r1.mo14958a0()
            goto L_0x02a0
        L_0x011d:
            if (r7 == 0) goto L_0x0122
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0123
        L_0x0122:
            r0 = r8
        L_0x0123:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x0132
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1021)"
            r9 = 1841601619(0x6dc49c53, float:7.606006E27)
            androidx.compose.runtime.ComposerKt.m29845w0(r9, r10, r7, r8)
        L_0x0132:
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.material3.tokens.k1 r8 = androidx.compose.material3.tokens.C8318k1.f21543a
            float r8 = r8.mo13928c()
            float r7 = r7.mo7425g5(r8)
            float r7 = -r7
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            r9 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r9)
            boolean r9 = r1.mo15006n0(r4)
            boolean r8 = r1.mo15006n0(r8)
            r8 = r8 | r9
            java.lang.Object r9 = r1.mo14921N()
            if (r8 != 0) goto L_0x0168
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r9 != r8) goto L_0x0170
        L_0x0168:
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$1$1 r9 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$1$1
            r9.<init>(r4, r7)
            r1.mo14893C(r9)
        L_0x0170:
            r1.mo15002m0()
            kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
            r7 = 0
            androidx.compose.runtime.EffectsKt.m29899k(r9, r1, r7)
            r8 = 0
            if (r4 == 0) goto L_0x0187
            androidx.compose.material3.TopAppBarState r9 = r42.getState()
            if (r9 == 0) goto L_0x0187
            float r9 = r9.mo12415f()
            goto L_0x0188
        L_0x0187:
            r9 = r8
        L_0x0188:
            r16 = 1008981770(0x3c23d70a, float:0.01)
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0192
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0193
        L_0x0192:
            r9 = r8
        L_0x0193:
            int r16 = r10 >> 18
            r7 = r16 & 112(0x70, float:1.57E-43)
            long r16 = r5.mo12935a(r9, r1, r7)
            r7 = 1137180672(0x43c80000, float:400.0)
            r9 = 5
            r14 = 0
            androidx.compose.animation.core.v0 r9 = androidx.compose.animation.core.C1972h.m8390o(r8, r7, r14, r9, r14)
            r18 = 0
            r19 = 0
            r20 = 48
            r21 = 12
            r7 = r16
            r23 = r10
            r10 = r18
            r11 = r19
            r12 = r1
            r13 = r20
            r2 = r14
            r14 = r21
            androidx.compose.runtime.k2 r7 = androidx.compose.animation.C2040p.m8743c(r7, r9, r10, r11, r12, r13, r14)
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1 r8 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
            r14 = r23
            r8.<init>(r6, r14)
            r9 = 1520880938(0x5aa6cd2a, float:2.34752132E16)
            r13 = 1
            androidx.compose.runtime.internal.a r16 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r9, r13, r8)
            r8 = -1008376318(0xffffffffc3e56602, float:-458.79694)
            r1.mo14918M(r8)
            if (r4 == 0) goto L_0x023f
            boolean r8 = r42.mo11536b()
            if (r8 != 0) goto L_0x023f
            androidx.compose.ui.m$a r23 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.gestures.Orientation r25 = androidx.compose.foundation.gestures.Orientation.Vertical
            r8 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r8)
            boolean r9 = r1.mo15006n0(r4)
            java.lang.Object r10 = r1.mo14921N()
            if (r9 != 0) goto L_0x01f6
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r10 != r9) goto L_0x01fe
        L_0x01f6:
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1 r10 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1
            r10.<init>(r4)
            r1.mo14893C(r10)
        L_0x01fe:
            r1.mo15002m0()
            kotlin.jvm.functions.l r10 = (kotlin.jvm.functions.C11300l) r10
            r9 = 0
            androidx.compose.foundation.gestures.f r24 = androidx.compose.foundation.gestures.DraggableKt.m9310n(r10, r1, r9)
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r1.mo14918M(r8)
            boolean r8 = r1.mo15006n0(r4)
            java.lang.Object r9 = r1.mo14921N()
            if (r8 != 0) goto L_0x0225
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r9 != r8) goto L_0x022d
        L_0x0225:
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 r9 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1
            r9.<init>(r4, r2)
            r1.mo14893C(r9)
        L_0x022d:
            r1.mo15002m0()
            r30 = r9
            kotlin.jvm.functions.q r30 = (kotlin.jvm.functions.C11305q) r30
            r31 = 0
            r32 = 188(0xbc, float:2.63E-43)
            r33 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.gestures.DraggableKt.m9307k(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0241
        L_0x023f:
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
        L_0x0241:
            r1.mo15002m0()
            androidx.compose.ui.m r2 = r0.mo17224k3(r2)
            r17 = 0
            long r18 = m25387g(r7)
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2 r12 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2
            r7 = r12
            r8 = r40
            r9 = r41
            r10 = r35
            r11 = r36
            r25 = r0
            r0 = r12
            r12 = r37
            r3 = r13
            r13 = r38
            r26 = r14
            r14 = r16
            r15 = r26
            r16 = r42
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7 = 376925230(0x16776c2e, float:1.9986637E-25)
            androidx.compose.runtime.internal.a r16 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r7, r3, r0)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = 122(0x7a, float:1.71E-43)
            r7 = r2
            r8 = r17
            r9 = r18
            r11 = r20
            r13 = r22
            r14 = r23
            r15 = r24
            r17 = r1
            r18 = r0
            r19 = r3
            androidx.compose.material3.SurfaceKt.m26352a(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x029e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x029e:
            r8 = r25
        L_0x02a0:
            androidx.compose.runtime.t1 r12 = r1.mo15020s()
            if (r12 != 0) goto L_0x02a7
            goto L_0x02c5
        L_0x02a7:
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$3 r13 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$3
            r0 = r13
            r1 = r8
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = r44
            r11 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x02c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25386f(androidx.compose.ui.m, kotlin.jvm.functions.p, androidx.compose.ui.text.p0, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.foundation.layout.e1, androidx.compose.material3.q3, androidx.compose.material3.r3, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: g */
    public static final long m25387g(C8578k2<C15240j2> k2Var) {
        return k2Var.getValue().mo42833M();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.q<androidx.compose.foundation.layout.u0, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f3  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28049a, message = "Use TopAppBar instead.", replaceWith = @kotlin.C11587t0(expression = "TopAppBar(title, modifier, navigationIcon, actions, windowInsets, colors, scrollBehavior)", imports = {}))
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25388h(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r34, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8270q3 r35, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8275r3 r36, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r37, int r38, int r39) {
        /*
            r10 = r30
            r11 = r38
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1967617284(0xffffffff8ab88afc, float:-1.7770836E-32)
            r1 = r37
            androidx.compose.runtime.o r9 = r1.mo15009o(r0)
            r1 = r39 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r11 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0028
            boolean r1 = r9.mo14927P(r10)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r11
            goto L_0x0029
        L_0x0028:
            r1 = r11
        L_0x0029:
            r2 = r39 & 2
            if (r2 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0043
        L_0x0030:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0043
            r3 = r31
            boolean r4 = r9.mo15006n0(r3)
            if (r4 == 0) goto L_0x003f
            r4 = 32
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r1 = r1 | r4
            goto L_0x0045
        L_0x0043:
            r3 = r31
        L_0x0045:
            r4 = r39 & 4
            if (r4 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r5 = r11 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x005f
            r5 = r32
            boolean r6 = r9.mo14927P(r5)
            if (r6 == 0) goto L_0x005b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r6
            goto L_0x0061
        L_0x005f:
            r5 = r32
        L_0x0061:
            r6 = r39 & 8
            if (r6 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007b
            r7 = r33
            boolean r8 = r9.mo14927P(r7)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r8
            goto L_0x007d
        L_0x007b:
            r7 = r33
        L_0x007d:
            r8 = 57344(0xe000, float:8.0356E-41)
            r12 = r11 & r8
            if (r12 != 0) goto L_0x0099
            r12 = r39 & 16
            if (r12 != 0) goto L_0x0093
            r12 = r34
            boolean r13 = r9.mo15006n0(r12)
            if (r13 == 0) goto L_0x0095
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r12 = r34
        L_0x0095:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r13
            goto L_0x009b
        L_0x0099:
            r12 = r34
        L_0x009b:
            r26 = 458752(0x70000, float:6.42848E-40)
            r13 = r11 & r26
            if (r13 != 0) goto L_0x00b6
            r13 = r39 & 32
            if (r13 != 0) goto L_0x00b0
            r13 = r35
            boolean r14 = r9.mo15006n0(r13)
            if (r14 == 0) goto L_0x00b2
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b0:
            r13 = r35
        L_0x00b2:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r1 = r1 | r14
            goto L_0x00b8
        L_0x00b6:
            r13 = r35
        L_0x00b8:
            r27 = r39 & 64
            r28 = 3670016(0x380000, float:5.142788E-39)
            if (r27 == 0) goto L_0x00c4
            r14 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r14
            r15 = r36
            goto L_0x00d6
        L_0x00c4:
            r14 = r11 & r28
            r15 = r36
            if (r14 != 0) goto L_0x00d6
            boolean r14 = r9.mo15006n0(r15)
            if (r14 == 0) goto L_0x00d3
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r1 = r1 | r14
        L_0x00d6:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r1
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r8) goto L_0x00f3
            boolean r8 = r9.mo15011p()
            if (r8 != 0) goto L_0x00e6
            goto L_0x00f3
        L_0x00e6:
            r9.mo14958a0()
            r2 = r3
            r3 = r5
            r4 = r7
            r19 = r9
            r5 = r12
            r6 = r13
            r7 = r15
            goto L_0x01bf
        L_0x00f3:
            r9.mo14930Q()
            r8 = r11 & 1
            r29 = -458753(0xfffffffffff8ffff, float:NaN)
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            if (r8 == 0) goto L_0x011f
            boolean r8 = r9.mo14977f0()
            if (r8 == 0) goto L_0x0107
            goto L_0x011f
        L_0x0107:
            r9.mo14958a0()
            r2 = r39 & 16
            if (r2 == 0) goto L_0x010f
            r1 = r1 & r14
        L_0x010f:
            r2 = r39 & 32
            if (r2 == 0) goto L_0x0115
            r1 = r1 & r29
        L_0x0115:
            r14 = r7
            r16 = r13
            r17 = r15
            r13 = r5
            r15 = r12
            r12 = r3
            goto L_0x0174
        L_0x011f:
            if (r2 == 0) goto L_0x0124
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0125
        L_0x0124:
            r2 = r3
        L_0x0125:
            if (r4 == 0) goto L_0x012e
            androidx.compose.material3.ComposableSingletons$AppBarKt r3 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.p r3 = r3.mo11279f()
            goto L_0x012f
        L_0x012e:
            r3 = r5
        L_0x012f:
            if (r6 == 0) goto L_0x0138
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.q r4 = r4.mo11280g()
            r7 = r4
        L_0x0138:
            r4 = r39 & 16
            if (r4 == 0) goto L_0x0145
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f19955a
            r5 = 6
            androidx.compose.foundation.layout.e1 r4 = r4.mo12405d(r9, r5)
            r1 = r1 & r14
            goto L_0x0146
        L_0x0145:
            r4 = r12
        L_0x0146:
            r5 = r39 & 32
            if (r5 == 0) goto L_0x0164
            androidx.compose.material3.TopAppBarDefaults r12 = androidx.compose.material3.TopAppBarDefaults.f19955a
            r13 = 0
            r5 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r24 = 196608(0x30000, float:2.75506E-40)
            r25 = 31
            r15 = r5
            r23 = r9
            androidx.compose.material3.q3 r5 = r12.mo12410i(r13, r15, r17, r19, r21, r23, r24, r25)
            r1 = r1 & r29
            r13 = r5
        L_0x0164:
            if (r27 == 0) goto L_0x016c
            r5 = 0
            r12 = r2
            r15 = r4
            r17 = r5
            goto L_0x0170
        L_0x016c:
            r17 = r36
            r12 = r2
            r15 = r4
        L_0x0170:
            r14 = r7
            r16 = r13
            r13 = r3
        L_0x0174:
            r9.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0183
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.SmallTopAppBar (AppBar.kt:183)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0183:
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = r1 & r26
            r0 = r0 | r2
            r1 = r1 & r28
            r8 = r0 | r1
            r18 = 0
            r0 = r30
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r9
            r19 = r9
            r9 = r18
            m25389i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01b7
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01b7:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
        L_0x01bf:
            androidx.compose.runtime.t1 r12 = r19.mo15020s()
            if (r12 != 0) goto L_0x01c6
            goto L_0x01d5
        L_0x01c6:
            androidx.compose.material3.AppBarKt$SmallTopAppBar$1 r13 = new androidx.compose.material3.AppBarKt$SmallTopAppBar$1
            r0 = r13
            r1 = r30
            r8 = r38
            r9 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.mo15202a(r13)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25388h(kotlin.jvm.functions.p, androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.foundation.layout.e1, androidx.compose.material3.q3, androidx.compose.material3.r3, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.q<androidx.compose.foundation.layout.u0, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.q<? super androidx.compose.foundation.layout.u0, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f6  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25389i(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r34, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8270q3 r35, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8275r3 r36, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r37, int r38, int r39) {
        /*
            r12 = r30
            r13 = r38
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 1906353009(0x71a0a371, float:1.5908861E30)
            r1 = r37
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r39 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r13 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0028
            boolean r1 = r11.mo14927P(r12)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r13
            goto L_0x0029
        L_0x0028:
            r1 = r13
        L_0x0029:
            r2 = r39 & 2
            if (r2 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0043
        L_0x0030:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0043
            r3 = r31
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x003f
            r4 = 32
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r1 = r1 | r4
            goto L_0x0045
        L_0x0043:
            r3 = r31
        L_0x0045:
            r4 = r39 & 4
            if (r4 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x005f
            r5 = r32
            boolean r6 = r11.mo14927P(r5)
            if (r6 == 0) goto L_0x005b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r6
            goto L_0x0061
        L_0x005f:
            r5 = r32
        L_0x0061:
            r6 = r39 & 8
            if (r6 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007b
            r7 = r33
            boolean r8 = r11.mo14927P(r7)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r8
            goto L_0x007d
        L_0x007b:
            r7 = r33
        L_0x007d:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r13 & r8
            if (r9 != 0) goto L_0x0099
            r9 = r39 & 16
            if (r9 != 0) goto L_0x0093
            r9 = r34
            boolean r10 = r11.mo15006n0(r9)
            if (r10 == 0) goto L_0x0095
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r9 = r34
        L_0x0095:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r10
            goto L_0x009b
        L_0x0099:
            r9 = r34
        L_0x009b:
            r10 = 458752(0x70000, float:6.42848E-40)
            r14 = r13 & r10
            if (r14 != 0) goto L_0x00b6
            r14 = r39 & 32
            if (r14 != 0) goto L_0x00b0
            r14 = r35
            boolean r15 = r11.mo15006n0(r14)
            if (r15 == 0) goto L_0x00b2
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b0:
            r14 = r35
        L_0x00b2:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r1 = r1 | r15
            goto L_0x00b8
        L_0x00b6:
            r14 = r35
        L_0x00b8:
            r28 = r39 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00c2
            r15 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r15
            goto L_0x00d6
        L_0x00c2:
            r15 = r13 & r29
            if (r15 != 0) goto L_0x00d6
            r15 = r36
            boolean r16 = r11.mo15006n0(r15)
            if (r16 == 0) goto L_0x00d1
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r1 = r1 | r16
            goto L_0x00d8
        L_0x00d6:
            r15 = r36
        L_0x00d8:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r1 & r16
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r8) goto L_0x00f6
            boolean r8 = r11.mo15011p()
            if (r8 != 0) goto L_0x00e9
            goto L_0x00f6
        L_0x00e9:
            r11.mo14958a0()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r9
            r21 = r11
            r6 = r14
            r7 = r15
            goto L_0x01e6
        L_0x00f6:
            r11.mo14930Q()
            r8 = r13 & 1
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 6
            if (r8 == 0) goto L_0x0124
            boolean r8 = r11.mo14977f0()
            if (r8 == 0) goto L_0x010b
            goto L_0x0124
        L_0x010b:
            r11.mo14958a0()
            r2 = r39 & 16
            if (r2 == 0) goto L_0x0114
            r1 = r1 & r16
        L_0x0114:
            r2 = r39 & 32
            if (r2 == 0) goto L_0x0119
            r1 = r1 & r10
        L_0x0119:
            r16 = r7
            r17 = r9
            r18 = r14
            r19 = r15
            r14 = r3
            r15 = r5
            goto L_0x0178
        L_0x0124:
            if (r2 == 0) goto L_0x0129
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x012a
        L_0x0129:
            r2 = r3
        L_0x012a:
            if (r4 == 0) goto L_0x0133
            androidx.compose.material3.ComposableSingletons$AppBarKt r3 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.p r3 = r3.mo11274a()
            goto L_0x0134
        L_0x0133:
            r3 = r5
        L_0x0134:
            if (r6 == 0) goto L_0x013d
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.q r4 = r4.mo11278e()
            r7 = r4
        L_0x013d:
            r4 = r39 & 16
            if (r4 == 0) goto L_0x014a
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.f19955a
            androidx.compose.foundation.layout.e1 r4 = r4.mo12405d(r11, r0)
            r1 = r1 & r16
            r9 = r4
        L_0x014a:
            r4 = r39 & 32
            if (r4 == 0) goto L_0x0167
            androidx.compose.material3.TopAppBarDefaults r14 = androidx.compose.material3.TopAppBarDefaults.f19955a
            r4 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 31
            r15 = r4
            r25 = r11
            androidx.compose.material3.q3 r4 = r14.mo12410i(r15, r17, r19, r21, r23, r25, r26, r27)
            r1 = r1 & r10
            r14 = r4
        L_0x0167:
            if (r28 == 0) goto L_0x016e
            r4 = 0
            r15 = r3
            r19 = r4
            goto L_0x0171
        L_0x016e:
            r19 = r36
            r15 = r3
        L_0x0171:
            r16 = r7
            r17 = r9
            r18 = r14
            r14 = r2
        L_0x0178:
            r11.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x018a
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TopAppBar (AppBar.kt:120)"
            r4 = 1906353009(0x71a0a371, float:1.5908861E30)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x018a:
            androidx.compose.material3.i1 r2 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.s3 r2 = r2.mo12654c(r11, r0)
            androidx.compose.material3.tokens.k1 r3 = androidx.compose.material3.tokens.C8318k1.f21543a
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.mo13932g()
            androidx.compose.ui.text.p0 r2 = androidx.compose.material3.TypographyKt.m26914a(r2, r3)
            r3 = 0
            int r4 = r1 >> 3
            r4 = r4 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            int r5 = r1 << 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            int r0 = r1 << 6
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r0
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r0
            r1 = r1 | r4
            r4 = r0 & r29
            r1 = r1 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r0
            r1 = r1 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r4
            r10 = r1 | r0
            r20 = 0
            r0 = r14
            r1 = r30
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r11
            r21 = r11
            r11 = r20
            m25386f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01dc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01dc:
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
        L_0x01e6:
            androidx.compose.runtime.t1 r10 = r21.mo15020s()
            if (r10 != 0) goto L_0x01ed
            goto L_0x01fc
        L_0x01ed:
            androidx.compose.material3.AppBarKt$TopAppBar$1 r11 = new androidx.compose.material3.AppBarKt$TopAppBar$1
            r0 = r11
            r1 = r30
            r8 = r38
            r9 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25389i(kotlin.jvm.functions.p, androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.foundation.layout.e1, androidx.compose.material3.q3, androidx.compose.material3.r3, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: j */
    public static final void m25390j(C8767m mVar, float f, long j, long j2, long j3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C16361p0 p0Var, float f2, Arrangement.C2279l lVar, Arrangement.C2269d dVar, int i, boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C8592o oVar, int i2, int i3) {
        int i4;
        int i5;
        float f3 = f;
        long j4 = j2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar;
        C16361p0 p0Var2 = p0Var;
        Arrangement.C2279l lVar2 = lVar;
        Arrangement.C2269d dVar2 = dVar;
        int i6 = i;
        boolean z2 = z;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar5 = pVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar6 = pVar3;
        int i7 = i2;
        int i8 = i3;
        C8592o o = oVar.mo15009o(-6794037);
        int i9 = 4;
        if ((i7 & 14) == 0) {
            i4 = i7 | (o.mo15006n0(mVar) ? 4 : 2);
        } else {
            C8767m mVar2 = mVar;
            i4 = i7;
        }
        int i10 = 32;
        if ((i7 & 112) == 0) {
            i4 |= o.mo14968d(f3) ? 32 : 16;
        }
        int i11 = 256;
        long j5 = j;
        if ((i7 & 896) == 0) {
            i4 |= o.mo14980g(j5) ? 256 : 128;
        }
        int i12 = 2048;
        if ((i7 & 7168) == 0) {
            i4 |= o.mo14980g(j4) ? 2048 : 1024;
        }
        long j6 = j3;
        if ((57344 & i7) == 0) {
            i4 |= o.mo14980g(j6) ? 16384 : 8192;
        }
        if ((458752 & i7) == 0) {
            i4 |= o.mo14927P(pVar4) ? 131072 : 65536;
        }
        if ((3670016 & i7) == 0) {
            i4 |= o.mo15006n0(p0Var2) ? 1048576 : 524288;
        }
        if ((29360128 & i7) == 0) {
            i4 |= o.mo14968d(f2) ? 8388608 : 4194304;
        } else {
            float f4 = f2;
        }
        if ((i7 & 234881024) == 0) {
            i4 |= o.mo15006n0(lVar2) ? C8698y1.f23302n : C9647e0.f26435a;
        }
        if ((i7 & 1879048192) == 0) {
            i4 |= o.mo15006n0(dVar2) ? 536870912 : 268435456;
        }
        int i13 = i4;
        int i14 = i;
        if ((i8 & 14) == 0) {
            if (!o.mo14976f(i14)) {
                i9 = 2;
            }
            i5 = i8 | i9;
        } else {
            i5 = i8;
        }
        boolean z3 = z;
        if ((i8 & 112) == 0) {
            if (!o.mo14961b(z3)) {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i8 & 896) == 0) {
            if (!o.mo14927P(pVar5)) {
                i11 = 128;
            }
            i5 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (!o.mo14927P(pVar6)) {
                i12 = 1024;
            }
            i5 |= i12;
        }
        if ((1533916891 & i13) == 306783378 && (i5 & 5851) == 1170 && o.mo15011p()) {
            o.mo14958a0();
        } else {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-6794037, i13, i5, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:1280)");
            }
            AppBarKt$TopAppBarLayout$2 appBarKt$TopAppBarLayout$2 = new AppBarKt$TopAppBarLayout$2(f3, dVar2, lVar2, i14);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(mVar);
            int i15 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
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
            Updater.m30188j(b, appBarKt$TopAppBarLayout$2, companion.mo44588d());
            Updater.m30188j(b, dVar3, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i15 >> 3) & 112));
            o.mo14918M(2058660585);
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m b2 = C15594q.m69318b(aVar, "navigationIcon");
            float f6 = f19162h;
            C8767m o2 = PaddingKt.m10028o(b2, f6, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            o.mo14918M(733328855);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar4 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            int i16 = i13;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f7 = LayoutKt.m68908f(o2);
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
            C8592o b3 = Updater.m30180b(o);
            Updater.m30188j(b3, k, companion.mo44588d());
            Updater.m30188j(b3, dVar4, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            o.mo14972e();
            f7.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j))}, pVar5, o, ((i5 >> 3) & 112) | 8);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            C8767m e = C15320t2.m66561e(PaddingKt.m10026m(C15594q.m69318b(aVar, "title"), f6, 0.0f, 2, (Object) null).mo17224k3(z3 ? SemanticsModifierKt.m71866a(aVar, AppBarKt$TopAppBarLayout$1$2.f19164f) : aVar), 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, false, (C15329u3) null, 0, 0, 0, 131067, (Object) null);
            o.mo14918M(733328855);
            C15560f0 k2 = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar5 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f8 = LayoutKt.m68908f(e);
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
            Updater.m30188j(b4, dVar5, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b4, c4Var3, companion.mo44590f());
            o.mo14972e();
            f8.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            int i17 = i16;
            TextKt.m26698a(p0Var, C8553b.m31048b(o, 824316656, true, new AppBarKt$TopAppBarLayout$1$3$1(j2, pVar4, i17)), o, ((i17 >> 18) & 14) | 48);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            C8767m o3 = PaddingKt.m10028o(C15594q.m69318b(aVar, "actionIcons"), 0.0f, 0.0f, f6, 0.0f, 11, (Object) null);
            o.mo14918M(733328855);
            C15560f0 k3 = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar6 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection4 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var4 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a4 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f9 = LayoutKt.m68908f(o3);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a4);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b5 = Updater.m30180b(o);
            Updater.m30188j(b5, k3, companion.mo44588d());
            Updater.m30188j(b5, dVar6, companion.mo44586b());
            Updater.m30188j(b5, layoutDirection4, companion.mo44587c());
            Updater.m30188j(b5, c4Var4, companion.mo44590f());
            o.mo14972e();
            f9.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j3))}, pVar3, o, ((i5 >> 6) & 112) | 8);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            AppBarKt$TopAppBarLayout$3 appBarKt$TopAppBarLayout$3 = r0;
            AppBarKt$TopAppBarLayout$3 appBarKt$TopAppBarLayout$32 = new AppBarKt$TopAppBarLayout$3(mVar, f, j, j2, j3, pVar, p0Var, f2, lVar, dVar, i, z, pVar2, pVar3, i2, i3);
            s.mo15202a(appBarKt$TopAppBarLayout$3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: kotlin.jvm.functions.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0131  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25391k(androidx.compose.p004ui.C8767m r40, kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r41, androidx.compose.p004ui.text.C16361p0 r42, float r43, kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, androidx.compose.p004ui.text.C16361p0 r45, kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r46, kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r47, androidx.compose.foundation.layout.C2354e1 r48, androidx.compose.material3.C8270q3 r49, float r50, float r51, androidx.compose.material3.C8275r3 r52, androidx.compose.runtime.C8592o r53, int r54, int r55, int r56) {
        /*
            r4 = r43
            r8 = r47
            r7 = r49
            r6 = r50
            r5 = r51
            r3 = r52
            r2 = r54
            r1 = r55
            r0 = r56
            r9 = 210227552(0xc87d160, float:2.0926056E-31)
            r10 = r53
            androidx.compose.runtime.o r15 = r10.mo15009o(r9)
            r10 = r0 & 1
            if (r10 == 0) goto L_0x0025
            r13 = r2 | 6
            r14 = r13
            r13 = r40
            goto L_0x0039
        L_0x0025:
            r13 = r2 & 14
            if (r13 != 0) goto L_0x0036
            r13 = r40
            boolean r14 = r15.mo15006n0(r13)
            if (r14 == 0) goto L_0x0033
            r14 = 4
            goto L_0x0034
        L_0x0033:
            r14 = 2
        L_0x0034:
            r14 = r14 | r2
            goto L_0x0039
        L_0x0036:
            r13 = r40
            r14 = r2
        L_0x0039:
            r16 = r0 & 2
            r17 = 32
            r18 = 16
            if (r16 == 0) goto L_0x0046
            r14 = r14 | 48
            r9 = r41
            goto L_0x0059
        L_0x0046:
            r16 = r2 & 112(0x70, float:1.57E-43)
            r9 = r41
            if (r16 != 0) goto L_0x0059
            boolean r19 = r15.mo14927P(r9)
            if (r19 == 0) goto L_0x0055
            r19 = r17
            goto L_0x0057
        L_0x0055:
            r19 = r18
        L_0x0057:
            r14 = r14 | r19
        L_0x0059:
            r19 = r0 & 4
            r20 = 256(0x100, float:3.59E-43)
            r21 = 128(0x80, float:1.794E-43)
            if (r19 == 0) goto L_0x0064
            r14 = r14 | 384(0x180, float:5.38E-43)
            goto L_0x0078
        L_0x0064:
            r11 = r2 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0078
            r11 = r42
            boolean r19 = r15.mo15006n0(r11)
            if (r19 == 0) goto L_0x0073
            r19 = r20
            goto L_0x0075
        L_0x0073:
            r19 = r21
        L_0x0075:
            r14 = r14 | r19
            goto L_0x007a
        L_0x0078:
            r11 = r42
        L_0x007a:
            r19 = r0 & 8
            if (r19 == 0) goto L_0x0081
            r14 = r14 | 3072(0xc00, float:4.305E-42)
            goto L_0x0091
        L_0x0081:
            r12 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0091
            boolean r12 = r15.mo14968d(r4)
            if (r12 == 0) goto L_0x008e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0090
        L_0x008e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0090:
            r14 = r14 | r12
        L_0x0091:
            r12 = r0 & 16
            if (r12 == 0) goto L_0x0098
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ae
        L_0x0098:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r2
            if (r12 != 0) goto L_0x00ae
            r12 = r44
            boolean r22 = r15.mo14927P(r12)
            if (r22 == 0) goto L_0x00a9
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ab
        L_0x00a9:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00ab:
            r14 = r14 | r22
            goto L_0x00b0
        L_0x00ae:
            r12 = r44
        L_0x00b0:
            r22 = r0 & 32
            if (r22 == 0) goto L_0x00bb
            r22 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 | r22
            r13 = r45
            goto L_0x00d0
        L_0x00bb:
            r22 = 458752(0x70000, float:6.42848E-40)
            r22 = r2 & r22
            r13 = r45
            if (r22 != 0) goto L_0x00d0
            boolean r22 = r15.mo15006n0(r13)
            if (r22 == 0) goto L_0x00cc
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ce
        L_0x00cc:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x00ce:
            r14 = r14 | r22
        L_0x00d0:
            r22 = r0 & 64
            if (r22 == 0) goto L_0x00db
            r22 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 | r22
            r13 = r46
            goto L_0x00f0
        L_0x00db:
            r22 = 3670016(0x380000, float:5.142788E-39)
            r22 = r2 & r22
            r13 = r46
            if (r22 != 0) goto L_0x00f0
            boolean r22 = r15.mo14927P(r13)
            if (r22 == 0) goto L_0x00ec
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ee
        L_0x00ec:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00ee:
            r14 = r14 | r22
        L_0x00f0:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x00f8
            r9 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00f6:
            r14 = r14 | r9
            goto L_0x0109
        L_0x00f8:
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r2
            if (r9 != 0) goto L_0x0109
            boolean r9 = r15.mo14927P(r8)
            if (r9 == 0) goto L_0x0106
            r9 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x0106:
            r9 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00f6
        L_0x0109:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0111
            r9 = 100663296(0x6000000, float:2.4074124E-35)
            r14 = r14 | r9
            goto L_0x0126
        L_0x0111:
            r9 = 234881024(0xe000000, float:1.5777218E-30)
            r9 = r9 & r2
            if (r9 != 0) goto L_0x0126
            r9 = r48
            boolean r22 = r15.mo15006n0(r9)
            if (r22 == 0) goto L_0x0121
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0123
        L_0x0121:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0123:
            r14 = r14 | r22
            goto L_0x0128
        L_0x0126:
            r9 = r48
        L_0x0128:
            r9 = r0 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x0131
            r9 = 805306368(0x30000000, float:4.656613E-10)
        L_0x012e:
            r9 = r9 | r14
            r14 = r9
            goto L_0x0142
        L_0x0131:
            r9 = 1879048192(0x70000000, float:1.58456325E29)
            r9 = r9 & r2
            if (r9 != 0) goto L_0x0142
            boolean r9 = r15.mo15006n0(r7)
            if (r9 == 0) goto L_0x013f
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012e
        L_0x013f:
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012e
        L_0x0142:
            r9 = r0 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0149
            r9 = r1 | 6
            goto L_0x015c
        L_0x0149:
            r9 = r1 & 14
            if (r9 != 0) goto L_0x015b
            boolean r9 = r15.mo14968d(r6)
            if (r9 == 0) goto L_0x0156
            r19 = 4
            goto L_0x0158
        L_0x0156:
            r19 = 2
        L_0x0158:
            r9 = r1 | r19
            goto L_0x015c
        L_0x015b:
            r9 = r1
        L_0x015c:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0163
            r9 = r9 | 48
            goto L_0x0172
        L_0x0163:
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0172
            boolean r2 = r15.mo14968d(r5)
            if (r2 == 0) goto L_0x016e
            goto L_0x0170
        L_0x016e:
            r17 = r18
        L_0x0170:
            r9 = r9 | r17
        L_0x0172:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0179
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0188
        L_0x0179:
            r2 = r1 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0188
            boolean r2 = r15.mo15006n0(r3)
            if (r2 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            r20 = r21
        L_0x0186:
            r9 = r9 | r20
        L_0x0188:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r14
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r0) goto L_0x01a6
            r0 = r9 & 731(0x2db, float:1.024E-42)
            r2 = 146(0x92, float:2.05E-43)
            if (r0 != r2) goto L_0x01a6
            boolean r0 = r15.mo15011p()
            if (r0 != 0) goto L_0x019e
            goto L_0x01a6
        L_0x019e:
            r15.mo14958a0()
            r1 = r40
            r5 = r15
            goto L_0x033e
        L_0x01a6:
            if (r10 == 0) goto L_0x01ab
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01ad
        L_0x01ab:
            r0 = r40
        L_0x01ad:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x01bb
            java.lang.String r2 = "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1123)"
            r10 = 210227552(0xc87d160, float:2.0926056E-31)
            androidx.compose.runtime.ComposerKt.m29845w0(r10, r14, r9, r2)
        L_0x01bb:
            int r2 = androidx.compose.p004ui.unit.C16483g.m74452z(r50, r51)
            if (r2 <= 0) goto L_0x0375
            kotlin.jvm.internal.Ref$FloatRef r2 = new kotlin.jvm.internal.Ref$FloatRef
            r2.<init>()
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r1 = r15.mo15032w(r1)
            androidx.compose.ui.unit.d r1 = (androidx.compose.p004ui.unit.C16479d) r1
            float r11 = r1.mo7425g5(r5)
            r2.element = r11
            float r11 = r1.mo7425g5(r6)
            r10.element = r11
            int r1 = r1.mo7429n2(r4)
            r9.element = r1
            float r1 = r2.element
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r11 = r10.element
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r4 = 1618982084(0x607fb4c4, float:7.370227E19)
            r15.mo14918M(r4)
            boolean r4 = r15.mo15006n0(r3)
            boolean r1 = r15.mo15006n0(r1)
            r1 = r1 | r4
            boolean r4 = r15.mo15006n0(r11)
            r1 = r1 | r4
            java.lang.Object r4 = r15.mo14921N()
            if (r1 != 0) goto L_0x021a
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r4 != r1) goto L_0x0222
        L_0x021a:
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$2$1 r4 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$2$1
            r4.<init>(r3, r2, r10)
            r15.mo14893C(r4)
        L_0x0222:
            r15.mo15002m0()
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            r1 = 0
            androidx.compose.runtime.EffectsKt.m29899k(r4, r15, r1)
            if (r3 == 0) goto L_0x0238
            androidx.compose.material3.TopAppBarState r4 = r52.getState()
            if (r4 == 0) goto L_0x0238
            float r4 = r4.mo12411b()
            goto L_0x0239
        L_0x0238:
            r4 = 0
        L_0x0239:
            int r11 = r14 >> 24
            r11 = r11 & 112(0x70, float:1.57E-43)
            long r16 = r7.mo12935a(r4, r15, r11)
            androidx.compose.ui.graphics.j2 r11 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r16)
            androidx.compose.runtime.k2 r11 = androidx.compose.runtime.C8415c2.m30251t(r11, r15, r1)
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1 r1 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1
            r1.<init>(r8, r14)
            r5 = -1048401111(0xffffffffc182ab29, float:-16.333574)
            r6 = 1
            androidx.compose.runtime.internal.a r18 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r5, r6, r1)
            androidx.compose.animation.core.t r1 = f19159e
            float r1 = r1.mo6791a(r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r24 = r5 - r4
            r5 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0269
            r16 = r6
            goto L_0x026b
        L_0x0269:
            r16 = 0
        L_0x026b:
            r26 = r16 ^ 1
            r4 = -1609665814(0xffffffffa00e72ea, float:-1.206589E-19)
            r15.mo14918M(r4)
            if (r3 == 0) goto L_0x02e1
            boolean r4 = r52.mo11536b()
            if (r4 != 0) goto L_0x02e1
            androidx.compose.ui.m$a r27 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.gestures.Orientation r29 = androidx.compose.foundation.gestures.Orientation.Vertical
            r4 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r4)
            boolean r5 = r15.mo15006n0(r3)
            java.lang.Object r6 = r15.mo14921N()
            if (r5 != 0) goto L_0x0297
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x029f
        L_0x0297:
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1 r6 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1
            r6.<init>(r3)
            r15.mo14893C(r6)
        L_0x029f:
            r15.mo15002m0()
            kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
            r5 = 0
            androidx.compose.foundation.gestures.f r28 = androidx.compose.foundation.gestures.DraggableKt.m9310n(r6, r15, r5)
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r15.mo14918M(r4)
            boolean r4 = r15.mo15006n0(r3)
            java.lang.Object r5 = r15.mo14921N()
            if (r4 != 0) goto L_0x02c6
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r5 != r4) goto L_0x02cf
        L_0x02c6:
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 r5 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1
            r4 = 0
            r5.<init>(r3, r4)
            r15.mo14893C(r5)
        L_0x02cf:
            r15.mo15002m0()
            r34 = r5
            kotlin.jvm.functions.q r34 = (kotlin.jvm.functions.C11305q) r34
            r35 = 0
            r36 = 188(0xbc, float:2.63E-43)
            r37 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.gestures.DraggableKt.m9307k(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x02e3
        L_0x02e1:
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
        L_0x02e3:
            r15.mo15002m0()
            androidx.compose.ui.m r4 = r0.mo17224k3(r4)
            long r27 = m25392l(r11)
            r29 = 0
            r31 = 0
            r32 = 0
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$3 r11 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$3
            r25 = r9
            r9 = r11
            r20 = r10
            r10 = r48
            r6 = r11
            r11 = r2
            r12 = r49
            r13 = r44
            r2 = r14
            r14 = r45
            r5 = r15
            r15 = r1
            r17 = r46
            r19 = r2
            r21 = r52
            r22 = r41
            r23 = r42
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 1985938853(0x765f05a5, float:1.1308561E33)
            r2 = 1
            androidx.compose.runtime.internal.a r19 = androidx.compose.runtime.internal.C8553b.m31048b(r5, r1, r2, r6)
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r22 = 122(0x7a, float:1.71E-43)
            r10 = r4
            r1 = 0
            r11 = r1
            r12 = r27
            r14 = r29
            r1 = 0
            r16 = r1
            r17 = r31
            r18 = r32
            r20 = r5
            androidx.compose.material3.SurfaceKt.m26352a(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x033d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x033d:
            r1 = r0
        L_0x033e:
            androidx.compose.runtime.t1 r15 = r5.mo15020s()
            if (r15 != 0) goto L_0x0345
            goto L_0x0374
        L_0x0345:
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$4 r14 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$4
            r0 = r14
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r45
            r7 = r46
            r8 = r47
            r9 = r48
            r10 = r49
            r11 = r50
            r12 = r51
            r13 = r52
            r38 = r14
            r14 = r54
            r39 = r15
            r15 = r55
            r16 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r38
            r0 = r39
            r0.mo15202a(r1)
        L_0x0374:
            return
        L_0x0375:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "A TwoRowsTopAppBar max height should be greater than its pinned height"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25391k(androidx.compose.ui.m, kotlin.jvm.functions.p, androidx.compose.ui.text.p0, float, kotlin.jvm.functions.p, androidx.compose.ui.text.p0, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.foundation.layout.e1, androidx.compose.material3.q3, float, float, androidx.compose.material3.r3, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: l */
    public static final long m25392l(C8578k2<C15240j2> k2Var) {
        return k2Var.getValue().mo42833M();
    }

    /* renamed from: u */
    public static final float m25401u() {
        return f19156b;
    }

    @C12579k
    /* renamed from: v */
    public static final C2009t m25402v() {
        return f19159e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.material3.C8251n0
    @org.jetbrains.annotations.C12579k
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.TopAppBarState m25403w(float r7, float r8, float r9, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r10, int r11, int r12) {
        /*
            r0 = 1801969826(0x6b67e0a2, float:2.8032266E26)
            r10.mo14918M(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x000d
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x000d:
            r1 = r12 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r8 = r2
        L_0x0013:
            r12 = r12 & 4
            if (r12 == 0) goto L_0x0018
            r9 = r2
        L_0x0018:
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x0024
            r12 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:794)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r11, r12, r1)
        L_0x0024:
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            androidx.compose.material3.TopAppBarState$a r11 = androidx.compose.material3.TopAppBarState.f19960d
            androidx.compose.runtime.saveable.e r1 = r11.mo12419a()
            r2 = 0
            java.lang.Float r11 = java.lang.Float.valueOf(r7)
            java.lang.Float r12 = java.lang.Float.valueOf(r8)
            java.lang.Float r3 = java.lang.Float.valueOf(r9)
            r4 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.mo14918M(r4)
            boolean r11 = r10.mo15006n0(r11)
            boolean r12 = r10.mo15006n0(r12)
            r11 = r11 | r12
            boolean r12 = r10.mo15006n0(r3)
            r11 = r11 | r12
            java.lang.Object r12 = r10.mo14921N()
            if (r11 != 0) goto L_0x005c
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r12 != r11) goto L_0x0064
        L_0x005c:
            androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1 r12 = new androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1
            r12.<init>(r7, r8, r9)
            r10.mo14893C(r12)
        L_0x0064:
            r10.mo15002m0()
            r3 = r12
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r5 = 72
            r6 = 4
            r4 = r10
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.material3.TopAppBarState r7 = (androidx.compose.material3.TopAppBarState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x007d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x007d:
            r10.mo15002m0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25403w(float, float, float, androidx.compose.runtime.o, int, int):androidx.compose.material3.TopAppBarState");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m25404x(androidx.compose.material3.TopAppBarState r22, float r23, androidx.compose.animation.core.C2013v<java.lang.Float> r24, androidx.compose.animation.core.C1968g<java.lang.Float> r25, kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r26) {
        /*
            r0 = r22
            r1 = r26
            boolean r2 = r1 instanceof androidx.compose.material3.AppBarKt$settleAppBar$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            androidx.compose.material3.AppBarKt$settleAppBar$1 r2 = (androidx.compose.material3.AppBarKt$settleAppBar$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.material3.AppBarKt$settleAppBar$1 r2 = new androidx.compose.material3.AppBarKt$settleAppBar$1
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r10 = 2
            r12 = 0
            r4 = 1
            if (r3 == 0) goto L_0x0052
            if (r3 == r4) goto L_0x003e
            if (r3 != r10) goto L_0x0036
            java.lang.Object r0 = r2.L$0
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0116
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            java.lang.Object r0 = r2.L$2
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            java.lang.Object r3 = r2.L$1
            androidx.compose.animation.core.g r3 = (androidx.compose.animation.core.C1968g) r3
            java.lang.Object r4 = r2.L$0
            androidx.compose.material3.TopAppBarState r4 = (androidx.compose.material3.TopAppBarState) r4
            kotlin.C11661u0.m45747n(r1)
            r1 = r0
            r13 = r3
            r0 = r4
            goto L_0x00b9
        L_0x0052:
            kotlin.C11661u0.m45747n(r1)
            float r1 = r22.mo12411b()
            r3 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0122
            float r1 = r22.mo12411b()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x006c
            r1 = r4
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            if (r1 == 0) goto L_0x0071
            goto L_0x0122
        L_0x0071:
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r5 = r23
            r1.element = r5
            if (r24 == 0) goto L_0x00bb
            float r6 = java.lang.Math.abs(r23)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00bb
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef
            r3.<init>()
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 28
            r21 = 0
            r14 = r23
            androidx.compose.animation.core.i r5 = androidx.compose.animation.core.C1980j.m8428c(r13, r14, r15, r17, r19, r20, r21)
            r6 = 0
            androidx.compose.material3.AppBarKt$settleAppBar$2 r7 = new androidx.compose.material3.AppBarKt$settleAppBar$2
            r7.<init>(r3, r0, r1)
            r8 = 2
            r9 = 0
            r2.L$0 = r0
            r13 = r25
            r2.L$1 = r13
            r2.L$2 = r1
            r2.label = r4
            r3 = r5
            r4 = r24
            r5 = r6
            r6 = r7
            r7 = r2
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.m8084k(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r11) goto L_0x00b9
            return r11
        L_0x00b9:
            r5 = r13
            goto L_0x00be
        L_0x00bb:
            r13 = r25
            goto L_0x00b9
        L_0x00be:
            if (r5 == 0) goto L_0x0117
            float r3 = r0.mo12413d()
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0117
            float r3 = r0.mo12413d()
            float r4 = r0.mo12414e()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0117
            float r13 = r0.mo12413d()
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 30
            r21 = 0
            androidx.compose.animation.core.i r3 = androidx.compose.animation.core.C1980j.m8428c(r13, r14, r15, r17, r19, r20, r21)
            float r4 = r0.mo12411b()
            r6 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00f3
            r4 = r12
            goto L_0x00f7
        L_0x00f3:
            float r4 = r0.mo12414e()
        L_0x00f7:
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r4)
            r6 = 0
            androidx.compose.material3.AppBarKt$settleAppBar$3 r7 = new androidx.compose.material3.AppBarKt$settleAppBar$3
            r7.<init>(r0)
            r9 = 4
            r0 = 0
            r2.L$0 = r1
            r8 = 0
            r2.L$1 = r8
            r2.L$2 = r8
            r2.label = r10
            r8 = r2
            r10 = r0
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.m8086m(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r11) goto L_0x0115
            return r11
        L_0x0115:
            r0 = r1
        L_0x0116:
            r1 = r0
        L_0x0117:
            float r0 = r1.element
            long r0 = androidx.compose.p004ui.unit.C16511x.m74763a(r12, r0)
            androidx.compose.ui.unit.w r0 = androidx.compose.p004ui.unit.C16509w.m74740b(r0)
            return r0
        L_0x0122:
            androidx.compose.ui.unit.w$a r0 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r0 = r0.mo47915a()
            androidx.compose.ui.unit.w r0 = androidx.compose.p004ui.unit.C16509w.m74740b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m25404x(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.v, androidx.compose.animation.core.g, kotlin.coroutines.c):java.lang.Object");
    }
}
