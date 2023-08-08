package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.data.services.LinkLoyaltyCardApiService;
import com.carrefour.fid.android.loyalty.domain.repositories.IIamLoyaltyRepository;
import com.carrefour.fid.android.shared.network.C28799a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/repositories/LinkLoyaltyCardRepository;", "Lcom/carrefour/fid/android/loyalty/domain/repositories/IIamLoyaltyRepository;", "", "idTokenLoyalty", "cardNumber", "Lkotlin/Result;", "linkLoyaltyCardToAccount-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "linkLoyaltyCardToAccount", "Lcom/carrefour/fid/android/loyalty/data/services/LinkLoyaltyCardApiService;", "linkLoyaltyCardApiService", "Lcom/carrefour/fid/android/loyalty/data/services/LinkLoyaltyCardApiService;", "Lcom/carrefour/fid/android/account/data/datasource/LocalAccountDataSource;", "localAccountDataSource", "Lcom/carrefour/fid/android/account/data/datasource/LocalAccountDataSource;", "Lcom/carrefour/fid/android/shared/network/a;", "accountHeaders", "Lcom/carrefour/fid/android/shared/network/a;", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/services/LinkLoyaltyCardApiService;Lcom/carrefour/fid/android/account/data/datasource/LocalAccountDataSource;Lcom/carrefour/fid/android/shared/network/a;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class LinkLoyaltyCardRepository implements IIamLoyaltyRepository {
    /* access modifiers changed from: private */
    @C12579k
    public final C28799a accountHeaders;
    /* access modifiers changed from: private */
    @C12579k
    public final LinkLoyaltyCardApiService linkLoyaltyCardApiService;
    /* access modifiers changed from: private */
    @C12579k
    public final LocalAccountDataSource localAccountDataSource;
    /* access modifiers changed from: private */
    @C12579k
    public final LoyaltyPreferencesStorage loyaltyPreferencesStorage;

    @Inject
    public LinkLoyaltyCardRepository(@C12579k LinkLoyaltyCardApiService linkLoyaltyCardApiService2, @C12579k LocalAccountDataSource localAccountDataSource2, @C12579k C28799a aVar, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage2) {
        Intrinsics.checkNotNullParameter(linkLoyaltyCardApiService2, "linkLoyaltyCardApiService");
        Intrinsics.checkNotNullParameter(localAccountDataSource2, "localAccountDataSource");
        Intrinsics.checkNotNullParameter(aVar, "accountHeaders");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage2, "loyaltyPreferencesStorage");
        this.linkLoyaltyCardApiService = linkLoyaltyCardApiService2;
        this.localAccountDataSource = localAccountDataSource2;
        this.accountHeaders = aVar;
        this.loyaltyPreferencesStorage = loyaltyPreferencesStorage2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: linkLoyaltyCardToAccount-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173016linkLoyaltyCardToAccount0E7RQCE(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$1 r0 = (com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$1 r0 = new com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$2 r7 = new com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$2
            r2 = 0
            r7.<init>(r4, r6, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository.m173016linkLoyaltyCardToAccount0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
