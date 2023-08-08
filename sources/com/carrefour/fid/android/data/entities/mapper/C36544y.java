package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.C36377a;
import com.carrefour.fid.android.data.entities.APIMProductsRequest;
import com.carrefour.fid.android.domain.models.ProductListFilter;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.carrefour.fid.android.presentation.models.SortModel;
import com.carrefour.fid.android.presentation.models.TermModel;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.constant.C28597t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAPIMProductsRequestParamMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIMProductsRequestParamMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMProductsRequestParamMapper\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n457#2:114\n403#2:115\n1238#3,4:116\n1855#3:120\n766#3:121\n857#3,2:122\n1855#3,2:124\n1856#3:126\n*S KotlinDebug\n*F\n+ 1 APIMProductsRequestParamMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMProductsRequestParamMapper\n*L\n54#1:114\n54#1:115\n54#1:116,4\n74#1:120\n76#1:121\n76#1:122,2\n80#1:124,2\n74#1:126\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.y */
public final class C36544y extends C28486g<C36545a, APIMProductsRequest> {

    /* renamed from: b */
    public static final int f90246b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.y$a */
    public static final class C36545a {

        /* renamed from: l */
        public static final int f90247l = 8;
        @C12579k

        /* renamed from: a */
        public final String f90248a;
        @C12579k

        /* renamed from: b */
        public final String f90249b;
        @C12579k

        /* renamed from: c */
        public final List<ProductListFilter> f90250c;

        /* renamed from: d */
        public final int f90251d;
        @C12580l

        /* renamed from: e */
        public final Integer f90252e;
        @C12580l

        /* renamed from: f */
        public final String f90253f;
        @C12580l

        /* renamed from: g */
        public final String f90254g;
        @C12580l

        /* renamed from: h */
        public final String f90255h;
        @C12580l

        /* renamed from: i */
        public final SortModel f90256i;
        @C12580l

        /* renamed from: j */
        public final List<FacetModel> f90257j;
        @C12580l

        /* renamed from: k */
        public final Pair<String, String> f90258k;

