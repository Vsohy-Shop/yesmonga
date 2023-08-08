package com.carrefour.fid.android.account.presentation.p018ui.signin;

import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.C28768m0;
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

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.ui.signin.SignInFragment$initOnClicks$1$3", mo22502f = "SignInFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/extension/m0;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.signin.SignInFragment$initOnClicks$1$3 */
public final class SignInFragment$initOnClicks$1$3 extends SuspendLambda implements C11304p<C28768m0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ SignInFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignInFragment$initOnClicks$1$3(SignInFragment signInFragment, C11045c<? super SignInFragment$initOnClicks$1$3> cVar) {
        super(2, cVar);
        this.this$0 = signInFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SignInFragment$initOnClicks$1$3(this.this$0, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C28768m0 m0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SignInFragment$initOnClicks$1$3) create(m0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C19232h activity = this.this$0.getActivity();
            if (activity != null) {
                ActivityKt.m118699i(activity);
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
