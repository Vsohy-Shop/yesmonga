package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.C11665v0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11053g;
import kotlin.coroutines.intrinsics.C11063b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11053g
@C11665v0(version = "1.3")
/* renamed from: kotlin.sequences.o */
public abstract class C11561o<T> {
    @C12580l
    /* renamed from: b */
    public abstract Object mo23250b(T t, @C12579k C11045c<? super C11079d2> cVar);

    @C12580l
    /* renamed from: e */
    public final Object mo23259e(@C12579k Iterable<? extends T> iterable, @C12579k C11045c<? super C11079d2> cVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return C11079d2.f28267a;
        }
        Object f = mo23251f(iterable.iterator(), cVar);
        if (f == C11063b.m42612h()) {
            return f;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: f */
    public abstract Object mo23251f(@C12579k Iterator<? extends T> it, @C12579k C11045c<? super C11079d2> cVar);

    @C12580l
    /* renamed from: h */
    public final Object mo23260h(@C12579k C11559m<? extends T> mVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object f = mo23251f(mVar.iterator(), cVar);
        return f == C11063b.m42612h() ? f : C11079d2.f28267a;
    }
}
