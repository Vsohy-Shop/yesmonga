package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", mo22502f = "Errors.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, mo22516d2 = {"T", "", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowKt__ErrorsKt$retry$1 extends SuspendLambda implements C11304p<Throwable, C11045c<? super Boolean>, Object> {
    int label;

    public FlowKt__ErrorsKt$retry$1(C11045c<? super FlowKt__ErrorsKt$retry$1> cVar) {
        super(2, cVar);
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FlowKt__ErrorsKt$retry$1(cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k Throwable th, @C12580l C11045c<? super Boolean> cVar) {
        return ((FlowKt__ErrorsKt$retry$1) create(th, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return C11064a.m42615a(true);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
