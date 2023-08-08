package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11287e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.flow.x */
public final class C11955x implements C11908f<Object> {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final Throwable f29541a;

    public C11955x(@C12579k Throwable th) {
        this.f29541a = th;
    }

    @C12580l
    public Object emit(@C12580l Object obj, @C12579k C11045c<? super C11079d2> cVar) {
        throw this.f29541a;
    }
}
