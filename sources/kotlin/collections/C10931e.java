package kotlin.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.C11665v0;
import kotlin.jvm.internal.markers.C11351g;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.1")
/* renamed from: kotlin.collections.e */
public abstract class C10931e<K, V> extends AbstractMap<K, V> implements Map<K, V>, C11351g {
    /* renamed from: a */
    public abstract Set mo15814a();

    /* renamed from: b */
    public /* bridge */ Set<Object> mo15815b() {
        return super.keySet();
    }

    /* renamed from: c */
    public /* bridge */ int mo15816c() {
        return super.size();
    }

    /* renamed from: d */
    public /* bridge */ Collection<Object> mo15819d() {
        return super.values();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo15814a();
    }

    public final /* bridge */ Set<K> keySet() {
        return mo15815b();
    }

    @C12580l
    public abstract V put(K k, V v);

    public final /* bridge */ int size() {
        return mo15816c();
    }

    public final /* bridge */ Collection<V> values() {
        return mo15819d();
    }
}
