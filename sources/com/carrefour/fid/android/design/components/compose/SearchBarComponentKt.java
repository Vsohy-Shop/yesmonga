package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSearchBarComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBarComponent.kt\ncom/carrefour/fid/android/design/components/compose/SearchBarComponentKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,296:1\n474#2,4:297\n478#2,2:305\n482#2:311\n25#3:301\n25#3:312\n25#3:319\n25#3:326\n36#3:333\n36#3:342\n460#3,13:368\n473#3,3:384\n36#3:390\n36#3:399\n36#3:408\n1114#4,3:302\n1117#4,3:308\n1114#4,6:313\n1114#4,6:320\n1114#4,6:327\n1114#4,6:334\n1114#4,6:343\n1114#4,6:391\n1114#4,6:400\n1114#4,6:409\n474#5:307\n154#6:340\n154#6:341\n154#6:382\n154#6:383\n154#6:397\n154#6:398\n154#6:406\n154#6:407\n75#7,6:349\n81#7:381\n85#7:388\n75#8:355\n76#8,11:357\n89#8:387\n76#9:356\n76#9:389\n76#10:415\n102#10,2:416\n76#10:418\n*S KotlinDebug\n*F\n+ 1 SearchBarComponent.kt\ncom/carrefour/fid/android/design/components/compose/SearchBarComponentKt\n*L\n90#1:297,4\n90#1:305,2\n90#1:311\n90#1:301\n91#1:312\n92#1:319\n93#1:326\n134#1:333\n145#1:342\n139#1:368,13\n139#1:384,3\n215#1:390\n251#1:399\n262#1:408\n90#1:302,3\n90#1:308,3\n91#1:313,6\n92#1:320,6\n93#1:327,6\n134#1:334,6\n145#1:343,6\n215#1:391,6\n251#1:400,6\n262#1:409,6\n90#1:307\n142#1:340\n143#1:341\n151#1:382\n152#1:383\n249#1:397\n250#1:398\n260#1:406\n261#1:407\n139#1:349,6\n139#1:381\n139#1:388\n139#1:355\n139#1:357,11\n139#1:387\n139#1:356\n208#1:389\n93#1:415\n93#1:416,2\n185#1:418\n*E\n"})
public final class SearchBarComponentKt {

    /* renamed from: a */
    public static final long f92310a = 400;

    /* renamed from: b */
    public static final long f92311b = 300;
    @C12580l

    /* renamed from: c */
    public static C11723c2 f92312c;
    @C12580l

    /* renamed from: d */
    public static C11723c2 f92313d;

