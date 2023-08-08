package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.loyalty.data.models.entities.PrimeMidFidBody;
import com.carrefour.fid.android.loyalty.data.services.MidFidApiService;
import com.carrefour.fid.android.shared.p046io.C28793b;
import java.util.HashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$putMidFidClub$2", mo22502f = "LoyaltyRepository.kt", mo22503i = {}, mo22504l = {82}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LoyaltyRepository$putMidFidClub$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends String>>, Object> {
    final /* synthetic */ String $loyaltyCardId;
    final /* synthetic */ PrimeMidFidBody $primeMidFidBody;
    int label;
    final /* synthetic */ LoyaltyRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyRepository$putMidFidClub$2(LoyaltyRepository loyaltyRepository, String str, PrimeMidFidBody primeMidFidBody, C11045c<? super LoyaltyRepository$putMidFidClub$2> cVar) {
        super(1, cVar);
        this.this$0 = loyaltyRepository;
        this.$loyaltyCardId = str;
        this.$primeMidFidBody = primeMidFidBody;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new LoyaltyRepository$putMidFidClub$2(this.this$0, this.$loyaltyCardId, this.$primeMidFidBody, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            MidFidApiService access$getMidFidApiService$p = this.this$0.midFidApiService;
            HashMap defaultHeaders$default = LoyaltyHeaders.getDefaultHeaders$default(this.this$0.loyaltyHeaders, this.$loyaltyCardId, (String) null, true, false, false, (String) null, 58, (Object) null);
            PrimeMidFidBody primeMidFidBody = this.$primeMidFidBody;
            this.label = 1;
            obj = access$getMidFidApiService$p.putMidFidClub(defaultHeaders$default, primeMidFidBody, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = this.$loyaltyCardId;
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            String str2 = (String) wVar.mo30572a();
            if (str2 == null) {
                str2 = "";
            }
            obj2 = Result.m38702b(str2);
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C28793b.m119158b(wVar, "Error when updating midFid Club for card fid:'" + str + "'")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<String>> cVar) {
        return ((LoyaltyRepository$putMidFidClub$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
