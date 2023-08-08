package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.product.data.api.datasource.ProductToDomainMapperKt;
import com.carrefour.fid.android.product.data.api.mapper.C27475c;
import com.carrefour.fid.android.product.domain.model.C27586d;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository$getPdpProduct$2", mo22502f = "ProductsManagementRepository.kt", mo22503i = {}, mo22504l = {74}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/product/domain/model/d;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductsManagementRepository$getPdpProduct$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C27586d>>, Object> {
    final /* synthetic */ String $facilityServiceId;
    final /* synthetic */ String $gtin;
    int label;
    final /* synthetic */ ProductsManagementRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductsManagementRepository$getPdpProduct$2(ProductsManagementRepository productsManagementRepository, String str, String str2, C11045c<? super ProductsManagementRepository$getPdpProduct$2> cVar) {
        super(1, cVar);
        this.this$0 = productsManagementRepository;
        this.$gtin = str;
        this.$facilityServiceId = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new ProductsManagementRepository$getPdpProduct$2(this.this$0, this.$gtin, this.$facilityServiceId, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            BffProductsManagementApi b = this.this$0.f67056b;
            String str = this.$gtin;
            List<String> a = C27475c.m115628a(this.$facilityServiceId);
            this.label = 1;
            obj2 = BffProductsManagementApi.DefaultImpls.getPdpProducts$default(b, (String) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, a, this, 119, (Object) null);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Result.m38701a(ProductToDomainMapperKt.m115579f((BffPdpResponse) ((C13091w) obj2).mo30572a(), this.this$0.f67057c));
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C27586d>> cVar) {
        return ((ProductsManagementRepository$getPdpProduct$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
