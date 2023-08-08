package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.builders.c */
public final class C10922c<K, V> extends C10920a<Map.Entry<K, V>, K, V> {
    @C12579k

    /* renamed from: a */
    public final MapBuilder<K, V> f28163a;

    public C10922c(@C12579k MapBuilder<K, V> mapBuilder) {
        Intrinsics.checkNotNullParameter(mapBuilder, "backing");
        this.f28163a = mapBuilder;
    }

    public boolean addAll(@C12579k Collection<? extends Map.Entry<K, V>> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f28163a.clear();
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.f28163a.mo22155n(collection);
    }

    /* renamed from: e */
    public int mo15840e() {
        return this.f28163a.size();
    }

    /* renamed from: i */
    public boolean mo22211i(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        return this.f28163a.mo22156o(entry);
    }

    public boolean isEmpty() {
        return this.f28163a.isEmpty();
    }

    @C12579k
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f28163a.mo22163s();
    }

    /* renamed from: q */
    public boolean mo22212q(@C12579k Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        return this.f28163a.mo22134K(entry);
    }

    /* renamed from: r */
    public boolean add(@C12579k Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.f28163a.mo22153l();
        return super.removeAll(collection);
    }

    public boolean retainAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.f28163a.mo22153l();
        return super.retainAll(collection);
    }

    @C12579k
    /* renamed from: w */
    public final MapBuilder<K, V> mo22222w() {
        return this.f28163a;
    }
}
