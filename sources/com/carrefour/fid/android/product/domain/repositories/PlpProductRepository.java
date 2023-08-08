package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.core.paging.C36334b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource;
import com.carrefour.fid.android.product.domain.model.C27583a;
import com.carrefour.fid.android.product.domain.model.C27587e;
import com.carrefour.fid.android.shared.p045di.annotation.C28674r;
import com.carrefour.fid.android.shared.paging.Pager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11911i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPlpProductRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpProductRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/PlpProductRepository\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,59:1\n361#2,7:60\n*S KotlinDebug\n*F\n+ 1 PlpProductRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/PlpProductRepository\n*L\n33#1:60,7\n*E\n"})
public final class PlpProductRepository {
    @C12579k

    /* renamed from: a */
    public final PlpProductListDataSource f67048a;
    @C12579k

    /* renamed from: b */
    public final FacetRepository f67049b;
    @C12579k

    /* renamed from: c */
    public final C12074o0 f67050c;
    @C12579k

    /* renamed from: d */
    public final Map<C27587e, Pager<Integer, C38115c>> f67051d = new LinkedHashMap();

    @Inject
    public PlpProductRepository(@C12579k PlpProductListDataSource plpProductListDataSource, @C12579k FacetRepository facetRepository, @C28674r @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(plpProductListDataSource, "apiSource");
        Intrinsics.checkNotNullParameter(facetRepository, "facetRepository");
        Intrinsics.checkNotNullParameter(o0Var, "coroutineScope");
        this.f67048a = plpProductListDataSource;
        this.f67049b = facetRepository;
        this.f67050c = o0Var;
    }

    @C12579k
    /* renamed from: b */
    public final C11907e<Result<C27583a>> mo80182b(@C12579k List<String> list, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(list, "storeServices");
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str2, "slotSlice");
        return C11909g.m47376J0(new PlpProductRepository$getProduct$1(this, list, str, str2, (C11045c<? super PlpProductRepository$getProduct$1>) null));
    }

    @C12579k
    /* renamed from: c */
    public final C11907e<C36328a<C38115c>> mo80183c(@C12579k C27587e eVar, @C12580l C11911i<C36334b> iVar, boolean z) {
        Intrinsics.checkNotNullParameter(eVar, "id");
        if (z) {
            this.f67051d.clear();
        }
        Map<C27587e, Pager<Integer, C38115c>> map = this.f67051d;
        Pager<Integer, C38115c> pager = map.get(eVar);
        if (pager == null) {
            pager = C27597c.m116162a(this.f67050c, new PlpProductPagingSource(eVar, this.f67048a, this.f67049b));
            map.put(eVar, pager);
        }
        Pager pager2 = pager;
        if (iVar != null) {
            C11723c2 unused = C12038j.m48061f(this.f67050c, (CoroutineContext) null, (CoroutineStart) null, new PlpProductRepository$getProductList$1$1(pager2, iVar, (C11045c<? super PlpProductRepository$getProductList$1$1>) null), 3, (Object) null);
        }
        return pager2.mo83909n();
    }
}
