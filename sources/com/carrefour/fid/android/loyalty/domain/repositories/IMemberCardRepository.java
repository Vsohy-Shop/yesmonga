package com.carrefour.fid.android.loyalty.domain.repositories;

import com.carrefour.fid.android.loyalty.domain.models.LoyaltyMemberCardDomain;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0007\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/repositories/IMemberCardRepository;", "", "", "cardNumber", "Lkotlin/Result;", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyMemberCardDomain;", "getMemberCard-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getMemberCard", "", "getLoyaltyCards-gIAlu-s", "getLoyaltyCards", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface IMemberCardRepository {
    @C12580l
    /* renamed from: getLoyaltyCards-gIAlu-s  reason: not valid java name */
    Object m173089getLoyaltyCardsgIAlus(@C12579k String str, @C12579k C11045c<? super Result<? extends List<String>>> cVar);

    @C12580l
    /* renamed from: getMemberCard-gIAlu-s  reason: not valid java name */
    Object m173090getMemberCardgIAlus(@C12579k String str, @C12579k C11045c<? super Result<LoyaltyMemberCardDomain>> cVar);
}
