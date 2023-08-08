package com.carrefour.fid.android.service.core.location;

import android.content.Context;
import com.carrefour.fid.android.domain.models.LatLon;
import com.google.android.gms.location.C30327e;
import com.google.android.gms.location.C30362m;
import com.google.android.gms.tasks.C31029b;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002XD¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/core/location/LocationProviderImpl;", "Lcom/carrefour/fid/android/service/core/location/LocationProvider;", "Lcom/carrefour/fid/android/domain/models/LatLon;", "getCurrentLocation", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "Lcom/google/android/gms/location/e;", "locationProvider", "Lcom/google/android/gms/location/e;", "Lcom/google/android/gms/tasks/b;", "cancellationTokenSource", "Lcom/google/android/gms/tasks/b;", "", "timeout", "J", "<init>", "(Landroid/content/Context;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class LocationProviderImpl implements LocationProvider {
    @C12579k
    private final Context appContext;
    /* access modifiers changed from: private */
    @C12579k
    public final C31029b cancellationTokenSource = new C31029b();
    /* access modifiers changed from: private */
    @C12579k
    public C30327e locationProvider;
    /* access modifiers changed from: private */
    public final long timeout = 4000;

    @Inject
    public LocationProviderImpl(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "appContext");
        this.appContext = context;
        C30327e b = C30362m.m122188b(context);
        Intrinsics.checkNotNullExpressionValue(b, "getFusedLocationProviderClient(appContext)");
        this.locationProvider = b;
    }

    @C12579k
    public final Context getAppContext() {
        return this.appContext;
    }

    @C12580l
    public Object getCurrentLocation(@C12579k C11045c<? super LatLon> cVar) {
        return C12079p0.m48266g(new LocationProviderImpl$getCurrentLocation$2(this, (C11045c<? super LocationProviderImpl$getCurrentLocation$2>) null), cVar);
    }
}
