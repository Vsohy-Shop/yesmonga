package kotlinx.coroutines.channels;

import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C12051l0;
import kotlinx.coroutines.channels.C11763t;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.channels.q */
public final class C11759q<E> extends C11747h<E> implements C11760r<E> {
    public C11759q(@C12579k CoroutineContext coroutineContext, @C12579k C11744g<E> gVar) {
        super(coroutineContext, gVar, true, true);
    }

    /* renamed from: P1 */
    public void mo23693P1(@C12579k Throwable th, boolean z) {
        if (!mo23916S1().mo23756d0(th) && !z) {
            C12051l0.m48104b(getContext(), th);
        }
    }

    /* renamed from: T1 */
    public void mo23694Q1(@C12579k C11079d2 d2Var) {
        C11763t.C11764a.m46772a(mo23916S1(), (Throwable) null, 1, (Object) null);
    }

    /* renamed from: d */
    public boolean mo23627d() {
        return super.mo23627d();
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ C11763t mo23917g() {
        return mo23917g();
    }
}
