package com.carrefour.fid.android.checkout.data.api.services;

import com.carrefour.fid.android.checkout.data.api.entities.p068v1.request.GetWalletsRequest;
import com.carrefour.fid.android.checkout.data.api.entities.p068v1.response.GetWalletsResponse;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13036o;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/services/a;", "", "Lcom/carrefour/fid/android/checkout/data/api/entities/v1/request/GetWalletsRequest;", "body", "Lretrofit2/w;", "Lcom/carrefour/fid/android/checkout/data/api/entities/v1/response/GetWalletsResponse;", "a", "(Lcom/carrefour/fid/android/checkout/data/api/entities/v1/request/GetWalletsRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.checkout.data.api.services.a */
public interface C39837a {
    @C13036o("retail/v1/mof/online-payment/wallets")
    @C12580l
    /* renamed from: a */
    Object mo131381a(@C12579k @C13022a GetWalletsRequest getWalletsRequest, @C12579k C11045c<? super C13091w<GetWalletsResponse>> cVar);
}
