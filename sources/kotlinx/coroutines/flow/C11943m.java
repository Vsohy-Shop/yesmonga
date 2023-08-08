package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.flow.m */
public final class C11943m<T> extends AbstractFlow<T> {
    @C12579k

    /* renamed from: a */
    public final C11304p<C11908f<? super T>, C11045c<? super C11079d2>, Object> f29526a;

    public C11943m(@C12579k C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        this.f29526a = pVar;
    }

    @C12580l
    /* renamed from: g */
    public Object mo24081g(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object invoke = this.f29526a.invoke(fVar, cVar);
        return invoke == C11063b.m42612h() ? invoke : C11079d2.f28267a;
    }
}
