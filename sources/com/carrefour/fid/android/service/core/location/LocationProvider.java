package com.carrefour.fid.android.service.core.location;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.LatLon;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/core/location/LocationProvider;", "", "Lcom/carrefour/fid/android/domain/models/LatLon;", "getCurrentLocation", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "RequirePermissionError", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface LocationProvider {

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/core/location/LocationProvider$RequirePermissionError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class RequirePermissionError extends Exception {
        public static final int $stable = 0;
    }

    @C12580l
    Object getCurrentLocation(@C12579k C11045c<? super LatLon> cVar);
}
