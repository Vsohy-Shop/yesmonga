package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource;
import com.carrefour.fid.android.product.domain.model.C27586d;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
public final class ProductDetailRepository {
    @C12579k

    /* renamed from: a */
    public final NonFoodProductDetailDataSource f67052a;
    @C12579k

    /* renamed from: b */
    public final C27600f f67053b;

    @Inject
    public ProductDetailRepository(@C12579k NonFoodProductDetailDataSource nonFoodProductDetailDataSource, @C12579k C27600f fVar) {
        Intrinsics.checkNotNullParameter(nonFoodProductDetailDataSource, "apiSource");
        Intrinsics.checkNotNullParameter(fVar, "productCache");
        this.f67052a = nonFoodProductDetailDataSource;
        this.f67053b = fVar;
    }

    /* renamed from: c */
    public final void mo80186c() {
        this.f67053b.mo80201a();
    }

    @C12580l
    /* renamed from: d */
    public final Object mo80187d(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k C11045c<? super C11907e<? extends C36371a<C27586d>>> cVar) {
        return C11909g.m47376J0(new ProductDetailRepository$getProductFlow$2(str, this, str2, str3, (C11045c<? super ProductDetailRepository$getProductFlow$2>) null));
    }
}
