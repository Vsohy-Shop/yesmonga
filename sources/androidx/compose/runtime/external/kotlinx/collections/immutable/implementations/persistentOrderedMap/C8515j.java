package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10925c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11346b;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.j */
public final class C8515j<K, V> extends C10925c<V> implements Collection<V>, C11346b {
    @C12579k

    /* renamed from: a */
    public final C8509d<K, V> f22942a;

    public C8515j(@C12579k C8509d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "builder");
        this.f22942a = dVar;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f22942a.clear();
    }

    public boolean contains(Object obj) {
        return this.f22942a.containsValue(obj);
    }

    /* renamed from: e */
    public int mo15855e() {
        return this.f22942a.size();
    }

    @C12579k
    public Iterator<V> iterator() {
        return new C8516k(this.f22942a);
    }
}
