package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37593p;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.basket.domain.interactors.p */
public final class C13945p implements C37593p {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f34034a;

    @Inject
    public C13945p(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        this.f34034a = basketRepository;
    }

    @C12580l
    /* renamed from: a */
    public Object invoke(@C12579k C11045c<? super Basket> cVar) {
        return this.f34034a.mo33398v();
    }
}
