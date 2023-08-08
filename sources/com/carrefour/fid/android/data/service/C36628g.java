package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.entities.APIMCatalogsResponse;
import com.carrefour.fid.android.shared.network.converters.C28807c;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13040s;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JM\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/g;", "", "", "facilityServiceId", "", "mergeCatalogs", "profile", "", "headerMap", "Lretrofit2/w;", "Lcom/carrefour/fid/android/data/entities/APIMCatalogsResponse;", "a", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.g */
public interface C36628g {
    @C12580l
    @C28807c("merged_catalogs")
    @C13027f("retail/v1/mof/one_search/facilities_services/{facility_service_id}/category_trees")
    /* renamed from: a */
    Object mo111642a(@C13040s("facility_service_id") @C12579k String str, @C13041t("merge_catalogs") boolean z, @C13041t("profile") @C12579k String str2, @C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<APIMCatalogsResponse>> cVar);
}