    @C8540g
    /* renamed from: a */
    public static final void m151595a(C12074o0 o0Var, C2243g gVar, C11300l<? super C36995l, C11079d2> lVar, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-791938610);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-791938610, i, -1, "com.carrefour.fid.android.design.components.compose.LongPressLaunchedEffect (SearchBarComponent.kt:179)");
        }
        C8578k2<Boolean> a = PressInteractionKt.m9677a(gVar, o, (i >> 3) & 14);
        EffectsKt.m29896h(Boolean.valueOf(m151596b(a)), new SearchBarComponentKt$LongPressLaunchedEffect$1(o0Var, a, lVar, (C11045c<? super SearchBarComponentKt$LongPressLaunchedEffect$1>) null), o, 64);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SearchBarComponentKt$LongPressLaunchedEffect$2(o0Var, gVar, lVar, i));
        }
    }

    /* renamed from: b */
    public static final boolean m151596b(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012d  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151597c(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r27, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.compose.SearchBarVariant r28, @org.jetbrains.annotations.C12579k java.lang.String r29, @org.jetbrains.annotations.C12580l java.lang.String r30, boolean r31, boolean r32, boolean r33, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r36, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r37, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r38, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r39, int r40, int r41, int r42) {
        /*
            r2 = r28
            r3 = r29
            r13 = r40
            r15 = r42
            java.lang.String r0 = "variant"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "hint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 937699724(0x37e4298c, float:2.7199065E-5)
            r1 = r39
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r4 = r15 & 1
            if (r4 == 0) goto L_0x0025
            r7 = r13 | 6
            r8 = r7
            r7 = r27
            goto L_0x0039
        L_0x0025:
            r7 = r13 & 14
            if (r7 != 0) goto L_0x0036
            r7 = r27
            boolean r8 = r1.mo15006n0(r7)
            if (r8 == 0) goto L_0x0033
            r8 = 4
            goto L_0x0034
        L_0x0033:
            r8 = 2
        L_0x0034:
            r8 = r8 | r13
            goto L_0x0039
        L_0x0036:
            r7 = r27
            r8 = r13
        L_0x0039:
            r9 = r15 & 2
            if (r9 == 0) goto L_0x0040
            r8 = r8 | 48
            goto L_0x0050
        L_0x0040:
            r9 = r13 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0050
            boolean r9 = r1.mo15006n0(r2)
            if (r9 == 0) goto L_0x004d
            r9 = 32
            goto L_0x004f
        L_0x004d:
            r9 = 16
        L_0x004f:
            r8 = r8 | r9
        L_0x0050:
            r9 = r15 & 4
            if (r9 == 0) goto L_0x0057
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0067
            boolean r9 = r1.mo15006n0(r3)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r8 = r8 | r9
        L_0x0067:
            r9 = r15 & 8
            if (r9 == 0) goto L_0x006e
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r12 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0081
            r12 = r30
            boolean r14 = r1.mo15006n0(r12)
            if (r14 == 0) goto L_0x007d
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r8 = r8 | r14
            goto L_0x0083
        L_0x0081:
            r12 = r30
        L_0x0083:
            r14 = r15 & 16
            if (r14 == 0) goto L_0x008c
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r5 = r31
            goto L_0x00a2
        L_0x008c:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r13 & r16
            r5 = r31
            if (r16 != 0) goto L_0x00a2
            boolean r16 = r1.mo14961b(r5)
            if (r16 == 0) goto L_0x009e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r8 = r8 | r16
        L_0x00a2:
            r16 = r15 & 32
            if (r16 == 0) goto L_0x00ad
            r17 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 | r17
            r10 = r32
            goto L_0x00c2
        L_0x00ad:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r13 & r17
            r10 = r32
            if (r17 != 0) goto L_0x00c2
            boolean r18 = r1.mo14961b(r10)
            if (r18 == 0) goto L_0x00be
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r8 = r8 | r18
        L_0x00c2:
            r18 = r15 & 64
            if (r18 == 0) goto L_0x00cd
            r19 = 1572864(0x180000, float:2.204052E-39)
            r8 = r8 | r19
            r11 = r33
            goto L_0x00e2
        L_0x00cd:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r13 & r19
            r11 = r33
            if (r19 != 0) goto L_0x00e2
            boolean r20 = r1.mo14961b(r11)
            if (r20 == 0) goto L_0x00de
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r8 = r8 | r20
        L_0x00e2:
            r6 = r15 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00ed
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r8 = r8 | r21
            r0 = r34
            goto L_0x0102
        L_0x00ed:
            r21 = 29360128(0x1c00000, float:7.052966E-38)
            r21 = r13 & r21
            r0 = r34
            if (r21 != 0) goto L_0x0102
            boolean r22 = r1.mo14927P(r0)
            if (r22 == 0) goto L_0x00fe
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r8 = r8 | r22
        L_0x0102:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x010d
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r8 = r8 | r22
            r2 = r35
            goto L_0x0122
        L_0x010d:
            r22 = 234881024(0xe000000, float:1.5777218E-30)
            r22 = r13 & r22
            r2 = r35
            if (r22 != 0) goto L_0x0122
            boolean r22 = r1.mo14927P(r2)
            if (r22 == 0) goto L_0x011e
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0120
        L_0x011e:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0120:
            r8 = r8 | r22
        L_0x0122:
            r2 = r15 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x012d
            r22 = 805306368(0x30000000, float:4.656613E-10)
            r8 = r8 | r22
            r3 = r36
            goto L_0x0142
        L_0x012d:
            r22 = 1879048192(0x70000000, float:1.58456325E29)
            r22 = r13 & r22
            r3 = r36
            if (r22 != 0) goto L_0x0142
            boolean r22 = r1.mo14927P(r3)
            if (r22 == 0) goto L_0x013e
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0140
        L_0x013e:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0140:
            r8 = r8 | r22
        L_0x0142:
            r3 = r15 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x014b
            r22 = r41 | 6
            r5 = r37
            goto L_0x0161
        L_0x014b:
            r22 = r41 & 14
            r5 = r37
            if (r22 != 0) goto L_0x015f
            boolean r22 = r1.mo14927P(r5)
            if (r22 == 0) goto L_0x015a
            r22 = 4
            goto L_0x015c
        L_0x015a:
            r22 = 2
        L_0x015c:
            r22 = r41 | r22
            goto L_0x0161
        L_0x015f:
            r22 = r41
        L_0x0161:
            r5 = r15 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0168
            r22 = r22 | 48
            goto L_0x017b
        L_0x0168:
            r23 = r41 & 112(0x70, float:1.57E-43)
            r7 = r38
            if (r23 != 0) goto L_0x017b
            boolean r23 = r1.mo14927P(r7)
            if (r23 == 0) goto L_0x0177
            r17 = 32
            goto L_0x0179
        L_0x0177:
            r17 = 16
        L_0x0179:
            r22 = r22 | r17
        L_0x017b:
            r7 = r22
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r8 & r17
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r11) goto L_0x01ac
            r10 = r7 & 91
            r11 = 18
            if (r10 != r11) goto L_0x01ac
            boolean r10 = r1.mo15011p()
            if (r10 != 0) goto L_0x0194
            goto L_0x01ac
        L_0x0194:
            r1.mo14958a0()
            r21 = r27
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r4 = r12
            r12 = r38
            goto L_0x04cc
        L_0x01ac:
            if (r4 == 0) goto L_0x01b1
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01b3
        L_0x01b1:
            r4 = r27
        L_0x01b3:
            if (r9 == 0) goto L_0x01b8
            java.lang.String r9 = ""
            goto L_0x01b9
        L_0x01b8:
            r9 = r12
        L_0x01b9:
            if (r14 == 0) goto L_0x01bd
            r11 = 1
            goto L_0x01bf
        L_0x01bd:
            r11 = r31
        L_0x01bf:
            if (r16 == 0) goto L_0x01c3
            r14 = 0
            goto L_0x01c5
        L_0x01c3:
            r14 = r32
        L_0x01c5:
            if (r18 == 0) goto L_0x01ca
            r24 = 1
            goto L_0x01cc
        L_0x01ca:
            r24 = r33
        L_0x01cc:
            if (r6 == 0) goto L_0x01d0
            r6 = 0
            goto L_0x01d2
        L_0x01d0:
            r6 = r34
        L_0x01d2:
            if (r0 == 0) goto L_0x01d6
            r0 = 0
            goto L_0x01d8
        L_0x01d6:
            r0 = r35
        L_0x01d8:
            if (r2 == 0) goto L_0x01dc
            r2 = 0
            goto L_0x01de
        L_0x01dc:
            r2 = r36
        L_0x01de:
            if (r3 == 0) goto L_0x01e2
            r3 = 0
            goto L_0x01e4
        L_0x01e2:
            r3 = r37
        L_0x01e4:
            if (r5 == 0) goto L_0x01e8
            r5 = 0
            goto L_0x01ea
        L_0x01e8:
            r5 = r38
        L_0x01ea:
            boolean r16 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r16 == 0) goto L_0x01f8
            java.lang.String r10 = "com.carrefour.fid.android.design.components.compose.SearchBar (SearchBarComponent.kt:75)"
            r12 = 937699724(0x37e4298c, float:2.7199065E-5)
            androidx.compose.runtime.ComposerKt.m29845w0(r12, r8, r7, r10)
        L_0x01f8:
            r7 = 773894976(0x2e20b340, float:3.6538994E-11)
            r1.mo14918M(r7)
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r7)
            java.lang.Object r10 = r1.mo14921N()
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r12.mo16277a()
            if (r10 != r7) goto L_0x021e
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r7 = androidx.compose.runtime.EffectsKt.m29901m(r7, r1)
            androidx.compose.runtime.w r10 = new androidx.compose.runtime.w
            r10.<init>(r7)
            r1.mo14893C(r10)
        L_0x021e:
            r1.mo15002m0()
            androidx.compose.runtime.w r10 = (androidx.compose.runtime.C8690w) r10
            kotlinx.coroutines.o0 r7 = r10.mo16831a()
            r1.mo15002m0()
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r10)
            java.lang.Object r10 = r1.mo14921N()
            java.lang.Object r13 = r12.mo16277a()
            if (r10 != r13) goto L_0x0242
            androidx.compose.ui.focus.FocusRequester r10 = new androidx.compose.ui.focus.FocusRequester
            r10.<init>()
            r1.mo14893C(r10)
        L_0x0242:
            r1.mo15002m0()
            androidx.compose.ui.focus.FocusRequester r10 = (androidx.compose.p004ui.focus.FocusRequester) r10
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r13)
            java.lang.Object r13 = r1.mo14921N()
            java.lang.Object r15 = r12.mo16277a()
            if (r13 != r15) goto L_0x025e
            androidx.compose.foundation.interaction.g r13 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r1.mo14893C(r13)
        L_0x025e:
            r1.mo15002m0()
            androidx.compose.foundation.interaction.g r13 = (androidx.compose.foundation.interaction.C2243g) r13
            r15 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r15)
            java.lang.Object r15 = r1.mo14921N()
            r17 = r11
            java.lang.Object r11 = r12.mo16277a()
            if (r15 != r11) goto L_0x029f
            androidx.compose.ui.text.input.TextFieldValue r11 = new androidx.compose.ui.text.input.TextFieldValue
            int r15 = r9.length()
            long r18 = androidx.compose.p004ui.text.C16359o0.m73779a(r15)
            r15 = 0
            r21 = 4
            r22 = 0
            r30 = r11
            r31 = r9
            r32 = r18
            r34 = r15
            r35 = r21
            r36 = r22
            r30.<init>((java.lang.String) r31, (long) r32, (androidx.compose.p004ui.text.C16356n0) r34, (int) r35, (kotlin.jvm.internal.DefaultConstructorMarker) r36)
            r18 = r9
            r9 = 0
            r15 = 2
            androidx.compose.runtime.z0 r15 = androidx.compose.runtime.C8539f2.m30981g(r11, r9, r15, r9)
            r1.mo14893C(r15)
            goto L_0x02a1
        L_0x029f:
            r18 = r9
        L_0x02a1:
            r1.mo15002m0()
            androidx.compose.runtime.z0 r15 = (androidx.compose.runtime.C8700z0) r15
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBar$actioner$1 r9 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBar$actioner$1
            r30 = r9
            r31 = r7
            r32 = r6
            r33 = r2
            r34 = r3
            r35 = r5
            r36 = r0
            r37 = r15
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            r11 = 56
            m151595a(r7, r13, r9, r1, r11)
            r7 = -731885593(0xffffffffd4604fe7, float:-3.85365285E12)
            r1.mo14918M(r7)
            r7 = 1157296644(0x44faf204, float:2007.563)
            if (r14 == 0) goto L_0x02fb
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            r1.mo14918M(r7)
            boolean r19 = r1.mo15006n0(r10)
            java.lang.Object r7 = r1.mo14921N()
            if (r19 != 0) goto L_0x02e5
            r19 = r0
            java.lang.Object r0 = r12.mo16277a()
            if (r7 != r0) goto L_0x02e3
            goto L_0x02e7
        L_0x02e3:
            r0 = 0
            goto L_0x02f0
        L_0x02e5:
            r19 = r0
        L_0x02e7:
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBar$1$1 r7 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBar$1$1
            r0 = 0
            r7.<init>(r10, r0)
            r1.mo14893C(r7)
        L_0x02f0:
            r1.mo15002m0()
            kotlin.jvm.functions.p r7 = (kotlin.jvm.functions.C11304p) r7
            r0 = 70
            androidx.compose.runtime.EffectsKt.m29896h(r11, r7, r1, r0)
            goto L_0x02fd
        L_0x02fb:
            r19 = r0
        L_0x02fd:
            r1.mo15002m0()
            r0 = 0
            r7 = 0
            r11 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r4, r0, r11, r7)
            r7 = 40
            float r7 = (float) r7
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r7)
            r7 = 8
            float r7 = (float) r7
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            androidx.compose.foundation.shape.n r11 = androidx.compose.foundation.shape.C2694o.m12166h(r11)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.draw.C8744d.m32514a(r0, r11)
            long r20 = r28.mo112291q()
            r11 = 0
            r16 = 2
            r22 = 0
            r31 = r0
            r32 = r20
            r34 = r11
            r35 = r16
            r36 = r22
            androidx.compose.ui.m r0 = androidx.compose.foundation.BackgroundKt.m8825d(r31, r32, r34, r35, r36)
            r16 = 0
            r20 = 0
            r11 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r11)
            boolean r11 = r1.mo15006n0(r9)
            r39 = r2
            java.lang.Object r2 = r1.mo14921N()
            if (r11 != 0) goto L_0x0354
            java.lang.Object r11 = r12.mo16277a()
            if (r2 != r11) goto L_0x035c
        L_0x0354:
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBar$2$1 r2 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBar$2$1
            r2.<init>(r9)
            r1.mo14893C(r2)
        L_0x035c:
            r1.mo15002m0()
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r11 = 7
            r12 = 0
            r31 = r0
            r0 = 0
            r32 = r0
            r33 = r16
            r34 = r20
            r35 = r2
            r36 = r11
            r37 = r12
            androidx.compose.ui.m r0 = androidx.compose.foundation.ClickableKt.m8878e(r31, r32, r33, r34, r35, r36, r37)
            androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r2 = r2.mo17070q()
            r11 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r11)
            androidx.compose.foundation.layout.Arrangement r11 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r11 = r11.mo7630p()
            r12 = 48
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.RowKt.m10071d(r11, r2, r1, r12)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r11)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            r16 = r3
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r3 = r1.mo15032w(r3)
            androidx.compose.ui.platform.c4 r3 = (androidx.compose.p004ui.platform.C15863c4) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r20 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r21 = r4
            kotlin.jvm.functions.a r4 = r20.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            r22 = r5
            androidx.compose.runtime.d r5 = r1.mo15017r()
            boolean r5 = r5 instanceof androidx.compose.runtime.C8428d
            if (r5 != 0) goto L_0x03cd
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x03cd:
            r1.mo14938T()
            boolean r5 = r1.mo14997l()
            if (r5 == 0) goto L_0x03da
            r1.mo14947W(r4)
            goto L_0x03dd
        L_0x03da:
            r1.mo14888A()
        L_0x03dd:
            r1.mo14941U()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r5 = r20.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r4, r2, r5)
            kotlin.jvm.functions.p r2 = r20.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r4, r11, r2)
            kotlin.jvm.functions.p r2 = r20.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r4, r12, r2)
            kotlin.jvm.functions.p r2 = r20.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r4, r3, r2)
            r1.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.invoke(r2, r1, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            int r2 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_search_1
            androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.p004ui.res.C16015f.m71849d(r2, r1, r3)
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r4 = 12
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r5 = 0
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r11 = 0
            r12 = 10
            r20 = 0
            r30 = r3
            r31 = r4
            r32 = r5
            r33 = r7
            r34 = r11
            r35 = r12
            r36 = r20
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10028o(r30, r31, r32, r33, r34, r35, r36)
            r4 = 15
            float r5 = (float) r4
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10087C(r3, r5)
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r11 = r5.mo114258z()
            int r5 = com.carrefour.fid.android.design.components.C36896b.C36912p.accessibility_open_search_page
            r7 = 0
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r1, r7)
            r7 = 392(0x188, float:5.5E-43)
            r20 = 0
            r30 = r2
            r31 = r5
            r32 = r3
            r33 = r11
            r35 = r1
            r36 = r7
            r37 = r20
            androidx.compose.material.IconKt.m13539b(r30, r31, r32, r33, r35, r36, r37)
            androidx.compose.ui.text.input.TextFieldValue r2 = m151598d(r15)
            r3 = 221190(0x36006, float:3.09953E-40)
            r5 = r8 & 896(0x380, float:1.256E-42)
            r3 = r3 | r5
            int r5 = r8 >> 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r5
            r30 = r0
            r31 = r2
            r32 = r29
            r33 = r17
            r34 = r10
            r35 = r13
            r36 = r9
            r37 = r1
            r38 = r3
            m151602h(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            androidx.compose.ui.text.input.TextFieldValue r0 = m151598d(r15)
            java.lang.String r0 = r0.mo47115i()
            int r2 = r8 >> 15
            r2 = r2 & 112(0x70, float:1.57E-43)
            r10 = r24
            m151601g(r0, r10, r9, r1, r2)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x04bd
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04bd:
            r8 = r6
            r7 = r10
            r6 = r14
            r11 = r16
            r5 = r17
            r4 = r18
            r9 = r19
            r12 = r22
            r10 = r39
        L_0x04cc:
            androidx.compose.runtime.t1 r15 = r1.mo15020s()
            if (r15 != 0) goto L_0x04d3
            goto L_0x04f0
        L_0x04d3:
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBar$4 r14 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBar$4
            r0 = r14
            r1 = r21
            r2 = r28
            r3 = r29
            r13 = r40
            r25 = r14
            r14 = r41
            r26 = r15
            r15 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r25
            r0 = r26
            r0.mo15202a(r1)
        L_0x04f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.SearchBarComponentKt.m151597c(androidx.compose.ui.m, com.carrefour.fid.android.design.components.compose.SearchBarVariant, java.lang.String, java.lang.String, boolean, boolean, boolean, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: d */
    public static final TextFieldValue m151598d(C8700z0<TextFieldValue> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: e */
    public static final void m151599e(C8700z0<TextFieldValue> z0Var, TextFieldValue textFieldValue) {
        z0Var.setValue(textFieldValue);
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151600f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1001255955);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1001255955, i, -1, "com.carrefour.fid.android.design.components.compose.SearchBarPreview (SearchBarComponent.kt:285)");
            }
            ThemeKt.m153788a(ComposableSingletons$SearchBarComponentKt.f92263a.mo112125a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SearchBarComponentKt$SearchBarPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151601g(java.lang.String r21, boolean r22, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.design.components.compose.C36995l, kotlin.C11079d2> r23, androidx.compose.runtime.C8592o r24, int r25) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r4 = 99739744(0x5f1e860, float:2.2748892E-35)
            r5 = r24
            androidx.compose.runtime.o r13 = r5.mo15009o(r4)
            r5 = r3 & 14
            if (r5 != 0) goto L_0x0020
            boolean r5 = r13.mo15006n0(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0031
            boolean r6 = r13.mo14961b(r1)
            if (r6 == 0) goto L_0x002e
            r6 = 32
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r5 = r5 | r6
        L_0x0031:
            r6 = r3 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0041
            boolean r6 = r13.mo14927P(r2)
            if (r6 == 0) goto L_0x003e
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r5 = r5 | r6
        L_0x0041:
            r6 = r5 & 731(0x2db, float:1.024E-42)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0053
            boolean r6 = r13.mo15011p()
            if (r6 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r13.mo14958a0()
            goto L_0x016d
        L_0x0053:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x005f
            r6 = -1
            java.lang.String r7 = "com.carrefour.fid.android.design.components.compose.SearchBarRightIcon (SearchBarComponent.kt:238)"
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r5, r6, r7)
        L_0x005f:
            java.lang.String r4 = ""
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r4)
            r5 = 1157296644(0x44faf204, float:2007.563)
            r6 = 15
            r7 = 12
            r8 = 6
            r9 = 0
            if (r4 == 0) goto L_0x00ec
            r4 = 300893279(0x11ef445f, float:3.7749688E-28)
            r13.mo14918M(r4)
            if (r1 == 0) goto L_0x00e7
            int r4 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_scan
            androidx.compose.ui.graphics.painter.Painter r4 = androidx.compose.p004ui.res.C16015f.m71849d(r4, r13, r9)
            androidx.compose.ui.m$a r14 = androidx.compose.p004ui.C8767m.f23478j
            float r8 = (float) r8
            float r15 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            r16 = 0
            float r7 = (float) r7
            float r17 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r18 = 0
            r19 = 10
            r20 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.PaddingKt.m10028o(r14, r15, r16, r17, r18, r19, r20)
            float r6 = (float) r6
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.ui.m r14 = androidx.compose.foundation.layout.SizeKt.m10087C(r7, r6)
            r15 = 0
            r16 = 0
            r17 = 0
            r13.mo14918M(r5)
            boolean r5 = r13.mo15006n0(r2)
            java.lang.Object r6 = r13.mo14921N()
            if (r5 != 0) goto L_0x00b9
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x00c1
        L_0x00b9:
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarRightIcon$1$1 r6 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarRightIcon$1$1
            r6.<init>(r2)
            r13.mo14893C(r6)
        L_0x00c1:
            r13.mo15002m0()
            r18 = r6
            kotlin.jvm.functions.a r18 = (kotlin.jvm.functions.C11289a) r18
            r19 = 7
            r20 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.ClickableKt.m8878e(r14, r15, r16, r17, r18, r19, r20)
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r10 = r5.mo114258z()
            int r5 = com.carrefour.fid.android.design.components.C36896b.C36912p.accessibility_open_code_bar_scan
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r13, r9)
            r12 = 8
            r14 = 0
            r5 = r4
            r8 = r10
            r10 = r13
            r11 = r12
            r12 = r14
            androidx.compose.material.IconKt.m13539b(r5, r6, r7, r8, r10, r11, r12)
        L_0x00e7:
            r13.mo15002m0()
            goto L_0x0164
        L_0x00ec:
            r4 = 300893788(0x11ef465c, float:3.7750914E-28)
            r13.mo14918M(r4)
            int r4 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_circle_cross_filled
            androidx.compose.ui.graphics.painter.Painter r4 = androidx.compose.p004ui.res.C16015f.m71849d(r4, r13, r9)
            androidx.compose.ui.m$a r14 = androidx.compose.p004ui.C8767m.f23478j
            float r8 = (float) r8
            float r15 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            r16 = 0
            float r7 = (float) r7
            float r17 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r18 = 0
            r19 = 10
            r20 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.PaddingKt.m10028o(r14, r15, r16, r17, r18, r19, r20)
            float r6 = (float) r6
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.ui.m r14 = androidx.compose.foundation.layout.SizeKt.m10087C(r7, r6)
            r15 = 0
            r16 = 0
            r17 = 0
            r13.mo14918M(r5)
            boolean r5 = r13.mo15006n0(r2)
            java.lang.Object r6 = r13.mo14921N()
            if (r5 != 0) goto L_0x0133
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x013b
        L_0x0133:
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarRightIcon$2$1 r6 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarRightIcon$2$1
            r6.<init>(r2)
            r13.mo14893C(r6)
        L_0x013b:
            r13.mo15002m0()
            r18 = r6
            kotlin.jvm.functions.a r18 = (kotlin.jvm.functions.C11289a) r18
            r19 = 7
            r20 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.ClickableKt.m8878e(r14, r15, r16, r17, r18, r19, r20)
            com.carrefour.fid.android.design.theme.b r5 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r10 = r5.mo114258z()
            int r5 = com.carrefour.fid.android.design.components.C36896b.C36912p.accessibility_clear_search_bar
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r13, r9)
            r12 = 8
            r14 = 0
            r5 = r4
            r8 = r10
            r10 = r13
            r11 = r12
            r12 = r14
            androidx.compose.material.IconKt.m13539b(r5, r6, r7, r8, r10, r11, r12)
            r13.mo15002m0()
        L_0x0164:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x016d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x016d:
            androidx.compose.runtime.t1 r4 = r13.mo15020s()
            if (r4 != 0) goto L_0x0174
            goto L_0x017c
        L_0x0174:
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarRightIcon$3 r5 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarRightIcon$3
            r5.<init>(r0, r1, r2, r3)
            r4.mo15202a(r5)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.SearchBarComponentKt.m151601g(java.lang.String, boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151602h(androidx.compose.foundation.layout.C2411u0 r38, androidx.compose.p004ui.text.input.TextFieldValue r39, java.lang.String r40, boolean r41, androidx.compose.p004ui.focus.FocusRequester r42, androidx.compose.foundation.interaction.C2243g r43, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.design.components.compose.C36995l, kotlin.C11079d2> r44, androidx.compose.runtime.C8592o r45, int r46) {
        /*
            r14 = r39
            r13 = r40
            r7 = r42
            r6 = r44
            r5 = r46
            r0 = 799977755(0x2faeb11b, float:3.1776257E-10)
            r1 = r45
            androidx.compose.runtime.o r3 = r1.mo15009o(r0)
            r1 = r5 & 14
            r2 = r38
            if (r1 != 0) goto L_0x0024
            boolean r1 = r3.mo15006n0(r2)
            if (r1 == 0) goto L_0x0021
            r1 = 4
            goto L_0x0022
        L_0x0021:
            r1 = 2
        L_0x0022:
            r1 = r1 | r5
            goto L_0x0025
        L_0x0024:
            r1 = r5
        L_0x0025:
            r4 = r5 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0035
            boolean r4 = r3.mo15006n0(r14)
            if (r4 == 0) goto L_0x0032
            r4 = 32
            goto L_0x0034
        L_0x0032:
            r4 = 16
        L_0x0034:
            r1 = r1 | r4
        L_0x0035:
            r4 = r5 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0045
            boolean r4 = r3.mo15006n0(r13)
            if (r4 == 0) goto L_0x0042
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0044
        L_0x0042:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r1 = r1 | r4
        L_0x0045:
            r4 = r5 & 7168(0x1c00, float:1.0045E-41)
            r12 = r41
            if (r4 != 0) goto L_0x0057
            boolean r4 = r3.mo14961b(r12)
            if (r4 == 0) goto L_0x0054
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0056
        L_0x0054:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0056:
            r1 = r1 | r4
        L_0x0057:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r5
            if (r4 != 0) goto L_0x0069
            boolean r4 = r3.mo15006n0(r7)
            if (r4 == 0) goto L_0x0066
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0068
        L_0x0066:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0068:
            r1 = r1 | r4
        L_0x0069:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r5
            r11 = r43
            if (r4 != 0) goto L_0x007c
            boolean r4 = r3.mo15006n0(r11)
            if (r4 == 0) goto L_0x0079
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007b
        L_0x0079:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x007b:
            r1 = r1 | r4
        L_0x007c:
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r5
            if (r4 != 0) goto L_0x008d
            boolean r4 = r3.mo14927P(r6)
            if (r4 == 0) goto L_0x008a
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x008c
        L_0x008a:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x008c:
            r1 = r1 | r4
        L_0x008d:
            r10 = r1
            r1 = 2995931(0x2db6db, float:4.198194E-39)
            r1 = r1 & r10
            r4 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r4) goto L_0x00a5
            boolean r1 = r3.mo15011p()
            if (r1 != 0) goto L_0x009e
            goto L_0x00a5
        L_0x009e:
            r3.mo14958a0()
            r24 = r3
            goto L_0x018d
        L_0x00a5:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00b1
            r1 = -1
            java.lang.String r4 = "com.carrefour.fid.android.design.components.compose.SearchBarTextField (SearchBarComponent.kt:199)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r1, r4)
        L_0x00b1:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71012j()
            java.lang.Object r0 = r3.mo15032w(r0)
            androidx.compose.ui.focus.j r0 = (androidx.compose.p004ui.focus.C15068j) r0
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r16 = androidx.compose.p004ui.focus.C15083v.m64810a(r1, r7)
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r19 = 2
            r20 = 0
            r15 = r38
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.C2411u0.m10660e(r15, r16, r17, r18, r19, r20)
            androidx.compose.material.t0 r1 = androidx.compose.material.C7933t0.f19075a
            int r4 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r1 = r1.mo11077c(r3, r4)
            androidx.compose.ui.text.p0 r20 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r1)
            androidx.compose.foundation.text.m r28 = new androidx.compose.foundation.text.m
            r22 = 0
            r23 = 0
            r24 = 0
            androidx.compose.ui.text.input.p$a r1 = androidx.compose.p004ui.text.input.C16310p.f40516b
            int r25 = r1.mo47285m()
            r26 = 7
            r27 = 0
            r21 = r28
            r21.<init>(r22, r23, r24, r25, r26, r27)
            androidx.compose.foundation.text.k r21 = new androidx.compose.foundation.text.k
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarTextField$1 r1 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarTextField$1
            r1.<init>(r6, r14, r0)
            r35 = 0
            r36 = 47
            r37 = 0
            r29 = r21
            r34 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37)
            androidx.compose.ui.graphics.h4 r0 = new androidx.compose.ui.graphics.h4
            com.carrefour.fid.android.design.theme.b r1 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r8 = r1.mo114218O()
            r1 = 0
            r0.<init>(r8, r1)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r3.mo14918M(r1)
            boolean r1 = r3.mo15006n0(r6)
            java.lang.Object r4 = r3.mo14921N()
            if (r1 != 0) goto L_0x0132
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r4 != r1) goto L_0x013a
        L_0x0132:
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarTextField$2$1 r4 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarTextField$2$1
            r4.<init>(r6)
            r3.mo14893C(r4)
        L_0x013a:
            r3.mo15002m0()
            r1 = r4
            kotlin.jvm.functions.l r1 = (kotlin.jvm.functions.C11300l) r1
            r4 = 0
            r8 = 1
            r9 = 1
            r15 = 0
            r4 = r10
            r10 = r15
            r15 = 0
            r11 = r15
            r12 = r15
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarTextField$3 r15 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarTextField$3
            r15.<init>(r14, r13, r4)
            r8 = 831349669(0x318d63a5, float:4.1149684E-9)
            androidx.compose.runtime.internal.a r15 = androidx.compose.runtime.internal.C8553b.m31048b(r3, r8, r9, r15)
            int r8 = r4 >> 3
            r8 = r8 & 14
            r9 = 907542528(0x36180000, float:2.2649765E-6)
            r8 = r8 | r9
            r9 = r4 & 7168(0x1c00, float:1.0045E-41)
            r17 = r8 | r9
            int r4 = r4 >> 6
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r8 = 196608(0x30000, float:2.75506E-40)
            r18 = r4 | r8
            r19 = 7184(0x1c10, float:1.0067E-41)
            r4 = r0
            r0 = r39
            r2 = r16
            r24 = r3
            r3 = r41
            r5 = r20
            r6 = r28
            r7 = r21
            r13 = r43
            r14 = r4
            r16 = r24
            r4 = 0
            r8 = 1
            r9 = 1
            androidx.compose.foundation.text.BasicTextFieldKt.m12188a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x018d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x018d:
            androidx.compose.runtime.t1 r9 = r24.mo15020s()
            if (r9 != 0) goto L_0x0194
            goto L_0x01ad
        L_0x0194:
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarTextField$4 r10 = new com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$SearchBarTextField$4
            r0 = r10
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.SearchBarComponentKt.m151602h(androidx.compose.foundation.layout.u0, androidx.compose.ui.text.input.TextFieldValue, java.lang.String, boolean, androidx.compose.ui.focus.FocusRequester, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: s */
    public static final void m151613s(C12074o0 o0Var, C11300l<? super String, C11079d2> lVar, TextFieldValue textFieldValue, String str) {
        if (lVar != null && !Intrinsics.areEqual((Object) textFieldValue.mo47115i(), (Object) str)) {
            C11723c2 c2Var = f92313d;
            if (c2Var != null) {
                C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
            }
            f92313d = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new SearchBarComponentKt$onSearchBarTextChanged$1(lVar, str, (C11045c<? super SearchBarComponentKt$onSearchBarTextChanged$1>) null), 3, (Object) null);
        }
    }
}
