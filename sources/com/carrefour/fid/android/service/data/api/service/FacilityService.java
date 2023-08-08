package com.carrefour.fid.android.service.data.api.service;

import com.carrefour.fid.android.service.data.api.entities.DetailedFacilityResponse;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.http.C13027f;
import retrofit2.http.C13040s;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/service/FacilityService;", "", "", "anabelKey", "", "isMirror", "Lcom/carrefour/fid/android/service/data/api/entities/DetailedFacilityResponse;", "getStoreByAnabel", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/c;)Ljava/lang/Object;", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface FacilityService {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getStoreByAnabel$default(FacilityService facilityService, String str, Boolean bool, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bool = null;
                }
                return facilityService.getStoreByAnabel(str, bool, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStoreByAnabel");
        }
    }

    @C12580l
    @C13027f("retail/v2/mof/facilities_geolocation/facilities/{anabel_key}")
    Object getStoreByAnabel(@C13040s("anabel_key") @C12579k String str, @C12580l @C13041t("is_mirror") Boolean bool, @C12579k C11045c<? super DetailedFacilityResponse> cVar);
}
