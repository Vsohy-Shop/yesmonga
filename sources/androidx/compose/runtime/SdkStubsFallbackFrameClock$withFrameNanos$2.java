package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", mo22502f = "ActualAndroid.android.kt", mo22503i = {}, mo22504l = {52}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"R", "Lkotlinx/coroutines/o0;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super R>, Object> {
    final /* synthetic */ C11300l<Long, R> $onFrame;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(C11300l<? super Long, ? extends R> lVar, C11045c<? super SdkStubsFallbackFrameClock$withFrameNanos$2> cVar) {
        super(2, cVar);
        this.$onFrame = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.$onFrame, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            this.label = 1;
            if (DelayKt.m45925b(16, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return this.$onFrame.invoke(C11064a.m42621g(System.nanoTime()));
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super R> cVar) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
