package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ValidateOtpFragment$initListeners$1$2", mo22502f = "ValidateOtpFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/extension/m0;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ValidateOtpFragment$initListeners$1$2 */
public final class ValidateOtpFragment$initListeners$1$2 extends SuspendLambda implements C11304p<C28768m0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ ValidateOtpFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateOtpFragment$initListeners$1$2(ValidateOtpFragment validateOtpFragment, C11045c<? super ValidateOtpFragment$initListeners$1$2> cVar) {
        super(2, cVar);
        this.this$0 = validateOtpFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ValidateOtpFragment$initListeners$1$2(this.this$0, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C28768m0 m0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ValidateOtpFragment$initListeners$1$2) create(m0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.this$0.mo71872Z0().sendIntent(new ValidateOtp.UserAction.ValidationOtpCode(String.valueOf(ValidateOtpFragment.m107532R0(this.this$0).f92012c.getText()), this.this$0.mo71869W0().mo72005f()));
            C19232h activity = this.this$0.getActivity();
            if (activity != null) {
                ActivityKt.m118699i(activity);
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
