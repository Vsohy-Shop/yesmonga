package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.sequences.a */
public final class C11540a<T> implements C11559m<T> {
    @C12579k

    /* renamed from: a */
    public final AtomicReference<C11559m<T>> f28693a;

    public C11540a(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        this.f28693a = new AtomicReference<>(mVar);
    }

    @C12579k
    public Iterator<T> iterator() {
        C11559m andSet = this.f28693a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
