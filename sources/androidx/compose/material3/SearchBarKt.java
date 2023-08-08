package androidx.compose.material3;

import androidx.compose.animation.C2025e;
import androidx.compose.animation.C2028g;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2009t;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.material3.tokens.C8305g0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8578k2;
import com.urbanairship.push.notifications.C9527p;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,746:1\n25#2:747\n25#2:756\n50#2:763\n49#2:764\n25#2:771\n36#2:778\n50#2:785\n49#2:786\n50#2:793\n49#2:794\n36#2:801\n25#2:808\n36#2:816\n25#2:823\n25#2:830\n36#2:840\n83#2,3:847\n50#2:857\n49#2:858\n1114#3,6:748\n1114#3,6:757\n1114#3,6:765\n1114#3,6:772\n1114#3,6:779\n1114#3,6:787\n1114#3,6:795\n1114#3,6:802\n1114#3,6:809\n1114#3,6:817\n1114#3,6:824\n1114#3,6:831\n1114#3,6:841\n1114#3,6:850\n1114#3,6:859\n76#4:754\n76#4:755\n76#4:815\n76#4:837\n76#4:856\n658#5:838\n646#5:839\n76#6:865\n75#7:866\n154#8:867\n154#8:868\n154#8:869\n154#8:870\n154#8:871\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt\n*L\n175#1:747\n188#1:756\n191#1:763\n191#1:764\n211#1:771\n212#1:778\n226#1:785\n226#1:786\n230#1:793\n230#1:794\n292#1:801\n357#1:808\n416#1:816\n435#1:823\n437#1:830\n451#1:840\n452#1:847,3\n467#1:857\n467#1:858\n175#1:748,6\n188#1:757,6\n191#1:765,6\n211#1:772,6\n212#1:779,6\n226#1:787,6\n230#1:795,6\n292#1:802,6\n357#1:809,6\n416#1:817,6\n435#1:824,6\n437#1:831,6\n451#1:841,6\n452#1:850,6\n467#1:859,6\n183#1:754\n184#1:755\n360#1:815\n440#1:837\n464#1:856\n440#1:838\n440#1:839\n188#1:865\n707#1:866\n708#1:867\n710#1:868\n711#1:869\n712#1:870\n714#1:871\n*E\n"})
public final class SearchBarKt {

    /* renamed from: a */
    public static final float f19612a = C16483g.m74435M(C8211h2.f20155a.mo12632e() / ((float) 2));

    /* renamed from: b */
    public static final float f19613b = C16483g.m74435M((float) C9527p.f26031b);

    /* renamed from: c */
    public static final float f19614c = 0.6666667f;

    /* renamed from: d */
    public static final float f19615d = C16483g.m74435M((float) 360);

    /* renamed from: e */
    public static final float f19616e = C16483g.m74435M((float) 720);

    /* renamed from: f */
    public static final float f19617f = C16483g.m74435M((float) 8);

    /* renamed from: g */
    public static final float f19618g = C16483g.m74435M((float) 4);

    /* renamed from: h */
    public static final int f19619h = 600;

    /* renamed from: i */
    public static final int f19620i = 350;

    /* renamed from: j */
    public static final int f19621j = 100;
    @C12579k

    /* renamed from: k */
    public static final C2009t f19622k;
    @C12579k

    /* renamed from: l */
    public static final C2009t f19623l;
    @C12579k

    /* renamed from: m */
    public static final C1956d0<Float> f19624m;
    @C12579k

    /* renamed from: n */
    public static final C1956d0<Float> f19625n;
    @C12579k

    /* renamed from: o */
    public static final C1956d0<C16500q> f19626o;
    @C12579k

    /* renamed from: p */
    public static final C1956d0<C16500q> f19627p;
    @C12579k

    /* renamed from: q */
    public static final C2025e f19628q;
    @C12579k

    /* renamed from: r */
    public static final C2028g f19629r;

