package kotlin.sequences;

import java.util.Iterator;
import org.jetbrains.annotations.C12579k;

public final class SequencesKt___SequencesKt$minus$2 implements C11559m<T> {

    /* renamed from: a */
    public final /* synthetic */ C11559m<T> f28685a;

    /* renamed from: b */
    public final /* synthetic */ T[] f28686b;

    public SequencesKt___SequencesKt$minus$2(C11559m<? extends T> mVar, T[] tArr) {
        this.f28685a = mVar;
        this.f28686b = tArr;
    }

    @C12579k
    public Iterator<T> iterator() {
        return SequencesKt___SequencesKt.m44795u0(this.f28685a, new SequencesKt___SequencesKt$minus$2$iterator$1(this.f28686b)).iterator();
    }
}
