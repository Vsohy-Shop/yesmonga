package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8443b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8446d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.c */
public final class C8441c<K, V> implements C8446d<K, V>, Map<K, V>, C11345a {
    @C12579k

    /* renamed from: a */
    public final Map<K, V> f22803a;
    @C12579k

    /* renamed from: b */
    public final C8447e<K> f22804b;
    @C12579k

    /* renamed from: c */
    public final C8443b<V> f22805c;
    @C12579k

    /* renamed from: d */
    public final C8447e<Map.Entry<K, V>> f22806d;

    public C8441c(@C12579k Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "impl");
        this.f22803a = map;
        this.f22804b = new C8442d(map.keySet());
        this.f22805c = new C8439a(map.values());
        this.f22806d = new C8442d(map.entrySet());
    }

    /* renamed from: a */
    public final /* bridge */ C8447e<Map.Entry<K, V>> entrySet() {
        return mo15636k0();
    }

    /* renamed from: b */
    public int mo15620b() {
        return this.f22803a.size();
    }

    /* renamed from: c */
    public final /* bridge */ C8447e<K> keySet() {
        return mo15635k();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return this.f22803a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f22803a.containsValue(obj);
    }

    /* renamed from: d */
    public final /* bridge */ C8443b<V> values() {
        return getValues();
    }

    public boolean equals(@C12580l Object obj) {
        return this.f22803a.equals(obj);
    }

    @C12580l
    public V get(Object obj) {
        return this.f22803a.get(obj);
    }

    @C12579k
    public C8443b<V> getValues() {
        return this.f22805c;
    }

    public int hashCode() {
        return this.f22803a.hashCode();
    }

    public boolean isEmpty() {
        return this.f22803a.isEmpty();
    }

    @C12579k
    /* renamed from: k */
    public C8447e<K> mo15635k() {
        return this.f22804b;
    }

    @C12579k
    /* renamed from: k0 */
    public C8447e<Map.Entry<K, V>> mo15636k0() {
        return this.f22806d;
    }

    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo15620b();
    }

    @C12579k
    public String toString() {
        return this.f22803a.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
