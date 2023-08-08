package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import androidx.compose.foundation.lazy.grid.C2488d;
import androidx.compose.foundation.lazy.grid.C2497l;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Term;
import com.carrefour.fid.android.product.presentation.p039ui.facet.details.C27965a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nFacetFilterDetailsStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetFilterDetailsStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/details/FacetFilterDetailsStatefulKt$FilterList$1\n+ 2 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n1#1,336:1\n380#2,14:337\n*S KotlinDebug\n*F\n+ 1 FacetFilterDetailsStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/details/FacetFilterDetailsStatefulKt$FilterList$1\n*L\n228#1:337,14\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FilterList$1 */
public final class FacetFilterDetailsStatefulKt$FilterList$1 extends Lambda implements C11300l<LazyGridScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27965a, C11079d2> $actioner;
    final /* synthetic */ Filter.CheckboxFilter $currentFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetFilterDetailsStatefulKt$FilterList$1(Filter.CheckboxFilter checkboxFilter, C11300l<? super C27965a, C11079d2> lVar, int i) {
        super(1);
        this.$currentFilters = checkboxFilter;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    /* renamed from: a */
    public final void mo81405a(@C12579k LazyGridScope lazyGridScope) {
        C27958x95a86f55 facetFilterDetailsStatefulKt$FilterList$1$invoke$$inlined$items$default$2;
        Intrinsics.checkNotNullParameter(lazyGridScope, "$this$LazyVerticalGrid");
        List<Term> i = this.$currentFilters.mo118368i();
        C279641 r1 = C279641.f67800f;
        Filter.CheckboxFilter checkboxFilter = this.$currentFilters;
        C11300l<C27965a, C11079d2> lVar = this.$actioner;
        int i2 = this.$$dirty;
        C27957x95a86f54 facetFilterDetailsStatefulKt$FilterList$1$invoke$$inlined$items$default$1 = C27957x95a86f54.f67799f;
        int size = i.size();
        if (r1 != null) {
            facetFilterDetailsStatefulKt$FilterList$1$invoke$$inlined$items$default$2 = new C27958x95a86f55(r1, i);
        } else {
            facetFilterDetailsStatefulKt$FilterList$1$invoke$$inlined$items$default$2 = null;
        }
        lazyGridScope.mo8466d(size, facetFilterDetailsStatefulKt$FilterList$1$invoke$$inlined$items$default$2, (C11304p<? super C2497l, ? super Integer, C2488d>) null, new C27960x95a86f57(facetFilterDetailsStatefulKt$FilterList$1$invoke$$inlined$items$default$1, i), C8553b.m31049c(699646206, true, new C27961x95a86f58(i, checkboxFilter, lVar, i2)));
        this.$actioner.invoke(C27965a.C27972g.C27974b.f67816a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81405a((LazyGridScope) obj);
        return C11079d2.f28267a;
    }
}
