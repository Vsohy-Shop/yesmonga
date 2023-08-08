package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.product.domain.model.C27593f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getFrequentlyPurchasedProducts$2", mo22502f = "ProductsDataSource.kt", mo22503i = {}, mo22504l = {62, 63}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/product/domain/model/f;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductsDataSource$getFrequentlyPurchasedProducts$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends C27593f>>>, Object> {
    final /* synthetic */ String $storeService;
    int label;
    final /* synthetic */ ProductsDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductsDataSource$getFrequentlyPurchasedProducts$2(ProductsDataSource productsDataSource, String str, C11045c<? super ProductsDataSource$getFrequentlyPurchasedProducts$2> cVar) {
        super(1, cVar);
        this.this$0 = productsDataSource;
        this.$storeService = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new ProductsDataSource$getFrequentlyPurchasedProducts$2(this.this$0, this.$storeService, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0061
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001a:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0030
        L_0x001e:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r6 = r5.this$0
            com.carrefour.fid.android.shared.network.h r6 = r6.f66596e
            r5.label = r3
            java.lang.Object r6 = r6.mo83891a(r5)
            if (r6 != r0) goto L_0x0030
            return r0
        L_0x0030:
            com.carrefour.fid.android.shared.network.g r6 = (com.carrefour.fid.android.shared.network.C28811g) r6
            if (r6 != 0) goto L_0x0048
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoTokenException r6 = new com.carrefour.fid.android.shared.io.NoTokenException
            r6.<init>()
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            kotlin.Result r6 = kotlin.Result.m38701a(r6)
            return r6
        L_0x0048:
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r1 = r5.this$0
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r1 = r1.f66592a
            java.lang.String r3 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r6)
            java.lang.String r6 = r6.mo83886e()
            java.lang.String r4 = r5.$storeService
            r5.label = r2
            java.lang.Object r6 = r1.getFrequentlyPurchasedProducts(r3, r6, r4, r5)
            if (r6 != r0) goto L_0x0061
            return r0
        L_0x0061:
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r0 = r5.this$0
            retrofit2.w r6 = (retrofit2.C13091w) r6
            boolean r1 = r6.mo30576g()
            if (r1 == 0) goto L_0x007a
            java.lang.Object r6 = r6.mo30572a()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFrequentlyPurchasedResponse r6 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFrequentlyPurchasedResponse) r6
            com.carrefour.fid.android.shared.data.parsing.a r0 = r0.f66593b
            java.lang.Object r6 = com.carrefour.fid.android.product.data.api.datasource.C27461b.m115604m(r6, r0)
            goto L_0x008a
        L_0x007a:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.String r0 = "Error while getting frequently purchased products"
            com.carrefour.fid.android.shared.io.ResponseThrowable r6 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118565d(r6, r0)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x008a:
            kotlin.Result r6 = kotlin.Result.m38701a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getFrequentlyPurchasedProducts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<C27593f>>> cVar) {
        return ((ProductsDataSource$getFrequentlyPurchasedProducts$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
