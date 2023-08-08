package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10925c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11346b;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.builders.e */
public final class C10924e<V> extends C10925c<V> implements Collection<V>, C11346b {
    @C12579k

    /* renamed from: a */
    public final MapBuilder<?, V> f28165a;

    public C10924e(@C12579k MapBuilder<?, V> mapBuilder) {
        Intrinsics.checkNotNullParameter(mapBuilder, "backing");
        this.f28165a = mapBuilder;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(@C12579k Collection<? extends V> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f28165a.clear();
    }

    public boolean contains(Object obj) {
        return this.f28165a.containsValue(obj);
    }

    /* renamed from: e */
    public int mo15855e() {
        return this.f28165a.size();
    }

    @C12579k
    /* renamed from: h */
    public final MapBuilder<?, V> mo22234h() {
        return this.f28165a;
    }

    public boolean isEmpty() {
        return this.f28165a.isEmpty();
    }

    @C12579k
    public Iterator<V> iterator() {
        return this.f28165a.mo22140Q();
    }

    public boolean remove(Object obj) {
        return this.f28165a.mo22138O(obj);
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.f28165a.mo22153l();
        return super.removeAll(collection);
    }

    public boolean retainAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.f28165a.mo22153l();
        return super.retainAll(collection);
    }
}
