package com.carrefour.fid.android.presentation.viewmodels.coupons.filter;

import com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.C26249b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.coupons.filter.CouponsFilterViewModel$processIntent$2", mo22502f = "CouponsFilterViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CouponsFilterViewModel$processIntent$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C26249b.C26253c $intent;
    int label;
    final /* synthetic */ CouponsFilterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsFilterViewModel$processIntent$2(C26249b.C26253c cVar, CouponsFilterViewModel couponsFilterViewModel, C11045c<? super CouponsFilterViewModel$processIntent$2> cVar2) {
        super(2, cVar2);
        this.$intent = cVar;
        this.this$0 = couponsFilterViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CouponsFilterViewModel$processIntent$2(this.$intent, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C26249b.C26253c cVar = this.$intent;
            if (cVar instanceof C26249b.C26253c.C26255b) {
                this.this$0.mo76292j0(((C26249b.C26253c.C26255b) cVar).mo76361g(), ((C26249b.C26253c.C26255b) this.$intent).mo76360f(), ((C26249b.C26253c.C26255b) this.$intent).mo76362h());
            } else if (cVar instanceof C26249b.C26253c.C26257d) {
                this.this$0.mo76295m0(((C26249b.C26253c.C26257d) cVar).mo76370f(), ((C26249b.C26253c.C26257d) this.$intent).mo76368e());
            } else if (Intrinsics.areEqual((Object) cVar, (Object) C26249b.C26253c.C26256c.f64201b)) {
                this.this$0.mo76294l0();
            } else if (Intrinsics.areEqual((Object) cVar, (Object) C26249b.C26253c.C26254a.f64195b)) {
                this.this$0.mo76290h0();
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CouponsFilterViewModel$processIntent$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
