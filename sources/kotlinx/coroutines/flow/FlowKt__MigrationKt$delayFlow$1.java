package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", mo22502f = "Migration.kt", mo22503i = {}, mo22504l = {415}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/flow/f;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowKt__MigrationKt$delayFlow$1 extends SuspendLambda implements C11304p<C11908f<? super T>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ long $timeMillis;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$delayFlow$1(long j, C11045c<? super FlowKt__MigrationKt$delayFlow$1> cVar) {
        super(2, cVar);
        this.$timeMillis = j;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FlowKt__MigrationKt$delayFlow$1(this.$timeMillis, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super T> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FlowKt__MigrationKt$delayFlow$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            long j = this.$timeMillis;
            this.label = 1;
            if (DelayKt.m45925b(j, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
