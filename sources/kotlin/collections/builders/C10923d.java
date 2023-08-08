package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10934f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11353h;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.builders.d */
public final class C10923d<E> extends C10934f<E> implements Set<E>, C11353h {
    @C12579k

    /* renamed from: a */
    public final MapBuilder<E, ?> f28164a;

    public C10923d(@C12579k MapBuilder<E, ?> mapBuilder) {
        Intrinsics.checkNotNullParameter(mapBuilder, "backing");
        this.f28164a = mapBuilder;
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f28164a.clear();
    }

    public boolean contains(Object obj) {
        return this.f28164a.containsKey(obj);
    }

    /* renamed from: e */
    public int mo15840e() {
        return this.f28164a.size();
    }

    public boolean isEmpty() {
        return this.f28164a.isEmpty();
    }

    @C12579k
    public Iterator<E> iterator() {
        return this.f28164a.mo22129F();
    }

    public boolean remove(Object obj) {
        return this.f28164a.mo22136M(obj) >= 0;
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.f28164a.mo22153l();
        return super.removeAll(collection);
    }

    public boolean retainAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.f28164a.mo22153l();
        return super.retainAll(collection);
    }
}
