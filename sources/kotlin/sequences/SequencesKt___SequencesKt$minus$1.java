package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

public final class SequencesKt___SequencesKt$minus$1 implements C11559m<T> {

    /* renamed from: a */
    public final /* synthetic */ C11559m<T> f28683a;

    /* renamed from: b */
    public final /* synthetic */ T f28684b;

    public SequencesKt___SequencesKt$minus$1(C11559m<? extends T> mVar, T t) {
        this.f28683a = mVar;
        this.f28684b = t;
    }

    @C12579k
    public Iterator<T> iterator() {
        return SequencesKt___SequencesKt.m44780p0(this.f28683a, new SequencesKt___SequencesKt$minus$1$iterator$1(new Ref.BooleanRef(), this.f28684b)).iterator();
    }
}
