package com.carrefour.fid.android.product.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nProductUpdateFilterUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductUpdateFilterUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductUpdateFilterUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1360#2:44\n1446#2,5:45\n1549#2:50\n1620#2,2:51\n819#2:53\n847#2,2:54\n1622#2:56\n*S KotlinDebug\n*F\n+ 1 ProductUpdateFilterUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductUpdateFilterUseCase\n*L\n16#1:44\n16#1:45,5\n17#1:50\n17#1:51,2\n19#1:53\n19#1:54,2\n17#1:56\n*E\n"})
public final class ProductUpdateFilterUseCase implements C37679f<C27547a, Pair<? extends Facet, ? extends C38104c>> {
    @C12579k

    /* renamed from: a */
    public final ProductUpdateFacetUseCase f66901a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase$a */
    public static final class C27547a {

        /* renamed from: d */
        public static final int f66902d = 8;
        @C12579k

        /* renamed from: a */
        public final ProductListSource f66903a;
        @C12579k

        /* renamed from: b */
        public final C38105d f66904b;
        @C12579k

        /* renamed from: c */
        public final C38104c f66905c;

        public C27547a(@C12579k ProductListSource productListSource, @C12579k C38105d dVar, @C12579k C38104c cVar) {
            Intrinsics.checkNotNullParameter(productListSource, "source");
            Intrinsics.checkNotNullParameter(dVar, "selectedFilter");
            Intrinsics.checkNotNullParameter(cVar, "currentFacetSelection");
            this.f66903a = productListSource;
            this.f66904b = dVar;
            this.f66905c = cVar;
        }

        /* renamed from: e */
        public static /* synthetic */ C27547a m115924e(C27547a aVar, ProductListSource productListSource, C38105d dVar, C38104c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                productListSource = aVar.f66903a;
            }
            if ((i & 2) != 0) {
                dVar = aVar.f66904b;
            }
            if ((i & 4) != 0) {
                cVar = aVar.f66905c;
            }
            return aVar.mo80009d(productListSource, dVar, cVar);
        }

        @C12579k
        /* renamed from: a */
        public final ProductListSource mo80006a() {
            return this.f66903a;
        }

        @C12579k
        /* renamed from: b */
        public final C38105d mo80007b() {
            return this.f66904b;
        }

        @C12579k
        /* renamed from: c */
        public final C38104c mo80008c() {
            return this.f66905c;
        }

