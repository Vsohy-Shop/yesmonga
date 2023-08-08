package com.carrefour.fid.android.presentation.viewmodels.feesback;

import com.carrefour.fid.android.domain.interactors.feedback.C37686a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.feesback.FeedbackViewModel$checkStoreFeedback$1", mo22502f = "FeedbackViewModel.kt", mo22503i = {}, mo22504l = {46}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FeedbackViewModel$checkStoreFeedback$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<Boolean, C11079d2> $success;
    int label;
    final /* synthetic */ FeedbackViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackViewModel$checkStoreFeedback$1(FeedbackViewModel feedbackViewModel, C11300l<? super Boolean, C11079d2> lVar, C11045c<? super FeedbackViewModel$checkStoreFeedback$1> cVar) {
        super(2, cVar);
        this.this$0 = feedbackViewModel;
        this.$success = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FeedbackViewModel$checkStoreFeedback$1(this.this$0, this.$success, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37686a g0 = this.this$0.f64363d;
            this.label = 1;
            obj2 = g0.m172968invokeIoAF18A(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FeedbackViewModel feedbackViewModel = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e != null) {
            feedbackViewModel.mo83420e0().mo57493o(e);
        }
        C11300l<Boolean, C11079d2> lVar = this.$success;
        if (Result.m38710j(obj2)) {
            lVar.invoke(C11064a.m42615a(((Boolean) obj2).booleanValue()));
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FeedbackViewModel$checkStoreFeedback$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
