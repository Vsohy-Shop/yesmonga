package com.carrefour.fid.android.consent.domain.repositories;

import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.consent.domain.repositories.ConsentRepository", mo22502f = "ConsentRepository.kt", mo22503i = {0, 0, 0}, mo22504l = {52, 53}, mo22505m = "updateConsents-hUnOzRk", mo22506n = {"this", "loyaltyCardId", "updateConsentsBody"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ConsentRepository$updateConsents$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConsentRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsentRepository$updateConsents$1(ConsentRepository consentRepository, C11045c<? super ConsentRepository$updateConsents$1> cVar) {
        super(cVar);
        this.this$0 = consentRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r8 = this.this$0.m172928updateConsentshUnOzRk((String) null, (String) null, (String) null, (String) null, (List<ConsentOptIn>) null, this);
        return r8 == C11063b.m42612h() ? r8 : Result.m38701a(r8);
    }
}
