package com.carrefour.fid.android.domain.models.product;

import com.carrefour.fid.android.domain.models.product.Filter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFacet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Facet.kt\ncom/carrefour/fid/android/domain/models/product/FacetKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n766#2:82\n857#2,2:83\n1549#2:85\n1620#2,3:86\n800#2,11:89\n766#2:100\n857#2,2:101\n1549#2:103\n1620#2,2:104\n766#2:106\n857#2,2:107\n1549#2:109\n1620#2,3:110\n1622#2:113\n*S KotlinDebug\n*F\n+ 1 Facet.kt\ncom/carrefour/fid/android/domain/models/product/FacetKt\n*L\n30#1:82\n30#1:83,2\n30#1:85\n30#1:86,3\n33#1:89,11\n33#1:100\n33#1:101,2\n33#1:103\n33#1:104,2\n36#1:106\n36#1:107,2\n36#1:109\n36#1:110,3\n33#1:113\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.models.product.b */
public final class C38103b {
    @C12579k
    /* renamed from: a */
    public static final List<C38105d> m157528a(@C12579k Facet facet) {
        Intrinsics.checkNotNullParameter(facet, "<this>");
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
        return arrayList3;
    }

    @C12579k
    /* renamed from: b */
    public static final List<C38111e> m157529b(@C12579k Facet facet) {
        Intrinsics.checkNotNullParameter(facet, "<this>");
        ArrayList<Sort> arrayList = new ArrayList<>();
        for (Object next : facet.mo118345i()) {
            if (((Sort) next).isSelected()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (Sort f : arrayList) {
            arrayList2.add(C38111e.m157649a(f.mo118611f()));
        }
        return arrayList2;
    }
}
