package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.domain.models.criteo.C38005g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getCriteoProducts$2", mo22502f = "ProductDetailsViewModel.kt", mo22503i = {0, 1, 2, 3}, mo22504l = {187, 198, 199, 200, 201}, mo22505m = "invokeSuspend", mo22506n = {"criteoItemDataProducts", "criteoItemDataProducts", "criteoItemDataProducts", "criteoItemDataProducts"}, mo22507s = {"L$2", "L$2", "L$2", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/criteo/g;", "result", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductDetailsViewModel$getCriteoProducts$2 extends SuspendLambda implements C11304p<Result<? extends C38005g>, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ProductDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailsViewModel$getCriteoProducts$2(ProductDetailsViewModel productDetailsViewModel, C11045c<? super ProductDetailsViewModel$getCriteoProducts$2> cVar) {
        super(2, cVar);
        this.this$0 = productDetailsViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ProductDetailsViewModel$getCriteoProducts$2 productDetailsViewModel$getCriteoProducts$2 = new ProductDetailsViewModel$getCriteoProducts$2(this.this$0, cVar);
        productDetailsViewModel$getCriteoProducts$2.L$0 = obj;
        return productDetailsViewModel$getCriteoProducts$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo81728g(@C12579k Object obj, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ProductDetailsViewModel$getCriteoProducts$2) create(Result.m38701a(obj), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo81728g(((Result) obj).mo21858l(), (C11045c) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0120 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0121  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r13.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0065
            if (r1 == r6) goto L_0x0056
            if (r1 == r5) goto L_0x0047
            if (r1 == r4) goto L_0x0038
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r13.L$1
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r0 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0122
        L_0x0021:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0029:
            java.lang.Object r1 = r13.L$2
            com.carrefour.fid.android.domain.models.criteo.g r1 = (com.carrefour.fid.android.domain.models.criteo.C38005g) r1
            java.lang.Object r3 = r13.L$1
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r3 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r3
            java.lang.Object r4 = r13.L$0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0100
        L_0x0038:
            java.lang.Object r1 = r13.L$2
            com.carrefour.fid.android.domain.models.criteo.g r1 = (com.carrefour.fid.android.domain.models.criteo.C38005g) r1
            java.lang.Object r4 = r13.L$1
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r4 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r4
            java.lang.Object r5 = r13.L$0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00eb
        L_0x0047:
            java.lang.Object r1 = r13.L$2
            com.carrefour.fid.android.domain.models.criteo.g r1 = (com.carrefour.fid.android.domain.models.criteo.C38005g) r1
            java.lang.Object r5 = r13.L$1
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r5 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r5
            java.lang.Object r8 = r13.L$0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00c8
        L_0x0056:
            java.lang.Object r1 = r13.L$2
            com.carrefour.fid.android.domain.models.criteo.g r1 = (com.carrefour.fid.android.domain.models.criteo.C38005g) r1
            java.lang.Object r8 = r13.L$1
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r8 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r8
            java.lang.Object r9 = r13.L$0
            kotlin.C11661u0.m45747n(r14)
            r14 = r9
            goto L_0x008e
        L_0x0065:
            kotlin.C11661u0.m45747n(r14)
            java.lang.Object r14 = r13.L$0
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r8 = r13.this$0
            boolean r1 = kotlin.Result.m38710j(r14)
            if (r1 == 0) goto L_0x0125
            r1 = r14
            com.carrefour.fid.android.domain.models.criteo.g r1 = (com.carrefour.fid.android.domain.models.criteo.C38005g) r1
            kotlinx.coroutines.flow.i r9 = r8.f68104m
            r13.L$0 = r14
            r13.L$1 = r8
            r13.L$2 = r1
            r13.label = r6
            java.lang.Object r9 = r9.emit(r1, r13)
            if (r9 != r0) goto L_0x008e
            return r0
        L_0x008e:
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$a r9 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$a
            java.util.List r10 = r1.mo117435d()
            java.util.List r11 = r1.mo117432a()
            r12 = 0
            java.lang.Object r11 = kotlin.collections.CollectionsKt___CollectionsKt.m40559R2(r11, r12)
            com.carrefour.fid.android.domain.models.criteo.n r11 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r11
            if (r11 == 0) goto L_0x00a6
            java.lang.String r11 = r11.mo117554j()
            goto L_0x00a7
        L_0x00a6:
            r11 = r7
        L_0x00a7:
            r9.<init>(r10, r11)
            r8.publishState(r9)
            boolean r9 = r8.f68102k
            if (r9 != 0) goto L_0x0125
            java.lang.String r9 = r1.mo117433b()
            r13.L$0 = r14
            r13.L$1 = r8
            r13.L$2 = r1
            r13.label = r5
            java.lang.Object r5 = r8.mo81717F0(r9, r13)
            if (r5 != r0) goto L_0x00c6
            return r0
        L_0x00c6:
            r5 = r8
            r8 = r14
        L_0x00c8:
            java.util.List r14 = r1.mo117432a()
            java.lang.Object r14 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r14)
            com.carrefour.fid.android.domain.models.criteo.n r14 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r14
            if (r14 == 0) goto L_0x00d9
            java.lang.String r14 = r14.mo117556l()
            goto L_0x00da
        L_0x00d9:
            r14 = r7
        L_0x00da:
            r13.L$0 = r8
            r13.L$1 = r5
            r13.L$2 = r1
            r13.label = r4
            java.lang.Object r14 = r5.mo81717F0(r14, r13)
            if (r14 != r0) goto L_0x00e9
            return r0
        L_0x00e9:
            r4 = r5
            r5 = r8
        L_0x00eb:
            java.lang.String r14 = r1.mo117434c()
            r13.L$0 = r5
            r13.L$1 = r4
            r13.L$2 = r1
            r13.label = r3
            java.lang.Object r14 = r4.mo81717F0(r14, r13)
            if (r14 != r0) goto L_0x00fe
            return r0
        L_0x00fe:
            r3 = r4
            r4 = r5
        L_0x0100:
            java.util.List r14 = r1.mo117432a()
            java.lang.Object r14 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r14)
            com.carrefour.fid.android.domain.models.criteo.n r14 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r14
            if (r14 == 0) goto L_0x0111
            java.lang.String r14 = r14.mo117557m()
            goto L_0x0112
        L_0x0111:
            r14 = r7
        L_0x0112:
            r13.L$0 = r4
            r13.L$1 = r3
            r13.L$2 = r7
            r13.label = r2
            java.lang.Object r14 = r3.mo81717F0(r14, r13)
            if (r14 != r0) goto L_0x0121
            return r0
        L_0x0121:
            r0 = r3
        L_0x0122:
            r0.f68102k = r6
        L_0x0125:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getCriteoProducts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
