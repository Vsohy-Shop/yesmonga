package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
public final class AlternativeProductsRepository {
    @C12579k

    /* renamed from: a */
    public final PlpProductListDataSource f67038a;

    @Inject
    public AlternativeProductsRepository(@C12579k PlpProductListDataSource plpProductListDataSource) {
        Intrinsics.checkNotNullParameter(plpProductListDataSource, "apiSource");
        this.f67038a = plpProductListDataSource;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo80168b(@C12579k String str, @C12579k String str2, @C12579k C11045c<? super C11907e<? extends Result<? extends List<C38115c>>>> cVar) {
        return C11909g.m47376J0(new AlternativeProductsRepository$getAlternativeProductsFlow$2(this, str, str2, (C11045c<? super AlternativeProductsRepository$getAlternativeProductsFlow$2>) null));
    }
}
