package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel", mo22502f = "DriveMapViewModel.kt", mo22503i = {0, 0, 0, 1, 2}, mo22504l = {118, 130, 132, 135}, mo22505m = "selectDriveOrNavigateToSummary", mo22506n = {"this", "drivePoint", "distanceMeters", "this", "this"}, mo22507s = {"L$0", "L$1", "F$0", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DriveMapViewModel$selectDriveOrNavigateToSummary$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DriveMapViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveMapViewModel$selectDriveOrNavigateToSummary$1(DriveMapViewModel driveMapViewModel, C11045c<? super DriveMapViewModel$selectDriveOrNavigateToSummary$1> cVar) {
        super(cVar);
        this.this$0 = driveMapViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.selectDriveOrNavigateToSummary((DrivePoint) null, 0.0f, this);
    }
}
