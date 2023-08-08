package com.carrefour.fid.android.service.domain.repositories;

import com.carrefour.fid.android.domain.models.service.models.C38168o;
import com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource;
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

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchServicesPicto$2", mo22502f = "StoreFacilityRepository.kt", mo22503i = {}, mo22504l = {73}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/o;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class StoreFacilityRepository$fetchServicesPicto$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C38168o>>, Object> {
    final /* synthetic */ List<String> $list;
    int label;
    final /* synthetic */ StoreFacilityRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreFacilityRepository$fetchServicesPicto$2(StoreFacilityRepository storeFacilityRepository, List<String> list, C11045c<? super StoreFacilityRepository$fetchServicesPicto$2> cVar) {
        super(1, cVar);
        this.this$0 = storeFacilityRepository;
        this.$list = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new StoreFacilityRepository$fetchServicesPicto$2(this.this$0, this.$list, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            StoreFacilityDataSource access$getStoreFacilityDataSource$p = this.this$0.storeFacilityDataSource;
            List<String> list = this.$list;
            this.label = 1;
            obj2 = access$getStoreFacilityDataSource$p.m172828fetchServicesPictogIAlus(list, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C38168o>> cVar) {
        return ((StoreFacilityRepository$fetchServicesPicto$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
