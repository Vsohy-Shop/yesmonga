package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.loyalty.data.services.ApiMemberCardService;
import com.carrefour.fid.android.loyalty.domain.repositories.IMemberCardRepository;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository;", "Lcom/carrefour/fid/android/loyalty/domain/repositories/IMemberCardRepository;", "", "cardNumber", "Lkotlin/Result;", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyMemberCardDomain;", "getMemberCard-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getMemberCard", "", "getLoyaltyCards-gIAlu-s", "getLoyaltyCards", "Lcom/carrefour/fid/android/loyalty/data/services/ApiMemberCardService;", "service", "Lcom/carrefour/fid/android/loyalty/data/services/ApiMemberCardService;", "Lcom/carrefour/fid/android/loyalty/data/headers/LoyaltyHeaders;", "loyaltyHeaders", "Lcom/carrefour/fid/android/loyalty/data/headers/LoyaltyHeaders;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/services/ApiMemberCardService;Lcom/carrefour/fid/android/loyalty/data/headers/LoyaltyHeaders;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class MemberCardRepository implements IMemberCardRepository {
    /* access modifiers changed from: private */
    @C12579k
    public final LoyaltyHeaders loyaltyHeaders;
    /* access modifiers changed from: private */
    @C12579k
    public final ApiMemberCardService service;

    @Inject
    public MemberCardRepository(@C12579k ApiMemberCardService apiMemberCardService, @C12579k LoyaltyHeaders loyaltyHeaders2) {
        Intrinsics.checkNotNullParameter(apiMemberCardService, "service");
        Intrinsics.checkNotNullParameter(loyaltyHeaders2, "loyaltyHeaders");
        this.service = apiMemberCardService;
        this.loyaltyHeaders = loyaltyHeaders2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getLoyaltyCards-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173029getLoyaltyCardsgIAlus(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<java.lang.String>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getLoyaltyCards$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getLoyaltyCards$1 r0 = (com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getLoyaltyCards$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getLoyaltyCards$1 r0 = new com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getLoyaltyCards$1
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
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getLoyaltyCards$2 r6 = new com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getLoyaltyCards$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository.m173029getLoyaltyCardsgIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getMemberCard-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173030getMemberCardgIAlus(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.loyalty.domain.models.LoyaltyMemberCardDomain>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getMemberCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getMemberCard$1 r0 = (com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getMemberCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getMemberCard$1 r0 = new com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getMemberCard$1
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
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getMemberCard$2 r6 = new com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getMemberCard$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository.m173030getMemberCardgIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
