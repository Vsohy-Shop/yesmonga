package com.usabilla.sdk.ubform;

import com.usabilla.sdk.ubform.sdk.form.PassiveFormFragment;
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

@C11067d(mo22501c = "com.usabilla.sdk.ubform.UsabillaInternal$loadFeedbackForm$1$1$2$1", mo22502f = "UsabillaInternal.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$loadFeedbackForm$1$1$2$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C9826e $callback;
    final /* synthetic */ PassiveFormFragment $fragment;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaInternal$loadFeedbackForm$1$1$2$1(C9826e eVar, PassiveFormFragment passiveFormFragment, C11045c<? super UsabillaInternal$loadFeedbackForm$1$1$2$1> cVar) {
        super(2, cVar);
        this.$callback = eVar;
        this.$fragment = passiveFormFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new UsabillaInternal$loadFeedbackForm$1$1$2$1(this.$callback, this.$fragment, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C9826e eVar = this.$callback;
            if (eVar == null) {
                return null;
            }
            eVar.mo20164b(this.$fragment);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((UsabillaInternal$loadFeedbackForm$1$1$2$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
