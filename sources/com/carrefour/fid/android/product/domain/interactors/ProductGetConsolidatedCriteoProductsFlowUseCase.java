package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.product.C37758g;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.utilities.C37890c;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.criteo.C38001c;
import com.carrefour.fid.android.domain.models.criteo.C38005g;
import com.carrefour.fid.android.domain.models.criteo.C38011m;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductGetConsolidatedCriteoProductsFlowUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetConsolidatedCriteoProductsFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetConsolidatedCriteoProductsFlowUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1549#2:121\n1620#2,3:122\n*S KotlinDebug\n*F\n+ 1 ProductGetConsolidatedCriteoProductsFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetConsolidatedCriteoProductsFlowUseCase\n*L\n92#1:121\n92#1:122,3\n*E\n"})
public final class ProductGetConsolidatedCriteoProductsFlowUseCase implements C37758g {
    @C12579k

    /* renamed from: a */
    public final C37890c f66826a;
    @C12579k

    /* renamed from: b */
    public final C37823k f66827b;
    @C12579k

    /* renamed from: c */
    public final C37682c f66828c;
    @C12579k

    /* renamed from: d */
    public final C37606z f66829d;
    @C12579k

    /* renamed from: e */
    public final C37559b0 f66830e;
    @C12579k

    /* renamed from: f */
    public final C38328d f66831f;

    @Inject
    public ProductGetConsolidatedCriteoProductsFlowUseCase(@C12579k C37890c cVar, @C12579k C37823k kVar, @C12579k C37682c cVar2, @C12579k C37606z zVar, @C12579k C37559b0 b0Var, @C12579k C38328d dVar) {
        Intrinsics.checkNotNullParameter(cVar, "getSponsoredItemsUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(cVar2, "observeShoppingListUseCase");
        Intrinsics.checkNotNullParameter(zVar, "observeBasketUseCase");
        Intrinsics.checkNotNullParameter(b0Var, "observeSyncingInBasketUseCase");
        Intrinsics.checkNotNullParameter(dVar, "performance");
        this.f66826a = cVar;
        this.f66827b = kVar;
        this.f66828c = cVar2;
        this.f66829d = zVar;
        this.f66830e = b0Var;
        this.f66831f = dVar;
    }

    /* renamed from: f */
    public final Object mo79951f(C37758g.C37759a aVar, C11045c<? super C11907e<? extends Result<? extends C38011m>>> cVar) {
        return C11909g.m47376J0(new C27526x47750cd5(aVar, this, (C11045c<? super C27526x47750cd5>) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.C37758g.C37759a r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<? extends kotlin.Result<? extends com.carrefour.fid.android.domain.models.criteo.C38005g>>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0073
            if (r2 == r6) goto L_0x006a
            if (r2 == r5) goto L_0x005e
            if (r2 == r4) goto L_0x004b
            if (r2 != r3) goto L_0x0043
            java.lang.Object r9 = r0.L$3
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            java.lang.Object r1 = r0.L$2
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C11907e) r1
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase) r0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00cc
        L_0x0043:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004b:
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase r4 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase) r4
            kotlin.C11661u0.m45747n(r10)
            r7 = r4
            r4 = r2
            r2 = r7
            goto L_0x00b2
        L_0x005e:
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x009b
        L_0x006a:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase r9 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase) r9
            kotlin.C11661u0.m45747n(r10)
            r2 = r9
            goto L_0x0089
        L_0x0073:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.performance.d r10 = r8.f66831f
            java.lang.String r2 = "get_criteo_products"
            r10.mo121195d(r2)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r10 = r8.mo79951f(r9, r0)
            if (r10 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r2 = r8
        L_0x0089:
            r9 = r10
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.c r10 = r2.f66828c
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.invoke(r0)
            if (r10 != r1) goto L_0x009b
            return r1
        L_0x009b:
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C11907e) r10
            com.carrefour.fid.android.domain.interactors.basket.z r5 = r2.f66829d
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r4 = r5.invoke(r0)
            if (r4 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            r7 = r4
            r4 = r9
            r9 = r10
            r10 = r7
        L_0x00b2:
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C11907e) r10
            com.carrefour.fid.android.domain.interactors.basket.b0 r5 = r2.f66830e
            r0.L$0 = r2
            r0.L$1 = r4
            r0.L$2 = r9
            r0.L$3 = r10
            r0.label = r3
            java.lang.Object r0 = r5.invoke(r0)
            if (r0 != r1) goto L_0x00c7
            return r1
        L_0x00c7:
            r1 = r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r4
        L_0x00cc:
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C11907e) r10
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase$invoke$2 r3 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase$invoke$2
            r4 = 0
            r3.<init>(r0, r4)
            kotlinx.coroutines.flow.e r9 = kotlinx.coroutines.flow.C11909g.m47363F(r2, r1, r9, r10, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase.invoke(com.carrefour.fid.android.domain.interactors.product.g$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h */
    public final Object mo79953h(Object obj, C38030a aVar, Basket basket, Set<Gtin> set) {
        if (Result.m38710j(obj)) {
            Result.C10852a aVar2 = Result.f28060a;
            C38011m mVar = (C38011m) obj;
            List<C38012n> a = mVar.mo117540a();
            Iterable<C38115c> d = mVar.mo117543d();
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(d, 10));
            for (C38115c b : d) {
                arrayList.add(C27662e.m116382b(b, aVar, basket, set, true, false, 16, (Object) null));
            }
            C38005g gVar = new C38005g(a, arrayList, mVar.mo117541b(), mVar.mo117542c());
            this.f66831f.mo121196e();
            return Result.m38702b(gVar);
        }
        return Result.m38702b(obj);
    }

    /* renamed from: i */
    public final C38011m mo79954i(C38001c cVar, int i) {
        C38011m j = cVar.mo117416j();
        return new C38011m(CollectionsKt___CollectionsKt.m40497E5(j.mo117540a(), i), CollectionsKt___CollectionsKt.m40497E5(j.mo117543d(), i), j.mo117541b(), j.mo117542c());
    }
}
