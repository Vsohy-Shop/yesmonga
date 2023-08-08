package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.loyalty.C37699c;
import com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ0\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyGetLoyaltyCardsUseCase;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/c;", "", "param", "Lkotlin/Result;", "", "invoke-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository;", "memberCardRepository", "Lcom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public class LoyaltyGetLoyaltyCardsUseCase implements C37699c {
    @C12579k
    private final MemberCardRepository memberCardRepository;

    @Inject
    public LoyaltyGetLoyaltyCardsUseCase(@C12579k MemberCardRepository memberCardRepository2) {
        Intrinsics.checkNotNullParameter(memberCardRepository2, "memberCardRepository");
        this.memberCardRepository = memberCardRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m158609a(com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardsUseCase r4, java.lang.String r5, kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<java.lang.String>>> r6) {
        /*
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardsUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardsUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardsUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r4 = r6.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository r4 = r4.memberCardRepository
            r0.label = r3
            java.lang.Object r4 = r4.m173029getLoyaltyCardsgIAlus(r5, r0)
            if (r4 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardsUseCase.m158609a(com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardsUseCase, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public Object m173061invokegIAlus(@C12579k String str, @C12579k C11045c<? super Result<? extends List<String>>> cVar) {
        return m158609a(this, str, cVar);
    }
}
