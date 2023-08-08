package com.carrefour.fid.android.storelocator.presentation.presenters;

import com.carrefour.fid.android.core.p057io.OneAppServiceException;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37830b;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import com.google.android.gms.maps.model.LatLng;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.storelocator.presentation.presenters.FacilitiesSearchPresenter$fetchStoreByCoordinates$1", mo22502f = "FacilitiesSearchPresenter.kt", mo22503i = {}, mo22504l = {229}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FacilitiesSearchPresenter$fetchStoreByCoordinates$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ LatLng $geoCoordinates;
    final /* synthetic */ boolean $isFromCameraMoved;
    int label;
    final /* synthetic */ FacilitiesSearchPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacilitiesSearchPresenter$fetchStoreByCoordinates$1(FacilitiesSearchPresenter facilitiesSearchPresenter, LatLng latLng, boolean z, C11045c<? super FacilitiesSearchPresenter$fetchStoreByCoordinates$1> cVar) {
        super(2, cVar);
        this.this$0 = facilitiesSearchPresenter;
        this.$geoCoordinates = latLng;
        this.$isFromCameraMoved = z;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FacilitiesSearchPresenter$fetchStoreByCoordinates$1(this.this$0, this.$geoCoordinates, this.$isFromCameraMoved, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        OneAppServiceException oneAppServiceException;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37830b n = this.this$0.mo84337x().mo34028n();
            LatLng latLng = this.$geoCoordinates;
            C37830b.C37831a aVar = new C37830b.C37831a(latLng.f73028a, latLng.f73029b);
            this.label = 1;
            obj2 = n.m172966invokegIAlus(aVar, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FacilitiesSearchPresenter facilitiesSearchPresenter = this.this$0;
        boolean z = this.$isFromCameraMoved;
        if (Result.m38710j(obj2)) {
            facilitiesSearchPresenter.mo84334u((C38166m) obj2, z);
        }
        boolean z2 = this.$isFromCameraMoved;
        FacilitiesSearchPresenter facilitiesSearchPresenter2 = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null && !z2) {
            if (e instanceof OneAppServiceException) {
                oneAppServiceException = (OneAppServiceException) e;
            } else {
                oneAppServiceException = null;
            }
            facilitiesSearchPresenter2.mo84303g(oneAppServiceException);
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FacilitiesSearchPresenter$fetchStoreByCoordinates$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
