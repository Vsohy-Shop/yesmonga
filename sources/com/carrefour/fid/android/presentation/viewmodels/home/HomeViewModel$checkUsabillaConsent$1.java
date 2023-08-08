package com.carrefour.fid.android.presentation.viewmodels.home;

import com.carrefour.fid.android.domain.interactors.feedback.C37688c;
import com.carrefour.fid.android.shared.util.C28947q;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$checkUsabillaConsent$1", mo22502f = "HomeViewModel.kt", mo22503i = {}, mo22504l = {99}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class HomeViewModel$checkUsabillaConsent$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$checkUsabillaConsent$1(HomeViewModel homeViewModel, C11045c<? super HomeViewModel$checkUsabillaConsent$1> cVar) {
        super(2, cVar);
        this.this$0 = homeViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new HomeViewModel$checkUsabillaConsent$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Boolean bool;
        C28947q qVar;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C28947q n0 = this.this$0.f64505o;
            C37688c g0 = this.this$0.f64494d;
            this.L$0 = n0;
            this.label = 1;
            Object r1 = g0.m172965invokeIoAF18A(this);
            if (r1 == h) {
                return h;
            }
            qVar = n0;
            bool = r1;
        } else if (i == 1) {
            qVar = (C28947q) this.L$0;
            C11661u0.m45747n(obj);
            bool = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Boolean a = C11064a.m42615a(false);
        if (Result.m38709i(bool)) {
            bool = a;
        }
        qVar.mo57493o(bool);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((HomeViewModel$checkUsabillaConsent$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
