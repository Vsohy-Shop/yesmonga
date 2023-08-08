package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nGetBasketTypeUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetBasketTypeUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/internal/GetBasketTypeUseCase\n+ 2 Result.kt\ncom/carrefour/fid/android/shared/extension/ResultKt\n*L\n1#1,14:1\n3#2:15\n*S KotlinDebug\n*F\n+ 1 GetBasketTypeUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/internal/GetBasketTypeUseCase\n*L\n12#1:15\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.e */
public final class C13924e implements C37678e<BasketType> {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33991a;

    @Inject
    public C13924e(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33991a = basketRepository;
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172791invokeIoAF18A(@C12579k C11045c<? super Result<? extends BasketType>> cVar) {
        BasketType value = this.f33991a.mo33393q().getValue();
        Result.C10852a aVar = Result.f28060a;
        return Result.m38702b(value);
    }
}
