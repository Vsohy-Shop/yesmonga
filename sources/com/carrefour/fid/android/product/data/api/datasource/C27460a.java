package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacet;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacetEnvelope;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacetsObject;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpFacetResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductMetrics;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSortsObject;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTopTerm;
import com.carrefour.fid.android.domain.models.product.C38102a;
import com.carrefour.fid.android.domain.models.product.C38111e;
import com.carrefour.fid.android.domain.models.product.C38112f;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.domain.models.product.Term;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBffPlpFacetResponseToDomainMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BffPlpFacetResponseToDomainMapper.kt\ncom/carrefour/fid/android/product/data/api/datasource/BffPlpFacetResponseToDomainMapperKt\n+ 2 Result.kt\ncom/carrefour/fid/android/shared/extension/ResultKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n3#2:78\n1603#3,9:79\n1855#3:88\n1856#3:90\n1612#3:91\n1549#3:93\n1620#3,3:94\n1603#3,9:97\n1855#3:106\n1856#3:108\n1612#3:109\n1#4:89\n1#4:92\n1#4:107\n*S KotlinDebug\n*F\n+ 1 BffPlpFacetResponseToDomainMapper.kt\ncom/carrefour/fid/android/product/data/api/datasource/BffPlpFacetResponseToDomainMapperKt\n*L\n19#1:78\n33#1:79,9\n33#1:88\n33#1:90\n33#1:91\n46#1:93\n46#1:94,3\n58#1:97,9\n58#1:106\n58#1:108\n58#1:109\n33#1:89\n58#1:107\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.data.api.datasource.a */
public final class C27460a {
    /* renamed from: a */
    public static final Filter.CheckboxFilter m115586a(BffFacet bffFacet, boolean z) {
        String name = bffFacet.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String b = C38102a.m157521b(bffFacet.getField());
        Iterable<BffTopTerm> topTerms = bffFacet.getTopTerms();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(topTerms, 10));
        for (BffTopTerm bffTopTerm : topTerms) {
            arrayList.add(new Term(C38112f.m157658b(bffTopTerm.getTerm()), bffTopTerm.getSelected(), (DefaultConstructorMarker) null));
        }
        return new Filter.CheckboxFilter(b, str, bffFacet.getSelected(), arrayList, z, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: b */
    public static final Facet m115587b(@C12579k BffFacetsObject bffFacetsObject, @C12579k C28646a aVar) {
        int i;
        Integer totalResult;
        Intrinsics.checkNotNullParameter(bffFacetsObject, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        List<Sort> d = m115589d(bffFacetsObject.getSorts(), aVar);
        List<Filter.CheckboxFilter> c = m115588c(bffFacetsObject.getFilters());
        BffProductMetrics productsMetrics = bffFacetsObject.getProductsMetrics();
        if (productsMetrics == null || (totalResult = productsMetrics.getTotalResult()) == null) {
            i = 0;
        } else {
            i = totalResult.intValue();
        }
        return new Facet(c, d, i, false, false);
    }

    @C12579k
    /* renamed from: c */
    public static final List<Filter.CheckboxFilter> m115588c(@C12580l List<BffFacet> list) {
        Filter.CheckboxFilter checkboxFilter;
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        for (BffFacet bffFacet : list) {
            String type = bffFacet.getType();
            if (Intrinsics.areEqual((Object) type, (Object) "checkbox")) {
                checkboxFilter = m115586a(bffFacet, false);
            } else if (Intrinsics.areEqual((Object) type, (Object) "allergobox")) {
                checkboxFilter = m115586a(bffFacet, true);
            } else {
                checkboxFilter = null;
            }
            if (checkboxFilter != null) {
                arrayList.add(checkboxFilter);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final List<Sort> m115589d(List<BffSortsObject> list, C28646a aVar) {
        boolean z;
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        for (BffSortsObject bffSortsObject : list) {
            String field = bffSortsObject.getField();
            Sort sort = null;
            if (field != null) {
                String b = C38111e.m157650b(field);
                String label = bffSortsObject.getLabel();
                if (label == null) {
                    label = "";
                }
                Boolean selected = bffSortsObject.getSelected();
                if (selected != null) {
                    z = selected.booleanValue();
                } else {
                    z = false;
                }
                sort = new Sort(b, label, z, (DefaultConstructorMarker) null);
            } else {
                aVar.mo83568a("field", "sorts", bffSortsObject.getField());
                C11079d2 d2Var = C11079d2.f28267a;
            }
            if (sort != null) {
                arrayList.add(sort);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: e */
    public static final Facet m115590e(@C12579k BffPlpFacetResponse bffPlpFacetResponse, @C12579k C28646a aVar) {
        List<BffSortsObject> list;
        int i;
        BffFacetsObject facets;
        BffProductMetrics productsMetrics;
        Integer totalResult;
        BffFacetsObject facets2;
        BffFacetsObject facets3;
        Intrinsics.checkNotNullParameter(bffPlpFacetResponse, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        BffFacetEnvelope data = bffPlpFacetResponse.getData();
        List<BffFacet> list2 = null;
        if (data == null || (facets3 = data.getFacets()) == null) {
            list = null;
        } else {
            list = facets3.getSorts();
        }
        List<Sort> d = m115589d(list, aVar);
        BffFacetEnvelope data2 = bffPlpFacetResponse.getData();
        if (!(data2 == null || (facets2 = data2.getFacets()) == null)) {
            list2 = facets2.getFilters();
        }
        List<Filter.CheckboxFilter> c = m115588c(list2);
        BffFacetEnvelope data3 = bffPlpFacetResponse.getData();
        if (data3 == null || (facets = data3.getFacets()) == null || (productsMetrics = facets.getProductsMetrics()) == null || (totalResult = productsMetrics.getTotalResult()) == null) {
            i = 0;
        } else {
            i = totalResult.intValue();
        }
        return new Facet(c, d, i, false, false);
    }

    @C12579k
    /* renamed from: f */
    public static final Object m115591f(@C12580l BffPlpFacetResponse bffPlpFacetResponse, @C12579k C28646a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        if (bffPlpFacetResponse == null) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new Throwable("Can't parse facets from BffPlpFacetResponse")));
        }
        Facet e = m115590e(bffPlpFacetResponse, aVar);
        Result.C10852a aVar3 = Result.f28060a;
        return Result.m38702b(e);
    }
}
