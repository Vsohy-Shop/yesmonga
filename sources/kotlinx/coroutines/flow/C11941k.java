package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C11932i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.flow.k */
public final class C11941k<T> implements C11944n<T>, C11903a<T>, C11932i<T> {
    @C12580l

    /* renamed from: a */
    public final C11723c2 f29522a;

    /* renamed from: b */
    public final /* synthetic */ C11944n<T> f29523b;

    public C11941k(@C12579k C11944n<? extends T> nVar, @C12580l C11723c2 c2Var) {
        this.f29522a = c2Var;
        this.f29523b = nVar;
    }

    @C12579k
    /* renamed from: c */
    public C11907e<T> mo24201c(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        return C11945o.m47613e(this, coroutineContext, i, bufferOverflow);
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<?> cVar) {
        return this.f29523b.collect(fVar, cVar);
    }

    @C12579k
    /* renamed from: d */
    public List<T> mo24203d() {
        return this.f29523b.mo24203d();
    }
}
