package com.carrefour.fid.android.loyalty.data.repositories;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$2", mo22502f = "LinkLoyaltyCardRepository.kt", mo22503i = {}, mo22504l = {28, 35, 43}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends String>>, Object> {
    final /* synthetic */ String $cardNumber;
    final /* synthetic */ String $idTokenLoyalty;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LinkLoyaltyCardRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$2(LinkLoyaltyCardRepository linkLoyaltyCardRepository, String str, String str2, C11045c<? super LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$2> cVar) {
        super(1, cVar);
        this.this$0 = linkLoyaltyCardRepository;
        this.$cardNumber = str;
        this.$idTokenLoyalty = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$2(this.this$0, this.$cardNumber, this.$idTokenLoyalty, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 == r5) goto L_0x002f
            if (r1 == r4) goto L_0x0023
            if (r1 != r3) goto L_0x001b
            java.lang.Object r0 = r9.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x009a
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0023:
            java.lang.Object r1 = r9.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r9.L$0
            com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository r4 = (com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository) r4
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0088
        L_0x002f:
            kotlin.C11661u0.m45747n(r10)
            goto L_0x005f
        L_0x0033:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository r10 = r9.this$0
            com.carrefour.fid.android.loyalty.data.services.LinkLoyaltyCardApiService r10 = r10.linkLoyaltyCardApiService
            com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository r1 = r9.this$0
            com.carrefour.fid.android.shared.network.a r1 = r1.accountHeaders
            java.util.Map r1 = r1.mo31314b(r5, r5)
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r6 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.lang.String r7 = r9.$cardNumber
            r8 = 0
            java.lang.String r6 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.getTypeCardName$default(r6, r7, r8, r4, r2)
            com.carrefour.fid.android.loyalty.data.models.body.LinkCardBody r7 = new com.carrefour.fid.android.loyalty.data.models.body.LinkCardBody
            java.lang.String r8 = r9.$idTokenLoyalty
            r7.<init>(r8)
            r9.label = r5
            java.lang.Object r10 = r10.linkLoyaltyCardToAccount(r1, r6, r7, r9)
            if (r10 != r0) goto L_0x005f
            return r0
        L_0x005f:
            com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository r1 = r9.this$0
            java.lang.String r5 = r9.$cardNumber
            retrofit2.w r10 = (retrofit2.C13091w) r10
            boolean r10 = r10.mo30576g()
            if (r10 == 0) goto L_0x00a1
            com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource r10 = r1.localAccountDataSource
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r6 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            com.carrefour.fid.android.domain.models.account.UserCards r6 = r6.initUserCard(r5)
            java.util.List r6 = kotlin.collections.C10976s.m41419k(r6)
            r9.L$0 = r1
            r9.L$1 = r5
            r9.label = r4
            java.lang.Object r10 = r10.mo31128g(r6, r9)
            if (r10 != r0) goto L_0x0086
            return r0
        L_0x0086:
            r4 = r1
            r1 = r5
        L_0x0088:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r10 = r4.loyaltyPreferencesStorage
            r9.L$0 = r1
            r9.L$1 = r2
            r9.label = r3
            java.lang.Object r10 = r10.setLoyaltyCardNumber(r1, r9)
            if (r10 != r0) goto L_0x0099
            return r0
        L_0x0099:
            r0 = r1
        L_0x009a:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.Result.m38702b(r0)
            goto L_0x00c6
        L_0x00a1:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Throwable r10 = new java.lang.Throwable
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error link loyalty card id '"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "' to account"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
        L_0x00c6:
            kotlin.Result r10 = kotlin.Result.m38701a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<String>> cVar) {
        return ((LinkLoyaltyCardRepository$linkLoyaltyCardToAccount$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
