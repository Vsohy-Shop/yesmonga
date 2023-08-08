package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37762j;
import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.domain.models.product.C38111e;
import com.carrefour.fid.android.domain.models.product.C38112f;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.domain.models.product.Term;
import com.carrefour.fid.android.product.domain.repositories.FacetRepository;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C11661u0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductGetCurrentFacetAvailableFlowUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetCurrentFacetAvailableFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetCurrentFacetAvailableFlowUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n800#2,11:38\n766#2:49\n857#2,2:50\n1549#2:52\n1620#2,2:53\n766#2:55\n857#2,2:56\n1549#2:58\n1620#2,3:59\n1622#2:62\n766#2:63\n857#2,2:64\n1549#2:66\n1620#2,3:67\n*S KotlinDebug\n*F\n+ 1 ProductGetCurrentFacetAvailableFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetCurrentFacetAvailableFlowUseCase\n*L\n26#1:38,11\n26#1:49\n26#1:50,2\n26#1:52\n26#1:53,2\n29#1:55\n29#1:56,2\n29#1:58\n29#1:59,3\n26#1:62\n33#1:63\n33#1:64,2\n33#1:66\n33#1:67,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.domain.interactors.j */
public final class C27565j implements C37762j {
    @C12579k

    /* renamed from: a */
    public final FacetRepository f66952a;

    @Inject
    public C27565j(@C12579k FacetRepository facetRepository) {
        Intrinsics.checkNotNullParameter(facetRepository, "facetRepository");
        this.f66952a = facetRepository;
    }

    /* renamed from: a */
    public final C38104c mo80041a(Facet facet) {
        ArrayList arrayList = new ArrayList();
        for (Object next : facet.mo118343h()) {
            if (next instanceof Filter.CheckboxFilter) {
                arrayList.add(next);
            }
        }
        ArrayList<Filter.CheckboxFilter> arrayList2 = new ArrayList<>();
        for (Object next2 : arrayList) {
            if (((Filter.CheckboxFilter) next2).isSelected()) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(arrayList2, 10));
        for (Filter.CheckboxFilter checkboxFilter : arrayList2) {
            String Q3 = checkboxFilter.mo118356Q3();
            ArrayList<Term> arrayList4 = new ArrayList<>();
            for (Object next3 : checkboxFilter.mo118368i()) {
                if (((Term) next3).isSelected()) {
                    arrayList4.add(next3);
                }
            }
            ArrayList arrayList5 = new ArrayList(C10978t.m41495Y(arrayList4, 10));
            for (Term e : arrayList4) {
                arrayList5.add(C38112f.m157657a(e.mo118626e()));
            }
            arrayList3.add(new C38105d(Q3, arrayList5, (DefaultConstructorMarker) null));
        }
        ArrayList<Sort> arrayList6 = new ArrayList<>();
        for (Object next4 : facet.mo118345i()) {
            if (((Sort) next4).isSelected()) {
                arrayList6.add(next4);
            }
        }
        ArrayList arrayList7 = new ArrayList(C10978t.m41495Y(arrayList6, 10));
        for (Sort f : arrayList6) {
            arrayList7.add(C38111e.m157649a(f.mo118611f()));
        }
        return new C38104c(arrayList3, arrayList7);
    }

    @C12579k
    /* renamed from: b */
    public Object mo80042b() {
        Facet f = this.f66952a.mo80174f();
        if (f != null) {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(new Pair(f, mo80041a(f)));
        }
        Result.C10852a aVar2 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new Throwable("No facet")));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Result.m38701a(mo80042b());
    }
}
