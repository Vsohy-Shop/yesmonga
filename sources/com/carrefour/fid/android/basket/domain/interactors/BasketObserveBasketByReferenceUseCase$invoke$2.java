package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.domain.models.basket.Basket;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketByReferenceUseCase$invoke$2", mo22502f = "BasketObserveBasketByReferenceUseCase.kt", mo22503i = {}, mo22504l = {14}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BasketObserveBasketByReferenceUseCase$invoke$2 extends SuspendLambda implements C11304p<C11908f<? super Basket>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $referenceId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BasketObserveBasketByReferenceUseCase this$0;

    @C11363r0({"SMAP\nBasketObserveBasketByReferenceUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketObserveBasketByReferenceUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketObserveBasketByReferenceUseCase$invoke$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
    /* renamed from: com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketByReferenceUseCase$invoke$2$a */
    public static final class C13887a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ C11908f<Basket> f33865a;

        /* renamed from: b */
        public final /* synthetic */ String f33866b;

        public C13887a(C11908f<? super Basket> fVar, String str) {
            this.f33865a = fVar;
            this.f33866b = str;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k List<Basket> list, @C12579k C11045c<? super C11079d2> cVar) {
            Object obj;
            C11908f<Basket> fVar = this.f33865a;
            String str = this.f33866b;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((Basket) obj).mo116822G(), (Object) str)) {
                    break;
                }
            }
            Object emit = fVar.emit(obj, cVar);
            return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketObserveBasketByReferenceUseCase$invoke$2(BasketObserveBasketByReferenceUseCase basketObserveBasketByReferenceUseCase, String str, C11045c<? super BasketObserveBasketByReferenceUseCase$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = basketObserveBasketByReferenceUseCase;
        this.$referenceId = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        BasketObserveBasketByReferenceUseCase$invoke$2 basketObserveBasketByReferenceUseCase$invoke$2 = new BasketObserveBasketByReferenceUseCase$invoke$2(this.this$0, this.$referenceId, cVar);
        basketObserveBasketByReferenceUseCase$invoke$2.L$0 = obj;
        return basketObserveBasketByReferenceUseCase$invoke$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super Basket> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BasketObserveBasketByReferenceUseCase$invoke$2) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11952u<List<Basket>> p = this.this$0.f33864a.mo33392p();
            C13887a aVar = new C13887a((C11908f) this.L$0, this.$referenceId);
            this.label = 1;
            if (p.collect(aVar, this) == h) {
                return h;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C11661u0.m45747n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
