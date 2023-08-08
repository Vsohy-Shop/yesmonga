package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import com.carrefour.fid.android.domain.models.LatLon;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel;
import com.google.android.gms.maps.model.LatLng;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$onCameraIdle$1", mo22502f = "PickupPointsMapFragment.kt", mo22503i = {}, mo22504l = {302}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$onCameraIdle$1 */
public final class PickupPointsMapFragment$onCameraIdle$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ LatLng $latLng;
    int label;
    final /* synthetic */ PickupPointsMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointsMapFragment$onCameraIdle$1(PickupPointsMapFragment pickupPointsMapFragment, LatLng latLng, C11045c<? super PickupPointsMapFragment$onCameraIdle$1> cVar) {
        super(2, cVar);
        this.this$0 = pickupPointsMapFragment;
        this.$latLng = latLng;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PickupPointsMapFragment$onCameraIdle$1(this.this$0, this.$latLng, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            PickupPointsMapViewModel T0 = this.this$0.mo69439i1();
            LatLng latLng = this.$latLng;
            LatLon latLon = new LatLon(latLng.f73028a, latLng.f73029b);
            this.label = 1;
            if (PickupPointsMapViewModel.m111871d0(T0, latLon, false, this, 2, (Object) null) == h) {
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
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PickupPointsMapFragment$onCameraIdle$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
