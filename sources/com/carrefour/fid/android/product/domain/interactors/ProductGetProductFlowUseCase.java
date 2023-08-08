package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37780r;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.product.domain.repositories.PlpProductRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductGetProductFlowUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetProductFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetProductFlowUseCase\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,35:1\n53#2:36\n55#2:40\n50#3:37\n55#3:39\n106#4:38\n*S KotlinDebug\n*F\n+ 1 ProductGetProductFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetProductFlowUseCase\n*L\n23#1:36\n23#1:40\n23#1:37\n23#1:39\n23#1:38\n*E\n"})
public final class ProductGetProductFlowUseCase implements C37780r {
    @C12579k

    /* renamed from: a */
    public final PlpProductRepository f66886a;
    @C12579k

    /* renamed from: b */
    public final C37857d f66887b;

    @Inject
    public ProductGetProductFlowUseCase(@C12579k PlpProductRepository plpProductRepository, @C12579k C37857d dVar) {
        Intrinsics.checkNotNullParameter(plpProductRepository, "repository");
        Intrinsics.checkNotNullParameter(dVar, "getSlotSliceUseCase");
        this.f66886a = plpProductRepository;
        this.f66887b = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.C37780r.C37781a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<kotlin.Result<com.carrefour.fid.android.domain.models.product.plp.C38115c>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r5 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.r$a r5 = (com.carrefour.fid.android.domain.interactors.product.C37780r.C37781a) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0052
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.slot.d r6 = r4.f66887b
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m172965invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r4
        L_0x0052:
            boolean r1 = kotlin.Result.m38709i(r6)
            if (r1 == 0) goto L_0x0059
            r6 = 0
        L_0x0059:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x005f
            java.lang.String r6 = "1A"
        L_0x005f:
            com.carrefour.fid.android.product.domain.repositories.PlpProductRepository r0 = r0.f66886a
            java.lang.String r1 = r5.mo115114f()
            java.util.List r1 = com.carrefour.fid.android.product.data.api.mapper.C27475c.m115628a(r1)
            java.lang.String r5 = r5.mo115112e()
            kotlinx.coroutines.flow.e r5 = r0.mo80182b(r1, r5, r6)
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase$invoke$$inlined$map$1 r6 = new com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase$invoke$$inlined$map$1
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase.invoke(com.carrefour.fid.android.domain.interactors.product.r$a, kotlin.coroutines.c):java.lang.Object");
    }
}
