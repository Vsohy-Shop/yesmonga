package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n330#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
/* renamed from: kotlin.collections.o0 */
public final class C10969o0<K, V> implements C10967n0<K, V> {
    @C12579k

    /* renamed from: a */
    public final Map<K, V> f28189a;
    @C12579k

    /* renamed from: b */
    public final C11300l<K, V> f28190b;

    public C10969o0(@C12579k Map<K, ? extends V> map, @C12579k C11300l<? super K, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(lVar, "default");
        this.f28189a = map;
        this.f28190b = lVar;
    }

    @C12579k
    /* renamed from: A */
    public Map<K, V> mo22365A() {
        return this.f28189a;
    }

    /* renamed from: Y */
    public V mo22366Y(K k) {
        Map A = mo22365A();
        V v = A.get(k);
        if (v != null || A.containsKey(k)) {
            return v;
        }
        return this.f28190b.invoke(k);
    }

    @C12579k
    /* renamed from: a */
    public Set<Map.Entry<K, V>> mo22371a() {
        return mo22365A().entrySet();
    }

    @C12579k
    /* renamed from: b */
    public Set<K> mo22372b() {
        return mo22365A().keySet();
    }

    /* renamed from: c */
    public int mo22373c() {
        return mo22365A().size();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return mo22365A().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo22365A().containsValue(obj);
    }

    @C12579k
    /* renamed from: d */
    public Collection<V> mo22377d() {
        return mo22365A().values();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo22371a();
    }

    public boolean equals(@C12580l Object obj) {
        return mo22365A().equals(obj);
    }

    @C12580l
    public V get(Object obj) {
        return mo22365A().get(obj);
    }

    public int hashCode() {
        return mo22365A().hashCode();
    }

    public boolean isEmpty() {
        return mo22365A().isEmpty();
    }

    public final /* bridge */ Set<K> keySet() {
        return mo22372b();
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo22373c();
    }

    @C12579k
    public String toString() {
        return mo22365A().toString();
    }

    public final /* bridge */ Collection<V> values() {
        return mo22377d();
    }
}
