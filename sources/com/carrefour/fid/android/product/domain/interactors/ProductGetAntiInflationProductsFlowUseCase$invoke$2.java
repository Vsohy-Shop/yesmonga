package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37753d;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$invoke$2", mo22502f = "ProductGetAntiInflationProductsFlowUseCase.kt", mo22503i = {0, 1}, mo22504l = {25, 27, 30}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow", "$this$flow"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/product/plp/b;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductGetAntiInflationProductsFlowUseCase$invoke$2 extends SuspendLambda implements C11304p<C11908f<? super Result<? extends List<? extends C38114b>>>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C37753d.C37754a $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ProductGetAntiInflationProductsFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetAntiInflationProductsFlowUseCase$invoke$2(ProductGetAntiInflationProductsFlowUseCase productGetAntiInflationProductsFlowUseCase, C37753d.C37754a aVar, C11045c<? super ProductGetAntiInflationProductsFlowUseCase$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = productGetAntiInflationProductsFlowUseCase;
        this.$param = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ProductGetAntiInflationProductsFlowUseCase$invoke$2 productGetAntiInflationProductsFlowUseCase$invoke$2 = new ProductGetAntiInflationProductsFlowUseCase$invoke$2(this.this$0, this.$param, cVar);
        productGetAntiInflationProductsFlowUseCase$invoke$2.L$0 = obj;
        return productGetAntiInflationProductsFlowUseCase$invoke$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super Result<? extends List<C38114b>>> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ProductGetAntiInflationProductsFlowUseCase$invoke$2) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
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
            if (r1 == 0) goto L_0x0039
            if (r1 == r4) goto L_0x0028
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.C11661u0.m45747n(r8)
            goto L_0x008f
        L_0x0016:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001e:
            java.lang.Object r1 = r7.L$1
            java.lang.Object r3 = r7.L$0
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.C11908f) r3
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0073
        L_0x0028:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            r6 = r1
            r1 = r8
            r8 = r6
            goto L_0x0051
        L_0x0039:
            kotlin.C11661u0.m45747n(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.flow.f r8 = (kotlinx.coroutines.flow.C11908f) r8
            com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase r1 = r7.this$0
            com.carrefour.fid.android.domain.interactors.service.k r1 = r1.f66817c
            r7.L$0 = r8
            r7.label = r4
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r7)
            if (r1 != r0) goto L_0x0051
            return r0
        L_0x0051:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r1)
            if (r4 == 0) goto L_0x0074
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r4 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r4 = kotlin.Result.m38702b(r4)
            kotlin.Result r4 = kotlin.Result.m38701a(r4)
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r3 = r8.emit(r4, r7)
            if (r3 != r0) goto L_0x0072
            return r0
        L_0x0072:
            r3 = r8
        L_0x0073:
            r8 = r3
        L_0x0074:
            com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase r3 = r7.this$0
            com.carrefour.fid.android.domain.interactors.product.d$a r4 = r7.$param
            boolean r5 = kotlin.Result.m38710j(r1)
            if (r5 == 0) goto L_0x008f
            r5 = r1
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            r7.L$0 = r1
            r1 = 0
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r8 = r3.mo79943c(r8, r4, r5, r7)
            if (r8 != r0) goto L_0x008f
            return r0
        L_0x008f:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
