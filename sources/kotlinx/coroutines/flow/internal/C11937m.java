package kotlinx.coroutines.flow.internal;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.channels.C11763t;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12177y1
/* renamed from: kotlinx.coroutines.flow.internal.m */
public final class C11937m<T> implements C11908f<T> {
    @C12579k

    /* renamed from: a */
    public final C11763t<T> f29519a;

    public C11937m(@C12579k C11763t<? super T> tVar) {
        this.f29519a = tVar;
    }

    @C12580l
    public Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
        Object h0 = this.f29519a.mo23757h0(t, cVar);
        return h0 == C11063b.m42612h() ? h0 : C11079d2.f28267a;
    }
}
