package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.product.domain.model.C27586d;
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

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.repositories.ProductDetailRepository$getProductFlow$2", mo22502f = "ProductDetailRepository.kt", mo22503i = {1, 1, 2, 2}, mo22504l = {28, 30, 31, 35}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow", "cacheId", "$this$flow", "cacheId"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lcom/carrefour/fid/android/core/types/a;", "Lcom/carrefour/fid/android/product/domain/model/d;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nProductDetailRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDetailRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/ProductDetailRepository$getProductFlow$2\n+ 2 ResultL.kt\ncom/carrefour/fid/android/core/types/ResultL$Companion\n+ 3 ResultL.kt\ncom/carrefour/fid/android/core/types/ResultLKt\n*L\n1#1,44:1\n85#2:45\n265#3,2:46\n*S KotlinDebug\n*F\n+ 1 ProductDetailRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/ProductDetailRepository$getProductFlow$2\n*L\n28#1:45\n32#1:46,2\n*E\n"})
public final class ProductDetailRepository$getProductFlow$2 extends SuspendLambda implements C11304p<C11908f<? super C36371a<? extends C27586d>>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $facilityServiceId;
    final /* synthetic */ String $gtin;
    final /* synthetic */ String $slotSlice;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ProductDetailRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailRepository$getProductFlow$2(String str, ProductDetailRepository productDetailRepository, String str2, String str3, C11045c<? super ProductDetailRepository$getProductFlow$2> cVar) {
        super(2, cVar);
        this.$facilityServiceId = str;
        this.this$0 = productDetailRepository;
        this.$gtin = str2;
        this.$slotSlice = str3;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ProductDetailRepository$getProductFlow$2 productDetailRepository$getProductFlow$2 = new ProductDetailRepository$getProductFlow$2(this.$facilityServiceId, this.this$0, this.$gtin, this.$slotSlice, cVar);
        productDetailRepository$getProductFlow$2.L$0 = obj;
        return productDetailRepository$getProductFlow$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super C36371a<C27586d>> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ProductDetailRepository$getProductFlow$2) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2 A[RETURN] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r5) goto L_0x003c
            if (r1 == r4) goto L_0x002f
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            goto L_0x003c
        L_0x0015:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001d:
            java.lang.Object r1 = r9.L$1
            com.carrefour.fid.android.product.domain.repositories.f$a r1 = (com.carrefour.fid.android.product.domain.repositories.C27600f.C27601a) r1
            java.lang.Object r3 = r9.L$0
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.C11908f) r3
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x009b
        L_0x002f:
            java.lang.Object r1 = r9.L$1
            com.carrefour.fid.android.product.domain.repositories.f$a r1 = (com.carrefour.fid.android.product.domain.repositories.C27600f.C27601a) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.C11908f) r4
            kotlin.C11661u0.m45747n(r10)
            r10 = r4
            goto L_0x007f
        L_0x003c:
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00c3
        L_0x0041:
            kotlin.C11661u0.m45747n(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.f r10 = (kotlinx.coroutines.flow.C11908f) r10
            com.carrefour.fid.android.product.domain.repositories.f$a r1 = new com.carrefour.fid.android.product.domain.repositories.f$a
            java.lang.String r6 = r9.$facilityServiceId
            r1.<init>(r6)
            com.carrefour.fid.android.product.domain.repositories.ProductDetailRepository r6 = r9.this$0
            com.carrefour.fid.android.product.domain.repositories.f r6 = r6.f67053b
            java.lang.String r7 = r9.$gtin
            com.carrefour.fid.android.product.domain.model.d r6 = r6.mo80202b(r1, r7)
            if (r6 == 0) goto L_0x006d
            com.carrefour.fid.android.core.types.a$a r1 = com.carrefour.fid.android.core.types.C36371a.f89974a
            com.carrefour.fid.android.core.types.a$d r1 = new com.carrefour.fid.android.core.types.a$d
            r1.<init>(r6)
            r9.label = r5
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto L_0x00c3
            return r0
        L_0x006d:
            com.carrefour.fid.android.core.types.a$c r5 = new com.carrefour.fid.android.core.types.a$c
            r5.<init>()
            r9.L$0 = r10
            r9.L$1 = r1
            r9.label = r4
            java.lang.Object r4 = r10.emit(r5, r9)
            if (r4 != r0) goto L_0x007f
            return r0
        L_0x007f:
            com.carrefour.fid.android.product.domain.repositories.ProductDetailRepository r4 = r9.this$0
            com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource r4 = r4.f67052a
            java.lang.String r5 = r9.$facilityServiceId
            java.lang.String r6 = r9.$gtin
            java.lang.String r7 = r9.$slotSlice
            r9.L$0 = r10
            r9.L$1 = r1
            r9.label = r3
            java.lang.Object r3 = r4.mo79830a(r5, r6, r7, r9)
            if (r3 != r0) goto L_0x0098
            return r0
        L_0x0098:
            r8 = r3
            r3 = r10
            r10 = r8
        L_0x009b:
            com.carrefour.fid.android.core.types.a r10 = com.carrefour.fid.android.core.types.C36376b.m149219o(r10)
            com.carrefour.fid.android.product.domain.repositories.ProductDetailRepository r4 = r9.this$0
            boolean r5 = r10 instanceof com.carrefour.fid.android.core.types.C36371a.C36375d
            if (r5 == 0) goto L_0x00b5
            r5 = r10
            com.carrefour.fid.android.core.types.a$d r5 = (com.carrefour.fid.android.core.types.C36371a.C36375d) r5
            java.lang.Object r5 = r5.mo108633i()
            com.carrefour.fid.android.product.domain.model.d r5 = (com.carrefour.fid.android.product.domain.model.C27586d) r5
            com.carrefour.fid.android.product.domain.repositories.f r4 = r4.f67053b
            r4.mo80203c(r1, r5)
        L_0x00b5:
            r1 = 0
            r9.L$0 = r1
            r9.L$1 = r1
            r9.label = r2
            java.lang.Object r10 = r3.emit(r10, r9)
            if (r10 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.ProductDetailRepository$getProductFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
