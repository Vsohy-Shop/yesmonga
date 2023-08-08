package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.domain.models.product.C38111e;
import com.carrefour.fid.android.domain.models.product.C38112f;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.domain.models.product.Term;
import com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C11363r0({"SMAP\nFacetRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/FacetRepository\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n230#2,5:182\n230#2,5:187\n230#2,5:192\n230#2,5:197\n230#2,5:257\n800#3,11:202\n1549#3:213\n1620#3,2:214\n1549#3:216\n1620#3,3:217\n1622#3:220\n1549#3:221\n1620#3,3:222\n800#3,11:225\n1549#3:236\n1620#3,2:237\n2624#3,3:239\n766#3:242\n857#3,2:243\n1549#3:245\n1620#3,2:246\n1747#3,3:248\n1622#3:251\n1622#3:252\n1549#3:253\n1620#3,3:254\n*S KotlinDebug\n*F\n+ 1 FacetRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/FacetRepository\n*L\n52#1:182,5\n74#1:187,5\n94#1:192,5\n116#1:197,5\n173#1:257,5\n124#1:202,11\n124#1:213\n124#1:214,2\n125#1:216\n125#1:217,3\n124#1:220\n136#1:221\n136#1:222,3\n148#1:225,11\n148#1:236\n148#1:237,2\n149#1:239,3\n151#1:242\n151#1:243,2\n152#1:245\n152#1:246,2\n153#1:248,3\n152#1:251\n148#1:252\n164#1:253\n164#1:254,3\n*E\n"})
public final class FacetRepository {
    @C12579k

    /* renamed from: a */
    public final FacetProductCountDataSource f67039a;
    @C12579k

    /* renamed from: b */
    public final C11940j<Facet> f67040b;
    @C12579k

    /* renamed from: c */
    public final C11952u<Facet> f67041c;
    @C12580l

    /* renamed from: d */
    public Facet f67042d;

