package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.loyalty.core.p061io.OTPLoyaltyBlockedCardThrowable;
import com.carrefour.fid.android.loyalty.core.p061io.OTPLoyaltyCodeNotSecuredThrowable;
import com.carrefour.fid.android.loyalty.core.p061io.OTPLoyaltyInvalidCardOrSecretCodeThrowable;
import com.carrefour.fid.android.loyalty.data.models.entities.LoginIamLoyaltyResponse;
import com.carrefour.fid.android.loyalty.data.services.IamAuthLoyaltyApiService;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
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

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.data.repositories.LoyaltyAuthRepository$loyaltyAuthentication$2", mo22502f = "LoyaltyAuthRepository.kt", mo22503i = {}, mo22504l = {25}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoginIamLoyaltyResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LoyaltyAuthRepository$loyaltyAuthentication$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends LoginIamLoyaltyResponse>>, Object> {
    final /* synthetic */ String $cardFidNumber;
    final /* synthetic */ String $secretCode;
    int label;
    final /* synthetic */ LoyaltyAuthRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyAuthRepository$loyaltyAuthentication$2(LoyaltyAuthRepository loyaltyAuthRepository, String str, String str2, C11045c<? super LoyaltyAuthRepository$loyaltyAuthentication$2> cVar) {
        super(1, cVar);
        this.this$0 = loyaltyAuthRepository;
        this.$cardFidNumber = str;
        this.$secretCode = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new LoyaltyAuthRepository$loyaltyAuthentication$2(this.this$0, this.$cardFidNumber, this.$secretCode, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            IamAuthLoyaltyApiService access$getService$p = this.this$0.service;
            HashMap<String, String> authHeaders = this.this$0.loyaltyHeaders.getAuthHeaders();
            String str = this.$cardFidNumber;
            String str2 = this.$secretCode;
            this.label = 1;
            obj = IamAuthLoyaltyApiService.DefaultImpls.loyaltyAuthentication$default(access$getService$p, authHeaders, (String) null, str, str2, (String) null, (String) null, this, 50, (Object) null);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = this.$cardFidNumber;
        String str4 = this.$secretCode;
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            obj2 = Result.m38702b(wVar.mo30572a());
        } else if (wVar.mo30573b() == 123) {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(new OTPLoyaltyBlockedCardThrowable("loyalty card is blocked")));
        } else if (wVar.mo30573b() == 124) {
            Result.C10852a aVar3 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(new OTPLoyaltyInvalidCardOrSecretCodeThrowable("Invalid card : '" + str3 + "' or secret code :'" + str4)));
        } else if (wVar.mo30573b() == 603) {
            Result.C10852a aVar4 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(new OTPLoyaltyCodeNotSecuredThrowable("Secret code not secured : '" + str4 + "'")));
        } else {
            Result.C10852a aVar5 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error loyalty Authentication for cardFidNumber '" + str3 + "'")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<LoginIamLoyaltyResponse>> cVar) {
        return ((LoyaltyAuthRepository$loyaltyAuthentication$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
