package com.carrefour.fid.android.domain.interactors.offer;

import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.presentation.models.OfferModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$updateOfferList$1", mo22502f = "OfferListAndBasketControllerImpl.kt", mo22503i = {}, mo22504l = {217, 227, 230}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OfferListAndBasketControllerImpl$updateOfferList$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ List<OfferModel> $offers;
    final /* synthetic */ RequestType $shoppingListRequestType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OfferListAndBasketControllerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfferListAndBasketControllerImpl$updateOfferList$1(OfferListAndBasketControllerImpl offerListAndBasketControllerImpl, List<? extends OfferModel> list, RequestType requestType, C11045c<? super OfferListAndBasketControllerImpl$updateOfferList$1> cVar) {
        super(2, cVar);
        this.this$0 = offerListAndBasketControllerImpl;
        this.$offers = list;
        this.$shoppingListRequestType = requestType;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new OfferListAndBasketControllerImpl$updateOfferList$1(this.this$0, this.$offers, this.$shoppingListRequestType, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r4) goto L_0x002c
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r0 = r7.L$1
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0091
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0022:
            java.lang.Object r1 = r7.L$1
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r1 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r1
            java.lang.Object r3 = r7.L$0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006f
        L_0x002c:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0051
        L_0x0036:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r8 = r7.this$0
            com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase r8 = r8.f94620b
            com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$a r1 = new com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$a
            java.util.List<com.carrefour.fid.android.presentation.models.OfferModel> r5 = r7.$offers
            com.carrefour.fid.android.core.types.RequestType r6 = r7.$shoppingListRequestType
            r1.<init>(r5, r6)
            r7.label = r4
            java.lang.Object r8 = r8.m172991invokegIAlus(r1, r7)
            if (r8 != r0) goto L_0x0051
            return r0
        L_0x0051:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r1 = r7.this$0
            r1.mo114791J()
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r1 = r7.this$0
            boolean r4 = kotlin.Result.m38710j(r8)
            if (r4 == 0) goto L_0x0077
            r4 = r8
            java.util.List r4 = (java.util.List) r4
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r3 = r1.mo114793a(r4, r7)
            if (r3 != r0) goto L_0x006e
            return r0
        L_0x006e:
            r3 = r8
        L_0x006f:
            com.carrefour.fid.android.performance.d r8 = r1.f94618Z
            r8.mo121196e()
            r8 = r3
        L_0x0077:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r1 = r7.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r8)
            if (r3 == 0) goto L_0x0098
            kotlinx.coroutines.flow.i r4 = r1.f94612L0
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r8 = r4.emit(r3, r7)
            if (r8 != r0) goto L_0x0090
            return r0
        L_0x0090:
            r0 = r1
        L_0x0091:
            com.carrefour.fid.android.performance.d r8 = r0.f94618Z
            r8.mo121196e()
        L_0x0098:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$updateOfferList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((OfferListAndBasketControllerImpl$updateOfferList$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
