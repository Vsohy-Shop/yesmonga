package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.service.models.C38146a;
import com.carrefour.fid.android.service.core.constants.StoreServiceConstantsKt;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aY\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\u0003H\u0002¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel;", "viewModel", "", "Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;", "drivePoints", "Landroid/location/Location;", "lastLocation", "Lkotlin/Function1;", "Lkotlin/d2;", "onCurrentItemChanged", "onDriveSelected", "DriveCarouselStateful", "(Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel;Ljava/util/List;Landroid/location/Location;Lkotlin/jvm/functions/l;Lkotlin/jvm/functions/l;Landroidx/compose/runtime/o;II)V", "", "isDriveCollaboratorReserved", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveCarouselStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveCarouselStateful.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/DriveCarouselStatefulKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 8 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 9 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,126:1\n43#2,6:127\n45#3,3:133\n1271#4,2:136\n1285#4,4:138\n25#5:142\n36#5:149\n25#5:161\n50#5:169\n49#5:170\n36#5:177\n1114#6,6:143\n1114#6,3:150\n1117#6,3:158\n1114#6,6:162\n1114#6,6:171\n1114#6,6:178\n28#7:153\n30#7:157\n50#8:154\n55#8:156\n106#9:155\n154#10:168\n76#11:184\n76#11:185\n102#11,2:186\n76#11:188\n102#11,2:189\n76#11:191\n*S KotlinDebug\n*F\n+ 1 DriveCarouselStateful.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/DriveCarouselStatefulKt\n*L\n36#1:127,6\n36#1:133,3\n44#1:136,2\n44#1:138,4\n51#1:142\n64#1:149\n86#1:161\n96#1:169\n96#1:170\n115#1:177\n51#1:143,6\n64#1:150,3\n64#1:158,3\n86#1:162,6\n96#1:171,6\n115#1:178,6\n67#1:153\n67#1:157\n67#1:154\n67#1:156\n67#1:155\n91#1:168\n50#1:184\n51#1:185\n51#1:186,2\n86#1:188\n86#1:189,2\n87#1:191\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt */
public final class DriveCarouselStatefulKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DriveCarouselStateful(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel r26, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.service.presentation.model.DrivePoint> r27, @org.jetbrains.annotations.C12580l android.location.Location r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.service.presentation.model.DrivePoint, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.service.presentation.model.DrivePoint, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r6 = r27
            r7 = r28
            r8 = r30
            java.lang.String r0 = "drivePoints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onCurrentItemChanged"
            r9 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onDriveSelected"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = -961250884(0xffffffffc6b479bc, float:-23100.867)
            r1 = r31
            androidx.compose.runtime.o r5 = r1.mo15009o(r0)
            r1 = r33 & 1
            r4 = 8
            if (r1 == 0) goto L_0x0063
            r1 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r5.mo14918M(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r11 = r1.mo57681a(r5, r4)
            if (r11 == 0) goto L_0x0057
            androidx.lifecycle.x0$b r13 = androidx.hilt.navigation.compose.C19298a.m90444a(r11, r5, r4)
            r1 = 564614654(0x21a755fe, float:1.1339122E-18)
            r5.mo14918M(r1)
            r12 = 0
            java.lang.Class<com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel> r10 = com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel.class
            r15 = 4168(0x1048, float:5.84E-42)
            r16 = 0
            r14 = r5
            androidx.lifecycle.v0 r1 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r10, r11, r12, r13, r14, r15, r16)
            r5.mo15002m0()
            r5.mo15002m0()
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel r1 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel) r1
            r2 = r32 & -15
            r18 = r1
            goto L_0x0067
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0063:
            r18 = r26
            r2 = r32
        L_0x0067:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0073
            r1 = -1
            java.lang.String r3 = "com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStateful (DriveCarouselStateful.kt:34)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r1, r3)
        L_0x0073:
            r15 = 0
            r10 = 1
            com.google.accompanist.pager.PagerState r11 = com.google.accompanist.pager.PagerStateKt.m64414a(r15, r5, r15, r10)
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r1 = 10
            int r1 = kotlin.collections.C10978t.m41495Y(r0, r1)
            int r1 = kotlin.collections.C10975r0.m41400j(r1)
            r2 = 16
            int r1 = kotlin.ranges.C11479u.m44447u(r1, r2)
            r12.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0095:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b2
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.carrefour.fid.android.service.presentation.model.DrivePoint r2 = (com.carrefour.fid.android.service.presentation.model.DrivePoint) r2
            if (r7 == 0) goto L_0x00a9
            float r2 = com.carrefour.fid.android.service.presentation.p044ui.drive.map.StoreLocUtilsKt.computeDistanceInMeters(r2, r7)
            goto L_0x00aa
        L_0x00a9:
            r2 = 0
        L_0x00aa:
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.put(r1, r2)
            goto L_0x0095
        L_0x00b2:
            kotlinx.coroutines.flow.u r0 = r18.getSelectedDrive$service_release()
            r13 = 0
            androidx.compose.runtime.k2 r14 = androidx.compose.runtime.C8415c2.m30233b(r0, r13, r5, r4, r10)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r3)
            java.lang.Object r0 = r5.mo14921N()
            androidx.compose.runtime.o$a r19 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r19.mo16277a()
            r2 = 2
            if (r0 != r1) goto L_0x00d7
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r13, r2, r13)
            r5.mo14893C(r0)
        L_0x00d7:
            r5.mo15002m0()
            r1 = r0
            androidx.compose.runtime.z0 r1 = (androidx.compose.runtime.C8700z0) r1
            com.carrefour.fid.android.service.presentation.model.DrivePoint r0 = DriveCarouselStateful$lambda$1(r14)
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$1 r15 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$1
            r16 = 0
            r10 = r0
            r0 = r15
            r17 = r1
            r1 = r11
            r2 = r17
            r13 = r3
            r3 = r27
            r4 = r14
            r14 = r5
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 584(0x248, float:8.18E-43)
            androidx.compose.runtime.EffectsKt.m29895g(r6, r10, r15, r14, r0)
            r15 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r15)
            boolean r0 = r14.mo15006n0(r11)
            java.lang.Object r1 = r14.mo14921N()
            if (r0 != 0) goto L_0x0111
            java.lang.Object r0 = r19.mo16277a()
            if (r1 != r0) goto L_0x0128
        L_0x0111:
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$currentPageFlow$1$1 r0 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$currentPageFlow$1$1
            r0.<init>(r11)
            kotlinx.coroutines.flow.e r0 = androidx.compose.runtime.C8415c2.m30253v(r0)
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$lambda$6$$inlined$filterNot$1 r1 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$lambda$6$$inlined$filterNot$1
            r2 = r17
            r1.<init>(r0, r2)
            kotlinx.coroutines.flow.e r1 = kotlinx.coroutines.flow.C11909g.m47451g0(r1)
            r14.mo14893C(r1)
        L_0x0128:
            r14.mo15002m0()
            r2 = r1
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$2 r10 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$2
            r5 = 0
            r0 = r10
            r1 = r11
            r3 = r27
            r4 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 576(0x240, float:8.07E-43)
            androidx.compose.runtime.EffectsKt.m29895g(r11, r6, r10, r14, r0)
            r14.mo14918M(r13)
            java.lang.Object r0 = r14.mo14921N()
            java.lang.Object r1 = r19.mo16277a()
            if (r0 != r1) goto L_0x0156
            r1 = 2
            r2 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r2, r2, r1, r2)
            r14.mo14893C(r0)
            goto L_0x0157
        L_0x0156:
            r2 = 0
        L_0x0157:
            r14.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            kotlinx.coroutines.flow.u r1 = r18.getDriveLoading()
            r3 = 8
            r4 = 1
            androidx.compose.runtime.k2 r1 = androidx.compose.runtime.C8415c2.m30233b(r1, r2, r14, r3, r4)
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r3 = 188(0xbc, float:2.63E-43)
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r20 = androidx.compose.foundation.layout.SizeKt.m10115o(r2, r3)
            androidx.compose.ui.graphics.j2$a r2 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r21 = r2.mo42850s()
            r23 = 0
            r24 = 2
            r25 = 0
            androidx.compose.ui.m r10 = androidx.compose.foundation.BackgroundKt.m8825d(r20, r21, r23, r24, r25)
            java.lang.String r13 = DriveCarouselStateful$lambda$10(r1)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.mo14918M(r1)
            boolean r1 = r14.mo15006n0(r0)
            boolean r2 = r14.mo15006n0(r8)
            r1 = r1 | r2
            java.lang.Object r2 = r14.mo14921N()
            if (r1 != 0) goto L_0x01a3
            java.lang.Object r1 = r19.mo16277a()
            if (r2 != r1) goto L_0x01ab
        L_0x01a3:
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$3$1 r2 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$3$1
            r2.<init>(r8, r0)
            r14.mo14893C(r2)
        L_0x01ab:
            r14.mo15002m0()
            r1 = r2
            kotlin.jvm.functions.l r1 = (kotlin.jvm.functions.C11300l) r1
            r16 = 512(0x200, float:7.175E-43)
            r17 = 0
            r2 = r14
            r14 = r1
            r1 = r15
            r3 = 0
            r15 = r2
            com.carrefour.fid.android.service.presentation.p044ui.drive.map.component.DriveCarouselKt.m172910DriveCarouselu5N7ek(r10, r11, r12, r13, r14, r15, r16, r17)
            com.carrefour.fid.android.service.presentation.model.DrivePoint r4 = DriveCarouselStateful$lambda$8(r0)
            if (r4 != 0) goto L_0x01c4
            goto L_0x020e
        L_0x01c4:
            int r5 = com.carrefour.fid.android.service.C28330R.string.drive_collaborator_popup_title
            java.lang.String r11 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r2, r3)
            int r5 = com.carrefour.fid.android.service.C28330R.string.drive_collaborator_popup_message
            java.lang.String r12 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r2, r3)
            int r5 = com.carrefour.fid.android.service.C28330R.string.drive_map_select_button
            java.lang.String r13 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r2, r3)
            int r5 = com.carrefour.fid.android.service.C28330R.string.general_cancel
            java.lang.String r14 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r2, r3)
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$4$1 r15 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$4$1
            r15.<init>(r8, r4)
            r2.mo14918M(r1)
            boolean r1 = r2.mo15006n0(r0)
            java.lang.Object r3 = r2.mo14921N()
            if (r1 != 0) goto L_0x01f4
            java.lang.Object r1 = r19.mo16277a()
            if (r3 != r1) goto L_0x01fc
        L_0x01f4:
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$4$2$1 r3 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$4$2$1
            r3.<init>(r0)
            r2.mo14893C(r3)
        L_0x01fc:
            r2.mo15002m0()
            r16 = r3
            kotlin.jvm.functions.a r16 = (kotlin.jvm.functions.C11289a) r16
            com.carrefour.fid.android.design.components.compose.f$b r0 = new com.carrefour.fid.android.design.components.compose.f$b
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            int r1 = com.carrefour.fid.android.design.components.compose.C36984f.C36986b.f92385g
            com.carrefour.fid.android.design.components.compose.DialogComponentKt.m151480c(r0, r2, r1)
        L_0x020e:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0217
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0217:
            androidx.compose.runtime.t1 r10 = r2.mo15020s()
            if (r10 != 0) goto L_0x021e
            goto L_0x0235
        L_0x021e:
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$5 r11 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$5
            r0 = r11
            r1 = r18
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r32
            r7 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.mo15202a(r11)
        L_0x0235:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveCarouselStatefulKt.DriveCarouselStateful(com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel, java.util.List, android.location.Location, kotlin.jvm.functions.l, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final DrivePoint DriveCarouselStateful$lambda$1(C8578k2<DrivePoint> k2Var) {
        return k2Var.getValue();
    }

    private static final String DriveCarouselStateful$lambda$10(C8578k2<C38146a> k2Var) {
        C38146a value = k2Var.getValue();
        if (value != null) {
            return value.mo119248h();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean DriveCarouselStateful$lambda$3(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void DriveCarouselStateful$lambda$4(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    private static final DrivePoint DriveCarouselStateful$lambda$8(C8700z0<DrivePoint> z0Var) {
        return z0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void DriveCarouselStateful$lambda$9(C8700z0<DrivePoint> z0Var, DrivePoint drivePoint) {
        z0Var.setValue(drivePoint);
    }

    /* access modifiers changed from: private */
    public static final boolean isDriveCollaboratorReserved(DrivePoint drivePoint) {
        return Intrinsics.areEqual((Object) drivePoint.getStoreId(), (Object) StoreServiceConstantsKt.STORE_COLLABORATOR_ID);
    }
}
