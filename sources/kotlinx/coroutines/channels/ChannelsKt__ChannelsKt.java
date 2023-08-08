package kotlinx.coroutines.channels;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11970i;
import kotlinx.coroutines.channels.C11749j;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n514#2,6:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,6\n*E\n"})
public final /* synthetic */ class ChannelsKt__ChannelsKt {
    @C11395k(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @C11587t0(expression = "trySendBlocking(element)", imports = {}))
    /* renamed from: a */
    public static final /* synthetic */ void m46426a(C11763t tVar, Object obj) {
        if (!C11749j.m46642m(tVar.mo23751L(obj))) {
            Object unused = C11970i.m47708b((CoroutineContext) null, new ChannelsKt__ChannelsKt$sendBlocking$1(tVar, obj, (C11045c<? super ChannelsKt__ChannelsKt$sendBlocking$1>) null), 1, (Object) null);
        }
    }

    @C12579k
    /* renamed from: b */
    public static final <E> Object m46427b(@C12579k C11763t<? super E> tVar, E e) {
        Object L = tVar.mo23751L(e);
        if (L instanceof C11749j.C11752c) {
            return ((C11749j) C11970i.m47708b((CoroutineContext) null, new ChannelsKt__ChannelsKt$trySendBlocking$2(tVar, e, (C11045c<? super ChannelsKt__ChannelsKt$trySendBlocking$2>) null), 1, (Object) null)).mo23920o();
        }
        C11079d2 d2Var = (C11079d2) L;
        return C11749j.f29170b.mo23927c(C11079d2.f28267a);
    }
}