    @Inject
    public FacetRepository(@C12579k FacetProductCountDataSource facetProductCountDataSource) {
        Intrinsics.checkNotNullParameter(facetProductCountDataSource, "apiSource");
        this.f67039a = facetProductCountDataSource;
        C11940j<Facet> a = C11953v.m47628a(Facet.f96242f.mo118351a());
        this.f67040b = a;
        this.f67041c = C11909g.m47470m(a);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m116120d(FacetRepository facetRepository, String str, String str2, List list, List list2, List list3, C11045c cVar, int i, Object obj) {
        if ((i & 8) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            list3 = CollectionsKt__CollectionsKt.m40441E();
        }
        return facetRepository.mo80172c(str, str2, list, list4, list3, cVar);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m116121h(FacetRepository facetRepository, String str, String str2, List list, List list2, C11045c cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        return facetRepository.mo80175g(str, str2, list3, list2, cVar);
    }

    /* renamed from: j */
    public static /* synthetic */ Object m116122j(FacetRepository facetRepository, String str, String str2, String str3, List list, List list2, C11045c cVar, int i, Object obj) {
        if ((i & 8) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        return facetRepository.mo80176i(str, str2, str3, list3, list2, cVar);
    }

    /* renamed from: l */
    public static /* synthetic */ Object m116123l(FacetRepository facetRepository, String str, String str2, String str3, List list, List list2, C11045c cVar, int i, Object obj) {
        if ((i & 8) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        return facetRepository.mo80177k(str, str2, str3, list3, list2, cVar);
    }

    /* renamed from: a */
    public final void mo80170a() {
        Facet value;
        int i;
        Facet value2 = this.f67040b.getValue();
        C11940j<Facet> jVar = this.f67040b;
        do {
            value = jVar.getValue();
            Facet facet = value;
            Facet facet2 = this.f67042d;
            if (facet2 != null) {
                i = facet2.mo118346j();
            } else {
                i = 0;
            }
        } while (!jVar.mo24216e(value, mo80171b(value2, i)));
    }

    /* renamed from: b */
    public final Facet mo80171b(Facet facet, int i) {
        ArrayList<Filter.CheckboxFilter> arrayList = new ArrayList<>();
        for (Object next : facet.mo118343h()) {
            if (next instanceof Filter.CheckboxFilter) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (Filter.CheckboxFilter checkboxFilter : arrayList) {
            Iterable<Term> i2 = checkboxFilter.mo118368i();
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(i2, 10));
            for (Term d : i2) {
                arrayList3.add(Term.m157499d(d, (String) null, false, 1, (Object) null));
            }
            arrayList2.add(Filter.CheckboxFilter.m157294g(checkboxFilter, (String) null, (String) null, false, arrayList3, false, 19, (Object) null));
        }
        Iterable<Sort> i3 = facet.mo118345i();
        ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(i3, 10));
        for (Sort e : i3) {
            arrayList4.add(Sort.m157489e(e, (String) null, (String) null, false, 3, (Object) null));
        }
        return new Facet(arrayList2, arrayList4, i, facet.mo118348l(), facet.mo118347k());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.util.List<com.carrefour.fid.android.domain.models.product.e>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List<com.carrefour.fid.android.domain.models.product.d>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo80172c(@org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k java.lang.String r10, @org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r11, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r12, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.Facet>> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.product.domain.repositories.FacetRepository$getDepartmentFacet$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.product.domain.repositories.FacetRepository$getDepartmentFacet$1 r0 = (com.carrefour.fid.android.product.domain.repositories.FacetRepository$getDepartmentFacet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.repositories.FacetRepository$getDepartmentFacet$1 r0 = new com.carrefour.fid.android.product.domain.repositories.FacetRepository$getDepartmentFacet$1
            r0.<init>(r8, r14)
        L_0x0018:
            r7 = r0
            java.lang.Object r14 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 != r2) goto L_0x003e
            java.lang.Object r9 = r7.L$2
            r13 = r9
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r9 = r7.L$1
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r9 = r7.L$0
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r9 = (com.carrefour.fid.android.product.domain.repositories.FacetRepository) r9
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r10 = r14.mo21858l()
            goto L_0x0060
        L_0x003e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0046:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource r1 = r8.f67039a
            r7.L$0 = r8
            r7.L$1 = r12
            r7.L$2 = r13
            r7.label = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r10 = r1.mo79826a(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r9 = r8
        L_0x0060:
            java.lang.Throwable r11 = kotlin.Result.m38705e(r10)
            if (r11 != 0) goto L_0x0082
            com.carrefour.fid.android.domain.models.product.Facet r10 = (com.carrefour.fid.android.domain.models.product.Facet) r10
            com.carrefour.fid.android.domain.models.product.Facet r10 = r9.mo80179n(r10, r12, r13)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.product.Facet> r9 = r9.f67040b
        L_0x006e:
            java.lang.Object r11 = r9.getValue()
            r12 = r11
            com.carrefour.fid.android.domain.models.product.Facet r12 = (com.carrefour.fid.android.domain.models.product.Facet) r12
            boolean r11 = r9.mo24216e(r11, r10)
            if (r11 == 0) goto L_0x006e
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.Result.m38702b(r10)
            goto L_0x008c
        L_0x0082:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
        L_0x008c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.FacetRepository.mo80172c(java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: e */
    public final C11952u<Facet> mo80173e() {
        return this.f67041c;
    }

    @C12580l
    /* renamed from: f */
    public final Facet mo80174f() {
        return this.f67042d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List<com.carrefour.fid.android.domain.models.product.e>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List<com.carrefour.fid.android.domain.models.product.d>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo80175g(@org.jetbrains.annotations.C12579k java.lang.String r8, @org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r10, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.Facet>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.product.domain.repositories.FacetRepository$getPromoFacet$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.product.domain.repositories.FacetRepository$getPromoFacet$1 r0 = (com.carrefour.fid.android.product.domain.repositories.FacetRepository$getPromoFacet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.repositories.FacetRepository$getPromoFacet$1 r0 = new com.carrefour.fid.android.product.domain.repositories.FacetRepository$getPromoFacet$1
            r0.<init>(r7, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 != r2) goto L_0x003e
            java.lang.Object r8 = r6.L$2
            r11 = r8
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r8 = r6.L$1
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r8 = r6.L$0
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r8 = (com.carrefour.fid.android.product.domain.repositories.FacetRepository) r8
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r9 = r12.mo21858l()
            goto L_0x005f
        L_0x003e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0046:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource r1 = r7.f67039a
            r6.L$0 = r7
            r6.L$1 = r10
            r6.L$2 = r11
            r6.label = r2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r9 = r1.mo79827c(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L_0x005e
            return r0
        L_0x005e:
            r8 = r7
        L_0x005f:
            java.lang.Throwable r12 = kotlin.Result.m38705e(r9)
            if (r12 != 0) goto L_0x0081
            com.carrefour.fid.android.domain.models.product.Facet r9 = (com.carrefour.fid.android.domain.models.product.Facet) r9
            com.carrefour.fid.android.domain.models.product.Facet r9 = r8.mo80179n(r9, r10, r11)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.product.Facet> r8 = r8.f67040b
        L_0x006d:
            java.lang.Object r10 = r8.getValue()
            r11 = r10
            com.carrefour.fid.android.domain.models.product.Facet r11 = (com.carrefour.fid.android.domain.models.product.Facet) r11
            boolean r10 = r8.mo24216e(r10, r9)
            if (r10 == 0) goto L_0x006d
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.Result.m38702b(r9)
            goto L_0x008b
        L_0x0081:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x008b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.FacetRepository.mo80175g(java.lang.String, java.lang.String, java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.util.List<com.carrefour.fid.android.domain.models.product.e>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List<com.carrefour.fid.android.domain.models.product.d>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo80176i(@org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k java.lang.String r10, @org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r12, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.Facet>> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.product.domain.repositories.FacetRepository$getQueryFacet$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.product.domain.repositories.FacetRepository$getQueryFacet$1 r0 = (com.carrefour.fid.android.product.domain.repositories.FacetRepository$getQueryFacet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.repositories.FacetRepository$getQueryFacet$1 r0 = new com.carrefour.fid.android.product.domain.repositories.FacetRepository$getQueryFacet$1
            r0.<init>(r8, r14)
        L_0x0018:
            r7 = r0
            java.lang.Object r14 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 != r2) goto L_0x003e
            java.lang.Object r9 = r7.L$2
            r13 = r9
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r9 = r7.L$1
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r9 = r7.L$0
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r9 = (com.carrefour.fid.android.product.domain.repositories.FacetRepository) r9
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r10 = r14.mo21858l()
            goto L_0x0060
        L_0x003e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0046:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource r1 = r8.f67039a
            r7.L$0 = r8
            r7.L$1 = r12
            r7.L$2 = r13
            r7.label = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r10 = r1.mo79828e(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r9 = r8
        L_0x0060:
            java.lang.Throwable r11 = kotlin.Result.m38705e(r10)
            if (r11 != 0) goto L_0x0082
            com.carrefour.fid.android.domain.models.product.Facet r10 = (com.carrefour.fid.android.domain.models.product.Facet) r10
            com.carrefour.fid.android.domain.models.product.Facet r10 = r9.mo80179n(r10, r12, r13)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.product.Facet> r9 = r9.f67040b
        L_0x006e:
            java.lang.Object r11 = r9.getValue()
            r12 = r11
            com.carrefour.fid.android.domain.models.product.Facet r12 = (com.carrefour.fid.android.domain.models.product.Facet) r12
            boolean r11 = r9.mo24216e(r11, r10)
            if (r11 == 0) goto L_0x006e
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.Result.m38702b(r10)
            goto L_0x008c
        L_0x0082:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
        L_0x008c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.FacetRepository.mo80176i(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.util.List<com.carrefour.fid.android.domain.models.product.e>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List<com.carrefour.fid.android.domain.models.product.d>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo80177k(@org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k java.lang.String r10, @org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r12, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.Facet>> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.product.domain.repositories.FacetRepository$getSearchFacet$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.product.domain.repositories.FacetRepository$getSearchFacet$1 r0 = (com.carrefour.fid.android.product.domain.repositories.FacetRepository$getSearchFacet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.repositories.FacetRepository$getSearchFacet$1 r0 = new com.carrefour.fid.android.product.domain.repositories.FacetRepository$getSearchFacet$1
            r0.<init>(r8, r14)
        L_0x0018:
            r7 = r0
            java.lang.Object r14 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 != r2) goto L_0x003e
            java.lang.Object r9 = r7.L$2
            r13 = r9
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r9 = r7.L$1
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r9 = r7.L$0
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r9 = (com.carrefour.fid.android.product.domain.repositories.FacetRepository) r9
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r10 = r14.mo21858l()
            goto L_0x0060
        L_0x003e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0046:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource r1 = r8.f67039a
            r7.L$0 = r8
            r7.L$1 = r12
            r7.L$2 = r13
            r7.label = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r10 = r1.mo79829g(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r9 = r8
        L_0x0060:
            java.lang.Throwable r11 = kotlin.Result.m38705e(r10)
            if (r11 != 0) goto L_0x0082
            com.carrefour.fid.android.domain.models.product.Facet r10 = (com.carrefour.fid.android.domain.models.product.Facet) r10
            com.carrefour.fid.android.domain.models.product.Facet r10 = r9.mo80179n(r10, r12, r13)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.product.Facet> r9 = r9.f67040b
        L_0x006e:
            java.lang.Object r11 = r9.getValue()
            r12 = r11
            com.carrefour.fid.android.domain.models.product.Facet r12 = (com.carrefour.fid.android.domain.models.product.Facet) r12
            boolean r11 = r9.mo24216e(r11, r10)
            if (r11 == 0) goto L_0x006e
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.Result.m38702b(r10)
            goto L_0x008c
        L_0x0082:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
        L_0x008c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.FacetRepository.mo80177k(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: m */
    public final void mo80178m(@C12580l Facet facet) {
        this.f67042d = facet;
        if (facet != null) {
            this.f67040b.setValue(Facet.m157278g(facet, (List) null, (List) null, 0, false, false, 31, (Object) null));
        }
    }

    /* renamed from: n */
    public final Facet mo80179n(Facet facet, List<C38105d> list, List<C38111e> list2) {
        Facet facet2;
        int i;
        boolean z;
        boolean z2;
        Facet facet3 = this.f67042d;
        if (facet3 != null) {
            i = facet3.mo118346j();
            facet2 = facet;
        } else {
            facet2 = facet;
            i = 0;
        }
        Facet b = mo80171b(facet2, i);
        ArrayList<Filter.CheckboxFilter> arrayList = new ArrayList<>();
        for (Object next : b.mo118343h()) {
            if (next instanceof Filter.CheckboxFilter) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (Filter.CheckboxFilter checkboxFilter : arrayList) {
            Iterable iterable = list;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Intrinsics.areEqual((Object) ((C38105d) it.next()).mo118670e(), (Object) checkboxFilter.mo118356Q3())) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Object next2 : iterable) {
                    if (Intrinsics.areEqual((Object) ((C38105d) next2).mo118670e(), (Object) checkboxFilter.mo118356Q3())) {
                        arrayList3.add(next2);
                    }
                }
                Iterable<Term> i2 = checkboxFilter.mo118368i();
                ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(i2, 10));
                for (Term term : i2) {
                    if (!arrayList3.isEmpty()) {
                        Iterator it2 = arrayList3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((C38105d) it2.next()).mo118672f().contains(C38112f.m157657a(term.mo118626e()))) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        arrayList4.add(Term.m157499d(term, (String) null, z2, 1, (Object) null));
                    }
                    z2 = false;
                    arrayList4.add(Term.m157499d(term, (String) null, z2, 1, (Object) null));
                }
                checkboxFilter = Filter.CheckboxFilter.m157294g(checkboxFilter, (String) null, (String) null, true, arrayList4, false, 19, (Object) null);
            }
            arrayList2.add(checkboxFilter);
        }
        Iterable<Sort> i3 = b.mo118345i();
        ArrayList arrayList5 = new ArrayList(C10978t.m41495Y(i3, 10));
        for (Sort sort : i3) {
            arrayList5.add(Sort.m157489e(sort, (String) null, (String) null, list2.contains(C38111e.m157649a(sort.mo118611f())), 3, (Object) null));
        }
        return new Facet(arrayList2, arrayList5, facet.mo118346j(), facet.mo118348l(), facet.mo118347k());
    }
}
