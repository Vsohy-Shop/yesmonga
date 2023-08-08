package com.carrefour.fid.android.service.core.location;

import androidx.core.content.C17318d;
import com.carrefour.fid.android.domain.models.LatLon;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.core.location.LocationProviderImpl$getCurrentLocation$2", mo22502f = "LocationProviderImpl.kt", mo22503i = {0}, mo22504l = {75}, mo22505m = "invokeSuspend", mo22506n = {"$this$coroutineScope"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lcom/carrefour/fid/android/domain/models/LatLon;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLocationProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationProviderImpl.kt\ncom/carrefour/fid/android/service/core/location/LocationProviderImpl$getCurrentLocation$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,74:1\n314#2,11:75\n*S KotlinDebug\n*F\n+ 1 LocationProviderImpl.kt\ncom/carrefour/fid/android/service/core/location/LocationProviderImpl$getCurrentLocation$2\n*L\n35#1:75,11\n*E\n"})
public final class LocationProviderImpl$getCurrentLocation$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super LatLon>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LocationProviderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationProviderImpl$getCurrentLocation$2(LocationProviderImpl locationProviderImpl, C11045c<? super LocationProviderImpl$getCurrentLocation$2> cVar) {
        super(2, cVar);
        this.this$0 = locationProviderImpl;
    }

    /* access modifiers changed from: private */
    public static final boolean invokeSuspend$checkPerm(LocationProviderImpl locationProviderImpl, String str) {
        if (C17318d.m79718a(locationProviderImpl.getAppContext(), str) == 0) {
            return true;
        }
        return false;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        LocationProviderImpl$getCurrentLocation$2 locationProviderImpl$getCurrentLocation$2 = new LocationProviderImpl$getCurrentLocation$2(this.this$0, cVar);
        locationProviderImpl$getCurrentLocation$2.L$0 = obj;
        return locationProviderImpl$getCurrentLocation$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var = (C12074o0) this.L$0;
            LocationProviderImpl locationProviderImpl = this.this$0;
            this.L$0 = o0Var;
            this.L$1 = locationProviderImpl;
            this.label = 1;
            C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(this), 1);
            pVar.mo24537e0();
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new LocationProviderImpl$getCurrentLocation$2$1$1(locationProviderImpl, pVar, (C11045c<? super LocationProviderImpl$getCurrentLocation$2$1$1>) null), 3, (Object) null);
            obj = pVar.mo24572y();
            if (obj == C11063b.m42612h()) {
                C11069f.m42638c(this);
            }
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            LocationProviderImpl locationProviderImpl2 = (LocationProviderImpl) this.L$1;
            C12074o0 o0Var2 = (C12074o0) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super LatLon> cVar) {
        return ((LocationProviderImpl$getCurrentLocation$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
