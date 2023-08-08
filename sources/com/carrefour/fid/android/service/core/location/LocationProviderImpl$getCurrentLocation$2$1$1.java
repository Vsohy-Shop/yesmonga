package com.carrefour.fid.android.service.core.location;

import android.location.Location;
import com.carrefour.fid.android.domain.models.LatLon;
import com.carrefour.fid.android.service.core.location.LocationProvider;
import com.google.android.gms.tasks.C31033d;
import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31037f;
import com.google.android.gms.tasks.C31047k;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.core.location.LocationProviderImpl$getCurrentLocation$2$1$1", mo22502f = "LocationProviderImpl.kt", mo22503i = {}, mo22504l = {40}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LocationProviderImpl$getCurrentLocation$2$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C12072o<LatLon> $cont;
    int label;
    final /* synthetic */ LocationProviderImpl this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.service.core.location.LocationProviderImpl$getCurrentLocation$2$1$1$1", mo22502f = "LocationProviderImpl.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lcom/google/android/gms/tasks/k;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.core.location.LocationProviderImpl$getCurrentLocation$2$1$1$1 */
    public static final class C283401 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C31047k<Location>>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C283401(locationProviderImpl, oVar, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C31047k<Location> H = locationProviderImpl.locationProvider.mo85673H(100, locationProviderImpl.cancellationTokenSource.mo87709b());
                final C12072o<LatLon> oVar = oVar;
                C31047k<Location> e = H.mo87721e(new C31035e() {
                    public final void onComplete(@C12579k C31047k<Location> kVar) {
                        LatLon latLon;
                        Intrinsics.checkNotNullParameter(kVar, "task");
                        Location r = kVar.mo87734r();
                        if (r != null) {
                            latLon = new LatLon(r.getLatitude(), r.getLongitude());
                        } else {
                            latLon = null;
                        }
                        oVar.mo24532O(latLon, C283421.INSTANCE);
                    }
                });
                final C12072o<LatLon> oVar2 = oVar;
                C31047k<Location> h = e.mo87724h(new C31037f() {
                    public final void onFailure(@C12579k Exception exc) {
                        Intrinsics.checkNotNullParameter(exc, "it");
                        oVar2.mo24532O(null, C283441.INSTANCE);
                    }
                });
                final C12072o<LatLon> oVar3 = oVar;
                return h.mo87718b(new C31033d() {
                    public final void onCanceled() {
                        oVar3.mo24532O(null, C283461.INSTANCE);
                    }
                });
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C31047k<Location>> cVar) {
            return ((C283401) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationProviderImpl$getCurrentLocation$2$1$1(LocationProviderImpl locationProviderImpl, C12072o<? super LatLon> oVar, C11045c<? super LocationProviderImpl$getCurrentLocation$2$1$1> cVar) {
        super(2, cVar);
        this.this$0 = locationProviderImpl;
        this.$cont = oVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LocationProviderImpl$getCurrentLocation$2$1$1(this.this$0, this.$cont, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            if (LocationProviderImpl$getCurrentLocation$2.invokeSuspend$checkPerm(this.this$0, "android.permission.ACCESS_FINE_LOCATION") || LocationProviderImpl$getCurrentLocation$2.invokeSuspend$checkPerm(this.this$0, "android.permission.ACCESS_COARSE_LOCATION")) {
                long access$getTimeout$p = this.this$0.timeout;
                final LocationProviderImpl locationProviderImpl = this.this$0;
                final C12072o<LatLon> oVar = this.$cont;
                C283401 r8 = new C283401((C11045c<? super C283401>) null);
                this.label = 1;
                if (TimeoutKt.m46064e(access$getTimeout$p, r8, this) == h) {
                    return h;
                }
            } else {
                throw new LocationProvider.RequirePermissionError();
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
        return ((LocationProviderImpl$getCurrentLocation$2$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
