package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.AcceptLoyaltyCguFragment$initListener$2", mo22502f = "AcceptLoyaltyCguFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.AcceptLoyaltyCguFragment$initListener$2 */
public final class AcceptLoyaltyCguFragment$initListener$2 extends SuspendLambda implements C11304p<C11079d2, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ AcceptLoyaltyCguFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AcceptLoyaltyCguFragment$initListener$2(AcceptLoyaltyCguFragment acceptLoyaltyCguFragment, C11045c<? super AcceptLoyaltyCguFragment$initListener$2> cVar) {
        super(2, cVar);
        this.this$0 = acceptLoyaltyCguFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AcceptLoyaltyCguFragment$initListener$2(this.this$0, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11079d2 d2Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AcceptLoyaltyCguFragment$initListener$2) create(d2Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.this$0.mo71149X0().sendTagClickAcceptLoyaltyCGU();
            AcceptLoyaltyCguFragment acceptLoyaltyCguFragment = this.this$0;
            FragmentKt.m118823k(acceptLoyaltyCguFragment, C24370b.f60818a.mo71267a(this.this$0.mo71148W0().mo71251i(), acceptLoyaltyCguFragment.mo71148W0().mo71249h(), this.this$0.mo71148W0().mo71248g()));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
