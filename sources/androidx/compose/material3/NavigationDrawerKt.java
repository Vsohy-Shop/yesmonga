package androidx.compose.material3;

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
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.urbanairship.push.notifications.C9527p;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,876:1\n50#2:877\n49#2:878\n25#2:889\n460#2,13:922\n460#2,13:956\n473#2,3:970\n67#2,3:975\n66#2:978\n36#2:985\n460#2,13:1011\n473#2,3:1025\n473#2,3:1030\n25#2:1040\n460#2,13:1071\n456#2,11:1101\n460#2,13:1131\n473#2,3:1145\n460#2,13:1170\n473#2,3:1184\n467#2,3:1189\n473#2,3:1193\n460#2,13:1217\n460#2,13:1251\n473#2,3:1265\n473#2,3:1270\n36#2:1275\n25#2:1282\n36#2:1289\n50#2:1296\n49#2:1297\n50#2:1304\n49#2:1305\n1114#3,6:879\n1114#3,3:890\n1117#3,3:896\n1114#3,6:979\n1114#3,6:986\n1114#3,3:1041\n1117#3,3:1047\n1114#3,6:1276\n1114#3,6:1283\n1114#3,6:1290\n1114#3,6:1298\n1114#3,6:1306\n474#4,4:885\n478#4,2:893\n482#4:899\n474#4,4:1036\n478#4,2:1044\n482#4:1050\n474#5:895\n474#5:1046\n76#6:900\n76#6:902\n76#6:910\n76#6:944\n76#6:999\n76#6:1035\n76#6:1051\n76#6:1059\n76#6:1089\n76#6:1119\n76#6:1158\n76#6:1205\n76#6:1239\n1#7:901\n67#8,6:903\n73#8:935\n66#8,7:936\n73#8:969\n77#8:974\n67#8,6:992\n73#8:1024\n77#8:1029\n77#8:1034\n67#8,6:1052\n73#8:1084\n67#8,6:1112\n73#8:1144\n77#8:1149\n66#8,7:1150\n73#8:1183\n77#8:1188\n77#8:1197\n66#8,7:1231\n73#8:1264\n77#8:1269\n75#9:909\n76#9,11:911\n75#9:943\n76#9,11:945\n89#9:973\n75#9:998\n76#9,11:1000\n89#9:1028\n89#9:1033\n75#9:1058\n76#9,11:1060\n71#9,4:1085\n75#9,11:1090\n75#9:1118\n76#9,11:1120\n89#9:1148\n75#9:1157\n76#9,11:1159\n89#9:1187\n88#9:1192\n89#9:1196\n75#9:1204\n76#9,11:1206\n75#9:1238\n76#9,11:1240\n89#9:1268\n89#9:1273\n75#10,6:1198\n81#10:1230\n85#10:1274\n154#11:1312\n154#11:1313\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n*L\n228#1:877\n228#1:878\n262#1:889\n269#1:922,13\n283#1:956,13\n283#1:970,3\n296#1:975,3\n296#1:978\n303#1:985\n301#1:1011,13\n301#1:1025,3\n269#1:1030,3\n357#1:1040\n362#1:1071,13\n374#1:1101,11\n375#1:1131,13\n375#1:1145,3\n390#1:1170,13\n390#1:1184,3\n374#1:1189,3\n362#1:1193,3\n430#1:1217,13\n432#1:1251,13\n432#1:1265,3\n430#1:1270,3\n541#1:1275\n660#1:1282\n852#1:1289\n853#1:1296\n853#1:1297\n865#1:1304\n865#1:1305\n228#1:879,6\n262#1:890,3\n262#1:896,3\n296#1:979,6\n303#1:986,6\n357#1:1041,3\n357#1:1047,3\n541#1:1276,6\n660#1:1283,6\n852#1:1290,6\n853#1:1298,6\n865#1:1306,6\n262#1:885,4\n262#1:893,2\n262#1:899\n357#1:1036,4\n357#1:1044,2\n357#1:1050\n262#1:895\n357#1:1046\n264#1:900\n268#1:902\n269#1:910\n283#1:944\n301#1:999\n353#1:1035\n361#1:1051\n362#1:1059\n374#1:1089\n375#1:1119\n390#1:1158\n430#1:1205\n432#1:1239\n269#1:903,6\n269#1:935\n283#1:936,7\n283#1:969\n283#1:974\n301#1:992,6\n301#1:1024\n301#1:1029\n269#1:1034\n362#1:1052,6\n362#1:1084\n375#1:1112,6\n375#1:1144\n375#1:1149\n390#1:1150,7\n390#1:1183\n390#1:1188\n362#1:1197\n432#1:1231,7\n432#1:1264\n432#1:1269\n269#1:909\n269#1:911,11\n283#1:943\n283#1:945,11\n283#1:973\n301#1:998\n301#1:1000,11\n301#1:1028\n269#1:1033\n362#1:1058\n362#1:1060,11\n374#1:1085,4\n374#1:1090,11\n375#1:1118\n375#1:1120,11\n375#1:1148\n390#1:1157\n390#1:1159,11\n390#1:1187\n374#1:1192\n362#1:1196\n430#1:1204\n430#1:1206,11\n432#1:1238\n432#1:1240,11\n432#1:1268\n430#1:1273\n430#1:1198,6\n430#1:1230\n430#1:1274\n870#1:1312\n871#1:1313\n*E\n"})
public final class NavigationDrawerKt {

    /* renamed from: a */
    public static final float f19505a = C16483g.m74435M((float) 400);

    /* renamed from: b */
    public static final float f19506b = C16483g.m74435M((float) C9527p.f26031b);
    @C12579k

