package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.product.domain.repositories.ProductRepository;
import java.util.Set;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nProductGetOldProductFlowUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetOldProductFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetOldProductFlowUseCase\n+ 2 ResultL.kt\ncom/carrefour/fid/android/core/types/ResultLKt\n+ 3 ResultL.kt\ncom/carrefour/fid/android/core/types/ResultL$Companion\n*L\n1#1,51:1\n195#2,3:52\n198#2:56\n85#3:55\n*S KotlinDebug\n*F\n+ 1 ProductGetOldProductFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetOldProductFlowUseCase\n*L\n46#1:52,3\n46#1:56\n46#1:55\n*E\n"})
public final class ProductGetOldProductFlowUseCase extends AbstractFlowConsolidator<C36371a<? extends Offer>> implements GetOldProductFlowUseCase {
    @C12579k

    /* renamed from: e */
    public final ProductRepository f66871e;
    @C12579k

    /* renamed from: f */
    public final C37857d f66872f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ProductGetOldProductFlowUseCase(@C12579k ProductRepository productRepository, @C12579k C37857d dVar, @C12579k C37682c cVar, @C12579k C37606z zVar, @C12579k C37559b0 b0Var, @C12579k C37681b bVar, @C12579k C38328d dVar2) {
        super(cVar, zVar, b0Var, bVar);
        Intrinsics.checkNotNullParameter(productRepository, "repository");
        Intrinsics.checkNotNullParameter(dVar, "getSlotSliceUseCase");
        Intrinsics.checkNotNullParameter(cVar, "observeShoppingListUseCase");
        Intrinsics.checkNotNullParameter(zVar, "observeBasketUseCase");
        Intrinsics.checkNotNullParameter(b0Var, "observeSyncingInBasketUseCase");
        Intrinsics.checkNotNullParameter(bVar, "getShoppingListUseCase");
        Intrinsics.checkNotNullParameter(dVar2, "performance");
        this.f66871e = productRepository;
        this.f66872f = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d A[PHI: r11 
      PHI: (r11v2 java.lang.Object) = (r11v5 java.lang.Object), (r11v1 java.lang.Object) binds: [B:30:0x009a, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase.Param r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<? extends com.carrefour.fid.android.core.types.C36371a<com.carrefour.fid.android.domain.models.offer.Offer>>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase$invoke$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0057
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.C11661u0.m45747n(r11)
            goto L_0x009d
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase r10 = (com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase) r10
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0090
        L_0x0041:
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase$Param r10 = (com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase.Param) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase) r2
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L_0x006c
        L_0x0057:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.domain.interactors.slot.d r11 = r9.f66872f
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r11 = r11.m172965invokeIoAF18A(r0)
            if (r11 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r11
            r11 = r10
            r10 = r9
        L_0x006c:
            boolean r5 = kotlin.Result.m38709i(r2)
            if (r5 == 0) goto L_0x0073
            r2 = r6
        L_0x0073:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0079
            java.lang.String r2 = "1A"
        L_0x0079:
            com.carrefour.fid.android.product.domain.repositories.ProductRepository r5 = r10.f66871e
            java.lang.String r7 = r11.mo114947f()
            java.lang.String r11 = r11.mo114945e()
            r0.L$0 = r10
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r11 = r5.mo80189b(r7, r11, r2, r0)
            if (r11 != r1) goto L_0x0090
            return r1
        L_0x0090:
            kotlinx.coroutines.flow.e r11 = (kotlinx.coroutines.flow.C11907e) r11
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r11 = r10.mo79915d(r11, r0)
            if (r11 != r1) goto L_0x009d
            return r1
        L_0x009d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase.invoke(com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase$Param, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: k */
    public C36371a<Offer> mo79920i(@C12579k C36371a<Offer> aVar, @C12580l C38030a aVar2, @C12580l Basket basket, @C12579k Set<Gtin> set) {
        Intrinsics.checkNotNullParameter(aVar, "offerResult");
        Intrinsics.checkNotNullParameter(set, "syncingInBasket");
        if (aVar instanceof C36371a.C36373b) {
            return aVar;
        }
        if (aVar instanceof C36371a.C36375d) {
            C36371a.C36372a aVar3 = C36371a.f89974a;
            return new C36371a.C36375d(mo79912a((Offer) ((C36371a.C36375d) aVar).mo108633i(), aVar2, basket, set));
        } else if (aVar instanceof C36371a.C36374c) {
            return aVar;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
