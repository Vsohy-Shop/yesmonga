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
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.repositories.BasketRepository$getBasketsList$2", mo22502f = "BasketRepository.kt", mo22503i = {}, mo22504l = {175, 176}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBasketRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketRepository.kt\ncom/carrefour/fid/android/basket/domain/repositories/BasketRepository$getBasketsList$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,386:1\n1#2:387\n*E\n"})
public final class BasketRepository$getBasketsList$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends Basket>>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BasketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketRepository$getBasketsList$2(BasketRepository basketRepository, C11045c<? super BasketRepository$getBasketsList$2> cVar) {
        super(1, cVar);
        this.this$0 = basketRepository;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new BasketRepository$getBasketsList$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Result result;
        Throwable th;
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            BasketApiDataSource b = this.this$0.f34098a;
            this.label = 1;
            obj2 = b.mo32788g(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else if (i == 2) {
            result = (Result) this.L$0;
            try {
                C11661u0.m45747n(obj);
                Result.m38702b((Basket) obj);
            } catch (Throwable th2) {
                th = th2;
            }
            return result;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Result a = Result.m38701a(obj2);
        BasketRepository basketRepository = this.this$0;
        Object l = a.mo21858l();
        if (Result.m38710j(l)) {
            try {
                Result.C10852a aVar = Result.f28060a;
                this.L$0 = a;
                this.label = 2;
                Object d = basketRepository.mo33377G((List) l, this);
                if (d == h) {
                    return h;
                }
                result = a;
                obj = d;
                Result.m38702b((Basket) obj);
                return result;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                result = a;
                th = th4;
                Result.C10852a aVar2 = Result.f28060a;
                Result.m38702b(C11661u0.m45734a(th));
                return result;
            }
        } else {
            Result.m38702b(l);
            return a;
        }
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<Basket>>> cVar) {
        return ((BasketRepository$getBasketsList$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
