package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.shared.data.headers.C28642c;
import com.carrefour.fid.android.shared.p045di.annotation.C28663g;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFacetProductCountDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetProductCountDataSource.kt\ncom/carrefour/fid/android/product/data/api/datasource/FacetProductCountDataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1549#2:108\n1620#2,3:109\n1549#2:112\n1620#2,3:113\n1549#2:116\n1620#2,3:117\n1549#2:121\n1620#2,3:122\n1#3:120\n*S KotlinDebug\n*F\n+ 1 FacetProductCountDataSource.kt\ncom/carrefour/fid/android/product/data/api/datasource/FacetProductCountDataSource\n*L\n34#1:108\n34#1:109,3\n56#1:112\n56#1:113,3\n77#1:116\n77#1:117,3\n99#1:121\n99#1:122,3\n*E\n"})
public final class FacetProductCountDataSource {
    @C12579k

    /* renamed from: a */
    public final BffProductsManagementApi f66582a;
    @C12579k

    /* renamed from: b */
    public final C28642c f66583b;

    @Inject
    public FacetProductCountDataSource(@C28663g @C12579k BffProductsManagementApi bffProductsManagementApi, @C12579k C28642c cVar) {
        Intrinsics.checkNotNullParameter(bffProductsManagementApi, "api");
        Intrinsics.checkNotNullParameter(cVar, "authHeadersRepository");
        this.f66582a = bffProductsManagementApi;
        this.f66583b = cVar;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m115554b(FacetProductCountDataSource facetProductCountDataSource, String str, String str2, List list, List list2, List list3, C11045c cVar, int i, Object obj) {
        if ((i & 8) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            list3 = CollectionsKt__CollectionsKt.m40441E();
        }
        return facetProductCountDataSource.mo79826a(str, str2, list, list4, list3, cVar);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m115555d(FacetProductCountDataSource facetProductCountDataSource, String str, String str2, List list, List list2, C11045c cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        return facetProductCountDataSource.mo79827c(str, str2, list3, list2, cVar);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m115556f(FacetProductCountDataSource facetProductCountDataSource, String str, String str2, String str3, List list, List list2, C11045c cVar, int i, Object obj) {
        if ((i & 8) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        return facetProductCountDataSource.mo79828e(str, str2, str3, list3, list2, cVar);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m115557h(FacetProductCountDataSource facetProductCountDataSource, String str, String str2, String str3, List list, List list2, C11045c cVar, int i, Object obj) {
        if ((i & 8) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        return facetProductCountDataSource.mo79829g(str, str2, str3, list3, list2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79826a(@org.jetbrains.annotations.C12579k java.lang.String r25, @org.jetbrains.annotations.C12579k java.lang.String r26, @org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r27, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r28, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r29, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.Facet>> r30) {
        /*
            r24 = this;
            r1 = r24
            r0 = r30
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getDepartmentFacets$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getDepartmentFacets$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getDepartmentFacets$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getDepartmentFacets$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getDepartmentFacets$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x002e }
            goto L_0x00a8
        L_0x002e:
            r0 = move-exception
            goto L_0x00b5
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0039:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r1.f66582a     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.shared.data.headers.c r0 = r1.f66583b     // Catch:{ all -> 0x002e }
            java.lang.String r0 = com.carrefour.fid.android.shared.util.C28905c.m119542a(r0)     // Catch:{ all -> 0x002e }
            java.util.List r19 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r25)     // Catch:{ all -> 0x002e }
            r5 = r27
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x002e }
            java.util.List r6 = com.carrefour.fid.android.product.data.api.datasource.C27464d.m115610a(r28)     // Catch:{ all -> 0x002e }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x002e }
            java.util.List r14 = kotlin.collections.CollectionsKt___CollectionsKt.m40718y4(r5, r6)     // Catch:{ all -> 0x002e }
            r5 = r29
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x002e }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x002e }
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r5, r6)     // Catch:{ all -> 0x002e }
            r13.<init>(r6)     // Catch:{ all -> 0x002e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x002e }
        L_0x0069:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x007d
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.domain.models.product.e r6 = (com.carrefour.fid.android.domain.models.product.C38111e) r6     // Catch:{ all -> 0x002e }
            java.lang.String r6 = r6.mo118782h()     // Catch:{ all -> 0x002e }
            r13.add(r6)     // Catch:{ all -> 0x002e }
            goto L_0x0069
        L_0x007d:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 21502(0x53fe, float:3.0131E-41)
            r22 = 0
            r2.label = r4     // Catch:{ all -> 0x002e }
            r4 = r0
            r0 = r13
            r13 = r16
            r23 = r15
            r15 = r26
            r16 = r17
            r17 = r0
            r20 = r2
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPlpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x002e }
            r2 = r23
            if (r0 != r2) goto L_0x00a8
            return r2
        L_0x00a8:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2 r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115627f(r0)     // Catch:{ all -> 0x002e }
            goto L_0x00bf
        L_0x00b5:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00bf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource.mo79826a(java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79827c(@org.jetbrains.annotations.C12579k java.lang.String r25, @org.jetbrains.annotations.C12579k java.lang.String r26, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r27, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r28, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.Facet>> r29) {
        /*
            r24 = this;
            r1 = r24
            r0 = r29
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getPromoFacets$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getPromoFacets$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getPromoFacets$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getPromoFacets$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getPromoFacets$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x002e }
            goto L_0x009f
        L_0x002e:
            r0 = move-exception
            goto L_0x00ac
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0039:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r1.f66582a     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.shared.data.headers.c r0 = r1.f66583b     // Catch:{ all -> 0x002e }
            java.lang.String r0 = com.carrefour.fid.android.shared.util.C28905c.m119542a(r0)     // Catch:{ all -> 0x002e }
            java.util.List r19 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r25)     // Catch:{ all -> 0x002e }
            java.util.List r14 = com.carrefour.fid.android.product.data.api.datasource.C27464d.m115610a(r27)     // Catch:{ all -> 0x002e }
            r5 = r28
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x002e }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x002e }
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r5, r6)     // Catch:{ all -> 0x002e }
            r13.<init>(r6)     // Catch:{ all -> 0x002e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x002e }
        L_0x005f:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x0073
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.domain.models.product.e r6 = (com.carrefour.fid.android.domain.models.product.C38111e) r6     // Catch:{ all -> 0x002e }
            java.lang.String r6 = r6.mo118782h()     // Catch:{ all -> 0x002e }
            r13.add(r6)     // Catch:{ all -> 0x002e }
            goto L_0x005f
        L_0x0073:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r11 = "group_8"
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 21374(0x537e, float:2.9951E-41)
            r22 = 0
            r2.label = r4     // Catch:{ all -> 0x002e }
            r4 = r0
            r0 = r13
            r13 = r16
            r23 = r15
            r15 = r26
            r16 = r17
            r17 = r0
            r20 = r2
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPlpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x002e }
            r2 = r23
            if (r0 != r2) goto L_0x009f
            return r2
        L_0x009f:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2 r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115627f(r0)     // Catch:{ all -> 0x002e }
            goto L_0x00b6
        L_0x00ac:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource.mo79827c(java.lang.String, java.lang.String, java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79828e(@org.jetbrains.annotations.C12579k java.lang.String r25, @org.jetbrains.annotations.C12579k java.lang.String r26, @org.jetbrains.annotations.C12579k java.lang.String r27, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r28, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r29, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.Facet>> r30) {
        /*
            r24 = this;
            r1 = r24
            r0 = r30
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getQueryFacets$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getQueryFacets$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getQueryFacets$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getQueryFacets$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getQueryFacets$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x002e }
            goto L_0x00ad
        L_0x002e:
            r0 = move-exception
            goto L_0x00ba
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0039:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r1.f66582a     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.shared.data.headers.c r0 = r1.f66583b     // Catch:{ all -> 0x002e }
            java.lang.String r0 = com.carrefour.fid.android.shared.util.C28905c.m119542a(r0)     // Catch:{ all -> 0x002e }
            java.util.List r19 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r25)     // Catch:{ all -> 0x002e }
            int r5 = r27.length()     // Catch:{ all -> 0x002e }
            if (r5 != 0) goto L_0x0050
            r5 = r4
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            if (r5 == 0) goto L_0x0056
            r5 = 0
            r10 = r5
            goto L_0x0058
        L_0x0056:
            r10 = r27
        L_0x0058:
            java.util.List r14 = com.carrefour.fid.android.product.data.api.datasource.C27464d.m115610a(r28)     // Catch:{ all -> 0x002e }
            r5 = r29
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x002e }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x002e }
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r5, r6)     // Catch:{ all -> 0x002e }
            r13.<init>(r6)     // Catch:{ all -> 0x002e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x002e }
        L_0x006f:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x0083
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.domain.models.product.e r6 = (com.carrefour.fid.android.domain.models.product.C38111e) r6     // Catch:{ all -> 0x002e }
            java.lang.String r6 = r6.mo118782h()     // Catch:{ all -> 0x002e }
            r13.add(r6)     // Catch:{ all -> 0x002e }
            goto L_0x006f
        L_0x0083:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 21438(0x53be, float:3.0041E-41)
            r22 = 0
            r2.label = r4     // Catch:{ all -> 0x002e }
            r4 = r0
            r0 = r13
            r13 = r16
            r23 = r15
            r15 = r26
            r16 = r17
            r17 = r0
            r20 = r2
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPlpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x002e }
            r2 = r23
            if (r0 != r2) goto L_0x00ad
            return r2
        L_0x00ad:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2 r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115627f(r0)     // Catch:{ all -> 0x002e }
            goto L_0x00c4
        L_0x00ba:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource.mo79828e(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79829g(@org.jetbrains.annotations.C12579k java.lang.String r25, @org.jetbrains.annotations.C12579k java.lang.String r26, @org.jetbrains.annotations.C12579k java.lang.String r27, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38105d> r28, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.C38111e> r29, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.Facet>> r30) {
        /*
            r24 = this;
            r1 = r24
            r0 = r30
            boolean r2 = r0 instanceof com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getSearchFacets$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getSearchFacets$1 r2 = (com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getSearchFacets$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getSearchFacets$1 r2 = new com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource$getSearchFacets$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x002e }
            goto L_0x009c
        L_0x002e:
            r0 = move-exception
            goto L_0x00a9
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0039:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r3 = r1.f66582a     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.shared.data.headers.c r0 = r1.f66583b     // Catch:{ all -> 0x002e }
            java.lang.String r0 = com.carrefour.fid.android.shared.util.C28905c.m119542a(r0)     // Catch:{ all -> 0x002e }
            java.util.List r19 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r25)     // Catch:{ all -> 0x002e }
            java.util.List r14 = com.carrefour.fid.android.product.data.api.datasource.C27464d.m115610a(r28)     // Catch:{ all -> 0x002e }
            r5 = r29
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x002e }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x002e }
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r5, r6)     // Catch:{ all -> 0x002e }
            r13.<init>(r6)     // Catch:{ all -> 0x002e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x002e }
        L_0x005f:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x0073
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.domain.models.product.e r6 = (com.carrefour.fid.android.domain.models.product.C38111e) r6     // Catch:{ all -> 0x002e }
            java.lang.String r6 = r6.mo118782h()     // Catch:{ all -> 0x002e }
            r13.add(r6)     // Catch:{ all -> 0x002e }
            goto L_0x005f
        L_0x0073:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r18 = 0
            r21 = 17406(0x43fe, float:2.4391E-41)
            r22 = 0
            r2.label = r4     // Catch:{ all -> 0x002e }
            r4 = r0
            r0 = r13
            r13 = r16
            r23 = r15
            r15 = r26
            r16 = r27
            r17 = r0
            r20 = r2
            java.lang.Object r0 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi.DefaultImpls.getPlpProducts$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x002e }
            r2 = r23
            if (r0 != r2) goto L_0x009c
            return r2
        L_0x009c:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x002e }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2 r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.mapper.C27473b.m115627f(r0)     // Catch:{ all -> 0x002e }
            goto L_0x00b3
        L_0x00a9:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource.mo79829g(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }
}
