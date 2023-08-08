package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C11932i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.flow.l */
public final class C11942l<T> implements C11952u<T>, C11903a<T>, C11932i<T> {
    @C12580l

    /* renamed from: a */
    public final C11723c2 f29524a;

    /* renamed from: b */
    public final /* synthetic */ C11952u<T> f29525b;

    public C11942l(@C12579k C11952u<? extends T> uVar, @C12580l C11723c2 c2Var) {
        this.f29524a = c2Var;
        this.f29525b = uVar;
    }

    @C12579k
    /* renamed from: c */
    public C11907e<T> mo24201c(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        return C11953v.m47631d(this, coroutineContext, i, bufferOverflow);
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<?> cVar) {
        return this.f29525b.collect(fVar, cVar);
    }

    @C12579k
    /* renamed from: d */
    public List<T> mo24203d() {
        return this.f29525b.mo24203d();
    }

    public T getValue() {
        return this.f29525b.getValue();
    }
}
