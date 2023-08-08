package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.entities.APIMProductDetailsBody;
import com.carrefour.fid.android.data.entities.APIMProductDetailsResponse;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13031j;
import retrofit2.http.C13036o;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/a;", "", "", "", "headerMap", "Lcom/carrefour/fid/android/data/entities/APIMProductDetailsBody;", "productDetailsBody", "Lretrofit2/w;", "Lcom/carrefour/fid/android/data/entities/APIMProductDetailsResponse;", "a", "(Ljava/util/Map;Lcom/carrefour/fid/android/data/entities/APIMProductDetailsBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.a */
public interface C36620a {
    @C13036o("retail/v2/mof/one_products/facilities_services/some/products/some/offers")
    @C12580l
    /* renamed from: a */
    Object mo111631a(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a APIMProductDetailsBody aPIMProductDetailsBody, @C12579k C11045c<? super C13091w<APIMProductDetailsResponse>> cVar);
}
