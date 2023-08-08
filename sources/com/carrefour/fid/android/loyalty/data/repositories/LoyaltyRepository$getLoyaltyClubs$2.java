package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.loyalty.data.models.entities.ClubsResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.MidFidClubResponse;
import com.carrefour.fid.android.loyalty.data.services.MidFidApiService;
import java.util.HashMap;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyClubs$2", mo22502f = "LoyaltyRepository.kt", mo22503i = {}, mo22504l = {67}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/loyalty/data/models/entities/ClubsResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LoyaltyRepository$getLoyaltyClubs$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends ClubsResponse>>>, Object> {
    final /* synthetic */ String $cardFidNumber;
    int label;
    final /* synthetic */ LoyaltyRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyRepository$getLoyaltyClubs$2(LoyaltyRepository loyaltyRepository, String str, C11045c<? super LoyaltyRepository$getLoyaltyClubs$2> cVar) {
        super(1, cVar);
        this.this$0 = loyaltyRepository;
        this.$cardFidNumber = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new LoyaltyRepository$getLoyaltyClubs$2(this.this$0, this.$cardFidNumber, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        List<ClubsResponse> list;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            MidFidApiService access$getMidFidApiService$p = this.this$0.midFidApiService;
            HashMap defaultHeaders$default = LoyaltyHeaders.getDefaultHeaders$default(this.this$0.loyaltyHeaders, this.$cardFidNumber, (String) null, false, false, false, (String) null, 62, (Object) null);
            this.label = 1;
            obj = access$getMidFidApiService$p.getLoyaltyClubs(defaultHeaders$default, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            MidFidClubResponse midFidClubResponse = (MidFidClubResponse) wVar.mo30572a();
            if (midFidClubResponse != null) {
                list = midFidClubResponse.getClubs();
            } else {
                list = null;
            }
            if (list == null) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            obj2 = Result.m38702b(list);
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(new Throwable("Error fetching loyalty clubs")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<ClubsResponse>>> cVar) {
        return ((LoyaltyRepository$getLoyaltyClubs$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
