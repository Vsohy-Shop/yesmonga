package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel$processIntent$2", mo22502f = "CheckoutStep1MVIViewModel.kt", mo22503i = {}, mo22504l = {245, 249}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel$processIntent$2 */
public final class CheckoutStep1MVIViewModel$processIntent$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CheckoutStep1MVIViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1MVIViewModel$processIntent$2(CheckoutStep1MVIViewModel checkoutStep1MVIViewModel, C11045c<? super CheckoutStep1MVIViewModel$processIntent$2> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStep1MVIViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStep1MVIViewModel$processIntent$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Boolean bool;
        CheckoutStep1MVIViewModel checkoutStep1MVIViewModel;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            checkoutStep1MVIViewModel = this.this$0;
            C37807b t0 = checkoutStep1MVIViewModel.f63555y;
            C37807b.C37808a aVar = new C37807b.C37808a(RemoteConfigTag.AntiInflation);
            this.L$0 = checkoutStep1MVIViewModel;
            this.label = 1;
            bool = t0.m172966invokegIAlus(aVar, this);
            if (bool == h) {
                return h;
            }
        } else if (i == 1) {
            checkoutStep1MVIViewModel = (CheckoutStep1MVIViewModel) this.L$0;
            C11661u0.m45747n(obj);
            bool = ((Result) obj).mo21858l();
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Boolean a = C11064a.m42615a(false);
        if (Result.m38709i(bool)) {
            bool = a;
        }
        checkoutStep1MVIViewModel.f63527H = ((Boolean) bool).booleanValue();
        CheckoutStep1MVIViewModel checkoutStep1MVIViewModel2 = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (checkoutStep1MVIViewModel2.mo75437b1(this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStep1MVIViewModel$processIntent$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
