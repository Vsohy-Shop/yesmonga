package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11395k;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C11395k(message = "Use ProductsManagementRepository instead of this one. Will be removed")
public final class ProductRepository {
    @C12579k

    /* renamed from: a */
    public final ProductsDataSource f67054a;

    @Inject
    public ProductRepository(@C12579k ProductsDataSource productsDataSource) {
        Intrinsics.checkNotNullParameter(productsDataSource, "apiSource");
        this.f67054a = productsDataSource;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo80189b(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k C11045c<? super C11907e<? extends C36371a<Offer>>> cVar) {
        return C11909g.m47376J0(new ProductRepository$getOfferFlow$2(this, str, str2, str3, (C11045c<? super ProductRepository$getOfferFlow$2>) null));
    }

    @C12580l
    /* renamed from: c */
    public final Object mo80190c(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k C11045c<? super C11907e<? extends C36371a<? extends List<Offer>>>> cVar) {
        return C11909g.m47376J0(new ProductRepository$getOfferMixedProductsFlow$2(this, str, str2, str3, (C11045c<? super ProductRepository$getOfferMixedProductsFlow$2>) null));
    }
}
