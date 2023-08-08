package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.GetMixedProductsDetailUseCase;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.product.domain.repositories.ProductDetailRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductGetMixedProductsDetailUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetMixedProductsDetailUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetMixedProductsDetailUseCase\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,35:1\n53#2:36\n55#2:40\n50#3:37\n55#3:39\n106#4:38\n*S KotlinDebug\n*F\n+ 1 ProductGetMixedProductsDetailUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetMixedProductsDetailUseCase\n*L\n20#1:36\n20#1:40\n20#1:37\n20#1:39\n20#1:38\n*E\n"})
public final class ProductGetMixedProductsDetailUseCase implements GetMixedProductsDetailUseCase {
    @C12579k

    /* renamed from: a */
    public final ProductDetailRepository f66865a;
    @C12579k

    /* renamed from: b */
    public final C37857d f66866b;

    @Inject
    public ProductGetMixedProductsDetailUseCase(@C12579k ProductDetailRepository productDetailRepository, @C12579k C37857d dVar) {
        Intrinsics.checkNotNullParameter(productDetailRepository, "repository");
        Intrinsics.checkNotNullParameter(dVar, "getSlotSliceUseCase");
        this.f66865a = productDetailRepository;
        this.f66866b = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.GetMixedProductsDetailUseCase.Param r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<? extends com.carrefour.fid.android.core.types.C36371a<? extends java.util.List<? extends com.carrefour.fid.android.domain.models.product.detail.C38107b>>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r8)
            goto L_0x007e
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.GetMixedProductsDetailUseCase$Param r7 = (com.carrefour.fid.android.domain.interactors.product.GetMixedProductsDetailUseCase.Param) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0059
        L_0x0046:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.slot.d r8 = r6.f66866b
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r6
        L_0x0059:
            boolean r4 = kotlin.Result.m38709i(r8)
            r5 = 0
            if (r4 == 0) goto L_0x0061
            r8 = r5
        L_0x0061:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x0067
            java.lang.String r8 = "1A"
        L_0x0067:
            com.carrefour.fid.android.product.domain.repositories.ProductDetailRepository r2 = r2.f66865a
            java.lang.String r4 = r7.mo114917f()
            java.lang.String r7 = r7.mo114918g()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r2.mo80187d(r4, r7, r8, r0)
            if (r8 != r1) goto L_0x007e
            return r1
        L_0x007e:
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase$invoke$$inlined$map$1 r7 = new com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase$invoke$$inlined$map$1
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase.invoke(com.carrefour.fid.android.domain.interactors.product.GetMixedProductsDetailUseCase$Param, kotlin.coroutines.c):java.lang.Object");
    }
}
