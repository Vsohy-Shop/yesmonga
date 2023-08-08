package com.carrefour.fid.android.loyalty.data.services;

import com.carrefour.fid.android.loyalty.data.models.body.GetOtpBody;
import com.carrefour.fid.android.loyalty.data.models.body.UpdateSecretCodeBody;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyBalanceResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardOperationHistoryResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyListTransactionsResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.MidFidClubResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.PrimeMidFidBody;
import com.carrefour.fid.android.loyalty.data.models.entities.UserChannelsMediaResponse;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13036o;
import retrofit2.http.C13037p;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000eJ9\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ9\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u001aH§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJS\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00130\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u001e\u001a\u00020\u00032\b\b\u0001\u0010\u001f\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JC\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010#\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/services/MidFidApiService;", "", "", "", "headers", "storeId", "", "expiry_details", "Lretrofit2/w;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyBalanceResponse;", "getUserBalances", "(Ljava/util/Map;Ljava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/MidFidClubResponse;", "getLoyaltyClubs", "(Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/PrimeMidFidBody;", "body", "putMidFidClub", "(Ljava/util/Map;Lcom/carrefour/fid/android/loyalty/data/models/entities/PrimeMidFidBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "Lcom/carrefour/fid/android/loyalty/data/models/entities/UserChannelsMediaResponse;", "getUserChannels", "Lcom/carrefour/fid/android/loyalty/data/models/body/GetOtpBody;", "getOtp", "(Ljava/util/Map;Lcom/carrefour/fid/android/loyalty/data/models/body/GetOtpBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "validationOtpCode", "Lcom/carrefour/fid/android/loyalty/data/models/body/UpdateSecretCodeBody;", "updateSecretCode", "(Ljava/util/Map;Lcom/carrefour/fid/android/loyalty/data/models/body/UpdateSecretCodeBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "type", "style", "search", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyCardOperationHistoryResponse;", "getFidHistory", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "metiRef", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyListTransactionsResponse;", "getUserTransactions", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface MidFidApiService {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFidHistory$default(MidFidApiService midFidApiService, Map map, String str, String str2, String str3, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "statement";
                }
                String str4 = str;
                if ((i & 4) != 0) {
                    str2 = "Liste";
                }
                return midFidApiService.getFidHistory(map, str4, str2, str3, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFidHistory");
        }
    }

    @C12580l
    @C13027f("retail/v1/mof/account_card_management/loyalty_cards/my")
    Object getFidHistory(@C12579k @C13031j Map<String, String> map, @C13041t("type") @C12579k String str, @C13041t("style") @C12579k String str2, @C13041t(encoded = true, value = "search") @C12579k String str3, @C12579k C11045c<? super C13091w<List<LoyaltyCardOperationHistoryResponse>>> cVar);

    @C12580l
    @C13027f("retail/v1/mof/account_card_management/loyalty_cards/my/clubs")
    Object getLoyaltyClubs(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<MidFidClubResponse>> cVar);

    @C13036o("retail/v1/mof/otp_management/loyalty_cards/my/otp")
    @C12580l
    Object getOtp(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a GetOtpBody getOtpBody, @C12579k C11045c<? super C13091w<String>> cVar);

    @C12580l
    @C13027f("retail/v2/mof/loyalty_kitty_management/loyalty_accounts/my/balances")
    Object getUserBalances(@C12579k @C13031j Map<String, String> map, @C13041t("store_id") @C12579k String str, @C13041t("expiry_details") boolean z, @C12579k C11045c<? super C13091w<LoyaltyBalanceResponse>> cVar);

    @C12580l
    @C13027f("retail/v2/mof/otp_management/loyalty_cards/my/otp")
    Object getUserChannels(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<List<UserChannelsMediaResponse>>> cVar);

    @C12580l
    @C13027f("retail/v2/mof/loyalty_kitty_management/loyalty_accounts/my/transactions")
    Object getUserTransactions(@C12579k @C13031j Map<String, String> map, @C13041t("store_id") @C12579k String str, @C13041t("expiry_details") boolean z, @C12579k C11045c<? super C13091w<LoyaltyListTransactionsResponse>> cVar);

    @C13036o("retail/v1/mof/account_card_management/loyalty_cards/my/set_clubs")
    @C12580l
    Object putMidFidClub(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a PrimeMidFidBody primeMidFidBody, @C12579k C11045c<? super C13091w<String>> cVar);

    @C12580l
    @C13037p("retail/v2/mof/account_card_management/loyalty_cards/my/accounts")
    Object updateSecretCode(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a UpdateSecretCodeBody updateSecretCodeBody, @C12579k C11045c<? super C13091w<String>> cVar);

    @C12580l
    @C13037p("retail/v1/mof/otp_management/loyalty_cards/otp/my")
    Object validationOtpCode(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<String>> cVar);
}
