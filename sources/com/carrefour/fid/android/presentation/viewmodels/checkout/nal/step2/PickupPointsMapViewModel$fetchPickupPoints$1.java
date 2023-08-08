package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import com.carrefour.fid.android.domain.models.LatLon;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel", mo22502f = "PickupPointsMapViewModel.kt", mo22503i = {0, 0}, mo22504l = {32}, mo22505m = "fetchPickupPoints", mo22506n = {"this", "navigateToPickupPoints"}, mo22507s = {"L$0", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PickupPointsMapViewModel$fetchPickupPoints$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PickupPointsMapViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointsMapViewModel$fetchPickupPoints$1(PickupPointsMapViewModel pickupPointsMapViewModel, C11045c<? super PickupPointsMapViewModel$fetchPickupPoints$1> cVar) {
        super(cVar);
        this.this$0 = pickupPointsMapViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo76067c0((LatLon) null, false, this);
    }
}
