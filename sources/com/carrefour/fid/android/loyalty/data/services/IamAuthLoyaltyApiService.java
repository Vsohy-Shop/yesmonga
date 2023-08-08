package com.carrefour.fid.android.loyalty.data.services;

import com.carrefour.fid.android.loyalty.data.models.entities.LoginIamLoyaltyResponse;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13024c;
import retrofit2.http.C13026e;
import retrofit2.http.C13031j;
import retrofit2.http.C13036o;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Ja\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/services/IamAuthLoyaltyApiService;", "", "", "", "headers", "grantType", "username", "password", "scope", "client_id", "Lretrofit2/w;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoginIamLoyaltyResponse;", "loyaltyAuthentication", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface IamAuthLoyaltyApiService {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object loyaltyAuthentication$default(IamAuthLoyaltyApiService iamAuthLoyaltyApiService, Map map, String str, String str2, String str3, String str4, String str5, C11045c cVar, int i, Object obj) {
            String str6;
            String str7;
            if (obj == null) {
                if ((i & 2) != 0) {
                    str6 = "password";
                } else {
                    str6 = str;
                }
                if ((i & 16) != 0) {
                    str7 = "iam openid";
                } else {
                    str7 = str4;
                }
                return iamAuthLoyaltyApiService.loyaltyAuthentication(map, str6, str2, str3, str7, (i & 32) != 0 ? C28534f.f69170o : str5, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loyaltyAuthentication");
        }
    }

    @C13036o("/iam/oauth2/loyalty/access_token")
    @C12580l
    @C13026e
    Object loyaltyAuthentication(@C12579k @C13031j Map<String, String> map, @C13024c("grant_type") @C12579k String str, @C13024c("username") @C12579k String str2, @C13024c("password") @C12579k String str3, @C13024c(encoded = true, value = "scope") @C12579k String str4, @C13024c("client_id") @C12579k String str5, @C12579k C11045c<? super C13091w<LoginIamLoyaltyResponse>> cVar);
}
