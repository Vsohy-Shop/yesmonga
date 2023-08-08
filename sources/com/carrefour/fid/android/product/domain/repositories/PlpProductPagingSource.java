package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource;
import com.carrefour.fid.android.product.domain.model.C27587e;
import com.carrefour.fid.android.shared.paging.C28844a;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class PlpProductPagingSource extends C28844a<Integer, C38115c> {
    @C12579k

    /* renamed from: e */
    public static final C27594a f67043e = new C27594a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f67044f = 0;
    @C12579k

    /* renamed from: b */
    public final C27587e f67045b;
    @C12579k

    /* renamed from: c */
    public final PlpProductListDataSource f67046c;
    @C12579k

    /* renamed from: d */
    public final FacetRepository f67047d;

    /* renamed from: com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$a */
    public static final class C27594a {
        public /* synthetic */ C27594a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27594a() {
        }
    }

    @Inject
    public PlpProductPagingSource(@C12579k C27587e eVar, @C12579k PlpProductListDataSource plpProductListDataSource, @C12579k FacetRepository facetRepository) {
        Intrinsics.checkNotNullParameter(eVar, "identifier");
        Intrinsics.checkNotNullParameter(plpProductListDataSource, "productsDataSource");
        Intrinsics.checkNotNullParameter(facetRepository, "facetRepository");
        this.f67045b = eVar;
        this.f67046c = plpProductListDataSource;
        this.f67047d = facetRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo80180a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.shared.paging.C28844a.C28845a<java.lang.Integer> r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.shared.paging.C28844a.C28847b<java.lang.Integer, com.carrefour.fid.android.domain.models.product.plp.C38115c>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$load$1 r0 = (com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$load$1 r0 = new com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$load$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource r8 = (com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource) r8
            kotlin.C11661u0.m45747n(r9)     // Catch:{ Exception -> 0x0093 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r9 = r9.mo21858l()     // Catch:{ Exception -> 0x0093 }
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.product.domain.model.e r9 = r7.f67045b     // Catch:{ Exception -> 0x0093 }
            r0.L$0 = r7     // Catch:{ Exception -> 0x0093 }
            r0.label = r3     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r9 = r7.mo80181c(r9, r8, r0)     // Catch:{ Exception -> 0x0093 }
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r8 = r7
        L_0x004c:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r9)     // Catch:{ Exception -> 0x0093 }
            if (r6 != 0) goto L_0x0082
            com.carrefour.fid.android.product.domain.model.b r9 = (com.carrefour.fid.android.product.domain.model.C27584b) r9     // Catch:{ Exception -> 0x0093 }
            java.lang.Integer r0 = r9.mo80077o()     // Catch:{ Exception -> 0x0093 }
            if (r0 != 0) goto L_0x0063
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r8 = r8.f67047d     // Catch:{ Exception -> 0x0093 }
            com.carrefour.fid.android.domain.models.product.Facet r0 = r9.mo80074l()     // Catch:{ Exception -> 0x0093 }
            r8.mo80178m(r0)     // Catch:{ Exception -> 0x0093 }
        L_0x0063:
            com.carrefour.fid.android.shared.paging.a$b$b r8 = new com.carrefour.fid.android.shared.paging.a$b$b     // Catch:{ Exception -> 0x0093 }
            java.util.List r1 = r9.mo80078p()     // Catch:{ Exception -> 0x0093 }
            java.lang.Integer r2 = r9.mo80077o()     // Catch:{ Exception -> 0x0093 }
            java.lang.Integer r3 = r9.mo80075m()     // Catch:{ Exception -> 0x0093 }
            int r0 = r9.mo80080r()     // Catch:{ Exception -> 0x0093 }
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r0)     // Catch:{ Exception -> 0x0093 }
            java.lang.Integer r5 = r9.mo80079q()     // Catch:{ Exception -> 0x0093 }
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0092
        L_0x0082:
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a     // Catch:{ Exception -> 0x0093 }
            java.lang.String r1 = "Error fetching product list"
            r3 = 0
            r4 = 4
            r5 = 0
            r2 = r6
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0093 }
            com.carrefour.fid.android.shared.paging.a$b$a r8 = new com.carrefour.fid.android.shared.paging.a$b$a     // Catch:{ Exception -> 0x0093 }
            r8.<init>(r6)     // Catch:{ Exception -> 0x0093 }
        L_0x0092:
            return r8
        L_0x0093:
            r8 = move-exception
            com.carrefour.fid.android.shared.paging.a$b$a r9 = new com.carrefour.fid.android.shared.paging.a$b$a
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource.mo80180a(com.carrefour.fid.android.shared.paging.a$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo80181c(com.carrefour.fid.android.product.domain.model.C27587e r11, com.carrefour.fid.android.shared.paging.C28844a.C28845a<java.lang.Integer> r12, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.product.domain.model.C27584b>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$fetchProducts$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$fetchProducts$1 r0 = (com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$fetchProducts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$fetchProducts$1 r0 = new com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource$fetchProducts$1
            r0.<init>(r10, r13)
        L_0x0018:
            r9 = r0
            java.lang.Object r13 = r9.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0070
            if (r1 == r6) goto L_0x0066
            if (r1 == r5) goto L_0x005b
            if (r1 == r4) goto L_0x0050
            if (r1 == r3) goto L_0x0045
            if (r1 != r2) goto L_0x003d
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r11 = r13.mo21858l()
            goto L_0x01e6
        L_0x003d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0045:
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r11 = r13.mo21858l()
            goto L_0x01cc
        L_0x0050:
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r11 = r13.mo21858l()
            goto L_0x0175
        L_0x005b:
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r11 = r13.mo21858l()
            goto L_0x0121
        L_0x0066:
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r11 = r13.mo21858l()
            goto L_0x00ca
        L_0x0070:
            kotlin.C11661u0.m45747n(r13)
            boolean r13 = r11 instanceof com.carrefour.fid.android.product.domain.model.C27587e.C27588a
            r1 = 0
            r7 = 0
            if (r13 == 0) goto L_0x00cb
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r13 = r10.f67046c
            com.carrefour.fid.android.product.domain.model.e$a r11 = (com.carrefour.fid.android.product.domain.model.C27587e.C27588a) r11
            java.util.List r2 = r11.mo80105h()
            java.util.List r3 = r11.mo80107i()
            com.carrefour.fid.android.domain.models.product.c r4 = r11.mo80104g()
            if (r4 == 0) goto L_0x0090
            java.util.List r4 = r4.mo118662e()
            goto L_0x0091
        L_0x0090:
            r4 = r7
        L_0x0091:
            if (r4 != 0) goto L_0x0097
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0097:
            r5 = r4
            java.lang.String r4 = r11.mo80108j()
            com.carrefour.fid.android.domain.models.product.c r11 = r11.mo80104g()
            if (r11 == 0) goto L_0x00a6
            java.util.List r7 = r11.mo118664f()
        L_0x00a6:
            if (r7 != 0) goto L_0x00ad
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x00ae
        L_0x00ad:
            r11 = r7
        L_0x00ae:
            java.lang.Object r7 = r12.mo83939a()
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x00ba
            int r1 = r7.intValue()
        L_0x00ba:
            r7 = r1
            int r8 = r12.mo83940b()
            r9.label = r6
            r1 = r13
            r6 = r11
            java.lang.Object r11 = r1.mo79832b(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L_0x00ca
            return r0
        L_0x00ca:
            return r11
        L_0x00cb:
            boolean r13 = r11 instanceof com.carrefour.fid.android.product.domain.model.C27587e.C27592e
            if (r13 == 0) goto L_0x0122
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r13 = r10.f67046c
            com.carrefour.fid.android.product.domain.model.e$e r11 = (com.carrefour.fid.android.product.domain.model.C27587e.C27592e) r11
            java.util.List r2 = r11.mo80147h()
            java.lang.String r3 = r11.mo80149i()
            com.carrefour.fid.android.domain.models.product.c r4 = r11.mo80146g()
            if (r4 == 0) goto L_0x00e6
            java.util.List r4 = r4.mo118662e()
            goto L_0x00e7
        L_0x00e6:
            r4 = r7
        L_0x00e7:
            if (r4 != 0) goto L_0x00ed
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00ed:
            r6 = r4
            java.lang.String r4 = r11.mo80150j()
            com.carrefour.fid.android.domain.models.product.c r11 = r11.mo80146g()
            if (r11 == 0) goto L_0x00fc
            java.util.List r7 = r11.mo118664f()
        L_0x00fc:
            if (r7 != 0) goto L_0x0103
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0104
        L_0x0103:
            r11 = r7
        L_0x0104:
            java.lang.Object r7 = r12.mo83939a()
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0110
            int r1 = r7.intValue()
        L_0x0110:
            r7 = r1
            int r8 = r12.mo83940b()
            r9.label = r5
            r1 = r13
            r5 = r6
            r6 = r11
            java.lang.Object r11 = r1.mo79837j(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L_0x0121
            return r0
        L_0x0121:
            return r11
        L_0x0122:
            boolean r13 = r11 instanceof com.carrefour.fid.android.product.domain.model.C27587e.C27590c
            if (r13 == 0) goto L_0x0176
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r13 = r10.f67046c
            com.carrefour.fid.android.product.domain.model.e$c r11 = (com.carrefour.fid.android.product.domain.model.C27587e.C27590c) r11
            java.util.List r2 = r11.mo80124g()
            com.carrefour.fid.android.domain.models.product.c r3 = r11.mo80123f()
            if (r3 == 0) goto L_0x0139
            java.util.List r3 = r3.mo118662e()
            goto L_0x013a
        L_0x0139:
            r3 = r7
        L_0x013a:
            if (r3 != 0) goto L_0x0140
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0140:
            r5 = r3
            java.lang.String r3 = r11.mo80125h()
            com.carrefour.fid.android.domain.models.product.c r11 = r11.mo80123f()
            if (r11 == 0) goto L_0x014f
            java.util.List r7 = r11.mo118664f()
        L_0x014f:
            if (r7 != 0) goto L_0x0156
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0157
        L_0x0156:
            r11 = r7
        L_0x0157:
            java.lang.Object r6 = r12.mo83939a()
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0163
            int r1 = r6.intValue()
        L_0x0163:
            r6 = r1
            int r7 = r12.mo83940b()
            r9.label = r4
            r1 = r13
            r4 = r5
            r5 = r11
            r8 = r9
            java.lang.Object r11 = r1.mo79835f(r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L_0x0175
            return r0
        L_0x0175:
            return r11
        L_0x0176:
            boolean r13 = r11 instanceof com.carrefour.fid.android.product.domain.model.C27587e.C27591d
            if (r13 == 0) goto L_0x01cd
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r13 = r10.f67046c
            com.carrefour.fid.android.product.domain.model.e$d r11 = (com.carrefour.fid.android.product.domain.model.C27587e.C27591d) r11
            java.util.List r2 = r11.mo80135h()
            java.lang.String r4 = r11.mo80137i()
            com.carrefour.fid.android.domain.models.product.c r5 = r11.mo80134g()
            if (r5 == 0) goto L_0x0191
            java.util.List r5 = r5.mo118662e()
            goto L_0x0192
        L_0x0191:
            r5 = r7
        L_0x0192:
            if (r5 != 0) goto L_0x0198
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0198:
            java.lang.String r6 = r11.mo80138j()
            com.carrefour.fid.android.domain.models.product.c r11 = r11.mo80134g()
            if (r11 == 0) goto L_0x01a6
            java.util.List r7 = r11.mo118664f()
        L_0x01a6:
            if (r7 != 0) goto L_0x01ad
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x01ae
        L_0x01ad:
            r11 = r7
        L_0x01ae:
            java.lang.Object r7 = r12.mo83939a()
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x01ba
            int r1 = r7.intValue()
        L_0x01ba:
            r7 = r1
            int r8 = r12.mo83940b()
            r9.label = r3
            r1 = r13
            r3 = r4
            r4 = r6
            r6 = r11
            java.lang.Object r11 = r1.mo79836h(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L_0x01cc
            return r0
        L_0x01cc:
            return r11
        L_0x01cd:
            boolean r12 = r11 instanceof com.carrefour.fid.android.product.domain.model.C27587e.C27589b
            if (r12 == 0) goto L_0x01e7
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r12 = r10.f67046c
            com.carrefour.fid.android.product.domain.model.e$b r11 = (com.carrefour.fid.android.product.domain.model.C27587e.C27589b) r11
            java.util.List r13 = r11.mo80113e()
            java.util.List r11 = r11.mo80115f()
            r9.label = r2
            java.lang.Object r11 = r12.mo79834e(r13, r11, r9)
            if (r11 != r0) goto L_0x01e6
            return r0
        L_0x01e6:
            return r11
        L_0x01e7:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource.mo80181c(com.carrefour.fid.android.product.domain.model.e, com.carrefour.fid.android.shared.paging.a$a, kotlin.coroutines.c):java.lang.Object");
    }
}
