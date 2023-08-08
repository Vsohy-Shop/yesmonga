package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.material.IconButtonKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11363r0({"SMAP\nHeaderComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderComponent.kt\ncom/carrefour/fid/android/design/components/compose/HeaderComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,607:1\n74#2,6:608\n80#2:640\n84#2:682\n75#3:614\n76#3,11:616\n89#3:681\n76#4:615\n460#5,13:627\n36#5:643\n36#5:650\n36#5:657\n36#5:664\n36#5:671\n473#5,3:678\n154#6:641\n154#6:642\n1114#7,6:644\n1114#7,6:651\n1114#7,6:658\n1114#7,6:665\n1114#7,6:672\n*S KotlinDebug\n*F\n+ 1 HeaderComponent.kt\ncom/carrefour/fid/android/design/components/compose/HeaderComponentKt\n*L\n218#1:608,6\n218#1:640\n218#1:682\n218#1:614\n218#1:616,11\n218#1:681\n218#1:615\n218#1:627,13\n253#1:643\n254#1:650\n255#1:657\n256#1:664\n257#1:671\n218#1:678,3\n233#1:641\n246#1:642\n253#1:644,6\n254#1:651,6\n255#1:658,6\n256#1:665,6\n257#1:672,6\n*E\n"})
public final class HeaderComponentKt {