    /* renamed from: c */
    public static final C2023z0<Float> f19507c = new C2023z0(256, 0, (C2022z) null, 6, (DefaultConstructorMarker) null);

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f6  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25934a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r26, long r27, long r29, float r31, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -588600583(0xffffffffdceaaaf9, float:-5.28425048E17)
            r1 = r34
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r13 | 6
            r3 = r2
            r2 = r25
            goto L_0x0030
        L_0x001c:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r25
            boolean r3 = r14.mo15006n0(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r13
            goto L_0x0030
        L_0x002d:
            r2 = r25
            r3 = r13
        L_0x0030:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x004a
        L_0x0037:
            r5 = r13 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r26
            boolean r6 = r14.mo15006n0(r5)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r3 = r3 | r6
            goto L_0x004c
        L_0x004a:
            r5 = r26
        L_0x004c:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r36 & 4
            if (r6 != 0) goto L_0x005f
            r6 = r27
            boolean r8 = r14.mo14980g(r6)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r6 = r27
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r8
            goto L_0x0067
        L_0x0065:
            r6 = r27
        L_0x0067:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0080
            r8 = r36 & 8
            if (r8 != 0) goto L_0x007a
            r8 = r29
            boolean r10 = r14.mo14980g(r8)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007a:
            r8 = r29
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r10
            goto L_0x0082
        L_0x0080:
            r8 = r29
        L_0x0082:
            r10 = r36 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x008c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008c:
            r15 = r13 & r11
            if (r15 != 0) goto L_0x00a0
            r15 = r31
            boolean r16 = r14.mo14968d(r15)
            if (r16 == 0) goto L_0x009b
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r3 = r3 | r16
            goto L_0x00a2
        L_0x00a0:
            r15 = r31
        L_0x00a2:
            r16 = 458752(0x70000, float:6.42848E-40)
            r17 = r13 & r16
            if (r17 != 0) goto L_0x00bc
            r17 = r36 & 32
            r11 = r32
            if (r17 != 0) goto L_0x00b7
            boolean r17 = r14.mo15006n0(r11)
            if (r17 == 0) goto L_0x00b7
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r17
            goto L_0x00be
        L_0x00bc:
            r11 = r32
        L_0x00be:
            r17 = r36 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00c9
            r17 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c6:
            r3 = r3 | r17
            goto L_0x00d9
        L_0x00c9:
            r17 = r13 & r18
            if (r17 != 0) goto L_0x00d9
            boolean r17 = r14.mo14927P(r12)
            if (r17 == 0) goto L_0x00d6
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c6
        L_0x00d6:
            r17 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c6
        L_0x00d9:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r17
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r2) goto L_0x00f6
            boolean r0 = r14.mo15011p()
            if (r0 != 0) goto L_0x00ea
            goto L_0x00f6
        L_0x00ea:
            r14.mo14958a0()
            r1 = r25
            r2 = r5
            r3 = r6
            r5 = r8
            r8 = r11
            r7 = r15
            goto L_0x01d1
        L_0x00f6:
            r14.mo14930Q()
            r0 = r13 & 1
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x0128
            boolean r0 = r14.mo14977f0()
            if (r0 == 0) goto L_0x0107
            goto L_0x0128
        L_0x0107:
            r14.mo14958a0()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0110
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0110:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x0116
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0116:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x011b
            r3 = r3 & r2
        L_0x011b:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
            r23 = r15
            r15 = r25
            goto L_0x017e
        L_0x0128:
            if (r1 == 0) goto L_0x012d
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x012f
        L_0x012d:
            r0 = r25
        L_0x012f:
            if (r4 == 0) goto L_0x0136
            androidx.compose.ui.graphics.g4 r1 = androidx.compose.p004ui.graphics.C15321t3.m66567a()
            r5 = r1
        L_0x0136:
            r1 = r36 & 4
            r4 = 6
            if (r1 == 0) goto L_0x0147
            androidx.compose.material3.i1 r1 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.z r1 = r1.mo12652a(r14, r4)
            long r6 = r1.mo14802A()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0147:
            r1 = r36 & 8
            if (r1 == 0) goto L_0x0156
            int r1 = r3 >> 6
            r1 = r1 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m25516c(r6, r14, r1)
            r1 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
        L_0x0156:
            if (r10 == 0) goto L_0x015f
            androidx.compose.material3.j0 r1 = androidx.compose.material3.C8227j0.f20227a
            float r1 = r1.mo12708b()
            r15 = r1
        L_0x015f:
            r1 = r36 & 32
            if (r1 == 0) goto L_0x0173
            androidx.compose.material3.j0 r1 = androidx.compose.material3.C8227j0.f20227a
            androidx.compose.foundation.layout.e1 r1 = r1.mo12714h(r14, r4)
            r3 = r3 & r2
            r24 = r1
            r17 = r5
            r19 = r6
            r21 = r8
            goto L_0x017b
        L_0x0173:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
        L_0x017b:
            r23 = r15
            r15 = r0
        L_0x017e:
            r14.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0190
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)"
            r2 = -588600583(0xffffffffdceaaaf9, float:-5.28425048E17)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r0, r1)
        L_0x0190:
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r1 = r3 << 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r0 = r0 | r1
            r1 = r3 & r18
            r10 = r0 | r1
            r11 = 0
            r0 = r24
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r33
            r9 = r14
            m25936c(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01c6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01c6:
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
        L_0x01d1:
            androidx.compose.runtime.t1 r14 = r14.mo15020s()
            if (r14 != 0) goto L_0x01d8
            goto L_0x01e7
        L_0x01d8:
            androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$1 r15 = new androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$1
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r14.mo15202a(r15)
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m25934a(androidx.compose.ui.m, androidx.compose.ui.graphics.g4, long, long, float, androidx.compose.foundation.layout.e1, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25935b(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r28, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r29, @org.jetbrains.annotations.C12580l androidx.compose.material3.DrawerState r30, boolean r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r1 = r28
            r5 = r32
            r6 = r34
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 398812198(0x17c56426, float:1.2756108E-24)
            r2 = r33
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r35 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0021
            r3 = r6 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.mo14927P(r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            r3 = r3 | r6
            goto L_0x0031
        L_0x0030:
            r3 = r6
        L_0x0031:
            r7 = r35 & 2
            if (r7 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004b
            r8 = r29
            boolean r9 = r2.mo15006n0(r8)
            if (r9 == 0) goto L_0x0047
            r9 = 32
            goto L_0x0049
        L_0x0047:
            r9 = 16
        L_0x0049:
            r3 = r3 | r9
            goto L_0x004d
        L_0x004b:
            r8 = r29
        L_0x004d:
            r9 = r6 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0066
            r9 = r35 & 4
            if (r9 != 0) goto L_0x0060
            r9 = r30
            boolean r10 = r2.mo15006n0(r9)
            if (r10 == 0) goto L_0x0062
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r9 = r30
        L_0x0062:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r10
            goto L_0x0068
        L_0x0066:
            r9 = r30
        L_0x0068:
            r10 = r35 & 8
            if (r10 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r11 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0082
            r11 = r31
            boolean r12 = r2.mo14961b(r11)
            if (r12 == 0) goto L_0x007e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r12
            goto L_0x0084
        L_0x0082:
            r11 = r31
        L_0x0084:
            r12 = r35 & 16
            if (r12 == 0) goto L_0x008b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r6
            if (r12 != 0) goto L_0x009d
            boolean r12 = r2.mo14927P(r5)
            if (r12 == 0) goto L_0x009a
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r12
        L_0x009d:
            r12 = 46811(0xb6db, float:6.5596E-41)
            r12 = r12 & r3
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00b3
            boolean r12 = r2.mo15011p()
            if (r12 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r2.mo14958a0()
            r3 = r9
            r4 = r11
            goto L_0x042b
        L_0x00b3:
            r2.mo14930Q()
            r12 = r6 & 1
            r13 = 0
            r14 = 6
            r15 = 1
            if (r12 == 0) goto L_0x00ce
            boolean r12 = r2.mo14977f0()
            if (r12 == 0) goto L_0x00c4
            goto L_0x00ce
        L_0x00c4:
            r2.mo14958a0()
            r7 = r35 & 4
            if (r7 == 0) goto L_0x00e3
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00e3
        L_0x00ce:
            if (r7 == 0) goto L_0x00d3
            androidx.compose.ui.m$a r7 = androidx.compose.p004ui.C8767m.f23478j
            r8 = r7
        L_0x00d3:
            r7 = r35 & 4
            if (r7 == 0) goto L_0x00e0
            androidx.compose.material3.DrawerValue r7 = androidx.compose.material3.DrawerValue.Closed
            androidx.compose.material3.DrawerState r7 = m25949p(r7, r13, r2, r14, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r9 = r7
        L_0x00e0:
            if (r10 == 0) goto L_0x00e3
            r11 = r15
        L_0x00e3:
            r2.mo14899E()
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00f2
            r7 = -1
            java.lang.String r10 = "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:344)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r7, r10)
        L_0x00f2:
            androidx.compose.material3.tokens.i0 r0 = androidx.compose.material3.tokens.C8311i0.f21364a
            float r0 = r0.mo13775q()
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r2.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            float r0 = r7.mo7425g5(r0)
            float r0 = -r0
            r7 = 773894976(0x2e20b340, float:3.6538994E-11)
            r2.mo14918M(r7)
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r7)
            java.lang.Object r7 = r2.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r7 != r10) goto L_0x012e
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r7 = androidx.compose.runtime.EffectsKt.m29901m(r7, r2)
            androidx.compose.runtime.w r10 = new androidx.compose.runtime.w
            r10.<init>(r7)
            r2.mo14893C(r10)
            r7 = r10
        L_0x012e:
            r2.mo15002m0()
            androidx.compose.runtime.w r7 = (androidx.compose.runtime.C8690w) r7
            kotlinx.coroutines.o0 r7 = r7.mo16831a()
            r2.mo15002m0()
            androidx.compose.material3.t2$a r10 = androidx.compose.material3.C8284t2.f20507b
            int r10 = r10.mo13032R()
            java.lang.String r10 = androidx.compose.material3.C8357u2.m29348a(r10, r2, r14)
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.material3.DrawerValue r12 = androidx.compose.material3.DrawerValue.Closed
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r0, r12)
            r12 = 0
            r4[r12] = r0
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.material3.DrawerValue r14 = androidx.compose.material3.DrawerValue.Open
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r0, r14)
            r4[r15] = r0
            java.util.Map r18 = kotlin.collections.C10977s0.m41456W(r4)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r2.mo15032w(r0)
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.p004ui.unit.LayoutDirection.Rtl
            if (r0 != r4) goto L_0x0173
            r21 = r15
            goto L_0x0175
        L_0x0173:
            r21 = r12
        L_0x0175:
            androidx.compose.material3.SwipeableState r17 = r9.mo11513g()
            androidx.compose.foundation.gestures.Orientation r19 = androidx.compose.foundation.gestures.Orientation.Horizontal
            float r25 = f19505a
            r22 = 0
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1 r23 = androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1.f19508f
            r24 = 0
            r26 = 32
            r27 = 0
            r16 = r8
            r20 = r11
            androidx.compose.ui.m r0 = androidx.compose.material3.SwipeableKt.m26386l(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r4)
            androidx.compose.ui.c$a r14 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r4 = r14.mo17061C()
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.BoxKt.m9849k(r4, r12, r2, r12)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r13)
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r15 = r2.mo15032w(r15)
            androidx.compose.ui.unit.d r15 = (androidx.compose.p004ui.unit.C16479d) r15
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r13 = r2.mo15032w(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p004ui.unit.LayoutDirection) r13
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r2.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r17.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            r18 = r8
            androidx.compose.runtime.d r8 = r2.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x01da
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01da:
            r2.mo14938T()
            boolean r8 = r2.mo14997l()
            if (r8 == 0) goto L_0x01e7
            r2.mo14947W(r6)
            goto L_0x01ea
        L_0x01e7:
            r2.mo14888A()
        L_0x01ea:
            r2.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r8 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r8)
            kotlin.jvm.functions.p r4 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r15, r4)
            kotlin.jvm.functions.p r4 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r13, r4)
            kotlin.jvm.functions.p r4 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r12, r4)
            r2.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r0.invoke(r4, r2, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r4 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2 r4 = new androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2
            r4.<init>(r9)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r6)
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r2.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r2.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            kotlin.jvm.functions.a r15 = r17.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            r20 = r11
            androidx.compose.runtime.d r11 = r2.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x0268
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0268:
            r2.mo14938T()
            boolean r11 = r2.mo14997l()
            if (r11 == 0) goto L_0x0275
            r2.mo14947W(r15)
            goto L_0x0278
        L_0x0275:
            r2.mo14888A()
        L_0x0278:
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r15 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r4, r15)
            kotlin.jvm.functions.p r4 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r4)
            kotlin.jvm.functions.p r4 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r12, r4)
            kotlin.jvm.functions.p r4 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r13, r4)
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r8 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r0.invoke(r4, r2, r11)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1 r0 = new androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1
            r0.<init>(r10, r9, r7)
            r4 = 0
            r7 = 1
            androidx.compose.ui.m r0 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r6, r8, r0, r7, r4)
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r4)
            androidx.compose.ui.c r4 = r14.mo17061C()
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.BoxKt.m9849k(r4, r8, r2, r8)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r2.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            kotlin.jvm.functions.a r11 = r17.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r12 = r2.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x02fe
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02fe:
            r2.mo14938T()
            boolean r12 = r2.mo14997l()
            if (r12 == 0) goto L_0x030b
            r2.mo14947W(r11)
            goto L_0x030e
        L_0x030b:
            r2.mo14888A()
        L_0x030e:
            r2.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r12 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r4, r12)
            kotlin.jvm.functions.p r4 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r4)
            kotlin.jvm.functions.p r4 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r4)
            kotlin.jvm.functions.p r4 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r10, r4)
            r2.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r0.invoke(r4, r2, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            r0 = r3 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r2, r0)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r0)
            androidx.compose.ui.c r0 = r14.mo17061C()
            r4 = 0
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.BoxKt.m9849k(r0, r4, r2, r4)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r2.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r2.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r10 = r17.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r11 = r2.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x03a5
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x03a5:
            r2.mo14938T()
            boolean r11 = r2.mo14997l()
            if (r11 == 0) goto L_0x03b2
            r2.mo14947W(r10)
            goto L_0x03b5
        L_0x03b2:
            r2.mo14888A()
        L_0x03b5:
            r2.mo14941U()
            androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r11 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r10, r0, r11)
            kotlin.jvm.functions.p r0 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r10, r4, r0)
            kotlin.jvm.functions.p r0 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r10, r7, r0)
            kotlin.jvm.functions.p r0 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r10, r8, r0)
            r2.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.invoke(r0, r2, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            int r0 = r3 >> 12
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.invoke(r2, r0)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0426
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0426:
            r3 = r9
            r8 = r18
            r4 = r20
        L_0x042b:
            androidx.compose.runtime.t1 r9 = r2.mo15020s()
            if (r9 != 0) goto L_0x0432
            goto L_0x0444
        L_0x0432:
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3 r10 = new androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3
            r0 = r10
            r1 = r28
            r2 = r8
            r5 = r32
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.mo15202a(r10)
        L_0x0444:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m25935b(kotlin.jvm.functions.p, androidx.compose.ui.m, androidx.compose.material3.DrawerState, boolean, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ec  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25936c(androidx.compose.foundation.layout.C2354e1 r26, androidx.compose.p004ui.C8767m r27, androidx.compose.p004ui.graphics.C15218g4 r28, long r29, long r31, float r33, kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r34, androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r1 = r26
            r9 = r34
            r10 = r36
            r0 = 175072821(0xa6f6635, float:1.15266544E-32)
            r2 = r35
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r37 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r10 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r10
            goto L_0x0026
        L_0x0025:
            r3 = r10
        L_0x0026:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
            goto L_0x0040
        L_0x002d:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0040
            r5 = r27
            boolean r6 = r2.mo15006n0(r5)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r3 = r3 | r6
            goto L_0x0042
        L_0x0040:
            r5 = r27
        L_0x0042:
            r6 = r37 & 4
            if (r6 == 0) goto L_0x0049
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005c
            r7 = r28
            boolean r8 = r2.mo15006n0(r7)
            if (r8 == 0) goto L_0x0058
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r3 = r3 | r8
            goto L_0x005e
        L_0x005c:
            r7 = r28
        L_0x005e:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0075
            r8 = r37 & 8
            r11 = r29
            if (r8 != 0) goto L_0x0071
            boolean r8 = r2.mo14980g(r11)
            if (r8 == 0) goto L_0x0071
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r8
            goto L_0x0077
        L_0x0075:
            r11 = r29
        L_0x0077:
            r8 = 57344(0xe000, float:8.0356E-41)
            r13 = r10 & r8
            if (r13 != 0) goto L_0x0093
            r13 = r37 & 16
            if (r13 != 0) goto L_0x008d
            r13 = r31
            boolean r15 = r2.mo14980g(r13)
            if (r15 == 0) goto L_0x008f
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008d:
            r13 = r31
        L_0x008f:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r15
            goto L_0x0095
        L_0x0093:
            r13 = r31
        L_0x0095:
            r15 = r37 & 32
            if (r15 == 0) goto L_0x00a0
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r8 = r33
            goto L_0x00b5
        L_0x00a0:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r10 & r16
            r8 = r33
            if (r16 != 0) goto L_0x00b5
            boolean r16 = r2.mo14968d(r8)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r3 = r3 | r16
        L_0x00b5:
            r16 = r37 & 64
            if (r16 == 0) goto L_0x00be
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00bb:
            r3 = r3 | r16
            goto L_0x00d0
        L_0x00be:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00d0
            boolean r16 = r2.mo14927P(r9)
            if (r16 == 0) goto L_0x00cd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00bb
        L_0x00cd:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00bb
        L_0x00d0:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00ec
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x00e1
            goto L_0x00ec
        L_0x00e1:
            r2.mo14958a0()
            r3 = r27
            r4 = r7
            r6 = r11
            r24 = r13
            goto L_0x01bf
        L_0x00ec:
            r2.mo14930Q()
            r0 = r10 & 1
            r5 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0112
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x00fd
            goto L_0x0112
        L_0x00fd:
            r2.mo14958a0()
            r0 = r37 & 8
            if (r0 == 0) goto L_0x0106
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0106:
            r0 = r37 & 16
            if (r0 == 0) goto L_0x010b
            r3 = r3 & r5
        L_0x010b:
            r0 = r27
            r4 = r7
            r6 = r11
            r24 = r13
            goto L_0x014e
        L_0x0112:
            if (r4 == 0) goto L_0x0117
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0119
        L_0x0117:
            r0 = r27
        L_0x0119:
            if (r6 == 0) goto L_0x0120
            androidx.compose.ui.graphics.g4 r4 = androidx.compose.p004ui.graphics.C15321t3.m66567a()
            goto L_0x0121
        L_0x0120:
            r4 = r7
        L_0x0121:
            r6 = r37 & 8
            if (r6 == 0) goto L_0x0133
            androidx.compose.material3.i1 r6 = androidx.compose.material3.C8215i1.f20180a
            r7 = 6
            androidx.compose.material3.z r6 = r6.mo12652a(r2, r7)
            long r6 = r6.mo14802A()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0134
        L_0x0133:
            r6 = r11
        L_0x0134:
            r11 = r37 & 16
            if (r11 == 0) goto L_0x0142
            int r11 = r3 >> 9
            r11 = r11 & 14
            long r11 = androidx.compose.material3.ColorSchemeKt.m25516c(r6, r2, r11)
            r3 = r3 & r5
            goto L_0x0143
        L_0x0142:
            r11 = r13
        L_0x0143:
            if (r15 == 0) goto L_0x014c
            androidx.compose.material3.j0 r5 = androidx.compose.material3.C8227j0.f20227a
            float r5 = r5.mo12711e()
            r8 = r5
        L_0x014c:
            r24 = r11
        L_0x014e:
            r2.mo14899E()
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x0160
            r5 = -1
            java.lang.String r11 = "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)"
            r12 = 175072821(0xa6f6635, float:1.15266544E-32)
            androidx.compose.runtime.ComposerKt.m29845w0(r12, r3, r5, r11)
        L_0x0160:
            float r5 = f19506b
            r11 = 0
            androidx.compose.material3.j0 r12 = androidx.compose.material3.C8227j0.f20227a
            float r12 = r12.mo12709c()
            r13 = 0
            r14 = 10
            r15 = 0
            r27 = r0
            r28 = r5
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10091G(r27, r28, r29, r30, r31, r32, r33)
            r12 = 0
            r13 = 1
            androidx.compose.ui.m r11 = androidx.compose.foundation.layout.SizeKt.m10110j(r5, r11, r13, r12)
            r18 = 0
            r19 = 0
            androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1 r5 = new androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
            r5.<init>(r1, r9, r3)
            r12 = 959363152(0x392eb850, float:1.6662595E-4)
            androidx.compose.runtime.internal.a r20 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r12, r13, r5)
            int r3 = r3 >> 3
            r5 = r3 & 112(0x70, float:1.57E-43)
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r12
            r12 = r3 & 896(0x380, float:1.256E-42)
            r5 = r5 | r12
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r22 = r5 | r3
            r23 = 96
            r12 = r4
            r13 = r6
            r15 = r24
            r17 = r8
            r21 = r2
            androidx.compose.material3.SurfaceKt.m26352a(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x01be
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01be:
            r3 = r0
        L_0x01bf:
            androidx.compose.runtime.t1 r12 = r2.mo15020s()
            if (r12 != 0) goto L_0x01c6
            goto L_0x01dc
        L_0x01c6:
            androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2 r13 = new androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2
            r0 = r13
            r1 = r26
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r24
            r9 = r34
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m25936c(androidx.compose.foundation.layout.e1, androidx.compose.ui.m, androidx.compose.ui.graphics.g4, long, long, float, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f3  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25937d(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r26, long r27, long r29, float r31, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 1001163336(0x3bac8a48, float:0.005265508)
            r1 = r34
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r13 | 6
            r3 = r2
            r2 = r25
            goto L_0x0030
        L_0x001c:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r25
            boolean r3 = r14.mo15006n0(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r13
            goto L_0x0030
        L_0x002d:
            r2 = r25
            r3 = r13
        L_0x0030:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            r4 = r36 & 2
            if (r4 != 0) goto L_0x0043
            r4 = r26
            boolean r5 = r14.mo15006n0(r4)
            if (r5 == 0) goto L_0x0045
            r5 = 32
            goto L_0x0047
        L_0x0043:
            r4 = r26
        L_0x0045:
            r5 = 16
        L_0x0047:
            r3 = r3 | r5
            goto L_0x004b
        L_0x0049:
            r4 = r26
        L_0x004b:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0064
            r5 = r36 & 4
            if (r5 != 0) goto L_0x005e
            r5 = r27
            boolean r7 = r14.mo14980g(r5)
            if (r7 == 0) goto L_0x0060
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r5 = r27
        L_0x0060:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r7
            goto L_0x0066
        L_0x0064:
            r5 = r27
        L_0x0066:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r36 & 8
            if (r7 != 0) goto L_0x0079
            r7 = r29
            boolean r9 = r14.mo14980g(r7)
            if (r9 == 0) goto L_0x007b
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x0079:
            r7 = r29
        L_0x007b:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r9
            goto L_0x0081
        L_0x007f:
            r7 = r29
        L_0x0081:
            r9 = r36 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r11 = r13 & r10
            if (r11 != 0) goto L_0x009e
            r11 = r31
            boolean r15 = r14.mo14968d(r11)
            if (r15 == 0) goto L_0x009a
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r15
            goto L_0x00a0
        L_0x009e:
            r11 = r31
        L_0x00a0:
            r15 = 458752(0x70000, float:6.42848E-40)
            r16 = r13 & r15
            if (r16 != 0) goto L_0x00ba
            r16 = r36 & 32
            r15 = r32
            if (r16 != 0) goto L_0x00b5
            boolean r16 = r14.mo15006n0(r15)
            if (r16 == 0) goto L_0x00b5
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r3 = r3 | r16
            goto L_0x00bc
        L_0x00ba:
            r15 = r32
        L_0x00bc:
            r16 = r36 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00c7
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c4:
            r3 = r3 | r16
            goto L_0x00d7
        L_0x00c7:
            r16 = r13 & r17
            if (r16 != 0) goto L_0x00d7
            boolean r16 = r14.mo14927P(r12)
            if (r16 == 0) goto L_0x00d4
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00d4:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c4
        L_0x00d7:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r3 & r16
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r0) goto L_0x00f3
            boolean r0 = r14.mo15011p()
            if (r0 != 0) goto L_0x00e8
            goto L_0x00f3
        L_0x00e8:
            r14.mo14958a0()
            r1 = r2
            r2 = r4
            r3 = r5
            r5 = r7
            r7 = r11
            r8 = r15
            goto L_0x01dd
        L_0x00f3:
            r14.mo14930Q()
            r0 = r13 & 1
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x012b
            boolean r0 = r14.mo14977f0()
            if (r0 == 0) goto L_0x0104
            goto L_0x012b
        L_0x0104:
            r14.mo14958a0()
            r0 = r36 & 2
            if (r0 == 0) goto L_0x010d
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x010d:
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0113
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0113:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x0119
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0119:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x011e
            r3 = r3 & r10
        L_0x011e:
            r18 = r4
            r19 = r5
            r21 = r7
            r23 = r11
            r24 = r15
            r15 = r2
            goto L_0x0189
        L_0x012b:
            if (r1 == 0) goto L_0x0130
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0131
        L_0x0130:
            r0 = r2
        L_0x0131:
            r1 = r36 & 2
            r2 = 6
            if (r1 == 0) goto L_0x013f
            androidx.compose.material3.j0 r1 = androidx.compose.material3.C8227j0.f20227a
            androidx.compose.ui.graphics.g4 r1 = r1.mo12713g(r14, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            r4 = r1
        L_0x013f:
            r1 = r36 & 4
            if (r1 == 0) goto L_0x014f
            androidx.compose.material3.i1 r1 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.z r1 = r1.mo12652a(r14, r2)
            long r5 = r1.mo14802A()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x014f:
            r1 = r36 & 8
            if (r1 == 0) goto L_0x015e
            int r1 = r3 >> 6
            r1 = r1 & 14
            long r7 = androidx.compose.material3.ColorSchemeKt.m25516c(r5, r14, r1)
            r1 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
        L_0x015e:
            if (r9 == 0) goto L_0x0167
            androidx.compose.material3.j0 r1 = androidx.compose.material3.C8227j0.f20227a
            float r1 = r1.mo12710d()
            r11 = r1
        L_0x0167:
            r1 = r36 & 32
            if (r1 == 0) goto L_0x017e
            androidx.compose.material3.j0 r1 = androidx.compose.material3.C8227j0.f20227a
            androidx.compose.foundation.layout.e1 r1 = r1.mo12714h(r14, r2)
            r3 = r3 & r10
            r15 = r0
            r24 = r1
            r18 = r4
            r19 = r5
            r21 = r7
            r23 = r11
            goto L_0x0189
        L_0x017e:
            r18 = r4
            r19 = r5
            r21 = r7
            r23 = r11
            r24 = r15
            r15 = r0
        L_0x0189:
            r14.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x019b
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:454)"
            r2 = 1001163336(0x3bac8a48, float:0.005265508)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r0, r1)
        L_0x019b:
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r1 = r3 << 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = r3 & r17
            r10 = r0 | r1
            r11 = 0
            r0 = r24
            r1 = r15
            r2 = r18
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r33
            r9 = r14
            m25936c(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01d2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d2:
            r1 = r15
            r2 = r18
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
        L_0x01dd:
            androidx.compose.runtime.t1 r14 = r14.mo15020s()
            if (r14 != 0) goto L_0x01e4
            goto L_0x01f3
        L_0x01e4:
            androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$1 r15 = new androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$1
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r14.mo15202a(r15)
        L_0x01f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m25937d(androidx.compose.ui.m, androidx.compose.ui.graphics.g4, long, long, float, androidx.compose.foundation.layout.e1, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ee, code lost:
        if ((r41 & 16) != 0) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ab  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25938e(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r33, @org.jetbrains.annotations.C12580l androidx.compose.material3.DrawerState r34, boolean r35, long r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r38, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r39, int r40, int r41) {
        /*
            r1 = r32
            r7 = r38
            r8 = r40
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -1169303680(0xffffffffba4dd780, float:-7.8522414E-4)
            r2 = r39
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r41 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0021
            r3 = r8 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.mo14927P(r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            r3 = r3 | r8
            goto L_0x0031
        L_0x0030:
            r3 = r8
        L_0x0031:
            r5 = r41 & 2
            if (r5 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004b
            r6 = r33
            boolean r9 = r2.mo15006n0(r6)
            if (r9 == 0) goto L_0x0047
            r9 = 32
            goto L_0x0049
        L_0x0047:
            r9 = 16
        L_0x0049:
            r3 = r3 | r9
            goto L_0x004d
        L_0x004b:
            r6 = r33
        L_0x004d:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0066
            r9 = r41 & 4
            if (r9 != 0) goto L_0x0060
            r9 = r34
            boolean r10 = r2.mo15006n0(r9)
            if (r10 == 0) goto L_0x0062
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r9 = r34
        L_0x0062:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r10
            goto L_0x0068
        L_0x0066:
            r9 = r34
        L_0x0068:
            r10 = r41 & 8
            if (r10 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0082
            r11 = r35
            boolean r12 = r2.mo14961b(r11)
            if (r12 == 0) goto L_0x007e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r12
            goto L_0x0084
        L_0x0082:
            r11 = r35
        L_0x0084:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x009f
            r12 = r41 & 16
            if (r12 != 0) goto L_0x0099
            r12 = r36
            boolean r14 = r2.mo14980g(r12)
            if (r14 == 0) goto L_0x009b
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r12 = r36
        L_0x009b:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r3 = r3 | r14
            goto L_0x00a1
        L_0x009f:
            r12 = r36
        L_0x00a1:
            r14 = r41 & 32
            if (r14 == 0) goto L_0x00a9
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a7:
            r3 = r3 | r14
            goto L_0x00ba
        L_0x00a9:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00ba
            boolean r14 = r2.mo14927P(r7)
            if (r14 == 0) goto L_0x00b7
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a7
        L_0x00b7:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a7
        L_0x00ba:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r3
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d1
            boolean r14 = r2.mo15011p()
            if (r14 != 0) goto L_0x00ca
            goto L_0x00d1
        L_0x00ca:
            r2.mo14958a0()
            r3 = r9
            r4 = r11
            goto L_0x0458
        L_0x00d1:
            r2.mo14930Q()
            r14 = r8 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 1
            if (r14 == 0) goto L_0x00f7
            boolean r14 = r2.mo14977f0()
            if (r14 == 0) goto L_0x00e3
            goto L_0x00f7
        L_0x00e3:
            r2.mo14958a0()
            r5 = r41 & 4
            if (r5 == 0) goto L_0x00ec
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ec:
            r5 = r41 & 16
            if (r5 == 0) goto L_0x00f1
        L_0x00f0:
            r3 = r3 & r15
        L_0x00f1:
            r15 = r3
            r3 = r9
            r5 = r11
            r30 = r12
            goto L_0x011a
        L_0x00f7:
            if (r5 == 0) goto L_0x00fc
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r6 = r5
        L_0x00fc:
            r5 = r41 & 4
            if (r5 == 0) goto L_0x010b
            androidx.compose.material3.DrawerValue r5 = androidx.compose.material3.DrawerValue.Closed
            r9 = 0
            r14 = 6
            androidx.compose.material3.DrawerState r5 = m25949p(r5, r9, r2, r14, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r9 = r5
        L_0x010b:
            if (r10 == 0) goto L_0x010e
            r11 = r0
        L_0x010e:
            r5 = r41 & 16
            if (r5 == 0) goto L_0x00f1
            androidx.compose.material3.j0 r5 = androidx.compose.material3.C8227j0.f20227a
            r10 = 6
            long r12 = r5.mo12712f(r2, r10)
            goto L_0x00f0
        L_0x011a:
            r2.mo14899E()
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x012c
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)"
            r11 = -1169303680(0xffffffffba4dd780, float:-7.8522414E-4)
            androidx.compose.runtime.ComposerKt.m29845w0(r11, r15, r9, r10)
        L_0x012c:
            r9 = 773894976(0x2e20b340, float:3.6538994E-11)
            r2.mo14918M(r9)
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r9)
            java.lang.Object r9 = r2.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r16.mo16277a()
            if (r9 != r10) goto L_0x0153
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r9 = androidx.compose.runtime.EffectsKt.m29901m(r9, r2)
            androidx.compose.runtime.w r10 = new androidx.compose.runtime.w
            r10.<init>(r9)
            r2.mo14893C(r10)
            r9 = r10
        L_0x0153:
            r2.mo15002m0()
            androidx.compose.runtime.w r9 = (androidx.compose.runtime.C8690w) r9
            kotlinx.coroutines.o0 r14 = r9.mo16831a()
            r2.mo15002m0()
            androidx.compose.material3.t2$a r9 = androidx.compose.material3.C8284t2.f20507b
            int r9 = r9.mo13032R()
            r10 = 6
            java.lang.String r12 = androidx.compose.material3.C8357u2.m29348a(r9, r2, r10)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r2.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.material3.tokens.i0 r10 = androidx.compose.material3.tokens.C8311i0.f21364a
            float r10 = r10.mo13775q()
            float r9 = r9.mo7425g5(r10)
            float r9 = -r9
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            java.lang.Float r10 = java.lang.Float.valueOf(r9)
            androidx.compose.material3.DrawerValue r11 = androidx.compose.material3.DrawerValue.Closed
            kotlin.Pair r10 = kotlin.C11078d1.m42659a(r10, r11)
            r13 = 0
            r4[r13] = r10
            r10 = 0
            java.lang.Float r11 = java.lang.Float.valueOf(r10)
            androidx.compose.material3.DrawerValue r13 = androidx.compose.material3.DrawerValue.Open
            kotlin.Pair r11 = kotlin.C11078d1.m42659a(r11, r13)
            r4[r0] = r11
            java.util.Map r20 = kotlin.collections.C10977s0.m41456W(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r2.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r11 = androidx.compose.p004ui.unit.LayoutDirection.Rtl
            if (r4 != r11) goto L_0x01af
            r23 = r0
            r4 = 0
            goto L_0x01b2
        L_0x01af:
            r4 = 0
            r23 = 0
        L_0x01b2:
            androidx.compose.ui.m r18 = androidx.compose.foundation.layout.SizeKt.m10112l(r6, r10, r0, r4)
            androidx.compose.material3.SwipeableState r19 = r3.mo11513g()
            androidx.compose.foundation.gestures.Orientation r21 = androidx.compose.foundation.gestures.Orientation.Horizontal
            float r27 = f19505a
            r24 = 0
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1 r25 = androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1.f19510f
            r26 = 0
            r28 = 32
            r29 = 0
            r22 = r5
            androidx.compose.ui.m r4 = androidx.compose.material3.SwipeableKt.m26386l(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r13 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r13)
            androidx.compose.ui.c$a r17 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r11 = r17.mo17061C()
            r0 = 0
            androidx.compose.ui.layout.f0 r11 = androidx.compose.foundation.layout.BoxKt.m9849k(r11, r0, r2, r0)
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r0)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r2.mo15032w(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.p004ui.unit.LayoutDirection) r0
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r2.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r19 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r20 = r6
            kotlin.jvm.functions.a r6 = r19.mo44585a()
            kotlin.jvm.functions.q r4 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r4)
            androidx.compose.runtime.d r8 = r2.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x021a
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x021a:
            r2.mo14938T()
            boolean r8 = r2.mo14997l()
            if (r8 == 0) goto L_0x0227
            r2.mo14947W(r6)
            goto L_0x022a
        L_0x0227:
            r2.mo14888A()
        L_0x022a:
            r2.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r8 = r19.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r11, r8)
            kotlin.jvm.functions.p r8 = r19.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r10, r8)
            kotlin.jvm.functions.p r8 = r19.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r0, r8)
            kotlin.jvm.functions.p r0 = r19.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r13, r0)
            r2.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r4.invoke(r0, r2, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r4 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r4)
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.c r10 = r17.mo17061C()
            androidx.compose.ui.layout.f0 r10 = androidx.compose.foundation.layout.BoxKt.m9849k(r10, r6, r2, r6)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r2.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r2.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r2.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            kotlin.jvm.functions.a r4 = r19.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r8)
            r21 = r12
            androidx.compose.runtime.d r12 = r2.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x02b1
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02b1:
            r2.mo14938T()
            boolean r12 = r2.mo14997l()
            if (r12 == 0) goto L_0x02be
            r2.mo14947W(r4)
            goto L_0x02c1
        L_0x02be:
            r2.mo14888A()
        L_0x02c1:
            r2.mo14941U()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r12 = r19.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r4, r10, r12)
            kotlin.jvm.functions.p r10 = r19.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r4, r6, r10)
            kotlin.jvm.functions.p r6 = r19.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r4, r11, r6)
            kotlin.jvm.functions.p r6 = r19.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r4, r13, r6)
            r2.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r6 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r0.invoke(r4, r2, r10)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            int r0 = r15 >> 15
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.invoke(r2, r0)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = r3.mo11517n()
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2 r10 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2
            r10.<init>(r5, r3, r14)
            java.lang.Float r4 = java.lang.Float.valueOf(r9)
            r11 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r11 = 1618982084(0x607fb4c4, float:7.370227E19)
            r2.mo14918M(r11)
            boolean r4 = r2.mo15006n0(r4)
            boolean r11 = r2.mo15006n0(r12)
            r4 = r4 | r11
            boolean r11 = r2.mo15006n0(r3)
            r4 = r4 | r11
            java.lang.Object r11 = r2.mo14921N()
            if (r4 != 0) goto L_0x0346
            java.lang.Object r4 = r16.mo16277a()
            if (r11 != r4) goto L_0x034f
        L_0x0346:
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1 r11 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1
            r4 = 0
            r11.<init>(r9, r4, r3)
            r2.mo14893C(r11)
        L_0x034f:
            r2.mo15002m0()
            kotlin.jvm.functions.a r11 = (kotlin.jvm.functions.C11289a) r11
            int r4 = r15 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r9 = r0
            r0 = r21
            r12 = r30
            r6 = r14
            r14 = r2
            r21 = r15
            r15 = r4
            m25942i(r9, r10, r11, r12, r14, r15)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r4)
            boolean r4 = r2.mo15006n0(r3)
            java.lang.Object r9 = r2.mo14921N()
            if (r4 != 0) goto L_0x037b
            java.lang.Object r4 = r16.mo16277a()
            if (r9 != r4) goto L_0x0383
        L_0x037b:
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1 r9 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1
            r9.<init>(r3)
            r2.mo14893C(r9)
        L_0x0383:
            r2.mo15002m0()
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.OffsetKt.m9998d(r8, r9)
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5 r8 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5
            r8.<init>(r0, r3, r6)
            r0 = 0
            r6 = 0
            r9 = 1
            androidx.compose.ui.m r0 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r4, r6, r8, r9, r0)
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r4)
            androidx.compose.ui.c r4 = r17.mo17061C()
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.BoxKt.m9849k(r4, r6, r2, r6)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r2.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r9 = r2.mo15032w(r9)
            androidx.compose.ui.platform.c4 r9 = (androidx.compose.p004ui.platform.C15863c4) r9
            kotlin.jvm.functions.a r10 = r19.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r11 = r2.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x03dd
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x03dd:
            r2.mo14938T()
            boolean r11 = r2.mo14997l()
            if (r11 == 0) goto L_0x03ea
            r2.mo14947W(r10)
            goto L_0x03ed
        L_0x03ea:
            r2.mo14888A()
        L_0x03ed:
            r2.mo14941U()
            androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r11 = r19.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r10, r4, r11)
            kotlin.jvm.functions.p r4 = r19.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r10, r6, r4)
            kotlin.jvm.functions.p r4 = r19.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r10, r8, r4)
            kotlin.jvm.functions.p r4 = r19.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r10, r9, r4)
            r2.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.invoke(r4, r2, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            r0 = r21 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r2, r0)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0453
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0453:
            r4 = r5
            r6 = r20
            r12 = r30
        L_0x0458:
            androidx.compose.runtime.t1 r10 = r2.mo15020s()
            if (r10 != 0) goto L_0x045f
            goto L_0x0472
        L_0x045f:
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3 r11 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3
            r0 = r11
            r1 = r32
            r2 = r6
            r5 = r12
            r7 = r38
            r8 = r40
            r9 = r41
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x0472:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m25938e(kotlin.jvm.functions.p, androidx.compose.ui.m, androidx.compose.material3.DrawerState, boolean, long, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00ff  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25939f(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r36, boolean r37, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r38, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r39, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r40, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r41, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r42, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8263p1 r43, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r44, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r45, int r46, int r47) {
        /*
            r1 = r36
            r0 = r37
            r14 = r38
            r6 = r46
            r3 = r47
            java.lang.String r2 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r2)
            r2 = -1304626543(0xffffffffb23cfa91, float:-1.10000125E-8)
            r4 = r45
            androidx.compose.runtime.o r13 = r4.mo15009o(r2)
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0024
            r4 = r6 | 6
            goto L_0x0034
        L_0x0024:
            r4 = r6 & 14
            if (r4 != 0) goto L_0x0033
            boolean r4 = r13.mo14927P(r1)
            if (r4 == 0) goto L_0x0030
            r4 = 4
            goto L_0x0031
        L_0x0030:
            r4 = 2
        L_0x0031:
            r4 = r4 | r6
            goto L_0x0034
        L_0x0033:
            r4 = r6
        L_0x0034:
            r5 = r3 & 2
            if (r5 == 0) goto L_0x003b
            r4 = r4 | 48
            goto L_0x004b
        L_0x003b:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            boolean r5 = r13.mo14961b(r0)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r4 = r4 | r5
        L_0x004b:
            r5 = r3 & 4
            if (r5 == 0) goto L_0x0052
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r5 = r6 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0062
            boolean r5 = r13.mo14927P(r14)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r4 = r4 | r5
        L_0x0062:
            r5 = r3 & 8
            if (r5 == 0) goto L_0x0069
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r7 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007c
            r7 = r39
            boolean r8 = r13.mo15006n0(r7)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r4 = r4 | r8
            goto L_0x007e
        L_0x007c:
            r7 = r39
        L_0x007e:
            r8 = r3 & 16
            r35 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0088
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0088:
            r9 = r6 & r35
            if (r9 != 0) goto L_0x009b
            r9 = r40
            boolean r10 = r13.mo14927P(r9)
            if (r10 == 0) goto L_0x0097
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r4 = r4 | r10
            goto L_0x009d
        L_0x009b:
            r9 = r40
        L_0x009d:
            r10 = r3 & 32
            if (r10 == 0) goto L_0x00a5
            r11 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r11
            goto L_0x00b9
        L_0x00a5:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r6
            if (r11 != 0) goto L_0x00b9
            r11 = r41
            boolean r12 = r13.mo14927P(r11)
            if (r12 == 0) goto L_0x00b5
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r4 = r4 | r12
            goto L_0x00bb
        L_0x00b9:
            r11 = r41
        L_0x00bb:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r6
            if (r12 != 0) goto L_0x00d5
            r12 = r3 & 64
            if (r12 != 0) goto L_0x00cf
            r12 = r42
            boolean r15 = r13.mo15006n0(r12)
            if (r15 == 0) goto L_0x00d1
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00cf:
            r12 = r42
        L_0x00d1:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r4 = r4 | r15
            goto L_0x00d7
        L_0x00d5:
            r12 = r42
        L_0x00d7:
            r15 = 29360128(0x1c00000, float:7.052966E-38)
            r15 = r15 & r6
            if (r15 != 0) goto L_0x00f2
            r15 = r3 & 128(0x80, float:1.794E-43)
            if (r15 != 0) goto L_0x00eb
            r15 = r43
            boolean r16 = r13.mo15006n0(r15)
            if (r16 == 0) goto L_0x00ed
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ef
        L_0x00eb:
            r15 = r43
        L_0x00ed:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ef:
            r4 = r4 | r16
            goto L_0x00f4
        L_0x00f2:
            r15 = r43
        L_0x00f4:
            r2 = r3 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x00ff
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r16
            r1 = r44
            goto L_0x0114
        L_0x00ff:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r6 & r16
            r1 = r44
            if (r16 != 0) goto L_0x0114
            boolean r16 = r13.mo15006n0(r1)
            if (r16 == 0) goto L_0x0110
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0112
        L_0x0110:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0112:
            r4 = r4 | r16
        L_0x0114:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r4 & r16
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r7) goto L_0x0134
            boolean r1 = r13.mo15011p()
            if (r1 != 0) goto L_0x0125
            goto L_0x0134
        L_0x0125:
            r13.mo14958a0()
            r4 = r39
            r5 = r9
            r6 = r11
            r7 = r12
            r24 = r13
            r8 = r15
            r9 = r44
            goto L_0x027e
        L_0x0134:
            r13.mo14930Q()
            r1 = r6 & 1
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = 0
            if (r1 == 0) goto L_0x0165
            boolean r1 = r13.mo14977f0()
            if (r1 == 0) goto L_0x0146
            goto L_0x0165
        L_0x0146:
            r13.mo14958a0()
            r1 = r3 & 64
            if (r1 == 0) goto L_0x014f
            r4 = r4 & r16
        L_0x014f:
            r1 = r3 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0157
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r1
        L_0x0157:
            r1 = r39
            r23 = r44
            r20 = r9
            r21 = r11
            r22 = r12
            r2 = r15
            r15 = r4
            goto L_0x01d8
        L_0x0165:
            if (r5 == 0) goto L_0x016a
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x016c
        L_0x016a:
            r1 = r39
        L_0x016c:
            if (r8 == 0) goto L_0x016f
            r9 = r7
        L_0x016f:
            if (r10 == 0) goto L_0x0172
            r11 = r7
        L_0x0172:
            r5 = r3 & 64
            if (r5 == 0) goto L_0x0184
            androidx.compose.material3.tokens.i0 r5 = androidx.compose.material3.tokens.C8311i0.f21364a
            androidx.compose.material3.tokens.ShapeKeyTokens r5 = r5.mo13766h()
            r8 = 6
            androidx.compose.ui.graphics.g4 r5 = androidx.compose.material3.ShapesKt.m26127f(r5, r13, r8)
            r4 = r4 & r16
            goto L_0x0185
        L_0x0184:
            r5 = r12
        L_0x0185:
            r8 = r3 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x01aa
            androidx.compose.material3.q1 r15 = androidx.compose.material3.C8268q1.f20423a
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r33 = 100663296(0x6000000, float:2.4074124E-35)
            r34 = 255(0xff, float:3.57E-43)
            r32 = r13
            androidx.compose.material3.p1 r8 = r15.mo12933a(r16, r18, r20, r22, r24, r26, r28, r30, r32, r33, r34)
            r10 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r10
            goto L_0x01ab
        L_0x01aa:
            r8 = r15
        L_0x01ab:
            if (r2 == 0) goto L_0x01ce
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo14918M(r2)
            java.lang.Object r2 = r13.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r2 != r10) goto L_0x01c6
            androidx.compose.foundation.interaction.g r2 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r13.mo14893C(r2)
        L_0x01c6:
            r13.mo15002m0()
            androidx.compose.foundation.interaction.g r2 = (androidx.compose.foundation.interaction.C2243g) r2
            r23 = r2
            goto L_0x01d0
        L_0x01ce:
            r23 = r44
        L_0x01d0:
            r15 = r4
            r22 = r5
            r2 = r8
            r20 = r9
            r21 = r11
        L_0x01d8:
            r13.mo14899E()
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x01ea
            r4 = -1
            java.lang.String r5 = "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)"
            r8 = -1304626543(0xffffffffb23cfa91, float:-1.10000125E-8)
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r15, r4, r5)
        L_0x01ea:
            r4 = 0
            androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2 r5 = androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2.f19511f
            r12 = 1
            androidx.compose.ui.m r4 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r1, r4, r5, r12, r7)
            androidx.compose.material3.tokens.i0 r5 = androidx.compose.material3.tokens.C8311i0.f21364a
            float r5 = r5.mo13765g()
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10115o(r4, r5)
            r5 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10114n(r4, r5, r12, r7)
            r5 = 0
            int r16 = r15 >> 3
            r17 = r16 & 14
            int r7 = r15 >> 18
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r17 | r7
            androidx.compose.runtime.k2 r7 = r2.mo12576a(r0, r13, r7)
            java.lang.Object r7 = r7.getValue()
            androidx.compose.ui.graphics.j2 r7 = (androidx.compose.p004ui.graphics.C15240j2) r7
            long r7 = r7.mo42833M()
            r9 = 0
            r11 = 0
            r18 = 0
            r5 = r12
            r12 = r18
            r18 = 0
            r9 = r13
            r13 = r18
            androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$3 r10 = new androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$3
            r39 = r10
            r40 = r20
            r41 = r2
            r42 = r37
            r43 = r15
            r44 = r21
            r45 = r36
            r39.<init>(r40, r41, r42, r43, r44, r45)
            r11 = 191488423(0xb69e1a7, float:4.504393E-32)
            androidx.compose.runtime.internal.a r5 = androidx.compose.runtime.internal.C8553b.m31048b(r9, r11, r5, r10)
            r10 = r15
            r15 = r5
            r5 = r16 & 112(0x70, float:1.57E-43)
            r5 = r17 | r5
            int r11 = r10 >> 6
            r11 = r11 & r35
            r17 = r5 | r11
            int r5 = r10 >> 24
            r5 = r5 & 14
            r18 = r5 | 48
            r19 = 968(0x3c8, float:1.356E-42)
            r27 = r2
            r2 = r37
            r3 = r38
            r6 = r22
            r14 = r23
            r16 = r9
            r24 = r9
            r5 = 0
            r9 = 0
            r11 = 0
            androidx.compose.material3.SurfaceKt.m26353b(r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0273
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0273:
            r4 = r1
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r23
            r8 = r27
        L_0x027e:
            androidx.compose.runtime.t1 r12 = r24.mo15020s()
            if (r12 != 0) goto L_0x0285
            goto L_0x0298
        L_0x0285:
            androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$4 r13 = new androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$4
            r0 = r13
            r1 = r36
            r2 = r37
            r3 = r38
            r10 = r46
            r11 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x0298:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m25939f(kotlin.jvm.functions.p, boolean, kotlin.jvm.functions.a, androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.ui.graphics.g4, androidx.compose.material3.p1, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f6  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25940g(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r26, long r27, long r29, float r31, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1733353241(0xffffffff98af20e7, float:-4.5269663E-24)
            r1 = r34
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r13 | 6
            r3 = r2
            r2 = r25
            goto L_0x0030
        L_0x001c:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r25
            boolean r3 = r14.mo15006n0(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r13
            goto L_0x0030
        L_0x002d:
            r2 = r25
            r3 = r13
        L_0x0030:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x004a
        L_0x0037:
            r5 = r13 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r26
            boolean r6 = r14.mo15006n0(r5)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r3 = r3 | r6
            goto L_0x004c
        L_0x004a:
            r5 = r26
        L_0x004c:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r36 & 4
            if (r6 != 0) goto L_0x005f
            r6 = r27
            boolean r8 = r14.mo14980g(r6)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r6 = r27
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r8
            goto L_0x0067
        L_0x0065:
            r6 = r27
        L_0x0067:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0080
            r8 = r36 & 8
            if (r8 != 0) goto L_0x007a
            r8 = r29
            boolean r10 = r14.mo14980g(r8)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007a:
            r8 = r29
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r10
            goto L_0x0082
        L_0x0080:
            r8 = r29
        L_0x0082:
            r10 = r36 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x008c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008c:
            r15 = r13 & r11
            if (r15 != 0) goto L_0x00a0
            r15 = r31
            boolean r16 = r14.mo14968d(r15)
            if (r16 == 0) goto L_0x009b
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r3 = r3 | r16
            goto L_0x00a2
        L_0x00a0:
            r15 = r31
        L_0x00a2:
            r16 = 458752(0x70000, float:6.42848E-40)
            r17 = r13 & r16
            if (r17 != 0) goto L_0x00bc
            r17 = r36 & 32
            r11 = r32
            if (r17 != 0) goto L_0x00b7
            boolean r17 = r14.mo15006n0(r11)
            if (r17 == 0) goto L_0x00b7
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r17
            goto L_0x00be
        L_0x00bc:
            r11 = r32
        L_0x00be:
            r17 = r36 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00c9
            r17 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c6:
            r3 = r3 | r17
            goto L_0x00d9
        L_0x00c9:
            r17 = r13 & r18
            if (r17 != 0) goto L_0x00d9
            boolean r17 = r14.mo14927P(r12)
            if (r17 == 0) goto L_0x00d6
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c6
        L_0x00d6:
            r17 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c6
        L_0x00d9:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r17
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r2) goto L_0x00f6
            boolean r0 = r14.mo15011p()
            if (r0 != 0) goto L_0x00ea
            goto L_0x00f6
        L_0x00ea:
            r14.mo14958a0()
            r1 = r25
            r2 = r5
            r3 = r6
            r5 = r8
            r8 = r11
            r7 = r15
            goto L_0x0206
        L_0x00f6:
            r14.mo14930Q()
            r0 = r13 & 1
            r2 = 6
            if (r0 == 0) goto L_0x0129
            boolean r0 = r14.mo14977f0()
            if (r0 == 0) goto L_0x0105
            goto L_0x0129
        L_0x0105:
            r14.mo14958a0()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x010e
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x010e:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x0114
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0114:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x011c
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r0
        L_0x011c:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
            r23 = r15
            r15 = r25
            goto L_0x0181
        L_0x0129:
            if (r1 == 0) goto L_0x012e
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0130
        L_0x012e:
            r0 = r25
        L_0x0130:
            if (r4 == 0) goto L_0x0137
            androidx.compose.ui.graphics.g4 r1 = androidx.compose.p004ui.graphics.C15321t3.m66567a()
            r5 = r1
        L_0x0137:
            r1 = r36 & 4
            if (r1 == 0) goto L_0x0147
            androidx.compose.material3.i1 r1 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.z r1 = r1.mo12652a(r14, r2)
            long r6 = r1.mo14802A()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0147:
            r1 = r36 & 8
            if (r1 == 0) goto L_0x0156
            int r1 = r3 >> 6
            r1 = r1 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m25516c(r6, r14, r1)
            r1 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
        L_0x0156:
            if (r10 == 0) goto L_0x015f
            androidx.compose.material3.j0 r1 = androidx.compose.material3.C8227j0.f20227a
            float r1 = r1.mo12711e()
            r15 = r1
        L_0x015f:
            r1 = r36 & 32
            if (r1 == 0) goto L_0x0176
            androidx.compose.material3.j0 r1 = androidx.compose.material3.C8227j0.f20227a
            androidx.compose.foundation.layout.e1 r1 = r1.mo12714h(r14, r2)
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
            r24 = r1
            r17 = r5
            r19 = r6
            r21 = r8
            goto L_0x017e
        L_0x0176:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
        L_0x017e:
            r23 = r15
            r15 = r0
        L_0x0181:
            r14.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0193
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)"
            r4 = -1733353241(0xffffffff98af20e7, float:-4.5269663E-24)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r3, r0, r1)
        L_0x0193:
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13032R()
            java.lang.String r0 = androidx.compose.material3.C8357u2.m29348a(r0, r14, r2)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r1)
            boolean r1 = r14.mo15006n0(r0)
            java.lang.Object r2 = r14.mo14921N()
            if (r1 != 0) goto L_0x01b5
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x01bd
        L_0x01b5:
            androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1 r2 = new androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
            r2.<init>(r0)
            r14.mo14893C(r2)
        L_0x01bd:
            r14.mo15002m0()
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            r0 = 0
            r1 = 0
            r4 = 1
            androidx.compose.ui.m r1 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r15, r1, r2, r4, r0)
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r2 = r3 << 3
            r4 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            r4 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r2
            r0 = r0 | r4
            r2 = r2 & r16
            r0 = r0 | r2
            r2 = r3 & r18
            r10 = r0 | r2
            r11 = 0
            r0 = r24
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r33
            r9 = r14
            m25936c(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01fb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01fb:
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
        L_0x0206:
            androidx.compose.runtime.t1 r14 = r14.mo15020s()
            if (r14 != 0) goto L_0x020d
            goto L_0x021c
        L_0x020d:
            androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$2 r15 = new androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$2
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r14.mo15202a(r15)
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m25940g(androidx.compose.ui.m, androidx.compose.ui.graphics.g4, long, long, float, androidx.compose.foundation.layout.e1, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25941h(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r16, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r17, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r18, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r19, int r20, int r21) {
        /*
            r1 = r16
            r3 = r18
            r4 = r20
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = -276843608(0xffffffffef7fb3a8, float:-7.913587E28)
            r2 = r19
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r5 = r21 & 1
            if (r5 == 0) goto L_0x0020
            r5 = r4 | 6
            goto L_0x0030
        L_0x0020:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x002f
            boolean r5 = r2.mo14927P(r1)
            if (r5 == 0) goto L_0x002c
            r5 = 4
            goto L_0x002d
        L_0x002c:
            r5 = 2
        L_0x002d:
            r5 = r5 | r4
            goto L_0x0030
        L_0x002f:
            r5 = r4
        L_0x0030:
            r6 = r21 & 2
            if (r6 == 0) goto L_0x0037
            r5 = r5 | 48
            goto L_0x004a
        L_0x0037:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004a
            r7 = r17
            boolean r8 = r2.mo15006n0(r7)
            if (r8 == 0) goto L_0x0046
            r8 = 32
            goto L_0x0048
        L_0x0046:
            r8 = 16
        L_0x0048:
            r5 = r5 | r8
            goto L_0x004c
        L_0x004a:
            r7 = r17
        L_0x004c:
            r8 = r21 & 4
            if (r8 == 0) goto L_0x0053
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0063
            boolean r8 = r2.mo14927P(r3)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r8
        L_0x0063:
            r8 = r5 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0076
            boolean r8 = r2.mo15011p()
            if (r8 != 0) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            r2.mo14958a0()
            r6 = r7
            goto L_0x01f2
        L_0x0076:
            if (r6 == 0) goto L_0x007b
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x007c
        L_0x007b:
            r6 = r7
        L_0x007c:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x0088
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:424)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r7, r8)
        L_0x0088:
            r0 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10112l(r6, r0, r8, r7)
            r7 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.mo14918M(r7)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r7 = r7.mo7630p()
            androidx.compose.ui.c$a r8 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r9 = r8.mo17073w()
            r10 = 0
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.RowKt.m10071d(r7, r9, r2, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r9)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r2.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r2.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r2.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r15 = r14.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r9 = r2.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x00df
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00df:
            r2.mo14938T()
            boolean r9 = r2.mo14997l()
            if (r9 == 0) goto L_0x00ec
            r2.mo14947W(r15)
            goto L_0x00ef
        L_0x00ec:
            r2.mo14888A()
        L_0x00ef:
            r2.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r15 = r14.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r15)
            kotlin.jvm.functions.p r7 = r14.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r11, r7)
            kotlin.jvm.functions.p r7 = r14.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r12, r7)
            kotlin.jvm.functions.p r7 = r14.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r13, r7)
            r2.mo14972e()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r7 = androidx.compose.runtime.C8684u1.m31905a(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.invoke(r7, r2, r9)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r7 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r7 = r5 & 14
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.invoke(r2, r7)
            r7 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r7)
            androidx.compose.ui.m$a r7 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.c r8 = r8.mo17061C()
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.BoxKt.m9849k(r8, r10, r2, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r2.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r2.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r2.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            kotlin.jvm.functions.a r13 = r14.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r7)
            androidx.compose.runtime.d r15 = r2.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x017c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x017c:
            r2.mo14938T()
            boolean r15 = r2.mo14997l()
            if (r15 == 0) goto L_0x0189
            r2.mo14947W(r13)
            goto L_0x018c
        L_0x0189:
            r2.mo14888A()
        L_0x018c:
            r2.mo14941U()
            androidx.compose.runtime.o r13 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r15 = r14.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r13, r8, r15)
            kotlin.jvm.functions.p r8 = r14.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r13, r9, r8)
            kotlin.jvm.functions.p r8 = r14.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r13, r11, r8)
            kotlin.jvm.functions.p r8 = r14.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r13, r12, r8)
            r2.mo14972e()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r8 = androidx.compose.runtime.C8684u1.m31905a(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r7.invoke(r8, r2, r9)
            r2.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            int r0 = r5 >> 6
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r2, r0)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01f2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01f2:
            androidx.compose.runtime.t1 r7 = r2.mo15020s()
            if (r7 != 0) goto L_0x01f9
            goto L_0x020b
        L_0x01f9:
            androidx.compose.material3.NavigationDrawerKt$PermanentNavigationDrawer$2 r8 = new androidx.compose.material3.NavigationDrawerKt$PermanentNavigationDrawer$2
            r0 = r8
            r1 = r16
            r2 = r6
            r3 = r18
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r7.mo15202a(r8)
        L_0x020b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m25941h(kotlin.jvm.functions.p, androidx.compose.ui.m, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m25942i(boolean z, C11289a<C11079d2> aVar, C11289a<Float> aVar2, long j, C8592o oVar, int i) {
        int i2;
        C8767m mVar;
        int i3;
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(2106487387);
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
                ComposerKt.m29845w0(2106487387, i2, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:842)");
            }
            String a = C8357u2.m29348a(C8284t2.f20507b.mo13050f(), o, 6);
            o.mo14918M(-1858703321);
            if (z) {
                C8767m.C8768a aVar3 = C8767m.f23478j;
                o.mo14918M(1157296644);
                boolean n0 = o.mo15006n0(aVar);
                Object N = o.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(aVar, (C11045c<? super NavigationDrawerKt$Scrim$dismissDrawer$1$1>) null);
                    o.mo14893C(N);
                }
                o.mo15002m0();
                C8767m c = SuspendingPointerInputFilterKt.m68437c(aVar3, aVar, (C11304p) N);
                o.mo14918M(511388516);
                boolean n02 = o.mo15006n0(a) | o.mo15006n0(aVar);
                Object N2 = o.mo14921N();
                if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                    N2 = new NavigationDrawerKt$Scrim$dismissDrawer$2$1(a, aVar);
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
                N3 = new NavigationDrawerKt$Scrim$1$1(j, aVar2);
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
            s.mo15202a(new NavigationDrawerKt$Scrim$2(z, aVar, aVar2, j, i));
        }
    }

    /* renamed from: o */
    public static final float m25948o(float f, float f2, float f3) {
        return C11479u.m44331H((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.DrawerState m25949p(@org.jetbrains.annotations.C12579k androidx.compose.material3.DrawerValue r7, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.material3.DrawerValue, java.lang.Boolean> r8, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r9, int r10, int r11) {
        /*
            java.lang.String r0 = "initialValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 2098699222(0x7d179bd6, float:1.2595161E37)
            r9.mo14918M(r0)
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0011
            androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$1 r8 = androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$1.f19512f
        L_0x0011:
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x001d
            r11 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:223)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r11, r1)
        L_0x001d:
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            androidx.compose.material3.DrawerState$Companion r10 = androidx.compose.material3.DrawerState.f19379b
            androidx.compose.runtime.saveable.e r1 = r10.mo11521a(r8)
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
            androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1 r11 = new androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1
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
            androidx.compose.material3.DrawerState r7 = (androidx.compose.material3.DrawerState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0065:
            r9.mo15002m0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m25949p(androidx.compose.material3.DrawerValue, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):androidx.compose.material3.DrawerState");
    }
}
