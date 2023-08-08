package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.Offer;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0014\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderSearchViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "onCleared", "Lcom/carrefour/fid/android/domain/interactors/basket/z;", "a", "Lcom/carrefour/fid/android/domain/interactors/basket/z;", "basketObserveBasketUseCase", "Lkotlinx/coroutines/flow/j;", "", "b", "Lkotlinx/coroutines/flow/j;", "_basketNotEmpty", "Lkotlinx/coroutines/flow/u;", "c", "Lkotlinx/coroutines/flow/u;", "e0", "()Lkotlinx/coroutines/flow/u;", "basketNotEmpty", "Lkotlinx/coroutines/c2;", "d", "Lkotlinx/coroutines/c2;", "f0", "()Lkotlinx/coroutines/c2;", "g0", "(Lkotlinx/coroutines/c2;)V", "job", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/basket/z;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class AdditionalOrderSearchViewModel extends C19476v0 {

    /* renamed from: e */
    public static final int f65220e = 8;
    @C12579k

    /* renamed from: a */
    public final C37606z f65221a;
    @C12579k

    /* renamed from: b */
    public final C11940j<Boolean> f65222b;
    @C12579k

    /* renamed from: c */
    public final C11952u<Boolean> f65223c;
    @C12580l

    /* renamed from: d */
    public C11723c2 f65224d = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new C11304p<C12074o0, C11045c<? super C11079d2>, Object>(this, (C11045c<? super C267261>) null) {
        int label;
        final /* synthetic */ AdditionalOrderSearchViewModel this$0;

        @C11363r0({"SMAP\nAdditionalOrderSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalOrderSearchViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderSearchViewModel$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,37:1\n1#2:38\n230#3,5:39\n*S KotlinDebug\n*F\n+ 1 AdditionalOrderSearchViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderSearchViewModel$1$1\n*L\n27#1:39,5\n*E\n"})
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderSearchViewModel$1$a */
        public static final class C26727a implements C11908f<Basket> {

            /* renamed from: a */
            public final /* synthetic */ AdditionalOrderSearchViewModel f65225a;

            public C26727a(AdditionalOrderSearchViewModel additionalOrderSearchViewModel) {
                this.f65225a = additionalOrderSearchViewModel;
            }

            @C12580l
            /* renamed from: c */
            public final Object emit(@C12580l Basket basket, @C12579k C11045c<? super C11079d2> cVar) {
                int i;
                Object value;
                List<Offer> B;
                boolean z = false;
                if (basket == null || (B = basket.mo116817B()) == null) {
                    i = 0;
                } else {
                    i = 0;
                    for (Offer U : B) {
                        i += U.mo118012U();
                    }
                }
                if (i > 0) {
                    z = true;
                }
                C11940j d0 = this.f65225a.f65222b;
                do {
                    value = d0.getValue();
                    ((Boolean) value).booleanValue();
                } while (!d0.mo24216e(value, C11064a.m42615a(z)));
                return C11079d2.f28267a;
            }
        }

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return ;

            @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderSearchViewModel$1", mo22502f = "AdditionalOrderSearchViewModel.kt", mo22503i = {}, mo22504l = {25, 25}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
            @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderSearchViewModel$1 */
            public static final class C267261 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
                int label;
                final /* synthetic */ AdditionalOrderSearchViewModel this$0;

                @C11363r0({"SMAP\nAdditionalOrderSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalOrderSearchViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderSearchViewModel$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,37:1\n1#2:38\n230#3,5:39\n*S KotlinDebug\n*F\n+ 1 AdditionalOrderSearchViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderSearchViewModel$1$1\n*L\n27#1:39,5\n*E\n"})
                /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderSearchViewModel$1$a */
                public static final class C26727a implements C11908f<Basket> {

                    /* renamed from: a */
                    public final /* synthetic */ AdditionalOrderSearchViewModel f65225a;

                    public C26727a(AdditionalOrderSearchViewModel additionalOrderSearchViewModel) {
                        this.f65225a = additionalOrderSearchViewModel;
                    }

                    @C12580l
                    /* renamed from: c */
                    public final Object emit(@C12580l Basket basket, @C12579k C11045c<? super C11079d2> cVar) {
                        int i;
                        Object value;
                        List<Offer> B;
                        boolean z = false;
                        if (basket == null || (B = basket.mo116817B()) == null) {
                            i = 0;
                        } else {
                            i = 0;
                            for (Offer U : B) {
                                i += U.mo118012U();
                            }
                        }
                        if (i > 0) {
                            z = true;
                        }
                        C11940j d0 = this.f65225a.f65222b;
                        do {
                            value = d0.getValue();
                            ((Boolean) value).booleanValue();
                        } while (!d0.mo24216e(value, C11064a.m42615a(z)));
                        return C11079d2.f28267a;
                    }
                }

                {
                    this.this$0 = r1;
                }

                @C12579k
                public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                    return new C267261(this.this$0, cVar);
                }

                @C12580l
                public final Object invokeSuspend(@C12579k Object obj) {
                    Object h = C11063b.m42612h();
                    int i = this.label;
                    if (i == 0) {
                        C11661u0.m45747n(obj);
                        C37606z c0 = this.this$0.f65221a;
                        this.label = 1;
                        obj = c0.invoke(this);
                        if (obj == h) {
                            return h;
                        }
                    } else if (i == 1) {
                        C11661u0.m45747n(obj);
                    } else if (i == 2) {
                        C11661u0.m45747n(obj);
                        return C11079d2.f28267a;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C26727a aVar = new C26727a(this.this$0);
                    this.label = 2;
                    if (((C11907e) obj).collect(aVar, this) == h) {
                        return h;
                    }
                    return C11079d2.f28267a;
                }

                @C12580l
                public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
                    return ((C267261) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                }
            }

            @Inject
            public AdditionalOrderSearchViewModel(@C12579k C37606z zVar) {
                Intrinsics.checkNotNullParameter(zVar, "basketObserveBasketUseCase");
                this.f65221a = zVar;
                C11940j<Boolean> a = C11953v.m47628a(Boolean.FALSE);
                this.f65222b = a;
                this.f65223c = C11909g.m47470m(a);
            }

            @C12579k
            /* renamed from: e0 */
            public final C11952u<Boolean> mo77668e0() {
                return this.f65223c;
            }

            @C12580l
            /* renamed from: f0 */
            public final C11723c2 mo77669f0() {
                return this.f65224d;
            }

            /* renamed from: g0 */
            public final void mo77670g0(@C12580l C11723c2 c2Var) {
                this.f65224d = c2Var;
            }

            public void onCleared() {
                C11723c2 c2Var = this.f65224d;
                if (c2Var != null) {
                    C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
                }
                super.onCleared();
            }
        }
