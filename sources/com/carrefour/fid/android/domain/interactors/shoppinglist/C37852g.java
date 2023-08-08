package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.interactors.product.GetFavoriteProductsFlowUseCase;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.repositories.ShoppingListRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.shoppinglist.g */
public final class C37852g implements GetFavoriteProductsFlowUseCase {
    @C12579k

    /* renamed from: a */
    public final ShoppingListRepository f94945a;

    @Inject
    public C37852g(@C12579k ShoppingListRepository shoppingListRepository) {
        Intrinsics.checkNotNullParameter(shoppingListRepository, "repository");
        this.f94945a = shoppingListRepository;
    }

    @C12580l
    /* renamed from: a */
    public Object invoke(@C12579k GetFavoriteProductsFlowUseCase.Param param, @C12579k C11045c<? super C11907e<? extends List<C38115c>>> cVar) {
        return this.f94945a.mo119614f(param.mo114903f(), param.mo114901e(), cVar);
    }
}
