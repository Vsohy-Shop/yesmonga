package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.history;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.base.LifecycleKt$collectWhileStartedIn$2", mo22502f = "Lifecycle.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0001\u001a\u00028\u0000H@¨\u0006\u0003"}, mo22516d2 = {"T", "it", "Lkotlin/d2;", "com/carrefour/fid/android/shared/base/LifecycleKt$collectWhileStartedIn$2", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt$collectWhileStartedIn$2\n*L\n1#1,137:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.history.LoyaltyAmountHistoryFragment$initListener$lambda$3$$inlined$collectWhileStartedIn$1 */
public final class C24498x8bc9e57b extends SuspendLambda implements C11304p<C11079d2, C11045c<? super C11079d2>, Object> {
    int label;

    public C24498x8bc9e57b(C11045c cVar) {
        super(2, cVar);
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new C24498x8bc9e57b(cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(C11079d2 d2Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((C24498x8bc9e57b) create(d2Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
