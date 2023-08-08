package com.carrefour.fid.android.loyalty.data.services;

import com.carrefour.fid.android.loyalty.data.models.body.LinkCardBody;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13031j;
import retrofit2.http.C13037p;
import retrofit2.http.C13040s;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/services/LinkLoyaltyCardApiService;", "", "", "", "headers", "cardTypeName", "Lcom/carrefour/fid/android/loyalty/data/models/body/LinkCardBody;", "body", "Lretrofit2/w;", "linkLoyaltyCardToAccount", "(Ljava/util/Map;Ljava/lang/String;Lcom/carrefour/fid/android/loyalty/data/models/body/LinkCardBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface LinkLoyaltyCardApiService {
    @C12580l
    @C13037p("api/v2/customers/cards/{cardTypeName}/0")
    Object linkLoyaltyCardToAccount(@C12579k @C13031j Map<String, String> map, @C13040s("cardTypeName") @C12579k String str, @C12579k @C13022a LinkCardBody linkCardBody, @C12579k C11045c<? super C13091w<Object>> cVar);
}
