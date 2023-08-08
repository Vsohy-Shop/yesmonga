package com.carrefour.fid.android.presentation.viewmodels.home;

import com.carrefour.fid.android.domain.interactors.basket.C37556a0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$observeBasketCount$1", mo22502f = "HomeViewModel.kt", mo22503i = {}, mo22504l = {167, 167}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class HomeViewModel$observeBasketCount$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    @C11363r0({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/home/HomeViewModel$observeBasketCount$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,190:1\n230#2,5:191\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/home/HomeViewModel$observeBasketCount$1$1\n*L\n168#1:191,5\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$observeBasketCount$1$a */
    public static final class C26379a implements C11908f<Integer> {

        /* renamed from: a */
        public final /* synthetic */ HomeViewModel f64514a;

        public C26379a(HomeViewModel homeViewModel) {
            this.f64514a = homeViewModel;
        }

        @C12580l
        /* renamed from: c */
        public final Object mo76839c(int i, @C12579k C11045c<? super C11079d2> cVar) {
            Object value;
            C11940j o0 = this.f64514a.f64512v;
            do {
                value = o0.getValue();
                ((Number) value).intValue();
            } while (!o0.mo24216e(value, C11064a.m42620f(i)));
            return C11079d2.f28267a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
            return mo76839c(((Number) obj).intValue(), cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$observeBasketCount$1(HomeViewModel homeViewModel, C11045c<? super HomeViewModel$observeBasketCount$1> cVar) {
        super(2, cVar);
        this.this$0 = homeViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new HomeViewModel$observeBasketCount$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37556a0 k0 = this.this$0.f64500j;
            this.label = 1;
            obj = k0.invoke(this);
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
        C26379a aVar = new C26379a(this.this$0);
        this.label = 2;
        if (((C11907e) obj).collect(aVar, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((HomeViewModel$observeBasketCount$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
