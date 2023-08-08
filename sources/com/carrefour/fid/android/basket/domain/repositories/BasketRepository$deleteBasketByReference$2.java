package com.carrefour.fid.android.basket.domain.repositories;

import com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.repositories.BasketRepository$deleteBasketByReference$2", mo22502f = "BasketRepository.kt", mo22503i = {}, mo22504l = {105, 108}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBasketRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketRepository.kt\ncom/carrefour/fid/android/basket/domain/repositories/BasketRepository$deleteBasketByReference$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,386:1\n2624#2,3:387\n1#3:390\n*S KotlinDebug\n*F\n+ 1 BasketRepository.kt\ncom/carrefour/fid/android/basket/domain/repositories/BasketRepository$deleteBasketByReference$2\n*L\n107#1:387,3\n*E\n"})
public final class BasketRepository$deleteBasketByReference$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String $basketReference;
    int label;
    final /* synthetic */ BasketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketRepository$deleteBasketByReference$2(BasketRepository basketRepository, String str, C11045c<? super BasketRepository$deleteBasketByReference$2> cVar) {
        super(1, cVar);
        this.this$0 = basketRepository;
        this.$basketReference = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new BasketRepository$deleteBasketByReference$2(this.this$0, this.$basketReference, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object obj3;
        boolean z;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            BasketApiDataSource b = this.this$0.f34098a;
            String str = this.$basketReference;
            this.label = 1;
            obj3 = b.mo32785d(str, this);
            if (obj3 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj3 = ((Result) obj).mo21858l();
        } else if (i == 2) {
            try {
                C11661u0.m45747n(obj);
                Result.m38702b((Basket) obj);
            } catch (Throwable th) {
                Result.C10852a aVar = Result.f28060a;
                Result.m38702b(C11661u0.m45734a(th));
            }
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11064a.m42615a(true));
            return Result.m38701a(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        BasketRepository basketRepository = this.this$0;
        String str2 = this.$basketReference;
        Throwable e = Result.m38705e(obj3);
        if (e == null) {
            List list = (List) obj3;
            Iterable iterable = list;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (BasketReference.m156097f(((Basket) it.next()).mo116822G(), str2)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                Result.C10852a aVar3 = Result.f28060a;
                this.label = 2;
                obj = basketRepository.mo33377G(list, this);
                if (obj == h) {
                    return h;
                }
                Result.m38702b((Basket) obj);
                Result.C10852a aVar22 = Result.f28060a;
                obj2 = Result.m38702b(C11064a.m42615a(true));
                return Result.m38701a(obj2);
            }
            Result.C10852a aVar4 = Result.f28060a;
            obj2 = Result.m38702b(C11064a.m42615a(false));
            return Result.m38701a(obj2);
        }
        Result.C10852a aVar5 = Result.f28060a;
        return Result.m38701a(Result.m38702b(C11661u0.m45734a(e)));
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<Boolean>> cVar) {
        return ((BasketRepository$deleteBasketByReference$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
