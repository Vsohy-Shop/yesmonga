package com.carrefour.fid.android.domain.interactors.basket;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$invoke$1", mo22502f = "BasketObserveBasketAndOffersUseCase.kt", mo22503i = {0, 1, 1}, mo22504l = {28, 29, 29}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow", "$this$flow", "numberOfBaskets"}, mo22507s = {"L$0", "L$0", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/interactors/basket/d;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ObserveBasketAndOffersUseCase$invoke$1 extends SuspendLambda implements C11304p<C11908f<? super Result<? extends C37562d>>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $referenceId;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ObserveBasketAndOffersUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObserveBasketAndOffersUseCase$invoke$1(ObserveBasketAndOffersUseCase observeBasketAndOffersUseCase, String str, C11045c<? super ObserveBasketAndOffersUseCase$invoke$1> cVar) {
        super(2, cVar);
        this.this$0 = observeBasketAndOffersUseCase;
        this.$referenceId = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ObserveBasketAndOffersUseCase$invoke$1 observeBasketAndOffersUseCase$invoke$1 = new ObserveBasketAndOffersUseCase$invoke$1(this.this$0, this.$referenceId, cVar);
        observeBasketAndOffersUseCase$invoke$1.L$0 = obj;
        return observeBasketAndOffersUseCase$invoke$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super Result<C37562d>> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ObserveBasketAndOffersUseCase$invoke$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082 A[RETURN] */
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
            if (r1 == 0) goto L_0x0030
            if (r1 == r4) goto L_0x0028
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0083
        L_0x0016:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001e:
            int r1 = r7.I$0
            java.lang.Object r3 = r7.L$0
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.C11908f) r3
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006a
        L_0x0028:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r8)
            goto L_0x004b
        L_0x0030:
            kotlin.C11661u0.m45747n(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.flow.f r8 = (kotlinx.coroutines.flow.C11908f) r8
            com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase r1 = r7.this$0
            com.carrefour.fid.android.domain.interactors.basket.m r1 = r1.f94318c
            r7.L$0 = r8
            r7.label = r4
            java.lang.Object r1 = r1.mo33270a(r7)
            if (r1 != r0) goto L_0x0048
            return r0
        L_0x0048:
            r6 = r1
            r1 = r8
            r8 = r6
        L_0x004b:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase r4 = r7.this$0
            com.carrefour.fid.android.domain.interactors.basket.x r4 = r4.f94316a
            java.lang.String r5 = r7.$referenceId
            r7.L$0 = r1
            r7.I$0 = r8
            r7.label = r3
            java.lang.Object r3 = r4.invoke(r5, r7)
            if (r3 != r0) goto L_0x0066
            return r0
        L_0x0066:
            r6 = r1
            r1 = r8
            r8 = r3
            r3 = r6
        L_0x006a:
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            kotlinx.coroutines.flow.e r8 = kotlinx.coroutines.flow.C11909g.m47492t0(r8)
            com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$invoke$1$1 r4 = new com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$invoke$1$1
            com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase r5 = r7.this$0
            r4.<init>(r5, r3, r1)
            r1 = 0
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = r8.collect(r4, r7)
            if (r8 != r0) goto L_0x0083
            return r0
        L_0x0083:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
