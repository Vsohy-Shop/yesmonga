package com.carrefour.fid.android.basket.domain.repositories;

import com.carrefour.fid.android.domain.models.basket.Basket;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsByReference$2", mo22502f = "BasketRepository.kt", mo22503i = {}, mo22504l = {181, 183, 188}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBasketRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketRepository.kt\ncom/carrefour/fid/android/basket/domain/repositories/BasketRepository$getBasketsByReference$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,386:1\n1#2:387\n*E\n"})
public final class BasketRepository$getBasketsByReference$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends Basket>>>, Object> {
    final /* synthetic */ List<String> $referenceIds;
    Object L$0;
    int label;
    final /* synthetic */ BasketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketRepository$getBasketsByReference$2(BasketRepository basketRepository, List<String> list, C11045c<? super BasketRepository$getBasketsByReference$2> cVar) {
        super(1, cVar);
        this.this$0 = basketRepository;
        this.$referenceIds = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new BasketRepository$getBasketsByReference$2(this.this$0, this.$referenceIds, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090 A[SYNTHETIC, Splitter:B:32:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x003a
            if (r1 == r4) goto L_0x0030
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r0 = r8.L$0
            kotlin.Result r0 = (kotlin.Result) r0
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x001b }
            goto L_0x00a1
        L_0x001b:
            r9 = move-exception
            goto L_0x00ab
        L_0x001e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0026:
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0080
        L_0x0030:
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0052
        L_0x003a:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r9 = r8.this$0
            com.carrefour.fid.android.domain.interactors.loyalty.b r9 = r9.f34099b
            com.carrefour.fid.android.domain.interactors.loyalty.b$a r1 = new com.carrefour.fid.android.domain.interactors.loyalty.b$a
            r6 = 0
            r1.<init>(r6, r4, r5)
            r8.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r1, r8)
            if (r9 != r0) goto L_0x0052
            return r0
        L_0x0052:
            boolean r1 = kotlin.Result.m38709i(r9)
            if (r1 == 0) goto L_0x0059
            r9 = r5
        L_0x0059:
            com.carrefour.fid.android.domain.models.loyalty.b r9 = (com.carrefour.fid.android.domain.models.loyalty.C38045b) r9
            if (r9 == 0) goto L_0x0062
            java.lang.String r9 = r9.mo117869h()
            goto L_0x0063
        L_0x0062:
            r9 = r5
        L_0x0063:
            if (r9 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r5 = r9
        L_0x0067:
            if (r5 != 0) goto L_0x006b
            java.lang.String r5 = ""
        L_0x006b:
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r9 = r8.this$0
            com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource r9 = r9.f34098a
            java.util.List<java.lang.String> r1 = r8.$referenceIds
            java.lang.String r4 = com.carrefour.fid.android.basket.core.type.C13872a.m58833a(r5)
            r8.label = r3
            java.lang.Object r9 = r9.mo32795o(r1, r5, r4, r8)
            if (r9 != r0) goto L_0x0080
            return r0
        L_0x0080:
            kotlin.Result r9 = kotlin.Result.m38701a(r9)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r1 = r8.this$0
            java.lang.Object r3 = r9.mo21858l()
            boolean r4 = kotlin.Result.m38710j(r3)
            if (r4 == 0) goto L_0x00b6
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x00a7 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x00a7 }
            r8.L$0 = r9     // Catch:{ all -> 0x00a7 }
            r8.label = r2     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r1.mo33377G(r3, r8)     // Catch:{ all -> 0x00a7 }
            if (r1 != r0) goto L_0x009f
            return r0
        L_0x009f:
            r0 = r9
            r9 = r1
        L_0x00a1:
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9     // Catch:{ all -> 0x001b }
            kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x001b }
            goto L_0x00b4
        L_0x00a7:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L_0x00ab:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            kotlin.Result.m38702b(r9)
        L_0x00b4:
            r9 = r0
            goto L_0x00b9
        L_0x00b6:
            kotlin.Result.m38702b(r3)
        L_0x00b9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsByReference$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<Basket>>> cVar) {
        return ((BasketRepository$getBasketsByReference$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
