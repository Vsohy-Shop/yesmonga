package com.carrefour.fid.android.loyalty.data.services;

import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardGetMemberResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardsResponse;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/services/ApiMemberCardService;", "", "", "", "headers", "Lretrofit2/w;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyCardGetMemberResponse;", "getMemberCard", "(Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyCardsResponse;", "getLoyaltyCards", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface ApiMemberCardService {
    @C12580l
    @C13027f("retail/v2/mof/account_card_management/loyalty_cards/my/card_holder")
    Object getLoyaltyCards(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<LoyaltyCardsResponse>> cVar);

    @C12580l
    @C13027f("retail/v2/mof/account_card_management/loyalty_cards/my/cards")
    Object getMemberCard(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<LoyaltyCardGetMemberResponse>> cVar);
}
