package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.i0 */
public final class C10946i0<T> implements Iterable<C10942h0<? extends T>>, C11345a {
    @C12579k

    /* renamed from: a */
    public final C11289a<Iterator<T>> f28178a;

    public C10946i0(@C12579k C11289a<? extends Iterator<? extends T>> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "iteratorFactory");
        this.f28178a = aVar;
    }

    @C12579k
    public Iterator<C10942h0<T>> iterator() {
        return new C10949j0(this.f28178a.invoke());
    }
}
