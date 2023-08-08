package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBasketRetrieveBasketFromCacheUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketRetrieveBasketFromCacheUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketRetrieveBasketFromCacheUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.k0 */
public final class C13936k0 implements C37566e0 {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f34020a;

    @Inject
    public C13936k0(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f34020a = basketRepository;
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172792invokeIoAF18A(@C12579k C11045c<? super Result<Basket>> cVar) {
        try {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(this.f34020a.mo33391o().getValue());
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(th));
        }
    }
}
