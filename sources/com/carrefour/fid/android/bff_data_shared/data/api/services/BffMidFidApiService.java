package com.carrefour.fid.android.bff_data_shared.data.api.services;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13030i;
import retrofit2.http.C13036o;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J9\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJC\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffMidFidApiService;", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;", "body", "", "accessToken", "bearerToken", "Lretrofit2/w;", "Lkotlin/d2;", "createLoyaltyCard", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "loyaltyCardId", "attachLoyaltyCard", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface BffMidFidApiService {
    @C13036o("customers/me/loyalty/card")
    @C12580l
    Object attachLoyaltyCard(@C12580l @C13022a BffCreateOrAttachCardBody bffCreateOrAttachCardBody, @C12579k @C13030i("access-token") String str, @C12579k @C13030i("Authorization") String str2, @C12579k @C13030i("Loyalty-card-Id") String str3, @C12579k C11045c<? super C13091w<C11079d2>> cVar);

    @C13036o("customers/me/loyalty/card")
    @C12580l
    Object createLoyaltyCard(@C12580l @C13022a BffCreateOrAttachCardBody bffCreateOrAttachCardBody, @C12579k @C13030i("access-token") String str, @C12579k @C13030i("Authorization") String str2, @C12579k C11045c<? super C13091w<C11079d2>> cVar);
}