    static {
        C2009t c = C8305g0.f21174a.mo13594c();
        f19622k = c;
        C2009t tVar = new C2009t(0.0f, 1.0f, 0.0f, 1.0f);
        f19623l = tVar;
        C2023z0 p = C1972h.m8391p(600, 100, c);
        f19624m = p;
        C2023z0 p2 = C1972h.m8391p(350, 100, tVar);
        f19625n = p2;
        C2023z0 p3 = C1972h.m8391p(600, 100, c);
        f19626o = p3;
        C2023z0 p4 = C1972h.m8391p(350, 100, tVar);
        f19627p = p4;
        f19628q = EnterExitTransitionKt.m7842v(p, 0.0f, 2, (Object) null).mo7023c(EnterExitTransitionKt.m7840t(p3, (C8734c.C8737c) null, false, (C11300l) null, 14, (Object) null));
        f19629r = EnterExitTransitionKt.m7844x(p2, 0.0f, 2, (Object) null).mo7029c(EnterExitTransitionKt.m7805I(p4, (C8734c.C8737c) null, false, (C11300l) null, 14, (Object) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26089a(@org.jetbrains.annotations.C12579k java.lang.String r40, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r41, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r42, boolean r43, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r45, boolean r46, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r47, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r48, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r49, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r50, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8205g2 r51, float r52, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r53, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r54, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r55, int r56, int r57, int r58) {
        /*
            r15 = r40
            r14 = r41
            r13 = r42
            r12 = r43
            r11 = r44
            r10 = r54
            r9 = r56
            r8 = r57
            r7 = r58
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onQueryChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onSearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onActiveChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -451213062(0xffffffffe51b08fa, float:-4.5758275E22)
            r1 = r55
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x003b
            r1 = r9 | 6
            goto L_0x004b
        L_0x003b:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x004a
            boolean r1 = r6.mo15006n0(r15)
            if (r1 == 0) goto L_0x0047
            r1 = 4
            goto L_0x0048
        L_0x0047:
            r1 = 2
        L_0x0048:
            r1 = r1 | r9
            goto L_0x004b
        L_0x004a:
            r1 = r9
        L_0x004b:
            r4 = r7 & 2
            r16 = 16
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 48
            goto L_0x0064
        L_0x0054:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0064
            boolean r4 = r6.mo14927P(r14)
            if (r4 == 0) goto L_0x0061
            r4 = 32
            goto L_0x0063
        L_0x0061:
            r4 = r16
        L_0x0063:
            r1 = r1 | r4
        L_0x0064:
            r4 = r7 & 4
            r17 = 256(0x100, float:3.59E-43)
            r18 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x006f
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x007f
        L_0x006f:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x007f
            boolean r4 = r6.mo14927P(r13)
            if (r4 == 0) goto L_0x007c
            r4 = r17
            goto L_0x007e
        L_0x007c:
            r4 = r18
        L_0x007e:
            r1 = r1 | r4
        L_0x007f:
            r4 = r7 & 8
            r19 = 2048(0x800, float:2.87E-42)
            r20 = 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x008a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x009a
        L_0x008a:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x009a
            boolean r4 = r6.mo14961b(r12)
            if (r4 == 0) goto L_0x0097
            r4 = r19
            goto L_0x0099
        L_0x0097:
            r4 = r20
        L_0x0099:
            r1 = r1 | r4
        L_0x009a:
            r4 = r7 & 16
            r21 = 16384(0x4000, float:2.2959E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            if (r4 == 0) goto L_0x00a8
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b8
        L_0x00a8:
            r4 = r9 & r25
            if (r4 != 0) goto L_0x00b8
            boolean r4 = r6.mo14927P(r11)
            if (r4 == 0) goto L_0x00b5
            r4 = r21
            goto L_0x00b7
        L_0x00b5:
            r4 = r22
        L_0x00b7:
            r1 = r1 | r4
        L_0x00b8:
            r4 = r7 & 32
            if (r4 == 0) goto L_0x00c3
            r23 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r23
            r2 = r45
            goto L_0x00d8
        L_0x00c3:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r9 & r23
            r2 = r45
            if (r23 != 0) goto L_0x00d8
            boolean r23 = r6.mo15006n0(r2)
            if (r23 == 0) goto L_0x00d4
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d6
        L_0x00d4:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00d6:
            r1 = r1 | r23
        L_0x00d8:
            r23 = r7 & 64
            if (r23 == 0) goto L_0x00e3
            r24 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r24
            r3 = r46
            goto L_0x00f8
        L_0x00e3:
            r24 = 3670016(0x380000, float:5.142788E-39)
            r24 = r9 & r24
            r3 = r46
            if (r24 != 0) goto L_0x00f8
            boolean r26 = r6.mo14961b(r3)
            if (r26 == 0) goto L_0x00f4
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f6
        L_0x00f4:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00f6:
            r1 = r1 | r26
        L_0x00f8:
            r5 = r7 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0103
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r27
            r0 = r47
            goto L_0x0118
        L_0x0103:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r9 & r27
            r0 = r47
            if (r27 != 0) goto L_0x0118
            boolean r28 = r6.mo14927P(r0)
            if (r28 == 0) goto L_0x0114
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0116
        L_0x0114:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x0116:
            r1 = r1 | r28
        L_0x0118:
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0123
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r28
            r2 = r48
            goto L_0x0138
        L_0x0123:
            r28 = 234881024(0xe000000, float:1.5777218E-30)
            r28 = r9 & r28
            r2 = r48
            if (r28 != 0) goto L_0x0138
            boolean r28 = r6.mo14927P(r2)
            if (r28 == 0) goto L_0x0134
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0136
        L_0x0134:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0136:
            r1 = r1 | r28
        L_0x0138:
            r2 = r7 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0143
            r28 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r28
            r3 = r49
            goto L_0x0158
        L_0x0143:
            r28 = 1879048192(0x70000000, float:1.58456325E29)
            r28 = r9 & r28
            r3 = r49
            if (r28 != 0) goto L_0x0158
            boolean r28 = r6.mo14927P(r3)
            if (r28 == 0) goto L_0x0154
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0156
        L_0x0154:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0156:
            r1 = r1 | r28
        L_0x0158:
            r28 = r8 & 14
            if (r28 != 0) goto L_0x0172
            r3 = r7 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x016b
            r3 = r50
            boolean r28 = r6.mo15006n0(r3)
            if (r28 == 0) goto L_0x016d
            r24 = 4
            goto L_0x016f
        L_0x016b:
            r3 = r50
        L_0x016d:
            r24 = 2
        L_0x016f:
            r24 = r8 | r24
            goto L_0x0176
        L_0x0172:
            r3 = r50
            r24 = r8
        L_0x0176:
            r28 = r8 & 112(0x70, float:1.57E-43)
            if (r28 != 0) goto L_0x018e
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x0189
            r3 = r51
            boolean r28 = r6.mo15006n0(r3)
            if (r28 == 0) goto L_0x018b
            r16 = 32
            goto L_0x018b
        L_0x0189:
            r3 = r51
        L_0x018b:
            r24 = r24 | r16
            goto L_0x0190
        L_0x018e:
            r3 = r51
        L_0x0190:
            r3 = r24
            r11 = r7 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x0199
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x01ab
        L_0x0199:
            r12 = r8 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x01ab
            r12 = r52
            boolean r16 = r6.mo14968d(r12)
            if (r16 == 0) goto L_0x01a6
            goto L_0x01a8
        L_0x01a6:
            r17 = r18
        L_0x01a8:
            r3 = r3 | r17
            goto L_0x01ad
        L_0x01ab:
            r12 = r52
        L_0x01ad:
            r12 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01b4
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c6
        L_0x01b4:
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01c6
            r13 = r53
            boolean r16 = r6.mo15006n0(r13)
            if (r16 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r19 = r20
        L_0x01c3:
            r3 = r3 | r19
            goto L_0x01c8
        L_0x01c6:
            r13 = r53
        L_0x01c8:
            r13 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01cf
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01de
        L_0x01cf:
            r13 = r8 & r25
            if (r13 != 0) goto L_0x01de
            boolean r13 = r6.mo14927P(r10)
            if (r13 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r21 = r22
        L_0x01dc:
            r3 = r3 | r21
        L_0x01de:
            r13 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r13 = r13 & r1
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r8) goto L_0x0212
            r8 = 46811(0xb6db, float:6.5596E-41)
            r8 = r8 & r3
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r13) goto L_0x0212
            boolean r8 = r6.mo15011p()
            if (r8 != 0) goto L_0x01f6
            goto L_0x0212
        L_0x01f6:
            r6.mo14958a0()
            r4 = r43
            r5 = r44
            r7 = r46
            r8 = r47
            r9 = r48
            r10 = r49
            r11 = r50
            r12 = r51
            r13 = r52
            r14 = r53
            r15 = r6
            r6 = r45
            goto L_0x03cc
        L_0x0212:
            r6.mo14930Q()
            r8 = r9 & 1
            if (r8 == 0) goto L_0x0244
            boolean r8 = r6.mo14977f0()
            if (r8 == 0) goto L_0x0220
            goto L_0x0244
        L_0x0220:
            r6.mo14958a0()
            r0 = r7 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0229
            r3 = r3 & -15
        L_0x0229:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x022f
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x022f:
            r15 = r45
            r16 = r46
            r17 = r47
            r18 = r48
            r19 = r49
            r20 = r50
            r21 = r51
            r22 = r52
            r23 = r53
            r13 = r3
            goto L_0x02dd
        L_0x0244:
            if (r4 == 0) goto L_0x0249
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x024b
        L_0x0249:
            r4 = r45
        L_0x024b:
            if (r23 == 0) goto L_0x024f
            r8 = 1
            goto L_0x0251
        L_0x024f:
            r8 = r46
        L_0x0251:
            if (r5 == 0) goto L_0x0255
            r5 = 0
            goto L_0x0257
        L_0x0255:
            r5 = r47
        L_0x0257:
            if (r0 == 0) goto L_0x025b
            r0 = 0
            goto L_0x025d
        L_0x025b:
            r0 = r48
        L_0x025d:
            if (r2 == 0) goto L_0x0261
            r2 = 0
            goto L_0x0263
        L_0x0261:
            r2 = r49
        L_0x0263:
            r13 = r7 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0271
            androidx.compose.material3.h2 r13 = androidx.compose.material3.C8211h2.f20155a
            r15 = 6
            androidx.compose.ui.graphics.g4 r13 = r13.mo12629b(r6, r15)
            r3 = r3 & -15
            goto L_0x0274
        L_0x0271:
            r15 = 6
            r13 = r50
        L_0x0274:
            r15 = r7 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x028d
            androidx.compose.material3.h2 r16 = androidx.compose.material3.C8211h2.f20155a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 3072(0xc00, float:4.305E-42)
            r24 = 7
            r22 = r6
            androidx.compose.material3.g2 r15 = r16.mo12628a(r17, r19, r21, r22, r23, r24)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x028f
        L_0x028d:
            r15 = r51
        L_0x028f:
            if (r11 == 0) goto L_0x0298
            androidx.compose.material3.h2 r11 = androidx.compose.material3.C8211h2.f20155a
            float r11 = r11.mo12630c()
            goto L_0x029a
        L_0x0298:
            r11 = r52
        L_0x029a:
            if (r12 == 0) goto L_0x02c9
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r12)
            java.lang.Object r12 = r6.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            r45 = r0
            java.lang.Object r0 = r16.mo16277a()
            if (r12 != r0) goto L_0x02b7
            androidx.compose.foundation.interaction.g r12 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r6.mo14893C(r12)
        L_0x02b7:
            r6.mo15002m0()
            androidx.compose.foundation.interaction.g r12 = (androidx.compose.foundation.interaction.C2243g) r12
            r18 = r45
            r19 = r2
            r17 = r5
            r16 = r8
            r22 = r11
            r23 = r12
            goto L_0x02d7
        L_0x02c9:
            r45 = r0
            r18 = r45
            r23 = r53
            r19 = r2
            r17 = r5
            r16 = r8
            r22 = r11
        L_0x02d7:
            r20 = r13
            r21 = r15
            r13 = r3
            r15 = r4
        L_0x02dd:
            r6.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02ee
            java.lang.String r0 = "androidx.compose.material3.DockedSearchBar (SearchBar.kt:342)"
            r2 = -451213062(0xffffffffe51b08fa, float:-4.5758275E22)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r13, r0)
        L_0x02ee:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71012j()
            java.lang.Object r0 = r6.mo15032w(r0)
            r12 = r0
            androidx.compose.ui.focus.j r12 = (androidx.compose.p004ui.focus.C15068j) r12
            long r29 = r21.mo12612a()
            long r2 = r21.mo12612a()
            r0 = 0
            long r31 = androidx.compose.material3.ColorSchemeKt.m25516c(r2, r6, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ZIndexModifierKt.m32294a(r15, r0)
            float r2 = f19615d
            androidx.compose.ui.m r24 = androidx.compose.foundation.layout.SizeKt.m10092H(r0, r2)
            r27 = 0
            r33 = 0
            androidx.compose.material3.SearchBarKt$DockedSearchBar$2 r11 = new androidx.compose.material3.SearchBarKt$DockedSearchBar$2
            r0 = r11
            r34 = r1
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r8 = r6
            r6 = r16
            r7 = r17
            r45 = r15
            r15 = r8
            r8 = r18
            r9 = r19
            r10 = r21
            r35 = r11
            r11 = r23
            r36 = r12
            r12 = r34
            r26 = r13
            r37 = 6
            r14 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1764436203(0xffffffff96d4d715, float:-3.4386183E-25)
            r1 = r35
            r2 = 1
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r0, r2, r1)
            int r0 = r26 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r1
            int r1 = r26 << 6
            r1 = r1 & r25
            r12 = r0 | r1
            r13 = 96
            r1 = r24
            r2 = r20
            r3 = r29
            r5 = r31
            r7 = r22
            r8 = r27
            r9 = r33
            r11 = r15
            androidx.compose.material3.SurfaceKt.m26352a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r43)
            androidx.compose.material3.SearchBarKt$DockedSearchBar$3 r1 = new androidx.compose.material3.SearchBarKt$DockedSearchBar$3
            r4 = r43
            r2 = r36
            r3 = 0
            r1.<init>(r4, r2, r3)
            int r2 = r34 >> 9
            r2 = r2 & 14
            r3 = r2 | 64
            androidx.compose.runtime.EffectsKt.m29896h(r0, r1, r15, r3)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r0)
            r5 = r44
            boolean r0 = r15.mo15006n0(r5)
            java.lang.Object r1 = r15.mo14921N()
            if (r0 != 0) goto L_0x03a0
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x03a8
        L_0x03a0:
            androidx.compose.material3.SearchBarKt$DockedSearchBar$4$1 r1 = new androidx.compose.material3.SearchBarKt$DockedSearchBar$4$1
            r1.<init>(r5)
            r15.mo14893C(r1)
        L_0x03a8:
            r15.mo15002m0()
            kotlin.jvm.functions.a r1 = (kotlin.jvm.functions.C11289a) r1
            r0 = 0
            androidx.activity.compose.BackHandlerKt.m1279a(r4, r1, r15, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03ba
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03ba:
            r6 = r45
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
        L_0x03cc:
            androidx.compose.runtime.t1 r15 = r15.mo15020s()
            if (r15 != 0) goto L_0x03d3
            goto L_0x03f6
        L_0x03d3:
            androidx.compose.material3.SearchBarKt$DockedSearchBar$5 r3 = new androidx.compose.material3.SearchBarKt$DockedSearchBar$5
            r0 = r3
            r1 = r40
            r2 = r41
            r38 = r3
            r3 = r42
            r4 = r43
            r5 = r44
            r39 = r15
            r15 = r54
            r16 = r56
            r17 = r57
            r18 = r58
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r38
            r0 = r39
            r0.mo15202a(r1)
        L_0x03f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m26089a(java.lang.String, kotlin.jvm.functions.l, kotlin.jvm.functions.l, boolean, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.ui.graphics.g4, androidx.compose.material3.g2, float, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01bb, code lost:
        if (r6.mo15006n0(r59) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26090b(@org.jetbrains.annotations.C12579k java.lang.String r46, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r47, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r48, boolean r49, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r50, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r51, boolean r52, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r53, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r54, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r55, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r56, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8205g2 r57, float r58, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r59, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r60, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r61, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r62, int r63, int r64, int r65) {
        /*
            r15 = r46
            r14 = r47
            r13 = r48
            r12 = r49
            r11 = r50
            r10 = r61
            r9 = r63
            r8 = r64
            r7 = r65
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onQueryChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onSearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onActiveChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 156000634(0x94c617a, float:2.460144E-33)
            r1 = r62
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x003b
            r1 = r9 | 6
            goto L_0x004b
        L_0x003b:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x004a
            boolean r1 = r6.mo15006n0(r15)
            if (r1 == 0) goto L_0x0047
            r1 = 4
            goto L_0x0048
        L_0x0047:
            r1 = 2
        L_0x0048:
            r1 = r1 | r9
            goto L_0x004b
        L_0x004a:
            r1 = r9
        L_0x004b:
            r4 = r7 & 2
            r16 = 16
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 48
            goto L_0x0064
        L_0x0054:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0064
            boolean r4 = r6.mo14927P(r14)
            if (r4 == 0) goto L_0x0061
            r4 = 32
            goto L_0x0063
        L_0x0061:
            r4 = r16
        L_0x0063:
            r1 = r1 | r4
        L_0x0064:
            r4 = r7 & 4
            r17 = 256(0x100, float:3.59E-43)
            r18 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x006f
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x007f
        L_0x006f:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x007f
            boolean r4 = r6.mo14927P(r13)
            if (r4 == 0) goto L_0x007c
            r4 = r17
            goto L_0x007e
        L_0x007c:
            r4 = r18
        L_0x007e:
            r1 = r1 | r4
        L_0x007f:
            r4 = r7 & 8
            r19 = 2048(0x800, float:2.87E-42)
            r20 = 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x008a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x009a
        L_0x008a:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x009a
            boolean r4 = r6.mo14961b(r12)
            if (r4 == 0) goto L_0x0097
            r4 = r19
            goto L_0x0099
        L_0x0097:
            r4 = r20
        L_0x0099:
            r1 = r1 | r4
        L_0x009a:
            r4 = r7 & 16
            r21 = 16384(0x4000, float:2.2959E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x00a8
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b8
        L_0x00a8:
            r4 = r9 & r25
            if (r4 != 0) goto L_0x00b8
            boolean r4 = r6.mo14927P(r11)
            if (r4 == 0) goto L_0x00b5
            r4 = r21
            goto L_0x00b7
        L_0x00b5:
            r4 = r22
        L_0x00b7:
            r1 = r1 | r4
        L_0x00b8:
            r4 = r7 & 32
            if (r4 == 0) goto L_0x00c3
            r23 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r23
            r2 = r51
            goto L_0x00d8
        L_0x00c3:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r9 & r23
            r2 = r51
            if (r23 != 0) goto L_0x00d8
            boolean r23 = r6.mo15006n0(r2)
            if (r23 == 0) goto L_0x00d4
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d6
        L_0x00d4:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00d6:
            r1 = r1 | r23
        L_0x00d8:
            r23 = r7 & 64
            if (r23 == 0) goto L_0x00e3
            r24 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r24
            r3 = r52
            goto L_0x00f8
        L_0x00e3:
            r24 = 3670016(0x380000, float:5.142788E-39)
            r24 = r9 & r24
            r3 = r52
            if (r24 != 0) goto L_0x00f8
            boolean r26 = r6.mo14961b(r3)
            if (r26 == 0) goto L_0x00f4
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f6
        L_0x00f4:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00f6:
            r1 = r1 | r26
        L_0x00f8:
            r5 = r7 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0103
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r27
            r0 = r53
            goto L_0x0118
        L_0x0103:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r9 & r27
            r0 = r53
            if (r27 != 0) goto L_0x0118
            boolean r28 = r6.mo14927P(r0)
            if (r28 == 0) goto L_0x0114
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0116
        L_0x0114:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x0116:
            r1 = r1 | r28
        L_0x0118:
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0123
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r28
            r2 = r54
            goto L_0x0138
        L_0x0123:
            r28 = 234881024(0xe000000, float:1.5777218E-30)
            r28 = r9 & r28
            r2 = r54
            if (r28 != 0) goto L_0x0138
            boolean r28 = r6.mo14927P(r2)
            if (r28 == 0) goto L_0x0134
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0136
        L_0x0134:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0136:
            r1 = r1 | r28
        L_0x0138:
            r2 = r7 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0143
            r28 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r28
            r3 = r55
            goto L_0x0158
        L_0x0143:
            r28 = 1879048192(0x70000000, float:1.58456325E29)
            r28 = r9 & r28
            r3 = r55
            if (r28 != 0) goto L_0x0158
            boolean r28 = r6.mo14927P(r3)
            if (r28 == 0) goto L_0x0154
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0156
        L_0x0154:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0156:
            r1 = r1 | r28
        L_0x0158:
            r28 = r8 & 14
            if (r28 != 0) goto L_0x0172
            r3 = r7 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x016b
            r3 = r56
            boolean r28 = r6.mo15006n0(r3)
            if (r28 == 0) goto L_0x016d
            r24 = 4
            goto L_0x016f
        L_0x016b:
            r3 = r56
        L_0x016d:
            r24 = 2
        L_0x016f:
            r24 = r8 | r24
            goto L_0x0176
        L_0x0172:
            r3 = r56
            r24 = r8
        L_0x0176:
            r28 = r8 & 112(0x70, float:1.57E-43)
            if (r28 != 0) goto L_0x018e
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x0189
            r3 = r57
            boolean r28 = r6.mo15006n0(r3)
            if (r28 == 0) goto L_0x018b
            r16 = 32
            goto L_0x018b
        L_0x0189:
            r3 = r57
        L_0x018b:
            r24 = r24 | r16
            goto L_0x0190
        L_0x018e:
            r3 = r57
        L_0x0190:
            r3 = r24
            r11 = r7 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x0199
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x01ab
        L_0x0199:
            r13 = r8 & 896(0x380, float:1.256E-42)
            if (r13 != 0) goto L_0x01ab
            r13 = r58
            boolean r16 = r6.mo14968d(r13)
            if (r16 == 0) goto L_0x01a6
            goto L_0x01a8
        L_0x01a6:
            r17 = r18
        L_0x01a8:
            r3 = r3 | r17
            goto L_0x01ad
        L_0x01ab:
            r13 = r58
        L_0x01ad:
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01c5
            r13 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r13 != 0) goto L_0x01be
            r13 = r59
            boolean r16 = r6.mo15006n0(r13)
            if (r16 == 0) goto L_0x01c0
            goto L_0x01c2
        L_0x01be:
            r13 = r59
        L_0x01c0:
            r19 = r20
        L_0x01c2:
            r3 = r3 | r19
            goto L_0x01c7
        L_0x01c5:
            r13 = r59
        L_0x01c7:
            r13 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01d0
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r14 = r60
            goto L_0x01e1
        L_0x01d0:
            r16 = r8 & r25
            r14 = r60
            if (r16 != 0) goto L_0x01e1
            boolean r16 = r6.mo15006n0(r14)
            if (r16 == 0) goto L_0x01dd
            goto L_0x01df
        L_0x01dd:
            r21 = r22
        L_0x01df:
            r3 = r3 | r21
        L_0x01e1:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r7 & r16
            if (r16 == 0) goto L_0x01ed
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x01ea:
            r3 = r3 | r16
            goto L_0x01ff
        L_0x01ed:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r8 & r16
            if (r16 != 0) goto L_0x01ff
            boolean r16 = r6.mo14927P(r10)
            if (r16 == 0) goto L_0x01fc
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01ea
        L_0x01fc:
            r16 = 65536(0x10000, float:9.18355E-41)
            goto L_0x01ea
        L_0x01ff:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r1 & r16
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r10) goto L_0x0235
            r8 = 374491(0x5b6db, float:5.24774E-40)
            r8 = r8 & r3
            r10 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r10) goto L_0x0235
            boolean r8 = r6.mo15011p()
            if (r8 != 0) goto L_0x0219
            goto L_0x0235
        L_0x0219:
            r6.mo14958a0()
            r5 = r50
            r7 = r52
            r8 = r53
            r9 = r54
            r10 = r55
            r11 = r56
            r13 = r58
            r29 = r59
            r4 = r12
            r15 = r14
            r12 = r57
            r14 = r6
            r6 = r51
            goto L_0x0572
        L_0x0235:
            r6.mo14930Q()
            r8 = r9 & 1
            if (r8 == 0) goto L_0x026f
            boolean r8 = r6.mo14977f0()
            if (r8 == 0) goto L_0x0243
            goto L_0x026f
        L_0x0243:
            r6.mo14958a0()
            r0 = r7 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x024c
            r3 = r3 & -15
        L_0x024c:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0252
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0252:
            r0 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0258
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0258:
            r17 = r52
            r18 = r53
            r19 = r54
            r20 = r55
            r13 = r56
            r21 = r57
            r22 = r58
            r11 = r59
            r10 = r3
            r23 = r14
            r14 = r51
            goto L_0x0324
        L_0x026f:
            if (r4 == 0) goto L_0x0274
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0276
        L_0x0274:
            r4 = r51
        L_0x0276:
            if (r23 == 0) goto L_0x027a
            r8 = 1
            goto L_0x027c
        L_0x027a:
            r8 = r52
        L_0x027c:
            if (r5 == 0) goto L_0x0280
            r5 = 0
            goto L_0x0282
        L_0x0280:
            r5 = r53
        L_0x0282:
            if (r0 == 0) goto L_0x0286
            r0 = 0
            goto L_0x0288
        L_0x0286:
            r0 = r54
        L_0x0288:
            if (r2 == 0) goto L_0x028c
            r2 = 0
            goto L_0x028e
        L_0x028c:
            r2 = r55
        L_0x028e:
            r10 = r7 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x029e
            androidx.compose.material3.h2 r10 = androidx.compose.material3.C8211h2.f20155a
            r51 = r0
            r0 = 6
            androidx.compose.ui.graphics.g4 r10 = r10.mo12633f(r6, r0)
            r3 = r3 & -15
            goto L_0x02a2
        L_0x029e:
            r51 = r0
            r10 = r56
        L_0x02a2:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02bb
            androidx.compose.material3.h2 r16 = androidx.compose.material3.C8211h2.f20155a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 3072(0xc00, float:4.305E-42)
            r24 = 7
            r22 = r6
            androidx.compose.material3.g2 r0 = r16.mo12628a(r17, r19, r21, r22, r23, r24)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02bd
        L_0x02bb:
            r0 = r57
        L_0x02bd:
            if (r11 == 0) goto L_0x02c6
            androidx.compose.material3.h2 r11 = androidx.compose.material3.C8211h2.f20155a
            float r11 = r11.mo12630c()
            goto L_0x02c8
        L_0x02c6:
            r11 = r58
        L_0x02c8:
            r52 = r0
            r0 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x02db
            androidx.compose.material3.h2 r0 = androidx.compose.material3.C8211h2.f20155a
            r53 = r2
            r2 = 6
            androidx.compose.foundation.layout.e1 r0 = r0.mo12634g(r6, r2)
            r2 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r2
            goto L_0x02df
        L_0x02db:
            r53 = r2
            r0 = r59
        L_0x02df:
            if (r13 == 0) goto L_0x0312
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r2)
            java.lang.Object r2 = r6.mo14921N()
            androidx.compose.runtime.o$a r13 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r13 = r13.mo16277a()
            if (r2 != r13) goto L_0x02fa
            androidx.compose.foundation.interaction.g r2 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r6.mo14893C(r2)
        L_0x02fa:
            r6.mo15002m0()
            androidx.compose.foundation.interaction.g r2 = (androidx.compose.foundation.interaction.C2243g) r2
            r19 = r51
            r21 = r52
            r20 = r53
            r23 = r2
            r14 = r4
            r18 = r5
            r17 = r8
            r13 = r10
            r22 = r11
            r11 = r0
            r10 = r3
            goto L_0x0324
        L_0x0312:
            r19 = r51
            r21 = r52
            r20 = r53
            r18 = r5
            r17 = r8
            r13 = r10
            r22 = r11
            r23 = r14
            r11 = r0
            r10 = r3
            r14 = r4
        L_0x0324:
            r6.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0335
            java.lang.String r0 = "androidx.compose.material3.SearchBar (SearchBar.kt:159)"
            r2 = 156000634(0x94c617a, float:2.460144E-33)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r10, r0)
        L_0x0335:
            if (r12 == 0) goto L_0x033a
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x033b
        L_0x033a:
            r0 = 0
        L_0x033b:
            if (r12 == 0) goto L_0x0340
            androidx.compose.animation.core.d0<java.lang.Float> r2 = f19624m
            goto L_0x0342
        L_0x0340:
            androidx.compose.animation.core.d0<java.lang.Float> r2 = f19625n
        L_0x0342:
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = 64
            r16 = 28
            r51 = r0
            r52 = r2
            r53 = r3
            r54 = r4
            r55 = r5
            r56 = r6
            r57 = r8
            r58 = r16
            androidx.compose.runtime.k2 r8 = androidx.compose.animation.core.AnimateAsStateKt.m7971e(r51, r52, r53, r54, r55, r56, r57, r58)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71012j()
            java.lang.Object r0 = r6.mo15032w(r0)
            r5 = r0
            androidx.compose.ui.focus.j r5 = (androidx.compose.p004ui.focus.C15068j) r5
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r6.mo15032w(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.p004ui.unit.C16479d) r0
            androidx.compose.material3.h2 r2 = androidx.compose.material3.C8211h2.f20155a
            r4 = 6
            androidx.compose.ui.graphics.g4 r3 = r2.mo12633f(r6, r4)
            androidx.compose.ui.graphics.g4 r2 = r2.mo12631d(r6, r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r4)
            java.lang.Object r4 = r6.mo14921N()
            androidx.compose.runtime.o$a r24 = androidx.compose.runtime.C8592o.f23032a
            r16 = r1
            java.lang.Object r1 = r24.mo16277a()
            if (r4 != r1) goto L_0x03a1
            androidx.compose.runtime.b2 r1 = androidx.compose.runtime.C8415c2.m30254w()
            androidx.compose.material3.SearchBarKt$SearchBar$useFullScreenShape$2$1 r4 = new androidx.compose.material3.SearchBarKt$SearchBar$useFullScreenShape$2$1
            r4.<init>(r8)
            androidx.compose.runtime.k2 r4 = androidx.compose.runtime.C8415c2.m30234c(r1, r4)
            r6.mo14893C(r4)
        L_0x03a1:
            r6.mo15002m0()
            androidx.compose.runtime.k2 r4 = (androidx.compose.runtime.C8578k2) r4
            boolean r1 = m26092d(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r51 = r2
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.mo14918M(r2)
            boolean r1 = r6.mo15006n0(r1)
            boolean r27 = r6.mo15006n0(r13)
            r1 = r1 | r27
            java.lang.Object r2 = r6.mo14921N()
            if (r1 != 0) goto L_0x03cc
            java.lang.Object r1 = r24.mo16277a()
            if (r2 != r1) goto L_0x03ea
        L_0x03cc:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r3)
            if (r1 == 0) goto L_0x03dd
            androidx.compose.foundation.shape.k r2 = new androidx.compose.foundation.shape.k
            androidx.compose.material3.SearchBarKt$SearchBar$animatedShape$1$1 r1 = new androidx.compose.material3.SearchBarKt$SearchBar$animatedShape$1$1
            r1.<init>(r0, r8)
            r2.<init>(r1)
            goto L_0x03e7
        L_0x03dd:
            boolean r1 = m26092d(r4)
            if (r1 == 0) goto L_0x03e6
            r2 = r51
            goto L_0x03e7
        L_0x03e6:
            r2 = r13
        L_0x03e7:
            r6.mo14893C(r2)
        L_0x03ea:
            r6.mo15002m0()
            r27 = r2
            androidx.compose.ui.graphics.g4 r27 = (androidx.compose.p004ui.graphics.C15218g4) r27
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r1)
            java.lang.Object r1 = r6.mo14921N()
            java.lang.Object r2 = r24.mo16277a()
            if (r1 != r2) goto L_0x040c
            androidx.compose.material3.l1 r1 = new androidx.compose.material3.l1
            r3 = 1
            r4 = 0
            r1.<init>(r4, r3, r4)
            r6.mo14893C(r1)
            goto L_0x040e
        L_0x040c:
            r3 = 1
            r4 = 0
        L_0x040e:
            r6.mo15002m0()
            androidx.compose.material3.l1 r1 = (androidx.compose.material3.C8240l1) r1
            r2 = 1157296644(0x44faf204, float:2007.563)
            r6.mo14918M(r2)
            boolean r2 = r6.mo15006n0(r0)
            java.lang.Object r3 = r6.mo14921N()
            if (r2 != 0) goto L_0x0429
            java.lang.Object r2 = r24.mo16277a()
            if (r3 != r2) goto L_0x0435
        L_0x0429:
            androidx.compose.material3.SearchBarKt$SearchBar$topPadding$1$1 r2 = new androidx.compose.material3.SearchBarKt$SearchBar$topPadding$1$1
            r2.<init>(r1, r0)
            androidx.compose.runtime.k2 r3 = androidx.compose.runtime.C8415c2.m30235d(r2)
            r6.mo14893C(r3)
        L_0x0435:
            r6.mo15002m0()
            androidx.compose.runtime.k2 r3 = (androidx.compose.runtime.C8578k2) r3
            long r30 = r21.mo12612a()
            r51 = r5
            long r4 = r21.mo12612a()
            r0 = 0
            long r32 = androidx.compose.material3.ColorSchemeKt.m25516c(r4, r6, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ZIndexModifierKt.m32294a(r14, r0)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.mo14918M(r2)
            boolean r2 = r6.mo15006n0(r1)
            boolean r4 = r6.mo15006n0(r11)
            r2 = r2 | r4
            java.lang.Object r4 = r6.mo14921N()
            if (r2 != 0) goto L_0x046a
            java.lang.Object r2 = r24.mo16277a()
            if (r4 != r2) goto L_0x0472
        L_0x046a:
            androidx.compose.material3.SearchBarKt$SearchBar$2$1 r4 = new androidx.compose.material3.SearchBarKt$SearchBar$2$1
            r4.<init>(r1, r11)
            r6.mo14893C(r4)
        L_0x0472:
            r6.mo15002m0()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.m10246f(r0, r4)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.m10242b(r0, r1)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.mo14918M(r1)
            boolean r1 = r6.mo15006n0(r3)
            boolean r2 = r6.mo15006n0(r8)
            r1 = r1 | r2
            java.lang.Object r2 = r6.mo14921N()
            if (r1 != 0) goto L_0x049a
            java.lang.Object r1 = r24.mo16277a()
            if (r2 != r1) goto L_0x04a2
        L_0x049a:
            androidx.compose.material3.SearchBarKt$SearchBar$3$1 r2 = new androidx.compose.material3.SearchBarKt$SearchBar$3$1
            r2.<init>(r3, r8)
            r6.mo14893C(r2)
        L_0x04a2:
            r6.mo15002m0()
            kotlin.jvm.functions.q r2 = (kotlin.jvm.functions.C11305q) r2
            androidx.compose.ui.m r34 = androidx.compose.p004ui.layout.C15610w.m69384a(r0, r2)
            r35 = 0
            r36 = 0
            androidx.compose.material3.SearchBarKt$SearchBar$4 r5 = new androidx.compose.material3.SearchBarKt$SearchBar$4
            r0 = r5
            r37 = r16
            r1 = r46
            r2 = r47
            r16 = r3
            r29 = 1
            r3 = r48
            r26 = 0
            r28 = 6
            r4 = r49
            r38 = r51
            r39 = r5
            r5 = r50
            r40 = r6
            r6 = r17
            r7 = r18
            r41 = r8
            r8 = r19
            r9 = r20
            r26 = r10
            r10 = r21
            r29 = r11
            r11 = r23
            r12 = r37
            r42 = r13
            r13 = r26
            r43 = r14
            r14 = r41
            r15 = r16
            r16 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = -867266817(0xffffffffcc4e8eff, float:-5.4148092E7)
            r1 = r39
            r14 = r40
            r2 = 1
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r0, r2, r1)
            int r0 = r26 << 6
            r0 = r0 & r25
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = r0 | r1
            r13 = 96
            r1 = r34
            r2 = r27
            r3 = r30
            r5 = r32
            r7 = r22
            r8 = r35
            r9 = r36
            r11 = r14
            androidx.compose.material3.SurfaceKt.m26352a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r49)
            androidx.compose.material3.SearchBarKt$SearchBar$5 r1 = new androidx.compose.material3.SearchBarKt$SearchBar$5
            r4 = r49
            r2 = r38
            r3 = 0
            r1.<init>(r4, r2, r3)
            int r2 = r37 >> 9
            r2 = r2 & 14
            r3 = r2 | 64
            androidx.compose.runtime.EffectsKt.m29896h(r0, r1, r14, r3)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r0)
            r5 = r50
            boolean r0 = r14.mo15006n0(r5)
            java.lang.Object r1 = r14.mo14921N()
            if (r0 != 0) goto L_0x0546
            java.lang.Object r0 = r24.mo16277a()
            if (r1 != r0) goto L_0x054e
        L_0x0546:
            androidx.compose.material3.SearchBarKt$SearchBar$6$1 r1 = new androidx.compose.material3.SearchBarKt$SearchBar$6$1
            r1.<init>(r5)
            r14.mo14893C(r1)
        L_0x054e:
            r14.mo15002m0()
            kotlin.jvm.functions.a r1 = (kotlin.jvm.functions.C11289a) r1
            r0 = 0
            androidx.activity.compose.BackHandlerKt.m1279a(r4, r1, r14, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0560
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0560:
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r12 = r21
            r13 = r22
            r15 = r23
            r11 = r42
            r6 = r43
        L_0x0572:
            androidx.compose.runtime.t1 r14 = r14.mo15020s()
            if (r14 != 0) goto L_0x0579
            goto L_0x059e
        L_0x0579:
            androidx.compose.material3.SearchBarKt$SearchBar$7 r3 = new androidx.compose.material3.SearchBarKt$SearchBar$7
            r0 = r3
            r1 = r46
            r2 = r47
            r44 = r3
            r3 = r48
            r4 = r49
            r5 = r50
            r45 = r14
            r14 = r29
            r16 = r61
            r17 = r63
            r18 = r64
            r19 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r44
            r0 = r45
            r0.mo15202a(r1)
        L_0x059e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m26090b(java.lang.String, kotlin.jvm.functions.l, kotlin.jvm.functions.l, boolean, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.ui.graphics.g4, androidx.compose.material3.g2, float, androidx.compose.foundation.layout.e1, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v0, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0119  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26091c(java.lang.String r81, kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r82, kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r83, boolean r84, kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r85, androidx.compose.p004ui.C8767m r86, boolean r87, kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r88, kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r89, kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r90, androidx.compose.material3.C8189d3 r91, androidx.compose.foundation.interaction.C2243g r92, androidx.compose.runtime.C8592o r93, int r94, int r95, int r96) {
        /*
            r15 = r81
            r13 = r83
            r12 = r84
            r11 = r85
            r10 = r94
            r9 = r96
            r0 = -1330051158(0xffffffffb0b907aa, float:-1.34627E-9)
            r1 = r93
            androidx.compose.runtime.o r8 = r1.mo15009o(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x001c
            r1 = r10 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x002b
            boolean r1 = r8.mo15006n0(r15)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r10
            goto L_0x002c
        L_0x002b:
            r1 = r10
        L_0x002c:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x0035
            r1 = r1 | 48
            r7 = r82
            goto L_0x0047
        L_0x0035:
            r4 = r10 & 112(0x70, float:1.57E-43)
            r7 = r82
            if (r4 != 0) goto L_0x0047
            boolean r4 = r8.mo14927P(r7)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r1 = r1 | r4
        L_0x0047:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004e:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x005e
            boolean r4 = r8.mo14927P(r13)
            if (r4 == 0) goto L_0x005b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r4
        L_0x005e:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x0065
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0065:
            r4 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0075
            boolean r4 = r8.mo14961b(r12)
            if (r4 == 0) goto L_0x0072
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r4
        L_0x0075:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x007c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007c:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r10
            if (r4 != 0) goto L_0x008e
            boolean r4 = r8.mo14927P(r11)
            if (r4 == 0) goto L_0x008b
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008d
        L_0x008b:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r1 = r1 | r4
        L_0x008e:
            r4 = r9 & 32
            r48 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x0097
            r1 = r1 | r48
            goto L_0x00ac
        L_0x0097:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00ac
            r14 = r86
            boolean r16 = r8.mo15006n0(r14)
            if (r16 == 0) goto L_0x00a7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00a7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a9:
            r1 = r1 | r16
            goto L_0x00ae
        L_0x00ac:
            r14 = r86
        L_0x00ae:
            r16 = r9 & 64
            if (r16 == 0) goto L_0x00b9
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r5 = r87
            goto L_0x00ce
        L_0x00b9:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r10 & r17
            r5 = r87
            if (r17 != 0) goto L_0x00ce
            boolean r17 = r8.mo14961b(r5)
            if (r17 == 0) goto L_0x00ca
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r1 = r1 | r17
        L_0x00ce:
            r6 = r9 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00d9
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r18
            r3 = r88
            goto L_0x00ee
        L_0x00d9:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r10 & r18
            r3 = r88
            if (r18 != 0) goto L_0x00ee
            boolean r18 = r8.mo14927P(r3)
            if (r18 == 0) goto L_0x00ea
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r1 = r1 | r18
        L_0x00ee:
            r2 = r9 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x00f9
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r18
            r0 = r89
            goto L_0x010e
        L_0x00f9:
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            r18 = r10 & r18
            r0 = r89
            if (r18 != 0) goto L_0x010e
            boolean r18 = r8.mo14927P(r0)
            if (r18 == 0) goto L_0x010a
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x010a:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010c:
            r1 = r1 | r18
        L_0x010e:
            r0 = r9 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0119
            r18 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r18
            r3 = r90
            goto L_0x012e
        L_0x0119:
            r18 = 1879048192(0x70000000, float:1.58456325E29)
            r18 = r10 & r18
            r3 = r90
            if (r18 != 0) goto L_0x012e
            boolean r18 = r8.mo14927P(r3)
            if (r18 == 0) goto L_0x012a
            r18 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012c
        L_0x012a:
            r18 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012c:
            r1 = r1 | r18
        L_0x012e:
            r18 = r95 & 14
            if (r18 != 0) goto L_0x0148
            r3 = r9 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x0141
            r3 = r91
            boolean r18 = r8.mo15006n0(r3)
            if (r18 == 0) goto L_0x0143
            r18 = 4
            goto L_0x0145
        L_0x0141:
            r3 = r91
        L_0x0143:
            r18 = 2
        L_0x0145:
            r18 = r95 | r18
            goto L_0x014c
        L_0x0148:
            r3 = r91
            r18 = r95
        L_0x014c:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0155
            r18 = r18 | 48
            r5 = r92
            goto L_0x0168
        L_0x0155:
            r19 = r95 & 112(0x70, float:1.57E-43)
            r5 = r92
            if (r19 != 0) goto L_0x0168
            boolean r19 = r8.mo15006n0(r5)
            if (r19 == 0) goto L_0x0164
            r17 = 32
            goto L_0x0166
        L_0x0164:
            r17 = 16
        L_0x0166:
            r18 = r18 | r17
        L_0x0168:
            r50 = r18
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r5 = r1 & r17
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r7) goto L_0x0194
            r5 = r50 & 91
            r7 = 18
            if (r5 != r7) goto L_0x0194
            boolean r5 = r8.mo15011p()
            if (r5 != 0) goto L_0x0181
            goto L_0x0194
        L_0x0181:
            r8.mo14958a0()
            r7 = r87
            r9 = r89
            r10 = r90
            r11 = r91
            r12 = r92
            r0 = r8
            r6 = r14
            r8 = r88
            goto L_0x04a3
        L_0x0194:
            r8.mo14930Q()
            r5 = r10 & 1
            if (r5 == 0) goto L_0x01bd
            boolean r5 = r8.mo14977f0()
            if (r5 == 0) goto L_0x01a2
            goto L_0x01bd
        L_0x01a2:
            r8.mo14958a0()
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01ab
            r50 = r50 & -15
        L_0x01ab:
            r7 = r86
            r30 = r87
            r31 = r88
            r32 = r89
            r33 = r90
            r6 = r91
            r34 = r92
            r5 = r50
            goto L_0x0244
        L_0x01bd:
            if (r4 == 0) goto L_0x01c2
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01c4
        L_0x01c2:
            r4 = r86
        L_0x01c4:
            if (r16 == 0) goto L_0x01c8
            r5 = 1
            goto L_0x01ca
        L_0x01c8:
            r5 = r87
        L_0x01ca:
            if (r6 == 0) goto L_0x01ce
            r6 = 0
            goto L_0x01d0
        L_0x01ce:
            r6 = r88
        L_0x01d0:
            if (r2 == 0) goto L_0x01d4
            r2 = 0
            goto L_0x01d6
        L_0x01d4:
            r2 = r89
        L_0x01d6:
            if (r0 == 0) goto L_0x01da
            r0 = 0
            goto L_0x01dc
        L_0x01da:
            r0 = r90
        L_0x01dc:
            r7 = r9 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x020d
            androidx.compose.material3.h2 r16 = androidx.compose.material3.C8211h2.f20155a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r45 = 0
            r46 = 24576(0x6000, float:3.4438E-41)
            r47 = 16383(0x3fff, float:2.2957E-41)
            r44 = r8
            androidx.compose.material3.d3 r7 = r16.mo12636i(r17, r19, r21, r23, r25, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r45, r46, r47)
            r50 = r50 & -15
            goto L_0x020f
        L_0x020d:
            r7 = r91
        L_0x020f:
            if (r3 == 0) goto L_0x0236
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo14918M(r3)
            java.lang.Object r3 = r8.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r14 = r16.mo16277a()
            if (r3 != r14) goto L_0x022a
            androidx.compose.foundation.interaction.g r3 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r8.mo14893C(r3)
        L_0x022a:
            r8.mo15002m0()
            androidx.compose.foundation.interaction.g r3 = (androidx.compose.foundation.interaction.C2243g) r3
            r33 = r0
            r32 = r2
            r34 = r3
            goto L_0x023c
        L_0x0236:
            r34 = r92
            r33 = r0
            r32 = r2
        L_0x023c:
            r30 = r5
            r31 = r6
            r6 = r7
            r5 = r50
            r7 = r4
        L_0x0244:
            r8.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0255
            java.lang.String r0 = "androidx.compose.material3.SearchBarInputField (SearchBar.kt:422)"
            r2 = -1330051158(0xffffffffb0b907aa, float:-1.34627E-9)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r5, r0)
        L_0x0255:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo14918M(r0)
            java.lang.Object r0 = r8.mo14921N()
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r2.mo16277a()
            if (r0 != r3) goto L_0x026f
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r8.mo14893C(r0)
        L_0x026f:
            r8.mo15002m0()
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.p004ui.focus.FocusRequester) r0
            androidx.compose.material3.t2$a r3 = androidx.compose.material3.C8284t2.f20507b
            int r4 = r3.mo13033S()
            r14 = 6
            java.lang.String r4 = androidx.compose.material3.C8357u2.m29348a(r4, r8, r14)
            int r3 = r3.mo13037W()
            java.lang.String r3 = androidx.compose.material3.C8357u2.m29348a(r3, r8, r14)
            r14 = 462567106(0x1b9236c2, float:2.418906E-22)
            r8.mo14918M(r14)
            androidx.compose.runtime.i1 r14 = androidx.compose.material3.TextKt.m26703f()
            java.lang.Object r14 = r8.mo15032w(r14)
            androidx.compose.ui.text.p0 r14 = (androidx.compose.p004ui.text.C16361p0) r14
            long r16 = r14.mo47510r()
            androidx.compose.ui.graphics.j2$a r14 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r19 = r14.mo42851u()
            int r14 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r14 == 0) goto L_0x02a7
            r14 = 1
            goto L_0x02a8
        L_0x02a7:
            r14 = 0
        L_0x02a8:
            if (r14 == 0) goto L_0x02ad
            r50 = r16
            goto L_0x02db
        L_0x02ad:
            int r16 = r1 >> 18
            r16 = r16 & 14
            r16 = r16 | 48
            int r9 = r5 << 3
            r9 = r9 & 896(0x380, float:1.256E-42)
            r9 = r16 | r9
            int r14 = r5 << 9
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r14
            r86 = r6
            r87 = r30
            r14 = 0
            r88 = r14
            r89 = r34
            r90 = r8
            r91 = r9
            androidx.compose.runtime.k2 r9 = r86.mo12550t(r87, r88, r89, r90, r91)
            java.lang.Object r9 = r9.getValue()
            androidx.compose.ui.graphics.j2 r9 = (androidx.compose.p004ui.graphics.C15240j2) r9
            long r19 = r9.mo42833M()
            r50 = r19
        L_0x02db:
            r8.mo15002m0()
            androidx.compose.material3.h2 r9 = androidx.compose.material3.C8211h2.f20155a
            float r9 = r9.mo12632e()
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.SizeKt.m10115o(r7, r9)
            r14 = 0
            r16 = r1
            r23 = r7
            r1 = 0
            r7 = 1
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.SizeKt.m10114n(r9, r14, r7, r1)
            androidx.compose.ui.m r1 = androidx.compose.p004ui.focus.C15083v.m64810a(r9, r0)
            r7 = 1157296644(0x44faf204, float:2007.563)
            r8.mo14918M(r7)
            boolean r7 = r8.mo15006n0(r11)
            java.lang.Object r9 = r8.mo14921N()
            if (r7 != 0) goto L_0x030d
            java.lang.Object r2 = r2.mo16277a()
            if (r9 != r2) goto L_0x0315
        L_0x030d:
            androidx.compose.material3.SearchBarKt$SearchBarInputField$2$1 r9 = new androidx.compose.material3.SearchBarKt$SearchBarInputField$2$1
            r9.<init>(r11)
            r8.mo14893C(r9)
        L_0x0315:
            r8.mo15002m0()
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            androidx.compose.ui.m r1 = androidx.compose.p004ui.focus.C15056b.m64690a(r1, r9)
            r2 = 4
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r9 = 0
            r7[r9] = r4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r84)
            r14 = 1
            r7[r14] = r9
            r9 = 2
            r7[r9] = r3
            r9 = 3
            r7[r9] = r0
            r9 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r8.mo14918M(r9)
            r9 = 0
            r14 = 0
        L_0x0339:
            if (r9 >= r2) goto L_0x0346
            r2 = r7[r9]
            boolean r2 = r8.mo15006n0(r2)
            r14 = r14 | r2
            int r9 = r9 + 1
            r2 = 4
            goto L_0x0339
        L_0x0346:
            java.lang.Object r2 = r8.mo14921N()
            if (r14 != 0) goto L_0x0354
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r2 != r7) goto L_0x035c
        L_0x0354:
            androidx.compose.material3.SearchBarKt$SearchBarInputField$3$1 r2 = new androidx.compose.material3.SearchBarKt$SearchBarInputField$3$1
            r2.<init>(r4, r12, r3, r0)
            r8.mo14893C(r2)
        L_0x035c:
            r8.mo15002m0()
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            r0 = 0
            r3 = 0
            r4 = 1
            androidx.compose.ui.m r24 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r1, r0, r2, r4, r3)
            androidx.compose.runtime.i1 r0 = androidx.compose.material3.TextKt.m26703f()
            java.lang.Object r0 = r8.mo15032w(r0)
            androidx.compose.ui.text.p0 r0 = (androidx.compose.p004ui.text.C16361p0) r0
            androidx.compose.ui.text.p0 r1 = new androidx.compose.ui.text.p0
            r49 = r1
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r77 = 4194302(0x3ffffe, float:5.877469E-39)
            r78 = 0
            r49.<init>((long) r50, (long) r52, (androidx.compose.p004ui.text.font.C16209i0) r54, (androidx.compose.p004ui.text.font.C16190e0) r55, (androidx.compose.p004ui.text.font.C16194f0) r56, (androidx.compose.p004ui.text.font.C16242u) r57, (java.lang.String) r58, (long) r59, (androidx.compose.p004ui.text.style.C16410a) r61, (androidx.compose.p004ui.text.style.C16439m) r62, (androidx.compose.p004ui.text.intl.C16342f) r63, (long) r64, (androidx.compose.p004ui.text.style.C16434j) r66, (androidx.compose.p004ui.graphics.C15205e4) r67, (androidx.compose.p004ui.text.style.C16432i) r68, (androidx.compose.p004ui.text.style.C16436k) r69, (long) r70, (androidx.compose.p004ui.text.style.C16442o) r72, (androidx.compose.p004ui.text.C16051a0) r73, (androidx.compose.p004ui.text.style.C16426h) r74, (androidx.compose.p004ui.text.style.C16417f) r75, (androidx.compose.p004ui.text.style.C16415e) r76, (int) r77, (kotlin.jvm.internal.DefaultConstructorMarker) r78)
            androidx.compose.ui.text.p0 r26 = r0.mo47493V(r1)
            androidx.compose.ui.graphics.h4 r9 = new androidx.compose.ui.graphics.h4
            int r0 = r5 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 6
            r0 = r0 | r1
            r2 = 0
            androidx.compose.runtime.k2 r0 = r6.mo12539c(r2, r8, r0)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.j2 r0 = (androidx.compose.p004ui.graphics.C15240j2) r0
            long r2 = r0.mo42833M()
            r0 = 0
            r9.<init>(r2, r0)
            androidx.compose.foundation.text.m r35 = new androidx.compose.foundation.text.m
            r0 = 0
            r2 = 0
            r3 = 0
            androidx.compose.ui.text.input.p$a r7 = androidx.compose.p004ui.text.input.C16310p.f40516b
            int r7 = r7.mo47285m()
            r14 = 7
            r17 = 0
            r86 = r35
            r87 = r0
            r88 = r2
            r89 = r3
            r90 = r7
            r91 = r14
            r92 = r17
            r86.<init>(r87, r88, r89, r90, r91, r92)
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r8.mo14918M(r0)
            boolean r0 = r8.mo15006n0(r13)
            boolean r2 = r8.mo15006n0(r15)
            r0 = r0 | r2
            java.lang.Object r2 = r8.mo14921N()
            if (r0 != 0) goto L_0x040b
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x0413
        L_0x040b:
            androidx.compose.material3.SearchBarKt$SearchBarInputField$4$1 r2 = new androidx.compose.material3.SearchBarKt$SearchBarInputField$4$1
            r2.<init>(r13, r15)
            r8.mo14893C(r2)
        L_0x0413:
            r8.mo15002m0()
            r41 = r2
            kotlin.jvm.functions.l r41 = (kotlin.jvm.functions.C11300l) r41
            r42 = 0
            r43 = 47
            r44 = 0
            androidx.compose.foundation.text.k r36 = new androidx.compose.foundation.text.k
            r17 = r36
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44)
            r14 = 0
            r28 = r1
            r7 = r4
            r18 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.material3.SearchBarKt$SearchBarInputField$5 r4 = new androidx.compose.material3.SearchBarKt$SearchBarInputField$5
            r0 = r4
            r1 = r81
            r2 = r30
            r3 = r34
            r14 = r4
            r4 = r31
            r50 = r5
            r5 = r32
            r36 = r6
            r6 = r33
            r10 = r7
            r37 = r23
            r7 = r36
            r15 = r8
            r8 = r16
            r38 = r9
            r9 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 584727264(0x22da3ae0, float:5.9151355E-18)
            androidx.compose.runtime.internal.a r25 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r0, r10, r14)
            r0 = r16 & 14
            r1 = 102236160(0x6180000, float:2.8588023E-35)
            r0 = r0 | r1
            r1 = r16 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r16 >> 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r27 = r0 | r1
            int r0 = r50 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r28 = r0 | r48
            r29 = 7696(0x1e10, float:1.0784E-41)
            r10 = r81
            r11 = r82
            r12 = r24
            r13 = r30
            r0 = r15
            r15 = r26
            r16 = r35
            r23 = r34
            r24 = r38
            r26 = r0
            r14 = 0
            androidx.compose.foundation.text.BasicTextFieldKt.m12190c(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0495
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0495:
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r12 = r34
            r11 = r36
            r6 = r37
        L_0x04a3:
            androidx.compose.runtime.t1 r15 = r0.mo15020s()
            if (r15 != 0) goto L_0x04aa
            goto L_0x04cb
        L_0x04aa:
            androidx.compose.material3.SearchBarKt$SearchBarInputField$6 r14 = new androidx.compose.material3.SearchBarKt$SearchBarInputField$6
            r0 = r14
            r1 = r81
            r2 = r82
            r3 = r83
            r4 = r84
            r5 = r85
            r13 = r94
            r79 = r14
            r14 = r95
            r80 = r15
            r15 = r96
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r79
            r0 = r80
            r0.mo15202a(r1)
        L_0x04cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m26091c(java.lang.String, kotlin.jvm.functions.l, kotlin.jvm.functions.l, boolean, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.material3.d3, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: d */
    public static final boolean m26092d(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* renamed from: l */
    public static final float m26100l() {
        return f19613b;
    }

    /* renamed from: m */
    public static /* synthetic */ void m26101m() {
    }

    /* renamed from: n */
    public static final float m26102n() {
        return f19615d;
    }

    /* renamed from: o */
    public static final float m26103o() {
        return f19617f;
    }
}
