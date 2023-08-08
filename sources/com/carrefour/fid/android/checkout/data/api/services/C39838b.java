package com.carrefour.fid.android.checkout.data.api.services;

import com.carrefour.fid.android.checkout.data.api.entities.p069v2.request.SlotH1h3RequestBody;
import com.carrefour.fid.android.checkout.data.api.entities.p069v2.request.SlotYieldServiceRequestBody;
import com.carrefour.fid.android.checkout.data.api.entities.p069v2.response.SlotExpressResponse;
import com.carrefour.fid.android.checkout.data.api.entities.p069v2.response.SlotListResponse;
import com.carrefour.fid.android.checkout.data.api.entities.p069v2.response.SlotResponse;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13027f;
import retrofit2.http.C13036o;
import retrofit2.http.C13040s;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0017H§@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/services/b;", "", "", "facilityServiceId", "Lretrofit2/w;", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotListResponse;", "b", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "dateBegin", "dateEnd", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "slotId", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotResponse;", "f", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotExpressResponse;", "a", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody;", "body", "c", "(Ljava/lang/String;Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "facility_service_id", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotH1h3RequestBody;", "e", "(Ljava/lang/String;Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotH1h3RequestBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.checkout.data.api.services.b */
public interface C39838b {
    @C12580l
    @C13027f("retail/v2/mof/one_slot/slots/express")
    /* renamed from: a */
    Object mo131382a(@C13041t("facility_service_id") @C12579k String str, @C12579k C11045c<? super C13091w<SlotExpressResponse>> cVar);

    @C12580l
    @C13027f("retail/v2/mof/one_slot/slots")
    /* renamed from: b */
    Object mo131383b(@C13041t("facility_service_id") @C12579k String str, @C12579k C11045c<? super C13091w<SlotListResponse>> cVar);

    @C13036o("retail/v2/mof/one_slot/service/{facility_service_id}/slots")
    @C12580l
    /* renamed from: c */
    Object mo131384c(@C13040s("facility_service_id") @C12579k String str, @C12579k @C13022a SlotYieldServiceRequestBody slotYieldServiceRequestBody, @C12579k C11045c<? super C13091w<SlotListResponse>> cVar);

    @C12580l
    @C13027f("retail/v2/mof/one_slot/slots")
    /* renamed from: d */
    Object mo131385d(@C13041t("facility_service_id") @C12579k String str, @C13041t("date_begin") @C12579k String str2, @C13041t("date_end") @C12579k String str3, @C12579k C11045c<? super C13091w<SlotListResponse>> cVar);

    @C13036o("retail/v2/mof/one_slot/service/{facility_service_id}/slots")
    @C12580l
    /* renamed from: e */
    Object mo131386e(@C13040s("facility_service_id") @C12579k String str, @C12579k @C13022a SlotH1h3RequestBody slotH1h3RequestBody, @C12579k C11045c<? super C13091w<SlotListResponse>> cVar);

    @C12580l
    @C13027f("retail/v2/mof/one_slot/slots/{id}")
    /* renamed from: f */
    Object mo131387f(@C13040s("id") @C12579k String str, @C13041t("facility_service_id") @C12579k String str2, @C12579k C11045c<? super C13091w<SlotResponse>> cVar);
}