        @C12579k
        /* renamed from: d */
        public final C27547a mo80009d(@C12579k ProductListSource productListSource, @C12579k C38105d dVar, @C12579k C38104c cVar) {
            Intrinsics.checkNotNullParameter(productListSource, "source");
            Intrinsics.checkNotNullParameter(dVar, "selectedFilter");
            Intrinsics.checkNotNullParameter(cVar, "currentFacetSelection");
            return new C27547a(productListSource, dVar, cVar);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27547a)) {
                return false;
            }
            C27547a aVar = (C27547a) obj;
            return Intrinsics.areEqual((Object) this.f66903a, (Object) aVar.f66903a) && Intrinsics.areEqual((Object) this.f66904b, (Object) aVar.f66904b) && Intrinsics.areEqual((Object) this.f66905c, (Object) aVar.f66905c);
        }

        @C12579k
        /* renamed from: f */
        public final C38104c mo80011f() {
            return this.f66905c;
        }

        @C12579k
        /* renamed from: g */
        public final C38105d mo80012g() {
            return this.f66904b;
        }

        @C12579k
        /* renamed from: h */
        public final ProductListSource mo80013h() {
            return this.f66903a;
        }

        public int hashCode() {
            return (((this.f66903a.hashCode() * 31) + this.f66904b.hashCode()) * 31) + this.f66905c.hashCode();
        }

        @C12579k
        public String toString() {
            ProductListSource productListSource = this.f66903a;
            C38105d dVar = this.f66904b;
            C38104c cVar = this.f66905c;
            return "Params(source=" + productListSource + ", selectedFilter=" + dVar + ", currentFacetSelection=" + cVar + ")";
        }
    }

    @Inject
    public ProductUpdateFilterUseCase(@C12579k ProductUpdateFacetUseCase productUpdateFacetUseCase) {
        Intrinsics.checkNotNullParameter(productUpdateFacetUseCase, "productUpdateFacetUseCase");
        this.f66901a = productUpdateFacetUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172819invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase.C27547a r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.Pair<com.carrefour.fid.android.domain.models.product.Facet, com.carrefour.fid.android.domain.models.product.C38104c>>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase$invoke$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r13 = r14.mo21858l()
            goto L_0x011e
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0038:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.domain.models.product.c r14 = r13.mo80011f()
            java.util.List r14 = r14.mo118662e()
            r2 = r14
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r2.iterator()
        L_0x004f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0065
            java.lang.Object r6 = r5.next()
            com.carrefour.fid.android.domain.models.product.d r6 = (com.carrefour.fid.android.domain.models.product.C38105d) r6
            java.util.List r6 = r6.mo118672f()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            kotlin.collections.C10994x.m42360n0(r4, r6)
            goto L_0x004f
        L_0x0065:
            com.carrefour.fid.android.domain.models.product.d r5 = r13.mo80012g()
            java.util.List r5 = r5.mo118672f()
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r5)
            boolean r4 = r4.contains(r5)
            r5 = 2
            r6 = 0
            if (r4 == 0) goto L_0x00f8
            java.util.ArrayList r14 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C10978t.m41495Y(r2, r4)
            r14.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0088:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00ef
            java.lang.Object r4 = r2.next()
            com.carrefour.fid.android.domain.models.product.d r4 = (com.carrefour.fid.android.domain.models.product.C38105d) r4
            java.lang.String r7 = r4.mo118670e()
            com.carrefour.fid.android.domain.models.product.d r8 = r13.mo80012g()
            java.lang.String r8 = r8.mo118670e()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x00eb
            java.lang.String r7 = r4.mo118670e()
            java.util.List r4 = r4.mo118672f()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b9:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00e6
            java.lang.Object r9 = r4.next()
            r10 = r9
            com.carrefour.fid.android.domain.models.product.f r10 = (com.carrefour.fid.android.domain.models.product.C38112f) r10
            java.lang.String r10 = r10.mo118787h()
            com.carrefour.fid.android.domain.models.product.d r11 = r13.mo80012g()
            java.util.List r11 = r11.mo118672f()
            java.lang.Object r11 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r11)
            com.carrefour.fid.android.domain.models.product.f r11 = (com.carrefour.fid.android.domain.models.product.C38112f) r11
            java.lang.String r11 = r11.mo118787h()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 != 0) goto L_0x00b9
            r8.add(r9)
            goto L_0x00b9
        L_0x00e6:
            com.carrefour.fid.android.domain.models.product.d r4 = new com.carrefour.fid.android.domain.models.product.d
            r4.<init>(r7, r8, r6)
        L_0x00eb:
            r14.add(r4)
            goto L_0x0088
        L_0x00ef:
            com.carrefour.fid.android.domain.models.product.c r2 = r13.mo80011f()
            com.carrefour.fid.android.domain.models.product.c r14 = com.carrefour.fid.android.domain.models.product.C38104c.m157530d(r2, r14, r6, r5, r6)
            goto L_0x010a
        L_0x00f8:
            com.carrefour.fid.android.domain.models.product.c r2 = r13.mo80011f()
            java.util.Collection r14 = (java.util.Collection) r14
            com.carrefour.fid.android.domain.models.product.d r4 = r13.mo80012g()
            java.util.List r14 = kotlin.collections.CollectionsKt___CollectionsKt.m40723z4(r14, r4)
            com.carrefour.fid.android.domain.models.product.c r14 = com.carrefour.fid.android.domain.models.product.C38104c.m157530d(r2, r14, r6, r5, r6)
        L_0x010a:
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase r2 = r12.f66901a
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$a r4 = new com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$a
            com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource r13 = r13.mo80013h()
            r4.<init>(r13, r14)
            r0.label = r3
            java.lang.Object r13 = r2.m172818invokegIAlus(r4, r0)
            if (r13 != r1) goto L_0x011e
            return r1
        L_0x011e:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase.m172819invokegIAlus(com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
