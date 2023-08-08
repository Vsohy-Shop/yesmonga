package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.domain.models.offer.Offer;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.repositories.ProductRepository$getOfferMixedProductsFlow$2", mo22502f = "ProductRepository.kt", mo22503i = {0, 1}, mo22504l = {37, 38, 39}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow", "$this$flow"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lcom/carrefour/fid/android/core/types/a;", "", "Lcom/carrefour/fid/android/domain/models/offer/Offer;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nProductRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/ProductRepository$getOfferMixedProductsFlow$2\n+ 2 ResultL.kt\ncom/carrefour/fid/android/core/types/ResultLKt\n+ 3 ResultL.kt\ncom/carrefour/fid/android/core/types/ResultL$Companion\n*L\n1#1,43:1\n195#2,3:44\n198#2:48\n85#3:47\n*S KotlinDebug\n*F\n+ 1 ProductRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/ProductRepository$getOfferMixedProductsFlow$2\n*L\n39#1:44,3\n39#1:48\n39#1:47\n*E\n"})
public final class ProductRepository$getOfferMixedProductsFlow$2 extends SuspendLambda implements C11304p<C11908f<? super C36371a<? extends List<? extends Offer>>>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $gtin;
    final /* synthetic */ String $slotSlice;
    final /* synthetic */ String $storeService;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProductRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductRepository$getOfferMixedProductsFlow$2(ProductRepository productRepository, String str, String str2, String str3, C11045c<? super ProductRepository$getOfferMixedProductsFlow$2> cVar) {
        super(2, cVar);
        this.this$0 = productRepository;
        this.$storeService = str;
        this.$gtin = str2;
        this.$slotSlice = str3;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ProductRepository$getOfferMixedProductsFlow$2 productRepository$getOfferMixedProductsFlow$2 = new ProductRepository$getOfferMixedProductsFlow$2(this.this$0, this.$storeService, this.$gtin, this.$slotSlice, cVar);
        productRepository$getOfferMixedProductsFlow$2.L$0 = obj;
        return productRepository$getOfferMixedProductsFlow$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super C36371a<? extends List<Offer>>> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ProductRepository$getOfferMixedProductsFlow$2) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094 A[RETURN] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r4) goto L_0x002c
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0095
        L_0x0016:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001e:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0063
        L_0x002c:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r8)
            goto L_0x004c
        L_0x0034:
            kotlin.C11661u0.m45747n(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.flow.f r8 = (kotlinx.coroutines.flow.C11908f) r8
            com.carrefour.fid.android.core.types.a$c r1 = new com.carrefour.fid.android.core.types.a$c
            r1.<init>()
            r7.L$0 = r8
            r7.label = r4
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r1 = r8
        L_0x004c:
            com.carrefour.fid.android.product.domain.repositories.ProductRepository r8 = r7.this$0
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r8 = r8.f67054a
            java.lang.String r4 = r7.$storeService
            java.lang.String r5 = r7.$gtin
            java.lang.String r6 = r7.$slotSlice
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r8.mo79841f(r4, r5, r6, r7)
            if (r8 != r0) goto L_0x0063
            return r0
        L_0x0063:
            com.carrefour.fid.android.core.types.a r8 = com.carrefour.fid.android.core.types.C36376b.m149219o(r8)
            boolean r3 = r8 instanceof com.carrefour.fid.android.core.types.C36371a.C36373b
            if (r3 == 0) goto L_0x006c
            goto L_0x0089
        L_0x006c:
            boolean r3 = r8 instanceof com.carrefour.fid.android.core.types.C36371a.C36375d
            if (r3 == 0) goto L_0x0085
            com.carrefour.fid.android.core.types.a$a r3 = com.carrefour.fid.android.core.types.C36371a.f89974a
            com.carrefour.fid.android.core.types.a$d r8 = (com.carrefour.fid.android.core.types.C36371a.C36375d) r8
            java.lang.Object r8 = r8.mo108633i()
            com.carrefour.fid.android.product.domain.model.c r8 = (com.carrefour.fid.android.product.domain.model.C27585c) r8
            java.util.List r8 = r8.mo80085e()
            com.carrefour.fid.android.core.types.a$d r3 = new com.carrefour.fid.android.core.types.a$d
            r3.<init>(r8)
            r8 = r3
            goto L_0x0089
        L_0x0085:
            boolean r3 = r8 instanceof com.carrefour.fid.android.core.types.C36371a.C36374c
            if (r3 == 0) goto L_0x0098
        L_0x0089:
            r3 = 0
            r7.L$0 = r3
            r7.label = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L_0x0095
            return r0
        L_0x0095:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x0098:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.ProductRepository$getOfferMixedProductsFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
