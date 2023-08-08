package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.history;

import com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory;
import com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24228e;
import com.carrefour.fid.android.shared.util.C28932h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.history.LoyaltyAmountHistoryFragment$initListener$1$1", mo22502f = "LoyaltyAmountHistoryFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.history.LoyaltyAmountHistoryFragment$initListener$1$1 */
public final class LoyaltyAmountHistoryFragment$initListener$1$1 extends SuspendLambda implements C11304p<C11079d2, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ LoyaltyAmountHistoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyAmountHistoryFragment$initListener$1$1(LoyaltyAmountHistoryFragment loyaltyAmountHistoryFragment, C11045c<? super LoyaltyAmountHistoryFragment$initListener$1$1> cVar) {
        super(2, cVar);
        this.this$0 = loyaltyAmountHistoryFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LoyaltyAmountHistoryFragment$initListener$1$1(this.this$0, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11079d2 d2Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LoyaltyAmountHistoryFragment$initListener$1$1) create(d2Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C24228e V0 = this.this$0.f61029w;
            if (V0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mExpandableListAdapter");
                V0 = null;
            }
            String T0 = this.this$0.f61030x;
            if (T0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerDateTitle");
                T0 = null;
            }
            V0.mo70900f(T0, this.this$0.f61031y, C28932h.C28933a.m119658x(C28932h.f70914a, 0, 1, (Object) null));
            this.this$0.mo71649i1(1);
            LoyaltyAmountHistoryFragment.m107349S0(this.this$0).f91124h.setVisibility(8);
            this.this$0.mo71653l1().sendIntent(new LoyaltyAmountHistory.UserAction.GetCardOperation((String) null, 1, (DefaultConstructorMarker) null));
            LoyaltyAmountHistoryFragment.m107349S0(this.this$0).f91127k.setRefreshing(false);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
