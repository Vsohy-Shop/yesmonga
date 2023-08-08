package com.carrefour.fid.android.loyalty.domain.repositories;

import com.carrefour.fid.android.loyalty.data.models.entities.LoginIamLoyaltyResponse;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J4\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/repositories/ILoyaltyAuthRepository;", "", "", "cardFidNumber", "secretCode", "Lkotlin/Result;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoginIamLoyaltyResponse;", "loyaltyAuthentication-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "loyaltyAuthentication", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface ILoyaltyAuthRepository {
    @C12580l
    /* renamed from: loyaltyAuthentication-0E7RQCE  reason: not valid java name */
    Object m173076loyaltyAuthentication0E7RQCE(@C12579k String str, @C12579k String str2, @C12579k C11045c<? super Result<LoginIamLoyaltyResponse>> cVar);
}