    /* renamed from: com.carrefour.fid.android.design.components.compose.HeaderComponentKt$a */
    public /* synthetic */ class C36949a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.design.components.compose.TopBarType[] r0 = com.carrefour.fid.android.design.components.compose.TopBarType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.Title     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.TitleAndSubtitle     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.Navigation     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.NavigationAction     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.NavigationSearch     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.LargeNavigationSearch     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.ActionTitle     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.HeaderComponentKt.C36949a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m151496a(@C12579k Painter painter, boolean z, long j, @C12580l String str, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        boolean z2;
        long j2;
        int i3;
        Intrinsics.checkNotNullParameter(painter, "icon");
        Intrinsics.checkNotNullParameter(aVar, "onClick");
        C8592o o = oVar.mo15009o(873389920);
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 4) != 0) {
            j2 = C37475b.f94185a.mo114218O();
            i3 = i & -897;
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(873389920, i3, -1, "com.carrefour.fid.android.design.components.compose.ActionIcon (HeaderComponent.kt:475)");
        }
        C8592o oVar2 = o;
        IconButtonKt.m13536a(aVar, (C8767m) null, z2, (C2243g) null, C8553b.m31048b(o, 1902999620, true, new HeaderComponentKt$ActionIcon$1(z2, j2, painter, str, i3)), o, ((i3 >> 12) & 14) | C12888a.f31808q | ((i3 << 3) & 896), 10);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new HeaderComponentKt$ActionIcon$2(painter, z2, j2, str, aVar, i, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0116  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151497b(@org.jetbrains.annotations.C12579k java.lang.String r38, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r39, long r40, long r42, long r44, @org.jetbrains.annotations.C12580l java.lang.String r46, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r47, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r48, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r49, int r50, int r51) {
        /*
            r11 = r38
            r10 = r47
            r8 = r50
            r6 = r51
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onNavigationClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -586109643(0xffffffffdd10ad35, float:-6.5156544E17)
            r1 = r49
            androidx.compose.runtime.o r7 = r1.mo15009o(r0)
            r1 = r6 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r8 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r8 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r7.mo15006n0(r11)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r8
            goto L_0x0032
        L_0x0031:
            r1 = r8
        L_0x0032:
            r2 = r8 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004b
            r2 = r6 & 2
            if (r2 != 0) goto L_0x0045
            r2 = r39
            boolean r3 = r7.mo15006n0(r2)
            if (r3 == 0) goto L_0x0047
            r3 = 32
            goto L_0x0049
        L_0x0045:
            r2 = r39
        L_0x0047:
            r3 = 16
        L_0x0049:
            r1 = r1 | r3
            goto L_0x004d
        L_0x004b:
            r2 = r39
        L_0x004d:
            r3 = r8 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0066
            r3 = r6 & 4
            if (r3 != 0) goto L_0x0060
            r3 = r40
            boolean r5 = r7.mo14980g(r3)
            if (r5 == 0) goto L_0x0062
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r3 = r40
        L_0x0062:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r5
            goto L_0x0068
        L_0x0066:
            r3 = r40
        L_0x0068:
            r5 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007f
            r5 = r6 & 8
            r12 = r42
            if (r5 != 0) goto L_0x007b
            boolean r5 = r7.mo14980g(r12)
            if (r5 == 0) goto L_0x007b
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r5
            goto L_0x0081
        L_0x007f:
            r12 = r42
        L_0x0081:
            r5 = 57344(0xe000, float:8.0356E-41)
            r9 = r8 & r5
            if (r9 != 0) goto L_0x009b
            r9 = r6 & 16
            r14 = r44
            if (r9 != 0) goto L_0x0097
            boolean r9 = r7.mo14980g(r14)
            if (r9 == 0) goto L_0x0097
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r9
            goto L_0x009d
        L_0x009b:
            r14 = r44
        L_0x009d:
            r9 = r6 & 32
            r22 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00a7
            r9 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r9
            goto L_0x00bb
        L_0x00a7:
            r9 = r8 & r22
            if (r9 != 0) goto L_0x00bb
            r9 = r46
            boolean r16 = r7.mo15006n0(r9)
            if (r16 == 0) goto L_0x00b6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r16
            goto L_0x00bd
        L_0x00bb:
            r9 = r46
        L_0x00bd:
            r16 = r6 & 64
            if (r16 == 0) goto L_0x00c6
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c3:
            r1 = r1 | r16
            goto L_0x00d8
        L_0x00c6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r8 & r16
            if (r16 != 0) goto L_0x00d8
            boolean r16 = r7.mo14927P(r10)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c3
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c3
        L_0x00d8:
            r5 = r6 & 128(0x80, float:1.794E-43)
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            if (r5 == 0) goto L_0x00e5
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r0 = r48
            goto L_0x00f8
        L_0x00e5:
            r16 = r8 & r24
            r0 = r48
            if (r16 != 0) goto L_0x00f8
            boolean r17 = r7.mo14927P(r0)
            if (r17 == 0) goto L_0x00f4
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r17
        L_0x00f8:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r1 & r17
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0116
            boolean r0 = r7.mo15011p()
            if (r0 != 0) goto L_0x0109
            goto L_0x0116
        L_0x0109:
            r7.mo14958a0()
            r2 = r39
            r11 = r48
            r37 = r7
            r5 = r12
            r7 = r14
            goto L_0x021e
        L_0x0116:
            r7.mo14930Q()
            r0 = r8 & 1
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0149
            boolean r0 = r7.mo14977f0()
            if (r0 == 0) goto L_0x0127
            goto L_0x0149
        L_0x0127:
            r7.mo14958a0()
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0130
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0130:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x0136
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0136:
            r0 = r6 & 8
            if (r0 == 0) goto L_0x013c
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013c:
            r0 = r6 & 16
            if (r0 == 0) goto L_0x0141
            r1 = r1 & r2
        L_0x0141:
            r29 = r39
            r36 = r48
            r0 = r1
            r30 = r3
            goto L_0x019d
        L_0x0149:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x015c
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r2 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r0 = r0.mo11077c(r7, r2)
            androidx.compose.ui.text.p0 r0 = r0.mo11096i()
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x015e
        L_0x015c:
            r0 = r39
        L_0x015e:
            r2 = r6 & 4
            if (r2 == 0) goto L_0x016b
            com.carrefour.fid.android.design.theme.b r2 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r2 = r2.mo114231a0()
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x016c
        L_0x016b:
            r2 = r3
        L_0x016c:
            r4 = r6 & 8
            if (r4 == 0) goto L_0x0178
            com.carrefour.fid.android.design.theme.b r4 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r12 = r4.mo114218O()
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0178:
            r4 = r6 & 16
            if (r4 == 0) goto L_0x0186
            com.carrefour.fid.android.design.theme.b r4 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r14 = r4.mo114205B()
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
        L_0x0186:
            if (r5 == 0) goto L_0x0196
            com.carrefour.fid.android.design.components.compose.ComposableSingletons$HeaderComponentKt r4 = com.carrefour.fid.android.design.components.compose.ComposableSingletons$HeaderComponentKt.f92189a
            kotlin.jvm.functions.q r4 = r4.mo112075g()
            r29 = r0
            r0 = r1
            r30 = r2
            r36 = r4
            goto L_0x019d
        L_0x0196:
            r36 = r48
            r29 = r0
            r0 = r1
            r30 = r2
        L_0x019d:
            r32 = r12
            r34 = r14
            r7.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01b3
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.design.components.compose.ActionTitleHeader (HeaderComponent.kt:329)"
            r3 = -586109643(0xffffffffdd10ad35, float:-6.5156544E17)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r0, r1, r2)
        L_0x01b3:
            com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.ActionTitle
            r2 = 0
            r9 = r2
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r2 = r0 & 14
            r2 = r2 | 48
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r0
            r2 = r2 | r3
            int r3 = r0 << 12
            r3 = r3 & r22
            r2 = r2 | r3
            int r3 = r0 << 3
            r3 = r3 & r24
            r2 = r2 | r3
            int r3 = r0 << 9
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r25 = r2 | r3
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            int r0 = r0 << 6
            r26 = r0 & r2
            r27 = 0
            r28 = 1572416(0x17fe40, float:2.203424E-39)
            r0 = r38
            r2 = r30
            r4 = r32
            r37 = r7
            r6 = r34
            r8 = r29
            r10 = r47
            r11 = r46
            r22 = r36
            r24 = r37
            m151499d(r0, r1, r2, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0214
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0214:
            r2 = r29
            r3 = r30
            r5 = r32
            r7 = r34
            r11 = r36
        L_0x021e:
            androidx.compose.runtime.t1 r14 = r37.mo15020s()
            if (r14 != 0) goto L_0x0225
            goto L_0x0238
        L_0x0225:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$ActionTitleHeader$1 r15 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$ActionTitleHeader$1
            r0 = r15
            r1 = r38
            r9 = r46
            r10 = r47
            r12 = r50
            r13 = r51
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13)
            r14.mo15202a(r15)
        L_0x0238:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151497b(java.lang.String, androidx.compose.ui.text.p0, long, long, long, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m151498c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(226563477);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(226563477, i, -1, "com.carrefour.fid.android.design.components.compose.ActionTitleHeaderPreview (HeaderComponent.kt:527)");
            }
            ThemeKt.m153788a(ComposableSingletons$HeaderComponentKt.f92189a.mo112082n(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new HeaderComponentKt$ActionTitleHeaderPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0627, code lost:
        if (r1 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0655, code lost:
        if (r4 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x065a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0742, code lost:
        r2 = r20;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0908, code lost:
        if (androidx.compose.runtime.ComposerKt.m29813g0() == false) goto L_0x090d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x090a, code lost:
        androidx.compose.runtime.ComposerKt.m29843v0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x090d, code lost:
        r16 = r35;
        r12 = r59;
        r1 = r2;
        r9 = r4;
        r19 = r10;
        r20 = r14;
        r14 = r18;
        r13 = r21;
        r2 = r24;
        r10 = r28;
        r22 = r30;
        r18 = r11;
        r21 = r15;
        r24 = r17;
        r17 = r23;
        r23 = r27;
        r15 = r36;
        r11 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0935  */
    /* JADX WARNING: Removed duplicated region for block: B:365:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0133  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151499d(@org.jetbrains.annotations.C12580l java.lang.String r35, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.design.components.compose.TopBarType r36, long r37, long r39, long r41, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r43, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.painter.Painter r44, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l java.lang.String r46, @org.jetbrains.annotations.C12580l java.lang.String r47, @org.jetbrains.annotations.C12580l java.lang.String r48, boolean r49, boolean r50, boolean r51, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r52, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r53, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r54, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r55, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r56, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r57, @org.jetbrains.annotations.C12580l java.lang.String r58, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r59, int r60, int r61, int r62, int r63) {
        /*
            r15 = r60
            r14 = r61
            r13 = r63
            r0 = -453768552(0xffffffffe4f40a98, float:-3.6014151E22)
            r1 = r59
            androidx.compose.runtime.o r0 = r1.mo15009o(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r4 = r15 | 6
            r5 = r4
            r4 = r35
            goto L_0x002d
        L_0x0019:
            r4 = r15 & 14
            if (r4 != 0) goto L_0x002a
            r4 = r35
            boolean r5 = r0.mo15006n0(r4)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r15
            goto L_0x002d
        L_0x002a:
            r4 = r35
            r5 = r15
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
            goto L_0x0047
        L_0x0034:
            r9 = r15 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0047
            r9 = r36
            boolean r10 = r0.mo15006n0(r9)
            if (r10 == 0) goto L_0x0043
            r10 = 32
            goto L_0x0045
        L_0x0043:
            r10 = 16
        L_0x0045:
            r5 = r5 | r10
            goto L_0x0049
        L_0x0047:
            r9 = r36
        L_0x0049:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0052
            r5 = r5 | 384(0x180, float:5.38E-43)
            r11 = r37
            goto L_0x0065
        L_0x0052:
            r10 = r15 & 896(0x380, float:1.256E-42)
            r11 = r37
            if (r10 != 0) goto L_0x0065
            boolean r16 = r0.mo14980g(r11)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r5 = r5 | r16
        L_0x0065:
            r16 = r13 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0072
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r10 = r39
            goto L_0x0084
        L_0x0072:
            r2 = r15 & 7168(0x1c00, float:1.0045E-41)
            r10 = r39
            if (r2 != 0) goto L_0x0084
            boolean r12 = r0.mo14980g(r10)
            if (r12 == 0) goto L_0x0081
            r12 = r17
            goto L_0x0083
        L_0x0081:
            r12 = r18
        L_0x0083:
            r5 = r5 | r12
        L_0x0084:
            r12 = r13 & 16
            r19 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x0090
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r7 = r41
            goto L_0x00a3
        L_0x0090:
            r12 = r15 & r19
            r7 = r41
            if (r12 != 0) goto L_0x00a3
            boolean r21 = r0.mo14980g(r7)
            if (r21 == 0) goto L_0x009f
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r5 = r5 | r21
        L_0x00a3:
            r21 = r13 & 32
            r22 = 458752(0x70000, float:6.42848E-40)
            if (r21 == 0) goto L_0x00b0
            r23 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r23
            r2 = r43
            goto L_0x00c3
        L_0x00b0:
            r23 = r15 & r22
            r2 = r43
            if (r23 != 0) goto L_0x00c3
            boolean r24 = r0.mo15006n0(r2)
            if (r24 == 0) goto L_0x00bf
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r5 = r5 | r24
        L_0x00c3:
            r12 = r13 & 64
            if (r12 == 0) goto L_0x00cb
            r25 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 | r25
        L_0x00cb:
            r3 = r13 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00d6
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r26
            r2 = r45
            goto L_0x00eb
        L_0x00d6:
            r26 = 29360128(0x1c00000, float:7.052966E-38)
            r26 = r15 & r26
            r2 = r45
            if (r26 != 0) goto L_0x00eb
            boolean r26 = r0.mo14927P(r2)
            if (r26 == 0) goto L_0x00e7
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r5 = r5 | r26
        L_0x00eb:
            r2 = r13 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x00f6
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r26
            r4 = r46
            goto L_0x010b
        L_0x00f6:
            r26 = 234881024(0xe000000, float:1.5777218E-30)
            r26 = r15 & r26
            r4 = r46
            if (r26 != 0) goto L_0x010b
            boolean r26 = r0.mo15006n0(r4)
            if (r26 == 0) goto L_0x0107
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r5 = r5 | r26
        L_0x010b:
            r4 = r13 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0116
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r5 = r5 | r26
            r7 = r47
            goto L_0x012a
        L_0x0116:
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            r26 = r15 & r26
            r7 = r47
            if (r26 != 0) goto L_0x012a
            boolean r8 = r0.mo15006n0(r7)
            if (r8 == 0) goto L_0x0127
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0129
        L_0x0127:
            r8 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0129:
            r5 = r5 | r8
        L_0x012a:
            r8 = r13 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0133
            r26 = r14 | 6
            r7 = r48
            goto L_0x0149
        L_0x0133:
            r26 = r14 & 14
            r7 = r48
            if (r26 != 0) goto L_0x0147
            boolean r26 = r0.mo15006n0(r7)
            if (r26 == 0) goto L_0x0142
            r26 = 4
            goto L_0x0144
        L_0x0142:
            r26 = 2
        L_0x0144:
            r26 = r14 | r26
            goto L_0x0149
        L_0x0147:
            r26 = r14
        L_0x0149:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0150
            r26 = r26 | 48
            goto L_0x0163
        L_0x0150:
            r27 = r14 & 112(0x70, float:1.57E-43)
            r9 = r49
            if (r27 != 0) goto L_0x0163
            boolean r27 = r0.mo14961b(r9)
            if (r27 == 0) goto L_0x015f
            r24 = 32
            goto L_0x0161
        L_0x015f:
            r24 = 16
        L_0x0161:
            r26 = r26 | r24
        L_0x0163:
            r9 = r26
            r10 = r13 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x016c
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0180
        L_0x016c:
            r11 = r14 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0180
            r11 = r50
            boolean r24 = r0.mo14961b(r11)
            if (r24 == 0) goto L_0x017b
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x017d
        L_0x017b:
            r23 = 128(0x80, float:1.794E-43)
        L_0x017d:
            r9 = r9 | r23
            goto L_0x0182
        L_0x0180:
            r11 = r50
        L_0x0182:
            r11 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x018b
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r23 = r11
            goto L_0x019f
        L_0x018b:
            r23 = r11
            r11 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x019f
            r11 = r51
            boolean r24 = r0.mo14961b(r11)
            if (r24 == 0) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            r17 = r18
        L_0x019c:
            r9 = r9 | r17
            goto L_0x01a1
        L_0x019f:
            r11 = r51
        L_0x01a1:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01a8
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01be
        L_0x01a8:
            r17 = r14 & r19
            if (r17 != 0) goto L_0x01be
            r17 = r11
            r11 = r52
            boolean r18 = r0.mo14927P(r11)
            if (r18 == 0) goto L_0x01b9
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01bb
        L_0x01b9:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x01bb:
            r9 = r9 | r18
            goto L_0x01c2
        L_0x01be:
            r17 = r11
            r11 = r52
        L_0x01c2:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01d0
            r24 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 | r24
            r11 = r53
            goto L_0x01e3
        L_0x01d0:
            r24 = r14 & r22
            r11 = r53
            if (r24 != 0) goto L_0x01e3
            boolean r24 = r0.mo14927P(r11)
            if (r24 == 0) goto L_0x01df
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e1
        L_0x01df:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x01e1:
            r9 = r9 | r24
        L_0x01e3:
            r24 = 65536(0x10000, float:9.18355E-41)
            r24 = r13 & r24
            if (r24 == 0) goto L_0x01f0
            r26 = 1572864(0x180000, float:2.204052E-39)
            r9 = r9 | r26
            r11 = r54
            goto L_0x0205
        L_0x01f0:
            r26 = 3670016(0x380000, float:5.142788E-39)
            r26 = r14 & r26
            r11 = r54
            if (r26 != 0) goto L_0x0205
            boolean r26 = r0.mo14927P(r11)
            if (r26 == 0) goto L_0x0201
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0203
        L_0x0201:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x0203:
            r9 = r9 | r26
        L_0x0205:
            r26 = 131072(0x20000, float:1.83671E-40)
            r26 = r13 & r26
            if (r26 == 0) goto L_0x0212
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r9 = r9 | r27
            r11 = r55
            goto L_0x0227
        L_0x0212:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r14 & r27
            r11 = r55
            if (r27 != 0) goto L_0x0227
            boolean r27 = r0.mo14927P(r11)
            if (r27 == 0) goto L_0x0223
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0225
        L_0x0223:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x0225:
            r9 = r9 | r27
        L_0x0227:
            r27 = 262144(0x40000, float:3.67342E-40)
            r27 = r13 & r27
            if (r27 == 0) goto L_0x0234
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r9 = r9 | r28
            r11 = r56
            goto L_0x0249
        L_0x0234:
            r28 = 234881024(0xe000000, float:1.5777218E-30)
            r28 = r14 & r28
            r11 = r56
            if (r28 != 0) goto L_0x0249
            boolean r28 = r0.mo14927P(r11)
            if (r28 == 0) goto L_0x0245
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0247
        L_0x0245:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0247:
            r9 = r9 | r28
        L_0x0249:
            r28 = 524288(0x80000, float:7.34684E-40)
            r28 = r13 & r28
            if (r28 == 0) goto L_0x0256
            r29 = 805306368(0x30000000, float:4.656613E-10)
            r9 = r9 | r29
            r11 = r57
            goto L_0x026b
        L_0x0256:
            r29 = 1879048192(0x70000000, float:1.58456325E29)
            r29 = r14 & r29
            r11 = r57
            if (r29 != 0) goto L_0x026b
            boolean r29 = r0.mo14927P(r11)
            if (r29 == 0) goto L_0x0267
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0269
        L_0x0267:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0269:
            r9 = r9 | r29
        L_0x026b:
            r29 = 1048576(0x100000, float:1.469368E-39)
            r29 = r13 & r29
            if (r29 == 0) goto L_0x0274
            r16 = r62 | 6
            goto L_0x028a
        L_0x0274:
            r30 = r62 & 14
            r11 = r58
            if (r30 != 0) goto L_0x0288
            boolean r30 = r0.mo15006n0(r11)
            if (r30 == 0) goto L_0x0283
            r16 = 4
            goto L_0x0285
        L_0x0283:
            r16 = 2
        L_0x0285:
            r16 = r62 | r16
            goto L_0x028a
        L_0x0288:
            r16 = r62
        L_0x028a:
            r11 = 64
            if (r12 != r11) goto L_0x02d5
            r11 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r11 & r5
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r13) goto L_0x02d5
            r11 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r11 & r9
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r13) goto L_0x02d5
            r11 = r16 & 11
            r13 = 2
            if (r11 != r13) goto L_0x02d5
            boolean r11 = r0.mo15011p()
            if (r11 != 0) goto L_0x02ac
            goto L_0x02d5
        L_0x02ac:
            r0.mo14958a0()
            r1 = r35
            r2 = r36
            r9 = r43
            r10 = r44
            r11 = r45
            r12 = r46
            r13 = r47
            r14 = r48
            r15 = r49
            r16 = r50
            r17 = r51
            r18 = r52
            r19 = r53
            r20 = r54
            r21 = r55
            r22 = r56
            r23 = r57
            r24 = r58
            goto L_0x092e
        L_0x02d5:
            r0.mo14930Q()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x0313
            boolean r11 = r0.mo14977f0()
            if (r11 == 0) goto L_0x02e3
            goto L_0x0313
        L_0x02e3:
            r0.mo14958a0()
            if (r12 == 0) goto L_0x02ec
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r1
        L_0x02ec:
            r1 = r35
            r6 = r36
            r2 = r43
            r12 = r44
            r3 = r45
            r4 = r46
            r8 = r48
            r36 = r49
            r35 = r50
            r23 = r51
            r11 = r52
            r13 = r53
            r14 = r54
            r15 = r55
            r10 = r56
            r27 = r57
            r17 = r58
            r7 = r5
            r5 = r47
            goto L_0x03bd
        L_0x0313:
            java.lang.String r11 = ""
            if (r1 == 0) goto L_0x0319
            r1 = r11
            goto L_0x031b
        L_0x0319:
            r1 = r35
        L_0x031b:
            if (r6 == 0) goto L_0x0320
            com.carrefour.fid.android.design.components.compose.TopBarType r6 = com.carrefour.fid.android.design.components.compose.TopBarType.Navigation
            goto L_0x0322
        L_0x0320:
            r6 = r36
        L_0x0322:
            if (r21 == 0) goto L_0x032b
            androidx.compose.ui.text.p0$a r21 = androidx.compose.p004ui.text.C16361p0.f40603d
            androidx.compose.ui.text.p0 r21 = r21.mo47519a()
            goto L_0x032d
        L_0x032b:
            r21 = r43
        L_0x032d:
            if (r12 == 0) goto L_0x033b
            int r12 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_arrow_back
            r13 = 0
            androidx.compose.ui.graphics.painter.Painter r12 = androidx.compose.p004ui.res.C16015f.m71849d(r12, r0, r13)
            r13 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r13
            goto L_0x033d
        L_0x033b:
            r12 = r44
        L_0x033d:
            r13 = 0
            if (r3 == 0) goto L_0x0342
            r3 = r13
            goto L_0x0344
        L_0x0342:
            r3 = r45
        L_0x0344:
            if (r2 == 0) goto L_0x0348
            r2 = r13
            goto L_0x034a
        L_0x0348:
            r2 = r46
        L_0x034a:
            if (r4 == 0) goto L_0x034e
            r4 = r11
            goto L_0x0350
        L_0x034e:
            r4 = r47
        L_0x0350:
            if (r8 == 0) goto L_0x0354
            r8 = r11
            goto L_0x0356
        L_0x0354:
            r8 = r48
        L_0x0356:
            if (r7 == 0) goto L_0x035a
            r7 = 1
            goto L_0x035c
        L_0x035a:
            r7 = r49
        L_0x035c:
            if (r10 == 0) goto L_0x0360
            r10 = 0
            goto L_0x0362
        L_0x0360:
            r10 = r50
        L_0x0362:
            if (r23 == 0) goto L_0x0367
            r23 = 1
            goto L_0x0369
        L_0x0367:
            r23 = r51
        L_0x0369:
            if (r17 == 0) goto L_0x036e
            r17 = r13
            goto L_0x0370
        L_0x036e:
            r17 = r52
        L_0x0370:
            if (r18 == 0) goto L_0x0375
            r18 = r13
            goto L_0x0377
        L_0x0375:
            r18 = r53
        L_0x0377:
            if (r24 == 0) goto L_0x037c
            r24 = r13
            goto L_0x037e
        L_0x037c:
            r24 = r54
        L_0x037e:
            if (r26 == 0) goto L_0x0383
            r26 = r13
            goto L_0x0385
        L_0x0383:
            r26 = r55
        L_0x0385:
            if (r27 == 0) goto L_0x0388
            goto L_0x038a
        L_0x0388:
            r13 = r56
        L_0x038a:
            if (r28 == 0) goto L_0x0393
            com.carrefour.fid.android.design.components.compose.ComposableSingletons$HeaderComponentKt r27 = com.carrefour.fid.android.design.components.compose.ComposableSingletons$HeaderComponentKt.f92189a
            kotlin.jvm.functions.q r27 = r27.mo112069a()
            goto L_0x0395
        L_0x0393:
            r27 = r57
        L_0x0395:
            r36 = r7
            r35 = r10
            r10 = r13
            if (r29 == 0) goto L_0x03ae
            r13 = r18
            r14 = r24
            r15 = r26
            r7 = r5
            r5 = r4
            r4 = r2
            r2 = r21
            r34 = r17
            r17 = r11
            r11 = r34
            goto L_0x03bd
        L_0x03ae:
            r11 = r17
            r13 = r18
            r14 = r24
            r15 = r26
            r17 = r58
            r7 = r5
            r5 = r4
            r4 = r2
            r2 = r21
        L_0x03bd:
            r0.mo14899E()
            boolean r18 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r18 == 0) goto L_0x03d3
            r18 = r8
            r8 = -453768552(0xffffffffe4f40a98, float:-3.6014151E22)
            r21 = r5
            java.lang.String r5 = "com.carrefour.fid.android.design.components.compose.DsHeader (HeaderComponent.kt:43)"
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r7, r9, r5)
            goto L_0x03d7
        L_0x03d3:
            r21 = r5
            r18 = r8
        L_0x03d7:
            int[] r5 = com.carrefour.fid.android.design.components.compose.HeaderComponentKt.C36949a.$EnumSwitchMapping$0
            int r8 = r6.ordinal()
            r5 = r5[r8]
            java.lang.String r8 = "Required value was null."
            switch(r5) {
                case 1: goto L_0x08b9;
                case 2: goto L_0x083e;
                case 3: goto L_0x07ce;
                case 4: goto L_0x0752;
                case 5: goto L_0x06c0;
                case 6: goto L_0x045b;
                case 7: goto L_0x03fc;
                default: goto L_0x03e4;
            }
        L_0x03e4:
            r59 = r4
            r24 = r6
            r30 = r10
            r28 = r12
            r10 = r13
            r4 = r2
            r2 = r1
            r1 = -1277458380(0xffffffffb3db8834, float:-1.02227574E-7)
            r0.mo14918M(r1)
            r0.mo15002m0()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            goto L_0x0904
        L_0x03fc:
            r5 = -1277458883(0xffffffffb3db863d, float:-1.02224E-7)
            r0.mo14918M(r5)
            if (r3 == 0) goto L_0x0451
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$11 r5 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$11
            r5.<init>(r1, r2, r7)
            r8 = 1175819152(0x46159390, float:9572.891)
            r24 = r6
            r6 = 1
            androidx.compose.runtime.internal.a r5 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r8, r6, r5)
            r6 = 0
            r8 = 0
            r16 = 0
            int r9 = r9 >> 18
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | 6
            int r20 = r7 << 6
            r19 = r20 & r19
            r9 = r9 | r19
            int r7 = r7 << 3
            r7 = r7 & r22
            r7 = r7 | r9
            r9 = 70
            r43 = r5
            r44 = r6
            r45 = r8
            r46 = r27
            r47 = r37
            r49 = r41
            r51 = r16
            r52 = r0
            r53 = r7
            r54 = r9
            androidx.compose.material.AppBarKt.m13208d(r43, r44, r45, r46, r47, r49, r51, r52, r53, r54)
            r0.mo15002m0()
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r59 = r4
            r30 = r10
            r28 = r12
            r10 = r13
            r4 = r2
            r2 = r1
            goto L_0x0904
        L_0x0451:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x045b:
            r24 = r6
            r5 = -1277460957(0xffffffffb3db7e23, float:-1.0220926E-7)
            r0.mo14918M(r5)
            if (r3 == 0) goto L_0x06b6
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r6 = 0
            r8 = 2
            r16 = 0
            r43 = r5
            r44 = r37
            r46 = r6
            r47 = r8
            r48 = r16
            androidx.compose.ui.m r6 = androidx.compose.foundation.BackgroundKt.m8825d(r43, r44, r46, r47, r48)
            r8 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r0.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r8 = r8.mo7631r()
            androidx.compose.ui.c$a r16 = androidx.compose.p004ui.C8734c.f23406a
            r26 = r9
            androidx.compose.ui.c$b r9 = r16.mo17072u()
            r28 = r10
            r10 = 0
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.ColumnKt.m9863b(r8, r9, r0, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r0.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r0.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            r29 = r15
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r0.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r30 = r14
            kotlin.jvm.functions.a r14 = r16.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            r31 = r13
            androidx.compose.runtime.d r13 = r0.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x04d3
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x04d3:
            r0.mo14938T()
            boolean r13 = r0.mo14997l()
            if (r13 == 0) goto L_0x04e0
            r0.mo14947W(r14)
            goto L_0x04e3
        L_0x04e0:
            r0.mo14888A()
        L_0x04e3:
            r0.mo14941U()
            androidx.compose.runtime.o r13 = androidx.compose.runtime.Updater.m30180b(r0)
            kotlin.jvm.functions.p r14 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r13, r8, r14)
            kotlin.jvm.functions.p r8 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r13, r9, r8)
            kotlin.jvm.functions.p r8 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r13, r10, r8)
            kotlin.jvm.functions.p r8 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r13, r15, r8)
            r0.mo14972e()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.C8684u1.m31906b(r0)
            androidx.compose.runtime.u1 r8 = androidx.compose.runtime.C8684u1.m31905a(r8)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r6.invoke(r8, r0, r10)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo14918M(r6)
            androidx.compose.foundation.layout.ColumnScopeInstance r6 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            float r6 = (float) r9
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$1 r8 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$1
            r8.<init>(r1, r2, r7)
            r9 = 1858914215(0x6eccc7a7, float:3.1688153E28)
            r10 = 1
            androidx.compose.runtime.internal.a r8 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r9, r10, r8)
            r9 = 0
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$2 r13 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$2
            r43 = r13
            r44 = r3
            r45 = r7
            r46 = r12
            r47 = r4
            r48 = r39
            r43.<init>(r44, r45, r46, r47, r48)
            r14 = 1028819045(0x3d528865, float:0.051399607)
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r14, r10, r13)
            r13 = 0
            int r14 = r7 << 6
            r14 = r14 & r19
            r15 = 1573254(0x180186, float:2.204598E-39)
            r14 = r14 | r15
            int r15 = r7 << 3
            r15 = r15 & r22
            r14 = r14 | r15
            r15 = 10
            r43 = r8
            r44 = r9
            r45 = r10
            r46 = r13
            r47 = r37
            r49 = r41
            r51 = r6
            r52 = r0
            r53 = r14
            r54 = r15
            androidx.compose.material.AppBarKt.m13208d(r43, r44, r45, r46, r47, r49, r51, r52, r53, r54)
            r6 = 16
            float r6 = (float) r6
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            r9 = 0
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            r10 = 8
            float r10 = (float) r10
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            r13 = 2
            r14 = 0
            r43 = r5
            r44 = r8
            r45 = r9
            r46 = r6
            r47 = r10
            r48 = r13
            r49 = r14
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r43, r44, r45, r46, r47, r48, r49)
            com.carrefour.fid.android.design.components.compose.SearchBarVariant r6 = com.carrefour.fid.android.design.components.compose.SearchBarVariant.GREY
            r8 = 1157296644(0x44faf204, float:2007.563)
            r0.mo14918M(r8)
            boolean r9 = r0.mo15006n0(r11)
            java.lang.Object r10 = r0.mo14921N()
            if (r9 != 0) goto L_0x05b4
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r10 != r9) goto L_0x05bc
        L_0x05b4:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$3$1 r10 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$3$1
            r10.<init>(r11)
            r0.mo14893C(r10)
        L_0x05bc:
            r0.mo15002m0()
            r9 = r10
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            r0.mo14918M(r8)
            r10 = r31
            boolean r13 = r0.mo15006n0(r10)
            java.lang.Object r14 = r0.mo14921N()
            if (r13 != 0) goto L_0x05d9
            androidx.compose.runtime.o$a r13 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r13 = r13.mo16277a()
            if (r14 != r13) goto L_0x05e1
        L_0x05d9:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$4$1 r14 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$4$1
            r14.<init>(r10)
            r0.mo14893C(r14)
        L_0x05e1:
            r0.mo15002m0()
            r13 = r14
            kotlin.jvm.functions.l r13 = (kotlin.jvm.functions.C11300l) r13
            r0.mo14918M(r8)
            r14 = r30
            boolean r15 = r0.mo15006n0(r14)
            java.lang.Object r8 = r0.mo14921N()
            if (r15 != 0) goto L_0x05fe
            androidx.compose.runtime.o$a r15 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r15 = r15.mo16277a()
            if (r8 != r15) goto L_0x0606
        L_0x05fe:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$5$1 r8 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$5$1
            r8.<init>(r14)
            r0.mo14893C(r8)
        L_0x0606:
            r0.mo15002m0()
            kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
            r15 = 1157296644(0x44faf204, float:2007.563)
            r0.mo14918M(r15)
            r15 = r29
            boolean r16 = r0.mo15006n0(r15)
            r20 = r1
            java.lang.Object r1 = r0.mo14921N()
            if (r16 != 0) goto L_0x062a
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            r29 = r2
            java.lang.Object r2 = r16.mo16277a()
            if (r1 != r2) goto L_0x0634
            goto L_0x062c
        L_0x062a:
            r29 = r2
        L_0x062c:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$6$1 r1 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$6$1
            r1.<init>(r15)
            r0.mo14893C(r1)
        L_0x0634:
            r0.mo15002m0()
            kotlin.jvm.functions.a r1 = (kotlin.jvm.functions.C11289a) r1
            r2 = 1157296644(0x44faf204, float:2007.563)
            r0.mo14918M(r2)
            r2 = r28
            boolean r16 = r0.mo15006n0(r2)
            r59 = r4
            java.lang.Object r4 = r0.mo14921N()
            if (r16 != 0) goto L_0x0658
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            r28 = r12
            java.lang.Object r12 = r16.mo16277a()
            if (r4 != r12) goto L_0x0662
            goto L_0x065a
        L_0x0658:
            r28 = r12
        L_0x065a:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$7$1 r4 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$10$7$1
            r4.<init>(r2)
            r0.mo14893C(r4)
        L_0x0662:
            r0.mo15002m0()
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            int r7 = r7 >> 21
            r7 = r7 & 896(0x380, float:1.256E-42)
            r7 = r7 | 54
            int r12 = r26 << 9
            r30 = r2
            r2 = r12 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r7
            r7 = r12 & r19
            r2 = r2 | r7
            r7 = r12 & r22
            r2 = r2 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r12
            r2 = r2 | r7
            r7 = 0
            r12 = 0
            r43 = r5
            r44 = r6
            r45 = r21
            r46 = r18
            r47 = r36
            r48 = r35
            r49 = r23
            r50 = r9
            r51 = r13
            r52 = r8
            r53 = r1
            r54 = r4
            r55 = r0
            r56 = r2
            r57 = r7
            r58 = r12
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt.m151597c(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            r0.mo15002m0()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            goto L_0x0742
        L_0x06b6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x06c0:
            r20 = r1
            r29 = r2
            r59 = r4
            r24 = r6
            r26 = r9
            r30 = r10
            r28 = r12
            r10 = r13
            r1 = -1277462470(0xffffffffb3db783a, float:-1.0219851E-7)
            r0.mo14918M(r1)
            if (r3 == 0) goto L_0x0748
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8 r1 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$8
            r43 = r1
            r44 = r21
            r45 = r18
            r46 = r36
            r47 = r35
            r48 = r23
            r49 = r11
            r50 = r26
            r51 = r10
            r52 = r14
            r53 = r15
            r54 = r30
            r55 = r7
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r2 = -565824046(0xffffffffde4635d2, float:-3.57063817E18)
            r4 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r2, r4, r1)
            r2 = 0
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$9 r5 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$9
            r43 = r5
            r44 = r3
            r45 = r7
            r46 = r28
            r47 = r59
            r48 = r39
            r43.<init>(r44, r45, r46, r47, r48)
            r6 = 820492688(0x30e7b990, float:1.6860202E-9)
            androidx.compose.runtime.internal.a r4 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r6, r4, r5)
            r5 = 0
            r6 = 0
            int r8 = r7 << 6
            r8 = r8 & r19
            r8 = r8 | 390(0x186, float:5.47E-43)
            int r7 = r7 << 3
            r7 = r7 & r22
            r7 = r7 | r8
            r8 = 74
            r43 = r1
            r44 = r2
            r45 = r4
            r46 = r5
            r47 = r37
            r49 = r41
            r51 = r6
            r52 = r0
            r53 = r7
            r54 = r8
            androidx.compose.material.AppBarKt.m13208d(r43, r44, r45, r46, r47, r49, r51, r52, r53, r54)
            r0.mo15002m0()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
        L_0x0742:
            r2 = r20
            r4 = r29
            goto L_0x0904
        L_0x0748:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x0752:
            r20 = r1
            r29 = r2
            r59 = r4
            r24 = r6
            r26 = r9
            r30 = r10
            r28 = r12
            r10 = r13
            r1 = -1277463434(0xffffffffb3db7476, float:-1.0219166E-7)
            r0.mo14918M(r1)
            if (r3 == 0) goto L_0x07c4
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$6 r1 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$6
            r2 = r20
            r4 = r29
            r1.<init>(r2, r4, r7)
            r5 = -1436645645(0xffffffffaa5e86f3, float:-1.9764381E-13)
            r6 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r5, r6, r1)
            r5 = 0
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$7 r8 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$7
            r43 = r8
            r44 = r3
            r45 = r7
            r46 = r28
            r47 = r59
            r48 = r39
            r43.<init>(r44, r45, r46, r47, r48)
            r9 = -50328911(0xfffffffffd000ab1, float:-1.0637294E37)
            androidx.compose.runtime.internal.a r6 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r9, r6, r8)
            r8 = 0
            int r9 = r26 >> 18
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | 390(0x186, float:5.47E-43)
            int r12 = r7 << 6
            r12 = r12 & r19
            r9 = r9 | r12
            int r7 = r7 << 3
            r7 = r7 & r22
            r7 = r7 | r9
            r9 = 66
            r43 = r1
            r44 = r5
            r45 = r6
            r46 = r27
            r47 = r37
            r49 = r41
            r51 = r8
            r52 = r0
            r53 = r7
            r54 = r9
            androidx.compose.material.AppBarKt.m13208d(r43, r44, r45, r46, r47, r49, r51, r52, r53, r54)
            r0.mo15002m0()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            goto L_0x0904
        L_0x07c4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x07ce:
            r59 = r4
            r24 = r6
            r30 = r10
            r28 = r12
            r10 = r13
            r4 = r2
            r2 = r1
            r1 = -1277464429(0xffffffffb3db7093, float:-1.0218459E-7)
            r0.mo14918M(r1)
            if (r3 == 0) goto L_0x0834
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$4 r1 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$4
            r1.<init>(r2, r4, r7)
            r5 = 1987500052(0x7676d814, float:1.25164806E33)
            r6 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r5, r6, r1)
            r5 = 0
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$5 r8 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$5
            r43 = r8
            r44 = r3
            r45 = r7
            r46 = r28
            r47 = r59
            r48 = r39
            r43.<init>(r44, r45, r46, r47, r48)
            r9 = -921150510(0xffffffffc9185bd2, float:-624061.1)
            androidx.compose.runtime.internal.a r6 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r9, r6, r8)
            r8 = 0
            r9 = 0
            int r12 = r7 << 6
            r12 = r12 & r19
            r12 = r12 | 390(0x186, float:5.47E-43)
            int r7 = r7 << 3
            r7 = r7 & r22
            r7 = r7 | r12
            r12 = 74
            r43 = r1
            r44 = r5
            r45 = r6
            r46 = r8
            r47 = r37
            r49 = r41
            r51 = r9
            r52 = r0
            r53 = r7
            r54 = r12
            androidx.compose.material.AppBarKt.m13208d(r43, r44, r45, r46, r47, r49, r51, r52, r53, r54)
            r0.mo15002m0()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            goto L_0x0904
        L_0x0834:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x083e:
            r59 = r4
            r24 = r6
            r30 = r10
            r28 = r12
            r10 = r13
            r4 = r2
            r2 = r1
            r1 = -1277466208(0xffffffffb3db69a0, float:-1.0217195E-7)
            r0.mo14918M(r1)
            if (r3 == 0) goto L_0x08af
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$2 r1 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$2
            r43 = r1
            r44 = r2
            r45 = r4
            r46 = r7
            r47 = r17
            r48 = r16
            r43.<init>(r44, r45, r46, r47, r48)
            r5 = 1116678453(0x428f2935, float:71.58048)
            r6 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r5, r6, r1)
            r5 = 0
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$3 r8 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$3
            r43 = r8
            r44 = r3
            r45 = r7
            r46 = r28
            r47 = r59
            r48 = r39
            r43.<init>(r44, r45, r46, r47, r48)
            r9 = -1791972109(0xffffffff9530acf3, float:-3.567935E-26)
            androidx.compose.runtime.internal.a r6 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r9, r6, r8)
            r8 = 0
            r9 = 0
            int r12 = r7 << 6
            r12 = r12 & r19
            r12 = r12 | 390(0x186, float:5.47E-43)
            int r7 = r7 << 3
            r7 = r7 & r22
            r7 = r7 | r12
            r12 = 74
            r43 = r1
            r44 = r5
            r45 = r6
            r46 = r8
            r47 = r37
            r49 = r41
            r51 = r9
            r52 = r0
            r53 = r7
            r54 = r12
            androidx.compose.material.AppBarKt.m13208d(r43, r44, r45, r46, r47, r49, r51, r52, r53, r54)
            r0.mo15002m0()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            goto L_0x0904
        L_0x08af:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x08b9:
            r59 = r4
            r24 = r6
            r30 = r10
            r28 = r12
            r10 = r13
            r4 = r2
            r2 = r1
            r1 = -1277466782(0xffffffffb3db6762, float:-1.02167874E-7)
            r0.mo14918M(r1)
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$1 r1 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$1
            r1.<init>(r2, r4, r7)
            r5 = 828886220(0x3167cccc, float:3.3731338E-9)
            r6 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r5, r6, r1)
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            int r12 = r7 << 6
            r12 = r12 & r19
            r12 = r12 | 6
            int r7 = r7 << 3
            r7 = r7 & r22
            r7 = r7 | r12
            r12 = 78
            r43 = r1
            r44 = r5
            r45 = r6
            r46 = r8
            r47 = r37
            r49 = r41
            r51 = r9
            r52 = r0
            r53 = r7
            r54 = r12
            androidx.compose.material.AppBarKt.m13208d(r43, r44, r45, r46, r47, r49, r51, r52, r53, r54)
            r0.mo15002m0()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
        L_0x0904:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x090d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x090d:
            r16 = r35
            r12 = r59
            r1 = r2
            r9 = r4
            r19 = r10
            r20 = r14
            r14 = r18
            r13 = r21
            r2 = r24
            r10 = r28
            r22 = r30
            r18 = r11
            r21 = r15
            r24 = r17
            r17 = r23
            r23 = r27
            r15 = r36
            r11 = r3
        L_0x092e:
            androidx.compose.runtime.t1 r7 = r0.mo15020s()
            if (r7 != 0) goto L_0x0935
            goto L_0x0954
        L_0x0935:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$12 r8 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$DsHeader$12
            r0 = r8
            r3 = r37
            r5 = r39
            r32 = r7
            r33 = r8
            r7 = r41
            r25 = r60
            r26 = r61
            r27 = r62
            r28 = r63
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = r32
            r1 = r33
            r0.mo15202a(r1)
        L_0x0954:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151499d(java.lang.String, com.carrefour.fid.android.design.components.compose.TopBarType, long, long, long, androidx.compose.ui.text.p0, androidx.compose.ui.graphics.painter.Painter, kotlin.jvm.functions.a, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.q, java.lang.String, androidx.compose.runtime.o, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012e  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151500e(@org.jetbrains.annotations.C12579k java.lang.String r50, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r51, @org.jetbrains.annotations.C12580l java.lang.String r52, @org.jetbrains.annotations.C12580l java.lang.String r53, boolean r54, boolean r55, boolean r56, long r57, long r59, long r61, @org.jetbrains.annotations.C12580l java.lang.String r63, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r64, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r65, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r66, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r67, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r68, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r69, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r70, int r71, int r72, int r73) {
        /*
            r15 = r50
            r14 = r64
            r13 = r71
            r12 = r72
            r11 = r73
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onNavigationClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -22590909(0xfffffffffea74a43, float:-1.1118333E38)
            r1 = r70
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.mo15006n0(r15)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r13
            goto L_0x0034
        L_0x0033:
            r0 = r13
        L_0x0034:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004d
            r3 = r11 & 2
            if (r3 != 0) goto L_0x0047
            r3 = r51
            boolean r6 = r10.mo15006n0(r3)
            if (r6 == 0) goto L_0x0049
            r6 = 32
            goto L_0x004b
        L_0x0047:
            r3 = r51
        L_0x0049:
            r6 = 16
        L_0x004b:
            r0 = r0 | r6
            goto L_0x004f
        L_0x004d:
            r3 = r51
        L_0x004f:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0056
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0056:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x006a
            r9 = r52
            boolean r16 = r10.mo15006n0(r9)
            if (r16 == 0) goto L_0x0065
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r0 = r0 | r16
            goto L_0x006c
        L_0x006a:
            r9 = r52
        L_0x006c:
            r16 = r11 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0077
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x008b
        L_0x0077:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x008b
            r1 = r53
            boolean r19 = r10.mo15006n0(r1)
            if (r19 == 0) goto L_0x0086
            r19 = r17
            goto L_0x0088
        L_0x0086:
            r19 = r18
        L_0x0088:
            r0 = r0 | r19
            goto L_0x008d
        L_0x008b:
            r1 = r53
        L_0x008d:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            r24 = 57344(0xe000, float:8.0356E-41)
            if (r19 == 0) goto L_0x009d
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r54
            goto L_0x00b0
        L_0x009d:
            r22 = r13 & r24
            r2 = r54
            if (r22 != 0) goto L_0x00b0
            boolean r23 = r10.mo14961b(r2)
            if (r23 == 0) goto L_0x00ac
            r23 = r20
            goto L_0x00ae
        L_0x00ac:
            r23 = r21
        L_0x00ae:
            r0 = r0 | r23
        L_0x00b0:
            r23 = r11 & 32
            r25 = 65536(0x10000, float:9.18355E-41)
            r26 = 458752(0x70000, float:6.42848E-40)
            if (r23 == 0) goto L_0x00bf
            r27 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r27
            r4 = r55
            goto L_0x00d2
        L_0x00bf:
            r27 = r13 & r26
            r4 = r55
            if (r27 != 0) goto L_0x00d2
            boolean r28 = r10.mo14961b(r4)
            if (r28 == 0) goto L_0x00ce
            r28 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d0
        L_0x00ce:
            r28 = r25
        L_0x00d0:
            r0 = r0 | r28
        L_0x00d2:
            r28 = r11 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00df
            r30 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r30
            r5 = r56
            goto L_0x00f2
        L_0x00df:
            r30 = r13 & r29
            r5 = r56
            if (r30 != 0) goto L_0x00f2
            boolean r31 = r10.mo14961b(r5)
            if (r31 == 0) goto L_0x00ee
            r31 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f0
        L_0x00ee:
            r31 = 524288(0x80000, float:7.34684E-40)
        L_0x00f0:
            r0 = r0 | r31
        L_0x00f2:
            r31 = 29360128(0x1c00000, float:7.052966E-38)
            r32 = r13 & r31
            if (r32 != 0) goto L_0x010c
            r7 = r11 & 128(0x80, float:1.794E-43)
            r8 = r57
            if (r7 != 0) goto L_0x0107
            boolean r33 = r10.mo14980g(r8)
            if (r33 == 0) goto L_0x0107
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0109
        L_0x0107:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x0109:
            r0 = r0 | r33
            goto L_0x010e
        L_0x010c:
            r8 = r57
        L_0x010e:
            r33 = 234881024(0xe000000, float:1.5777218E-30)
            r33 = r13 & r33
            if (r33 != 0) goto L_0x0127
            r7 = r11 & 256(0x100, float:3.59E-43)
            r1 = r59
            if (r7 != 0) goto L_0x0123
            boolean r7 = r10.mo14980g(r1)
            if (r7 == 0) goto L_0x0123
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0125
        L_0x0123:
            r7 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0125:
            r0 = r0 | r7
            goto L_0x0129
        L_0x0127:
            r1 = r59
        L_0x0129:
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r13
            if (r7 != 0) goto L_0x0141
            r7 = r11 & 512(0x200, float:7.175E-43)
            r1 = r61
            if (r7 != 0) goto L_0x013d
            boolean r7 = r10.mo14980g(r1)
            if (r7 == 0) goto L_0x013d
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013f
        L_0x013d:
            r7 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013f:
            r0 = r0 | r7
            goto L_0x0143
        L_0x0141:
            r1 = r61
        L_0x0143:
            r7 = r11 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x014e
            r7 = r12 | 6
            r22 = r7
            r7 = r63
            goto L_0x0166
        L_0x014e:
            r7 = r12 & 14
            if (r7 != 0) goto L_0x0162
            r7 = r63
            boolean r34 = r10.mo15006n0(r7)
            if (r34 == 0) goto L_0x015d
            r22 = 4
            goto L_0x015f
        L_0x015d:
            r22 = 2
        L_0x015f:
            r22 = r12 | r22
            goto L_0x0166
        L_0x0162:
            r7 = r63
            r22 = r12
        L_0x0166:
            r1 = r11 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x016d
            r22 = r22 | 48
            goto L_0x017e
        L_0x016d:
            r1 = r12 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x017e
            boolean r1 = r10.mo14927P(r14)
            if (r1 == 0) goto L_0x017a
            r27 = 32
            goto L_0x017c
        L_0x017a:
            r27 = 16
        L_0x017c:
            r22 = r22 | r27
        L_0x017e:
            r1 = r22
            r2 = r11 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0187
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x019b
        L_0x0187:
            r3 = r12 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x019b
            r3 = r65
            boolean r22 = r10.mo14927P(r3)
            if (r22 == 0) goto L_0x0196
            r32 = 256(0x100, float:3.59E-43)
            goto L_0x0198
        L_0x0196:
            r32 = 128(0x80, float:1.794E-43)
        L_0x0198:
            r1 = r1 | r32
            goto L_0x019d
        L_0x019b:
            r3 = r65
        L_0x019d:
            r3 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01a4
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b6
        L_0x01a4:
            r4 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x01b6
            r4 = r66
            boolean r22 = r10.mo14927P(r4)
            if (r22 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r17 = r18
        L_0x01b3:
            r1 = r1 | r17
            goto L_0x01b8
        L_0x01b6:
            r4 = r66
        L_0x01b8:
            r4 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x01c1
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r5 = r67
            goto L_0x01d2
        L_0x01c1:
            r17 = r12 & r24
            r5 = r67
            if (r17 != 0) goto L_0x01d2
            boolean r17 = r10.mo14927P(r5)
            if (r17 == 0) goto L_0x01ce
            goto L_0x01d0
        L_0x01ce:
            r20 = r21
        L_0x01d0:
            r1 = r1 | r20
        L_0x01d2:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x01e0
            r18 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r18
            r5 = r68
            goto L_0x01f3
        L_0x01e0:
            r18 = r12 & r26
            r5 = r68
            if (r18 != 0) goto L_0x01f3
            boolean r18 = r10.mo14927P(r5)
            if (r18 == 0) goto L_0x01ef
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f1
        L_0x01ef:
            r18 = r25
        L_0x01f1:
            r1 = r1 | r18
        L_0x01f3:
            r18 = r11 & r25
            if (r18 == 0) goto L_0x01fe
            r20 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r20
            r5 = r69
            goto L_0x0211
        L_0x01fe:
            r20 = r12 & r29
            r5 = r69
            if (r20 != 0) goto L_0x0211
            boolean r20 = r10.mo14927P(r5)
            if (r20 == 0) goto L_0x020d
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x020f
        L_0x020d:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x020f:
            r1 = r1 | r20
        L_0x0211:
            r20 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r5 = r0 & r20
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r7) goto L_0x024c
            r5 = 2995931(0x2db6db, float:4.198194E-39)
            r5 = r5 & r1
            r7 = 599186(0x92492, float:8.39638E-40)
            if (r5 != r7) goto L_0x024c
            boolean r5 = r10.mo15011p()
            if (r5 != 0) goto L_0x022b
            goto L_0x024c
        L_0x022b:
            r10.mo14958a0()
            r2 = r51
            r3 = r52
            r4 = r53
            r5 = r54
            r6 = r55
            r7 = r56
            r12 = r61
            r16 = r65
            r17 = r66
            r18 = r67
            r19 = r68
            r20 = r69
            r29 = r10
            r10 = r59
            goto L_0x03f7
        L_0x024c:
            r10.mo14930Q()
            r5 = r13 & 1
            if (r5 == 0) goto L_0x0299
            boolean r5 = r10.mo14977f0()
            if (r5 == 0) goto L_0x025a
            goto L_0x0299
        L_0x025a:
            r10.mo14958a0()
            r2 = r11 & 2
            if (r2 == 0) goto L_0x0263
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0263:
            r2 = r11 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x026b
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r2
        L_0x026b:
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0273
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r2
        L_0x0273:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x027b
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r0 = r0 & r2
        L_0x027b:
            r30 = r51
            r32 = r52
            r33 = r53
            r34 = r54
            r35 = r55
            r36 = r56
            r39 = r59
            r41 = r61
            r43 = r65
            r44 = r66
            r45 = r67
            r46 = r68
            r47 = r69
            r37 = r8
            goto L_0x0344
        L_0x0299:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x02ac
            androidx.compose.material.t0 r5 = androidx.compose.material.C7933t0.f19075a
            int r7 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r5 = r5.mo11077c(r10, r7)
            androidx.compose.ui.text.p0 r5 = r5.mo11096i()
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02ae
        L_0x02ac:
            r5 = r51
        L_0x02ae:
            if (r6 == 0) goto L_0x02b3
            java.lang.String r6 = ""
            goto L_0x02b5
        L_0x02b3:
            r6 = r52
        L_0x02b5:
            if (r16 == 0) goto L_0x02ba
            java.lang.String r7 = ""
            goto L_0x02bc
        L_0x02ba:
            r7 = r53
        L_0x02bc:
            r16 = 1
            if (r19 == 0) goto L_0x02c3
            r19 = r16
            goto L_0x02c5
        L_0x02c3:
            r19 = r54
        L_0x02c5:
            if (r23 == 0) goto L_0x02ca
            r20 = 0
            goto L_0x02cc
        L_0x02ca:
            r20 = r55
        L_0x02cc:
            if (r28 == 0) goto L_0x02cf
            goto L_0x02d1
        L_0x02cf:
            r16 = r56
        L_0x02d1:
            r51 = r5
            r5 = r11 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x02e1
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r8 = r5.mo114231a0()
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r5
        L_0x02e1:
            r5 = r11 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x02f0
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r21 = r5.mo114218O()
            r5 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r5
            goto L_0x02f2
        L_0x02f0:
            r21 = r59
        L_0x02f2:
            r5 = r11 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0301
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r27 = r5.mo114205B()
            r5 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r0 = r0 & r5
            goto L_0x0303
        L_0x0301:
            r27 = r61
        L_0x0303:
            r5 = 0
            if (r2 == 0) goto L_0x0308
            r2 = r5
            goto L_0x030a
        L_0x0308:
            r2 = r65
        L_0x030a:
            if (r3 == 0) goto L_0x030e
            r3 = r5
            goto L_0x0310
        L_0x030e:
            r3 = r66
        L_0x0310:
            if (r4 == 0) goto L_0x0314
            r4 = r5
            goto L_0x0316
        L_0x0314:
            r4 = r67
        L_0x0316:
            if (r17 == 0) goto L_0x031b
            r17 = r5
            goto L_0x031d
        L_0x031b:
            r17 = r68
        L_0x031d:
            r30 = r51
            if (r18 == 0) goto L_0x032a
            r43 = r2
            r44 = r3
            r45 = r4
            r47 = r5
            goto L_0x0332
        L_0x032a:
            r47 = r69
            r43 = r2
            r44 = r3
            r45 = r4
        L_0x0332:
            r32 = r6
            r33 = r7
            r37 = r8
            r36 = r16
            r46 = r17
            r34 = r19
            r35 = r20
            r39 = r21
            r41 = r27
        L_0x0344:
            r10.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0355
            r2 = -22590909(0xfffffffffea74a43, float:-1.1118333E38)
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.LargeNavigationSearchHeader (HeaderComponent.kt:415)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r0, r1, r3)
        L_0x0355:
            com.carrefour.fid.android.design.components.compose.TopBarType r2 = com.carrefour.fid.android.design.components.compose.TopBarType.LargeNavigationSearch
            r3 = r1
            r1 = r2
            r9 = 0
            r22 = 0
            r23 = 0
            r2 = r0 & 14
            r2 = r2 | 48
            int r4 = r0 >> 15
            r5 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r5
            r5 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r5
            r4 = r4 & r24
            r2 = r2 | r4
            int r4 = r0 << 12
            r4 = r4 & r26
            r2 = r2 | r4
            int r4 = r3 << 18
            r4 = r4 & r31
            r2 = r2 | r4
            int r4 = r3 << 24
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r5
            r2 = r2 | r4
            int r4 = r0 << 21
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r5
            r25 = r2 | r4
            int r0 = r0 >> 9
            r2 = r0 & 14
            r4 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            r4 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r3 << 6
            r3 = r2 & r24
            r0 = r0 | r3
            r3 = r2 & r26
            r0 = r0 | r3
            r3 = r2 & r29
            r0 = r0 | r3
            r3 = r2 & r31
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r26 = r0 | r2
            r27 = 0
            r28 = 1572928(0x180040, float:2.204142E-39)
            r0 = r50
            r2 = r37
            r4 = r39
            r6 = r41
            r8 = r30
            r29 = r10
            r10 = r64
            r11 = r63
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r43
            r18 = r44
            r19 = r45
            r20 = r46
            r21 = r47
            r24 = r29
            m151499d(r0, r1, r2, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03db
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03db:
            r2 = r30
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r10 = r39
            r12 = r41
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r20 = r47
        L_0x03f7:
            androidx.compose.runtime.t1 r15 = r29.mo15020s()
            if (r15 != 0) goto L_0x03fe
            goto L_0x041b
        L_0x03fe:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$LargeNavigationSearchHeader$1 r14 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$LargeNavigationSearchHeader$1
            r0 = r14
            r1 = r50
            r48 = r14
            r14 = r63
            r49 = r15
            r15 = r64
            r21 = r71
            r22 = r72
            r23 = r73
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r48
            r0 = r49
            r0.mo15202a(r1)
        L_0x041b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151500e(java.lang.String, androidx.compose.ui.text.p0, java.lang.String, java.lang.String, boolean, boolean, boolean, long, long, long, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151501f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(768679808);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(768679808, i, -1, "com.carrefour.fid.android.design.components.compose.LargeNavigationSearchHeaderPreview (HeaderComponent.kt:583)");
            }
            ThemeKt.m153788a(ComposableSingletons$HeaderComponentKt.f92189a.mo112073e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new HeaderComponentKt$LargeNavigationSearchHeaderPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m151502g(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1154604243);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1154604243, i, -1, "com.carrefour.fid.android.design.components.compose.LargeNavigationSearchHeaderWithTextPreview (HeaderComponent.kt:596)");
            }
            ThemeKt.m153788a(ComposableSingletons$HeaderComponentKt.f92189a.mo112074f(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new HeaderComponentKt$LargeNavigationSearchHeaderWithTextPreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0116  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151503h(@org.jetbrains.annotations.C12579k java.lang.String r38, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r39, long r40, long r42, long r44, @org.jetbrains.annotations.C12580l java.lang.String r46, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r47, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r48, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r49, int r50, int r51) {
        /*
            r11 = r38
            r10 = r47
            r8 = r50
            r6 = r51
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onNavigationClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1319782415(0xffffffffb155b7f1, float:-3.1100138E-9)
            r1 = r49
            androidx.compose.runtime.o r7 = r1.mo15009o(r0)
            r1 = r6 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r8 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r8 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r7.mo15006n0(r11)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r8
            goto L_0x0032
        L_0x0031:
            r1 = r8
        L_0x0032:
            r2 = r8 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004b
            r2 = r6 & 2
            if (r2 != 0) goto L_0x0045
            r2 = r39
            boolean r3 = r7.mo15006n0(r2)
            if (r3 == 0) goto L_0x0047
            r3 = 32
            goto L_0x0049
        L_0x0045:
            r2 = r39
        L_0x0047:
            r3 = 16
        L_0x0049:
            r1 = r1 | r3
            goto L_0x004d
        L_0x004b:
            r2 = r39
        L_0x004d:
            r3 = r8 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0066
            r3 = r6 & 4
            if (r3 != 0) goto L_0x0060
            r3 = r40
            boolean r5 = r7.mo14980g(r3)
            if (r5 == 0) goto L_0x0062
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r3 = r40
        L_0x0062:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r5
            goto L_0x0068
        L_0x0066:
            r3 = r40
        L_0x0068:
            r5 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007f
            r5 = r6 & 8
            r12 = r42
            if (r5 != 0) goto L_0x007b
            boolean r5 = r7.mo14980g(r12)
            if (r5 == 0) goto L_0x007b
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r5
            goto L_0x0081
        L_0x007f:
            r12 = r42
        L_0x0081:
            r5 = 57344(0xe000, float:8.0356E-41)
            r9 = r8 & r5
            if (r9 != 0) goto L_0x009b
            r9 = r6 & 16
            r14 = r44
            if (r9 != 0) goto L_0x0097
            boolean r9 = r7.mo14980g(r14)
            if (r9 == 0) goto L_0x0097
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r9
            goto L_0x009d
        L_0x009b:
            r14 = r44
        L_0x009d:
            r9 = r6 & 32
            r22 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00a7
            r9 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r9
            goto L_0x00bb
        L_0x00a7:
            r9 = r8 & r22
            if (r9 != 0) goto L_0x00bb
            r9 = r46
            boolean r16 = r7.mo15006n0(r9)
            if (r16 == 0) goto L_0x00b6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r16
            goto L_0x00bd
        L_0x00bb:
            r9 = r46
        L_0x00bd:
            r16 = r6 & 64
            if (r16 == 0) goto L_0x00c6
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c3:
            r1 = r1 | r16
            goto L_0x00d8
        L_0x00c6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r8 & r16
            if (r16 != 0) goto L_0x00d8
            boolean r16 = r7.mo14927P(r10)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c3
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c3
        L_0x00d8:
            r5 = r6 & 128(0x80, float:1.794E-43)
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            if (r5 == 0) goto L_0x00e5
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r0 = r48
            goto L_0x00f8
        L_0x00e5:
            r16 = r8 & r24
            r0 = r48
            if (r16 != 0) goto L_0x00f8
            boolean r17 = r7.mo14927P(r0)
            if (r17 == 0) goto L_0x00f4
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r17
        L_0x00f8:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r1 & r17
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0116
            boolean r0 = r7.mo15011p()
            if (r0 != 0) goto L_0x0109
            goto L_0x0116
        L_0x0109:
            r7.mo14958a0()
            r2 = r39
            r11 = r48
            r37 = r7
            r5 = r12
            r7 = r14
            goto L_0x021e
        L_0x0116:
            r7.mo14930Q()
            r0 = r8 & 1
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0149
            boolean r0 = r7.mo14977f0()
            if (r0 == 0) goto L_0x0127
            goto L_0x0149
        L_0x0127:
            r7.mo14958a0()
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0130
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0130:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x0136
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0136:
            r0 = r6 & 8
            if (r0 == 0) goto L_0x013c
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013c:
            r0 = r6 & 16
            if (r0 == 0) goto L_0x0141
            r1 = r1 & r2
        L_0x0141:
            r29 = r39
            r36 = r48
            r0 = r1
            r30 = r3
            goto L_0x019d
        L_0x0149:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x015c
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r2 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r0 = r0.mo11077c(r7, r2)
            androidx.compose.ui.text.p0 r0 = r0.mo11096i()
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x015e
        L_0x015c:
            r0 = r39
        L_0x015e:
            r2 = r6 & 4
            if (r2 == 0) goto L_0x016b
            com.carrefour.fid.android.design.theme.b r2 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r2 = r2.mo114231a0()
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x016c
        L_0x016b:
            r2 = r3
        L_0x016c:
            r4 = r6 & 8
            if (r4 == 0) goto L_0x0178
            com.carrefour.fid.android.design.theme.b r4 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r12 = r4.mo114218O()
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0178:
            r4 = r6 & 16
            if (r4 == 0) goto L_0x0186
            com.carrefour.fid.android.design.theme.b r4 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r14 = r4.mo114205B()
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
        L_0x0186:
            if (r5 == 0) goto L_0x0196
            com.carrefour.fid.android.design.components.compose.ComposableSingletons$HeaderComponentKt r4 = com.carrefour.fid.android.design.components.compose.ComposableSingletons$HeaderComponentKt.f92189a
            kotlin.jvm.functions.q r4 = r4.mo112076h()
            r29 = r0
            r0 = r1
            r30 = r2
            r36 = r4
            goto L_0x019d
        L_0x0196:
            r36 = r48
            r29 = r0
            r0 = r1
            r30 = r2
        L_0x019d:
            r32 = r12
            r34 = r14
            r7.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01b3
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.design.components.compose.NavigationActionHeader (HeaderComponent.kt:353)"
            r3 = -1319782415(0xffffffffb155b7f1, float:-3.1100138E-9)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r0, r1, r2)
        L_0x01b3:
            com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.NavigationAction
            r2 = 0
            r9 = r2
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r2 = r0 & 14
            r2 = r2 | 48
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r0
            r2 = r2 | r3
            int r3 = r0 << 12
            r3 = r3 & r22
            r2 = r2 | r3
            int r3 = r0 << 3
            r3 = r3 & r24
            r2 = r2 | r3
            int r3 = r0 << 9
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r25 = r2 | r3
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            int r0 = r0 << 6
            r26 = r0 & r2
            r27 = 0
            r28 = 1572416(0x17fe40, float:2.203424E-39)
            r0 = r38
            r2 = r30
            r4 = r32
            r37 = r7
            r6 = r34
            r8 = r29
            r10 = r47
            r11 = r46
            r22 = r36
            r24 = r37
            m151499d(r0, r1, r2, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0214
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0214:
            r2 = r29
            r3 = r30
            r5 = r32
            r7 = r34
            r11 = r36
        L_0x021e:
            androidx.compose.runtime.t1 r14 = r37.mo15020s()
            if (r14 != 0) goto L_0x0225
            goto L_0x0238
        L_0x0225:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$NavigationActionHeader$1 r15 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$NavigationActionHeader$1
            r0 = r15
            r1 = r38
            r9 = r46
            r10 = r47
            r12 = r50
            r13 = r51
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13)
            r14.mo15202a(r15)
        L_0x0238:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151503h(java.lang.String, androidx.compose.ui.text.p0, long, long, long, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m151504i(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1389413713);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1389413713, i, -1, "com.carrefour.fid.android.design.components.compose.NavigationActionHeaderPreview (HeaderComponent.kt:509)");
            }
            ThemeKt.m153788a(ComposableSingletons$HeaderComponentKt.f92189a.mo112080l(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new HeaderComponentKt$NavigationActionHeaderPreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0101  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151505j(@org.jetbrains.annotations.C12579k java.lang.String r38, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r39, long r40, long r42, long r44, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.painter.Painter r46, @org.jetbrains.annotations.C12580l java.lang.String r47, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r48, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r49, int r50, int r51) {
        /*
            r11 = r38
            r10 = r48
            r9 = r50
            r8 = r51
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onNavigationClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -62671501(0xfffffffffc43b573, float:-4.0647125E36)
            r1 = r49
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r8 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r9 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r6.mo15006n0(r11)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r9
            goto L_0x0032
        L_0x0031:
            r1 = r9
        L_0x0032:
            r2 = r9 & 112(0x70, float:1.57E-43)
            r3 = 32
            if (r2 != 0) goto L_0x004c
            r2 = r8 & 2
            if (r2 != 0) goto L_0x0046
            r2 = r39
            boolean r4 = r6.mo15006n0(r2)
            if (r4 == 0) goto L_0x0048
            r4 = r3
            goto L_0x004a
        L_0x0046:
            r2 = r39
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
            goto L_0x004e
        L_0x004c:
            r2 = r39
        L_0x004e:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0067
            r4 = r8 & 4
            if (r4 != 0) goto L_0x0061
            r4 = r40
            boolean r7 = r6.mo14980g(r4)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r4 = r40
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r7
            goto L_0x0069
        L_0x0067:
            r4 = r40
        L_0x0069:
            r7 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0080
            r7 = r8 & 8
            r12 = r42
            if (r7 != 0) goto L_0x007c
            boolean r7 = r6.mo14980g(r12)
            if (r7 == 0) goto L_0x007c
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r7
            goto L_0x0082
        L_0x0080:
            r12 = r42
        L_0x0082:
            r7 = 57344(0xe000, float:8.0356E-41)
            r14 = r9 & r7
            if (r14 != 0) goto L_0x009f
            r14 = r8 & 16
            if (r14 != 0) goto L_0x0098
            r14 = r44
            boolean r16 = r6.mo14980g(r14)
            if (r16 == 0) goto L_0x009a
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x0098:
            r14 = r44
        L_0x009a:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r16
            goto L_0x00a1
        L_0x009f:
            r14 = r44
        L_0x00a1:
            r7 = r8 & 32
            if (r7 == 0) goto L_0x00a9
            r16 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r16
        L_0x00a9:
            r16 = r8 & 64
            if (r16 == 0) goto L_0x00b4
            r16 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r16
            r15 = r47
            goto L_0x00c8
        L_0x00b4:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r9 & r16
            r15 = r47
            if (r16 != 0) goto L_0x00c8
            boolean r14 = r6.mo15006n0(r15)
            if (r14 == 0) goto L_0x00c5
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c7
        L_0x00c5:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00c7:
            r1 = r1 | r14
        L_0x00c8:
            r14 = r8 & 128(0x80, float:1.794E-43)
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            if (r14 == 0) goto L_0x00d2
            r14 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00d0:
            r1 = r1 | r14
            goto L_0x00e2
        L_0x00d2:
            r14 = r9 & r24
            if (r14 != 0) goto L_0x00e2
            boolean r14 = r6.mo14927P(r10)
            if (r14 == 0) goto L_0x00df
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00d0
        L_0x00df:
            r14 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00d0
        L_0x00e2:
            if (r7 != r3) goto L_0x0101
            r3 = 23967451(0x16db6db, float:4.3661218E-38)
            r3 = r3 & r1
            r14 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r14) goto L_0x0101
            boolean r3 = r6.mo15011p()
            if (r3 != 0) goto L_0x00f4
            goto L_0x0101
        L_0x00f4:
            r6.mo14958a0()
            r7 = r44
            r9 = r46
            r3 = r4
            r37 = r6
            r5 = r12
            goto L_0x020d
        L_0x0101:
            r6.mo14930Q()
            r3 = r9 & 1
            r14 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x013e
            boolean r3 = r6.mo14977f0()
            if (r3 == 0) goto L_0x0115
            goto L_0x013e
        L_0x0115:
            r6.mo14958a0()
            r3 = r8 & 2
            if (r3 == 0) goto L_0x011e
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x011e:
            r3 = r8 & 4
            if (r3 == 0) goto L_0x0124
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0124:
            r3 = r8 & 8
            if (r3 == 0) goto L_0x012a
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x012a:
            r3 = r8 & 16
            if (r3 == 0) goto L_0x0130
            r1 = r1 & r16
        L_0x0130:
            if (r7 == 0) goto L_0x0133
            r1 = r1 & r14
        L_0x0133:
            r34 = r44
            r36 = r46
            r29 = r2
            r30 = r4
            r32 = r12
            goto L_0x0194
        L_0x013e:
            r3 = r8 & 2
            if (r3 == 0) goto L_0x0150
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            int r3 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r2 = r2.mo11077c(r6, r3)
            androidx.compose.ui.text.p0 r2 = r2.mo11096i()
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0150:
            r3 = r8 & 4
            if (r3 == 0) goto L_0x015d
            com.carrefour.fid.android.design.theme.b r3 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r3 = r3.mo114231a0()
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x015e
        L_0x015d:
            r3 = r4
        L_0x015e:
            r5 = r8 & 8
            if (r5 == 0) goto L_0x016a
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r12 = r5.mo114218O()
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x016a:
            r5 = r8 & 16
            if (r5 == 0) goto L_0x0177
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r17 = r5.mo114205B()
            r1 = r1 & r16
            goto L_0x0179
        L_0x0177:
            r17 = r44
        L_0x0179:
            if (r7 == 0) goto L_0x018a
            int r5 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_arrow_back
            r7 = 0
            androidx.compose.ui.graphics.painter.Painter r5 = androidx.compose.p004ui.res.C16015f.m71849d(r5, r6, r7)
            r1 = r1 & r14
            r29 = r2
            r30 = r3
            r36 = r5
            goto L_0x0190
        L_0x018a:
            r36 = r46
            r29 = r2
            r30 = r3
        L_0x0190:
            r32 = r12
            r34 = r17
        L_0x0194:
            r2 = r1
            r6.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01a4
            r1 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.NavigationHeader (HeaderComponent.kt:305)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r1, r3)
        L_0x01a4:
            com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.Navigation
            r12 = 0
            r13 = 0
            r14 = 0
            r0 = 0
            r15 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r0 = 2097200(0x200030, float:2.938803E-39)
            r3 = r2 & 14
            r0 = r0 | r3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r0 = r0 | r3
            int r3 = r2 << 12
            r4 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r4
            r0 = r0 | r3
            r3 = r2 & r24
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            int r2 = r2 << 6
            r2 = r2 & r3
            r25 = r0 | r2
            r26 = 0
            r27 = 0
            r28 = 2096640(0x1ffe00, float:2.938018E-39)
            r0 = r38
            r2 = r30
            r4 = r32
            r37 = r6
            r6 = r34
            r8 = r29
            r9 = r36
            r10 = r48
            r11 = r47
            r24 = r37
            m151499d(r0, r1, r2, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0203
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0203:
            r2 = r29
            r3 = r30
            r5 = r32
            r7 = r34
            r9 = r36
        L_0x020d:
            androidx.compose.runtime.t1 r14 = r37.mo15020s()
            if (r14 != 0) goto L_0x0214
            goto L_0x0227
        L_0x0214:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$NavigationHeader$1 r15 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$NavigationHeader$1
            r0 = r15
            r1 = r38
            r10 = r47
            r11 = r48
            r12 = r50
            r13 = r51
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13)
            r14.mo15202a(r15)
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151505j(java.lang.String, androidx.compose.ui.text.p0, long, long, long, androidx.compose.ui.graphics.painter.Painter, java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    public static final void m151506k(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(292447719);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(292447719, i, -1, "com.carrefour.fid.android.design.components.compose.NavigationHeaderPreview (HeaderComponent.kt:501)");
            }
            ThemeKt.m153788a(ComposableSingletons$HeaderComponentKt.f92189a.mo112078j(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new HeaderComponentKt$NavigationHeaderPreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010f  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151507l(@org.jetbrains.annotations.C12579k java.lang.String r37, @org.jetbrains.annotations.C12579k java.lang.String r38, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r39, long r40, long r42, long r44, @org.jetbrains.annotations.C12580l java.lang.String r46, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r47, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r48, int r49, int r50) {
        /*
            r11 = r37
            r10 = r38
            r8 = r47
            r6 = r49
            r7 = r50
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "subtitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onNavigationClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = -253097739(0xfffffffff0ea08f5, float:-5.7944257E29)
            r1 = r48
            androidx.compose.runtime.o r4 = r1.mo15009o(r0)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r6 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r6 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r4.mo15006n0(r11)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r6
            goto L_0x0039
        L_0x0038:
            r1 = r6
        L_0x0039:
            r2 = r7 & 2
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r2 = r6 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0050
            boolean r2 = r4.mo15006n0(r10)
            if (r2 == 0) goto L_0x004d
            r2 = 32
            goto L_0x004f
        L_0x004d:
            r2 = 16
        L_0x004f:
            r1 = r1 | r2
        L_0x0050:
            r2 = r6 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0069
            r2 = r7 & 4
            if (r2 != 0) goto L_0x0063
            r2 = r39
            boolean r3 = r4.mo15006n0(r2)
            if (r3 == 0) goto L_0x0065
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0063:
            r2 = r39
        L_0x0065:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r1 = r1 | r3
            goto L_0x006b
        L_0x0069:
            r2 = r39
        L_0x006b:
            r3 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0082
            r3 = r7 & 8
            r12 = r40
            if (r3 != 0) goto L_0x007e
            boolean r3 = r4.mo14980g(r12)
            if (r3 == 0) goto L_0x007e
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r3
            goto L_0x0084
        L_0x0082:
            r12 = r40
        L_0x0084:
            r3 = 57344(0xe000, float:8.0356E-41)
            r5 = r6 & r3
            if (r5 != 0) goto L_0x009e
            r5 = r7 & 16
            r14 = r42
            if (r5 != 0) goto L_0x009a
            boolean r5 = r4.mo14980g(r14)
            if (r5 == 0) goto L_0x009a
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r5
            goto L_0x00a0
        L_0x009e:
            r14 = r42
        L_0x00a0:
            r5 = 458752(0x70000, float:6.42848E-40)
            r9 = r6 & r5
            if (r9 != 0) goto L_0x00b9
            r9 = r7 & 32
            r5 = r44
            if (r9 != 0) goto L_0x00b5
            boolean r9 = r4.mo14980g(r5)
            if (r9 == 0) goto L_0x00b5
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r1 = r1 | r9
            goto L_0x00bb
        L_0x00b9:
            r5 = r44
        L_0x00bb:
            r9 = r7 & 64
            if (r9 == 0) goto L_0x00c5
            r9 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r9
            r6 = r46
            goto L_0x00d9
        L_0x00c5:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r5 = r49 & r9
            r6 = r46
            if (r5 != 0) goto L_0x00d9
            boolean r5 = r4.mo15006n0(r6)
            if (r5 == 0) goto L_0x00d6
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r5 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r1 = r1 | r5
        L_0x00d9:
            r5 = r7 & 128(0x80, float:1.794E-43)
            r23 = 29360128(0x1c00000, float:7.052966E-38)
            if (r5 == 0) goto L_0x00e3
            r5 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e1:
            r1 = r1 | r5
            goto L_0x00f3
        L_0x00e3:
            r5 = r49 & r23
            if (r5 != 0) goto L_0x00f3
            boolean r5 = r4.mo14927P(r8)
            if (r5 == 0) goto L_0x00f0
            r5 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e1
        L_0x00f0:
            r5 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e1
        L_0x00f3:
            r5 = 23967451(0x16db6db, float:4.3661218E-38)
            r5 = r5 & r1
            r9 = 4793490(0x492492, float:6.71711E-39)
            if (r5 != r9) goto L_0x010f
            boolean r5 = r4.mo15011p()
            if (r5 != 0) goto L_0x0103
            goto L_0x010f
        L_0x0103:
            r4.mo14958a0()
            r8 = r44
            r3 = r2
            r36 = r4
            r4 = r12
            r6 = r14
            goto L_0x01f7
        L_0x010f:
            r4.mo14930Q()
            r5 = r49 & 1
            r9 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L_0x013e
            boolean r5 = r4.mo14977f0()
            if (r5 == 0) goto L_0x0123
            goto L_0x013e
        L_0x0123:
            r4.mo14958a0()
            r5 = r7 & 4
            if (r5 == 0) goto L_0x012c
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x012c:
            r5 = r7 & 8
            if (r5 == 0) goto L_0x0132
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0132:
            r5 = r7 & 16
            if (r5 == 0) goto L_0x0138
            r1 = r1 & r16
        L_0x0138:
            r5 = r7 & 32
            if (r5 == 0) goto L_0x017c
            r1 = r1 & r9
            goto L_0x017c
        L_0x013e:
            r5 = r7 & 4
            if (r5 == 0) goto L_0x0150
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            int r5 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r2 = r2.mo11077c(r4, r5)
            androidx.compose.ui.text.p0 r2 = r2.mo11096i()
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0150:
            r5 = r7 & 8
            if (r5 == 0) goto L_0x015c
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r12 = r5.mo114231a0()
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x015c:
            r5 = r7 & 16
            if (r5 == 0) goto L_0x0168
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r14 = r5.mo114218O()
            r1 = r1 & r16
        L_0x0168:
            r5 = r7 & 32
            if (r5 == 0) goto L_0x017c
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r16 = r5.mo114205B()
            r1 = r1 & r9
            r29 = r2
            r30 = r12
            r32 = r14
            r34 = r16
            goto L_0x0184
        L_0x017c:
            r34 = r44
            r29 = r2
            r30 = r12
            r32 = r14
        L_0x0184:
            r2 = r1
            r4.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0194
            r1 = -1
            java.lang.String r5 = "com.carrefour.fid.android.design.components.compose.NavigationHeaderSubtitle (HeaderComponent.kt:281)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r1, r5)
        L_0x0194:
            com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.TitleAndSubtitle
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r0 = r2 & 14
            r0 = r0 | 48
            int r5 = r2 >> 3
            r9 = r5 & 896(0x380, float:1.256E-42)
            r0 = r0 | r9
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r9
            r3 = r3 & r5
            r0 = r0 | r3
            int r3 = r2 << 9
            r9 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r9
            r0 = r0 | r3
            r3 = r2 & r23
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            int r2 = r2 << 6
            r2 = r2 & r3
            r25 = r0 | r2
            r26 = 0
            r27 = r5 & 14
            r28 = 1048128(0xffe40, float:1.46874E-39)
            r0 = r37
            r2 = r30
            r36 = r4
            r4 = r32
            r6 = r34
            r8 = r29
            r10 = r47
            r11 = r46
            r23 = r38
            r24 = r36
            r9 = 0
            m151499d(r0, r1, r2, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ef
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ef:
            r3 = r29
            r4 = r30
            r6 = r32
            r8 = r34
        L_0x01f7:
            androidx.compose.runtime.t1 r14 = r36.mo15020s()
            if (r14 != 0) goto L_0x01fe
            goto L_0x0213
        L_0x01fe:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$NavigationHeaderSubtitle$1 r15 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$NavigationHeaderSubtitle$1
            r0 = r15
            r1 = r37
            r2 = r38
            r10 = r46
            r11 = r47
            r12 = r49
            r13 = r50
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r11, r12, r13)
            r14.mo15202a(r15)
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151507l(java.lang.String, java.lang.String, androidx.compose.ui.text.p0, long, long, long, java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012e  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151508m(@org.jetbrains.annotations.C12580l java.lang.String r48, @org.jetbrains.annotations.C12580l java.lang.String r49, boolean r50, boolean r51, boolean r52, long r53, long r55, long r57, @org.jetbrains.annotations.C12580l java.lang.String r59, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r60, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r61, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r62, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r63, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r64, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r65, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r66, int r67, int r68, int r69) {
        /*
            r15 = r60
            r14 = r67
            r13 = r68
            r12 = r69
            java.lang.String r0 = "onNavigationClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 1991924259(0x76ba5a23, float:1.8898348E33)
            r1 = r66
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0020
            r3 = r14 | 6
            r4 = r3
            r3 = r48
            goto L_0x0034
        L_0x0020:
            r3 = r14 & 14
            if (r3 != 0) goto L_0x0031
            r3 = r48
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x002e
            r4 = 4
            goto L_0x002f
        L_0x002e:
            r4 = 2
        L_0x002f:
            r4 = r4 | r14
            goto L_0x0034
        L_0x0031:
            r3 = r48
            r4 = r14
        L_0x0034:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x003b
            r4 = r4 | 48
            goto L_0x004e
        L_0x003b:
            r8 = r14 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r49
            boolean r9 = r11.mo15006n0(r8)
            if (r9 == 0) goto L_0x004a
            r9 = 32
            goto L_0x004c
        L_0x004a:
            r9 = 16
        L_0x004c:
            r4 = r4 | r9
            goto L_0x0050
        L_0x004e:
            r8 = r49
        L_0x0050:
            r9 = r12 & 4
            r16 = 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0059
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x0059:
            r1 = r14 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x006d
            r1 = r50
            boolean r17 = r11.mo14961b(r1)
            if (r17 == 0) goto L_0x0068
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r17 = r16
        L_0x006a:
            r4 = r4 | r17
            goto L_0x006f
        L_0x006d:
            r1 = r50
        L_0x006f:
            r17 = r12 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x007a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007a:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x008e
            r2 = r51
            boolean r21 = r11.mo14961b(r2)
            if (r21 == 0) goto L_0x0089
            r21 = r18
            goto L_0x008b
        L_0x0089:
            r21 = r19
        L_0x008b:
            r4 = r4 | r21
            goto L_0x0090
        L_0x008e:
            r2 = r51
        L_0x0090:
            r21 = r12 & 16
            r22 = 16384(0x4000, float:2.2959E-41)
            r23 = 8192(0x2000, float:1.14794E-41)
            r24 = 57344(0xe000, float:8.0356E-41)
            if (r21 == 0) goto L_0x00a0
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r6 = r52
            goto L_0x00b3
        L_0x00a0:
            r25 = r14 & r24
            r6 = r52
            if (r25 != 0) goto L_0x00b3
            boolean r26 = r11.mo14961b(r6)
            if (r26 == 0) goto L_0x00af
            r26 = r22
            goto L_0x00b1
        L_0x00af:
            r26 = r23
        L_0x00b1:
            r4 = r4 | r26
        L_0x00b3:
            r26 = 458752(0x70000, float:6.42848E-40)
            r26 = r14 & r26
            if (r26 != 0) goto L_0x00cd
            r26 = r12 & 32
            r7 = r53
            if (r26 != 0) goto L_0x00c8
            boolean r27 = r11.mo14980g(r7)
            if (r27 == 0) goto L_0x00c8
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r4 = r4 | r27
            goto L_0x00cf
        L_0x00cd:
            r7 = r53
        L_0x00cf:
            r27 = 3670016(0x380000, float:5.142788E-39)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x00e9
            r27 = r12 & 64
            r1 = r55
            if (r27 != 0) goto L_0x00e4
            boolean r27 = r11.mo14980g(r1)
            if (r27 == 0) goto L_0x00e4
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r4 = r4 | r27
            goto L_0x00eb
        L_0x00e9:
            r1 = r55
        L_0x00eb:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r28 = r14 & r27
            if (r28 != 0) goto L_0x0104
            r10 = r12 & 128(0x80, float:1.794E-43)
            r1 = r57
            if (r10 != 0) goto L_0x0100
            boolean r10 = r11.mo14980g(r1)
            if (r10 == 0) goto L_0x0100
            r10 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r10 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r4 = r4 | r10
            goto L_0x0106
        L_0x0104:
            r1 = r57
        L_0x0106:
            r10 = r12 & 256(0x100, float:3.59E-43)
            r29 = 234881024(0xe000000, float:1.5777218E-30)
            if (r10 == 0) goto L_0x0110
            r10 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r10
            goto L_0x0124
        L_0x0110:
            r10 = r14 & r29
            if (r10 != 0) goto L_0x0124
            r10 = r59
            boolean r30 = r11.mo15006n0(r10)
            if (r30 == 0) goto L_0x011f
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0121
        L_0x011f:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0121:
            r4 = r4 | r30
            goto L_0x0126
        L_0x0124:
            r10 = r59
        L_0x0126:
            r1 = r12 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x012e
            r1 = 805306368(0x30000000, float:4.656613E-10)
        L_0x012c:
            r4 = r4 | r1
            goto L_0x013f
        L_0x012e:
            r1 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r14
            if (r1 != 0) goto L_0x013f
            boolean r1 = r11.mo14927P(r15)
            if (r1 == 0) goto L_0x013c
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012c
        L_0x013c:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012c
        L_0x013f:
            r1 = r12 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x014a
            r2 = r13 | 6
            r20 = r2
            r2 = r61
            goto L_0x0162
        L_0x014a:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x015e
            r2 = r61
            boolean r30 = r11.mo14927P(r2)
            if (r30 == 0) goto L_0x0159
            r20 = 4
            goto L_0x015b
        L_0x0159:
            r20 = 2
        L_0x015b:
            r20 = r13 | r20
            goto L_0x0162
        L_0x015e:
            r2 = r61
            r20 = r13
        L_0x0162:
            r2 = r12 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0169
            r20 = r20 | 48
            goto L_0x017c
        L_0x0169:
            r30 = r13 & 112(0x70, float:1.57E-43)
            r3 = r62
            if (r30 != 0) goto L_0x017c
            boolean r30 = r11.mo14927P(r3)
            if (r30 == 0) goto L_0x0178
            r26 = 32
            goto L_0x017a
        L_0x0178:
            r26 = 16
        L_0x017a:
            r20 = r20 | r26
        L_0x017c:
            r3 = r20
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0185
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0199
        L_0x0185:
            r7 = r13 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0199
            r7 = r63
            boolean r8 = r11.mo14927P(r7)
            if (r8 == 0) goto L_0x0194
            r28 = 256(0x100, float:3.59E-43)
            goto L_0x0196
        L_0x0194:
            r28 = r16
        L_0x0196:
            r3 = r3 | r28
            goto L_0x019b
        L_0x0199:
            r7 = r63
        L_0x019b:
            r8 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01a2
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b4
        L_0x01a2:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x01b4
            r7 = r64
            boolean r16 = r11.mo14927P(r7)
            if (r16 == 0) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            r18 = r19
        L_0x01b1:
            r3 = r3 | r18
            goto L_0x01b6
        L_0x01b4:
            r7 = r64
        L_0x01b6:
            r7 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x01bf
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r10 = r65
            goto L_0x01d0
        L_0x01bf:
            r16 = r13 & r24
            r10 = r65
            if (r16 != 0) goto L_0x01d0
            boolean r16 = r11.mo14927P(r10)
            if (r16 == 0) goto L_0x01cc
            goto L_0x01ce
        L_0x01cc:
            r22 = r23
        L_0x01ce:
            r3 = r3 | r22
        L_0x01d0:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r4 & r16
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x020a
            r10 = 46811(0xb6db, float:6.5596E-41)
            r10 = r10 & r3
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r10 != r13) goto L_0x020a
            boolean r10 = r11.mo15011p()
            if (r10 != 0) goto L_0x01e9
            goto L_0x020a
        L_0x01e9:
            r11.mo14958a0()
            r1 = r48
            r2 = r49
            r3 = r50
            r4 = r51
            r5 = r52
            r6 = r53
            r8 = r55
            r14 = r61
            r15 = r62
            r16 = r63
            r17 = r64
            r18 = r65
            r29 = r11
            r10 = r57
            goto L_0x0382
        L_0x020a:
            r11.mo14930Q()
            r10 = r14 & 1
            if (r10 == 0) goto L_0x024f
            boolean r10 = r11.mo14977f0()
            if (r10 == 0) goto L_0x0218
            goto L_0x024f
        L_0x0218:
            r11.mo14958a0()
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0223
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r0
        L_0x0223:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x022b
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r0
        L_0x022b:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0233
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r0
        L_0x0233:
            r30 = r48
            r31 = r49
            r32 = r50
            r33 = r51
            r34 = r52
            r35 = r53
            r37 = r55
            r39 = r57
            r41 = r61
            r42 = r62
            r43 = r63
            r44 = r64
            r45 = r65
            goto L_0x02df
        L_0x024f:
            if (r0 == 0) goto L_0x0254
            java.lang.String r0 = ""
            goto L_0x0256
        L_0x0254:
            r0 = r48
        L_0x0256:
            if (r5 == 0) goto L_0x025b
            java.lang.String r5 = ""
            goto L_0x025d
        L_0x025b:
            r5 = r49
        L_0x025d:
            r10 = 1
            if (r9 == 0) goto L_0x0262
            r9 = r10
            goto L_0x0264
        L_0x0262:
            r9 = r50
        L_0x0264:
            if (r17 == 0) goto L_0x0268
            r13 = 0
            goto L_0x026a
        L_0x0268:
            r13 = r51
        L_0x026a:
            if (r21 == 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r10 = r52
        L_0x026f:
            r16 = r12 & 32
            if (r16 == 0) goto L_0x027f
            com.carrefour.fid.android.design.theme.b r16 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r16 = r16.mo114231a0()
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r18
            goto L_0x0281
        L_0x027f:
            r16 = r53
        L_0x0281:
            r18 = r12 & 64
            if (r18 == 0) goto L_0x0291
            com.carrefour.fid.android.design.theme.b r18 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r18 = r18.mo114218O()
            r20 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r20
            goto L_0x0293
        L_0x0291:
            r18 = r55
        L_0x0293:
            r48 = r0
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02a5
            com.carrefour.fid.android.design.theme.b r0 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r20 = r0.mo114205B()
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r4
            r4 = r0
            goto L_0x02a7
        L_0x02a5:
            r20 = r57
        L_0x02a7:
            r0 = 0
            if (r1 == 0) goto L_0x02ac
            r1 = r0
            goto L_0x02ae
        L_0x02ac:
            r1 = r61
        L_0x02ae:
            if (r2 == 0) goto L_0x02b2
            r2 = r0
            goto L_0x02b4
        L_0x02b2:
            r2 = r62
        L_0x02b4:
            if (r6 == 0) goto L_0x02b8
            r6 = r0
            goto L_0x02ba
        L_0x02b8:
            r6 = r63
        L_0x02ba:
            if (r8 == 0) goto L_0x02be
            r8 = r0
            goto L_0x02c0
        L_0x02be:
            r8 = r64
        L_0x02c0:
            r30 = r48
            if (r7 == 0) goto L_0x02c7
            r45 = r0
            goto L_0x02c9
        L_0x02c7:
            r45 = r65
        L_0x02c9:
            r41 = r1
            r42 = r2
            r31 = r5
            r43 = r6
            r44 = r8
            r32 = r9
            r34 = r10
            r33 = r13
            r35 = r16
            r37 = r18
            r39 = r20
        L_0x02df:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02f0
            r0 = 1991924259(0x76ba5a23, float:1.8898348E33)
            java.lang.String r1 = "com.carrefour.fid.android.design.components.compose.NavigationSearchHeader (HeaderComponent.kt:377)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r3, r1)
        L_0x02f0:
            com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.NavigationSearch
            r0 = 0
            r8 = 0
            r9 = 0
            r22 = 0
            r23 = 0
            int r2 = r4 >> 9
            r5 = r2 & 896(0x380, float:1.256E-42)
            r5 = r5 | 48
            r6 = r2 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r6
            r2 = r2 & r24
            r2 = r2 | r5
            int r5 = r4 >> 6
            r5 = r5 & r27
            r2 = r2 | r5
            r5 = r4 & r29
            r2 = r2 | r5
            int r5 = r4 << 27
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r6
            r25 = r2 | r5
            int r2 = r4 >> 3
            r4 = r2 & 14
            r5 = r2 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            r5 = r2 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r3 = r3 << 12
            r4 = r3 & r24
            r2 = r2 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = r3 & r27
            r2 = r2 | r4
            r3 = r3 & r29
            r26 = r2 | r3
            r27 = 0
            r28 = 1572961(0x180061, float:2.204188E-39)
            r2 = r35
            r4 = r37
            r6 = r39
            r10 = r60
            r29 = r11
            r11 = r59
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r16 = r34
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            r21 = r45
            r24 = r29
            m151499d(r0, r1, r2, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0368
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0368:
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r8 = r37
            r10 = r39
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r18 = r45
        L_0x0382:
            androidx.compose.runtime.t1 r13 = r29.mo15020s()
            if (r13 != 0) goto L_0x0389
            goto L_0x03a4
        L_0x0389:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$NavigationSearchHeader$1 r12 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$NavigationSearchHeader$1
            r0 = r12
            r46 = r12
            r12 = r59
            r47 = r13
            r13 = r60
            r19 = r67
            r20 = r68
            r21 = r69
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r46
            r0 = r47
            r0.mo15202a(r1)
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151508m(java.lang.String, java.lang.String, boolean, boolean, boolean, long, long, long, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: n */
    public static final void m151509n(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1879713951);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1879713951, i, -1, "com.carrefour.fid.android.design.components.compose.NavigationSearchHeaderPreview (HeaderComponent.kt:547)");
            }
            ThemeKt.m153788a(ComposableSingletons$HeaderComponentKt.f92189a.mo112070b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new HeaderComponentKt$NavigationSearchHeaderPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: o */
    public static final void m151510o(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(278371660);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(278371660, i, -1, "com.carrefour.fid.android.design.components.compose.NavigationSearchHeaderWithTextPreview (HeaderComponent.kt:571)");
            }
            ThemeKt.m153788a(ComposableSingletons$HeaderComponentKt.f92189a.mo112072d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new HeaderComponentKt$NavigationSearchHeaderWithTextPreview$1(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00d6, code lost:
        if ((r47 & 16) != 0) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0171  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151511p(@org.jetbrains.annotations.C12579k java.lang.String r37, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r38, long r39, long r41, long r43, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r45, int r46, int r47) {
        /*
            r8 = r37
            r6 = r46
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1377065783(0x52145b37, float:1.59296373E11)
            r1 = r45
            androidx.compose.runtime.o r7 = r1.mo15009o(r0)
            r1 = r47 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r6 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r6 & 14
            if (r1 != 0) goto L_0x0028
            boolean r1 = r7.mo15006n0(r8)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r6
            goto L_0x0029
        L_0x0028:
            r1 = r6
        L_0x0029:
            r2 = r6 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0042
            r2 = r47 & 2
            if (r2 != 0) goto L_0x003c
            r2 = r38
            boolean r3 = r7.mo15006n0(r2)
            if (r3 == 0) goto L_0x003e
            r3 = 32
            goto L_0x0040
        L_0x003c:
            r2 = r38
        L_0x003e:
            r3 = 16
        L_0x0040:
            r1 = r1 | r3
            goto L_0x0044
        L_0x0042:
            r2 = r38
        L_0x0044:
            r3 = r6 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005d
            r3 = r47 & 4
            if (r3 != 0) goto L_0x0057
            r3 = r39
            boolean r5 = r7.mo14980g(r3)
            if (r5 == 0) goto L_0x0059
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r3 = r39
        L_0x0059:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r5
            goto L_0x005f
        L_0x005d:
            r3 = r39
        L_0x005f:
            r5 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0076
            r5 = r47 & 8
            r9 = r41
            if (r5 != 0) goto L_0x0072
            boolean r5 = r7.mo14980g(r9)
            if (r5 == 0) goto L_0x0072
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r5
            goto L_0x0078
        L_0x0076:
            r9 = r41
        L_0x0078:
            r5 = 57344(0xe000, float:8.0356E-41)
            r11 = r6 & r5
            if (r11 != 0) goto L_0x0094
            r11 = r47 & 16
            if (r11 != 0) goto L_0x008e
            r11 = r43
            boolean r13 = r7.mo14980g(r11)
            if (r13 == 0) goto L_0x0090
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x008e:
            r11 = r43
        L_0x0090:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r13
            goto L_0x0096
        L_0x0094:
            r11 = r43
        L_0x0096:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r1
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00ae
            boolean r13 = r7.mo15011p()
            if (r13 != 0) goto L_0x00a5
            goto L_0x00ae
        L_0x00a5:
            r7.mo14958a0()
            r36 = r7
            r5 = r9
            r7 = r11
            goto L_0x017c
        L_0x00ae:
            r7.mo14930Q()
            r13 = r6 & 1
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            if (r13 == 0) goto L_0x00d9
            boolean r13 = r7.mo14977f0()
            if (r13 == 0) goto L_0x00bf
            goto L_0x00d9
        L_0x00bf:
            r7.mo14958a0()
            r13 = r47 & 2
            if (r13 == 0) goto L_0x00c8
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c8:
            r13 = r47 & 4
            if (r13 == 0) goto L_0x00ce
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ce:
            r13 = r47 & 8
            if (r13 == 0) goto L_0x00d4
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00d4:
            r13 = r47 & 16
            if (r13 == 0) goto L_0x010e
            goto L_0x010d
        L_0x00d9:
            r13 = r47 & 2
            if (r13 == 0) goto L_0x00eb
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            int r13 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r2 = r2.mo11077c(r7, r13)
            androidx.compose.ui.text.p0 r2 = r2.mo11096i()
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00eb:
            r13 = r47 & 4
            if (r13 == 0) goto L_0x00f7
            com.carrefour.fid.android.design.theme.b r3 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r3 = r3.mo114231a0()
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f7:
            r13 = r47 & 8
            if (r13 == 0) goto L_0x0103
            com.carrefour.fid.android.design.theme.b r9 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r9 = r9.mo114218O()
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0103:
            r13 = r47 & 16
            if (r13 == 0) goto L_0x010e
            com.carrefour.fid.android.design.theme.b r11 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r11 = r11.mo114205B()
        L_0x010d:
            r1 = r1 & r14
        L_0x010e:
            r29 = r2
            r30 = r3
            r32 = r9
            r34 = r11
            r2 = r1
            r7.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0126
            r1 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.TitleHeader (HeaderComponent.kt:457)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r1, r3)
        L_0x0126:
            com.carrefour.fid.android.design.components.compose.TopBarType r1 = com.carrefour.fid.android.design.components.compose.TopBarType.Title
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r0 = r2 & 14
            r0 = r0 | 48
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = r2 & r5
            r0 = r0 | r3
            int r2 = r2 << 12
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            r25 = r0 | r2
            r26 = 0
            r27 = 0
            r28 = 2097088(0x1fffc0, float:2.938646E-39)
            r0 = r37
            r2 = r30
            r4 = r32
            r36 = r7
            r6 = r34
            r8 = r29
            r24 = r36
            m151499d(r0, r1, r2, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0174
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0174:
            r2 = r29
            r3 = r30
            r5 = r32
            r7 = r34
        L_0x017c:
            androidx.compose.runtime.t1 r11 = r36.mo15020s()
            if (r11 != 0) goto L_0x0183
            goto L_0x0192
        L_0x0183:
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt$TitleHeader$1 r12 = new com.carrefour.fid.android.design.components.compose.HeaderComponentKt$TitleHeader$1
            r0 = r12
            r1 = r37
            r9 = r46
            r10 = r47
            r0.<init>(r1, r2, r3, r5, r7, r9, r10)
            r11.mo15202a(r12)
        L_0x0192:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151511p(java.lang.String, androidx.compose.ui.text.p0, long, long, long, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: q */
    public static final void m151512q(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1497500607);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1497500607, i, -1, "com.carrefour.fid.android.design.components.compose.TitleHeaderPreview (HeaderComponent.kt:493)");
            }
            ThemeKt.m153788a(ComposableSingletons$HeaderComponentKt.f92189a.mo112077i(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new HeaderComponentKt$TitleHeaderPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: r */
    public static final void m151513r(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1744651641);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1744651641, i, -1, "com.carrefour.fid.android.design.components.compose.TitleSubtitleHeaderPreview (HeaderComponent.kt:559)");
            }
            ThemeKt.m153788a(ComposableSingletons$HeaderComponentKt.f92189a.mo112071c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new HeaderComponentKt$TitleSubtitleHeaderPreview$1(i));
        }
    }
}
