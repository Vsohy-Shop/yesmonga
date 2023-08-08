package com.carrefour.fid.android.service.domain.repositories;

import com.carrefour.fid.android.domain.models.service.models.C38166m;
import com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource;
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

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getEligibilityPostalCode$2", mo22502f = "StoreFacilityRepository.kt", mo22503i = {}, mo22504l = {80}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class StoreFacilityRepository$getEligibilityPostalCode$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C38166m>>, Object> {
    final /* synthetic */ String $cityName;
    final /* synthetic */ String $postalCode;
    int label;
    final /* synthetic */ StoreFacilityRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreFacilityRepository$getEligibilityPostalCode$2(StoreFacilityRepository storeFacilityRepository, String str, String str2, C11045c<? super StoreFacilityRepository$getEligibilityPostalCode$2> cVar) {
        super(1, cVar);
        this.this$0 = storeFacilityRepository;
        this.$postalCode = str;
        this.$cityName = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new StoreFacilityRepository$getEligibilityPostalCode$2(this.this$0, this.$postalCode, this.$cityName, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            StoreFacilityDataSource access$getStoreFacilityDataSource$p = this.this$0.storeFacilityDataSource;
            String str = this.$postalCode;
            String str2 = this.$cityName;
            this.label = 1;
            obj2 = access$getStoreFacilityDataSource$p.m172832getEligibilityPostalCode0E7RQCE(str, str2, this);
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
    public final Object invoke(@C12580l C11045c<? super Result<C38166m>> cVar) {
        return ((StoreFacilityRepository$getEligibilityPostalCode$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
