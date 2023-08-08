package com.carrefour.fid.android.product.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ProductUpdateSortUseCase implements C37679f<C27548a, Pair<? extends Facet, ? extends C38104c>> {
    @C12579k

    /* renamed from: a */
    public final ProductUpdateFacetUseCase f66906a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase$a */
    public static final class C27548a {

        /* renamed from: d */
        public static final int f66907d = 8;
        @C12579k

        /* renamed from: a */
        public final ProductListSource f66908a;
        @C12579k

        /* renamed from: b */
        public final Sort f66909b;
        @C12579k

        /* renamed from: c */
        public final C38104c f66910c;

        public C27548a(@C12579k ProductListSource productListSource, @C12579k Sort sort, @C12579k C38104c cVar) {
            Intrinsics.checkNotNullParameter(productListSource, "source");
            Intrinsics.checkNotNullParameter(sort, "selectedSort");
            Intrinsics.checkNotNullParameter(cVar, "currentFacetSelection");
            this.f66908a = productListSource;
            this.f66909b = sort;
            this.f66910c = cVar;
        }

        /* renamed from: e */
        public static /* synthetic */ C27548a m115933e(C27548a aVar, ProductListSource productListSource, Sort sort, C38104c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                productListSource = aVar.f66908a;
            }
            if ((i & 2) != 0) {
                sort = aVar.f66909b;
            }
            if ((i & 4) != 0) {
                cVar = aVar.f66910c;
            }
            return aVar.mo80020d(productListSource, sort, cVar);
        }

        @C12579k
        /* renamed from: a */
        public final ProductListSource mo80017a() {
            return this.f66908a;
        }

        @C12579k
        /* renamed from: b */
        public final Sort mo80018b() {
            return this.f66909b;
        }

        @C12579k
        /* renamed from: c */
        public final C38104c mo80019c() {
            return this.f66910c;
        }

        @C12579k
        /* renamed from: d */
        public final C27548a mo80020d(@C12579k ProductListSource productListSource, @C12579k Sort sort, @C12579k C38104c cVar) {
            Intrinsics.checkNotNullParameter(productListSource, "source");
            Intrinsics.checkNotNullParameter(sort, "selectedSort");
            Intrinsics.checkNotNullParameter(cVar, "currentFacetSelection");
            return new C27548a(productListSource, sort, cVar);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27548a)) {
                return false;
            }
            C27548a aVar = (C27548a) obj;
            return Intrinsics.areEqual((Object) this.f66908a, (Object) aVar.f66908a) && Intrinsics.areEqual((Object) this.f66909b, (Object) aVar.f66909b) && Intrinsics.areEqual((Object) this.f66910c, (Object) aVar.f66910c);
        }

        @C12579k
        /* renamed from: f */
        public final C38104c mo80022f() {
            return this.f66910c;
        }

        @C12579k
        /* renamed from: g */
        public final Sort mo80023g() {
            return this.f66909b;
        }

        @C12579k
        /* renamed from: h */
        public final ProductListSource mo80024h() {
            return this.f66908a;
        }

        public int hashCode() {
            return (((this.f66908a.hashCode() * 31) + this.f66909b.hashCode()) * 31) + this.f66910c.hashCode();
        }

        @C12579k
        public String toString() {
            ProductListSource productListSource = this.f66908a;
            Sort sort = this.f66909b;
            C38104c cVar = this.f66910c;
            return "Params(source=" + productListSource + ", selectedSort=" + sort + ", currentFacetSelection=" + cVar + ")";
        }
    }

    @Inject
    public ProductUpdateSortUseCase(@C12579k ProductUpdateFacetUseCase productUpdateFacetUseCase) {
        Intrinsics.checkNotNullParameter(productUpdateFacetUseCase, "productUpdateFacetUseCase");
        this.f66906a = productUpdateFacetUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172820invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase.C27548a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.Pair<com.carrefour.fid.android.domain.models.product.Facet, com.carrefour.fid.android.domain.models.product.C38104c>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x008e
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.models.product.c r7 = r6.mo80022f()
            java.util.List r7 = r7.mo118664f()
            com.carrefour.fid.android.domain.models.product.Sort r2 = r6.mo80023g()
            java.lang.String r2 = r2.mo118611f()
            com.carrefour.fid.android.domain.models.product.e r2 = com.carrefour.fid.android.domain.models.product.C38111e.m157649a(r2)
            boolean r7 = r7.contains(r2)
            r2 = 0
            if (r7 == 0) goto L_0x0062
            com.carrefour.fid.android.domain.models.product.c r7 = r6.mo80022f()
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            com.carrefour.fid.android.domain.models.product.c r7 = com.carrefour.fid.android.domain.models.product.C38104c.m157530d(r7, r2, r4, r3, r2)
            goto L_0x007a
        L_0x0062:
            com.carrefour.fid.android.domain.models.product.c r7 = r6.mo80022f()
            com.carrefour.fid.android.domain.models.product.Sort r4 = r6.mo80023g()
            java.lang.String r4 = r4.mo118611f()
            com.carrefour.fid.android.domain.models.product.e r4 = com.carrefour.fid.android.domain.models.product.C38111e.m157649a(r4)
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r4)
            com.carrefour.fid.android.domain.models.product.c r7 = com.carrefour.fid.android.domain.models.product.C38104c.m157530d(r7, r2, r4, r3, r2)
        L_0x007a:
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase r2 = r5.f66906a
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$a r4 = new com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$a
            com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource r6 = r6.mo80024h()
            r4.<init>(r6, r7)
            r0.label = r3
            java.lang.Object r6 = r2.m172818invokegIAlus(r4, r0)
            if (r6 != r1) goto L_0x008e
            return r1
        L_0x008e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase.m172820invokegIAlus(com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
