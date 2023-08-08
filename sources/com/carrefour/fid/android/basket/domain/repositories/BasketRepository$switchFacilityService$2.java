package com.carrefour.fid.android.basket.domain.repositories;

import com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource;
import com.carrefour.fid.android.domain.models.basket.Basket;
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

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.repositories.BasketRepository$switchFacilityService$2", mo22502f = "BasketRepository.kt", mo22503i = {}, mo22504l = {220, 222}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BasketRepository$switchFacilityService$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends Basket>>, Object> {
    final /* synthetic */ Basket $currentBasket;
    final /* synthetic */ String $facilityServiceId;
    int label;
    final /* synthetic */ BasketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketRepository$switchFacilityService$2(BasketRepository basketRepository, String str, Basket basket, C11045c<? super BasketRepository$switchFacilityService$2> cVar) {
        super(1, cVar);
        this.this$0 = basketRepository;
        this.$facilityServiceId = str;
        this.$currentBasket = basket;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new BasketRepository$switchFacilityService$2(this.this$0, this.$facilityServiceId, this.$currentBasket, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object obj3;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            BasketApiDataSource b = this.this$0.f34098a;
            String str = this.$facilityServiceId;
            String G = this.$currentBasket.mo116822G();
            this.label = 1;
            obj3 = b.mo32793m(str, G, this);
            if (obj3 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj3 = ((Result) obj).mo21858l();
        } else if (i == 2) {
            try {
                C11661u0.m45747n(obj);
                obj2 = Result.m38702b((Basket) obj);
            } catch (Throwable th) {
                Result.C10852a aVar = Result.f28060a;
                obj3 = C11661u0.m45734a(th);
            }
            return Result.m38701a(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        BasketRepository basketRepository = this.this$0;
        if (Result.m38710j(obj3)) {
            Result.C10852a aVar2 = Result.f28060a;
            this.label = 2;
            obj = basketRepository.mo33377G((List) obj3, this);
            if (obj == h) {
                return h;
            }
            obj2 = Result.m38702b((Basket) obj);
            return Result.m38701a(obj2);
        }
        obj2 = Result.m38702b(obj3);
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<Basket>> cVar) {
        return ((BasketRepository$switchFacilityService$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
