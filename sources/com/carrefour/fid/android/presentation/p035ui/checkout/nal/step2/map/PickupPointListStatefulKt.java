package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.domain.models.pickup.C38081b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nPickupPointListStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickupPointListStateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/map/PickupPointListStatefulKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,127:1\n43#2,6:128\n45#3,3:134\n25#4:137\n83#4,3:144\n36#4:153\n25#4:165\n36#4:173\n36#4:180\n1114#5,6:138\n1114#5,6:147\n1114#5,3:154\n1117#5,3:162\n1114#5,6:166\n1114#5,6:174\n1114#5,6:181\n28#6:157\n30#6:161\n50#7:158\n55#7:160\n106#8:159\n154#9:172\n76#10:187\n76#10:188\n76#10:189\n102#10,2:190\n76#10:192\n102#10,2:193\n*S KotlinDebug\n*F\n+ 1 PickupPointListStateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/map/PickupPointListStatefulKt\n*L\n37#1:128,6\n37#1:134,3\n46#1:137\n48#1:144,3\n59#1:153\n81#1:165\n94#1:173\n99#1:180\n46#1:138,6\n48#1:147,6\n59#1:154,3\n59#1:162,3\n81#1:166,6\n94#1:174,6\n99#1:181,6\n62#1:157\n62#1:161\n62#1:158\n62#1:160\n62#1:159\n85#1:172\n43#1:187\n45#1:188\n46#1:189\n46#1:190,2\n81#1:192\n81#1:193,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt */
public final class PickupPointListStatefulKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$1$1} */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d A[LOOP:0: B:60:0x013b->B:61:0x013d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0293  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105131a(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel r23, float r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.domain.models.pickup.C38080a, kotlin.C11079d2> r25, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.domain.models.pickup.C38080a, kotlin.C11079d2> r26, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r27, int r28, int r29) {
        /*
            r6 = r25
            r7 = r26
            r8 = r28
            java.lang.String r0 = "onCurrentItemChanged"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onPickupSelected"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 2080305470(0x7bfef13e, float:2.6474727E36)
            r1 = r27
            androidx.compose.runtime.o r5 = r1.mo15009o(r0)
            r1 = r29 & 1
            if (r1 == 0) goto L_0x0020
            r2 = r8 | 2
            goto L_0x0021
        L_0x0020:
            r2 = r8
        L_0x0021:
            r3 = r29 & 2
            if (r3 == 0) goto L_0x002a
            r2 = r2 | 48
            r4 = r24
            goto L_0x003c
        L_0x002a:
            r3 = r8 & 112(0x70, float:1.57E-43)
            r4 = r24
            if (r3 != 0) goto L_0x003c
            boolean r3 = r5.mo14968d(r4)
            if (r3 == 0) goto L_0x0039
            r3 = 32
            goto L_0x003b
        L_0x0039:
            r3 = 16
        L_0x003b:
            r2 = r2 | r3
        L_0x003c:
            r3 = r29 & 4
            if (r3 == 0) goto L_0x0043
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0053
        L_0x0043:
            r3 = r8 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0053
            boolean r3 = r5.mo14927P(r6)
            if (r3 == 0) goto L_0x0050
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0052
        L_0x0050:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0052:
            r2 = r2 | r3
        L_0x0053:
            r3 = r29 & 8
            if (r3 == 0) goto L_0x005a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x006a
        L_0x005a:
            r3 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x006a
            boolean r3 = r5.mo14927P(r7)
            if (r3 == 0) goto L_0x0067
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0069
        L_0x0067:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0069:
            r2 = r2 | r3
        L_0x006a:
            r3 = 1
            if (r1 != r3) goto L_0x0082
            r2 = r2 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r2 != r9) goto L_0x0082
            boolean r2 = r5.mo15011p()
            if (r2 != 0) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            r5.mo14958a0()
            r1 = r23
            r3 = r5
            goto L_0x0297
        L_0x0082:
            r5.mo14930Q()
            r2 = r8 & 1
            r15 = 8
            if (r2 == 0) goto L_0x0096
            boolean r2 = r5.mo14977f0()
            if (r2 == 0) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            r5.mo14958a0()
            goto L_0x00d3
        L_0x0096:
            if (r1 == 0) goto L_0x00d3
            r1 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r5.mo14918M(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r10 = r1.mo57681a(r5, r15)
            if (r10 == 0) goto L_0x00c7
            androidx.lifecycle.x0$b r12 = androidx.hilt.navigation.compose.C19298a.m90444a(r10, r5, r15)
            r1 = 564614654(0x21a755fe, float:1.1339122E-18)
            r5.mo14918M(r1)
            r11 = 0
            java.lang.Class<com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel> r9 = com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel.class
            r14 = 4168(0x1048, float:5.84E-42)
            r1 = 0
            r13 = r5
            r2 = r15
            r15 = r1
            androidx.lifecycle.v0 r1 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r9, r10, r11, r12, r13, r14, r15)
            r5.mo15002m0()
            r5.mo15002m0()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel) r1
            r15 = r1
            goto L_0x00d6
        L_0x00c7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d3:
            r2 = r15
            r15 = r23
        L_0x00d6:
            r5.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00e5
            r1 = -1
            java.lang.String r9 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStateful (PickupPointListStateful.kt:35)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r1, r9)
        L_0x00e5:
            r0 = 0
            com.google.accompanist.pager.PagerState r1 = com.google.accompanist.pager.PagerStateKt.m64414a(r0, r5, r0, r3)
            kotlinx.coroutines.flow.u r9 = r15.mo76068e0()
            r14 = 0
            androidx.compose.runtime.k2 r16 = androidx.compose.runtime.C8415c2.m30233b(r9, r14, r5, r2, r3)
            kotlinx.coroutines.flow.u r9 = r15.mo76069f0()
            androidx.compose.runtime.k2 r13 = androidx.compose.runtime.C8415c2.m30233b(r9, r14, r5, r2, r3)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r2)
            java.lang.Object r9 = r5.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            r12 = 2
            if (r9 != r10) goto L_0x0117
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r9 = androidx.compose.runtime.C8539f2.m30981g(r9, r14, r12, r14)
            r5.mo14893C(r9)
        L_0x0117:
            r5.mo15002m0()
            r11 = r9
            androidx.compose.runtime.z0 r11 = (androidx.compose.runtime.C8700z0) r11
            com.carrefour.fid.android.domain.models.pickup.b r10 = m105132b(r16)
            com.carrefour.fid.android.domain.models.pickup.a r9 = m105133c(r13)
            r2 = 4
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r0] = r1
            r14[r3] = r11
            r14[r12] = r16
            r17 = 3
            r14[r17] = r13
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r5.mo14918M(r0)
            r0 = 0
            r17 = 0
        L_0x013b:
            if (r0 >= r2) goto L_0x0149
            r2 = r14[r0]
            boolean r2 = r5.mo15006n0(r2)
            r17 = r17 | r2
            int r0 = r0 + 1
            r2 = 4
            goto L_0x013b
        L_0x0149:
            java.lang.Object r0 = r5.mo14921N()
            if (r17 != 0) goto L_0x015e
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r0 != r2) goto L_0x0158
            goto L_0x015e
        L_0x0158:
            r2 = r9
            r3 = r10
            r18 = r11
            r6 = 0
            goto L_0x0170
        L_0x015e:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$1$1 r0 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$1$1
            r14 = 0
            r2 = r9
            r9 = r0
            r3 = r10
            r10 = r1
            r18 = r11
            r12 = r16
            r6 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            r5.mo14893C(r0)
        L_0x0170:
            r5.mo15002m0()
            kotlin.jvm.functions.p r0 = (kotlin.jvm.functions.C11304p) r0
            r9 = 584(0x248, float:8.18E-43)
            androidx.compose.runtime.EffectsKt.m29895g(r3, r2, r0, r5, r9)
            r14 = 1157296644(0x44faf204, float:2007.563)
            r5.mo14918M(r14)
            boolean r0 = r5.mo15006n0(r1)
            java.lang.Object r2 = r5.mo14921N()
            if (r0 != 0) goto L_0x0192
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x01a9
        L_0x0192:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$currentPageFlow$1$1 r0 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$currentPageFlow$1$1
            r0.<init>(r1)
            kotlinx.coroutines.flow.e r0 = androidx.compose.runtime.C8415c2.m30253v(r0)
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$lambda$7$$inlined$filterNot$1 r2 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$lambda$7$$inlined$filterNot$1
            r9 = r18
            r2.<init>(r0, r9)
            kotlinx.coroutines.flow.e r2 = kotlinx.coroutines.flow.C11909g.m47451g0(r2)
            r5.mo14893C(r2)
        L_0x01a9:
            r5.mo15002m0()
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$2 r9 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$2
            r10 = 0
            r0 = r9
            r11 = r1
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13 = 1
            r3 = r25
            r4 = r16
            r14 = r5
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 64
            androidx.compose.runtime.EffectsKt.m29896h(r11, r9, r14, r0)
            r14.mo14918M(r12)
            java.lang.Object r0 = r14.mo14921N()
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r1.mo16277a()
            if (r0 != r2) goto L_0x01dc
            r2 = 2
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r6, r6, r2, r6)
            r14.mo14893C(r0)
        L_0x01dc:
            r14.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r3 = 188(0xbc, float:2.63E-43)
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.SizeKt.m10115o(r2, r3)
            androidx.compose.ui.graphics.j2$a r2 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r18 = r2.mo42850s()
            r20 = 0
            r21 = 2
            r22 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.BackgroundKt.m8825d(r17, r18, r20, r21, r22)
            com.carrefour.fid.android.domain.models.pickup.b r2 = m105132b(r16)
            java.util.List r2 = r2.mo118301f()
            kotlin.jvm.functions.l r12 = m105143m(r24)
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$3 r3 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$3
            r3.<init>(r15, r7)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r4)
            boolean r5 = r14.mo15006n0(r0)
            java.lang.Object r6 = r14.mo14921N()
            if (r5 != 0) goto L_0x0225
            java.lang.Object r5 = r1.mo16277a()
            if (r6 != r5) goto L_0x022d
        L_0x0225:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$4$1 r6 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$4$1
            r6.<init>(r0)
            r14.mo14893C(r6)
        L_0x022d:
            r14.mo15002m0()
            r5 = r6
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            r16 = 512(0x200, float:7.175E-43)
            r17 = 0
            r10 = r11
            r11 = r2
            r2 = r13
            r13 = r3
            r3 = r14
            r14 = r5
            r5 = r15
            r15 = r3
            com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.PickupListComponentKt.m105047a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.carrefour.fid.android.domain.models.pickup.a r6 = m105137g(r0)
            if (r6 != 0) goto L_0x0249
            goto L_0x028d
        L_0x0249:
            r3.mo14918M(r4)
            boolean r4 = r3.mo15006n0(r0)
            java.lang.Object r9 = r3.mo14921N()
            if (r4 != 0) goto L_0x025c
            java.lang.Object r1 = r1.mo16277a()
            if (r9 != r1) goto L_0x0264
        L_0x025c:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$5$1$1 r9 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$5$1$1
            r9.<init>(r0)
            r3.mo14893C(r9)
        L_0x0264:
            r3.mo15002m0()
            kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.ComposableSingletons$PickupPointListStatefulKt r1 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map.ComposableSingletons$PickupPointListStatefulKt.f59723a
            kotlin.jvm.functions.p r10 = r1.mo69409a()
            r11 = 0
            r12 = 0
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$5$2 r1 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$5$2
            r1.<init>(r6, r0)
            r0 = 1280260412(0x4c4f393c, float:5.4322416E7)
            androidx.compose.runtime.internal.a r13 = androidx.compose.runtime.internal.C8553b.m31048b(r3, r0, r2, r1)
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 24624(0x6030, float:3.4506E-41)
            r22 = 492(0x1ec, float:6.9E-43)
            r20 = r3
            androidx.compose.material.AndroidAlertDialog_androidKt.m13201b(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22)
        L_0x028d:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0296
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0296:
            r1 = r5
        L_0x0297:
            androidx.compose.runtime.t1 r9 = r3.mo15020s()
            if (r9 != 0) goto L_0x029e
            goto L_0x02b1
        L_0x029e:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$6 r10 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointListStatefulKt$PickupPointListStateful$6
            r0 = r10
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.mo15202a(r10)
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map.PickupPointListStatefulKt.m105131a(com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel, float, kotlin.jvm.functions.l, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: b */
    public static final C38081b m105132b(C8578k2<C38081b> k2Var) {
        return k2Var.getValue();
    }

    /* renamed from: c */
    public static final C38080a m105133c(C8578k2<C38080a> k2Var) {
        return k2Var.getValue();
    }

    /* renamed from: d */
    public static final void m105134d(C8700z0<C38080a> z0Var, C38080a aVar) {
        z0Var.setValue(aVar);
    }

    /* renamed from: e */
    public static final boolean m105135e(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: f */
    public static final void m105136f(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: g */
    public static final C38080a m105137g(C8700z0<C38080a> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: m */
    public static final C11300l<C38080a, String> m105143m(float f) {
        return new PickupPointListStatefulKt$makePriceFormatter$1(f);
    }
}
