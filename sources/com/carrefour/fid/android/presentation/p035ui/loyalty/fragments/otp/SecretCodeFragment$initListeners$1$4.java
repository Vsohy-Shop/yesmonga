package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import com.carrefour.fid.android.databinding.C36782o3;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$initListeners$1$4", mo22502f = "SecretCodeFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$initListeners$1$4 */
public final class SecretCodeFragment$initListeners$1$4 extends SuspendLambda implements C11304p<CharSequence, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C36782o3 $this_with;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SecretCodeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecretCodeFragment$initListeners$1$4(C36782o3 o3Var, SecretCodeFragment secretCodeFragment, C11045c<? super SecretCodeFragment$initListeners$1$4> cVar) {
        super(2, cVar);
        this.$this_with = o3Var;
        this.this$0 = secretCodeFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SecretCodeFragment$initListeners$1$4 secretCodeFragment$initListeners$1$4 = new SecretCodeFragment$initListeners$1$4(this.$this_with, this.this$0, cVar);
        secretCodeFragment$initListeners$1$4.L$0 = obj;
        return secretCodeFragment$initListeners$1$4;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k CharSequence charSequence, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SecretCodeFragment$initListeners$1$4) create(charSequence, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.$this_with.f91429h.setVisibility(4);
            this.this$0.mo71820d1().sendIntent(new SecretCode.UserAction.CheckDigitNumber(((CharSequence) this.L$0).toString()));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
