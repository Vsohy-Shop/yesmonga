package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.C36377a;
import com.carrefour.fid.android.data.entities.APIMProducts;
import com.carrefour.fid.android.data.entities.APIMSuggestionList;
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
import retrofit2.http.C13042u;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J§\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014Ja\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00112\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/b;", "", "", "", "headerMap", "facilityServiceId", "queryGroup", "profile", "", "productFrom", "productSize", "text", "storedQueryId", "mode", "Lcom/carrefour/fid/android/data/a;", "facetFilter", "sort", "Lretrofit2/w;", "Lcom/carrefour/fid/android/data/entities/APIMProducts;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/a;Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/entities/APIMSuggestionList;", "b", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/c;)Ljava/lang/Object;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.b */
public interface C36621b {

    /* renamed from: com.carrefour.fid.android.data.service.b$a */
    public static final class C36622a {
        /* renamed from: a */
        public static /* synthetic */ Object m150241a(C36621b bVar, Map map, String str, String str2, String str3, int i, int i2, C11045c cVar, int i3, Object obj) {
            if (obj == null) {
                return bVar.mo111633b(map, str, str2, str3, (i3 & 16) != 0 ? 0 : i, i2, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProductSearchSuggestions");
        }
    }

    @C12580l
    @C13027f("retail/v1/mof/one_search/facilities_services/{facility_service_id}/products")
    /* renamed from: a */
    Object mo111632a(@C12579k @C13031j Map<String, String> map, @C13040s("facility_service_id") @C12579k String str, @C12580l @C13041t("queryGroup") String str2, @C13041t("profile") @C12579k String str3, @C13041t("productFrom") int i, @C13041t("productSize") int i2, @C12580l @C13041t("text") String str4, @C12580l @C13041t("storedQueryId") String str5, @C12580l @C13041t("mode") String str6, @C12579k @C13042u C36377a aVar, @C12579k @C13042u Map<String, String> map2, @C12579k C11045c<? super C13091w<APIMProducts>> cVar);

    @C12580l
    @C13027f("retail/v1/mof/one_search/product_display/facilities_services/{facility_service_id}/autocomplete")
    /* renamed from: b */
    Object mo111633b(@C12579k @C13031j Map<String, String> map, @C13040s("facility_service_id") @C12579k String str, @C13041t("profile") @C12579k String str2, @C13041t("text") @C12579k String str3, @C13041t("productFrom") int i, @C13041t("productSize") int i2, @C12579k C11045c<? super C13091w<APIMSuggestionList>> cVar);
}
