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
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getComplementaryProducts$2", mo22502f = "ProductsDataSource.kt", mo22503i = {}, mo22504l = {81, 82}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/product/domain/model/f;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nProductsDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductsDataSource.kt\ncom/carrefour/fid/android/product/data/api/datasource/ProductsDataSource$getComplementaryProducts$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1549#2:98\n1620#2,3:99\n*S KotlinDebug\n*F\n+ 1 ProductsDataSource.kt\ncom/carrefour/fid/android/product/data/api/datasource/ProductsDataSource$getComplementaryProducts$2\n*L\n92#1:98\n92#1:99,3\n*E\n"})
public final class ProductsDataSource$getComplementaryProducts$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends C27593f>>>, Object> {
    final /* synthetic */ List<String> $complementaryTo;
    final /* synthetic */ String $storeService;
    int label;
    final /* synthetic */ ProductsDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductsDataSource$getComplementaryProducts$2(ProductsDataSource productsDataSource, String str, List<String> list, C11045c<? super ProductsDataSource$getComplementaryProducts$2> cVar) {
        super(1, cVar);
        this.this$0 = productsDataSource;
        this.$storeService = str;
        this.$complementaryTo = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new ProductsDataSource$getComplementaryProducts$2(this.this$0, this.$storeService, this.$complementaryTo, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r17
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r6.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 == r2) goto L_0x001f
            if (r0 != r1) goto L_0x0017
            kotlin.C11661u0.m45747n(r18)
            r0 = r18
            goto L_0x0083
        L_0x0017:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001f:
            kotlin.C11661u0.m45747n(r18)
            r0 = r18
            goto L_0x0037
        L_0x0025:
            kotlin.C11661u0.m45747n(r18)
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r0 = r6.this$0
            com.carrefour.fid.android.shared.network.h r0 = r0.f66596e
            r6.label = r2
            java.lang.Object r0 = r0.mo83891a(r6)
            if (r0 != r7) goto L_0x0037
            return r7
        L_0x0037:
            com.carrefour.fid.android.shared.network.g r0 = (com.carrefour.fid.android.shared.network.C28811g) r0
            if (r0 != 0) goto L_0x004f
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NoTokenException r0 = new com.carrefour.fid.android.shared.io.NoTokenException
            r0.<init>()
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            kotlin.Result r0 = kotlin.Result.m38701a(r0)
            return r0
        L_0x004f:
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r2 = r6.this$0
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi r2 = r2.f66592a
            java.lang.String r3 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r0)
            java.lang.String r4 = r0.mo83886e()
            java.lang.String r5 = r6.$storeService
            java.util.List<java.lang.String> r0 = r6.$complementaryTo
            r8 = r0
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.String r9 = ","
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 62
            r16 = 0
            java.lang.String r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40639h3(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r6.label = r1
            r0 = r2
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r8
            r5 = r17
            java.lang.Object r0 = r0.getComplementaryProductsResponse(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x0083
            return r7
        L_0x0083:
            com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource r1 = r6.this$0
            java.util.List<java.lang.String> r2 = r6.$complementaryTo
            retrofit2.w r0 = (retrofit2.C13091w) r0
            boolean r3 = r0.mo30576g()
            if (r3 == 0) goto L_0x009e
            java.lang.Object r0 = r0.mo30572a()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffComplementaryProductsResponse r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffComplementaryProductsResponse) r0
            com.carrefour.fid.android.shared.data.parsing.a r1 = r1.f66593b
            java.lang.Object r0 = com.carrefour.fid.android.product.data.api.datasource.C27461b.m115604m(r0, r1)
            goto L_0x00de
        L_0x009e:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C10978t.m41495Y(r2, r3)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x00b1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c1
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            goto L_0x00b1
        L_0x00c1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error while getting complementary products with items : "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118565d(r0, r1)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00de:
            kotlin.Result r0 = kotlin.Result.m38701a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource$getComplementaryProducts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<C27593f>>> cVar) {
        return ((ProductsDataSource$getComplementaryProducts$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
