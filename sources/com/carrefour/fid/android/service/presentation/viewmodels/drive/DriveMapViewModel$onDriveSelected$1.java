package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import com.carrefour.fid.android.domain.models.service.models.C38146a;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$onDriveSelected$1", mo22502f = "DriveMapViewModel.kt", mo22503i = {}, mo22504l = {109}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DriveMapViewModel$onDriveSelected$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ float $distanceMeters;
    final /* synthetic */ DrivePoint $drivePoint;
    int label;
    final /* synthetic */ DriveMapViewModel this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$onDriveSelected$1$1", mo22502f = "DriveMapViewModel.kt", mo22503i = {}, mo22504l = {111}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$onDriveSelected$1$1 */
    public static final class C284391 extends SuspendLambda implements C11300l<C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
            return new C284391(driveMapViewModel, drivePoint, f, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                DriveMapViewModel driveMapViewModel = driveMapViewModel;
                DrivePoint drivePoint = drivePoint;
                float f = f;
                this.label = 1;
                if (driveMapViewModel.selectDriveOrNavigateToSummary(drivePoint, f, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12580l C11045c<? super C11079d2> cVar) {
            return ((C284391) create(cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveMapViewModel$onDriveSelected$1(DriveMapViewModel driveMapViewModel, DrivePoint drivePoint, float f, C11045c<? super DriveMapViewModel$onDriveSelected$1> cVar) {
        super(2, cVar);
        this.this$0 = driveMapViewModel;
        this.$drivePoint = drivePoint;
        this.$distanceMeters = f;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DriveMapViewModel$onDriveSelected$1(this.this$0, this.$drivePoint, this.$distanceMeters, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            this.this$0.analytics.tagChooseDrive(this.$drivePoint.getStoreId());
            this.this$0._driveLoading.setValue(C38146a.m158071a(C38146a.m158072b(this.$drivePoint.getStoreId())));
            final DriveMapViewModel driveMapViewModel = this.this$0;
            final DrivePoint drivePoint = this.$drivePoint;
            final float f = this.$distanceMeters;
            C284391 r1 = new C284391((C11045c<? super C284391>) null);
            this.label = 1;
            if (driveMapViewModel.checkBillingAddress(r1, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0._driveLoading.setValue(null);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DriveMapViewModel$onDriveSelected$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
