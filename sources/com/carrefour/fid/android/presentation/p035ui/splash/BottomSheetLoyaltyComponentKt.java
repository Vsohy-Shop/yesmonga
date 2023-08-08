package com.carrefour.fid.android.presentation.p035ui.splash;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.BottomSheetState;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.draw.C8755m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15247k0;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.utils.C22711j;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBottomSheetLoyaltyComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/splash/BottomSheetLoyaltyComponentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,346:1\n76#2:347\n76#2:377\n76#2:411\n154#3:348\n154#3:372\n154#3:373\n154#3:403\n154#3:404\n154#3:405\n154#3:406\n154#3:407\n154#3:437\n154#3:438\n154#3:439\n154#3:450\n154#3:451\n154#3:452\n88#4:349\n25#5:350\n25#5:361\n460#5,13:389\n460#5,13:423\n473#5,3:440\n473#5,3:445\n1114#6,6:351\n1114#6,3:362\n1117#6,3:368\n474#7,4:357\n478#7,2:365\n482#7:371\n474#8:367\n78#9,2:374\n80#9:402\n78#9,2:408\n80#9:436\n84#9:444\n84#9:449\n75#10:376\n76#10,11:378\n75#10:410\n76#10,11:412\n89#10:443\n89#10:448\n*S KotlinDebug\n*F\n+ 1 BottomSheetLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/splash/BottomSheetLoyaltyComponentKt\n*L\n76#1:347\n209#1:377\n223#1:411\n76#1:348\n94#1:372\n164#1:373\n220#1:403\n221#1:404\n225#1:405\n227#1:406\n228#1:407\n235#1:437\n242#1:438\n247#1:439\n258#1:450\n259#1:451\n260#1:452\n76#1:349\n80#1:350\n90#1:361\n209#1:389,13\n223#1:423,13\n223#1:440,3\n209#1:445,3\n80#1:351,6\n90#1:362,3\n90#1:368,3\n90#1:357,4\n90#1:365,2\n90#1:371\n90#1:367\n209#1:374,2\n209#1:402\n223#1:408,2\n223#1:436\n223#1:444\n209#1:449\n209#1:376\n209#1:378,11\n223#1:410\n223#1:412,11\n223#1:443\n209#1:448\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponentKt */
public final class BottomSheetLoyaltyComponentKt {
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f2  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m110420a(@org.jetbrains.annotations.C12579k java.lang.String r50, @org.jetbrains.annotations.C12580l java.lang.String r51, float r52, @org.jetbrains.annotations.C12580l androidx.compose.material.BottomSheetValue r53, boolean r54, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Float, kotlin.C11079d2> r55, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r56, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r57, int r58, int r59) {
        /*
            r9 = r50
            r10 = r55
            r11 = r56
            r12 = r58
            java.lang.String r0 = "cardNumber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "updateWindowBrightness"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "actionRetry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -1557694395(0xffffffffa3277845, float:-9.078556E-18)
            r1 = r57
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r59 & 1
            r7 = 2
            if (r1 == 0) goto L_0x0028
            r1 = r12 | 6
            goto L_0x0038
        L_0x0028:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x0037
            boolean r1 = r14.mo15006n0(r9)
            if (r1 == 0) goto L_0x0034
            r1 = 4
            goto L_0x0035
        L_0x0034:
            r1 = r7
        L_0x0035:
            r1 = r1 | r12
            goto L_0x0038
        L_0x0037:
            r1 = r12
        L_0x0038:
            r2 = r59 & 2
            if (r2 == 0) goto L_0x0041
            r1 = r1 | 48
            r13 = r51
            goto L_0x0053
        L_0x0041:
            r2 = r12 & 112(0x70, float:1.57E-43)
            r13 = r51
            if (r2 != 0) goto L_0x0053
            boolean r2 = r14.mo15006n0(r13)
            if (r2 == 0) goto L_0x0050
            r2 = 32
            goto L_0x0052
        L_0x0050:
            r2 = 16
        L_0x0052:
            r1 = r1 | r2
        L_0x0053:
            r2 = r59 & 4
            if (r2 == 0) goto L_0x005c
            r1 = r1 | 384(0x180, float:5.38E-43)
            r15 = r52
            goto L_0x006e
        L_0x005c:
            r2 = r12 & 896(0x380, float:1.256E-42)
            r15 = r52
            if (r2 != 0) goto L_0x006e
            boolean r2 = r14.mo14968d(r15)
            if (r2 == 0) goto L_0x006b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r1 = r1 | r2
        L_0x006e:
            r2 = r59 & 8
            if (r2 == 0) goto L_0x0075
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0088
        L_0x0075:
            r3 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0088
            r3 = r53
            boolean r4 = r14.mo15006n0(r3)
            if (r4 == 0) goto L_0x0084
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r1 = r1 | r4
            goto L_0x008a
        L_0x0088:
            r3 = r53
        L_0x008a:
            r4 = r59 & 16
            if (r4 == 0) goto L_0x0091
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0091:
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r12
            if (r5 != 0) goto L_0x00a6
            r5 = r54
            boolean r6 = r14.mo14961b(r5)
            if (r6 == 0) goto L_0x00a2
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r1 = r1 | r6
            goto L_0x00a8
        L_0x00a6:
            r5 = r54
        L_0x00a8:
            r6 = r59 & 32
            if (r6 == 0) goto L_0x00b0
            r6 = 196608(0x30000, float:2.75506E-40)
        L_0x00ae:
            r1 = r1 | r6
            goto L_0x00c1
        L_0x00b0:
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r12
            if (r6 != 0) goto L_0x00c1
            boolean r6 = r14.mo14927P(r10)
            if (r6 == 0) goto L_0x00be
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00be:
            r6 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ae
        L_0x00c1:
            r6 = r59 & 64
            if (r6 == 0) goto L_0x00c9
            r6 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c7:
            r1 = r1 | r6
            goto L_0x00da
        L_0x00c9:
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r12
            if (r6 != 0) goto L_0x00da
            boolean r6 = r14.mo14927P(r11)
            if (r6 == 0) goto L_0x00d7
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c7
        L_0x00d7:
            r6 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c7
        L_0x00da:
            r6 = r1
            r1 = 2995931(0x2db6db, float:4.198194E-39)
            r1 = r1 & r6
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r8) goto L_0x00f2
            boolean r1 = r14.mo15011p()
            if (r1 != 0) goto L_0x00eb
            goto L_0x00f2
        L_0x00eb:
            r14.mo14958a0()
            r4 = r3
            r1 = r14
            goto L_0x026a
        L_0x00f2:
            if (r2 == 0) goto L_0x00f9
            androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Collapsed
            r48 = r1
            goto L_0x00fb
        L_0x00f9:
            r48 = r3
        L_0x00fb:
            r8 = 0
            if (r4 == 0) goto L_0x0101
            r49 = r8
            goto L_0x0103
        L_0x0101:
            r49 = r5
        L_0x0103:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x010f
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponent (BottomSheetLoyaltyComponent.kt:65)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r1, r2)
        L_0x010f:
            if (r49 == 0) goto L_0x0115
            r0 = 2131953745(0x7f130851, float:1.954397E38)
            goto L_0x0118
        L_0x0115:
            r0 = 2131953738(0x7f13084a, float:1.9543955E38)
        L_0x0118:
            java.lang.String r16 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r14, r8)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70951f()
            java.lang.Object r0 = r14.mo15032w(r0)
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            int r0 = r0.screenHeightDp
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r1 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r1
            float r17 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r2 = 0
            r3 = 0
            int r0 = r6 >> 9
            r5 = r0 & 14
            r0 = 6
            r1 = r48
            r4 = r14
            r18 = r6
            r6 = r0
            androidx.compose.material.BottomSheetState r0 = androidx.compose.material.BottomSheetScaffoldKt.m13304n(r1, r2, r3, r4, r5, r6)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo14918M(r1)
            java.lang.Object r2 = r14.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r3.mo16277a()
            if (r2 != r4) goto L_0x0164
            java.lang.Float r2 = java.lang.Float.valueOf(r52)
            r4 = 0
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r4, r7, r4)
            r14.mo14893C(r2)
        L_0x0164:
            r14.mo15002m0()
            androidx.compose.runtime.z0 r2 = (androidx.compose.runtime.C8700z0) r2
            boolean r4 = r0.mo10069k()
            if (r4 == 0) goto L_0x0172
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x017f
        L_0x0172:
            boolean r4 = r0.mo10070l()
            if (r4 == 0) goto L_0x017b
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x017f
        L_0x017b:
            float r4 = r0.mo10066h()
        L_0x017f:
            java.lang.Object r5 = r2.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r7 = 1
            if (r5 != 0) goto L_0x0190
            r5 = r7
            goto L_0x0191
        L_0x0190:
            r5 = r8
        L_0x0191:
            if (r5 != 0) goto L_0x01a1
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r2.setValue(r4)
            java.lang.Object r2 = r2.getValue()
            r10.invoke(r2)
        L_0x01a1:
            r2 = 773894976(0x2e20b340, float:3.6538994E-11)
            r14.mo14918M(r2)
            r14.mo14918M(r1)
            java.lang.Object r1 = r14.mo14921N()
            java.lang.Object r2 = r3.mo16277a()
            if (r1 != r2) goto L_0x01c3
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r1 = androidx.compose.runtime.EffectsKt.m29901m(r1, r14)
            androidx.compose.runtime.w r2 = new androidx.compose.runtime.w
            r2.<init>(r1)
            r14.mo14893C(r2)
            r1 = r2
        L_0x01c3:
            r14.mo15002m0()
            androidx.compose.runtime.w r1 = (androidx.compose.runtime.C8690w) r1
            kotlinx.coroutines.o0 r19 = r1.mo16831a()
            r14.mo15002m0()
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 5
            r2 = r0
            r4 = r14
            androidx.compose.material.g r1 = androidx.compose.material.BottomSheetScaffoldKt.m13303m(r1, r2, r3, r4, r5, r6)
            r15 = r1
            r1 = 16
            float r1 = (float) r1
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            float r3 = (float) r8
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.foundation.shape.n r21 = androidx.compose.foundation.shape.C2694o.m12167i(r2, r1, r4, r3)
            r1 = 84
            float r1 = (float) r1
            float r27 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.graphics.j2$a r1 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r38 = r1.mo42850s()
            com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$1 r8 = new com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$1
            r6 = r0
            r0 = r8
            r1 = r17
            r2 = r6
            r3 = r19
            r4 = r16
            r5 = r50
            r9 = r6
            r6 = r51
            r10 = r7
            r7 = r49
            r12 = r8
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1174398186(0xffffffffba001b16, float:-4.8868486E-4)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r0, r10, r12)
            r13 = r0
            r0 = 0
            r1 = r14
            r14 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r40 = 0
            com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$2 r0 = new com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$2
            r0.<init>(r11, r9)
            r2 = 1028511899(0x3d4dd89b, float:0.0502554)
            androidx.compose.runtime.internal.a r42 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r2, r10, r0)
            r44 = 6
            r45 = 384(0x180, float:5.38E-43)
            r46 = 390(0x186, float:5.47E-43)
            r47 = 3141370(0x2feefa, float:4.401997E-39)
            r43 = r1
            androidx.compose.material.BottomSheetScaffoldKt.m13292b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r28, r29, r30, r31, r32, r34, r36, r38, r40, r42, r43, r44, r45, r46, r47)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0266
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0266:
            r4 = r48
            r5 = r49
        L_0x026a:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x0271
            goto L_0x0288
        L_0x0271:
            com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$3 r12 = new com.carrefour.fid.android.presentation.ui.splash.BottomSheetLoyaltyComponentKt$BottomSheetLoyaltyComponent$3
            r0 = r12
            r1 = r50
            r2 = r51
            r3 = r52
            r6 = r55
            r7 = r56
            r8 = r58
            r9 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r12)
        L_0x0288:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.splash.BottomSheetLoyaltyComponentKt.m110420a(java.lang.String, java.lang.String, float, androidx.compose.material.BottomSheetValue, boolean, kotlin.jvm.functions.l, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m110421b(C8767m mVar, String str, String str2, boolean z, C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m mVar3;
        C8767m.C8768a aVar;
        C15403w2 w2Var;
        int i4;
        int i5;
        float f;
        float f2;
        C8767m.C8768a aVar2;
        C8592o oVar3;
        String str3;
        int i6;
        int i7;
        int i8;
        int i9;
        String str4 = str;
        String str5 = str2;
        boolean z2 = z;
        int i10 = i;
        C8592o o = oVar.mo15009o(348054775);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i10 | 6;
            mVar2 = mVar;
        } else if ((i10 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i10;
        } else {
            mVar2 = mVar;
            i3 = i10;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i10 & 112) == 0) {
            if (o.mo15006n0(str4)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i10 & 896) == 0) {
            if (o.mo15006n0(str5)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (o.mo14961b(z2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i12 = i3;
        if ((i12 & 5851) != 1170 || !o.mo15011p()) {
            if (i11 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(348054775, i12, -1, "com.carrefour.fid.android.presentation.ui.splash.CardWithBarCode (BottomSheetLoyaltyComponent.kt:196)");
            }
            Bitmap b = C22711j.m102879b(str4, 1000, 300);
            if (b != null) {
                w2Var = C15247k0.m66139c(b);
            } else {
                w2Var = null;
            }
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            C8734c.C8735a aVar3 = C8734c.f23406a;
            C8734c.C8736b m = aVar3.mo17068m();
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2271e f3 = arrangement.mo7625f();
            o.mo14918M(-483455358);
            C15560f0 b2 = ColumnKt.m9863b(f3, m, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(n);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b3 = Updater.m30180b(o);
            Updater.m30188j(b3, b2, companion.mo44588d());
            Updater.m30188j(b3, dVar, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection, companion.mo44587c());
            Updater.m30188j(b3, c4Var, companion.mo44590f());
            o.mo14972e();
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            if (z2) {
                i4 = R.drawable.pass_cards;
            } else {
                i4 = R.drawable.ic_carte_fidelite;
            }
            Painter d = C16015f.m71849d(i4, o, 0);
            if (z2) {
                i5 = R.string.loyalty_card_pass;
            } else {
                i5 = R.string.splash_loyalty_card_content_description;
            }
            String d2 = C16018i.m71858d(i5, o, 0);
            C8767m.C8768a aVar4 = C8767m.f23478j;
            C8767m a2 = C8755m.m32557a(SizeKt.m10113m(aVar4, 0.65f), -4.15f);
            if (z2) {
                f = (float) 0;
            } else {
                f = (float) 7;
            }
            C8767m o2 = PaddingKt.m10028o(a2, 0.0f, 0.0f, 0.0f, C16483g.m74435M(f), 7, (Object) null);
            if (z2) {
                f2 = (float) 23;
            } else {
                f2 = (float) 0;
            }
            C8767m mVar4 = aVar;
            int i13 = i12;
            ImageKt.m8967b(d, d2, OffsetKt.m10000f(o2, 0.0f, C16483g.m74435M(f2), 1, (Object) null), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 8, 120);
            C8767m.C8768a aVar5 = aVar4;
            float f5 = (float) 12;
            C8767m d3 = BackgroundKt.m8825d(C8744d.m32514a(SizeKt.m10115o(SizeKt.m10113m(OffsetKt.m10000f(aVar5, 0.0f, C16483g.m74435M((float) -65), 1, (Object) null), 0.872f), C16483g.m74435M((float) 213)), C2694o.m12166h(C16483g.m74435M(f5))), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null);
            C8734c.C8736b m2 = aVar3.mo17068m();
            Arrangement.C2271e f6 = arrangement.mo7625f();
            o.mo14918M(-483455358);
            C15560f0 b4 = ColumnKt.m9863b(f6, m2, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f7 = LayoutKt.m68908f(d3);
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
            C8592o b5 = Updater.m30180b(o);
            Updater.m30188j(b5, b4, companion.mo44588d());
            Updater.m30188j(b5, dVar2, companion.mo44586b());
            Updater.m30188j(b5, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b5, c4Var2, companion.mo44590f());
            o.mo14972e();
            f7.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            o.mo14918M(1642615400);
            if (w2Var == null) {
                aVar2 = aVar5;
                oVar3 = o;
            } else {
                C8767m o3 = PaddingKt.m10028o(aVar5, C16483g.m74435M(f5), C16483g.m74435M((float) 16), C16483g.m74435M(f5), 0.0f, 8, (Object) null);
                C15403w2 w2Var2 = w2Var;
                aVar2 = aVar5;
                oVar3 = o;
                ImageKt.m8969d(w2Var2, C16018i.m71858d(R.string.splash_loyalty_barcode_content_description, o, 0), o3, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, 0, o, 8, 248);
                C11079d2 d2Var = C11079d2.f28267a;
            }
            oVar3.mo15002m0();
            if (str5 == null) {
                str3 = "";
            } else {
                str3 = str5;
            }
            float f8 = (float) 4;
            C8767m o4 = PaddingKt.m10028o(aVar2, 0.0f, C16483g.m74435M(f8), 0.0f, 0.0f, 13, (Object) null);
            C7933t0 t0Var = C7933t0.f19075a;
            int i14 = C7933t0.f19076b;
            TextKt.m14196c(str3, o4, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153899k(t0Var.mo11077c(oVar3, i14)), oVar3, 48, 0, 65532);
            oVar2 = oVar3;
            TextKt.m14196c(str, PaddingKt.m10028o(aVar2, 0.0f, C16483g.m74435M(f8), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153875B(t0Var.mo11077c(oVar3, i14)), oVar2, ((i13 >> 3) & 14) | 48, 0, 65532);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar3 = mVar4;
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new BottomSheetLoyaltyComponentKt$CardWithBarCode$2(mVar3, str, str2, z, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m110422c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-783817047);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-783817047, i, -1, "com.carrefour.fid.android.presentation.ui.splash.ClosedBottomSheetLoyaltyComponentPreview (BottomSheetLoyaltyComponent.kt:301)");
            }
            ThemeKt.m153788a(ComposableSingletons$BottomSheetLoyaltyComponentKt.f63031a.mo74706a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25722x28d29b66(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m110423d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1835642700);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1835642700, i, -1, "com.carrefour.fid.android.presentation.ui.splash.OpenedBottomSheetLoyaltyComponentPreview (BottomSheetLoyaltyComponent.kt:316)");
            }
            ThemeKt.m153788a(ComposableSingletons$BottomSheetLoyaltyComponentKt.f63031a.mo74707b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25723x5fe187e3(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m110424e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1412525369);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1412525369, i, -1, "com.carrefour.fid.android.presentation.ui.splash.OpenedBottomSheetPassComponentPreview (BottomSheetLoyaltyComponent.kt:332)");
            }
            ThemeKt.m153788a(ComposableSingletons$BottomSheetLoyaltyComponentKt.f63031a.mo74708c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25724x670af6c4(i));
        }
    }

    @C12579k
    /* renamed from: k */
    public static final C8767m m110430k(@C12579k C8767m mVar, long j, @C12579k C15218g4 g4Var, float f, float f2, float f3, float f4) {
        C8767m mVar2 = mVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$coloredShadow");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, new BottomSheetLoyaltyComponentKt$coloredShadow$1(j, f, f2, f4, f3, g4Var), 1, (Object) null);
    }

    /* renamed from: l */
    public static /* synthetic */ C8767m m110431l(C8767m mVar, long j, C15218g4 g4Var, float f, float f2, float f3, float f4, int i, Object obj) {
        float f5;
        float f6;
        float f7;
        float f8;
        if ((i & 4) != 0) {
            f5 = 0.2f;
        } else {
            f5 = f;
        }
        if ((i & 8) != 0) {
            f6 = C16483g.m74435M((float) 0);
        } else {
            f6 = f2;
        }
        if ((i & 16) != 0) {
            f7 = C16483g.m74435M((float) 0);
        } else {
            f7 = f3;
        }
        if ((i & 32) != 0) {
            f8 = C16483g.m74435M((float) 0);
        } else {
            f8 = f4;
        }
        return m110430k(mVar, j, g4Var, f5, f6, f7, f8);
    }

    /* renamed from: m */
    public static final void m110432m(BottomSheetState bottomSheetState, C12074o0 o0Var) {
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new BottomSheetLoyaltyComponentKt$toggleBottomSheet$1(bottomSheetState, (C11045c<? super BottomSheetLoyaltyComponentKt$toggleBottomSheet$1>) null), 3, (Object) null);
    }
}