        public C36545a(@C12579k String str, @C12579k String str2, @C12579k List<? extends ProductListFilter> list, int i, @C12580l Integer num, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l SortModel sortModel, @C12580l List<FacetModel> list2, @C12580l Pair<String, String> pair) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str2, C28547h2.f69319g);
            Intrinsics.checkNotNullParameter(list, "filter");
            this.f90248a = str;
            this.f90249b = str2;
            this.f90250c = list;
            this.f90251d = i;
            this.f90252e = num;
            this.f90253f = str3;
            this.f90254g = str4;
            this.f90255h = str5;
            this.f90256i = sortModel;
            this.f90257j = list2;
            this.f90258k = pair;
        }

        @C12580l
        /* renamed from: a */
        public final List<FacetModel> mo111373a() {
            return this.f90257j;
        }

        @C12579k
        /* renamed from: b */
        public final String mo111374b() {
            return this.f90248a;
        }

        @C12579k
        /* renamed from: c */
        public final List<ProductListFilter> mo111375c() {
            return this.f90250c;
        }

        @C12580l
        /* renamed from: d */
        public final Pair<String, String> mo111376d() {
            return this.f90258k;
        }

        @C12580l
        /* renamed from: e */
        public final Integer mo111377e() {
            return this.f90252e;
        }

        @C12580l
        /* renamed from: f */
        public final String mo111378f() {
            return this.f90254g;
        }

        @C12580l
        /* renamed from: g */
        public final String mo111379g() {
            return this.f90253f;
        }

        @C12580l
        /* renamed from: h */
        public final String mo111380h() {
            return this.f90255h;
        }

        @C12579k
        /* renamed from: i */
        public final String mo111381i() {
            return this.f90249b;
        }

        @C12580l
        /* renamed from: j */
        public final SortModel mo111382j() {
            return this.f90256i;
        }

        /* renamed from: k */
        public final int mo111383k() {
            return this.f90251d;
        }
    }

    @C12580l
    /* renamed from: d */
    public final String mo111369d(@C12580l String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "group_8")) {
            return C28597t1.f69900h;
        }
        return null;
    }

    /* renamed from: e */
    public final C36377a mo111370e(String str, List<? extends ProductListFilter> list, Pair<String, String> pair, List<FacetModel> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("facetFilter[offers.availability.slice_available." + str + "]", C10976s.m41419k(String.valueOf(list.contains(ProductListFilter.SliceAvailable))));
        if (pair != null) {
            String e = pair.mo21849e();
            linkedHashMap.put("facetFilter[" + e + "]", C10976s.m41419k(pair.mo21851f()));
        }
        if (list2 != null) {
            for (FacetModel facetModel : list2) {
                ArrayList<TermModel> arrayList = new ArrayList<>();
                for (Object next : facetModel.mo121578e0()) {
                    if (((TermModel) next).mo121965g()) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() > 1) {
                    ArrayList arrayList2 = new ArrayList();
                    for (TermModel h : arrayList) {
                        arrayList2.add(h.mo121966h());
                    }
                    String W = facetModel.mo121572W();
                    linkedHashMap.put("facetFilter[" + W + "]", arrayList2);
                } else if (!arrayList.isEmpty()) {
                    String W2 = facetModel.mo121572W();
                    linkedHashMap.put("facetFilter[" + W2 + "]", C10976s.m41419k(((TermModel) CollectionsKt___CollectionsKt.m40706w2(arrayList)).mo121966h()));
                }
            }
        }
        return new C36377a(linkedHashMap);
    }

    /* renamed from: f */
    public final Map<String, String> mo111371f(SortModel sortModel) {
        SortModel.SortValue sortValue;
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SortModel.SortValue sortValue2 = SortModel.SortValue.PRICE_PER_UNIT;
        SortModel.SortValue sortValue3 = null;
        if (sortModel != null) {
            sortValue = sortModel.mo121944f();
        } else {
            sortValue = null;
        }
        if (sortValue2 == sortValue) {
            String valueOf = String.valueOf(sortValue2.mo121951r());
            SortModel.SortOrder e = sortModel.mo121942e();
            if (e == null || (str2 = e.mo121949r()) == null) {
                str2 = SortModel.SortOrder.ASC.mo121949r();
            }
            linkedHashMap.put(valueOf, str2);
        } else {
            SortModel.SortValue sortValue4 = SortModel.SortValue.SALE_PRICE;
            if (sortModel != null) {
                sortValue3 = sortModel.mo121944f();
            }
            if (sortValue4 == sortValue3) {
                String valueOf2 = String.valueOf(sortValue4.mo121951r());
                SortModel.SortOrder e2 = sortModel.mo121942e();
                if (e2 == null || (str = e2.mo121949r()) == null) {
                    str = SortModel.SortOrder.ASC.mo121949r();
                }
                linkedHashMap.put(valueOf2, str);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10975r0.m41400j(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put("sort[" + entry.getKey() + "]", entry.getValue());
        }
        return linkedHashMap2;
    }

    @C12579k
    /* renamed from: g */
    public APIMProductsRequest mo72340a(@C12579k C36545a aVar) {
        int i;
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(aVar, "entity");
        C11368t0 t0Var = C11368t0.f28504a;
        boolean z2 = true;
        String format = String.format(C28597t1.f69899g, Arrays.copyOf(new Object[]{aVar.mo111374b()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        List k = C10976s.m41419k(format);
        int k2 = aVar.mo111383k();
        Integer e = aVar.mo111377e();
        if (e != null) {
            i = e.intValue();
        } else {
            i = 10;
        }
        int i2 = i;
        String g = aVar.mo111379g();
        String h = aVar.mo111380h();
        String f = aVar.mo111378f();
        if (f == null || C11622t.isBlank(f)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String g2 = aVar.mo111379g();
            if (g2 != null && !C11622t.isBlank(g2)) {
                z2 = false;
            }
            if (z2) {
                str = null;
                return new APIMProductsRequest(k, k2, i2, mo111370e(aVar.mo111381i(), aVar.mo111375c(), aVar.mo111376d(), aVar.mo111373a()), mo111371f(aVar.mo111382j()), g, str, h, aVar.mo111378f());
            }
        }
        str = C28597t1.f69898f;
        return new APIMProductsRequest(k, k2, i2, mo111370e(aVar.mo111381i(), aVar.mo111375c(), aVar.mo111376d(), aVar.mo111373a()), mo111371f(aVar.mo111382j()), g, str, h, aVar.mo111378f());
    }
}
