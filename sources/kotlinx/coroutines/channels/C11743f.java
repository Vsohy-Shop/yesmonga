package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11701a;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12051l0;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.C11763t;
import kotlinx.coroutines.selects.C12128g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,202:1\n706#2,2:203\n706#2,2:205\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n*L\n152#1:203,2\n157#1:205,2\n*E\n"})
/* renamed from: kotlinx.coroutines.channels.f */
public class C11743f<E> extends C11701a<C11079d2> implements C11760r<E>, C11740d<E> {
    @C12579k

    /* renamed from: d */
    public final C11740d<E> f29153d;

    public C11743f(@C12579k CoroutineContext coroutineContext, @C12579k C11740d<E> dVar, boolean z) {
        super(coroutineContext, false, z);
        this.f29153d = dVar;
        mo23625c1((C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0));
    }

    @C12579k
    /* renamed from: A */
    public ReceiveChannel<E> mo23749A() {
        return this.f29153d.mo23749A();
    }

    /* renamed from: B0 */
    public void mo23585B0(@C12579k Throwable th) {
        CancellationException G1 = JobSupport.m45937G1(this, th, (String) null, 1, (Object) null);
        this.f29153d.mo23910a(G1);
        mo23666z0(G1);
    }

    /* renamed from: H */
    public void mo23779H(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
        this.f29153d.mo23779H(lVar);
    }

    @C12579k
    /* renamed from: L */
    public Object mo23751L(E e) {
        return this.f29153d.mo23751L(e);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @C11587t0(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: M */
    public boolean mo23791M(E e) {
        return this.f29153d.mo23791M(e);
    }

    /* renamed from: P1 */
    public void mo23693P1(@C12579k Throwable th, boolean z) {
        if (!this.f29153d.mo23756d0(th) && !z) {
            C12051l0.m48104b(getContext(), th);
        }
    }

    @C12579k
    /* renamed from: S1 */
    public final C11740d<E> mo23912S1() {
        return this.f29153d;
    }

    /* renamed from: T1 */
    public void mo23694Q1(@C12579k C11079d2 d2Var) {
        C11763t.C11764a.m46772a(this.f29153d, (Throwable) null, 1, (Object) null);
    }

    /* renamed from: a */
    public final void mo23621a(@C12580l CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo23592E0(), (Throwable) null, this);
        }
        mo23585B0(cancellationException);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: c */
    public final /* synthetic */ boolean mo23624c(Throwable th) {
        if (th == null) {
            th = new JobCancellationException(mo23592E0(), (Throwable) null, this);
        }
        mo23585B0(th);
        return true;
    }

    /* renamed from: d */
    public boolean mo23627d() {
        return super.mo23627d();
    }

    /* renamed from: d0 */
    public boolean mo23756d0(@C12580l Throwable th) {
        boolean d0 = this.f29153d.mo23756d0(th);
        start();
        return d0;
    }

    @C12579k
    /* renamed from: g */
    public C11763t<E> mo23914g() {
        return this;
    }

    @C12579k
    /* renamed from: h */
    public C12128g<E, C11763t<E>> mo23833h() {
        return this.f29153d.mo23833h();
    }

    @C12580l
    /* renamed from: h0 */
    public Object mo23757h0(E e, @C12579k C11045c<? super C11079d2> cVar) {
        return this.f29153d.mo23757h0(e, cVar);
    }

    /* renamed from: i0 */
    public boolean mo23758i0() {
        return this.f29153d.mo23758i0();
    }
}
