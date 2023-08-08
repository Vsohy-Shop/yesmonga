package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.product.C37756f;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.domain.repositories.AlternativeProductsRepository;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductGetConsolidatedAlternativeProductsFlowUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetConsolidatedAlternativeProductsFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetConsolidatedAlternativeProductsFlowUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1549#2:70\n1620#2,3:71\n*S KotlinDebug\n*F\n+ 1 ProductGetConsolidatedAlternativeProductsFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetConsolidatedAlternativeProductsFlowUseCase\n*L\n59#1:70\n59#1:71,3\n*E\n"})
public final class ProductGetConsolidatedAlternativeProductsFlowUseCase implements C37756f {
    @C12579k

    /* renamed from: a */
    public final AlternativeProductsRepository f66822a;
    @C12579k

    /* renamed from: b */
    public final C37682c f66823b;
    @C12579k

    /* renamed from: c */
    public final C37606z f66824c;
    @C12579k

    /* renamed from: d */
    public final C37559b0 f66825d;

    @Inject
    public ProductGetConsolidatedAlternativeProductsFlowUseCase(@C12579k AlternativeProductsRepository alternativeProductsRepository, @C12579k C37682c cVar, @C12579k C37606z zVar, @C12579k C37559b0 b0Var) {
        Intrinsics.checkNotNullParameter(alternativeProductsRepository, "alternativeProductsRepository");
        Intrinsics.checkNotNullParameter(cVar, "observeShoppingListUseCase");
        Intrinsics.checkNotNullParameter(zVar, "observeBasketUseCase");
        Intrinsics.checkNotNullParameter(b0Var, "observeSyncingInBasketUseCase");
        this.f66822a = alternativeProductsRepository;
        this.f66823b = cVar;
        this.f66824c = zVar;
        this.f66825d = b0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79947c(kotlinx.coroutines.flow.C11907e<? extends kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.product.plp.C38115c>>> r8, kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<? extends kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.product.plp.C38114b>>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.product.domain.interactors.C27524xa1a3ac82
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase$getConsolidatedFlow$1 r0 = (com.carrefour.fid.android.product.domain.interactors.C27524xa1a3ac82) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase$getConsolidatedFlow$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase$getConsolidatedFlow$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0067
            if (r2 == r5) goto L_0x005b
            if (r2 == r4) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            java.lang.Object r1 = r0.L$2
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C11907e) r1
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00ab
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0048:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase r4 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase) r4
            kotlin.C11661u0.m45747n(r9)
            r6 = r4
            r4 = r2
            r2 = r6
            goto L_0x0091
        L_0x005b:
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            goto L_0x007a
        L_0x0067:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.c r9 = r7.f66823b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r2 = r7
        L_0x007a:
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            com.carrefour.fid.android.domain.interactors.basket.z r5 = r2.f66824c
            r0.L$0 = r2
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r4 = r5.invoke(r0)
            if (r4 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r6 = r4
            r4 = r8
            r8 = r9
            r9 = r6
        L_0x0091:
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            com.carrefour.fid.android.domain.interactors.basket.b0 r5 = r2.f66825d
            r0.L$0 = r2
            r0.L$1 = r4
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r0 = r5.invoke(r0)
            if (r0 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            r1 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r4
        L_0x00ab:
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase$getConsolidatedFlow$2 r3 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase$getConsolidatedFlow$2
            r4 = 0
            r3.<init>(r0, r4)
            kotlinx.coroutines.flow.e r8 = kotlinx.coroutines.flow.C11909g.m47363F(r2, r1, r8, r9, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase.mo79947c(kotlinx.coroutines.flow.e, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:19:0x0060, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.C37756f.C37757a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<? extends kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.product.plp.C38114b>>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0063
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase r6 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase) r6
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0055
        L_0x003c:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.product.domain.repositories.AlternativeProductsRepository r7 = r5.f66822a
            java.lang.String r2 = r6.mo115022f()
            java.lang.String r6 = r6.mo115020e()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.mo80168b(r2, r6, r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r6 = r5
        L_0x0055:
            kotlinx.coroutines.flow.e r7 = (kotlinx.coroutines.flow.C11907e) r7
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r6.mo79947c(r7, r0)
            if (r7 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase.invoke(com.carrefour.fid.android.domain.interactors.product.f$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: e */
    public final Object mo79949e(Object obj, C38030a aVar, Basket basket, Set<Gtin> set) {
        if (!Result.m38710j(obj)) {
            return Result.m38702b(obj);
        }
        Result.C10852a aVar2 = Result.f28060a;
        Iterable<C38115c> iterable = (List) obj;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C38115c b : iterable) {
            arrayList.add(C27662e.m116382b(b, aVar, basket, set, false, false, 24, (Object) null));
        }
        return Result.m38702b(arrayList);
    }
}
