package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10994x;
import org.jetbrains.annotations.C12579k;

public final class SequencesKt___SequencesKt$minus$3 implements C11559m<T> {

    /* renamed from: a */
    public final /* synthetic */ Iterable<T> f28687a;

    /* renamed from: b */
    public final /* synthetic */ C11559m<T> f28688b;

    public SequencesKt___SequencesKt$minus$3(Iterable<? extends T> iterable, C11559m<? extends T> mVar) {
        this.f28687a = iterable;
        this.f28688b = mVar;
    }

    @C12579k
    public Iterator<T> iterator() {
        Collection<T> q0 = C10994x.m42363q0(this.f28687a);
        if (q0.isEmpty()) {
            return this.f28688b.iterator();
        }
        return SequencesKt___SequencesKt.m44795u0(this.f28688b, new SequencesKt___SequencesKt$minus$3$iterator$1(q0)).iterator();
    }
}
