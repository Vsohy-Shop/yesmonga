package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.sequences.c */
public final class C11542c<T, K> implements C11559m<T> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28697a;
    @C12579k

    /* renamed from: b */
    public final C11300l<T, K> f28698b;

    public C11542c(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "source");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        this.f28697a = mVar;
        this.f28698b = lVar;
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C11541b(this.f28697a.iterator(), this.f28698b);
    }
}
