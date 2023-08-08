package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.internal.C11112h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11701a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.C12126e;
import kotlinx.coroutines.selects.C12128g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,41:1\n706#2,2:42\n706#2,2:44\n706#2,2:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n21#1:42,2\n26#1:44,2\n32#1:46,2\n*E\n"})
/* renamed from: kotlinx.coroutines.channels.h */
public class C11747h<E> extends C11701a<C11079d2> implements C11744g<E> {
    @C12579k

    /* renamed from: d */
    public final C11744g<E> f29169d;

    public C11747h(@C12579k CoroutineContext coroutineContext, @C12579k C11744g<E> gVar, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.f29169d = gVar;
    }

    /* renamed from: B0 */
    public void mo23585B0(@C12579k Throwable th) {
        CancellationException G1 = JobSupport.m45937G1(this, th, (String) null, 1, (Object) null);
        this.f29169d.mo23819a(G1);
        mo23666z0(G1);
    }

    /* renamed from: H */
    public void mo23779H(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
        this.f29169d.mo23779H(lVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @C11587t0(expression = "tryReceive().getOrNull()", imports = {}))
    @C12580l
    /* renamed from: I */
    public E mo23782I() {
        return this.f29169d.mo23782I();
    }

    @C12579k
    /* renamed from: L */
    public Object mo23751L(E e) {
        return this.f29169d.mo23751L(e);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @C11587t0(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: M */
    public boolean mo23791M(E e) {
        return this.f29169d.mo23791M(e);
    }

    @C12579k
    /* renamed from: S1 */
    public final C11744g<E> mo23916S1() {
        return this.f29169d;
    }

    @C12579k
    /* renamed from: T */
    public C12126e<E> mo23805T() {
        return this.f29169d.mo23805T();
    }

    @C12579k
    /* renamed from: U */
    public C12126e<C11749j<E>> mo23807U() {
        return this.f29169d.mo23807U();
    }

    @C12579k
    /* renamed from: V */
    public C12126e<E> mo23809V() {
        return this.f29169d.mo23809V();
    }

    @C12579k
    /* renamed from: W */
    public Object mo23811W() {
        return this.f29169d.mo23811W();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @C11587t0(expression = "receiveCatching().getOrNull()", imports = {}))
    @C12580l
    @C11112h
    /* renamed from: X */
    public Object mo23813X(@C12579k C11045c<? super E> cVar) {
        return this.f29169d.mo23813X(cVar);
    }

    @C12580l
    /* renamed from: Y */
    public Object mo23815Y(@C12579k C11045c<? super C11749j<? extends E>> cVar) {
        Object Y = this.f29169d.mo23815Y(cVar);
        C11063b.m42612h();
        return Y;
    }

    /* renamed from: a */
    public final void mo23621a(@C12580l CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(mo23592E0(), (Throwable) null, this);
            }
            mo23585B0(cancellationException);
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: c */
    public final /* synthetic */ boolean mo23624c(Throwable th) {
        mo23585B0(new JobCancellationException(mo23592E0(), (Throwable) null, this));
        return true;
    }

    @C12580l
    /* renamed from: c0 */
    public Object mo23824c0(@C12579k C11045c<? super E> cVar) {
        return this.f29169d.mo23824c0(cVar);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo23585B0(new JobCancellationException(mo23592E0(), (Throwable) null, this));
    }

    /* renamed from: d0 */
    public boolean mo23756d0(@C12580l Throwable th) {
        return this.f29169d.mo23756d0(th);
    }

    /* renamed from: e */
    public boolean mo23827e() {
        return this.f29169d.mo23827e();
    }

    @C12579k
    /* renamed from: g */
    public final C11744g<E> mo23917g() {
        return this;
    }

    @C12579k
    /* renamed from: h */
    public C12128g<E, C11763t<E>> mo23833h() {
        return this.f29169d.mo23833h();
    }

    @C12580l
    /* renamed from: h0 */
    public Object mo23757h0(E e, @C12579k C11045c<? super C11079d2> cVar) {
        return this.f29169d.mo23757h0(e, cVar);
    }

    /* renamed from: i0 */
    public boolean mo23758i0() {
        return this.f29169d.mo23758i0();
    }

    public boolean isEmpty() {
        return this.f29169d.isEmpty();
    }

    @C12579k
    public ChannelIterator<E> iterator() {
        return this.f29169d.iterator();
    }
}
