package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.models.product.Gtin;
import java.util.Set;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.basket.domain.interactors.g0 */
public final class C13914g0 implements C37559b0 {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33943a;

    @Inject
    public C13914g0(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33943a = basketRepository;
    }

    @C12580l
    /* renamed from: a */
    public Object invoke(@C12579k C11045c<? super C11952u<? extends Set<Gtin>>> cVar) {
        return this.f33943a.mo33399w();
    }
}
