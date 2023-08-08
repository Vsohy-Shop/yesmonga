package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10934f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11353h;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.g */
public final class C8512g<K, V> extends C10934f<K> implements Set<K>, C11353h {
    @C12579k

    /* renamed from: a */
    public final C8509d<K, V> f22934a;

    public C8512g(@C12579k C8509d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "builder");
        this.f22934a = dVar;
    }

    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f22934a.clear();
    }

    public boolean contains(Object obj) {
        return this.f22934a.containsKey(obj);
    }

    /* renamed from: e */
    public int mo15840e() {
        return this.f22934a.size();
    }

    @C12579k
    public Iterator<K> iterator() {
        return new C8513h(this.f22934a);
    }

    public boolean remove(Object obj) {
        if (!this.f22934a.containsKey(obj)) {
            return false;
        }
        this.f22934a.remove(obj);
        return true;
    }
}
