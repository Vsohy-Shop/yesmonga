package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.C10899a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.sequences.b */
public final class C11541b<T, K> extends C10899a<T> {
    @C12579k

    /* renamed from: c */
    public final Iterator<T> f28694c;
    @C12579k

    /* renamed from: d */
    public final C11300l<T, K> f28695d;
    @C12579k

    /* renamed from: e */
    public final HashSet<K> f28696e = new HashSet<>();

    public C11541b(@C12579k Iterator<? extends T> it, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(it, "source");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        this.f28694c = it;
        this.f28695d = lVar;
    }

    /* renamed from: b */
    public void mo22036b() {
        while (this.f28694c.hasNext()) {
            T next = this.f28694c.next();
            if (this.f28696e.add(this.f28695d.invoke(next))) {
                mo22038d(next);
                return;
            }
        }
        mo22037c();
    }
}
