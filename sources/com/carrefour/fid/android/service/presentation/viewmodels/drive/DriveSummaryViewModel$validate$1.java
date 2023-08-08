package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import com.carrefour.fid.android.domain.models.service.models.DriveType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel$validate$1", mo22502f = "DriveSummaryViewModel.kt", mo22503i = {0}, mo22504l = {82, 89, 94}, mo22505m = "invokeSuspend", mo22506n = {"serviceToSelect"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveSummaryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveSummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryViewModel$validate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n288#2,2:106\n*S KotlinDebug\n*F\n+ 1 DriveSummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryViewModel$validate$1\n*L\n79#1:106,2\n*E\n"})
public final class DriveSummaryViewModel$validate$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ DriveType $driveType;
    Object L$0;
    int label;
    final /* synthetic */ DriveSummaryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryViewModel$validate$1(DriveSummaryViewModel driveSummaryViewModel, DriveType driveType, C11045c<? super DriveSummaryViewModel$validate$1> cVar) {
        super(2, cVar);
        this.this$0 = driveSummaryViewModel;
        this.$driveType = driveType;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DriveSummaryViewModel$validate$1(this.this$0, this.$driveType, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r10.label
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 == r5) goto L_0x002a
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00ff
        L_0x0017:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001f:
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x00cf
        L_0x002a:
            java.lang.Object r1 = r10.L$0
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r1
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            r11.mo21858l()
            goto L_0x00b2
        L_0x0038:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel r11 = r10.this$0
            com.carrefour.fid.android.service.presentation.analytics.drive.DriveSummaryAnalyticsReporter r11 = r11.getAnalytics()
            r11.tagValidatePressed()
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel r11 = r10.this$0
            kotlinx.coroutines.flow.j r11 = r11._validateEnabled
            r1 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r1)
            r11.setValue(r6)
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel r11 = r10.this$0
            kotlinx.coroutines.flow.u r11 = r11.getDataState()
            java.lang.Object r11 = r11.getValue()
            com.carrefour.fid.android.shared.type.e r11 = (com.carrefour.fid.android.shared.type.C28892e) r11
            java.lang.Object r11 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r11)
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState r11 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState) r11
            if (r11 == 0) goto L_0x010f
            com.carrefour.fid.android.domain.models.service.models.l r11 = r11.getStore()
            if (r11 != 0) goto L_0x006e
            goto L_0x010f
        L_0x006e:
            java.util.List r6 = r11.mo119367K()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.carrefour.fid.android.domain.models.service.models.DriveType r7 = r10.$driveType
            java.util.Iterator r6 = r6.iterator()
        L_0x007a:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0093
            java.lang.Object r8 = r6.next()
            r9 = r8
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r9
            com.carrefour.fid.android.domain.models.service.models.DriveType r9 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.getDriveType(r9)
            if (r9 != r7) goto L_0x008f
            r9 = r5
            goto L_0x0090
        L_0x008f:
            r9 = r1
        L_0x0090:
            if (r9 == 0) goto L_0x007a
            goto L_0x0094
        L_0x0093:
            r8 = r4
        L_0x0094:
            r1 = r8
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r1
            if (r1 != 0) goto L_0x009c
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        L_0x009c:
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel r6 = r10.this$0
            com.carrefour.fid.android.domain.interactors.service.s r6 = r6.setServiceSelectionUseCase
            com.carrefour.fid.android.domain.interactors.service.s$a r7 = new com.carrefour.fid.android.domain.interactors.service.s$a
            r7.<init>(r11, r1)
            r10.L$0 = r1
            r10.label = r5
            java.lang.Object r11 = r6.m172966invokegIAlus(r7, r10)
            if (r11 != r0) goto L_0x00b2
            return r0
        L_0x00b2:
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel r11 = r10.this$0
            com.carrefour.fid.android.domain.interactors.basket.j0 r11 = r11.switchFacilityServiceInBasketUseCase
            java.lang.String r1 = r1.mo119163G()
            java.lang.String r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)
            com.carrefour.fid.android.domain.models.service.models.FacilityServiceId r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r1)
            r10.L$0 = r4
            r10.label = r3
            java.lang.Object r11 = r11.m172966invokegIAlus(r1, r10)
            if (r11 != r0) goto L_0x00cf
            return r0
        L_0x00cf:
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel r1 = r10.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r11)
            if (r3 == 0) goto L_0x00e3
            kotlinx.coroutines.flow.j r1 = r1._state
            com.carrefour.fid.android.shared.type.e$a r3 = new com.carrefour.fid.android.shared.type.e$a
            r3.<init>(r4)
            r1.setValue(r3)
        L_0x00e3:
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel r1 = r10.this$0
            boolean r3 = kotlin.Result.m38710j(r11)
            if (r3 == 0) goto L_0x00ff
            r3 = r11
            com.carrefour.fid.android.domain.models.basket.Basket r3 = (com.carrefour.fid.android.domain.models.basket.Basket) r3
            kotlinx.coroutines.channels.g r1 = r1._navigateToHomeEvent
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r10.L$0 = r11
            r10.label = r2
            java.lang.Object r11 = r1.mo23757h0(r3, r10)
            if (r11 != r0) goto L_0x00ff
            return r0
        L_0x00ff:
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel r11 = r10.this$0
            kotlinx.coroutines.flow.j r11 = r11._validateEnabled
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            r11.setValue(r0)
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        L_0x010f:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel$validate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DriveSummaryViewModel$validate$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
