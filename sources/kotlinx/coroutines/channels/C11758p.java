package kotlinx.coroutines.channels;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.intrinsics.C12036a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.channels.p */
public final class C11758p<E> extends C11743f<E> {
    @C12579k

    /* renamed from: e */
    public final C11045c<C11079d2> f29180e;

    public C11758p(@C12579k CoroutineContext coroutineContext, @C12579k C11740d<E> dVar, @C12579k C11304p<? super C11760r<? super E>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        super(coroutineContext, dVar, false);
        this.f29180e = IntrinsicsKt__IntrinsicsJvmKt.m42607c(pVar, this, this);
    }

    @C12579k
    /* renamed from: A */
    public ReceiveChannel<E> mo23749A() {
        ReceiveChannel<E> A = mo23912S1().mo23749A();
        start();
        return A;
    }

    /* renamed from: x1 */
    public void mo23662x1() {
        C12036a.m48045c(this.f29180e, this);
    }
}
