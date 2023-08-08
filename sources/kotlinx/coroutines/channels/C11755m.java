package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C12092r2;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.channels.m */
public final class C11755m {
    @C12579k

    /* renamed from: a */
    public static final String f29176a = "Channel was closed";

    @C12579k
    @C11532s0
    /* renamed from: J */
    public static final <E, R> ReceiveChannel<R> m46671J(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super E, ? super C11045c<? super R>, ? extends Object> pVar) {
        return ChannelsKt__DeprecatedKt.m46442E(receiveChannel, coroutineContext, pVar);
    }

    @C12579k
    @C11532s0
    /* renamed from: L */
    public static final <E, R> ReceiveChannel<R> m46673L(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k CoroutineContext coroutineContext, @C12579k C11305q<? super Integer, ? super E, ? super C11045c<? super R>, ? extends Object> qVar) {
        return ChannelsKt__DeprecatedKt.m46444G(receiveChannel, coroutineContext, qVar);
    }

    @C11532s0
    /* renamed from: b */
    public static final void m46690b(@C12579k ReceiveChannel<?> receiveChannel, @C12580l Throwable th) {
        ChannelsKt__Channels_commonKt.m46428a(receiveChannel, th);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @C12092r2
    /* renamed from: c */
    public static final <E, R> R m46692c(@C12579k C11740d<E> dVar, @C12579k C11300l<? super ReceiveChannel<? extends E>, ? extends R> lVar) {
        return ChannelsKt__Channels_commonKt.m46429b(dVar, lVar);
    }

    /* renamed from: d */
    public static final <E, R> R m46694d(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k C11300l<? super ReceiveChannel<? extends E>, ? extends R> lVar) {
        return ChannelsKt__Channels_commonKt.m46430c(receiveChannel, lVar);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @C12580l
    /* renamed from: e */
    public static final <E> Object m46696e(@C12579k C11740d<E> dVar, @C12579k C11300l<? super E, C11079d2> lVar, @C12579k C11045c<? super C11079d2> cVar) {
        return ChannelsKt__Channels_commonKt.m46431d(dVar, lVar, cVar);
    }

    @C12580l
    @C11532s0
    /* renamed from: e0 */
    public static final <E, C extends C11763t<? super E>> Object m46697e0(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k C c, @C12579k C11045c<? super C> cVar) {
        return ChannelsKt__DeprecatedKt.m46460W(receiveChannel, c, cVar);
    }

    @C12580l
    /* renamed from: f */
    public static final <E> Object m46698f(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k C11300l<? super E, C11079d2> lVar, @C12579k C11045c<? super C11079d2> cVar) {
        return ChannelsKt__Channels_commonKt.m46432e(receiveChannel, lVar, cVar);
    }

    @C12580l
    @C11532s0
    /* renamed from: f0 */
    public static final <E, C extends Collection<? super E>> Object m46699f0(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k C c, @C12579k C11045c<? super C> cVar) {
        return ChannelsKt__DeprecatedKt.m46461X(receiveChannel, c, cVar);
    }

    @C12579k
    @C11532s0
    /* renamed from: g */
    public static final C11300l<Throwable, C11079d2> m46700g(@C12579k ReceiveChannel<?> receiveChannel) {
        return ChannelsKt__DeprecatedKt.m46466b(receiveChannel);
    }

    @C12580l
    /* renamed from: g0 */
    public static final <E> Object m46701g0(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k C11045c<? super List<? extends E>> cVar) {
        return ChannelsKt__Channels_commonKt.m46437j(receiveChannel, cVar);
    }

    @C12579k
    @C11532s0
    /* renamed from: h */
    public static final C11300l<Throwable, C11079d2> m46702h(@C12579k ReceiveChannel<?>... receiveChannelArr) {
        return ChannelsKt__DeprecatedKt.m46468c(receiveChannelArr);
    }

    @C12580l
    @C11532s0
    /* renamed from: h0 */
    public static final <K, V, M extends Map<? super K, ? super V>> Object m46703h0(@C12579k ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, @C12579k M m, @C12579k C11045c<? super M> cVar) {
        return ChannelsKt__DeprecatedKt.m46462Y(receiveChannel, m, cVar);
    }

    @C12579k
    @C11532s0
    /* renamed from: k */
    public static final <E, K> ReceiveChannel<E> m46708k(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super E, ? super C11045c<? super K>, ? extends Object> pVar) {
        return ChannelsKt__DeprecatedKt.m46474f(receiveChannel, coroutineContext, pVar);
    }

    @C12580l
    @C11532s0
    /* renamed from: k0 */
    public static final <E> Object m46709k0(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k C11045c<? super Set<E>> cVar) {
        return ChannelsKt__DeprecatedKt.m46467b0(receiveChannel, cVar);
    }

    @C12579k
    /* renamed from: m0 */
    public static final <E> Object m46713m0(@C12579k C11763t<? super E> tVar, E e) {
        return ChannelsKt__ChannelsKt.m46427b(tVar, e);
    }

    @C12579k
    @C11532s0
    /* renamed from: q0 */
    public static final <E, R, V> ReceiveChannel<V> m46721q0(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k ReceiveChannel<? extends R> receiveChannel2, @C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super E, ? super R, ? extends V> pVar) {
        return ChannelsKt__DeprecatedKt.m46477g0(receiveChannel, receiveChannel2, coroutineContext, pVar);
    }

    @C12579k
    @C11532s0
    /* renamed from: s */
    public static final <E> ReceiveChannel<E> m46724s(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super E, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return ChannelsKt__DeprecatedKt.m46485n(receiveChannel, coroutineContext, pVar);
    }

    @C12579k
    @C11532s0
    /* renamed from: y */
    public static final <E> ReceiveChannel<E> m46730y(@C12579k ReceiveChannel<? extends E> receiveChannel) {
        return ChannelsKt__DeprecatedKt.m46491t(receiveChannel);
    }
}
