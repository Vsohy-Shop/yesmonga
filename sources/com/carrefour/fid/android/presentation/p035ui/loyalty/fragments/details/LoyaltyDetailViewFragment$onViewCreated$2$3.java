package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$onViewCreated$2$3", mo22502f = "LoyaltyDetailViewFragment.kt", mo22503i = {}, mo22504l = {102}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$onViewCreated$2$3 */
public final class LoyaltyDetailViewFragment$onViewCreated$2$3 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ LoyaltyDetailViewModel $this_apply;
    int label;
    final /* synthetic */ LoyaltyDetailViewFragment this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$onViewCreated$2$3$1", mo22502f = "LoyaltyDetailViewFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$onViewCreated$2$3$1 */
    public static final class C244651 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C244651(loyaltyDetailViewModel, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                loyaltyDetailViewModel.sendIntent(C26562a.C26601k.C26607f.f64999a);
                loyaltyDetailViewModel.sendIntent(C26562a.C26601k.C26609h.f65003a);
                loyaltyDetailViewModel.sendIntent(C26562a.C26601k.C26610i.f65005a);
                loyaltyDetailViewModel.sendIntent(C26562a.C26601k.C26608g.f65001a);
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C244651) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewFragment$onViewCreated$2$3(LoyaltyDetailViewFragment loyaltyDetailViewFragment, LoyaltyDetailViewModel loyaltyDetailViewModel, C11045c<? super LoyaltyDetailViewFragment$onViewCreated$2$3> cVar) {
        super(2, cVar);
        this.this$0 = loyaltyDetailViewFragment;
        this.$this_apply = loyaltyDetailViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LoyaltyDetailViewFragment$onViewCreated$2$3(this.this$0, this.$this_apply, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Lifecycle lifecycle = this.this$0.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            final LoyaltyDetailViewModel loyaltyDetailViewModel = this.$this_apply;
            C244651 r3 = new C244651((C11045c<? super C244651>) null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m90581a(lifecycle, state, r3, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LoyaltyDetailViewFragment$onViewCreated$2$3) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
