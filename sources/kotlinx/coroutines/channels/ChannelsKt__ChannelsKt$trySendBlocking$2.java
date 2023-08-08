package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", mo22502f = "Channels.kt", mo22503i = {}, mo22504l = {39}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"E", "Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/channels/j;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt$trySendBlocking$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11749j<? extends C11079d2>>, Object> {
    final /* synthetic */ E $element;
    final /* synthetic */ C11763t<E> $this_trySendBlocking;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(C11763t<? super E> tVar, E e, C11045c<? super ChannelsKt__ChannelsKt$trySendBlocking$2> cVar) {
        super(2, cVar);
        this.$this_trySendBlocking = tVar;
        this.$element = e;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, cVar);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object obj3;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var = (C12074o0) this.L$0;
            C11763t<E> tVar = this.$this_trySendBlocking;
            E e = this.$element;
            Result.C10852a aVar = Result.f28060a;
            this.label = 1;
            if (tVar.mo23757h0(e, this) == h) {
                return h;
            }
        } else if (i == 1) {
            try {
                C11661u0.m45747n(obj);
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = Result.m38702b(C11079d2.f28267a);
        if (Result.m38710j(obj2)) {
            obj3 = C11749j.f29170b.mo23927c(C11079d2.f28267a);
        } else {
            obj3 = C11749j.f29170b.mo23925a(Result.m38705e(obj2));
        }
        return C11749j.m46631b(obj3);
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11749j<C11079d2>> cVar) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
