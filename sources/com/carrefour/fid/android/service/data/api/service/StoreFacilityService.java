package com.carrefour.fid.android.service.data.api.service;

import com.carrefour.fid.android.service.data.api.entities.FacilitiesGeolocationResponse;
import com.carrefour.fid.android.service.data.api.entities.StoreFacilityResponse;
import com.carrefour.fid.android.service.data.api.entities.StoreServicesPictosResponse;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.http.C13027f;
import retrofit2.http.C13041t;
import retrofit2.http.C13046y;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J)\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ[\u0010\u0016\u001a\u00020\u00152\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/service/StoreFacilityService;", "", "", "url", "Lcom/carrefour/fid/android/service/data/api/entities/StoreFacilityResponse;", "getFacilities", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/service/data/api/entities/StoreServicesPictosResponse;", "getServicePicto", "postalCode", "cityName", "getEligibilityPostalCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "longitude", "latitude", "", "radius", "serviceTypes", "size", "page", "Lcom/carrefour/fid/android/service/data/api/entities/FacilitiesGeolocationResponse;", "getFacilitiesGeolocation", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/c;)Ljava/lang/Object;", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface StoreFacilityService {
    @C12580l
    @C13027f("retail/v2/mof/facilities_geolocation/facilities/delivery_services")
    Object getEligibilityPostalCode(@C13041t("post_code") @C12579k String str, @C12580l @C13041t("city_name") String str2, @C12579k C11045c<? super StoreFacilityResponse> cVar);

    @C12580l
    @C13027f
    Object getFacilities(@C12579k @C13046y String str, @C12579k C11045c<? super StoreFacilityResponse> cVar);

    @C12580l
    @C13027f("retail/v1/stores-management/stores")
    Object getFacilitiesGeolocation(@C12580l @C13041t("longitude") Double d, @C12580l @C13041t("latitude") Double d2, @C12580l @C13041t("radius") Integer num, @C12580l @C13041t("service_types") String str, @C12580l @C13041t("size") Integer num2, @C12580l @C13041t("page") Integer num3, @C12579k C11045c<? super FacilitiesGeolocationResponse> cVar);

    @C12580l
    @C13027f
    Object getServicePicto(@C12579k @C13046y String str, @C12579k C11045c<? super StoreServicesPictosResponse> cVar);
}
