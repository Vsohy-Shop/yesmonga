package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyListTransactionsDomain;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/GetUserTransactionsUseCase;", "Lcom/carrefour/fid/android/domain/interactors/e;", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyListTransactionsDomain;", "Lkotlin/Result;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "repository", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class GetUserTransactionsUseCase implements C37678e<LoyaltyListTransactionsDomain> {
    @C12579k
    private LoyaltyRepository repository;

    @Inject
    public GetUserTransactionsUseCase(@C12579k LoyaltyRepository loyaltyRepository) {
        Intrinsics.checkNotNullParameter(loyaltyRepository, "repository");
        this.repository = loyaltyRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173053invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.loyalty.domain.models.LoyaltyListTransactionsDomain>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.loyalty.domain.interactors.GetUserTransactionsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.loyalty.domain.interactors.GetUserTransactionsUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.GetUserTransactionsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.GetUserTransactionsUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.GetUserTransactionsUseCase$invoke$1
            r0.<init>(r7, r8)
        L_0x0018:
            r4 = r0
            java.lang.Object r8 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x004b
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0038:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository r1 = r7.repository
            r8 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            r4.label = r2
            r2 = r8
            java.lang.Object r8 = com.carrefour.fid.android.loyalty.domain.repositories.ILoyaltyRepository.DefaultImpls.m173088getUserTransactions0E7RQCE$default(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L_0x004b
            return r0
        L_0x004b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.GetUserTransactionsUseCase.m173053invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
