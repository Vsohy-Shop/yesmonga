package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.loyalty.C37701e;
import com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils;
import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/hasValidFidCardUseCaseImpl;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/e;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/e$b;", "param", "Lkotlin/Result;", "", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/domain/interactors/loyalty/e$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "<init>", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class hasValidFidCardUseCaseImpl implements C37701e {
    @C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public Object m173074invokegIAlus(@C12579k C37701e.C37703b bVar, @C12579k C11045c<? super Result<Boolean>> cVar) {
        if (!(bVar instanceof C37701e.C37702a)) {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new Exception("wrong data")));
        } else if (LoyaltyUtils.INSTANCE.getMostRecentAndSecuredLoyaltyCard(((C37701e.C37702a) bVar).mo114741d()) != null) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(C11064a.m42615a(true));
        } else {
            Result.C10852a aVar3 = Result.f28060a;
            return Result.m38702b(C11064a.m42615a(false));
        }
    }
}
