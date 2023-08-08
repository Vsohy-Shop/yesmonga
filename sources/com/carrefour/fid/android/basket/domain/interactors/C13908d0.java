package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.basket.domain.interactors.d0 */
public final class C13908d0 implements C37606z {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33935a;

    @Inject
    public C13908d0(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33935a = basketRepository;
    }

    @C12580l
    /* renamed from: a */
    public Object invoke(@C12579k C11045c<? super C11907e<Basket>> cVar) {
        return this.f33935a.mo33391o();
    }
}
