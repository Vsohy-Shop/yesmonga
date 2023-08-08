package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.entities.CurrentCampaignsResponse;
import com.carrefour.fid.android.data.entities.ServiceStationsTicketCardResponse;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13033l;
import retrofit2.http.C13036o;
import retrofit2.http.C13038q;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/n;", "", "", "", "headerMap", "Lretrofit2/w;", "Lcom/carrefour/fid/android/data/entities/CurrentCampaignsResponse;", "a", "(Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lokhttp3/MultipartBody$Part;", "pictureFile", "Lokhttp3/RequestBody;", "pictureDate", "Lcom/carrefour/fid/android/data/entities/ServiceStationsTicketCardResponse;", "b", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.n */
public interface C36635n {
    @C12580l
    @C13027f("retail/v1/mof/gaz_stations/loyalty/campaigns?type=current")
    /* renamed from: a */
    Object mo111661a(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<CurrentCampaignsResponse>> cVar);

    @C13036o("retail/v1/mof/gaz_stations/loyalty/loyalty_card/one/receipts")
    @C12580l
    @C13033l
    /* renamed from: b */
    Object mo111662b(@C12579k @C13031j Map<String, String> map, @C12579k @C13038q MultipartBody.Part part, @C12579k @C13038q("photoTimestamp") RequestBody requestBody, @C12579k C11045c<? super C13091w<ServiceStationsTicketCardResponse>> cVar);
}
