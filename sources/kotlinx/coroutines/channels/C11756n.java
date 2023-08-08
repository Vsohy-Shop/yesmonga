package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.C12092r2;
import kotlinx.coroutines.selects.C12128g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(level = DeprecationLevel.WARNING, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@C12092r2
/* renamed from: kotlinx.coroutines.channels.n */
public final class C11756n<E> implements C11740d<E> {
    @C12579k

    /* renamed from: a */
    public final BroadcastChannelImpl<E> f29177a;

    public C11756n(BroadcastChannelImpl<E> broadcastChannelImpl) {
        this.f29177a = broadcastChannelImpl;
    }

    @C12579k
    /* renamed from: A */
    public ReceiveChannel<E> mo23749A() {
        return this.f29177a.mo23749A();
    }

    /* renamed from: H */
    public void mo23779H(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
        this.f29177a.mo23779H(lVar);
    }

    @C12579k
    /* renamed from: L */
    public Object mo23751L(E e) {
        return this.f29177a.mo23751L(e);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @C11587t0(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: M */
    public boolean mo23791M(E e) {
        return this.f29177a.mo23791M(e);
    }

    /* renamed from: a */
    public void mo23910a(@C12580l CancellationException cancellationException) {
        this.f29177a.mo23819a(cancellationException);
    }

    /* renamed from: b */
    public final E mo23941b() {
        return this.f29177a.mo23753O1();
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    /* renamed from: c */
    public /* synthetic */ boolean mo23911c(Throwable th) {
        return this.f29177a.mo23823c(th);
    }

    @C12580l
    /* renamed from: d */
    public final E mo23942d() {
        return this.f29177a.mo23754Q1();
    }

    /* renamed from: d0 */
    public boolean mo23756d0(@C12580l Throwable th) {
        return this.f29177a.mo23756d0(th);
    }

    @C12579k
    /* renamed from: h */
    public C12128g<E, C11763t<E>> mo23833h() {
        return this.f29177a.mo23833h();
    }

    @C12580l
    /* renamed from: h0 */
    public Object mo23757h0(E e, @C12579k C11045c<? super C11079d2> cVar) {
        return this.f29177a.mo23757h0(e, cVar);
    }

    /* renamed from: i0 */
    public boolean mo23758i0() {
        return this.f29177a.mo23758i0();
    }

    public C11756n() {
        this(new BroadcastChannelImpl(-1));
    }

    public C11756n(E e) {
        this();
        mo23751L(e);
    }
}
