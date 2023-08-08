package kotlin.sequences;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.C12579k;

public final class SequencesKt___SequencesKt$minus$4 implements C11559m<T> {

    /* renamed from: a */
    public final /* synthetic */ C11559m<T> f28689a;

    /* renamed from: b */
    public final /* synthetic */ C11559m<T> f28690b;

    public SequencesKt___SequencesKt$minus$4(C11559m<? extends T> mVar, C11559m<? extends T> mVar2) {
        this.f28689a = mVar;
        this.f28690b = mVar2;
    }

    @C12579k
    public Iterator<T> iterator() {
        List<T> c3 = SequencesKt___SequencesKt.m44731c3(this.f28689a);
        if (c3.isEmpty()) {
            return this.f28690b.iterator();
        }
        return SequencesKt___SequencesKt.m44795u0(this.f28690b, new SequencesKt___SequencesKt$minus$4$iterator$1(c3)).iterator();
    }
}
