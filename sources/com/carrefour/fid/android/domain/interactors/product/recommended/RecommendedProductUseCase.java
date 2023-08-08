package com.carrefour.fid.android.domain.interactors.product.recommended;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.product.C37755e;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.performance.C38328d;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nRecommendedProductUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendedProductUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/recommended/RecommendedProductUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1549#2:31\n1620#2,3:32\n1045#2:35\n*S KotlinDebug\n*F\n+ 1 RecommendedProductUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/recommended/RecommendedProductUseCase\n*L\n22#1:31\n22#1:32,3\n23#1:35\n*E\n"})
public final class RecommendedProductUseCase implements C37678e<List<? extends OfferProductDomain>> {

    /* renamed from: c */
    public static final int f94825c = 8;
    @C12579k

    /* renamed from: a */
    public final C37755e f94826a;
    @C12579k

    /* renamed from: b */
    public final C38328d f94827b;

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RecommendedProductUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/recommended/RecommendedProductUseCase\n*L\n1#1,328:1\n23#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase$a */
    public static final class C37783a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(((OfferProductDomain) t).mo116035T(), ((OfferProductDomain) t2).mo116035T());
        }
    }

    @Inject
    public RecommendedProductUseCase(@C12579k C37755e eVar, @C12579k C38328d dVar) {
        Intrinsics.checkNotNullParameter(eVar, "getComplementaryProductsUseCase");
        Intrinsics.checkNotNullParameter(dVar, "performance");
        this.f94826a = eVar;
        this.f94827b = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        if (r5 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172993invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.OfferProductDomain>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase r0 = (com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0053
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.performance.d r5 = r4.f94827b
            java.lang.String r2 = "get_recommended_products"
            r5.mo121195d(r2)
            com.carrefour.fid.android.domain.interactors.product.e r5 = r4.f94826a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r4
        L_0x0053:
            boolean r1 = kotlin.Result.m38709i(r5)
            if (r1 == 0) goto L_0x006f
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Throwable r5 = kotlin.Result.m38705e(r5)
            if (r5 != 0) goto L_0x0066
            java.lang.Throwable r5 = new java.lang.Throwable
            r5.<init>()
        L_0x0066:
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x006f:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            boolean r1 = kotlin.Result.m38709i(r5)
            if (r1 == 0) goto L_0x0078
            r5 = 0
        L_0x0078:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x00b4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x008d:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x00a1
            java.lang.Object r2 = r5.next()
            com.carrefour.fid.android.domain.models.offer.a r2 = (com.carrefour.fid.android.domain.models.offer.C38064a) r2
            com.carrefour.fid.android.domain.models.OfferProductDomain r2 = com.carrefour.fid.android.data.entities.mapper.C36471c1.m149605a(r2)
            r1.add(r2)
            goto L_0x008d
        L_0x00a1:
            com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase$a r5 = new com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase$a
            r5.<init>()
            java.util.List r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r1, r5)
            if (r5 == 0) goto L_0x00b4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40566S4(r5)
            if (r5 != 0) goto L_0x00b8
        L_0x00b4:
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00b8:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            com.carrefour.fid.android.performance.d r0 = r0.f94827b
            r0.mo121196e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase.m172993invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
