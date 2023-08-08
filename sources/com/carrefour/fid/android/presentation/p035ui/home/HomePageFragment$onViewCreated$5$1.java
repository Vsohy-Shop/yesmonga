package com.carrefour.fid.android.presentation.p035ui.home;

import com.carrefour.fid.android.presentation.viewmodels.home.state.C26491d;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.home.HomePageFragment$onViewCreated$5$1", mo22502f = "HomePageFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/home/state/d;", "gazStationsCampaignState", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/g;", "loyaltyCardState", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$onViewCreated$5$1 */
public final class HomePageFragment$onViewCreated$5$1 extends SuspendLambda implements C11305q<C26491d, C26501g, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$onViewCreated$5$1(HomePageFragment homePageFragment, C11045c<? super HomePageFragment$onViewCreated$5$1> cVar) {
        super(3, cVar);
        this.this$0 = homePageFragment;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C26491d dVar, @C12579k C26501g gVar, @C12580l C11045c<? super C11079d2> cVar) {
        HomePageFragment$onViewCreated$5$1 homePageFragment$onViewCreated$5$1 = new HomePageFragment$onViewCreated$5$1(this.this$0, cVar);
        homePageFragment$onViewCreated$5$1.L$0 = dVar;
        homePageFragment$onViewCreated$5$1.L$1 = gVar;
        return homePageFragment$onViewCreated$5$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.this$0.mo70374H1((C26491d) this.L$0, (C26501g) this.L$1);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
