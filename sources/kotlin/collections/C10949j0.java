package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.j0 */
public final class C10949j0<T> implements Iterator<C10942h0<? extends T>>, C11345a {
    @C12579k

    /* renamed from: a */
    public final Iterator<T> f28179a;

    /* renamed from: b */
    public int f28180b;

    public C10949j0(@C12579k Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "iterator");
        this.f28179a = it;
    }

    @C12579k
    /* renamed from: b */
    public final C10942h0<T> next() {
        int i = this.f28180b;
        this.f28180b = i + 1;
        if (i < 0) {
            CollectionsKt__CollectionsKt.m40459W();
        }
        return new C10942h0<>(i, this.f28179a.next());
    }

    public final boolean hasNext() {
        return this.f28179a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
