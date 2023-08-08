package com.carrefour.fid.android.bff_data_shared.data.api.services;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.AccountResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentsResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUpdateConsentsBody;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateAccountBody;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateAddressBody;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateUserAccessBody;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateUserEmailBody;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountResponse;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13027f;
import retrofit2.http.C13030i;
import retrofit2.http.C13036o;
import retrofit2.http.C13037p;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\f\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\b\u0001\u0010\f\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\b\u0001\u0010\f\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJC\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffCustomersManagementApi;", "", "", "accessToken", "bearerToken", "Lretrofit2/w;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/AccountResponse;", "fetchUserInfo", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "fetch", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateAddressBody;", "body", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountResponse;", "updateAddresses", "(Ljava/lang/Boolean;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateAddressBody;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateAccountBody;", "updateInfo", "(Ljava/lang/Boolean;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateAccountBody;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateUserAccessBody;", "updatePassword", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateUserAccessBody;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateUserEmailBody;", "updateEmail", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateUserEmailBody;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "loyaltyCardId", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentsResponse;", "getConsents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUpdateConsentsBody;", "consents", "Lkotlin/d2;", "updateConsents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUpdateConsentsBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface BffCustomersManagementApi {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getConsents$default(BffCustomersManagementApi bffCustomersManagementApi, String str, String str2, String str3, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                return bffCustomersManagementApi.getConsents(str, str2, str3, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConsents");
        }

        public static /* synthetic */ Object updateConsents$default(BffCustomersManagementApi bffCustomersManagementApi, String str, String str2, String str3, BffUpdateConsentsBody bffUpdateConsentsBody, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                return bffCustomersManagementApi.updateConsents(str, str2, str3, bffUpdateConsentsBody, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateConsents");
        }
    }

    @C12580l
    @C13027f("customers/me?full=false")
    Object fetchUserInfo(@C12579k @C13030i("access-token") String str, @C12579k @C13030i("Authorization") String str2, @C12579k C11045c<? super C13091w<AccountResponse>> cVar);

    @C12580l
    @C13027f("customers/me/consents")
    Object getConsents(@C12579k @C13030i("access-token") String str, @C12579k @C13030i("Authorization") String str2, @C12580l @C13030i("Loyalty-card-Id") String str3, @C12579k C11045c<? super C13091w<BffConsentsResponse>> cVar);

    @C12580l
    @C13037p("customers/me")
    Object updateAddresses(@C12580l @C13041t("fetch") Boolean bool, @C12579k @C13022a UpdateAddressBody updateAddressBody, @C12579k @C13030i("access-token") String str, @C12579k @C13030i("Authorization") String str2, @C12579k C11045c<? super C13091w<UserAccountResponse>> cVar);

    @C13036o("customers/me/consents")
    @C12580l
    Object updateConsents(@C12579k @C13030i("access-token") String str, @C12579k @C13030i("Authorization") String str2, @C12580l @C13030i("Loyalty-card-Id") String str3, @C12579k @C13022a BffUpdateConsentsBody bffUpdateConsentsBody, @C12579k C11045c<? super C13091w<C11079d2>> cVar);

    @C12580l
    @C13037p("customers/me")
    Object updateEmail(@C12579k @C13022a UpdateUserEmailBody updateUserEmailBody, @C12579k @C13030i("access-token") String str, @C12579k @C13030i("Authorization") String str2, @C12579k C11045c<? super C13091w<UserAccountResponse>> cVar);

    @C12580l
    @C13037p("customers/me")
    Object updateInfo(@C12580l @C13041t("fetch") Boolean bool, @C12579k @C13022a UpdateAccountBody updateAccountBody, @C12579k @C13030i("access-token") String str, @C12579k @C13030i("Authorization") String str2, @C12579k C11045c<? super C13091w<UserAccountResponse>> cVar);

    @C12580l
    @C13037p("customers/me")
    Object updatePassword(@C12579k @C13022a UpdateUserAccessBody updateUserAccessBody, @C12579k @C13030i("access-token") String str, @C12579k @C13030i("Authorization") String str2, @C12579k C11045c<? super C13091w<UserAccountResponse>> cVar);
}
