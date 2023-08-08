package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.account.C37516b;
import com.carrefour.fid.android.domain.interactors.basket.C37556a0;
import com.carrefour.fid.android.domain.interactors.service.C37835r;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class BasketObserveBasketsItemCountUseCase implements C37556a0 {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33872a;
    @C12579k

    /* renamed from: b */
    public final C37516b f33873b;
    @C12579k

    /* renamed from: c */
    public final C37835r f33874c;

    @Inject
    public BasketObserveBasketsItemCountUseCase(@C12579k BasketRepository basketRepository, @C12579k C37516b bVar, @C12579k C37835r rVar) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        Intrinsics.checkNotNullParameter(bVar, "userInfo");
        Intrinsics.checkNotNullParameter(rVar, "observeServiceSelectionUseCase");
        this.f33872a = basketRepository;
        this.f33873b = bVar;
        this.f33874c = rVar;
    }

    @C12580l
    /* renamed from: d */
    public Object invoke(@C12579k C11045c<? super C11907e<Integer>> cVar) {
        return C11909g.m47376J0(new BasketObserveBasketsItemCountUseCase$invoke$2(this, (C11045c<? super BasketObserveBasketsItemCountUseCase$invoke$2>) null));
    }
}
