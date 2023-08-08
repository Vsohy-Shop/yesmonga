package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.compose.foundation.lazy.grid.C2488d;
import androidx.compose.foundation.lazy.grid.C2497l;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C27998a;
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
@C11363r0({"SMAP\nFacetStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/facets/FacetStatefulKt$SortAndFilterList$1\n+ 2 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n1#1,429:1\n380#2,14:430\n380#2,14:444\n*S KotlinDebug\n*F\n+ 1 FacetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/facets/FacetStatefulKt$SortAndFilterList$1\n*L\n209#1:430,14\n224#1:444,14\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$SortAndFilterList$1 */
public final class FacetStatefulKt$SortAndFilterList$1 extends Lambda implements C11300l<LazyGridScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27998a, C11079d2> $actioner;
    final /* synthetic */ Facet $facet;
    final /* synthetic */ List<Filter.CheckboxFilter> $filters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetStatefulKt$SortAndFilterList$1(Facet facet, List<Filter.CheckboxFilter> list, C11300l<? super C27998a, C11079d2> lVar, int i) {
        super(1);
        this.$facet = facet;
        this.$filters = list;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    /* renamed from: a */
    public final void mo81461a(@C12579k LazyGridScope lazyGridScope) {
        C27978x2195799a facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$2;
        C27983x2195799f facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$7;
        Intrinsics.checkNotNullParameter(lazyGridScope, "$this$LazyVerticalGrid");
        C279931 r4 = C279931.f67832f;
        ComposableSingletons$FacetStatefulKt composableSingletons$FacetStatefulKt = ComposableSingletons$FacetStatefulKt.f67818a;
        LazyGridScope.m11050b(lazyGridScope, "title_sort_by", r4, (Object) null, composableSingletons$FacetStatefulKt.mo81424a(), 4, (Object) null);
        List<Sort> i = this.$facet.mo118345i();
        C279942 r3 = C279942.f67833f;
        C11300l<C27998a, C11079d2> lVar = this.$actioner;
        int i2 = this.$$dirty;
        C27976x21957999 facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$1 = C27976x21957999.f67826f;
        int size = i.size();
        C27984x219579a0 facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$8 = null;
        if (r3 != null) {
            facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$2 = new C27978x2195799a(r3, i);
        } else {
            facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$2 = null;
        }
        C27980x2195799c facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$4 = new C27980x2195799c(facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$1, i);
        C8552a c = C8553b.m31049c(699646206, true, new C27981x2195799d(i, lVar, i2));
        LazyGridScope lazyGridScope2 = lazyGridScope;
        lazyGridScope2.mo8466d(size, facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$2, (C11304p<? super C2497l, ? super Integer, C2488d>) null, facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$4, c);
        LazyGridScope.m11050b(lazyGridScope2, "title_filter_by", C279954.f67834f, (Object) null, composableSingletons$FacetStatefulKt.mo81425b(), 4, (Object) null);
        List<Filter.CheckboxFilter> list = this.$filters;
        C279965 r2 = C279965.f67835f;
        C279976 r32 = C279976.f67836f;
        C11300l<C27998a, C11079d2> lVar2 = this.$actioner;
        int i3 = this.$$dirty;
        C27982x2195799e facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$6 = C27982x2195799e.f67827f;
        int size2 = list.size();
        if (r2 != null) {
            facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$7 = new C27983x2195799f(r2, list);
        } else {
            facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$7 = null;
        }
        if (r32 != null) {
            facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$8 = new C27984x219579a0(r32, list);
        }
        lazyGridScope.mo8466d(size2, facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$7, facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$8, new C27985x219579a1(facetStatefulKt$SortAndFilterList$1$invoke$$inlined$items$default$6, list), C8553b.m31049c(699646206, true, new C27977x1119b9b7(list, lVar2, i3)));
        this.$actioner.invoke(C27998a.C28004f.C28006b.f67850a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81461a((LazyGridScope) obj);
        return C11079d2.f28267a;
    }
}
