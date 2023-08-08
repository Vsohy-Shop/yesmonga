package kotlinx.coroutines.channels;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.selects.C12131j;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", mo22502f = "BroadcastChannel.kt", mo22503i = {}, mo22504l = {291}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"E", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n15#2:415\n1#3:416\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n*L\n304#1:415\n*E\n"})
public final class BroadcastChannelImpl$registerSelectForSend$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Object $element;
    final /* synthetic */ C12131j<?> $select;
    int label;
    final /* synthetic */ BroadcastChannelImpl<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$registerSelectForSend$2(BroadcastChannelImpl<E> broadcastChannelImpl, Object obj, C12131j<?> jVar, C11045c<? super BroadcastChannelImpl$registerSelectForSend$2> cVar) {
        super(2, cVar);
        this.this$0 = broadcastChannelImpl;
        this.$element = obj;
        this.$select = jVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new BroadcastChannelImpl$registerSelectForSend$2(this.this$0, this.$element, this.$select, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C11661u0.m45747n(obj);
            BroadcastChannelImpl<E> broadcastChannelImpl = this.this$0;
            Object obj3 = this.$element;
            this.label = 1;
            if (broadcastChannelImpl.mo23757h0(obj3, this) == h) {
                return h;
            }
        } else if (i == 1) {
            try {
                C11661u0.m45747n(obj);
            } catch (Throwable th) {
                if (!this.this$0.mo23758i0() || (!(th instanceof ClosedSendChannelException) && this.this$0.mo23845q0() != th)) {
                    throw th;
                }
                z = false;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ReentrantLock K1 = this.this$0.f29072Y;
        BroadcastChannelImpl<E> broadcastChannelImpl2 = this.this$0;
        C12131j<?> jVar = this.$select;
        K1.lock();
        try {
            HashMap L1 = broadcastChannelImpl2.f29070F0;
            if (z) {
                obj2 = C11079d2.f28267a;
            } else {
                obj2 = BufferedChannelKt.m46421z();
            }
            L1.put(jVar, obj2);
            Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            SelectImplementation selectImplementation = (SelectImplementation) jVar;
            C11079d2 d2Var = C11079d2.f28267a;
            if (((SelectImplementation) jVar).mo24700I(broadcastChannelImpl2, d2Var) != TrySelectDetailedResult.REREGISTER) {
                broadcastChannelImpl2.f29070F0.remove(jVar);
            }
            return d2Var;
        } finally {
            K1.unlock();
        }
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BroadcastChannelImpl$registerSelectForSend$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
