package com.carrefour.fid.android.presentation.p035ui.home;

import com.carrefour.fid.android.presentation.viewmodels.home.state.C26484b;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11308t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.home.HomePageFragment$onViewCreated$4$1", mo22502f = "HomePageFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/home/state/g;", "loyaltyCardState", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/f;", "loyaltyBalanceState", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/c;", "couponsState", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/h;", "stickersInfoState", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/b;", "joBanner", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$onViewCreated$4$1 */
public final class HomePageFragment$onViewCreated$4$1 extends SuspendLambda implements C11308t<C26501g, C26497f, C26487c, C26505h, C26484b, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$onViewCreated$4$1(HomePageFragment homePageFragment, C11045c<? super HomePageFragment$onViewCreated$4$1> cVar) {
        super(6, cVar);
        this.this$0 = homePageFragment;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo10648M1(@C12579k C26501g gVar, @C12579k C26497f fVar, @C12579k C26487c cVar, @C12579k C26505h hVar, @C12579k C26484b bVar, @C12580l C11045c<? super C11079d2> cVar2) {
        HomePageFragment$onViewCreated$4$1 homePageFragment$onViewCreated$4$1 = new HomePageFragment$onViewCreated$4$1(this.this$0, cVar2);
        homePageFragment$onViewCreated$4$1.L$0 = gVar;
        homePageFragment$onViewCreated$4$1.L$1 = fVar;
        homePageFragment$onViewCreated$4$1.L$2 = cVar;
        homePageFragment$onViewCreated$4$1.L$3 = hVar;
        homePageFragment$onViewCreated$4$1.L$4 = bVar;
        return homePageFragment$onViewCreated$4$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.this$0.mo70377L1((C26501g) this.L$0, (C26497f) this.L$1, (C26487c) this.L$2, (C26505h) this.L$3, (C26484b) this.L$4);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
