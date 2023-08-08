package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37835r;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketsItemCountUseCase$invoke$2", mo22502f = "BasketObserveBasketsItemCountUseCase.kt", mo22503i = {0}, mo22504l = {22, 48}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BasketObserveBasketsItemCountUseCase$invoke$2 extends SuspendLambda implements C11304p<C11908f<? super Integer>, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BasketObserveBasketsItemCountUseCase this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketsItemCountUseCase$invoke$2$1", mo22502f = "BasketObserveBasketsItemCountUseCase.kt", mo22503i = {0, 0}, mo22504l = {24}, mo22505m = "invokeSuspend", mo22506n = {"baskets", "serviceSelection"}, mo22507s = {"L$0", "L$1"})
    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@"}, mo22516d2 = {"", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "baskets", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "serviceSelection", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nBasketObserveBasketsItemCountUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketObserveBasketsItemCountUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketObserveBasketsItemCountUseCase$invoke$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n288#2,2:56\n1#3:58\n*S KotlinDebug\n*F\n+ 1 BasketObserveBasketsItemCountUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketObserveBasketsItemCountUseCase$invoke$2$1\n*L\n27#1:56,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketsItemCountUseCase$invoke$2$1 */
    public static final class C138911 extends SuspendLambda implements C11305q<List<? extends Basket>, C38162k, C11045c<? super Integer>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k List<Basket> list, @C12580l C38162k kVar, @C12580l C11045c<? super Integer> cVar) {
            C138911 r0 = new C138911(basketObserveBasketsItemCountUseCase, cVar);
            r0.L$0 = list;
            r0.L$1 = kVar;
            return r0.invokeSuspend(C11079d2.f28267a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                java.lang.Object r0 = r8.L$1
                com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0
                java.lang.Object r1 = r8.L$0
                java.util.List r1 = (java.util.List) r1
                kotlin.C11661u0.m45747n(r9)
                goto L_0x0040
            L_0x0017:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001f:
                kotlin.C11661u0.m45747n(r9)
                java.lang.Object r9 = r8.L$0
                r1 = r9
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r9 = r8.L$1
                com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
                com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketsItemCountUseCase r3 = r5
                com.carrefour.fid.android.domain.interactors.account.b r3 = r3.f33873b
                r8.L$0 = r1
                r8.L$1 = r9
                r8.label = r2
                java.lang.Object r3 = r3.mo31420a(r8)
                if (r3 != r0) goto L_0x003e
                return r0
            L_0x003e:
                r0 = r9
                r9 = r3
            L_0x0040:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                r3 = 0
                if (r9 != 0) goto L_0x004b
                goto L_0x00c3
            L_0x004b:
                r9 = r1
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.Iterator r9 = r9.iterator()
            L_0x0052:
                boolean r4 = r9.hasNext()
                r5 = 0
                if (r4 == 0) goto L_0x006e
                java.lang.Object r4 = r9.next()
                r6 = r4
                com.carrefour.fid.android.domain.models.basket.Basket r6 = (com.carrefour.fid.android.domain.models.basket.Basket) r6
                com.carrefour.fid.android.domain.models.basket.BasketType r6 = r6.mo116829N()
                com.carrefour.fid.android.domain.models.basket.BasketType r7 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_HOME_DELIVERY_NAL
                if (r6 != r7) goto L_0x006a
                r6 = r2
                goto L_0x006b
            L_0x006a:
                r6 = r3
            L_0x006b:
                if (r6 == 0) goto L_0x0052
                goto L_0x006f
            L_0x006e:
                r4 = r5
            L_0x006f:
                com.carrefour.fid.android.domain.models.basket.Basket r4 = (com.carrefour.fid.android.domain.models.basket.Basket) r4
                if (r0 == 0) goto L_0x0078
                com.carrefour.fid.android.domain.models.service.models.StoreService r9 = r0.mo119354f()
                goto L_0x0079
            L_0x0078:
                r9 = r5
            L_0x0079:
                if (r4 == 0) goto L_0x0082
                if (r9 != 0) goto L_0x0082
                java.util.List r9 = kotlin.collections.C10976s.m41419k(r4)
                goto L_0x00a1
            L_0x0082:
                if (r9 != 0) goto L_0x0087
                com.carrefour.fid.android.domain.models.basket.BasketType r9 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_HOME_DELIVERY_NAL
                goto L_0x0091
            L_0x0087:
                com.carrefour.fid.android.domain.models.basket.BasketType$a r2 = com.carrefour.fid.android.domain.models.basket.BasketType.f95520a
                java.lang.String r9 = r9.mo119180X()
                com.carrefour.fid.android.domain.models.basket.BasketType r9 = r2.mo117009a(r9)
            L_0x0091:
                if (r0 == 0) goto L_0x009d
                com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()
                if (r0 == 0) goto L_0x009d
                com.carrefour.fid.android.domain.models.service.models.StoreServiceType r5 = r0.mo119176T()
            L_0x009d:
                java.util.List r9 = com.carrefour.fid.android.basket.domain.models.extension.C13969a.m59182a(r1, r9, r5)
            L_0x00a1:
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.Iterator r9 = r9.iterator()
            L_0x00a7:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L_0x00c3
                java.lang.Object r0 = r9.next()
                com.carrefour.fid.android.domain.models.basket.Basket r0 = (com.carrefour.fid.android.domain.models.basket.Basket) r0
                java.util.Map r0 = r0.mo116821F()
                java.util.Collection r0 = r0.values()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                int r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40714x5(r0)
                int r3 = r3 + r0
                goto L_0x00a7
            L_0x00c3:
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r3)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketsItemCountUseCase$invoke$2.C138911.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketsItemCountUseCase$invoke$2$a */
    public static final class C13892a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ C11908f<Integer> f33875a;

        public C13892a(C11908f<? super Integer> fVar) {
            this.f33875a = fVar;
        }

        @C12580l
        /* renamed from: c */
        public final Object mo33282c(int i, @C12579k C11045c<? super C11079d2> cVar) {
            Object emit = this.f33875a.emit(C11064a.m42620f(i), cVar);
            return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
            return mo33282c(((Number) obj).intValue(), cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketObserveBasketsItemCountUseCase$invoke$2(BasketObserveBasketsItemCountUseCase basketObserveBasketsItemCountUseCase, C11045c<? super BasketObserveBasketsItemCountUseCase$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = basketObserveBasketsItemCountUseCase;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        BasketObserveBasketsItemCountUseCase$invoke$2 basketObserveBasketsItemCountUseCase$invoke$2 = new BasketObserveBasketsItemCountUseCase$invoke$2(this.this$0, cVar);
        basketObserveBasketsItemCountUseCase$invoke$2.L$0 = obj;
        return basketObserveBasketsItemCountUseCase$invoke$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super Integer> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BasketObserveBasketsItemCountUseCase$invoke$2) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11908f fVar;
        C11907e eVar;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11908f fVar2 = (C11908f) this.L$0;
            eVar = this.this$0.f33872a.mo33392p();
            C37835r b = this.this$0.f33874c;
            this.L$0 = fVar2;
            this.L$1 = eVar;
            this.label = 1;
            Object invoke = b.invoke(this);
            if (invoke == h) {
                return h;
            }
            Object obj2 = invoke;
            fVar = fVar2;
            obj = obj2;
        } else if (i == 1) {
            eVar = (C11907e) this.L$1;
            fVar = (C11908f) this.L$0;
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        final BasketObserveBasketsItemCountUseCase basketObserveBasketsItemCountUseCase = this.this$0;
        C11907e D = C11909g.m47357D(eVar, (C11907e) obj, new C138911((C11045c<? super C138911>) null));
        C13892a aVar = new C13892a(fVar);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (D.collect(aVar, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }
}
